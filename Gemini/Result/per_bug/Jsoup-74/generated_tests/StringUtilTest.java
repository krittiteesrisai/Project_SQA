package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringUtilTest {

    @Test
    public void testJoinCollectionEmpty() {
        List<String> emptyList = Collections.emptyList();
        assertEquals("", StringUtil.join(emptyList, ","));
    }

    @Test
    public void testJoinCollectionSingle() {
        List<String> singleList = Collections.singletonList("jsoup");
        assertEquals("jsoup", StringUtil.join(singleList, ","));
    }

    @Test
    public void testJoinCollectionMultiple() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertEquals("a-b-c", StringUtil.join(list, "-"));
    }

    @Test
    public void testJoinArray() {
        String[] arr = {"x", "y", "z"};
        assertEquals("x,y,z", StringUtil.join(arr, ","));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaddingNegative() {
        StringUtil.padding(-1);
    }

    @Test
    public void testPaddingCached() {
        // width < padding.length (21)
        assertEquals("     ", StringUtil.padding(5));
        assertEquals("", StringUtil.padding(0));
    }

    @Test
    public void testPaddingUncached() {
        // width >= padding.length
        String padded = StringUtil.padding(25);
        assertEquals(25, padded.length());
        assertEquals("                         ", padded);
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtil.isBlank(null));
        assertTrue(StringUtil.isBlank(""));
        assertTrue(StringUtil.isBlank("   \t\n\r\f"));
        assertFalse(StringUtil.isBlank("  a  "));
    }

    @Test
    public void testIsNumeric() {
        assertFalse(StringUtil.isNumeric(null));
        assertFalse(StringUtil.isNumeric(""));
        assertFalse(StringUtil.isNumeric("123a45"));
        assertTrue(StringUtil.isNumeric("0123456789"));
    }

    @Test
    public void testWhitespaceCheckers() {
        assertTrue(StringUtil.isWhitespace(' '));
        assertTrue(StringUtil.isWhitespace('\t'));
        assertTrue(StringUtil.isWhitespace('\n'));
        assertTrue(StringUtil.isWhitespace('\f'));
        assertTrue(StringUtil.isWhitespace('\r'));
        assertFalse(StringUtil.isWhitespace('a'));
        assertFalse(StringUtil.isWhitespace(160));

        assertTrue(StringUtil.isActuallyWhitespace(160));
        assertTrue(StringUtil.isActuallyWhitespace(' '));
        assertFalse(StringUtil.isActuallyWhitespace('x'));
    }

    @Test
    public void testNormaliseWhitespace() {
        String input = "  Hello   \n  world\t!  ";
        assertEquals(" Hello world ! ", StringUtil.normaliseWhitespace(input));
    }

    @Test
    public void testAppendNormalisedWhitespaceWithStrip() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   Leading and   trailing   ", true);
        assertEquals("Leading and trailing ", sb.toString());
    }

    @Test
    public void testIn() {
        String[] haystack = {"apple", "banana", "cherry"};
        assertTrue(StringUtil.in("banana", haystack));
        assertFalse(StringUtil.in("orange", haystack));
    }

    @Test
    public void testInSorted() {
        String[] sortedHaystack = {"apple", "banana", "cherry"};
        Arrays.sort(sortedHaystack);
        assertTrue(StringUtil.inSorted("banana", sortedHaystack));
        assertFalse(StringUtil.inSorted("orange", sortedHaystack));
    }

    @Test
    public void testResolveUrlEdgeCases() throws MalformedURLException {
        URL base = new URL("http://example.com/path/file.html");
        
        // relUrl starts with "?"
        URL resolved1 = StringUtil.resolve(base, "?query=1");
        assertEquals("http://example.com/path/?query=1", resolved1.toExternalForm());

        // relUrl starts with "." and base.getFile() does not start with "/"
        URL baseNoSlash = new URL("http://example.com", "", 80, "file.html");
        URL resolved2 = StringUtil.resolve(baseNoSlash, "./sub");
        assertNotNull(resolved2);

        // String overload resolve
        assertEquals("http://example.com/abs", StringUtil.resolve("invalid-base", "http://example.com/abs"));
        assertEquals("", StringUtil.resolve("invalid-base", "invalid-rel"));
    }

    @Test
    public void testStringBuilderCaching() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        assertNotNull(sb1);
        
        // Force grow beyond MaxCachedBuilderSize (8 * 1024)
        sb1.append(new char[9 * 1024]);
        StringBuilder sb2 = StringUtil.stringBuilder();
        assertNotNull(sb2);
        assertTrue(sb2.length() == 0);
    }
}