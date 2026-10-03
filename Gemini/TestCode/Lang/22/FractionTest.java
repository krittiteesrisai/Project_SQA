package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    private static final double EPSILON = 1e-6;

    // ---------------------------------------------------------
    // Factory: getFraction(int, int)
    // ---------------------------------------------------------
    @Test
    public void testGetFraction_TwoInts() {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, 4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, -4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_TwoInts_ZeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_TwoInts_NegativeDenominatorOverflowNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_TwoInts_NegativeDenominatorOverflowDenominator() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    // ---------------------------------------------------------
    // Factory: getFraction(int, int, int)
    // ---------------------------------------------------------
    @Test
    public void testGetFraction_ThreeInts() {
        Fraction f = Fraction.getFraction(1, 2, 3);
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());

        f = Fraction.getFraction(-1, 2, 3);
        assertEquals(-5, f.getNumerator());
        assertEquals(3, f.getDenominator());

        f = Fraction.getFraction(0, 2, 3);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThreeInts_ZeroDenominator() {
        Fraction.getFraction(1, 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThreeInts_NegativeDenominator() {
        Fraction.getFraction(1, 1, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThreeInts_NegativeNumerator() {
        Fraction.getFraction(1, -1, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThreeInts_OverflowPositive() {
        Fraction.getFraction(Integer.MAX_VALUE, 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThreeInts_OverflowNegative() {
        Fraction.getFraction(Integer.MIN_VALUE, 1, 2);
    }

    // ---------------------------------------------------------
    // Factory: getReducedFraction(int, int) & Lang-22 GCD Bug
    // ---------------------------------------------------------
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

        // Even numerator with Integer.MIN_VALUE denominator
        f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_ZeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_Overflow() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_OverflowNumerator() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testReducedFraction_MinIntEdgeCases() {
        // Defects4J Lang-22: tests handling Integer.MIN_VALUE without incorrect gcd = 1
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // ---------------------------------------------------------
    // Factory: getFraction(double)
    // ---------------------------------------------------------
    @Test
    public void testGetFraction_Double() {
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
    public void testGetFraction_Double_NaN() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_Double_GreaterThanMaxInt() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1000.0);
    }

    // ---------------------------------------------------------
    // Factory: getFraction(String)
    // ---------------------------------------------------------
    @Test
    public void testGetFraction_String() {
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
    public void testGetFraction_String_Null() {
        Fraction.getFraction((String) null);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_String_InvalidMixedFormat() {
        Fraction.getFraction("1 2 3");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_String_InvalidString() {
        Fraction.getFraction("abc");
    }

    // ---------------------------------------------------------
    // Accessors & Number Methods
    // ---------------------------------------------------------
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

        Fraction neg = Fraction.getFraction(-7, 4);
        assertEquals(3, neg.getProperNumerator());
        assertEquals(-1, neg.getProperWhole());
    }

    // ---------------------------------------------------------
    // Calculations: reduce, invert, negate, abs, pow
    // ---------------------------------------------------------
    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(0, 5);
        assertSame(Fraction.ZERO, f.reduce());
        assertSame(Fraction.ZERO, Fraction.ZERO.reduce());

        f = Fraction.getFraction(3, 4);
        assertSame(f, f.reduce()); // gcd == 1 returns this

        f = Fraction.getFraction(2, 4);
        Fraction red = f.reduce();
        assertEquals(1, red.getNumerator());
        assertEquals(2, red.getDenominator());

        // Min value reduction
        Fraction minF = Fraction.getFraction(Integer.MIN_VALUE, 2).reduce();
        assertEquals(Integer.MIN_VALUE / 2, minF.getNumerator());
        assertEquals(1, minF.getDenominator());
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
    public void testInvert_Zero() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_MinNumerator() {
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
    public void testNegate_MinNumerator() {
        Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testAbs() {
        Fraction f = Fraction.getFraction(3, 4);
        assertSame(f, f.abs());

        Fraction neg = Fraction.getFraction(-3, 4);
        assertEquals(3, neg.abs().getNumerator());
        assertEquals(4, neg.abs().getDenominator());
    }

    @Test
    public void testPow() {
        Fraction f = Fraction.getFraction(2, 3);
        assertSame(f, f.pow(1));
        assertSame(Fraction.ONE, f.pow(0));
        assertEquals(Fraction.getFraction(4, 9), f.pow(2));
        assertEquals(Fraction.getFraction(8, 27), f.pow(3));
        assertEquals(Fraction.getFraction(9, 4), f.pow(-2));
        assertEquals(Fraction.ONE, Fraction.ZERO.pow(0));
    }

    @Test(expected = ArithmeticException.class)
    public void testPow_Overflow() {
        Fraction.getFraction(Integer.MAX_VALUE, 1).pow(2);
    }

    // ---------------------------------------------------------
    // Arithmetic: add, subtract, multiplyBy, divideBy
    // ---------------------------------------------------------
    @Test
    public void testAddAndSubtract() {
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(2, 5); // d1 == 1

        assertEquals(Fraction.getFraction(11, 15), f1.add(f2));
        assertEquals(Fraction.getFraction(-1, 15), f1.subtract(f2));

        Fraction f3 = Fraction.getFraction(1, 6);
        Fraction f4 = Fraction.getFraction(1, 4); // d1 > 1 (gcd(6,4) = 2)

        assertEquals(Fraction.getFraction(5, 12), f3.add(f4));
        assertEquals(Fraction.getFraction(-1, 12), f3.subtract(f4));

        // Zero handling
        assertEquals(f1, f1.add(Fraction.ZERO));
        assertEquals(f1, Fraction.ZERO.add(f1));
        assertEquals(f1.negate(), Fraction.ZERO.subtract(f1));
        assertEquals(f1, f1.subtract(Fraction.ZERO));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_Null() {
        Fraction.ONE.add(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_Null() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_Overflow() {
        Fraction.getFraction(Integer.MAX_VALUE - 1, 1).add(Fraction.ONE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtract_Overflow() {
        Fraction.getFraction(Integer.MIN_VALUE + 1, 1).subtract(Fraction.getFraction(2, 1));
    }

    @Test
    public void testMultiplyAndDivide() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(3, 4);

        assertEquals(Fraction.getFraction(1, 2), f1.multiplyBy(f2));
        assertEquals(Fraction.getFraction(8, 9), f1.divideBy(f2));

        assertSame(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
        assertSame(Fraction.ZERO, Fraction.ZERO.multiplyBy(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_Null() {
        Fraction.ONE.multiplyBy(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_Null() {
        Fraction.ONE.divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_Zero() {
        Fraction.ONE.divideBy(Fraction.ZERO);
    }

    // ---------------------------------------------------------
    // Object Methods: equals, hashCode, compareTo, toString, toProperString
    // ---------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction f3 = Fraction.getFraction(2, 4);

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());

        assertFalse(f1.equals(f3)); // 1/2 != 2/4 in equals
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("Not a fraction"));
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
    public void testToStringAndToProperString() {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals("3/4", f.toString());
        assertEquals("3/4", f.toProperString());

        assertEquals("0", Fraction.ZERO.toProperString());
        assertEquals("1", Fraction.ONE.toProperString());
        assertEquals("-1", Fraction.getFraction(-1, 1).toProperString());

        Fraction improper = Fraction.getFraction(7, 4);
        assertEquals("7/4", improper.toString());
        assertEquals("1 3/4", improper.toProperString());

        Fraction negativeImproper = Fraction.getFraction(-7, 4);
        assertEquals("-7/4", negativeImproper.toString());
        assertEquals("-1 3/4", negativeImproper.toProperString());

        Fraction wholeAsImproper = Fraction.getFraction(4, 2);
        assertEquals("2", wholeAsImproper.toProperString());

        Fraction minNumerator = Fraction.getFraction(Integer.MIN_VALUE, 1);
        assertEquals(Integer.toString(Integer.MIN_VALUE), minNumerator.toProperString());
    }
}