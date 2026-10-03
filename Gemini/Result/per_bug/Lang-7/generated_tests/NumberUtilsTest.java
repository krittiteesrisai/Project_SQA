package org.apache.commons.lang3.math;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NumberUtils());
    }

    // --- toInt tests ---
    @Test
    public void testToIntString() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(0, NumberUtils.toInt("invalid"));
    }

    @Test
    public void testToIntStringWithDefault() {
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
        assertEquals(5, NumberUtils.toInt("invalid", 5));
    }

    // --- toLong tests ---
    @Test
    public void testToLongString() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(0L, NumberUtils.toLong("invalid"));
    }

    @Test
    public void testToLongStringWithDefault() {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("", 5L));
        assertEquals(123L, NumberUtils.toLong("123", 5L));
        assertEquals(5L, NumberUtils.toLong("invalid", 5L));
    }

    // --- toFloat tests ---
    @Test
    public void testToFloatString() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.001f);
        assertEquals(123.45f, NumberUtils.toFloat("123.45"), 0.001f);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.001f);
    }

    @Test
    public void testToFloatStringWithDefault() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.001f);
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.001f);
        assertEquals(123.45f, NumberUtils.toFloat("123.45", 1.1f), 0.001f);
        assertEquals(1.1f, NumberUtils.toFloat("invalid", 1.1f), 0.001f);
    }

    // --- toDouble tests ---
    @Test
    public void testToDoubleString() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(123.45d, NumberUtils.toDouble("123.45"), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.0001d);
    }

    @Test
    public void testToDoubleStringWithDefault() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
        assertEquals(123.45d, NumberUtils.toDouble("123.45", 1.1d), 0.0001d);
        assertEquals(1.1d, NumberUtils.toDouble("invalid", 1.1d), 0.0001d);
    }

    // --- toByte tests ---
    @Test
    public void testToByteString() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
        assertEquals((byte) 0, NumberUtils.toByte("invalid"));
    }

    @Test
    public void testToByteStringWithDefault() {
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
    }

    // --- toShort tests ---
    @Test
    public void testToShortString() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 123, NumberUtils.toShort("123"));
        assertEquals((short) 0, NumberUtils.toShort("invalid"));
    }

    @Test
    public void testToShortStringWithDefault() {
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 123, NumberUtils.toShort("123", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
    }

    // --- createNumber tests ---
    @Test
    public void testCreateNumberNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberDoubleDash() {
        assertNull(NumberUtils.createNumber("--123"));
    }

    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("0xa"));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("0XA"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createNumber("-0xa"));
        assertEquals(Integer.valueOf(-10), NumberUtils.createNumber("-0XA"));
        // Long hex (> 8 digits)
        assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
    }

    @Test
    public void testCreateNumberWithQualifiers() {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Float.valueOf(123.4f), NumberUtils.createNumber("123.4f"));
        assertEquals(Float.valueOf(123.4f), NumberUtils.createNumber("123.4F"));
        assertEquals(Double.valueOf(123.4d), NumberUtils.createNumber("123.4d"));
        assertEquals(Double.valueOf(123.4d), NumberUtils.createNumber("123.4D"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidLongQualifier() {
        NumberUtils.createNumber("123.4L");
    }

    @Test
    public void testCreateNumberStandard() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertTrue(NumberUtils.createNumber("123.45") instanceof Double);
        assertTrue(NumberUtils.createNumber("123.45e10") instanceof Double);
    }

    @Test
    public void testCreateNumberScientificAndDecimals() {
        assertNotNull(NumberUtils.createNumber("1.23e4"));
        assertNotNull(NumberUtils.createNumber("1.23E4"));
        assertNotNull(NumberUtils.createNumber("0.0"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidExpPos() {
        NumberUtils.createNumber("1.2e+2.3");
    }

    // --- create specific types ---
    @Test
    public void testCreateSpecificTypes() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));

        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));

        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(10), NumberUtils.createInteger("10"));

        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(10L), NumberUtils.createLong("10"));

        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("10"), NumberUtils.createBigInteger("10"));

        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("10.5"), NumberUtils.createBigDecimal("10.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("   ");
    }

    // --- min/max array tests ---
    @Test
    public void testMinArrays() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);

        // NaN handling
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.0d, Double.NaN, 1.0d})));
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.0f, Float.NaN, 1.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() { NumberUtils.min((long[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() { NumberUtils.min(new long[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayNull() { NumberUtils.min((int[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayEmpty() { NumberUtils.min(new int[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayNull() { NumberUtils.min((short[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayEmpty() { NumberUtils.min(new short[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayNull() { NumberUtils.min((byte[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayEmpty() { NumberUtils.min(new byte[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayNull() { NumberUtils.min((double[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayEmpty() { NumberUtils.min(new double[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayNull() { NumberUtils.min((float[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayEmpty() { NumberUtils.min(new float[]{}); }

    @Test
    public void testMaxArrays() {
        assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{3, 1, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 1, 2}));
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);

        // NaN handling
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{3.0d, Double.NaN, 1.0d})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{3.0f, Float.NaN, 1.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayNull() { NumberUtils.max((long[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayEmpty() { NumberUtils.max(new long[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayNull() { NumberUtils.max((int[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayEmpty() { NumberUtils.max(new int[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayNull() { NumberUtils.max((short[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayEmpty() { NumberUtils.max(new short[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayNull() { NumberUtils.max((byte[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayEmpty() { NumberUtils.max(new byte[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayNull() { NumberUtils.max((double[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayEmpty() { NumberUtils.max(new double[]{}); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayNull() { NumberUtils.max((float[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayEmpty() { NumberUtils.max(new float[]{}); }

    // --- 3 param min/max tests ---
    @Test
    public void testMin3Param() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(1L, NumberUtils.min(2L, 3L, 1L));
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(1, NumberUtils.min(2, 3, 1));
        assertEquals((short) 1, NumberUtils.min((short)3, (short)1, (short)2));
        assertEquals((short) 1, NumberUtils.min((short)2, (short)3, (short)1));
        assertEquals((byte) 1, NumberUtils.min((byte)3, (byte)1, (byte)2));
        assertEquals((byte) 1, NumberUtils.min((byte)2, (byte)3, (byte)1));
        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0001d);
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    @Test
    public void testMax3Param() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(2L, 1L, 3L));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(2, 1, 3));
        assertEquals((short) 3, NumberUtils.max((short)1, (short)3, (short)2));
        assertEquals((short) 3, NumberUtils.max((short)2, (short)1, (short)3));
        assertEquals((byte) 3, NumberUtils.max((byte)1, (byte)3, (byte)2));
        assertEquals((byte) 3, NumberUtils.max((byte)2, (byte)1, (byte)3));
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // --- isDigits tests ---
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    // --- isNumber tests ---
    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("1e10"));
        assertTrue(NumberUtils.isNumber("0x123"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("0xG"));
        assertFalse(NumberUtils.isNumber("123..45"));
        assertFalse(NumberUtils.isNumber("1e10e10"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("abc"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertFalse(NumberUtils.isNumber("123.4L"));
    }
}