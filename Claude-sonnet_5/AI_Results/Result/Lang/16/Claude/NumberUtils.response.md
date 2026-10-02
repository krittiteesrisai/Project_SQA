# NumberUtilsTest.java — JUnit 4 Test Suite

```java
package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.lang3.math.NumberUtils (Defects4J Lang-16b).
 * เน้น branch/condition coverage ของทุกเมธอด public/private-reachable
 */
public class NumberUtilsTest {

    // ===================== toInt(String) / toInt(String,int) =====================

    @Test
    public void testToInt_Null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_Empty() {
        // "" -> NumberFormatException caught -> default 0
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_Valid() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_Malformed() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToInt_DefaultValue_Null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToInt_DefaultValue_Empty() {
        assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToInt_DefaultValue_Malformed() {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToInt_DefaultValue_Valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    @Test
    public void testToInt_Boundary_Max() {
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testToInt_Boundary_Overflow() {
        // เกิน Integer.MAX_VALUE -> NFE -> default 0
        assertEquals(0, NumberUtils.toInt("2147483648"));
    }

    // ===================== toLong(String) / toLong(String,long) =====================

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
    public void testToLong_Malformed() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLong_DefaultValue_Null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLong_DefaultValue_Empty() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLong_DefaultValue_Valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    @Test
    public void testToLong_Boundary_Overflow() {
        assertEquals(0L, NumberUtils.toLong("9223372036854775808")); // Long.MAX_VALUE+1
    }

    // ===================== toFloat(String) / toFloat(String,float) =====================

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
    public void testToFloat_Malformed() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloat_DefaultValue_Null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_DefaultValue_Empty() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_DefaultValue_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    // ===================== toDouble(String) / toDouble(String,double) =====================

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
    public void testToDouble_Malformed() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDouble_DefaultValue_Null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDouble_DefaultValue_Empty() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0d);
    }

    @Test
    public void testToDouble_DefaultValue_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    // ===================== toByte(String) / toByte(String,byte) =====================

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
    public void testToByte_Malformed() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByte_DefaultValue_Null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByte_DefaultValue_Empty() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByte_Boundary_Max() {
        assertEquals(Byte.MAX_VALUE, NumberUtils.toByte("127"));
    }

    @Test
    public void testToByte_Boundary_Overflow() {
        assertEquals((byte) 0, NumberUtils.toByte("128"));
    }

    // ===================== toShort(String) / toShort(String,short) =====================

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
    public void testToShort_Malformed() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShort_DefaultValue_Null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShort_Boundary_Overflow() {
        assertEquals((short) 0, NumberUtils.toShort("32768"));
    }

    // ===================== createNumber(String) =====================

    @Test
    public void testCreateNumber_Null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_DoubleMinus() {
        // str.startsWith("--") -> return null
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_Hex() {
        assertEquals(26, NumberUtils.createNumber("0x1A").intValue());
    }

    @Test
    public void testCreateNumber_NegativeHex() {
        assertEquals(-26, NumberUtils.createNumber("-0x1A").intValue());
    }

    @Test
    public void testCreateNumber_PlainInteger() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_PlainLong() {
        // เกิน Integer.MAX_VALUE แต่พอดีกับ Long
        Number n = NumberUtils.createNumber("2147483648");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_PlainBigInteger() {
        // เกิน Long.MAX_VALUE
        Number n = NumberUtils.createNumber("12345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_PlainFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_FloatToDouble_WhenFloatInfinite() {
        // ใหญ่เกิน Float range แต่พอดีกับ Double
        Number n = NumberUtils.createNumber("1.4E50");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_DoubleToBigDecimal_WhenDoubleInfinite() {
        // ใหญ่เกินทั้ง Float และ Double
        Number n = NumberUtils.createNumber("1.4E400");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_Zero_AllZeros_ReturnsFloat() {
        // mant/dec เป็น "0" ทั้งหมด -> allZeros = true -> float 0.0 ถูกคืนตรง ๆ
        Number n = NumberUtils.createNumber("0.0");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_Underflow_NotAllZeros_FallsToDouble() {
        // ค่าเล็กมากจน underflow เป็น 0.0f แต่ไม่ใช่ allZeros -> fallback เป็น Double
        Number n = NumberUtils.createNumber("1e-50");
        assertTrue(n instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ExpBeforeDec_Throws() {
        // decPos > -1 && expPos > -1 && expPos < decPos -> throw
        NumberUtils.createNumber("1e2.3");
    }

    // ---- suffix 'L'/'l' ----

    @Test
    public void testCreateNumber_LSuffix_Long() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_LSuffix_NegativeLong() {
        Number n = NumberUtils.createNumber("-123L");
        assertTrue(n instanceof Long);
        assertEquals(-123L, n.longValue());
    }

    @Test
    public void testCreateNumber_LSuffix_TooBigForLong_BigInteger() {
        Number n = NumberUtils.createNumber("12345678901234567890L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LSuffix_WithDecimal_Throws() {
        // dec != null -> ไม่เข้าเงื่อนไข -> throw
        NumberUtils.createNumber("1.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LSuffix_WithExponent_Throws() {
        // exp != null -> ไม่เข้าเงื่อนไข -> throw
        NumberUtils.createNumber("1e2L");
    }

    // ---- suffix 'F'/'f' ----

    @Test
    public void testCreateNumber_FSuffix_Float() {
        Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_FSuffix_FallThroughToDouble() {
        // เกิน float range -> fall through ไป double
        Number n = NumberUtils.createNumber("1.5E50F");
        assertTrue(n instanceof Double);
    }

    // ---- suffix 'D'/'d' ----

    @Test
    public void testCreateNumber_DSuffix_Double() {
        Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_DSuffix_FallThroughToBigDecimal() {
        // เกิน double range -> fall through ไป BigDecimal
        Number n = NumberUtils.createNumber("1.5E400D");
        assertTrue(n instanceof BigDecimal);
    }

    // ---- default (invalid suffix) ----

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidSuffix_Throws() {
        NumberUtils.createNumber("123X");
    }

    // ===================== createFloat/createDouble/createInteger/createLong/createBigInteger/createBigDecimal =====================

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
    public void testCreateInteger_Decimal() {
        assertEquals(123, NumberUtils.createInteger("123").intValue());
    }

    @Test
    public void testCreateInteger_Hex() {
        assertEquals(16, NumberUtils.createInteger("0x10").intValue());
    }

    @Test
    public void testCreateInteger_Octal() {
        // Integer.decode ตีความ leading 0 เป็น octal
        assertEquals(8, NumberUtils.createInteger("010").intValue());
    }

    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(123L, NumberUtils.createLong("123").longValue());
    }

    @Test
    public void testCreateBigInteger_Null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_Valid() {
        assertEquals(BigInteger.valueOf(123), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank_Throws() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    // ===================== min(array) =====================

    @Test
    public void testMinLongArray_Normal() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinIntArray_Normal() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
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
    public void testMinShortArray_Normal() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
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
    public void testMinByteArray_Normal() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
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
    public void testMinDoubleArray_Normal() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 3.0})));
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
    public void testMinFloatArray_Normal() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 3.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty() {
        NumberUtils.min(new float[0]);
    }

    // ===================== max(array) =====================

    @Test
    public void testMaxLongArray_Normal() {
        assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
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
    public void testMaxIntArray_Normal() {
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
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
    public void testMaxShortArray_Normal() {
        assertEquals((short) 3, NumberUtils.max(new short[]{(short) 3, (short) 1, (short) 2}));
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
    public void testMaxByteArray_Normal() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
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
    public void testMaxDoubleArray_Normal() {
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 3.0})));
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
    public void testMaxFloatArray_Normal() {
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty() {
        NumberUtils.max(new float[0]);
    }

    // ===================== min(a,b,c) 3-param =====================

    @Test
    public void testMin3Long_AllBranches() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L)); // b<a false, c<a false
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L)); // b<a true, c<a false(c<1 false)
        assertEquals(1L, NumberUtils.min(2L, 3L, 1L)); // b<a false, c<a true
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L)); // b<a true, c<a true
    }

    @Test
    public void testMin3Int_AllBranches() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(2, 3, 1));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Short_AllBranches() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 3, (short) 1));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3Byte_AllBranches() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 3, (byte) 1));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin3Double() {
        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0d);
    }

    @Test
    public void testMin3Float() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
    }

    // ===================== max(a,b,c) 3-param =====================

    @Test
    public void testMax3Long_AllBranches() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L)); // b>a true, c>a true
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L)); // b>a false, c>a false
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L)); // b>a true, c>a false
        assertEquals(3L, NumberUtils.max(2L, 1L, 3L)); // b>a false, c>a true
    }

    @Test
    public void testMax3Int_AllBranches() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(3, 2, 1));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(2, 1, 3));
    }

    @Test
    public void testMax3Short_AllBranches() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 1, (short) 3));
    }

    @Test
    public void testMax3Byte_AllBranches() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 1, (byte) 3));
    }

    @Test
    public void testMax3Double() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0d);
    }

    @Test
    public void testMax3Float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0f);
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
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    // ===================== isNumber =====================

    @Test
    public void testIsNumber_NullEmpty() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_Hex_Valid() {
        assertTrue(NumberUtils.isNumber("0x1A"));
        assertTrue(NumberUtils.isNumber("-0x1A"));
    }

    @Test
    public void testIsNumber_Hex_OnlyPrefix() {
        assertFalse(NumberUtils.isNumber("0x")); // i == sz
    }

    @Test
    public void testIsNumber_Hex_InvalidChar() {
        assertFalse(NumberUtils.isNumber("0x1G"));
    }

    @Test
    public void testIsNumber_PlainDigits() {
        assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_DecimalLeadingDot() {
        assertTrue(NumberUtils.isNumber(".1234"));
    }

    @Test
    public void testIsNumber_DecimalTrailingDot() {
        assertTrue(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_LoneDot() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_TwoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_Exponent_Valid() {
        assertTrue(NumberUtils.isNumber("1234E21"));
        assertTrue(NumberUtils.isNumber("1234e21"));
    }

    @Test
    public void testIsNumber_Exponent_WithSign() {
        assertTrue(NumberUtils.isNumber("1e+10"));
        assertTrue(NumberUtils.isNumber("1e-10"));
    }

    @Test
    public void testIsNumber_Exponent_NoDigitBefore() {
        assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_Exponent_TwoEs() {
        assertFalse(NumberUtils.isNumber("1e2e3"));
    }

    @Test
    public void testIsNumber_Exponent_AtLastByte() {
        assertFalse(NumberUtils.isNumber("1e"));
    }

    @Test
    public void testIsNumber_SignWithoutAllow() {
        assertFalse(NumberUtils.isNumber("+123")); // '+' ไม่ถูก skip แบบ '-'
    }

    @Test
    public void testIsNumber_TypeQualifier_D_F() {
        assertTrue(NumberUtils.isNumber("1.1d"));
        assertTrue(NumberUtils.isNumber("1.1D"));
        assertTrue(NumberUtils.isNumber("1.1f"));
        assertTrue(NumberUtils.isNumber("1.1F"));
    }

    @Test
    public void testIsNumber_TypeQualifier_L_Valid() {
        assertTrue(NumberUtils.isNumber("1L"));
    }

    @Test
    public void testIsNumber_TypeQualifier_L_WithDecimal_Invalid() {
        assertFalse(NumberUtils.isNumber("1.1L"));
    }

    @Test
    public void testIsNumber_TypeQualifier_L_WithExponent_Invalid() {
        assertFalse(NumberUtils.isNumber("1e10L"));
    }

    @Test
    public void testIsNumber_IllegalLastChar() {
        assertFalse(NumberUtils.isNumber("123X"));
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด | Test Method (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| toInt/toLong/toFloat/toDouble/toByte/toShort | `test*_Null`, `test*_Empty`, `test*_Valid`, `test*_Malformed`, `test*_DefaultValue_*` | `str==null` true/false, try-success, catch(NumberFormatException) |
| toInt/toByte/toShort boundary | `test*_Boundary_Max`, `test*_Boundary_Overflow` | boundary values & overflow → NFE path |
| createNumber | `testCreateNumber_Null` | `str==null` |
| createNumber | `testCreateNumber_Blank` | `StringUtils.isBlank` → throw |
| createNumber | `testCreateNumber_DoubleMinus` | `startsWith("--")` |
| createNumber | `testCreateNumber_Hex/_NegativeHex` | `startsWith("0x")/("-0x")` |
| createNumber | `testCreateNumber_PlainInteger/_PlainLong/_PlainBigInteger` | ไม่มี dec/exp → try Integer→Long→BigInteger |
| createNumber | `testCreateNumber_PlainFloat/_FloatToDouble.../_DoubleToBigDecimal...` | มี dec/exp ไม่มี suffix → Float→Double→BigDecimal fallback |
| createNumber | `testCreateNumber_Zero_AllZeros...`, `_Underflow_NotAllZeros...` | `allZeros` true/false branch ในเงื่อนไข infinite/zero |
| createNumber | `testCreateNumber_ExpBeforeDec_Throws` | `expPos<decPos` → throw |
| createNumber | `testCreateNumber_LSuffix_*` | switch case `l/L`, isDigits check, too-big→BigInteger, dec/exp != null → throw |
| createNumber | `testCreateNumber_FSuffix_*` | case `f/F`, fall-through ไป `d/D` |
| createNumber | `testCreateNumber_DSuffix_*` | case `d/D`, fall-through ไป BigDecimal |
| createNumber | `testCreateNumber_InvalidSuffix_Throws` | `default:` throw |
| createFloat/Double/Integer/Long/BigInteger/BigDecimal | `testCreate*_Null/_Valid/_Hex/_Octal/_Blank_Throws` | `str==null`, normal parse, blank check (BigDecimal) |
| min/max(array) ทุก type | `testMin/MaxXxxArray_Normal/_Null/_Empty/_NaN` | `array==null`, `length==0`, loop compare, NaN short-circuit (double/float) |
| min/max(a,b,c) ทุก type | `testMin3/Max3Xxx_AllBranches` | ครบ 4 combination ของ `b<a`/`c<a` (หรือ `b>a`/`c>a`) true/false |
| isDigits | `testIsDigits_*` | `isEmpty` true/false, loop non-digit found/not found |
| isNumber | `testIsNumber_*` (20+ cases) | hex branch, dot/decimal point, exponent (e/E, sign, two E's, no digit before E), sign handling, qualifiers d/D/f/F/l/L, illegal last char, trailing conditions |

**หมายเหตุ:** เงื่อนไข `allowSigns && !foundDigit` ใน loop ของ `isNumber` วิเคราะห์แล้วพบว่าทั้งสอง flag ถูกตั้งเป็น `false` พร้อมกันเสมอในจุดที่ sign ถูกประมวลผล จึงดูเหมือนเป็น branch ที่ unreachable ในทางปฏิบัติ — ไม่ได้เขียนเทสเฉพาะสำหรับ branch นี้เพราะไม่มั่นใจว่ามี input ใดที่ทำให้เกิดขึ้นจริงได้ (ไม่ขอเดา behavior เพิ่ม)