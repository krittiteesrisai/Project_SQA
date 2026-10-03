package org.apache.commons.math3.fraction;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.junit.Assert;
import org.junit.Test;

public class BigFractionTest {

    // ==========================================
    // 1. Constructor Tests
    // ==========================================

    @Test
    public void testConstructorBigIntegerSingle() {
        BigFraction fraction = new BigFraction(BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.valueOf(5), fraction.getNumerator());
        Assert.assertEquals(BigInteger.ONE, fraction.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerPair() {
        // Reduced terms & negative denominator normalization
        BigFraction f1 = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(6));
        Assert.assertEquals(BigInteger.valueOf(2), f1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f1.getDenominator());

        BigFraction f2 = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(-3));
        Assert.assertEquals(BigInteger.valueOf(-2), f2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f2.getDenominator());

        BigFraction f3 = new BigFraction(BigInteger.valueOf(0), BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.ZERO, f3.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f3.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigIntegerNullNumerator() {
        new BigFraction(null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigIntegerNullDenominator() {
        new BigFraction(BigInteger.ONE, null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructorBigIntegerZeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testPrimitiveConstructors() {
        BigFraction fInt = new BigFraction(10);
        Assert.assertEquals(10, fInt.getNumeratorAsInt());
        Assert.assertEquals(1, fInt.getDenominatorAsInt());

        BigFraction fIntPair = new BigFraction(10, -20);
        Assert.assertEquals(-1, fIntPair.getNumeratorAsInt());
        Assert.assertEquals(2, fIntPair.getDenominatorAsInt());

        BigFraction fLong = new BigFraction(100L);
        Assert.assertEquals(100L, fLong.getNumeratorAsLong());
        Assert.assertEquals(1L, fLong.getDenominatorAsLong());

        BigFraction fLongPair = new BigFraction(-6L, -8L);
        Assert.assertEquals(3L, fLongPair.getNumeratorAsLong());
        Assert.assertEquals(4L, fLongPair.getDenominatorAsLong());
    }

    @Test
    public void testConstructorDouble() {
        BigFraction fZero = new BigFraction(0.0);
        Assert.assertEquals(BigInteger.ZERO, fZero.getNumerator());

        BigFraction fPos = new BigFraction(0.5);
        Assert.assertEquals(BigInteger.ONE, fPos.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), fPos.getDenominator());

        BigFraction fNeg = new BigFraction(-0.75);
        Assert.assertEquals(BigInteger.valueOf(-3), fNeg.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), fNeg.getDenominator());

        BigFraction fLargeK = new BigFraction(8.0);
        Assert.assertEquals(BigInteger.valueOf(8), fLargeK.getNumerator());
        Assert.assertEquals(BigInteger.ONE, fLargeK.getDenominator());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoublePosInf() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNegInf() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleWithEpsilonAndIterations() {
        // Near integer double
        BigFraction fInt = new BigFraction(5.00000000001, 1e-5, 10);
        Assert.assertEquals(BigInteger.valueOf(5), fInt.getNumerator());
        Assert.assertEquals(BigInteger.ONE, fInt.getDenominator());

        // Standard approximation
        BigFraction fApprox = new BigFraction(0.3333333333, 1e-5, 10);
        Assert.assertEquals(BigInteger.ONE, fApprox.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), fApprox.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflow() {
        new BigFraction(1e15, 1e-5, 10);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterationsExceeded() {
        new BigFraction(FastMath.PI, 1e-15, 2);
    }

    @Test
    public void testConstructorDoubleMaxDenominator() {
        BigFraction f = new BigFraction(0.666666, 10);
        Assert.assertEquals(BigInteger.valueOf(2), f.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f.getDenominator());

        BigFraction fBound = new BigFraction(0.666666, 2);
        Assert.assertEquals(BigInteger.ONE, fBound.getNumerator());
        Assert.assertEquals(BigInteger.ONE, fBound.getDenominator());
    }

    // ==========================================
    // 2. Factory & Reduce Methods
    // ==========================================

    @Test
    public void testGetReducedFraction() {
        BigFraction zero = BigFraction.getReducedFraction(0, 5);
        Assert.assertSame(BigFraction.ZERO, zero);

        BigFraction reduced = BigFraction.getReducedFraction(6, -8);
        Assert.assertEquals(BigInteger.valueOf(-3), reduced.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), reduced.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testGetReducedFractionZeroDenominator() {
        BigFraction.getReducedFraction(1, 0);
    }

    @Test
    public void testReduce() {
        BigFraction f = new BigFraction(BigInteger.valueOf(30), BigInteger.valueOf(40)).reduce();
        Assert.assertEquals(BigInteger.valueOf(3), f.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    // ==========================================
    // 3. Absolute Value & Negate
    // ==========================================

    @Test
    public void testAbs() {
        BigFraction pos = new BigFraction(3, 4);
        Assert.assertSame(pos, pos.abs());

        BigFraction zero = BigFraction.ZERO;
        Assert.assertSame(zero, zero.abs());

        BigFraction neg = new BigFraction(-3, 4);
        BigFraction absNeg = neg.abs();
        Assert.assertEquals(BigInteger.valueOf(3), absNeg.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), absNeg.getDenominator());
    }

    @Test
    public void testNegate() {
        BigFraction f = new BigFraction(3, 4).negate();
        Assert.assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    // ==========================================
    // 4. Addition & Subtraction
    // ==========================================

    @Test
    public void testAdd() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction f3 = new BigFraction(1, 3);

        // Same denominator
        BigFraction sumSame = f1.add(f2);
        Assert.assertEquals(new BigFraction(3, 4), sumSame);

        // Different denominator
        BigFraction sumDiff = f1.add(f3);
        Assert.assertEquals(new BigFraction(7, 12), sumDiff);

        // Add Zero
        Assert.assertSame(f1, f1.add(BigFraction.ZERO));

        // Primitive & BigInteger overloads
        Assert.assertEquals(new BigFraction(5, 4), f1.add(1));
        Assert.assertEquals(new BigFraction(9, 4), f1.add(2L));
        Assert.assertEquals(new BigFraction(13, 4), f1.add(BigInteger.valueOf(3)));
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullBigFraction() {
        BigFraction.ONE.add((BigFraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullBigInteger() {
        BigFraction.ONE.add((BigInteger) null);
    }

    @Test
    public void testSubtract() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction f3 = new BigFraction(1, 3);

        // Same denominator
        Assert.assertEquals(new BigFraction(1, 2), f1.subtract(f2));

        // Different denominator
        Assert.assertEquals(new BigFraction(5, 12), f1.subtract(f3));

        // Subtract Zero
        Assert.assertSame(f1, f1.subtract(BigFraction.ZERO));

        // Primitive & BigInteger overloads
        Assert.assertEquals(new BigFraction(-1, 4), f1.subtract(1));
        Assert.assertEquals(new BigFraction(-5, 4), f1.subtract(2L));
        Assert.assertEquals(new BigFraction(-9, 4), f1.subtract(BigInteger.valueOf(3)));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullBigFraction() {
        BigFraction.ONE.subtract((BigFraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullBigInteger() {
        BigFraction.ONE.subtract((BigInteger) null);
    }

    // ==========================================
    // 5. Multiplication & Division
    // ==========================================

    @Test
    public void testMultiply() {
        BigFraction f1 = new BigFraction(2, 3);
        BigFraction f2 = new BigFraction(3, 5);

        Assert.assertEquals(new BigFraction(2, 5), f1.multiply(f2));
        Assert.assertSame(BigFraction.ZERO, f1.multiply(BigFraction.ZERO));
        Assert.assertSame(BigFraction.ZERO, BigFraction.ZERO.multiply(f1));

        Assert.assertEquals(new BigFraction(4, 3), f1.multiply(2));
        Assert.assertEquals(new BigFraction(2), f1.multiply(3L));
        Assert.assertEquals(new BigFraction(8, 3), f1.multiply(BigInteger.valueOf(4)));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullBigFraction() {
        BigFraction.ONE.multiply((BigFraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullBigInteger() {
        BigFraction.ONE.multiply((BigInteger) null);
    }

    @Test
    public void testDivide() {
        BigFraction f1 = new BigFraction(2, 3);
        BigFraction f2 = new BigFraction(4, 5);

        Assert.assertEquals(new BigFraction(5, 6), f1.divide(f2));
        Assert.assertEquals(new BigFraction(1, 3), f1.divide(2));
        Assert.assertEquals(new BigFraction(2, 9), f1.divide(3L));
        Assert.assertEquals(new BigFraction(1, 6), f1.divide(BigInteger.valueOf(4)));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNullBigFraction() {
        BigFraction.ONE.divide((BigFraction) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNullBigInteger() {
        BigFraction.ONE.divide((BigInteger) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroBigFraction() {
        BigFraction.ONE.divide(BigFraction.ZERO);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroInt() {
        BigFraction.ONE.divide(0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroLong() {
        BigFraction.ONE.divide(0L);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroBigInteger() {
        BigFraction.ONE.divide(BigInteger.ZERO);
    }

    // ==========================================
    // 6. Reciprocal & Pow
    // ==========================================

    @Test
    public void testReciprocal() {
        BigFraction f = new BigFraction(2, 5).reciprocal();
        Assert.assertEquals(new BigFraction(5, 2), f);
    }

    @Test
    public void testPow() {
        BigFraction f = new BigFraction(2, 3);

        // int pow
        Assert.assertEquals(new BigFraction(4, 9), f.pow(2));
        Assert.assertEquals(new BigFraction(9, 4), f.pow(-2));
        Assert.assertEquals(BigFraction.ONE, f.pow(0));

        // long pow
        Assert.assertEquals(new BigFraction(8, 27), f.pow(3L));
        Assert.assertEquals(new BigFraction(27, 8), f.pow(-3L));

        // BigInteger pow
        Assert.assertEquals(new BigFraction(4, 9), f.pow(BigInteger.valueOf(2)));
        Assert.assertEquals(new BigFraction(9, 4), f.pow(BigInteger.valueOf(-2)));

        // double pow
        Assert.assertEquals(0.25, new BigFraction(1, 2).pow(2.0), 1e-10);
    }

    // ==========================================
    // 7. Value Extractions & Conversions
    // ==========================================

    @Test
    public void testBigDecimalValue() {
        BigFraction f = new BigFraction(1, 2);
        Assert.assertEquals(new BigDecimal("0.5"), f.bigDecimalValue());
        Assert.assertEquals(new BigDecimal("0.50"), f.bigDecimalValue(2, BigDecimal.ROUND_HALF_UP));
        Assert.assertEquals(new BigDecimal("0.5"), f.bigDecimalValue(BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testNumberConversions() {
        BigFraction f = new BigFraction(7, 3);
        Assert.assertEquals(2, f.intValue());
        Assert.assertEquals(2L, f.longValue());
        Assert.assertEquals(7.0 / 3.0, f.doubleValue(), 1e-10);
        Assert.assertEquals((float) (7.0 / 3.0), f.floatValue(), 1e-5f);
        Assert.assertEquals((7.0 / 3.0) * 100.0, f.percentageValue(), 1e-10);
    }

    @Test
    public void testDoubleAndFloatValueWithExtremeBitLengths() {
        // Trigger bitLength shift branch for Double and Float
        BigInteger hugeNum = BigInteger.ONE.shiftLeft(1050);
        BigInteger hugeDen = BigInteger.ONE.shiftLeft(1049);
        BigFraction hugeFraction = new BigFraction(hugeNum, hugeDen);

        Assert.assertEquals(2.0, hugeFraction.doubleValue(), 1e-5);
        Assert.assertEquals(2.0f, hugeFraction.floatValue(), 1e-5f);
    }

    // ==========================================
    // 8. Equality, HashCode, Compare, ToString, Field
    // ==========================================

    @Test
    public void testCompareTo() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 3);
        BigFraction f3 = new BigFraction(2, 4);

        Assert.assertTrue(f1.compareTo(f2) < 0);
        Assert.assertTrue(f2.compareTo(f1) > 0);
        Assert.assertEquals(0, f1.compareTo(f3));
    }

    @Test
    public void testEqualsAndHashCode() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction f3 = new BigFraction(1, 3);

        // Reflexive
        Assert.assertTrue(f1.equals(f1));

        // Equal content (reduced)
        Assert.assertTrue(f1.equals(f2));
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        // Not equal
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("Not a BigFraction"));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("5", new BigFraction(5).toString());
        Assert.assertEquals("0", new BigFraction(0).toString());
        Assert.assertEquals("2 / 3", new BigFraction(2, 3).toString());
        Assert.assertEquals("-2 / 3", new BigFraction(-2, 3).toString());
    }

    @Test
    public void testGetField() {
        Assert.assertNotNull(BigFraction.ONE.getField());
        Assert.assertSame(BigFractionField.getInstance(), BigFraction.ONE.getField());
    }
}