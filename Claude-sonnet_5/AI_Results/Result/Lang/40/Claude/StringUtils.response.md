# StringUtilsTest.java

```java
package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class StringUtilsTest {

    // ---------- isEmpty / isNotEmpty / isBlank / isNotBlank ----------
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
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank("  "));
        assertTrue(StringUtils.isNotBlank("bob"));
    }

    // ---------- trim ----------
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("     "));
        assertEquals("abc", StringUtils.trim("abc"));
        assertEquals("abc", StringUtils.trim("   abc   "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("    "));
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
        assertEquals("abc", StringUtils.strip("abc"));
        assertEquals("abc", StringUtils.strip("  abc"));
        assertEquals("abc", StringUtils.strip("abc  "));
        assertEquals("abc", StringUtils.strip(" abc "));
        assertEquals("ab c", StringUtils.strip(" ab c "));
    }

    @Test
    public void testStripWithChars() {
        assertNull(StringUtils.strip(null, "xyz"));
        assertEquals("", StringUtils.strip("", "xyz"));
        assertEquals("abc", StringUtils.strip("abc", null));
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty(" abc "));
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
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertArrayEquals(new String[]{}, StringUtils.stripAll(new String[]{}));
        assertArrayEquals(new String[]{"abc", "abc"}, StringUtils.stripAll(new String[]{"abc", "  abc"}));
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"abc  ", null}));
    }

    @Test
    public void testStripAllWithChars() {
        assertNull(StringUtils.stripAll(null, "xyz"));
        assertArrayEquals(new String[]{"abc  ", null}, StringUtils.stripAll(new String[]{"abc  ", null}, "yz"));
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"yabcz", null}, "yz"));
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
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    // ---------- indexOf ----------
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
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testIndexOfString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", null));
        assertEquals(0, StringUtils.indexOf("", ""));
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 10));
    }

    @Test
    public void testIndexOfStringStart() {
        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("a", null, 0));
        assertEquals(0, StringUtils.indexOf("", "", 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOf("abc", "", 9));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
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
    public void testLastIndexOfCharStart() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'b', 8));
        assertEquals(-1, StringUtils.lastIndexOf("", 'b', 8));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", null));
        assertEquals(0, StringUtils.lastIndexOf("", ""));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
        assertEquals(1, StringUtils.lastIndexOf("aabaabaa", "ab"));
    }

    @Test
    public void testLastIndexOfStringStart() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 8));
        assertEquals(-1, StringUtils.lastIndexOf("a", null, 8));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", -1));
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
        assertTrue(StringUtils.contains("abc", "a"));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    // ---------- indexOfAny / containsAny / indexOfAnyBut (chars) ----------
    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAny(null, (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("", new char[]{'a'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[]{}));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[]{'b', 'y'}));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[]{'z'}));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((String) null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("", "za"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", ""));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAny("aba", "z"));
    }

    @Test
    public void testContainsAnyChars() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
        assertFalse(StringUtils.containsAny("", new char[]{'a'}));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[]{}));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertFalse(StringUtils.containsAny("aba", new char[]{'z'}));
    }

    @Test
    public void testContainsAnyString() {
        assertFalse(StringUtils.containsAny("abc", (String) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertFalse(StringUtils.containsAny("aba", "z"));
    }

    @Test
    public void testIndexOfAnyButChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[]{'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("", new char[]{'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", new char[]{}));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[]{'z', 'a', 'b'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[]{'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyButString() {
        assertEquals(-1, StringUtils.indexOfAnyBut((String) null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (String) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", ""));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    // ---------- containsOnly / containsNone ----------
    @Test
    public void testContainsOnlyChars() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("ab", new char[]{}));
        assertTrue(StringUtils.containsOnly("abab", "abc".toCharArray()));
        assertFalse(StringUtils.containsOnly("ab1", "abc".toCharArray()));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("", "abc"));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
        assertFalse(StringUtils.containsOnly("abz", "abc"));
    }

    @Test
    public void testContainsNoneChars() {
        assertTrue(StringUtils.containsNone(null, new char[]{'a'}));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("", new char[]{'a'}));
        assertTrue(StringUtils.containsNone("abab", "xyz".toCharArray()));
        assertFalse(StringUtils.containsNone("abz", "xyz".toCharArray()));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
        assertTrue(StringUtils.containsNone("abc", (String) null));
        assertTrue(StringUtils.containsNone("abab", "xyz"));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // ---------- indexOfAny / lastIndexOfAny (String[]) ----------
    @Test
    public void testIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[]{}));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new String[]{null, ""}));
    }

    @Test
    public void testLastIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{null, "mn"}));
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"mn", ""}));
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
        assertEquals("", StringUtils.substring("abc", 4, 6));
        assertEquals("", StringUtils.substring("abc", 2, 2));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    // ---------- left / right / mid ----------
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

    // ---------- substringBefore/After/BeforeLast/AfterLast ----------
    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }

    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "b"));
        assertEquals("", StringUtils.substringBeforeLast("", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
        assertEquals("", StringUtils.substringAfterLast("", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
    }

    // ---------- substringBetween / substringsBetween ----------
    @Test
    public void testSubstringBetweenTag() {
        assertNull(StringUtils.substringBetween(null, "tag"));
        assertEquals("", StringUtils.substringBetween("", ""));
        assertNull(StringUtils.substringBetween("", "tag"));
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
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("a", null, "]"));
        assertNull(StringUtils.substringsBetween("a", "", "]"));
        assertArrayEquals(new String[]{}, StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    // ---------- split family ----------
    @Test
    public void testSplitNoArgs() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[]{}, StringUtils.split(""));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def"));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc  def"));
        assertArrayEquals(new String[]{"abc"}, StringUtils.split(" abc "));
    }

    @Test
    public void testSplitChar() {
        assertNull(StringUtils.split(null, '.'));
        assertArrayEquals(new String[]{}, StringUtils.split("", '.'));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplitStringChars() {
        assertNull(StringUtils.split(null, " "));
        assertArrayEquals(new String[]{}, StringUtils.split("", " "));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def", (String) null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitStringCharsMax() {
        assertNull(StringUtils.split(null, ":", 2));
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "-!-"));
        assertArrayEquals(new String[]{}, StringUtils.splitByWholeSeparator("", "-!-"));
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparatorMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
        assertArrayEquals(new String[]{"ab", "cd-!-ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-!-"));
        assertArrayEquals(new String[]{"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensMax() {
        assertArrayEquals(new String[]{"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitPreserveAllTokensNoArgs() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[]{}, StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[]{"abc", "", "def"}, StringUtils.splitPreserveAllTokens("abc  def"));
        assertArrayEquals(new String[]{"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensChar() {
        assertNull(StringUtils.splitPreserveAllTokens(null, '.'));
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.splitPreserveAllTokens("a:b:c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensStringChars() {
        assertArrayEquals(new String[]{"ab", "cd", "ef", ""}, StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":"));
    }

    @Test
    public void testSplitPreserveAllTokensStringCharsMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[]{}, StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterType("number5"));
        assertArrayEquals(new String[]{"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[]{"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[]{"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // ---------- join family ----------
    @Test
    public void testJoinObjectArray() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[]{}));
        assertEquals("", StringUtils.join(new Object[]{null}));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
    }

    @Test
    public void testJoinObjectArrayChar() {
        assertNull(StringUtils.join((Object[]) null, ';'));
        assertEquals("", StringUtils.join(new Object[]{}, ';'));
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
    }

    @Test
    public void testJoinObjectArrayCharStartEnd() {
        assertNull(StringUtils.join((Object[]) null, ';', 0, 1));
        assertEquals("b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';', 1, 3));
        assertEquals("", StringUtils.join(new Object[]{"a", "b", "c"}, ';', 2, 1));
    }

    @Test
    public void testJoinObjectArrayString() {
        assertNull(StringUtils.join((Object[]) null, "--"));
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, (String) null));
    }

    @Test
    public void testJoinObjectArrayStringStartEnd() {
        assertNull(StringUtils.join((Object[]) null, "--", 0, 1));
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, "--", 1, 1));
    }

    @Test
    public void testJoinIteratorChar() {
        assertNull(StringUtils.join((Iterator<?>) null, ';'));
        List<String> empty = new ArrayList<String>();
        assertEquals("", StringUtils.join(empty.iterator(), ';'));
        List<String> one = new ArrayList<String>();
        one.add("a");
        assertEquals("a", StringUtils.join(one.iterator(), ';'));
        List<String> many = new ArrayList<String>();
        many.add("a"); many.add("b");
        assertEquals("a;b", StringUtils.join(many.iterator(), ';'));
    }

    @Test
    public void testJoinIteratorString() {
        assertNull(StringUtils.join((Iterator<?>) null, "--"));
        List<String> many = new ArrayList<String>();
        many.add("a"); many.add(null); many.add("b");
        assertEquals("a--" + "--b", StringUtils.join(many.iterator(), "--"));
    }

    @Test
    public void testJoinCollectionChar() {
        assertNull(StringUtils.join((java.util.Collection<?>) null, ';'));
        List<String> list = new ArrayList<String>();
        list.add("a"); list.add("b");
        assertEquals("a;b", StringUtils.join(list, ';'));
    }

    @Test
    public void testJoinCollectionString() {
        assertNull(StringUtils.join((java.util.Collection<?>) null, "--"));
        List<String> list = new ArrayList<String>();
        list.add("a"); list.add("b");
        assertEquals("a--b", StringUtils.join(list, "--"));
    }

    // ---------- deleteWhitespace ----------
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    // ---------- removeStart / removeEnd (+ ignoreCase) ----------
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
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", "www."));
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
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
    }

    // ---------- remove ----------
    @Test
    public void testRemoveString() {
        assertNull(StringUtils.remove(null, "ue"));
        assertEquals("", StringUtils.remove("", "ue"));
        assertEquals("queued", StringUtils.remove("queued", null));
        assertEquals("queued", StringUtils.remove("queued", ""));
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
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
        assertEquals("ba", StringUtils.replaceOnce("aba", "a", ""));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "z"));
        assertEquals("any", StringUtils.replace("any", null, "z"));
        assertEquals("any", StringUtils.replace("any", "a", null));
        assertEquals("any", StringUtils.replace("any", "", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplaceWithMax() {
        assertEquals("any", StringUtils.replace("any", "a", "z", 0));
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
    }

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
    public void testReplaceEachMismatchedArrays() {
        StringUtils.replaceEach("abc", new String[]{"a", "b"}, new String[]{"x"});
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
        assertEquals("", StringUtils.replaceChars("", 'b', 'y'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceCharsStringString() {
        assertNull(StringUtils.replaceChars(null, "bc", "yz"));
        assertEquals("", StringUtils.replaceChars("", "bc", "yz"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "yz"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", "yz"));
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
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    // ---------- chomp ----------
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
        assertEquals("", StringUtils.chomp("\r\n"));
        assertEquals("abcx", StringUtils.chomp("abcx"));
    }

    @Test
    public void testChompWithSeparator() {
        assertNull(StringUtils.chomp(null, "bar"));
        assertEquals("", StringUtils.chomp("", "bar"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    // ---------- chop ----------
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
    public void testRepeatStringInt() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 0));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", -2));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3));
    }

    @Test
    public void testRepeatStringSeparatorInt() {
        assertNull(StringUtils.repeat(null, "x", 2));
        assertNull(StringUtils.repeat(null, null, 2));
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    // ---------- rightPad / leftPad ----------
    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 3));
        assertEquals("   ", StringUtils.rightPad("", 3));
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPadChar() {
        assertNull(StringUtils.rightPad(null, 3, 'z'));
        assertEquals("zzz", StringUtils.rightPad("", 3, 'z'));
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
        // large pad to trigger the PAD_LIMIT branch
        String result = StringUtils.rightPad("b", 8200, 'z');
        assertEquals(8200, result.length());
    }

    @Test
    public void testRightPadString() {
        assertNull(StringUtils.rightPad(null, 5, "yz"));
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
    }

    @Test
    public void testLeftPadChar() {
        assertNull(StringUtils.leftPad(null, 3, 'z'));
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
        String result = StringUtils.leftPad("b", 8200, 'z');
        assertEquals(8200, result.length());
    }

    @Test
    public void testLeftPadString() {
        assertNull(StringUtils.leftPad(null, 5, "yz"));
        assertEquals("bat", StringUtils.leftPad("bat", 3, "yz"));
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, (String) null));
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
        assertNull(StringUtils.center(null, 4, ' '));
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
        assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
    }

    @Test
    public void testCenterString() {
        assertNull(StringUtils.center(null, 4, " "));
        assertEquals("  abc  ", StringUtils.center("abc", 7, (String) null));
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("abcd", StringUtils.center("abcd", 2, " "));
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
        assertFalse(StringUtils.isAlphanumeric("ab c"));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
    }

    @Test
    public void testIsAlphanumericSpace() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("ab c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc"));
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
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateWithOffset() {
        assertNull(StringUtils.abbreviate(null, 0, 10));
        assertEquals("", StringUtils.abbreviate("", 0, 4));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", -1, 10));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 10, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateWithOffsetTooSmallMaxWidth() {
        StringUtils.abbreviate("abcdefghij", 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateWithOffsetTooSmallMaxWidth7() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    // ---------- difference / indexOfDifference ----------
    @Test
    public void testDifference() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("", StringUtils.difference("", ""));
        assertEquals("abc", StringUtils.difference("", "abc"));
        assertEquals("", StringUtils.difference("abc", ""));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceTwoStrings() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(-1, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifferenceStringArray() {
        assertEquals(-1, StringUtils.indexOfDifference((String[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc"}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{null, null}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"", ""}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"", null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", null, null}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc", "abc"}));
        assertEquals(1, StringUtils.indexOfDifference(new String[]{"abc", "a"}));
        assertEquals(2, StringUtils.indexOfDifference(new String[]{"ab", "abxyz"}));
        assertEquals(7, StringUtils.indexOfDifference(new String[]{"i am a machine", "i am a robot"}));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{}));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, null}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", "abc"}));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc", "abc"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"ab", "abxyz"}));
        assertEquals("i am a ", StringUtils.getCommonPrefix(new String[]{"i am a machine", "i am a robot"}));
    }

    // ---------- getLevenshteinDistance ----------
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
        assertFalse(StringUtils.startsWith("ab", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithAny() {
        assertFalse(StringUtils.startsWithAny(null, null));
        assertFalse(StringUtils.startsWithAny(null, new String[]{"abc"}));
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
        assertFalse(StringUtils.endsWith("de", "def"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testIsEmpty / testIsNotEmpty | null, length==0, length>0 |
| testIsBlank / testIsNotBlank | null, empty, all-whitespace, non-blank, loop early-return |
| testTrim/testTrimToNull/testTrimToEmpty | null branch, isEmpty branch หลัง trim |
| testStrip* | isEmpty(str) ต้น method, stripChars null/empty/non-empty (stripStart/stripEnd loop ทั้ง 2 branch) |
| testStripAll* | strs null, length==0, loop iterate |
| testEquals/testEqualsIgnoreCase | str1==null ? true-path : false-path |
| testIndexOf* / testOrdinalIndexOf / testLastIndexOf* | isEmpty check, null check, do-while loop (found<ordinal), index<0 return |
| testContains* | isEmpty, null checks |
| testIndexOfAny*/testContainsAny*/testIndexOfAnyBut* | null/empty array, nested loop match/no-match, continue outer label |
| testContainsOnly*/testContainsNone* | null, length==0, valid.length==0, loop break |
| testIndexOfAnyStringArray/testLastIndexOfAnyStringArray | null entries skip (continue), tmp==-1, tmp<ret/tmp>ret |
| testSubstring* | start<0, start>len, end<0, end>len, start>end |
| testLeft/testRight/testMid | len<0, str.length<=len, pos<0, pos>len |
| testSubstringBefore/After(Last) | isEmpty, separator null/empty, pos==-1 |
| testSubstringBetween* | str/open/close null, start==-1, end==-1 |
| testSubstringsBetween | null/empty open-close, while loop start<0/end<0 break |
| testSplit* (ทุก overload) | null, len==0, separatorChars null/length==1/length>1, match/preserveAllTokens, sizePlus1==max |
| testSplitByWholeSeparator* | separator null/empty→whitespace path, end>beg, consecutive separator (preserveAllTokens true/false), numberOfSubstrings==max |
| testSplitByCharacterType(CamelCase) | type==currentType continue, camelCase branch, newTokenStart!=tokenStart |
| testJoin* | array/iterator/collection null, bufSize<=0, hasNext() true/false (first/only element), separator null |
| testDeleteWhitespace | isEmpty, count==sz (no whitespace) vs. filtered |
| testRemoveStart(IgnoreCase)/testRemoveEnd(IgnoreCase) | isEmpty, startsWith true/false |
| testRemoveString/testRemoveChar | isEmpty/indexOf==-1, found-not-found loop |
| testReplaceOnce/testReplace/testReplaceWithMax | isEmpty text/search, replacement null, max==0, end==-1, while loop, --max==0 break |
| testReplaceEach/testReplaceEachRepeatedly + exception tests | null/empty guard, timeToLive<0 (IllegalStateException), length mismatch (IllegalArgumentException), textIndex==-1 early return, repeat flag |
| testReplaceChars* | null/isEmpty, replaceChars null, index>=0/else branch, index<replaceCharsLength |
| testOverlay | str null, overlay null, start/end negative & >len, start>end swap |
| testChomp/testChompWithSeparator | isEmpty, length==1 (\r or \n), last==LF && prev==CR, last!=CR branch |
| testChop | strLen<2, last==LF && prev==CR |
| testRepeatStringInt/testRepeatStringSeparatorInt | null, repeat<=0, repeat==1||inputLength==0, inputLength==1 (padding), switch case 1/2/default |
| testRightPad*/testLeftPad* | null, pads<=0, pads>PAD_LIMIT, padLen==1, pads==padLen/pads<padLen/else |
| testLength | null vs non-null |
| testCenter* | str null/size<=0, pads<=0, padStr isEmpty |
| testUpperCase/testLowerCase(+Locale) | null check |
| testCapitalize/testUncapitalize | null/empty (strLen==0) |
| testSwapCase | isUpperCase/isTitleCase/isLowerCase branches |
| testCountMatches | isEmpty, while loop count |
| testIsAlpha*/testIsNumeric*/testIsWhitespace/testIsAllLowerCase/testIsAllUpperCase/testIsAsciiPrintable | null, empty-true, loop early-false |
| testDefaultString*/testDefaultIfEmpty | null branch vs non-null |
| testReverse/testReverseDelimited | null check |
| testAbbreviate / testAbbreviateWithOffset + exception tests | maxWidth<4 exception, str.length<=maxWidth, offset>len, offset<=4, maxWidth<7 exception, recursive branch |
| testDifference/testIndexOfDifference(Two/Array)/testGetCommonPrefix | null checks, loop break on diff, allStringsNull, shortestStrLen==0 |
| testGetLevenshteinDistance + exception tests | null→IllegalArgumentException, n==0/m==0, n>m swap |
| testStartsWith*/testEndsWith*(+Any) | null&null true, length>str.length false, regionMatches ignoreCase true/false |

**หมายเหตุ:** บางเมธอด private (เช่น `splitWorker`, `padding`, `replaceEach` core logic) ถูกทดสอบโดยอ้อมผ่าน public method ที่เรียกใช้ เนื่องจาก JUnit ไม่สามารถเรียก private method ได้ตรง ๆ และไม่ได้เดา behavior เพิ่มเติมนอกจากที่ปรากฏใน source/Javadoc examples ที่ให้มา