package org.apache.commons.lang.text;

import org.junit.Test;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class StrBuilderTest {

    // -----------------------------------------------------------------------
    // Constructors & Capacity tests
    // -----------------------------------------------------------------------
    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(0, sb1.length());
        assertEquals(32, sb1.capacity());

        StrBuilder sb2 = new StrBuilder(-5);
        assertEquals(32, sb2.capacity());

        StrBuilder sb3 = new StrBuilder(10);
        assertEquals(10, sb3.capacity());

        StrBuilder sb4 = new StrBuilder((String) null);
        assertEquals(0, sb4.length());
        assertEquals(32, sb4.capacity());

        StrBuilder sb5 = new StrBuilder("Hello");
        assertEquals(5, sb5.length());
        assertEquals("Hello", sb5.toString());
        assertEquals(5 + 32, sb5.capacity());
    }

    @Test
    public void testSetLengthAndCapacity() {
        StrBuilder sb = new StrBuilder("Hello World");
        sb.setLength(5);
        assertEquals("Hello", sb.toString());
        assertEquals(5, sb.length());

        sb.setLength(8);
        assertEquals(8, sb.length());
        assertEquals('H', sb.charAt(0));
        assertEquals('\0', sb.charAt(5));
        assertEquals('\0', sb.charAt(7));

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.minimizeCapacity();
        assertEquals(8, sb.capacity());

        sb.clear();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.size());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        new StrBuilder().setLength(-1);
    }

    // -----------------------------------------------------------------------
    // Get/Set Null & NewLine Text
    // -----------------------------------------------------------------------
    @Test
    public void testNullAndNewLineText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
        assertNull(sb.getNewLineText());

        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.append((String) null);
        assertEquals("NULL", sb.toString());

        sb.setNullText("");
        assertNull(sb.getNullText());

        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.clear();
        sb.appendNewLine();
        assertEquals("\r\n", sb.toString());

        sb.setNewLineText(null);
        sb.clear();
        sb.appendNewLine();
        assertTrue(sb.length() > 0);
    }

    // -----------------------------------------------------------------------
    // Char Access & Bounds
    // -----------------------------------------------------------------------
    @Test
    public void testCharOperations() {
        StrBuilder sb = new StrBuilder("abcde");
        assertEquals('c', sb.charAt(2));

        sb.setCharAt(2, 'z');
        assertEquals("abzde", sb.toString());

        sb.deleteCharAt(2);
        assertEquals("abde", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtNegative() {
        new StrBuilder("abc").charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtOutOfBounds() {
        new StrBuilder("abc").charAt(3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtOutOfBounds() {
        new StrBuilder("abc").setCharAt(3, 'x');
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtOutOfBounds() {
        new StrBuilder("abc").deleteCharAt(3);
    }

    // -----------------------------------------------------------------------
    // Array / Substring Conversions & Range Validations
    // -----------------------------------------------------------------------
    @Test
    public void testToCharArrayAndGetChars() {
        StrBuilder empty = new StrBuilder();
        assertArrayEquals(new char[0], empty.toCharArray());
        assertArrayEquals(new char[0], empty.toCharArray(0, 0));

        StrBuilder sb = new StrBuilder("Hello World");
        char[] chars = sb.toCharArray();
        assertEquals(11, chars.length);
        assertEquals("Hello World", new String(chars));

        char[] subChars = sb.toCharArray(6, 100);
        assertEquals("World", new String(subChars));

        char[] dest = new char[5];
        sb.getChars(0, 5, dest, 0);
        assertEquals("Hello", new String(dest));

        char[] autoDest = sb.getChars(null);
        assertEquals(11, autoDest.length);

        char[] smallDest = new char[2];
        char[] resizedDest = sb.getChars(smallDest);
        assertEquals(11, resizedDest.length);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsInvalidRangeStart() {
        new StrBuilder("test").getChars(-1, 2, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsInvalidRangeEnd() {
        new StrBuilder("test").getChars(0, 10, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsEndLessThanStart() {
        new StrBuilder("test").getChars(3, 2, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateRangeStartNegative() {
        new StrBuilder("test").substring(-1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testValidateRangeEndBeforeStart() {
        new StrBuilder("test").substring(3, 2);
    }

    // -----------------------------------------------------------------------
    // Appends (Primitives, Objects, Buffers)
    // -----------------------------------------------------------------------
    @Test
    public void testAppendPrimitivesAndObjects() {
        StrBuilder sb = new StrBuilder();
        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('!').append(123).append(456L).append(1.5f).append(2.5d);
        assertEquals("!1234561.52.5", sb.toString());

        sb.clear();
        sb.append(new Object() {
            public String toString() {
                return "Obj";
            }
        });
        assertEquals("Obj", sb.toString());

        sb.clear();
        sb.append((Object) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSubStringsAndBuffers() {
        StrBuilder sb = new StrBuilder();
        sb.append("abcdef", 1, 3); // "bcd"
        assertEquals("bcd", sb.toString());

        sb.append((String) null, 0, 0);
        assertEquals("bcd", sb.toString());

        sb.append(new StringBuffer("efgh"));
        assertEquals("bcdefgh", sb.toString());

        sb.append(new StringBuffer("ijkl"), 1, 2); // "jk"
        assertEquals("bcdefghjk", sb.toString());

        StrBuilder other = new StrBuilder("lmnop");
        sb.append(other);
        assertEquals("bcdefghjklmnop", sb.toString());

        sb.append(other, 1, 2); // "m"
        assertEquals("bcdefghjklmnoplm".substring(0, 15), sb.toString());

        char[] charArr = new char[]{'q', 'r', 's'};
        sb.append(charArr);
        sb.append(charArr, 1, 2);
        assertTrue(sb.toString().endsWith("rs"));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringInvalidStart() {
        new StrBuilder().append("abc", -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringInvalidLength() {
        new StrBuilder().append("abc", 1, 5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayInvalidStart() {
        new StrBuilder().append(new char[]{'a'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayInvalidLength() {
        new StrBuilder().append(new char[]{'a'}, 0, 3);
    }

    // -----------------------------------------------------------------------
    // Append With Separators & Fixed Width
    // -----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[]{"A", "B", "C"}, ",");
        assertEquals("A,B,C", sb.toString());

        sb.clear();
        sb.appendWithSeparators(new Object[]{"A", "B"}, null);
        assertEquals("AB", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("1", "2", "3"), "-");
        assertEquals("1-2-3", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Collection<?>) null, "-");
        sb.appendWithSeparators(Collections.emptyList(), "-");
        assertEquals("", sb.toString());

        sb.clear();
        List<String> list = Arrays.asList("X", "Y");
        sb.appendWithSeparators(list.iterator(), ":");
        assertEquals("X:Y", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Iterator<?>) null, ":");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPaddingAndFixedWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(3, '*');
        assertEquals("***", sb.toString());
        sb.appendPadding(-1, '*');
        assertEquals("***", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foo", 5, '0');
        assertEquals("00foo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("foobar", 3, '0');
        assertEquals("bar", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(42, 4, ' ');
        assertEquals("  42", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foo", 5, '0');
        assertEquals("foo00", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("foobar", 3, '0');
        assertEquals("foo", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(42, 4, ' ');
        assertEquals("42  ", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft(null, 5, '-');
        assertEquals("-null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(null, 5, '-');
        assertEquals("null-", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("test", -1, ' ');
        sb.appendFixedWidthPadRight("test", -1, ' ');
        assertEquals("", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Inserts
    // -----------------------------------------------------------------------
    @Test
    public void testInsertOperations() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());

        sb.insert(0, (String) null); // NullText is null by default
        assertEquals("abc", sb.toString());

        sb.insert(3, true);
        assertEquals("abctrue", sb.toString());

        sb.insert(7, false);
        assertEquals("abctruefalse", sb.toString());

        sb.insert(0, '!');
        assertEquals("!abctruefalse", sb.toString());

        sb.clear();
        sb.append("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.insert(1, new char[]{'1', '2', '3'}, 1, 1); // insert '2'
        assertEquals("a2bc", sb.toString());

        sb.insert(0, 100);
        sb.insert(0, 200L);
        sb.insert(0, 3.5f);
        sb.insert(0, 4.5d);
        assertTrue(sb.length() > 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertInvalidIndex() {
        new StrBuilder("abc").insert(-1, "x");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertOffsetOutOfBound() {
        new StrBuilder("abc").insert(0, new char[]{'a'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertLengthOutOfBound() {
        new StrBuilder("abc").insert(0, new char[]{'a'}, 0, 5);
    }

    // -----------------------------------------------------------------------
    // Delete and Replace
    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAndReplace() {
        StrBuilder sb = new StrBuilder("banana");
        sb.deleteFirst('a');
        assertEquals("bnana", sb.toString());

        sb.deleteAll('a');
        assertEquals("bnn", sb.toString());

        sb.clear();
        sb.append("banana");
        sb.deleteFirst("an");
        assertEquals("bana", sb.toString());

        sb.deleteAll("a");
        assertEquals("bn", sb.toString());

        sb.deleteAll((String) null);
        sb.deleteFirst((String) null);
        assertEquals("bn", sb.toString());

        sb.clear();
        sb.append("hello world");
        sb.delete(0, 6);
        assertEquals("world", sb.toString());

        sb.replace(0, 5, "earth");
        assertEquals("earth", sb.toString());

        sb.replaceAll('a', 'o');
        assertEquals("eorth", sb.toString());

        sb.replaceFirst('o', 'a');
        assertEquals("earth", sb.toString());

        sb.replaceAll("ar", "ur");
        assertEquals("eurth", sb.toString());

        sb.replaceFirst("ur", "ar");
        assertEquals("earth", sb.toString());

        sb.replaceAll((String) null, "x");
        sb.replaceFirst((String) null, "x");
        assertEquals("earth", sb.toString());
    }

    @Test
    public void testDeleteAllAndFirstWithMatcher() {
        StrBuilder sb = new StrBuilder("a1b2c3d4");
        sb.deleteAll(StrMatcher.charMatcher('1'));
        assertEquals("ab2c3d4", sb.toString());

        sb.deleteFirst(StrMatcher.charMatcher('2'));
        assertEquals("abc3d4", sb.toString());

        sb.replaceAll(StrMatcher.charMatcher('3'), "X");
        assertEquals("abcXd4", sb.toString());

        sb.replaceFirst(StrMatcher.charMatcher('4'), "Y");
        assertEquals("abcXdY", sb.toString());

        sb.replace(StrMatcher.noneMatcher(), "Z", 0, sb.length(), -1);
        assertEquals("abcXdY", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Defects4J Lang-61 Target Regression & IndexOf Edge Cases
    // -----------------------------------------------------------------------
    @Test
    public void testIndexOfAndLastIndexOfEdgeCases() {
        // Lang-61 specific: buffer is larger than size
        StrBuilder sb = new StrBuilder(100);
        sb.append("test string");
        // deleteAll calls indexOf(String, 0)
        sb.deleteAll("string");
        assertEquals("test ", sb.toString());

        // Searching string not found where buffer is larger than size
        assertEquals(-1, sb.indexOf("notfound"));
        assertEquals(-1, sb.indexOf("notfound", 0));
        assertEquals(-1, sb.indexOf("notfound", 2));

        // Single char indexOf
        assertEquals(1, sb.indexOf('e'));
        assertEquals(1, sb.indexOf('e', 0));
        assertEquals(-1, sb.indexOf('e', 2));
        assertEquals(-1, sb.indexOf('z'));
        assertEquals(-1, sb.indexOf('e', 100));
        assertEquals(1, sb.indexOf('e', -10));

        // String indexOf
        assertEquals(0, sb.indexOf("test"));
        assertEquals(0, sb.indexOf(""));
        assertEquals(2, sb.indexOf("", 2));
        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.indexOf("test", 100));
        assertEquals(-1, sb.indexOf("a_very_long_string_that_exceeds_size"));

        // Matcher indexOf
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('e')));
        assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher()));
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('e'), 100));

        // lastIndexOf
        sb.clear();
        sb.append("banana");
        assertEquals(5, sb.lastIndexOf('a'));
        assertEquals(3, sb.lastIndexOf('a', 4));
        assertEquals(-1, sb.lastIndexOf('a', -1));
        assertEquals(-1, sb.lastIndexOf('z'));

        assertEquals(3, sb.lastIndexOf("an"));
        assertEquals(1, sb.lastIndexOf("an", 2));
        assertEquals(4, sb.lastIndexOf(""));
        assertEquals(6, sb.lastIndexOf("", 10));
        assertEquals(-1, sb.lastIndexOf((String) null));
        assertEquals(-1, sb.lastIndexOf("banana_long"));
        assertEquals(-1, sb.lastIndexOf("an", -1));

        assertEquals(5, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('a'), 4));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -1));
    }

    // -----------------------------------------------------------------------
    // Substrings, StartsWith, EndsWith, Contains, Reverse, Trim
    // -----------------------------------------------------------------------
    @Test
    public void testStringSearchAndManipulation() {
        StrBuilder sb = new StrBuilder("Hello World");
        assertTrue(sb.startsWith("Hello"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith("World"));
        assertFalse(sb.startsWith(null));
        assertFalse(sb.startsWith("Hello World Longer"));

        assertTrue(sb.endsWith("World"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith("Hello"));
        assertFalse(sb.endsWith(null));
        assertFalse(sb.endsWith("Hello World Longer"));

        assertTrue(sb.contains('e'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("World"));
        assertFalse(sb.contains("Earth"));
        assertTrue(sb.contains(StrMatcher.stringMatcher("World")));
        assertFalse(sb.contains((StrMatcher) null));

        assertEquals("Hello", sb.substring(0, 5));
        assertEquals("World", sb.substring(6));
        assertEquals("World", sb.substring(6, 50));

        assertEquals("Hel", sb.leftString(3));
        assertEquals("", sb.leftString(-1));
        assertEquals("Hello World", sb.leftString(50));

        assertEquals("rld", sb.rightString(3));
        assertEquals("", sb.rightString(-1));
        assertEquals("Hello World", sb.rightString(50));

        assertEquals("llo", sb.midString(2, 3));
        assertEquals("", sb.midString(-1, -1));
        assertEquals("Hello", sb.midString(-5, 5));
        assertEquals("World", sb.midString(6, 50));
        assertEquals("", sb.midString(50, 5));

        sb.reverse();
        assertEquals("dlroW olleH", sb.toString());
        sb.clear();
        sb.reverse();
        assertEquals("", sb.toString());

        StrBuilder trimSb = new StrBuilder("  \t text \n ");
        trimSb.trim();
        assertEquals("text", trimSb.toString());

        StrBuilder emptyTrim = new StrBuilder("   ");
        emptyTrim.trim();
        assertEquals("", emptyTrim.toString());

        StrBuilder noTrim = new StrBuilder("text");
        noTrim.trim();
        assertEquals("text", noTrim.toString());
    }

    // -----------------------------------------------------------------------
    // Reader, Writer, Tokenizer Views
    // -----------------------------------------------------------------------
    @Test
    public void testReaderView() throws Exception {
        StrBuilder sb = new StrBuilder("ABCDEF");
        Reader reader = sb.asReader();

        assertTrue(reader.ready());
        assertTrue(reader.markSupported());
        assertEquals('A', (char) reader.read());

        reader.mark(10);
        assertEquals('B', (char) reader.read());
        reader.reset();
        assertEquals('B', (char) reader.read());

        char[] buf = new char[3];
        int count = reader.read(buf, 0, 3);
        assertEquals(3, count);
        assertEquals("CDE", new String(buf));

        assertEquals(1, reader.skip(1));
        assertEquals(0, reader.skip(-1));
        assertEquals(-1, reader.read());
        assertFalse(reader.ready());
        reader.close();
    }

    @Test
    public void testWriterView() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();

        writer.write('A');
        writer.write(new char[]{'B', 'C'});
        writer.write(new char[]{'D', 'E', 'F'}, 1, 2);
        writer.write("GH");
        writer.write("IJKL", 1, 2);
        writer.flush();
        writer.close();

        assertEquals("ABCEFGHJK", sb.toString());
    }

    @Test
    public void testTokenizerView() {
        StrBuilder sb = new StrBuilder("one two three");
        StrTokenizer tokenizer = sb.asTokenizer();
        String[] tokens = tokenizer.getTokenArray();
        assertEquals(3, tokens.length);
        assertEquals("one", tokens[0]);
        assertEquals("two", tokens[1]);
        assertEquals("three", tokens[2]);
        assertEquals("one two three", tokenizer.getContent());
    }

    // -----------------------------------------------------------------------
    // Equals, HashCode, and Conversion tests
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        StrBuilder sb3 = new StrBuilder("ABC");
        StrBuilder sb4 = new StrBuilder("abcd");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((StrBuilder) null));
        assertFalse(sb1.equals("abc"));

        assertTrue(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));
        assertTrue(sb1.equalsIgnoreCase(sb1));

        assertEquals(sb1.hashCode(), sb2.hashCode());
        assertNotEquals(sb1.hashCode(), sb3.hashCode());

        assertEquals("abc", sb1.toStringBuffer().toString());
    }
}