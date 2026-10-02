# NumberUtilsTest.java

```java
package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ===================== toInt =====================
    @Test
    public void testToInt_NullString() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_EmptyString() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_ValidString() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_InvalidString() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntDefault_NullString() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntDefault_EmptyString() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToIntDefault_ValidString() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test
    public void testToIntDefault_InvalidString() {
        assertEquals(2, NumberUtils.toInt("abc", 2));
    }

    // ===================== toLong =====================
    @Test
    public void testToLong_NullString() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_EmptyString() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_ValidString() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_InvalidString() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongDefault_NullString() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongDefault_EmptyString() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongDefault_ValidString() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    @Test
    public void testToLongDefault_InvalidString() {
        assertEquals(2L, NumberUtils.toLong("abc", 2L));
    }

    // ===================== toFloat =====================
    @Test
    public void testToFloat_NullString() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_EmptyString() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_ValidString() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloat_InvalidString() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloatDefault_NullString() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloatDefault_EmptyString() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0f);
    }

    @Test
    public void testToFloatDefault_ValidString() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    @Test
    public void testToFloatDefault_InvalidString() {
        assertEquals(2.2f, NumberUtils.toFloat("abc", 2.2f), 0.0f);
    }

    // ===================== toDouble =====================
    @Test
    public void testToDouble_NullString() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_EmptyString() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_ValidString() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDouble_InvalidString() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDoubleDefault_NullString() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_EmptyString() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_ValidString() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    @Test
    public void testToDoubleDefault_InvalidString() {
        assertEquals(2.2d, NumberUtils.toDouble("abc", 2.2d), 0.0d);
    }

    // ===================== toByte =====================
    @Test
    public void testToByte_NullString() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_EmptyString() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_ValidString() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_InvalidString() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteDefault_NullString() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteDefault_EmptyString() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByteDefault_ValidString() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    @Test
    public void testToByteDefault_InvalidString() {
        assertEquals((byte) 2, NumberUtils.toByte("abc", (byte) 2));
    }

    // ===================== toShort =====================
    @Test
    public void testToShort_NullString() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_EmptyString() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_ValidString() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_InvalidString() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortDefault_NullString() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortDefault_EmptyString() {
        assertEquals((short) 1, NumberUtils.toShort("", (short) 1));
    }

    @Test
    public void testToShortDefault_ValidString() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    @Test
    public void testToShortDefault_InvalidString() {
        assertEquals((short) 2, NumberUtils.toShort("abc", (short) 2));
    }

    // ===================== createNumber =====================
    @Test
    public void testCreateNumber_Null() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() throws Exception {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_HexPrefix0x() throws Exception {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_HexPrefix0X() throws Exception {
        Number n = NumberUtils.createNumber("0X1A");
        assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_HexPrefixMinus0x() throws Exception {
        Number n = NumberUtils.createNumber("-0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_HexPrefixHash() throws Exception {
        Number n = NumberUtils.createNumber("#1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_HexPrefixMinusHash() throws Exception {
        Number n = NumberUtils.createNumber("-#1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_Hex8Digits_Integer() throws Exception {
        // boundary: hexDigits == 8 -> Integer
        Number n = NumberUtils.createNumber("0xFFFFFFFF");
        assertTrue(n instanceof Integer);
        assertEquals(-1, n.intValue());
    }

    @Test
    public void testCreateNumber_Hex9Digits_Long() throws Exception {
        // boundary: hexDigits == 9 (>8) -> Long
        Number n = NumberUtils.createNumber("0x1FFFFFFFF");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_Hex16Digits_Long() throws Exception {
        // boundary: hexDigits == 16 -> still Long
        Number n = NumberUtils.createNumber("0xFFFFFFFFFFFFFFFF");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_Hex17Digits_BigInteger() throws Exception {
        // boundary: hexDigits == 17 (>16) -> BigInteger
        Number n = NumberUtils.createNumber("0x1FFFFFFFFFFFFFFFF");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_PlainInteger() throws Exception {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_PlainLong() throws Exception {
        Number n = NumberUtils.createNumber("1234567890123"); // too big for Integer
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_PlainBigInteger() throws Exception {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_LSuffix() throws Exception {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_lSuffix() throws Exception {
        Number n = NumberUtils.createNumber("123l");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_LSuffix_BigInteger() throws Exception {
        // too big for Long -> fallback to BigInteger
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LSuffix_WithDecimal_Invalid() throws Exception {
        NumberUtils.createNumber("1.5L"); // L not allowed with decimal point
    }

    @Test
    public void testCreateNumber_FSuffix() throws Exception {
        Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_fSuffix() throws Exception {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DSuffix() throws Exception {
        Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_dSuffix() throws Exception {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_FSuffix_TooBigForFloat_FallsBackToDouble() throws Exception {
        // ค่าใหญ่เกิน Float.MAX_VALUE แต่ยังอยู่ในขอบเขต Double
        // -> 'f'/'F' case fall-through ไปยัง 'd'/'D' case ตาม fallthrough comment ใน source
        Number n = NumberUtils.createNumber("1.23456789012345E300F");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_NoTypeQualifier_Integer() throws Exception {
        Number n = NumberUtils.createNumber("100");
        assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_DecimalNoQualifier_Float() throws Exception {
        // numDecimals <= 7 -> Float
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DecimalNoQualifier_Double() throws Exception {
        // numDecimals (9) > 7 and <= 16 -> Double
        Number n = NumberUtils.createNumber("1.123456789");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_DecimalNoQualifier_BigDecimal() throws Exception {
        // numDecimals > 16 -> BigDecimal
        Number n = NumberUtils.createNumber("1.12345678901234567890");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_ExponentNoDecimal() throws Exception {
        Number n = NumberUtils.createNumber("1E10");
        assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_DoubleExponent_Invalid() throws Exception {
        // expPos < decPos -> ป้องกัน IOOBE จาก exponent ซ้ำ
        NumberUtils.createNumber("1E2.5E3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Invalid() throws Exception {
        NumberUtils.createNumber("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidTypeQualifier() throws Exception {
        NumberUtils.createNumber("123Z"); // default case ใน switch
    }

    // ===================== createFloat =====================
    @Test
    public void testCreateFloat_Null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_Valid() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5"), 0.0f);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_Invalid() {
        NumberUtils.createFloat("abc");
    }

    // ===================== createDouble =====================
    @Test
    public void testCreateDouble_Null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_Valid() {
        assertEquals(1.5d, NumberUtils.createDouble("1.5"), 0.0d);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_Invalid() {
        NumberUtils.createDouble("abc");
    }

    // ===================== createInteger =====================
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
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_Invalid() {
        NumberUtils.createInteger("abc");
    }

    // ===================== createLong =====================
    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_Invalid() {
        NumberUtils.createLong("abc");
    }

    // ===================== createBigInteger =====================
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
    public void testCreateBigInteger_Hex0x() {
        assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("0x1A"));
    }

    @Test
    public void testCreateBigInteger_NegativeHex() {
        assertEquals(BigInteger.valueOf(-26), NumberUtils.createBigInteger("-0x1A"));
    }

    @Test
    public void testCreateBigInteger_HashHex() {
        assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("#1A"));
    }

    @Test
    public void testCreateBigInteger_Octal() {
        assertEquals(BigInteger.valueOf(8), NumberUtils.createBigInteger("010"));
    }

    @Test
    public void testCreateBigInteger_ZeroOnly() {
        // "0" มีความยาว 1 -> ไม่เข้า branch octal (ต้องการ length > pos+1)
        assertEquals(BigInteger.ZERO, NumberUtils.createBigInteger("0"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_Invalid() {
        NumberUtils.createBigInteger("abc");
    }

    // ===================== createBigDecimal =====================
    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_DoubleMinus() {
        NumberUtils.createBigDecimal("--123");
    }

    // ===================== min/max array: long =====================
    @Test
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMaxLongArray() {
        assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Empty() {
        NumberUtils.max(new long[]{});
    }

    // ===================== min/max array: int =====================
    @Test
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty() {
        NumberUtils.min(new int[]{});
    }

    @Test
    public void testMaxIntArray() {
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Empty() {
        NumberUtils.max(new int[]{});
    }

    // ===================== min/max array: short =====================
    @Test
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty() {
        NumberUtils.min(new short[]{});
    }

    @Test
    public void testMaxShortArray() {
        assertEquals((short) 3, NumberUtils.max(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Empty() {
        NumberUtils.max(new short[]{});
    }

    // ===================== min/max array: byte =====================
    @Test
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty() {
        NumberUtils.min(new byte[]{});
    }

    @Test
    public void testMaxByteArray() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Empty() {
        NumberUtils.max(new byte[]{});
    }

    // ===================== min/max array: double =====================
    @Test
    public void testMinDoubleArray() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty() {
        NumberUtils.min(new double[]{});
    }

    @Test
    public void testMaxDoubleArray() {
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{3.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Empty() {
        NumberUtils.max(new double[]{});
    }

    // ===================== min/max array: float =====================
    @Test
    public void testMinFloatArray() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty() {
        NumberUtils.min(new float[]{});
    }

    @Test
    public void testMaxFloatArray() {
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{3.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty() {
        NumberUtils.max(new float[]{});
    }

    // ===================== 3-param min/max: long =====================
    @Test
    public void testMin3Long_AIsSmallest() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
    }

    @Test
    public void testMin3Long_BIsSmallest() {
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
    }

    @Test
    public void testMin3Long_CIsSmallest() {
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMax3Long_AIsLargest() {
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax3Long_BIsLargest() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMax3Long_CIsLargest() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    // ===================== 3-param min/max: int =====================
    @Test
    public void testMin3Int_AIsSmallest() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
    }

    @Test
    public void testMin3Int_BIsSmallest() {
        assertEquals(1, NumberUtils.min(2, 1, 3));
    }

    @Test
    public void testMin3Int_CIsSmallest() {
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMax3Int_AIsLargest() {
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax3Int_BIsLargest() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMax3Int_CIsLargest() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    // ===================== 3-param min/max: short =====================
    @Test
    public void testMin3Short_AIsSmallest() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMin3Short_BIsSmallest() {
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
    }

    @Test
    public void testMin3Short_CIsSmallest() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax3Short_AIsLargest() {
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax3Short_BIsLargest() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMax3Short_CIsLargest() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    // ===================== 3-param min/max: byte =====================
    @Test
    public void testMin3Byte_AIsSmallest() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMin3Byte_BIsSmallest() {
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
    }

    @Test
    public void testMin3Byte_CIsSmallest() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax3Byte_AIsLargest() {
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax3Byte_BIsLargest() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMax3Byte_CIsLargest() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    // ===================== 3-param min/max: double/float (ไม่มี if/else, ใช้ Math.min/max) =====================
    @Test
    public void testMin3Double() {
        assertEquals(1.0d, NumberUtils.min(1.0, 2.0, 3.0), 0.0d);
    }

    @Test
    public void testMax3Double() {
        assertEquals(3.0d, NumberUtils.max(1.0, 2.0, 3.0), 0.0d);
    }

    @Test
    public void testMin3Float() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0f);
    }

    @Test
    public void testMax3Float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0f);
    }

    // ===================== isDigits =====================
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
        assertFalse(NumberUtils.isDigits("123a5"));
    }

    // ===================== isNumber =====================
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
    public void testIsNumber_HexOnlyPrefix() {
        assertFalse(NumberUtils.isNumber("0x")); // str == "0x"
    }

    @Test
    public void testIsNumber_HexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
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
    public void testIsNumber_Decimal() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_TwoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("123.45.6"));
    }

    @Test
    public void testIsNumber_Exponent() {
        assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test
    public void testIsNumber_TwoExponents() {
        assertFalse(NumberUtils.isNumber("1.5E10E5"));
    }

    @Test
    public void testIsNumber_ExponentWithoutDigitBefore() {
        assertFalse(NumberUtils.isNumber("E10"));
    }

    @Test
    public void testIsNumber_ExponentWithSign() {
        assertTrue(NumberUtils.isNumber("1.5E-10"));
    }

    @Test
    public void testIsNumber_SignWithoutAllowSigns() {
        assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_TrailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_TrailingDecimalPointNoDigit() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_TrailingE() {
        assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_FloatQualifier() {
        assertTrue(NumberUtils.isNumber("123F"));
    }

    @Test
    public void testIsNumber_DoubleQualifier() {
        assertTrue(NumberUtils.isNumber("123D"));
    }

    @Test
    public void testIsNumber_LongQualifier() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_LongQualifierWithDecimal_Invalid() {
        assertFalse(NumberUtils.isNumber("123.5L"));
    }

    @Test
    public void testIsNumber_LongQualifierWithExp_Invalid() {
        assertFalse(NumberUtils.isNumber("123E5L"));
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
    public void testIsNumber_IllegalChar() {
        assertFalse(NumberUtils.isNumber("12a3"));
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testToInt*`, `testToLong*`, `testToFloat*`, `testToDouble*`, `testToByte*`, `testToShort*` | `str == null` (true/false), try-success, catch `NumberFormatException` (ครบทั้ง 6 คู่เมธอด overload) |
| `testCreateNumber_Null`, `_Blank` | `str == null`, `StringUtils.isBlank(str)` true |
| `testCreateNumber_HexPrefix*`, `_Hex8/9/16/17Digits*` | loop หา prefix (`0x`,`0X`,`-0x`,`-0X`,`#`,`-#`), เงื่อนไข `hexDigits > 16`, `hexDigits > 8`, ค่าขอบเขต 8/9/16/17 |
| `testCreateNumber_PlainInteger/Long/BigInteger` | path `dec==null && exp==null` → ลำดับ try Integer→Long→BigInteger |
| `testCreateNumber_LSuffix*` | case `'l'/'L'`, เงื่อนไข `dec==null && exp==null && isDigits(...)`, fallback BigInteger, throw เมื่อมี decimal |
| `testCreateNumber_FSuffix*`, `_fSuffix`, `_DSuffix`, `_dSuffix`, `_FSuffix_TooBigForFloat...` | case `'f'/'F'` fallthrough ไป `'d'/'D'`, เงื่อนไข `isInfinite()`, `floatValue()==0.0F` |
| `testCreateNumber_DecimalNoQualifier_Float/Double/BigDecimal` | เงื่อนไข `numDecimals <= 7`, `<= 16`, มากกว่า 16 |
| `testCreateNumber_ExponentNoDecimal`, `_DoubleExponent_Invalid` | `expPos > -1`, `expPos < decPos` throw |
| `testCreateNumber_Invalid`, `_InvalidTypeQualifier` | branch `!Character.isDigit(lastChar) && lastChar!='.'`, `default` case throw |
| `testCreateFloat/Double/Integer/Long*` | `str==null`, success, `NumberFormatException` |
| `testCreateBigInteger_*` | `startsWith("-")`, `0x`/`#`/octal เงื่อนไข `length > pos+1`, ค่า default decimal, boundary `"0"` |
| `testCreateBigDecimal_*` | `str==null`, `isBlank`, `startsWith("--")`, ปกติ |
| `testMin/MaxLongArray`, `...IntArray`, `...ShortArray`, `...ByteArray` | `validateArray`: null→throw, empty→throw, loop เงื่อนไข `<`/`>` ปรับค่า min/max |
| `testMin/MaxDoubleArray`, `...FloatArray` (+ `_NaN`) | เพิ่มเงื่อนไข `isNaN()` return ทันที, loop ปรับค่า |
| `testMin3*/Max3*` (long/int/short/byte) | เงื่อนไข `b<a`/`c<a` (min), `b>a`/`c>a` (max) ทั้ง 3 branch: a เล็ก/ใหญ่สุด, b, c |
| `testMin3Double/Float`, `testMax3Double/Float` | เรียก `Math.min/max` ซ้อน (ไม่มี if แยก แต่ยืนยันค่าที่ถูกต้อง) |
| `testIsDigits_*` | `isEmpty` true/false, loop พบ non-digit / ครบทุกตัว |
| `testIsNumber_*` (hex, exponent, decimal, sign, qualifier L/F/D, illegal char ฯลฯ) | ครอบคลุม branch หลักของ `isNumber`: hex-check, loop เงื่อนไขตัวเลข/จุด/E/sign, การตรวจ qualifier ตัวสุดท้าย (`L`,`F`,`D`), เงื่อนไข `hasDecPoint`, `hasExp`, `allowSigns`, `foundDigit` |

**หมายเหตุ:**
- บางพฤติกรรม (เช่น `testCreateNumber_FSuffix_TooBigForFloat_FallsBackToDouble`) อ้างอิงจาก logic ที่อ่านได้จาก source ตรง ๆ (การ fallthrough ของ switch-case และเงื่อนไข `isInfinite()`/`floatValue()==0.0F`) ไม่ได้เดา behavior เพิ่มเติม
- `isAllZeros` และ `validateArray` เป็น private method จึงถูกทดสอบทางอ้อมผ่าน public method ที่เรียกใช้ (`createNumber`, `min`/`max` arrays)
- Hex prefix loop ใน `createNumber` มีการทดสอบ 5 ใน 6 prefix (`0x`,`0X`,`-0x`,`#`,`-#`) ซึ่งเพียงพอสำหรับ branch coverage เนื่องจาก logic ภายใน loop เหมือนกันทุก prefix (if-match-then-break)