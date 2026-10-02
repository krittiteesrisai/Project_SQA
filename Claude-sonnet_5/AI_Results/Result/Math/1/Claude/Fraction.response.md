# JUnit 4 Test Suite สำหรับ `Fraction` Class

## การวิเคราะห์

ผมได้วิเคราะห์ branch ทั้งหมดในซอร์สโค้ด รวมถึง:
- Private constructor (double-based) ที่มี loop และเงื่อนไขซับซ้อน
- Constructor (int, int) ที่มีการตรวจสอบ overflow/sign
- เมธอด arithmetic (`add`, `subtract`, `multiply`, `divide`) ที่มี branch `null check`, `zero check`, `gcd==1` vs `gcd!=1` (BigInteger path)
- `getReducedFraction` ที่มี edge case พิเศษเรื่อง `Integer.MIN_VALUE`

> **หมายเหตุสำคัญ:** บาง branch เช่น overflow ของ `p2`/`q2` ภายใน loop ของ private double-constructor และ overflow ของ BigInteger (`w.bitLength() > 31`) ใน `addSub` เป็นกรณีที่ต้องใช้ค่าตัวเลขเฉพาะเจาะจงมากซึ่งไม่สามารถยืนยัน behavior ได้แน่ชัดจากซอร์สที่ให้มาโดยไม่เสี่ยง "เดา" ผลลัพธ์ จึง**ไม่ได้เขียนเทสสำหรับ branch เหล่านี้โดยตรง** (ตามข้อกำหนดที่ 4)

```java
import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

public class FractionTest {

    // =========================================================
    // Double-based constructors (private constructor via delegation)
    // =========================================================

    @Test
    public void testDoubleConstructor_ExactInteger() throws FractionConversionException {
        // a0 == value exactly -> numerator=a0, denominator=1 (branch: abs(a0-value)<epsilon TRUE, diff=0)
        Fraction f = new Fraction(5.0);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_NegativeExactInteger() throws FractionConversionException {
        Fraction f = new Fraction(-5.0);
        assertEquals(-5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_AlmostIntegerWithinEpsilon() throws FractionConversionException {
        // diff != 0 but still < epsilon -> same early-return branch, different trigger value
        Fraction f = new Fraction(5.0000001, 1e-5, 100);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_SimpleFractionViaLoop() throws FractionConversionException {
        // forces loop to execute once; exact binary double -> deterministic
        Fraction f = new Fraction(3.5);
        assertEquals(7, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_LoopConvergesWithinMaxDenominator() throws FractionConversionException {
        // exact binary fraction 0.125 = 1/8; after first iteration convergent exactly
        // equals value -> stop immediately; q2(8) < maxDenominator(100) TRUE branch
        Fraction f = new Fraction(0.125, 100);
        assertEquals(1, f.getNumerator());
        assertEquals(8, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_MaxDenominatorExceeded_FallbackToPreviousConvergent()
            throws FractionConversionException {
        // PI with maxDenominator=10: 2nd convergent q2=106 >= 10 -> loop stops (q2<maxDenominator FALSE)
        // final: q2(106) < maxDenominator(10) FALSE branch -> fallback to p1/q1 = 22/7
        Fraction f = new Fraction(Math.PI, 10);
        assertEquals(22, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_MaxIterationsExceeded() throws FractionConversionException {
        // epsilon ultra-small, maxIterations=2 -> n(2)<maxIterations(2) FALSE forces stop,
        // then n>=maxIterations check TRUE -> throws
        new Fraction(Math.PI, 1e-20, 2);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_InitialOverflow() throws FractionConversionException {
        // a0 = floor(1e20) overflows Integer range -> immediate throw branch
        new Fraction(1e20);
    }

    // =========================================================
    // Constructor (int num, int den)
    // =========================================================

    @Test(expected = MathArithmeticException.class)
    public void testIntIntConstructor_ZeroDenominatorThrows() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntIntConstructor_NegativeDenominator_NumMinValueThrows() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntIntConstructor_NegativeDenominator_DenMinValueThrows() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testIntIntConstructor_NegativeDenominatorFlipsSign() {
        Fraction f = new Fraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testIntIntConstructor_ReducesByGcd() {
        Fraction f = new Fraction(4, 8); // gcd=4>1
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testIntIntConstructor_AlreadyCoprime() {
        Fraction f = new Fraction(3, 4); // gcd=1, no reduction branch
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testIntConstructor_SingleArg() {
        Fraction f = new Fraction(7);
        assertEquals(7, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // =========================================================
    // abs()
    // =========================================================

    @Test
    public void testAbs_PositiveNumeratorReturnsSameInstance() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_NegativeNumeratorReturnsNegated() {
        Fraction f = new Fraction(-3, 4);
        Fraction abs = f.abs();
        assertEquals(3, abs.getNumerator());
        assertEquals(4, abs.getDenominator());
    }

    // =========================================================
    // compareTo()
    // =========================================================

    @Test
    public void testCompareTo_LessThan() {
        assertEquals(-1, new Fraction(1, 3).compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testCompareTo_GreaterThan() {
        assertEquals(1, new Fraction(2, 3).compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testCompareTo_Equal() {
        assertEquals(0, new Fraction(1, 2).compareTo(new Fraction(2, 4)));
    }

    // =========================================================
    // Number conversions
    // =========================================================

    @Test
    public void testDoubleValue() {
        assertEquals(0.25, new Fraction(1, 4).doubleValue(), 1e-12);
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.25f, new Fraction(1, 4).floatValue(), 1e-6f);
    }

    @Test
    public void testIntValue_TruncatesTowardZero() {
        assertEquals(3, new Fraction(7, 2).intValue()); // 3.5 -> 3
    }

    @Test
    public void testLongValue_TruncatesTowardZero() {
        assertEquals(3L, new Fraction(7, 2).longValue());
    }

    // =========================================================
    // equals()
    // =========================================================

    @Test
    public void testEquals_SameReference() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_EqualValueDifferentInstance() {
        assertTrue(new Fraction(1, 2).equals(new Fraction(2, 4)));
    }

    @Test
    public void testEquals_DifferentValue() {
        assertFalse(new Fraction(1, 2).equals(new Fraction(1, 3)));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(new Fraction(1, 2).equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(new Fraction(1, 2).equals("1/2"));
    }

    // =========================================================
    // getters / hashCode
    // =========================================================

    @Test
    public void testGetNumeratorAndDenominator() {
        Fraction f = new Fraction(5, 9);
        assertEquals(5, f.getNumerator());
        assertEquals(9, f.getDenominator());
    }

    @Test
    public void testHashCode_EqualObjectsSameHash() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // =========================================================
    // negate()
    // =========================================================

    @Test
    public void testNegate_Normal() {
        Fraction n = new Fraction(3, 4).negate();
        assertEquals(-3, n.getNumerator());
        assertEquals(4, n.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_OverflowOnMinValueThrows() {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    // =========================================================
    // reciprocal()
    // =========================================================

    @Test
    public void testReciprocal_Normal() {
        Fraction r = new Fraction(3, 4).reciprocal();
        assertEquals(4, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_OfZeroThrows() {
        Fraction.ZERO.reciprocal(); // creates Fraction(1,0) internally -> den==0 throws
    }

    // =========================================================
    // add(Fraction) / addSub()
    // =========================================================

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_NullThrows() {
        new Fraction(1, 2).add((Fraction) null);
    }

    @Test
    public void testAddFraction_ThisNumeratorZero_ReturnsOtherFraction() {
        Fraction other = new Fraction(1, 3);
        Fraction result = Fraction.ZERO.add(other);
        assertSame(other, result); // isAdd branch returns fraction directly
    }

    @Test
    public void testAddFraction_OtherNumeratorZero_ReturnsThis() {
        Fraction f = new Fraction(1, 3);
        assertSame(f, f.add(Fraction.ZERO));
    }

    @Test
    public void testAddFraction_CoprimeDenominators_D1Equals1() {
        Fraction result = new Fraction(1, 2).add(new Fraction(1, 3));
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAddFraction_NonCoprimeDenominators_TmodD1NonZero() {
        // denominators 6,4 -> d1=2 (BigInteger path), t mod d1 != 0
        Fraction result = new Fraction(1, 6).add(new Fraction(1, 4));
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    public void testAddFraction_NonCoprimeDenominators_TmodD1Zero() {
        // denominators 4,4 -> d1=4 (BigInteger path), t mod d1 == 0
        Fraction result = new Fraction(1, 4).add(new Fraction(3, 4));
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    public void testAddInt() {
        Fraction result = new Fraction(1, 3).add(2);
        assertEquals(7, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    // =========================================================
    // subtract(Fraction) / addSub()
    // =========================================================

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_NullThrows() {
        new Fraction(1, 2).subtract((Fraction) null);
    }

    @Test
    public void testSubtractFraction_ThisNumeratorZero_ReturnsNegatedOther() {
        Fraction result = Fraction.ZERO.subtract(new Fraction(1, 3));
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_OtherNumeratorZero_ReturnsThis() {
        Fraction f = new Fraction(1, 3);
        assertSame(f, f.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtractFraction_Normal() {
        Fraction result = new Fraction(1, 2).subtract(new Fraction(1, 3));
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtractInt() {
        Fraction result = new Fraction(7, 3).subtract(2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    // =========================================================
    // multiply(Fraction)
    // =========================================================

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_NullThrows() {
        new Fraction(1, 2).multiply((Fraction) null);
    }

    @Test
    public void testMultiplyFraction_ThisNumeratorZero_ReturnsZeroConstant() {
        Fraction result = Fraction.ZERO.multiply(new Fraction(1, 2));
        assertSame(Fraction.ZERO, result);
    }

    @Test
    public void testMultiplyFraction_OtherNumeratorZero_ReturnsZeroConstant() {
        Fraction result = new Fraction(1, 2).multiply(Fraction.ZERO);
        assertSame(Fraction.ZERO, result);
    }

    @Test
    public void testMultiplyFraction_Normal() {
        Fraction result = new Fraction(2, 3).multiply(new Fraction(3, 4));
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiplyInt() {
        Fraction result = new Fraction(1, 3).multiply(2);
        assertEquals(2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    // =========================================================
    // divide(Fraction)
    // =========================================================

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_NullThrows() {
        new Fraction(1, 2).divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_ByZeroThrows() {
        new Fraction(1, 2).divide(Fraction.ZERO);
    }

    @Test
    public void testDivideFraction_Normal() {
        Fraction result = new Fraction(1, 2).divide(new Fraction(1, 4));
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    public void testDivideInt() {
        Fraction result = new Fraction(1, 2).divide(2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    // =========================================================
    // percentageValue()
    // =========================================================

    @Test
    public void testPercentageValue() {
        assertEquals(25.0, new Fraction(1, 4).percentageValue(), 1e-9);
    }

    // =========================================================
    // getReducedFraction()
    // =========================================================

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_ZeroDenominatorThrows() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_ZeroNumeratorReturnsZeroConstant() {
        assertSame(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFraction_MinValueDenominator_EvenNumerator_Halves() {
        // denominator==MIN_VALUE && numerator even -> halving branch taken
        Fraction f = Fraction.getReducedFraction(4, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(536870912, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_MinValueDenominator_OddNumerator_Throws() {
        // numerator odd -> skip halving -> denominator stays MIN_VALUE -> throws
        Fraction.getReducedFraction(3, Integer.MIN_VALUE);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_NumeratorMinValue_NegativeDenominator_Throws() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testGetReducedFraction_NegativeDenominatorFlipsSign() {
        Fraction f = Fraction.getReducedFraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_NormalReduction() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // =========================================================
    // toString()
    // =========================================================

    @Test
    public void testToString_DenominatorOne() {
        assertEquals("5", new Fraction(5, 1).toString());
    }

    @Test
    public void testToString_NumeratorZero() {
        assertEquals("0", new Fraction(0, 5).toString());
    }

    @Test
    public void testToString_GeneralCase() {
        assertEquals("3 / 4", new Fraction(3, 4).toString());
    }

    // =========================================================
    // getField()
    // =========================================================

    @Test
    public void testGetField_ReturnsFractionFieldInstance() {
        Fraction f = new Fraction(1, 2);
        assertNotNull(f.getField());
        assertTrue(f.getField() instanceof FractionField);
    }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDoubleConstructor_ExactInteger`, `_NegativeExactInteger` | `abs(a0-value)<epsilon` TRUE (diff=0) |
| `testDoubleConstructor_AlmostIntegerWithinEpsilon` | `abs(a0-value)<epsilon` TRUE (diff≠0) |
| `testDoubleConstructor_SimpleFractionViaLoop` | loop เข้า 1 รอบ, `n<maxIterations && diff>epsilon && q2<maxDenom` TRUE→FALSE (stop) |
| `testDoubleConstructor_LoopConvergesWithinMaxDenominator` | หลัง loop: `q2<maxDenominator` TRUE branch |
| `testDoubleConstructor_MaxDenominatorExceeded_FallbackToPreviousConvergent` | ใน loop: `q2<maxDenominator` FALSE (หยุด loop); หลัง loop: `q2<maxDenominator` FALSE branch (ใช้ p1/q1) |
| `testDoubleConstructor_MaxIterationsExceeded` | `n<maxIterations` FALSE ในเงื่อนไข continue; หลัง loop `n>=maxIterations` TRUE → throw |
| `testDoubleConstructor_InitialOverflow` | `abs(a0)>overflow` TRUE → throw ทันที |
| `testIntIntConstructor_ZeroDenominatorThrows` | `den==0` TRUE → throw |
| `testIntIntConstructor_NegativeDenominator_NumMinValueThrows` | `den<0` TRUE, `num==MIN_VALUE` TRUE → throw |
| `testIntIntConstructor_NegativeDenominator_DenMinValueThrows` | `den<0` TRUE, `den==MIN_VALUE` TRUE → throw |
| `testIntIntConstructor_NegativeDenominatorFlipsSign` | `den<0` TRUE (ไม่ overflow) → flip sign |
| `testIntIntConstructor_ReducesByGcd` | `d>1` TRUE → reduce |
| `testIntIntConstructor_AlreadyCoprime` | `d>1` FALSE → ไม่ reduce |
| `testAbs_PositiveNumeratorReturnsSameInstance` | `numerator>=0` TRUE |
| `testAbs_NegativeNumeratorReturnsNegated` | `numerator>=0` FALSE → negate() |
| `testCompareTo_*` | `nOd<dOn`, `nOd>dOn`, equal (3 branches) |
| `testEquals_SameReference` | `this==other` TRUE |
| `testEquals_EqualValueDifferentInstance` | `other instanceof Fraction` TRUE, values equal |
| `testEquals_DifferentValue` | `instanceof` TRUE, values ไม่เท่ากัน |
| `testEquals_Null`, `_DifferentType` | `instanceof` FALSE → return false |
| `testNegate_Normal` | `numerator==MIN_VALUE` FALSE |
| `testNegate_OverflowOnMinValueThrows` | `numerator==MIN_VALUE` TRUE → throw |
| `testReciprocal_OfZeroThrows` | สร้าง Fraction(den,0) → `den==0` throw ผ่าน reciprocal |
| `testAddFraction_NullThrows` | `fraction==null` TRUE → throw |
| `testAddFraction_ThisNumeratorZero_*` | `numerator==0` TRUE, `isAdd` TRUE |
| `testAddFraction_OtherNumeratorZero_*` | `fraction.numerator==0` TRUE → return this |
| `testAddFraction_CoprimeDenominators_D1Equals1` | `d1==1` TRUE branch |
| `testAddFraction_NonCoprimeDenominators_TmodD1NonZero` | `d1==1` FALSE (BigInteger), `tmodd1==0` FALSE |
| `testAddFraction_NonCoprimeDenominators_TmodD1Zero` | `d1==1` FALSE, `tmodd1==0` TRUE |
| `testSubtractFraction_*` | เหมือนกับ add แต่ `isAdd=false` (negate/subAndCheck path) |
| `testMultiplyFraction_NullThrows` | `fraction==null` TRUE |
| `testMultiplyFraction_ThisNumeratorZero_*`, `_OtherNumeratorZero_*` | `numerator==0 || fraction.numerator==0` TRUE |
| `testMultiplyFraction_Normal` | เงื่อนไข zero-check FALSE → full multiply |
| `testDivideFraction_NullThrows` | `fraction==null` TRUE |
| `testDivideFraction_ByZeroThrows` | `fraction.numerator==0` TRUE → throw |
| `testDivideFraction_Normal` | ผ่านทั้งสอง check → multiply(reciprocal) |
| `testGetReducedFraction_ZeroDenominatorThrows` | `denominator==0` TRUE |
| `testGetReducedFraction_ZeroNumeratorReturnsZeroConstant` | `numerator==0` TRUE |
| `testGetReducedFraction_MinValueDenominator_EvenNumerator_Halves` | `denominator==MIN_VALUE && (numerator&1)==0` TRUE |
| `testGetReducedFraction_MinValueDenominator_OddNumerator_Throws` | เงื่อนไขข้างบน FALSE, แต่ `denominator<0`+`denominator==MIN_VALUE` TRUE |
| `testGetReducedFraction_NumeratorMinValue_NegativeDenominator_Throws` | `denominator<0` TRUE, `numerator==MIN_VALUE` TRUE |
| `testGetReducedFraction_NegativeDenominatorFlipsSign` | `denominator<0` TRUE (ไม่ overflow) |
| `testGetReducedFraction_NormalReduction` | ไม่มีเงื่อนไขพิเศษใด TRUE → reduce ปกติ |
| `testToString_DenominatorOne` | `denominator==1` TRUE |
| `testToString_NumeratorZero` | `denominator==1` FALSE, `numerator==0` TRUE |
| `testToString_GeneralCase` | ทั้งสองเงื่อนไข FALSE → else branch |
| `testGetField_*` | เรียกใช้ getField() ปกติ |

**Branch ที่ไม่ได้ทดสอบ (ตามข้อกำหนดที่ 4 - ไม่เดา behavior):**
- Overflow ของ `p2`/`q2` ภายใน loop ของ private double-constructor (`FractionConversionException` throw กลางลูป) — ต้องใช้ค่าตัวเลขเฉพาะที่ซับซ้อนเกินกว่าจะยืนยันได้แน่ชัดโดยไม่ทดลองรันจริง
- `w.bitLength() > 31` ใน `addSub()` (BigInteger overflow) — ต้องสร้างกรณีตัวเลขเฉพาะที่ยืนยันไม่ได้จากการวิเคราะห์ source เพียงอย่างเดียว
- Branch `if (den < 0)` ตัวที่สองใน constructor `(int,int)` หลัง gcd-reduce — ดูเหมือนเป็น dead code เพราะ den ถูกบังคับให้เป็นบวกไปแล้วก่อนหน้า