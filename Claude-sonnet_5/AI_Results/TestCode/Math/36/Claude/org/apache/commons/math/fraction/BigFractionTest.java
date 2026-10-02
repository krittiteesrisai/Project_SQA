package org.apache.commons.math.fraction;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.junit.Test;

public class BigFractionTest {

    private static final double DELTA = 1e-9;

    // ------------------------------------------------------------------
    // Constructor(BigInteger, BigInteger)
    // ------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testConstructor_nullNumerator() {
        new BigFraction(null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_nullDenominator() {
        new BigFraction(BigInteger.ONE, null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructor_zeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testConstructor_zeroNumerator() {
        BigFraction f = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_reduceByGcd() {
        // gcd(8,4)=4 -> reduce to 2/1
        BigFraction f = new BigFraction(BigInteger.valueOf(8), BigInteger.valueOf(4));
        assertEquals(BigInteger.valueOf(2), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_noReductionNeeded() {
        // gcd == 1 -> ONE.compareTo(gcd) < 0 ไม่เป็นจริง (เท่ากับ 0)
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(5), f.getDenominator());
    }

    @Test
    public void testConstructor_negativeDenominatorMovesSign() {
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(-5));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(5), f.getDenominator());
    }

    @Test
    public void testConstructor_positiveDenominatorNoSignChange() {
        BigFraction f = new BigFraction(BigInteger.valueOf(-3), BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(5), f.getDenominator());
    }

    @Test
    public void testConstructor_fromBigInteger() {
        BigFraction f = new BigFraction(BigInteger.valueOf(7));
        assertEquals(BigInteger.valueOf(7), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    // ------------------------------------------------------------------
    // Constructor(int), Constructor(int,int), Constructor(long), Constructor(long,long)
    // ------------------------------------------------------------------

    @Test
    public void testConstructor_int() {
        BigFraction f = new BigFraction(5);
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testConstructor_intInt() {
        BigFraction f = new BigFraction(4, 8);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testConstructor_long() {
        BigFraction f = new BigFraction(9L);
        assertEquals(9L, f.getNumeratorAsLong());
        assertEquals(1L, f.getDenominatorAsLong());
    }

    @Test
    public void testConstructor_longLong() {
        BigFraction f = new BigFraction(6L, 3L);
        assertEquals(2L, f.getNumeratorAsLong());
        assertEquals(1L, f.getDenominatorAsLong());
    }

    // ------------------------------------------------------------------
    // Constructor(double) - exact bit conversion
    // ------------------------------------------------------------------

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_NaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_PositiveInfinity() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_NegativeInfinity() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructorDouble_zero() {
        BigFraction f = new BigFraction(0.0);
        assertEquals(0.0, f.doubleValue(), DELTA);
    }

    @Test
    public void testConstructorDouble_halfExactPowerOfTwo() {
        // 0.5 = 1/2 -> exercise while-loop (shift), k<0 branch, exponent!=0, sign==0
        BigFraction f = new BigFraction(0.5);
        assertEquals(BigInteger.ONE, f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructorDouble_negativeValue() {
        // sign != 0 branch
        BigFraction f = new BigFraction(-0.5);
        assertEquals(BigInteger.valueOf(-1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructorDouble_wholeNumber() {
        // k >= 0 branch (exponent large enough), exponent!=0
        BigFraction f = new BigFraction(4.0);
        assertEquals(BigInteger.valueOf(4), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorDouble_denormalized() {
        // exponent == 0 branch (subnormal number), m ไม่ต้อง OR implicit bit
        BigFraction f = new BigFraction(Double.MIN_VALUE);
        assertTrue(f.getNumerator().compareTo(BigInteger.ZERO) > 0);
    }

    // ------------------------------------------------------------------
    // Constructor(double, epsilon, maxIterations) -> private 4-arg ctor
    // ------------------------------------------------------------------

    @Test
    public void testConstructorDoubleEpsilon_nearIntegerEarlyReturn() {
        // abs(a0 - value) < epsilon -> early return branch
        BigFraction f = new BigFraction(2.00000000001, 1e-5, 100);
        assertEquals(BigInteger.valueOf(2), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleEpsilon_convergesLoop() {
        // ค่า 1/3 ต้องผ่าน loop หลายรอบจนลู่เข้า
        BigFraction f = new BigFraction(1.0 / 3.0, 1e-9, 100);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-8);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleEpsilon_maxIterationsExceeded() {
        // epsilon เล็กมาก + maxIterations=1 -> n>=maxIterations throw
        new BigFraction(Math.PI, 1.0e-20, 1);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleEpsilon_initialOverflow() {
        // a0 > overflow (Integer.MAX_VALUE) ทันที
        new BigFraction(1.0e10, 1e-9, 100);
    }

    // ------------------------------------------------------------------
    // Constructor(double, maxDenominator)
    // ------------------------------------------------------------------

    @Test
    public void testConstructorDoubleMaxDenominator_withinLimit() {
        BigFraction f = new BigFraction(1.0 / 3.0, 10);
        assertTrue(f.getDenominatorAsInt() <= 10);
    }

    @Test
    public void testConstructorDoubleMaxDenominator_exactMatchEarly() {
        // ค่าที่เป็นจำนวนเต็มพอดี -> early return (epsilon=0 เทียบ abs==0)
        BigFraction f = new BigFraction(5.0, 10);
        assertEquals(BigInteger.valueOf(5), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    // ------------------------------------------------------------------
    // getReducedFraction
    // ------------------------------------------------------------------

    @Test
    public void testGetReducedFraction_zeroNumerator() {
        BigFraction f = BigFraction.getReducedFraction(0, 5);
        assertSame(BigFraction.ZERO, f);
    }

    @Test
    public void testGetReducedFraction_nonZero() {
        BigFraction f = BigFraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    // ------------------------------------------------------------------
    // abs()
    // ------------------------------------------------------------------

    @Test
    public void testAbs_positive() {
        BigFraction f = new BigFraction(3, 4);
        assertSame(f, f.abs()); // branch: ZERO.compareTo(numerator) <= 0 -> this
    }

    @Test
    public void testAbs_zero() {
        BigFraction f = BigFraction.ZERO;
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative() {
        BigFraction f = new BigFraction(-3, 4);
        BigFraction result = f.abs(); // branch: else -> negate()
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    // ------------------------------------------------------------------
    // add
    // ------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddBigInteger_null() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigInteger) null);
    }

    @Test
    public void testAddBigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(BigInteger.ONE);
        assertEquals(new BigFraction(3, 2), result);
    }

    @Test
    public void testAddInt() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), f.add(1));
    }

    @Test
    public void testAddLong() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), f.add(1L));
    }

    @Test(expected = NullArgumentException.class)
    public void testAddBigFraction_null() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigFraction) null);
    }

    @Test
    public void testAddBigFraction_zeroArgument() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(BigFraction.ZERO);
        assertSame(f, result); // branch: ZERO.equals(fraction) -> return this
    }

    @Test
    public void testAddBigFraction_sameDenominator() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction result = f1.add(f2); // branch: denominator.equals -> true
        assertEquals(new BigFraction(3, 4), result);
    }

    @Test
    public void testAddBigFraction_differentDenominator() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.add(f2); // branch: denominator.equals -> false
        assertEquals(new BigFraction(7, 12), result);
    }

    // ------------------------------------------------------------------
    // bigDecimalValue overloads
    // ------------------------------------------------------------------

    @Test
    public void testBigDecimalValue_noArgs() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(new BigDecimal("0.25"), f.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValue_roundingMode() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal result = f.bigDecimalValue(BigDecimal.ROUND_DOWN);
        assertNotNull(result);
    }

    @Test
    public void testBigDecimalValue_scaleAndRounding() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal result = f.bigDecimalValue(5, BigDecimal.ROUND_HALF_UP);
        assertEquals(5, result.scale());
    }

    // ------------------------------------------------------------------
    // compareTo
    // ------------------------------------------------------------------

    @Test
    public void testCompareTo_lessThan() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) < 0);
    }

    @Test
    public void testCompareTo_greaterThan() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 4);
        assertTrue(f1.compareTo(f2) > 0);
    }

    @Test
    public void testCompareTo_equal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    // ------------------------------------------------------------------
    // divide
    // ------------------------------------------------------------------

    @Test(expected = ZeroException.class)
    public void testDivideBigInteger_zero() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivideBigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(BigInteger.valueOf(2));
        assertEquals(new BigFraction(1, 4), result);
    }

    @Test
    public void testDivideInt() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 4), f.divide(2));
    }

    @Test
    public void testDivideLong() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(1, 4), f.divide(2L));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideBigFraction_null() {
        BigFraction f = new BigFraction(1, 2);
        f.divide((BigFraction) null);
    }

    @Test(expected = ZeroException.class)
    public void testDivideBigFraction_zeroNumerator() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigFraction.ZERO);
    }

    @Test
    public void testDivideBigFraction_normal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 4);
        assertEquals(new BigFraction(2, 1), f1.divide(f2));
    }

    // ------------------------------------------------------------------
    // doubleValue / floatValue
    // ------------------------------------------------------------------

    @Test
    public void testDoubleValue() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(0.25, f.doubleValue(), DELTA);
    }

    @Test
    public void testFloatValue() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(0.25f, f.floatValue(), 1e-6f);
    }

    // ------------------------------------------------------------------
    // equals
    // ------------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        BigFraction f = new BigFraction(1, 2);
        assertTrue(f.equals(f)); // branch: this == other
    }

    @Test
    public void testEquals_null() {
        BigFraction f = new BigFraction(1, 2);
        assertFalse(f.equals(null)); // branch: instanceof false
    }

    @Test
    public void testEquals_notInstanceOf() {
        BigFraction f = new BigFraction(1, 2);
        assertFalse(f.equals("not a fraction"));
    }

    @Test
    public void testEquals_equalValues() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentValues() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        assertFalse(f1.equals(f2));
    }

    // ------------------------------------------------------------------
    // getters
    // ------------------------------------------------------------------

    @Test
    public void testGetters() {
        BigFraction f = new BigFraction(3, 4);
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
        assertEquals(3L, f.getNumeratorAsLong());
        assertEquals(4L, f.getDenominatorAsLong());
    }

    // ------------------------------------------------------------------
    // hashCode
    // ------------------------------------------------------------------

    @Test
    public void testHashCode_consistentWithEquals() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ------------------------------------------------------------------
    // intValue / longValue
    // ------------------------------------------------------------------

    @Test
    public void testIntValue() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ------------------------------------------------------------------
    // multiply
    // ------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyBigInteger_null() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigInteger) null);
    }

    @Test
    public void testMultiplyBigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), f.multiply(BigInteger.valueOf(3)));
    }

    @Test
    public void testMultiplyInt() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), f.multiply(3));
    }

    @Test
    public void testMultiplyLong() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(new BigFraction(3, 2), f.multiply(3L));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyBigFraction_null() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigFraction) null);
    }

    @Test
    public void testMultiplyBigFraction_thisNumeratorZero() {
        BigFraction f = BigFraction.ZERO;
        BigFraction other = new BigFraction(1, 2);
        assertSame(BigFraction.ZERO, f.multiply(other));
    }

    @Test
    public void testMultiplyBigFraction_otherNumeratorZero() {
        BigFraction f = new BigFraction(1, 2);
        assertSame(BigFraction.ZERO, f.multiply(BigFraction.ZERO));
    }

    @Test
    public void testMultiplyBigFraction_normal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 3);
        assertEquals(new BigFraction(1, 3), f1.multiply(f2));
    }

    // ------------------------------------------------------------------
    // negate
    // ------------------------------------------------------------------

    @Test
    public void testNegate() {
        BigFraction f = new BigFraction(3, 4);
        BigFraction result = f.negate();
        assertEquals(BigInteger.valueOf(-3), result.getNumerator());
    }

    // ------------------------------------------------------------------
    // percentageValue
    // ------------------------------------------------------------------

    @Test
    public void testPercentageValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(50.0, f.percentageValue(), DELTA);
    }

    // ------------------------------------------------------------------
    // pow(int)
    // ------------------------------------------------------------------

    @Test
    public void testPowInt_positive() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(2);
        assertEquals(new BigFraction(4, 9), result);
    }

    @Test
    public void testPowInt_negative() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(-1);
        assertEquals(new BigFraction(3, 2), result);
    }

    @Test
    public void testPowInt_zero() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(0);
        assertEquals(BigFraction.ONE, result);
    }

    // ------------------------------------------------------------------
    // pow(long)
    // ------------------------------------------------------------------

    @Test
    public void testPowLong_positive() {
        BigFraction f = new BigFraction(2, 3);
        assertEquals(new BigFraction(4, 9), f.pow(2L));
    }

    @Test
    public void testPowLong_negative() {
        BigFraction f = new BigFraction(2, 3);
        assertEquals(new BigFraction(3, 2), f.pow(-1L));
    }

    // ------------------------------------------------------------------
    // pow(BigInteger)
    // ------------------------------------------------------------------

    @Test
    public void testPowBigInteger_positive() {
        BigFraction f = new BigFraction(2, 3);
        assertEquals(new BigFraction(4, 9), f.pow(BigInteger.valueOf(2)));
    }

    @Test
    public void testPowBigInteger_negative() {
        BigFraction f = new BigFraction(2, 3);
        assertEquals(new BigFraction(3, 2), f.pow(BigInteger.valueOf(-1)));
    }

    // ------------------------------------------------------------------
    // pow(double)
    // ------------------------------------------------------------------

    @Test
    public void testPowDouble() {
        BigFraction f = new BigFraction(4, 1);
        assertEquals(2.0, f.pow(0.5), DELTA);
    }

    // ------------------------------------------------------------------
    // reciprocal
    // ------------------------------------------------------------------

    @Test
    public void testReciprocal() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.reciprocal();
        assertEquals(new BigFraction(3, 2), result);
    }

    // ------------------------------------------------------------------
    // reduce
    // ------------------------------------------------------------------

    @Test
    public void testReduce() {
        // สร้างผ่าน BigInteger ตรง ๆ โดยไม่ reduce ใน constructor (constructor ปกติ reduce อยู่แล้ว)
        // ใช้กรณีที่ reduce ซ้ำยังคงค่าเดิม
        BigFraction f = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(8));
        BigFraction result = f.reduce();
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    // ------------------------------------------------------------------
    // subtract
    // ------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractBigInteger_null() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigInteger) null);
    }

    @Test
    public void testSubtractBigInteger_normal() {
        BigFraction f = new BigFraction(3, 2);
        assertEquals(new BigFraction(1, 2), f.subtract(BigInteger.ONE));
    }

    @Test
    public void testSubtractInt() {
        BigFraction f = new BigFraction(3, 2);
        assertEquals(new BigFraction(1, 2), f.subtract(1));
    }

    @Test
    public void testSubtractLong() {
        BigFraction f = new BigFraction(3, 2);
        assertEquals(new BigFraction(1, 2), f.subtract(1L));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractBigFraction_null() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigFraction) null);
    }

    @Test
    public void testSubtractBigFraction_zeroArgument() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.subtract(BigFraction.ZERO);
        assertSame(f, result); // branch: ZERO.equals(fraction) -> return this
    }

    @Test
    public void testSubtractBigFraction_sameDenominator() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.subtract(f2); // branch: denominator.equals -> true
        assertEquals(new BigFraction(1, 2), result);
    }

    @Test
    public void testSubtractBigFraction_differentDenominator() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.subtract(f2); // branch: denominator.equals -> false
        assertEquals(new BigFraction(1, 6), result);
    }

    // ------------------------------------------------------------------
    // toString
    // ------------------------------------------------------------------

    @Test
    public void testToString_denominatorOne() {
        BigFraction f = new BigFraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToString_numeratorZero() {
        BigFraction f = BigFraction.ZERO;
        assertEquals("0", f.toString());
    }

    @Test
    public void testToString_normalFraction() {
        BigFraction f = new BigFraction(3, 4);
        assertEquals("3 / 4", f.toString());
    }

    // ------------------------------------------------------------------
    // getField
    // ------------------------------------------------------------------

    @Test
    public void testGetField() {
        BigFraction f = new BigFraction(1, 2);
        assertNotNull(f.getField());
        assertSame(BigFractionField.getInstance(), f.getField());
    }
}
