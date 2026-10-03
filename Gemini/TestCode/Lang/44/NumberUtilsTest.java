package org.apache.commons.lang;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Comprehensive test suite for org.apache.commons.lang.NumberUtils
 * targeting branch coverage, boundary conditions, and edge cases.
 */
public class NumberUtilsTest {

    // --------------------------------------------------------------------
    // Constructor & stringToInt Tests
    // --------------------------------------------------------------------

    @Test
    public void testConstructor() {
        assertNotNull(new NumberUtils());
    }

    @Test
    public void testStringToInt() {
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(0, NumberUtils.stringToInt(""));
        assertEquals(0, NumberUtils.stringToInt("abc"));
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(-456, NumberUtils.stringToInt("-456"));
    }

    @Test
    public void testStringToIntWithDefault() {
        assertEquals(10, NumberUtils.stringToInt(null, 10));
        assertEquals(10, NumberUtils.stringToInt("", 10));
        assertEquals(10, NumberUtils.stringToInt("not_a_number", 10));
        assertEquals(42, NumberUtils.stringToInt("42", 10));
        assertEquals(-99, NumberUtils.stringToInt("-99", 10));
    }

    // --------------------------------------------------------------------
    // Direct create* Conversion Tests
    // --------------------------------------------------------------------

    @Test
    public void testDirectCreateMethods() {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
        assertEquals(Integer.valueOf(100), NumberUtils.createInteger("100"));
        assertEquals(Integer.valueOf(0x10), NumberUtils.createInteger("0x10"));
        assertEquals(Long.valueOf(10000000000L), NumberUtils.createLong("10000000000"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createBigInteger("123456789012345678901234567890"));
        assertEquals(new BigDecimal("1234567890.12345678901234567890"), NumberUtils.createBigDecimal("1234567890.12345678901234567890"));
    }

    // --------------------------------------------------------------------
    // createNumber Tests - Null, Empty, and Prefix Branches
    // --------------------------------------------------------------------

    @Test
    public void testCreateNumberNullAndEmpty() {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException on empty string");
        } catch (NumberFormatException expected) {
            // Success
        }
    }

    @Test
    public void testCreateNumberPrefixes() {
        assertNull(NumberUtils.createNumber("--123"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createNumber("0x12"));
        assertEquals(Integer.valueOf(-0x12), NumberUtils.createNumber("-0x12"));
    }

    // --------------------------------------------------------------------
    // createNumber Tests - Exponent and Decimal Positions
    // --------------------------------------------------------------------

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberExpBeforeDecThrowsException() {
        // expPos < decPos
        NumberUtils.createNumber("1e2.3");
    }

    // --------------------------------------------------------------------
    // createNumber Tests - Specifiers ('l', 'L', 'f', 'F', 'd', 'D')
    // --------------------------------------------------------------------

    @Test
    public void testCreateNumberLongSpecifier() {
        assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345l"));
        assertEquals(Long.valueOf(-12345L), NumberUtils.createNumber("-12345L"));
        
        // BigInteger fallback for 'L' specifier when overflow Long
        BigInteger bigInt = new BigInteger("9223372036854775808");
        assertEquals(bigInt, NumberUtils.createNumber("9223372036854775808L"));
    }

    @Test
    public void testCreateNumberLongSpecifierInvalid() {
        try {
            NumberUtils.createNumber("12.34L");
            fail("Decimals not allowed with L");
        } catch (NumberFormatException expected) {}

        try {
            NumberUtils.createNumber("12e3L");
            fail("Exponents not allowed with L");
        } catch (NumberFormatException expected) {}

        try {
            NumberUtils.createNumber("L");
            fail("Bare specifier should throw NumberFormatException");
        } catch (NumberFormatException expected) {}

        try {
            NumberUtils.createNumber("-L");
            fail("Bare signed specifier should throw NumberFormatException");
        } catch (NumberFormatException expected) {}
    }

    @Test
    public void testCreateNumberFloatSpecifier() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createNumber("-1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("000f"));

        // Precision fallback to Double / BigDecimal when Float underflows to 0.0 with non-zero input
        Number numUnderflow = NumberUtils.createNumber("1.40129846432481707e-46f");
        assertTrue(numUnderflow instanceof Double || numUnderflow instanceof BigDecimal);

        // Fallback when too large for Float
        Number numOverflow = NumberUtils.createNumber("3.4028236e39f");
        assertTrue(numOverflow instanceof Double || numOverflow instanceof BigDecimal);
    }

    @Test
    public void testCreateNumberDoubleSpecifier() {
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(-1.23d), NumberUtils.createNumber("-1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));

        // Fallback to BigDecimal when too large for Double
        Number numOverflow = NumberUtils.createNumber("1.7976931348623158e309d");
        assertTrue(numOverflow instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidSpecifier() {
        NumberUtils.createNumber("12345a");
    }

    // --------------------------------------------------------------------
    // createNumber Tests - No Type Specifier (Autodetect Type)
    // --------------------------------------------------------------------

    @Test
    public void testCreateNumberIntegerTypesNoSpecifier() {
        // Integer
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));

        // Long
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Long.valueOf(-2147483649L), NumberUtils.createNumber("-2147483649"));

        // BigInteger
        BigInteger bigInt = new BigInteger("9223372036854775808");
        assertEquals(bigInt, NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumberFloatingPointNoSpecifier() {
        // Float fitting
        assertEquals(Float.valueOf("1.23"), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf("0.0"), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf("1e2"), NumberUtils.createNumber("1e2"));

        // Double fitting
        assertEquals(Double.valueOf("1.7976931348623157e308"), NumberUtils.createNumber("1.7976931348623157e308"));

        // BigDecimal fallback
        Number bigDec = NumberUtils.createNumber("1.7976931348623158e309");
        assertTrue(bigDec instanceof BigDecimal);
    }

    // --------------------------------------------------------------------
    // Minimum / Maximum Tests
    // --------------------------------------------------------------------

    @Test
    public void testMinimumLong() {
        assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L)); // a is min
        assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L)); // b is min
        assertEquals(1L, NumberUtils.minimum(3L, 2L, 1L)); // c is min
        assertEquals(-5L, NumberUtils.minimum(-1L, -3L, -5L));
    }

    @Test
    public void testMinimumInt() {
        assertEquals(1, NumberUtils.minimum(1, 2, 3)); // a is min
        assertEquals(1, NumberUtils.minimum(2, 1, 3)); // b is min
        assertEquals(1, NumberUtils.minimum(3, 2, 1)); // c is min
        assertEquals(-5, NumberUtils.minimum(-1, -3, -5));
    }

    @Test
    public void testMaximumLong() {
        assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L)); // a is max
        assertEquals(3L, NumberUtils.maximum(2L, 3L, 1L)); // b is max
        assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L)); // c is max
        assertEquals(-1L, NumberUtils.maximum(-5L, -3L, -1L));
    }

    @Test
    public void testMaximumInt() {
        assertEquals(3, NumberUtils.maximum(3, 2, 1)); // a is max
        assertEquals(3, NumberUtils.maximum(2, 3, 1)); // b is max
        assertEquals(3, NumberUtils.maximum(1, 2, 3)); // c is max
        assertEquals(-1, NumberUtils.maximum(-5, -3, -1));
    }

    // --------------------------------------------------------------------
    // Compare Tests (double & float with Special Cases NaN / +/-0.0)
    // --------------------------------------------------------------------

    @Test
    public void testCompareDouble() {
        assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
        assertEquals(+1, NumberUtils.compare(2.0d, 1.0d));
        assertEquals(0, NumberUtils.compare(1.0d, 1.0d));

        // NaN comparisons
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(+1, NumberUtils.compare(Double.NaN, Double.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.NaN));

        // +0.0 vs -0.0
        assertEquals(+1, NumberUtils.compare(0.0d, -0.0d));
        assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
        assertEquals(0, NumberUtils.compare(-0.0d, -0.0d));
        assertEquals(0, NumberUtils.compare(0.0d, 0.0d));
    }

    @Test
    public void testCompareFloat() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(+1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));

        // NaN comparisons
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
        assertEquals(+1, NumberUtils.compare(Float.NaN, Float.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.NaN));

        // +0.0 vs -0.0
        assertEquals(+1, NumberUtils.compare(0.0f, -0.0f));
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
        assertEquals(0, NumberUtils.compare(-0.0f, -0.0f));
        assertEquals(0, NumberUtils.compare(0.0f, 0.0f));
    }

    // --------------------------------------------------------------------
    // isDigits Tests
    // --------------------------------------------------------------------

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123a45"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
    }

    // --------------------------------------------------------------------
    // isNumber Tests
    // --------------------------------------------------------------------

    @Test
    public void testIsNumber() {
        // Null & Empty
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));

        // Integers & Signs
        assertTrue(NumberUtils.isNumber("12345"));
        assertTrue(NumberUtils.isNumber("-12345"));
        assertFalse(NumberUtils.isNumber("+12345"));
        assertFalse(NumberUtils.isNumber("-"));
        assertFalse(NumberUtils.isNumber("--123"));

        // Hexadecimal
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertTrue(NumberUtils.isNumber("0x1234AF"));
        assertTrue(NumberUtils.isNumber("-0x1234af"));
        assertFalse(NumberUtils.isNumber("0x1234AG"));

        // Decimal & Scientific Notation
        assertTrue(NumberUtils.isNumber("12.34"));
        assertTrue(NumberUtils.isNumber("-12.34"));
        assertTrue(NumberUtils.isNumber(".5"));
        assertTrue(NumberUtils.isNumber("-.5"));
        assertFalse(NumberUtils.isNumber("12.34.56"));
        assertTrue(NumberUtils.isNumber("1.23e4"));
        assertTrue(NumberUtils.isNumber("1.23E4"));
        assertTrue(NumberUtils.isNumber("1.23e+4"));
        assertTrue(NumberUtils.isNumber("1.23e-4"));
        assertFalse(NumberUtils.isNumber("1.23e"));
        assertFalse(NumberUtils.isNumber("1.23e+"));
        assertFalse(NumberUtils.isNumber("1.23e-"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("e123"));
        assertFalse(NumberUtils.isNumber("1.2e3.4"));

        // Type Specifiers
        assertTrue(NumberUtils.isNumber("1234L"));
        assertTrue(NumberUtils.isNumber("1234l"));
        assertTrue(NumberUtils.isNumber("-1234L"));
        assertFalse(NumberUtils.isNumber("1234e2L"));
        assertTrue(NumberUtils.isNumber("12.34f"));
        assertTrue(NumberUtils.isNumber("12.34F"));
        assertTrue(NumberUtils.isNumber("12.34d"));
        assertTrue(NumberUtils.isNumber("12.34D"));
        assertFalse(NumberUtils.isNumber("1234a"));
        assertFalse(NumberUtils.isNumber("."));
    }
}