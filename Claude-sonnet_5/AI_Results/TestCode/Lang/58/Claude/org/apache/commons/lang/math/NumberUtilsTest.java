package org.apache.commons.lang.math;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * JUnit4 test suite for org.apache.commons.lang.math.NumberUtils (Defects4J Lang-58b)
 * มุ่งเน้น branch coverage และการตรวจจับข้อบกพร่องจริง
 */
public class NumberUtilsTest {

    // ===================== toInt / stringToInt =====================

    @Test
    public void testStringToInt_null() {
        assertEquals(0, NumberUtils.stringToInt(null));
    }

    @Test
    public void testStringToInt_valid() {
        assertEquals(1, NumberUtils.stringToInt("1"));
    }

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
    public void testStringToIntDefault_null() {
        assertEquals(1, NumberUtils.stringToInt(null, 1));
    }

    @Test
    public void testStringToIntDefault_valid() {
        assertEquals(1, NumberUtils.stringToInt("1", 0));
    }

    @Test
    public void testToIntDefault_null() {
        assertEquals(42, NumberUtils.toInt(null, 42));
    }

    @Test
    public void testToIntDefault_validNumber() {
        assertEquals(5, NumberUtils.toInt("5", 0));
    }

    @Test
    public void testToIntDefault_invalidNumber() {
        assertEquals(99, NumberUtils.toInt("abc", 99));
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
    public void testToLongDefault_valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    @Test
    public void testToLongDefault_invalid() {
        assertEquals(7L, NumberUtils.toLong("xyz", 7L));
    }

    // ===================== toFloat =====================

    @Test
    public void testToFloat_null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_empty() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
    }

    @Test
    public void testToFloat_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloatDefault_null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_invalid() {
        assertEquals(3.3f, NumberUtils.toFloat("bad", 3.3f), 0.0001f);
    }

    // ===================== toDouble =====================

    @Test
    public void testToDouble_null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
    }

    @Test
    public void testToDouble_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_invalid() {
        assertEquals(2.2d, NumberUtils.toDouble("bad", 2.2d), 0.0001d);
    }

    // ===================== createFloat / createDouble / createInteger / createLong =====================

    @Test
    public void testCreateFloat_null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_valid() {
        assertEquals(new Float("1.5"), NumberUtils.createFloat("1.5"));
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
        assertEquals(new Double("1.5"), NumberUtils.createDouble("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger_null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_valid() {
        assertEquals(new Integer(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_hex() {
        assertEquals(new Integer(255), NumberUtils.createInteger("0xFF"));
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
        assertEquals(new Long(123L), NumberUtils.createLong("123"));
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
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal_null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_valid() {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("abc");
    }

    // ===================== createNumber =====================

    @Test
    public void testCreateNumber_null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_doubleMinus() {
        // startsWith("--") -> null (ป้องกันบั๊ก BigDecimal บน OS X)
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hex() {
        Number n = NumberUtils.createNumber("0xFF");
        assertEquals(255, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHex() {
        Number n = NumberUtils.createNumber("-0xFF");
        assertEquals(-255, n.intValue());
    }

    @Test
    public void testCreateNumber_plainInt() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_plainLongOverflowInt() {
        // เกิน Integer.MAX_VALUE -> ตก Long
        Number n = NumberUtils.createNumber("12345678912");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_plainBigInteger() {
        // เกิน Long.MAX_VALUE -> ตก BigInteger
        String big = "123456789123456789123456789";
        Number n = NumberUtils.createNumber(big);
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_decimalNoExp() {
        Number n = NumberUtils.createNumber("1.5");
        assertNotNull(n);
        // ไม่ assert ชนิดเฉพาะเจาะจงเกินไป เพราะ logic เลือก Float ก่อนถ้า precision พอ
        assertTrue(n instanceof Float || n instanceof Double);
    }

    @Test
    public void testCreateNumber_decimalWithExp() {
        Number n = NumberUtils.createNumber("1.5E2");
        assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDecPoint() {
        // expPos(1) < decPos(3) -> throw NFE ("1E2.5")
        NumberUtils.createNumber("1E2.5");
    }

    @Test
    public void testCreateNumber_typeLSuffix_valid() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_typeLSuffix_bigInteger() {
        // ยาวเกิน long -> fallback BigInteger
        String big = "123456789123456789123456789L";
        Number n = NumberUtils.createNumber(big);
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeLSuffix_invalid_withDecimal() {
        // dec != null ทำให้เงื่อนไข L ไม่ผ่าน -> throw
        NumberUtils.createNumber("1.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeLSuffix_invalidChars() {
        // ไม่ใช่ตัวเลข -> isDigits fail -> throw
        NumberUtils.createNumber("abcL");
    }

    @Test
    public void testCreateNumber_typeFSuffix_valid() {
        Number n = NumberUtils.createNumber("1.5F");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_typeFSuffix_allZeros() {
        // allZeros=true -> เงื่อนไข exclude เป็น false -> คืน Float (ไม่ fallthrough)
        Number n = NumberUtils.createNumber("0.0F");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_typeDSuffix_valid() {
        Number n = NumberUtils.createNumber("1.5D");
        assertTrue(n instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidTypeChar() {
        // default case ของ switch -> throw NFE
        NumberUtils.createNumber("123Z");
    }

    // ===================== equals(byte[]) =====================

    @Test
    public void testEqualsByteArray_sameRef() {
        byte[] a = {1, 2, 3};
        assertTrue(NumberUtils.equals(a, a));
    }

    @Test
    public void testEqualsByteArray_bothNull() {
        assertTrue(NumberUtils.equals((byte[]) null, (byte[]) null));
    }

    @Test
    public void testEqualsByteArray_oneNull() {
        byte[] a = {1};
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(null, a));
    }

    @Test
    public void testEqualsByteArray_diffLength() {
        assertFalse(NumberUtils.equals(new byte[]{1, 2}, new byte[]{1, 2, 3}));
    }

    @Test
    public void testEqualsByteArray_diffContent() {
        assertFalse(NumberUtils.equals(new byte[]{1, 2, 3}, new byte[]{1, 9, 3}));
    }

    @Test
    public void testEqualsByteArray_equalContent() {
        assertTrue(NumberUtils.equals(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));
    }

    // ===================== equals(short[]) =====================

    @Test
    public void testEqualsShortArray_allBranches() {
        short[] a = {1, 2, 3}, b = {1, 2, 3}, c = {1, 9, 3}, d = {1, 2};
        assertTrue(NumberUtils.equals(a, a));
        assertTrue(NumberUtils.equals((short[]) null, (short[]) null));
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(a, d));
        assertFalse(NumberUtils.equals(a, c));
        assertTrue(NumberUtils.equals(a, b));
    }

    // ===================== equals(int[]) =====================

    @Test
    public void testEqualsIntArray_allBranches() {
        int[] a = {1, 2, 3}, b = {1, 2, 3}, c = {1, 9, 3}, d = {1, 2};
        assertTrue(NumberUtils.equals(a, a));
        assertTrue(NumberUtils.equals((int[]) null, (int[]) null));
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(a, d));
        assertFalse(NumberUtils.equals(a, c));
        assertTrue(NumberUtils.equals(a, b));
    }

    // ===================== equals(long[]) =====================

    @Test
    public void testEqualsLongArray_allBranches() {
        long[] a = {1, 2, 3}, b = {1, 2, 3}, c = {1, 9, 3}, d = {1, 2};
        assertTrue(NumberUtils.equals(a, a));
        assertTrue(NumberUtils.equals((long[]) null, (long[]) null));
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(a, d));
        assertFalse(NumberUtils.equals(a, c));
        assertTrue(NumberUtils.equals(a, b));
    }

    // ===================== equals(float[]) - ใช้ compare(float,float) ภายใน =====================

    @Test
    public void testEqualsFloatArray_allBranches() {
        float[] a = {1f, 2f, 3f}, b = {1f, 2f, 3f}, c = {1f, 9f, 3f}, d = {1f, 2f};
        assertTrue(NumberUtils.equals(a, a));
        assertTrue(NumberUtils.equals((float[]) null, (float[]) null));
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(a, d));
        assertFalse(NumberUtils.equals(a, c));
        assertTrue(NumberUtils.equals(a, b));
    }

    // ===================== equals(double[]) - ใช้ compare(double,double) ภายใน =====================

    @Test
    public void testEqualsDoubleArray_allBranches() {
        double[] a = {1d, 2d, 3d}, b = {1d, 2d, 3d}, c = {1d, 9d, 3d}, d = {1d, 2d};
        assertTrue(NumberUtils.equals(a, a));
        assertTrue(NumberUtils.equals((double[]) null, (double[]) null));
        assertFalse(NumberUtils.equals(a, null));
        assertFalse(NumberUtils.equals(a, d));
        assertFalse(NumberUtils.equals(a, c));
        assertTrue(NumberUtils.equals(a, b));
    }

    // ===================== min(array) ทุก type =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_null() { NumberUtils.min((long[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_empty() { NumberUtils.min(new long[0]); }

    @Test
    public void testMinLongArray_valid() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_null() { NumberUtils.min((int[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_empty() { NumberUtils.min(new int[0]); }

    @Test
    public void testMinIntArray_valid() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_null() { NumberUtils.min((short[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_empty() { NumberUtils.min(new short[0]); }

    @Test
    public void testMinShortArray_valid() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_null() { NumberUtils.min((byte[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_empty() { NumberUtils.min(new byte[0]); }

    @Test
    public void testMinByteArray_valid() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_null() { NumberUtils.min((double[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_empty() { NumberUtils.min(new double[0]); }

    @Test
    public void testMinDoubleArray_valid() {
        assertEquals(1.0, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_null() { NumberUtils.min((float[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_empty() { NumberUtils.min(new float[0]); }

    @Test
    public void testMinFloatArray_valid() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    // ===================== max(array) ทุก type =====================

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_null() { NumberUtils.max((long[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_empty() { NumberUtils.max(new long[0]); }

    @Test
    public void testMaxLongArray_valid() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_null() { NumberUtils.max((int[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_empty() { NumberUtils.max(new int[0]); }

    @Test
    public void testMaxIntArray_valid() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_null() { NumberUtils.max((short[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_empty() { NumberUtils.max(new short[0]); }

    @Test
    public void testMaxShortArray_valid() {
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_null() { NumberUtils.max((byte[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_empty() { NumberUtils.max(new byte[0]); }

    @Test
    public void testMaxByteArray_valid() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_null() { NumberUtils.max((double[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_empty() { NumberUtils.max(new double[0]); }

    @Test
    public void testMaxDoubleArray_valid() {
        assertEquals(3.0, NumberUtils.max(new double[]{1.0, 3.0, 2.0}), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_null() { NumberUtils.max((float[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_empty() { NumberUtils.max(new float[0]); }

    @Test
    public void testMaxFloatArray_valid() {
        assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 3.0f, 2.0f}), 0.0001f);
    }

    // ===================== min(a,b,c) 3-param ทุก type =====================

    @Test
    public void testMin3Long_allPositions() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L)); // a smallest
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L)); // b smallest
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L)); // c smallest
    }

    @Test
    public void testMin3Int_allPositions() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Short_allPositions() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3Byte_allPositions() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin3Double() {
        assertEquals(1.0, NumberUtils.min(1.0, 2.0, 3.0), 0.0001);
    }

    @Test
    public void testMin3Float() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
    }

    // ===================== max(a,b,c) 3-param ทุก type =====================

    @Test
    public void testMax3Long_allPositions() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax3Int_allPositions() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax3Short_allPositions() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax3Byte_allPositions() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax3Double() {
        assertEquals(3.0, NumberUtils.max(1.0, 2.0, 3.0), 0.0001);
    }

    @Test
    public void testMax3Float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
    }

    // ===================== compare(double,double) =====================

    @Test
    public void testCompareDouble_less() {
        assertEquals(-1, NumberUtils.compare(1.0, 2.0));
    }

    @Test
    public void testCompareDouble_greater() {
        assertEquals(1, NumberUtils.compare(2.0, 1.0));
    }

    @Test
    public void testCompareDouble_equal() {
        assertEquals(0, NumberUtils.compare(1.0, 1.0));
    }

    @Test
    public void testCompareDouble_nanEqualsNan() {
        // NaN==NaN ทาง Java เป็น false แต่ compare ต้องคืน 0 ผ่าน bits equal
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testCompareDouble_zeroVsNegZero() {
        // ทดสอบ branch bit-compare: +0.0 ถือว่ามากกว่า -0.0
        assertEquals(1, NumberUtils.compare(0.0, -0.0));
        assertEquals(-1, NumberUtils.compare(-0.0, 0.0));
    }

    @Test
    public void testCompareDouble_nanVsMax() {
        // NaN bits > MAX_VALUE bits -> +1 (ผ่าน bit compare branch)
        assertEquals(1, NumberUtils.compare(Double.NaN, Double.MAX_VALUE));
    }

    // ===================== compare(float,float) =====================

    @Test
    public void testCompareFloat_less() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
    }

    @Test
    public void testCompareFloat_greater() {
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_equal() {
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_nanEqualsNan() {
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
    }

    @Test
    public void testCompareFloat_zeroVsNegZero() {
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
    }

    @Test
    public void testCompareFloat_nanVsMax() {
        assertEquals(1, NumberUtils.compare(Float.NaN, Float.MAX_VALUE));
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
        assertFalse(NumberUtils.isDigits("123a5"));
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
    public void testIsNumber_plainInt() {
        assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_negativeInt() {
        assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_hexValid() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnly0x() {
        // "0x" ตามด้วยจบสตริง -> false
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_hexInvalidChar() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_decimal() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_twoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("123.45.6"));
    }

    @Test
    public void testIsNumber_exponent() {
        assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test
    public void testIsNumber_twoExponents() {
        assertFalse(NumberUtils.isNumber("1E2E3"));
    }

    @Test
    public void testIsNumber_expNoDigitBefore() {
        assertFalse(NumberUtils.isNumber("E10"));
    }

    @Test
    public void testIsNumber_expWithSign() {
        assertTrue(NumberUtils.isNumber("1.5E-10"));
    }

    @Test
    public void testIsNumber_invalidSignPosition() {
        assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_invalidChar() {
        assertFalse(NumberUtils.isNumber("12a45"));
    }

    @Test
    public void testIsNumber_endsWithE() {
        assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_floatSuffix() {
        assertTrue(NumberUtils.isNumber("123.45F"));
    }

    @Test
    public void testIsNumber_floatSuffixNoDigit() {
        // foundDigit=false ตั้งแต่ต้น -> คืน false เมื่อเจอ 'F'
        assertFalse(NumberUtils.isNumber("F"));
    }

    @Test
    public void testIsNumber_doubleSuffix() {
        assertTrue(NumberUtils.isNumber("123.45D"));
    }

    @Test
    public void testIsNumber_longSuffix() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longSuffixWithExp() {
        // L ร่วมกับ exponent ไม่อนุญาต
        assertFalse(NumberUtils.isNumber("123E4L"));
    }

    @Test
    public void testIsNumber_illegalLastChar() {
        assertFalse(NumberUtils.isNumber("123Z"));
    }

    @Test
    public void testIsNumber_endsWithSignOnly() {
        // จบด้วย '-' หลัง E โดยไม่มี digit ตามมา
        assertFalse(NumberUtils.isNumber("1E-"));
    }
}
