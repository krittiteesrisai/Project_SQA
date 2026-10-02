package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;

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
    public void testGetFractionIntInt_overflow_numeratorMin() {
        Fraction.getFraction(Integer.MIN_VALUE, -5);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_overflow_denominatorMin() {
        Fraction.getFraction(5, Integer.MIN_VALUE);
    }

    // ===================== getFraction(whole, num, denom) =====================
    @Test
    public void testGetFractionWholeNumDenom_normalPositive() {
        Fraction f = Fraction.getFraction(1, 3, 5);
        assertEquals(8, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testGetFractionWholeNumDenom_negativeWhole() {
        Fraction f = Fraction.getFraction(-1, 3, 5);
        assertEquals(-8, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_zeroDenominator() {
        Fraction.getFraction(1, 2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeDenominator() {
        Fraction.getFraction(1, 2, -5);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeNumerator() {
        Fraction.getFraction(1, -2, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_overflow() {
        Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE, 2);
    }

    // ===================== getReducedFraction =====================
    @Test
    public void testGetReducedFraction_zeroNumerator() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_normal() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_negativeDenominator() {
        Fraction f = Fraction.getReducedFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowNegate() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -5);
    }

    @Test
    public void testGetReducedFraction_denominatorMinValueEvenNumerator() {
        // denominator == Integer.MIN_VALUE และ numerator เป็นเลขคู่ -> branch พิเศษ
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertTrue(f.getDenominator() > 0);
    }

    // ===================== getFraction(double) =====================
    @Test
    public void testGetFractionDouble_zero() {
        Fraction f = Fraction.getFraction(0.0d);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_simple() {
        Fraction f = Fraction.getFraction(0.5d);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_negative() {
        Fraction f = Fraction.getFraction(-0.25d);
        assertEquals(-1, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_wholeNumber() {
        Fraction f = Fraction.getFraction(2.0d);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_NaN() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_tooLarge() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1.0d);
    }

    // ===================== getFraction(String) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionString_null() {
        Fraction.getFraction((String) null);
    }

    @Test
    public void testGetFractionString_doubleFormat() {
        Fraction f = Fraction.getFraction("0.5");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeNumeratorDenominator() {
        Fraction f = Fraction.getFraction("1 3/5");
        assertEquals(8, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_wholeFormatMissingSlash() {
        Fraction.getFraction("1 3");
    }

    @Test
    public void testGetFractionString_simpleFraction() {
        Fraction f = Fraction.getFraction("3/5");
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeNumber() {
        Fraction f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_malformed() {
        Fraction.getFraction("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_empty() {
        Fraction.getFraction(""); // edge case: ว่าง -> NumberFormatException จาก Integer.parseInt
    }

    // ===================== Accessors =====================
    @Test
    public void testGetNumeratorDenominator() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(7, f.getNumerator());
        assertEquals(4, f.getDenominator());
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

    // ===================== reduce() =====================
    @Test
    public void testReduce_zeroNumeratorNotZeroFraction() {
        Fraction f = Fraction.getFraction(0, 5);
        assertSame(Fraction.ZERO, f.reduce());
    }

    @Test
    public void testReduce_equalsZero() {
        assertSame(Fraction.ZERO, Fraction.ZERO.reduce());
    }

    @Test
    public void testReduce_gcdOne() {
        Fraction f = Fraction.getFraction(3, 5);
        assertSame(f, f.reduce());
    }

    @Test
    public void testReduce_gcdNotOne() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction r = f.reduce();
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    // ===================== invert() =====================
    @Test(expected = ArithmeticException.class)
    public void testInvert_zeroNumerator() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_minValueNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
    }

    @Test
    public void testInvert_negativeNumerator() {
        Fraction inv = Fraction.getFraction(-3, 5).invert();
        assertEquals(-5, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    @Test
    public void testInvert_positiveNumerator() {
        Fraction inv = Fraction.getFraction(3, 5).invert();
        assertEquals(5, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    // ===================== negate() =====================
    @Test(expected = ArithmeticException.class)
    public void testNegate_minValue() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testNegate_normal() {
        Fraction n = Fraction.getFraction(3, 5).negate();
        assertEquals(-3, n.getNumerator());
        assertEquals(5, n.getDenominator());
    }

    // ===================== abs() =====================
    @Test
    public void testAbs_positive() {
        Fraction f = Fraction.getFraction(3, 5);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative() {
        Fraction a = Fraction.getFraction(-3, 5).abs();
        assertEquals(3, a.getNumerator());
        assertEquals(5, a.getDenominator());
    }

    // ===================== pow() =====================
    @Test
    public void testPow_one() {
        Fraction f = Fraction.getFraction(3, 5);
        assertSame(f, f.pow(1));
    }

    @Test
    public void testPow_zero() {
        assertSame(Fraction.ONE, Fraction.getFraction(3, 5).pow(0));
    }

    @Test
    public void testPow_negative() {
        Fraction r = Fraction.getFraction(2, 3).pow(-2);
        assertEquals(9, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testPow_negativeMinValue() {
        // power == Integer.MIN_VALUE -> branch พิเศษ, คาด overflow จาก squaring ซ้ำจำนวนมาก
        Fraction.getFraction(2, 1).pow(Integer.MIN_VALUE);
    }

    @Test
    public void testPow_positiveEven() {
        Fraction r = Fraction.getFraction(2, 1).pow(4);
        assertEquals(16, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }

    @Test
    public void testPow_positiveOdd() {
        Fraction r = Fraction.getFraction(2, 1).pow(3);
        assertEquals(8, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }

    // ===================== add / subtract (addSub) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_null() {
        Fraction.ONE.add(null);
    }

    @Test
    public void testAdd_thisZero() {
        Fraction r = Fraction.ZERO.add(Fraction.getFraction(1, 3));
        assertEquals(1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testAdd_otherZero() {
        Fraction f = Fraction.getFraction(1, 3);
        assertSame(f, f.add(Fraction.ZERO));
    }

    @Test
    public void testAdd_gcdOne() {
        Fraction r = Fraction.getFraction(1, 2).add(Fraction.getFraction(1, 3));
        assertEquals(5, r.getNumerator());
        assertEquals(6, r.getDenominator());
    }

    @Test
    public void testAdd_gcdNotOne() {
        Fraction r = Fraction.getFraction(1, 4).add(Fraction.getFraction(1, 6));
        assertEquals(5, r.getNumerator());
        assertEquals(12, r.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_null() {
        Fraction.ONE.subtract(null);
    }

    @Test
    public void testSubtract_thisZero() {
        Fraction r = Fraction.ZERO.subtract(Fraction.getFraction(1, 3));
        assertEquals(-1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testSubtract_otherZero() {
        Fraction f = Fraction.getFraction(1, 3);
        assertSame(f, f.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtract_normal() {
        Fraction r = Fraction.getFraction(1, 2).subtract(Fraction.getFraction(1, 3));
        assertEquals(1, r.getNumerator());
        assertEquals(6, r.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testAddSub_overflowBitLength() {
        // เลือกค่าให้ d1 != 1 (เข้า BigInteger branch) และผลลัพธ์ w.bitLength() > 31
        Fraction a = Fraction.getFraction(Integer.MAX_VALUE - 1, 4);
        Fraction b = Fraction.getFraction(Integer.MAX_VALUE - 3, 6);
        a.add(b);
    }

    // ===================== multiplyBy =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_null() {
        Fraction.ONE.multiplyBy(null);
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
        Fraction r = Fraction.getFraction(2, 3).multiplyBy(Fraction.getFraction(3, 4));
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    // ===================== divideBy =====================
    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_null() {
        Fraction.ONE.divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_zero() {
        Fraction.ONE.divideBy(Fraction.ZERO);
    }

    @Test
    public void testDivideBy_normal() {
        Fraction r = Fraction.getFraction(1, 2).divideBy(Fraction.getFraction(1, 3));
        assertEquals(3, r.getNumerator());
        assertEquals(2, r.getDenominator());
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
    public void testEquals_null() {
        assertFalse(Fraction.getFraction(1, 2).equals(null));
    }

    @Test
    public void testEquals_sameValues() {
        assertTrue(Fraction.getFraction(1, 2).equals(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testEquals_differentValues() {
        // 1/2 != 2/4 เพราะ equals ไม่ reduce
        assertFalse(Fraction.getFraction(1, 2).equals(Fraction.getFraction(2, 4)));
    }

    // ===================== hashCode =====================
    @Test
    public void testHashCode_consistent() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(f.hashCode(), f.hashCode()); // cache branch ถูกเรียกครั้งที่ 2
    }

    @Test
    public void testHashCode_equalObjectsSameHash() {
        Fraction f1 = Fraction.getFraction(3, 7);
        Fraction f2 = Fraction.getFraction(3, 7);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ===================== compareTo =====================
    @Test
    public void testCompareTo_sameInstance() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0, f.compareTo(f));
    }

    @Test
    public void testCompareTo_equalNumeratorDenominator() {
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(1, 2)));
    }

    @Test
    public void testCompareTo_equalValueDifferentRepresentation() {
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(2, 4)));
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
        Fraction.ONE.compareTo(null);
    }

    // ===================== toString =====================
    @Test
    public void testToString_cachedAndFormat() {
        Fraction f = Fraction.getFraction(3, 5);
        String s1 = f.toString();
        String s2 = f.toString();
        assertEquals("3/5", s1);
        assertSame(s1, s2); // ตรวจ cache
    }

    @Test
    public void testToString_negative() {
        assertEquals("-3/5", Fraction.getFraction(-3, 5).toString());
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
    public void testToProperString_numeratorNegativeDenominator() {
        assertEquals("-1", Fraction.getFraction(-5, 5).toProperString());
    }

    @Test
    public void testToProperString_properFractionWithWholeAndNumerator() {
        assertEquals("1 3/4", Fraction.getFraction(7, 4).toProperString());
    }

    @Test
    public void testToProperString_properFractionWholeOnly() {
        // properNumerator == 0 แต่ numerator != denominator
        assertEquals("2", Fraction.getFraction(8, 4).toProperString());
    }

    @Test
    public void testToProperString_elseBranch_smallMagnitude() {
        // |numerator| < |denominator| -> magnitude check เป็น false -> else branch
        assertEquals("3/5", Fraction.getFraction(3, 5).toProperString());
    }

    @Test
    public void testToProperString_cached() {
        Fraction f = Fraction.getFraction(7, 4);
        String s1 = f.toProperString();
        String s2 = f.toProperString();
        assertSame(s1, s2);
    }

    @Test
    public void testToProperString_negativeImproperFraction() {
        assertEquals("-1 3/4", Fraction.getFraction(-7, 4).toProperString());
    }
}
