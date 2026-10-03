package org.apache.commons.lang.text;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    // ==========================================
    // 1. Constructors & Basic Capacity
    // ==========================================

    @Test
    public void testConstructors() {
        StrBuilder sbDefault = new StrBuilder();
        assertEquals(0, sbDefault.length());
        assertEquals(StrBuilder.CAPACITY, sbDefault.capacity());

        StrBuilder sbNegative = new StrBuilder(-10);
        assertEquals(StrBuilder.CAPACITY, sbNegative.capacity());

        StrBuilder sbZero = new StrBuilder(0);
        assertEquals(StrBuilder.CAPACITY, sbZero.capacity());

        StrBuilder sbCustom = new StrBuilder(50);
        assertEquals(50, sbCustom.capacity());

        StrBuilder sbNullStr = new StrBuilder((String) null);
        assertEquals(0, sbNullStr.length());
        assertEquals(StrBuilder.CAPACITY, sbNullStr.capacity());

        StrBuilder sbStr = new StrBuilder("Hello");
        assertEquals(5, sbStr.length());
        assertEquals(5 + StrBuilder.CAPACITY, sbStr.capacity());
        assertEquals("Hello", sbStr.toString());
    }

    @Test
    public void testSetLengthAndCapacity() {
        sb.append("HelloWorld");
        assertEquals(10, sb.length());
        assertEquals(10, sb.size());
        assertFalse(sb.isEmpty());

        // Shrink
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("Hello", sb.toString());

        // Grow
        sb.setLength(8);
        assertEquals(8, sb.length());
        assertEquals("Hello\0\0\0", sb.toString());

        // Same length
        sb.setLength(8);
        assertEquals(8, sb.length());

        // Ensure Capacity
        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        // Minimize Capacity
        sb.minimizeCapacity();
        assertEquals(sb.length(), sb.capacity());

        // Clear
        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());

        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    // ==========================================
    // 2. Null Text & NewLine Handling
    // ==========================================

    @Test
    public void testNullTextAndNewLine() {
        assertNull(sb.getNullText());
        sb.appendNull();
        assertEquals("", sb.toString());

        sb.setNullText("");
        assertNull(sb.getNullText());

        sb.setNullText("<NULL>");
        assertEquals("<NULL>", sb.getNullText());
        sb.appendNull();
        assertEquals("<NULL>", sb.toString());

        sb.clear();
        assertNull(sb.getNewLineText());
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());

        sb.clear();
        sb.setNewLineText("\n");
        assertEquals("\n", sb.getNewLineText());
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    // ==========================================
    // 3. Append Methods
    // ==========================================

    @Test
    public void testAppendObjectsAndPrimitives() {
        sb.setNullText("NULL");
        sb.append((Object) null);
        sb.append((String) null);
        sb.append((StringBuffer) null);
        sb.append((StrBuilder) null);
        sb.append((char[]) null);
        assertEquals("NULLNULLNULLNULLNULL", sb.toString());

        sb.clear();
        sb.append(new Object() {
            public String toString() { return "Obj"; }
        });
        sb.append("Str");
        sb.append(new StringBuffer("Buf"));
        sb.append(new StrBuilder("Bld"));
        sb.append(new char[]{'A', 'r', 'r'});
        assertEquals("ObjStrBufBldArr", sb.toString());

        sb.clear();
        sb.append(true).append(false);
        sb.append('!');
        sb.append(123);
        sb.append(12345678901L);
        sb.append(1.5f);
        sb.append(2.5d);
        assertEquals("truefalse!123123456789011.52.5", sb.toString());
    }

    @Test
    public void testAppendSubranges() {
        sb.append("0123456789", 2, 4);
        sb.append(new StringBuffer("abcdef"), 1, 3);
        sb.append(new StrBuilder("ABCDEF"), 0, 2);
        sb.append(new char[]{'w', 'x', 'y', 'z'}, 1, 2);
        assertEquals("2345bcdABxy", sb.toString());

        // Zero lengths
        sb.append("test", 1, 0);
        sb.append(new StringBuffer("test"), 1, 0);
        sb.append(new StrBuilder("test"), 1, 0);
        sb.append(new char[]{'a'}, 0, 0);
        assertEquals("2345bcdABxy", sb.toString());

        // Null strings
        sb.setNullText("N");
        sb.append((String) null, 0, 0);
        sb.append((StringBuffer) null, 0, 0);
        sb.append((StrBuilder) null, 0, 0);
        sb.append((char[]) null, 0, 0);
        assertEquals("2345bcdABxyNNNN", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringInvalidStartNegative() {
        sb.append("test", -1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringInvalidStartOver() {
        sb.append("test", 5, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringInvalidLengthOver() {
        sb.append("test", 2, 3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayInvalidOffset() {
        sb.append(new char[]{'a', 'b'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayInvalidLength() {
        sb.append(new char[]{'a', 'b'}, 1, 2);
    }

    @Test
    public void testAppendWithSeparators() {
        sb.appendWithSeparators((Object[]) null, ",");
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[]{"A", "B", null}, ",");
        assertEquals("A,B,", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Collection) null, "-");
        sb.appendWithSeparators(Collections.emptyList(), "-");
        sb.appendWithSeparators(Arrays.asList("X", "Y"), null);
        assertEquals("XY", sb.toString());

        sb.clear();
        List list = Arrays.asList("1", "2", "3");
        sb.appendWithSeparators(list.iterator(), ":");
        assertEquals("1:2:3", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Iterator) null, ":");
        assertEquals("", sb.toString());
    }

    // ==========================================
    // 4. Fixed Width & Padding (Lang-59 Bug Target)
    // ==========================================

    @Test
    public void testAppendPadding() {
        sb.appendPadding(3, 'x');
        sb.appendPadding(-1, 'y');
        sb.appendPadding(0, 'z');
        assertEquals("xxx", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        sb.appendFixedWidthPadLeft("abc", 5, '0');
        assertEquals("00abc", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("abcdef", 3, '0');
        assertEquals("def", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(null, 4, '-');
        assertEquals("----", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadLeft(null, 6, '-');
        assertEquals("--null", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(42, 5, '0');
        assertEquals("00042", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("ignore", 0, ' ');
        sb.appendFixedWidthPadLeft("ignore", -2, ' ');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        sb.appendFixedWidthPadRight("abc", 5, '0');
        assertEquals("abc00", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(null, 4, '-');
        assertEquals("----", sb.toString());

        sb.clear();
        sb.setNullText("null");
        sb.appendFixedWidthPadRight(null, 6, '-');
        assertEquals("null--", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(42, 5, '0');
        assertEquals("42000", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight("ignore", 0, ' ');
        sb.appendFixedWidthPadRight("ignore", -2, ' ');
        assertEquals("", sb.toString());
    }

    /**
     * Defects4J Lang-59 regression test:
     * When strLen > width in appendFixedWidthPadRight, ensure characters are truncated
     * to `width` without throwing buffer copy bounds exception.
     */
    @Test
    public void testAppendFixedWidthPadRightOverLengthBugLang59() {
        sb.appendFixedWidthPadRight("abcdef", 3, '0');
        assertEquals("abc", sb.toString());
    }

    // ==========================================
    // 5. Insert, Delete, and Replace Operations
    // ==========================================

    @Test
    public void testInsertOperations() {
        sb.append("world");
        sb.insert(0, "hello ");
        assertEquals("hello world", sb.toString());

        sb.insert(5, (String) null);
        assertEquals("hello world", sb.toString());

        sb.insert(5, (Object) "!");
        assertEquals("hello! world", sb.toString());

        sb.insert(0, (Object) null);
        assertEquals("hello! world", sb.toString());

        sb.insert(0, new char[]{'A', ' '});
        assertEquals("A hello! world", sb.toString());

        sb.insert(2, new char[]{'B', 'C', 'D'}, 1, 2);
        assertEquals("A CDhello! world", sb.toString());

        sb.insert(0, true);
        sb.insert(sb.length(), false);
        assertEquals("trueA CDhello! worldfalse", sb.toString());

        sb.clear();
        sb.insert(0, 'Z');
        sb.insert(1, 10);
        sb.insert(3, 20L);
        sb.insert(5, 3.5f);
        sb.insert(9, 4.5d);
        assertEquals("Z10203.54.5", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertInvalidIndex() {
        sb.insert(-1, "test");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertInvalidIndexOver() {
        sb.insert(1, "test");
    }

    @Test
    public void testDeleteAndCharAtOperations() {
        sb.append("0123456789");
        assertEquals('0', sb.charAt(0));
        assertEquals('9', sb.charAt(9));

        sb.setCharAt(0, 'A');
        assertEquals("A123456789", sb.toString());

        sb.deleteCharAt(0);
        assertEquals("123456789", sb.toString());

        sb.delete(1, 3);
        assertEquals("1456789", sb.toString());

        sb.delete(5, 100);
        assertEquals("14567", sb.toString());

        sb.clear();
        sb.append("a-b-c-b-a");
        sb.deleteAll('b');
        assertEquals("a--c--a", sb.toString());

        sb.deleteFirst('-');
        assertEquals("a-c--a", sb.toString());

        sb.clear();
        sb.append("foo bar foo baz foo");
        sb.deleteAll("foo");
        assertEquals(" bar  baz ", sb.toString());

        sb.clear();
        sb.append("foo bar foo baz");
        sb.deleteFirst("foo");
        assertEquals(" bar foo baz", sb.toString());

        sb.deleteAll((String) null);
        sb.deleteFirst((String) null);
    }

    @Test
    public void testReplaceOperations() {
        sb.append("the quick brown fox");
        sb.replace(4, 9, "slow");
        assertEquals("the slow brown fox", sb.toString());

        sb.replace(0, 3, "That");
        assertEquals("That slow brown fox", sb.toString());

        sb.replaceAll('o', '0');
        assertEquals("That sl0w br0wn f0x", sb.toString());

        sb.replaceFirst('0', 'o');
        assertEquals("That slow br0wn f0x", sb.toString());

        sb.clear();
        sb.append("cat cat cat");
        sb.replaceAll("cat", "dog");
        assertEquals("dog dog dog", sb.toString());

        sb.replaceFirst("dog", "bird");
        assertEquals("bird dog dog", sb.toString());

        // Replace with null string (deletion)
        sb.replace(0, 5, null);
        assertEquals("dog dog", sb.toString());

        sb.replaceAll((String) null, "any");
        sb.replaceFirst((String) null, "any");
        assertEquals("dog dog", sb.toString());
    }

    @Test
    public void testMatcherReplaceAndDelete() {
        sb.append("a1 b2 c3 d4");
        StrMatcher digitMatcher = StrMatcher.charSetMatcher("0123456789");

        sb.replaceFirst(digitMatcher, "X");
        assertEquals("aX b2 c3 d4", sb.toString());

        sb.replaceAll(digitMatcher, "Y");
        assertEquals("aX bY cY dY", sb.toString());

        sb.deleteFirst(StrMatcher.charSetMatcher("XY"));
        assertEquals("a bY cY dY", sb.toString());

        sb.deleteAll(StrMatcher.charSetMatcher("XY"));
        assertEquals("a b c d", sb.toString());

        // Null matchers
        assertSame(sb, sb.replaceAll((StrMatcher) null, "Z"));
        assertSame(sb, sb.deleteFirst((StrMatcher) null));
    }

    // ==========================================
    // 6. Reverse, Trim, and String Queries
    // ==========================================

    @Test
    public void testReverseAndTrim() {
        sb.reverse();
        assertEquals("", sb.toString());

        sb.append("ABCDE");
        sb.reverse();
        assertEquals("EDCBA", sb.toString());

        sb.clear();
        sb.trim();
        assertEquals("", sb.toString());

        sb.append("   \t  Hello World!  \n ");
        sb.trim();
        assertEquals("Hello World!", sb.toString());

        sb.clear();
        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testStartsAndEndsWith() {
        sb.append("Hello World");
        assertTrue(sb.startsWith("Hello"));
        assertTrue(sb.startsWith(""));
        assertFalse(sb.startsWith("World"));
        assertFalse(sb.startsWith((String) null));
        assertFalse(sb.startsWith("Hello World Longer"));

        assertTrue(sb.endsWith("World"));
        assertTrue(sb.endsWith(""));
        assertFalse(sb.endsWith("Hello"));
        assertFalse(sb.endsWith((String) null));
        assertFalse(sb.endsWith("Longer Hello World"));
    }

    @Test
    public void testSubstringsAndExtractors() {
        sb.append("0123456789");
        assertEquals("0123456789", sb.substring(0));
        assertEquals("56789", sb.substring(5));
        assertEquals("234", sb.substring(2, 5));
        assertEquals("56789", sb.substring(5, 20));

        assertEquals("", sb.leftString(-1));
        assertEquals("", sb.leftString(0));
        assertEquals("012", sb.leftString(3));
        assertEquals("0123456789", sb.leftString(15));

        assertEquals("", sb.rightString(-1));
        assertEquals("", sb.rightString(0));
        assertEquals("789", sb.rightString(3));
        assertEquals("0123456789", sb.rightString(15));

        assertEquals("", sb.midString(-5, 0));
        assertEquals("", sb.midString(2, -1));
        assertEquals("", sb.midString(20, 2));
        assertEquals("012", sb.midString(-5, 3));
        assertEquals("345", sb.midString(3, 3));
        assertEquals("789", sb.midString(7, 10));
    }

    @Test
    public void testSearchMethods() {
        sb.append("ababab");
        assertTrue(sb.contains('a'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("aba"));
        assertFalse(sb.contains("xyz"));
        assertTrue(sb.contains(StrMatcher.stringMatcher("ba")));
        assertFalse(sb.contains((StrMatcher) null));

        assertEquals(0, sb.indexOf('a'));
        assertEquals(2, sb.indexOf('a', 1));
        assertEquals(-1, sb.indexOf('a', 10));
        assertEquals(-1, sb.indexOf('z'));

        assertEquals(0, sb.indexOf("ab"));
        assertEquals(2, sb.indexOf("ab", 1));
        assertEquals(0, sb.indexOf(""));
        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.indexOf("longstringhere"));

        assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a')));
        assertEquals(2, sb.indexOf(StrMatcher.charMatcher('a'), 1));
        assertEquals(-1, sb.indexOf((StrMatcher) null));

        assertEquals(4, sb.lastIndexOf('a'));
        assertEquals(2, sb.lastIndexOf('a', 3));
        assertEquals(-1, sb.lastIndexOf('a', -1));

        assertEquals(4, sb.lastIndexOf("ab"));
        assertEquals(2, sb.lastIndexOf("ab", 3));
        assertEquals(sb.length(), sb.lastIndexOf("", sb.length()));
        assertEquals(-1, sb.lastIndexOf((String) null));

        assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        assertEquals(2, sb.lastIndexOf(StrMatcher.charMatcher('a'), 3));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    // ==========================================
    // 7. Array, Chars, Equals, Views & Adapters
    // ==========================================

    @Test
    public void testCharArraysAndGetChars() {
        assertEquals(0, sb.toCharArray().length);
        assertEquals(0, sb.toCharArray(0, 0).length);

        sb.append("abcdef");
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, sb.toCharArray());
        assertArrayEquals(new char[]{'b', 'c', 'd'}, sb.toCharArray(1, 4));

        char[] dest = new char[6];
        sb.getChars(dest);
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, dest);

        char[] destSmall = new char[2];
        char[] result = sb.getChars(destSmall);
        assertEquals(6, result.length);

        char[] destRange = new char[5];
        sb.getChars(1, 4, destRange, 1);
        assertEquals('\0', destRange[0]);
        assertEquals('b', destRange[1]);
        assertEquals('c', destRange[2]);
        assertEquals('d', destRange[3]);
        assertEquals('\0', destRange[4]);
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("test");
        StrBuilder sb2 = new StrBuilder("test");
        StrBuilder sb3 = new StrBuilder("TEST");
        StrBuilder sb4 = new StrBuilder("different");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((Object) "test"));
        assertFalse(sb1.equals((StrBuilder) null));

        assertTrue(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));

        assertEquals(sb1.hashCode(), sb2.hashCode());
        assertEquals("test", sb1.toStringBuffer().toString());
    }

    @Test
    public void testTokenizerView() {
        sb.append("one two three");
        StrTokenizer tok = sb.asTokenizer();
        assertArrayEquals(new String[]{"one", "two", "three"}, tok.getTokenArray());
        assertEquals("one two three", tok.getContent());
    }

    @Test
    public void testReaderView() throws Exception {
        sb.append("ReaderTest");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
        assertTrue(reader.markSupported());

        assertEquals('R', (char) reader.read());
        reader.mark(10);

        char[] cbuf = new char[5];
        int readCount = reader.read(cbuf, 0, 5);
        assertEquals(5, readCount);
        assertEquals("eader", new String(cbuf));

        reader.reset();
        assertEquals('e', (char) reader.read());

        assertEquals(3, reader.skip(3)); // skip "ade" -> now at 'r'
        assertEquals('r', (char) reader.read());

        reader.close();
    }

    @Test
    public void testWriterView() throws Exception {
        Writer writer = sb.asWriter();
        writer.write('H');
        writer.write(new char[]{'e', 'l'});
        writer.write(new char[]{'l', 'o', '!'}, 0, 2);
        writer.write(" World");
        writer.write("! Extra", 0, 1);
        writer.flush();
        writer.close();

        assertEquals("Hello World!", sb.toString());
    }
}