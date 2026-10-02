package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.lang3.math.NumberUtils (Defects4J Lang-24b)
 * เน้นความครอบคลุมของ branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
public class NumberUtilsTest {

    // ===================== toInt =====================

    @Test
    public void testToInt_null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_empty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_valid() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_invalid_returnsZero() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntDefault_null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntDefault_empty() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToIntDefault_valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test
    public void testToIntDefault_invalid() {
        assertEquals(5, NumberUtils.toInt("xx", 5));
    }

    @Test
    public void testToIntDefault_overflow() {
        // เกิน Integer range -> NumberFormatException ถูกจับ -> default
        assertEquals(9, NumberUtils.toInt("99999999999", 9));
    }

    // ===================== toLong =====================

    @Test
    public void testToLong_null() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_empty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_valid() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLongDefault_null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongDefault_invalid() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongDefault_overflow() {
        assertEquals(7L, NumberUtils.toLong("999999999999999999999999", 7L));
    }

    // ===================== toFloat =====================

    @Test
    public void testToFloat_null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_empty_returnsDefaultZero() {
        // "" ไม่ null แต่ parseFloat("") throw NFE -> default 0.0f
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloatDefault_null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloatDefault_invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0f);
    }

    // ===================== toDouble =====================

    @Test
    public void testToDouble_null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDoubleDefault_null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("xx", 1.1d), 0.0d);
    }

    // ===================== toByte =====================

    @Test
    public void testToByte_null() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_empty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByteDefault_null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteDefault_invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("xx", (byte) 1));
    }

    @Test
    public void testToByteDefault_overflow() {
        assertEquals((byte) 2, NumberUtils.toByte("999", (byte) 2));
    }

    // ===================== toShort =====================

    @Test
    public void testToShort_null() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_empty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_valid() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShortDefault_null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortDefault_invalid() {
        assertEquals((short) 1, NumberUtils.toShort("xx", (short) 1));
    }

    // ===================== create* helper methods =====================

    @Test
    public void testCreateFloat_null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_valid() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble_null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_valid() {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateInteger_null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_decimal() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_hex() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test
    public void testCreateInteger_octal() {
        // Integer.decode ตีความ leading 0 เป็น octal
        assertEquals(Integer.valueOf(8), NumberUtils.createInteger("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong_null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger_null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_valid() {
        assertEquals(new BigInteger("123456789012345678901234567890"),
                NumberUtils.createBigInteger("123456789012345678901234567890"));
    }

    @Test
    public void testCreateBigDecimal_null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test
    public void testCreateBigDecimal_valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    // ===================== createNumber =====================

    @Test
    public void testCreateNumber_null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_emptyString() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_doubleMinus() {
        // str.startsWith("--") -> return null (protection สำหรับ BigDecimal bug)
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hexPositive() {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexNegative() {
        Number n = NumberUtils.createNumber("-0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidHex() {
        NumberUtils.createNumber("0xZZZZ");
    }

    @Test
    public void testCreateNumber_plainInteger() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_plainLong() {
        // เกิน Integer range แต่ fit Long
        Number n = NumberUtils.createNumber("12345678901234");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_plainBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_decimalNoSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_expNoSuffix_lowerE() {
        Number n = NumberUtils.createNumber("1.5e10");
        assertTrue(n instanceof Float || n instanceof Double);
    }

    @Test
    public void testCreateNumber_expNoSuffix_upperE() {
        Number n = NumberUtils.createNumber("1.5E10");
        assertTrue(n instanceof Float || n instanceof Double);
    }

    @Test
    public void testCreateNumber_trailingDecimalPoint() {
        // "5." -> dec="" (ไม่ null) -> เข้า float/double branch, Float.valueOf("5.") ถูกต้องตาม Java spec
        Number n = NumberUtils.createNumber("5.");
        assertTrue(n instanceof Float);
        assertEquals(5.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_suffixL_valid() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_suffixL_negative() {
        Number n = NumberUtils.createNumber("-123L");
        assertTrue(n instanceof Long);
        assertEquals(-123L, n.longValue());
    }

    @Test
    public void testCreateNumber_suffixL_tooBig_fallsBackToBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_suffixL_withDecimal_invalid() {
        // dec != null -> ไม่เข้าเงื่อนไข valid digits -> throw
        NumberUtils.createNumber("1.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_suffixL_nonDigitNumeric_invalid() {
        NumberUtils.createNumber("abcL");
    }

    @Test
    public void testCreateNumber_suffixF_valid() {
        Number n = NumberUtils.createNumber("123f");
        assertTrue(n instanceof Float);
        assertEquals(123f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_suffixF_zeroAllZeros() {
        // allZeros = true, float value 0.0f, ยังคง return Float ตาม logic
        Number n = NumberUtils.createNumber("0.0f");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_suffixF_overflow_fallsThroughToDouble() {
        // Float.valueOf("1e50") = Infinity -> fallthrough ไป case 'd'
        Number n = NumberUtils.createNumber("1e50f");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_suffixD_valid() {
        Number n = NumberUtils.createNumber("1.0d");
        assertTrue(n instanceof Double);
        assertEquals(1.0d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_suffixD_underflowZero_fallsBackToBigDecimal() {
        // Double underflow เป็น 0.0 แต่ allZeros=false (mant="1") -> ตกไป BigDecimal
        Number n = NumberUtils.createNumber("1e-400D");
        assertTrue(n instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidSuffixChar() {
        NumberUtils.createNumber("123x");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDecimalPoint_invalid() {
        // expPos < decPos -> throw
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosExceedsLength_withDecimal() {
        // decPos>-1 และ expPos > str.length() -> throw
        NumberUtils.createNumber("x.eE");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosExceedsLength_withoutDecimal() {
        // decPos == -1 และ expPos > str.length() -> throw
        NumberUtils.createNumber("xeE");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_trailingMinusAfterExp_invalid() {
        NumberUtils.createNumber("1e-");
    }

    // ===================== min/max array: long =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_empty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinLongArray_single() {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test
    public void testMinLongArray_multiple() {
        assertEquals(-3L, NumberUtils.min(new long[]{5L, -3L, 10L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_empty() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void testMaxLongArray_multiple() {
        assertEquals(10L, NumberUtils.max(new long[]{5L, -3L, 10L}));
    }

    // ===================== min/max array: int =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_empty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMinIntArray_multiple() {
        assertEquals(-3, NumberUtils.min(new int[]{5, -3, 10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_empty() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMaxIntArray_multiple() {
        assertEquals(10, NumberUtils.max(new int[]{5, -3, 10}));
    }

    // ===================== min/max array: short =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_empty() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMinShortArray_multiple() {
        assertEquals((short) -3, NumberUtils.min(new short[]{5, -3, 10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_empty() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void testMaxShortArray_multiple() {
        assertEquals((short) 10, NumberUtils.max(new short[]{5, -3, 10}));
    }

    // ===================== min/max array: byte =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_empty() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMinByteArray_multiple() {
        assertEquals((byte) -3, NumberUtils.min(new byte[]{5, -3, 10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_empty() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void testMaxByteArray_multiple() {
        assertEquals((byte) 10, NumberUtils.max(new byte[]{5, -3, 10}));
    }

    // ===================== min/max array: double (NaN handling) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_empty() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMinDoubleArray_multiple() {
        assertEquals(-3.0d, NumberUtils.min(new double[]{5.0, -3.0, 10.0}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_NaN_inMiddle() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test
    public void testMinDoubleArray_NaN_atFirstElement() {
        // array[0] เป็น NaN, loop เช็คแค่ array[i] (i>=1) ไม่ใช่ array[0]
        // แต่การเปรียบเทียบ array[i] < NaN จะ false เสมอ -> min ยังเป็น NaN
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{Double.NaN, 1.0, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_empty() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void testMaxDoubleArray_multiple() {
        assertEquals(10.0d, NumberUtils.max(new double[]{5.0, -3.0, 10.0}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_NaN_inMiddle() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 2.0})));
    }

    // ===================== min/max array: float (NaN handling) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_empty() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMinFloatArray_multiple() {
        assertEquals(-3.0f, NumberUtils.min(new float[]{5.0f, -3.0f, 10.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_NaN_inMiddle() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_empty() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void testMaxFloatArray_multiple() {
        assertEquals(10.0f, NumberUtils.max(new float[]{5.0f, -3.0f, 10.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_NaN_inMiddle() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    // ===================== 3-param min: long/int/short/byte =====================

    @Test
    public void testMin3_long_allBranchCombos() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));   // b<a true, c<a false
        assertEquals(0L, NumberUtils.min(1L, 2L, 0L));   // b<a false, c<a true
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));   // both false
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));   // both true
    }

    @Test
    public void testMin3_int_allBranchCombos() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(0, NumberUtils.min(1, 2, 0));
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3_short_allBranchCombos() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((short) 0, NumberUtils.min((short) 1, (short) 2, (short) 0));
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3_byte_allBranchCombos() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 0, NumberUtils.min((byte) 1, (byte) 2, (byte) 0));
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    // ===================== 3-param max: long/int/short/byte =====================

    @Test
    public void testMax3_long_allBranchCombos() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));   // b>a true, c>a false
        assertEquals(3L, NumberUtils.max(2L, 1L, 3L));   // b>a false, c>a true
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));   // both false
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));   // both true
    }

    @Test
    public void testMax3_int_allBranchCombos() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(2, 1, 3));
        assertEquals(3, NumberUtils.max(3, 2, 1));
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMax3_short_allBranchCombos() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 1, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMax3_byte_allBranchCombos() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    // ===================== 3-param min/max: double/float (delegate ไปยัง Math.min/max) =====================

    @Test
    public void testMin3_double() {
        assertEquals(1.0d, NumberUtils.min(3.0, 1.0, 2.0), 0.0d);
    }

    @Test
    public void testMin3_double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(1.0, Double.NaN, 2.0)));
    }

    @Test
    public void testMax3_double() {
        assertEquals(3.0d, NumberUtils.max(1.0, 3.0, 2.0), 0.0d);
    }

    @Test
    public void testMax3_double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(1.0, Double.NaN, 2.0)));
    }

    @Test
    public void testMin3_float() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMax3_float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0f);
    }

    // ===================== isDigits =====================

    @Test
    public void testIsDigits_null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_allDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_nonDigit() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    @Test
    public void testIsDigits_withSpace() {
        assertFalse(NumberUtils.isDigits(" 123"));
    }

    // ===================== isNumber =====================

    @Test
    public void testIsNumber_null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_plainInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_negativeInteger() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_signOnly_invalid() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_leadingPlus_invalid() {
        // allowSigns เป็น false ตอนเริ่มต้น -> '+' ที่ตำแหน่งแรกไม่ถูกต้อง
        assertFalse(NumberUtils.isNumber("+123"));
    }

    @Test
    public void testIsNumber_decimal() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_trailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_twoDecimalPoints_invalid() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_exponentLower() {
        assertTrue(NumberUtils.isNumber("123e10"));
    }

    @Test
    public void testIsNumber_exponentUpper() {
        assertTrue(NumberUtils.isNumber("123E10"));
    }

    @Test
    public void testIsNumber_exponentWithSign() {
        assertTrue(NumberUtils.isNumber("123e+10"));
        assertTrue(NumberUtils.isNumber("123e-10"));
    }

    @Test
    public void testIsNumber_twoExponents_invalid() {
        assertFalse(NumberUtils.isNumber("1e1e1"));
    }

    @Test
    public void testIsNumber_exponentNoDigitAfter_invalid() {
        assertFalse(NumberUtils.isNumber("1e"));
    }

    @Test
    public void testIsNumber_exponentNoDigitBefore_invalid() {
        assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_floatSuffix() {
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
    }

    @Test
    public void testIsNumber_doubleSuffix() {
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
    }

    @Test
    public void testIsNumber_longSuffix() {
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longSuffixWithExponent_invalid() {
        // L ไม่อนุญาตร่วมกับ exponent
        assertFalse(NumberUtils.isNumber("123e10L"));
    }

    @Test
    public void testIsNumber_hexValid() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnlyPrefix_invalid() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_hexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_illegalLetter_invalid() {
        assertFalse(NumberUtils.isNumber("123a"));
    }

    @Test
    public void testIsNumber_illegalLeadingLetter_invalid() {
        assertFalse(NumberUtils.isNumber("abc"));
    }

    // ===================== constants sanity (ไม่มี branch แต่ช่วย coverage ของ static fields) =====================

    @Test
    public void testConstants() {
        assertEquals(0L, NumberUtils.LONG_ZERO.longValue());
        assertEquals(1L, NumberUtils.LONG_ONE.longValue());
        assertEquals(-1L, NumberUtils.LONG_MINUS_ONE.longValue());
        assertEquals(0, NumberUtils.INTEGER_ZERO.intValue());
        assertEquals(1, NumberUtils.INTEGER_ONE.intValue());
        assertEquals(-1, NumberUtils.INTEGER_MINUS_ONE.intValue());
        assertEquals((byte) 0, NumberUtils.BYTE_ZERO.byteValue());
        assertEquals((short) 0, NumberUtils.SHORT_ZERO.shortValue());
        assertEquals(0.0d, NumberUtils.DOUBLE_ZERO.doubleValue(), 0.0d);
        assertEquals(0.0f, NumberUtils.FLOAT_ZERO.floatValue(), 0.0f);
    }
}
