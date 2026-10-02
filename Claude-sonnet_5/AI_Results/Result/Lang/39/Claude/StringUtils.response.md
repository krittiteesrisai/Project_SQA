以下คือชุดทดสอบ JUnit 4 สำหรับคลาส `StringUtils` (Lang-39b) ครอบคลุมเมธอดหลักและสาขาต่าง ๆ ที่วิเคราะห์ได้จากซอร์สโค้ด

```java
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
        assertTrue(StringUtils.isNotEmpty(" "));
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
        assertEquals("abc", StringUtils.strip("  abc  "));
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
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
        assertEquals("", StringUtils.stripToEmpty("   "));
        assertEquals("abc", StringUtils.stripToEmpty(" abc "));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, "xyz"));
        assertEquals("", StringUtils.stripStart("", "xyz"));
        assertEquals("abc", StringUtils.stripStart("abc", "")); // stripChars.length()==0
        assertEquals("abc", StringUtils.stripStart("  abc", null)); // null -> whitespace
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz")); // custom chars
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, "xyz"));
        assertEquals("", StringUtils.stripEnd("", "xyz"));
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertArrayEquals(new String[0], StringUtils.stripAll(new String[0]));
        assertArrayEquals(new String[] {"abc", "abc"},
                StringUtils.stripAll(new String[] {"abc", "  abc"}));
        assertArrayEquals(new String[] {"abc", null},
                StringUtils.stripAll(new String[] {"abc  ", null}));
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
    public void testIndexOfCharStart() {
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
    public void testOrdinalIndexOf() {
        assertEquals(-1, StringUtils.ordinalIndexOf(null, "a", 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", null, 1));
        assertEquals(-1, StringUtils.ordinalIndexOf("a", "a", 0));
        assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 100));
    }

    @Test
    public void testIndexOfStringStart() {
        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", null, 0));
        assertEquals(3, StringUtils.indexOf("abc", "", 9)); // startPos>=len, empty search
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
    }

    // ---------- lastIndexOf ----------
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
    }

    @Test
    public void testLastIndexOfString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", null));
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfStringStart() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 8));
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
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
        assertTrue(StringUtils.contains("abc", ""));
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    // ---------- indexOfAny / containsAny (char[]) ----------
    @Test
    public void testIndexOfAnyCharArray() {
        assertEquals(-1, StringUtils.indexOfAny(null, new char[] {'a'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (char[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[] {'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[] {'z'}));
    }

    @Test
    public void testIndexOfAnyString() {
        assertEquals(-1, StringUtils.indexOfAny((String) null, "za"));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (String) null));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
    }

    @Test
    public void testContainsAnyCharArray() {
        assertFalse(StringUtils.containsAny(null, new char[] {'a'}));
        assertFalse(StringUtils.containsAny("", new char[] {'a'}));
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[] {'z', 'a'}));
        assertFalse(StringUtils.containsAny("aba", new char[] {'z'}));
    }

    @Test
    public void testContainsAnyString() {
        assertFalse(StringUtils.containsAny("abc", (String) null));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
    }

    // ---------- indexOfAnyBut ----------
    @Test
    public void testIndexOfAnyButCharArray() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[] {'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", (char[]) null));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyButString() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (String) null));
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    // ---------- containsOnly / containsNone ----------
    @Test
    public void testContainsOnlyCharArray() {
        assertFalse(StringUtils.containsOnly(null, new char[] {'a'}));
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
        assertTrue(StringUtils.containsOnly("", new char[] {'a'}));
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
        assertTrue(StringUtils.containsOnly("abab", "abc".toCharArray()));
        assertFalse(StringUtils.containsOnly("abz", "abc".toCharArray()));
    }

    @Test
    public void testContainsOnlyString() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
        assertFalse(StringUtils.containsOnly("abc", (String) null));
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsNoneCharArray() {
        assertTrue(StringUtils.containsNone(null, new char[] {'a'}));
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
        assertTrue(StringUtils.containsNone("abab", "xyz".toCharArray()));
        assertFalse(StringUtils.containsNone("abz", "xyz".toCharArray()));
    }

    @Test
    public void testContainsNoneString() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // ---------- indexOfAny / lastIndexOfAny (String[]) ----------
    @Test
    public void testIndexOfAnyStringArray() {
        assertEquals(-1, StringUtils.indexOfAny((String) null, new String[] {"ab"}));
        assertEquals(-1, StringUtils.indexOfAny("abc", (String[]) null));
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[0]));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[] {"ab", "cd"}));
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[] {"mn", "op"}));
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new String[] {null, ""}));
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
        assertEquals("", StringUtils.mid("abc", 4, 2));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    // ---------- substringBefore / After ----------
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
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "z"));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
    }

    // ---------- substringBetween ----------
    @Test
    public void testSubstringBetween2() {
        assertNull(StringUtils.substringBetween(null, "tag"));
        assertEquals("", StringUtils.substringBetween("", ""));
        assertNull(StringUtils.substringBetween("", "tag"));
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetween3() {
        assertNull(StringUtils.substringBetween(null, "[", "]"));
        assertNull(StringUtils.substringBetween("abc", null, "]"));
        assertNull(StringUtils.substringBetween("abc", "[", null));
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
        assertNull(StringUtils.substringsBetween("[a]", null, "]"));
        assertNull(StringUtils.substringsBetween("[a]", "[", ""));
        assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, StringUtils.substringsBetween("", "[", "]"));
        assertArrayEquals(new String[] {"a", "b", "c"},
                StringUtils.substringsBetween("[a][b][c]", "[", "]"));
        assertNull(StringUtils.substringsBetween("no match", "[", "]"));
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
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
    }

    @Test
    public void testSplitStringSeparators() {
        assertNull(StringUtils.split(null, ":"));
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
        assertArrayEquals(new String[] {"abc", "def"}, StringUtils.split("abc def", (String) null));
    }

    @Test
    public void testSplitStringMax() {
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
                StringUtils.splitByWholeSeparator("ab   de fg", null)); // whitespace path
    }

    @Test
    public void testSplitByWholeSeparatorMax() {
        assertArrayEquals(new String[] {"ab", "cd-!-ef"},
                StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens() {
        assertArrayEquals(new String[] {"ab", "", "", "de", "fg"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertArrayEquals(new String[] {"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensChar() {
        assertArrayEquals(new String[] {"a", "", "b", "c"},
                StringUtils.splitPreserveAllTokens("a..b.c", '.'));
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
        assertArrayEquals(new String[] {"ab", " ", "de", " ", "fg"},
                StringUtils.splitByCharacterType("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase() {
        assertArrayEquals(new String[] {"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[] {"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // ---------- join ----------
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
        assertEquals("", StringUtils.join(new Object[] {"a", "b"}, ';', 1, 1)); // bufSize<=0
    }

    @Test
    public void testJoinObjectArrayString() {
        assertNull(StringUtils.join((Object[]) null, "--"));
        assertEquals("a--b--c", StringUtils.join(new Object[] {"a", "b", "c"}, "--"));
        assertEquals("abc", StringUtils.join(new Object[] {"a", "b", "c"}, (String) null));
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
        assertNull(StringUtils.join((Iterator<?>) null, ";"));
        List<String> two = new ArrayList<String>();
        two.add("a");
        two.add(null);
        assertEquals("a;", StringUtils.join(two.iterator(), ";"));
    }

    @Test
    public void testJoinIterable() {
        assertNull(StringUtils.join((Iterable<?>) null, ';'));
        assertNull(StringUtils.join((Iterable<?>) null, ";"));
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        assertEquals("a;b", StringUtils.join((Iterable<?>) list, ';'));
        assertEquals("a;b", StringUtils.join((Iterable<?>) list, ";"));
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

    @Test
    public void testRemoveString() {
        assertNull(StringUtils.remove(null, "a"));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemoveChar() {
        assertNull(StringUtils.remove(null, 'a'));
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // ---------- replace family ----------
    @Test
    public void testReplaceOnce() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "a", "b"));
        assertEquals("any", StringUtils.replace("any", null, "b"));
        assertEquals("any", StringUtils.replace("any", "a", null));
        assertEquals("b", StringUtils.replace("aba", "a", ""));
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
        assertEquals("wcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"w", "t"}));
        assertEquals("dcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachLengthMismatch() {
        StringUtils.replaceEach("abc", new String[] {"a"}, new String[] {"b", "c"});
    }

    @Test
    public void testReplaceEachRepeatedly() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachRepeatedlyEndlessLoop() {
        StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "ab"});
    }

    // ---------- replaceChars ----------
    @Test
    public void testReplaceCharsCharChar() {
        assertNull(StringUtils.replaceChars(null, 'b', 'y'));
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testReplaceCharsStringString() {
        assertNull(StringUtils.replaceChars(null, "a", "b"));
        assertEquals("abc", StringUtils.replaceChars("abc", "", "x"));
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
    }

    // ---------- overlay ----------
    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "abc", 0, 0));
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2)); // swap start/end
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4)); // start<0
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8)); // end>len
    }

    // ---------- chomp / chop ----------
    @Test
    public void testChomp() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("", StringUtils.chomp("\r"));
        assertEquals("abc \r", StringUtils.chomp("abc \r"));
        assertEquals("abc", StringUtils.chomp("abc\n"));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
        assertEquals("abc\n", StringUtils.chomp("abc\n\r"));
    }

    @Test
    public void testChompSeparator() {
        assertNull(StringUtils.chomp(null, "x"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    @Test
    public void testChop() {
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
        assertEquals("abc ", StringUtils.chop("abc \r"));
        assertEquals("ab", StringUtils.chop("abc"));
    }

    // ---------- repeat / padding ----------
    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("", StringUtils.repeat("a", -2));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("xyzxyzxyz", StringUtils.repeat("xyz", 3));
    }

    @Test
    public void testRepeatSeparator() {
        assertNull(StringUtils.repeat(null, "x", 2));
        assertEquals("", StringUtils.repeat("", null, 0));
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    // ---------- rightPad / leftPad ----------
    @Test
    public void testRightPad() {
        assertNull(StringUtils.rightPad(null, 3));
        assertEquals("bat", StringUtils.rightPad("bat", 1));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPadChar() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
        assertEquals("bat", StringUtils.rightPad("bat", 1, 'z'));
    }

    @Test
    public void testRightPadString() {
        assertNull(StringUtils.rightPad(null, 5, "yz"));
        assertEquals("bat", StringUtils.rightPad("bat", 1, "yz"));
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, (String) null));
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
        assertNull(StringUtils.leftPad(null, 5, "yz"));
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(3, StringUtils.length("abc"));
    }

    // ---------- center ----------
    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("ab", StringUtils.center("ab", -1));
        assertEquals(" a  ", StringUtils.center("a", 4));
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenterChar() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenterString() {
        assertNull(StringUtils.center(null, 4, "yz"));
        assertEquals("ab", StringUtils.center("ab", -1, "yz"));
        assertEquals("  abc  ", StringUtils.center("abc", 7, (String) null));
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
    }

    // ---------- case conversion ----------
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
        assertEquals(0, StringUtils.countMatches("abba", ""));
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
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
        assertTrue(StringUtils.isAlphanumericSpace("ab 2c"));
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
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace() {
        assertFalse(StringUtils.isNumericSpace(null));
        assertTrue(StringUtils.isNumericSpace("12 3"));
        assertFalse(StringUtils.isNumericSpace("12-3"));
    }

    @Test
    public void testIsWhitespace() {
        assertFalse(StringUtils.isWhitespace(null));
        assertTrue(StringUtils.isWhitespace("   "));
        assertFalse(StringUtils.isWhitespace("ab c"));
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
    public void testDefaultStringDefault() {
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
        assertEquals("a.b.c", StringUtils.reverseDelimited("a.b.c", 'x'));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    // ---------- abbreviate ----------
    @Test
    public void testAbbreviate2Arg() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("", StringUtils.abbreviate("", 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviate3Arg() {
        assertNull(StringUtils.abbreviate(null, 0, 4));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviate3ArgOffsetTooSmallWidth() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    // ---------- difference ----------
    @Test
    public void testDifference() {
        assertNull(StringUtils.difference(null, null));
        assertEquals("abc", StringUtils.difference(null, "abc"));
        assertEquals("abc", StringUtils.difference("abc", null));
        assertEquals("", StringUtils.difference("abc", "abc"));
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
    }

    @Test
    public void testIndexOfDifference2Arg() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceArray() {
        assertEquals(-1, StringUtils.indexOfDifference((String[]) null));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {"abc"}));
        assertEquals(-1, StringUtils.indexOfDifference(new String[] {null, null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[] {"", null}));
        assertEquals(1, StringUtils.indexOfDifference(new String[] {"abc", "a"}));
        assertEquals(7, StringUtils.indexOfDifference(
                new String[] {"i am a machine", "i am a robot"}));
    }

    @Test
    public void testGetCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
        assertEquals("abc", StringUtils.getCommonPrefix(new String[] {"abc", "abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[] {"abcde", "xyz"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}));
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
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[0]));
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
    }
}
```

## ตารางสรุป Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testIsEmpty/testIsNotEmpty | null, length==0, length>0 |
| testIsBlank/testIsNotBlank | null, length==0, whitespace-only loop (ทุก char เป็น/ไม่เป็น whitespace), early return false |
| testTrim/testTrimToNull/testTrimToEmpty | null check, isEmpty หลัง trim |
| testStrip* | stripChars==null, length==0, loop stripStart/stripEnd ทั้งกรณี whitespace และ custom chars |
| testStripAll | null array, length==0, loop iterate |
| testEquals/testEqualsIgnoreCase | str1==null ? str2==null : equals branch |
| testIndexOf* / testLastIndexOf* | isEmpty str, null searchStr, startPos>=len edge |
| testOrdinalIndexOf | null, ordinal<=0, searchStr.length==0, found<ordinal loop, index<0 break |
| testContains*/testContainsIgnoreCase | isEmpty, null, loop regionMatches true/false |
| testIndexOfAny*/testContainsAny*/testIndexOfAnyBut* | isEmpty/null array, inner loop match/no-match, continue outer label |
| testContainsOnly*/testContainsNone* | null, length==0, valid.length==0, indexOfAnyBut==-1 |
| testIndexOfAnyStringArray/testLastIndexOfAnyStringArray | null, length0, null entry skip, tmp==-1 continue, tmp<ret |
| testSubstring* | start<0 double negative, start>length, end>length, start>end |
| testLeft/testRight/testMid | null, len<0, length<=len, pos>length, pos<0 |
| testSubstringBefore/After/BeforeLast/AfterLast | isEmpty, null separator, separator.length==0, pos==-1, pos==(len-sep.len) |
| testSubstringBetween2/3 | null checks, start==-1, end==-1 |
| testSubstringsBetween | null/isEmpty open/close, strLen==0, loop break conditions, list.isEmpty |
| testSplit* family | null, len==0, separatorChars null/length1/length>1, match/preserveAllTokens/lastMatch, max limit sizePlus1==max |
| testSplitByWholeSeparator* | null, len0, separator null/empty→whitespace path, end>beg, preserveAllTokens branch, max reached |
| testSplitByCharacterType* | camelCase true/false, type change, UPPERCASE→LOWERCASE transition |
| testJoin* | null array/iterator, bufSize<=0, single element (!hasNext), separator null |
| testDeleteWhitespace | isEmpty, count==sz (no whitespace) vs removed |
| testRemoveStart/End(+IgnoreCase) | isEmpty str/remove, startsWith/endsWith true/false |
| testRemoveString/Char | isEmpty, indexOf==-1 fast path |
| testReplace*/testReplaceEach* | isEmpty text/search, replacement null, max==0, end==-1, loop decrement max, IllegalArgumentException length mismatch, IllegalStateException timeToLive<0 |
| testReplaceChars* | isEmpty, replaceChars null, index>=0 modified true/false, index<replaceCharsLength |
| testOverlay | str null, overlay null, start/end negative, >len, start>end swap |
| testChomp/testChop | isEmpty, length==1 CR/LF, last==LF with CR before, last!=CR→lastIdx++ |
| testRepeat*/testPadding(indirect) | str null, repeat<=0, repeat==1, inputLength==1, switch case1/2/default |
| testRightPad*/testLeftPad* | null, pads<=0, pads>PAD_LIMIT, padLen==1, pads==padLen, pads<padLen, pads>padLen |
| testCenter* | null, size<=0, pads<=0, leftPad+rightPad composition |
| testUpperCase/LowerCase(+Locale) | null check |
| testCapitalize/Uncapitalize | null/length==0 |
| testSwapCase | null/length0, isUpperCase/isTitleCase/isLowerCase branches |
| testCountMatches | isEmpty, loop count |
| testIsAlpha*/testIsNumeric*/testIsWhitespace/testIsAllLowerCase/testIsAllUpperCase | null return false, loop early return false, full true path |
| testIsAsciiPrintable | null, loop char out of range |
| testDefaultString/testDefaultIfEmpty | null ? default : str, isEmpty ? default : str |
| testReverse/testReverseDelimited | null, split+reverse+join composition |
| testAbbreviate* | null, maxWidth<4 exception, str.length<=maxWidth, offset>length, recursive call, offset<=4, maxWidth<7 exception |
| testDifference/testIndexOfDifference* | null combos, mismatched lengths, loop find diff, allStringsNull, shortestStrLen==0 |
| testGetCommonPrefix | null/empty array, indexOfDifference==-1/0/>0 |
| testGetLevenshteinDistance | null args exception, n==0/m==0, n>m swap, main DP loop |
| testStartsWith*/testEndsWith* | null both, null either, prefix/suffix longer than str, regionMatches true/false, ignoreCase true/false |
| testStartsWithAny | isEmpty string, empty array, loop match found/not found |

**หมายเหตุ**: บางเมธอด (เช่น `stripAccents`) ต้องพึ่งพา reflection และคลาสภายนอก (`ClassUtils`, `SystemUtils`) ที่ไม่ได้รวมอยู่ใน source ที่ให้มา จึง**ไม่ได้เขียนเทสสำหรับเมธอดนี้** เนื่องจากไม่สามารถยืนยัน behavior ที่แท้จริงได้โดยไม่เดา — ตามข้อกำหนดข้อ 4