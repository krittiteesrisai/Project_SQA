package org.apache.commons.math.fraction;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.junit.Assert;
import org.junit.Test;

public class BigFractionTest {

    private static final double EPSILON = 1e-10;

    // ------------------------------------------------------------------------
    // Constructors: BigInteger, int, long
    // ------------------------------------------------------------------------

    @Test
    public void testConstructorBigIntegerSingle() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(10));
        Assert.assertEquals(BigInteger.valueOf(10), bf.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorNullNumerator() {
        new BigFraction(null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorNullDenominator() {
        new BigFraction(BigInteger.ONE, null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructorZeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testConstructorZeroNumerator() {
        BigFraction bf = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.ZERO, bf.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructorReductionAndNegativeDenominator() {
        // Test GCD reduction and moving sign from denominator to numerator
        BigFraction bf = new BigFraction(BigInteger.valueOf(6), BigInteger.valueOf(-8));
        Assert.assertEquals(BigInteger.valueOf(-3), bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), bf.getDenominator());

        // Both negative -> positive
        BigFraction bf2 = new BigFraction(BigInteger.valueOf(-6), BigInteger.valueOf(-8));
        Assert.assertEquals(BigInteger.valueOf(3), bf2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), bf2.getDenominator());
    }

    @Test
    public void testPrimitiveConstructors() {
        BigFraction bfInt = new BigFraction(7);
        Assert.assertEquals(7, bfInt.getNumeratorAsInt());
        Assert.assertEquals(1, bfInt.getDenominatorAsInt());

        BigFraction bfInt2 = new BigFraction(6, -8);
        Assert.assertEquals(-3, bfInt2.getNumeratorAsInt());
        Assert.assertEquals(4, bfInt2.getDenominatorAsInt());

        BigFraction bfLong = new BigFraction(1234567890123L);
        Assert.assertEquals(1234567890123L, bfLong.getNumeratorAsLong());
        Assert.assertEquals(1L, bfLong.getDenominatorAsLong());

        BigFraction bfLong2 = new BigFraction(10L, -20L);
        Assert.assertEquals(-1L, bfLong2.getNumeratorAsLong());
        Assert.assertEquals(2L, bfLong2.getDenominatorAsLong());
    }

    // ------------------------------------------------------------------------
    // Constructors: double & Continued Fractions
    // ------------------------------------------------------------------------

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoublePositiveInfinity() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNegativeInfinity() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleExact() {
        BigFraction zero = new BigFraction(0.0);
        Assert.assertEquals(BigInteger.ZERO, zero.getNumerator());

        BigFraction pos = new BigFraction(0.5);
        Assert.assertEquals(BigInteger.ONE, pos.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), pos.getDenominator());

        BigFraction neg = new BigFraction(-0.75);
        Assert.assertEquals(BigInteger.valueOf(-3), neg.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), neg.getDenominator());

        // Subnormal number (exponent == 0)
        BigFraction subnormal = new BigFraction(Double.MIN_VALUE);
        Assert.assertTrue(subnormal.getNumerator().compareTo(BigInteger.ZERO) > 0);

        // Large double (k >= 0 branch)
        BigFraction large = new BigFraction(4503599627370496.0); // 2^52
        Assert.assertEquals(BigInteger.ONE, large.getDenominator());
    }

    @Test
    public void testConstructorDoubleWithEpsilon() {
        // Almost integer argument check
        BigFraction intFrac = new BigFraction(3.00000000001, 0.001, 10);
        Assert.assertEquals(BigInteger.valueOf(3), intFrac.getNumerator());
        Assert.assertEquals(BigInteger.ONE, intFrac.getDenominator());

        // Normal continued fraction convergence
        BigFraction oneThird = new BigFraction(1.0 / 3.0, 1e-5, 100);
        Assert.assertEquals(BigInteger.ONE, oneThird.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), oneThird.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflowA0() {
        new BigFraction(1e15, 1e-5, 10);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterationsExceeded() {
        new BigFraction(FastMathDoubleTestUtil.PI, 1e-15, 2);
    }

    private static class FastMathDoubleTestUtil {
        static final double PI = 3.14159265358979323846;
    }

    @Test
    public void testConstructorDoubleMaxDenominator() {
        BigFraction bf = new BigFraction(0.333333333333, 10);
        Assert.assertEquals(BigInteger.ONE, bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        BigFraction zero = BigFraction.getReducedFraction(0, 5);
        Assert.assertSame(BigFraction.ZERO, zero);

        BigFraction reduced = BigFraction.getReducedFraction(6, 8);
        Assert.assertEquals(BigInteger.valueOf(3), reduced.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), reduced.getDenominator());
    }

    // ------------------------------------------------------------------------
    // Arithmetic: Add
    // ------------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddNullBigInteger() {
        BigFraction.ONE.add((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullBigFraction() {
        BigFraction.ONE.add((BigFraction) null);
    }

    @Test
    public void testAddOperations() {
        BigFraction bf = new BigFraction(1, 3);

        // add(BigInteger), add(int), add(long)
        Assert.assertEquals(new BigFraction(4, 3), bf.add(BigInteger.ONE));
        Assert.assertEquals(new BigFraction(7, 3), bf.add(2));
        Assert.assertEquals(new BigFraction(10, 3), bf.add(3L));

        // add(BigFraction): ZERO check
        Assert.assertSame(bf, bf.add(BigFraction.ZERO));

        // add(BigFraction): same denominator
        BigFraction sumSameDen = bf.add(new BigFraction(2, 3));
        Assert.assertEquals(BigFraction.ONE, sumSameDen);

        // add(BigFraction): different denominator
        BigFraction sumDiffDen = bf.add(new BigFraction(1, 2));
        Assert.assertEquals(new BigFraction(5, 6), sumDiffDen);
    }

    // ------------------------------------------------------------------------
    // Arithmetic: Subtract
    // ------------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullBigInteger() {
        BigFraction.ONE.subtract((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullBigFraction() {
        BigFraction.ONE.subtract((BigFraction) null);
    }

    @Test
    public void testSubtractOperations() {
        BigFraction bf = new BigFraction(2, 3);

        // subtract(BigInteger), subtract(int), subtract(long)
        Assert.assertEquals(new BigFraction(-1, 3), bf.subtract(BigInteger.ONE));
        Assert.assertEquals(new BigFraction(-4, 3), bf.subtract(2));
        Assert.assertEquals(new BigFraction(-7, 3), bf.subtract(3L));

        // subtract(BigFraction): ZERO check
        Assert.assertSame(bf, bf.subtract(BigFraction.ZERO));

        // subtract(BigFraction): same denominator
        BigFraction subSameDen = bf.subtract(new BigFraction(1, 3));
        Assert.assertEquals(new BigFraction(1, 3), subSameDen);

        // subtract(BigFraction): different denominator
        BigFraction subDiffDen = bf.subtract(new BigFraction(1, 2));
        Assert.assertEquals(new BigFraction(1, 6), subDiffDen);
    }

    // ------------------------------------------------------------------------
    // Arithmetic: Multiply
    // ------------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullBigInteger() {
        BigFraction.ONE.multiply((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullBigFraction() {
        BigFraction.ONE.multiply((BigFraction) null);
    }

    @Test
    public void testMultiplyOperations() {
        BigFraction bf = new BigFraction(2, 3);

        Assert.assertEquals(new BigFraction(4, 3), bf.multiply(BigInteger.valueOf(2)));
        Assert.assertEquals(new BigFraction(4, 3), bf.multiply(2));
        Assert.assertEquals(new BigFraction(4, 3), bf.multiply(2L));

        // Multiply by zero
        Assert.assertEquals(BigFraction.ZERO, bf.multiply(BigFraction.ZERO));
        Assert.assertEquals(BigFraction.ZERO, BigFraction.ZERO.multiply(bf));

        // Multiply fractions
        Assert.assertEquals(new BigFraction(1, 2), bf.multiply(new BigFraction(3, 4)));
    }

    // ------------------------------------------------------------------------
    // Arithmetic: Divide
    // ------------------------------------------------------------------------

    @Test(expected = ZeroException.class)
    public void testDivideZeroBigInteger() {
        BigFraction.ONE.divide(BigInteger.ZERO);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZeroInt() {
        BigFraction.ONE.divide(0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZeroLong() {
        BigFraction.ONE.divide(0L);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNullBigFraction() {
        BigFraction.ONE.divide((BigFraction) null);
    }

    @Test(expected = ZeroException.class)
    public void testDivideZeroBigFraction() {
        BigFraction.ONE.divide(BigFraction.ZERO);
    }

    @Test
    public void testDivideOperations() {
        BigFraction bf = new BigFraction(2, 3);

        Assert.assertEquals(new BigFraction(1, 3), bf.divide(BigInteger.valueOf(2)));
        Assert.assertEquals(new BigFraction(1, 3), bf.divide(2));
        Assert.assertEquals(new BigFraction(1, 3), bf.divide(2L));
        Assert.assertEquals(new BigFraction(8, 9), bf.divide(new BigFraction(3, 4)));
    }

    // ------------------------------------------------------------------------
    // Powers & Absolute / Negation / Reciprocal / Reduce
    // ------------------------------------------------------------------------

    @Test
    public void testAbsAndNegate() {
        BigFraction pos = new BigFraction(2, 3);
        BigFraction neg = new BigFraction(-2, 3);

        Assert.assertSame(pos, pos.abs());
        Assert.assertEquals(pos, neg.abs());

        Assert.assertEquals(neg, pos.negate());
        Assert.assertEquals(pos, neg.negate());
    }

    @Test
    public void testReciprocalAndReduce() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(3, 2), bf.reciprocal());

        BigFraction unreduced = new BigFraction(new BigInteger("4"), new BigInteger("6"));
        Assert.assertEquals(new BigFraction(2, 3), unreduced.reduce());
    }

    @Test
    public void testPowInt() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(8, 27), bf.pow(3));
        Assert.assertEquals(BigFraction.ONE, bf.pow(0));
        Assert.assertEquals(new BigFraction(27, 8), bf.pow(-3));
    }

    @Test
    public void testPowLong() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(8, 27), bf.pow(3L));
        Assert.assertEquals(BigFraction.ONE, bf.pow(0L));
        Assert.assertEquals(new BigFraction(27, 8), bf.pow(-3L));
    }

    @Test
    public void testPowBigInteger() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(8, 27), bf.pow(BigInteger.valueOf(3)));
        Assert.assertEquals(BigFraction.ONE, bf.pow(BigInteger.ZERO));
        Assert.assertEquals(new BigFraction(27, 8), bf.pow(BigInteger.valueOf(-3)));
    }

    @Test
    public void testPowDouble() {
        BigFraction bf = new BigFraction(4, 9);
        Assert.assertEquals(2.0 / 3.0, bf.pow(0.5), EPSILON);
    }

    // ------------------------------------------------------------------------
    // Conversions: doubleValue, floatValue, BigDecimal, etc.
    // ------------------------------------------------------------------------

    @Test
    public void testConversionsToPrimitives() {
        BigFraction bf = new BigFraction(5, 2);
        Assert.assertEquals(2, bf.intValue());
        Assert.assertEquals(2L, bf.longValue());
        Assert.assertEquals(2.5f, bf.floatValue(), EPSILON);
        Assert.assertEquals(2.5d, bf.doubleValue(), EPSILON);
        Assert.assertEquals(250.0, bf.percentageValue(), EPSILON);
    }

    @Test
    public void testBigDecimalConversions() {
        BigFraction bf = new BigFraction(1, 4);
        Assert.assertEquals(new BigDecimal("0.25"), bf.bigDecimalValue());

        BigFraction oneThird = new BigFraction(1, 3);
        Assert.assertEquals(new BigDecimal("0.33"), oneThird.bigDecimalValue(2, BigDecimal.ROUND_HALF_UP));
        Assert.assertEquals(new BigDecimal("0.3333333333"), oneThird.bigDecimalValue(10, BigDecimal.ROUND_HALF_UP));
        Assert.assertEquals(BigDecimal.ZERO, oneThird.bigDecimalValue(BigDecimal.ROUND_DOWN));
    }

    // ------------------------------------------------------------------------
    // Object Contract: equals, compareTo, hashCode, toString, getField
    // ------------------------------------------------------------------------

    @Test
    public void testEqualsAndHashCode() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(2, 4);
        BigFraction bf3 = new BigFraction(1, 3);

        // Reflexive
        Assert.assertTrue(bf1.equals(bf1));
        // Symmetric & reduced equivalence
        Assert.assertTrue(bf1.equals(bf2));
        Assert.assertTrue(bf2.equals(bf1));
        Assert.assertEquals(bf1.hashCode(), bf2.hashCode());

        // Incompatible / null
        Assert.assertFalse(bf1.equals(null));
        Assert.assertFalse(bf1.equals("Not a fraction"));
        Assert.assertFalse(bf1.equals(bf3));
    }

    @Test
    public void testCompareTo() {
        BigFraction half = new BigFraction(1, 2);
        BigFraction third = new BigFraction(1, 3);
        BigFraction twoFourths = new BigFraction(2, 4);

        Assert.assertTrue(half.compareTo(third) > 0);
        Assert.assertTrue(third.compareTo(half) < 0);
        Assert.assertEquals(0, half.compareTo(twoFourths));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("3", new BigFraction(3, 1).toString());
        Assert.assertEquals("0", new BigFraction(0, 5).toString());
        Assert.assertEquals("2 / 3", new BigFraction(2, 3).toString());
    }

    @Test
    public void testGetField() {
        Assert.assertNotNull(BigFraction.ONE.getField());
        Assert.assertSame(BigFractionField.getInstance(), BigFraction.ONE.getField());
    }

    @Test
    public void testPredefinedConstants() {
        Assert.assertEquals(new BigFraction(2, 1), BigFraction.TWO);
        Assert.assertEquals(new BigFraction(1, 1), BigFraction.ONE);
        Assert.assertEquals(new BigFraction(0, 1), BigFraction.ZERO);
        Assert.assertEquals(new BigFraction(-1, 1), BigFraction.MINUS_ONE);
        Assert.assertEquals(new BigFraction(4, 5), BigFraction.FOUR_FIFTHS);
        Assert.assertEquals(new BigFraction(1, 5), BigFraction.ONE_FIFTH);
        Assert.assertEquals(new BigFraction(1, 2), BigFraction.ONE_HALF);
        Assert.assertEquals(new BigFraction(1, 4), BigFraction.ONE_QUARTER);
        Assert.assertEquals(new BigFraction(1, 3), BigFraction.ONE_THIRD);
        Assert.assertEquals(new BigFraction(3, 5), BigFraction.THREE_FIFTHS);
        Assert.assertEquals(new BigFraction(3, 4), BigFraction.THREE_QUARTERS);
        Assert.assertEquals(new BigFraction(2, 5), BigFraction.TWO_FIFTHS);
        Assert.assertEquals(new BigFraction(2, 4), BigFraction.TWO_QUARTERS);
        Assert.assertEquals(new BigFraction(2, 3), BigFraction.TWO_THIRDS);
    }
}