package org.apache.commons.lang3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import static org.junit.Assert.*;

public class StringUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new StringUtils());
    }

    // -----------------------------------------------------------------------
    // Empty & Blank Tests
    // -----------------------------------------------------------------------
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
        assertFalse(StringUtils.isNotBlank("   "));
        assertTrue(StringUtils.isNotBlank("  bob   "));
    }

    // -----------------------------------------------------------------------
    // Trim & Strip Tests
    // -----------------------------------------------------------------------
    @Test
    public void testTrimFamily() {
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
    public void testStripFamily() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("abc", StringUtils.strip("yyyabcyyy", "y"));

        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull("   "));
        assertEquals("abc", StringUtils.stripToNull("  abc  "));

        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));

        assertNull(StringUtils.stripStart(null, "a"));
        assertEquals("", StringUtils.stripStart("", "a"));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc", StringUtils.stripStart("yyyabc", "y"));

        assertNull(StringUtils.stripEnd(null, "a"));
        assertEquals("", StringUtils.stripEnd("", "a"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("abc", StringUtils.stripEnd("abcyyy", "y"));

        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[]{"abc", null, "def"},
                StringUtils.stripAll(new String[]{"  abc ", null, " def\t"}));
        assertArrayEquals(new String[]{"abc", "def"},
                StringUtils.stripAll(new String[]{"yyabcyy", "zdefz"}, "yz"));

        assertNull(StringUtils.stripAccents(null));
        assertEquals("", StringUtils.stripAccents(""));
        assertEquals("eclair", StringUtils.stripAccents("éclair"));
    }

    // -----------------------------------------------------------------------
    // Equals Tests
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
    // IndexOf / LastIndexOf Tests
    // -----------------------------------------------------------------------
    @Test
    public void testIndexOfAndLastIndexOf() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(1, StringUtils.indexOf("aabaa", 'b'));
        assertEquals(1, StringUtils.indexOf("aabaa", 'b', 0));
        assertEquals(-1, StringUtils.indexOf("aabaa", 'b', 2));
        assertEquals(1, StringUtils.indexOf("aabaa", 'b', -1));

        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("a", (String) null));
        assertEquals(0, StringUtils.indexOf("", ""));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
        assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));

        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaa", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaa", "a", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaa", "a", 10));

        assertEquals(-1, StringUtils.indexOfIgnoreCase(null, "A"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("a", null));
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaa", "A", -1));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaa", "B", 0));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaa", "B", 10));

        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));

        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", (String) null));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b"));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b", 4));

        assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("a", "a", 0));
        assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1));
        assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));

        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "A"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("a", null));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 4));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
    }

    // -----------------------------------------------------------------------
    // Contains Tests
    // -----------------------------------------------------------------------
    @Test
    public void testContainsFamily() {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("abc", 'a'));
        assertFalse(StringUtils.contains("abc", 'z'));

        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("a", null));
        assertTrue(StringUtils.contains("abc", "bc"));
        assertFalse(StringUtils.contains("abc", "d"));

        assertFalse(StringUtils.containsIgnoreCase(null, "A"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "D"));

        assertFalse(StringUtils.containsWhitespace(null));
        assertFalse(StringUtils.containsWhitespace(""));
        assertTrue(StringUtils.containsWhitespace("a b"));
        assertFalse(StringUtils.containsWhitespace("abc"));
    }

    // -----------------------------------------------------------------------
    // IndexOfAny / ContainsAny / ContainsOnly / ContainsNone
    // -----------------------------------------------------------------------
    @Test
    public void testAnyAndNoneOperations() {
        assertEquals(-1, StringUtils.indexOfAny(null, 'a', 'b'));
        assertEquals(-1, StringUtils.indexOfAny("", 'a', 'b'));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", 'z', 'a'));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", 'b', 'y'));

        assertEquals(-1, StringUtils.indexOfAny(null, "ab"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String) null));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));

        assertFalse(StringUtils.containsAny(null, 'a'));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'a'));
        assertFalse(StringUtils.containsAny("aba", 'z'));

        assertFalse(StringUtils.containsAny(null, "a"));
        assertFalse(StringUtils.containsAny("abc", (CharSequence) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));

        assertEquals(-1, StringUtils.indexOfAnyBut(null, 'a'));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", new char[0]));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", 'z', 'a'));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", 'a', 'b'));

        assertEquals(-1, StringUtils.indexOfAnyBut(null, "a"));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (CharSequence) null));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", ""));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));

        assertFalse(StringUtils.containsOnly(null, 'a'));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", 'a'));
        assertFalse(StringUtils.containsOnly("abc", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", 'a', 'b'));
        assertFalse(StringUtils.containsOnly("ab1", 'a', 'b'));

        assertFalse(StringUtils.containsOnly(null, "a"));
        assertFalse(StringUtils.containsOnly("a", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
        assertFalse(StringUtils.containsOnly("ab1", "abc"));

        assertTrue(StringUtils.containsNone(null, 'a'));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("", 'a'));
        assertTrue(StringUtils.containsNone("abab", 'x', 'y'));
        assertFalse(StringUtils.containsNone("abz", 'x', 'z'));

        assertTrue(StringUtils.containsNone(null, "a"));
        assertTrue(StringUtils.containsNone("abc", (String) null));
        assertTrue(StringUtils.containsNone("abab", "xyz"));
        assertFalse(StringUtils.containsNone("abz", "xyz"));

        assertEquals(-1, StringUtils.indexOfAny(null, "a", "b"));
        assertEquals(-1, StringUtils.indexOfAny("abc", (CharSequence[]) null));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", null, "ab", "cd"));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", ""));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", "mn", "op"));

        assertEquals(-1, StringUtils.lastIndexOfAny(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", (CharSequence[]) null));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", null, "ab", "cd"));
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", ""));
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", "mn"));
    }

    // -----------------------------------------------------------------------
    // Substring & SubstringsBetween Tests
    // -----------------------------------------------------------------------
    @Test
    public void testSubstringFamily() {
        assertNull(StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 4));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));

        assertNull(StringUtils.substring(null, 0, 1));
        assertEquals("", StringUtils.substring("", 0, 1));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("", StringUtils.substring("abc", 2, 0));
        assertEquals("c", StringUtils.substring("abc", 2, 4));
        assertEquals("", StringUtils.substring("abc", 4, 6));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));

        assertNull(StringUtils.left(null, 1));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("", StringUtils.left("", 1));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("abc", StringUtils.left("abc", 5));

        assertNull(StringUtils.right(null, 1));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("", StringUtils.right("", 1));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("abc", StringUtils.right("abc", 5));

        assertNull(StringUtils.mid(null, 0, 1));
        assertEquals("", StringUtils.mid("abc", 0, -1));
        assertEquals("", StringUtils.mid("", 0, 1));
        assertEquals("", StringUtils.mid("abc", 5, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("bc", StringUtils.mid("abc", 1, 4));
        assertEquals("b", StringUtils.mid("abc", 1, 1));

        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("abc", StringUtils.substringBefore("abc", "z"));

        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals("", StringUtils.substringAfter("abc", null));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "z"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));

        assertNull(StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", "z"));

        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("", StringUtils.substringAfterLast("abc", null));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));

        assertNull(StringUtils.substringBetween(null, "tag"));
        assertNull(StringUtils.substringBetween("abc", null));
        assertEquals("bc", StringUtils.substringBetween("abcta", "a"));

        assertNull(StringUtils.substringBetween(null, "[", "]"));
        assertNull(StringUtils.substringBetween("abc", null, "]"));
        assertNull(StringUtils.substringBetween("abc", "[", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween("abc", "[", "]"));

        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
        assertNull(StringUtils.substringsBetween("abc", "", "]"));
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[]{"a", "b", "c"},
                StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    // -----------------------------------------------------------------------
    // Split Tests
    // -----------------------------------------------------------------------
    @Test
    public void testSplitFamily() {
        assertNull(StringUtils.split(null));
        assertArrayEquals(new String[0], StringUtils.split(""));
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("  abc   def  "));

        assertNull(StringUtils.split(null, '.'));
        assertArrayEquals(new String[0], StringUtils.split("", '.'));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a..b.c", '.'));

        assertNull(StringUtils.split(null, " "));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c", (String) null));
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a:b:c", ":"));
        assertArrayEquals(new String[]{"a", "b,c"}, StringUtils.split("a:b,c", ":,", 2));

        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
        assertArrayEquals(new String[]{"", "abc", "", "def", ""},
                StringUtils.splitPreserveAllTokens(" abc  def "));
        assertArrayEquals(new String[]{"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a..b.c", '.'));
        assertArrayEquals(new String[]{"a", "", "b:c"},
                StringUtils.splitPreserveAllTokens("a::b:c", ":", 3));

        assertNull(StringUtils.splitByWholeSeparator(null, "-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "-"));
        assertArrayEquals(new String[]{"ab", "de", "fg"},
                StringUtils.splitByWholeSeparator("ab  de fg", null));
        assertArrayEquals(new String[]{"ab", "cd", "ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
        assertArrayEquals(new String[]{"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));

        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "-"));
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparatorPreserveAllTokens("", "-"));
        assertArrayEquals(new String[]{"ab", "", "cd", "ef"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-!-!-cd-!-ef", "-!-"));
        assertArrayEquals(new String[]{"ab", "!-cd-!-ef"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-!-!-cd-!-ef", "-!-", 2));

        assertNull(StringUtils.splitByCharacterType(null));
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
        assertArrayEquals(new String[]{"foo", "200", "B", "ar"},
                StringUtils.splitByCharacterType("foo200Bar"));
        assertArrayEquals(new String[]{"foo", "200", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
        assertArrayEquals(new String[]{"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // -----------------------------------------------------------------------
    // Join Tests (Targeting Defects4J Lang-20 Edge Cases)
    // -----------------------------------------------------------------------
    @Test
    public void testJoinVarargsAndArrays() {
        assertNull(StringUtils.join((Object[]) null));
        assertEquals("", StringUtils.join(new Object[0]));
        assertEquals("", StringUtils.join(new Object[]{null}));
        assertEquals("abc", StringUtils.join("a", "b", "c"));
        assertEquals("a", StringUtils.join(null, "", "a"));

        assertNull(StringUtils.join((Object[]) null, ','));
        assertEquals("", StringUtils.join(new Object[0], ','));
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
        assertEquals("a,b,c", StringUtils.join(new Object[]{"a", "b", "c"}, ','));
        assertEquals("b,c", StringUtils.join(new Object[]{"a", "b", "c"}, ',', 1, 3));
        assertEquals("", StringUtils.join(new Object[]{"a", "b", "c"}, ',', 2, 1));

        assertNull(StringUtils.join((Object[]) null, ","));
        assertEquals("", StringUtils.join(new Object[0], ","));
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ";"));

        // Boundary edge case: array starting with null element and non-null separator
        assertEquals("null-separator-safe",
                StringUtils.join(new Object[]{null, "bar", "baz"}, ", "), ", bar, baz");
        assertEquals("null-element-only",
                StringUtils.join(new Object[]{null, null}, ", "), ", ");
    }

    @Test
    public void testJoinIterablesAndIterators() {
        assertNull(StringUtils.join((Iterator<?>) null, ','));
        assertEquals("", StringUtils.join(Collections.emptyIterator(), ','));
        assertEquals("foo", StringUtils.join(Collections.singletonList("foo").iterator(), ','));
        assertEquals("foo,bar", StringUtils.join(Arrays.asList("foo", "bar").iterator(), ','));
        assertEquals(",bar", StringUtils.join(Arrays.asList(null, "bar").iterator(), ','));

        assertNull(StringUtils.join((Iterator<?>) null, ","));
        assertEquals("", StringUtils.join(Collections.emptyIterator(), ","));
        assertEquals("foo", StringUtils.join(Collections.singletonList("foo").iterator(), ","));
        assertEquals("foo--bar", StringUtils.join(Arrays.asList("foo", "bar").iterator(), "--"));
        assertEquals("foobar", StringUtils.join(Arrays.asList("foo", "bar").iterator(), null));

        assertNull(StringUtils.join((Iterable<?>) null, ','));
        assertEquals("foo,bar", StringUtils.join(Arrays.asList("foo", "bar"), ','));
        assertNull(StringUtils.join((Iterable<?>) null, ","));
        assertEquals("foo,bar", StringUtils.join(Arrays.asList("foo", "bar"), ","));
    }

    // -----------------------------------------------------------------------
    // Delete & Remove Tests
    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAndRemoveFamily() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));

        assertNull(StringUtils.removeStart(null, "a"));
        assertEquals("", StringUtils.removeStart("", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));

        assertNull(StringUtils.removeStartIgnoreCase(null, "a"));
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));

        assertNull(StringUtils.removeEnd(null, "a"));
        assertEquals("", StringUtils.removeEnd("", "a"));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));

        assertNull(StringUtils.removeEndIgnoreCase(null, "a"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));

        assertNull(StringUtils.remove(null, "a"));
        assertEquals("", StringUtils.remove("", "a"));
        assertEquals("abc", StringUtils.remove("abc", null));
        assertEquals("abc", StringUtils.remove("abc", ""));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        assertEquals("queued", StringUtils.remove("queued", "zz"));

        assertNull(StringUtils.remove(null, 'a'));
        assertEquals("", StringUtils.remove("", 'a'));
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // -----------------------------------------------------------------------
    // Replace Tests
    // -----------------------------------------------------------------------
    @Test
    public void testReplaceFamily() {
        assertNull(StringUtils.replaceOnce(null, "a", "b"));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));

        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("", StringUtils.replace("", "a", "b"));
        assertEquals("any", StringUtils.replace("any", null, "b"));
        assertEquals("any", StringUtils.replace("any", "a", null));
        assertEquals("any", StringUtils.replace("any", "", "b"));
        assertEquals("any", StringUtils.replace("any", "a", "b", 0));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));

        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}));
        assertEquals("aba", StringUtils.replaceEach("aba", null, null));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[0]));
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}));

        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));

        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));

        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", null, "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", "b"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachLengthMismatch() {
        StringUtils.replaceEach("abc", new String[]{"a"}, new String[]{"b", "c"});
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachRepeatedlyLoop() {
        StringUtils.replaceEachRepeatedly("abc", new String[]{"a", "b"}, new String[]{"b", "a"});
    }

    // -----------------------------------------------------------------------
    // Overlay / Chomp / Chop Tests
    // -----------------------------------------------------------------------
    @Test
    public void testOverlayAndChompAndChop() {
        assertNull(StringUtils.overlay(null, "a", 0, 1));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));

        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r"));
        assertEquals("", StringUtils.chomp("\r\n"));
        assertEquals("abc", StringUtils.chomp("abc"));

        assertNull(StringUtils.chomp(null, "a"));
        assertEquals("", StringUtils.chomp("", "a"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("foo", StringUtils.chomp("foo", null));

        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("abc", StringUtils.chop("abc\n"));
    }

    // -----------------------------------------------------------------------
    // Repeat / Pad / Center Tests
    // -----------------------------------------------------------------------
    @Test
    public void testRepeatAndPadding() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("abc", -1));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("abcabc", StringUtils.repeat("abc", 2));

        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
        assertEquals("aaa", StringUtils.repeat("a", null, 3));
        assertNull(StringUtils.repeat(null, ", ", 3));

        assertEquals("eee", StringUtils.repeat('e', 3));
        assertEquals("", StringUtils.repeat('e', -1));

        assertNull(StringUtils.rightPad(null, 5));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
        assertEquals("bat", StringUtils.rightPad("bat", 1));
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, (String) null));

        assertNull(StringUtils.leftPad(null, 5));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
        assertEquals("bat", StringUtils.leftPad("bat", 1));
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, (String) null));

        assertEquals(0, StringUtils.length(null));
        assertEquals(3, StringUtils.length("abc"));

        assertNull(StringUtils.center(null, 4));
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        assertEquals("  abc  ", StringUtils.center("abc", 7, (String) null));
    }

    // -----------------------------------------------------------------------
    // Case Conversion Tests
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
    // CountMatches & Character Tests
    // -----------------------------------------------------------------------
    @Test
    public void testCountMatchesAndCharTests() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
        assertEquals(0, StringUtils.countMatches("abc", null));
        assertEquals(0, StringUtils.countMatches("abc", ""));
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));

        assertFalse(StringUtils.isAlpha(null));
        assertFalse(StringUtils.isAlpha(""));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab2c"));

        assertFalse(StringUtils.isAlphaSpace(null));
        assertTrue(StringUtils.isAlphaSpace(""));
        assertTrue(StringUtils.isAlphaSpace("ab c"));
        assertFalse(StringUtils.isAlphaSpace("ab2c"));

        assertFalse(StringUtils.isAlphanumeric(null));
        assertFalse(StringUtils.isAlphanumeric(""));
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
        assertFalse(StringUtils.isAlphanumeric("ab-c"));

        assertFalse(StringUtils.isAlphanumericSpace(null));
        assertTrue(StringUtils.isAlphanumericSpace(""));
        assertTrue(StringUtils.isAlphanumericSpace("ab 2c"));
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));

        assertFalse(StringUtils.isAsciiPrintable(null));
        assertTrue(StringUtils.isAsciiPrintable(""));
        assertTrue(StringUtils.isAsciiPrintable("ab2c !~"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));

        assertFalse(StringUtils.isNumeric(null));
        assertFalse(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12 3"));

        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace(""));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("12a"));

        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace(""));
        assertTrue(StringUtils.isWhitespace(" \t \n "));
        assertFalse(StringUtils.isWhitespace(" a "));

        assertFalse(StringUtils.isAllLowerCase(null));
        assertFalse(StringUtils.isAllLowerCase(""));
        assertTrue(StringUtils.isAllLowerCase("abc"));
        assertFalse(StringUtils.isAllLowerCase("abC"));

        assertFalse(StringUtils.isAllUpperCase(null));
        assertFalse(StringUtils.isAllUpperCase(""));
        assertTrue(StringUtils.isAllUpperCase("ABC"));
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    // -----------------------------------------------------------------------
    // Defaults / Reversing / Abbreviate Tests
    // -----------------------------------------------------------------------
    @Test
    public void testDefaultsAndReverse() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("abc", StringUtils.defaultString("abc"));
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("abc", StringUtils.defaultString("abc", "default"));

        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("   ", "default"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "default"));

        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals("   ", StringUtils.defaultIfEmpty("   ", "default"));

        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("tab", StringUtils.reverse("bat"));

        assertNull(StringUtils.reverseDelimited(null, '.'));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void testAbbreviateFamily() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));

        assertNull(StringUtils.abbreviateMiddle(null, ".", 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 3));
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateInvalidWidth() {
        StringUtils.abbreviate("abcdefghij", 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateInvalidOffsetWidth() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    // -----------------------------------------------------------------------
    // Difference / CommonPrefix / Levenshtein Distance
    // -----------------------------------------------------------------------
    @Test
    public void testDifferenceAndCommonPrefix() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("abc", StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));

        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(0, StringUtils.indexOfDifference(null, "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", null));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));

        assertEquals(-1, StringUtils.indexOfDifference((CharSequence[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"", null}));
        assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
        assertEquals(1, StringUtils.indexOfDifference("abc", "a"));

        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{}));
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
        assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
        assertEquals("", StringUtils.getCommonPrefix("abc", "xyz"));
    }

    @Test
    public void testLevenshteinDistance() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));

        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 7));
        assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo", 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinNullInput() {
        StringUtils.getLevenshteinDistance(null, "abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinNegativeThreshold() {
        StringUtils.getLevenshteinDistance("abc", "def", -1);
    }

    // -----------------------------------------------------------------------
    // StartsWith / EndsWith / NormalizeSpace Tests
    // -----------------------------------------------------------------------
    @Test
    public void testStartsAndEndsWithAndNormalize() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "abc"));
        assertFalse(StringUtils.startsWith("abcdef", null));
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));

        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));

        assertFalse(StringUtils.startsWithAny(null, "abc"));
        assertFalse(StringUtils.startsWithAny("abcxyz", (CharSequence[]) null));
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[0]));
        assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
        assertFalse(StringUtils.startsWithAny("abcxyz", "def", "xyz"));

        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "def"));
        assertFalse(StringUtils.endsWith("abcdef", null));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));

        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));

        assertFalse(StringUtils.endsWithAny(null, "def"));
        assertFalse(StringUtils.endsWithAny("abcxyz", (CharSequence[]) null));
        assertFalse(StringUtils.endsWithAny("abcxyz", new String[0]));
        assertTrue(StringUtils.endsWithAny("abcxyz", null, "abc", "xyz"));
        assertFalse(StringUtils.endsWithAny("abcxyz", "def", "mno"));

        assertNull(StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("a b c", StringUtils.normalizeSpace("  a \t \r\n b   c  "));
    }
}