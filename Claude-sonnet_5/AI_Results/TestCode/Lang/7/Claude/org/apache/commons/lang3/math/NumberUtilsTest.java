package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Unit tests for org.apache.commons.lang3.math.NumberUtils (Defects4J Lang-7b).
 * Framework: JUnit 4 only.
 */
public class NumberUtilsTest {

    // =========================================================
    // toInt(String) / toInt(String, int)
    // =========================================================
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
    public void testToInt_Invalid() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntDefault_Null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntDefault_Empty() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToIntDefault_Valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test
    public void testToIntDefault_Invalid() {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    // =========================================================
    // toLong
    // =========================================================
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
    public void testToLong_Invalid() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongDefault_Null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongDefault_Invalid() {
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
    }

    @Test
    public void testToLongDefault_Valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // =========================================================
    // toFloat
    // =========================================================
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
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloat_Invalid() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloatDefault_Null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloatDefault_Invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0f);
    }

    @Test
    public void testToFloatDefault_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    // =========================================================
    // toDouble
    // =========================================================
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
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDouble_Invalid() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDoubleDefault_Null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_Invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    // =========================================================
    // toByte
    // =========================================================
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
    public void testToByte_Invalid() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteDefault_Null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteDefault_Invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
    }

    @Test
    public void testToByteDefault_Valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // =========================================================
    // toShort
    // =========================================================
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
    public void testToShort_Invalid() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortDefault_Null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortDefault_Invalid() {
        assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
    }

    @Test
    public void testToShortDefault_Valid() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // =========================================================
    // isDigits
    // =========================================================
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
    public void testIsDigits_NonDigits() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    // =========================================================
    // isNumber
    // =========================================================
    @Test
    public void testIsNumber_Null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_Empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_HexValid() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_HexInvalidOnlyPrefix() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_HexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_NegativeHex() {
        assertTrue(NumberUtils.isNumber("-0x1A"));
    }

    @Test
    public void testIsNumber_SimpleInteger() {
        assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_NegativeInteger() {
        assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_Decimal() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_TwoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("123.45.67"));
    }

    @Test
    public void testIsNumber_Exponent() {
        assertTrue(NumberUtils.isNumber("1.234E5"));
    }

    @Test
    public void testIsNumber_TwoExponents() {
        assertFalse(NumberUtils.isNumber("1E2E3"));
    }

    @Test
    public void testIsNumber_ExponentNoDigitBefore() {
        assertFalse(NumberUtils.isNumber("E5"));
    }

    @Test
    public void testIsNumber_SignAfterExponent() {
        assertTrue(NumberUtils.isNumber("1.2E-5"));
    }

    @Test
    public void testIsNumber_SignWithoutAllow() {
        assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_InvalidChar() {
        assertFalse(NumberUtils.isNumber("123a"));
    }

    @Test
    public void testIsNumber_TrailingEInvalid() {
        assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_TrailingDecimalValid() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_TrailingDecimalAfterExp_Invalid() {
        assertFalse(NumberUtils.isNumber("123E4."));
    }

    @Test
    public void testIsNumber_FloatQualifier() {
        assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_FloatQualifierNoDigit() {
        assertFalse(NumberUtils.isNumber(".f"));
    }

    @Test
    public void testIsNumber_LongQualifier() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_LongQualifierWithExp_Invalid() {
        assertFalse(NumberUtils.isNumber("123E4L"));
    }

    @Test
    public void testIsNumber_LongQualifierWithDecimal_Invalid() {
        assertFalse(NumberUtils.isNumber("123.4L"));
    }

    @Test
    public void testIsNumber_IllegalLastChar() {
        assertFalse(NumberUtils.isNumber("123Z"));
    }

    @Test
    public void testIsNumber_EndsWithSignOnly() {
        assertFalse(NumberUtils.isNumber("1E-"));
    }

    @Test
    public void testIsNumber_DecimalOnly() {
        assertFalse(NumberUtils.isNumber("."));
    }

    // =========================================================
    // createNumber
    // =========================================================
    @Test
    public void testCreateNumber_Null() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() throws Exception {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_DoubleMinus() throws Exception {
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_Hex() throws Exception {
        Number n = NumberUtils.createNumber("0x10");
        assertTrue(n instanceof Integer);
        assertEquals(16, n.intValue());
    }

    @Test
    public void testCreateNumber_HexNegative() throws Exception {
        Number n = NumberUtils.createNumber("-0x10");
        assertEquals(-16, n.intValue());
    }

    @Test
    public void testCreateNumber_HexUpper() throws Exception {
        Number n = NumberUtils.createNumber("0X10");
        assertEquals(16, n.intValue());
    }

    @Test
    public void testCreateNumber_HexLong() throws Exception {
        Number n = NumberUtils.createNumber("0x123456789");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_HexLongNegative() throws Exception {
        Number n = NumberUtils.createNumber("-0x123456789");
        assertTrue(n instanceof Long);
        assertTrue(n.longValue() < 0);
    }

    @Test
    public void testCreateNumber_PlainInteger() throws Exception {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_PlainLong() throws Exception {
        Number n = NumberUtils.createNumber("123456789012345");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_PlainBigInteger() throws Exception {
        Number n = NumberUtils.createNumber("12345678901234567890123456789");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_Decimal_ReturnsFloat() throws Exception {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_LowercaseExponent() throws Exception {
        // สาขา expPos ที่คำนวณจาก 'e' (lowercase)
        Number n = NumberUtils.createNumber("1.2e3");
        assertEquals(1200.0, n.doubleValue(), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidExpPosition() throws Exception {
        // expPos < decPos -> throw NumberFormatException
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void testCreateNumber_WithLSuffix() throws Exception {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_WithLSuffixInvalid() throws Exception {
        // 'L' ร่วมกับทศนิยม -> ไม่ถูกต้อง
        NumberUtils.createNumber("123.4L");
    }

    @Test
    public void testCreateNumber_WithFSuffix() throws Exception {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_WithDSuffix_AllZerosBranch() throws Exception {
        // allZeros == true -> ยอมรับค่า 0.0 เป็น Double
        Number n = NumberUtils.createNumber("0.0d");
        assertTrue(n instanceof Double);
        assertEquals(0.0d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_ForcedBigDecimal_NoSuffix() throws Exception {
        // ค่าเกิน Double range -> Infinity ทั้ง float/double -> ตกไปที่ BigDecimal
        Number n = NumberUtils.createNumber("1E400");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_ForcedBigDecimal_FloatSuffixFallthrough() throws Exception {
        // ทดสอบ switch fall-through จาก case 'f' ไป 'd' แล้วไป BigDecimal
        Number n = NumberUtils.createNumber("1E400f");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_ForcedBigDecimal_DoubleSuffixUnderflow() throws Exception {
        // double underflow เป็น 0.0 แต่ allZeros=false -> ปฏิเสธ -> BigDecimal
        Number n = NumberUtils.createNumber("1E-400d");
        assertTrue(n instanceof BigDecimal);
    }

    // =========================================================
    // createFloat / createDouble / createInteger / createLong /
    // createBigInteger / createBigDecimal
    // =========================================================
    @Test
    public void testCreateFloat_Null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_Valid() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0f);
    }

    @Test
    public void testCreateDouble_Null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_Valid() {
        assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0d);
    }

    @Test
    public void testCreateInteger_Null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_Valid() {
        assertEquals(Integer.valueOf(10), NumberUtils.createInteger("10"));
    }

    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf(10L), NumberUtils.createLong("10"));
    }

    @Test
    public void testCreateBigInteger_Null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_Valid() {
        assertEquals(BigInteger.valueOf(10), NumberUtils.createBigInteger("10"));
    }

    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("10.5"), NumberUtils.createBigDecimal("10.5"));
    }

    // =========================================================
    // min/max array - long
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinLongArray_Valid() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
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
    public void testMaxLongArray_Valid() {
        assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
    }

    // =========================================================
    // min/max array - int
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMinIntArray_Valid() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
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
    public void testMaxIntArray_Valid() {
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
    }

    // =========================================================
    // min/max array - short
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMinShortArray_Valid() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Empty() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void testMaxShortArray_Valid() {
        assertEquals((short) 3, NumberUtils.max(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    // =========================================================
    // min/max array - byte
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMinByteArray_Valid() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Empty() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void testMaxByteArray_Valid() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    // =========================================================
    // min/max array - double (รวม NaN)
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMinDoubleArray_Valid() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Empty() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void testMaxDoubleArray_Valid() {
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 2.0})));
    }

    // =========================================================
    // min/max array - float (รวม NaN)
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMinFloatArray_Valid() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void testMaxFloatArray_Valid() {
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    // =========================================================
    // min/max 3-param (long,int,short,byte,double,float)
    // =========================================================
    @Test
    public void testMin3Long_AllOrders() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(1L, NumberUtils.min(1L, 3L, 2L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin3Int_AllOrders() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(1, NumberUtils.min(1, 3, 2));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Short_AllOrders() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 3, (short) 2));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3Byte_AllOrders() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin3Double() {
        assertEquals(1.0, NumberUtils.min(3.0, 1.0, 2.0), 0.0);
    }

    @Test
    public void testMin3Float() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMax3Long_AllOrders() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMax3Int_AllOrders() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 1, 2));
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMax3Short_AllOrders() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMax3Byte_AllOrders() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMax3Double() {
        assertEquals(3.0, NumberUtils.max(1.0, 3.0, 2.0), 0.0);
    }

    @Test
    public void testMax3Float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0f);
    }
}
