package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Comprehensive JUnit 4 Test Suite for WordUtils.
 * Targeting 100% Branch and Condition Coverage.
 */
public class WordUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new WordUtils());
    }

    // -----------------------------------------------------------------------
    // Wrap Tests
    // -----------------------------------------------------------------------
    @Test
    public void testWrap_NullAndEmpty() {
        assertNull(WordUtils.wrap(null, 20));
        assertNull(WordUtils.wrap(null, 20, "\n", true));
        assertEquals("", WordUtils.wrap("", 20));
        assertEquals("", WordUtils.wrap("", 20, "\n", true));
    }

    @Test
    public void testWrap_DefaultNewLineAndWrapLengthAdjust() {
        // wrapLength < 1 is normalized to 1, newLineStr == null uses SystemUtils.LINE_SEPARATOR
        String expected = "a" + SystemUtils.LINE_SEPARATOR + "b";
        assertEquals(expected, WordUtils.wrap("a b", 0));
        assertEquals(expected, WordUtils.wrap("a b", -5));
        assertEquals(expected, WordUtils.wrap("a b", 1, null, false));
    }

    @Test
    public void testWrap_NormalWrapAtSpace() {
        String input = "Here is a test string for wrapping";
        String expected = "Here is a\ntest string\nfor\nwrapping";
        assertEquals(expected, WordUtils.wrap(input, 11, "\n", false));
    }

    @Test
    public void testWrap_LeadingSpacesOnNewLine() {
        // Tests offset skipping when charAt(offset) == ' '
        String input = "Word1   Word2   Word3";
        String expected = "Word1\nWord2\nWord3";
        assertEquals(expected, WordUtils.wrap(input, 5, "\n", false));
    }

    @Test
    public void testWrap_LongWordsWrapped() {
        String input = "LongwordIsHere ThatNeedsWrap";
        // wrapLongWords = true
        String expected = "Long\nword\nIsHe\nre\nThat\nNeed\nsWra\np";
        assertEquals(expected, WordUtils.wrap(input, 4, "\n", true));
    }

    @Test
    public void testWrap_LongWordsNotWrapped_WithSubsequentSpace() {
        // Long word exceeds wrapLength, wrapLongWords = false, next space exists
        String input = "VeryLongWordWithoutSpace short word";
        String expected = "VeryLongWordWithoutSpace\nshort\nword";
        assertEquals(expected, WordUtils.wrap(input, 10, "\n", false));
    }

    @Test
    public void testWrap_LongWordsNotWrapped_NoSubsequentSpace() {
        // Long word exceeds wrapLength, wrapLongWords = false, no subsequent space left
        String input = "Short VeryLongWordAtTheEndWithoutSpace";
        String expected = "Short\nVeryLongWordAtTheEndWithoutSpace";
        assertEquals(expected, WordUtils.wrap(input, 5, "\n", false));
    }

    // -----------------------------------------------------------------------
    // Capitalize & CapitalizeFully Tests
    // -----------------------------------------------------------------------
    @Test
    public void testCapitalize_NullAndEmpty() {
        assertNull(WordUtils.capitalize(null));
        assertNull(WordUtils.capitalize(null, new char[]{' '}));
        assertEquals("", WordUtils.capitalize(""));
        assertEquals("", WordUtils.capitalize("", new char[]{' '}));
        assertEquals("abc def", WordUtils.capitalize("abc def", new char[0]));
    }

    @Test
    public void testCapitalize_DefaultDelimiters() {
        assertEquals("I Am Fine", WordUtils.capitalize("i am fine"));
        assertEquals("I Am FINE", WordUtils.capitalize("i am FINE"));
        assertEquals("  I  Am  Fine  ", WordUtils.capitalize("  i  am  fine  "));
    }

    @Test
    public void testCapitalize_CustomDelimiters() {
        char[] delimiters = new char[]{'.', '-', '_'};
        assertEquals("I.Am-Fine_Today", WordUtils.capitalize("i.am-fine_today", delimiters));
        assertEquals("Hello World", WordUtils.capitalize("hello world", delimiters)); // whitespace not in delimiter
    }

    @Test
    public void testCapitalizeFully_NullAndEmpty() {
        assertNull(WordUtils.capitalizeFully(null));
        assertNull(WordUtils.capitalizeFully(null, new char[]{' '}));
        assertEquals("", WordUtils.capitalizeFully(""));
        assertEquals("", WordUtils.capitalizeFully("", new char[]{' '}));
        assertEquals("ABC DEF", WordUtils.capitalizeFully("ABC DEF", new char[0]));
    }

    @Test
    public void testCapitalizeFully_DefaultAndCustomDelimiters() {
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i am FINE"));
        assertEquals("I Am Fine", WordUtils.capitalizeFully("I AM FINE"));

        char[] delimiters = new char[]{'.'};
        assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", delimiters));
    }

    // -----------------------------------------------------------------------
    // Uncapitalize Tests
    // -----------------------------------------------------------------------
    @Test
    public void testUncapitalize_NullAndEmpty() {
        assertNull(WordUtils.uncapitalize(null));
        assertNull(WordUtils.uncapitalize(null, new char[]{' '}));
        assertEquals("", WordUtils.uncapitalize(""));
        assertEquals("", WordUtils.uncapitalize("", new char[]{' '}));
        assertEquals("ABC DEF", WordUtils.uncapitalize("ABC DEF", new char[0]));
    }

    @Test
    public void testUncapitalize_DefaultAndCustomDelimiters() {
        assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
        assertEquals("i  am  fine", WordUtils.uncapitalize("I  Am  Fine"));

        char[] delimiters = new char[]{'.'};
        assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", delimiters));
    }

    // -----------------------------------------------------------------------
    // SwapCase Tests
    // -----------------------------------------------------------------------
    @Test
    public void testSwapCase_NullAndEmpty() {
        assertNull(WordUtils.swapCase(null));
        assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testSwapCase_MixedStrings() {
        assertEquals("tHE DOG HAS A bone", WordUtils.swapCase("The dog has a BONE"));
        assertEquals("1234 !@#$", WordUtils.swapCase("1234 !@#$"));
        assertEquals("a1B2 c3D4", WordUtils.swapCase("A1b2 C3d4"));

        // Titlecase unicode character (LATIN CAPITAL LETTER D WITH SMALL LETTER Z WITH CARON)
        String titleCaseChar = "\u01C5"; // Dz with caron (Titlecase)
        assertEquals("\u01C6", WordUtils.swapCase(titleCaseChar)); // Converts to lowercase \u01C6 (dz with caron)
    }

    // -----------------------------------------------------------------------
    // Initials Tests
    // -----------------------------------------------------------------------
    @Test
    public void testInitials_NullAndEmpty() {
        assertNull(WordUtils.initials(null));
        assertNull(WordUtils.initials(null, new char[]{' '}));
        assertEquals("", WordUtils.initials(""));
        assertEquals("", WordUtils.initials("", new char[]{' '}));
        assertEquals("", WordUtils.initials("Ben John Lee", new char[0]));
    }

    @Test
    public void testInitials_DefaultAndCustomDelimiters() {
        assertEquals("BJL", WordUtils.initials("Ben John Lee"));
        assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
        assertEquals("BJL", WordUtils.initials("Ben J.Lee", new char[]{' ', '.'}));
        assertEquals("B", WordUtils.initials("   Ben   "));
    }

    // -----------------------------------------------------------------------
    // Abbreviate Tests
    // -----------------------------------------------------------------------
    @Test
    public void testAbbreviate_NullAndEmpty() {
        assertNull(WordUtils.abbreviate(null, 1, -1, "..."));
        assertEquals("", WordUtils.abbreviate("", 0, 5, "..."));
    }

    @Test
    public void testAbbreviate_NoAbbreviationNeeded() {
        // upper == -1 or upper >= length
        assertEquals("Hello World", WordUtils.abbreviate("Hello World", 0, -1, "..."));
        assertEquals("Hello World", WordUtils.abbreviate("Hello World", 0, 20, "..."));
        assertEquals("Hello World", WordUtils.abbreviate("Hello World", 0, 11, "..."));
    }

    @Test
    public void testAbbreviate_UpperAdjustedToLower() {
        // upper < lower -> upper = lower
        assertEquals("Hello...", WordUtils.abbreviate("Hello World", 5, 2, "..."));
    }

    @Test
    public void testAbbreviate_SpaceFoundWithinRange() {
        // Space found within lower <= index <= upper
        assertEquals("Hello...", WordUtils.abbreviate("Hello Big World", 4, 10, "..."));
    }

    @Test
    public void testAbbreviate_SpaceFoundAfterUpper() {
        // Space found at index > upper
        assertEquals("Hello...", WordUtils.abbreviate("HelloBig World", 2, 5, "..."));
    }

    @Test
    public void testAbbreviate_NoSpaceFoundAfterLower() {
        // index == -1 (no space after lower)
        assertEquals("Hello...", WordUtils.abbreviate("HelloWorldLong", 2, 5, "..."));
    }

    @Test
    public void testAbbreviate_NullAppendToEnd() {
        // appendToEnd == null defaults to ""
        assertEquals("Hello", WordUtils.abbreviate("Hello World", 4, 8, null));
        assertEquals("Hello", WordUtils.abbreviate("HelloWorldLong", 2, 5, null));
    }

    @Test
    public void testAbbreviate_LowerEqualsStringLength() {
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 10, -1, "..."));
        assertEquals("0123456789", WordUtils.abbreviate("0123456789", 10, 10, "..."));
    }
}