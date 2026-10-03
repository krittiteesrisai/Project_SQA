package org.apache.commons.math3.fraction;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    // ==========================================
    // 1. Constructor Tests (Double variants)
    // ==========================================

    @Test
    public void testDoubleConstructorExactInteger() {
        Fraction f = new Fraction(5.0);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());

        Fraction fZero = new Fraction(0.0);
        Assert.assertEquals(0, fZero.getNumerator());
        Assert.assertEquals(1, fZero.getDenominator());
    }

    @Test
    public void testDoubleConstructorNormal() {
        Fraction f = new Fraction(0.75);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        Fraction fNeg = new Fraction(-0.4);
        Assert.assertEquals(-2, fNeg.getNumerator());
        Assert.assertEquals(5, fNeg.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorOverflowPositive() {
        new Fraction((double) Integer.MAX_VALUE + 1000.0);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorOverflowNegative() {
        // Bug trigger candidate for Math-26
        new Fraction((double) Integer.MIN_VALUE - 1000.0);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorMaxIterationsExceeded() {
        // PI with 1 iteration constraint should fail to converge
        new Fraction(Math.PI, 1e-15, 1);
    }

    @Test
    public void testDoubleConstructorWithMaxDenominator() {
        // Approximating PI with max denominator limit
        Fraction f = new Fraction(FastMath.PI, 10);
        Assert.assertEquals(22, f.getNumerator());
        Assert.assertEquals(7, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorDenominatorOverflow() {
        new Fraction(1e-20, 1e-25, 100);
    }

    // ==========================================
    // 2. Constructor Tests (Int, Int variants)
    // ==========================================

    @Test
    public void testIntConstructorSingleArg() {
        Fraction f = new Fraction(-7);
        Assert.assertEquals(-7, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test
    public void testIntConstructorNormalAndReduction() {
        Fraction f = new Fraction(6, -8);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructorZeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructorNumeratorMinDenominatorNegative() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testIntConstructorDenominatorMinValue() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    // ==========================================
    // 3. Absolute & Negate Tests
    // ==========================================

    @Test
    public void testAbs() {
        Fraction fPos = new Fraction(3, 4);
        Assert.assertSame(fPos, fPos.abs());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction absNeg = fNeg.abs();
        Assert.assertEquals(3, absNeg.getNumerator());
        Assert.assertEquals(4, absNeg.getDenominator());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 4);
        Fraction neg = f.negate();
        Assert.assertEquals(-3, neg.getNumerator());
        Assert.assertEquals(4, neg.getDenominator());

        Fraction zero = Fraction.ZERO.negate();
        Assert.assertEquals(0, zero.getNumerator());
        Assert.assertEquals(1, zero.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegateOverflow() {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    // ==========================================
    // 4. Reciprocal & Basic Conversions Tests
    // ==========================================

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        Fraction r = f.reciprocal();
        Assert.assertEquals(4, r.getNumerator());
        Assert.assertEquals(3, r.getDenominator());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction rNeg = fNeg.reciprocal();
        Assert.assertEquals(-4, rNeg.getNumerator());
        Assert.assertEquals(3, rNeg.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocalOfZero() {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testValueConversions() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), EPSILON);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(150.0, f.percentageValue(), EPSILON);
    }

    // ==========================================
    // 5. Add & Subtract Tests
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Fraction.ONE.add((Fraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Fraction.ONE.subtract((Fraction) null);
    }

    @Test
    public void testAddSubtractWithZero() {
        Fraction f = new Fraction(2, 3);
        Assert.assertEquals(f, f.add(Fraction.ZERO));
        Assert.assertEquals(f, Fraction.ZERO.add(f));
        Assert.assertEquals(f, f.subtract(Fraction.ZERO));
        Assert.assertEquals(f.negate(), Fraction.ZERO.subtract(f));
    }

    @Test
    public void testAddSubtractGcdEqualOne() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 4);

        Fraction addResult = f1.add(f2); // (4 + 3) / 12 = 7 / 12
        Assert.assertEquals(7, addResult.getNumerator());
        Assert.assertEquals(12, addResult.getDenominator());

        Fraction subResult = f1.subtract(f2); // (4 - 3) / 12 = 1 / 12
        Assert.assertEquals(1, subResult.getNumerator());
        Assert.assertEquals(12, subResult.getDenominator());
    }

    @Test
    public void testAddSubtractGcdGreaterThanOne() {
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(1, 4);

        // gcd(6, 4) = 2
        Fraction addResult = f1.add(f2); // 2/12 + 3/12 = 5/12
        Assert.assertEquals(5, addResult.getNumerator());
        Assert.assertEquals(12, addResult.getDenominator());

        Fraction subResult = f1.subtract(f2); // 2/12 - 3/12 = -1/12
        Assert.assertEquals(-1, subResult.getNumerator());
        Assert.assertEquals(12, subResult.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddOverflowInGcdOne() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddOverflowInBigIntegerPath() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 2);
        Fraction f2 = new Fraction(Integer.MAX_VALUE, 2);
        f1.add(f2);
    }

    @Test
    public void testAddSubtractInt() {
        Fraction f = new Fraction(1, 2);
        Fraction added = f.add(2);
        Assert.assertEquals(5, added.getNumerator());
        Assert.assertEquals(2, added.getDenominator());

        Fraction subtracted = f.subtract(2);
        Assert.assertEquals(-3, subtracted.getNumerator());
        Assert.assertEquals(2, subtracted.getDenominator());
    }

    // ==========================================
    // 6. Multiply & Divide Tests
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Fraction.ONE.multiply((Fraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Fraction.ONE.divide((Fraction) null);
    }

    @Test
    public void testMultiplyZero() {
        Fraction f = new Fraction(2, 3);
        Assert.assertEquals(Fraction.ZERO, f.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f));
    }

    @Test
    public void testMultiplyNormal() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.multiply(f2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiplyOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test
    public void testMultiplyInt() {
        Fraction f = new Fraction(2, 5);
        Fraction res = f.multiply(3);
        Assert.assertEquals(6, res.getNumerator());
        Assert.assertEquals(5, res.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroFraction() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test
    public void testDivideNormal() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.divide(f2);
        Assert.assertEquals(2, result.getNumerator());
        Assert.assertEquals(3, result.getDenominator());
    }

    @Test
    public void testDivideInt() {
        Fraction f = new Fraction(2, 3);
        Fraction res = f.divide(2);
        Assert.assertEquals(1, res.getNumerator());
        Assert.assertEquals(3, res.getDenominator());
    }

    // ==========================================
    // 7. getReducedFraction Tests
    // ==========================================

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFractionZeroNumerator() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        Assert.assertEquals(Fraction.ZERO, f);
    }

    @Test
    public void testGetReducedFractionEvenNumMinDenom() {
        // den == Integer.MIN_VALUE && (num & 1) == 0
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(1073741824, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionOverflowOnMinDenom() {
        // den is negative, num is Integer.MIN_VALUE
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionOverflowOnOddNumMinDenom() {
        // Odd numerator with MIN_VALUE denominator cannot be reduced by factor of 2
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetReducedFractionNegativeSigns() {
        Fraction f = Fraction.getReducedFraction(4, -8);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    // ==========================================
    // 8. CompareTo, Equals, HashCode & Utility Tests
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
        // Symmetric
        Assert.assertTrue(f1.equals(f2));
        Assert.assertTrue(f2.equals(f1));
        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        // Different fraction
        Assert.assertFalse(f1.equals(f3));
        // Null and different object types
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("Not a fraction"));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("5", new Fraction(5, 1).toString());
        Assert.assertEquals("0", new Fraction(0, 5).toString());
        Assert.assertEquals("3 / 4", new Fraction(3, 4).toString());
        Assert.assertEquals("-1 / 2", new Fraction(-1, 2).toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        Assert.assertEquals(FractionField.getInstance(), f.getField());
    }
}