# JUnit 4 Test Suite สำหรับ `Fraction` (Lang-49b)

```java
package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    // ===================== getFraction(int, int) =====================
    @Test
    public void testGetFractionIntInt_normal() {
        Fraction f = Fraction.getFraction(3, 5);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_zeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test
    public void testGetFractionIntInt_negativeDenominator() {
        Fraction f = Fraction.getFraction(3, -5);
        assertEquals(-3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_overflowNumeratorMin() {
        Fraction.getFraction(Integer.MIN_VALUE, -5);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_overflowDenominatorMin() {
        Fraction.getFraction(5, Integer.MIN_VALUE);
    }

    // ===================== getFraction(int, int, int) =====================
    @Test
    public void testGetFractionWholeNumDenom_normal() {
        Fraction f = Fraction.getFraction(1, 2, 3);
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_zeroDenom() {
        Fraction.getFraction(1, 2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeDenom() {
        Fraction.getFraction(1, 2, -3);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeNumerator() {
        Fraction.getFraction(1, -2, 3);
    }

    @Test
    public void testGetFractionWholeNumDenom_negativeWhole() {
        Fraction f = Fraction.getFraction(-1, 2, 3);
        assertEquals(-5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_overflow() {
        Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
    }

    // ===================== getReducedFraction =====================
    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenom() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_zeroNumerator() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f);
    }

    @Test
    public void testGetReducedFraction_minValueDenomEvenNumerator() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_negativeDenominator() {
        Fraction f = Fraction.getReducedFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowNegate() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -2);
    }

    @Test
    public void testGetReducedFraction_simplify() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // ===================== getFraction(double) =====================
    @Test
    public void testGetFractionDouble_zero() {
        Fraction f = Fraction.getFraction(0.0d);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_half() {
        Fraction f = Fraction.getFraction(0.5d);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_negative() {
        Fraction f = Fraction.getFraction(-0.5d);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_NaN() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_tooLarge() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1.0d);
    }

    @Test
    public void testGetFractionDouble_wholeNumber() {
        Fraction f = Fraction.getFraction(5.0d);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // ===================== getFraction(String) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionString_null() {
        Fraction.getFraction((String) null);
    }

    @Test
    public void testGetFractionString_double() {
        Fraction f = Fraction.getFraction("0.5");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeNumSlashDenom() {
        Fraction f = Fraction.getFraction("1 2/3");
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_wholeSpaceNoSlash() {
        Fraction.getFraction("1 2");
    }

    @Test
    public void testGetFractionString_simpleFraction() {
        Fraction f = Fraction.getFraction("2/3");
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeNumberOnly() {
        Fraction f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_malformed() {
        Fraction.getFraction("abc");
    }

    // ===================== Accessors =====================
    @Test
    public void testGetNumeratorDenominator() {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetProperNumerator_positive() {
        assertEquals(3, Fraction.getFraction(7, 4).getProperNumerator());
    }

    @Test
    public void testGetProperNumerator_negative() {
        assertEquals(3, Fraction.getFraction(-7, 4).getProperNumerator());
    }

    @Test
    public void testGetProperWhole_positive() {
        assertEquals(1, Fraction.getFraction(7, 4).getProperWhole());
    }

    @Test
    public void testGetProperWhole_negative() {
        assertEquals(-1, Fraction.getFraction(-7, 4).getProperWhole());
    }

    // ===================== Number methods =====================
    @Test
    public void testIntValue() {
        assertEquals(1, Fraction.getFraction(7, 4).intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(1L, Fraction.getFraction(7, 4).longValue());
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.5f, Fraction.getFraction(1, 2).floatValue(), 0.0001f);
    }

    @Test
    public void testDoubleValue() {
        assertEquals(0.5d, Fraction.getFraction(1, 2).doubleValue(), 0.0001d);
    }

    // ===================== reduce =====================
    @Test
    public void testReduce_gcdOne_returnsSameInstance() {
        Fraction f = Fraction.getFraction(3, 7);
        assertSame(f, f.reduce());
    }

    @Test
    public void testReduce_simplifies() {
        Fraction r = Fraction.getFraction(4, 8).reduce();
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    @Test
    public void testReduce_zeroNumerator() {
        Fraction r = Fraction.getFraction(0, 5).reduce();
        assertEquals(0, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }

    // ===================== invert =====================
    @Test(expected = ArithmeticException.class)
    public void testInvert_zeroNumerator() {
        Fraction.getFraction(0, 5).invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_minValueNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
    }

    @Test
    public void testInvert_negativeNumerator() {
        Fraction inv = Fraction.getFraction(-3, 7).invert();
        assertEquals(-7, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    @Test
    public void testInvert_positiveNumerator() {
        Fraction inv = Fraction.getFraction(3, 7).invert();
        assertEquals(7, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    // ===================== negate =====================
    @Test(expected = ArithmeticException.class)
    public void testNegate_minValue() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testNegate_normal() {
        assertEquals(-3, Fraction.getFraction(3, 7).negate().getNumerator());
    }

    // ===================== abs =====================
    @Test
    public void testAbs_positive_returnsThis() {
        Fraction f = Fraction.getFraction(3, 7);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative() {
        assertEquals(3, Fraction.getFraction(-3, 7).abs().getNumerator());
    }

    // ===================== pow =====================
    @Test
    public void testPow_one() {
        Fraction f = Fraction.getFraction(3, 7);
        assertSame(f, f.pow(1));
    }

    @Test
    public void testPow_zero() {
        assertSame(Fraction.ONE, Fraction.getFraction(3, 7).pow(0));
    }

    @Test
    public void testPow_negative() {
        Fraction r = Fraction.getFraction(2, 3).pow(-2);
        assertEquals(9, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test
    public void testPow_negativeMinValue() {
        // ใช้ ONE เพื่อหลีกเลี่ยง overflow จริงจากการยกกำลังซ้ำจำนวนมาก
        // (คลุม branch power == Integer.MIN_VALUE)
        Fraction r = Fraction.ONE.pow(Integer.MIN_VALUE);
        assertEquals(1, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }

    @Test
    public void testPow_positiveEven() {
        Fraction r = Fraction.getFraction(2, 3).pow(2);
        assertEquals(4, r.getNumerator());
        assertEquals(9, r.getDenominator());
    }

    @Test
    public void testPow_positiveOdd() {
        Fraction r = Fraction.getFraction(2, 3).pow(3);
        assertEquals(8, r.getNumerator());
        assertEquals(27, r.getDenominator());
    }

    // ===================== add / subtract (addSub) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_null() {
        Fraction.getFraction(1, 2).add(null);
    }

    @Test
    public void testAdd_thisZero() {
        Fraction f = Fraction.ZERO.add(Fraction.getFraction(1, 3));
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testAdd_otherZero() {
        Fraction base = Fraction.getFraction(1, 3);
        assertSame(base, base.add(Fraction.ZERO));
    }

    @Test
    public void testAdd_d1EqualsOne() {
        Fraction f = Fraction.getFraction(1, 2).add(Fraction.getFraction(1, 3));
        assertEquals(5, f.getNumerator());
        assertEquals(6, f.getDenominator());
    }

    @Test
    public void testAdd_d1NotOne() {
        Fraction f = Fraction.getFraction(1, 4).add(Fraction.getFraction(1, 6));
        assertEquals(5, f.getNumerator());
        assertEquals(12, f.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_null() {
        Fraction.getFraction(1, 2).subtract(null);
    }

    @Test
    public void testSubtract_otherZero() {
        Fraction base = Fraction.getFraction(1, 3);
        assertSame(base, base.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtract_thisZero() {
        Fraction f = Fraction.ZERO.subtract(Fraction.getFraction(1, 3));
        assertEquals(-1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testSubtract_normal() {
        Fraction f = Fraction.getFraction(1, 2).subtract(Fraction.getFraction(1, 3));
        assertEquals(1, f.getNumerator());
        assertEquals(6, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_overflow() {
        Fraction big = Fraction.getFraction(Integer.MAX_VALUE, 1);
        big.add(Fraction.getFraction(1, 1));
    }

    // ===================== multiplyBy =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_null() {
        Fraction.getFraction(1, 2).multiplyBy(null);
    }

    @Test
    public void testMultiplyBy_thisZero() {
        assertSame(Fraction.ZERO, Fraction.ZERO.multiplyBy(Fraction.getFraction(2, 3)));
    }

    @Test
    public void testMultiplyBy_otherZero() {
        assertSame(Fraction.ZERO, Fraction.getFraction(2, 3).multiplyBy(Fraction.ZERO));
    }

    @Test
    public void testMultiplyBy_normal() {
        Fraction f = Fraction.getFraction(2, 3).multiplyBy(Fraction.getFraction(3, 4));
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // ===================== divideBy =====================
    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_null() {
        Fraction.getFraction(1, 2).divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_zero() {
        Fraction.getFraction(1, 2).divideBy(Fraction.ZERO);
    }

    @Test
    public void testDivideBy_normal() {
        Fraction f = Fraction.getFraction(1, 2).divideBy(Fraction.getFraction(1, 3));
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // ===================== equals =====================
    @Test
    public void testEquals_sameInstance() {
        Fraction f = Fraction.getFraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_notFractionInstance() {
        assertFalse(Fraction.getFraction(1, 2).equals("not a fraction"));
    }

    @Test
    public void testEquals_differentValues() {
        assertFalse(Fraction.getFraction(1, 2).equals(Fraction.getFraction(1, 3)));
    }

    @Test
    public void testEquals_sameValues() {
        assertTrue(Fraction.getFraction(1, 2).equals(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testEquals_notEqualReducedDifferent() {
        // 2/4 != 1/2 ตาม equals() (ไม่ reduce ก่อนเทียบ)
        assertFalse(Fraction.getFraction(2, 4).equals(Fraction.getFraction(1, 2)));
    }

    // ===================== hashCode =====================
    @Test
    public void testHashCode_consistency() {
        Fraction f = Fraction.getFraction(3, 7);
        int h1 = f.hashCode();
        int h2 = f.hashCode(); // branch cache (hashCode != 0)
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_equalObjectsSameHash() {
        assertEquals(Fraction.getFraction(3, 7).hashCode(),
                     Fraction.getFraction(3, 7).hashCode());
    }

    // ===================== compareTo =====================
    @Test
    public void testCompareTo_sameInstance() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0, f.compareTo(f));
    }

    @Test
    public void testCompareTo_equalValues() {
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testCompareTo_equalDifferentRepresentation() {
        assertEquals(0, Fraction.getFraction(2, 4).compareTo(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testCompareTo_less() {
        assertEquals(-1, Fraction.getFraction(1, 3).compareTo(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testCompareTo_greater() {
        assertEquals(1, Fraction.getFraction(2, 3).compareTo(Fraction.getFraction(1, 2)));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null() {
        // ไม่ได้ null-check ชัดเจนในซอร์ส แต่จะเกิด NPE จากการ cast/field access
        Fraction.getFraction(1, 2).compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_notFraction() {
        Fraction.getFraction(1, 2).compareTo("not a fraction");
    }

    // ===================== toString =====================
    @Test
    public void testToString_format() {
        assertEquals("3/7", Fraction.getFraction(3, 7).toString());
    }

    @Test
    public void testToString_cached() {
        Fraction f = Fraction.getFraction(3, 7);
        String s1 = f.toString();
        String s2 = f.toString(); // cached branch
        assertSame(s1, s2);
    }

    // ===================== toProperString =====================
    @Test
    public void testToProperString_zeroNumerator() {
        assertEquals("0", Fraction.getFraction(0, 5).toProperString());
    }

    @Test
    public void testToProperString_numeratorEqualsDenominator() {
        assertEquals("1", Fraction.getFraction(5, 5).toProperString());
    }

    @Test
    public void testToProperString_numeratorEqualsNegativeDenominator() {
        assertEquals("-1", Fraction.getFraction(-5, 5).toProperString());
    }

    @Test
    public void testToProperString_properNumeratorZero() {
        assertEquals("2", Fraction.getFraction(10, 5).toProperString());
    }

    @Test
    public void testToProperString_normalImproperFraction() {
        assertEquals("1 3/4", Fraction.getFraction(7, 4).toProperString());
    }

    @Test
    public void testToProperString_negativeImproperFraction() {
        assertEquals("-1 3/4", Fraction.getFraction(-7, 4).toProperString());
    }

    @Test
    public void testToProperString_fallbackElseBranch() {
        // |numerator| < |denominator| ไม่เข้าเงื่อนไขพิเศษใดๆ -> else branch (numer/denom)
        assertEquals("3/7", Fraction.getFraction(3, 7).toProperString());
    }

    @Test
    public void testToProperString_cached() {
        Fraction f = Fraction.getFraction(3, 7);
        String s1 = f.toProperString();
        String s2 = f.toProperString(); // cached branch
        assertSame(s1, s2);
    }

    // ===================== constants sanity =====================
    @Test
    public void testConstants() {
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(1, Fraction.ZERO.getDenominator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(1, Fraction.ONE.getDenominator());
        assertEquals(1, Fraction.ONE_HALF.getNumerator());
        assertEquals(2, Fraction.ONE_HALF.getDenominator());
    }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอด | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `getFraction(int,int)` | testGetFractionIntInt_* | denominator==0; denominator<0; numerator/denominator==MIN_VALUE overflow; normal path |
| `getFraction(int,int,int)` | testGetFractionWholeNumDenom_* | denom==0; denom<0; numerator<0; whole<0/whole>=0; overflow numeratorValue |
| `getReducedFraction` | testGetReducedFraction_* | denom==0; numerator==0; denom==MIN_VALUE&&even; denom<0; overflow negate; gcd simplify |
| `getFraction(double)` | testGetFractionDouble_* | value<0 sign; value>MAX/NaN throw; wholeNumber!=0; loop converge (0, 0.5, -0.5, 5.0) |
| `getFraction(String)` | testGetFractionString_* | str==null; dot format(pos>=0); space format(pos>0) ไม่มี '/'→throw / มี '/'→parse; ไม่มี space, ไม่มี '/'→whole number; มี '/'→Y/Z; malformed→NFE |
| Accessors | testGetProperNumerator/Whole_* | positive/negative numerator |
| Number methods | testIntValue/LongValue/FloatValue/DoubleValue | ค่าปกติ (ไม่มี branch, กัน regression) |
| `reduce` | testReduce_* | gcd==1 (return this); gcd!=1 simplify; numerator==0 |
| `invert` | testInvert_* | numerator==0 throw; numerator==MIN_VALUE throw; numerator<0; numerator>0 |
| `negate` | testNegate_* | numerator==MIN_VALUE throw; normal |
| `abs` | testAbs_* | numerator>=0 (return this); numerator<0 (negate) |
| `pow` | testPow_* | power==1; power==0; power<0 (normal & MIN_VALUE special); power>0 even/odd |
| `add`/`subtract`(`addSub`) | testAdd_*/testSubtract_* | fraction==null; this.numerator==0; fraction.numerator==0; d1==1; d1!=1 (BigInteger path); overflow (addAndCheck) |
| `multiplyBy` | testMultiplyBy_* | fraction==null; numerator==0 || fraction.numerator==0; normal reduce path |
| `divideBy` | testDivideBy_* | fraction==null; fraction.numerator==0 throw; normal (delegates multiplyBy+invert) |
| `equals` | testEquals_* | obj==this; !(obj instanceof Fraction); field mismatch; field match; non-reduced inequality |
| `hashCode` | testHashCode_* | hashCode==0 (first calc) + cached call; equal objects same hash |
| `compareTo` | testCompareTo_* | this==other; numerator&denominator equal; cross-multiply equal/less/greater; null→NPE; non-Fraction→CCE |
| `toString` | testToString_* | toString==null (first build) + cached branch |
| `toProperString` | testToProperString_* | numerator==0; numerator==denominator; numerator==-denominator; magnitude check true (properNumerator==0 / !=0); magnitude check false (else branch); cached branch |

**หมายเหตุ:**
- บางพฤติกรรมของ `getFraction(double)` (continued fraction algorithm) มีความซับซ้อนสูงและมีรายงานบั๊กใน Defects4J Lang-49 จึงเลือกทดสอบด้วยค่าง่าย ๆ ที่ตรวจสอบผลลัพธ์ได้แน่ชัดจากการไล่ trace ด้วยมือ ไม่ได้ทดสอบทุก edge case ของ loop (i==25 throw) เนื่องจากต้องหาค่า double ที่ทำให้ algorithm ไม่ converge จริง ซึ่งไม่ได้ระบุไว้ชัดในสเปค จึงไม่ได้เขียนเทสสำหรับ branch นี้เพื่อไม่เดา behavior
- `compareTo(null)` ไม่มี null-check ชัดเจนในซอร์ส แต่คาดว่าจะเกิด `NullPointerException` จากการเข้าถึง field ของ `other` — ทดสอบไว้เพื่อยืนยัน behavior จริงของ JVM
- test `testPow_negativeMinValue` เลือกใช้ `Fraction.ONE` แทนเศษส่วนอื่น เพื่อป้องกัน `ArithmeticException` จาก overflow ที่จะเกิดขึ้นจริงหากใช้เศษส่วนที่มีค่ามากกว่า 1 (เนื่องจากการยกกำลังซ้ำจำนวนมากจาก `-(power/2)` ที่มีค่าสูงมาก)