package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    private static final double EPSILON = 0.00001;

    // --- Tests for getFraction(int, int) ---

    @Test
    public void testGetFractionIntIntValid() {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, 4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        // Negative denominator should move sign to numerator
        f = Fraction.getFraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, -4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionZeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionOverflowNumeratorMinNegated() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionOverflowDenominatorMinNegated() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    // --- Tests for getFraction(int, int, int) ---

    @Test
    public void testGetFractionThreeInts() {
        Fraction f = Fraction.getFraction(1, 1, 2);
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(-1, 1, 2);
        assertEquals(-3, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(0, 3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeIntsZeroDenominator() {
        Fraction.getFraction(1, 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeIntsNegativeDenominator() {
        Fraction.getFraction(1, 1, -2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeIntsNegativeNumerator() {
        Fraction.getFraction(1, -1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeIntsOverflow() {
        Fraction.getFraction(Integer.MAX_VALUE, 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeIntsUnderflow() {
        Fraction.getFraction(Integer.MIN_VALUE, 1, 2);
    }

    // --- Tests for getReducedFraction(int, int) ---

    @Test
    public void testGetReducedFraction() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f);

        f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(-2, -4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        // allow 2^k / -2^31
        f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFractionOverflow() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    // --- Tests for getFraction(double) ---

    @Test
    public void testGetFractionDouble() {
        Fraction f = Fraction.getFraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(-0.5);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(1.0);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());

        f = Fraction.getFraction(0.0);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDoubleNaN() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDoubleTooLarge() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1.0);
    }

    // --- Tests for getFraction(String) ---

    @Test
    public void testGetFractionString() {
        Fraction f = Fraction.getFraction("0.5");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction("1 1/2");
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());

        f = Fraction.getFraction("3/4");
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionStringNull() {
        Fraction.getFraction((String) null);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionStringInvalidFormat() {
        Fraction.getFraction("1 2 3");
    }

    // --- Tests for Accessors & Number Conversions ---

    @Test
    public void testAccessorsAndNumberConversions() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(7, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertEquals(3, f.getProperNumerator());
        assertEquals(1, f.getProperWhole());
        assertEquals(1, f.intValue());
        assertEquals(1L, f.longValue());
        assertEquals(1.75f, f.floatValue(), EPSILON);
        assertEquals(1.75d, f.doubleValue(), EPSILON);

        Fraction negF = Fraction.getFraction(-7, 4);
        assertEquals(3, negF.getProperNumerator());
        assertEquals(-1, negF.getProperWhole());
    }

    // --- Tests for Calculations & Operations ---

    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction reduced = f.reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());

        // Irreducible fraction returns this
        Fraction irreducible = Fraction.getFraction(1, 3);
        assertSame(irreducible, irreducible.reduce());

        // Zero numerator reduce (Lang-49 fault check)
        Fraction zeroFraction = Fraction.getFraction(0, 10);
        Fraction reducedZero = zeroFraction.reduce();
        assertEquals(0, reducedZero.getNumerator());
        assertEquals(1, reducedZero.getDenominator());
    }

    @Test
    public void testInvert() {
        Fraction f = Fraction.getFraction(3, 4);
        Fraction inv = f.invert();
        assertEquals(4, inv.getNumerator());
        assertEquals(3, inv.getDenominator());

        f = Fraction.getFraction(-3, 4);
        inv = f.invert();
        assertEquals(-4, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvertZero() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvertMinNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
    }

    @Test
    public void testNegate() {
        Fraction f = Fraction.getFraction(3, 4).negate();
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, 4).negate();
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegateMinNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testAbs() {
        Fraction f1 = Fraction.getFraction(-3, 4);
        Fraction abs1 = f1.abs();
        assertEquals(3, abs1.getNumerator());
        assertEquals(4, abs1.getDenominator());

        Fraction f2 = Fraction.getFraction(3, 4);
        assertSame(f2, f2.abs());
    }

    @Test
    public void testPow() {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.ONE, f.pow(0));
        assertSame(f, f.pow(1));

        Fraction pow2 = f.pow(2);
        assertEquals(4, pow2.getNumerator());
        assertEquals(9, pow2.getDenominator());

        Fraction pow3 = f.pow(3);
        assertEquals(8, pow3.getNumerator());
        assertEquals(27, pow3.getDenominator());

        Fraction powNeg1 = f.pow(-1);
        assertEquals(3, powNeg1.getNumerator());
        assertEquals(2, powNeg1.getDenominator());

        Fraction powNeg2 = f.pow(-2);
        assertEquals(9, powNeg2.getNumerator());
        assertEquals(4, powNeg2.getDenominator());
    }

    // --- Tests for Arithmetic: add, subtract, multiply, divide ---

    @Test
    public void testAdd() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction res = f1.add(f2);
        assertEquals(5, res.getNumerator());
        assertEquals(6, res.getDenominator());

        // Identity additions
        assertEquals(f1, f1.add(Fraction.ZERO));
        assertEquals(f2, Fraction.ZERO.add(f2));

        // Denominators sharing GCD > 1
        Fraction f3 = Fraction.getFraction(1, 4);
        Fraction f4 = Fraction.getFraction(3, 4);
        assertEquals(1, f3.add(f4).intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNull() {
        Fraction.ONE.add(null);
    }

    @Test
    public void testSubtract() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction res = f1.subtract(f2);
        assertEquals(1, res.getNumerator());
        assertEquals(6, res.getDenominator());

        assertEquals(f1, f1.subtract(Fraction.ZERO));
        assertEquals(f2.negate(), Fraction.ZERO.subtract(f2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractNull() {
        Fraction.ONE.subtract(null);
    }

    @Test
    public void testMultiplyBy() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(3, 4);
        Fraction res = f1.multiplyBy(f2);
        assertEquals(1, res.getNumerator());
        assertEquals(2, res.getDenominator());

        assertSame(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
        assertSame(Fraction.ZERO, Fraction.ZERO.multiplyBy(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyByNull() {
        Fraction.ONE.multiplyBy(null);
    }

    @Test
    public void testDivideBy() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction res = f1.divideBy(f2);
        assertEquals(2, res.getNumerator());
        assertEquals(1, res.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Fraction.ONE.divideBy(Fraction.ZERO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByNull() {
        Fraction.ONE.divideBy(null);
    }

    // --- Tests for Basics: equals, hashCode, compareTo, toString, toProperString ---

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction f3 = Fraction.getFraction(2, 4);

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(f3));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("1/2"));

        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4);
        Fraction f3 = Fraction.getFraction(3, 4);
        Fraction f4 = Fraction.getFraction(1, 4);

        assertEquals(0, f1.compareTo(f1));
        assertEquals(0, f1.compareTo(f2));
        assertTrue(f1.compareTo(f3) < 0);
        assertTrue(f1.compareTo(f4) > 0);
    }

    @Test
    public void testToString() {
        assertEquals("3/4", Fraction.getFraction(3, 4).toString());
        assertEquals("-3/4", Fraction.getFraction(-3, 4).toString());
    }

    @Test
    public void testToProperString() {
        assertEquals("0", Fraction.getFraction(0, 1).toProperString());
        assertEquals("1", Fraction.getFraction(1, 1).toProperString());
        assertEquals("-1", Fraction.getFraction(-1, 1).toProperString());
        assertEquals("1 1/2", Fraction.getFraction(3, 2).toProperString());
        assertEquals("-1 1/2", Fraction.getFraction(-3, 2).toProperString());
        assertEquals("2", Fraction.getFraction(4, 2).toProperString());
        assertEquals("-2", Fraction.getFraction(-4, 2).toProperString());
        assertEquals("3/4", Fraction.getFraction(3, 4).toProperString());
        assertEquals("-3/4", Fraction.getFraction(-3, 4).toProperString());
    }
}