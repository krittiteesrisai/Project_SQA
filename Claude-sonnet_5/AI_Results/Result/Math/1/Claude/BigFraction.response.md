# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ BigFraction

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสทดสอบถูกวางในแพ็กเกจเดียวกับ `BigFraction` (`org.apache.commons.math3.fraction`) เพื่อให้เข้าถึง `FractionConversionException` ได้โดยไม่ต้อง import เพิ่ม (คาดว่าเป็น checked/runtime exception ในแพ็กเกจเดียวกัน)
- บางกรณี (เช่น overflow ภายใน loop ของ private constructor) ขึ้นกับพฤติกรรมเชิงตัวเลขของ double ซึ่งได้วิเคราะห์ด้วยมือไว้ในคอมเมนต์ หากผลไม่ตรงตามคาด ถือเป็นจุดที่ต้องตรวจสอบเพิ่มเติม (ไม่ได้เดา behavior ใหม่ แต่คำนวณจาก logic ของซอร์ส)

```java
package org.apache.commons.math3.fraction;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;

public class BigFractionTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // Constructor: BigFraction(BigInteger, BigInteger)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testCtorBigIntBigInt_nullNumerator() {
        new BigFraction((BigInteger) null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testCtorBigIntBigInt_nullDenominator() {
        new BigFraction(BigInteger.ONE, (BigInteger) null);
    }

    @Test(expected = ZeroException.class)
    public void testCtorBigIntBigInt_zeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testCtorBigIntBigInt_zeroNumerator() {
        BigFraction f = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testCtorBigIntBigInt_gcdGreaterThanOne() {
        // gcd(4,8)=4 -> reduced to 1/2
        BigFraction f = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(8));
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorBigIntBigInt_gcdEqualsOne_noDivide() {
        // gcd(3,4)=1 -> no divide branch taken
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(4));
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorBigIntBigInt_negativeDenominator_signMoved() {
        // den<0 -> sign moved to numerator
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(-4));
        assertEquals(-3, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorBigIntBigInt_positiveDenominator_noSignMove() {
        BigFraction f = new BigFraction(BigInteger.valueOf(-3), BigInteger.valueOf(4));
        assertEquals(-3, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorBigIntBigInt_bothNegative() {
        // -3/-4 => gcd=1, den<0 -> negate both => 3/4
        BigFraction f = new BigFraction(BigInteger.valueOf(-3), BigInteger.valueOf(-4));
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorSingleBigInteger() {
        BigFraction f = new BigFraction(BigInteger.valueOf(7));
        assertEquals(7, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // Constructor: BigFraction(int), BigFraction(int,int)
    // BigFraction(long), BigFraction(long,long)
    // ---------------------------------------------------------------

    @Test
    public void testCtorInt() {
        BigFraction f = new BigFraction(5);
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorIntInt() {
        BigFraction f = new BigFraction(6, 9); // reduces to 2/3
        assertEquals(2, f.getNumeratorAsInt());
        assertEquals(3, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorLong() {
        BigFraction f = new BigFraction(100L);
        assertEquals(100L, f.getNumeratorAsLong());
        assertEquals(1L, f.getDenominatorAsLong());
    }

    @Test
    public void testCtorLongLong() {
        BigFraction f = new BigFraction(10L, 4L); // reduces to 5/2
        assertEquals(5L, f.getNumeratorAsLong());
        assertEquals(2L, f.getDenominatorAsLong());
    }

    // ---------------------------------------------------------------
    // Constructor: BigFraction(double) -- exact bit conversion
    // ---------------------------------------------------------------

    @Test(expected = MathIllegalArgumentException.class)
    public void testCtorDouble_NaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testCtorDouble_PositiveInfinity() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testCtorDouble_NegativeInfinity() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testCtorDouble_Zero_kLessThanZeroBranch() {
        // value=0.0 -> exponent=0,m=0 -> while loop not entered -> k stays negative (-1075)
        // => k<0 branch: numerator=0, denominator=2^1075 (not 1) -> toString hits "0" branch
        BigFraction f = new BigFraction(0.0);
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertNotEquals(BigInteger.ONE, f.getDenominator());
        assertEquals("0", f.toString());
        assertEquals(0.0, f.doubleValue(), DELTA);
    }

    @Test
    public void testCtorDouble_PowerOfTwoNegative_kLessThanZero() {
        // 0.25 = 2^-2 exactly -> k<0 branch, denominator=4
        BigFraction f = new BigFraction(0.25);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
        assertEquals(0.25, f.doubleValue(), DELTA);
    }

    @Test
    public void testCtorDouble_IntegerValue_kGreaterEqualZero() {
        // 3.0 -> odd mantissa after shifting, k ends up >=0 -> denominator=1
        BigFraction f = new BigFraction(3.0);
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorDouble_NegativeValue_signBranch() {
        BigFraction f = new BigFraction(-0.5);
        assertEquals(-0.5, f.doubleValue(), DELTA);
        assertTrue(f.getNumerator().signum() < 0);
    }

    // ---------------------------------------------------------------
    // Constructor: BigFraction(double, double, int) via private ctor
    // ---------------------------------------------------------------

    @Test
    public void testCtorDoubleEpsilonMaxIter_exactIntegerBranch() {
        // abs(a0-value) < epsilon -> immediate return without loop
        BigFraction f = new BigFraction(5.0, 1e-5, 100);
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorDoubleEpsilonMaxIter_normalConvergence() {
        double target = 1.0 / 3.0;
        BigFraction f = new BigFraction(target, 1e-10, 100);
        assertEquals(target, f.doubleValue(), 1e-9);
    }

    @Test(expected = FractionConversionException.class)
    public void testCtorDoubleEpsilonMaxIter_a0OverflowBranch() {
        // floor(value) > Integer.MAX_VALUE -> throws immediately
        new BigFraction(3.0e9, 1e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testCtorDoubleEpsilonMaxIter_maxIterationsExceeded() {
        // epsilon extremely small & maxIterations=2 -> loop stops at n==maxIterations
        // then n>=maxIterations branch throws
        new BigFraction(Math.PI, 1e-30, 2);
    }

    @Test(expected = FractionConversionException.class)
    public void testCtorDoubleEpsilonMaxIter_overflowInsideLoopBranch() {
        // epsilon smaller than double precision allows exact match in most cases;
        // denominators grow until exceeding Integer.MAX_VALUE before exact match.
        // ไม่สามารถยืนยัน exact branch path ด้วยมือได้ 100% แต่คาดคะเนจาก logic ของ continued fraction
        new BigFraction(Math.PI, 1e-20, 1000);
    }

    // ---------------------------------------------------------------
    // Constructor: BigFraction(double, int maxDenominator)
    // ---------------------------------------------------------------

    @Test
    public void testCtorDoubleMaxDenominator_ifBranch_useP2Q2() {
        // maxDenominator=10 large enough -> q2<maxDenominator true branch taken
        BigFraction f = new BigFraction(0.5, 10);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testCtorDoubleMaxDenominator_elseBranch_useP1Q1() {
        // maxDenominator=1 forces fallback to previous convergent p1/q1 = 0/1
        BigFraction f = new BigFraction(0.5, 1);
        assertEquals(0, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // getReducedFraction
    // ---------------------------------------------------------------

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

    // ---------------------------------------------------------------
    // abs()
    // ---------------------------------------------------------------

    @Test
    public void testAbs_nonNegative_returnsSameReference() {
        BigFraction f = BigFraction.ZERO;
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative_returnsNegated() {
        BigFraction f = new BigFraction(-3, 4);
        BigFraction a = f.abs();
        assertEquals(3, a.getNumeratorAsInt());
        assertEquals(4, a.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // add
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddBigInteger_null() {
        BigFraction.ONE.add((BigInteger) null);
    }

    @Test
    public void testAddBigInteger_normal() {
        BigFraction f = BigFraction.ONE_HALF.add(BigInteger.valueOf(2));
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testAddInt() {
        BigFraction f = BigFraction.ONE_HALF.add(1);
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testAddLong() {
        BigFraction f = BigFraction.ONE_HALF.add(1L);
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddBigFraction_null() {
        BigFraction.ONE.add((BigFraction) null);
    }

    @Test
    public void testAddBigFraction_zero_returnsSameReference() {
        BigFraction f = BigFraction.ONE_THIRD;
        assertSame(f, f.add(BigFraction.ZERO));
    }

    @Test
    public void testAddBigFraction_sameDenominator() {
        BigFraction f = new BigFraction(1, 5).add(new BigFraction(2, 5));
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(5, f.getDenominatorAsInt());
    }

    @Test
    public void testAddBigFraction_differentDenominator() {
        BigFraction f = BigFraction.ONE_HALF.add(BigFraction.ONE_THIRD);
        assertEquals(5, f.getNumeratorAsInt());
        assertEquals(6, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // bigDecimalValue
    // ---------------------------------------------------------------

    @Test
    public void testBigDecimalValue_terminating() {
        BigFraction f = BigFraction.ONE_QUARTER;
        assertEquals(new BigDecimal("0.25"), f.bigDecimalValue());
    }

    @Test(expected = ArithmeticException.class)
    public void testBigDecimalValue_nonTerminating() {
        BigFraction.ONE_THIRD.bigDecimalValue();
    }

    @Test
    public void testBigDecimalValue_roundingMode() {
        BigDecimal bd = BigFraction.ONE_THIRD.bigDecimalValue(BigDecimal.ROUND_HALF_UP);
        assertNotNull(bd);
    }

    @Test
    public void testBigDecimalValue_scaleRoundingMode() {
        BigDecimal bd = BigFraction.ONE_THIRD.bigDecimalValue(5, BigDecimal.ROUND_HALF_UP);
        assertEquals(5, bd.scale());
    }

    // ---------------------------------------------------------------
    // compareTo
    // ---------------------------------------------------------------

    @Test
    public void testCompareTo_lessThan() {
        assertTrue(BigFraction.ONE_THIRD.compareTo(BigFraction.ONE_HALF) < 0);
    }

    @Test
    public void testCompareTo_greaterThan() {
        assertTrue(BigFraction.ONE_HALF.compareTo(BigFraction.ONE_THIRD) > 0);
    }

    @Test
    public void testCompareTo_equal() {
        assertEquals(0, BigFraction.ONE_HALF.compareTo(new BigFraction(2, 4)));
    }

    // ---------------------------------------------------------------
    // divide
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testDivideBigInteger_null() {
        BigFraction.ONE.divide((BigInteger) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideBigInteger_zero() {
        BigFraction.ONE.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivideBigInteger_normal() {
        BigFraction f = new BigFraction(6, 1).divide(BigInteger.valueOf(3));
        assertEquals(2, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testDivideInt() {
        BigFraction f = new BigFraction(6).divide(3);
        assertEquals(2, f.getNumeratorAsInt());
    }

    @Test
    public void testDivideLong() {
        BigFraction f = new BigFraction(6L).divide(3L);
        assertEquals(2, f.getNumeratorAsInt());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideBigFraction_null() {
        BigFraction.ONE.divide((BigFraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideBigFraction_zeroNumerator() {
        BigFraction.ONE.divide(BigFraction.ZERO);
    }

    @Test
    public void testDivideBigFraction_normal() {
        BigFraction f = BigFraction.ONE_HALF.divide(BigFraction.ONE_THIRD);
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // doubleValue()
    // ---------------------------------------------------------------

    @Test
    public void testDoubleValue_normal() {
        assertEquals(0.5, BigFraction.ONE_HALF.doubleValue(), DELTA);
    }

    @Test
    public void testDoubleValue_NaNBranch_shiftApplied() {
        // coprime huge magnitudes so both doubleValue() overflow to Infinity -> NaN triggers shift branch
        BigInteger num = BigInteger.valueOf(2).pow(2000);
        BigInteger den = BigInteger.valueOf(3).pow(1400);
        BigFraction f = new BigFraction(num, den);
        double result = f.doubleValue();
        assertFalse(Double.isNaN(result));
        assertFalse(Double.isInfinite(result));
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameReference() {
        BigFraction f = BigFraction.ONE_HALF;
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_null() {
        assertFalse(BigFraction.ONE_HALF.equals(null));
    }

    @Test
    public void testEquals_differentType() {
        assertFalse(BigFraction.ONE_HALF.equals("1/2"));
    }

    @Test
    public void testEquals_equalValues() {
        assertTrue(new BigFraction(1, 2).equals(new BigFraction(50, 100)));
    }

    @Test
    public void testEquals_notEqualValues() {
        assertFalse(BigFraction.ONE_HALF.equals(BigFraction.ONE_THIRD));
    }

    // ---------------------------------------------------------------
    // floatValue()
    // ---------------------------------------------------------------

    @Test
    public void testFloatValue_normal() {
        assertEquals(0.5f, BigFraction.ONE_HALF.floatValue(), 1e-6f);
    }

    @Test
    public void testFloatValue_NaNBranch_shiftApplied() {
        BigInteger num = BigInteger.valueOf(2).pow(300);
        BigInteger den = BigInteger.valueOf(3).pow(200);
        BigFraction f = new BigFraction(num, den);
        float result = f.floatValue();
        assertFalse(Float.isNaN(result));
        assertFalse(Float.isInfinite(result));
    }

    // ---------------------------------------------------------------
    // getters
    // ---------------------------------------------------------------

    @Test
    public void testGetters() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(BigInteger.valueOf(7), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
        assertEquals(7, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
        assertEquals(7L, f.getNumeratorAsLong());
        assertEquals(2L, f.getDenominatorAsLong());
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_equalObjectsSameHash() {
        BigFraction a = new BigFraction(1, 2);
        BigFraction b = new BigFraction(50, 100);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // intValue() / longValue()
    // ---------------------------------------------------------------

    @Test
    public void testIntValue_positiveTruncation() {
        assertEquals(3, new BigFraction(7, 2).intValue());
    }

    @Test
    public void testIntValue_negativeTruncationTowardZero() {
        assertEquals(-3, new BigFraction(-7, 2).intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(3L, new BigFraction(7, 2).longValue());
    }

    // ---------------------------------------------------------------
    // multiply
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyBigInteger_null() {
        BigFraction.ONE.multiply((BigInteger) null);
    }

    @Test
    public void testMultiplyBigInteger_normal() {
        BigFraction f = BigFraction.ONE_HALF.multiply(BigInteger.valueOf(4));
        assertEquals(2, f.getNumeratorAsInt());
        assertEquals(1, f.getDenominatorAsInt());
    }

    @Test
    public void testMultiplyInt() {
        assertEquals(2, BigFraction.ONE_HALF.multiply(4).getNumeratorAsInt());
    }

    @Test
    public void testMultiplyLong() {
        assertEquals(2, BigFraction.ONE_HALF.multiply(4L).getNumeratorAsInt());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyBigFraction_null() {
        BigFraction.ONE.multiply((BigFraction) null);
    }

    @Test
    public void testMultiplyBigFraction_thisZero_returnsZeroReference() {
        assertSame(BigFraction.ZERO, BigFraction.ZERO.multiply(BigFraction.ONE_HALF));
    }

    @Test
    public void testMultiplyBigFraction_otherZero_returnsZeroReference() {
        assertSame(BigFraction.ZERO, BigFraction.ONE_HALF.multiply(BigFraction.ZERO));
    }

    @Test
    public void testMultiplyBigFraction_normal() {
        BigFraction f = BigFraction.ONE_HALF.multiply(BigFraction.ONE_THIRD);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(6, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // negate
    // ---------------------------------------------------------------

    @Test
    public void testNegate() {
        BigFraction f = BigFraction.ONE_HALF.negate();
        assertEquals(-1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // percentageValue
    // ---------------------------------------------------------------

    @Test
    public void testPercentageValue() {
        assertEquals(50.0, BigFraction.ONE_HALF.percentageValue(), DELTA);
    }

    // ---------------------------------------------------------------
    // pow
    // ---------------------------------------------------------------

    @Test
    public void testPowInt_nonNegative() {
        BigFraction f = new BigFraction(2, 3).pow(2);
        assertEquals(4, f.getNumeratorAsInt());
        assertEquals(9, f.getDenominatorAsInt());
    }

    @Test
    public void testPowInt_negative() {
        BigFraction f = new BigFraction(2, 3).pow(-2);
        assertEquals(9, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testPowLong_nonNegative() {
        BigFraction f = new BigFraction(2, 3).pow(2L);
        assertEquals(4, f.getNumeratorAsInt());
        assertEquals(9, f.getDenominatorAsInt());
    }

    @Test
    public void testPowLong_negative() {
        BigFraction f = new BigFraction(2, 3).pow(-2L);
        assertEquals(9, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testPowBigInteger_nonNegative() {
        BigFraction f = new BigFraction(2, 3).pow(BigInteger.valueOf(2));
        assertEquals(4, f.getNumeratorAsInt());
        assertEquals(9, f.getDenominatorAsInt());
    }

    @Test
    public void testPowBigInteger_negative() {
        BigFraction f = new BigFraction(2, 3).pow(BigInteger.valueOf(-2));
        assertEquals(9, f.getNumeratorAsInt());
        assertEquals(4, f.getDenominatorAsInt());
    }

    @Test
    public void testPowDouble() {
        double v = new BigFraction(2, 1).pow(3.0);
        assertEquals(8.0, v, DELTA);
    }

    // ---------------------------------------------------------------
    // reciprocal
    // ---------------------------------------------------------------

    @Test
    public void testReciprocal_normal() {
        BigFraction f = new BigFraction(2, 3).reciprocal();
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test(expected = ZeroException.class)
    public void testReciprocal_ofZero_throwsZeroException() {
        // ZERO: numerator=0, denominator=1
        // reciprocal() -> new BigFraction(denominator=1, numerator=0)
        // => den argument of new ctor call = 0 -> ZeroException
        BigFraction.ZERO.reciprocal();
    }

    // ---------------------------------------------------------------
    // reduce
    // ---------------------------------------------------------------

    @Test
    public void testReduce() {
        BigFraction f = new BigFraction(4, 8); // already auto-reduced by ctor to 1/2
        BigFraction r = f.reduce();
        assertEquals(1, r.getNumeratorAsInt());
        assertEquals(2, r.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // subtract
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractBigInteger_null() {
        BigFraction.ONE.subtract((BigInteger) null);
    }

    @Test
    public void testSubtractBigInteger_normal() {
        BigFraction f = new BigFraction(5, 2).subtract(BigInteger.valueOf(1));
        assertEquals(3, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testSubtractInt() {
        BigFraction f = new BigFraction(5, 2).subtract(1);
        assertEquals(3, f.getNumeratorAsInt());
    }

    @Test
    public void testSubtractLong() {
        BigFraction f = new BigFraction(5, 2).subtract(1L);
        assertEquals(3, f.getNumeratorAsInt());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractBigFraction_null() {
        BigFraction.ONE.subtract((BigFraction) null);
    }

    @Test
    public void testSubtractBigFraction_zero_returnsSameReference() {
        BigFraction f = BigFraction.ONE_THIRD;
        assertSame(f, f.subtract(BigFraction.ZERO));
    }

    @Test
    public void testSubtractBigFraction_sameDenominator() {
        BigFraction f = new BigFraction(3, 5).subtract(new BigFraction(1, 5));
        assertEquals(2, f.getNumeratorAsInt());
        assertEquals(5, f.getDenominatorAsInt());
    }

    @Test
    public void testSubtractBigFraction_differentDenominator() {
        BigFraction f = BigFraction.ONE_HALF.subtract(BigFraction.ONE_THIRD);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(6, f.getDenominatorAsInt());
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString_denominatorOne() {
        assertEquals("5", new BigFraction(5).toString());
    }

    @Test
    public void testToString_numeratorZero_viaDoubleCtor() {
        // branch denominator!=1 && numerator==0, reachable via BigFraction(0.0)
        assertEquals("0", new BigFraction(0.0).toString());
    }

    @Test
    public void testToString_generalForm() {
        assertEquals("3 / 4", new BigFraction(3, 4).toString());
    }

    // ---------------------------------------------------------------
    // getField
    // ---------------------------------------------------------------

    @Test
    public void testGetField_notNull_andSingleton() {
        BigFraction f = BigFraction.ONE_HALF;
        assertNotNull(f.getField());
        assertSame(f.getField(), f.getField());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดต้นทาง | Test methods (ตัวแทน) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `BigFraction(BigInteger,BigInteger)` | testCtorBigIntBigInt_* (9 เมธอด) | null num/den, den=0 (ZeroException), num=0, gcd>1 (divide), gcd=1 (no divide), den<0 (sign move), den>0 (no sign move), ทั้งสองลบ |
| `BigFraction(int/int,int)/long/long,long` | testCtorInt*, testCtorLong* | เรียกผ่าน constructor หลัก, ตรวจผลลัพธ์ reduce |
| `BigFraction(double)` | testCtorDouble_NaN/Infinity/Zero/PowerOfTwoNegative/IntegerValue/Negative | NaN, +Inf, -Inf throw; sign!=0/==0; exponent!=0; while-loop เข้า/ไม่เข้า; k<0 vs k>=0 |
| `BigFraction(double,epsilon,maxIter)` (private via 2 public wrappers) | testCtorDoubleEpsilonMaxIter_* | a0>overflow throw, abs(a0-value)<epsilon early-return, loop continue/stop, n>=maxIterations throw, overflow inside loop (best-effort) |
| `BigFraction(double,maxDenominator)` | testCtorDoubleMaxDenominator_ifBranch/elseBranch | q2<maxDenominator true/false หลัง loop |
| `getReducedFraction` | testGetReducedFraction_* | numerator==0 branch, else branch |
| `abs()` | testAbs_* | numerator>=0 (same ref) vs <0 (negate) |
| `add(BigInteger/int/long/BigFraction)` | testAdd* | null check, ZERO.equals shortcut, same-denominator vs cross-multiply |
| `bigDecimalValue()` variants | testBigDecimalValue_* | terminating (ok), non-terminating (ArithmeticException), roundingMode, scale+roundingMode |
| `compareTo` | testCompareTo_* | <0, >0, ==0 |
| `divide(BigInteger/int/long/BigFraction)` | testDivide* | null, zero-denominator/zero-numerator exceptions, normal path |
| `doubleValue()` | testDoubleValue_* | result ไม่ NaN (ปกติ) vs NaN-branch (shift) |
| `equals()` | testEquals_* | this==other, null, instanceof false, equal values, not-equal values |
| `floatValue()` | testFloatValue_* | ปกติ vs NaN-branch (shift) |
| getters (`getNumerator*/getDenominator*`) | testGetters | ค่าตรง ไม่มี branch ซับซ้อน แต่ยืนยัน correctness |
| `hashCode()` | testHashCode_equalObjectsSameHash | contract equal→same hash |
| `intValue()/longValue()` | testIntValue_*, testLongValue | truncation ทางบวก/ลบ (toward zero) |
| `multiply(BigInteger/int/long/BigFraction)` | testMultiply* | null check, this.numerator==0, fraction.numerator==0, normal |
| `negate()` | testNegate | path ตรง |
| `percentageValue()` | testPercentageValue | เรียก multiply+doubleValue ร่วมกัน |
| `pow(int/long/BigInteger/double)` | testPow* | exponent<0 vs >=0 สำหรับ int/long/BigInteger, ค่า double ทั่วไป |
| `reciprocal()` | testReciprocal_* | normal, กรณี numerator=0 → ZeroException (แฝงจาก constructor) |
| `reduce()` | testReduce | path ตรง |
| `subtract(BigInteger/int/long/BigFraction)` | testSubtract* | null, ZERO.equals shortcut, same/different denominator |
| `toString()` | testToString_* | denominator==1, numerator==0 (ผ่าน double ctor), general "n / d" |
| `getField()` | testGetField_notNull_andSingleton | เรียกไม่พัง + singleton reference |

**ข้อควรระวัง/จุดที่ไม่แน่ใจ (คอมเมนต์ไว้ในโค้ด):**
- `testCtorDoubleEpsilonMaxIter_overflowInsideLoopBranch` อาศัยการวิเคราะห์ด้วยมือว่า continued-fraction ของ `Math.PI` (double) จะเกิน `Integer.MAX_VALUE` ก่อนลู่เข้า epsilon ที่เล็กมาก — หากพฤติกรรมจริงต่างจากคาด อาจต้องปรับค่า value/epsilon
- `testReciprocal_ofZero_throwsZeroException` อิงจาก logic การสลับ numerator/denominator ตรงตามซอร์ส ไม่ได้ทดสอบ behavior ที่ไม่มีในโค้ด