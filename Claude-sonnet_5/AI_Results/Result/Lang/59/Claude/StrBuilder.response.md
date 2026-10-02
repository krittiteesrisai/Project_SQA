# StrBuilderTest.java

```java
package org.apache.commons.lang.text;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    // ---------------- Constructors ----------------

    @Test
    public void testDefaultConstructor() {
        StrBuilder b = new StrBuilder();
        assertEquals(0, b.length());
        assertEquals(StrBuilder.CAPACITY, b.capacity());
    }

    @Test
    public void testConstructorWithPositiveCapacity() {
        StrBuilder b = new StrBuilder(10);
        assertEquals(10, b.capacity());
    }

    @Test
    public void testConstructorWithZeroCapacity() {
        StrBuilder b = new StrBuilder(0);
        assertEquals(StrBuilder.CAPACITY, b.capacity());
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        StrBuilder b = new StrBuilder(-5);
        assertEquals(StrBuilder.CAPACITY, b.capacity());
    }

    @Test
    public void testConstructorWithNullString() {
        StrBuilder b = new StrBuilder((String) null);
        assertEquals(0, b.length());
        assertEquals(StrBuilder.CAPACITY, b.capacity());
    }

    @Test
    public void testConstructorWithString() {
        StrBuilder b = new StrBuilder("hello");
        assertEquals("hello", b.toString());
        assertEquals(5 + StrBuilder.CAPACITY, b.capacity());
    }

    @Test
    public void testConstructorWithEmptyString() {
        StrBuilder b = new StrBuilder("");
        assertEquals(0, b.length());
    }

    // ---------------- newLine / nullText ----------------

    @Test
    public void testNewLineTextGetSet() {
        assertNull(sb.getNewLineText());
        sb.setNewLineText("abc");
        assertEquals("abc", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testNullTextGetSet() {
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
    }

    @Test
    public void testSetNullTextEmptyBecomesNull() {
        sb.setNullText("");
        assertNull(sb.getNullText());
    }

    @Test
    public void testSetNullTextNull() {
        sb.setNullText("x");
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    // ---------------- length / setLength ----------------

    @Test
    public void testLength() {
        sb.append("abc");
        assertEquals(3, sb.length());
    }

    @Test
    public void testSetLengthNegativeThrows() {
        try {
            sb.setLength(-1);
            fail("expected exception");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSetLengthLessThanSize() {
        sb.append("abcdef");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLengthGreaterThanSize() {
        sb.append("ab");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals('\0', sb.charAt(2));
        assertEquals('\0', sb.charAt(4));
    }

    @Test
    public void testSetLengthEqualsSize() {
        sb.append("abc");
        sb.setLength(3);
        assertEquals("abc", sb.toString());
    }

    // ---------------- capacity / ensureCapacity / minimizeCapacity ----------------

    @Test
    public void testEnsureCapacityNoGrow() {
        StrBuilder b = new StrBuilder(20);
        b.ensureCapacity(5);
        assertEquals(20, b.capacity());
    }

    @Test
    public void testEnsureCapacityGrow() {
        StrBuilder b = new StrBuilder(5);
        b.ensureCapacity(50);
        assertEquals(50, b.capacity());
    }

    @Test
    public void testMinimizeCapacityShrinks() {
        StrBuilder b = new StrBuilder(50);
        b.append("abc");
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
    }

    @Test
    public void testMinimizeCapacityNoChange() {
        StrBuilder b = new StrBuilder(3);
        b.append("abc");
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
    }

    // ---------------- size / isEmpty / clear ----------------

    @Test
    public void testSize() {
        sb.append("xy");
        assertEquals(2, sb.size());
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        sb.append("a");
        assertFalse(sb.isEmpty());
    }

    @Test
    public void testClear() {
        sb.append("abc");
        sb.clear();
        assertEquals(0, sb.length());
    }

    // ---------------- charAt / setCharAt / deleteCharAt ----------------

    @Test
    public void testCharAtValid() {
        sb.append("abc");
        assertEquals('b', sb.charAt(1));
    }

    @Test
    public void testCharAtNegativeThrows() {
        sb.append("abc");
        try {
            sb.charAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testCharAtTooLargeThrows() {
        sb.append("abc");
        try {
            sb.charAt(3);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testSetCharAtValid() {
        sb.append("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
    }

    @Test
    public void testSetCharAtInvalidThrows() {
        sb.append("abc");
        try {
            sb.setCharAt(5, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testDeleteCharAtValid() {
        sb.append("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testDeleteCharAtInvalidThrows() {
        sb.append("abc");
        try {
            sb.deleteCharAt(10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- toCharArray ----------------

    @Test
    public void testToCharArrayEmpty() {
        char[] arr = sb.toCharArray();
        assertEquals(0, arr.length);
    }

    @Test
    public void testToCharArrayNonEmpty() {
        sb.append("abc");
        char[] arr = sb.toCharArray();
        assertArrayEquals(new char[]{'a','b','c'}, arr);
    }

    @Test
    public void testToCharArrayRangeEmpty() {
        sb.append("abcdef");
        char[] arr = sb.toCharArray(2, 2);
        assertEquals(0, arr.length);
    }

    @Test
    public void testToCharArrayRangeNonEmpty() {
        sb.append("abcdef");
        char[] arr = sb.toCharArray(1, 4);
        assertArrayEquals(new char[]{'b','c','d'}, arr);
    }

    @Test
    public void testToCharArrayRangeEndTooLarge() {
        sb.append("abc");
        char[] arr = sb.toCharArray(0, 100);
        assertArrayEquals(new char[]{'a','b','c'}, arr);
    }

    // ---------------- getChars ----------------

    @Test
    public void testGetCharsNullDestination() {
        sb.append("abc");
        char[] dest = sb.getChars(null);
        assertArrayEquals(new char[]{'a','b','c'}, dest);
    }

    @Test
    public void testGetCharsTooSmallDestination() {
        sb.append("abc");
        char[] dest = sb.getChars(new char[1]);
        assertArrayEquals(new char[]{'a','b','c'}, dest);
    }

    @Test
    public void testGetCharsSufficientDestination() {
        sb.append("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertSame(dest, result);
    }

    @Test
    public void testGetChars4ArgValid() {
        sb.append("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 0);
        assertEquals('b', dest[0]);
        assertEquals('c', dest[1]);
        assertEquals('d', dest[2]);
    }

    @Test
    public void testGetChars4ArgStartNegativeThrows() {
        sb.append("abc");
        try {
            sb.getChars(-1, 2, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4ArgEndNegativeThrows() {
        sb.append("abc");
        try {
            sb.getChars(0, -1, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4ArgEndTooLargeThrows() {
        sb.append("abc");
        try {
            sb.getChars(0, 10, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4ArgStartGreaterThanEndThrows() {
        sb.append("abc");
        try {
            sb.getChars(2, 1, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- appendNewLine / appendNull ----------------

    @Test
    public void testAppendNewLineDefault() {
        sb.appendNewLine();
        assertEquals(System.getProperty("line.separator"), sb.toString());
    }

    @Test
    public void testAppendNewLineCustom() {
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testAppendNullNoNullText() {
        sb.appendNull();
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendNullWithNullText() {
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    // ---------------- append(Object) ----------------

    @Test
    public void testAppendObjectNull() {
        sb.append((Object) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendObjectNullWithNullText() {
        sb.setNullText("N");
        sb.append((Object) null);
        assertEquals("N", sb.toString());
    }

    @Test
    public void testAppendObjectNonNull() {
        sb.append((Object) Integer.valueOf(42));
        assertEquals("42", sb.toString());
    }

    // ---------------- append(String) ----------------

    @Test
    public void testAppendStringNull() {
        sb.append((String) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringEmpty() {
        sb.append("");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringNonEmpty() {
        sb.append("hello");
        assertEquals("hello", sb.toString());
    }

    // ---------------- append(String, start, len) ----------------

    @Test
    public void testAppendStringRangeNull() {
        sb.append((String) null, 0, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringRangeStartNegativeThrows() {
        try {
            sb.append("abc", -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringRangeStartTooLargeThrows() {
        try {
            sb.append("abc", 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringRangeLengthNegativeThrows() {
        try {
            sb.append("abc", 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringRangeLengthTooLargeThrows() {
        try {
            sb.append("abc", 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringRangeLengthZero() {
        sb.append("abc", 1, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringRangeValid() {
        sb.append("abcdef", 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ---------------- append(StringBuffer) ----------------

    @Test
    public void testAppendStringBufferNull() {
        sb.append((StringBuffer) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringBufferEmpty() {
        sb.append(new StringBuffer(""));
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringBufferNonEmpty() {
        sb.append(new StringBuffer("abc"));
        assertEquals("abc", sb.toString());
    }

    // ---------------- append(StringBuffer, start, len) ----------------

    @Test
    public void testAppendStringBufferRangeNull() {
        sb.append((StringBuffer) null, 0, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringBufferRangeStartNegativeThrows() {
        try {
            sb.append(new StringBuffer("abc"), -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringBufferRangeStartTooLargeThrows() {
        try {
            sb.append(new StringBuffer("abc"), 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringBufferRangeLenNegativeThrows() {
        try {
            sb.append(new StringBuffer("abc"), 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringBufferRangeLenTooLargeThrows() {
        try {
            sb.append(new StringBuffer("abc"), 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringBufferRangeLenZero() {
        sb.append(new StringBuffer("abc"), 1, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStringBufferRangeValid() {
        sb.append(new StringBuffer("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ---------------- append(StrBuilder) ----------------

    @Test
    public void testAppendStrBuilderNull() {
        sb.append((StrBuilder) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStrBuilderEmpty() {
        sb.append(new StrBuilder());
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStrBuilderNonEmpty() {
        sb.append(new StrBuilder("abc"));
        assertEquals("abc", sb.toString());
    }

    // ---------------- append(StrBuilder, start, len) ----------------

    @Test
    public void testAppendStrBuilderRangeNull() {
        sb.append((StrBuilder) null, 0, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStrBuilderRangeStartNegativeThrows() {
        try {
            sb.append(new StrBuilder("abc"), -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStrBuilderRangeStartTooLargeThrows() {
        try {
            sb.append(new StrBuilder("abc"), 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStrBuilderRangeLenNegativeThrows() {
        try {
            sb.append(new StrBuilder("abc"), 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStrBuilderRangeLenTooLargeThrows() {
        try {
            sb.append(new StrBuilder("abc"), 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStrBuilderRangeLenZero() {
        sb.append(new StrBuilder("abc"), 1, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendStrBuilderRangeValid() {
        sb.append(new StrBuilder("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ---------------- append(char[]) ----------------

    @Test
    public void testAppendCharArrayNull() {
        sb.append((char[]) null);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        sb.append(new char[0]);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendCharArrayNonEmpty() {
        sb.append(new char[]{'a','b','c'});
        assertEquals("abc", sb.toString());
    }

    // ---------------- append(char[], start, len) ----------------

    @Test
    public void testAppendCharArrayRangeNull() {
        sb.append((char[]) null, 0, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendCharArrayRangeStartNegativeThrows() {
        try {
            sb.append(new char[]{'a','b','c'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendCharArrayRangeStartTooLargeThrows() {
        try {
            sb.append(new char[]{'a','b','c'}, 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendCharArrayRangeLenNegativeThrows() {
        try {
            sb.append(new char[]{'a','b','c'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendCharArrayRangeLenTooLargeThrows() {
        try {
            sb.append(new char[]{'a','b','c'}, 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendCharArrayRangeLenZero() {
        sb.append(new char[]{'a','b','c'}, 1, 0);
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendCharArrayRangeValid() {
        sb.append(new char[]{'a','b','c','d','e','f'}, 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ---------------- append(boolean) ----------------

    @Test
    public void testAppendBooleanTrue() {
        sb.append(true);
        assertEquals("true", sb.toString());
    }

    @Test
    public void testAppendBooleanFalse() {
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    // ---------------- append(char) ----------------

    @Test
    public void testAppendChar() {
        sb.append('x');
        assertEquals("x", sb.toString());
    }

    // ---------------- append(int/long/float/double) ----------------

    @Test
    public void testAppendInt() {
        sb.append(123);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppendLong() {
        sb.append(123L);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppendFloat() {
        sb.append(1.5f);
        assertEquals(String.valueOf(1.5f), sb.toString());
    }

    @Test
    public void testAppendDouble() {
        sb.append(1.5d);
        assertEquals(String.valueOf(1.5d), sb.toString());
    }

    // ---------------- appendWithSeparators(Object[],String) ----------------

    @Test
    public void testAppendWithSeparatorsArrayNull() {
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsArrayEmpty() {
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsArrayNonEmptyNullSeparator() {
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayNonEmptyWithSeparator() {
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, "-");
        assertEquals("a-b-c", sb.toString());
    }

    // ---------------- appendWithSeparators(Collection,String) ----------------

    @Test
    public void testAppendWithSeparatorsCollectionNull() {
        sb.appendWithSeparators((Collection) null, ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsCollectionEmpty() {
        sb.appendWithSeparators(new ArrayList(), ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNonEmpty() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list, "-");
        assertEquals("a-b", sb.toString());
    }

    // ---------------- appendWithSeparators(Iterator,String) ----------------

    @Test
    public void testAppendWithSeparatorsIteratorNull() {
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNonEmpty() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list.iterator(), "-");
        assertEquals("a-b", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorEmpty() {
        sb.appendWithSeparators(new ArrayList().iterator(), "-");
        assertEquals(0, sb.length());
    }

    // ---------------- appendPadding ----------------

    @Test
    public void testAppendPaddingPositive() {
        sb.appendPadding(3, 'x');
        assertEquals("xxx", sb.toString());
    }

    @Test
    public void testAppendPaddingZero() {
        sb.appendPadding(0, 'x');
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendPaddingNegative() {
        sb.appendPadding(-1, 'x');
        assertEquals(0, sb.length());
    }

    // ---------------- appendFixedWidthPadLeft(Object) ----------------

    @Test
    public void testAppendFixedWidthPadLeftWidthZero() {
        sb.appendFixedWidthPadLeft("abc", 0, '*');
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendFixedWidthPadLeftWidthNegative() {
        sb.appendFixedWidthPadLeft("abc", -1, '*');
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrLongerThanWidth() {
        sb.appendFixedWidthPadLeft("abcdef", 3, '*');
        assertEquals("def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrShorterThanWidth() {
        sb.appendFixedWidthPadLeft("ab", 5, '*');
        assertEquals("***ab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftNullObjUsesNullText() {
        sb.setNullText("NULL");
        sb.appendFixedWidthPadLeft((Object) null, 6, '*');
        assertEquals("  NULL", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftNullObjNoNullTextThrowsNPE() {
        // obj == null and nullText is null -> str = null -> NPE expected on str.length()
        try {
            sb.appendFixedWidthPadLeft((Object) null, 5, '*');
            fail("expected NPE because nullText is null");
        } catch (NullPointerException e) {
            // expected per source behavior (str.length() on null)
        }
    }

    // ---------------- appendFixedWidthPadLeft(int) ----------------

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        sb.appendFixedWidthPadLeft(42, 5, '0');
        assertEquals("00042", sb.toString());
    }

    // ---------------- appendFixedWidthPadRight(Object) ----------------

    @Test
    public void testAppendFixedWidthPadRightWidthZero() {
        sb.appendFixedWidthPadRight("abc", 0, '*');
        assertEquals(0, sb.length());
    }

    @Test
    public void testAppendFixedWidthPadRightStrLongerThanWidth() {
        sb.appendFixedWidthPadRight("abcdef", 3, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightStrShorterThanWidth() {
        sb.appendFixedWidthPadRight("ab", 5, '*');
        assertEquals("ab***", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightNullObjUsesNullText() {
        sb.setNullText("NULL");
        sb.appendFixedWidthPadRight((Object) null, 6, '*');
        assertEquals("NULL  ", sb.toString());
    }

    // ---------------- appendFixedWidthPadRight(int) ----------------

    @Test
    public void testAppendFixedWidthPadRightInt() {
        sb.appendFixedWidthPadRight(42, 5, '0');
        assertEquals("42000", sb.toString());
    }

    // ---------------- insert(int, Object) ----------------

    @Test
    public void testInsertObjectNull() {
        sb.append("ac");
        sb.insert(1, (Object) null);
        assertEquals("ac", sb.toString()); // nullText is null -> no insert
    }

    @Test
    public void testInsertObjectNullWithNullText() {
        sb.setNullText("X");
        sb.append("ac");
        sb.insert(1, (Object) null);
        assertEquals("aXc", sb.toString());
    }

    @Test
    public void testInsertObjectNonNull() {
        sb.append("ac");
        sb.insert(1, Integer.valueOf(9));
        assertEquals("a9c", sb.toString());
    }

    // ---------------- insert(int, String) ----------------

    @Test
    public void testInsertStringInvalidIndexThrows() {
        sb.append("abc");
        try {
            sb.insert(-1, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertStringIndexTooLargeThrows() {
        sb.append("abc");
        try {
            sb.insert(10, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertStringNullNoNullText() {
        sb.append("ac");
        sb.insert(1, (String) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        sb.append("ac");
        sb.insert(1, "");
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertStringValid() {
        sb.append("ac");
        sb.insert(1, "B");
        assertEquals("aBc", sb.toString());
    }

    @Test
    public void testInsertStringAtIndexZero() {
        sb.append("bc");
        sb.insert(0, "a");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testInsertStringAtEnd() {
        sb.append("ab");
        sb.insert(2, "c");
        assertEquals("abc", sb.toString());
    }

    // ---------------- insert(int, char[]) ----------------

    @Test
    public void testInsertCharArrayInvalidIndexThrows() {
        sb.append("abc");
        try {
            sb.insert(-1, new char[]{'x'});
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayNullNoNullText() {
        sb.append("ac");
        sb.insert(1, (char[]) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayEmpty() {
        sb.append("ac");
        sb.insert(1, new char[0]);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayValid() {
        sb.append("ac");
        sb.insert(1, new char[]{'B', 'C'});
        assertEquals("aBCc", sb.toString());
    }

    // ---------------- insert(int, char[], offset, length) ----------------

    @Test
    public void testInsertCharArrayRangeInvalidIndexThrows() {
        sb.append("abc");
        try {
            sb.insert(-1, new char[]{'x'}, 0, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRangeNullNoNullText() {
        sb.append("ac");
        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayRangeOffsetNegativeThrows() {
        sb.append("ac");
        try {
            sb.insert(1, new char[]{'x','y'}, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRangeOffsetTooLargeThrows() {
        sb.append("ac");
        try {
            sb.insert(1, new char[]{'x','y'}, 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRangeLengthNegativeThrows() {
        sb.append("ac");
        try {
            sb.insert(1, new char[]{'x','y'}, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRangeLengthTooLargeThrows() {
        sb.append("ac");
        try {
            sb.insert(1, new char[]{'x','y'}, 1, 5);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRangeLengthZero() {
        sb.append("ac");
        sb.insert(1, new char[]{'x','y'}, 0, 0);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayRangeValid() {
        sb.append("ac");
        sb.insert(1, new char[]{'w','x','y','z'}, 1, 2);
        assertEquals("axyc", sb.toString());
    }

    // ---------------- insert(int, boolean) ----------------

    @Test
    public void testInsertBooleanTrue() {
        sb.append("ac");
        sb.insert(1, true);
        assertEquals("atruec", sb.toString());
    }

    @Test
    public void testInsertBooleanFalse() {
        sb.append("ac");
        sb.insert(1, false);
        assertEquals("afalsec", sb.toString());
    }

    @Test
    public void testInsertBooleanInvalidIndexThrows() {
        sb.append("abc");
        try {
            sb.insert(-1, true);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- insert(int, char) ----------------

    @Test
    public void testInsertChar() {
        sb.append("ac");
        sb.insert(1, 'B');
        assertEquals("aBc", sb.toString());
    }

    @Test
    public void testInsertCharInvalidIndexThrows() {
        sb.append("abc");
        try {
            sb.insert(-1, 'x');
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- insert(int,int/long/float/double) ----------------

    @Test
    public void testInsertInt() {
        sb.append("ac");
        sb.insert(1, 9);
        assertEquals("a9c", sb.toString());
    }

    @Test
    public void testInsertLong() {
        sb.append("ac");
        sb.insert(1, 9L);
        assertEquals("a9c", sb.toString());
    }

    @Test
    public void testInsertFloat() {
        sb.append("ac");
        sb.insert(1, 1.5f);
        assertEquals("a" + String.valueOf(1.5f) + "c", sb.toString());
    }

    @Test
    public void testInsertDouble() {
        sb.append("ac");
        sb.insert(1, 1.5d);
        assertEquals("a" + String.valueOf(1.5d) + "c", sb.toString());
    }

    // ---------------- delete ----------------

    @Test
    public void testDeleteValidRange() {
        sb.append("abcdef");
        sb.delete(1, 3);
        assertEquals("adef", sb.toString());
    }

    @Test
    public void testDeleteZeroLength() {
        sb.append("abc");
        sb.delete(1, 1);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteStartNegativeThrows() {
        sb.append("abc");
        try {
            sb.delete(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testDeleteEndTooLargeTreatedAsSize() {
        sb.append("abc");
        sb.delete(1, 100);
        assertEquals("a", sb.toString());
    }

    @Test
    public void testDeleteStartGreaterThanEndThrows() {
        sb.append("abc");
        try {
            sb.delete(2, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- deleteAll(char) ----------------

    @Test
    public void testDeleteAllCharNoMatch() {
        sb.append("abc");
        sb.deleteAll('z');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllCharSingleMatch() {
        sb.append("abcabc");
        sb.deleteAll('b');
        assertEquals("acac", sb.toString());
    }

    @Test
    public void testDeleteAllCharConsecutiveMatches() {
        sb.append("aabbccbb");
        sb.deleteAll('b');
        assertEquals("aacc", sb.toString());
    }

    @Test
    public void testDeleteAllCharEmptyBuilder() {
        sb.deleteAll('x');
        assertEquals(0, sb.length());
    }

    // ---------------- deleteFirst(char) ----------------

    @Test
    public void testDeleteFirstCharFound() {
        sb.append("abcabc");
        sb.deleteFirst('b');
        assertEquals("acabc", sb.toString());
    }

    @Test
    public void testDeleteFirstCharNotFound() {
        sb.append("abc");
        sb.deleteFirst('z');
        assertEquals("abc", sb.toString());
    }

    // ---------------- deleteAll(String) ----------------

    @Test
    public void testDeleteAllStringNull() {
        sb.append("abc");
        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringEmpty() {
        sb.append("abc");
        sb.deleteAll("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringMultipleMatches() {
        sb.append("abXcdXefX");
        sb.deleteAll("X");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteAllStringNoMatch() {
        sb.append("abc");
        sb.deleteAll("z");
        assertEquals("abc", sb.toString());
    }

    // ---------------- deleteFirst(String) ----------------

    @Test
    public void testDeleteFirstStringNull() {
        sb.append("abc");
        sb.deleteFirst((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringFound() {
        sb.append("abXcdX");
        sb.deleteFirst("X");
        assertEquals("abcdX", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNotFound() {
        sb.append("abc");
        sb.deleteFirst("z");
        assertEquals("abc", sb.toString());
    }

    // ---------------- replace(start,end,str) ----------------

    @Test
    public void testReplaceValid() {
        sb.append("abcdef");
        sb.replace(1, 3, "XYZ");
        assertEquals("aXYZdef", sb.toString());
    }

    @Test
    public void testReplaceWithShorterString() {
        sb.append("abcdef");
        sb.replace(1, 4, "X");
        assertEquals("aXef", sb.toString());
    }

    @Test
    public void testReplaceWithNullString() {
        sb.append("abcdef");
        sb.replace(1, 4, null);
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testReplaceSameLength() {
        sb.append("abcdef");
        sb.replace(1, 3, "XY");
        assertEquals("aXYdef", sb.toString());
    }

    // ---------------- replaceAll(char,char) ----------------

    @Test
    public void testReplaceAllCharSameSearchReplace() {
        sb.append("abc");
        sb.replaceAll('b', 'b');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllCharDifferent() {
        sb.append("abcabc");
        sb.replaceAll('b', 'X');
        assertEquals("aXcaXc", sb.toString());
    }

    // ---------------- replaceFirst(char,char) ----------------

    @Test
    public void testReplaceFirstCharSameSearchReplace() {
        sb.append("abc");
        sb.replaceFirst('b', 'b');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharDifferent() {
        sb.append("abcabc");
        sb.replaceFirst('b', 'X');
        assertEquals("aXcabc", sb.toString());
    }

    // ---------------- replaceAll(String,String) ----------------

    @Test
    public void testReplaceAllStringNullSearch() {
        sb.append("abc");
        sb.replaceAll((String) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringEmptySearch() {
        sb.append("abc");
        sb.replaceAll("", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringMultipleMatches() {
        sb.append("aXbXc");
        sb.replaceAll("X", "-");
        assertEquals("a-b-c", sb.toString());
    }

    @Test
    public void testReplaceAllStringNullReplace() {
        sb.append("aXbXc");
        sb.replaceAll("X", null);
        assertEquals("abc", sb.toString());
    }

    // ---------------- replaceFirst(String,String) ----------------

    @Test
    public void testReplaceFirstStringNullSearch() {
        sb.append("abc");
        sb.replaceFirst((String) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringFound() {
        sb.append("aXbXc");
        sb.replaceFirst("X", "-");
        assertEquals("a-bXc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNotFound() {
        sb.append("abc");
        sb.replaceFirst("Z", "-");
        assertEquals("abc", sb.toString());
    }

    // ---------------- replace with StrMatcher ----------------

    @Test
    public void testReplaceAllMatcherNullMatcher() {
        sb.append("abc");
        sb.replaceAll((StrMatcher) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllMatcherEmptyBuilder() {
        sb.replaceAll(StrMatcher.charMatcher('a'), "X");
        assertEquals(0, sb.length());
    }

    @Test
    public void testReplaceAllMatcherMultipleMatches() {
        sb.append("aXbXc");
        sb.replaceAll(StrMatcher.charMatcher('X'), "-");
        assertEquals("a-b-c", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherFound() {
        sb.append("aXbXc");
        sb.replaceFirst(StrMatcher.charMatcher('X'), "-");
        assertEquals("a-bXc", sb.toString());
    }

    @Test
    public void testDeleteAllMatcher() {
        sb.append("aXbXc");
        sb.deleteAll(StrMatcher.charMatcher('X'));
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcher() {
        sb.append("aXbXc");
        sb.deleteFirst(StrMatcher.charMatcher('X'));
        assertEquals("abXc", sb.toString());
    }

    // ---------------- reverse ----------------

    @Test
    public void testReverseEmpty() {
        sb.reverse();
        assertEquals(0, sb.length());
    }

    @Test
    public void testReverseOddLength() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testReverseEvenLength() {
        sb.append("abcd");
        sb.reverse();
        assertEquals("dcba", sb.toString());
    }

    // ---------------- trim ----------------

    @Test
    public void testTrimEmpty() {
        sb.trim();
        assertEquals(0, sb.length());
    }

    @Test
    public void testTrimNoWhitespace() {
        sb.append("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimLeadingAndTrailing() {
        sb.append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimAllWhitespace() {
        sb.append("   ");
        sb.trim();
        assertEquals(0, sb.length());
    }

    // ---------------- startsWith ----------------

    @Test
    public void testStartsWithNull() {
        sb.append("abc");
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWithEmpty() {
        sb.append("abc");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWithLongerThanSize() {
        sb.append("ab");
        assertFalse(sb.startsWith("abcdef"));
    }

    @Test
    public void testStartsWithMatch() {
        sb.append("abcdef");
        assertTrue(sb.startsWith("abc"));
    }

    @Test
    public void testStartsWithNoMatch() {
        sb.append("abcdef");
        assertFalse(sb.startsWith("xyz"));
    }

    // ---------------- endsWith ----------------

    @Test
    public void testEndsWithNull() {
        sb.append("abc");
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWithEmpty() {
        sb.append("abc");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWithLongerThanSize() {
        sb.append("ab");
        assertFalse(sb.endsWith("abcdef"));
    }

    @Test
    public void testEndsWithMatch() {
        sb.append("abcdef");
        assertTrue(sb.endsWith("def"));
    }

    @Test
    public void testEndsWithNoMatch() {
        sb.append("abcdef");
        assertFalse(sb.endsWith("xyz"));
    }

    // ---------------- substring ----------------

    @Test
    public void testSubstringOneArg() {
        sb.append("abcdef");
        assertEquals("cdef", sb.substring(2));
    }

    @Test
    public void testSubstringTwoArgs() {
        sb.append("abcdef");
        assertEquals("bcd", sb.substring(1, 4));
    }

    @Test
    public void testSubstringEndTooLarge() {
        sb.append("abc");
        assertEquals("bc", sb.substring(1, 100));
    }

    @Test
    public void testSubstringStartNegativeThrows() {
        sb.append("abc");
        try {
            sb.substring(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ---------------- leftString ----------------

    @Test
    public void testLeftStringNegative() {
        sb.append("abc");
        assertEquals("", sb.leftString(-1));
    }

    @Test
    public void testLeftStringZero() {
        sb.append("abc");
        assertEquals("", sb.leftString(0));
    }

    @Test
    public void testLeftStringGreaterThanSize() {
        sb.append("abc");
        assertEquals("abc", sb.leftString(100));
    }

    @Test
    public void testLeftStringEqualsSize() {
        sb.append("abc");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringLessThanSize() {
        sb.append("abcdef");
        assertEquals("abc", sb.leftString(3));
    }

    // ---------------- rightString ----------------

    @Test
    public void testRightStringNegative() {
        sb.append("abc");
        assertEquals("", sb.rightString(-1));
    }

    @Test
    public void testRightStringZero() {
        sb.append("abc");
        assertEquals("", sb.rightString(0));
    }

    @Test
    public void testRightStringGreaterThanSize() {
        sb.append("abc");
        assertEquals("abc", sb.rightString(100));
    }

    @Test
    public void testRightStringEqualsSize() {
        sb.append("abc");
        assertEquals("abc", sb.rightString(3));
    }

    @Test
    public void testRightStringLessThanSize() {
        sb.append("abcdef");
        assertEquals("def", sb.rightString(3));
    }

    // ---------------- midString ----------------

    @Test
    public void testMidStringNegativeIndex() {
        sb.append("abcdef");
        assertEquals("abc", sb.midString(-2, 3));
    }

    @Test
    public void testMidStringLengthNegative() {
        sb.append("abcdef");
        assertEquals("", sb.midString(1, -1));
    }

    @Test
    public void testMidStringIndexGreaterThanSize() {
        sb.append("abc");
        assertEquals("", sb.midString(10, 2));
    }

    @Test
    public void testMidStringInsufficientChars() {
        sb.append("abcdef");
        assertEquals("def", sb.midString(3, 10));
    }

    @Test
    public void testMidStringNormal() {
        sb.append("abcdef");
        assertEquals("bcd", sb.midString(1, 3));
    }

    // ---------------- contains(char) ----------------

    @Test
    public void testContainsCharTrue() {
        sb.append("abc");
        assertTrue(sb.contains('b'));
    }

    @Test
    public void testContainsCharFalse() {
        sb.append("abc");
        assertFalse(sb.contains('z'));
    }

    // ---------------- contains(String) ----------------

    @Test
    public void testContainsStringTrue() {
        sb.append("abcdef");
        assertTrue(sb.contains("cd"));
    }

    @Test
    public void testContainsStringFalse() {
        sb.append("abcdef");
        assertFalse(sb.contains("xyz"));
    }

    // ---------------- contains(StrMatcher) ----------------

    @Test
    public void testContainsMatcherTrue() {
        sb.append("abc");
        assertTrue(sb.contains(StrMatcher.charMatcher('b')));
    }

    @Test
    public void testContainsMatcherFalse() {
        sb.append("abc");
        assertFalse(sb.contains(StrMatcher.charMatcher('z')));
    }

    // ---------------- indexOf(char) / indexOf(char,start) ----------------

    @Test
    public void testIndexOfCharFound() {
        sb.append("abcabc");
        assertEquals(1, sb.indexOf('b'));
    }

    @Test
    public void testIndexOfCharNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('z'));
    }

    @Test
    public void testIndexOfCharStartNegative() {
        sb.append("abc");
        assertEquals(0, sb.indexOf('a', -5));
    }

    @Test
    public void testIndexOfCharStartTooLarge() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('a', 10));
    }

    // ---------------- indexOf(String) / indexOf(String,start) ----------------

    @Test
    public void testIndexOfStringNull() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf((String) null, 0));
    }

    @Test
    public void testIndexOfStringStartTooLarge() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf("a", 10));
    }

    @Test
    public void testIndexOfStringStartNegative() {
        sb.append("abc");
        assertEquals(0, sb.indexOf("a", -5));
    }

    @Test
    public void testIndexOfStringLengthOne() {
        sb.append("abcabc");
        assertEquals(1, sb.indexOf("b", 0));
    }

    @Test
    public void testIndexOfStringLengthZero() {
        sb.append("abc");
        assertEquals(2, sb.indexOf("", 2));
    }

    @Test
    public void testIndexOfStringLongerThanSize() {
        sb.append("ab");
        assertEquals(-1, sb.indexOf("abcdef", 0));
    }

    @Test
    public void testIndexOfStringFoundMultiChar() {
        sb.append("abcdef");
        assertEquals(2, sb.indexOf("cde", 0));
    }

    @Test
    public void testIndexOfStringNotFoundMultiChar() {
        sb.append("abcdef");
        assertEquals(-1, sb.indexOf("xyz", 0));
    }

    // ---------------- indexOf(StrMatcher) ----------------

    @Test
    public void testIndexOfMatcherNull() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
    }

    @Test
    public void testIndexOfMatcherStartTooLarge() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 10));
    }

    @Test
    public void testIndexOfMatcherFound() {
        sb.append("abc");
        assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 0));
    }

    @Test
    public void testIndexOfMatcherNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('z'), 0));
    }

    // ---------------- lastIndexOf(char) ----------------

    @Test
    public void testLastIndexOfCharFound() {
        sb.append("abcabc");
        assertEquals(4, sb.lastIndexOf('b'));
    }

    @Test
    public void testLastIndexOfCharNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf('z'));
    }

    @Test
    public void testLastIndexOfCharStartTooLarge() {
        sb.append("abc");
        assertEquals(2, sb.lastIndexOf('c', 10));
    }

    @Test
    public void testLastIndexOfCharStartNegative() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf('a', -1));
    }

    // ---------------- lastIndexOf(String) ----------------

    @Test
    public void testLastIndexOfStringNull() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOfStringStartNegative() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf("a", -1));
    }

    @Test
    public void testLastIndexOfStringLengthOne() {
        sb.append("abcabc");
        assertEquals(4, sb.lastIndexOf("b", sb.length() - 1));
    }

    @Test
    public void testLastIndexOfStringLengthZero() {
        sb.append("abc");
        assertEquals(2, sb.lastIndexOf("", 2));
    }

    @Test
    public void testLastIndexOfStringLongerThanSize() {
        sb.append("ab");
        assertEquals(-1, sb.lastIndexOf("abcdef", 1));
    }

    @Test
    public void testLastIndexOfStringFoundMultiChar() {
        sb.append("abcdefabc");
        assertEquals(0, sb.lastIndexOf("abc", 5));
    }

    @Test
    public void testLastIndexOfStringNotFoundMultiChar() {
        sb.append("abcdef");
        assertEquals(-1, sb.lastIndexOf("xyz", sb.length() - 1));
    }

    // ---------------- lastIndexOf(StrMatcher) ----------------

    @Test
    public void testLastIndexOfMatcherNull() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOfMatcherStartNegativeAfterAdjust() {
        StrBuilder empty = new StrBuilder();
        assertEquals(-1, empty.lastIndexOf(StrMatcher.charMatcher('a'), 0));
    }

    @Test
    public void testLastIndexOfMatcherFound() {
        sb.append("abcabc");
        assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('b'), sb.length()));
    }

    @Test
    public void testLastIndexOfMatcherNotFound() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('z'), sb.length()));
    }

    // ---------------- asTokenizer / asReader / asWriter ----------------

    @Test
    public void testAsTokenizerNotNull() {
        sb.append("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertNotNull(tok);
        assertTrue(tok.hasNext());
    }

    @Test
    public void testAsReaderReadsChars() throws IOException {
        sb.append("abc");
        Reader r = sb.asReader();
        assertEquals('a', r.read());
        assertEquals('b', r.read());
        assertEquals('c', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testAsReaderReadArray() throws IOException {
        sb.append("abcdef");
        Reader r = sb.asReader();
        char[] buf = new char[3];
        int n = r.read(buf, 0, 3);
        assertEquals(3, n);
        assertArrayEquals(new char[]{'a','b','c'}, buf);
    }

    @Test
    public void testAsReaderReadArrayZeroLen() throws IOException {
        sb.append("abc");
        Reader r = sb.asReader();
        char[] buf = new char[3];
        assertEquals(0, r.read(buf, 0, 0));
    }

    @Test
    public void testAsReaderReadArrayAtEnd() throws IOException {
        sb.append("a");
        Reader r = sb.asReader();
        r.read(); // consume
        char[] buf = new char[1];
        assertEquals(-1, r.read(buf, 0, 1));
    }

    @Test
    public void testAsReaderReadArrayInvalidOffsetThrows() throws IOException {
        sb.append("abc");
        Reader r = sb.asReader();
        try {
            r.read(new char[3], -1, 1);
            fail();
        } catch (IndexOutOfBoundsException e) { }
    }

    @Test
    public void testAsReaderSkipAndReset() throws IOException {
        sb.append("abcdef");
        Reader r = sb.asReader();
        r.mark(0);
        long skipped = r.skip(3);
        assertEquals(3, skipped);
        assertEquals('d', r.read());
        r.reset();
        assertEquals('a', r.read());
    }

    @Test
    public void testAsReaderSkipBeyondEnd() throws IOException {
        sb.append("abc");
        Reader r = sb.asReader();
        long skipped = r.skip(100);
        assertEquals(3, skipped);
    }

    @Test
    public void testAsReaderMarkSupported() {
        Reader r = sb.asReader();
        assertTrue(r.markSupported());
    }

    @Test
    public void testAsReaderReadyFalseAtEnd() throws IOException {
        sb.append("a");
        Reader r = sb.asReader();
        r.read();
        assertFalse(r.ready());
    }

    @Test
    public void testAsWriterWriteChar() throws IOException {
        Writer w = sb.asWriter();
        w.write('a');
        assertEquals("a", sb.toString());
    }

    @Test
    public void testAsWriterWriteCharArray() throws IOException {
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b','c'});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriterWriteCharArrayRange() throws IOException {
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testAsWriterWriteString() throws IOException {
        Writer w = sb.asWriter();
        w.write("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriterWriteStringRange() throws IOException {
        Writer w = sb.asWriter();
        w.write("abcdef", 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ---------------- equalsIgnoreCase ----------------

    @Test
    public void testEqualsIgnoreCaseSameInstance() {
        sb.append("abc");
        assertTrue(sb.equalsIgnoreCase(sb));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentSize() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("ab");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCaseSameCharsDifferentCase() {
        sb.append("ABC");
        StrBuilder other = new StrBuilder("abc");
        assertTrue(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentChars() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("xyz");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    // ---------------- equals(StrBuilder) ----------------

    @Test
    public void testEqualsStrBuilderSameInstance() {
        sb.append("abc");
        assertTrue(sb.equals(sb));
    }

    @Test
    public void testEqualsStrBuilderDifferentSize() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("ab");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsStrBuilderSameChars() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abc");
        assertTrue(sb.equals(other));
    }

    @Test
    public void testEqualsStrBuilderDifferentChars() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abd");
        assertFalse(sb.equals(other));
    }

    // ---------------- equals(Object) ----------------

    @Test
    public void testEqualsObjectIsStrBuilder() {
        sb.append("abc");
        Object other = new StrBuilder("abc");
        assertTrue(sb.equals(other));
    }

    @Test
    public void testEqualsObjectIsNotStrBuilder() {
        sb.append("abc");
        assertFalse(sb.equals("abc"));
    }

    @Test
    public void testEqualsObjectIsNull() {
        sb.append("abc");
        assertFalse(sb.equals((Object) null));
    }

    // ---------------- hashCode ----------------

    @Test
    public void testHashCodeConsistentWithEquals() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abc");
        assertEquals(sb.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCodeEmpty() {
        assertEquals(0, sb.hashCode());
    }

    // ---------------- toString / toStringBuffer ----------------

    @Test
    public void testToStringEmpty() {
        assertEquals("", sb.toString());
    }

    @Test
    public void testToStringNonEmpty() {
        sb.append("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testToStringBuffer() {
        sb.append("abc");
        StringBuffer buf = sb.toStringBuffer();
        assertEquals("abc", buf.toString());
    }

    // ---------------- validateRange / validateIndex (indirectly tested above) ----------------

    @Test
    public void testValidateRangeViaSubstringEndEqualsSize() {
        sb.append("abc");
        assertEquals("abc", sb.substring(0, 3));
    }

    @Test
    public void testValidateIndexViaInsertAtSize() {
        sb.append("abc");
        sb.insert(3, "d");
        assertEquals("abcd", sb.toString());
    }
}
```

# ตารางสรุป Test coverage

| กลุ่มเมธอดทดสอบ | เมธอดเป้าหมาย | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| testDefaultConstructor, testConstructorWithPositiveCapacity, testConstructorWithZeroCapacity, testConstructorWithNegativeCapacity | `StrBuilder()`, `StrBuilder(int)` | `initialCapacity <= 0` true/false |
| testConstructorWithNullString, testConstructorWithString, testConstructorWithEmptyString | `StrBuilder(String)` | `str == null` true/false, append เมื่อ strLen>0 |
| testNewLineTextGetSet, testNullTextGetSet, testSetNullTextEmptyBecomesNull, testSetNullTextNull | `setNewLineText`, `setNullText` | `nullText != null && length()==0` true/false |
| testLength, testSetLength* | `setLength` | `length<0` throw, `length<size`, `length>size`, `length==size` |
| testEnsureCapacity*, testMinimizeCapacity* | `ensureCapacity`, `minimizeCapacity` | `capacity > buffer.length` true/false, `buffer.length > length()` true/false |
| testSize, testIsEmpty*, testClear | `size()`, `isEmpty()`, `clear()` | size==0 true/false |
| testCharAt*, testSetCharAt*, testDeleteCharAt* | `charAt`, `setCharAt`, `deleteCharAt` | index<0 / index>=length() true/false |
| testToCharArray*, testGetChars* | `toCharArray()`, `toCharArray(int,int)`, `getChars(...)` | size==0, len==0, destination null/too-small/sufficient, startIndex<0, endIndex<0/>length, startIndex>endIndex |
| testAppendNewLine*, testAppendNull* | `appendNewLine`, `appendNull` | newLine==null true/false, nullText==null true/false |
| testAppendObject* | `append(Object)` | obj==null true/false |
| testAppendString*, testAppendStringRange* | `append(String)`, `append(String,int,int)` | str==null, strLen>0, startIndex invalid, length invalid, length>0 |
| testAppendStringBuffer*, testAppendStringBufferRange* | `append(StringBuffer)`, range overload | เหมือนด้านบนสำหรับ StringBuffer |
| testAppendStrBuilder*, testAppendStrBuilderRange* | `append(StrBuilder)`, range overload | เหมือนด้านบนสำหรับ StrBuilder |
| testAppendCharArray*, testAppendCharArrayRange* | `append(char[])`, range overload | chars==null, strLen>0, invalid startIndex/length |
| testAppendBoolean* | `append(boolean)` | value true/false |
| testAppendChar, testAppendInt/Long/Float/Double | `append(char)`, numeric overloads | ปกติ (delegate ไปที่ append(String)) |
| testAppendWithSeparatorsArray*, Collection*, Iterator* | `appendWithSeparators(...)` | array/coll/it null, empty, separator null/non-null, loop iterate multiple |
| testAppendPadding* | `appendPadding` | length>=0 true/false, loop 0/1/หลายครั้ง |
| testAppendFixedWidthPadLeft*, PadRight* | `appendFixedWidthPadLeft/Right` | width>0 true/false, strLen>=width true/false, obj==null กับ/ไม่มี nullText |
| testInsertObject*, InsertString*, InsertCharArray*, InsertCharArrayRange*, InsertBoolean*, InsertChar*, InsertInt/Long/Float/Double | `insert(...)` overloads | validateIndex throw, obj/str/chars==null, strLen>0, offset/length invalid |
| testDelete*, testDeleteAllChar*, testDeleteFirstChar*, testDeleteAllString*, testDeleteFirstString* | `delete`, `deleteAll(char)`, `deleteFirst(char)`, `deleteAll(String)`, `deleteFirst(String)` | validateRange throw, len>0, loop match/no-match, consecutive match |
| testReplace*, testReplaceAllChar*, testReplaceFirstChar*, testReplaceAllString*, testReplaceFirstString*, testReplace*Matcher* | `replace`, `replaceAll/First` overloads | search==replace, searchLen>0, matcher==null, size==0, removeLen>0 loop, replaceCount |
| testReverse* | `reverse()` | size==0 true/false, odd/even length |
| testTrim* | `trim()` | size==0, pos/len loops with/without whitespace |
| testStartsWith*, testEndsWith* | `startsWith`, `endsWith` | str==null, len==0, len>size, match/no-match |
| testSubstring* | `substring` | validateRange throw, endIndex>size clamp |
| testLeftString*, testRightString*, testMidString* | left/right/midString | length<=0, length>=size, index<0, index>=size, size<=index+length |
| testContainsChar*, ContainsString*, ContainsMatcher* | `contains(...)` | true/false cases |
| testIndexOfChar*, IndexOfString*, IndexOfMatcher* | `indexOf(...)` overloads | startIndex<0, startIndex>=size, strLen==1/0/>size, loop match/no-match (continue outer) |
| testLastIndexOfChar*, LastIndexOfString*, LastIndexOfMatcher* | `lastIndexOf(...)` overloads | startIndex>=size clamp, startIndex<0, strLen>0&&<=size, strLen==0, strLen==1 |
| testAsTokenizerNotNull | `asTokenizer()` | สร้าง instance, tokenize ปกติ |
| testAsReader* | `asReader()` + Reader inner class | read(), read(array) เงื่อนไข off/len invalid, len==0, pos>=size, pos+len>size, skip ปกติ/เกิน, mark/reset, markSupported, ready() |
| testAsWriter* | `asWriter()` + Writer inner class | write(int/char[]/String) ทุก overload |
| testEqualsIgnoreCase*, testEqualsStrBuilder*, testEqualsObject* | `equalsIgnoreCase`, `equals(StrBuilder)`, `equals(Object)` | this==other, size ต่าง, char ต่าง/เหมือน (case-insensitive และ exact), instanceof check, null check |
| testHashCode* | `hashCode()` | empty vs non-empty, consistency กับ equals |
| testToString*, testToStringBuffer | `toString()`, `toStringBuffer()` | empty/non-empty |
| testValidateRangeViaSubstringEndEqualsSize, testValidateIndexViaInsertAtSize | `validateRange`, `validateIndex` (protected, ทดสอบผ่าน public API) | boundary index เท่ากับ size |

**หมายเหตุสำคัญ (ตามข้อกำหนดข้อ 4):**
- `testAppendFixedWidthPadLeftNullObjNoNullTextThrowsNPE`: กรณี `obj==null` และ `nullText==null` จะทำให้ `str=null` แล้วเรียก `str.length()` ซึ่งจะเกิด `NullPointerException` ตามพฤติกรรมจริงของซอร์สโค้ด (ไม่ใช่การเดา แต่วิเคราะห์จาก logic ตรง ๆ)
- เมธอด inner class `StrBuilderTokenizer` ไม่ได้ทดสอบ behavior ละเอียดของ `tokenize()`/`getContent()` เนื่องจากต้องพึ่ง `StrTokenizer` เพิ่มเติมซึ่งไม่ได้อยู่ใน source ที่ให้มา จึงทดสอบเพียงว่า `asTokenizer()` คืน instance ที่ใช้งานได้
- ค่า `appendFixedWidthPadLeft`/`Right` เมื่อ `width<0` ถูกจัดกลุ่มเดียวกับ `width==0` เนื่องจาก condition คือ `width>0`