package org.apache.commons.math.fraction;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.math.fraction.Fraction
 * (Defects4J Math-91b)
 */
public class FractionTest {

    // ---------------------------------------------------------------
    // Constructor: Fraction(double value) / epsilon-based conversion
    // ---------------------------------------------------------------

    @Test
    public void testDoubleConstructor_SimpleFraction() throws Exception {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_AlmostInteger() throws Exception {
        // abs(a0 - value) < epsilon branch (short-circuit, no loop iteration)
        Fraction f = new Fraction(2.0000000001, 1.0e-5, 100);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_NormalConvergence() throws Exception {
        // loop runs multiple iterations and converges before maxIterations
        Fraction f = new Fraction(1.0 / 3.0);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_OverflowOnA0() throws Exception {
        // a0 > overflow(Integer.MAX_VALUE) branch -> throws immediately
        new Fraction(1.0e10);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_MaxIterationsExceeded() throws Exception {
        // n >= maxIterations branch: epsilon too small, maxIterations=1
        new Fraction(Math.PI, 1.0e-20, 1);
    }

    @Test
    public void testDoubleConstructor_MaxDenominator_ElseBranch() throws Exception {
        // maxDenominator path: loop stops because q2 >= maxDenominator,
        // final "if (q2 < maxDenominator)" -> FALSE -> uses p1/q1 (else branch)
        Fraction f = new Fraction(Math.PI, 10);
        assertEquals(22, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_MaxDenominator_TrueBranch() throws Exception {
        // final "if (q2 < maxDenominator)" -> TRUE branch (via epsilon constructor,
        // maxDenominator defaults to Integer.MAX_VALUE so condition always true)
        Fraction f = new Fraction(0.75, 1.0e-5, 100);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    // ---------------------------------------------------------------
    // Constructor: Fraction(int num, int den)
    // ---------------------------------------------------------------

    @Test(expected = ArithmeticException.class)
    public void testIntConstructor_ZeroDenominator() {
        new Fraction(1, 0);
    }

    @Test
    public void testIntConstructor_NegativeDenominator_SignMovedToNumerator() {
        Fraction f = new Fraction(6, -4);
        // after negation (-6/4) then gcd reduce -> -3/2
        assertEquals(-3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testIntConstructor_OverflowOnNegateMinValueNumerator() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testIntConstructor_OverflowOnNegateMinValueDenominator() {
        new Fraction(5, Integer.MIN_VALUE);
    }

    @Test
    public void testIntConstructor_GcdReduction() {
        Fraction f = new Fraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testIntConstructor_NoReductionNeeded() {
        Fraction f = new Fraction(3, 5);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    // ---------------------------------------------------------------
    // abs()
    // ---------------------------------------------------------------

    @Test
    public void testAbs_PositiveNumeratorReturnsSameInstance() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_NegativeNumeratorReturnsNegated() {
        Fraction f = new Fraction(-3, 4);
        Fraction r = f.abs();
        assertEquals(3, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    // ---------------------------------------------------------------
    // compareTo()
    // ---------------------------------------------------------------

    @Test
    public void testCompareTo_LessThan() {
        assertEquals(-1, new Fraction(1, 3).compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testCompareTo_GreaterThan() {
        assertEquals(1, new Fraction(1, 2).compareTo(new Fraction(1, 3)));
    }

    @Test
    public void testCompareTo_Equal() {
        assertEquals(0, new Fraction(1, 2).compareTo(new Fraction(2, 4)));
    }

    // ---------------------------------------------------------------
    // doubleValue / floatValue / intValue / longValue
    // ---------------------------------------------------------------

    @Test
    public void testDoubleValue() {
        assertEquals(0.5, new Fraction(1, 2).doubleValue(), 1e-9);
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.5f, new Fraction(1, 2).floatValue(), 1e-6f);
    }

    @Test
    public void testIntValue() {
        assertEquals(1, new Fraction(7, 4).intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(1L, new Fraction(7, 4).longValue());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameReference() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_NullObject() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_ClassCastExceptionPath() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals("not a fraction"));
    }

    @Test
    public void testEquals_EqualFractions() {
        assertTrue(new Fraction(1, 2).equals(new Fraction(2, 4)));
    }

    @Test
    public void testEquals_DifferentFractions() {
        assertFalse(new Fraction(1, 2).equals(new Fraction(1, 3)));
    }

    // ---------------------------------------------------------------
    // getNumerator / getDenominator / hashCode
    // ---------------------------------------------------------------

    @Test
    public void testGettersAndHashCode() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertEquals(new Fraction(3, 4).hashCode(), f.hashCode());
    }

    // ---------------------------------------------------------------
    // negate()
    // ---------------------------------------------------------------

    @Test
    public void testNegate_Normal() {
        Fraction f = new Fraction(3, 4);
        Fraction r = f.negate();
        assertEquals(-3, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_OverflowMinValueNumerator() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------------------------------------------------------------
    // reciprocal()
    // ---------------------------------------------------------------

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(2, 3);
        Fraction r = f.reciprocal();
        assertEquals(3, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    // ---------------------------------------------------------------
    // add() / subtract() (addSub branches)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullFraction() {
        new Fraction(1, 2).add(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_NullFraction() {
        new Fraction(1, 2).subtract(null);
    }

    @Test
    public void testAdd_ThisNumeratorZero_ReturnsOtherFraction() {
        Fraction r = Fraction.ZERO.add(new Fraction(1, 3));
        assertEquals(1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testSubtract_ThisNumeratorZero_ReturnsNegatedOther() {
        Fraction r = Fraction.ZERO.subtract(new Fraction(1, 3));
        assertEquals(-1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testAdd_OtherNumeratorZero_ReturnsThis() {
        Fraction f = new Fraction(1, 3);
        Fraction r = f.add(Fraction.ZERO);
        assertEquals(1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testSubtract_OtherNumeratorZero_ReturnsThis() {
        Fraction f = new Fraction(1, 3);
        Fraction r = f.subtract(Fraction.ZERO);
        assertEquals(1, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }

    @Test
    public void testAdd_D1EqualsOneBranch() {
        // gcd(denominator1, denominator2) == 1 -> simple path (no BigInteger)
        Fraction r = new Fraction(1, 2).add(new Fraction(1, 3));
        assertEquals(5, r.getNumerator());
        assertEquals(6, r.getDenominator());
    }

    @Test
    public void testAdd_D1NotEqualOneBranch_UsesBigInteger() {
        // gcd(4,6) = 2 != 1 -> BigInteger path
        Fraction r = new Fraction(1, 4).add(new Fraction(1, 6));
        assertEquals(5, r.getNumerator());
        assertEquals(12, r.getDenominator());
    }

    @Test
    public void testSubtract_D1NotEqualOneBranch() {
        Fraction r = new Fraction(1, 4).subtract(new Fraction(1, 6));
        assertEquals(1, r.getNumerator());
        assertEquals(12, r.getDenominator());
    }

    // NOTE: branch "w.bitLength() > 31 -> throws ArithmeticException" ใน addSub()
    // ต้องใช้ตัวเลขที่ทำให้ BigInteger overflow เกิน 31-bit หลังหาร d2 ซึ่งหายากมาก
    // จากขอบเขตของ int numerator/denominator โดยไม่ละเมิด precondition อื่น ๆ
    // จึงไม่ได้เขียนเทสสำหรับ branch นี้โดยตรง (ไม่แน่ใจ exact values -> ข้ามตาม requirement #4)

    // ---------------------------------------------------------------
    // multiply()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_NullFraction() {
        new Fraction(1, 2).multiply(null);
    }

    @Test
    public void testMultiply_ThisNumeratorZero() {
        Fraction r = Fraction.ZERO.multiply(new Fraction(5, 7));
        assertEquals(Fraction.ZERO, r);
    }

    @Test
    public void testMultiply_OtherNumeratorZero() {
        Fraction r = new Fraction(5, 7).multiply(Fraction.ZERO);
        assertEquals(Fraction.ZERO, r);
    }

    @Test
    public void testMultiply_Normal() {
        Fraction r = new Fraction(2, 3).multiply(new Fraction(3, 4));
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    // ---------------------------------------------------------------
    // divide()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testDivide_NullFraction() {
        new Fraction(1, 2).divide(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide_ByZeroFraction() {
        new Fraction(1, 2).divide(Fraction.ZERO);
    }

    @Test
    public void testDivide_Normal() {
        Fraction r = new Fraction(1, 2).divide(new Fraction(1, 3));
        assertEquals(3, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    // ---------------------------------------------------------------
    // getReducedFraction()
    // ---------------------------------------------------------------

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_ZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_NumeratorZero() {
        Fraction r = Fraction.getReducedFraction(0, 5);
        assertEquals(Fraction.ZERO, r);
    }

    @Test
    public void testGetReducedFraction_MinValueDenominatorEvenNumerator() {
        // denominator == Integer.MIN_VALUE && numerator even branch
        Fraction r = Fraction.getReducedFraction(4, Integer.MIN_VALUE);
        assertEquals(-1, r.getNumerator());
        assertEquals(536870912, r.getDenominator());
    }

    @Test
    public void testGetReducedFraction_NegativeDenominator() {
        Fraction r = Fraction.getReducedFraction(3, -4);
        assertEquals(-3, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_OverflowOnNegate() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testGetReducedFraction_SimplifyGcd() {
        Fraction r = Fraction.getReducedFraction(8, 12);
        assertEquals(2, r.getNumerator());
        assertEquals(3, r.getDenominator());
    }
}
