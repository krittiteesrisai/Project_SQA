package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * High-coverage JUnit 3/4 compatible test suite for Util class (Cli-29b).
 * Written by Senior Java Test Automation Engineer.
 */
public class UtilTest extends TestCase {

    // --- Tests for stripLeadingHyphens ---

    public void testStripLeadingHyphens_Null() {
        assertNull("Null input should return null", Util.stripLeadingHyphens(null));
    }

    public void testStripLeadingHyphens_Empty() {
        assertEquals("Empty string should return empty string", "", Util.stripLeadingHyphens(""));
    }

    public void testStripLeadingHyphens_DoubleHyphen() {
        assertEquals("Double hyphen should be stripped", "foo", Util.stripLeadingHyphens("--foo"));
    }

    public void testStripLeadingHyphens_SingleHyphen() {
        assertEquals("Single hyphen should be stripped", "f", Util.stripLeadingHyphens("-f"));
        assertEquals("Single hyphen with word should be stripped", "foo", Util.stripLeadingHyphens("-foo"));
    }

    public void testStripLeadingHyphens_NoHyphen() {
        assertEquals("String without hyphen should remain unchanged", "foo", Util.stripLeadingHyphens("foo"));
    }

    public void testStripLeadingHyphens_OnlyHyphens() {
        assertEquals("Only double hyphen should strip both", "", Util.stripLeadingHyphens("--"));
        assertEquals("Only single hyphen should strip one", "", Util.stripLeadingHyphens("-"));
        assertEquals("Triple hyphen should strip first two", "-", Util.stripLeadingHyphens("---"));
    }

    // --- Tests for stripLeadingAndTrailingQuotes ---

    public void testStripLeadingAndTrailingQuotes_BothQuotes() {
        assertEquals("Both leading and trailing quotes should be removed", "foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
    }

    public void testStripLeadingAndTrailingQuotes_OnlyLeadingQuote() {
        assertEquals("Only leading quote should be removed", "foo\"", Util.stripLeadingAndTrailingQuotes("\"foo"));
    }

    public void testStripLeadingAndTrailingQuotes_OnlyTrailingQuote() {
        assertEquals("Only trailing quote should be removed", "\"foo", Util.stripLeadingAndTrailingQuotes("foo\""));
    }

    public void testStripLeadingAndTrailingQuotes_NoQuotes() {
        assertEquals("String without quotes should remain unchanged", "foo", Util.stripLeadingAndTrailingQuotes("foo"));
    }

    public void testStripLeadingAndTrailingQuotes_EmptyString() {
        assertEquals("Empty string should remain empty", "", Util.stripLeadingAndTrailingQuotes(""));
    }

    public void testStripLeadingAndTrailingQuotes_SingleQuote() {
        // Edge case targeting potential IndexOutOfBounds or mutation faults
        assertEquals("Single quote character", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripLeadingAndTrailingQuotes_NullInput() {
        // Documenting/Testing behavior against null for stripLeadingAndTrailingQuotes
        try {
            Util.stripLeadingAndTrailingQuotes(null);
            fail("Expected NullPointerException for null input in stripLeadingAndTrailingQuotes");
        } catch (NullPointerException e) {
            // Expected behavior in Cli-29b due to lack of null-check in original implementation
            assertTrue(true);
        }
    }
}