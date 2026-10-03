package org.apache.commons.lang.text;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

public class StrBuilderTest {

    // -----------------------------------------------------------------------
    // Constructors & Basic Properties
    // -----------------------------------------------------------------------
    @Test
    public void testConstructors() {
        StrBuilder sb1 = new StrBuilder();
        assertEquals(32, sb1.capacity());
        assertEquals(0, sb1.length());
        assertTrue(sb1.isEmpty());

        StrBuilder sb2 = new StrBuilder(-5);
        assertEquals(32, sb2.capacity());

        StrBuilder sb3 = new StrBuilder(64);
        assertEquals(64, sb3.capacity());

        StrBuilder sb4 = new StrBuilder((String) null);
        assertEquals(32, sb4.capacity());
        assertEquals(0, sb4.length());

        StrBuilder sb5 = new StrBuilder("Hello");
        assertEquals(5 + 32, sb5.capacity());
        assertEquals(5, sb5.length());
        assertEquals("Hello", sb5.toString());
    }

    @Test
    public void testNewLineAndNullText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\r\n");
        assertEquals("\r\n", sb.getNewLineText());
        sb.appendNewLine();
        assertEquals("\r\n", sb.toString());

        sb.clear();
        sb.setNewLineText(null);
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());

        assertNull(sb.getNullText());
        sb.setNullText("");
        assertNull(sb.getNullText()); // empty becomes null
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText((String) null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testSetLengthAndCapacity() {
        StrBuilder sb = new StrBuilder("Hello World");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("Hello", sb.toString());

        sb.setLength(7);
        assertEquals(7, sb.length());
        assertEquals("Hello\0\0", sb.toString());

        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);

        sb.ensureCapacity(10); // should not reduce capacity
        assertTrue(sb.capacity() >= 100);

        sb.minimizeCapacity();
        assertEquals(sb.length(), sb.capacity());

        sb.clear();
        assertEquals(0, sb.size());
        assertTrue(sb.isEmpty());
    }

    // -----------------------------------------------------------------------
    // Index & Character Operations
    // -----------------------------------------------------------------------
    @Test
    public void testCharAtAndSetCharAt() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals('a', sb.charAt(0));
        assertEquals('c', sb.charAt(2));

        try {
            sb.charAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.charAt(3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        sb.setCharAt(1, 'x');
        assertEquals("axc", sb.toString());

        try {
            sb.setCharAt(-1, 'z');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.setCharAt(3, 'z');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    @Test
    public void testDeleteCharAt() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());

        try {
            sb.deleteCharAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.deleteCharAt(2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    // -----------------------------------------------------------------------
    // Array Conversions & GetChars
    // -----------------------------------------------------------------------
    @Test
    public void testToCharArrayAndGetChars() {
        StrBuilder empty = new StrBuilder();
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, empty.toCharArray());
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, empty.toCharArray(0, 0));

        StrBuilder sb = new StrBuilder("abcdef");
        char[] chars = sb.toCharArray();
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, chars);

        char[] subChars = sb.toCharArray(1, 4);
        assertArrayEquals(new char[]{'b', 'c', 'd'}, subChars);

        // endIndex treated as size if too large
        char[] overflowChars = sb.toCharArray(4, 10);
        assertArrayEquals(new char[]{'e', 'f'}, overflowChars);

        char[] dest = new char[6];
        char[] returnedDest = sb.getChars(dest);
        assertSame(dest, returnedDest);
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, dest);

        char[] smallDest = new char[2];
        char[] newDest = sb.getChars(smallDest);
        assertEquals(6, newDest.length);

        char[] partDest = new char[5];
        sb.getChars(1, 4, partDest, 1);
        assertArrayEquals(new char[]{'\0', 'b', 'c', 'd', '\0'}, partDest);

        try {
            sb.getChars(-1, 2, partDest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.getChars(0, 10, partDest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.getChars(4, 2, partDest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    // -----------------------------------------------------------------------
    // Append Operations
    // -----------------------------------------------------------------------
    @Test
    public void testAppendsNullAndPrimitives() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("null");
        sb.append((Object) null);
        sb.append((String) null);
        sb.append((StringBuffer) null);
        sb.append((StrBuilder) null);
        sb.append((char[]) null);
        assertEquals("nullnullnullnullnull", sb.toString());

        sb.clear();
        sb.setNullText(null);
        sb.append((Object) null);
        sb.append((String) null);
        assertEquals("", sb.toString());

        sb.append(true).append(false);
        assertEquals("truefalse", sb.toString());

        sb.clear();
        sb.append('X');
        sb.append(123);
        sb.append(123456789L);
        sb.append(1.5f);
        sb.append(2.5d);
        assertEquals("X1231234567891.52.5", sb.toString());
    }

    @Test
    public void testAppendSubStringsAndBuffers() {
        StrBuilder sb = new StrBuilder();
        sb.append("abcdef", 1, 3);
        sb.append(new StringBuffer("ghijk"), 1, 2);
        sb.append(new StrBuilder("lmnop"), 1, 2);
        sb.append(new char[]{'q', 'r', 's', 't'}, 1, 2);
        assertEquals("bchims", sb.toString());

        sb.append("test", 0, 0);
        sb.append(new StringBuffer("test"), 0, 0);
        sb.append(new StrBuilder("test"), 0, 0);
        sb.append(new char[]{'t'}, 0, 0);
        assertEquals("bchims", sb.toString());

        try {
            sb.append("test", -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append("test", 2, 5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new char[]{'a'}, -1, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.append(new char[]{'a'}, 0, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    @Test
    public void testAppendWithSeparators() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());

        sb.appendWithSeparators(new Object[]{"A", "B", "C"}, ",");
        assertEquals("A,B,C", sb.toString());

        sb.clear();
        sb.appendWithSeparators(Arrays.asList("1", "2"), null);
        assertEquals("12", sb.toString());

        sb.clear();
        sb.appendWithSeparators((Collection<?>) null, ",");
        sb.appendWithSeparators(Collections.emptyList(), ",");
        assertEquals("", sb.toString());

        Iterator<String> it = Arrays.asList("X", "Y").iterator();
        sb.appendWithSeparators(it, "-");
        assertEquals("X-Y", sb.toString());

        sb.appendWithSeparators((Iterator<?>) null, "-");
        assertEquals("X-Y", sb.toString());
    }

    @Test
    public void testAppendPaddingAndFixedWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-1, 'x');
        sb.appendPadding(0, 'x');
        assertEquals("", sb.toString());

        sb.appendPadding(3, '-');
        assertEquals("---", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft(12, 4, '0');
        sb.appendFixedWidthPadLeft("ABCDE", 3, '0');
        sb.appendFixedWidthPadLeft((Object) null, 4, ' ');
        assertEquals("0012CDE    ", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadRight(12, 4, '0');
        sb.appendFixedWidthPadRight("ABCDE", 3, '0');
        sb.appendFixedWidthPadRight((Object) null, 4, ' ');
        assertEquals("1200ABC    ", sb.toString());

        sb.clear();
        sb.appendFixedWidthPadLeft("A", -1, '0');
        sb.appendFixedWidthPadRight("A", -1, '0');
        assertEquals("", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Insert Operations
    // -----------------------------------------------------------------------
    @Test
    public void testInsertOperations() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 'b');
        assertEquals("abc", sb.toString());

        sb.insert(0, true);
        assertEquals("trueabc", sb.toString());

        sb.insert(sb.length(), false);
        assertEquals("trueabcfalse", sb.toString());

        sb.clear();
        sb.insert(0, 100);
        sb.insert(3, 200L);
        sb.insert(sb.length(), 1.0f);
        sb.insert(sb.length(), 2.0d);
        assertEquals("1002001.02.0", sb.toString());

        sb.clear();
        sb.setNullText("NULL");
        sb.insert(0, (Object) null);
        sb.insert(4, (String) null);
        sb.insert(sb.length(), (char[]) null);
        assertEquals("NULLNULLNULL", sb.toString());

        sb.clear();
        sb.insert(0, new char[]{'a', 'b', 'c', 'd'}, 1, 2);
        assertEquals("bc", sb.toString());

        try {
            sb.insert(-1, "x");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.insert(10, "x");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.insert(0, new char[]{'a'}, -1, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.insert(0, new char[]{'a'}, 0, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}
    }

    // -----------------------------------------------------------------------
    // Delete & Replace Operations
    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAndReplaceRanges() {
        StrBuilder sb = new StrBuilder("0123456789");
        sb.delete(2, 5);
        assertEquals("0156789", sb.toString());

        sb.delete(5, 20); // endIndex exceeds size
        assertEquals("01567", sb.toString());

        sb.delete(2, 2); // len == 0
        assertEquals("01567", sb.toString());

        try {
            sb.delete(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        try {
            sb.delete(4, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {}

        sb.replace(1, 3, "XYZ");
        assertEquals("0XYZ67", sb.toString());

        sb.replace(0, 1, null); // null replace equals delete
        assertEquals("XYZ67", sb.toString());
    }

    @Test
    public void testDeleteAndReplaceCharAndString() {
        StrBuilder sb = new StrBuilder("abracadabra");
        sb.deleteAll('a');
        assertEquals("brcdbr", sb.toString());

        sb.deleteFirst('b');
        assertEquals("rcdbr", sb.toString());

        sb.deleteFirst('z'); // not found
        assertEquals("rcdbr", sb.toString());

        sb = new StrBuilder("aba ba ba");
        sb.deleteAll("ba");
        assertEquals("a   ", sb.toString());

        sb.deleteAll((String) null);
        sb.deleteAll("");
        assertEquals("a   ", sb.toString());

        sb = new StrBuilder("aba ba ba");
        sb.deleteFirst("ba");
        assertEquals("a ba ba", sb.toString());

        sb.deleteFirst((String) null);
        sb.deleteFirst("");
        assertEquals("a ba ba", sb.toString());

        sb = new StrBuilder("banana");
        sb.replaceAll('a', 'o');
        assertEquals("bonono", sb.toString());
        sb.replaceAll('z', 'x');
        assertEquals("bonono", sb.toString());

        sb.replaceFirst('o', 'a');
        assertEquals("banono", sb.toString());
        sb.replaceFirst('z', 'x');
        assertEquals("banono", sb.toString());

        sb = new StrBuilder("banana");
        sb.replaceAll("an", "XX");
        assertEquals("bXXXXa", sb.toString());
        sb.replaceAll((String) null, "YY");
        sb.replaceAll("", "YY");
        assertEquals("bXXXXa", sb.toString());

        sb = new StrBuilder("banana");
        sb.replaceFirst("an", "XX");
        assertEquals("bXXana", sb.toString());
        sb.replaceFirst((String) null, "YY");
        sb.replaceFirst("", "YY");
        assertEquals("bXXana", sb.toString());
    }

    @Test
    public void testMatcherReplaceAndDelete() {
        StrMatcher aMatcher = StrMatcher.charMatcher('a');
        StrBuilder sb = new StrBuilder("abracadabra");

        sb.deleteFirst(aMatcher);
        assertEquals("bracadabra", sb.toString());

        sb.deleteAll(aMatcher);
        assertEquals("brcdbr", sb.toString());

        sb.deleteAll((StrMatcher) null);
        sb.deleteFirst((StrMatcher) null);
        assertEquals("brcdbr", sb.toString());

        sb = new StrBuilder("abracadabra");
        sb.replaceFirst(aMatcher, "X");
        assertEquals("Xbracadabra", sb.toString());

        sb.replaceAll(aMatcher, "Y");
        assertEquals("XbrYcYYdYYbrY", sb.toString());

        sb.replaceAll((StrMatcher) null, "Z");
        sb.replaceFirst((StrMatcher) null, "Z");
        assertEquals("XbrYcYYdYYbrY", sb.toString());
    }

    // -----------------------------------------------------------------------
    // String Inspection: Trim, Reverse, Substring, Left, Right, Mid
    // -----------------------------------------------------------------------
    @Test
    public void testReverseAndTrim() {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());

        sb.append("12345");
        sb.reverse();
        assertEquals("54321", sb.toString());

        sb.clear();
        sb.append("1234");
        sb.reverse();
        assertEquals("4321", sb.toString());

        sb.clear();
        sb.trim();
        assertEquals("", sb.toString());

        sb.append("   \t  \n");
        sb.trim();
        assertEquals("", sb.toString());

        sb.append("  hello world  \r\n");
        sb.trim();
        assertEquals("hello world", sb.toString());

        sb.clear();
        sb.append("nowhitespace");
        sb.trim();
        assertEquals("nowhitespace", sb.toString());
    }

    @Test
    public void testStartsWithAndEndsWith() {
        StrBuilder sb = new StrBuilder("hello world");
        assertFalse(sb.startsWith(null));
        assertTrue(sb.startsWith(""));
        assertTrue(sb.startsWith("hello"));
        assertFalse(sb.startsWith("world"));
        assertFalse(sb.startsWith("hello world longer"));

        assertFalse(sb.endsWith(null));
        assertTrue(sb.endsWith(""));
        assertTrue(sb.endsWith("world"));
        assertFalse(sb.endsWith("hello"));
        assertFalse(sb.endsWith("hello world longer"));
    }

    @Test
    public void testSubstringsAndLeftRightMid() {
        StrBuilder sb = new StrBuilder("abcdefgh");
        assertEquals("cdefgh", sb.substring(2));
        assertEquals("cde", sb.substring(2, 5));
        assertEquals("cdefgh", sb.substring(2, 20));

        assertEquals("", sb.leftString(-1));
        assertEquals("", sb.leftString(0));
        assertEquals("abc", sb.leftString(3));
        assertEquals("abcdefgh", sb.leftString(10));

        assertEquals("", sb.rightString(-1));
        assertEquals("", sb.rightString(0));
        assertEquals("fgh", sb.rightString(3));
        assertEquals("abcdefgh", sb.rightString(10));

        assertEquals("", sb.midString(2, -1));
        assertEquals("", sb.midString(2, 0));
        assertEquals("", sb.midString(10, 2));
        assertEquals("cde", sb.midString(2, 3));
        assertEquals("cdefgh", sb.midString(2, 10));
        assertEquals("ab", sb.midString(-5, 2));
    }

    // -----------------------------------------------------------------------
    // Search Operations & Lang-60 Boundary Defect Exposure
    // -----------------------------------------------------------------------
    @Test
    public void testContainsAndIndexOfChar_Lang60Defect() {
        StrBuilder sb = new StrBuilder("hello");
        // Capacity is 37 (5 + 32). Characters beyond index 4 are unused '\0'
        assertTrue(sb.capacity() > sb.length());

        // Standard checks
        assertTrue(sb.contains('e'));
        assertFalse(sb.contains('z'));
        assertEquals(1, sb.indexOf('e'));
        assertEquals(1, sb.indexOf('e', 0));
        assertEquals(-1, sb.indexOf('e', 2));
        assertEquals(-1, sb.indexOf('e', 10));
        assertEquals(-1, sb.indexOf('z'));

        // Boundary / Defect Lang-60 Check:
        // '\0' does not exist in "hello", but exists in the raw allocated buffer[5..36]
        assertFalse("contains('0') should be false when '\0' is only in buffer past size", sb.contains('\0'));
        assertEquals("indexOf('0') should return -1", -1, sb.indexOf('\0'));
        assertEquals("indexOf('0', 0) should return -1", -1, sb.indexOf('\0', 0));

        // lastIndexOf
        assertEquals(1, sb.lastIndexOf('e'));
        assertEquals(1, sb.lastIndexOf('e', 3));
        assertEquals(-1, sb.lastIndexOf('e', 0));
        assertEquals(-1, sb.lastIndexOf('z'));
        assertEquals(-1, sb.lastIndexOf('e', -1));
    }

    @Test
    public void testContainsAndIndexOfStringAndMatcher() {
        StrBuilder sb = new StrBuilder("the quick brown fox jumps over the lazy dog");

        assertTrue(sb.contains("quick"));
        assertFalse(sb.contains("cat"));
        assertFalse(sb.contains((String) null));

        assertEquals(4, sb.indexOf("quick"));
        assertEquals(4, sb.indexOf("quick", 0));
        assertEquals(-1, sb.indexOf("quick", 10));
        assertEquals(0, sb.indexOf(""));
        assertEquals(5, sb.indexOf("", 5));
        assertEquals(-1, sb.indexOf((String) null));
        assertEquals(-1, sb.indexOf("quick", 100));
        assertEquals(-1, sb.indexOf("longer than size is impossible to match"));

        // Match single char string
        assertEquals(2, sb.indexOf("e"));

        // Matcher
        StrMatcher foxMatcher = StrMatcher.stringMatcher("fox");
        assertTrue(sb.contains(foxMatcher));
        assertFalse(sb.contains((StrMatcher) null));
        assertEquals(16, sb.indexOf(foxMatcher));
        assertEquals(16, sb.indexOf(foxMatcher, 0));
        assertEquals(-1, sb.indexOf(foxMatcher, 20));
        assertEquals(-1, sb.indexOf((StrMatcher) null));
        assertEquals(-1, sb.indexOf(foxMatcher, 100));

        // lastIndexOf String
        assertEquals(31, sb.lastIndexOf("the"));
        assertEquals(0, sb.lastIndexOf("the", 10));
        assertEquals(-1, sb.lastIndexOf("cat"));
        assertEquals(-1, sb.lastIndexOf((String) null));
        assertEquals(sb.length(), sb.lastIndexOf(""));
        assertEquals(5, sb.lastIndexOf("", 5));
        assertEquals(-1, sb.lastIndexOf("the", -5));

        // lastIndexOf single char
        assertEquals(33, sb.lastIndexOf("e"));

        // lastIndexOf Matcher
        StrMatcher theMatcher = StrMatcher.stringMatcher("the");
        assertEquals(31, sb.lastIndexOf(theMatcher));
        assertEquals(0, sb.lastIndexOf(theMatcher, 10));
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        assertEquals(-1, sb.lastIndexOf(theMatcher, -1));
    }

    // -----------------------------------------------------------------------
    // Views: Tokenizer, Reader, Writer
    // -----------------------------------------------------------------------
    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertArrayEquals(new String[]{"a", "b", "c"}, tok.getTokenArray());
        assertEquals("a b c", tok.getContent());

        sb.append(" d");
        tok.reset();
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, tok.getTokenArray());
    }

    @Test
    public void testAsReader() throws Exception {
        StrBuilder sb = new StrBuilder("Reading Test");
        Reader reader = sb.asReader();

        assertTrue(reader.ready());
        assertTrue(reader.markSupported());
        reader.mark(100);

        assertEquals('R', (char) reader.read());
        assertEquals('e', (char) reader.read());

        reader.reset();
        assertEquals('R', (char) reader.read());

        char[] buf = new char[4];
        int count = reader.read(buf, 0, 4);
        assertEquals(4, count);
        assertEquals("eadi", new String(buf));

        assertEquals(0, reader.read(buf, 0, 0));

        long skipped = reader.skip(2);
        assertEquals(2, skipped);

        assertEquals(' ', (char) reader.read());

        // Skip to end
        reader.skip(100);
        assertFalse(reader.ready());
        assertEquals(-1, reader.read());
        assertEquals(-1, reader.read(buf, 0, 1));
        assertEquals(0, reader.skip(-5));

        try {
            reader.read(buf, -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {}

        reader.close(); // No-op
    }

    @Test
    public void testAsWriter() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();

        writer.write('H');
        writer.write(new char[]{'e', 'l', 'l', 'o'});
        writer.write(new char[]{' ', 'W', 'o', 'r', 'l', 'd'}, 0, 2);
        writer.write("rld");
        writer.write(" - Done!", 0, 8);
        writer.flush(); // No-op
        writer.close(); // No-op

        assertEquals("Hello World - Done!", sb.toString());
    }

    // -----------------------------------------------------------------------
    // Equals, HashCode, ToString
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        StrBuilder sb1 = new StrBuilder("Test");
        StrBuilder sb2 = new StrBuilder("Test");
        StrBuilder sb3 = new StrBuilder("test");
        StrBuilder sb4 = new StrBuilder("Testing");

        assertTrue(sb1.equals(sb1));
        assertTrue(sb1.equals(sb2));
        assertFalse(sb1.equals(sb3));
        assertFalse(sb1.equals(sb4));
        assertFalse(sb1.equals((StrBuilder) null));
        assertFalse(sb1.equals("Test"));

        assertTrue(sb1.equalsIgnoreCase(sb1));
        assertTrue(sb1.equalsIgnoreCase(sb2));
        assertTrue(sb1.equalsIgnoreCase(sb3));
        assertFalse(sb1.equalsIgnoreCase(sb4));
        assertFalse(sb1.equalsIgnoreCase(null));

        assertEquals(sb1.hashCode(), sb2.hashCode());

        assertEquals("Test", sb1.toString());
        assertEquals("Test", sb1.toStringBuffer().toString());
    }
}