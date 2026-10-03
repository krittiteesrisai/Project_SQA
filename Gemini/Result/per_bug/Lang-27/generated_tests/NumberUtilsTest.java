package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor & Constants
    // -----------------------------------------------------------------------
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

    // -----------------------------------------------------------------------
    // toInt, toLong, toFloat, toDouble, toByte, toShort
    // -----------------------------------------------------------------------
    @Test
    public void testToInt() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("invalid", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToLong() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("abc"));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        assertEquals(99L, NumberUtils.toLong(null, 99L));
        assertEquals(99L, NumberUtils.toLong("invalid", 99L));
        assertEquals(123L, NumberUtils.toLong("123", 99L));
    }

    @Test
    public void testToFloat() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
        assertEquals(1.25f, NumberUtils.toFloat("1.25"), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0001f);
        assertEquals(2.5f, NumberUtils.toFloat("2.5", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
        assertEquals(9.9d, NumberUtils.toDouble(null, 9.9d), 0.0001d);
        assertEquals(9.9d, NumberUtils.toDouble("invalid", 9.9d), 0.0001d);
        assertEquals(3.14d, NumberUtils.toDouble("3.14", 9.9d), 0.0001d);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
        assertEquals((byte) 120, NumberUtils.toByte("120"));
        assertEquals((byte) 8, NumberUtils.toByte(null, (byte) 8));
        assertEquals((byte) 8, NumberUtils.toByte("invalid", (byte) 8));
        assertEquals((byte) 12, NumberUtils.toByte("12", (byte) 8));
    }

    @Test
    public void testToShort() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("abc"));
        assertEquals((short) 1234, NumberUtils.toShort("1234"));
        assertEquals((short) 42, NumberUtils.toShort(null, (short) 42));
        assertEquals((short) 42, NumberUtils.toShort("invalid", (short) 42));
        assertEquals((short) 99, NumberUtils.toShort("99", (short) 42));
    }

    // -----------------------------------------------------------------------
    // Individual Factory Methods: createFloat, createDouble, createInteger, ...
    // -----------------------------------------------------------------------
    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf("12.34"), NumberUtils.createFloat("12.34"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloatInvalid() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf("123.456"), NumberUtils.createDouble("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDoubleInvalid() {
        NumberUtils.createDouble("invalid");
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(0x1a), NumberUtils.createInteger("0x1a"));
        assertEquals(Integer.valueOf(012), NumberUtils.createInteger("012")); // Octal
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateIntegerInvalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createLong("1234567890123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLongInvalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("98765432109876543210"), NumberUtils.createBigInteger("98765432109876543210"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigIntegerInvalid() {
        NumberUtils.createBigInteger("invalid");
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123456789.987654321"), NumberUtils.createBigDecimal("123456789.987654321"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("  ");
    }

    // -----------------------------------------------------------------------
    // createNumber - Comprehensive Branch & Edge Case Coverage
    // -----------------------------------------------------------------------
    @Test
    public void testCreateNumberNullAndBlankAndDashDash() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberEmpty() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(0x1F), NumberUtils.createNumber("0x1F"));
        assertEquals(Integer.valueOf(-0x1F), NumberUtils.createNumber("-0x1F"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0X1234"));
    }

    @Test
    public void testCreateNumberIntegers() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648")); // Overflow Integer -> Long
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808")); // Overflow Long -> BigInteger
    }

    @Test
    public void testCreateNumberTypeSpecifierLong() {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L")); // Overflow Long with L
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberTypeSpecifierLongWithDecimal() {
        NumberUtils.createNumber("123.45L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberTypeSpecifierLongWithExp() {
        NumberUtils.createNumber("123e2L");
    }

    @Test
    public void testCreateNumberTypeSpecifierFloat() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createNumber("-1.23f"));
        // Float overflow with 'f' qualifier -> falls through to Double or BigDecimal
        Number num = NumberUtils.createNumber("1.17549435e-45f");
        assertTrue(num instanceof Float);
    }

    @Test
    public void testCreateNumberTypeSpecifierDouble() {
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(Double.valueOf(-1.23d), NumberUtils.createNumber("-1.23d"));
        // Extremely small/large double falling through to BigDecimal
        assertEquals(new BigDecimal("1e-400"), NumberUtils.createNumber("1e-400d"));
    }

    @Test
    public void testCreateNumberDecimalsWithoutTypeSpecifier() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createNumber("-1.23"));
        assertEquals(Float.valueOf("0.0"), NumberUtils.createNumber("0.0"));
        // Precision requiring Double or BigDecimal
        Number bigDec = NumberUtils.createNumber("1.123456789012345678901234567890");
        assertTrue(bigDec instanceof BigDecimal);
    }

    @Test
    public void testCreateNumberScientificNotation() {
        assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3"));
        assertEquals(Float.valueOf(1.2E3f), NumberUtils.createNumber("1.2E3"));
        assertEquals(Float.valueOf(1.2e-3f), NumberUtils.createNumber("1.2e-3"));
        assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3f"));
        assertEquals(Double.valueOf(1.2e3d), NumberUtils.createNumber("1.2e3d"));
        assertEquals(Double.valueOf(1.2e300d), NumberUtils.createNumber("1.2e300"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberExpBeforeDec() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidSuffix() {
        NumberUtils.createNumber("1234z");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidExponentOnly() {
        NumberUtils.createNumber("e123");
    }

    // -----------------------------------------------------------------------
    // min & max for Array primitives
    // -----------------------------------------------------------------------
    @Test
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[] { 5L, 3L, 1L, 4L }));
        assertEquals(-10L, NumberUtils.min(new long[] { -10L, 0L, 10L }));
        assertEquals(42L, NumberUtils.min(new long[] { 42L }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMaxLongArray() {
        assertEquals(5L, NumberUtils.max(new long[] { 1L, 3L, 5L, 4L }));
        assertEquals(10L, NumberUtils.max(new long[] { -10L, 0L, 10L }));
        assertEquals(42L, NumberUtils.max(new long[] { 42L }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayNull() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayEmpty() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[] { 3, 1, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayNull() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayEmpty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMaxIntArray() {
        assertEquals(3, NumberUtils.max(new int[] { 1, 3, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayNull() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayEmpty() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[] { 3, 1, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayNull() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayEmpty() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMaxShortArray() {
        assertEquals((short) 3, NumberUtils.max(new short[] { 1, 3, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayNull() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayEmpty() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[] { 3, 1, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayNull() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayEmpty() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMaxByteArray() {
        assertEquals((byte) 3, NumberUtils.max(new byte[] { 1, 3, 2 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayNull() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayEmpty() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void testMinDoubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[] { 3.3d, 1.1d, 2.2d }), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[] { 1.0d, Double.NaN, 2.0d })));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayNull() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayEmpty() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMaxDoubleArray() {
        assertEquals(3.3d, NumberUtils.max(new double[] { 1.1d, 3.3d, 2.2d }), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[] { 1.0d, Double.NaN, 2.0d })));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayNull() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayEmpty() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void testMinFloatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[] { 3.3f, 1.1f, 2.2f }), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[] { 1.0f, Float.NaN, 2.0f })));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayNull() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayEmpty() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMaxFloatArray() {
        assertEquals(3.3f, NumberUtils.max(new float[] { 1.1f, 3.3f, 2.2f }), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[] { 1.0f, Float.NaN, 2.0f })));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayNull() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayEmpty() {
        NumberUtils.max(new float[0]);
    }

    // -----------------------------------------------------------------------
    // 3-param min & max
    // -----------------------------------------------------------------------
    @Test
    public void testMin3Params() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));

        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));

        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));

        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));

        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);

        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    @Test
    public void testMax3Params() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));

        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));

        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));

        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));

        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 2.0d, 1.0d), 0.0001d);

        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    // -----------------------------------------------------------------------
    // isDigits
    // -----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("  "));
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123a45"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.34"));
    }

    // -----------------------------------------------------------------------
    // isNumber
    // -----------------------------------------------------------------------
    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("  "));

        // Integers
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("+123"));
        assertTrue(NumberUtils.isNumber("0"));

        // Hex
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0XABCDef"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x123G"));

        // Floating points & Scientific
        assertTrue(NumberUtils.isNumber("1.23"));
        assertTrue(NumberUtils.isNumber("-1.23"));
        assertTrue(NumberUtils.isNumber(".5"));
        assertTrue(NumberUtils.isNumber("1."));
        assertTrue(NumberUtils.isNumber("1e5"));
        assertTrue(NumberUtils.isNumber("1.2E-3"));
        assertTrue(NumberUtils.isNumber("1.2e+3"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("e3"));
        assertFalse(NumberUtils.isNumber("."));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("1.23f"));
        assertTrue(NumberUtils.isNumber("1.23F"));
        assertTrue(NumberUtils.isNumber("1.23d"));
        assertTrue(NumberUtils.isNumber("1.23D"));
        assertFalse(NumberUtils.isNumber("123e4L")); // Not allowed L with exponent
        assertFalse(NumberUtils.isNumber("1.23z"));
        assertFalse(NumberUtils.isNumber("L"));
        assertFalse(NumberUtils.isNumber("f"));
    }
}