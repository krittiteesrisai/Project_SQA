package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.fasterxml.jackson.core.io.NumberInput;

public class NumberInputTest
{
    // =====================================================================
    // parseInt(char[] digitChars, int offset, int len) - nested if (1..9 digit)
    // =====================================================================

    @Test
    public void testParseIntCharArray_AllLengths1to9()
    {
        char[] digits = "123456789".toCharArray();
        for (int len = 1; len <= 9; len++) {
            int expected = Integer.parseInt(new String(digits, 0, len));
            int actual = NumberInput.parseInt(digits, 0, len);
            assertEquals("len=" + len, expected, actual);
        }
    }

    @Test
    public void testParseIntCharArray_WithNonZeroOffset()
    {
        // "xx" + "42" -> offset 2, len 2
        char[] digits = "xx42".toCharArray();
        assertEquals(42, NumberInput.parseInt(digits, 2, 2));
    }

    // =====================================================================
    // parseInt(String)
    // =====================================================================

    @Test
    public void testParseIntString_SingleDigitPositive()
    {
        assertEquals(5, NumberInput.parseInt("5"));
    }

    @Test
    public void testParseIntString_SingleDigitNegative()
    {
        // length=2, negative, digit part length 1 -> no inner ifs triggered
        assertEquals(-5, NumberInput.parseInt("-5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_NegativeLengthOne_FallbackThrows()
    {
        // str="-" -> length==1 -> fallback Integer.parseInt("-") throws NFE
        NumberInput.parseInt("-");
    }

    @Test
    public void testParseIntString_NegativeLengthExactly10_CustomPath()
    {
        // length==10 (sign+9 digits) -> NOT fallback (boundary: length>10 is fallback)
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
    }

    @Test
    public void testParseIntString_NegativeLengthGreaterThan10_Fallback()
    {
        // length=12 > 10 -> fallback to Integer.parseInt, valid string so no exception
        assertEquals(-1234567890, NumberInput.parseInt("-1234567890"));
    }

    @Test
    public void testParseIntString_PositiveLengthExactly9_CustomPath()
    {
        // length==9, NOT fallback (boundary: length>9 triggers fallback)
        assertEquals(123456789, NumberInput.parseInt("123456789"));
    }

    @Test
    public void testParseIntString_PositiveLengthGreaterThan9_Fallback()
    {
        // length=10 > 9 -> fallback, valid digits so no exception
        assertEquals(1234567890, NumberInput.parseInt("1234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_InvalidFirstChar_Positive_Fallback()
    {
        // c = 'a' invalid at very first char -> fallback throws
        NumberInput.parseInt("a12345678");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_InvalidFirstDigitAfterSign_Negative_Fallback()
    {
        // negative, first digit after sign invalid -> fallback throws
        NumberInput.parseInt("-a1234567");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_InvalidSecondChar_Fallback()
    {
        // valid first digit, invalid second char -> fallback throws
        NumberInput.parseInt("1a234567");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_InvalidThirdChar_Fallback()
    {
        // valid first two digits, invalid third char -> fallback throws
        NumberInput.parseInt("12a34567");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_InvalidCharInsideDoWhileLoop_Fallback()
    {
        // valid first three digits, invalid 4th char inside do-while loop -> fallback throws
        NumberInput.parseInt("123a4567");
    }

    @Test
    public void testParseIntString_ValidDoWhileLoopMultipleIterations()
    {
        // 7 digits -> first 3 parsed then do-while executes 4 more iterations
        assertEquals(1234567, NumberInput.parseInt("1234567"));
    }

    // =====================================================================
    // parseLong(char[] digitChars, int offset, int len)  [len in 10..18]
    // =====================================================================

    @Test
    public void testParseLongCharArray_Length10_Boundary()
    {
        char[] digits = "1234567890".toCharArray();
        assertEquals(1234567890L, NumberInput.parseLong(digits, 0, 10));
    }

    @Test
    public void testParseLongCharArray_Length18_Boundary()
    {
        char[] digits = "123456789012345678".toCharArray();
        assertEquals(123456789012345678L, NumberInput.parseLong(digits, 0, 18));
    }

    // =====================================================================
    // parseLong(String)
    // =====================================================================

    @Test
    public void testParseLongString_LengthLessOrEqual9_UsesParseInt()
    {
        assertEquals(123456789L, NumberInput.parseLong("123456789"));
    }

    @Test
    public void testParseLongString_NegativeLengthLessOrEqual9()
    {
        assertEquals(-12345678L, NumberInput.parseLong("-12345678"));
    }

    @Test
    public void testParseLongString_LengthGreaterThan9_UsesJDKParse()
    {
        assertEquals(1234567890L, NumberInput.parseLong("1234567890"));
    }

    // =====================================================================
    // inLongRange(char[] digitChars, int offset, int len, boolean negative)
    // =====================================================================

    private static final String MAX_LONG = "9223372036854775807"; // 19 chars
    private static final String MIN_NO_SIGN = "9223372036854775808"; // 19 chars

    @Test
    public void testInLongRangeCharArray_ShorterThanCmpLen_ReturnsTrue()
    {
        char[] shortDigits = "922337203685477580".toCharArray(); // 18 chars
        assertTrue(NumberInput.inLongRange(shortDigits, 0, shortDigits.length, false));
        assertTrue(NumberInput.inLongRange(shortDigits, 0, shortDigits.length, true));
    }

    @Test
    public void testInLongRangeCharArray_LongerThanCmpLen_ReturnsFalse()
    {
        char[] longDigits = "92233720368547758070".toCharArray(); // 20 chars
        assertFalse(NumberInput.inLongRange(longDigits, 0, longDigits.length, false));
        assertFalse(NumberInput.inLongRange(longDigits, 0, longDigits.length, true));
    }

    @Test
    public void testInLongRangeCharArray_EqualLen_LessThanBoundary_ReturnsTrue()
    {
        // negative=false -> compare vs MAX_LONG, one less at last digit
        char[] lessThanMax = "9223372036854775806".toCharArray();
        assertTrue(NumberInput.inLongRange(lessThanMax, 0, lessThanMax.length, false));

        // negative=true -> compare vs MIN_NO_SIGN, one less at last digit
        char[] lessThanMin = "9223372036854775807".toCharArray();
        assertTrue(NumberInput.inLongRange(lessThanMin, 0, lessThanMin.length, true));
    }

    @Test
    public void testInLongRangeCharArray_EqualLen_GreaterThanBoundary_ReturnsFalse()
    {
        char[] greaterThanMax = "9223372036854775808".toCharArray();
        assertFalse(NumberInput.inLongRange(greaterThanMax, 0, greaterThanMax.length, false));

        char[] greaterThanMin = "9223372036854775809".toCharArray();
        assertFalse(NumberInput.inLongRange(greaterThanMin, 0, greaterThanMin.length, true));
    }

    @Test
    public void testInLongRangeCharArray_EqualLen_EqualToBoundary_ReturnsTrue()
    {
        char[] eqMax = MAX_LONG.toCharArray();
        assertTrue(NumberInput.inLongRange(eqMax, 0, eqMax.length, false));

        char[] eqMin = MIN_NO_SIGN.toCharArray();
        assertTrue(NumberInput.inLongRange(eqMin, 0, eqMin.length, true));
    }

    // =====================================================================
    // inLongRange(String numberStr, boolean negative)
    // =====================================================================

    @Test
    public void testInLongRangeString_ShorterThanCmpLen_ReturnsTrue()
    {
        assertTrue(NumberInput.inLongRange("922337203685477580", false));
        assertTrue(NumberInput.inLongRange("922337203685477580", true));
    }

    @Test
    public void testInLongRangeString_LongerThanCmpLen_ReturnsFalse()
    {
        assertFalse(NumberInput.inLongRange("92233720368547758070", false));
        assertFalse(NumberInput.inLongRange("92233720368547758070", true));
    }

    @Test
    public void testInLongRangeString_EqualLen_LessThanBoundary_ReturnsTrue()
    {
        assertTrue(NumberInput.inLongRange("9223372036854775806", false));
        assertTrue(NumberInput.inLongRange("9223372036854775807", true));
    }

    @Test
    public void testInLongRangeString_EqualLen_GreaterThanBoundary_ReturnsFalse()
    {
        assertFalse(NumberInput.inLongRange("9223372036854775808", false));
        assertFalse(NumberInput.inLongRange("9223372036854775809", true));
    }

    @Test
    public void testInLongRangeString_EqualLen_EqualToBoundary_ReturnsTrue()
    {
        assertTrue(NumberInput.inLongRange(MAX_LONG, false));
        assertTrue(NumberInput.inLongRange(MIN_NO_SIGN, true));
    }

    // =====================================================================
    // parseAsInt(String, int defaultValue)
    // =====================================================================

    @Test
    public void testParseAsInt_NullInput_ReturnsDefault()
    {
        assertEquals(99, NumberInput.parseAsInt(null, 99));
    }

    @Test
    public void testParseAsInt_EmptyAfterTrim_ReturnsDefault()
    {
        assertEquals(99, NumberInput.parseAsInt("   ", 99));
    }

    @Test
    public void testParseAsInt_EmptyString_ReturnsDefault()
    {
        assertEquals(99, NumberInput.parseAsInt("", 99));
    }

    @Test
    public void testParseAsInt_PlainDigits_NoSign()
    {
        assertEquals(123, NumberInput.parseAsInt("123", 0));
    }

    @Test
    public void testParseAsInt_PlusSign_StripsAndParses()
    {
        assertEquals(123, NumberInput.parseAsInt("+123", 0));
    }

    @Test
    public void testParseAsInt_MinusSign_KeptAndParses()
    {
        assertEquals(-123, NumberInput.parseAsInt("-123", 0));
    }

    @Test
    public void testParseAsInt_PlusSignOnly_FallbackFailsIntegerParse_ReturnsDefault()
    {
        // "+" -> becomes "" after substring; loop skipped; Integer.parseInt("") throws -> default
        assertEquals(77, NumberInput.parseAsInt("+", 77));
    }

    @Test
    public void testParseAsInt_MinusSignOnly_FallbackFailsIntegerParse_ReturnsDefault()
    {
        // "-" -> i becomes 1==len; loop skipped; Integer.parseInt("-") throws -> default
        assertEquals(77, NumberInput.parseAsInt("-", 77));
    }

    @Test
    public void testParseAsInt_NonDigitChar_ValidDoubleFallback()
    {
        // '.' triggers double-parse branch: (int) parseDouble("12.5") == 12
        assertEquals(12, NumberInput.parseAsInt("12.5", 0));
    }

    @Test
    public void testParseAsInt_NonDigitChar_InvalidDoubleFallback_ReturnsDefault()
    {
        // malformed double -> parseDouble throws NFE -> caught -> default
        assertEquals(55, NumberInput.parseAsInt("12.5.6", 55));
    }

    @Test
    public void testParseAsInt_AllDigits_IntegerOverflow_ReturnsDefault()
    {
        // all-digit string but too large for int -> Integer.parseInt throws -> caught -> default
        assertEquals(-1, NumberInput.parseAsInt("99999999999", -1));
    }

    // =====================================================================
    // parseAsLong(String, long defaultValue)
    // =====================================================================

    @Test
    public void testParseAsLong_NullInput_ReturnsDefault()
    {
        assertEquals(99L, NumberInput.parseAsLong(null, 99L));
    }

    @Test
    public void testParseAsLong_EmptyAfterTrim_ReturnsDefault()
    {
        assertEquals(99L, NumberInput.parseAsLong("   ", 99L));
    }

    @Test
    public void testParseAsLong_EmptyString_ReturnsDefault()
    {
        assertEquals(99L, NumberInput.parseAsLong("", 99L));
    }

    @Test
    public void testParseAsLong_PlainDigits_NoSign()
    {
        assertEquals(123L, NumberInput.parseAsLong("123", 0L));
    }

    @Test
    public void testParseAsLong_PlusSign_StripsAndParses()
    {
        assertEquals(123L, NumberInput.parseAsLong("+123", 0L));
    }

    @Test
    public void testParseAsLong_MinusSign_KeptAndParses()
    {
        assertEquals(-123L, NumberInput.parseAsLong("-123", 0L));
    }

    @Test
    public void testParseAsLong_PlusSignOnly_ReturnsDefault()
    {
        assertEquals(77L, NumberInput.parseAsLong("+", 77L));
    }

    @Test
    public void testParseAsLong_MinusSignOnly_ReturnsDefault()
    {
        assertEquals(77L, NumberInput.parseAsLong("-", 77L));
    }

    @Test
    public void testParseAsLong_NonDigitChar_ValidDoubleFallback()
    {
        assertEquals(12L, NumberInput.parseAsLong("12.5", 0L));
    }

    @Test
    public void testParseAsLong_NonDigitChar_InvalidDoubleFallback_ReturnsDefault()
    {
        assertEquals(55L, NumberInput.parseAsLong("12.5.6", 55L));
    }

    @Test
    public void testParseAsLong_AllDigits_LongOverflow_ReturnsDefault()
    {
        // 20-digit number exceeds Long.MAX_VALUE -> Long.parseLong throws -> caught -> default
        assertEquals(-1L, NumberInput.parseAsLong("999999999999999999999", -1L));
    }

    // =====================================================================
    // parseAsDouble(String, double defaultValue)
    // =====================================================================

    @Test
    public void testParseAsDouble_NullInput_ReturnsDefault()
    {
        assertEquals(9.9, NumberInput.parseAsDouble(null, 9.9), 0.0001);
    }

    @Test
    public void testParseAsDouble_EmptyAfterTrim_ReturnsDefault()
    {
        assertEquals(9.9, NumberInput.parseAsDouble("   ", 9.9), 0.0001);
    }

    @Test
    public void testParseAsDouble_ValidDouble_ReturnsParsedValue()
    {
        assertEquals(3.14, NumberInput.parseAsDouble("3.14", 0.0), 0.0001);
    }

    @Test
    public void testParseAsDouble_InvalidDouble_ReturnsDefault()
    {
        assertEquals(5.5, NumberInput.parseAsDouble("abc", 5.5), 0.0001);
    }

    @Test
    public void testParseAsDouble_NastySmallDoubleConstant()
    {
        assertEquals(Double.MIN_VALUE,
                NumberInput.parseAsDouble(NumberInput.NASTY_SMALL_DOUBLE, 0.0), 0.0);
    }

    // =====================================================================
    // parseDouble(String)
    // =====================================================================

    @Test
    public void testParseDouble_NastySmallDoubleConstant_ReturnsMinValue()
    {
        assertEquals(Double.MIN_VALUE,
                NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
    }

    @Test
    public void testParseDouble_NormalValue()
    {
        assertEquals(3.14, NumberInput.parseDouble("3.14"), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseDouble_InvalidValue_Throws()
    {
        NumberInput.parseDouble("not-a-number");
    }

    // =====================================================================
    // parseBigDecimal(String)
    // =====================================================================

    @Test
    public void testParseBigDecimalString_ValidValue()
    {
        assertEquals(new BigDecimal("123.45"), NumberInput.parseBigDecimal("123.45"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalString_InvalidValue_Throws()
    {
        NumberInput.parseBigDecimal("abc");
    }

    // =====================================================================
    // parseBigDecimal(char[])
    // =====================================================================

    @Test
    public void testParseBigDecimalCharArray_FullBuffer()
    {
        char[] buf = "123.45".toCharArray();
        assertEquals(new BigDecimal("123.45"), NumberInput.parseBigDecimal(buf));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalCharArray_InvalidValue_Throws()
    {
        char[] buf = "abc".toCharArray();
        NumberInput.parseBigDecimal(buf);
    }

    // =====================================================================
    // parseBigDecimal(char[], int offset, int len)
    // =====================================================================

    @Test
    public void testParseBigDecimalCharArrayOffsetLen_SubRange()
    {
        char[] buf = "xx123.45yy".toCharArray();
        assertEquals(new BigDecimal("123.45"),
                NumberInput.parseBigDecimal(buf, 2, 6));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalCharArrayOffsetLen_InvalidValue_Throws()
    {
        char[] buf = "xxabcYY".toCharArray();
        NumberInput.parseBigDecimal(buf, 2, 3);
    }
}
