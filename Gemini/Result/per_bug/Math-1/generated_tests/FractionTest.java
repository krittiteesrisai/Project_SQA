package org.apache.commons.math3.fraction;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    // ==========================================
    // 1. CONSTRUCTOR & FACTORY TESTS
    // ==========================================

    @Test
    public void testConstructorDoubleExactInteger() {
        Fraction f1 = new Fraction(1.0);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(1, f1.getDenominator());

        Fraction f2 = new Fraction(0.0);
        Assert.assertEquals(0, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());

        Fraction f3 = new Fraction(-5.0);
        Assert.assertEquals(-5, f3.getNumerator());
        Assert.assertEquals(1, f3.getDenominator());
    }

    @Test
    public void testConstructorDoubleValidConvergents() {
        Fraction f = new Fraction(0.75);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        Fraction fWithEpsilon = new Fraction(0.33333333333, 1e-5, 100);
        Assert.assertEquals(1, fWithEpsilon.getNumerator());
        Assert.assertEquals(3, fWithEpsilon.getDenominator());

        Fraction fMaxDen = new Fraction(0.6666666, 10);
        Assert.assertEquals(2, fMaxDen.getNumerator());
        Assert.assertEquals(3, fMaxDen.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflowOnInitialValue() {
        new Fraction(1e15, 1e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleExceedMaxIterations() {
        // 0.12345678 requires more than 1 iteration to converge within 1e-10
        new Fraction(0.12345678, 1e-10, 1);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflowDuringIteration() {
        new Fraction(1.0 / 0.0000000000000001, 10);
    }

    @Test
    public void testConstructorIntIntPositiveAndNegative() {
        Fraction f1 = new Fraction(2, 4);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        // Negative denominator normalized
        Fraction f2 = new Fraction(3, -4);
        Assert.assertEquals(-3, f2.getNumerator());
        Assert.assertEquals(4, f2.getDenominator());

        // Both negative
        Fraction f3 = new Fraction(-3, -4);
        Assert.assertEquals(3, f3.getNumerator());
        Assert.assertEquals(4, f3.getDenominator());

        // Single int constructor
        Fraction f4 = new Fraction(7);
        Assert.assertEquals(7, f4.getNumerator());
        Assert.assertEquals(1, f4.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorDenominatorZero() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorOverflowMinNumeratorNegativeDenom() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorOverflowMinDenominator() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction fZero = Fraction.getReducedFraction(0, 5);
        Assert.assertEquals(0, fZero.getNumerator());
        Assert.assertEquals(1, fZero.getDenominator());

        Fraction fNormal = Fraction.getReducedFraction(6, 8);
        Assert.assertEquals(3, fNormal.getNumerator());
        Assert.assertEquals(4, fNormal.getDenominator());

        Fraction fNegDen = Fraction.getReducedFraction(6, -8);
        Assert.assertEquals(-3, fNegDen.getNumerator());
        Assert.assertEquals(4, fNegDen.getDenominator());

        // Special case: 2^k / -2^31
        Fraction fEvenOverMin = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, fEvenOverMin.getNumerator());
        Assert.assertEquals(-(Integer.MIN_VALUE / 2), fEvenOverMin.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionOverflow() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionOverflowMinDenomOddNum() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    // ==========================================
    // 2. BASIC ACCESSORS & CONVERSIONS
    // ==========================================

    @Test
    public void testConversions() {
        Fraction f = new Fraction(3, 4);
        Assert.assertEquals(0.75, f.doubleValue(), EPSILON);
        Assert.assertEquals(0.75f, f.floatValue(), (float) EPSILON);
        Assert.assertEquals(0, f.intValue());
        Assert.assertEquals(0L, f.longValue());
        Assert.assertEquals(75.0, f.percentageValue(), EPSILON);
        Assert.assertEquals(FractionField.getInstance(), f.getField());
    }

    @Test
    public void testAbsAndNegate() {
        Fraction pos = new Fraction(3, 4);
        Fraction neg = new Fraction(-3, 4);

        Assert.assertSame(pos, pos.abs());
        Assert.assertEquals(pos, neg.abs());

        Assert.assertEquals(neg, pos.negate());
        Assert.assertEquals(pos, neg.negate());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegateOverflow() {
        // Numerator Integer.MIN_VALUE cannot be negated
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        f.negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        Fraction rec = f.reciprocal();
        Assert.assertEquals(4, rec.getNumerator());
        Assert.assertEquals(3, rec.getDenominator());

        Fraction neg = new Fraction(-3, 4);
        Fraction recNeg = neg.reciprocal();
        Assert.assertEquals(-4, recNeg.getNumerator());
        Assert.assertEquals(3, recNeg.getDenominator());
    }

    // ==========================================
    // 3. COMPARISON, EQUALS & HASHCODE
    // ==========================================

    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(2, 4);

        Assert.assertTrue(f1.compareTo(f2) < 0);
        Assert.assertTrue(f2.compareTo(f1) > 0);
        Assert.assertEquals(0, f1.compareTo(f3));
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(1, 3);

        // Reflexive
        Assert.assertTrue(f1.equals(f1));
        // Symmetric & reduced equivalence
        Assert.assertTrue(f1.equals(f2));
        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        // Inequality
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals(new Object()));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("0", new Fraction(0, 5).toString());
        Assert.assertEquals("5", new Fraction(5, 1).toString());
        Assert.assertEquals("-5", new Fraction(-5, 1).toString());
        Assert.assertEquals("3 / 4", new Fraction(3, 4).toString());
        Assert.assertEquals("-3 / 4", new Fraction(-3, 4).toString());
    }

    // ==========================================
    // 4. ARITHMETIC OPERATIONS (ADD / SUBTRACT)
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Fraction.ONE.add(null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Fraction.ONE.subtract(null);
    }

    @Test
    public void testAddAndSubtractIdentity() {
        Fraction f = new Fraction(3, 5);
        Assert.assertEquals(f, f.add(Fraction.ZERO));
        Assert.assertEquals(f, Fraction.ZERO.add(f));
        Assert.assertEquals(f, f.subtract(Fraction.ZERO));
        Assert.assertEquals(f.negate(), Fraction.ZERO.subtract(f));
    }

    @Test
    public void testAddAndSubtractCoprimeDenominators() {
        // d1 == gcd(3, 5) == 1
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);

        Fraction sum = f1.add(f2); // 11/15
        Assert.assertEquals(11, sum.getNumerator());
        Assert.assertEquals(15, sum.getDenominator());

        Fraction diff = f1.subtract(f2); // -1/15
        Assert.assertEquals(-1, diff.getNumerator());
        Assert.assertEquals(15, diff.getDenominator());
    }

    @Test
    public void testAddAndSubtractSharedDenominatorFactors() {
        // d1 == gcd(6, 8) == 2 > 1
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(3, 8);

        Fraction sum = f1.add(f2); // 13/24 (tmodd1 != 0 path)
        Assert.assertEquals(13, sum.getNumerator());
        Assert.assertEquals(24, sum.getDenominator());

        // tmodd1 == 0 path
        Fraction f3 = new Fraction(1, 4);
        Fraction f4 = new Fraction(3, 4);
        Fraction sum2 = f3.add(f4); // 1
        Assert.assertEquals(1, sum2.getNumerator());
        Assert.assertEquals(1, sum2.getDenominator());
    }

    @Test
    public void testAddAndSubtractInt() {
        Fraction f = new Fraction(1, 3);
        Assert.assertEquals(new Fraction(7, 3), f.add(2));
        Assert.assertEquals(new Fraction(-5, 3), f.subtract(2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddNumeratorOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test(expected = MathArithmeticException.class)
    public void testSubtractNumeratorOverflow() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE + 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.subtract(f2);
    }

    // ==========================================
    // 5. ARITHMETIC OPERATIONS (MULTIPLY / DIVIDE)
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Fraction.ONE.multiply(null);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Fraction.ONE.divide(null);
    }

    @Test
    public void testMultiplyZero() {
        Fraction f = new Fraction(3, 5);
        Assert.assertEquals(Fraction.ZERO, f.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f));
    }

    @Test
    public void testMultiplyAndDivideNormal() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);

        Fraction prod = f1.multiply(f2); // 1/2
        Assert.assertEquals(1, prod.getNumerator());
        Assert.assertEquals(2, prod.getDenominator());

        Fraction quot = f1.divide(f2); // 8/9
        Assert.assertEquals(8, quot.getNumerator());
        Assert.assertEquals(9, quot.getDenominator());

        Assert.assertEquals(new Fraction(4, 3), f1.multiply(2));
        Assert.assertEquals(new Fraction(1, 3), f1.divide(2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroFraction() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiplyOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(1, 2);
        f1.divide(f2);
    }

    // ==========================================
    // 6. CONSTANTS VERIFICATION
    // ==========================================

    @Test
    public void testConstants() {
        Assert.assertEquals(new Fraction(2, 1), Fraction.TWO);
        Assert.assertEquals(new Fraction(1, 1), Fraction.ONE);
        Assert.assertEquals(new Fraction(0, 1), Fraction.ZERO);
        Assert.assertEquals(new Fraction(-1, 1), Fraction.MINUS_ONE);
        Assert.assertEquals(new Fraction(4, 5), Fraction.FOUR_FIFTHS);
        Assert.assertEquals(new Fraction(1, 5), Fraction.ONE_FIFTH);
        Assert.assertEquals(new Fraction(1, 2), Fraction.ONE_HALF);
        Assert.assertEquals(new Fraction(1, 4), Fraction.ONE_QUARTER);
        Assert.assertEquals(new Fraction(1, 3), Fraction.ONE_THIRD);
        Assert.assertEquals(new Fraction(3, 5), Fraction.THREE_FIFTHS);
        Assert.assertEquals(new Fraction(3, 4), Fraction.THREE_QUARTERS);
        Assert.assertEquals(new Fraction(2, 5), Fraction.TWO_FIFTHS);
        Assert.assertEquals(new Fraction(1, 2), Fraction.TWO_QUARTERS);
        Assert.assertEquals(new Fraction(2, 3), Fraction.TWO_THIRDS);
    }
}