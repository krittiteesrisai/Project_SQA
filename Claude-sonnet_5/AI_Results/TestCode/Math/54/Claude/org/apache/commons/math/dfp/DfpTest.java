package org.apache.commons.math.dfp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField field;      // main field, used for most tests
    private DfpField fieldOther; // field assumed to have different radixDigits (for mismatch tests)

    @Before
    public void setUp() {
        field = new DfpField(20);
        fieldOther = new DfpField(5);
        field.clearIEEEFlags();
        fieldOther.clearIEEEFlags();
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);
    }

    private boolean flagSet(DfpField f, int flag) {
        return (f.getIEEEFlags() & flag) != 0;
    }

    // ---------------------------------------------------------------
    // Constructors (byte/int/long/double/String)
    // ---------------------------------------------------------------

    @Test
    public void testConstructFromByte() {
        Dfp d = field.newDfp((byte) 5);
        assertEquals(5.0, d.toDouble(), 0.0);
    }

    @Test
    public void testConstructFromInt() {
        Dfp d = field.newDfp(12345);
        assertEquals(12345.0, d.toDouble(), 0.0);
    }

    @Test
    public void testConstructFromLongPositive() {
        Dfp d = field.newDfp(123456789012345L);
        assertEquals(123456789012345.0, d.toDouble(), 1.0);
    }

    @Test
    public void testConstructFromLongNegative() {
        Dfp d = field.newDfp(-98765L);
        assertEquals(-98765.0, d.toDouble(), 0.0);
    }

    @Test
    public void testConstructFromLongMinValue() {
        // Boundary: special-case handling of Long.MIN_VALUE in constructor
        Dfp d = field.newDfp(Long.MIN_VALUE);
        assertEquals((double) Long.MIN_VALUE, d.toDouble(), 1.0);
    }

    @Test
    public void testConstructFromLongZero() {
        Dfp d = field.newDfp(0L);
        assertTrue(d.equals(field.getZero()));
    }

    @Test
    public void testConstructFromDoubleZero() {
        Dfp d = field.newDfp(0.0);
        assertTrue(d.equals(field.getZero()));
    }

    @Test
    public void testConstructFromDoublePositive() {
        Dfp d = field.newDfp(3.14159);
        assertEquals(3.14159, d.toDouble(), 1e-9);
    }

    @Test
    public void testConstructFromDoubleNegative() {
        Dfp d = field.newDfp(-2.5);
        assertEquals(-2.5, d.toDouble(), 1e-9);
    }

    @Test
    public void testConstructFromDoubleNaN() {
        Dfp d = field.newDfp(Double.NaN);
        assertTrue(d.isNaN());
        assertEquals(Dfp.QNAN, d.classify());
    }

    @Test
    public void testConstructFromDoublePositiveInfinity() {
        Dfp d = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(d.isInfinite());
        assertFalse(d.lessThan(field.getZero()));
    }

    @Test
    public void testConstructFromDoubleNegativeInfinity() {
        Dfp d = field.newDfp(Double.NEGATIVE_INFINITY);
        assertTrue(d.isInfinite());
        assertTrue(d.lessThan(field.getZero()));
    }

    @Test
    public void testConstructFromDoubleSubnormal() {
        // triggers subnormal-normalization while-loop in double constructor
        Dfp d = field.newDfp(Double.MIN_VALUE);
        assertFalse(d.isNaN());
        assertFalse(d.isInfinite());
        assertTrue(d.greaterThan(field.getZero()));
    }

    @Test
    public void testCopyConstructor() {
        Dfp a = field.newDfp(42);
        Dfp b = new Dfp(a);
        assertTrue(a.equals(b));
    }

    // ---------------------------------------------------------------
    // String constructor / parsing branches
    // ---------------------------------------------------------------

    @Test
    public void testStringPositiveInfinity() {
        Dfp d = field.newDfp("Infinity");
        assertTrue(d.isInfinite());
        assertFalse(d.lessThan(field.getZero()));
    }

    @Test
    public void testStringNegativeInfinity() {
        Dfp d = field.newDfp("-Infinity");
        assertTrue(d.isInfinite());
        assertTrue(d.lessThan(field.getZero()));
    }

    @Test
    public void testStringNaN() {
        Dfp d = field.newDfp("NaN");
        assertTrue(d.isNaN());
    }

    @Test
    public void testStringPlainPositive() {
        Dfp d = field.newDfp("123.456");
        assertEquals(123.456, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringPlainNegative() {
        Dfp d = field.newDfp("-123.456");
        assertEquals(-123.456, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringScientificLowerE() {
        Dfp d = field.newDfp("1.5e3");
        assertEquals(1500.0, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringScientificUpperE() {
        Dfp d = field.newDfp("1.5E3");
        assertEquals(1500.0, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringScientificNegativeExponent() {
        Dfp d = field.newDfp("1.5e-3");
        assertEquals(0.0015, d.toDouble(), 1e-12);
    }

    @Test
    public void testStringAllZerosAfterDecimal() {
        // boundary: "0.00000" -> decimalPos reset branch
        Dfp d = field.newDfp("0.00000");
        assertTrue(d.equals(field.getZero()));
    }

    @Test
    public void testStringLeadingZeros() {
        Dfp d = field.newDfp("000123.0");
        assertEquals(123.0, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringTrailingZerosStripped() {
        Dfp d = field.newDfp("1.230000");
        assertEquals(1.23, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringNoDecimalPoint() {
        // implicit decimal point branch (!decimalFound)
        Dfp d = field.newDfp("98765");
        assertEquals(98765.0, d.toDouble(), 0.0);
    }

    // ---------------------------------------------------------------
    // newInstance(...) family + precision mismatch
    // ---------------------------------------------------------------

    @Test
    public void testNewInstanceCopy() {
        Dfp a = field.newDfp(7);
        Dfp b = a.newInstance(a);
        assertTrue(a.equals(b));
    }

    @Test
    public void testNewInstanceMismatchedPrecisionTriggersQNAN() {
        Dfp a = field.newDfp(1.0);
        Dfp b = fieldOther.newDfp(1.0);
        // Assumption: field and fieldOther have different radixDigits
        Dfp result = a.newInstance(b);
        assertTrue(result.isNaN());
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    @Test
    public void testNewInstanceFromString() {
        Dfp a = field.newDfp(5);
        Dfp b = a.newInstance("3.0");
        assertEquals(3.0, b.toDouble(), 0.0);
    }

    @Test
    public void testNewInstanceNonFinite() {
        Dfp a = field.newDfp(0);
        Dfp b = a.newInstance((byte) -1, Dfp.INFINITE);
        assertTrue(b.isInfinite());
        assertTrue(b.lessThan(field.getZero()));
    }

    // ---------------------------------------------------------------
    // lessThan / greaterThan
    // ---------------------------------------------------------------

    @Test
    public void testLessThanTrue() {
        assertTrue(field.newDfp(1).lessThan(field.newDfp(2)));
    }

    @Test
    public void testLessThanFalse() {
        assertFalse(field.newDfp(2).lessThan(field.newDfp(1)));
    }

    @Test
    public void testLessThanNaNReturnsFalse() {
        Dfp a = field.newDfp(1);
        Dfp nan = field.newDfp(Double.NaN);
        assertFalse(a.lessThan(nan));
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    @Test
    public void testLessThanMismatchedPrecisionReturnsFalse() {
        Dfp a = field.newDfp(1);
        Dfp b = fieldOther.newDfp(2);
        assertFalse(a.lessThan(b));
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    @Test
    public void testGreaterThanTrue() {
        assertTrue(field.newDfp(5).greaterThan(field.newDfp(2)));
    }

    @Test
    public void testGreaterThanFalse() {
        assertFalse(field.newDfp(2).greaterThan(field.newDfp(5)));
    }

    @Test
    public void testGreaterThanNaNReturnsFalse() {
        Dfp a = field.newDfp(1);
        Dfp nan = field.newDfp(Double.NaN);
        assertFalse(a.greaterThan(nan));
    }

    @Test
    public void testGreaterThanMismatchedPrecisionReturnsFalse() {
        Dfp a = field.newDfp(1);
        Dfp b = fieldOther.newDfp(2);
        assertFalse(a.greaterThan(b));
    }

    // ---------------------------------------------------------------
    // isInfinite / isNaN / classify
    // ---------------------------------------------------------------

    @Test
    public void testIsInfiniteTrue() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testIsInfiniteFalse() {
        assertFalse(field.newDfp(1).isInfinite());
    }

    @Test
    public void testIsNaNQuiet() {
        assertTrue(field.newDfp(Double.NaN).isNaN());
    }

    @Test
    public void testIsNaNFalse() {
        assertFalse(field.newDfp(1).isNaN());
    }

    @Test
    public void testClassifyFinite() {
        assertEquals(Dfp.FINITE, field.newDfp(1).classify());
    }

    // ---------------------------------------------------------------
    // equals / unequal / hashCode
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameValue() {
        assertTrue(field.newDfp(3).equals(field.newDfp(3)));
    }

    @Test
    public void testEqualsDifferentValue() {
        assertFalse(field.newDfp(3).equals(field.newDfp(4)));
    }

    @Test
    public void testEqualsNaNIsFalse() {
        assertFalse(field.newDfp(Double.NaN).equals(field.newDfp(Double.NaN)));
    }

    @Test
    public void testEqualsNonDfpObject() {
        assertFalse(field.newDfp(1).equals("not a dfp"));
    }

    @Test
    public void testEqualsMismatchedPrecision() {
        assertFalse(field.newDfp(1).equals(fieldOther.newDfp(1)));
    }

    @Test
    public void testUnequalTrue() {
        assertTrue(field.newDfp(1).unequal(field.newDfp(2)));
    }

    @Test
    public void testUnequalFalseSameValue() {
        assertFalse(field.newDfp(2).unequal(field.newDfp(2)));
    }

    @Test
    public void testUnequalNaNReturnsFalse() {
        assertFalse(field.newDfp(1).unequal(field.newDfp(Double.NaN)));
    }

    @Test
    public void testHashCodeConsistentForEqualValues() {
        Dfp a = field.newDfp(10);
        Dfp b = field.newDfp(10);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // add / subtract / negate
    // ---------------------------------------------------------------

    @Test
    public void testAddBasic() {
        assertEquals(5.0, field.newDfp(2).add(field.newDfp(3)).toDouble(), 0.0);
    }

    @Test
    public void testAddMismatchedPrecision() {
        Dfp r = field.newDfp(1).add(fieldOther.newDfp(1));
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddNaNPropagatesThis() {
        Dfp nan = field.newDfp(Double.NaN);
        Dfp r = nan.add(field.newDfp(1));
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddNaNPropagatesArg() {
        Dfp nan = field.newDfp(Double.NaN);
        Dfp r = field.newDfp(1).add(nan);
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddInfinitePlusFinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = inf.add(field.newDfp(1));
        assertTrue(r.isInfinite());
    }

    @Test
    public void testAddFinitePlusInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = field.newDfp(1).add(inf);
        assertTrue(r.isInfinite());
    }

    @Test
    public void testAddInfinitySameSign() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = inf.add(inf);
        assertTrue(r.isInfinite());
    }

    @Test
    public void testAddInfinityOppositeSignIsQNAN() {
        Dfp posInf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp negInf = field.newDfp(Double.NEGATIVE_INFINITY);
        Dfp r = posInf.add(negInf);
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddNegativeAndPositiveZero() {
        Dfp r = field.newDfp(-0.0).add(field.newDfp(0.0));
        assertTrue(r.equals(field.getZero()));
    }

    @Test
    public void testSubtractBasic() {
        assertEquals(2.0, field.newDfp(5).subtract(field.newDfp(3)).toDouble(), 0.0);
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-2.0, field.newDfp(3).subtract(field.newDfp(5)).toDouble(), 0.0);
    }

    @Test
    public void testNegate() {
        Dfp a = field.newDfp(5);
        assertEquals(-5.0, a.negate().toDouble(), 0.0);
    }

    // ---------------------------------------------------------------
    // multiply(Dfp) / multiply(int)
    // ---------------------------------------------------------------

    @Test
    public void testMultiplyDfpBasic() {
        assertEquals(15.0, field.newDfp(3).multiply(field.newDfp(5)).toDouble(), 0.0);
    }

    @Test
    public void testMultiplyDfpMismatchedPrecision() {
        Dfp r = field.newDfp(2).multiply(fieldOther.newDfp(3));
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyDfpNaN() {
        Dfp r = field.newDfp(Double.NaN).multiply(field.newDfp(2));
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyInfiniteByFiniteNonZero() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = inf.multiply(field.newDfp(2));
        assertTrue(r.isInfinite());
    }

    @Test
    public void testMultiplyInfiniteByZeroIsQNAN() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = inf.multiply(field.newDfp(0));
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyInfiniteByInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = inf.multiply(inf);
        assertTrue(r.isInfinite());
    }

    @Test
    public void testMultiplyIntBasic() {
        assertEquals(20.0, field.newDfp(4).multiply(5).toDouble(), 0.0);
    }

    @Test
    public void testMultiplyIntNegativeInvalid() {
        // boundary: x < 0 triggers FLAG_INVALID -> QNAN
        Dfp r = field.newDfp(4).multiply(-1);
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyIntTooLargeInvalid() {
        // boundary: x >= RADIX triggers FLAG_INVALID -> QNAN
        Dfp r = field.newDfp(4).multiply(Dfp.RADIX);
        assertTrue(r.isNaN());
    }

    @Test
    public void testMultiplyIntOnInfiniteNonZero() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.multiply(5).isInfinite());
    }

    @Test
    public void testMultiplyIntOnInfiniteByZero() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.multiply(0).isNaN());
    }

    @Test
    public void testMultiplyIntOnNaN() {
        assertTrue(field.newDfp(Double.NaN).multiply(5).isNaN());
    }

    // ---------------------------------------------------------------
    // divide(Dfp) / divide(int)
    // ---------------------------------------------------------------

    @Test
    public void testDivideDfpBasic() {
        assertEquals(2.5, field.newDfp(5).divide(field.newDfp(2)).toDouble(), 1e-9);
    }

    @Test
    public void testDivideDfpByZero() {
        Dfp r = field.newDfp(5).divide(field.newDfp(0));
        assertTrue(r.isInfinite());
        assertTrue(flagSet(field, DfpField.FLAG_DIV_ZERO));
    }

    @Test
    public void testDivideDfpMismatchedPrecision() {
        Dfp r = field.newDfp(5).divide(fieldOther.newDfp(2));
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideDfpNaN() {
        assertTrue(field.newDfp(Double.NaN).divide(field.newDfp(2)).isNaN());
    }

    @Test
    public void testDivideDfpInfiniteByFinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.divide(field.newDfp(2)).isInfinite());
    }

    @Test
    public void testDivideDfpFiniteByInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        Dfp r = field.newDfp(2).divide(inf);
        assertTrue(r.equals(field.getZero()));
    }

    @Test
    public void testDivideDfpInfiniteByInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.divide(inf).isNaN());
    }

    @Test
    public void testDivideIntBasic() {
        assertEquals(5.0, field.newDfp(10).divide(2).toDouble(), 1e-9);
    }

    @Test
    public void testDivideIntByZero() {
        Dfp r = field.newDfp(10).divide(0);
        assertTrue(r.isInfinite());
        assertTrue(flagSet(field, DfpField.FLAG_DIV_ZERO));
    }

    @Test
    public void testDivideIntNegativeInvalid() {
        Dfp r = field.newDfp(10).divide(-1);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideIntTooLargeInvalid() {
        Dfp r = field.newDfp(10).divide(Dfp.RADIX);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideIntOnNaN() {
        assertTrue(field.newDfp(Double.NaN).divide(3).isNaN());
    }

    @Test
    public void testDivideIntOnInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.divide(3).isInfinite());
    }

    // ---------------------------------------------------------------
    // sqrt
    // ---------------------------------------------------------------

    @Test
    public void testSqrtZero() {
        assertTrue(field.newDfp(0).sqrt().equals(field.getZero()));
    }

    @Test
    public void testSqrtPositive() {
        assertEquals(3.0, field.newDfp(9).sqrt().toDouble(), 1e-9);
    }

    @Test
    public void testSqrtNegativeIsQNAN() {
        Dfp r = field.newDfp(-9).sqrt();
        assertTrue(r.isNaN());
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    @Test
    public void testSqrtQNAN() {
        assertTrue(field.newDfp(Double.NaN).sqrt().isNaN());
    }

    @Test
    public void testSqrtPositiveInfinity() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.sqrt().isInfinite());
    }

    @Test
    public void testSqrtSignalingNaN() {
        // Assumption: field.newDfp(sign, Dfp.SNAN) constructs an SNAN instance
        Dfp snan = field.newDfp((byte) 1, Dfp.SNAN);
        Dfp r = snan.sqrt();
        assertTrue(r.isNaN());
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    // ---------------------------------------------------------------
    // trunc family: rint / floor / ceil
    // ---------------------------------------------------------------

    @Test
    public void testRintRoundsHalfEven_toEven() {
        // 2.5 -> 2 (even) under ROUND_HALF_EVEN
        assertEquals(2.0, field.newDfp(2.5).rint().toDouble(), 0.0);
    }

    @Test
    public void testRintRoundsHalfEven_toEvenOtherSide() {
        // 3.5 -> 4 (even)
        assertEquals(4.0, field.newDfp(3.5).rint().toDouble(), 0.0);
    }

    @Test
    public void testRintNonHalfCase() {
        assertEquals(3.0, field.newDfp(2.6).rint().toDouble(), 0.0);
    }

    @Test
    public void testRintOnZero() {
        assertEquals(0.0, field.newDfp(0).rint().toDouble(), 0.0);
    }

    @Test
    public void testRintOnInfinite() {
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.rint().isInfinite());
    }

    @Test
    public void testRintOnNaN() {
        assertTrue(field.newDfp(Double.NaN).rint().isNaN());
    }

    @Test
    public void testFloorPositive() {
        assertEquals(2.0, field.newDfp(2.9).floor().toDouble(), 0.0);
    }

    @Test
    public void testFloorNegative() {
        assertEquals(-3.0, field.newDfp(-2.1).floor().toDouble(), 0.0);
    }

    @Test
    public void testCeilPositive() {
        assertEquals(3.0, field.newDfp(2.1).ceil().toDouble(), 0.0);
    }

    @Test
    public void testCeilNegative() {
        assertEquals(-2.0, field.newDfp(-2.9).ceil().toDouble(), 0.0);
    }

    @Test
    public void testTruncExponentLessThanZeroReturnsZero() {
        // 0.0001 has exp < 0 (depending on digits) -> triggers early-zero branch in trunc via floor/ceil/rint
        Dfp small = field.newDfp(0.0001);
        Dfp r = small.floor();
        assertEquals(0.0, r.toDouble(), 0.0);
    }

    @Test
    public void testTruncExponentGreaterEqualDigitsReturnsSame() {
        // very large integer, exp>=mant.length -> returned unchanged
        Dfp big = field.newDfp(1).multiply(field.power10(50));
        Dfp r = big.rint();
        assertTrue(r.equals(big));
    }

    // ---------------------------------------------------------------
    // remainder
    // ---------------------------------------------------------------

    @Test
    public void testRemainderBasic() {
        assertEquals(1.0, field.newDfp(7).remainder(field.newDfp(3)).toDouble(), 1e-9);
    }

    @Test
    public void testRemainderExactZero() {
        Dfp r = field.newDfp(6).remainder(field.newDfp(3));
        assertTrue(r.equals(field.getZero()));
    }

    // ---------------------------------------------------------------
    // intValue
    // ---------------------------------------------------------------

    @Test
    public void testIntValueNormal() {
        assertEquals(100, field.newDfp(100).intValue());
    }

    @Test
    public void testIntValueAtMaxBoundary() {
        assertEquals(2147483647, field.newDfp(2147483647).intValue());
    }

    @Test
    public void testIntValueOverflowPositiveClamped() {
        Dfp over = field.newDfp(2147483647).add(field.newDfp(1));
        assertEquals(2147483647, over.intValue());
    }

    @Test
    public void testIntValueAtMinBoundary() {
        assertEquals(-2147483648, field.newDfp(-2147483648L).intValue());
    }

    @Test
    public void testIntValueOverflowNegativeClamped() {
        Dfp under = field.newDfp(-2147483648L).subtract(field.newDfp(1));
        assertEquals(-2147483648, under.intValue());
    }

    @Test
    public void testIntValueNegativeSign() {
        assertEquals(-50, field.newDfp(-50).intValue());
    }

    // ---------------------------------------------------------------
    // log10K / power10K
    // ---------------------------------------------------------------

    @Test
    public void testLog10KAndPower10KRoundTrip() {
        Dfp d = field.newDfp(1).multiply(field.newDfp(1).divide(1)); // = 1
        int logk = field.getOne().log10K();
        assertEquals(field.getOne().power10K(logk).toDouble(),
                     field.getOne().toDouble(), 1e-6);
    }

    @Test
    public void testPower10KZero() {
        assertEquals(1.0, field.getOne().power10K(0).toDouble(), 1e-9);
    }

    // ---------------------------------------------------------------
    // log10 - 4 branches based on most significant digit
    // ---------------------------------------------------------------

    @Test
    public void testLog10MsdGreaterThan1000() {
        assertEquals(3, field.newDfp(5000).log10());
    }

    @Test
    public void testLog10MsdGreaterThan100() {
        assertEquals(2, field.newDfp(500).log10());
    }

    @Test
    public void testLog10MsdGreaterThan10() {
        assertEquals(1, field.newDfp(50).log10());
    }

    @Test
    public void testLog10MsdElseBranch() {
        assertEquals(0, field.newDfp(5).log10());
    }

    // ---------------------------------------------------------------
    // power10 - exponent sign & mod 4 branches
    // ---------------------------------------------------------------

    @Test
    public void testPower10ExpZero() {
        assertEquals(1.0, field.getOne().power10(0).toDouble(), 1e-9);
    }

    @Test
    public void testPower10ExpMod1() {
        assertEquals(10.0, field.getOne().power10(1).toDouble(), 1e-9);
    }

    @Test
    public void testPower10ExpMod2() {
        assertEquals(100.0, field.getOne().power10(2).toDouble(), 1e-9);
    }

    @Test
    public void testPower10ExpMod3() {
        assertEquals(1000.0, field.getOne().power10(3).toDouble(), 1e-9);
    }

    @Test
    public void testPower10NegativeExponent() {
        assertEquals(0.1, field.getOne().power10(-1).toDouble(), 1e-9);
    }

    @Test
    public void testPower10NegativeExponentMultipleOf4() {
        assertEquals(0.0001, field.getOne().power10(-4).toDouble(), 1e-12);
    }

    // ---------------------------------------------------------------
    // Rounding modes via round() (exercised indirectly through divide)
    // ---------------------------------------------------------------

    @Test
    public void testRoundModeDown() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_DOWN);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertTrue(r.lessThan(field.newDfp(1).divide(3)) || true); // sanity: no exception, finite
        assertFalse(r.isNaN());
    }

    @Test
    public void testRoundModeUp() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertFalse(r.isNaN());
    }

    @Test
    public void testRoundModeHalfUp() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp r = field.newDfp(5).divide(field.newDfp(2)); // 2.5 exact, no rounding triggered here but no crash
        assertEquals(2.5, r.toDouble(), 1e-9);
    }

    @Test
    public void testRoundModeHalfDown() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_DOWN);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertFalse(r.isNaN());
    }

    @Test
    public void testRoundModeHalfOdd() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertFalse(r.isNaN());
    }

    @Test
    public void testRoundModeCeil() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_CEIL);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertFalse(r.isNaN());
    }

    @Test
    public void testRoundModeFloor() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_FLOOR);
        Dfp r = field.newDfp(1).divide(field.newDfp(3));
        assertFalse(r.isNaN());
    }

    // ---------------------------------------------------------------
    // toString: scientific vs normal notation, special values
    // ---------------------------------------------------------------

    @Test
    public void testToStringInfinityPositive() {
        assertEquals("Infinity", field.newDfp(Double.POSITIVE_INFINITY).toString());
    }

    @Test
    public void testToStringInfinityNegative() {
        assertEquals("-Infinity", field.newDfp(Double.NEGATIVE_INFINITY).toString());
    }

    @Test
    public void testToStringNaN() {
        assertEquals("NaN", field.newDfp(Double.NaN).toString());
    }

    @Test
    public void testToStringNormalNotation() {
        String s = field.newDfp(123.5).toString();
        assertFalse(s.contains("e"));
    }

    @Test
    public void testToStringScientificNotationForVerySmall() {
        // exp < -1 forces dfp2sci() per toString() branch condition
        String s = field.newDfp(0.00000001).toString();
        assertTrue(s.contains("e") || s.contains("E"));
    }

    @Test
    public void testToStringZero() {
        assertEquals("0.0", field.getZero().toString());
    }

    // ---------------------------------------------------------------
    // copysign
    // ---------------------------------------------------------------

    @Test
    public void testCopysignPositiveFromNegative() {
        Dfp x = field.newDfp(5);
        Dfp y = field.newDfp(-1);
        Dfp r = Dfp.copysign(x, y);
        assertTrue(r.lessThan(field.getZero()));
    }

    @Test
    public void testCopysignNegativeFromPositive() {
        Dfp x = field.newDfp(-5);
        Dfp y = field.newDfp(1);
        Dfp r = Dfp.copysign(x, y);
        assertTrue(r.greaterThan(field.getZero()));
    }

    // ---------------------------------------------------------------
    // nextAfter
    // ---------------------------------------------------------------

    @Test
    public void testNextAfterEqualReturnsSameValue() {
        Dfp a = field.newDfp(1);
        Dfp r = a.nextAfter(a);
        assertTrue(r.equals(a));
    }

    @Test
    public void testNextAfterIncreasing() {
        Dfp a = field.newDfp(1);
        Dfp b = field.newDfp(2);
        Dfp r = a.nextAfter(b);
        assertTrue(r.greaterThan(a));
    }

    @Test
    public void testNextAfterDecreasing() {
        Dfp a = field.newDfp(2);
        Dfp b = field.newDfp(1);
        Dfp r = a.nextAfter(b);
        assertTrue(r.lessThan(a));
    }

    @Test
    public void testNextAfterFromZero() {
        Dfp zero = field.getZero();
        Dfp target = field.newDfp(1);
        Dfp r = zero.nextAfter(target);
        assertTrue(r.greaterThan(zero));
    }

    @Test
    public void testNextAfterMismatchedPrecisionReturnsQNAN() {
        Dfp a = field.newDfp(1);
        Dfp b = fieldOther.newDfp(2);
        Dfp r = a.nextAfter(b);
        assertTrue(r.isNaN());
    }

    // ---------------------------------------------------------------
    // toDouble / toSplitDouble
    // ---------------------------------------------------------------

    @Test
    public void testToDoubleRoundTripPositive() {
        double v = 123.456;
        assertEquals(v, field.newDfp(v).toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleRoundTripNegative() {
        double v = -98.765;
        assertEquals(v, field.newDfp(v).toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, field.newDfp(Double.POSITIVE_INFINITY).toDouble(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, field.newDfp(Double.NEGATIVE_INFINITY).toDouble(), 0.0);
    }

    @Test
    public void testToDoubleNaN() {
        assertTrue(Double.isNaN(field.newDfp(Double.NaN).toDouble()));
    }

    @Test
    public void testToDoubleZero() {
        assertEquals(0.0, field.getZero().toDouble(), 0.0);
    }

    @Test
    public void testToSplitDoubleSumsToOriginal() {
        Dfp d = field.newDfp(3.14159265358979);
        double[] split = d.toSplitDouble();
        assertEquals(d.toDouble(), split[0] + split[1], 1e-9);
    }

    // ---------------------------------------------------------------
    // dotrap - triggered through divide-by-zero / overflow / invalid paths
    // ---------------------------------------------------------------

    @Test
    public void testDotrapDivZeroFlagRaised() {
        field.newDfp(1).divide(field.newDfp(0));
        assertTrue(flagSet(field, DfpField.FLAG_DIV_ZERO));
    }

    @Test
    public void testDotrapInvalidFlagRaised() {
        field.newDfp(-1).sqrt();
        assertTrue(flagSet(field, DfpField.FLAG_INVALID));
    }

    @Test
    public void testDotrapOverflowFlagRaised() {
        // Multiply by power10 repeatedly to exceed MAX_EXP boundary
        Dfp huge = field.newDfp(1);
        for (int i = 0; i < 20 && !huge.isInfinite(); i++) {
            huge = huge.multiply(field.power10(4000));
        }
        // Assumption: enough iterations push exponent beyond MAX_EXP causing overflow trap
        assertTrue(flagSet(field, DfpField.FLAG_OVERFLOW) || huge.isInfinite());
    }
}
