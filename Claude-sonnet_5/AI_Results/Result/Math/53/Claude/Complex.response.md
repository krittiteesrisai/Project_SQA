以下คือชุดทดสอบ JUnit 4 สำหรับคลาส `Complex` (Defects4J Math-53b) ที่ออกแบบให้ครอบคลุม branch/condition ต่าง ๆ ตามที่วิเคราะห์จากซอร์สโค้ดที่ให้มา

```java
package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-10;

    // ---------- Constructor / isNaN / isInfinite ----------

    @Test
    public void testConstructorNormal() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
        assertEquals(1.0, c.getReal(), EPS);
        assertEquals(2.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructorNaNReal() {
        Complex c = new Complex(Double.NaN, 2.0);
        assertTrue(c.isNaN());
        // isInfinite should be false when isNaN is true (per constructor logic)
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorNaNImaginary() {
        Complex c = new Complex(1.0, Double.NaN);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorInfiniteReal() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 2.0);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructorInfiniteImaginary() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructorInfiniteButNaNTakesPrecedence() {
        // real infinite AND imaginary NaN -> isNaN true, isInfinite false
        Complex c = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------- abs() ----------

    @Test
    public void testAbsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbsInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPS);
    }

    @Test
    public void testAbsZero() {
        // triggers the "real == 0.0" branch in the else path
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), EPS);
    }

    @Test
    public void testAbsNormalRealGreater() {
        // abs(real) >= abs(imaginary) branch, real != 0
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbsNormalImaginaryGreater() {
        // abs(real) < abs(imaginary) branch
        Complex c = new Complex(4.0, 3.0);
        Complex c2 = new Complex(3.0, 4.0); // swapped to force imaginary greater
        assertEquals(5.0, c.abs(), EPS);
        assertEquals(5.0, c2.abs(), EPS);
    }

    // Note: the inner "if (imaginary == 0.0)" inside the first branch
    // (abs(real) < abs(imaginary)) is logically unreachable because
    // imaginary==0 implies abs(imaginary)==0 which cannot be greater
    // than abs(real) (always >= 0). We do not attempt to force this
    // dead branch since no input can satisfy it.

    // ---------- add() ----------

    @Test
    public void testAddNormal() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex r = a.add(b);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullThrows() {
        Complex a = new Complex(1.0, 2.0);
        a.add(null);
    }

    // ---------- conjugate() ----------

    @Test
    public void testConjugateNaN() {
        assertSame(Complex.NaN, Complex.NaN.conjugate());
    }

    @Test
    public void testConjugateNormal() {
        Complex c = new Complex(1.0, 2.0);
        Complex r = c.conjugate();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(-2.0, r.getImaginary(), EPS);
    }

    // ---------- divide() ----------

    @Test(expected = NullArgumentException.class)
    public void testDivideNullThrows() {
        Complex a = new Complex(1.0, 2.0);
        a.divide(null);
    }

    @Test
    public void testDivideThisNaN() {
        Complex r = Complex.NaN.divide(new Complex(1.0, 1.0));
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideRhsNaN() {
        Complex r = new Complex(1.0, 1.0).divide(Complex.NaN);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideByZero() {
        Complex r = new Complex(1.0, 1.0).divide(Complex.ZERO);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideRhsInfiniteThisFinite() {
        Complex r = new Complex(1.0, 1.0).divide(Complex.INF);
        assertEquals(Complex.ZERO, r);
    }

    @Test
    public void testDivideAbsCLessThanAbsD() {
        // |c| < |d| branch: rhs real < rhs imaginary in abs value
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 2.0);
        Complex r = a.divide(b);
        assertFalse(r.isNaN());
    }

    @Test
    public void testDivideAbsCGreaterOrEqualAbsD() {
        // |c| >= |d| branch
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(2.0, 1.0);
        Complex r = a.divide(b);
        assertFalse(r.isNaN());
    }

    // ---------- equals() ----------

    @Test
    public void testEqualsSameReference() {
        Complex a = new Complex(1.0, 2.0);
        assertTrue(a.equals(a));
    }

    @Test
    public void testEqualsNotComplexInstance() {
        Complex a = new Complex(1.0, 2.0);
        assertFalse(a.equals("not a complex"));
    }

    @Test
    public void testEqualsRhsNaN() {
        Complex a = new Complex(Double.NaN, 2.0);
        Complex b = new Complex(1.0, Double.NaN);
        assertTrue(a.equals(b)); // both NaN -> considered equal
    }

    @Test
    public void testEqualsDifferentValues() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsSameValues() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsNull() {
        Complex a = new Complex(1.0, 2.0);
        assertFalse(a.equals(null));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCodeNaN() {
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- getReal / getImaginary / isNaN / isInfinite getters ----------

    @Test
    public void testGetters() {
        Complex c = new Complex(5.0, 6.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(6.0, c.getImaginary(), EPS);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------- multiply(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplexNullThrows() {
        new Complex(1.0, 1.0).multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplexThisNaN() {
        Complex r = Complex.NaN.multiply(new Complex(1.0, 1.0));
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyComplexRhsNaN() {
        Complex r = new Complex(1.0, 1.0).multiply(Complex.NaN);
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyComplexRealInfinite() {
        Complex a = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex r = a.multiply(new Complex(1.0, 1.0));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplexRhsImaginaryInfinite() {
        Complex r = new Complex(1.0, 1.0).multiply(new Complex(1.0, Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplexNormal() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex r = a.multiply(b);
        assertEquals(-5.0, r.getReal(), EPS);
        assertEquals(10.0, r.getImaginary(), EPS);
    }

    // ---------- multiply(double) ----------

    @Test
    public void testMultiplyDoubleThisNaN() {
        Complex r = Complex.NaN.multiply(2.0);
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyDoubleRhsNaN() {
        Complex r = new Complex(1.0, 1.0).multiply(Double.NaN);
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyDoubleInfiniteReal() {
        Complex a = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex r = a.multiply(2.0);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDoubleInfiniteRhs() {
        Complex r = new Complex(1.0, 1.0).multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDoubleNormal() {
        Complex a = new Complex(1.0, 2.0);
        Complex r = a.multiply(3.0);
        assertEquals(3.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    // ---------- negate() ----------

    @Test
    public void testNegateNaN() {
        assertSame(Complex.NaN, Complex.NaN.negate());
    }

    @Test
    public void testNegateNormal() {
        Complex c = new Complex(1.0, -2.0);
        Complex r = c.negate();
        assertEquals(-1.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    // ---------- subtract() ----------

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullThrows() {
        new Complex(1.0, 1.0).subtract(null);
    }

    @Test
    public void testSubtractThisNaN() {
        Complex r = Complex.NaN.subtract(new Complex(1.0, 1.0));
        assertTrue(r.isNaN());
    }

    @Test
    public void testSubtractRhsNaN() {
        Complex r = new Complex(1.0, 1.0).subtract(Complex.NaN);
        assertTrue(r.isNaN());
    }

    @Test
    public void testSubtractNormal() {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(1.0, 2.0);
        Complex r = a.subtract(b);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(4.0, r.getImaginary(), EPS);
    }

    // ---------- acos / asin / atan ----------

    @Test
    public void testAcosNaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAcosNormal() {
        Complex r = new Complex(0.5, 0.5).acos();
        assertFalse(r.isNaN());
    }

    @Test
    public void testAsinNaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAsinNormal() {
        Complex r = new Complex(0.5, 0.5).asin();
        assertFalse(r.isNaN());
    }

    @Test
    public void testAtanNaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testAtanNormal() {
        Complex r = new Complex(0.5, 0.5).atan();
        assertFalse(r.isNaN());
    }

    // ---------- cos / cosh / exp / log ----------

    @Test
    public void testCosNaN() {
        assertSame(Complex.NaN, Complex.NaN.cos());
    }

    @Test
    public void testCosNormal() {
        Complex r = new Complex(1.0, 1.0).cos();
        assertFalse(r.isNaN());
    }

    @Test
    public void testCoshNaN() {
        assertSame(Complex.NaN, Complex.NaN.cosh());
    }

    @Test
    public void testCoshNormal() {
        Complex r = new Complex(1.0, 1.0).cosh();
        assertFalse(r.isNaN());
    }

    @Test
    public void testExpNaN() {
        assertSame(Complex.NaN, Complex.NaN.exp());
    }

    @Test
    public void testExpNormal() {
        Complex r = new Complex(1.0, 1.0).exp();
        assertFalse(r.isNaN());
    }

    @Test
    public void testLogNaN() {
        assertSame(Complex.NaN, Complex.NaN.log());
    }

    @Test
    public void testLogNormal() {
        Complex r = new Complex(1.0, 1.0).log();
        assertFalse(r.isNaN());
    }

    // ---------- pow() ----------

    @Test(expected = NullArgumentException.class)
    public void testPowNullThrows() {
        new Complex(1.0, 1.0).pow(null);
    }

    @Test
    public void testPowNormal() {
        Complex r = new Complex(1.0, 1.0).pow(new Complex(2.0, 0.0));
        assertFalse(r.isNaN());
    }

    // ---------- sin / sinh ----------

    @Test
    public void testSinNaN() {
        assertSame(Complex.NaN, Complex.NaN.sin());
    }

    @Test
    public void testSinNormal() {
        Complex r = new Complex(1.0, 1.0).sin();
        assertFalse(r.isNaN());
    }

    @Test
    public void testSinhNaN() {
        assertSame(Complex.NaN, Complex.NaN.sinh());
    }

    @Test
    public void testSinhNormal() {
        Complex r = new Complex(1.0, 1.0).sinh();
        assertFalse(r.isNaN());
    }

    // ---------- sqrt() ----------

    @Test
    public void testSqrtNaN() {
        assertSame(Complex.NaN, Complex.NaN.sqrt());
    }

    @Test
    public void testSqrtZero() {
        Complex r = new Complex(0.0, 0.0).sqrt();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrtRealNonNegative() {
        Complex r = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, r.getReal(), EPS);
    }

    @Test
    public void testSqrtRealNegativeImaginaryPositive() {
        Complex r = new Complex(-4.0, 3.0).sqrt();
        assertFalse(r.isNaN());
        // imaginary should keep same sign as original imaginary (indicator)
        assertTrue(r.getImaginary() > 0);
    }

    @Test
    public void testSqrtRealNegativeImaginaryNegative() {
        Complex r = new Complex(-4.0, -3.0).sqrt();
        assertFalse(r.isNaN());
        assertTrue(r.getImaginary() < 0);
    }

    // ---------- sqrt1z() ----------

    @Test
    public void testSqrt1zNormal() {
        Complex r = new Complex(0.5, 0.5).sqrt1z();
        assertFalse(r.isNaN());
    }

    // ---------- tan / tanh ----------

    @Test
    public void testTanNaN() {
        assertSame(Complex.NaN, Complex.NaN.tan());
    }

    @Test
    public void testTanNormal() {
        Complex r = new Complex(1.0, 1.0).tan();
        assertFalse(r.isNaN());
    }

    @Test
    public void testTanhNaN() {
        assertSame(Complex.NaN, Complex.NaN.tanh());
    }

    @Test
    public void testTanhNormal() {
        Complex r = new Complex(1.0, 1.0).tanh();
        assertFalse(r.isNaN());
    }

    // ---------- getArgument() ----------

    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4.0, c.getArgument(), EPS);
    }

    @Test
    public void testGetArgumentNaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // ---------- nthRoot() ----------

    @Test(expected = IllegalArgumentException.class)
    public void testNthRootZeroThrows() {
        new Complex(1.0, 1.0).nthRoot(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRootNegativeThrows() {
        new Complex(1.0, 1.0).nthRoot(-1);
    }

    @Test
    public void testNthRootNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(3);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRootInfinite() {
        List<Complex> roots = Complex.INF.nthRoot(3);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRootNormal() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
        for (Complex r : roots) {
            assertFalse(r.isNaN());
        }
    }

    @Test
    public void testNthRootSingle() {
        // smallest valid n (boundary n=1)
        Complex c = new Complex(2.0, 0.0);
        List<Complex> roots = c.nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(2.0, roots.get(0).getReal(), EPS);
    }

    // ---------- getField() / toString() ----------

    @Test
    public void testGetField() {
        Complex c = new Complex(1.0, 1.0);
        assertNotNull(c.getField());
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor* (6 tests) | isNaN=true/false, isInfinite=true/false, กรณี NaN ลำดับก่อน infinite |
| testAbsNaN / testAbsInfinite | if(isNaN) true, if(isInfinite()) true |
| testAbsZero | else-branch, real==0.0 true |
| testAbsNormalRealGreater/ImaginaryGreater | if/else ของ abs(real)<abs(imaginary), ค่า normal |
| testAddNormal / testAddNullThrows | NullArgumentException throw, normal path |
| testConjugateNaN / testConjugateNormal | if(isNaN) true/false |
| testDivide* (7 tests) | null check, isNaN (this/rhs), c==0&&d==0, rhs.isInfinite()&&!isInfinite(), |c|<|d| true/false |
| testEquals* (6 tests) | this==other, instanceof false, rhs.isNaN true, ค่าเท่า/ไม่เท่า, null |
| testHashCode* (2 tests) | isNaN true/false |
| testGetters | getter ปกติ |
| testMultiplyComplex* (6 tests) | null check, isNaN (this/rhs), infinite (real/imag ของ this และ rhs), normal |
| testMultiplyDouble* (5 tests) | null-like (NaN), isNaN, infinite (this/rhs), normal |
| testNegateNaN/Normal | if(isNaN) true/false |
| testSubtract* (4 tests) | null check, isNaN (this/rhs), normal |
| testAcos/Asin/Atan (NaN+Normal) | if(isNaN) true/false |
| testCos/Cosh/Exp/Log (NaN+Normal) | if(isNaN) true/false |
| testPow* (2 tests) | null check, normal |
| testSin/Sinh (NaN+Normal) | if(isNaN) true/false |
| testSqrt* (5 tests) | isNaN, real==0&&imag==0, real>=0 true/false, sign ของ imaginary |
| testSqrt1zNormal | เรียก normal path (รวม subtract/multiply/sqrt) |
| testTan/Tanh (NaN+Normal) | if(isNaN) true/false |
| testGetArgument* (2 tests) | normal + NaN propagate |
| testNthRoot* (6 tests) | n<=0 throw, isNaN, isInfinite, loop ปกติ (k=0..n-1), boundary n=1 |
| testGetField / testToString | sanity check, ไม่มี branch ซับซ้อน |

**หมายเหตุ:** branch ภายใน `abs()` ที่ตรวจ `imaginary == 0.0` ในกรณี `abs(real) < abs(imaginary)` เป็น **dead code ตามตรรกะ** (ไม่มีอินพุตใดที่ทำให้เงื่อนไขนี้เป็นจริงได้จริง) จึงไม่ได้พยายามสร้างเทสเพื่อ force branch นี้ และได้ใส่คอมเมนต์กำกับไว้ในโค้ดแล้วตามข้อกำหนดที่ 4