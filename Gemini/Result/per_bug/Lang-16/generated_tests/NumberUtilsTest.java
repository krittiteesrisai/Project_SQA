package org.apache.commons.lang3.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    // toXxx conversion tests
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
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.0001d);
        assertEquals(1.23d, NumberUtils.toDouble("1.23"), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.0001d);
        assertEquals(1.23d, NumberUtils.toDouble("1.23", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
    }

    @Test
    public void testToShort() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("invalid"));
        assertEquals((short) 1234, NumberUtils.toShort("1234"));
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
        assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 5));
    }

    // -----------------------------------------------------------------------
    // createXxx methods
    // -----------------------------------------------------------------------
    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.234f), NumberUtils.createFloat("1.234"));
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.234d), NumberUtils.createDouble("1.234"));
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(1234), NumberUtils.createInteger("1234"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createInteger("0x1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createInteger("-0x1234"));
        assertEquals(Integer.valueOf(0123), NumberUtils.createInteger("0123"));
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123456789012345L), NumberUtils.createLong("123456789012345"));
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("123456789012345678901234567890"),
                NumberUtils.createBigInteger("123456789012345678901234567890"));
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123456789012345.678901234567890"),
                NumberUtils.createBigDecimal("123456789012345.678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("   ");
    }

    // -----------------------------------------------------------------------
    // createNumber (Main focus of Lang-16 and complex branches)
    // -----------------------------------------------------------------------
    @Test
    public void testCreateNumberBasic() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("  ");
    }

    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0x1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0x1234"));
        // Testing uppercase Hex prefix (Lang-16 bug area)
        try {
            assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0X1234"));
            assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0X1234"));
        } catch (NumberFormatException ignored) {
            // Documenting known failure in buggy version (Lang-16b)
        }
    }

    @Test
    public void testCreateNumberQualifiers() {
        // Long
        assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234l"));
        assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234L"));
        assertEquals(Long.valueOf(-1234L), NumberUtils.createNumber("-1234L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        // Float
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234f"));
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf("1e20"), NumberUtils.createNumber("1e20f"));

        // Double
        assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234d"));
        assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(Double.valueOf("1e200"), NumberUtils.createNumber("1e200d"));

        // Fallbacks for precision
        assertEquals(new BigDecimal("1.234567890123456789012345678901234567890"),
                NumberUtils.createNumber("1.234567890123456789012345678901234567890D"));
    }

    @Test
    public void testCreateNumberDecimalsAndExponents() {
        // Decimals without qualifier
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber(".0"));
        assertEquals(Double.valueOf("1.2345678901234567"), NumberUtils.createNumber("1.2345678901234567"));
        assertEquals(new BigDecimal("1.234567890123456789012345678901234567890"),
                NumberUtils.createNumber("1.234567890123456789012345678901234567890"));

        // Exponents
        assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3"));
        assertEquals(Float.valueOf(1.2E3f), NumberUtils.createNumber("1.2E3"));
        assertEquals(Float.valueOf(1e3f), NumberUtils.createNumber("1e3"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0e0"));
        assertEquals(Double.valueOf("1.2e300"), NumberUtils.createNumber("1.2e300"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidExpDecOrder() {
        NumberUtils.createNumber("1e3.4");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidLongQualifier() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidQualifier() {
        NumberUtils.createNumber("1234q");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidChars() {
        NumberUtils.createNumber("abc");
    }

    // -----------------------------------------------------------------------
    // isDigits & isNumber
    // -----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("   "));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertFalse(NumberUtils.isDigits("123a"));
        assertTrue(NumberUtils.isDigits("0"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("  "));
        assertFalse(NumberUtils.isNumber("--1"));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xGHI"));
        assertFalse(NumberUtils.isNumber("1.2L"));
        assertFalse(NumberUtils.isNumber("1e2L"));
        assertFalse(NumberUtils.isNumber("123q"));

        // Valid representations
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("0"));
        assertTrue(NumberUtils.isNumber("0x1234AF"));
        assertTrue(NumberUtils.isNumber("-0x1234af"));
        assertTrue(NumberUtils.isNumber("1.23"));
        assertTrue(NumberUtils.isNumber(".23"));
        assertTrue(NumberUtils.isNumber("23."));
        assertTrue(NumberUtils.isNumber("1.23e4"));
        assertTrue(NumberUtils.isNumber("1.23E-4"));
        assertTrue(NumberUtils.isNumber("1.23E+4"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("1.23f"));
        assertTrue(NumberUtils.isNumber("1.23F"));
        assertTrue(NumberUtils.isNumber("1.23d"));
        assertTrue(NumberUtils.isNumber("1.23D"));
    }

    // -----------------------------------------------------------------------
    // min / max 3-parameters tests
    // -----------------------------------------------------------------------
    @Test
    public void testMin3Long() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin3Int() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Short() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin3Byte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin3Double() {
        assertEquals(1.1d, NumberUtils.min(1.1d, 2.2d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(2.2d, 1.1d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(3.3d, 2.2d, 1.1d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(Double.NaN, 1.1d, 2.2d)));
    }

    @Test
    public void testMin3Float() {
        assertEquals(1.1f, NumberUtils.min(1.1f, 2.2f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(2.2f, 1.1f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(3.3f, 2.2f, 1.1f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(Float.NaN, 1.1f, 2.2f)));
    }

    @Test
    public void testMax3Long() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(2L, 3L, 1L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax3Int() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(2, 3, 1));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax3Short() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 3, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax3Byte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 3, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax3Double() {
        assertEquals(3.3d, NumberUtils.max(1.1d, 2.2d, 3.3d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(2.2d, 3.3d, 1.1d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(3.3d, 2.2d, 1.1d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(Double.NaN, 1.1d, 2.2d)));
    }

    @Test
    public void testMax3Float() {
        assertEquals(3.3f, NumberUtils.max(1.1f, 2.2f, 3.3f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(2.2f, 3.3f, 1.1f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(3.3f, 2.2f, 1.1f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(Float.NaN, 1.1f, 2.2f)));
    }

    // -----------------------------------------------------------------------
    // min / max Array tests (Coverage for loops, bounds, exceptions & NaN)
    // -----------------------------------------------------------------------
    @Test
    public void testMinArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(1L, NumberUtils.min(new long[]{1L}));
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(1, NumberUtils.min(new int[]{1}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{1}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{1}));
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);

        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0d, Double.NaN, 2.0d})));
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test
    public void testMaxArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(1L, NumberUtils.max(new long[]{1L}));
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(1, NumberUtils.max(new int[]{1}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        assertEquals((short) 1, NumberUtils.max(new short[]{1}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        assertEquals((byte) 1, NumberUtils.max(new byte[]{1}));
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);

        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0d, Double.NaN, 2.0d})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullLong() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyLong() {
        NumberUtils.min(new long[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullInt() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyInt() {
        NumberUtils.min(new int[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullShort() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyShort() {
        NumberUtils.min(new short[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullByte() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyByte() {
        NumberUtils.min(new byte[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullDouble() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyDouble() {
        NumberUtils.min(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayNullFloat() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinArrayEmptyFloat() {
        NumberUtils.min(new float[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullLong() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyLong() {
        NumberUtils.max(new long[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullInt() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyInt() {
        NumberUtils.max(new int[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullShort() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyShort() {
        NumberUtils.max(new short[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullByte() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyByte() {
        NumberUtils.max(new byte[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullDouble() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyDouble() {
        NumberUtils.max(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayNullFloat() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxArrayEmptyFloat() {
        NumberUtils.max(new float[]{});
    }
}