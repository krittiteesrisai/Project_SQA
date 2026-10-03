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
    // toXxx conversion methods
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
        assertEquals(123L, NumberUtils.toLong("123", 5L));
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
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
        assertEquals((byte) 12, NumberUtils.toByte("12", (byte) 5));
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
    // Individual createXxx methods
    // -----------------------------------------------------------------------
    @Test
    public void testIndividualCreateMethods() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf("1.23"), NumberUtils.createFloat("1.23"));

        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf("1.2345"), NumberUtils.createDouble("1.2345"));

        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(0x1a), NumberUtils.createInteger("0x1a"));
        assertEquals(Integer.valueOf(-0x1a), NumberUtils.createInteger("-0x1a"));

        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createLong("1234567890123"));

        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));

        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123456.789012"), NumberUtils.createBigDecimal("123456.789012"));

        try {
            NumberUtils.createBigDecimal("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {}
    }

    // -----------------------------------------------------------------------
    // createNumber
    // -----------------------------------------------------------------------
    @Test
    public void testCreateNumberNullAndBlank() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));

        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {}

        try {
            NumberUtils.createNumber("   ");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {}
    }

    @Test
    public void testCreateNumberHex() {
        assertEquals(Integer.valueOf(0x1F), NumberUtils.createNumber("0x1F"));
        assertEquals(Integer.valueOf(-0x1F), NumberUtils.createNumber("-0x1F"));
    }

    @Test
    public void testCreateNumberIntegerTypes() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648")); // Integer overflow -> Long
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808")); // Long overflow -> BigInteger
    }

    @Test
    public void testCreateNumberFloatingPointTypes() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Double.valueOf(1.2345678901234567e30), NumberUtils.createNumber("1.2345678901234567e30"));
        // Float underflow/precision fallback -> Double/BigDecimal
        assertEquals(new BigDecimal("1.1E-700"), NumberUtils.createNumber("1.1E-700"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
    }

    @Test
    public void testCreateNumberQualifiers() {
        // 'l' or 'L'
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        // 'f' or 'F'
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createNumber("-1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));

        // 'd' or 'D'
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(-1.23d), NumberUtils.createNumber("-1.23D"));

        // Overflow Float qualifier fall-through to Double / BigDecimal
        assertEquals(Double.valueOf(1e100), NumberUtils.createNumber("1e100f"));
        assertEquals(new BigDecimal("1e700"), NumberUtils.createNumber("1e700d"));
    }

    @Test
    public void testCreateNumberInvalidFormats() {
        String[] invalidInputs = {
            "1e2.3",     // expPos < decPos
            "1.2.3",     // Multiple decimal points
            "123a",      // Invalid qualifier
            "1.23L",     // Float format with 'L' qualifier
            "1e2L",      // Exponent with 'L' qualifier
            "-123-L",    // Invalid sign inside
            "1.1e-700f", // Underflow precision fallback
            "foo"        // Not a number
        };
        for (String input : invalidInputs) {
            try {
                NumberUtils.createNumber(input);
                fail("Expected NumberFormatException for: " + input);
            } catch (NumberFormatException expected) {}
        }
    }

    // -----------------------------------------------------------------------
    // isDigits & isNumber
    // -----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.34"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x12g3"));
        assertTrue(NumberUtils.isNumber("0x12af"));
        assertTrue(NumberUtils.isNumber("-0x12AF"));
        assertTrue(NumberUtils.isNumber("0x0"));

        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("12.34"));
        assertTrue(NumberUtils.isNumber("-12.34"));
        assertTrue(NumberUtils.isNumber(".5"));
        assertTrue(NumberUtils.isNumber("-.5"));
        assertTrue(NumberUtils.isNumber("123e4"));
        assertTrue(NumberUtils.isNumber("123E-4"));
        assertTrue(NumberUtils.isNumber("123e+4"));
        assertTrue(NumberUtils.isNumber("-123e4"));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("12.3f"));
        assertTrue(NumberUtils.isNumber("12.3F"));
        assertTrue(NumberUtils.isNumber("12.3d"));
        assertTrue(NumberUtils.isNumber("12.3D"));

        // Invalid cases
        assertFalse(NumberUtils.isNumber("12.3.4")); // 2 decimal points
        assertFalse(NumberUtils.isNumber("12e3e4")); // 2 exponents
        assertFalse(NumberUtils.isNumber("12e"));    // Ends with e
        assertFalse(NumberUtils.isNumber("12e+"));   // Ends with e+
        assertFalse(NumberUtils.isNumber("12e-"));   // Ends with e-
        assertFalse(NumberUtils.isNumber("12e3.4")); // Decimal inside exponent
        assertFalse(NumberUtils.isNumber("12e3L"));   // L qualifier with exponent
        assertFalse(NumberUtils.isNumber("123a"));   // Invalid trailing char
        assertFalse(NumberUtils.isNumber("e12"));    // Exponent without leading digits
        assertFalse(NumberUtils.isNumber("."));      // Just dot
        assertFalse(NumberUtils.isNumber("--123"));  // Multiple signs
        assertFalse(NumberUtils.isNumber("12+34"));  // Sign not after exponent
    }

    // -----------------------------------------------------------------------
    // min / max Array methods
    // -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() { NumberUtils.min((long[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() { NumberUtils.min(new long[0]); }
    @Test
    public void testMinLongArray() {
        assertEquals(1L, NumberUtils.min(new long[]{5L, 3L, 1L, 4L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, 0L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayNull() { NumberUtils.min((int[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayEmpty() { NumberUtils.min(new int[0]); }
    @Test
    public void testMinIntArray() {
        assertEquals(1, NumberUtils.min(new int[]{5, 3, 1, 4}));
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayNull() { NumberUtils.min((short[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArrayEmpty() { NumberUtils.min(new short[0]); }
    @Test
    public void testMinShortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{5, 3, 1, 4}));
        assertEquals((short) -5, NumberUtils.min(new short[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayNull() { NumberUtils.min((byte[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArrayEmpty() { NumberUtils.min(new byte[0]); }
    @Test
    public void testMinByteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{5, 3, 1, 4}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayNull() { NumberUtils.min((double[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArrayEmpty() { NumberUtils.min(new double[0]); }
    @Test
    public void testMinDoubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{5.5d, 3.3d, 1.1d, 4.4d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayNull() { NumberUtils.min((float[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArrayEmpty() { NumberUtils.min(new float[0]); }
    @Test
    public void testMinFloatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{5.5f, 3.3f, 1.1f, 4.4f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayNull() { NumberUtils.max((long[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArrayEmpty() { NumberUtils.max(new long[0]); }
    @Test
    public void testMaxLongArray() {
        assertEquals(5L, NumberUtils.max(new long[]{1L, 5L, 3L, 4L}));
        assertEquals(0L, NumberUtils.max(new long[]{-1L, -5L, 0L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayNull() { NumberUtils.max((int[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArrayEmpty() { NumberUtils.max(new int[0]); }
    @Test
    public void testMaxIntArray() {
        assertEquals(5, NumberUtils.max(new int[]{1, 5, 3, 4}));
        assertEquals(0, NumberUtils.max(new int[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayNull() { NumberUtils.max((short[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArrayEmpty() { NumberUtils.max(new short[0]); }
    @Test
    public void testMaxShortArray() {
        assertEquals((short) 5, NumberUtils.max(new short[]{1, 5, 3, 4}));
        assertEquals((short) 0, NumberUtils.max(new short[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayNull() { NumberUtils.max((byte[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArrayEmpty() { NumberUtils.max(new byte[0]); }
    @Test
    public void testMaxByteArray() {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{1, 5, 3, 4}));
        assertEquals((byte) 0, NumberUtils.max(new byte[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayNull() { NumberUtils.max((double[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArrayEmpty() { NumberUtils.max(new double[0]); }
    @Test
    public void testMaxDoubleArray() {
        assertEquals(5.5d, NumberUtils.max(new double[]{1.1d, 5.5d, 3.3d, 4.4d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayNull() { NumberUtils.max((float[]) null); }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArrayEmpty() { NumberUtils.max(new float[0]); }
    @Test
    public void testMaxFloatArray() {
        assertEquals(5.5f, NumberUtils.max(new float[]{1.1f, 5.5f, 3.3f, 4.4f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    // -----------------------------------------------------------------------
    // min / max 3 parameters
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
}