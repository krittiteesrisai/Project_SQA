# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับคลาส `Complex`

## หมายเหตุสำคัญก่อนเขียนทดสอบ

จากการวิเคราะห์ branch ในซอร์สโค้ด พบ **dead branch** (ไม่สามารถเข้าถึงได้จริงด้วย logic ปัจจุบัน) 2 แห่งที่จะระบุด้วยคอมเมนต์ในโค้ด:
- ใน `abs()`: branch `if (imaginary == 0.0)` ภายใต้เงื่อนไข `Math.abs(real) < Math.abs(imaginary)` — เพราะถ้า `imaginary==0.0` แล้ว `Math.abs(imaginary)=0` จะทำให้ `Math.abs(real) < 0` เป็นไปไม่ได้
- ใน `divide()`: branch คล้ายกันทั้ง `if (d == 0.0)` ภายใต้ `Math.abs(c) < Math.abs(d)` และ `if (c == 0.0)` ภายใต้ else (เพราะถูกดักด้วยเงื่อนไข `c==0.0 && d==0.0` ก่อนหน้าแล้ว)

```java
package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-9;

    // ---------- Constructor / Accessors ----------
    @Test
    public void testConstructorAndAccessors() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 0.0);
        assertEquals(4.0, c.getImaginary(), 0.0);
    }

    // ---------- isNaN() ----------
    @Test
    public void testIsNaN_realNaN() {
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
    }

    @Test
    public void testIsNaN_imaginaryNaN() {
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testIsNaN_neitherNaN() {
        assertFalse(new Complex(1.0, 2.0).isNaN());
    }

    // ---------- isInfinite() ----------
    @Test
    public void testIsInfinite_true() {
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
    }

    @Test
    public void testIsInfinite_falseWhenNaN() {
        // ตาม logic: ถึงมี infinite แต่ถ้ามี NaN ด้วย ต้องเป็น false
        assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
    }

    @Test
    public void testIsInfinite_falseFinite() {
        assertFalse(new Complex(1.0, 2.0).isInfinite());
    }

    // ---------- abs() ----------
    @Test
    public void testAbs_isNaNBranch() {
        assertTrue(Double.isNaN(new Complex(Double.NaN, 1.0).abs()));
    }

    @Test
    public void testAbs_isInfiniteBranch() {
        assertEquals(Double.POSITIVE_INFINITY,
            new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), 0.0);
    }

    @Test
    public void testAbs_absRealLessThanImaginary_nonZeroImaginary() {
        // |real| < |imaginary|, imaginary != 0
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_elseBranch_realZero() {
        // |real| >= |imaginary| และ real == 0.0 (ทั้งคู่เป็น 0)
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_elseBranch_realNonZero() {
        // |real| >= |imaginary|, real != 0
        Complex c = new Complex(4.0, 3.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    // ---------- add() ----------
    @Test
    public void testAdd_normal() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex r = a.add(b);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullThrows() {
        new Complex(1.0, 1.0).add(null);
    }

    // ---------- conjugate() ----------
    @Test
    public void testConjugate_isNaN() {
        assertTrue(new Complex(Double.NaN, 1.0).conjugate().isNaN());
    }

    @Test
    public void testConjugate_normal() {
        Complex c = new Complex(1.0, 2.0);
        Complex r = c.conjugate();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(-2.0, r.getImaginary(), EPS);
    }

    // ---------- divide() ----------
    @Test
    public void testDivide_thisNaN() {
        assertTrue(new Complex(Double.NaN, 0).divide(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testDivide_rhsNaN() {
        assertTrue(new Complex(1, 1).divide(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testDivide_rhsZero() {
        Complex r = new Complex(1.0, 1.0).divide(Complex.ZERO);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivide_rhsInfiniteThisFinite() {
        Complex r = new Complex(1.0, 1.0).divide(Complex.INF);
        assertEquals(Complex.ZERO, r);
    }

    @Test
    public void testDivide_absC_lessThan_absD_nonZeroD() {
        // |c| < |d|, d != 0  -> branch ปกติ (เข้าถึงได้จริง)
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 2.0); // c=1, d=2 -> |c|<|d|
        Complex r = a.divide(b);
        // (1+1i)/(1+2i) = (1*1+1*2)/(1+4) + (1*1-1*2)/(1+4) i = 3/5 - 1/5 i
        assertEquals(0.6, r.getReal(), EPS);
        assertEquals(-0.2, r.getImaginary(), EPS);
    }

    @Test
    public void testDivide_elseBranch_cNonZero() {
        // |c| >= |d|, c != 0 -> branch ปกติ
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(2.0, 1.0); // c=2, d=1 -> |c|>=|d|
        Complex r = a.divide(b);
        // (1+1i)/(2+1i) = conj trick => (1*2+1*1)/(4+1) + (1*2-1*1)/5 i = 3/5 + 1/5 i
        assertEquals(0.6, r.getReal(), EPS);
        assertEquals(0.2, r.getImaginary(), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testDivide_nullThrows() {
        new Complex(1.0, 1.0).divide(null);
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameReference() {
        Complex c = new Complex(1.0, 2.0);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_null() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.equals(null));
    }

    @Test
    public void testEquals_differentType_classCastCaught() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.equals("not a complex"));
    }

    @Test
    public void testEquals_rhsNaN_thisNaN() {
        Complex a = new Complex(Double.NaN, 1.0);
        Complex b = new Complex(2.0, Double.NaN);
        assertTrue(a.equals(b)); // ทั้งคู่ NaN ถือว่าเท่ากัน
    }

    @Test
    public void testEquals_rhsNaN_thisNotNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(Double.NaN, 1.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_equalBits() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentBits() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 3.0);
        assertFalse(a.equals(b));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_NaN() {
        assertEquals(7, new Complex(Double.NaN, 1.0).hashCode());
        assertEquals(7, new Complex(1.0, Double.NaN).hashCode());
    }

    @Test
    public void testHashCode_normal_consistentWithEquals() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- multiply() ----------
    @Test
    public void testMultiply_thisNaN() {
        assertTrue(new Complex(Double.NaN, 0).multiply(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testMultiply_rhsNaN() {
        assertTrue(new Complex(1, 1).multiply(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testMultiply_thisInfiniteReal() {
        Complex r = new Complex(Double.POSITIVE_INFINITY, 1.0).multiply(new Complex(1.0, 1.0));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiply_thisInfiniteImaginary() {
        Complex r = new Complex(1.0, Double.POSITIVE_INFINITY).multiply(new Complex(1.0, 1.0));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiply_rhsInfiniteReal() {
        Complex r = new Complex(1.0, 1.0).multiply(new Complex(Double.POSITIVE_INFINITY, 1.0));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiply_rhsInfiniteImaginary() {
        Complex r = new Complex(1.0, 1.0).multiply(new Complex(1.0, Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiply_normal() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex r = a.multiply(b);
        // (1+2i)(3+4i) = 3+4i+6i-8 = -5+10i
        assertEquals(-5.0, r.getReal(), EPS);
        assertEquals(10.0, r.getImaginary(), EPS);
    }

    // ---------- negate() ----------
    @Test
    public void testNegate_isNaN() {
        assertTrue(new Complex(Double.NaN, 1.0).negate().isNaN());
    }

    @Test
    public void testNegate_normal() {
        Complex r = new Complex(1.0, -2.0).negate();
        assertEquals(-1.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    // ---------- subtract() ----------
    @Test
    public void testSubtract_thisNaN() {
        assertTrue(new Complex(Double.NaN, 0).subtract(new Complex(1, 1)).isNaN());
    }

    @Test
    public void testSubtract_rhsNaN() {
        assertTrue(new Complex(1, 1).subtract(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testSubtract_normal() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);
        Complex r = a.subtract(b);
        assertEquals(3.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testSubtract_nullThrows() {
        new Complex(1.0, 1.0).subtract(null);
    }

    // ---------- acos() ----------
    @Test
    public void testAcos_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).acos().isNaN());
    }

    @Test
    public void testAcos_normal_doesNotThrow() {
        Complex r = new Complex(0.0, 0.0).acos();
        // acos(0) = pi/2
        assertEquals(Math.PI / 2.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------- asin() ----------
    @Test
    public void testAsin_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).asin().isNaN());
    }

    @Test
    public void testAsin_normal() {
        Complex r = new Complex(0.0, 0.0).asin();
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------- atan() ----------
    @Test
    public void testAtan_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).atan().isNaN());
    }

    @Test
    public void testAtan_normal() {
        Complex r = new Complex(0.0, 0.0).atan();
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------- cos() ----------
    @Test
    public void testCos_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).cos().isNaN());
    }

    @Test
    public void testCos_normal() {
        Complex r = new Complex(0.0, 0.0).cos();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- cosh() ----------
    @Test
    public void testCosh_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).cosh().isNaN());
    }

    @Test
    public void testCosh_normal() {
        Complex r = new Complex(0.0, 0.0).cosh();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- exp() ----------
    @Test
    public void testExp_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).exp().isNaN());
    }

    @Test
    public void testExp_normal() {
        Complex r = new Complex(0.0, 0.0).exp();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- log() ----------
    @Test
    public void testLog_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).log().isNaN());
    }

    @Test
    public void testLog_normal() {
        Complex r = new Complex(Math.E, 0.0).log();
        assertEquals(1.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------- pow() ----------
    @Test(expected = NullPointerException.class)
    public void testPow_nullThrows() {
        new Complex(1.0, 1.0).pow(null);
    }

    @Test
    public void testPow_normal() {
        Complex base = new Complex(2.0, 0.0);
        Complex exp = new Complex(2.0, 0.0);
        Complex r = base.pow(exp);
        // 2^2 = 4
        assertEquals(4.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    // ---------- sin() ----------
    @Test
    public void testSin_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).sin().isNaN());
    }

    @Test
    public void testSin_normal() {
        Complex r = new Complex(0.0, 0.0).sin();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- sinh() ----------
    @Test
    public void testSinh_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).sinh().isNaN());
    }

    @Test
    public void testSinh_normal() {
        Complex r = new Complex(0.0, 0.0).sinh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- sqrt() ----------
    @Test
    public void testSqrt_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).sqrt().isNaN());
    }

    @Test
    public void testSqrt_zeroZero() {
        Complex r = new Complex(0.0, 0.0).sqrt();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_realPositive() {
        // real >= 0.0 branch
        Complex r = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_realNegative() {
        // real < 0.0 branch (else)
        Complex r = new Complex(-4.0, 0.0).sqrt();
        // sqrt(-4) = 0 + 2i (ตาม indicator(0)=... ตรวจแค่ขนาด)
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(2.0, Math.abs(r.getImaginary()), 1e-6);
    }

    // ---------- sqrt1z() ----------
    @Test
    public void testSqrt1z_normal() {
        Complex r = new Complex(0.0, 0.0).sqrt1z();
        // sqrt(1 - 0) = 1
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt1z_isNaNPropagated() {
        // sqrt1z ไม่ได้เช็ค isNaN เอง แต่ multiply/subtract/sqrt จะ propagate NaN
        Complex r = new Complex(Double.NaN, 0).sqrt1z();
        assertTrue(r.isNaN());
    }

    // ---------- tan() ----------
    @Test
    public void testTan_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).tan().isNaN());
    }

    @Test
    public void testTan_normal() {
        Complex r = new Complex(0.0, 0.0).tan();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- tanh() ----------
    @Test
    public void testTanh_isNaN() {
        assertTrue(new Complex(Double.NaN, 0).tanh().isNaN());
    }

    @Test
    public void testTanh_normal() {
        Complex r = new Complex(0.0, 0.0).tanh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- Static constants sanity ----------
    @Test
    public void testStaticConstants() {
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        assertEquals(0.0, Complex.ONE.getImaginary(), 0.0);
        assertEquals(0.0, Complex.ZERO.getReal(), 0.0);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 0.0);
        assertEquals(0.0, Complex.I.getReal(), 0.0);
        assertEquals(1.0, Complex.I.getImaginary(), 0.0);
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndAccessors` | Constructor, `getReal`, `getImaginary` |
| `testIsNaN_realNaN/imaginaryNaN/neitherNaN` | `isNaN()` ทั้ง true/false ของแต่ละ operand |
| `testIsInfinite_true/falseWhenNaN/falseFinite` | `isInfinite()`: `!isNaN() && (infinite real||imaginary)` ทุกสาขา |
| `testAbs_isNaNBranch` | `abs()` if `isNaN()` → true |
| `testAbs_isInfiniteBranch` | `abs()` if `isInfinite()` → true |
| `testAbs_absRealLessThanImaginary_nonZeroImaginary` | `abs()` branch `|real|<|imag|`, imaginary≠0 |
| `testAbs_elseBranch_realZero` | `abs()` else branch, `real==0.0` true |
| `testAbs_elseBranch_realNonZero` | `abs()` else branch, `real==0.0` false |
| `testAdd_normal/nullThrows` | `add()` ปกติ และ NPE จาก rhs null |
| `testConjugate_isNaN/normal` | `conjugate()` ทั้ง 2 branch |
| `testDivide_thisNaN/rhsNaN` | `divide()` เงื่อนไข `isNaN()||rhs.isNaN()` |
| `testDivide_rhsZero` | `divide()` เงื่อนไข `c==0&&d==0` |
| `testDivide_rhsInfiniteThisFinite` | `divide()` เงื่อนไข `rhs.isInfinite()&&!isInfinite()` |
| `testDivide_absC_lessThan_absD_nonZeroD` | `divide()` branch `|c|<|d|`, d≠0 (branch ปกติที่เข้าถึงได้) |
| `testDivide_elseBranch_cNonZero` | `divide()` else branch, c≠0 (branch ปกติที่เข้าถึงได้) |
| `testDivide_nullThrows` | NPE จาก rhs null |
| `testEquals_sameReference/null/differentType/...` | `equals()` ทุก branch: self, null, ClassCastException, rhs.isNaN() (ทั้ง this NaN/not NaN), bit compare equal/ไม่เท่า |
| `testHashCode_NaN/normal` | `hashCode()` ทั้ง 2 branch |
| `testMultiply_*` | `multiply()`: isNaN check, 4 เงื่อนไข infinite (real/imag ของ this และ rhs), และ normal case |
| `testNegate_isNaN/normal` | `negate()` ทั้ง 2 branch |
| `testSubtract_thisNaN/rhsNaN/normal/nullThrows` | `subtract()` ทุก branch + NPE |
| `testAcos/Asin/Atan/Cos/Cosh/Exp/Log/Sin/Sinh/Tan/Tanh_isNaN` | ทุกเมธอด trig: branch `isNaN()` → NaN |
| `test..._normal` (ของแต่ละ trig) | Path การคำนวณปกติ (ไม่ NaN) |
| `testPow_nullThrows/normal` | `pow()`: NPE เมื่อ x null, และ path ปกติ |
| `testSqrt_isNaN/zeroZero/realPositive/realNegative` | `sqrt()`: isNaN, (real==0&&imag==0), real≥0, real<0 ครบทุก branch |
| `testSqrt1z_normal/isNaNPropagated` | `sqrt1z()` (ไม่มี isNaN check เอง แต่ NaN propagate ผ่าน multiply/subtract/sqrt) |
| `testStaticConstants` | ตรวจ static field ที่ถูกใช้ร่วมในหลายเมธอด |

**หมายเหตุ:** branch `if (imaginary == 0.0)` ใน `abs()` (ภายใต้ `|real|<|imaginary|`) และ `if (d==0.0)`/`if (c==0.0)` ใน `divide()` (ภายใต้เงื่อนไขที่ขัดกันเอง) เป็น **dead code ตามการวิเคราะห์โครงสร้าง logic** จึงไม่สามารถเขียนเทสเพื่อ cover ได้จริงโดยไม่ฝืน logic ของเงื่อนไขภายนอก — ได้ระบุไว้เป็นคอมเมนต์ในโค้ดแล้วตามข้อกำหนดที่ 4