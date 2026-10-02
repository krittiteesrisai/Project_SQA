package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsTest {

    // =====================================================================
    // toInt(String) / toInt(String, int)
    // =====================================================================

    @Test
    public void testToInt_Null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_Empty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_Valid() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_Overflow_ReturnsDefault() {
        // Integer overflow -> NumberFormatException caught -> default 0
        assertEquals(0, NumberUtils.toInt("99999999999"));
    }

    @Test
    public void testToIntDefault_Null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntDefault_Invalid() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToIntDefault_Valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    // =====================================================================
    // toLong(String) / toLong(String, long)
    // =====================================================================

    @Test
    public void testToLong_Null() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_Empty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_Valid() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLongDefault_Null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongDefault_Invalid() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongDefault_Valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // =====================================================================
    // toFloat(String) / toFloat(String, float)
    // =====================================================================

    @Test
    public void testToFloat_Null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_Empty() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // =====================================================================
    // toDouble(String) / toDouble(String, double)
    // =====================================================================

    @Test
    public void testToDouble_Null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_Empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // =====================================================================
    // toByte(String) / toByte(String, byte)
    // =====================================================================

    @Test
    public void testToByte_Null() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_Empty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_Valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_Overflow() {
        // 128 > Byte.MAX_VALUE(127) -> NumberFormatException -> default
        assertEquals((byte) 0, NumberUtils.toByte("128"));
    }

    @Test
    public void testToByteDefault_Null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteDefault_Invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByteDefault_Valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // =====================================================================
    // toShort(String) / toShort(String, short)
    // =====================================================================

    @Test
    public void testToShort_Null() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_Empty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_Valid() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_Overflow() {
        // 32768 > Short.MAX_VALUE(32767) -> default
        assertEquals((short) 0, NumberUtils.toShort("32768"));
    }

    @Test
    public void testToShortDefault_Null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortDefault_Invalid() {
        assertEquals((short) 1, NumberUtils.toShort("", (short) 1));
    }

    @Test
    public void testToShortDefault_Valid() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // =====================================================================
    // createNumber(String)
    // =====================================================================

    @Test
    public void testCreateNumber_Null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_Hex_Integer() {
        assertEquals(Integer.valueOf(31), NumberUtils.createNumber("0x1F"));
    }

    @Test
    public void testCreateNumber_HexUppercasePrefix_Integer() {
        assertEquals(Integer.valueOf(31), NumberUtils.createNumber("0X1F"));
    }

    @Test
    public void testCreateNumber_NegativeHex_Integer() {
        assertEquals(Integer.valueOf(-31), NumberUtils.createNumber("-0x1F"));
    }

    @Test
    public void testCreateNumber_HashHex_Integer() {
        assertEquals(Integer.valueOf(31), NumberUtils.createNumber("#1F"));
    }

    @Test
    public void testCreateNumber_NegativeHashHex_Integer() {
        assertEquals(Integer.valueOf(-31), NumberUtils.createNumber("-#1F"));
    }

    @Test
    public void testCreateNumber_Hex_Long() {
        // 9 hex digits -> too many for int -> Long branch
        Number n = NumberUtils.createNumber("0x123456789");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_Hex_BigInteger() {
        // 17 hex digits -> too many for long -> BigInteger branch
        Number n = NumberUtils.createNumber("0x12345678901234567");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_PlainInteger() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
    }

    @Test
    public void testCreateNumber_PlainLong() {
        // exceeds Integer range, fits Long
        Number n = NumberUtils.createNumber("123456789012");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_PlainBigInteger() {
        // exceeds Long range
        Number n = NumberUtils.createNumber("12345678901234567890123456789");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_PureExponent_NoDecimal_Float() {
        // dec == null but exp != null -> skip Integer/Long/BigInteger path
        Number n = NumberUtils.createNumber("1e10");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DecimalFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DecimalExponentFloat() {
        Number n = NumberUtils.createNumber("1.5e10");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_HugeExponent_BigDecimal() {
        // beyond both float and double range -> BigDecimal fallback
        Number n = NumberUtils.createNumber("1.5E340");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_NegativeZero_AllZerosFalse_BigDecimal() {
        // mant = "-0" -> isAllZeros("-0") == false because of leading '-'
        // -> float/double zero-match guard rejects -> fallback BigDecimal
        Number n = NumberUtils.createNumber("-0.0");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_LongSuffix_Lowercase() {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
    }

    @Test
    public void testCreateNumber_LongSuffix_Uppercase() {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
    }

    @Test
    public void testCreateNumber_LongSuffix_NegativeValid() {
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
    }

    @Test
    public void testCreateNumber_LongSuffix_TooBig_BigInteger() {
        // digits too big for Long -> fall back to BigInteger
        Number n = NumberUtils.createNumber("99999999999999999999L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LongSuffix_NonDigit_Throws() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LongSuffix_WithDecimal_Throws() {
        // dec != null with L suffix -> not allowed
        NumberUtils.createNumber("1.5L");
    }

    @Test
    public void testCreateNumber_FloatSuffix() {
        Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DoubleSuffix_Uppercase() {
        Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_DoubleSuffix_Lowercase() {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_FloatSuffix_FallThroughToDouble() {
        // float overflow (infinite) -> falls through switch to double branch
        Number n = NumberUtils.createNumber("1.0E40F");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_FloatSuffix_FallThroughToBigDecimal() {
        // both float and double overflow -> BigDecimal fallback
        Number n = NumberUtils.createNumber("1.0E400F");
        assertTrue(n instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidSuffixChar_Throws() {
        // lastChar not digit/'.' and not in switch -> default: throw
        NumberUtils.createNumber("123X");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ExpBeforeDecimal_Throws() {
        // expPos < decPos -> explicit guard throws before reaching switch
        NumberUtils.createNumber("1E2.3");
    }

    // =====================================================================
    // createFloat / createDouble / createInteger / createLong
    // =====================================================================

    @Test
    public void testCreateFloat_Null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_Valid() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateDouble_Null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_Valid() {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateInteger_Null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_Valid() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_Hex() {
        assertEquals(Integer.valueOf(31), NumberUtils.createInteger("0x1F"));
    }

    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    // =====================================================================
    // createBigInteger
    // =====================================================================

    @Test
    public void testCreateBigInteger_Null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_Decimal() {
        assertEquals(BigInteger.valueOf(123), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_NegativeDecimal() {
        assertEquals(BigInteger.valueOf(-123), NumberUtils.createBigInteger("-123"));
    }

    @Test
    public void testCreateBigInteger_LowercaseHex() {
        assertEquals(BigInteger.valueOf(31), NumberUtils.createBigInteger("0x1F"));
    }

    /**
     * ทดสอบตามข้อกำหนดใน Javadoc ของคลาส (รองรับ hex/octal) ว่า "0X" (ตัวพิมพ์ใหญ่)
     * ควรแปลงเป็นเลขฐาน 16 ได้เหมือน "0x" — ทดสอบนี้อาจ "ล้มเหลว" บนซอร์สที่ให้มา
     * เนื่องจากมี fault จริง: เงื่อนไข
     *   str.startsWith("0x", pos) || str.startsWith("0x", pos)
     * ตรวจซ้ำกันทั้งคู่เป็น "0x" (พิมพ์เล็ก) ไม่มีการตรวจ "0X" เลย ทำให้ค่านี้
     * ถูกตีความผิดเป็นเลขฐานแปด (octal) แทน และโยน NumberFormatException
     * -> นี่คือจุดที่ควรดักจับ fault (Defects4J Lang-3b)
     */
    @Test
    public void testCreateBigInteger_UppercaseHexPrefix_KnownFault() {
        assertEquals(BigInteger.valueOf(31), NumberUtils.createBigInteger("0X1F"));
    }

    @Test
    public void testCreateBigInteger_NegativeHex() {
        assertEquals(BigInteger.valueOf(-31), NumberUtils.createBigInteger("-0x1F"));
    }

    @Test
    public void testCreateBigInteger_HashHex() {
        assertEquals(BigInteger.valueOf(31), NumberUtils.createBigInteger("#1F"));
    }

    @Test
    public void testCreateBigInteger_Octal() {
        // "0100" with length > pos+1 -> octal -> 64 decimal
        assertEquals(BigInteger.valueOf(64), NumberUtils.createBigInteger("0100"));
    }

    @Test
    public void testCreateBigInteger_NegativeOctal() {
        assertEquals(BigInteger.valueOf(-64), NumberUtils.createBigInteger("-0100"));
    }

    @Test
    public void testCreateBigInteger_ZeroAlone_NotOctal() {
        // length == pos+1 -> condition false -> stays radix 10
        assertEquals(BigInteger.ZERO, NumberUtils.createBigInteger("0"));
    }

    // =====================================================================
    // createBigDecimal
    // =====================================================================

    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank_Throws() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_DoubleMinus_Throws() {
        NumberUtils.createBigDecimal("--1.0");
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(0, new BigDecimal("1.23").compareTo(NumberUtils.createBigDecimal("1.23")));
    }

    // =====================================================================
    // min(array) / max(array) - long, int, short, byte, double, float
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinLongArray_SingleElement() {
        assertEquals(5L, NumberUtils.min(new long[] { 5L }));
    }

    @Test
    public void testMinLongArray_MixedOrder() {
        // covers both true/false branches of (array[i] < min)
        assertEquals(1L, NumberUtils.min(new long[] { 3L, 1L, 2L }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Empty() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void testMaxLongArray_MixedOrder() {
        assertEquals(3L, NumberUtils.max(new long[] { 1L, 3L, 2L }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMinIntArray_MixedOrder() {
        assertEquals(1, NumberUtils.min(new int[] { 3, 1, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Empty() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMaxIntArray_MixedOrder() {
        assertEquals(3, NumberUtils.max(new int[] { 1, 3, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMinShortArray_MixedOrder() {
        assertEquals((short) 1, NumberUtils.min(new short[] { (short) 3, (short) 1, (short) 2 }));
    }

    @Test
    public void testMaxShortArray_MixedOrder() {
        assertEquals((short) 3, NumberUtils.max(new short[] { (short) 1, (short) 3, (short) 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMinByteArray_MixedOrder() {
        assertEquals((byte) 1, NumberUtils.min(new byte[] { (byte) 3, (byte) 1, (byte) 2 }));
    }

    @Test
    public void testMaxByteArray_MixedOrder() {
        assertEquals((byte) 3, NumberUtils.max(new byte[] { (byte) 1, (byte) 3, (byte) 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMinDoubleArray_MixedOrder() {
        assertEquals(1.0d, NumberUtils.min(new double[] { 3.0d, 1.0d, 2.0d }), 0.0d);
    }

    @Test
    public void testMinDoubleArray_NaN_ReturnsNaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[] { 1.0d, Double.NaN, 2.0d })));
    }

    @Test
    public void testMaxDoubleArray_MixedOrder() {
        assertEquals(3.0d, NumberUtils.max(new double[] { 1.0d, 3.0d, 2.0d }), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_NaN_ReturnsNaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[] { 1.0d, Double.NaN, 2.0d })));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMinFloatArray_MixedOrder() {
        assertEquals(1.0f, NumberUtils.min(new float[] { 3.0f, 1.0f, 2.0f }), 0.0f);
    }

    @Test
    public void testMinFloatArray_NaN_ReturnsNaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[] { 1.0f, Float.NaN, 2.0f })));
    }

    @Test
    public void testMaxFloatArray_MixedOrder() {
        assertEquals(3.0f, NumberUtils.max(new float[] { 1.0f, 3.0f, 2.0f }), 0.0f);
    }

    @Test
    public void testMaxFloatArray_NaN_ReturnsNaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[] { 1.0f, Float.NaN, 2.0f })));
    }

    // =====================================================================
    // 3-parameter min/max (long, int, short, byte, double, float)
    // =====================================================================

    @Test
    public void testMin3Long_AllCombinations() {
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L)); // b<a T, c<a F
        assertEquals(1L, NumberUtils.min(2L, 5L, 1L)); // b<a F, c<a T
        assertEquals(1L, NumberUtils.min(5L, 2L, 1L)); // b<a T, c<a T
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L)); // b<a F, c<a F
    }

    @Test
    public void testMax3Long_AllCombinations() {
        assertEquals(3L, NumberUtils.max(2L, 3L, 1L)); // b>a T, c>a F
        assertEquals(3L, NumberUtils.max(2L, 1L, 3L)); // b>a F, c>a T
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L)); // b>a T, c>a T
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L)); // b>a F, c>a F
    }

    @Test
    public void testMin3Int_AllCombinations() {
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(2, 5, 1));
        assertEquals(1, NumberUtils.min(5, 2, 1));
        assertEquals(1, NumberUtils.min(1, 2, 3));
    }

    @Test
    public void testMax3Int_AllCombinations() {
        assertEquals(3, NumberUtils.max(2, 3, 1));
        assertEquals(3, NumberUtils.max(2, 1, 3));
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMin3Short() {
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMax3Short() {
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 3, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3Byte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMax3Byte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 3, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin3Double_Normal() {
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0d);
    }

    @Test
    public void testMin3Double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 2.0d)));
    }

    @Test
    public void testMax3Double_Normal() {
        assertEquals(3.0d, NumberUtils.max(2.0d, 3.0d, 1.0d), 0.0d);
    }

    @Test
    public void testMax3Double_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 2.0d)));
    }

    @Test
    public void testMin3Float_Normal() {
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0f);
    }

    @Test
    public void testMin3Float_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 2.0f)));
    }

    @Test
    public void testMax3Float_Normal() {
        assertEquals(3.0f, NumberUtils.max(2.0f, 3.0f, 1.0f), 0.0f);
    }

    @Test
    public void testMax3Float_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 2.0f)));
    }

    // =====================================================================
    // isDigits
    // =====================================================================

    @Test
    public void testIsDigits_Null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_Empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_AllDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_NonDigit() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    // =====================================================================
    // isNumber
    // =====================================================================

    @Test
    public void testIsNumber_Null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_Empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_ValidHex() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_HexOnlyPrefix_Invalid() {
        // i == sz right after prefix -> false
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_HexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_UppercaseXPrefix_NotRecognizedAsHex() {
        // โค้ดตรวจเฉพาะ '0' + 'x' (พิมพ์เล็ก) เท่านั้นสำหรับ hex branch ใน isNumber
        // ดังนั้น "0XAB" จะไม่เข้า hex branch และตัวอักษร 'X' ทำให้ parse ไม่ผ่าน -> false
        assertFalse(NumberUtils.isNumber("0XAB"));
    }

    @Test
    public void testIsNumber_PlainInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_NegativeInteger() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_TrailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_LeadingDecimalPoint() {
        assertTrue(NumberUtils.isNumber(".5"));
    }

    @Test
    public void testIsNumber_TwoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_ValidExponent() {
        assertTrue(NumberUtils.isNumber("1e10"));
    }

    @Test
    public void testIsNumber_ValidExponentWithSign() {
        assertTrue(NumberUtils.isNumber("1e-10"));
    }

    @Test
    public void testIsNumber_TwoExponents() {
        assertFalse(NumberUtils.isNumber("1e1e1"));
    }

    @Test
    public void testIsNumber_InvalidSignPlacement() {
        assertFalse(NumberUtils.isNumber("1-2"));
    }

    @Test
    public void testIsNumber_OnlySign() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_OnlyDot() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_TrailingD() {
        assertTrue(NumberUtils.isNumber("123d"));
    }

    @Test
    public void testIsNumber_TrailingF() {
        assertTrue(NumberUtils.isNumber("123F"));
    }

    @Test
    public void testIsNumber_TrailingL() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_LWithDecimal_Invalid() {
        assertFalse(NumberUtils.isNumber("1.2L"));
    }

    @Test
    public void testIsNumber_DWithDecimal_Valid() {
        assertTrue(NumberUtils.isNumber("1.2D"));
    }

    @Test
    public void testIsNumber_TrailingEInvalid() {
        // 'e'/'E' cannot be the very last char
        assertFalse(NumberUtils.isNumber("123e"));
    }

    @Test
    public void testIsNumber_InvalidLastChar() {
        assertFalse(NumberUtils.isNumber("123a"));
    }
}
