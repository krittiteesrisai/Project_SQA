package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;

/**
 * JUnit4 test suite for org.apache.commons.math.complex.Complex (Math-47b)
 * มุ่งเน้น branch/condition coverage ให้ครอบคลุมมากที่สุด
 */
public class ComplexTest {

    private static final double EPS = 1e-9;

    // ---------------------------------------------------------------
    // Constructor branches: isNaN / isInfinite computation
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_NormalFinite() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
        assertEquals(1.0, c.getReal(), EPS);
        assertEquals(2.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructor_SingleArg_ImaginaryZero() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructor_RealNaN() {
        Complex c = new Complex(Double.NaN, 2.0);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite()); // isInfinite = !isNaN && ... -> false since isNaN true
    }

    @Test
    public void testConstructor_ImaginaryNaN() {
        Complex c = new Complex(2.0, Double.NaN);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructor_RealInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructor_ImaginaryInfinite() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructor_NaN_And_Infinite_Together_IsNaNWins() {
        // real=NaN, imaginary=Infinity -> isNaN true, isInfinite false (เพราะ isNaN เช็คก่อน)
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------------------------------------------------------------
    // abs()
    // ---------------------------------------------------------------

    @Test
    public void testAbs_NaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbs_Infinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, c.abs(), 0.0);
    }

    @Test
    public void testAbs_FirstBranch_Normal_3_4_5() {
        // abs(real) < abs(imaginary), imaginary != 0
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_ElseBranch_Normal_4_3_5() {
        // abs(real) >= abs(imaginary), real != 0
        Complex c = new Complex(4.0, 3.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_ElseBranch_RealZero() {
        // abs(real) >= abs(imaginary) and real == 0.0 -> both zero
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), EPS);
    }

    // NOTE: สาขา "imaginary == 0.0" ภายในเงื่อนไข (abs(real) < abs(imaginary))
    // เป็นไปไม่ได้ในทางคณิตศาสตร์ (ถ้า imaginary=0 แล้ว abs(real) < 0 จะไม่เป็นจริง)
    // จึงไม่สามารถเขียนเทสเพื่อ trigger branch นี้ได้จริง (dead code)

    // ---------------------------------------------------------------
    // add(Complex) / add(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_NullThrows() {
        new Complex(1, 1).add((Complex) null);
    }

    @Test
    public void testAddComplex_ThisIsNaN() {
        assertTrue(Complex.NaN.add(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testAddComplex_AddendIsNaN() {
        assertTrue(new Complex(1, 1).add(Complex.NaN).isNaN());
    }

    @Test
    public void testAddComplex_Normal() {
        Complex r = new Complex(1, 2).add(new Complex(3, 4));
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    @Test
    public void testAddDouble_ThisIsNaN() {
        assertTrue(Complex.NaN.add(3.0).isNaN());
    }

    @Test
    public void testAddDouble_AddendNaN() {
        assertTrue(new Complex(1, 1).add(Double.NaN).isNaN());
    }

    @Test
    public void testAddDouble_Normal() {
        Complex r = new Complex(1, 2).add(3.0);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // conjugate()
    // ---------------------------------------------------------------

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

    // ---------------------------------------------------------------
    // divide(Complex)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_NullThrows() {
        new Complex(1, 1).divide((Complex) null);
    }

    @Test
    public void testDivideComplex_ThisIsNaN() {
        assertTrue(Complex.NaN.divide(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testDivideComplex_DivisorIsNaN() {
        assertTrue(new Complex(1, 1).divide(Complex.NaN).isNaN());
    }

    @Test
    public void testDivideComplex_DivisorZero() {
        Complex r = new Complex(1, 1).divide(Complex.ZERO);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideComplex_DivisorInfinite_ThisFinite_ReturnsZero() {
        Complex r = new Complex(1, 1).divide(Complex.INF);
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testDivideComplex_BothInfinite_ResultIsNaN() {
        Complex r = Complex.INF.divide(Complex.INF);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideComplex_AbsC_LessThan_AbsD_Branch() {
        // divisor = 1 + 2i : |c|=1 < |d|=2
        Complex r = new Complex(1, 1).divide(new Complex(1, 2));
        assertEquals(0.6, r.getReal(), EPS);
        assertEquals(-0.2, r.getImaginary(), EPS);
    }

    @Test
    public void testDivideComplex_ElseBranch() {
        // divisor = 2 + 1i : |c|=2 >= |d|=1
        Complex r = new Complex(1, 1).divide(new Complex(2, 1));
        assertEquals(0.6, r.getReal(), EPS);
        assertEquals(0.2, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // divide(double)
    // ---------------------------------------------------------------

    @Test
    public void testDivideDouble_ThisIsNaN() {
        assertTrue(Complex.NaN.divide(5.0).isNaN());
    }

    @Test
    public void testDivideDouble_DivisorNaN() {
        assertTrue(new Complex(1, 1).divide(Double.NaN).isNaN());
    }

    @Test
    public void testDivideDouble_DivisorZero() {
        assertTrue(new Complex(1, 1).divide(0.0).isNaN());
    }

    @Test
    public void testDivideDouble_DivisorInfinite_ThisFinite_Zero() {
        Complex r = new Complex(1, 1).divide(Double.POSITIVE_INFINITY);
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testDivideDouble_DivisorInfinite_ThisInfinite_NaN() {
        Complex r = new Complex(Double.POSITIVE_INFINITY, 1.0)
                        .divide(Double.POSITIVE_INFINITY);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideDouble_Normal() {
        Complex r = new Complex(4, 6).divide(2.0);
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(3.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameReference() {
        Complex c = new Complex(1, 2);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_OtherIsNaN_ThisIsNaN_True() {
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 1.0)));
    }

    @Test
    public void testEquals_OtherIsNaN_ThisNotNaN_False() {
        assertFalse(new Complex(1, 1).equals(new Complex(Double.NaN, 1.0)));
    }

    @Test
    public void testEquals_BothNormal_Equal() {
        assertTrue(new Complex(1, 2).equals(new Complex(1, 2)));
    }

    @Test
    public void testEquals_BothNormal_NotEqual() {
        assertFalse(new Complex(1, 2).equals(new Complex(1, 3)));
    }

    @Test
    public void testEquals_NotInstanceOfComplex() {
        assertFalse(new Complex(1, 2).equals("not a complex"));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(new Complex(1, 2).equals(null));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_NaN_Is7() {
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testHashCode_EqualObjects_SameHash() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1, 2);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // isNaN() / isInfinite() getters (sanity)
    // ---------------------------------------------------------------

    @Test
    public void testIsNaN_IsInfinite_Getters() {
        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.NaN.isInfinite());
        assertTrue(Complex.INF.isInfinite());
        assertFalse(Complex.INF.isNaN());
    }

    // ---------------------------------------------------------------
    // multiply(Complex)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_NullThrows() {
        new Complex(1, 1).multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex_ThisIsNaN() {
        assertTrue(Complex.NaN.multiply(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testMultiplyComplex_FactorIsNaN() {
        assertTrue(new Complex(1, 1).multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplex_ThisRealInfinite() {
        Complex r = new Complex(Double.POSITIVE_INFINITY, 1).multiply(new Complex(1, 1));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_ThisImaginaryInfinite() {
        Complex r = new Complex(1, Double.POSITIVE_INFINITY).multiply(new Complex(1, 1));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_FactorRealInfinite() {
        Complex r = new Complex(1, 1).multiply(new Complex(Double.POSITIVE_INFINITY, 1));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_FactorImaginaryInfinite() {
        Complex r = new Complex(1, 1).multiply(new Complex(1, Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_Normal() {
        Complex r = new Complex(1, 2).multiply(new Complex(3, 4));
        assertEquals(-5.0, r.getReal(), EPS);
        assertEquals(10.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // multiply(double)
    // ---------------------------------------------------------------

    @Test
    public void testMultiplyDouble_ThisIsNaN() {
        assertTrue(Complex.NaN.multiply(2.0).isNaN());
    }

    @Test
    public void testMultiplyDouble_FactorIsNaN() {
        assertTrue(new Complex(1, 1).multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_ThisRealInfinite() {
        Complex r = new Complex(Double.POSITIVE_INFINITY, 1).multiply(2.0);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDouble_ThisImaginaryInfinite() {
        Complex r = new Complex(1, Double.POSITIVE_INFINITY).multiply(2.0);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDouble_FactorInfinite() {
        Complex r = new Complex(1, 1).multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDouble_Normal() {
        Complex r = new Complex(2, 3).multiply(4.0);
        assertEquals(8.0, r.getReal(), EPS);
        assertEquals(12.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // negate()
    // ---------------------------------------------------------------

    @Test
    public void testNegate_NaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testNegate_Normal() {
        Complex r = new Complex(1, 2).negate();
        assertEquals(-1.0, r.getReal(), EPS);
        assertEquals(-2.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // subtract(Complex) / subtract(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_NullThrows() {
        new Complex(1, 1).subtract((Complex) null);
    }

    @Test
    public void testSubtractComplex_ThisIsNaN() {
        assertTrue(Complex.NaN.subtract(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testSubtractComplex_SubtrahendIsNaN() {
        assertTrue(new Complex(1, 1).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testSubtractComplex_Normal() {
        Complex r = new Complex(5, 5).subtract(new Complex(3, 2));
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(3.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSubtractDouble_ThisIsNaN() {
        assertTrue(Complex.NaN.subtract(3.0).isNaN());
    }

    @Test
    public void testSubtractDouble_SubtrahendNaN() {
        assertTrue(new Complex(1, 1).subtract(Double.NaN).isNaN());
    }

    @Test
    public void testSubtractDouble_Normal() {
        Complex r = new Complex(5, 5).subtract(3.0);
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(5.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // acos(), asin(), atan()
    // ---------------------------------------------------------------

    @Test
    public void testAcos_NaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAcos_Normal() {
        Complex r = Complex.ZERO.acos();
        assertEquals(Math.PI / 2.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testAsin_NaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAsin_Normal() {
        Complex r = Complex.ZERO.asin();
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testAtan_NaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testAtan_Normal() {
        Complex r = Complex.ZERO.atan();
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------------------------------------------------------------
    // cos(), cosh(), exp(), log()
    // ---------------------------------------------------------------

    @Test
    public void testCos_NaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCos_Normal() {
        Complex r = Complex.ZERO.cos();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testCosh_NaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testCosh_Normal() {
        Complex r = Complex.ZERO.cosh();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testExp_NaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testExp_Normal() {
        Complex r = Complex.ZERO.exp();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testLog_NaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testLog_Normal() {
        Complex r = Complex.ONE.log();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // pow(Complex) / pow(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_NullThrows() {
        new Complex(1, 1).pow((Complex) null);
    }

    @Test
    public void testPowComplex_Normal() {
        Complex r = Complex.ONE.pow(new Complex(2, 0));
        assertEquals(1.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testPowDouble_Normal() {
        Complex r = new Complex(2, 0).pow(2.0);
        assertEquals(4.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------------------------------------------------------------
    // sin(), sinh()
    // ---------------------------------------------------------------

    @Test
    public void testSin_NaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSin_Normal() {
        Complex r = Complex.ZERO.sin();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSinh_NaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSinh_Normal() {
        Complex r = Complex.ZERO.sinh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // sqrt()
    // ---------------------------------------------------------------

    @Test
    public void testSqrt_NaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt_RealAndImaginaryZero() {
        Complex r = Complex.ZERO.sqrt();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealPositiveBranch() {
        // (2 + i)^2 = 3 + 4i
        Complex r = new Complex(3, 4).sqrt();
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(1.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealNegative_ImaginaryPositive() {
        // (1 + 2i)^2 = -3 + 4i
        Complex r = new Complex(-3, 4).sqrt();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealNegative_ImaginaryNegative() {
        // (1 - 2i)^2 = -3 - 4i
        Complex r = new Complex(-3, -4).sqrt();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(-2.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealNegative_ImaginaryZero() {
        // ไม่ยืนยัน sign convention ของ MathUtils.indicator(0) ตรง ๆ
        // จึงตรวจเฉพาะค่า magnitude ที่ถูกต้อง
        Complex r = new Complex(-4, 0).sqrt();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(2.0, Math.abs(r.getImaginary()), EPS);
    }

    // ---------------------------------------------------------------
    // sqrt1z()
    // ---------------------------------------------------------------

    @Test
    public void testSqrt1z_Normal() {
        Complex r = Complex.ZERO.sqrt1z();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // tan(), tanh()
    // ---------------------------------------------------------------

    @Test
    public void testTan_NaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    @Test
    public void testTan_Normal() {
        Complex r = Complex.ZERO.tan();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testTanh_NaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testTanh_Normal() {
        Complex r = Complex.ZERO.tanh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // getArgument()
    // ---------------------------------------------------------------

    @Test
    public void testGetArgument_PositiveRealAxis() {
        assertEquals(0.0, new Complex(1, 0).getArgument(), EPS);
    }

    @Test
    public void testGetArgument_PositiveImaginaryAxis() {
        assertEquals(Math.PI / 2.0, new Complex(0, 1).getArgument(), EPS);
    }

    @Test
    public void testGetArgument_NegativeRealAxis() {
        assertEquals(Math.PI, new Complex(-1, 0).getArgument(), EPS);
    }

    // ---------------------------------------------------------------
    // nthRoot(int)
    // ---------------------------------------------------------------

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_ZeroThrows() {
        new Complex(1, 1).nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_NegativeThrows() {
        new Complex(1, 1).nthRoot(-2);
    }

    @Test
    public void testNthRoot_IsNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_IsInfinite() {
        List<Complex> roots = Complex.INF.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRoot_Normal_N1() {
        List<Complex> roots = new Complex(4, 0).nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(4.0, roots.get(0).getReal(), EPS);
        assertEquals(0.0, roots.get(0).getImaginary(), EPS);
    }

    @Test
    public void testNthRoot_Normal_N4_LoopCoversAllK() {
        List<Complex> roots = new Complex(1, 0).nthRoot(4);
        assertEquals(4, roots.size());
        // 4th roots of unity : 1, i, -1, -i (ตามลำดับการวน k=0..3)
        assertEquals(1.0, roots.get(0).getReal(), 1e-6);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-6);

        assertEquals(0.0, roots.get(1).getReal(), 1e-6);
        assertEquals(1.0, roots.get(1).getImaginary(), 1e-6);

        assertEquals(-1.0, roots.get(2).getReal(), 1e-6);
        assertEquals(0.0, roots.get(2).getImaginary(), 1e-6);

        assertEquals(0.0, roots.get(3).getReal(), 1e-6);
        assertEquals(-1.0, roots.get(3).getImaginary(), 1e-6);
    }

    // ---------------------------------------------------------------
    // valueOf(double, double) / valueOf(double)
    // ---------------------------------------------------------------

    @Test
    public void testValueOf_TwoArgs_RealNaN() {
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN, 1.0));
    }

    @Test
    public void testValueOf_TwoArgs_ImaginaryNaN() {
        assertEquals(Complex.NaN, Complex.valueOf(1.0, Double.NaN));
    }

    @Test
    public void testValueOf_TwoArgs_Normal() {
        Complex c = Complex.valueOf(3.0, 4.0);
        assertEquals(3.0, c.getReal(), EPS);
        assertEquals(4.0, c.getImaginary(), EPS);
    }

    @Test
    public void testValueOf_OneArg_NaN() {
        assertEquals(Complex.NaN, Complex.valueOf(Double.NaN));
    }

    @Test
    public void testValueOf_OneArg_Normal() {
        Complex c = Complex.valueOf(7.0);
        assertEquals(7.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    // ---------------------------------------------------------------
    // getField()
    // ---------------------------------------------------------------

    @Test
    public void testGetField_NotNull() {
        assertNotNull(new Complex(1, 1).getField());
        assertTrue(new Complex(1, 1).getField() instanceof ComplexField);
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_Format() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    // ---------------------------------------------------------------
    // Static constants sanity checks
    // ---------------------------------------------------------------

    @Test
    public void testStaticConstants() {
        assertEquals(0.0, Complex.I.getReal(), EPS);
        assertEquals(1.0, Complex.I.getImaginary(), EPS);
        assertEquals(1.0, Complex.ONE.getReal(), EPS);
        assertEquals(0.0, Complex.ONE.getImaginary(), EPS);
        assertEquals(0.0, Complex.ZERO.getReal(), EPS);
        assertEquals(0.0, Complex.ZERO.getImaginary(), EPS);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
    }
}
