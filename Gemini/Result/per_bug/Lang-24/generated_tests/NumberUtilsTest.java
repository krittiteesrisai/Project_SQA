package org.apache.commons.lang3.math;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new NumberUtils());
    }

    // -----------------------------------------------------------------------
    // toInt Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToInt() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("invalid"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("invalid", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    // -----------------------------------------------------------------------
    // toLong Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToLong() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("invalid"));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012"));
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("invalid", 5L));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012", 5L));
    }

    // -----------------------------------------------------------------------
    // toFloat Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToFloat() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0001f);
    }

    // -----------------------------------------------------------------------
    // toDouble Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToDouble() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0001d);
    }

    // -----------------------------------------------------------------------
    // toByte Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        assertEquals((byte) 12, NumberUtils.toByte("12"));
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
        assertEquals((byte) 12, NumberUtils.toByte("12", (byte) 5));
    }

    // -----------------------------------------------------------------------
    // toShort Tests
    // -----------------------------------------------------------------------
    @Test
    public void testToShort() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("invalid"));
        assertEquals((short) 123, NumberUtils.toShort("123"));
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
        assertEquals((short) 123, NumberUtils.toShort("123", (short) 5));
    }

    // -----------------------------------------------------------------------
    // createNumber Tests
    // -----------------------------------------------------------------------
    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));

        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createNumber("123456789012"));
        assertEquals(new BigInteger("123456789012345678901234567890"), 
                NumberUtils.createNumber("123456789012345678901234567890"));

        assertEquals(Integer.valueOf(0x12), NumberUtils.createNumber("0x12"));
        assertEquals(Integer.valueOf(-0x12), NumberUtils.createNumber("-0x12"));

        // Qualifier: Long
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123l"));
        assertEquals(new BigInteger("123456789012345678901234567890"), 
                NumberUtils.createNumber("123456789012345678901234567890L"));

        // Qualifier: Float / Double
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23F), NumberUtils.createNumber("1.23F"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23D), NumberUtils.createNumber("1.23D"));

        // No qualifier decimal/exponent
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf("1.23e2"), NumberUtils.createNumber("1.23e2"));
        assertEquals(Float.valueOf("1.23E2"), NumberUtils.createNumber("1.23E2"));
        assertEquals(Double.valueOf("1.7976931348623157e+308"), NumberUtils.createNumber("1.7976931348623157e+308"));
        assertEquals(new BigDecimal("1.7976931348623157e+309"), NumberUtils.createNumber("1.7976931348623157e+309"));

        // Zero combinations
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00e00"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWhitespace() {
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidExpPosition() {
        NumberUtils.createNumber("1.2e3.4");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidLongQualifier() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidQualifier() {
        NumberUtils.createNumber("123q");
    }

    // -----------------------------------------------------------------------
    // Individual createXxx Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIndividualCreators() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));

        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));

        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(15), NumberUtils.createInteger("15"));
        assertEquals(Integer.valueOf(15), NumberUtils.createInteger("0xF"));

        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(15L), NumberUtils.createLong("15"));

        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("1234567890"), NumberUtils.createBigInteger("1234567890"));

        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal(" ");
    }

    // -----------------------------------------------------------------------
    // Min/Max Array Tests
    // -----------------------------------------------------------------------
    @Test
    public void testMinMaxLongArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() {
        NumberUtils.min(new long[0]);
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
    public void testMinMaxIntArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayNull() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayEmpty() {
        NumberUtils.min(new int[0]);
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
    public void testMinMaxShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayNull() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayEmpty() {
        NumberUtils.min(new short[0]);
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
    public void testMinMaxByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayNull() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayEmpty() {
        NumberUtils.min(new byte[0]);
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
    public void testMinMaxDoubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.1d, Double.NaN, 2.2d})));
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayNull() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayEmpty() {
        NumberUtils.min(new double[0]);
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
    public void testMinMaxFloatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.1f, Float.NaN, 2.2f})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayNull() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayEmpty() {
        NumberUtils.min(new float[0]);
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
    // 3-Param Min/Max Tests
    // -----------------------------------------------------------------------
    @Test
    public void test3ParamMinMaxLong() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));

        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(2L, 3L, 1L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void test3ParamMinMaxInt() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));

        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(2, 3, 1));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void test3ParamMinMaxShort() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));

        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 3, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void test3ParamMinMaxByte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));

        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 3, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void test3ParamMinMaxDouble() {
        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);

        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(2.0d, 3.0d, 1.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 2.0d, 1.0d), 0.0001d);
    }

    @Test
    public void test3ParamMinMaxFloat() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);

        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(2.0f, 3.0f, 1.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    // -----------------------------------------------------------------------
    // isDigits Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-1234"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    // -----------------------------------------------------------------------
    // isNumber Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
        assertFalse(NumberUtils.isNumber("abc"));

        // Hex tests
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x123G"));

        // Integer / Sign tests
        assertTrue(NumberUtils.isNumber("1234"));
        assertTrue(NumberUtils.isNumber("-1234"));
        assertFalse(NumberUtils.isNumber("+1234"));
        assertFalse(NumberUtils.isNumber("--1234"));

        // Decimal tests
        assertTrue(NumberUtils.isNumber("1234."));
        assertTrue(NumberUtils.isNumber(".1234"));
        assertTrue(NumberUtils.isNumber("12.34"));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("1.2.3"));

        // Exponent tests
        assertTrue(NumberUtils.isNumber("1e2"));
        assertTrue(NumberUtils.isNumber("1E2"));
        assertTrue(NumberUtils.isNumber("1e+2"));
        assertTrue(NumberUtils.isNumber("1e-2"));
        assertTrue(NumberUtils.isNumber("1.2e3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1e2.3"));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("1234L"));
        assertTrue(NumberUtils.isNumber("1234l"));
        assertTrue(NumberUtils.isNumber("12.34f"));
        assertTrue(NumberUtils.isNumber("12.34F"));
        assertTrue(NumberUtils.isNumber("12.34d"));
        assertTrue(NumberUtils.isNumber("12.34D"));
        assertTrue(NumberUtils.isNumber("1e2f"));
        assertTrue(NumberUtils.isNumber("1e2d"));
        assertFalse(NumberUtils.isNumber("1e2L")); // 'L' not allowed with exponent
        assertFalse(NumberUtils.isNumber("1234q"));
        assertFalse(NumberUtils.isNumber("L"));
        assertFalse(NumberUtils.isNumber("f"));
    }
}