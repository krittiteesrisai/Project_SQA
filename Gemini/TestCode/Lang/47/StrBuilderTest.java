package org.apache.commons.lang.text;

import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StrBuilderTest {

    // -----------------------------------------------------------------------
    // Constructors & Basic Properties
    // -----------------------------------------------------------------------

    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(0, sb1.length());
        assertEquals(StrBuilder.CAPACITY, sb1.capacity());

        StrBuilder sb2 = new StrBuilder(-5);
        assertEquals(StrBuilder.CAPACITY, sb2.capacity());

        StrBuilder sb3 = new StrBuilder(64);
        assertEquals(64, sb3.capacity());

        StrBuilder sb4 = new StrBuilder((String) null);
        assertEquals(0, sb4.length());
        assertEquals(StrBuilder.CAPACITY, sb4.capacity());

        StrBuilder sb5 = new StrBuilder("Hello");
        assertEquals(5, sb5.length());
        assertEquals("Hello", sb5.toString());
        assertEquals(5 + StrBuilder.CAPACITY, sb5.capacity());
    }

    @Test
    public void testSetNewLineTextAndNullText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        assertNull(sb.getNullText());

        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.appendNewLine();
        assertEquals("\r\n", sb.toString());

        sb.clear();
        sb.setNewLineText(null);
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());

        sb.setNullText("");
        assertNull(sb.getNullText());

        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.appendNull();
        assertEquals(SystemUtils.LINE_SEPARATOR + "NULL", sb.toString());
    }

    @Test
    public void testSetLengthAndCapacity() {
        StrBuilder sb = new StrBuilder("Hello World");
        assertEquals(11, sb.size());
        assertFalse(sb.isEmpty());

        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("Hello", sb.toString());

        sb.setLength(7);
        assertEquals(7, sb.length());
        assertEquals("Hello\0\0", sb.toString());

        sb.setLength(7); // branch length == size
        assertEquals(7, sb.length());

        sb.minimizeCapacity();
        assertEquals(7, sb.capacity());

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.ensureCapacity(10); // no-op branch
        assertTrue(sb.capacity() >= 100);

        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegativeThrows() {
        new StrBuilder().setLength(-1);
    }

    // -----------------------------------------------------------------------
    // Char & Range Operations
    // -----------------------------------------------------------------------

    @Test
    public void testCharOperations() {
        StrBuilder sb = new StrBuilder("abcde");
        assertEquals('a', sb.charAt(0));
        assertEquals('e', sb.charAt(4));

        sb.setCharAt(1, 'x');
        assertEquals("axcde", sb.toString());

        sb.deleteCharAt(1);
        assertEquals("acde", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtNegativeThrows() {
        new StrBuilder("abc").charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtOutOfBoundsThrows() {
        new StrBuilder("abc").charAt(3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtOutOfBoundsThrows() {
        new StrBuilder("abc").setCharAt(3, 'z');
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtOutOfBoundsThrows() {
        new StrBuilder("abc").deleteCharAt(3);
    }

    @Test
    public void testToCharArrayAndGetChars() {
        StrBuilder empty = new StrBuilder();
        assertArrayEquals(new char[0], empty.toCharArray());
        assertArrayEquals(new char[0], empty.toCharArray(0, 0));

        StrBuilder sb = new StrBuilder("abcdef");
        char[] full = sb.toCharArray();
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, full);

        char[] sub = sb.toCharArray(1, 4);
        assertArrayEquals(new char[]{'b', 'c', 'd'}, sub);

        char[] subEndOver = sb.toCharArray(4, 10); // endIndex > size
        assertArrayEquals(new char[]{'e', 'f'}, subEndOver);

        char[] dest = new char[6];
        assertSame(dest, sb.getChars(dest));
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, dest);

        char[] smallDest = new char[2];
        char[] newDest = sb.getChars(smallDest);
        assertNotSame(smallDest, newDest);
        assertEquals(6, newDest.length);

        char[] destRange = new char[5];
        sb.getChars(1, 4, destRange, 1);
        assertEquals('\0', destRange[0]);
        assertEquals('b', destRange[1]);
        assertEquals('c', destRange[2]);
        assertEquals('d', destRange[3]);
        assertEquals('\0', destRange[4]);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsInvalidRangeThrows() {
        new StrBuilder("abc").getChars(2, 1, new char[5], 0);
    }

    // -----------------------------------------------------------------------
    // Appends (Primitives, Objects, Buffers, Arrays)
    // -----------------------------------------------------------------------

    @Test
    public void testAppendsPrimitives() {
        StrBuilder sb = new StrBuilder();
        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('A').append(123).append(456789L).append(1.5f).append(2.75d);
        assertEquals("A1234567891.52.75", sb.toString());
    }

    @Test
    public void testAppendlnVariations() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\n");
        sb.appendln("line1")
          .appendln(new StringBuffer("line2"))
          .appendln(new StrBuilder("line3"))
          .appendln(new char[]{'l', 'i', 'n', 'e', '4'})
          .appendln(true)
          .appendln('C')
          .appendln(10)
          .appendln(20L)
          .appendln(1.1f)
          .appendln(2.2d)
          .appendln((Object) "lineObj");

        String expected = "line1\nline2\nline3\nline4\ntrue\nC\n10\n20\n1.1\n2.2\nlineObj\n";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void testAppendPartialData() {
        StrBuilder sb = new StrBuilder();
        sb.append("abcdef", 1, 3);
        sb.append(new StringBuffer("ghijkl"), 1, 3);
        sb.append(new StrBuilder("mnopqr"), 1, 3);
        sb.append(new char[]{'s', 't', 'u', 'v', 'w'}, 1, 3);
        assertEquals("bcdhijnoptuv", sb.toString());

        // Zero lengths
        sb.append("test", 0, 0);
        sb.append(new StringBuffer("test"), 0, 0);
        sb.append(new StrBuilder("test"), 0, 0);
        sb.append(new char[]{'a'}, 0, 0);
        assertEquals("bcdhijnoptuv", sb.toString());

        // Null partial appends
        sb.append((String) null, 0, 0);
        sb.append((StringBuffer) null, 0, 0);
        sb.append((StrBuilder) null, 0, 0);
        sb.append((char[]) null, 0, 0);
        assertEquals("bcdhijnoptuv", sb.toString());
    }

    @Test
    public void testAppendCollectionsAndSeparators() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Object[]) null);
        sb.appendAll(new Object[0]);
        sb.appendAll(new Object[]{"A", "B"});
        assertEquals("AB", sb.toString());

        sb.clear();
        sb.appendAll((List) null);
        sb.appendAll(Collections.emptyList());
        sb.appendAll(Arrays.asList("C", "D"));
        assertEquals("CD", sb.toString());

        sb.clear();
        sb.appendAll((java.util.Iterator) null);
        sb.appendAll(Arrays.asList("E", "F").iterator());
        assertEquals("EF", sb.toString());

        // With Separators
        sb.clear();
        sb.appendWithSeparators((Object[]) null, ",");
        sb.appendWithSeparators(new Object[0], ",");
        sb.appendWithSeparators(new Object[]{"1", "2", "3"}, ",");
        assertEquals("1,2,3", sb.toString());

        sb.clear();
        sb.appendWithSeparators((List) null, ",");
        sb.appendWithSeparators(Collections.emptyList(), ",");
        sb.appendWithSeparators(Arrays.asList("4", "5"), ":");
        assertEquals("4:5", sb.toString());

        sb.clear();
        sb.appendWithSeparators((java.util.Iterator) null, ",");
        sb.appendWithSeparators(Arrays.asList("6", "7").iterator(), null);
        assertEquals("67", sb.toString());
    }

    @Test
    public void testAppendSeparatorConditional() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(","); // empty, no-op
        sb.appendSeparator(',', 0); // loopIndex == 0, no-op
        sb.appendSeparator(",", 0);
        assertEquals(0, sb.length());

        sb.append("A");
        sb.appendSeparator(",");
        sb.append("B");
        sb.appendSeparator(';');
        sb.append("C");
        sb.appendSeparator((String) null); // null separator no-op
        sb.appendSeparator(",", 1);
        sb.append("D");
        sb.appendSeparator(':', 2);
        sb.append("E");

        assertEquals("A,B;C,D:E", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Padding & Fixed Width
    // -----------------------------------------------------------------------

    @Test
    public void testAppendPadding() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-1, 'x'); // negative len no-op
        sb.appendPadding(0, 'x');
        assertEquals(0, sb.length());

        sb.appendPadding(3, '-');
        assertEquals("---", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftAndRight() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 5, ' ');
        sb.appendFixedWidthPadLeft("abcdef", 3, ' '); // truncate left
        sb.appendFixedWidthPadLeft(12, 4, '0');
        sb.appendFixedWidthPadLeft("x", -1, ' '); // width <= 0 no-op
        assertEquals("  abc" + "def" + "0012", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("abc", 5, ' ');
        sb.appendFixedWidthPadRight("abcdef", 3, ' '); // truncate right
        sb.appendFixedWidthPadRight(12, 4, '0');
        sb.appendFixedWidthPadRight("x", 0, ' '); // width <= 0 no-op
        assertEquals("abc  " + "abc" + "1200", sb.toString());

        // Test with null objects when nullText is null (Edge Case / Bug Detection)
        sb.clear();
        sb.setNullText("N/A");
        sb.appendFixedWidthPadLeft(null, 5, '-');
        sb.appendFixedWidthPadRight(null, 5, '-');
        assertEquals("--N/A" + "N/A--", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Insert & Delete
    // -----------------------------------------------------------------------

    @Test
    public void testInsertOperations() {
        StrBuilder sb = new StrBuilder("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());

        sb.insert(5, (String) null); // inserts nullText (currently null -> no-op)
        assertEquals("hello world", sb.toString());

        sb.setNullText("!");
        sb.insert(11, (Object) null);
        assertEquals("hello world!", sb.toString());

        sb.clear().append("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());

        sb.insert(1, new char[]{'1', '2', '3'}, 1, 1);
        assertEquals("a2bc", sb.toString());

        sb.insert(0, true);
        sb.insert(4, false);
        assertEquals("truefalsea2bc", sb.toString());

        sb.clear().append("item: ");
        sb.insert(6, 'X').insert(7, 100).insert(10, 200L).insert(13, 1.5f).insert(16, 2.5d);
        assertEquals("item: X1002001.52.5", sb.toString());
    }

    @Test
    public void testDeleteOperations() {
        StrBuilder sb = new StrBuilder("hello beautiful world");
        sb.delete(5, 15);
        assertEquals("hello world", sb.toString());

        sb.delete(0, 0); // len == 0
        assertEquals("hello world", sb.toString());

        sb.clear().append("banana");
        sb.deleteFirst('a');
        assertEquals("bnana", sb.toString());

        sb.deleteAll('a');
        assertEquals("bnn", sb.toString());

        sb.clear().append("foo bar foo baz foo");
        sb.deleteFirst("foo ");
        assertEquals("bar foo baz foo", sb.toString());

        sb.deleteAll("foo");
        assertEquals("bar   baz ", sb.toString());

        sb.deleteAll((String) null);
        sb.deleteFirst((String) null);
        sb.deleteAll("");
        sb.deleteFirst("");
        assertEquals("bar   baz ", sb.toString());

        sb.clear().append("1a2b3c");
        sb.deleteFirst(StrMatcher.charSetMatcher("abc"));
        assertEquals("12b3c", sb.toString());

        sb.deleteAll(StrMatcher.charSetMatcher("abc"));
        assertEquals("123", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Replace
    // -----------------------------------------------------------------------

    @Test
    public void testReplaceOperations() {
        StrBuilder sb = new StrBuilder("the quick brown fox");
        sb.replace(4, 9, "slow");
        assertEquals("the slow brown fox", sb.toString());

        sb.replaceAll('o', '0');
        assertEquals("the sl0w br0wn f0x", sb.toString());

        sb.replaceFirst('0', 'o');
        assertEquals("the slow br0wn f0x", sb.toString());

        sb.replaceAll('z', 'y'); // not found
        sb.replaceFirst('z', 'y');

        sb.clear().append("cat dog cat bird");
        sb.replaceFirst("cat", "big cat");
        assertEquals("big cat dog cat bird", sb.toString());

        sb.replaceAll("cat", "mouse");
        assertEquals("big mouse dog mouse bird", sb.toString());

        sb.replaceAll((String) null, "x");
        sb.replaceFirst((String) null, "x");
        assertEquals("big mouse dog mouse bird", sb.toString());

        sb.clear().append("a1b2c3");
        sb.replaceFirst(StrMatcher.charSetMatcher("123"), "X");
        assertEquals("aXb2c3", sb.toString());

        sb.replaceAll(StrMatcher.charSetMatcher("123"), "Z");
        assertEquals("aXbZcZ", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Search, Substring & Predicates
    // -----------------------------------------------------------------------

    @Test
    public void testSearchAndIndices() {
        StrBuilder sb = new StrBuilder("ababab");
        assertEquals(0, sb.indexOf('a'));
        assertEquals(2, sb.indexOf('a', 1));
        assertEquals(-1, sb.indexOf('a', 10));
        assertEquals(4, sb.lastIndexOf('a'));
        assertEquals(2, sb.lastIndexOf('a', 3));
        assertEquals(-1, sb.lastIndexOf('a', -1));

        assertEquals(0, sb.indexOf("ab"));
        assertEquals(2, sb.indexOf("ab", 1));
        assertEquals(4, sb.lastIndexOf("ab"));
        assertEquals(2, sb.lastIndexOf("ab", 3));

        // Edge conditions for indexOf / lastIndexOf string
        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.lastIndexOf((String) null));
        assertEquals(1, sb.indexOf("", 1));
        assertEquals(3, sb.lastIndexOf("", 3));
        assertEquals(-1, sb.indexOf("abcdefghijkl"));
        assertEquals(-1, sb.lastIndexOf("abcdefghijkl"));
        assertEquals(1, sb.indexOf("b"));
        assertEquals(5, sb.lastIndexOf("b"));

        // Matcher search
        StrMatcher bMatcher = StrMatcher.charMatcher('b');
        assertEquals(1, sb.indexOf(bMatcher));
        assertEquals(3, sb.indexOf(bMatcher, 2));
        assertEquals(5, sb.lastIndexOf(bMatcher));
        assertEquals(3, sb.lastIndexOf(bMatcher, 4));
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testStartsWithEndsWithContains() {
        StrBuilder sb = new StrBuilder("HelloWorld");
        assertTrue(sb.startsWith("Hello"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith(null));
        assertFalse(sb.startsWith("HelloWorldExtended"));
        assertFalse(sb.startsWith("world"));

        assertTrue(sb.endsWith("World"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith(null));
        assertFalse(sb.endsWith("HelloWorldExtended"));
        assertFalse(sb.endsWith("Hello"));

        assertTrue(sb.contains('o'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("low"));
        assertFalse(sb.contains("xyz"));
        assertTrue(sb.contains(StrMatcher.stringMatcher("World")));
        assertFalse(sb.contains(StrMatcher.stringMatcher("Planet")));
    }

    @Test
    public void testSubstringMethods() {
        StrBuilder sb = new StrBuilder("0123456789");
        assertEquals("56789", sb.substring(5));
        assertEquals("2345", sb.substring(2, 6));
        assertEquals("789", sb.substring(7, 20)); // endIndex > size

        assertEquals("", sb.leftString(-1));
        assertEquals("", sb.leftString(0));
        assertEquals("012", sb.leftString(3));
        assertEquals("0123456789", sb.leftString(15));

        assertEquals("", sb.rightString(-1));
        assertEquals("", sb.rightString(0));
        assertEquals("789", sb.rightString(3));
        assertEquals("0123456789", sb.rightString(15));

        assertEquals("", sb.midString(-1, -1));
        assertEquals("", sb.midString(15, 3));
        assertEquals("345", sb.midString(3, 3));
        assertEquals("89", sb.midString(8, 5));
    }

    // -----------------------------------------------------------------------
    // Utility Methods (reverse, trim, equals, hashCode, toString)
    // -----------------------------------------------------------------------

    @Test
    public void testReverseAndTrim() {
        StrBuilder empty = new StrBuilder();
        empty.reverse();
        assertEquals("", empty.toString());
        empty.trim();
        assertEquals("", empty.toString());

        StrBuilder sbEven = new StrBuilder("1234");
        sbEven.reverse();
        assertEquals("4321", sbEven.toString());

        StrBuilder sbOdd = new StrBuilder("12345");
        sbOdd.reverse();
        assertEquals("54321", sbOdd.toString());

        StrBuilder ws = new StrBuilder("   \t hello world \n  ");
        ws.trim();
        assertEquals("hello world", ws.toString());

        StrBuilder noWs = new StrBuilder("hello");
        noWs.trim();
        assertEquals("hello", noWs.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        StrBuilder sb3 = new StrBuilder("ABC");
        StrBuilder sb4 = new StrBuilder("abcd");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals((Object) sb2));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((Object) "abc"));
        assertFalse(sb1.equals((StrBuilder) null));

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));

        assertEquals(sb1.hashCode(), sb2.hashCode());
        assertNotEquals(0, sb1.hashCode());

        assertEquals("abc", sb1.toString());
        assertEquals("abc", sb1.toStringBuffer().toString());
    }

    // -----------------------------------------------------------------------
    // Views: Reader, Writer, Tokenizer
    // -----------------------------------------------------------------------

    @Test
    public void testReaderView() throws Exception {
        StrBuilder sb = new StrBuilder("Hello World");
        Reader reader = sb.asReader();

        assertTrue(reader.ready());
        assertTrue(reader.markSupported());
        assertEquals('H', reader.read());

        reader.mark(10);
        assertEquals('e', reader.read());
        assertEquals('l', reader.read());

        reader.reset();
        assertEquals('e', reader.read());

        char[] buf = new char[5];
        int count = reader.read(buf, 0, 5);
        assertEquals(5, count);
        assertEquals("llo W", new String(buf));

        long skipped = reader.skip(2);
        assertEquals(2, skipped);
        assertEquals('l', reader.read());
        assertEquals('d', reader.read());
        assertEquals(-1, reader.read());

        reader.close(); // no-op
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

        writer.flush(); // no-op
        writer.close(); // no-op

        assertEquals("ABCDEFGHJK", sb.toString());
    }

    @Test
    public void testTokenizerView() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();

        assertEquals("a b c", tok.getContent());
        assertArrayEquals(new String[]{"a", "b", "c"}, tok.getTokenArray());

        sb.append(" d");
        tok.reset();
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, tok.getTokenArray());
    }
}