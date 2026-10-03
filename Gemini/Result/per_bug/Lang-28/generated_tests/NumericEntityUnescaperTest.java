package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for {@link NumericEntityUnescaper} targeting maximum branch/condition coverage
 * and edge cases under Defects4J Lang-28.
 */
public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
    }

    // -----------------------------------------------------------------------
    // Null / Empty Inputs
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateNull() {
        assertNull("Null input should return null", unescaper.translate((CharSequence) null));
    }

    @Test
    public void testTranslateEmpty() {
        assertEquals("Empty string should return empty string", "", unescaper.translate(""));
    }

    // -----------------------------------------------------------------------
    // Prefix Conditions (& and #)
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateNonEntity() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("Plain text", 0, out);
        assertEquals("Should consume 0 chars for non-entity", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateAmpersandNotFollowedByHash() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&amp; text", 0, out);
        assertEquals("Should consume 0 chars when '&' is not followed by '#'", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testTranslateBoundaryAmpersandAtEndThrowsException() throws IOException {
        StringWriter out = new StringWriter();
        // & is at index 0 which is input.length() - 1, causing charAt(index + 1) to fail
        unescaper.translate("&", 0, out);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testTranslateBoundaryHashAtEndThrowsException() throws IOException {
        StringWriter out = new StringWriter();
        // &# without anything following will trigger charAt(start) out of bounds
        unescaper.translate("&#", 0, out);
    }

    // -----------------------------------------------------------------------
    // Decimal Entities
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateValidDecimalEntity() throws IOException {
        StringWriter out = new StringWriter();
        // 'A' is 65 in decimal
        int consumed = unescaper.translate("&#65;", 0, out);
        assertEquals("Should consume 5 chars (&#65;)", 5, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateDecimalFullString() {
        String input = "Hello &#65;&#66;&#67; World";
        String expected = "Hello ABC World";
        assertEquals(expected, unescaper.translate(input));
    }

    // -----------------------------------------------------------------------
    // Hex Entities (Lower and Upper case 'x' / 'X')
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateValidHexEntityLowerCase() throws IOException {
        StringWriter out = new StringWriter();
        // 'A' is 41 in hex (lowercase x)
        int consumed = unescaper.translate("&#x41;", 0, out);
        assertEquals("Should consume 6 chars (&#x41;)", 6, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateValidHexEntityUpperCase() throws IOException {
        StringWriter out = new StringWriter();
        // 'B' is 42 in hex (uppercase X)
        int consumed = unescaper.translate("&#X42;", 0, out);
        assertEquals("Should consume 6 chars (&#X42;)", 6, consumed);
        assertEquals("B", out.toString());
    }

    @Test
    public void testTranslateHexFullString() {
        String input = "Testing &#x30;&#X31;&#x32;!";
        String expected = "Testing 012!";
        assertEquals(expected, unescaper.translate(input));
    }

    // -----------------------------------------------------------------------
    // Invalid Formats / NumberFormatException Handling
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateEmptyDecimalEntityValue() throws IOException {
        StringWriter out = new StringWriter();
        // &#; has no digits, parseInt throws NumberFormatException
        int consumed = unescaper.translate("&#;", 0, out);
        assertEquals("Should catch NFE and return 0", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateEmptyHexEntityValue() throws IOException {
        StringWriter out = new StringWriter();
        // &#x; has no hex digits, parseInt throws NumberFormatException
        int consumed = unescaper.translate("&#x;", 0, out);
        assertEquals("Should catch NFE and return 0", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateInvalidCharactersInDecimal() throws IOException {
        StringWriter out = new StringWriter();
        // Non-digits in decimal entity
        int consumed = unescaper.translate("&#invalid;", 0, out);
        assertEquals("Should catch NFE and return 0", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateInvalidCharactersInHex() throws IOException {
        StringWriter out = new StringWriter();
        // Non-hex digits in hex entity
        int consumed = unescaper.translate("&#xGHI;", 0, out);
        assertEquals("Should catch NFE and return 0", 0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateNumberOverflow() throws IOException {
        StringWriter out = new StringWriter();
        // Exceeds Integer.MAX_VALUE (2147483647)
        int consumed = unescaper.translate("&#99999999999999999999;", 0, out);
        assertEquals("Overflow throws NFE and returns 0", 0, consumed);
        assertEquals("", out.toString());
    }

    // -----------------------------------------------------------------------
    // Missing Semicolon (End Boundary Failure)
    // -----------------------------------------------------------------------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testTranslateUnclosedEntityThrowsException() throws IOException {
        StringWriter out = new StringWriter();
        // Missing closing semicolon ';' will cause loop to run out of bounds
        unescaper.translate("&#65", 0, out);
    }

    // -----------------------------------------------------------------------
    // Defects4J Lang-28 Bug Exposure: Supplementary Characters (> 0xFFFF)
    // -----------------------------------------------------------------------

    @Test
    public void testTranslateSupplementaryHex() {
        // U+1D11E (MUSICAL SYMBOL G CLEF) -> surrogate pair: \uD834\uDD1E
        String input = "&#x1D11E;";
        String expected = "\uD834\uDD1E";
        String actual = unescaper.translate(input);
        assertEquals("Failed to unescape supplementary hex entity", expected, actual);
    }

    @Test
    public void testTranslateSupplementaryDecimal() {
        // U+1D11E in decimal is 119070 -> surrogate pair: \uD834\uDD1E
        String input = "&#119070;";
        String expected = "\uD834\uDD1E";
        String actual = unescaper.translate(input);
        assertEquals("Failed to unescape supplementary decimal entity", expected, actual);
    }

    @Test
    public void testTranslateBmpUpperLimitBoundary() {
        // Boundary case at 0xFFFF (Character.MAX_VALUE)
        String input = "&#65535;";
        String expected = "\uFFFF";
        assertEquals(expected, unescaper.translate(input));
    }
}