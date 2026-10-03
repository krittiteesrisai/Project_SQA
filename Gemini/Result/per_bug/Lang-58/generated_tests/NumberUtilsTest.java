package org.apache.commons.lang.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    // ------------------------------------------------------------------
    // Constructor & Constant Tests
    // ------------------------------------------------------------------
    @Test
    public void testConstructorAndConstants() {
        assertNotNull(new NumberUtils());
        assertEquals(Long.valueOf(0L), NumberUtils.LONG_ZERO);
        assertEquals(Long.valueOf(1L), NumberUtils.LONG_ONE);
        assertEquals(Long.valueOf(-1L), NumberUtils.LONG_MINUS_ONE);
        assertEquals(Integer.valueOf(0), NumberUtils.INTEGER_ZERO);
        assertEquals(Integer.valueOf(1), NumberUtils.INTEGER_ONE);
        assertEquals(Integer.valueOf(-1), NumberUtils.INTEGER_MINUS_ONE);
        assertEquals(Short.valueOf((short) 0), NumberUtils.SHORT_ZERO);
        assertEquals(Short.valueOf((short) 1), NumberUtils.SHORT_ONE);
        assertEquals(Short.valueOf((short) -1), NumberUtils.SHORT_MINUS_ONE);
        assertEquals(Byte.valueOf((byte) 0), NumberUtils.BYTE_ZERO);
        assertEquals(Byte.valueOf((byte) 1), NumberUtils.BYTE_ONE);
        assertEquals(Byte.valueOf((byte) -1), NumberUtils.BYTE_MINUS_ONE);
        assertEquals(Double.valueOf(0.0d), NumberUtils.DOUBLE_ZERO);
        assertEquals(Double.valueOf(1.0d), NumberUtils.DOUBLE_ONE);
        assertEquals(Double.valueOf(-1.0d), NumberUtils.DOUBLE_MINUS_ONE);
        assertEquals(Float.valueOf(0.0f), NumberUtils.FLOAT_ZERO);
        assertEquals(Float.valueOf(1.0f), NumberUtils.FLOAT_ONE);
        assertEquals(Float.valueOf(-1.0f), NumberUtils.FLOAT_MINUS_ONE);
    }

    // ------------------------------------------------------------------
    // toInt, toLong, toFloat, toDouble & Legacy stringToInt Tests
    // ------------------------------------------------------------------
    @Test
    public void testToInt() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("invalid"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("invalid", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));

        // Deprecated stringToInt
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(5, NumberUtils.stringToInt(null, 5));
        assertEquals(5, NumberUtils.stringToInt("invalid", 5));
    }

    @Test
    public void testToLong() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("invalid"));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("invalid", 5L));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123", 5L));
    }

    @Test
    public void testToFloat() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0f);
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0f);
        assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0f);
    }

    @Test
    public void testToDouble() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.0d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0d);
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0d);
        assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.0d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0d);
    }

    // ------------------------------------------------------------------
    // createNumber Tests (Including Defects4J Lang-58 Targets)
    // ------------------------------------------------------------------
    @Test
    public void testCreateNumberNullAndBlank() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123")); // protection for BigDecimal bug
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWhitespace() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0XFF"));
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0XFF"));
    }

    @Test
    public void testCreateNumberLongQualifier() {
        // Defects4J Lang-58 specific tests (single digit long, negative single digit long, multiple digits)
        assertEquals(Long.valueOf(1L), NumberUtils.createNumber("1l"));
        assertEquals(Long.valueOf(1L), NumberUtils.createNumber("1L"));
        assertEquals(Long.valueOf(-1L), NumberUtils.createNumber("-1l"));
        assertEquals(Long.valueOf(-1L), NumberUtils.createNumber("-1L"));
        assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345L"));
        assertEquals(Long.valueOf(-12345L), NumberUtils.createNumber("-12345L"));

        // Overflow Long -> BigInteger with 'L' qualifier
        assertEquals(new BigInteger("999999999999999999999999999999"),
                NumberUtils.createNumber("999999999999999999999999999999L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberLongInvalidFormat1() {
        NumberUtils.createNumber("1.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberLongInvalidFormat2() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberLongInvalidFormat3() {
        NumberUtils.createNumber("L");
    }

    @Test
    public void testCreateNumberFloatAndDoubleQualifier() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23F), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(-0.0f), NumberUtils.createNumber("-0.0f"));

        assertEquals(Double.valueOf(1.234567890123d), NumberUtils.createNumber("1.234567890123d"));
        assertEquals(Double.valueOf(1.234567890123D), NumberUtils.createNumber("1.234567890123D"));

        // Float precision overflow fallthrough to Double/BigDecimal
        Number numF = NumberUtils.createNumber("3.4028236e+39f");
        assertTrue(numF instanceof Double || numF instanceof BigDecimal);

        // Double precision overflow fallthrough to BigDecimal
        Number numD = NumberUtils.createNumber("1.7976931348623159e+309d");
        assertTrue(numD instanceof BigDecimal);
    }

    @Test
    public void testCreateNumberNoQualifier() {
        // Integer, Long, BigInteger
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("999999999999999999999999999999"),
                NumberUtils.createNumber("999999999999999999999999999999"));

        // Decimal / Exponent -> Float, Double, BigDecimal
        assertEquals(Float.valueOf("1.23"), NumberUtils.createNumber("1.23"));
        assertEquals(Double.valueOf("1.7976931348623157e+307"), NumberUtils.createNumber("1.7976931348623157e+307"));
        assertEquals(new BigDecimal("1.7976931348623159e+309"), NumberUtils.createNumber("1.7976931348623159e+309"));
        assertEquals(Float.valueOf("1e2"), NumberUtils.createNumber("1e2"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberMalformedExponent() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidQualifier() {
        NumberUtils.createNumber("1234q");
    }

    // ------------------------------------------------------------------
    // Direct Creator Methods Tests
    // ------------------------------------------------------------------
    @Test
    public void testDirectCreators() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.2f), NumberUtils.createFloat("1.2"));

        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.2), NumberUtils.createDouble("1.2"));

        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(12), NumberUtils.createInteger("12"));
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));

        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));

        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("123456789"), NumberUtils.createBigInteger("123456789"));

        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("");
    }

    // ------------------------------------------------------------------
    // Array Equals Tests
    // ------------------------------------------------------------------
    @Test
    public void testArrayEquals() {
        // byte[]
        byte[] b1 = new byte[]{1, 2};
        byte[] b2 = new byte[]{1, 2};
        byte[] b3 = new byte[]{1, 3};
        assertTrue(NumberUtils.equals(b1, b1));
        assertFalse(NumberUtils.equals(b1, null));
        assertFalse(NumberUtils.equals(null, b1));
        assertFalse(NumberUtils.equals(b1, new byte[]{1}));
        assertTrue(NumberUtils.equals(b1, b2));
        assertFalse(NumberUtils.equals(b1, b3));

        // short[]
        short[] s1 = new short[]{1, 2};
        short[] s2 = new short[]{1, 2};
        short[] s3 = new short[]{1, 3};
        assertTrue(NumberUtils.equals(s1, s1));
        assertFalse(NumberUtils.equals(s1, null));
        assertFalse(NumberUtils.equals(null, s1));
        assertFalse(NumberUtils.equals(s1, new short[]{1}));
        assertTrue(NumberUtils.equals(s1, s2));
        assertFalse(NumberUtils.equals(s1, s3));

        // int[]
        int[] i1 = new int[]{1, 2};
        int[] i2 = new int[]{1, 2};
        int[] i3 = new int[]{1, 3};
        assertTrue(NumberUtils.equals(i1, i1));
        assertFalse(NumberUtils.equals(i1, null));
        assertFalse(NumberUtils.equals(null, i1));
        assertFalse(NumberUtils.equals(i1, new int[]{1}));
        assertTrue(NumberUtils.equals(i1, i2));
        assertFalse(NumberUtils.equals(i1, i3));

        // long[]
        long[] l1 = new long[]{1L, 2L};
        long[] l2 = new long[]{1L, 2L};
        long[] l3 = new long[]{1L, 3L};
        assertTrue(NumberUtils.equals(l1, l1));
        assertFalse(NumberUtils.equals(l1, null));
        assertFalse(NumberUtils.equals(null, l1));
        assertFalse(NumberUtils.equals(l1, new long[]{1L}));
        assertTrue(NumberUtils.equals(l1, l2));
        assertFalse(NumberUtils.equals(l1, l3));

        // float[]
        float[] f1 = new float[]{1.0f, Float.NaN, -0.0f};
        float[] f2 = new float[]{1.0f, Float.NaN, -0.0f};
        float[] f3 = new float[]{1.0f, Float.NaN, 0.0f};
        assertTrue(NumberUtils.equals(f1, f1));
        assertFalse(NumberUtils.equals(f1, null));
        assertFalse(NumberUtils.equals(null, f1));
        assertFalse(NumberUtils.equals(f1, new float[]{1.0f}));
        assertTrue(NumberUtils.equals(f1, f2));
        assertFalse(NumberUtils.equals(f1, f3));

        // double[]
        double[] d1 = new double[]{1.0d, Double.NaN, -0.0d};
        double[] d2 = new double[]{1.0d, Double.NaN, -0.0d};
        double[] d3 = new double[]{1.0d, Double.NaN, 0.0d};
        assertTrue(NumberUtils.equals(d1, d1));
        assertFalse(NumberUtils.equals(d1, null));
        assertFalse(NumberUtils.equals(null, d1));
        assertFalse(NumberUtils.equals(d1, new double[]{1.0d}));
        assertTrue(NumberUtils.equals(d1, d2));
        assertFalse(NumberUtils.equals(d1, d3));
    }

    // ------------------------------------------------------------------
    // Array Min / Max Tests
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongEmpty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 1.0d, 2.0d}), 0.0d);
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntNull() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntEmpty() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMaxArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        assertEquals(3.0d, NumberUtils.max(new double[]{1.0d, 3.0d, 2.0d}), 0.0d);
        assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 3.0f, 2.0f}), 0.0f);
    }

    // ------------------------------------------------------------------
    // 3 Parameters Min / Max Tests
    // ------------------------------------------------------------------
    @Test
    public void testMin3Params() {
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));

        assertEquals(1, NumberUtils.min(3, 2, 1));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(1, 2, 3));

        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));

        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));

        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0d);
        assertTrue(Double.isNaN(NumberUtils.min(3.0d, Double.NaN, 1.0d)));

        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0f);
        assertTrue(Float.isNaN(NumberUtils.min(3.0f, Float.NaN, 1.0f)));
    }

    @Test
    public void testMax3Params() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));

        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 1, 2));

        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));

        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));

        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0d);
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 3.0d)));

        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0f);
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 3.0f)));
    }

    // ------------------------------------------------------------------
    // Compare Double / Float Tests (IEEE 754 & Bit Level)
    // ------------------------------------------------------------------
    @Test
    public void testCompareDouble() {
        assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
        assertEquals(1, NumberUtils.compare(2.0d, 1.0d));
        assertEquals(0, NumberUtils.compare(1.0d, 1.0d));

        // -0.0 vs +0.0
        assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
        assertEquals(1, NumberUtils.compare(0.0d, -0.0d));
        assertEquals(0, NumberUtils.compare(0.0d, 0.0d));
        assertEquals(0, NumberUtils.compare(-0.0d, -0.0d));

        // NaN vs Numbers & NaN vs NaN
        assertEquals(1, NumberUtils.compare(Double.NaN, Double.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.NaN));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testCompareFloat() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));

        // -0.0 vs +0.0
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
        assertEquals(0, NumberUtils.compare(0.0f, 0.0f));
        assertEquals(0, NumberUtils.compare(-0.0f, -0.0f));

        // NaN vs Numbers & NaN vs NaN
        assertEquals(1, NumberUtils.compare(Float.NaN, Float.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.NaN));
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
    }

    // ------------------------------------------------------------------
    // isDigits & isNumber Tests
    // ------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
        assertFalse(NumberUtils.isNumber("foo"));

        // Hex
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0XABC"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xGHI"));

        // Integers and signs
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertFalse(NumberUtils.isNumber("+123"));
        assertFalse(NumberUtils.isNumber("-"));

        // Floats and Decimals
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("."));

        // Scientific Notation
        assertTrue(NumberUtils.isNumber("1e5"));
        assertTrue(NumberUtils.isNumber("1E5"));
        assertTrue(NumberUtils.isNumber("1.2e-3"));
        assertTrue(NumberUtils.isNumber("1.2E+3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1.2e3.4"));

        // Type Qualifiers
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("-123L"));
        assertFalse(NumberUtils.isNumber("123e4L")); // Not allowing L with exponent
        assertTrue(NumberUtils.isNumber("123.45f"));
        assertTrue(NumberUtils.isNumber("123.45F"));
        assertTrue(NumberUtils.isNumber("123.45d"));
        assertTrue(NumberUtils.isNumber("123.45D"));
        assertFalse(NumberUtils.isNumber("123a"));
    }
}