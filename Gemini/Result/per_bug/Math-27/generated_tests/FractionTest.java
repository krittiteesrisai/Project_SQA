package org.apache.commons.math3.fraction;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    // ------------------------------------------------------------------------
    // Constructors & Conversions
    // ------------------------------------------------------------------------

    @Test
    public void testConstructorDoubleExactInteger() {
        Fraction f = new Fraction(5.0);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleValidFractions() {
        Fraction f = new Fraction(0.75);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        Fraction f2 = new Fraction(1.0 / 3.0, 1e-5, 100);
        Assert.assertEquals(1, f2.getNumerator());
        Assert.assertEquals(3, f2.getDenominator());

        Fraction f3 = new Fraction(0.6, 10);
        Assert.assertEquals(3, f3.getNumerator());
        Assert.assertEquals(5, f3.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflow() {
        new Fraction(1e20, 1.0e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterationsExceeded() {
        // Force non-convergence by passing maxIterations = 1 with a complex fraction
        new Fraction(FastMath.PI, 1e-15, 1);
    }

    @Test
    public void testConstructorIntSingleArg() {
        Fraction f = new Fraction(10);
        Assert.assertEquals(10, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntTwoArgs() {
        Fraction f1 = new Fraction(6, 8);
        Assert.assertEquals(3, f1.getNumerator());
        Assert.assertEquals(4, f1.getDenominator());

        // Negative denominator sign inversion
        Fraction f2 = new Fraction(3, -4);
        Assert.assertEquals(-3, f2.getNumerator());
        Assert.assertEquals(4, f2.getDenominator());

        Fraction f3 = new Fraction(-3, -4);
        Assert.assertEquals(3, f3.getNumerator());
        Assert.assertEquals(4, f3.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorZeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntegerMinValueOverflow() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorDenominatorIntegerMinValueOverflow() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    // ------------------------------------------------------------------------
    // Basic Properties & Conversions
    // ------------------------------------------------------------------------

    @Test
    public void testNumberConversions() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), 1e-5f);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(FractionField.getInstance(), f.getField());
    }

    @Test
    public void testAbs() {
        Fraction pos = new Fraction(3, 4);
        Fraction neg = new Fraction(-3, 4);
        Assert.assertEquals(pos, pos.abs());
        Assert.assertEquals(pos, neg.abs());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 4);
        Assert.assertEquals(new Fraction(-3, 4), f.negate());
        Assert.assertEquals(f, f.negate().negate());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegateOverflow() {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        Assert.assertEquals(new Fraction(4, 3), f.reciprocal());

        Fraction neg = new Fraction(-3, 4);
        Assert.assertEquals(new Fraction(-4, 3), neg.reciprocal());
    }

    // ------------------------------------------------------------------------
    // Comparison & Equality
    // ------------------------------------------------------------------------

    @Test
    public void testCompareTo() {
        Fraction first = new Fraction(1, 3);
        Fraction second = new Fraction(2, 5);
        Fraction third = new Fraction(1, 3);

        Assert.assertTrue(first.compareTo(second) < 0);
        Assert.assertTrue(second.compareTo(first) > 0);
        Assert.assertEquals(0, first.compareTo(third));

        // Edge case: Large values comparing without standard int overflow
        Fraction large1 = new Fraction(Integer.MAX_VALUE - 1, Integer.MAX_VALUE);
        Fraction large2 = new Fraction(Integer.MAX_VALUE - 2, Integer.MAX_VALUE);
        Assert.assertTrue(large1.compareTo(large2) > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(1, 3);

        Assert.assertTrue(f1.equals(f1));
        Assert.assertTrue(f1.equals(f2));
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("Not a fraction"));
    }

    // ------------------------------------------------------------------------
    // Add & Subtract
    // ------------------------------------------------------------------------

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Assert.assertEquals(new Fraction(11, 15), f1.add(f2));

        // Zero identity
        Assert.assertEquals(f1, f1.add(Fraction.ZERO));
        Assert.assertEquals(f1, Fraction.ZERO.add(f1));

        // Integer addition
        Assert.assertEquals(new Fraction(4, 3), f1.add(1));
    }

    @Test
    public void testSubtract() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 6);
        Assert.assertEquals(new Fraction(1, 2), f1.subtract(f2));

        // Zero identity
        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));
        Assert.assertEquals(f1.negate(), Fraction.ZERO.subtract(f1));

        // Integer subtraction
        Assert.assertEquals(new Fraction(-1, 3), f1.subtract(1));
    }

    @Test
    public void testAddSubSameDenominatorGCD() {
        // d1 > 1 path
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(1, 4);
        Assert.assertEquals(new Fraction(5, 12), f1.add(f2));
        Assert.assertEquals(new Fraction(-1, 12), f1.subtract(f2));
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Fraction.ONE.add(null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    // ------------------------------------------------------------------------
    // Multiply & Divide
    // ------------------------------------------------------------------------

    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Assert.assertEquals(new Fraction(1, 2), f1.multiply(f2));

        Assert.assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f1));

        // Multiply int
        Assert.assertEquals(new Fraction(4, 3), f1.multiply(2));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Fraction.ONE.multiply((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiplyOverflow() {
        Fraction f = new Fraction(Integer.MAX_VALUE, 2);
        f.multiply(new Fraction(2, 1)); // num would overflow Integer.MAX_VALUE if not checked
        Fraction fOverflow = new Fraction(Integer.MAX_VALUE, 3);
        fOverflow.multiply(new Fraction(2, 1));
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Assert.assertEquals(new Fraction(2, 3), f1.divide(f2));

        // Divide int
        Assert.assertEquals(new Fraction(1, 4), f1.divide(2));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Fraction.ONE.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroFraction() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    // ------------------------------------------------------------------------
    // Percentage & Defects4J Bug Math-27 Verification
    // ------------------------------------------------------------------------

    @Test
    public void testPercentageValueStandard() {
        Fraction f = new Fraction(1, 4);
        Assert.assertEquals(25.0, f.percentageValue(), EPSILON);

        Fraction f2 = new Fraction(2, 3);
        Assert.assertEquals(66.66666666666667, f2.percentageValue(), EPSILON);
    }

    @Test
    public void testPercentageValueLargeNumeratorOverflow() {
        // Test case exposing Math-27: multiplying large numerator by 100 exceeds Integer.MAX_VALUE
        // Fraction: 81159815 / 30000000 -> actual percent: 270.5327166666667
        // In unpatched Math-27, 81159815 * 100 overflows 32-bit signed int.
        Fraction f = new Fraction(81159815, 30000000);
        double expected = 100.0 * (81159815.0 / 30000000.0);
        Assert.assertEquals(expected, f.percentageValue(), 1e-6);
    }

    // ------------------------------------------------------------------------
    // getReducedFraction & Static factory methods
    // ------------------------------------------------------------------------

    @Test
    public void testGetReducedFraction() {
        Fraction f1 = Fraction.getReducedFraction(24, 36);
        Assert.assertEquals(2, f1.getNumerator());
        Assert.assertEquals(3, f1.getDenominator());

        Fraction zero = Fraction.getReducedFraction(0, 5);
        Assert.assertEquals(0, zero.getNumerator());
        Assert.assertEquals(1, zero.getDenominator());

        Fraction negDen = Fraction.getReducedFraction(2, -3);
        Assert.assertEquals(-2, negDen.getNumerator());
        Assert.assertEquals(3, negDen.getDenominator());

        // Boundary: 2^k / -2^31 reduction
        Fraction minDenEvenNum = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, minDenEvenNum.getNumerator());
        Assert.assertEquals(1073741824, minDenEvenNum.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionOverflow() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    // ------------------------------------------------------------------------
    // toString & Constants
    // ------------------------------------------------------------------------

    @Test
    public void testToString() {
        Assert.assertEquals("0", Fraction.ZERO.toString());
        Assert.assertEquals("5", new Fraction(5, 1).toString());
        Assert.assertEquals("3 / 4", new Fraction(3, 4).toString());
        Assert.assertEquals("-1 / 2", new Fraction(-1, 2).toString());
    }

    @Test
    public void testStaticConstants() {
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
        Assert.assertEquals(new Fraction(2, 4), Fraction.TWO_QUARTERS);
        Assert.assertEquals(new Fraction(2, 3), Fraction.TWO_THIRDS);
    }
}