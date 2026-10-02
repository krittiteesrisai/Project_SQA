package org.apache.commons.lang3.util.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

    // ---------- isEmpty / isNotEmpty ----------
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
        assertFalse(StringUtils.isEmpty("  bob  "));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    // ---------- isBlank / isNotBlank ----------
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotBlank("bob"));
    }

    // ---------- trim / trimToNull / trimToEmpty ----------
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("     "));
        assertEquals("abc", StringUtils.trim("abc"));
        assertEquals("abc", StringUtils.trim("    abc    "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("     "));
        assertEquals("abc", StringUtils.trimToNull("abc"));
        assertEquals("abc", StringUtils.trimToNull("    abc    "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty("     "));
        assertEquals("abc", StringUtils.trimToEmpty("abc"));
        assertEquals("abc", StringUtils.trimToEmpty("    abc    "));
    }

    // ---------- strip family ----------
    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("", StringUtils.strip("   "));
        assertEquals("abc", StringUtils.strip("abc"));
        assertEquals("abc", StringUtils.strip("  abc"));
        assertEquals("abc", StringUtils.strip("abc  "));
        assertEquals("abc", StringUtils.strip(" abc "));
        assertEquals("ab c", StringUtils.strip(" ab c "));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("abc"));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripWithChars() {
        assertNull(StringUtils.strip(null, "*"));
        assertEquals("", StringUtils.strip("", "*"));
        assertEquals("abc", StringUtils.strip("abc", null));
        assertEquals("abc", StringUtils.strip("  abc", null));
        assertEquals("abc", StringUtils.strip("abc  ", null));
        assertEquals("abc", StringUtils.strip(" abc ", null));
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, "*"));
        assertEquals("", StringUtils.stripStart("", "*"));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
        assertEquals("abc", StringUtils.stripStart("abc", null));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc  ", StringUtils.stripStart("abc  ", null));
        assertEquals("abc ", StringUtils.stripStart(" abc ", null));
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, "*"));
        assertEquals("", StringUtils.stripEnd("", "*"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[] {"abc", "abc"},
                StringUtils.stripAll(new String[] {"abc", "  abc"}));
        assertArrayEquals(new String[] {"abc", null},
                StringUtils.stripAll(new String[] {"abc  ", null}));
    }

    @Test
    public void testStripAllWithChars() {
        assertNull(StringUtils.stripAll(null, "*"));
        assertArrayEquals(new String[] {"abc  ", null},
                StringUtils.stripAll(new String[] {"abc  ", null}, "yz"));
        assertArrayEquals(new String[] {"abc", null},
                StringUtils.stripAll(new String[] {"yabcz", null}, "yz"));
    }

    @Test
    public void testStripAccents_NullSafe() {
        assertNull(StringUtils.stripAccents(null));
        // NOTE: การลบ accent จริงขึ้นกับ java.text.Normalizer ของ JVM runtime
        // จึงทดสอบเฉพาะ input ที่ไม่มี accent เพื่อไม่ depend บน environment
        assertEquals("control", StringUtils.stripAccents("control"));
        assertEquals("", StringUtils.stripAccents(""));
    }

    // ---------- equals / equalsIgnoreCase ----------
    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    // ---------- indexOf (char) ----------
    @Test
    public void testIndexOfChar() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void testIndexOfCharStartPos() {
        assertEquals(-1, StringUtils.indexOf(null, 'b', 0));
        assertEquals(-1, StringUtils.indexOf("", 'b', 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));
    }

    // ---------- indexOf (CharSequence) ----------
    @Test
    public void testIndexOfCharSequence() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(0, StringUtils.indexOf("", ""));
        assertEquals(-1, StringUtils.indexOf("", "a"));
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
        assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
    }

    @Test
    public void testIndexOfCharSequenceStartPos() {
        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", null, 0));
        assertEquals(0, StringUtils.indexOf("", "", 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOf("abc", "", 9));
    }

    // ---------- ordinalIndexOf / lastOrdinalIndexOf ----------
    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 0)); // ordinal<=0 branch
    }

    @Test
    public void testLastOrdinalIndexOf() {
        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        assertEquals(0, StringUtils.lastOrdinalIndexOf("", "", 1));
        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
    }

    // ---------- indexOfIgnoreCase ----------
    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
    }

    @Test
    public void testIndexOfIgnoreCaseStartPos() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a", 0));
        assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9));
    }

    // ---------- lastIndexOf ----------
    @Test
    public void testLastIndexOfChar() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
    }

    @Test
    public void testLastIndexOfCharStartPos() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testLastIndexOfCharSequence() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", null));
        assertEquals(0, StringUtils.lastIndexOf("", ""));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a"));
        assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab"));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfCharSequenceStartPos() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 0));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 9));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", -1));
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a", 0));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", 0));
    }

    @Test
    public void testLastIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("A", null));
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPos() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
        assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0));
    }

    // ---------- contains ----------
    @Test
    public void testContainsChar() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsCharSequence() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("a", null));
        assertTrue(StringUtils.contains("", ""));
        assertTrue(StringUtils.contains("abc", ""));
        assertTrue(StringUtils.contains("abc", "a"));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertTrue(StringUtils.containsIgnoreCase("", ""));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    @Test
    public void testContainsWhitespace() {
        assertFalse(StringUtils.containsWhitespace(null));
        assertFalse(StringUtils.containsWhitespace(""));
        assertTrue(StringUtils.containsWhitespace("a b"));
        assertFalse(StringUtils.containsWhitespace("abc"));
    }

    // ---------- indexOfAny / containsAny ----------
    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAny(null, 'z'));
        assertEquals(-1, StringUtils.indexOfAny("", 'z'));
        assertEquals(-1, StringUtils.indexOfAny("aba", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", 'z', 'a'));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", 'b', 'y'));
        assertEquals(-1, StringUtils.indexOfAny("aba", 'z'));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (String) null));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", ""));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
        assertEquals(-1, StringUtils.indexOfAny("aba", "z"));
    }

    @Test
    public void testContainsAnyChars() {
        assertFalse(StringUtils.containsAny(null, 'z'));
        assertFalse(StringUtils.containsAny("", 'z'));
        assertFalse(StringUtils.containsAny("aba", (char[]) null));
        assertFalse(StringUtils.containsAny("aba", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'a'));
        assertFalse(StringUtils.containsAny("aba", 'z'));
    }

    @Test
    public void testContainsAnyCharSequence() {
        assertFalse(StringUtils.containsAny(null, "za"));
        assertFalse(StringUtils.containsAny("zzabyycdxx", (CharSequence) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertFalse(StringUtils.containsAny("aba", "z"));
    }

    // ---------- indexOfAnyBut / containsOnly / containsNone ----------
    @Test
    public void testIndexOfAnyButChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut((String) null, 'z'));
        assertEquals(-1, StringUtils.indexOfAnyBut("", 'z'));
        assertEquals(-1, StringUtils.indexOfAnyBut("a", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("a", new char[0]));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", 'z', 'a'));
        assertEquals(0, StringUtils.indexOfAnyBut("aba", 'z'));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", 'a', 'b'));
    }

    @Test
    public void testIndexOfAnyButCharSequence() {
        assertEquals(-1, StringUtils.indexOfAnyBut((CharSequence) null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (CharSequence) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", ""));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    @Test
    public void testContainsOnlyChars() {
        assertFalse(StringUtils.containsOnly((String) null, 'a'));
        assertFalse(StringUtils.containsOnly("a", (char[]) null));
        assertTrue(StringUtils.containsOnly("", 'a'));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", 'a', 'b', 'c'));
        assertFalse(StringUtils.containsOnly("ab1", 'a', 'b', 'c'));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly((String) null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("", "abc"));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
        assertFalse(StringUtils.containsOnly("ab1", "abc"));
    }

    @Test
    public void testContainsNoneChars() {
        assertTrue(StringUtils.containsNone((String) null, 'x'));
        assertTrue(StringUtils.containsNone("ab", (char[]) null));
        assertTrue(StringUtils.containsNone("", 'x'));
        assertTrue(StringUtils.containsNone("abab", 'x', 'y', 'z'));
        assertFalse(StringUtils.containsNone("abz", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone((String) null, "xyz"));
        assertTrue(StringUtils.containsNone("ab", (String) null));
        assertTrue(StringUtils.containsNone("abab", "xyz"));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    @Test
    public void testIndexOfAnyStrings() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "ab", "cd"));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new CharSequence[0]));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "ab", "cd"));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", "mn", "op"));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", (CharSequence) null, ""));
    }

    @Test
    public void testLastIndexOfAnyStrings() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, "ab"));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", (CharSequence[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", "ab", "cd"));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", "mn", "op"));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", (CharSequence) null));
    }

    // ---------- substring / left / right / mid ----------
    @Test
    public void testSubstringStart() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 5));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 4));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));
    }

    @Test
    public void testSubstringStartEnd() {
        assertNull(StringUtils.substring(null, 0, 2));
        assertEquals("", StringUtils.substring("", 0, 2));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("", StringUtils.substring("abc", 2, 0));
        assertEquals("c", StringUtils.substring("abc", 2, 4));
        assertEquals("", StringUtils.substring("abc", 4, 6));
        assertEquals("", StringUtils.substring("abc", 2, 2));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 2));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("", StringUtils.left("", 2));
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("", StringUtils.right("", 2));
        assertEquals("", StringUtils.right("abc", 0));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 0, 2));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("", 0, 2));
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
        assertEquals("", StringUtils.mid("abc", 4, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
    }

    // ---------- substringBefore/After/Last ----------
    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
    }

    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "b"));
        assertEquals("", StringUtils.substringBeforeLast("", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
        assertEquals("a", StringUtils.substringBeforeLast("a", ""));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
        assertEquals("", StringUtils.substringAfterLast("a", "z"));
    }

    // ---------- substringBetween / substringsBetween ----------
    @Test
    public void testSubstringBetweenTag() {
        assertNull(StringUtils.substringBetween(null, "tag"));
        assertEquals("", StringUtils.substringBetween("", ""));
        assertNull(StringUtils.substringBetween("", "tag"));
        assertNull(StringUtils.substringBetween("tagabctag", null));
        assertEquals("", StringUtils.substringBetween("tagabctag", ""));
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetweenOpenClose() {
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween(null, "[", "]"));
        assertNull(StringUtils.substringBetween("a", null, "]"));
        assertNull(StringUtils.substringBetween("a", "[", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }

    @Test
    public void testSubstringsBetween() {
        assertArrayEquals(new String[] {"a", "b", "c"},
                StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", null));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]")); // no match -> empty list -> null
    }

    // ---------- split family ----------
    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc def"));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc  def"));
        assertArrayEquals(new String[] {"abc"}, StringUtils.split(" abc "));
    }

    @Test
    public void testSplitChar() {
        assertNull(StringUtils.split(null, '.'));
        assertArrayEquals(new String[0], StringUtils.split("", '.'));
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
        assertArrayEquals(new String[] {"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplitStringMax() {
        assertNull(StringUtils.split(null, ":", 2));
        assertArrayEquals(new String[0], StringUtils.split("", ":", 2));
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
        assertArrayEquals(new String[] {"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc def", null, -1));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "-!-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "-!-"));
        assertArrayEquals(new String[] {"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":"));
        assertArrayEquals(new String[] {"ab", "cd", "ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparatorMax() {
        assertArrayEquals(new String[] {"ab", "cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[] {"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-!-"));
        assertArrayEquals(new String[] {"ab", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null));
        assertArrayEquals(new String[] {"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
        assertArrayEquals(new String[] {"ab", "cd", "ef"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.splitPreserveAllTokens("abc def"));
        assertArrayEquals(new String[] {"abc", "", "def"}, StringUtils.splitPreserveAllTokens("abc  def"));
        assertArrayEquals(new String[] {"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensChar() {
        assertNull(StringUtils.splitPreserveAllTokens(null, '.'));
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a.b.c", '.'));
        assertArrayEquals(new String[] {"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
        assertArrayEquals(new String[] {"a:b:c"}, StringUtils.splitPreserveAllTokens("a:b:c", '.'));
        assertArrayEquals(new String[] {"a", "b", "c", ""}, StringUtils.splitPreserveAllTokens("a b c ", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensStringMax() {
        assertArrayEquals(new String[] {"ab", "cd:ef"},
                StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[] {"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab de fg"));
        assertArrayEquals(new String[] {"number", "5"}, StringUtils.splitByCharacterType("number5"));
        assertArrayEquals(new String[] {"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
        assertArrayEquals(new String[] {"ASFR", "ules"}, StringUtils.splitByCharacterType("ASFRules"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterTypeCamelCase(""));
        assertArrayEquals(new String[] {"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[] {"foo", "200", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
        assertArrayEquals(new String[] {"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // ---------- join family ----------
    @Test
    public void testJoinVarargs() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("", StringUtils.join((Object) null));
        assertEquals("abc", StringUtils.join("a", "b", "c"));
    }

    @Test
    public void testJoinObjectArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ';'));
        assertEquals("", StringUtils.join(new Object[0], ';'));
        assertEquals("", StringUtils.join(new Object[] {null}, ';'));
        assertEquals("a;b;c", StringUtils.join(new Object[] {"a", "b", "c"}, ';'));
        assertEquals(";;a", StringUtils.join(new Object[] {null, "", "a"}, ';'));
    }

    @Test
    public void testJoinObjectArrayCharRange() {
        assertNull(StringUtils.join((Object[]) null, ',', 0, 1));
        assertEquals("", StringUtils.join(new Object[] {"a", "b", "c"}, ',', 1, 1));
        assertEquals("b,c", StringUtils.join(new Object[] {"a", "b", "c"}, ',', 1, 3));
    }

    @Test
    public void testJoinObjectArrayString() {
        assertNull(StringUtils.join((Object[]) null, "--"));
        assertEquals("", StringUtils.join(new Object[0], "--"));
        assertEquals("", StringUtils.join(new Object[] {null}, "--"));
        assertEquals("a--b--c", StringUtils.join(new Object[] {"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[] {"a", "b", "c"}, (String) null));
        assertEquals("abc", StringUtils.join(new Object[] {"a", "b", "c"}, ""));
    }

    @Test
    public void testJoinObjectArrayStringRange() {
        assertEquals("", StringUtils.join(new Object[] {"a", "b"}, "-", 1, 1));
        assertEquals("a-b", StringUtils.join(new Object[] {"a", "b"}, "-", 0, 2));
    }

    @Test
    public void testJoinIteratorChar() {
        assertNull(StringUtils.join((java.util.Iterator<?>) null, ';'));
        List<String> empty = new ArrayList<String>();
        assertEquals("", StringUtils.join(empty.iterator(), ';'));
        List<String> one = Arrays.asList("a");
        assertEquals("a", StringUtils.join(one.iterator(), ';'));
        List<String> many = Arrays.asList("a", "b", "c");
        assertEquals("a;b;c", StringUtils.join(many.iterator(), ';'));
    }

    @Test
    public void testJoinIteratorString() {
        assertNull(StringUtils.join((java.util.Iterator<?>) null, "-"));
        List<String> many = Arrays.asList("a", "b", "c");
        assertEquals("a-b-c", StringUtils.join(many.iterator(), "-"));
        assertEquals("abc", StringUtils.join(many.iterator(), (String) null));
    }

    @Test
    public void testJoinIterableChar() {
        assertNull(StringUtils.join((Iterable<?>) null, ';'));
        assertEquals("a;b;c", StringUtils.join(Arrays.asList("a", "b", "c"), ';'));
    }

    @Test
    public void testJoinIterableString() {
        assertNull(StringUtils.join((Iterable<?>) null, "-"));
        assertEquals("a-b-c", StringUtils.join(Arrays.asList("a", "b", "c"), "-"));
    }

    // ---------- deleteWhitespace ----------
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    // ---------- remove / removeStart / removeEnd ----------
    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "x"));
        assertEquals("", StringUtils.removeStart("", "x"));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
        assertEquals("www.domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, "x"));
        assertEquals("", StringUtils.removeEnd("", "x"));
        assertEquals("abc", StringUtils.removeEnd("abc", null));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
    }

    @Test
    public void testRemoveString() {
        assertNull(StringUtils.remove(null, "a"));
        assertEquals("", StringUtils.remove("", "a"));
        assertEquals("abc", StringUtils.remove("abc", null));
        assertEquals("abc", StringUtils.remove("abc", ""));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemoveChar() {
        assertNull(StringUtils.remove(null, 'a'));
        assertEquals("", StringUtils.remove("", 'a'));
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // ---------- replace family ----------
    @Test
    public void testReplaceOnce() {
        assertNull(StringUtils.replaceOnce(null, "a", "b"));
        assertEquals("any", StringUtils.replaceOnce("any", null, "b"));
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
        assertEquals("ba", StringUtils.replaceOnce("aba", "a", ""));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("any", StringUtils.replace("any", null, "b"));
        assertEquals("aba", StringUtils.replace("aba", "a", null));
        assertEquals("b", StringUtils.replace("aba", "a", ""));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplaceMax() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", null, -1));
        assertEquals("b", StringUtils.replace("abaa", "a", "", -1));
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
    }

    @Test
    public void testReplaceEach() {
        assertNull(StringUtils.replaceEach(null, new String[] {"a"}, new String[] {"b"}));
        assertEquals("aba", StringUtils.replaceEach("aba", null, null));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], null));
        assertEquals("b", StringUtils.replaceEach("aba", new String[] {"a"}, new String[] {""}));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[] {null}, new String[] {"a"}));
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[] {"ab", "d"}, new String[] {"w", "t"}));
        assertEquals("dcte", StringUtils.replaceEach("abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedly() {
        assertEquals("tcte",
                StringUtils.replaceEachRepeatedly("abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachRepeatedly_EndlessLoopException() {
        StringUtils.replaceEachRepeatedly("abcde", new String[] {"ab", "d"}, new String[] {"d", "ab"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEach_MismatchedArrayLengths() {
        StringUtils.replaceEach("abc", new String[] {"a", "b"}, new String[] {"x"});
    }

    @Test
    public void testReplaceChars() {
        assertNull(StringUtils.replaceChars(null, 'b', 'y'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceCharsSearchReplace() {
        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "x"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", "x"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    // ---------- overlay ----------
    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "abc", 0, 0));
        assertEquals("abc", StringUtils.overlay("", "abc", 0, 0));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    // ---------- chomp / chop ----------
    @Test
    public void testChomp() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("abc ", StringUtils.chomp("abc \r"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
        assertEquals("abc\n", StringUtils.chomp("abc\n\r"));
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
        assertEquals("", StringUtils.chomp("\r"));
        assertEquals("", StringUtils.chomp("\n"));
        assertEquals("", StringUtils.chomp("\r\n"));
    }

    @Test
    public void testChompSeparator() {
        assertNull(StringUtils.chomp(null, "x"));
        assertEquals("", StringUtils.chomp("", "x"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("", StringUtils.chomp("foo", "foo"));
        assertEquals("foo", StringUtils.chomp("foo", ""));
        assertEquals("foo", StringUtils.chomp("foo", (String) null));
    }

    @Test
    public void testChop() {
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("abc ", StringUtils.chop("abc \r"));
        assertEquals("abc", StringUtils.chop("abc\n"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("", StringUtils.chop("\r"));
        assertEquals("", StringUtils.chop("\r\n"));
    }

    // ---------- repeat ----------
    @Test
    public void testRepeatStrInt() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 0));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", -2));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3)); // default branch (length>2)
    }

    @Test
    public void testRepeatStrSepInt() {
        assertNull(StringUtils.repeat(null, null, 2));
        assertNull(StringUtils.repeat(null, "x", 2));
        assertEquals("", StringUtils.repeat("", null, 0));
        assertEquals("", StringUtils.repeat("", "", 2));
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    @Test
    public void testRepeatCharInt() {
        assertEquals("", StringUtils.repeat(0, 'e'));
        assertEquals("eee", StringUtils.repeat(3, 'e'));
        // NOTE: repeat(char, int) does not validate negative values in the
        // public overload with negative repeat (handled before calling char version in repeat(String,int))
    }

    // ---------- padding ----------
    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 3));
        assertEquals("   ", StringUtils.rightPad("", 3));
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
        assertEquals("bat", StringUtils.rightPad("bat", 1));
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPadChar() {
        assertNull(StringUtils.rightPad(null, 3, 'z'));
        assertEquals("zzz", StringUtils.rightPad("", 3, 'z'));
        assertEquals("bat", StringUtils.rightPad("bat", 3, 'z'));
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
    }

    @Test
    public void testRightPadString() {
        assertNull(StringUtils.rightPad(null, 3, "z"));
        assertEquals("zzz", StringUtils.rightPad("", 3, "z"));
        assertEquals("bat", StringUtils.rightPad("bat", 3, "yz"));
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, (String) null));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }

    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 3));
        assertEquals("   ", StringUtils.leftPad("", 3));
        assertEquals("bat", StringUtils.leftPad("bat", 3));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
        assertEquals("bat", StringUtils.leftPad("bat", -1));
    }

    @Test
    public void testLeftPadChar() {
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
    }

    @Test
    public void testLeftPadString() {
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, (String) null));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(3, StringUtils.length("abc"));
    }

    // ---------- center ----------
    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("    ", StringUtils.center("", 4));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
        assertEquals(" a  ", StringUtils.center("a", 4));
    }

    @Test
    public void testCenterChar() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenterString() {
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("  abc  ", StringUtils.center("abc", 7, (String) null));
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }

    // ---------- case conversion ----------
    @Test
    public void testUpperCase() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("", StringUtils.upperCase(""));
        assertEquals("ABC", StringUtils.upperCase("aBc"));
    }

    @Test
    public void testUpperCaseLocale() {
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase() {
        assertNull(StringUtils.lowerCase(null));
        assertEquals("", StringUtils.lowerCase(""));
        assertEquals("abc", StringUtils.lowerCase("aBc"));
    }

    @Test
    public void testLowerCaseLocale() {
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Cat", StringUtils.capitalize("cat"));
        assertEquals("CAt", StringUtils.capitalize("cAt"));
    }

    @Test
    public void testUncapitalize() {
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
        assertEquals("cAT", StringUtils.uncapitalize("CAT"));
    }

    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    // ---------- countMatches ----------
    @Test
    public void testCountMatches() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
        assertEquals(0, StringUtils.countMatches("", "a"));
        assertEquals(0, StringUtils.countMatches("abba", null));
        assertEquals(0, StringUtils.countMatches("abba", ""));
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }

    // ---------- character tests ----------
    @Test
    public void testIsAlpha() {
        assertFalse(StringUtils.isAlpha(null));
        assertFalse(StringUtils.isAlpha(""));
        assertFalse(StringUtils.isAlpha("  "));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab2c"));
        assertFalse(StringUtils.isAlpha("ab-c"));
    }

    @Test
    public void testIsAlphaSpace() {
        assertFalse(StringUtils.isAlphaSpace(null));
        assertTrue(StringUtils.isAlphaSpace(""));
        assertTrue(StringUtils.isAlphaSpace("  "));
        assertTrue(StringUtils.isAlphaSpace("ab c"));
        assertFalse(StringUtils.isAlphaSpace("ab2c"));
    }

    @Test
    public void testIsAlphanumeric() {
        assertFalse(StringUtils.isAlphanumeric(null));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertFalse(StringUtils.isAlphanumeric("  "));
        assertTrue(StringUtils.isAlphanumeric("abc"));
        assertFalse(StringUtils.isAlphanumeric("ab c"));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
        assertFalse(StringUtils.isAlphanumeric("ab-c"));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("ab2c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable(" "));
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertFalse(StringUtils.isNumeric(""));
        assertFalse(StringUtils.isNumeric("  "));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12 3"));
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace(""));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("12.3"));
    }

    @Test
    public void testIsWhitespace() {
        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace("  "));
        assertFalse(StringUtils.isWhitespace("abc"));
    }

    @Test
    public void testIsAllLowerCase() {
        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertFalse(StringUtils.isAllLowerCase("  "));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("abC"));
    }

    @Test
    public void testIsAllUpperCase() {
        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    // ---------- defaults ----------
    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("", StringUtils.defaultString(""));
        assertEquals("bat", StringUtils.defaultString("bat"));
    }

    @Test
    public void testDefaultStringWithDefault() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        assertEquals("", StringUtils.defaultString("", "NULL"));
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
        assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
        assertEquals("bat", StringUtils.defaultIfBlank("bat", "NULL"));
        assertNull(StringUtils.defaultIfBlank("", null));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
        assertNull(StringUtils.defaultIfEmpty("", null));
    }

    // ---------- reverse ----------
    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("tab", StringUtils.reverse("bat"));
    }

    @Test
    public void testReverseDelimited() {
        assertNull(StringUtils.reverseDelimited(null, '.'));
        assertEquals("", StringUtils.reverseDelimited("", '.'));
        assertEquals("a.b.c", StringUtils.reverseDelimited("a.b.c", 'x'));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    // ---------- abbreviate ----------
    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviate_WidthTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateOffset() {
        assertNull(StringUtils.abbreviate(null, 0, 10));
        assertEquals("", StringUtils.abbreviate("", 0, 4));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", -1, 10));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateOffset_WidthTooSmall() {
        StringUtils.abbreviate("abcdefghij", 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateOffset_WidthTooSmallWithOffset() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    @Test
    public void testAbbreviateMiddle() {
        assertNull(StringUtils.abbreviateMiddle(null, null, 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 3));
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
    }

    // ---------- difference ----------
    @Test
    public void testDifference() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("", StringUtils.difference("", ""));
        assertEquals("abc", StringUtils.difference("", "abc"));
        assertEquals("", StringUtils.difference("abc", ""));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifference() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(-1, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifferenceArray() {
        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {}));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {"abc"}));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {null, null}));
        assertEquals(0, StringUtils.indexOfDifference(new CharSequence[] {"", null}));
        assertEquals(1, StringUtils.indexOfDifference(new CharSequence[] {"abc", "a"}));
        assertEquals(7, StringUtils.indexOfDifference(new CharSequence[] {"i am a machine", "i am a robot"}));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix());
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
        assertEquals("", StringUtils.getCommonPrefix((String) null, (String) null));
        assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
        assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
        assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
    }

    // ---------- Levenshtein distance ----------
    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_NullFirst() {
        StringUtils.getLevenshteinDistance(null, "a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_NullSecond() {
        StringUtils.getLevenshteinDistance("a", null);
    }

    @Test
    public void testGetLevenshteinDistanceThreshold() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo", 6));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("hippo", "elephant", 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceThreshold_NullArg() {
        StringUtils.getLevenshteinDistance(null, "a", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceThreshold_NegativeThreshold() {
        StringUtils.getLevenshteinDistance("a", "b", -1);
    }

    // ---------- startsWith / endsWith ----------
    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "abc"));
        assertFalse(StringUtils.startsWith("abcdef", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
        assertFalse(StringUtils.startsWithIgnoreCase("ab", "abc")); // prefix longer than str
    }

    @Test
    public void testStartsWithAny() {
        assertFalse(StringUtils.startsWithAny(null, (CharSequence[]) null));
        assertFalse(StringUtils.startsWithAny(null, "abc"));
        assertFalse(StringUtils.startsWithAny("abcxyz", (CharSequence[]) null));
        assertFalse(StringUtils.startsWithAny("abcxyz", ""));
        assertTrue(StringUtils.startsWithAny("abcxyz", "abc"));
        assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "def"));
        assertFalse(StringUtils.endsWith("abcdef", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "cde"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));
    }

    @Test
    public void testEndsWithAny() {
        assertFalse(StringUtils.endsWithAny(null, (CharSequence[]) null));
        assertFalse(StringUtils.endsWithAny(null, "abc"));
        assertFalse(StringUtils.endsWithAny("abcxyz", (CharSequence[]) null));
        assertTrue(StringUtils.endsWithAny("abcxyz", ""));
        assertTrue(StringUtils.endsWithAny("abcxyz", "xyz"));
        assertTrue(StringUtils.endsWithAny("abcxyz", null, "xyz", "abc"));
    }

    // ---------- normalizeSpace ----------
    @Test
    public void testNormalizeSpace() {
        assertNull(StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("a b c", StringUtils.normalizeSpace("  a   b  c  "));
        assertEquals("abc", StringUtils.normalizeSpace("abc"));
    }
}
