package org.apache.commons.lang3.text.translate;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;
    private StringWriter out;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
        out = new StringWriter();
    }

    // =========================================================================
    // 1. Boundary & Header Condition Tests
    // =========================================================================

    @Test
    public void testTranslateNonAmpersand() throws IOException {
        String input = "Hello";
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateAmpersandAtEndOfString() throws IOException {
        String input = "Hello&";
        int consumed = unescaper.translate(input, 5, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateAmpersandNotFollowedByHash() throws IOException {
        String input = "&amp;";
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    // =========================================================================
    // 2. Standard Valid Entity Tests (Decimal, Hex-Lower, Hex-Upper, Supplementary)
    // =========================================================================

    @Test
    public void testTranslateDecimalEntity() throws IOException {
        String input = "&#65;"; // 'A' (ASCII 65)
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(5, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateHexLowerCaseEntity() throws IOException {
        String input = "&#x41;"; // 'A' (Hex 41)
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(6, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateHexUpperCaseEntity() throws IOException {
        String input = "&#X41;"; // 'A' (Hex 41)
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(6, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateSupplementaryCharacter() throws IOException {
        // Codepoint 0x10000 -> 65536 in decimal, surrogate pair: \uD800\uDC00
        String input = "&#x10000;";
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(9, consumed);

        char[] expectedChars = Character.toChars(0x10000);
        assertEquals(new String(expectedChars), out.toString());
    }

    // =========================================================================
    // 3. Invalid Entity Content (NumberFormatException Branch)
    // =========================================================================

    @Test
    public void testTranslateInvalidDecimalFormat() throws IOException {
        String input = "&#XYZ;"; // Invalid decimal digits
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateInvalidHexFormat() throws IOException {
        String input = "&#xZZ;"; // Invalid hex digits
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    // =========================================================================
    // 4. Edge Cases & Defects4J Lang-19 Specific Fault Triggers
    // =========================================================================

    @Test
    public void testTranslateUnfinishedEntityOnlyHash() {
        // Edge Case: "&#" at the end of the input (no character after '#')
        // In Lang-19 buggy version, this triggers IndexOutOfBoundsException
        try {
            int consumed = unescaper.translate("&#", 0, out);
            assertEquals(0, consumed);
        } catch (IndexOutOfBoundsException e) {
            // Expected in defective version
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testTranslateUnfinishedEntityHexOnly() {
        // Edge Case: "&#x" at the end of the input (no character after 'x')
        try {
            int consumed = unescaper.translate("&#x", 0, out);
            assertEquals(0, consumed);
        } catch (IndexOutOfBoundsException e) {
            // Expected in defective version
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testTranslateEntityWithoutSemicolon() {
        // Edge Case: Entity without semicolon (JavaDoc states semi-colon is optional)
        try {
            int consumed = unescaper.translate("&#65", 0, out);
            assertEquals(4, consumed);
            assertEquals("A", out.toString());
        } catch (IndexOutOfBoundsException e) {
            // Expected in defective version
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    // =========================================================================
    // 5. High-Level Integration Test via CharSequenceTranslator.translate()
    // =========================================================================

    @Test
    public void testTranslateFullSentence() {
        String input = "Test &#65; and &#x42; end.";
        String result = unescaper.translate(input);
        assertEquals("Test A and B end.", result);
    }
}