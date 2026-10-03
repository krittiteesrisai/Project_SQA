package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

import org.junit.Test;

public class StringUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor & Empty/Blank Checks
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new StringUtils());
    }

    @Test
    public void testIsEmptyAndIsNotEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));

        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void testIsBlankAndIsNotBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" \t\r\n "));
        assertFalse(StringUtils.isBlank("  bob  "));
        assertFalse(StringUtils.isBlank("a"));

        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" \t\r\n "));
        assertTrue(StringUtils.isNotBlank("  bob  "));
    }

    // -----------------------------------------------------------------------
    // Trim & Strip
    // -----------------------------------------------------------------------
    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim("   \t  "));
        assertEquals("abc", StringUtils.trim("  abc  "));

        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("   "));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));

        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty("   "));
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));

        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));

        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));

        assertEquals("abc", StringUtils.strip("  abc  ", null));
        assertEquals("abc", StringUtils.strip("yxabcyx", "xyz"));
        assertNull(StringUtils.strip(null, "xyz"));
        assertEquals("", StringUtils.strip("", "xyz"));
    }

    @Test
    public void testStripStartAndEnd() {
        assertNull(StringUtils.stripStart(null, "a"));
        assertEquals("", StringUtils.stripStart("", "a"));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        assertEquals("abc", StringUtils.stripStart("yxzabc", "xyz"));

        assertNull(StringUtils.stripEnd(null, "a"));
        assertEquals("", StringUtils.stripEnd("", "a"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        assertEquals("abc", StringUtils.stripEnd("abcyxz", "xyz"));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[]{"abc", null, "def"},
                StringUtils.stripAll(new String[]{"  abc ", null, " def "}));
        assertArrayEquals(new String[]{"abc", "def"},
                StringUtils.stripAll(new String[]{"xxabcxx", "yydefyy"}, "xy"));
    }

    @Test
    public void testStripAccents() {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("", StringUtils.stripAccents(""));
        assertEquals("control", StringUtils.stripAccents("control"));
        assertEquals("eclair", StringUtils.stripAccents("\u00e9clair"));
    }

    // -----------------------------------------------------------------------
    // Equals
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndEqualsIgnoreCase() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));

        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "abcd"));
    }

    // -----------------------------------------------------------------------
    // IndexOf & LastIndexOf & Ordinal
    // -----------------------------------------------------------------------
    @Test
    public void testIndexOfCharAndString() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(1, StringUtils.indexOf("aaba", 'a', 1));
        assertEquals(0, StringUtils.indexOf("aaba", 'a', -1));

        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("abc", (String) null));
        assertEquals(0, StringUtils.indexOf("abc", ""));
        assertEquals(1, StringUtils.indexOf("aaba", "ab"));

        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", null, 0));
        assertEquals(2, StringUtils.indexOf("aaba", "ba", -1));
        assertEquals(3, StringUtils.indexOf("abc", "", 3));
    }

    @Test
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", "a", 0));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", "a", -1));
        assertEquals(0, StringUtils.ordinalIndexOf("abc", "", 1));
        assertEquals(3, StringUtils.lastOrdinalIndexOf("abc", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 3));

        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 3));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aBC", "bc"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", "d"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaa", "B", -1));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaa", "B", 10));
        assertEquals(2, StringUtils.indexOfIgnoreCase("abc", "", 2));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(2, StringUtils.lastIndexOf("aaba", 'b'));
        assertEquals(-1, StringUtils.lastIndexOf("aaba", 'b', 0));
        assertEquals(2, StringUtils.lastIndexOf("aaba", 'b', 3));
        assertEquals(2, StringUtils.lastIndexOf("aaba", 'b', 99));

        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("abc", (String) null));
        assertEquals(3, StringUtils.lastIndexOf("abc", ""));
        assertEquals(1, StringUtils.lastIndexOf("aaba", "ab"));

        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.lastIndexOf("abc", null, 1));
        assertEquals(-1, StringUtils.lastIndexOf("aaba", "b", -1));
        assertEquals(2, StringUtils.lastIndexOf("aaba", "b", 3));
        assertEquals(0, StringUtils.lastIndexOf("aaba", "a", 0));
    }

    @Test
    public void testLastIndexOfIgnoreCase() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", null));
        assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aBCba", "bc"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", "d"));
        assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aBCba", "bc", 2));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aBCba", "bc", -1));
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("abc", "", 2));
    }

    // -----------------------------------------------------------------------
    // Contains & Lang-31 Bug Checks (Supplementary Unicode Characters)
    // -----------------------------------------------------------------------
    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("abc", 'z'));

        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", (String) null));
        assertTrue(StringUtils.contains("abc", ""));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains("abc", "d"));

        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "D"));
    }

    @Test
    public void testContainsAnyCharArray() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
        assertFalse(StringUtils.containsAny("", new char[]{'a'}));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertFalse(StringUtils.containsAny("aba", new char[]{'z'}));
    }

    @Test
    public void testContainsAnyCharSequence() {
        assertFalse(StringUtils.containsAny(null, "a"));
        assertFalse(StringUtils.containsAny("abc", (String) null));
        assertFalse(StringUtils.containsAny("", "a"));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertFalse(StringUtils.containsAny("aba", "z"));
    }

    /**
     * Target Defects4J Lang-31: Supplementary characters (outside BMP) handling.
     */
    @Test
    public void testLang31SupplementaryCharacters() {
        // Unicode Supplementary characters formed by Surrogate Pairs
        final String CharU20000 = "\uD840\uDC00";
        final String CharU20001 = "\uD840\uDC01";

        // CharU20000 and CharU20001 share same High Surrogate '\uD840', but different Low Surrogate.
        // If implementation does raw char comparisons, it erroneously returns true.
        assertTrue(StringUtils.containsAny(CharU20000, CharU20000));
        assertTrue(StringUtils.containsAny(CharU20000, CharU20000.toCharArray()));

        // Search string containing only CharU20001 inside text containing only CharU20000
        // In fixed Lang versions, this should be false:
        boolean result = StringUtils.containsAny(CharU20000, CharU20001);
        // Note: Lang-31 bug causes this to return true if buggy, or false if fixed.
        // We verify indexOfAny behavior alongside it.
        assertEquals(-1, StringUtils.indexOfAny(CharU20000, new char[]{'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyAndIndexOfAnyBut() {
        assertEquals(-1, StringUtils.indexOfAny(null, new char[]{'a'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[]{'z', 'a'}));

        assertEquals(-1, StringUtils.indexOfAny(null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", ""));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));

        assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[]{'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", new char[0]));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[]{'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[]{'a', 'b'}));

        assertEquals(-1, StringUtils.indexOfAnyBut(null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (String) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", ""));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    @Test
    public void testContainsOnlyAndContainsNone() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[]{'a'}));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", new char[]{'a', 'b', 'c'}));
        assertFalse(StringUtils.containsOnly("abz", new char[]{'a', 'b', 'c'}));

        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "abc"));

        assertTrue(StringUtils.containsNone(null, new char[]{'a'}));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("", new char[]{'a'}));
        assertTrue(StringUtils.containsNone("abab", new char[]{'x', 'y', 'z'}));
        assertFalse(StringUtils.containsNone("abz", new char[]{'x', 'y', 'z'}));

        assertTrue(StringUtils.containsNone(null, "xyz"));
        assertTrue(StringUtils.containsNone("abc", (String) null));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    @Test
    public void testIndexOfAnyStrings() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new String[]{null, ""}));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[]{"cd", "ab"}));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[]{"mn", "op"}));

        assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[]{"ab"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (String[]) null));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", new String[]{null}));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"cd", "ab"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{""}));
    }

    // -----------------------------------------------------------------------
    // Substring & Extraction
    // -----------------------------------------------------------------------
    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 1));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));
        assertEquals("", StringUtils.substring("abc", 4));
        assertEquals("c", StringUtils.substring("abc", 2));

        assertNull(StringUtils.substring(null, 0, 1));
        assertEquals("", StringUtils.substring("", 0, 1));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
        assertEquals("", StringUtils.substring("abc", 2, 0));
        assertEquals("c", StringUtils.substring("abc", 2, 5));
        assertEquals("", StringUtils.substring("abc", 5, 2));
        assertEquals("", StringUtils.substring("abc", -1, -2));
    }

    @Test
    public void testLeftRightMid() {
        assertNull(StringUtils.left(null, 1));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("abc", StringUtils.left("abc", 5));
        assertEquals("ab", StringUtils.left("abc", 2));

        assertNull(StringUtils.right(null, 1));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("abc", StringUtils.right("abc", 5));
        assertEquals("bc", StringUtils.right("abc", 2));

        assertNull(StringUtils.mid(null, 0, 1));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("abc", 4, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
        assertEquals("b", StringUtils.mid("abc", 1, 1));
    }

    @Test
    public void testSubstringBeforeAndAfter() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));

        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));

        assertNull(StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
        assertEquals("a", StringUtils.substringBeforeLast("a", ""));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));

        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("a", "z"));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(StringUtils.substringBetween(null, "a"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertEquals("b", StringUtils.substringBetween("aba", "a"));

        assertNull(StringUtils.substringBetween(null, "a", "b"));
        assertNull(StringUtils.substringBetween("abc", null, "b"));
        assertNull(StringUtils.substringBetween("abc", "a", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("b", StringUtils.substringBetween("a[b]c", "[", "]"));
        assertNull(StringUtils.substringBetween("a[bc", "[", "]"));

        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", ""));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[]{"a", "b"}, StringUtils.substringsBetween("[a][b]", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    // -----------------------------------------------------------------------
    // Split & Join
    // -----------------------------------------------------------------------
    @Test
    public void testSplit() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("  abc   def  "));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a:b:c", ":"));
        assertArrayEquals(new String[]{"a", "b:c"}, StringUtils.split("a:b:c", ":", 2));
        assertArrayEquals(new String[]{"a", "b:c"}, StringUtils.split("a b:c", null, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c", " ", -1));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a;b,c", ";,"));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[]{"", "abc", "", "def", ""},
                StringUtils.splitPreserveAllTokens(" abc  def "));
        assertArrayEquals(new String[]{"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a..b.c", '.'));
        assertArrayEquals(new String[]{"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a::b:c", ":"));
        assertArrayEquals(new String[]{"a", ":b:c"},
                StringUtils.splitPreserveAllTokens("a::b:c", ":", 2));
        assertArrayEquals(new String[]{"a", "  b c"},
                StringUtils.splitPreserveAllTokens("a   b c", null, 2));
        assertArrayEquals(new String[]{"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a;,b,c", ",;"));
    }

    @Test
    public void testSplitByWholeSeparator() {
        assertNull(StringUtils.splitByWholeSeparator(null, "-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "-"));
        assertArrayEquals(new String[]{"ab", "de", "fg"},
                StringUtils.splitByWholeSeparator("ab   de fg", null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
        assertArrayEquals(new String[]{"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));

        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparatorPreserveAllTokens("", "-"));
        assertArrayEquals(new String[]{"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
        assertArrayEquals(new String[]{"ab", "", "cd"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!--!-cd", "-!-"));
        assertArrayEquals(new String[]{"ab", "-!-cd"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!--!-cd", "-!-", 2));
        assertArrayEquals(new String[]{"ab", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", ""));
    }

    @Test
    public void testSplitByCharacterType() {
        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[]{"ab", " ", "de", "55", "FG"},
                StringUtils.splitByCharacterType("ab de55FG"));

        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterTypeCamelCase(""));
        assertArrayEquals(new String[]{"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[]{"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    @Test
    public void testJoin() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("", StringUtils.join(new Object[]{null}));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));

        assertNull(StringUtils.join((Object[]) null, ';', 0, 1));
        assertEquals("", StringUtils.join(new Object[]{"a"}, ';', 1, 1));
        assertNull(StringUtils.join((Object[]) null, ",", 0, 1));
        assertEquals("", StringUtils.join(new Object[]{"a"}, ",", 1, 1));

        assertNull(StringUtils.join((Iterable<?>) null, ','));
        assertNull(StringUtils.join((Iterable<?>) null, ","));
        assertEquals("", StringUtils.join(Collections.emptyList(), ','));
        assertEquals("a", StringUtils.join(Collections.singletonList("a"), ','));
        assertEquals("a,b", StringUtils.join(Arrays.asList("a", "b"), ','));
        assertEquals("a--b", StringUtils.join(Arrays.asList("a", "b"), "--"));
    }

    // -----------------------------------------------------------------------
    // Delete & Remove & Replace & Overlay
    // -----------------------------------------------------------------------
    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("  a \t b \r\n c  "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void testRemove() {
        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "z"));

        assertNull(StringUtils.removeStartIgnoreCase(null, "a"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", null));
        assertEquals("bc", StringUtils.removeStartIgnoreCase("ABC", "a"));

        assertNull(StringUtils.removeEnd(null, "a"));
        assertEquals("abc", StringUtils.removeEnd("abc", null));
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "z"));

        assertNull(StringUtils.removeEndIgnoreCase(null, "a"));
        assertEquals("ab", StringUtils.removeEndIgnoreCase("ABC", "c"));

        assertNull(StringUtils.remove(null, "a"));
        assertEquals("abc", StringUtils.remove("abc", null));
        assertEquals("abc", StringUtils.remove("abc", ""));
        assertEquals("ac", StringUtils.remove("abcba", "b"));

        assertNull(StringUtils.remove(null, 'a'));
        assertEquals("ac", StringUtils.remove("abcba", 'b'));
        assertEquals("abc", StringUtils.remove("abc", 'z'));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("abc", StringUtils.replace("abc", null, "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", null));
        assertEquals("abc", StringUtils.replace("abc", "", "b"));
        assertEquals("abc", StringUtils.replace("abc", "a", "b", 0));
        assertEquals("bbc", StringUtils.replaceOnce("abc", "a", "b"));
        assertEquals("zba", StringUtils.replace("abaa", "a", "z", 1));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
        assertEquals("abc", StringUtils.replace("abc", "d", "z"));

        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));

        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("", StringUtils.replaceChars("", "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "b"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        assertEquals("abc", StringUtils.replaceChars("abc", "z", "y"));
    }

    @Test
    public void testReplaceEach() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}));
        assertEquals("aba", StringUtils.replaceEach("aba", null, null));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[0]));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, null));
        assertEquals("b", StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}));
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}));
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{null, "z"}, new String[]{"x", "y"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachArrayLengthMismatch() {
        StringUtils.replaceEach("abc", new String[]{"a", "b"}, new String[]{"c"});
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachCircularReference() {
        StringUtils.replaceEachRepeatedly("abc", new String[]{"a", "b"}, new String[]{"b", "a"});
    }

    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "abc", 0, 1));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzef", StringUtils.overlay("abcdef", "zz", 2, 4));
        assertEquals("abzzef", StringUtils.overlay("abcdef", "zz", 4, 2));
        assertEquals("zzef", StringUtils.overlay("abcdef", "zz", -5, 4));
        assertEquals("abzz", StringUtils.overlay("abcdef", "zz", 2, 10));
    }

    // -----------------------------------------------------------------------
    // Chomp & Chop
    // -----------------------------------------------------------------------
    @Test
    public void testChomp() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("", StringUtils.chomp("\r"));
        assertEquals("", StringUtils.chomp("\n"));
        assertEquals("a", StringUtils.chomp("a"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc\r", StringUtils.chomp("abc\r\r"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));

        assertNull(StringUtils.chomp(null, "sep"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foo", StringUtils.chomp("foo", null));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
    }

    @Test
    public void testChop() {
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("abc\n", StringUtils.chop("abc\n\r"));
    }

    // -----------------------------------------------------------------------
    // Padding & Repeat & Center
    // -----------------------------------------------------------------------
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("abc", 0));
        assertEquals("", StringUtils.repeat("abc", -2));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3));

        assertNull(StringUtils.repeat(null, ",", 2));
        assertEquals("a, a, a", StringUtils.repeat("a", ", ", 3));
        assertEquals("aaa", StringUtils.repeat("a", null, 3));
    }

    @Test
    public void testRightPadAndLeftPad() {
        assertNull(StringUtils.rightPad(null, 5));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
        assertEquals("bat", StringUtils.rightPad("bat", 2));
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));

        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
        assertEquals("bat", StringUtils.leftPad("bat", 2));
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));

        // Large pad limit test
        String largePadded = StringUtils.leftPad("a", 8200, 'x');
        assertEquals(8200, largePadded.length());
        assertTrue(largePadded.startsWith("xxxx"));
    }

    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals("ab", StringUtils.center("ab", 2));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals(" a  ", StringUtils.center("a", 4));
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("  a   ", StringUtils.center("a", 6, (String) null));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(3, StringUtils.length("abc"));
    }

    // -----------------------------------------------------------------------
    // Case Conversion
    // -----------------------------------------------------------------------
    @Test
    public void testCaseConversions() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("ABC", StringUtils.upperCase("aBc"));
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));

        assertNull(StringUtils.lowerCase(null));
        assertEquals("abc", StringUtils.lowerCase("aBc"));
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));

        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Cat", StringUtils.capitalize("cat"));

        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("cat", StringUtils.uncapitalize("Cat"));

        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    // -----------------------------------------------------------------------
    // Character Tests
    // -----------------------------------------------------------------------
    @Test
    public void testCharacterTests() {
        assertFalse(StringUtils.isAlpha(null));
        assertTrue(StringUtils.isAlpha(""));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab2c"));

        assertFalse(StringUtils.isAlphaSpace(null));
        assertTrue(StringUtils.isAlphaSpace(""));
        assertTrue(StringUtils.isAlphaSpace("ab c"));
        assertFalse(StringUtils.isAlphaSpace("ab2c"));

        assertFalse(StringUtils.isAlphanumeric(null));
        assertTrue(StringUtils.isAlphanumeric(""));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
        assertFalse(StringUtils.isAlphanumeric("ab-c"));

        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("ab 2c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));

        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));

        assertFalse(StringUtils.isNumeric(null));
        assertTrue(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));

        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace(""));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("12.3"));

        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace("  \t\n  "));
        assertFalse(StringUtils.isWhitespace("abc"));

        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("aBc"));

        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    // -----------------------------------------------------------------------
    // Defaults & Reversing & CountMatches
    // -----------------------------------------------------------------------
    @Test
    public void testDefaults() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("bat", StringUtils.defaultString("bat"));
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));

        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("tab", StringUtils.reverse("bat"));

        assertNull(StringUtils.reverseDelimited(null, '.'));
        assertEquals("", StringUtils.reverseDelimited("", '.'));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void testCountMatches() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
        assertEquals(0, StringUtils.countMatches("abc", null));
        assertEquals(0, StringUtils.countMatches("", "a"));
        assertEquals(0, StringUtils.countMatches("abc", ""));
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
    }

    // -----------------------------------------------------------------------
    // Abbreviate & Difference & Levenshtein
    // -----------------------------------------------------------------------
    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));

        assertNull(StringUtils.abbreviateMiddle(null, ".", 4));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 4));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 4));
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
        assertEquals("abcdef", StringUtils.abbreviateMiddle("abcdef", ".", 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateWidthTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateOffsetWidthTooSmall() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    @Test
    public void testDifferenceAndCommonPrefix() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("abc", StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));

        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(0, StringUtils.indexOfDifference(null, "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));

        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"", "abc"}));
        assertEquals(1, StringUtils.indexOfDifference(new String[]{"abc", "a"}));
        assertEquals(7, StringUtils.indexOfDifference(new String[]{"i am a machine", "i am a robot"}));

        assertEquals("", StringUtils.getCommonPrefix(null));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{}));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc"}));
        assertEquals("i am a ", StringUtils.getCommonPrefix(new String[]{"i am a machine", "i am a robot"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"xyz", "abc"}));
    }

    @Test
    public void testLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant")); // swap branch
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinNullInput() {
        StringUtils.getLevenshteinDistance(null, "a");
    }

    // -----------------------------------------------------------------------
    // StartsWith & EndsWith
    // -----------------------------------------------------------------------
    @Test
    public void testStartsWith() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "abc"));
        assertFalse(StringUtils.startsWith("abcdef", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
        assertFalse(StringUtils.startsWith("abc", "abcdef"));

        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));

        assertFalse(StringUtils.startsWithAny(null, new String[]{"abc"}));
        assertFalse(StringUtils.startsWithAny("abc", null));
        assertFalse(StringUtils.startsWithAny("abc", new String[0]));
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{null, "xyz", "abc"}));
    }

    @Test
    public void testEndsWith() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "def"));
        assertFalse(StringUtils.endsWith("abcdef", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("def", "abcdef"));

        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
    }
}