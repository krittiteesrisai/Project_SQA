package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StrBuilderTest {

    // ===================== Constructors =====================
    @Test
    public void testDefaultConstructor() {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorWithPositiveCapacity() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());
    }

    @Test
    public void testConstructorWithZeroCapacity() {
        StrBuilder sb = new StrBuilder(0);
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        StrBuilder sb = new StrBuilder(-5);
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorWithNullString() {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorWithString() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.toString());
        assertEquals(3 + 32, sb.capacity());
    }

    // ===================== newLine =====================
    @Test
    public void testNewLineTextDefaultNull() {
        assertNull(new StrBuilder().getNewLineText());
    }

    @Test
    public void testSetGetNewLineText() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("abc");
        assertEquals("abc", sb.getNewLineText());
    }

    @Test
    public void testAppendNewLineWithNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText(null);
        sb.appendNewLine();
        assertEquals(System.getProperty("line.separator"), sb.toString());
    }

    @Test
    public void testAppendNewLineWithCustomText() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("NL");
        sb.appendNewLine();
        assertEquals("NL", sb.toString());
    }

    // ===================== nullText =====================
    @Test
    public void testNullTextDefaultNull() {
        assertNull(new StrBuilder().getNullText());
    }

    @Test
    public void testSetNullTextNormal() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
    }

    @Test
    public void testSetNullTextEmptyBecomesNull() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("");
        assertNull(sb.getNullText());
    }

    @Test
    public void testSetNullTextNull() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testAppendNullWithNullText() {
        StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNullWithSetNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    // ===================== length / setLength =====================
    @Test
    public void testLength() {
        assertEquals(5, new StrBuilder("hello").length());
    }

    @Test
    public void testSetLengthSmaller() {
        StrBuilder sb = new StrBuilder("hello");
        sb.setLength(3);
        assertEquals("hel", sb.toString());
    }

    @Test
    public void testSetLengthLarger() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals('\0', sb.charAt(2));
        assertEquals('\0', sb.charAt(4));
    }

    @Test
    public void testSetLengthEqual() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(3);
        assertEquals("abc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        new StrBuilder("abc").setLength(-1);
    }

    // ===================== capacity / ensureCapacity / minimizeCapacity =====================
    @Test
    public void testEnsureCapacityNoResize() {
        StrBuilder sb = new StrBuilder(10);
        sb.ensureCapacity(5);
        assertEquals(10, sb.capacity());
    }

    @Test
    public void testEnsureCapacityResize() {
        StrBuilder sb = new StrBuilder(5);
        sb.ensureCapacity(20);
        assertEquals(20, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity() {
        StrBuilder sb = new StrBuilder(50);
        sb.append("abc");
        sb.minimizeCapacity();
        assertEquals(3, sb.capacity());
    }

    @Test
    public void testMinimizeCapacityNoChange() {
        StrBuilder sb = new StrBuilder(3);
        sb.append("abc");
        sb.minimizeCapacity();
        assertEquals(3, sb.capacity());
    }

    // ===================== size / isEmpty / clear =====================
    @Test
    public void testSize() {
        assertEquals(3, new StrBuilder("abc").size());
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(new StrBuilder().isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        assertFalse(new StrBuilder("a").isEmpty());
    }

    @Test
    public void testClear() {
        StrBuilder sb = new StrBuilder("abc");
        sb.clear();
        assertEquals(0, sb.length());
    }

    // ===================== charAt / setCharAt / deleteCharAt =====================
    @Test
    public void testCharAtValid() {
        assertEquals('b', new StrBuilder("abc").charAt(1));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtNegative() {
        new StrBuilder("abc").charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAtTooLarge() {
        new StrBuilder("abc").charAt(3);
    }

    @Test
    public void testSetCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtInvalid() {
        new StrBuilder("abc").setCharAt(5, 'X');
    }

    @Test
    public void testDeleteCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtInvalid() {
        new StrBuilder("abc").deleteCharAt(10);
    }

    // ===================== toCharArray =====================
    @Test
    public void testToCharArrayEmpty() {
        assertEquals(0, new StrBuilder().toCharArray().length);
    }

    @Test
    public void testToCharArrayNonEmpty() {
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").toCharArray());
    }

    @Test
    public void testToCharArrayRangeEmpty() {
        assertEquals(0, new StrBuilder("abc").toCharArray(1, 1).length);
    }

    @Test
    public void testToCharArrayRangeNonEmpty() {
        assertArrayEquals(new char[]{'b','c','d'}, new StrBuilder("abcdef").toCharArray(1, 4));
    }

    @Test
    public void testToCharArrayRangeEndTooLarge() {
        assertArrayEquals(new char[]{'b','c'}, new StrBuilder("abc").toCharArray(1, 100));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArrayRangeInvalidStart() {
        new StrBuilder("abc").toCharArray(-1, 2);
    }

    // ===================== getChars =====================
    @Test
    public void testGetCharsNullDestination() {
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").getChars(null));
    }

    @Test
    public void testGetCharsDestinationTooSmall() {
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").getChars(new char[1]));
    }

    @Test
    public void testGetCharsDestinationBigEnough() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertSame(dest, result);
        assertEquals('a', result[0]);
    }

    @Test
    public void testGetCharsRangeValid() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 0);
        assertEquals('b', dest[0]);
        assertEquals('c', dest[1]);
        assertEquals('d', dest[2]);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeStartNegative() {
        new StrBuilder("abc").getChars(-1, 2, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeEndNegative() {
        new StrBuilder("abc").getChars(0, -1, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeEndTooLarge() {
        new StrBuilder("abc").getChars(0, 10, new char[15], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeStartGreaterThanEnd() {
        new StrBuilder("abc").getChars(2, 1, new char[5], 0);
    }

    // ===================== append(Object) =====================
    @Test
    public void testAppendObjectNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendObjectNonNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) Integer.valueOf(123));
        assertEquals("123", sb.toString());
    }

    // ===================== append(String) =====================
    @Test
    public void testAppendStringNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append("");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append("abc");
        assertEquals("abc", sb.toString());
    }

    // ===================== append(String,start,length) =====================
    @Test
    public void testAppendStringRangeNullStr() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeInvalidStart() {
        new StrBuilder().append("abc", -1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeStartTooLarge() {
        new StrBuilder().append("abc", 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeInvalidLength() {
        new StrBuilder().append("abc", 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeLengthTooLarge() {
        new StrBuilder().append("abc", 1, 10);
    }

    @Test
    public void testAppendStringRangeZeroLength() {
        StrBuilder sb = new StrBuilder();
        sb.append("abc", 1, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringRangeValid() {
        StrBuilder sb = new StrBuilder();
        sb.append("abcdef", 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ===================== append(StringBuffer) =====================
    @Test
    public void testAppendStringBufferNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBufferEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer(""));
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBufferNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("abc"));
        assertEquals("abc", sb.toString());
    }

    // ===================== append(StringBuffer,start,length) =====================
    @Test
    public void testAppendStringBufferRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeInvalidStart() {
        new StrBuilder().append(new StringBuffer("abc"), -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeStartTooLarge() {
        new StrBuilder().append(new StringBuffer("abc"), 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeInvalidLength() {
        new StrBuilder().append(new StringBuffer("abc"), 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeLengthTooLarge() {
        new StrBuilder().append(new StringBuffer("abc"), 1, 10);
    }

    @Test
    public void testAppendStringBufferRangeZeroLength() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("abc"), 1, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBufferRangeValid() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ===================== append(StrBuilder) =====================
    @Test
    public void testAppendStrBuilderNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilderEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StrBuilder());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilderNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StrBuilder("abc"));
        assertEquals("abc", sb.toString());
    }

    // ===================== append(StrBuilder,start,length) =====================
    @Test
    public void testAppendStrBuilderRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeInvalidStart() {
        new StrBuilder().append(new StrBuilder("abc"), -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeStartTooLarge() {
        new StrBuilder().append(new StrBuilder("abc"), 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeInvalidLength() {
        new StrBuilder().append(new StrBuilder("abc"), 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeLengthTooLarge() {
        new StrBuilder().append(new StrBuilder("abc"), 1, 10);
    }

    @Test
    public void testAppendStrBuilderRangeZeroLength() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StrBuilder("abc"), 1, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRangeValid() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StrBuilder("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ===================== append(char[]) =====================
    @Test
    public void testAppendCharArrayNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[0]);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArrayNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[]{'a','b','c'});
        assertEquals("abc", sb.toString());
    }

    // ===================== append(char[],start,length) =====================
    @Test
    public void testAppendCharArrayRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeInvalidStart() {
        new StrBuilder().append(new char[]{'a','b','c'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeStartTooLarge() {
        new StrBuilder().append(new char[]{'a','b','c'}, 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeInvalidLength() {
        new StrBuilder().append(new char[]{'a','b','c'}, 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeLengthTooLarge() {
        new StrBuilder().append(new char[]{'a','b','c'}, 1, 10);
    }

    @Test
    public void testAppendCharArrayRangeZeroLength() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[]{'a','b','c'}, 1, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArrayRangeValid() {
        StrBuilder sb = new StrBuilder();
        sb.append(new char[]{'a','b','c','d','e','f'}, 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ===================== append primitives =====================
    @Test
    public void testAppendBooleanTrue() {
        StrBuilder sb = new StrBuilder();
        sb.append(true);
        assertEquals("true", sb.toString());
    }

    @Test
    public void testAppendBooleanFalse() {
        StrBuilder sb = new StrBuilder();
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    @Test
    public void testAppendChar() {
        StrBuilder sb = new StrBuilder();
        sb.append('x');
        assertEquals("x", sb.toString());
    }

    @Test
    public void testAppendInt() {
        StrBuilder sb = new StrBuilder();
        sb.append(123);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppendLong() {
        StrBuilder sb = new StrBuilder();
        sb.append(123L);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppendFloat() {
        StrBuilder sb = new StrBuilder();
        sb.append(1.5f);
        assertEquals(String.valueOf(1.5f), sb.toString());
    }

    @Test
    public void testAppendDouble() {
        StrBuilder sb = new StrBuilder();
        sb.append(1.5d);
        assertEquals(String.valueOf(1.5d), sb.toString());
    }

    // ===================== appendWithSeparators(Object[]) =====================
    @Test
    public void testAppendWithSeparatorsArrayNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayNullSeparator() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[]{"a","b","c"}, null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArrayNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[]{"a","b","c"}, ",");
        assertEquals("a,b,c", sb.toString());
    }

    // ===================== appendWithSeparators(Collection) =====================
    @Test
    public void testAppendWithSeparatorsCollectionNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((java.util.Collection) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new ArrayList(), ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNullSeparator() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a"); list.add("b");
        sb.appendWithSeparators(list, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a"); list.add("b"); list.add("c");
        sb.appendWithSeparators(list, ",");
        assertEquals("a,b,c", sb.toString());
    }

    // ===================== appendWithSeparators(Iterator) =====================
    @Test
    public void testAppendWithSeparatorsIteratorNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        sb.appendWithSeparators(list.iterator(), ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNullSeparator() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a"); list.add("b");
        sb.appendWithSeparators(list.iterator(), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a"); list.add("b"); list.add("c");
        sb.appendWithSeparators(list.iterator(), ",");
        assertEquals("a,b,c", sb.toString());
    }

    // ===================== appendPadding =====================
    @Test
    public void testAppendPaddingPositive() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(3, 'x');
        assertEquals("xxx", sb.toString());
    }

    @Test
    public void testAppendPaddingZero() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(0, 'x');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPaddingNegative() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-3, 'x');
        assertEquals("", sb.toString());
    }

    // ===================== appendFixedWidthPadLeft(Object) =====================
    @Test
    public void testAppendFixedWidthPadLeftWidthZeroOrNegative() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 0, '*');
        sb.appendFixedWidthPadLeft("abc", -1, '*');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftNullObjUsesNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendFixedWidthPadLeft(null, 6, '*');
        assertEquals("**NULL", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrLenGreaterThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abcdef", 3, '*');
        assertEquals("def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrLenEqualWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 3, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrLenLessThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("ab", 5, '*');
        assertEquals("***ab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft(12, 5, '0');
        assertEquals("00012", sb.toString());
    }

    // ===================== appendFixedWidthPadRight(Object) =====================
    @Test
    public void testAppendFixedWidthPadRightWidthZeroOrNegative() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", 0, '*');
        sb.appendFixedWidthPadRight("abc", -1, '*');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightNullObjUsesNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendFixedWidthPadRight(null, 6, '*');
        assertEquals("NULL**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightStrLenGreaterThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abcdef", 3, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightStrLenLessThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("ab", 5, '*');
        assertEquals("ab***", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightInt() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight(12, 5, '0');
        assertEquals("12000", sb.toString());
    }

    // ===================== insert(index,Object) =====================
    @Test
    public void testInsertObjectNull() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setNullText("NULL");
        sb.insert(1, (Object) null);
        assertEquals("aNULLb", sb.toString());
    }

    @Test
    public void testInsertObjectNonNull() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, (Object) Integer.valueOf(9));
        assertEquals("a9b", sb.toString());
    }

    // ===================== insert(index,String) =====================
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndexNegative() {
        new StrBuilder("abc").insert(-1, "x");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndexTooLarge() {
        new StrBuilder("abc").insert(10, "x");
    }

    @Test
    public void testInsertStringNullUsesNullText() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setNullText("NULL");
        sb.insert(1, (String) null);
        assertEquals("aNULLb", sb.toString());
    }

    @Test
    public void testInsertStringNullNoNullText() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, (String) null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, "");
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testInsertStringNonEmpty() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, "XY");
        assertEquals("aXYb", sb.toString());
    }

    // ===================== insert(index,char[]) =====================
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayInvalidIndex() {
        new StrBuilder("abc").insert(-1, new char[]{'x'});
    }

    @Test
    public void testInsertCharArrayNull() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setNullText("NULL");
        sb.insert(1, (char[]) null);
        assertEquals("aNULLb", sb.toString());
    }

    @Test
    public void testInsertCharArrayEmpty() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, new char[0]);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testInsertCharArrayNonEmpty() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, new char[]{'X','Y'});
        assertEquals("aXYb", sb.toString());
    }

    // ===================== insert(index,char[],offset,length) =====================
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayRangeInvalidIndex() {
        new StrBuilder("abc").insert(-1, new char[]{'x'}, 0, 1);
    }

    @Test
    public void testInsertCharArrayRangeNullChars() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setNullText("NULL");
        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("aNULLb", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayRangeInvalidOffsetNegative() {
        new StrBuilder("ab").insert(1, new char[]{'x','y'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayRangeOffsetTooLarge() {
        new StrBuilder("ab").insert(1, new char[]{'x','y'}, 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayRangeInvalidLengthNegative() {
        new StrBuilder("ab").insert(1, new char[]{'x','y'}, 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayRangeLengthTooLarge() {
        new StrBuilder("ab").insert(1, new char[]{'x','y'}, 0, 10);
    }

    @Test
    public void testInsertCharArrayRangeZeroLength() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, new char[]{'x','y'}, 0, 0);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testInsertCharArrayRangeValid() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, new char[]{'x','y','z'}, 1, 2);
        assertEquals("ayzb", sb.toString());
    }

    // ===================== insert(index,boolean/char/int/long/float/double) =====================
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertBooleanInvalidIndex() {
        new StrBuilder("abc").insert(-1, true);
    }

    @Test
    public void testInsertBooleanTrue() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, true);
        assertEquals("atrueb", sb.toString());
    }

    @Test
    public void testInsertBooleanFalse() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, false);
        assertEquals("afalseb", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharInvalidIndex() {
        new StrBuilder("abc").insert(-1, 'x');
    }

    @Test
    public void testInsertChar() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 'X');
        assertEquals("aXb", sb.toString());
    }

    @Test
    public void testInsertInt() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 9);
        assertEquals("a9b", sb.toString());
    }

    @Test
    public void testInsertLong() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 9L);
        assertEquals("a9b", sb.toString());
    }

    @Test
    public void testInsertFloat() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 1.5f);
        assertEquals("a" + 1.5f + "b", sb.toString());
    }

    @Test
    public void testInsertDouble() {
        StrBuilder sb = new StrBuilder("ab");
        sb.insert(1, 1.5d);
        assertEquals("a" + 1.5d + "b", sb.toString());
    }

    // ===================== delete(start,end) =====================
    @Test
    public void testDeleteValidRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(1, 3);
        assertEquals("adef", sb.toString());
    }

    @Test
    public void testDeleteZeroLength() {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(1, 1);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(1, 100);
        assertEquals("a", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteInvalidStartNegative() {
        new StrBuilder("abc").delete(-1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteStartGreaterThanEnd() {
        new StrBuilder("abc").delete(2, 1);
    }

    // ===================== deleteAll(char)/deleteFirst(char) =====================
    @Test
    public void testDeleteAllCharNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllCharSingleMatch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.deleteAll('b');
        assertEquals("acac", sb.toString());
    }

    @Test
    public void testDeleteAllCharConsecutiveMatches() {
        // "aabbccbb" -> remove ALL 'b' including consecutive groups
        StrBuilder sb = new StrBuilder("aabbccbb");
        sb.deleteAll('b');
        assertEquals("aacc", sb.toString());
    }

    @Test
    public void testDeleteFirstCharNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstCharMatch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.deleteFirst('b');
        assertEquals("acabc", sb.toString());
    }

    // ===================== deleteAll(String)/deleteFirst(String) =====================
    @Test
    public void testDeleteAllStringNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll("xyz");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringMultipleMatches() {
        StrBuilder sb = new StrBuilder("abXcdXefX");
        sb.deleteAll("X");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst("xyz");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringMatch() {
        StrBuilder sb = new StrBuilder("abXcdXef");
        sb.deleteFirst("X");
        assertEquals("abcdXef", sb.toString());
    }

    // ===================== deleteAll(StrMatcher)/deleteFirst(StrMatcher) =====================
    @Test
    public void testDeleteAllMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((StrMatcher) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllMatcherEmptyBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.deleteAll(StrMatcher.charMatcher('a'));
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllMatcherMatches() {
        StrBuilder sb = new StrBuilder("aXbXcX");
        sb.deleteAll(StrMatcher.charMatcher('X'));
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((StrMatcher) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcherMatch() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.deleteFirst(StrMatcher.charMatcher('X'));
        assertEquals("abXc", sb.toString());
    }

    // ===================== replace(start,end,str) =====================
    @Test
    public void testReplaceRangeSameLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, "XY");
        assertEquals("aXYdef", sb.toString());
    }

    @Test
    public void testReplaceRangeShorterReplace() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "X");
        assertEquals("aXef", sb.toString());
    }

    @Test
    public void testReplaceRangeLongerReplace() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 2, "XYZ");
        assertEquals("aXYZcdef", sb.toString());
    }

    @Test
    public void testReplaceRangeNullReplace() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, null);
        assertEquals("adef", sb.toString());
    }

    @Test
    public void testReplaceRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(1, 100, "X");
        assertEquals("aX", sb.toString());
    }

    // ===================== replaceAll(char,char)/replaceFirst(char,char) =====================
    @Test
    public void testReplaceAllCharSameSearchReplace() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllCharDifferent() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll('a', 'X');
        assertEquals("XbcXbc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharSame() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharDifferent() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst('a', 'X');
        assertEquals("Xbcabc", sb.toString());
    }

    // ===================== replaceAll(String,String)/replaceFirst(String,String) =====================
    @Test
    public void testReplaceAllStringNullSearch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll((String) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringEmptySearch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringNullReplace() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceAll("X", (String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringMultipleMatches() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceAll("X", "YY");
        assertEquals("aYYbYYc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNullSearch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst((String) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringEmptySearch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("z", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringMatchNullReplace() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceFirst("X", (String) null);
        assertEquals("abXc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringMatch() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceFirst("X", "YY");
        assertEquals("aYYbXc", sb.toString());
    }

    // ===================== replaceAll/replaceFirst(StrMatcher,String) =====================
    @Test
    public void testReplaceAllMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll((StrMatcher) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllMatcherEmptyBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.replaceAll(StrMatcher.charMatcher('a'), "X");
        assertEquals("", sb.toString());
    }

    @Test
    public void testReplaceAllMatcherMatches() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceAll(StrMatcher.charMatcher('X'), "YY");
        assertEquals("aYYbYYc", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst((StrMatcher) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherMatch() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceFirst(StrMatcher.charMatcher('X'), "YY");
        assertEquals("aYYbXc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceMatcherInvalidStart() {
        new StrBuilder("abc").replace(StrMatcher.charMatcher('a'), "X", -1, 2, -1);
    }

    // ===================== reverse =====================
    @Test
    public void testReverseEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverseOddLength() {
        StrBuilder sb = new StrBuilder("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testReverseEvenLength() {
        StrBuilder sb = new StrBuilder("abcd");
        sb.reverse();
        assertEquals("dcba", sb.toString());
    }

    // ===================== trim =====================
    @Test
    public void testTrimEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimNoWhitespace() {
        StrBuilder sb = new StrBuilder("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimLeadingAndTrailingSpaces() {
        StrBuilder sb = new StrBuilder("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimAllWhitespace() {
        StrBuilder sb = new StrBuilder("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    // ===================== startsWith / endsWith =====================
    @Test
    public void testStartsWithNull() {
        assertFalse(new StrBuilder("abc").startsWith(null));
    }

    @Test
    public void testStartsWithEmpty() {
        assertTrue(new StrBuilder("abc").startsWith(""));
    }

    @Test
    public void testStartsWithLongerThanSize() {
        assertFalse(new StrBuilder("ab").startsWith("abcd"));
    }

    @Test
    public void testStartsWithTrue() {
        assertTrue(new StrBuilder("abcdef").startsWith("abc"));
    }

    @Test
    public void testStartsWithFalse() {
        assertFalse(new StrBuilder("abcdef").startsWith("xyz"));
    }

    @Test
    public void testEndsWithNull() {
        assertFalse(new StrBuilder("abc").endsWith(null));
    }

    @Test
    public void testEndsWithEmpty() {
        assertTrue(new StrBuilder("abc").endsWith(""));
    }

    @Test
    public void testEndsWithLongerThanSize() {
        assertFalse(new StrBuilder("ab").endsWith("abcd"));
    }

    @Test
    public void testEndsWithTrue() {
        assertTrue(new StrBuilder("abcdef").endsWith("def"));
    }

    @Test
    public void testEndsWithFalse() {
        assertFalse(new StrBuilder("abcdef").endsWith("xyz"));
    }

    // ===================== substring =====================
    @Test
    public void testSubstringOneArg() {
        assertEquals("cdef", new StrBuilder("abcdef").substring(2));
    }

    @Test
    public void testSubstringTwoArgsValid() {
        assertEquals("cd", new StrBuilder("abcdef").substring(2, 4));
    }

    @Test
    public void testSubstringEndTooLarge() {
        assertEquals("bc", new StrBuilder("abc").substring(1, 100));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstringInvalidStart() {
        new StrBuilder("abc").substring(-1, 2);
    }

    // ===================== leftString / rightString / midString =====================
    @Test
    public void testLeftStringNegativeLength() {
        assertEquals("", new StrBuilder("abc").leftString(-1));
    }

    @Test
    public void testLeftStringZeroLength() {
        assertEquals("", new StrBuilder("abc").leftString(0));
    }

    @Test
    public void testLeftStringLengthGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.leftString(10));
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringNormal() {
        assertEquals("ab", new StrBuilder("abcdef").leftString(2));
    }

    @Test
    public void testRightStringNegativeLength() {
        assertEquals("", new StrBuilder("abc").rightString(-1));
    }

    @Test
    public void testRightStringZeroLength() {
        assertEquals("", new StrBuilder("abc").rightString(0));
    }

    @Test
    public void testRightStringLengthGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.rightString(10));
        assertEquals("abc", sb.rightString(3));
    }

    @Test
    public void testRightStringNormal() {
        assertEquals("ef", new StrBuilder("abcdef").rightString(2));
    }

    @Test
    public void testMidStringNegativeIndex() {
        assertEquals("abc", new StrBuilder("abcdef").midString(-5, 3));
    }

    @Test
    public void testMidStringNegativeLength() {
        assertEquals("", new StrBuilder("abcdef").midString(2, -1));
    }

    @Test
    public void testMidStringIndexGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.midString(10, 2));
        assertEquals("", sb.midString(3, 2));
    }

    @Test
    public void testMidStringSizeLessEqualIndexPlusLength() {
        assertEquals("def", new StrBuilder("abcdef").midString(3, 10));
    }

    @Test
    public void testMidStringNormal() {
        assertEquals("cd", new StrBuilder("abcdef").midString(2, 2));
    }

    // ===================== contains =====================
    @Test
    public void testContainsCharTrue() {
        assertTrue(new StrBuilder("abc").contains('b'));
    }

    @Test
    public void testContainsCharFalse() {
        assertFalse(new StrBuilder("abc").contains('z'));
    }

    @Test
    public void testContainsStringTrue() {
        assertTrue(new StrBuilder("abcdef").contains("cde"));
    }

    @Test
    public void testContainsStringFalse() {
        assertFalse(new StrBuilder("abcdef").contains("xyz"));
    }

    @Test
    public void testContainsMatcherTrue() {
        assertTrue(new StrBuilder("abc").contains(StrMatcher.charMatcher('b')));
    }

    @Test
    public void testContainsMatcherFalse() {
        assertFalse(new StrBuilder("abc").contains(StrMatcher.charMatcher('z')));
    }

    // ===================== indexOf =====================
    @Test
    public void testIndexOfChar() {
        assertEquals(1, new StrBuilder("abcabc").indexOf('b'));
    }

    @Test
    public void testIndexOfCharNotFound() {
        assertEquals(-1, new StrBuilder("abc").indexOf('z'));
    }

    @Test
    public void testIndexOfCharStartNegative() {
        assertEquals(0, new StrBuilder("abc").indexOf('a', -5));
    }

    @Test
    public void testIndexOfCharStartTooLarge() {
        assertEquals(-1, new StrBuilder("abc").indexOf('a', 10));
    }

    @Test
    public void testIndexOfCharWithStart() {
        assertEquals(4, new StrBuilder("abcabc").indexOf('b', 2));
    }

    @Test
    public void testIndexOfStringNull() {
        assertEquals(-1, new StrBuilder("abc").indexOf((String) null));
    }

    @Test
    public void testIndexOfStringStartNegative() {
        assertEquals(0, new StrBuilder("abc").indexOf("abc", -5));
    }

    @Test
    public void testIndexOfStringStartTooLarge() {
        assertEquals(-1, new StrBuilder("abc").indexOf("a", 10));
    }

    @Test
    public void testIndexOfStringLen1() {
        assertEquals(1, new StrBuilder("abcabc").indexOf("b", 0));
    }

    @Test
    public void testIndexOfStringLen0() {
        assertEquals(1, new StrBuilder("abc").indexOf("", 1));
    }

    @Test
    public void testIndexOfStringLenGreaterThanSize() {
        assertEquals(-1, new StrBuilder("ab").indexOf("abcdef", 0));
    }

    @Test
    public void testIndexOfStringNormalFound() {
        assertEquals(2, new StrBuilder("abcdef").indexOf("cde", 0));
    }

    @Test
    public void testIndexOfStringNormalNotFound() {
        assertEquals(-1, new StrBuilder("abcdef").indexOf("xyz", 0));
    }

    @Test
    public void testIndexOfMatcherNull() {
        assertEquals(-1, new StrBuilder("abc").indexOf((StrMatcher) null));
    }

    @Test
    public void testIndexOfMatcherStartNegative() {
        assertEquals(0, new StrBuilder("abc").indexOf(StrMatcher.charMatcher('a'), -5));
    }

    @Test
    public void testIndexOfMatcherStartTooLarge() {
        assertEquals(-1, new StrBuilder("abc").indexOf(StrMatcher.charMatcher('a'), 10));
    }

    @Test
    public void testIndexOfMatcherFound() {
        assertEquals(1, new StrBuilder("abc").indexOf(StrMatcher.charMatcher('b')));
    }

    @Test
    public void testIndexOfMatcherNotFound() {
        assertEquals(-1, new StrBuilder("abc").indexOf(StrMatcher.charMatcher('z')));
    }

    // ===================== lastIndexOf =====================
    @Test
    public void testLastIndexOfChar() {
        assertEquals(4, new StrBuilder("abcabc").lastIndexOf('b'));
    }

    @Test
    public void testLastIndexOfCharNotFound() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf('z'));
    }

    @Test
    public void testLastIndexOfCharStartTooLarge() {
        assertEquals(2, new StrBuilder("abc").lastIndexOf('c', 100));
    }

    @Test
    public void testLastIndexOfCharStartNegative() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf('a', -1));
    }

    @Test
    public void testLastIndexOfStringNull() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOfStringStartTooLarge() {
        assertEquals(0, new StrBuilder("abc").lastIndexOf("a", 100));
    }

    @Test
    public void testLastIndexOfStringStartNegative() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf("a", -1));
    }

    @Test
    public void testLastIndexOfStringLen1() {
        assertEquals(4, new StrBuilder("abcabc").lastIndexOf("b", 5));
    }

    @Test
    public void testLastIndexOfStringLen0() {
        assertEquals(1, new StrBuilder("abc").lastIndexOf("", 1));
    }

    @Test
    public void testLastIndexOfStringLenTooLarge() {
        assertEquals(-1, new StrBuilder("ab").lastIndexOf("abcdef", 1));
    }

    @Test
    public void testLastIndexOfStringFound() {
        assertEquals(6, new StrBuilder("abcdefabc").lastIndexOf("abc", 8));
    }

    @Test
    public void testLastIndexOfStringNotFound() {
        assertEquals(-1, new StrBuilder("abcdef").lastIndexOf("xyz", 5));
    }

    @Test
    public void testLastIndexOfMatcherNull() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOfMatcherStartNegative() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf(StrMatcher.charMatcher('a'), -1));
    }

    @Test
    public void testLastIndexOfMatcherFound() {
        assertEquals(4, new StrBuilder("abcabc").lastIndexOf(StrMatcher.charMatcher('b')));
    }

    @Test
    public void testLastIndexOfMatcherNotFound() {
        assertEquals(-1, new StrBuilder("abc").lastIndexOf(StrMatcher.charMatcher('z')));
    }

    // ===================== asTokenizer / asReader / asWriter =====================
    @Test
    public void testAsTokenizerNotNull() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tok = sb.asTokenizer();
        assertNotNull(tok);
        assertTrue(tok.hasNext());
    }

    @Test
    public void testAsReaderReadChars() throws IOException {
        StrBuilder sb = new StrBuilder("abc");
        Reader r = sb.asReader();
        assertEquals('a', r.read());
        assertEquals('b', r.read());
        assertEquals('c', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testAsReaderReadArray() throws IOException {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader r = sb.asReader();
        char[] buf = new char[3];
        int n = r.read(buf, 0, 3);
        assertEquals(3, n);
        assertArrayEquals(new char[]{'a','b','c'}, buf);
    }

    @Test
    public void testAsReaderReadArrayZeroLen() throws IOException {
        StrBuilder sb = new StrBuilder("abc");
        Reader r = sb.asReader();
        int n = r.read(new char[3], 0, 0);
        assertEquals(0, n);
    }

    @Test
    public void testAsReaderReadArrayPastEnd() throws IOException {
        StrBuilder sb = new StrBuilder("ab");
        Reader r = sb.asReader();
        char[] buf = new char[5];
        assertEquals(2, r.read(buf, 0, 5));
        assertEquals(-1, r.read(buf, 0, 5));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAsReaderReadArrayInvalidOffset() throws IOException {
        new StrBuilder("abc").asReader().read(new char[3], -1, 2);
    }

    @Test
    public void testAsReaderSkip() throws IOException {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader r = sb.asReader();
        assertEquals(3, r.skip(3));
        assertEquals('d', r.read());
    }

    @Test
    public void testAsReaderSkipPastEnd() throws IOException {
        StrBuilder sb = new StrBuilder("abc");
        Reader r = sb.asReader();
        assertEquals(3, r.skip(100));
    }

    @Test
    public void testAsReaderMarkReset() throws IOException {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader r = sb.asReader();
        r.read();
        r.mark(0);
        r.read();
        r.reset();
        assertEquals('b', r.read());
    }

    @Test
    public void testAsReaderMarkSupported() {
        assertTrue(new StrBuilder("abc").asReader().markSupported());
    }

    @Test
    public void testAsWriterWriteInt() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer w = sb.asWriter();
        w.write('x');
        assertEquals("x", sb.toString());
    }

    @Test
    public void testAsWriterWriteCharArray() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b','c'});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriterWriteCharArrayRange() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testAsWriterWriteString() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer w = sb.asWriter();
        w.write("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriterWriteStringRange() throws IOException {
        StrBuilder sb = new StrBuilder();
        Writer w = sb.asWriter();
        w.write("abcdef", 1, 3);
        assertEquals("bcd", sb.toString());
    }

    // ===================== equalsIgnoreCase =====================
    @Test
    public void testEqualsIgnoreCaseSameInstance() {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.equalsIgnoreCase(sb));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentSize() {
        assertFalse(new StrBuilder("abc").equalsIgnoreCase(new StrBuilder("ab")));
    }

    @Test
    public void testEqualsIgnoreCaseSameCaseInsensitive() {
        assertTrue(new StrBuilder("ABC").equalsIgnoreCase(new StrBuilder("abc")));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentContent() {
        assertFalse(new StrBuilder("abc").equalsIgnoreCase(new StrBuilder("xyz")));
    }

    // ===================== equals(StrBuilder) / equals(Object) =====================
    @Test
    public void testEqualsStrBuilderSameInstance() {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.equals(sb));
    }

    @Test
    public void testEqualsStrBuilderDifferentSize() {
        assertFalse(new StrBuilder("abc").equals(new StrBuilder("ab")));
    }

    @Test
    public void testEqualsStrBuilderSameContent() {
        assertTrue(new StrBuilder("abc").equals(new StrBuilder("abc")));
    }

    @Test
    public void testEqualsStrBuilderDifferentContent() {
        assertFalse(new StrBuilder("abc").equals(new StrBuilder("abd")));
    }

    @Test
    public void testEqualsObjectIsStrBuilder() {
        StrBuilder sb1 = new StrBuilder("abc");
        Object sb2 = new StrBuilder("abc");
        assertTrue(sb1.equals(sb2));
    }

    @Test
    public void testEqualsObjectNotStrBuilder() {
        assertFalse(new StrBuilder("abc").equals("abc"));
    }

    // ===================== hashCode =====================
    @Test
    public void testHashCodeConsistency() {
        assertEquals(new StrBuilder("abc").hashCode(), new StrBuilder("abc").hashCode());
    }

    @Test
    public void testHashCodeEmpty() {
        assertEquals(0, new StrBuilder().hashCode());
    }

    // ===================== toString / toStringBuffer =====================
    @Test
    public void testToString() {
        assertEquals("abc", new StrBuilder("abc").toString());
    }

    @Test
    public void testToStringBuffer() {
        assertEquals("abc", new StrBuilder("abc").toStringBuffer().toString());
    }
}
