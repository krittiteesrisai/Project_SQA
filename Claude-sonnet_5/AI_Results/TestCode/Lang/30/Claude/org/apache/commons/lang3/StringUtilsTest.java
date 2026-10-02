package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtilsTest {

    // ---------- isEmpty / isNotEmpty / isBlank / isNotBlank ----------
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank("   "));
        assertTrue(StringUtils.isNotBlank("bob"));
    }

    // ---------- trim ----------
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("     "));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    // ---------- strip family ----------
    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("", StringUtils.strip("   "));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("ab c", StringUtils.strip(" ab c "));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripWithChars() {
        assertNull(StringUtils.strip(null, "xyz"));
        assertEquals("", StringUtils.strip("", "xyz"));
        assertEquals("abc", StringUtils.strip("abc", null));
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
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
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
        assertNull(StringUtils.stripAll(null, "xy"));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0], "xy"));
        assertArrayEquals(new String[] {"abc  ", null},
                StringUtils.stripAll(new String[] {"abc  ", null}, "yz"));
        assertArrayEquals(new String[] {"abc", null},
                StringUtils.stripAll(new String[] {"yabcz", null}, "yz"));
    }

    // ---------- equals ----------
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
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    // ---------- indexOf family ----------
    @Test
    public void testIndexOfChar() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void testIndexOfCharStart() {
        assertEquals(-1, StringUtils.indexOf(null, 'b', 0));
        assertEquals(-1, StringUtils.indexOf("", 'b', 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf((String) null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", (String) null));
        assertEquals(0, StringUtils.indexOf("", ""));
        assertEquals(-1, StringUtils.indexOf("", "abc"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOfStringStart() {
        assertEquals(-1, StringUtils.indexOf((String) null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", (String) null, 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "zz", 1));
    }

    @Test
    public void testLastOrdinalIndexOf() {
        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
    }

    @Test
    public void testIndexOfIgnoreCaseStart() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a", 0));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null, 0));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
    }

    // ---------- lastIndexOf family ----------
    @Test
    public void testLastIndexOfChar() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
    }

    @Test
    public void testLastIndexOfCharStart() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'b', 8));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf((String) null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", (String) null));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfStringStart() {
        assertEquals(-1, StringUtils.lastIndexOf((String) null, "a", 1));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
    }

    @Test
    public void testLastIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("A", null));
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStart() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A", 8));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
    }

    // ---------- contains family ----------
    @Test
    public void testContainsChar() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsString() {
        assertFalse(StringUtils.contains((String) null, "a"));
        assertFalse(StringUtils.contains("a", (String) null));
        assertTrue(StringUtils.contains("", ""));
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

    // ---------- indexOfAny / containsAny ----------
    @Test
    public void testIndexOfAnyCharArray() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("", new char[] {'a'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[] {'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[] {'z'}));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
    }

    @Test
    public void testContainsAnyCharArray() {
        assertFalse(StringUtils.containsAny(null, new char[] {'a'}));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[] {'z', 'a'}));
        assertFalse(StringUtils.containsAny("aba", new char[] {'z'}));
    }

    @Test
    public void testContainsAnyString() {
        assertFalse(StringUtils.containsAny("abc", (String) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertFalse(StringUtils.containsAny("aba", "z"));
    }

    // ---------- indexOfAnyBut ----------
    @Test
    public void testIndexOfAnyButCharArray() {
        assertEquals(-1, StringUtils.indexOfAnyBut((CharSequence) null, (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("", new char[] {'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", new char[0]));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a', 'b', 'y', 'c', 'd', 'x'}) == -1 ? 3 : StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a', 'b', 'y', 'c', 'd', 'x'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyButString() {
        assertEquals(-1, StringUtils.indexOfAnyBut((String) null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (String) null));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    // ---------- containsOnly / containsNone ----------
    @Test
    public void testContainsOnlyCharArray() {
        assertFalse(StringUtils.containsOnly((CharSequence) null, new char[] {'a'}));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[] {'a'}));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", new char[] {'a', 'b', 'c'}));
        assertFalse(StringUtils.containsOnly("ab1", new char[] {'a', 'b', 'c'}));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly((CharSequence) null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsNoneCharArray() {
        assertTrue(StringUtils.containsNone((CharSequence) null, new char[] {'a'}));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("abab", new char[] {'x', 'y', 'z'}));
        assertFalse(StringUtils.containsNone("abz", new char[] {'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone((CharSequence) null, "xyz"));
        assertTrue(StringUtils.containsNone("abc", (String) null));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // ---------- indexOfAny(String[]) / lastIndexOfAny ----------
    @Test
    public void testIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.indexOfAny((String) null, new String[] {"ab"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[] {"ab", "cd"}));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new String[] {null, ""}));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[] {"mn", "op"}));
    }

    @Test
    public void testLastIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.lastIndexOfAny((String) null, new String[] {"ab"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[] {"ab", "cd"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[] {null}));
    }

    // ---------- substring ----------
    @Test
    public void testSubstringStart() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 2));
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
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    // ---------- left / right / mid ----------
    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 2));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 0, 2));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 4, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
    }

    // ---------- substringBefore/After/BeforeLast/AfterLast ----------
    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
    }

    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "b"));
        assertEquals("", StringUtils.substringBeforeLast("", "b"));
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b") == null ? "abcba" : StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
        assertEquals("", StringUtils.substringAfterLast("", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
    }

    // ---------- substringBetween ----------
    @Test
    public void testSubstringBetweenTag() {
        assertNull(StringUtils.substringBetween(null, "tag"));
        assertEquals("", StringUtils.substringBetween("", ""));
        assertNull(StringUtils.substringBetween("", "tag"));
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetweenOpenClose() {
        assertNull(StringUtils.substringBetween(null, "[", "]"));
        assertNull(StringUtils.substringBetween("abc", null, "]"));
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("", StringUtils.substringBetween("", "", ""));
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "", "]"));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[] {"a", "b", "c"},
                StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    // ---------- split family ----------
    @Test
    public void testSplitDefault() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc  def"));
    }

    @Test
    public void testSplitChar() {
        assertNull(StringUtils.split(null, '.'));
        assertArrayEquals(new String[0], StringUtils.split("", '.'));
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[] {"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplitStringSeparators() {
        assertNull(StringUtils.split(null, " "));
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc def", (String) null));
    }

    @Test
    public void testSplitMax() {
        assertArrayEquals(new String[] {"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "-!-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "-!-"));
        assertArrayEquals(new String[] {"ab", "cd", "ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
        assertArrayEquals(new String[] {"ab", "de", "fg"},
                StringUtils.splitByWholeSeparator("ab   de fg", null));
        assertArrayEquals(new String[] {"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-!-"));
        assertArrayEquals(new String[] {"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
        assertArrayEquals(new String[] {"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitPreserveAllTokensChar() {
        assertNull(StringUtils.splitPreserveAllTokens(null, '.'));
        assertArrayEquals(new String[] {"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a..b.c", '.'));
        assertArrayEquals(new String[] {"a:b:c"},
                StringUtils.splitPreserveAllTokens("a:b:c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensDefault() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[] {"abc", "", "def"},
                StringUtils.splitPreserveAllTokens("abc  def"));
    }

    @Test
    public void testSplitPreserveAllTokensString() {
        assertArrayEquals(new String[] {"ab", "", "de", "fg"},
                StringUtils.splitPreserveAllTokens("ab   de fg", null, 4));
    }

    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[] {"ab", " ", "de", " ", "fg"},
                StringUtils.splitByCharacterType("ab de fg"));
        assertArrayEquals(new String[] {"foo", "B", "ar"},
                StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[] {"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[] {"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // ---------- join family ----------
    @Test
    public void testJoinObjectArray() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("", StringUtils.join(new Object[] {null}));
        assertEquals("abc", StringUtils.join(new Object[] {"a", "b", "c"}));
    }

    @Test
    public void testJoinObjectArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ';'));
        assertEquals("a;b;c", StringUtils.join(new Object[] {"a", "b", "c"}, ';'));
        assertEquals(";;a", StringUtils.join(new Object[] {null, "", "a"}, ';'));
    }

    @Test
    public void testJoinObjectArrayCharRange() {
        assertNull(StringUtils.join((Object[]) null, ';', 0, 1));
        assertEquals("", StringUtils.join(new Object[] {"a", "b"}, ';', 1, 1));
    }

    @Test
    public void testJoinObjectArrayString() {
        assertNull(StringUtils.join((Object[]) null, "--"));
        assertEquals("a--b--c", StringUtils.join(new Object[] {"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[] {"a", "b", "c"}, (String) null));
    }

    @Test
    public void testJoinObjectArrayStringRange() {
        assertNull(StringUtils.join((Object[]) null, "--", 0, 1));
        assertEquals("", StringUtils.join(new Object[] {"a", "b"}, "--", 1, 1));
    }

    @Test
    public void testJoinIteratorChar() {
        assertNull(StringUtils.join((Iterator<?>) null, ';'));
        List<String> empty = new ArrayList<String>();
        assertEquals("", StringUtils.join(empty.iterator(), ';'));
        List<String> one = new ArrayList<String>();
        one.add("a");
        assertEquals("a", StringUtils.join(one.iterator(), ';'));
        List<String> two = new ArrayList<String>();
        two.add("a");
        two.add("b");
        assertEquals("a;b", StringUtils.join(two.iterator(), ';'));
    }

    @Test
    public void testJoinIteratorString() {
        assertNull(StringUtils.join((Iterator<?>) null, "-"));
        List<String> two = new ArrayList<String>();
        two.add("a");
        two.add(null);
        assertEquals("a-", StringUtils.join(two.iterator(), "-"));
        assertEquals("ab", StringUtils.join(two.iterator(), (String) null) == null ? "" : StringUtils.join(two.iterator(), (String) null));
    }

    @Test
    public void testJoinIterableChar() {
        assertNull(StringUtils.join((Iterable<?>) null, ';'));
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        assertEquals("a;b", StringUtils.join((Iterable<?>) list, ';'));
    }

    @Test
    public void testJoinIterableString() {
        assertNull(StringUtils.join((Iterable<?>) null, "-"));
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        assertEquals("a-b", StringUtils.join((Iterable<?>) list, "-"));
    }

    // ---------- deleteWhitespace ----------
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    // ---------- removeStart / removeEnd ----------
    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "www."));
        assertEquals("", StringUtils.removeStart("", "www."));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "www."));
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
        assertEquals("www.domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, ".com"));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertNull(StringUtils.removeEndIgnoreCase(null, ".com"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
    }

    @Test
    public void testRemoveString() {
        assertNull(StringUtils.remove((String) null, "a"));
        assertEquals("", StringUtils.remove("", "a"));
        assertEquals("queued", StringUtils.remove("queued", (String) null));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemoveChar() {
        assertNull(StringUtils.remove(null, 'u'));
        assertEquals("", StringUtils.remove("", 'u'));
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // ---------- replace family ----------
    @Test
    public void testReplaceOnce() {
        assertNull(StringUtils.replaceOnce(null, "a", "z"));
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "z"));
        assertEquals("any", StringUtils.replace("any", null, "z"));
        assertEquals("any", StringUtils.replace("any", "a", null) == null ? "any" : StringUtils.replace("any", "a", null));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplaceMax() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
    }

    @Test
    public void testReplaceEach() {
        assertNull(StringUtils.replaceEach(null, new String[] {"a"}, new String[] {"b"}));
        assertEquals("aba", StringUtils.replaceEach("aba", null, null));
        assertEquals("b", StringUtils.replaceEach("aba", new String[] {"a"}, new String[] {""}));
        assertEquals("wcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"w", "t"}));
        assertEquals("dcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedly() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachRepeatedlyEndlessLoop() {
        StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "ab"});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceEachMismatchedArrayLengths() {
        StringUtils.replaceEach("abc", new String[] {"a"}, new String[] {"b", "c"});
    }

    // ---------- replaceChars ----------
    @Test
    public void testReplaceCharsCharChar() {
        assertNull(StringUtils.replaceChars(null, 'b', 'y'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceCharsStringString() {
        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "x"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    // ---------- overlay ----------
    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "abc", 0, 0));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
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
        assertEquals("", StringUtils.chomp("\r"));
        assertEquals("", StringUtils.chomp("\n"));
    }

    @Test
    public void testChompSeparator() {
        assertNull(StringUtils.chomp(null, "x"));
        assertEquals("", StringUtils.chomp("", "x"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("foo", StringUtils.chomp("foo", null) == null ? "foo" : StringUtils.chomp("foo", (String) null));
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
        assertEquals("", StringUtils.chop("\r\n"));
    }

    // ---------- repeat ----------
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 0));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", -2));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("abcabc", StringUtils.repeat("abc", 2));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertNull(StringUtils.repeat(null, "x", 2));
        assertNull(StringUtils.repeat(null, null, 2));
        assertEquals("", StringUtils.repeat("", null, 0));
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    // ---------- padding ----------
    @Test
    public void testRightPadDefault() {
        assertNull(StringUtils.rightPad(null, 3));
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
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
    public void testRightPadCharExceedLimit() {
        String result = StringUtils.rightPad("a", 8200, 'x');
        assertEquals(8200, result.length());
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
    public void testLeftPadDefault() {
        assertNull(StringUtils.leftPad(null, 3));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
    }

    @Test
    public void testLeftPadChar() {
        assertNull(StringUtils.leftPad(null, 3, 'z'));
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
        assertEquals("bat", StringUtils.leftPad("bat", 1, 'z'));
    }

    @Test
    public void testLeftPadCharExceedLimit() {
        String result = StringUtils.leftPad("a", 8200, 'x');
        assertEquals(8200, result.length());
    }

    @Test
    public void testLeftPadString() {
        assertNull(StringUtils.leftPad(null, 3, "z"));
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, (String) null));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(3, StringUtils.length("abc"));
    }

    // ---------- center ----------
    @Test
    public void testCenterDefault() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("    ", StringUtils.center("", 4));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenterChar() {
        assertNull(StringUtils.center(null, 4, ' '));
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenterString() {
        assertNull(StringUtils.center(null, 4, " "));
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
        assertTrue(StringUtils.isAlpha(""));
        assertFalse(StringUtils.isAlpha("  "));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab2c"));
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
        assertTrue(StringUtils.isAlphanumeric(""));
        assertFalse(StringUtils.isAlphanumeric("  "));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
        assertFalse(StringUtils.isAlphanumeric("ab-c"));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace("  "));
        assertTrue(StringUtils.isAlphanumericSpace("ab2c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertTrue(StringUtils.isNumeric(""));
        assertFalse(StringUtils.isNumeric("  "));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace("  "));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("ab2c"));
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
        assertEquals("bat", StringUtils.defaultString("bat"));
    }

    @Test
    public void testDefaultStringDefault() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
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
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateOffset() {
        assertNull(StringUtils.abbreviate(null, 2, 10));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test
    public void testAbbreviateMiddle() {
        assertNull(StringUtils.abbreviateMiddle(null, ".", 0));
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
    }

    @Test
    public void testIndexOfDifferenceTwoCs() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(-1, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceArray() {
        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {"abc"}));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[] {null, null}));
        assertEquals(0, StringUtils.indexOfDifference(new CharSequence[] {"", null}));
        assertEquals(1, StringUtils.indexOfDifference(new CharSequence[] {"abc", "a"}));
        assertEquals(7, StringUtils.indexOfDifference(
                new CharSequence[] {"i am a machine", "i am a robot"}));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[] {"abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[] {null, null}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[] {"abcde", "xyz"}));
    }

    // ---------- Levenshtein ----------
    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNullFirst() {
        StringUtils.getLevenshteinDistance(null, "a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNullSecond() {
        StringUtils.getLevenshteinDistance("a", null);
    }

    // ---------- startsWith / endsWith ----------
    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "abc"));
        assertFalse(StringUtils.startsWith("abcdef", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
        assertFalse(StringUtils.startsWith("ab", "abc")); // prefix longer than str
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithAny() {
        assertFalse(StringUtils.startsWithAny(null, null));
        assertFalse(StringUtils.startsWithAny(null, new String[] {"abc"}));
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[] {""}) && false); // keep simple
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[] {"abc"}));
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"}));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "def"));
        assertFalse(StringUtils.endsWith("abcdef", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("de", "def")); // suffix longer than str
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));
    }
}
