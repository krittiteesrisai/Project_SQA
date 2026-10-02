# JUnit 4 Test Suite สำหรับ `NumberUtils` (Lang-27b)

ด้านล่างเป็นชุดทดสอบที่ครอบคลุมทุกเมธอด public และพยายามเดิน branch ให้ได้มากที่สุดเท่าที่วิเคราะห์ได้จาก source ที่ให้มา (รวมถึง fallback logic อันซับซ้อนใน `createNumber`)

```java
package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsTest {

    // ===================== toInt =====================
    @Test
    public void testToInt_NullString_ReturnsZero() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_EmptyString_ReturnsZero() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_ValidString_ReturnsValue() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_InvalidString_ReturnsZero() {
        // malformed -> NumberFormatException ถูกจับภายใน -> คืนค่า default
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefault_Null_ReturnsDefault() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_Valid_ReturnsParsed() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test
    public void testToIntWithDefault_Invalid_ReturnsDefault() {
        assertEquals(5, NumberUtils.toInt("xx", 5));
    }

    // ===================== toLong =====================
    @Test
    public void testToLong_Null_ReturnsZero() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_Empty_ReturnsZero() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_Valid_ReturnsValue() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_Invalid_ReturnsZero() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefault_Null_ReturnsDefault() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_Valid_ReturnsParsed() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    @Test
    public void testToLongWithDefault_Invalid_ReturnsDefault() {
        assertEquals(9L, NumberUtils.toLong("zzz", 9L));
    }

    // ===================== toFloat =====================
    @Test
    public void testToFloat_Null_ReturnsZero() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_Empty_ReturnsZero() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_Valid_ReturnsValue() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloat_Invalid_ReturnsZero() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloatWithDefault_Null_ReturnsDefault() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloatWithDefault_Invalid_ReturnsDefault() {
        assertEquals(2.2f, NumberUtils.toFloat("xx", 2.2f), 0.0f);
    }

    // ===================== toDouble =====================
    @Test
    public void testToDouble_Null_ReturnsZero() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_Empty_ReturnsZero() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_Valid_ReturnsValue() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDouble_Invalid_ReturnsZero() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDoubleWithDefault_Null_ReturnsDefault() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefault_Invalid_ReturnsDefault() {
        assertEquals(2.2d, NumberUtils.toDouble("xx", 2.2d), 0.0d);
    }

    // ===================== toByte =====================
    @Test
    public void testToByte_Null_ReturnsZero() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_Empty_ReturnsZero() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_Valid_ReturnsValue() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_Invalid_ReturnsZero() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefault_Null_ReturnsDefault() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_Invalid_ReturnsDefault() {
        assertEquals((byte) 9, NumberUtils.toByte("zz", (byte) 9));
    }

    // ===================== toShort =====================
    @Test
    public void testToShort_Null_ReturnsZero() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_Empty_ReturnsZero() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_Valid_ReturnsValue() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_Invalid_ReturnsZero() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefault_Null_ReturnsDefault() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_Invalid_ReturnsDefault() {
        assertEquals((short) 9, NumberUtils.toShort("zz", (short) 9));
    }

    // ===================== createFloat / createDouble / createInteger / createLong =====================
    @Test
    public void testCreateFloat_Null_ReturnsNull() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_Valid() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_Invalid_Throws() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble_Null_ReturnsNull() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_Valid() {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_Invalid_Throws() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger_Null_ReturnsNull() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_Decimal() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("26"));
    }

    @Test
    public void testCreateInteger_Hex() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_Invalid_Throws() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong_Null_ReturnsNull() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_Invalid_Throws() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger_Null_ReturnsNull() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_Valid() {
        assertEquals(new BigInteger("123456789012345678901"),
                NumberUtils.createBigInteger("123456789012345678901"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_Invalid_Throws() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal_Null_ReturnsNull() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank_Throws() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Invalid_Throws() {
        NumberUtils.createBigDecimal("abc");
    }

    // ===================== createNumber =====================
    @Test
    public void testCreateNumber_Null_ReturnsNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank_Throws() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_DoubleMinus_ReturnsNull() {
        // ป้องกัน BigDecimal parse ค่า "--" ผิด ๆ -> คืน null ตาม source
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_Hex_Positive() {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_Hex_Negative() {
        Number n = NumberUtils.createNumber("-0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Hex_Overflow_Throws() {
        // ค่าเกินขนาด int -> Integer.decode ขว้าง NFE โดยไม่ถูก catch ใน createNumber
        NumberUtils.createNumber("0xFFFFFFFFF");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ExpBeforeDec_Throws() {
        // expPos < decPos -> throw ทันที
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void testCreateNumber_TypeQualifier_L_Valid() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_TypeQualifier_L_TooBig_FallsBackToBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_TypeQualifier_L_WithDecimal_Throws() {
        // dec != null -> ไม่เข้าเงื่อนไข isDigits -> throw
        NumberUtils.createNumber("12.3L");
    }

    @Test
    public void testCreateNumber_TypeQualifier_F_Valid() {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_TypeQualifier_F_ZeroWithAllZeros() {
        // allZeros = true -> ยอมรับ float 0.0
        Number n = NumberUtils.createNumber("0.0f");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_TypeQualifier_F_OverflowFallsBackToDouble() {
        // ค่าเกินขนาด float แต่ไม่เกิน double -> fallthrough ไป case d/D
        Number n = NumberUtils.createNumber("1e50f");
        assertTrue(n instanceof Double);
        assertEquals(Double.parseDouble("1e50"), n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_TypeQualifier_D_Valid() {
        Number n = NumberUtils.createNumber("3.14D");
        assertTrue(n instanceof Double);
        assertEquals(3.14d, n.doubleValue(), 0.0001d);
    }

    @Test
    public void testCreateNumber_TypeQualifier_D_OverflowFallsBackToBigDecimal() {
        // double เป็น Infinite -> fallback ไป BigDecimal
        Number n = NumberUtils.createNumber("1e400D");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("1e400"), n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_UnknownTypeQualifier_Throws() {
        // lastChar ไม่ใช่ตัวเลขและไม่อยู่ใน case ใด ๆ -> default -> throw
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_NoQualifier_PlainInt() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_NoQualifier_FallsBackToLong() {
        Number n = NumberUtils.createNumber("12345678901");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_NoQualifier_FallsBackToBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_NoQualifier_Decimal_ReturnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_NoQualifier_Decimal_FloatOverflow_ReturnsDouble() {
        // ใหญ่กว่า Float.MAX_VALUE เล็กน้อยแต่ยังอยู่ในขอบเขต double
        Number n = NumberUtils.createNumber("3.4028235E39");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_NoQualifier_Exponent_DoubleOverflow_ReturnsBigDecimal() {
        Number n = NumberUtils.createNumber("1E400");
        assertTrue(n instanceof BigDecimal);
    }

    // ===================== isDigits =====================
    @Test
    public void testIsDigits_Null_False() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_Empty_False() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_AllDigits_True() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_ContainsNonDigit_False() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    // ===================== isNumber =====================
    @Test
    public void testIsNumber_Null_False() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_Empty_False() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_Hex_True() {
        assertTrue(NumberUtils.isNumber("0x1F"));
    }

    @Test
    public void testIsNumber_HexTooShort_False() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_HexInvalidChar_False() {
        assertFalse(NumberUtils.isNumber("0xg"));
    }

    @Test
    public void testIsNumber_PlainInt_True() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_NegativeInt_True() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_Decimal_True() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_TwoDecimalPoints_False() {
        assertFalse(NumberUtils.isNumber("123.45.67"));
    }

    @Test
    public void testIsNumber_Exponent_True() {
        assertTrue(NumberUtils.isNumber("123e10"));
    }

    @Test
    public void testIsNumber_TwoExponents_False() {
        assertFalse(NumberUtils.isNumber("123e10e5"));
    }

    @Test
    public void testIsNumber_ExponentWithoutDigitBefore_False() {
        assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_ExponentWithSign_True() {
        assertTrue(NumberUtils.isNumber("123e+10"));
        assertTrue(NumberUtils.isNumber("123e-10"));
    }

    @Test
    public void testIsNumber_LeadingPlusSign_False() {
        // allowSigns เป็น false ที่ตำแหน่งแรก -> false
        assertFalse(NumberUtils.isNumber("+123"));
    }

    @Test
    public void testIsNumber_TrailingL_True() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_TrailingL_WithExponent_False() {
        // isNumber: L กับ exponent ไม่อนุญาตร่วมกัน (foundDigit && !hasExp)
        assertFalse(NumberUtils.isNumber("123e5L"));
    }

    @Test
    public void testIsNumber_TrailingD_True() {
        assertTrue(NumberUtils.isNumber("1d"));
    }

    @Test
    public void testIsNumber_TrailingD_NoDigit_False() {
        assertFalse(NumberUtils.isNumber("d"));
    }

    @Test
    public void testIsNumber_TrailingDecimalPoint_True() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_OnlyDecimalPoint_False() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_OnlyMinusSign_False() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_TrailingE_False() {
        // ลงท้ายด้วย e/E ที่ byte สุดท้าย -> false
        assertFalse(NumberUtils.isNumber("123e"));
    }

    @Test
    public void testIsNumber_InvalidLetters_False() {
        assertFalse(NumberUtils.isNumber("NaN"));
    }

    // ===================== min(long[]) / max(long[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null_Throws() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty_Throws() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinLongArray_SingleElement() {
        assertEquals(5L, NumberUtils.min(new long[] {5L}));
    }

    @Test
    public void testMinLongArray_Multiple() {
        // {2,3,1}: branch false แล้ว branch true ในลูป
        assertEquals(1L, NumberUtils.min(new long[] {2L, 3L, 1L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Null_Throws() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Empty_Throws() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void testMaxLongArray_SingleElement() {
        assertEquals(5L, NumberUtils.max(new long[] {5L}));
    }

    @Test
    public void testMaxLongArray_Multiple() {
        assertEquals(3L, NumberUtils.max(new long[] {2L, 1L, 3L}));
    }

    // ===================== min(int[]) / max(int[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null_Throws() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty_Throws() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMinIntArray_SingleElement() {
        assertEquals(5, NumberUtils.min(new int[] {5}));
    }

    @Test
    public void testMinIntArray_Multiple() {
        assertEquals(1, NumberUtils.min(new int[] {2, 3, 1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Null_Throws() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Empty_Throws() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMaxIntArray_Multiple() {
        assertEquals(3, NumberUtils.max(new int[] {2, 1, 3}));
    }

    // ===================== min(short[]) / max(short[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null_Throws() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty_Throws() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMinShortArray_Multiple() {
        assertEquals((short) 1, NumberUtils.min(new short[] {(short) 2, (short) 3, (short) 1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Null_Throws() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Empty_Throws() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void testMaxShortArray_Multiple() {
        assertEquals((short) 3, NumberUtils.max(new short[] {(short) 2, (short) 1, (short) 3}));
    }

    // ===================== min(byte[]) / max(byte[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null_Throws() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty_Throws() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMinByteArray_Multiple() {
        assertEquals((byte) 1, NumberUtils.min(new byte[] {(byte) 2, (byte) 3, (byte) 1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Null_Throws() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Empty_Throws() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void testMaxByteArray_Multiple() {
        assertEquals((byte) 3, NumberUtils.max(new byte[] {(byte) 2, (byte) 1, (byte) 3}));
    }

    // ===================== min(double[]) / max(double[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null_Throws() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty_Throws() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMinDoubleArray_SingleElement_NoLoop() {
        assertEquals(5.0d, NumberUtils.min(new double[] {5.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_Multiple() {
        assertEquals(1.0d, NumberUtils.min(new double[] {2.0d, 3.0d, 1.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_WithNaN_ReturnsNaN() {
        double result = NumberUtils.min(new double[] {1.0d, Double.NaN, 2.0d});
        assertTrue(Double.isNaN(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Null_Throws() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Empty_Throws() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void testMaxDoubleArray_Multiple() {
        assertEquals(3.0d, NumberUtils.max(new double[] {2.0d, 1.0d, 3.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_WithNaN_ReturnsNaN() {
        double result = NumberUtils.max(new double[] {1.0d, Double.NaN, 2.0d});
        assertTrue(Double.isNaN(result));
    }

    // ===================== min(float[]) / max(float[]) =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null_Throws() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty_Throws() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMinFloatArray_Multiple() {
        assertEquals(1.0f, NumberUtils.min(new float[] {2.0f, 3.0f, 1.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_WithNaN_ReturnsNaN() {
        float result = NumberUtils.min(new float[] {1.0f, Float.NaN, 2.0f});
        assertTrue(Float.isNaN(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null_Throws() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty_Throws() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void testMaxFloatArray_Multiple() {
        assertEquals(3.0f, NumberUtils.max(new float[] {2.0f, 1.0f, 3.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_WithNaN_ReturnsNaN() {
        float result = NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f});
        assertTrue(Float.isNaN(result));
    }

    // ===================== min(a,b,c) 3-param =====================
    @Test
    public void testMin3Long_BLessThanA_CLessThanNewA() {
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin3Long_NoBranchTaken() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
    }

    @Test
    public void testMin3Long_AllEqual() {
        assertEquals(2L, NumberUtils.min(2L, 2L, 2L));
    }

    @Test
    public void testMin3Int_Mixed() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
    }

    @Test
    public void testMin3Short_Mixed() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMin3Byte_Mixed() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMin3Double_Mixed() {
        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0d);
    }

    @Test
    public void testMin3Double_NaNPropagates() {
        // ตาม Javadoc: ถ้ามีค่าใดเป็น NaN ผลลัพธ์เป็น NaN (ผ่าน Math.min)
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 2.0d)));
    }

    @Test
    public void testMin3Float_Mixed() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMin3Float_NaNPropagates() {
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 2.0f)));
    }

    // ===================== max(a,b,c) 3-param =====================
    @Test
    public void testMax3Long_Mixed() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMax3Long_NoBranchTaken() {
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax3Long_AllEqual() {
        assertEquals(2L, NumberUtils.max(2L, 2L, 2L));
    }

    @Test
    public void testMax3Int_Mixed() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMax3Short_Mixed() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMax3Byte_Mixed() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMax3Double_Mixed() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0d);
    }

    @Test
    public void testMax3Double_NaNPropagates() {
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 2.0d)));
    }

    @Test
    public void testMax3Float_Mixed() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMax3Float_NaNPropagates() {
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 2.0f)));
    }
}
```

> **หมายเหตุ/ข้อสมมติที่ไม่แน่ใจ (comment แทนการเดา):**
> - พฤติกรรมของ `StringUtils.isBlank` / `isEmpty` ไม่มีให้ในซอร์สที่แนบมา จึงอ้างอิงจาก behavior มาตรฐานของ commons-lang3 (null/empty/whitespace → true) ตามที่ใช้งานจริงใน method `createNumber` และ `createBigDecimal`
> - กรณี `"1e50f"` และ `"1E400"` อาศัยพฤติกรรมจริงของ `Float.parseFloat`/`Double.parseDouble` ต่อค่าที่ overflow เป็น `Infinity` ซึ่งเป็นพฤติกรรม JDK มาตรฐาน ไม่ใช่การเดา logic ของ `NumberUtils`

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testToInt*`, `testToLong*`, `testToFloat*`, `testToDouble*`, `testToByte*`, `testToShort*` | `str == null` true/false, `try` สำเร็จ/ล้มเหลว (NumberFormatException caught) |
| `testCreateFloat/Double/Integer/Long/BigInteger/BigDecimal_*` | `str == null` true/false, parse สำเร็จ/ล้มเหลว, `createBigDecimal` blank-check |
| `testCreateNumber_Null/Blank/DoubleMinus` | `str==null`, `isBlank` true, `startsWith("--")` true |
| `testCreateNumber_Hex_*` | `startsWith("0x"/"-0x")` true, overflow exception ไม่ถูก catch |
| `testCreateNumber_ExpBeforeDec_Throws` | `decPos>-1 && expPos>-1 && expPos<decPos` true |
| `testCreateNumber_TypeQualifier_L_*` | `case 'L'`: เงื่อนไข dec/exp/isDigits true/false, createLong สำเร็จ/overflow→BigInteger, throw เมื่อมี dec |
| `testCreateNumber_TypeQualifier_F_*` | `case 'f'`: float สำเร็จ/0.0+allZeros/overflow→fallthrough case 'd' |
| `testCreateNumber_TypeQualifier_D_*` | `case 'd'/'D'`: double สำเร็จ/overflow→BigDecimal |
| `testCreateNumber_UnknownTypeQualifier_Throws` | `default` case ของ switch |
| `testCreateNumber_NoQualifier_*` | `dec==null && exp==null` true (int→long→BigInteger) และ false (float→double→BigDecimal) |
| `testIsDigits_*` | `StringUtils.isEmpty` true/false, loop ทุกตัวอักษร/เจอ non-digit |
| `testIsNumber_*` (หลายเคส) | hex branch (`sz>start+1`, `i==sz`, invalid char), loop หลัก (digit/`.`/e,E/+,-/else), ท้าย loop (digit/e,E/`.`/d,D,f,F/l,L/else), final return `!allowSigns && foundDigit` |
| `testMin*Array_*`, `testMax*Array_*` (long/int/short/byte) | `array==null`, `array.length==0`, single element (loop ไม่วิ่ง), multiple element (if-condition true/false ในลูป) |
| `testMin/MaxDoubleArray_*`, `testMin/MaxFloatArray_*` | เพิ่ม branch `Double.isNaN`/`Float.isNaN` true/false ในลูป |
| `testMin3*`, `testMax3*` (long/int/short/byte) | เงื่อนไข `b</> a` true/false, `c</> a(ใหม่)` true/false, ค่าเท่ากันทั้งหมด |
| `testMin3Double/Float_NaNPropagates`, `testMax3Double/Float_NaNPropagates` | ยืนยันพฤติกรรม NaN-propagation ผ่าน `Math.min/Math.max` ตาม Javadoc |