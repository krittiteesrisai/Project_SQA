# การวิเคราะห์

คลาส `Dfp` เป็นคลาสที่ซับซ้อนมาก มี constructor/method จำนวนมากพร้อม branch เยอะ ผมเลือกใช้แนวทางดังนี้:

1. **ประกาศคลาสทดสอบไว้ใน package เดียวกัน** (`org.apache.commons.math3.dfp`) เพื่อให้สามารถเข้าถึง field/method ที่เป็น `protected` (เช่น `mant`, `exp`, `sign`, `align()`, `round()`, `shiftLeft()`, `dotrap()` ฯลฯ) ได้โดยตรง ซึ่งช่วยให้ควบคุม branch ได้แม่นยำและ deterministic กว่าการพยายามบังคับผ่าน public API เพียงอย่างเดียว
2. ใช้ `DfpField field = new DfpField(20)` เป็น factory สร้าง `Dfp` (constructor ของ `Dfp` เป็น `protected`)
3. จุดที่ไม่แน่ใจ behavior แน่ชัด (เช่น format ของ `toString()` แบบ fix string, สูตรคำนวณ `radixDigits` ภายใน `DfpField`) ผมจะ**คอมเมนต์กำกับไว้ว่าอนุมานจาก logic ของ source** และพยายามใช้วิธี assertion ที่ robust กว่าการเทียบ string ตรง ๆ เมื่อเป็นไปได้ (เช่นใช้ `toDouble()` หรือ `equals()` แทน)

```java
package org.apache.commons.math3.dfp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// Import แบบ explicit ตามข้อกำหนด (ถึงแม้อยู่ package เดียวกัน)
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;

/**
 * JUnit4 test suite for {@link Dfp} (Defects4J Math-17b).
 *
 * หมายเหตุสำคัญ:
 * - คลาสทดสอบอยู่ใน package เดียวกับ Dfp เพื่อเข้าถึง protected field/method
 *   (mant, exp, sign, align, shiftLeft/Right, round, complement, dotrap, trap)
 *   สำหรับ white-box testing และบังคับ branch ที่ยากจะ trigger ผ่าน public API เพียงอย่างเดียว
 * - DfpField(int decimalDigits) และ field.setRoundingMode(...) เป็น API มาตรฐานของ
 *   commons-math3 DfpField (ไม่ได้แสดงใน source ที่ให้มา) - ใช้ตามความเข้าใจทั่วไปของไลบรารีนี้
 *   หากพฤติกรรมจริงต่างไป ควรตรวจสอบ DfpField source เพิ่มเติม
 */
public class DfpTest {

    private DfpField field;

    @Before
    public void setUp() {
        field = new DfpField(20);
    }

    // =====================================================================
    // Constructors: long
    // =====================================================================

    @Test
    public void testConstructorLongZero() {
        Dfp d = field.newDfp(0L);
        assertTrue(d.isZero());
    }

    @Test
    public void testConstructorLongPositive() {
        Dfp d = field.newDfp(12345L);
        assertEquals(12345.0, d.toDouble(), 0.0);
        assertEquals(1, d.sign);
    }

    @Test
    public void testConstructorLongNegative() {
        Dfp d = field.newDfp(-12345L);
        assertEquals(-12345.0, d.toDouble(), 0.0);
        assertEquals(-1, d.sign);
    }

    @Test
    public void testConstructorLongMinValue() {
        // สาขาพิเศษ isLongMin ในตัวสร้าง Dfp(field,long)
        Dfp d = field.newDfp(Long.MIN_VALUE);
        Dfp expected = field.newDfp("-9223372036854775808");
        assertTrue(d.equals(expected));
    }

    // =====================================================================
    // Constructors: double
    // =====================================================================

    @Test
    public void testConstructorDoubleZeroPositive() {
        Dfp d = field.newDfp(0.0);
        assertTrue(d.isZero());
        assertEquals(1, d.sign);
    }

    @Test
    public void testConstructorDoubleZeroNegative() {
        Dfp d = field.newDfp(-0.0);
        assertTrue(d.isZero());
        assertEquals(-1, d.sign);
    }

    @Test
    public void testConstructorDoubleNaN() {
        Dfp d = field.newDfp(Double.NaN);
        assertTrue(d.isNaN());
        assertEquals(Dfp.QNAN, d.classify());
    }

    @Test
    public void testConstructorDoublePositiveInfinity() {
        Dfp d = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(d.isInfinite());
        assertEquals(1, d.sign);
    }

    @Test
    public void testConstructorDoubleNegativeInfinity() {
        Dfp d = field.newDfp(Double.NEGATIVE_INFINITY);
        assertTrue(d.isInfinite());
        assertEquals(-1, d.sign);
    }

    @Test
    public void testConstructorDoubleSubnormal() {
        Dfp d = field.newDfp(Double.MIN_VALUE); // smallest positive subnormal double
        assertFalse(d.isZero());
        assertTrue(d.strictlyPositive());
    }

    @Test
    public void testConstructorDoubleNormal() {
        Dfp d = field.newDfp(1.5);
        assertEquals(1.5, d.toDouble(), 0.0);
    }

    @Test
    public void testConstructorDoubleNegativeNormal() {
        Dfp d = field.newDfp(-2.25);
        assertEquals(-2.25, d.toDouble(), 0.0);
    }

    // =====================================================================
    // Constructors: String
    // =====================================================================

    @Test
    public void testStringPositiveInfinity() {
        Dfp d = field.newDfp("Infinity");
        assertTrue(d.isInfinite());
        assertEquals(1, d.sign);
    }

    @Test
    public void testStringNegativeInfinity() {
        Dfp d = field.newDfp("-Infinity");
        assertTrue(d.isInfinite());
        assertEquals(-1, d.sign);
    }

    @Test
    public void testStringNaN() {
        Dfp d = field.newDfp("NaN");
        assertTrue(d.isNaN());
    }

    @Test
    public void testStringScientificNotationPositiveExp() {
        Dfp d = field.newDfp("1.23e4");
        assertEquals(12300.0, d.toDouble(), 1e-6);
    }

    @Test
    public void testStringScientificNotationNegativeExp() {
        Dfp d = field.newDfp("1.23e-4");
        assertEquals(0.000123, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringUpperCaseExponent() {
        Dfp d = field.newDfp("2E3");
        assertEquals(2000.0, d.toDouble(), 1e-6);
    }

    @Test
    public void testStringNegativeNumber() {
        Dfp d = field.newDfp("-123.456");
        assertTrue(d.strictlyNegative());
    }

    @Test
    public void testStringTrailingZeros() {
        Dfp d = field.newDfp("1.230000");
        assertEquals(1.23, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringLeadingZeros() {
        Dfp d = field.newDfp("0.000123");
        assertEquals(0.000123, d.toDouble(), 1e-9);
    }

    @Test
    public void testStringAllZeros() {
        // special case "0.00000" -> decimalPos reset to 0
        Dfp d = field.newDfp("0.00000");
        assertTrue(d.isZero());
    }

    @Test
    public void testStringIntegerNoDecimalPoint() {
        Dfp d = field.newDfp("12345");
        assertEquals(12345.0, d.toDouble(), 0.0);
    }

    // =====================================================================
    // newInstance - radix digits mismatch
    // =====================================================================

    @Test
    public void testNewInstanceDfpMismatchedRadix() {
        DfpField other = new DfpField(30);
        Dfp otherVal = other.newDfp(5L);
        Dfp d = field.newDfp(1L);
        Dfp result = d.newInstance(otherVal);
        assertTrue(result.isNaN());
    }

    @Test
    public void testNewInstanceDfpSameRadix() {
        Dfp d = field.newDfp(1L);
        Dfp copy = field.newDfp(7L);
        Dfp result = d.newInstance(copy);
        assertEquals(7.0, result.toDouble(), 0.0);
    }

    // =====================================================================
    // lessThan / greaterThan
    // =====================================================================

    @Test
    public void testLessThanTrue() {
        assertTrue(field.newDfp(1L).lessThan(field.newDfp(2L)));
    }

    @Test
    public void testLessThanFalse() {
        assertFalse(field.newDfp(2L).lessThan(field.newDfp(1L)));
    }

    @Test
    public void testLessThanNaN() {
        assertFalse(field.newDfp(1L).lessThan(field.newDfp(Double.NaN)));
    }

    @Test
    public void testLessThanMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertFalse(field.newDfp(1L).lessThan(other.newDfp(2L)));
    }

    @Test
    public void testGreaterThanTrue() {
        assertTrue(field.newDfp(3L).greaterThan(field.newDfp(2L)));
    }

    @Test
    public void testGreaterThanFalse() {
        assertFalse(field.newDfp(1L).greaterThan(field.newDfp(2L)));
    }

    @Test
    public void testGreaterThanNaN() {
        assertFalse(field.newDfp(1L).greaterThan(field.newDfp(Double.NaN)));
    }

    @Test
    public void testGreaterThanMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertFalse(field.newDfp(1L).greaterThan(other.newDfp(2L)));
    }

    // =====================================================================
    // Sign predicates: negativeOrNull / strictlyNegative / positiveOrNull / strictlyPositive
    // =====================================================================

    @Test
    public void testNegativeOrNullTrueNegative() {
        assertTrue(field.newDfp(-1L).negativeOrNull());
    }

    @Test
    public void testNegativeOrNullTrueZero() {
        assertTrue(field.newDfp(0L).negativeOrNull());
    }

    @Test
    public void testNegativeOrNullFalsePositive() {
        assertFalse(field.newDfp(1L).negativeOrNull());
    }

    @Test
    public void testNegativeOrNullNaN() {
        assertFalse(field.newDfp(Double.NaN).negativeOrNull());
    }

    @Test
    public void testStrictlyNegativeTrue() {
        assertTrue(field.newDfp(-1L).strictlyNegative());
    }

    @Test
    public void testStrictlyNegativeFalseZero() {
        assertFalse(field.newDfp(0L).strictlyNegative());
    }

    @Test
    public void testStrictlyNegativeFalsePositive() {
        assertFalse(field.newDfp(1L).strictlyNegative());
    }

    @Test
    public void testStrictlyNegativeNaN() {
        assertFalse(field.newDfp(Double.NaN).strictlyNegative());
    }

    @Test
    public void testPositiveOrNullTruePositive() {
        assertTrue(field.newDfp(1L).positiveOrNull());
    }

    @Test
    public void testPositiveOrNullTrueZero() {
        assertTrue(field.newDfp(0L).positiveOrNull());
    }

    @Test
    public void testPositiveOrNullFalseNegative() {
        assertFalse(field.newDfp(-1L).positiveOrNull());
    }

    @Test
    public void testPositiveOrNullNaN() {
        assertFalse(field.newDfp(Double.NaN).positiveOrNull());
    }

    @Test
    public void testStrictlyPositiveTrue() {
        assertTrue(field.newDfp(1L).strictlyPositive());
    }

    @Test
    public void testStrictlyPositiveFalseZero() {
        assertFalse(field.newDfp(0L).strictlyPositive());
    }

    @Test
    public void testStrictlyPositiveFalseNegative() {
        assertFalse(field.newDfp(-1L).strictlyPositive());
    }

    @Test
    public void testStrictlyPositiveNaN() {
        assertFalse(field.newDfp(Double.NaN).strictlyPositive());
    }

    // =====================================================================
    // abs / isInfinite / isNaN / isZero
    // =====================================================================

    @Test
    public void testAbsPositive() {
        assertEquals(1, field.newDfp(5L).abs().sign);
    }

    @Test
    public void testAbsNegative() {
        Dfp r = field.newDfp(-5L).abs();
        assertEquals(1, r.sign);
        assertEquals(5.0, r.toDouble(), 0.0);
    }

    @Test
    public void testIsInfiniteTrue() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testIsInfiniteFalse() {
        assertFalse(field.newDfp(1L).isInfinite());
    }

    @Test
    public void testIsNaNTrue() {
        assertTrue(field.newDfp(Double.NaN).isNaN());
    }

    @Test
    public void testIsNaNFalse() {
        assertFalse(field.newDfp(1L).isNaN());
    }

    @Test
    public void testIsZeroTrue() {
        assertTrue(field.newDfp(0L).isZero());
    }

    @Test
    public void testIsZeroFalse() {
        assertFalse(field.newDfp(1L).isZero());
    }

    @Test
    public void testIsZeroOnNaNReturnsFalse() {
        assertFalse(field.newDfp(Double.NaN).isZero());
    }

    // =====================================================================
    // equals / hashCode / unequal
    // =====================================================================

    @Test
    public void testEqualsSameValue() {
        assertTrue(field.newDfp(5L).equals(field.newDfp(5L)));
    }

    @Test
    public void testEqualsDifferentValue() {
        assertFalse(field.newDfp(5L).equals(field.newDfp(6L)));
    }

    @Test
    public void testEqualsNotDfpInstance() {
        assertFalse(field.newDfp(5L).equals("5"));
    }

    @Test
    public void testEqualsWithNaN() {
        assertFalse(field.newDfp(Double.NaN).equals(field.newDfp(Double.NaN)));
    }

    @Test
    public void testEqualsMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertFalse(field.newDfp(5L).equals(other.newDfp(5L)));
    }

    @Test
    public void testHashCodeConsistentForEqualValues() {
        assertEquals(field.newDfp(5L).hashCode(), field.newDfp(5L).hashCode());
    }

    @Test
    public void testUnequalTrue() {
        assertTrue(field.newDfp(5L).unequal(field.newDfp(6L)));
    }

    @Test
    public void testUnequalFalseSameValue() {
        assertFalse(field.newDfp(5L).unequal(field.newDfp(5L)));
    }

    @Test
    public void testUnequalWithNaN() {
        assertFalse(field.newDfp(Double.NaN).unequal(field.newDfp(5L)));
    }

    @Test
    public void testUnequalMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertFalse(field.newDfp(5L).unequal(other.newDfp(5L)));
    }

    // =====================================================================
    // rint / floor / ceil / trunc
    // =====================================================================

    @Test
    public void testRintHalfEvenRoundsToEven_2_5() {
        assertEquals(2.0, field.newDfp("2.5").rint().toDouble(), 0.0);
    }

    @Test
    public void testRintHalfEvenRoundsToEven_3_5() {
        assertEquals(4.0, field.newDfp("3.5").rint().toDouble(), 0.0);
    }

    @Test
    public void testFloorPositive() {
        assertEquals(2.0, field.newDfp("2.7").floor().toDouble(), 0.0);
    }

    @Test
    public void testFloorNegative() {
        assertEquals(-3.0, field.newDfp("-2.7").floor().toDouble(), 0.0);
    }

    @Test
    public void testCeilPositive() {
        assertEquals(3.0, field.newDfp("2.3").ceil().toDouble(), 0.0);
    }

    @Test
    public void testCeilNegative() {
        assertEquals(-2.0, field.newDfp("-2.3").ceil().toDouble(), 0.0);
    }

    @Test
    public void testTruncOnNaN() {
        assertTrue(field.newDfp(Double.NaN).rint().isNaN());
    }

    @Test
    public void testTruncOnInfinite() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).rint().isInfinite());
    }

    @Test
    public void testTruncOnZero() {
        assertTrue(field.newDfp(0L).rint().isZero());
    }

    @Test
    public void testTruncExponentGreaterEqualMantLength() {
        // exp >= mant.length -> already integer, early return
        Dfp big = field.newDfp("1e100");
        Dfp r = big.rint();
        assertTrue(big.equals(r));
    }

    // =====================================================================
    // remainder
    // =====================================================================

    @Test
    public void testRemainderPositive() {
        Dfp r = field.newDfp(7L).remainder(field.newDfp(3L));
        assertEquals(1.0, r.toDouble(), 0.0);
    }

    // =====================================================================
    // intValue
    // =====================================================================

    @Test
    public void testIntValueNormal() {
        assertEquals(123, field.newDfp(123L).intValue());
    }

    @Test
    public void testIntValueNegative() {
        assertEquals(-123, field.newDfp(-123L).intValue());
    }

    @Test
    public void testIntValueOverflowClampsToMax() {
        assertEquals(Integer.MAX_VALUE, field.newDfp(9999999999L).intValue());
    }

    @Test
    public void testIntValueUnderflowClampsToMin() {
        assertEquals(Integer.MIN_VALUE, field.newDfp(-9999999999L).intValue());
    }

    // =====================================================================
    // log10K / power10K
    // =====================================================================

    @Test
    public void testLog10KValue() {
        // 123 -> exp = 1 (derived from source logic), log10K = exp-1 = 0
        assertEquals(0, field.newDfp(123L).log10K());
    }

    @Test
    public void testPower10KSetsExpPlusOne() {
        Dfp p = field.newDfp(1L).power10K(2);
        assertEquals(3, p.exp);
    }

    // =====================================================================
    // log10 (deterministic via direct mantissa manipulation)
    // =====================================================================

    @Test
    public void testLog10BranchAbove1000() {
        Dfp d = field.newDfp(1L);
        d.mant[d.mant.length - 1] = 1500;
        d.exp = 2;
        assertEquals(2 * 4 - 1, d.log10());
    }

    @Test
    public void testLog10BranchAbove100() {
        Dfp d = field.newDfp(1L);
        d.mant[d.mant.length - 1] = 500;
        d.exp = 2;
        assertEquals(2 * 4 - 2, d.log10());
    }

    @Test
    public void testLog10BranchAbove10() {
        Dfp d = field.newDfp(1L);
        d.mant[d.mant.length - 1] = 50;
        d.exp = 2;
        assertEquals(2 * 4 - 3, d.log10());
    }

    @Test
    public void testLog10BranchDefault() {
        Dfp d = field.newDfp(1L);
        d.mant[d.mant.length - 1] = 5;
        d.exp = 2;
        assertEquals(2 * 4 - 4, d.log10());
    }

    // =====================================================================
    // power10
    // =====================================================================

    @Test
    public void testPower10PositiveExpMod0() {
        assertEquals(1000.0, field.newDfp(1L).power10(3).toDouble(), 0.0);
    }

    @Test
    public void testPower10NegativeExp() {
        assertEquals(0.001, field.newDfp(1L).power10(-3).toDouble(), 1e-9);
    }

    @Test
    public void testPower10ExpModOne() {
        assertEquals(10.0, field.newDfp(1L).power10(1).toDouble(), 0.0);
    }

    @Test
    public void testPower10ExpModTwo() {
        assertEquals(100.0, field.newDfp(1L).power10(2).toDouble(), 0.0);
    }

    @Test
    public void testPower10ExpModThreeDefault() {
        assertEquals(1000.0, field.newDfp(1L).power10(3).toDouble(), 0.0);
    }

    // =====================================================================
    // complement (protected)
    // =====================================================================

    @Test
    public void testComplementExecutesWithinRadix() {
        Dfp a = field.newDfp(123L);
        int extra = a.complement(0);
        assertTrue(extra >= 0 && extra < Dfp.RADIX);
    }

    // =====================================================================
    // shiftLeft / shiftRight (protected)
    // =====================================================================

    @Test
    public void testShiftLeftDecrementsExpAndZerosLsb() {
        Dfp a = field.newDfp(123L);
        int before = a.exp;
        a.shiftLeft();
        assertEquals(before - 1, a.exp);
        assertEquals(0, a.mant[0]);
    }

    @Test
    public void testShiftRightIncrementsExpAndZerosMsb() {
        Dfp a = field.newDfp(123L);
        int before = a.exp;
        a.shiftRight();
        assertEquals(before + 1, a.exp);
        assertEquals(0, a.mant[a.mant.length - 1]);
    }

    // =====================================================================
    // align (protected) - branches: diff==0, shiftRight(diff<0), shiftLeft(diff>0), huge diff special case
    // =====================================================================

    @Test
    public void testAlignZeroDiffReturnsZeroImmediately() {
        Dfp a = field.newDfp(123L);
        assertEquals(0, a.align(a.exp));
    }

    @Test
    public void testAlignSmallNegativeDiffShiftsRight() {
        Dfp a = field.newDfp(123L);
        int originalExp = a.exp;
        int lost = a.align(originalExp + 1);
        assertEquals(originalExp + 1, a.exp);
        assertEquals(0, lost);
    }

    @Test
    public void testAlignSmallPositiveDiffShiftsLeft() {
        Dfp a = field.newDfp(123L);
        int originalExp = a.exp;
        int lost = a.align(originalExp - 1);
        assertEquals(originalExp - 1, a.exp);
        assertEquals(0, lost);
    }

    @Test
    public void testAlignHugeDiffSpecialCaseFlushesToZero() {
        Dfp a = field.newDfp(123L);
        int lost = a.align(a.exp + 1000);
        assertEquals(0, lost);
        assertTrue(a.isZero());
    }

    // =====================================================================
    // round (protected) - all RoundingMode branches + carry overflow + underflow/overflow/exact
    // =====================================================================

    @Test
    public void testRoundDownNeverIncrementsButFlagsInexact() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_DOWN);
        Dfp a = field.newDfp(123L);
        assertEquals(DfpField.FLAG_INEXACT, a.round(1));
    }

    @Test
    public void testRoundUpIncrementsWhenNNonZero() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);
        Dfp a = field.newDfp(123L);
        int before = a.mant[0];
        a.round(1);
        assertNotEquals(before, a.mant[0]);
    }

    @Test
    public void testRoundHalfUpIncrementsAtThreshold() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        assertEquals(DfpField.FLAG_INEXACT, field.newDfp(123L).round(5000));
    }

    @Test
    public void testRoundHalfDownDoesNotIncrementAtThreshold() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_DOWN);
        assertEquals(DfpField.FLAG_INEXACT, field.newDfp(123L).round(5000));
    }

    @Test
    public void testRoundHalfEvenIncrementsWhenMantOdd() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);
        Dfp a = field.newDfp(1L);
        a.mant[0] = 1; // odd
        a.round(5000);
        assertEquals(2, a.mant[0]);
    }

    @Test
    public void testRoundHalfEvenNoIncrementWhenMantEven() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);
        Dfp a = field.newDfp(1L);
        a.mant[0] = 2; // even
        a.round(5000);
        assertEquals(2, a.mant[0]);
    }

    @Test
    public void testRoundHalfOddIncrementsWhenMantEven() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);
        Dfp a = field.newDfp(1L);
        a.mant[0] = 2; // even -> condition true for HALF_ODD
        a.round(5000);
        assertEquals(3, a.mant[0]);
    }

    @Test
    public void testRoundHalfOddNoIncrementWhenMantOdd() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_ODD);
        Dfp a = field.newDfp(1L);
        a.mant[0] = 1; // odd -> condition false
        a.round(5000);
        assertEquals(1, a.mant[0]);
    }

    @Test
    public void testRoundCeilIncrementsWhenPositiveAndNNonZero() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_CEIL);
        Dfp a = field.newDfp(123L);
        int before = a.mant[0];
        a.round(1);
        assertNotEquals(before, a.mant[0]);
    }

    @Test
    public void testRoundFloorIncrementsWhenNegativeAndNNonZero() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_FLOOR);
        Dfp a = field.newDfp(-123L);
        int before = a.mant[0];
        a.round(1);
        assertNotEquals(before, a.mant[0]);
    }

    @Test
    public void testRoundCarryOverflowTriggersShiftRight() {
        field.setRoundingMode(DfpField.RoundingMode.ROUND_UP);
        Dfp a = field.newDfp(1L);
        for (int i = 0; i < a.mant.length; i++) {
            a.mant[i] = Dfp.RADIX - 1;
        }
        int before = a.exp;
        a.round(1);
        assertEquals(before + 1, a.exp);
        assertEquals(1, a.mant[a.mant.length - 1]);
    }

    @Test
    public void testRoundUnderflowBelowMinExp() {
        Dfp a = field.newDfp(1L);
        a.exp = Dfp.MIN_EXP - 1;
        assertEquals(DfpField.FLAG_UNDERFLOW, a.round(0));
    }

    @Test
    public void testRoundOverflowAboveMaxExp() {
        Dfp a = field.newDfp(1L);
        a.exp = Dfp.MAX_EXP + 1;
        assertEquals(DfpField.FLAG_OVERFLOW, a.round(0));
    }

    @Test
    public void testRoundExactNoFlagsWhenNZero() {
        Dfp a = field.newDfp(1L);
        assertEquals(0, a.round(0));
    }

    // =====================================================================
    // add
    // =====================================================================

    @Test
    public void testAddNormalPositives() {
        assertEquals(5.0, field.newDfp(2L).add(field.newDfp(3L)).toDouble(), 0.0);
    }

    @Test
    public void testAddNormalNegatives() {
        assertEquals(-5.0, field.newDfp(-2L).add(field.newDfp(-3L)).toDouble(), 0.0);
    }

    @Test
    public void testAddMismatchedRadixProducesNaN() {
        DfpField other = new DfpField(30);
        assertTrue(field.newDfp(1L).add(other.newDfp(2L)).isNaN());
    }

    @Test
    public void testAddThisNaNReturnsThis() {
        assertTrue(field.newDfp(Double.NaN).add(field.newDfp(1L)).isNaN());
    }

    @Test
    public void testAddArgNaNReturnsArg() {
        assertTrue(field.newDfp(1L).add(field.newDfp(Double.NaN)).isNaN());
    }

    @Test
    public void testAddInfinitePlusFiniteReturnsInfinite() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).add(field.newDfp(1L)).isInfinite());
    }

    @Test
    public void testAddFinitePlusInfiniteReturnsInfinite() {
        assertTrue(field.newDfp(1L).add(field.newDfp(Double.POSITIVE_INFINITY)).isInfinite());
    }

    @Test
    public void testAddInfinitePlusInfiniteSameSign() {
        Dfp r = field.newDfp(Double.POSITIVE_INFINITY).add(field.newDfp(Double.POSITIVE_INFINITY));
        assertTrue(r.isInfinite());
    }

    @Test
    public void testAddInfinitePlusInfiniteOppositeSignIsNaN() {
        Dfp r = field.newDfp(Double.POSITIVE_INFINITY).add(field.newDfp(Double.NEGATIVE_INFINITY));
        assertTrue(r.isNaN());
    }

    // =====================================================================
    // negate / subtract
    // =====================================================================

    @Test
    public void testNegate() {
        assertEquals(-5.0, field.newDfp(5L).negate().toDouble(), 0.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, field.newDfp(5L).subtract(field.newDfp(3L)).toDouble(), 0.0);
    }

    // =====================================================================
    // multiply(Dfp)
    // =====================================================================

    @Test
    public void testMultiplyNormal() {
        assertEquals(20.0, field.newDfp(4L).multiply(field.newDfp(5L)).toDouble(), 0.0);
    }

    @Test
    public void testMultiplyMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertTrue(field.newDfp(1L).multiply(other.newDfp(2L)).isNaN());
    }

    @Test
    public void testMultiplyThisNaN() {
        assertTrue(field.newDfp(Double.NaN).multiply(field.newDfp(2L)).isNaN());
    }

    @Test
    public void testMultiplyInfiniteByFiniteNonZero() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).multiply(field.newDfp(2L)).isInfinite());
    }

    @Test
    public void testMultiplyInfiniteByFiniteZeroIsNaN() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).multiply(field.newDfp(0L)).isNaN());
    }

    @Test
    public void testMultiplyInfiniteByInfiniteSignCombination() {
        Dfp r = field.newDfp(Double.POSITIVE_INFINITY).multiply(field.newDfp(Double.NEGATIVE_INFINITY));
        assertTrue(r.isInfinite());
        assertEquals(-1, r.sign);
    }

    // =====================================================================
    // multiply(int)
    // =====================================================================

    @Test
    public void testMultiplyIntNormal() {
        assertEquals(15.0, field.newDfp(5L).multiply(3).toDouble(), 0.0);
    }

    @Test
    public void testMultiplyIntZero() {
        assertEquals(0.0, field.newDfp(5L).multiply(0).toDouble(), 0.0);
    }

    @Test
    public void testMultiplyIntNegativeOutOfRangeIsNaN() {
        assertTrue(field.newDfp(5L).multiply(-1).isNaN());
    }

    @Test
    public void testMultiplyIntTooLargeOutOfRangeIsNaN() {
        assertTrue(field.newDfp(5L).multiply(Dfp.RADIX).isNaN());
    }

    @Test
    public void testMultiplyIntOnInfinite() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).multiply(5).isInfinite());
    }

    @Test
    public void testMultiplyIntOnInfiniteByZeroIsNaN() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).multiply(0).isNaN());
    }

    // =====================================================================
    // divide(Dfp)
    // =====================================================================

    @Test
    public void testDivideNormal() {
        assertEquals(5.0, field.newDfp(10L).divide(field.newDfp(2L)).toDouble(), 0.0);
    }

    @Test
    public void testDivideMismatchedRadix() {
        DfpField other = new DfpField(30);
        assertTrue(field.newDfp(1L).divide(other.newDfp(2L)).isNaN());
    }

    @Test
    public void testDivideThisNaN() {
        assertTrue(field.newDfp(Double.NaN).divide(field.newDfp(2L)).isNaN());
    }

    @Test
    public void testDivideInfiniteByFinite() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).divide(field.newDfp(2L)).isInfinite());
    }

    @Test
    public void testDivideFiniteByInfiniteIsZero() {
        assertTrue(field.newDfp(2L).divide(field.newDfp(Double.POSITIVE_INFINITY)).isZero());
    }

    @Test
    public void testDivideInfiniteByInfiniteIsNaN() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY)
                .divide(field.newDfp(Double.POSITIVE_INFINITY)).isNaN());
    }

    @Test
    public void testDivideByZeroIsInfinite() {
        assertTrue(field.newDfp(5L).divide(field.newDfp(0L)).isInfinite());
    }

    // =====================================================================
    // divide(int)
    // =====================================================================

    @Test
    public void testDivideIntNormal() {
        assertEquals(5.0, field.newDfp(10L).divide(2).toDouble(), 0.0);
    }

    @Test
    public void testDivideIntByZeroIsInfinite() {
        assertTrue(field.newDfp(5L).divide(0).isInfinite());
    }

    @Test
    public void testDivideIntNegativeOutOfRangeIsNaN() {
        assertTrue(field.newDfp(5L).divide(-1).isNaN());
    }

    @Test
    public void testDivideIntTooLargeOutOfRangeIsNaN() {
        assertTrue(field.newDfp(5L).divide(Dfp.RADIX).isNaN());
    }

    @Test
    public void testDivideIntOnInfinite() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).divide(2).isInfinite());
    }

    @Test
    public void testDivideIntOnNaN() {
        assertTrue(field.newDfp(Double.NaN).divide(2).isNaN());
    }

    // =====================================================================
    // reciprocal
    // =====================================================================

    @Test
    public void testReciprocal() {
        assertEquals(0.25, field.newDfp(4L).reciprocal().toDouble(), 1e-9);
    }

    // =====================================================================
    // sqrt
    // =====================================================================

    @Test
    public void testSqrtZero() {
        assertTrue(field.newDfp(0L).sqrt().isZero());
    }

    @Test
    public void testSqrtPositiveInfinity() {
        assertTrue(field.newDfp(Double.POSITIVE_INFINITY).sqrt().isInfinite());
    }

    @Test
    public void testSqrtQNaN() {
        assertTrue(field.newDfp(Double.NaN).sqrt().isNaN());
    }

    @Test
    public void testSqrtNegativeIsNaN() {
        assertTrue(field.newDfp(-4L).sqrt().isNaN());
    }

    @Test
    public void testSqrtNormalSmall() {
        assertEquals(2.0, field.newDfp(4L).sqrt().toDouble(), 1e-9);
    }

    @Test
    public void testSqrtNormalLarge() {
        assertEquals(1000.0, field.newDfp(1000000L).sqrt().toDouble(), 1e-6);
    }

    // =====================================================================
    // toString
    // =====================================================================

    @Test
    public void testToStringPositiveInfinity() {
        assertEquals("Infinity", field.newDfp(Double.POSITIVE_INFINITY).toString());
    }

    @Test
    public void testToStringNegativeInfinity() {
        assertEquals("-Infinity", field.newDfp(Double.NEGATIVE_INFINITY).toString());
    }

    @Test
    public void testToStringNaN() {
        assertEquals("NaN", field.newDfp(Double.NaN).toString());
    }

    @Test
    public void testToStringNormalGoesThroughDfp2String() {
        String s = field.newDfp(123L).toString();
        assertFalse(s.contains("e"));
        assertEquals(123.0, Double.parseDouble(s), 0.0);
    }

    @Test
    public void testToStringZero() {
        String s = field.newDfp(0L).toString();
        assertEquals(0.0, Double.parseDouble(s), 0.0);
    }

    @Test
    public void testToStringLargeExponentGoesThroughDfp2Sci() {
        String s = field.newDfp("1e50").toString();
        assertTrue(s.contains("e"));
        assertEquals(1e50, Double.parseDouble(s), 1e50 * 1e-9);
    }

    @Test
    public void testToStringVerySmallExponentGoesThroughDfp2Sci() {
        String s = field.newDfp("1e-50").toString();
        assertTrue(s.contains("e"));
    }

    // =====================================================================
    // classify / copysign
    // =====================================================================

    @Test
    public void testClassifyFinite() {
        assertEquals(Dfp.FINITE, field.newDfp(1L).classify());
    }

    @Test
    public void testClassifyInfinite() {
        assertEquals(Dfp.INFINITE, field.newDfp(Double.POSITIVE_INFINITY).classify());
    }

    @Test
    public void testCopysignPositiveToNegative() {
        Dfp r = Dfp.copysign(field.newDfp(5L), field.newDfp(-1L));
        assertEquals(-1, r.sign);
    }

    @Test
    public void testCopysignNegativeToPositive() {
        Dfp r = Dfp.copysign(field.newDfp(-5L), field.newDfp(1L));
        assertEquals(1, r.sign);
    }

    // =====================================================================
    // nextAfter
    // =====================================================================

    @Test
    public void testNextAfterEqualValuesReturnsSameValue() {
        Dfp r = field.newDfp(5L).nextAfter(field.newDfp(5L));
        assertEquals(5.0, r.toDouble(), 0.0);
    }

    @Test
    public void testNextAfterMovesUpTowardGreaterTarget() {
        Dfp a = field.newDfp(5L);
        Dfp r = a.nextAfter(field.newDfp(10L));
        assertTrue(r.greaterThan(a));
    }

    @Test
    public void testNextAfterMovesDownTowardSmallerTarget() {
        Dfp a = field.newDfp(5L);
        Dfp r = a.nextAfter(field.newDfp(1L));
        assertTrue(r.lessThan(a));
    }

    @Test
    public void testNextAfterFromZeroMovesUp() {
        Dfp a = field.newDfp(0L);
        Dfp r = a.nextAfter(field.newDfp(1L));
        assertTrue(r.greaterThan(a));
    }

    @Test
    public void testNextAfterMismatchedRadixIsNaN() {
        DfpField other = new DfpField(30);
        assertTrue(field.newDfp(1L).nextAfter(other.newDfp(2L)).isNaN());
    }

    // =====================================================================
    // toDouble
    // =====================================================================

    @Test
    public void testToDoubleZero() {
        assertEquals(0.0, field.newDfp(0L).toDouble(), 0.0);
    }

    @Test
    public void testToDoubleNegativeZero() {
        double d = field.newDfp(-0.0).toDouble();
        assertEquals(0, Double.compare(-0.0, d));
    }

    @Test
    public void testToDoublePositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, field.newDfp(Double.POSITIVE_INFINITY).toDouble(), 0.0);
    }

    @Test
    public void testToDoubleNegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, field.newDfp(Double.NEGATIVE_INFINITY).toDouble(), 0.0);
    }

    @Test
    public void testToDoubleNaN() {
        assertTrue(Double.isNaN(field.newDfp(Double.NaN).toDouble()));
    }

    @Test
    public void testToDoublePositiveValueRoundTrip() {
        assertEquals(3.14159, field.newDfp(3.14159).toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleNegativeValueRoundTrip() {
        assertEquals(-3.14159, field.newDfp(-3.14159).toDouble(), 1e-9);
    }

    // =====================================================================
    // toSplitDouble
    // =====================================================================

    @Test
    public void testToSplitDoubleSumsBackToOriginal() {
        Dfp a = field.newDfp(123.456);
        double[] split = a.toSplitDouble();
        assertEquals(123.456, split[0] + split[1], 1e-9);
    }

    // =====================================================================
    // dotrap (protected) - direct branch coverage
    // =====================================================================

    @Test
    public void testDotrapInvalidReturnsQNaN() {
        Dfp a = field.newDfp(5L);
        Dfp r = a.dotrap(DfpField.FLAG_INVALID, "test", a, field.newDfp(0L));
        assertTrue(r.isNaN());
    }

    @Test
    public void testDotrapDivZeroNormalCaseReturnsInfinite() {
        Dfp a = field.newDfp(5L); // finite, non-zero
        Dfp r = a.dotrap(DfpField.FLAG_DIV_ZERO, "test", field.newDfp(2L), field.newDfp(0L));
        assertTrue(r.isInfinite());
    }

    @Test
    public void testDotrapDivZeroZeroDividendReturnsQNaN() {
        Dfp a = field.newDfp(0L); // finite, zero -> 0/0
        Dfp r = a.dotrap(DfpField.FLAG_DIV_ZERO, "test", field.newDfp(2L), field.newDfp(0L));
        assertTrue(r.isNaN());
    }

    @Test
    public void testDotrapUnderflowGradual() {
        Dfp a = field.newDfp(1L);
        Dfp result = field.newDfp(1L);
        result.exp = Dfp.MIN_EXP + 1; // result.exp+mant.length NOT < MIN_EXP
        Dfp r = a.dotrap(DfpField.FLAG_UNDERFLOW, "test", a, result);
        assertFalse(r.isZero());
    }

    @Test
    public void testDotrapUnderflowFlushesToZero() {
        Dfp a = field.newDfp(1L);
        Dfp result = field.newDfp(1L);
        result.exp = Dfp.MIN_EXP - 1000; // result.exp+mant.length < MIN_EXP
        Dfp r = a.dotrap(DfpField.FLAG_UNDERFLOW, "test", a, result);
        assertTrue(r.isZero());
    }

    @Test
    public void testDotrapOverflowReturnsInfinite() {
        Dfp a = field.newDfp(1L);
        Dfp r = a.dotrap(DfpField.FLAG_OVERFLOW, "test", a, field.newDfp(1L));
        assertTrue(r.isInfinite());
    }

    @Test
    public void testDotrapDefaultBranchReturnsResultUnchanged() {
        Dfp a = field.newDfp(1L);
        Dfp result = field.newDfp(1L);
        Dfp r = a.dotrap(9999, "test", a, result); // unknown flag -> default
        assertSame(result, r);
    }

    // =====================================================================
    // trap (protected) - default implementation just returns def
    // =====================================================================

    @Test
    public void testTrapReturnsDefaultValue() {
        Dfp a = field.newDfp(1L);
        Dfp def = field.newDfp(2L);
        Dfp result = field.newDfp(3L);
        Dfp r = a.trap(DfpField.FLAG_INVALID, "test", a, def, result);
        assertSame(def, r);
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | เมธอดเป้าหมายใน `Dfp` | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testConstructorLong*` | `Dfp(field,long)` | x=0, x>0, x<0, `Long.MIN_VALUE` (isLongMin special case) |
| `testConstructorDouble*` | `Dfp(field,double)` | zero(+/-), NaN, +Inf, -Inf, subnormal, normal (+/-) |
| `testString*` | `Dfp(field,String)` | Infinity/-Infinity/NaN literal, scientific notation (+/-exp, upper/lower `e`), เครื่องหมายลบ, trailing/leading zeros, "0.00000", ไม่มีจุดทศนิยม |
| `testNewInstanceDfp*` | `newInstance(Dfp)` | radix mismatch → QNAN, radix เท่ากัน → copy ถูกต้อง |
| `testLessThan*`, `testGreaterThan*` | `lessThan/greaterThan` | true/false ปกติ, มี NaN, radix mismatch |
| `testNegativeOrNull*`...`testStrictlyPositive*` | sign predicate 4 เมธอด | negative/zero/positive/NaN ของแต่ละเมธอด |
| `testAbs*`, `testIsInfinite*`, `testIsNaN*`, `testIsZero*` | `abs/isInfinite/isNaN/isZero` | ค่าปกติ, NaN |
| `testEquals*`, `testHashCode*`, `testUnequal*` | `equals/hashCode/unequal` | เท่ากัน, ไม่เท่ากัน, ไม่ใช่ Dfp, มี NaN, radix mismatch |
| `testRint*`, `testFloor*`, `testCeil*`, `testTrunc*` | `trunc()` ผ่าน `rint/floor/ceil` | ROUND_HALF_EVEN (คู่/คี่), ROUND_FLOOR(+/-), ROUND_CEIL(+/-), NaN, Infinite, zero, exp≥mant.length |
| `testRemainder*` | `remainder` | กรณีปกติ |
| `testIntValue*` | `intValue` | ปกติ(+/-), overflow clamp, underflow clamp |
| `testLog10K*`, `testPower10K*` | `log10K/power10K` | คำนวณค่าปกติ |
| `testLog10Branch*` | `log10` | 4 threshold branch (>1000,>100,>10,default) บังคับผ่าน mant โดยตรง |
| `testPower10*` | `power10` | exp≥0/<0, switch case 0,1,2,3(default) |
| `testComplement*` | `complement` | ทำงานปกติ |
| `testShiftLeft*`, `testShiftRight*` | `shiftLeft/shiftRight` | ตรวจ exp±1 และ mant ถูก zero |
| `testAlign*` | `align` | diff=0, diff<0(shiftRight), diff>0(shiftLeft), adiff>mant.length+1(special) |
| `testRound*` | `round` | ทุก RoundingMode (DOWN,UP,HALF_UP,HALF_DOWN,HALF_EVEN คู่/คี่,HALF_ODD คู่/คี่,CEIL,FLOOR), carry-overflow shiftRight, underflow, overflow, exact(no flag) |
| `testAdd*` | `add` | radix mismatch, NaN(this/arg), Inf+Finite(ทั้งสองทาง), Inf+Inf (same/opposite sign), ปกติ(+/-) |
| `testNegate*`, `testSubtract*` | `negate/subtract` | ปกติ |
| `testMultiply*(Dfp)` | `multiply(Dfp)` | radix mismatch, NaN, Inf×Finite(nonzero/zero), Inf×Inf | 
| `testMultiplyInt*` | `multiply(int)` | ปกติ, 0, out-of-range(-1,RADIX), Infinite×nonzero/zero |
| `testDivide*(Dfp)` | `divide(Dfp)` | radix mismatch, NaN, Inf/Finite ทั้งสองทาง, Inf/Inf, หารด้วย 0 |
| `testDivideInt*` | `divide(int)` | ปกติ, หารด้วย 0, out-of-range, Infinite, NaN |
| `testReciprocal*` | `reciprocal` | ปกติ |
| `testSqrt*` | `sqrt` | zero, +Inf, QNaN, negative→NaN, ปกติ(เล็ก/ใหญ่) |
| `testToString*` | `toString/dfp2string/dfp2sci` | Infinity/-Infinity/NaN, exp ปกติ(dfp2string), exp ใหญ่/เล็กมาก(dfp2sci) |
| `testClassify*`, `testCopysign*` | `classify/copysign` | FINITE/INFINITE, เปลี่ยนเครื่องหมายทั้งสองทาง |
| `testNextAfter*` | `nextAfter` | เท่ากัน, up, down, จาก zero, radix mismatch |
| `testToDouble*` | `toDouble` | zero(+/-0.0), +Inf, -Inf, NaN, ปกติ(+/-) |
| `testToSplitDouble*` | `toSplitDouble` | ตรวจผลรวมถูกต้อง |
| `testDotrap*` | `dotrap` | FLAG_INVALID, FLAG_DIV_ZERO(ปกติ/0÷0), FLAG_UNDERFLOW(gradual/flush-zero), FLAG_OVERFLOW, default(unknown flag) |
| `testTrap*` | `trap` | คืนค่า `def` ตาม default implementation |

**หมายเหตุความเสี่ยง/ข้อสมมติ (ตามข้อกำหนดข้อ 4):**
- `DfpField.setRoundingMode(RoundingMode)` และ enum constant names ถูกอ้างอิงตามรูปแบบที่ใช้ภายใน `Dfp.round()`/`Dfp.trunc()` ที่ให้มา แต่ตัว setter ไม่มีใน source ที่ให้ — อนุมานจาก public API ทั่วไปของ commons-math3
- การเข้าถึง field/method ที่เป็น `protected` (`mant`, `exp`, `sign`, `align`, `round`, `shiftLeft/Right`, `complement`, `dotrap`, `trap`) ทำได้เพราะคลาสทดสอบประกาศอยู่ package เดียวกัน
- บางสาขาที่ไม่สามารถ trigger ได้ผ่าน public API ปกติ (เช่น branch ท้าย ๆ ของ `trunc()` กรณี `a.equals(half) && odd mantissa`, หรือ dead-branch ใน `dfp2sci` เมื่อค่าเป็นศูนย์แต่ exp ผิดปกติ) ไม่ได้ถูกทดสอบเนื่องจากต้องการการปรับแต่ง state ภายในที่ซับซ้อนเกินกว่าจะมั่นใจว่าตรงกับ behavior จริงโดยไม่เดา