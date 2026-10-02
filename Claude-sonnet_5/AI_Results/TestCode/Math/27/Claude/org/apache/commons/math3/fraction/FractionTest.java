package org.apache.commons.math3.fraction;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

/**
 * Unit tests for {@link Fraction}.
 * เน้น branch/condition coverage ของทุก public/private method ที่เข้าถึงได้ผ่าน public API
 */
public class FractionTest {

    // ---------------------------------------------------------------
    // Constructor: Fraction(int num, int den)
    // ---------------------------------------------------------------

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructor_zeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructor_negativeDenominator_numeratorMinValue() {
        // den < 0 && num == Integer.MIN_VALUE -> overflow
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructor_negativeDenominator_denMinValue() {
        // den < 0 && den == Integer.MIN_VALUE -> overflow
        new Fraction(5, Integer.MIN_VALUE);
    }

    @Test
    public void testIntConstructor_negativeDenominator_normalFlip() {
        Fraction f = new Fraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testIntConstructor_reductionWithGcdGreaterThanOne() {
        Fraction f = new Fraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testIntConstructor_negativeNumeratorReduction() {
        Fraction f = new Fraction(-4, 8);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testIntConstructor_alreadyReduced_gcdEqualsOne() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testIntConstructor_boundaryMaxValue() {
        Fraction f = new Fraction(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // หมายเหตุ: บรานช์ที่สอง "if (den < 0)" (move sign to numerator) หลังการลดรูป
    // ดูเหมือนจะ unreachable ผ่าน public API ปกติ เพราะ den จะถูกบังคับให้เป็นบวก
    // ก่อนถึงขั้นตอน gcd แล้ว และ gcd() คืนค่าไม่เป็นลบ -> ไม่ได้เขียนเทสแยกสำหรับบรานช์นี้

    @Test
    public void testIntConstructor_singleArgDelegates() {
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // ---------------------------------------------------------------
    // Constructor: Fraction(double ...) / private continued-fraction ctor
    // ---------------------------------------------------------------

    @Test
    public void testDoubleConstructor_almostIntegerBranch() throws FractionConversionException {
        Fraction f = new Fraction(5.0);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_normalIterationConvergence() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_negativeFractional() throws FractionConversionException {
        Fraction f = new Fraction(-0.75);
        assertEquals(-0.75, f.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleConstructor_oneThirdWithTightEpsilon() throws FractionConversionException {
        Fraction f = new Fraction(1.0 / 3.0, 1.0e-12, 1000);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_a0OverflowBranch() throws FractionConversionException {
        // value มากเกินจน floor(value) > Integer.MAX_VALUE
        new Fraction(1.0e10, 1.0e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_maxIterationsExceeded() throws FractionConversionException {
        // epsilon เล็กมาก + maxIterations=1 -> n>=maxIterations ต้อง throw
        new Fraction(Math.PI, 1.0e-12, 1);
    }

    @Test
    public void testDoubleConstructor_maxDenominatorElseBranch() throws FractionConversionException {
        // maxDenominator เล็ก -> ทดสอบ branch q2>=maxDenominator (else: ใช้ p1,q1)
        Fraction f = new Fraction(Math.PI, 10);
        assertTrue(f.getDenominator() <= 10);
        assertTrue(f.getDenominator() > 0);
    }

    // ---------------------------------------------------------------
    // abs()
    // ---------------------------------------------------------------

    @Test
    public void testAbs_positiveNumerator_returnsSameInstance() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negativeNumerator_returnsNegated() {
        Fraction f = new Fraction(-3, 4);
        Fraction r = f.abs();
        assertEquals(3, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    // ---------------------------------------------------------------
    // compareTo()
    // ---------------------------------------------------------------

    @Test
    public void testCompareTo_equal() {
        assertEquals(0, new Fraction(1, 2).compareTo(new Fraction(2, 4)));
    }

    @Test
    public void testCompareTo_lessThan() {
        assertEquals(-1, new Fraction(1, 3).compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testCompareTo_greaterThan() {
        assertEquals(1, new Fraction(2, 3).compareTo(new Fraction(1, 2)));
    }

    // ---------------------------------------------------------------
    // doubleValue / floatValue / intValue / longValue
    // ---------------------------------------------------------------

    @Test
    public void testNumericConversions() {
        Fraction f = new Fraction(7, 2); // 3.5
        assertEquals(3.5, f.doubleValue(), 0.0);
        assertEquals(3.5f, f.floatValue(), 0.0f);
        assertEquals(3, f.intValue());
        assertEquals(3L, f.longValue());
    }

    // ---------------------------------------------------------------
    // equals() / hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameReference() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_equalValues() {
        assertTrue(new Fraction(1, 2).equals(new Fraction(1, 2)));
    }

    @Test
    public void testEquals_differentValues() {
        assertFalse(new Fraction(1, 2).equals(new Fraction(1, 3)));
    }

    @Test
    public void testEquals_notAFractionInstance() {
        assertFalse(new Fraction(1, 2).equals("1/2"));
    }

    @Test
    public void testEquals_null() {
        assertFalse(new Fraction(1, 2).equals(null));
    }

    @Test
    public void testHashCode_matchesFormula() {
        Fraction f = new Fraction(3, 4);
        int expected = 37 * (37 * 17 + 3) + 4;
        assertEquals(expected, f.hashCode());
    }

    @Test
    public void testHashCode_equalObjectsSameHash() {
        assertEquals(new Fraction(1, 2).hashCode(), new Fraction(2, 4).hashCode());
    }

    // ---------------------------------------------------------------
    // getNumerator / getDenominator
    // ---------------------------------------------------------------

    @Test
    public void testGetters() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    // ---------------------------------------------------------------
    // negate()
    // ---------------------------------------------------------------

    @Test
    public void testNegate_normal() {
        Fraction f = new Fraction(3, 4).negate();
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_overflowAtMinValue() {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    // ---------------------------------------------------------------
    // reciprocal()
    // ---------------------------------------------------------------

    @Test
    public void testReciprocal_normal() {
        Fraction f = new Fraction(3, 4).reciprocal();
        assertEquals(4, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_ofZero_throwsBecauseDenominatorZero() {
        Fraction.ZERO.reciprocal();
    }

    // ---------------------------------------------------------------
    // add(Fraction) / addSub branches
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_null() {
        new Fraction(1, 2).add((Fraction) null);
    }

    @Test
    public void testAddFraction_thisIsZero_isAddTrue() {
        Fraction r = Fraction.ZERO.add(new Fraction(1, 2));
        assertEquals(new Fraction(1, 2), r);
    }

    @Test
    public void testAddFraction_otherIsZero() {
        Fraction half = new Fraction(1, 2);
        assertEquals(half, half.add(Fraction.ZERO));
    }

    @Test
    public void testAddFraction_gcdOne_directIntPath() {
        Fraction r = new Fraction(1, 2).add(new Fraction(1, 3));
        assertEquals(new Fraction(5, 6), r);
    }

    @Test
    public void testAddFraction_gcdGreaterThanOne_bigIntegerPath() {
        Fraction r = new Fraction(1, 4).add(new Fraction(1, 6));
        assertEquals(new Fraction(5, 12), r);
    }

    @Test
    public void testAddInt() {
        Fraction r = new Fraction(1, 2).add(1);
        assertEquals(new Fraction(3, 2), r);
    }

    // ---------------------------------------------------------------
    // subtract(Fraction) / addSub(isAdd=false) branches
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_null() {
        new Fraction(1, 2).subtract((Fraction) null);
    }

    @Test
    public void testSubtractFraction_thisIsZero_isAddFalse() {
        Fraction r = Fraction.ZERO.subtract(new Fraction(1, 2));
        assertEquals(new Fraction(-1, 2), r);
    }

    @Test
    public void testSubtractFraction_otherIsZero() {
        Fraction half = new Fraction(1, 2);
        assertEquals(half, half.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtractFraction_gcdOne_directIntPath() {
        Fraction r = new Fraction(1, 2).subtract(new Fraction(1, 3));
        assertEquals(new Fraction(1, 6), r);
    }

    @Test
    public void testSubtractFraction_gcdGreaterThanOne_bigIntegerPath() {
        Fraction r = new Fraction(1, 4).subtract(new Fraction(1, 6));
        assertEquals(new Fraction(1, 12), r);
    }

    @Test
    public void testSubtractInt() {
        Fraction r = new Fraction(1, 2).subtract(1);
        assertEquals(new Fraction(-1, 2), r);
    }

    // ---------------------------------------------------------------
    // multiply(Fraction) / multiply(int)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_null() {
        new Fraction(1, 2).multiply((Fraction) null);
    }

    @Test
    public void testMultiplyFraction_thisNumeratorZero() {
        Fraction r = Fraction.ZERO.multiply(new Fraction(1, 2));
        assertEquals(Fraction.ZERO, r);
    }

    @Test
    public void testMultiplyFraction_otherNumeratorZero() {
        Fraction r = new Fraction(1, 2).multiply(Fraction.ZERO);
        assertEquals(Fraction.ZERO, r);
    }

    @Test
    public void testMultiplyFraction_normal() {
        Fraction r = new Fraction(2, 3).multiply(new Fraction(3, 4));
        assertEquals(new Fraction(1, 2), r);
    }

    @Test
    public void testMultiplyInt() {
        Fraction r = new Fraction(1, 2).multiply(3);
        assertEquals(new Fraction(3, 2), r);
    }

    // ---------------------------------------------------------------
    // divide(Fraction) / divide(int)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_null() {
        new Fraction(1, 2).divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_byZeroFraction() {
        new Fraction(1, 2).divide(Fraction.ZERO);
    }

    @Test
    public void testDivideFraction_normal() {
        Fraction r = new Fraction(1, 2).divide(new Fraction(1, 4));
        assertEquals(new Fraction(2, 1), r);
    }

    @Test
    public void testDivideInt_normal() {
        Fraction r = new Fraction(1, 2).divide(2);
        assertEquals(new Fraction(1, 4), r);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideInt_byZero() {
        new Fraction(1, 2).divide(0);
    }

    // ---------------------------------------------------------------
    // percentageValue()
    // ---------------------------------------------------------------

    @Test
    public void testPercentageValue() {
        assertEquals(25.0, new Fraction(1, 4).percentageValue(), 0.0);
    }

    // ---------------------------------------------------------------
    // getReducedFraction()
    // ---------------------------------------------------------------

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_numeratorZero() {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFraction_denominatorMinValue_evenNumerator() {
        // denominator == Integer.MIN_VALUE && numerator even -> halving branch
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator()); // 2^30
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_overflow_numeratorMinValue() {
        // denominator < 0 (ไม่ใช่ MIN_VALUE) แต่ numerator == MIN_VALUE -> overflow
        Fraction.getReducedFraction(Integer.MIN_VALUE, -5);
    }

    @Test
    public void testGetReducedFraction_negativeDenominatorNormalFlip() {
        Fraction f = Fraction.getReducedFraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_normalReduction() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_denominatorOne() {
        assertEquals("5", new Fraction(5, 1).toString());
    }

    @Test
    public void testToString_zeroValue() {
        // ZERO = Fraction(0,1) -> denominator==1 branch จะถูกเลือกก่อน numerator==0 branch
        assertEquals("0", Fraction.ZERO.toString());
    }

    // หมายเหตุ: branch "else if (numerator == 0)" ใน toString() ดูเหมือนจะ unreachable
    // ผ่าน public constructor เพราะเมื่อ numerator=0 การลดรูปจะทำให้ denominator=1 เสมอ
    // (gcd(0,den) = den) จึงไม่ได้เขียนเทสแยกสำหรับกรณีนี้

    @Test
    public void testToString_normalFraction() {
        assertEquals("3 / 4", new Fraction(3, 4).toString());
    }

    // ---------------------------------------------------------------
    // getField()
    // ---------------------------------------------------------------

    @Test
    public void testGetField_returnsFractionFieldInstance() {
        Fraction f = new Fraction(1, 2);
        assertNotNull(f.getField());
        assertTrue(f.getField() instanceof FractionField);
    }
}
