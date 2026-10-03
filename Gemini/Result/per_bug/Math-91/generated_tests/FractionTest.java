package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    // ==========================================
    // 1. Constructor Tests (int, int)
    // ==========================================

    @Test
    public void testConstructorNormal() {
        Fraction f = new Fraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructorReduction() {
        Fraction f = new Fraction(6, 8);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructorNegativeDenominator() {
        Fraction f = new Fraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        Fraction f2 = new Fraction(-3, -4);
        assertEquals(3, f2.getNumerator());
        assertEquals(4, f2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorZeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorMinNegativeNumDenOverflow() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorMinNegativeDenOverflow() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    // ==========================================
    // 2. Constructor Tests (double, ...)
    // ==========================================

    @Test
    public void testDoubleConstructorExactInteger() throws Exception {
        Fraction f = new Fraction(2.0);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDoubleConstructorNormal() throws Exception {
        Fraction f = new Fraction(0.75);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testDoubleConstructorWithMaxDenominator() throws Exception {
        Fraction f = new Fraction(0.333333, 10);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorOverflowA0() throws Exception {
        new Fraction(1.0e12, 1.0e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorMaxIterationsExceeded() throws Exception {
        new Fraction(Math.PI, 1.0e-15, 1);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructorOverflowDuringIterations() throws Exception {
        new Fraction(1.00000000000001, 1.0e-20, Integer.MAX_VALUE, 100);
    }

    // ==========================================
    // 3. Static Factory: getReducedFraction
    // ==========================================

    @Test
    public void testGetReducedFraction() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());

        Fraction zero = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, zero);
    }

    @Test
    public void testGetReducedFractionNegativeDenominator() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFractionEvenNumWithMinDen() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFractionZeroDen() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFractionOverflowMinNum() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFractionOverflowMinDenOddNum() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    // ==========================================
    // 4. Basic Accessors, Conversions & Object Methods
    // ==========================================

    @Test
    public void testConstants() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.TWO.getDenominator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(1, Fraction.ONE.getDenominator());
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(1, Fraction.ZERO.getDenominator());
        assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        assertEquals(1, Fraction.MINUS_ONE.getDenominator());
    }

    @Test
    public void testPrimitiveValues() {
        Fraction f = new Fraction(3, 2);
        assertEquals(1.5, f.doubleValue(), EPSILON);
        assertEquals(1.5f, f.floatValue(), EPSILON);
        assertEquals(1, f.intValue());
        assertEquals(1L, f.longValue());
    }

    @Test
    public void testAbs() {
        Fraction pos = new Fraction(3, 4);
        assertSame(pos, pos.abs());

        Fraction neg = new Fraction(-3, 4);
        Fraction absNeg = neg.abs();
        assertEquals(3, absNeg.getNumerator());
        assertEquals(4, absNeg.getDenominator());
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4).reciprocal();
        assertEquals(4, f.getNumerator());
        assertEquals(3, f.getDenominator());

        Fraction neg = new Fraction(-3, 4).reciprocal();
        assertEquals(-4, neg.getNumerator());
        assertEquals(3, neg.getDenominator());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 4).negate();
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        Fraction neg = new Fraction(-3, 4).negate();
        assertEquals(3, neg.getNumerator());
        assertEquals(4, neg.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegateOverflow() {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);

        assertEquals(0, f1.compareTo(f2));
        assertTrue(f1.compareTo(f3) < 0);
        assertTrue(f3.compareTo(f1) > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(1, 3);

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("Not a fraction"));
        assertFalse(f1.equals(f3));
    }

    // ==========================================
    // 5. Arithmetic: Add & Subtract
    // ==========================================

    @Test
    public void testAddAndSubtractIdentity() {
        Fraction f = new Fraction(3, 5);

        assertEquals(f, Fraction.ZERO.add(f));
        assertEquals(f.negate(), Fraction.ZERO.subtract(f));
        assertEquals(f, f.add(Fraction.ZERO));
        assertEquals(f, f.subtract(Fraction.ZERO));
    }

    @Test
    public void testAddAndSubtractCoprimeDenominators() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);

        assertEquals(new Fraction(5, 6), f1.add(f2));
        assertEquals(new Fraction(1, 6), f1.subtract(f2));
    }

    @Test
    public void testAddAndSubtractSharedGcdDenominators() {
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(1, 4);

        assertEquals(new Fraction(5, 12), f1.add(f2));
        assertEquals(new Fraction(-1, 12), f1.subtract(f2));
    }

    @Test
    public void testAddAndSubtractTModD1EqualsZero() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 4);

        assertEquals(Fraction.ONE, f1.add(f2));
        assertEquals(new Fraction(-1, 2), f1.subtract(f2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNull() {
        Fraction.ONE.add(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractNull() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddNumeratorOverflowInBigInteger() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 2);
        Fraction f2 = new Fraction(Integer.MAX_VALUE, 2);
        f1.add(f2);
    }

    // ==========================================
    // 6. Arithmetic: Multiply & Divide
    // ==========================================

    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        assertEquals(new Fraction(1, 2), f1.multiply(f2));

        assertSame(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        assertSame(Fraction.ZERO, Fraction.ZERO.multiply(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyNull() {
        Fraction.ONE.multiply(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplyOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(3, 2), f1.divide(f2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideNull() {
        Fraction.ONE.divide(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Fraction.ONE.divide(Fraction.ZERO);
    }
}