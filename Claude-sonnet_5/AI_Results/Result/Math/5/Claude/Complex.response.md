# วิเคราะห์และออกแบบ JUnit 4 Test Suite สำหรับ `Complex` (Math-5b)

ด้านล่างคือชุดทดสอบ `ComplexTest` ที่ออกแบบให้ครอบคลุม branch/condition ของแต่ละเมธอดอย่างละเอียด โดยอ้างอิงจาก logic ในซอร์สที่ให้มาเท่านั้น

```java
package org.apache.commons.math3.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;

public class ComplexTest {

    private static final double DELTA = 1e-9;

    // ---------- Constructor / getters / isNaN / isInfinite ----------

    @Test
    public void testConstructorSingleArg() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorNormal() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(2.0, c.getImaginary(), DELTA);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructorNaNReal() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
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
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
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
    public void testConstructorNaNBeatsInfinite() {
        // isInfinite = !isNaN && (...) -> ถ้ามี NaN ร่วมกับ Infinite ต้องได้ isInfinite=false
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
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
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), DELTA);
    }

    @Test
    public void testAbsZero() {
        // real==0 && imaginary==0 -> else branch, real==0.0 -> return abs(imaginary)
        assertEquals(0.0, Complex.ZERO.abs(), DELTA);
    }

    @Test
    public void testAbsRealLessThanImaginary() {
        // |real| < |imaginary|, imaginary != 0 -> mainline formula
        Complex c = new Complex(0.0, 5.0);
        assertEquals(5.0, c.abs(), DELTA);
    }

    @Test
    public void testAbsRealGreaterEqualImaginary() {
        // |real| >= |imaginary|, real != 0 -> mainline formula (else branch)
        Complex c = new Complex(5.0, 0.0);
        assertEquals(5.0, c.abs(), DELTA);
    }

    @Test
    public void testAbsGeneralCase() {
        Complex c1 = new Complex(3.0, 4.0); // |real|<|imag|
        assertEquals(5.0, c1.abs(), DELTA);
        Complex c2 = new Complex(4.0, 3.0); // |real|>=|imag|
        assertEquals(5.0, c2.abs(), DELTA);
    }

    // ---------- add(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testAddComplexNull() {
        Complex c = new Complex(1, 1);
        c.add(null);
    }

    @Test
    public void testAddComplexNaN() {
        Complex c = new Complex(1, 1);
        assertTrue(c.add(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.add(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testAddComplexNormal() {
        Complex c = new Complex(1, 1).add(new Complex(2, 3));
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(4.0, c.getImaginary(), DELTA);
    }

    // ---------- add(double) ----------

    @Test
    public void testAddDoubleNaN() {
        assertTrue(new Complex(1, 1).add(Double.NaN).isNaN());
        assertTrue(Complex.NaN.add(2.0).isNaN());
    }

    @Test
    public void testAddDoubleNormal() {
        Complex c = new Complex(1, 1).add(2.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(1.0, c.getImaginary(), DELTA);
    }

    // ---------- conjugate() ----------

    @Test
    public void testConjugateNaN() {
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testConjugateNormal() {
        Complex c = new Complex(2, 3).conjugate();
        assertEquals(2.0, c.getReal(), DELTA);
        assertEquals(-3.0, c.getImaginary(), DELTA);
    }

    // ---------- divide(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testDivideComplexNull() {
        new Complex(1, 1).divide((Complex) null);
    }

    @Test
    public void testDivideComplexNaN() {
        assertTrue(Complex.NaN.divide(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).divide(Complex.NaN).isNaN());
    }

    @Test
    public void testDivideComplexByZero() {
        assertTrue(new Complex(1, 1).divide(Complex.ZERO).isNaN());
    }

    @Test
    public void testDivideComplexInfiniteDivisorFiniteThis() {
        Complex result = new Complex(1, 1).divide(Complex.INF);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideComplexBothInfinite() {
        Complex result = Complex.INF.divide(Complex.INF);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplexBranch_cLessThanD() {
        // divisor (1,2): |c|=1 < |d|=2
        Complex result = new Complex(3, 4).divide(new Complex(1, 2));
        assertEquals(2.2, result.getReal(), DELTA);
        assertEquals(-0.4, result.getImaginary(), DELTA);
    }

    @Test
    public void testDivideComplexBranch_cGreaterEqualD() {
        // divisor (2,1): |c|=2 >= |d|=1
        Complex result = new Complex(3, 4).divide(new Complex(2, 1));
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(1.0, result.getImaginary(), DELTA);
    }

    // ---------- divide(double) ----------

    @Test
    public void testDivideDoubleNaN() {
        assertTrue(new Complex(1, 1).divide(Double.NaN).isNaN());
        assertTrue(Complex.NaN.divide(2.0).isNaN());
    }

    @Test
    public void testDivideDoubleByZero() {
        assertTrue(new Complex(1, 1).divide(0.0).isNaN());
    }

    @Test
    public void testDivideDoubleInfiniteFiniteThis() {
        assertEquals(Complex.ZERO, new Complex(1, 1).divide(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testDivideDoubleInfiniteInfiniteThis() {
        assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testDivideDoubleNormal() {
        Complex c = new Complex(4, 6).divide(2.0);
        assertEquals(2.0, c.getReal(), DELTA);
        assertEquals(3.0, c.getImaginary(), DELTA);
    }

    // ---------- reciprocal() ----------

    @Test
    public void testReciprocalNaN() {
        assertTrue(Complex.NaN.reciprocal().isNaN());
    }

    @Test
    public void testReciprocalZero() {
        assertTrue(Complex.ZERO.reciprocal().isNaN());
    }

    @Test
    public void testReciprocalInfinite() {
        assertEquals(Complex.ZERO, Complex.INF.reciprocal());
    }

    @Test
    public void testReciprocalRealLessThanImaginary() {
        Complex c = new Complex(0, 2).reciprocal();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(-0.5, c.getImaginary(), DELTA);
    }

    @Test
    public void testReciprocalElseBranch() {
        Complex c = new Complex(2, 0).reciprocal();
        assertEquals(0.5, c.getReal(), DELTA);
        assertEquals(-0.0, c.getImaginary(), DELTA);
    }

    // ---------- equals() ----------

    @Test
    public void testEqualsSameReference() {
        Complex c = new Complex(1, 1);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(new Complex(1, 1).equals(null));
    }

    @Test
    public void testEqualsNotComplexInstance() {
        assertFalse(new Complex(1, 1).equals("not a complex"));
    }

    @Test
    public void testEqualsBothNaN() {
        Complex c1 = new Complex(Double.NaN, 1);
        Complex c2 = new Complex(2, Double.NaN);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEqualsNormalEqual() {
        assertTrue(new Complex(3, 4).equals(new Complex(3, 4)));
    }

    @Test
    public void testEqualsNormalNotEqualReal() {
        assertFalse(new Complex(3, 4).equals(new Complex(5, 4)));
    }

    @Test
    public void testEqualsNormalNotEqualImaginary() {
        assertFalse(new Complex(3, 4).equals(new Complex(3, 5)));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCodeNaN() {
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(7, new Complex(Double.NaN, 1).hashCode());
    }

    @Test
    public void testHashCodeEqualObjects() {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(3, 4);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    // ---------- multiply(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplexNull() {
        new Complex(1, 1).multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplexNaN() {
        assertTrue(Complex.NaN.multiply(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplexInfiniteThisReal() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1).multiply(new Complex(1, 1));
        assertEquals(Complex.INF, c);
    }

    @Test
    public void testMultiplyComplexInfiniteFactorImaginary() {
        Complex c = new Complex(1, 1).multiply(new Complex(1, Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, c);
    }

    @Test
    public void testMultiplyComplexNormal() {
        Complex c = new Complex(1, 2).multiply(new Complex(3, 4));
        assertEquals(-5.0, c.getReal(), DELTA);
        assertEquals(10.0, c.getImaginary(), DELTA);
    }

    // ---------- multiply(int) ----------

    @Test
    public void testMultiplyIntNaN() {
        assertTrue(Complex.NaN.multiply(2).isNaN());
    }

    @Test
    public void testMultiplyIntInfinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1).multiply(2);
        assertEquals(Complex.INF, c);
    }

    @Test
    public void testMultiplyIntNormal() {
        Complex c = new Complex(2, 3).multiply(4);
        assertEquals(8.0, c.getReal(), DELTA);
        assertEquals(12.0, c.getImaginary(), DELTA);
    }

    // ---------- multiply(double) ----------

    @Test
    public void testMultiplyDoubleNaN() {
        assertTrue(new Complex(1, 1).multiply(Double.NaN).isNaN());
        assertTrue(Complex.NaN.multiply(2.0).isNaN());
    }

    @Test
    public void testMultiplyDoubleInfiniteFactor() {
        Complex c = new Complex(1, 1).multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, c);
    }

    @Test
    public void testMultiplyDoubleInfiniteThis() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1).multiply(2.0);
        assertEquals(Complex.INF, c);
    }

    @Test
    public void testMultiplyDoubleNormal() {
        Complex c = new Complex(2, 3).multiply(2.0);
        assertEquals(4.0, c.getReal(), DELTA);
        assertEquals(6.0, c.getImaginary(), DELTA);
    }

    // ---------- negate() ----------

    @Test
    public void testNegateNaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testNegateNormal() {
        Complex c = new Complex(2, 3).negate();
        assertEquals(-2.0, c.getReal(), DELTA);
        assertEquals(-3.0, c.getImaginary(), DELTA);
    }

    // ---------- subtract(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplexNull() {
        new Complex(1, 1).subtract((Complex) null);
    }

    @Test
    public void testSubtractComplexNaN() {
        assertTrue(Complex.NaN.subtract(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testSubtractComplexNormal() {
        Complex c = new Complex(5, 5).subtract(new Complex(2, 3));
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(2.0, c.getImaginary(), DELTA);
    }

    // ---------- subtract(double) ----------

    @Test
    public void testSubtractDoubleNaN() {
        assertTrue(new Complex(1, 1).subtract(Double.NaN).isNaN());
        assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test
    public void testSubtractDoubleNormal() {
        Complex c = new Complex(5, 5).subtract(2.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(5.0, c.getImaginary(), DELTA);
    }

    // ---------- acos / asin / atan ----------

    @Test
    public void testAcosNaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAcosZero() {
        Complex c = Complex.ZERO.acos();
        assertEquals(FastMath.PI / 2.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testAsinNaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAsinZero() {
        Complex c = Complex.ZERO.asin();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testAtanNaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testAtanZero() {
        Complex c = Complex.ZERO.atan();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- cos / cosh ----------

    @Test
    public void testCosNaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCosNormal() {
        Complex c = Complex.ZERO.cos();
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testCoshNaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testCoshNormal() {
        Complex c = Complex.ZERO.cosh();
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- exp / log ----------

    @Test
    public void testExpNaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testExpNormal() {
        Complex c = Complex.ZERO.exp();
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testLogNaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testLogNormal() {
        Complex c = Complex.ONE.log();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- pow(Complex) / pow(double) ----------

    @Test(expected = NullArgumentException.class)
    public void testPowComplexNull() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testPowComplexNormal() {
        Complex c = Complex.ONE.pow(new Complex(2, 0));
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testPowDoubleNormal() {
        Complex c = Complex.ONE.pow(2.0);
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- sin / sinh ----------

    @Test
    public void testSinNaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSinNormal() {
        Complex c = Complex.ZERO.sin();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testSinhNaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSinhNormal() {
        Complex c = Complex.ZERO.sinh();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- sqrt() / sqrt1z() ----------

    @Test
    public void testSqrtNaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrtZero() {
        Complex c = Complex.ZERO.sqrt();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testSqrtRealNonNegative() {
        Complex c = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testSqrtRealNegative() {
        Complex c = new Complex(-4.0, 0.0).sqrt();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(2.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testSqrt1zNormal() {
        Complex c = Complex.ZERO.sqrt1z();
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- tan() ----------

    @Test
    public void testTanNaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    @Test
    public void testTanInfiniteReal() {
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).tan().isNaN());
    }

    @Test
    public void testTanImaginaryGreater20() {
        Complex c = new Complex(1.0, 21.0).tan();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(1.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testTanImaginaryLessMinus20() {
        Complex c = new Complex(1.0, -21.0).tan();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(-1.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testTanNormal() {
        Complex c = Complex.ZERO.tan();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- tanh() ----------

    @Test
    public void testTanhNaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testTanhInfiniteImaginary() {
        assertTrue(new Complex(1.0, Double.POSITIVE_INFINITY).tanh().isNaN());
    }

    @Test
    public void testTanhRealGreater20() {
        Complex c = new Complex(21.0, 1.0).tanh();
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testTanhRealLessMinus20() {
        Complex c = new Complex(-21.0, 1.0).tanh();
        assertEquals(-1.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testTanhNormal() {
        Complex c = Complex.ZERO.tanh();
        assertEquals(0.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- getArgument() ----------

    @Test
    public void testGetArgumentNormal() {
        double arg = new Complex(1.0, 1.0).getArgument();
        assertEquals(FastMath.PI / 4.0, arg, DELTA);
    }

    @Test
    public void testGetArgumentNaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // ---------- nthRoot() ----------

    @Test(expected = NotPositiveException.class)
    public void testNthRootZero() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegative() {
        Complex.ONE.nthRoot(-2);
    }

    @Test
    public void testNthRootNaN() {
        List<Complex> result = Complex.NaN.nthRoot(2);
        assertEquals(1, result.size());
        assertTrue(result.get(0).isNaN());
    }

    @Test
    public void testNthRootInfinite() {
        List<Complex> result = Complex.INF.nthRoot(2);
        assertEquals(1, result.size());
        assertEquals(Complex.INF, result.get(0));
    }

    @Test
    public void testNthRootNormal() {
        List<Complex> result = new Complex(4.0, 0.0).nthRoot(2);
        assertEquals(2, result.size());
        assertEquals(2.0, result.get(0).getReal(), DELTA);
        assertEquals(0.0, result.get(0).getImaginary(), DELTA);
        assertEquals(-2.0, result.get(1).getReal(), DELTA);
        assertEquals(0.0, result.get(1).getImaginary(), DELTA);
    }

    // ---------- valueOf() ----------

    @Test
    public void testValueOfTwoArgsRealNaN() {
        assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
    }

    @Test
    public void testValueOfTwoArgsImaginaryNaN() {
        assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testValueOfTwoArgsNormal() {
        Complex c = Complex.valueOf(3.0, 4.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(4.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testValueOfOneArgNaN() {
        assertTrue(Complex.valueOf(Double.NaN).isNaN());
    }

    @Test
    public void testValueOfOneArgNormal() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------- getField() / toString() ----------

    @Test
    public void testGetField() {
        assertNotNull(new Complex(1, 1).getField());
        assertSame(ComplexField.getInstance(), new Complex(1, 1).getField());
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
    }
}
```

## สรุป Coverage Mapping

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor* | isNaN จาก real/imaginary เป็น NaN, isInfinite จาก real/imaginary infinite, กรณี NaN+Infinite ร่วมกัน (isInfinite ต้องเป็น false) |
| testAbs* | isNaN→NaN, isInfinite→+INF, \|real\|<\|imag\| (รวมกรณี real=0/imag=0 ที่เป็น dead code – คอมเมนต์ไว้ว่าไม่สามารถ trigger ได้), \|real\|>=\|imag\| กับ real==0, general case ทั้งสองทาง |
| testAddComplex*/testAddDouble* | null→Exception, this/addend NaN, normal |
| testConjugate* | isNaN, normal |
| testDivideComplex* | null, NaN (this/divisor), divisor=0, divisor infinite & this finite→ZERO, both infinite→NaN, \|c\|<\|d\| branch, \|c\|>=\|d\| branch |
| testDivideDouble* | NaN, divisor=0, divisor infinite(this finite→ZERO, this infinite→NaN), normal |
| testReciprocal* | isNaN, real=imag=0→NaN, isInfinite→ZERO, \|real\|<\|imag\|, else branch |
| testEquals* | same ref, null, not instance, NaN-equality, equal/ไม่เท่ากันที่ real/imaginary |
| testHashCode* | NaN→7, equal objects→equal hash |
| testMultiplyComplex*/Int*/Double* | null(เฉพาะ Complex), NaN, infinite(real/imag ของ this หรือ factor), normal |
| testNegate* | isNaN, normal |
| testSubtractComplex*/Double* | null, NaN, normal |
| testAcos/testAsin/testAtan* | isNaN, ค่าจริงที่ ZERO (ตรวจผลลัพธ์เชิงตัวเลข) |
| testCos/testCosh/testExp/testLog* | isNaN, normal (ZERO/ONE) |
| testPow* | null (เฉพาะ Complex overload), normal |
| testSin/testSinh* | isNaN, normal |
| testSqrt* | isNaN, real=imag=0, real>=0, real<0 |
| testSqrt1z* | normal flow ผ่าน subtract/multiply/sqrt |
| testTan* | isNaN\|\|infinite real, imaginary>20, imaginary<-20, normal |
| testTanh* | isNaN\|\|infinite imaginary, real>20, real<-20, normal |
| testGetArgument* | normal, NaN |
| testNthRoot* | n<=0→Exception (0 และค่าลบ), isNaN→list ขนาด1, isInfinite→list ขนาด1, normal loop (k=0..n-1) |
| testValueOf* | real NaN, imaginary NaN, ปกติ (ทั้ง 2 overload) |
| testGetField/testToString | sanity check พื้นฐาน |

**หมายเหตุสำคัญ:** ใน `abs()` มีเงื่อนไขย่อย `if (imaginary == 0.0)` ภายใน branch `FastMath.abs(real) < FastMath.abs(imaginary)` ซึ่งไม่สามารถเป็นจริงได้ในทางตรรกะ (เพราะถ้า imaginary=0 แล้ว `|imaginary|=0` จะทำให้เงื่อนไขนอก `|real| < 0` เป็นเท็จเสมอ) จึงถือเป็น **dead code ที่ไม่สามารถทดสอบได้** — ได้ระบุเป็นคอมเมนต์ในโค้ดแล้ว ไม่ได้เขียนเทสสำหรับ branch นี้เพราะไม่มีทาง reachable จริง