package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class StringUtilsTest {

    // ---------- isEmpty / isNotEmpty ----------
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
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    // ---------- isBlank / isNotBlank ----------
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

    // ---------- trim / trimToNull / trimToEmpty ----------
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("abc", StringUtils.trim("  abc  "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    // ---------- strip / stripToNull / stripToEmpty ----------
    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("", StringUtils.strip("   "));
        assertEquals("abc", StringUtils.strip(" abc "));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull(" abc "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("abc", StringUtils.stripToEmpty(" abc "));
    }

    @Test
    public void testStripWithChars() {
        assertEquals("abc", StringUtils.strip(null, "xyz") == null ? null : StringUtils.strip(null, "xyz"));
        assertNull(StringUtils.strip(null, "xyz"));
        assertEquals("", StringUtils.strip("", "xyz"));
        assertEquals("abc", StringUtils.strip("  abc", null)); // null stripChars -> whitespace
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz")); // custom chars, stripStart/stripEnd combo
    }

    // ---------- stripStart / stripEnd ----------
    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, "*"));
        assertEquals("", StringUtils.stripStart("", "*"));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, "*"));
        assertEquals("", StringUtils.stripEnd("", "*"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    // ---------- stripAll ----------
    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        String[] empty = new String[0];
        assertArrayEquals(empty, StringUtils.stripAll(empty));
        assertArrayEquals(new String[]{"abc", "abc"}, StringUtils.stripAll(new String[]{"abc", "  abc"}));
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"abc  ", null}));
    }

    @Test
    public void testStripAllWithChars() {
        assertNull(StringUtils.stripAll(null, "xy"));
        assertArrayEquals(new String[]{"abc  ", null}, StringUtils.stripAll(new String[]{"abc  ", null}, "yz"));
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
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    // ---------- indexOf char ----------
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
    }

    // ---------- indexOf String ----------
    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(0, StringUtils.indexOf("", ""));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOfStringStartPos() {
        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", null, 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
    }

    // ---------- ordinalIndexOf / lastOrdinalIndexOf ----------
    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", 0)); // ordinal<=0
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "z", 1)); // not found inside loop
    }

    @Test
    public void testLastOrdinalIndexOf() {
        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("aabaabaa", "z", 1));
    }

    // ---------- indexOfIgnoreCase ----------
    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
    }

    @Test
    public void testIndexOfIgnoreCaseStartPos() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a", 0));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "A", -1)); // startPos<0 -> 0 (match at 0? actually 'A' match at i=0 first)
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9)); // startPos>endLimit
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9)); // startPos>endLimit but search empty check order
    }

    // ---------- lastIndexOf char ----------
    @Test
    public void testLastIndexOfChar() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
    }

    @Test
    public void testLastIndexOfCharStartPos() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'b', 8));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
    }

    // ---------- lastIndexOf String ----------
    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", null));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfStringStartPos() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 0));
        assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab", 8));
    }

    // ---------- lastIndexOfIgnoreCase ----------
    @Test
    public void testLastIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("A", null));
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPos() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A", 0));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9)); // startPos>limit adjust
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1)); // negative after adjust
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 2)); // empty search
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
    public void testContainsString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("a", null));
        assertTrue(StringUtils.contains("", ""));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    // ---------- indexOfAny chars / containsAny ----------
    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, new char[]{'a'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[]{'z'}));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((CharSequence) null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (String) null));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
    }

    @Test
    public void testContainsAnyChars() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'b', 'y'}));
        assertFalse(StringUtils.containsAny("aba", new char[]{'z'}));
    }

    @Test
    public void testContainsAnyString() {
        assertFalse(StringUtils.containsAny("abc", (String) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
    }

    // ---------- indexOfAnyBut / containsOnly / containsNone ----------
    @Test
    public void testIndexOfAnyButChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut((CharSequence) null, new char[]{'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (char[]) null));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za".toCharArray()));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab".toCharArray()));
    }

    @Test
    public void testIndexOfAnyButString() {
        assertEquals(-1, StringUtils.indexOfAnyBut((String) null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (String) null));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    @Test
    public void testContainsOnlyChars() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", "abc".toCharArray()));
        assertFalse(StringUtils.containsOnly("ab1", "abc".toCharArray()));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsNoneChars() {
        assertTrue(StringUtils.containsNone(null, new char[]{'a'}));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("abab", "xyz".toCharArray()));
        assertFalse(StringUtils.containsNone("abz", "xyz".toCharArray()));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // ---------- indexOfAny(String[]) / lastIndexOfAny(String[]) ----------
    @Test
    public void testIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.indexOfAny((String) null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[0]));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[]{null, "ab"}));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
    }

    @Test
    public void testLastIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{null}));
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
        assertEquals("abc", StringUtils.left("abc", 4));
        assertEquals("ab", StringUtils.left("abc", 2));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("abc", StringUtils.right("abc", 4));
        assertEquals("bc", StringUtils.right("abc", 2));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 0, 2));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 5, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    // ---------- substringBefore/After ----------
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
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b") == null ? null : StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
        assertEquals("", StringUtils.substringAfterLast("", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c")); // pos==len-sep.length
        assertEquals("", StringUtils.substringAfterLast("a", "z"));
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
        assertNull(StringUtils.substringBetween("foo", null, "]"));
        assertNull(StringUtils.substringBetween("foo", "[", null));
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]")); // start==-1
        assertNull(StringUtils.substringBetween("wx[b", "[", "]")); // end==-1
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", null));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]")); // no match -> list empty -> null
    }

    // ---------- split variants ----------
    @Test
    public void testSplitDefault() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def"));
        assertArrayEquals(new String[]{"abc"}, StringUtils.split(" abc "));
    }

    @Test
    public void testSplitChar() {
        assertNull(StringUtils.split(null, '.'));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplitStringSeparators() {
        assertNull(StringUtils.split(null, "."));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def", (String) null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitStringSeparatorsMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "-!-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "-!-"));
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparatorMax() {
        assertArrayEquals(new String[]{"ab", "cd-!-ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-!-"));
        assertArrayEquals(new String[]{"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
    }

    @Test
    public void testSplitPreserveAllTokensDefault() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[]{"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensChar() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensString() {
        assertArrayEquals(new String[]{"ab", "", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab::cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokensStringMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    // ---------- splitByCharacterType ----------
    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab de fg"));
        assertArrayEquals(new String[]{"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(new String[]{"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[]{"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // ---------- join ----------
    @Test
    public void testJoinObjectArray() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("", StringUtils.join(new Object[]{null}));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
    }

    @Test
    public void testJoinObjectArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ';'));
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
    }

    @Test
    public void testJoinObjectArrayCharRange() {
        assertNull(StringUtils.join((Object[]) null, ';', 0, 1));
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, ';', 1, 1));
    }

    @Test
    public void testJoinObjectArrayString() {
        assertNull(StringUtils.join((Object[]) null, "-"));
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, (String) null));
    }

    @Test
    public void testJoinObjectArrayStringRange() {
        assertEquals("", StringUtils.join(new Object[]{"a"}, "-", 0, 0));
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
        two.add("b");
        assertEquals("a-b", StringUtils.join(two.iterator(), "-"));
        assertEquals("ab", StringUtils.join(two.iterator(), (String) null));
    }

    @Test
    public void testJoinIterableChar() {
        assertNull(StringUtils.join((Iterable<?>) null, ';'));
        List<String> two = new ArrayList<String>();
        two.add("a");
        two.add("b");
        assertEquals("a;b", StringUtils.join((Iterable<?>) two, ';'));
    }

    @Test
    public void testJoinIterableString() {
        assertNull(StringUtils.join((Iterable<?>) null, "-"));
        List<String> two = new ArrayList<String>();
        two.add("a");
        two.add("b");
        assertEquals("a-b", StringUtils.join((Iterable<?>) two, "-"));
    }

    // ---------- deleteWhitespace ----------
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    // ---------- removeStart/End ----------
    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "www."));
        assertEquals("", StringUtils.removeStart("", "www."));
        assertEquals("www.d", StringUtils.removeStart("www.d", null));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, ".com"));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
    }

    // ---------- remove ----------
    @Test
    public void testRemoveString() {
        assertNull(StringUtils.remove(null, "ue"));
        assertEquals("", StringUtils.remove("", "ue"));
        assertEquals("queued", StringUtils.remove("queued", (String) null));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testRemoveChar() {
        assertNull(StringUtils.remove(null, 'u'));
        assertEquals("", StringUtils.remove("", 'u'));
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // ---------- replace ----------
    @Test
    public void testReplaceOnce() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("any", StringUtils.replace("any", null, "b"));
        assertEquals("any", StringUtils.replace("any", "a", null));
        assertEquals("any", StringUtils.replace("any", "", "b"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplaceWithMax() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
        assertEquals("abaa", StringUtils.replace("abaa", "x", "z", -1)); // not found path
    }

    // ---------- replaceEach / replaceEachRepeatedly ----------
    @Test
    public void testReplaceEach() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
        assertEquals("aba", StringUtils.replaceEach("aba", null, null));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], null));
        assertEquals("b", StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}));
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}));
        assertEquals("dcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachMismatchedArrayLength() {
        StringUtils.replaceEach("abc", new String[]{"a"}, new String[]{"b", "c"});
    }

    @Test
    public void testReplaceEachRepeatedly() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachRepeatedlyEndlessLoop() {
        StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"});
    }

    // ---------- replaceChars ----------
    @Test
    public void testReplaceCharsCharChar() {
        assertNull(StringUtils.replaceChars(null, 'b', 'y'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testReplaceCharsStringString() {
        assertNull(StringUtils.replaceChars(null, "bc", "yz"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "yz"));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    // ---------- overlay ----------
    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "x", 0, 0));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2)); // start>end swap
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4)); // start<0
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8)); // end>len
    }

    // ---------- chomp / chop ----------
    @Test
    public void testChomp() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("", StringUtils.chomp("\r"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
        assertEquals("abc", StringUtils.chomp("abc"));
    }

    @Test
    public void testChompSeparator() {
        assertNull(StringUtils.chomp(null, "x"));
        assertEquals("", StringUtils.chomp("", "x"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("foo", StringUtils.chomp("foo", null) == null ? null : StringUtils.chomp("foo", null));
    }

    @Test
    public void testChop() {
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("abc ", StringUtils.chop("abc \r"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("ab", StringUtils.chop("abc"));
    }

    // ---------- repeat ----------
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 0));
        assertEquals("", StringUtils.repeat("a", -2));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("abcabc", StringUtils.repeat("abc", 2));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertNull(StringUtils.repeat(null, "x", 2));
        assertEquals("", StringUtils.repeat("", null, 0) == null ? null : StringUtils.repeat("", null, 0));
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    // ---------- rightPad / leftPad ----------
    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 3));
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPadChar() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
        assertEquals("bat", StringUtils.rightPad("bat", 1, 'z'));
    }

    @Test
    public void testRightPadString() {
        assertNull(StringUtils.rightPad(null, 3, "z"));
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, (String) null));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }

    @Test
    public void testLeftPad() {
        assertNull(StringUtils.leftPad(null, 3));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
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
    }

    // ---------- center ----------
    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenterChar() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenterString() {
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("  abc  ", StringUtils.center("abc", 7, (String) null));
    }

    // ---------- upperCase / lowerCase ----------
    @Test
    public void testUpperCase() {
        assertNull(StringUtils.upperCase(null));
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

    // ---------- capitalize / uncapitalize / swapCase ----------
    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Cat", StringUtils.capitalize("cat"));
    }

    @Test
    public void testUncapitalize() {
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
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
        assertEquals(0, StringUtils.countMatches("abba", null));
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }

    // ---------- char tests ----------
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
        assertTrue(StringUtils.isAlphaSpace("ab c"));
        assertFalse(StringUtils.isAlphaSpace("ab2c"));
    }

    @Test
    public void testIsAlphanumeric() {
        assertFalse(StringUtils.isAlphanumeric(null));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
        assertFalse(StringUtils.isAlphanumeric("ab c"));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace("ab c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc"));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric(null));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("ab2c"));
    }

    @Test
    public void testIsWhitespace() {
        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace("  "));
        assertFalse(StringUtils.isWhitespace("abc"));
    }

    @Test
    public void testIsAllLowerCase() {
        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
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
    public void testDefaultStringWithDefault() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
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
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateOffset() {
        assertNull(StringUtils.abbreviate(null, 2, 10));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...ghij...", StringUtils.abbreviate("abcdefghijklmno", 6, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateOffsetTooSmallWidth() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
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
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("", StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifferenceTwo() {
        assertEquals(-1, StringUtils.indexOfDifference((CharSequence) "abc", (CharSequence) "abc"));
        assertEquals(0, StringUtils.indexOfDifference((CharSequence) null, (CharSequence) "abc"));
        assertEquals(2, StringUtils.indexOfDifference((CharSequence) "ab", (CharSequence) "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceArray() {
        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[]{}));
        assertEquals(-1, StringUtils.indexOfDifference(new CharSequence[]{"abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new CharSequence[]{"", "abc"}));
        assertEquals(7, StringUtils.indexOfDifference(new CharSequence[]{"i am a machine", "i am a robot"}));
        assertEquals(2, StringUtils.indexOfDifference(new CharSequence[]{"abcde", "abxyz"}));
    }

    // ---------- getCommonPrefix ----------
    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc", "abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abcde", "xyz"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"abcde", "abxyz"}));
    }

    // ---------- getLevenshteinDistance ----------
    @Test
    public void testGetLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
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
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{""}));
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{"abc"}));
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{null, "xyz", "abc"}));
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
