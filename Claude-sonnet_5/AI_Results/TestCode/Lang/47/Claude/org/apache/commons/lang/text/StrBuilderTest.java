package org.apache.commons.lang.text;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.SystemUtils;
import org.junit.Test;

public class StrBuilderTest {

    // ===================== Constructors =====================
    @Test
    public void testConstructorDefault() {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorCapacityPositive() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());
    }

    @Test
    public void testConstructorCapacityZeroOrLess() {
        StrBuilder sb1 = new StrBuilder(0);
        assertEquals(32, sb1.capacity());
        StrBuilder sb2 = new StrBuilder(-5);
        assertEquals(32, sb2.capacity());
    }

    @Test
    public void testConstructorStringNull() {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorStringNonNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
        assertEquals(3 + 32, sb.capacity());
    }

    // ===================== newLine / nullText =====================
    @Test
    public void testNewLineTextGetSet() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("abc");
        assertEquals("abc", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testNullTextGetSet() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText(""); // empty -> treated as null
        assertNull(sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    // ===================== length/setLength =====================
    @Test
    public void testSetLengthNegativeThrows() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setLength(-1);
            fail("expected exception");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSetLengthLessThanSize() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLengthGreaterThanSize() {
        StrBuilder sb = new StrBuilder("ab");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals('\0', sb.charAt(2));
        assertEquals('\0', sb.charAt(4));
    }

    @Test
    public void testSetLengthEqualToSize() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(3);
        assertEquals("abc", sb.toString());
    }

    // ===================== capacity / ensureCapacity / minimizeCapacity =====================
    @Test
    public void testEnsureCapacityNoChange() {
        StrBuilder sb = new StrBuilder(50);
        sb.ensureCapacity(10);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testEnsureCapacityGrows() {
        StrBuilder sb = new StrBuilder(5);
        sb.ensureCapacity(100);
        assertEquals(100, sb.capacity());
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

    // ===================== size/isEmpty/clear =====================
    @Test
    public void testSizeIsEmptyClear() {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
        assertEquals(0, sb.size());
        sb.append("abc");
        assertFalse(sb.isEmpty());
        assertEquals(3, sb.size());
        sb.clear();
        assertTrue(sb.isEmpty());
    }

    // ===================== charAt/setCharAt/deleteCharAt =====================
    @Test
    public void testCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals('a', sb.charAt(0));
        assertEquals('c', sb.charAt(2));
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
        new StrBuilder("abc").setCharAt(-1, 'X');
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAtTooLarge() {
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
        new StrBuilder("abc").deleteCharAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAtTooLarge() {
        new StrBuilder("abc").deleteCharAt(3);
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
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").toCharArray(0, 100));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArrayRangeStartNegative() {
        new StrBuilder("abc").toCharArray(-1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArrayRangeStartGreaterThanEnd() {
        new StrBuilder("abc").toCharArray(2, 1);
    }

    // ===================== getChars =====================
    @Test
    public void testGetCharsDestinationNull() {
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").getChars(null));
    }

    @Test
    public void testGetCharsDestinationTooSmall() {
        assertArrayEquals(new char[]{'a','b','c'}, new StrBuilder("abc").getChars(new char[1]));
    }

    @Test
    public void testGetCharsDestinationBigEnough() {
        char[] dest = new char[5];
        char[] result = new StrBuilder("abc").getChars(dest);
        assertSame(dest, result);
        assertEquals('a', result[0]);
    }

    @Test
    public void testGetCharsRangeValid() {
        char[] dest = new char[10];
        new StrBuilder("abcdef").getChars(1, 4, dest, 0);
        assertEquals('b', dest[0]);
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
        new StrBuilder("abc").getChars(0, 10, new char[5], 0);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testGetCharsRangeStartGreaterThanEnd() {
        new StrBuilder("abc").getChars(2, 1, new char[5], 0);
    }

    // ===================== appendNewLine / appendNull =====================
    @Test
    public void testAppendNewLineDefault() {
        StrBuilder sb = new StrBuilder();
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendNewLineCustom() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testAppendNullNoNullText() {
        StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNullWithNullText() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    // ===================== append(Object) =====================
    @Test
    public void testAppendObjectNull() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.append((Object) null);
        assertEquals("NULL", sb.toString());
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

    // ===================== append(String,int,int) =====================
    @Test
    public void testAppendStringRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeStartIndexNegative() {
        new StrBuilder().append("abc", -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeStartIndexTooLarge() {
        new StrBuilder().append("abc", 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeLengthNegative() {
        new StrBuilder().append("abc", 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringRangeLengthTooLarge() {
        new StrBuilder().append("abc", 0, 10);
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
        sb.append(new StringBuffer());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBufferNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.append(new StringBuffer("abc"));
        assertEquals("abc", sb.toString());
    }

    // ===================== append(StringBuffer,int,int) =====================
    @Test
    public void testAppendStringBufferRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StringBuffer) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeStartNegative() {
        new StrBuilder().append(new StringBuffer("abc"), -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeStartTooLarge() {
        new StrBuilder().append(new StringBuffer("abc"), 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeLengthNegative() {
        new StrBuilder().append(new StringBuffer("abc"), 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringBufferRangeLengthTooLarge() {
        new StrBuilder().append(new StringBuffer("abc"), 0, 10);
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

    // ===================== append(StrBuilder,int,int) =====================
    @Test
    public void testAppendStrBuilderRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((StrBuilder) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeStartNegative() {
        new StrBuilder().append(new StrBuilder("abc"), -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeStartTooLarge() {
        new StrBuilder().append(new StrBuilder("abc"), 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeLengthNegative() {
        new StrBuilder().append(new StrBuilder("abc"), 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStrBuilderRangeLengthTooLarge() {
        new StrBuilder().append(new StrBuilder("abc"), 0, 10);
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

    // ===================== append(char[],int,int) =====================
    @Test
    public void testAppendCharArrayRangeNull() {
        StrBuilder sb = new StrBuilder();
        sb.append((char[]) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeStartNegative() {
        new StrBuilder().append(new char[]{'a','b','c'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeStartTooLarge() {
        new StrBuilder().append(new char[]{'a','b','c'}, 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeLengthNegative() {
        new StrBuilder().append(new char[]{'a','b','c'}, 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayRangeLengthTooLarge() {
        new StrBuilder().append(new char[]{'a','b','c'}, 0, 10);
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

    // ===================== appendln variants =====================
    @Test
    public void testAppendlnObject() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln((Object) "abc");
        assertEquals("abc|", sb.toString());
    }

    @Test
    public void testAppendlnString() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln("abc");
        assertEquals("abc|", sb.toString());
    }

    @Test
    public void testAppendlnStringRange() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln("abcdef", 1, 3);
        assertEquals("bcd|", sb.toString());
    }

    @Test
    public void testAppendlnStringBuffer() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new StringBuffer("abc"));
        assertEquals("abc|", sb.toString());
    }

    @Test
    public void testAppendlnStringBufferRange() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new StringBuffer("abcdef"), 1, 3);
        assertEquals("bcd|", sb.toString());
    }

    @Test
    public void testAppendlnStrBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new StrBuilder("abc"));
        assertEquals("abc|", sb.toString());
    }

    @Test
    public void testAppendlnStrBuilderRange() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new StrBuilder("abcdef"), 1, 3);
        assertEquals("bcd|", sb.toString());
    }

    @Test
    public void testAppendlnCharArray() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new char[]{'a','b','c'});
        assertEquals("abc|", sb.toString());
    }

    @Test
    public void testAppendlnCharArrayRange() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals("bc|", sb.toString());
    }

    @Test
    public void testAppendlnBoolean() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(true);
        assertEquals("true|", sb.toString());
    }

    @Test
    public void testAppendlnChar() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln('x');
        assertEquals("x|", sb.toString());
    }

    @Test
    public void testAppendlnInt() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(5);
        assertEquals("5|", sb.toString());
    }

    @Test
    public void testAppendlnLong() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(5L);
        assertEquals("5|", sb.toString());
    }

    @Test
    public void testAppendlnFloat() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(5.5f);
        assertEquals("5.5|", sb.toString());
    }

    @Test
    public void testAppendlnDouble() {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("|");
        sb.appendln(5.5d);
        assertEquals("5.5|", sb.toString());
    }

    // ===================== appendAll =====================
    @Test
    public void testAppendAllObjectArrayNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Object[]) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllObjectArrayEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll(new Object[0]);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllObjectArrayNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll(new Object[]{"a", "b", "c"});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendAllCollectionNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Collection) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllCollectionEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll(new ArrayList());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllCollectionNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendAll(list);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendAllIteratorNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Iterator) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllIteratorEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendAll(new ArrayList().iterator());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllIteratorNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendAll(list.iterator());
        assertEquals("ab", sb.toString());
    }

    // ===================== appendWithSeparators =====================
    @Test
    public void testAppendWithSeparatorsObjectArrayNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayNullSeparator() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayNonEmpty() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Collection) null, ",");
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
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list, null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list, ",");
        assertEquals("a,b", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNull() {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNullSeparator() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list.iterator(), null);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNonEmpty() {
        StrBuilder sb = new StrBuilder();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        sb.appendWithSeparators(list.iterator(), ",");
        assertEquals("a,b", sb.toString());
    }

    // ===================== appendSeparator =====================
    @Test
    public void testAppendSeparatorStringEmptyBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringNonEmptyBuilder() {
        StrBuilder sb = new StrBuilder("a");
        sb.appendSeparator(",");
        assertEquals("a,", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringNullSeparator() {
        StrBuilder sb = new StrBuilder("a");
        sb.appendSeparator((String) null);
        assertEquals("a", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharEmptyBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(',');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharNonEmptyBuilder() {
        StrBuilder sb = new StrBuilder("a");
        sb.appendSeparator(',');
        assertEquals("a,", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringLoopIndexZeroOrLess() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",", 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringLoopIndexPositive() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(",", 1);
        assertEquals(",", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringLoopIndexNullSeparator() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(null, 1);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharLoopIndexZeroOrLess() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(',', 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharLoopIndexPositive() {
        StrBuilder sb = new StrBuilder();
        sb.appendSeparator(',', 1);
        assertEquals(",", sb.toString());
    }

    // ===================== appendPadding =====================
    @Test
    public void testAppendPaddingNegative() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(-1, 'x');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPaddingZero() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(0, 'x');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPaddingPositive() {
        StrBuilder sb = new StrBuilder();
        sb.appendPadding(3, 'x');
        assertEquals("xxx", sb.toString());
    }

    // ===================== appendFixedWidthPadLeft(Object) =====================
    @Test
    public void testAppendFixedWidthPadLeftWidthZeroOrLess() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 0, 'x');
        assertEquals("", sb.toString());
        sb.appendFixedWidthPadLeft("abc", -1, 'x');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjNull() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendFixedWidthPadLeft((Object) null, 6, 'x');
        assertEquals("  NULL", sb.toString());
    }

    // Fault-detecting case: getNullText()==null -> str==null -> NPE จาก str.length()
    @Test(expected = NullPointerException.class)
    public void testAppendFixedWidthPadLeftObjNullWithoutNullText() {
        new StrBuilder().appendFixedWidthPadLeft((Object) null, 5, 'x');
    }

    @Test
    public void testAppendFixedWidthPadLeftStrLongerThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abcdef", 3, 'x');
        assertEquals("def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrEqualsWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("abc", 3, 'x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftStrShorterThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("ab", 5, 'x');
        assertEquals("xxxab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft(12, 5, '0');
        assertEquals("00012", sb.toString());
    }

    // ===================== appendFixedWidthPadRight =====================
    @Test
    public void testAppendFixedWidthPadRightWidthZeroOrLess() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", 0, 'x');
        assertEquals("", sb.toString());
        sb.appendFixedWidthPadRight("abc", -1, 'x');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjNull() {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendFixedWidthPadRight((Object) null, 6, 'x');
        assertEquals("NULL  ", sb.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testAppendFixedWidthPadRightObjNullWithoutNullText() {
        new StrBuilder().appendFixedWidthPadRight((Object) null, 5, 'x');
    }

    @Test
    public void testAppendFixedWidthPadRightStrLongerThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abcdef", 3, 'x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightStrEqualsWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("abc", 3, 'x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightStrShorterThanWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight("ab", 5, 'x');
        assertEquals("abxxx", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightInt() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadRight(12, 5, '0');
        assertEquals("12000", sb.toString());
    }

    // ===================== insert(Object) =====================
    @Test
    public void testInsertObjectNull() {
        StrBuilder sb = new StrBuilder("ac");
        sb.setNullText("NULL");
        sb.insert(1, (Object) null);
        assertEquals("aNULLc", sb.toString());
    }

    @Test
    public void testInsertObjectNonNull() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, (Object) "b");
        assertEquals("abc", sb.toString());
    }

    // ===================== insert(String) =====================
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndexNegative() {
        new StrBuilder("abc").insert(-1, "x");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndexTooLarge() {
        new StrBuilder("abc").insert(10, "x");
    }

    @Test
    public void testInsertStringNull() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, (String) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertStringNullWithNullText() {
        StrBuilder sb = new StrBuilder("ac");
        sb.setNullText("X");
        sb.insert(1, (String) null);
        assertEquals("aXc", sb.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, "");
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertStringNonEmpty() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());
    }

    // ===================== insert(char[]) =====================
    @Test
    public void testInsertCharArrayNull() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, (char[]) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayEmpty() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[0]);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayNonEmpty() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayInvalidIndex() {
        new StrBuilder("abc").insert(-1, new char[]{'x'});
    }

    // ===================== insert(char[],offset,length) =====================
    @Test
    public void testInsertCharArrayOffsetLengthNull() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("ac", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayOffsetNegative() {
        new StrBuilder("ac").insert(1, new char[]{'a','b'}, -1, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayOffsetTooLarge() {
        new StrBuilder("ac").insert(1, new char[]{'a','b'}, 10, 1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayLengthNegative() {
        new StrBuilder("ac").insert(1, new char[]{'a','b'}, 0, -1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertCharArrayLengthTooLarge() {
        new StrBuilder("ac").insert(1, new char[]{'a','b'}, 0, 10);
    }

    @Test
    public void testInsertCharArrayOffsetLengthZero() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'a','b'}, 0, 0);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayOffsetLengthValid() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, new char[]{'x','b','y'}, 1, 1);
        assertEquals("abc", sb.toString());
    }

    // ===================== insert(boolean) =====================
    @Test
    public void testInsertBooleanTrue() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, true);
        assertEquals("atruec", sb.toString());
    }

    @Test
    public void testInsertBooleanFalse() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, false);
        assertEquals("afalsec", sb.toString());
    }

    // ===================== insert(char/int/long/float/double) =====================
    @Test
    public void testInsertChar() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 'b');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testInsertInt() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 5);
        assertEquals("a5c", sb.toString());
    }

    @Test
    public void testInsertLong() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 5L);
        assertEquals("a5c", sb.toString());
    }

    @Test
    public void testInsertFloat() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 5.0f);
        assertEquals("a" + String.valueOf(5.0f) + "c", sb.toString());
    }

    @Test
    public void testInsertDouble() {
        StrBuilder sb = new StrBuilder("ac");
        sb.insert(1, 5.0d);
        assertEquals("a" + String.valueOf(5.0d) + "c", sb.toString());
    }

    // ===================== delete =====================
    @Test
    public void testDeleteRangeNonEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(1, 3);
        assertEquals("adef", sb.toString());
    }

    @Test
    public void testDeleteRangeZeroLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(2, 2);
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(1, 100);
        assertEquals("a", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteRangeStartNegative() {
        new StrBuilder("abc").delete(-1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteRangeStartGreaterThanEnd() {
        new StrBuilder("abc").delete(2, 1);
    }

    // ===================== deleteAll(char) / deleteFirst(char) =====================
    @Test
    public void testDeleteAllCharNoMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllCharSingleMatch() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('b');
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testDeleteAllCharMultipleMatchesConsecutive() {
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

    // ===================== deleteAll(String) / deleteFirst(String) =====================
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
    public void testDeleteAllStringMultipleMatch() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.deleteAll("abc");
        assertEquals("", sb.toString());
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
        StrBuilder sb = new StrBuilder("abcabc");
        sb.deleteFirst("abc");
        assertEquals("abc", sb.toString());
    }

    // ===================== deleteAll/deleteFirst(StrMatcher) =====================
    @Test
    public void testDeleteAllMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((StrMatcher) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllMatcherNonNull() {
        StrBuilder sb = new StrBuilder("aXbXc");
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
    public void testDeleteFirstMatcherNonNull() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.deleteFirst(StrMatcher.charMatcher('X'));
        assertEquals("abXc", sb.toString());
    }

    // ===================== replace(start,end,str) =====================
    @Test
    public void testReplaceRangeNullReplaceStr() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, null);
        assertEquals("adef", sb.toString());
    }

    @Test
    public void testReplaceRangeSameLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, "XY");
        assertEquals("aXYdef", sb.toString());
    }

    @Test
    public void testReplaceRangeLongerReplacement() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, "XYZ");
        assertEquals("aXYZdef", sb.toString());
    }

    @Test
    public void testReplaceRangeShorterReplacement() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 3, "X");
        assertEquals("aXdef", sb.toString());
    }

    @Test
    public void testReplaceRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(1, 100, "X");
        assertEquals("aX", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceRangeStartNegative() {
        new StrBuilder("abc").replace(-1, 2, "X");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplaceRangeStartGreaterThanEnd() {
        new StrBuilder("abc").replace(2, 1, "X");
    }

    // ===================== replaceAll/replaceFirst(char,char) =====================
    @Test
    public void testReplaceAllCharSameSearchReplace() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('b', 'b');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllCharDifferent() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceAll('a', 'X');
        assertEquals("XbXbXb", sb.toString());
    }

    @Test
    public void testReplaceFirstCharSameSearchReplace() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('b', 'b');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharDifferent() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceFirst('a', 'X');
        assertEquals("Xbabab", sb.toString());
    }

    // ===================== replaceAll/replaceFirst(String,String) =====================
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
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll("abc", null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testReplaceAllStringNonNullReplace() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll("abc", "X");
        assertEquals("XX", sb.toString());
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
        sb.replaceFirst("xyz", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNullReplace() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst("abc", null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNonNullReplace() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst("abc", "X");
        assertEquals("Xabc", sb.toString());
    }

    // ===================== replaceAll/replaceFirst(StrMatcher,String) =====================
    @Test
    public void testReplaceAllMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll((StrMatcher) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllMatcherNonNull() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceAll(StrMatcher.charMatcher('X'), "Y");
        assertEquals("aYbYc", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst((StrMatcher) null, "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherNonNull() {
        StrBuilder sb = new StrBuilder("aXbXc");
        sb.replaceFirst(StrMatcher.charMatcher('X'), "Y");
        assertEquals("aYbXc", sb.toString());
    }

    @Test
    public void testReplaceMatcherEmptyBuilder() {
        StrBuilder sb = new StrBuilder();
        sb.replace(StrMatcher.charMatcher('X'), "Y", 0, 0, -1);
        assertEquals("", sb.toString());
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
        StrBuilder sb = new StrBuilder("abcde");
        sb.reverse();
        assertEquals("edcba", sb.toString());
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
    public void testTrimLeadingAndTrailing() {
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
    public void testStartsWithTooLong() {
        assertFalse(new StrBuilder("ab").startsWith("abcdef"));
    }

    @Test
    public void testStartsWithMatch() {
        assertTrue(new StrBuilder("abcdef").startsWith("abc"));
    }

    @Test
    public void testStartsWithNoMatch() {
        assertFalse(new StrBuilder("abcdef").startsWith("xbc"));
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
    public void testEndsWithTooLong() {
        assertFalse(new StrBuilder("ab").endsWith("abcdef"));
    }

    @Test
    public void testEndsWithMatch() {
        assertTrue(new StrBuilder("abcdef").endsWith("def"));
    }

    @Test
    public void testEndsWithNoMatch() {
        assertFalse(new StrBuilder("abcdef").endsWith("deX"));
    }

    // ===================== substring =====================
    @Test
    public void testSubstringStart() {
        assertEquals("cdef", new StrBuilder("abcdef").substring(2));
    }

    @Test
    public void testSubstringStartEnd() {
        assertEquals("cd", new StrBuilder("abcdef").substring(2, 4));
    }

    @Test
    public void testSubstringEndTooLarge() {
        assertEquals("bc", new StrBuilder("abc").substring(1, 100));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstringStartNegative() {
        new StrBuilder("abc").substring(-1, 2);
    }

    // ===================== leftString / rightString / midString =====================
    @Test
    public void testLeftStringNegative() {
        assertEquals("", new StrBuilder("abc").leftString(-1));
    }

    @Test
    public void testLeftStringZero() {
        assertEquals("", new StrBuilder("abc").leftString(0));
    }

    @Test
    public void testLeftStringGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.leftString(10));
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringLessThanSize() {
        assertEquals("ab", new StrBuilder("abcdef").leftString(2));
    }

    @Test
    public void testRightStringNegative() {
        assertEquals("", new StrBuilder("abc").rightString(-1));
    }

    @Test
    public void testRightStringZero() {
        assertEquals("", new StrBuilder("abc").rightString(0));
    }

    @Test
    public void testRightStringGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.rightString(10));
        assertEquals("abc", sb.rightString(3));
    }

    @Test
    public void testRightStringLessThanSize() {
        assertEquals("ef", new StrBuilder("abcdef").rightString(2));
    }

    @Test
    public void testMidStringNegativeIndex() {
        assertEquals("abc", new StrBuilder("abcdef").midString(-2, 3));
    }

    @Test
    public void testMidStringLengthZeroOrLess() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(1, 0));
        assertEquals("", sb.midString(1, -1));
    }

    @Test
    public void testMidStringIndexGreaterEqualSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.midString(5, 2));
        assertEquals("", sb.midString(3, 2));
    }

    @Test
    public void testMidStringSizeLessEqualIndexPlusLength() {
        assertEquals("ef", new StrBuilder("abcdef").midString(4, 10));
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
        assertFalse(new StrBuilder("abc").contains('x'));
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
        assertFalse(new StrBuilder("abc").contains(StrMatcher.charMatcher('x')));
    }

    // ===================== indexOf =====================
    @Test
    public void testIndexOfCharFound() {
        assertEquals(1, new StrBuilder("abcabc").indexOf('b'));
    }

    @Test
    public void testIndexOfCharNotFound() {
        assertEquals(-1, new StrBuilder("abc").indexOf('x'));
    }

    @Test
    public void testIndexOfCharStartIndexNegative() {
        assertEquals(1, new StrBuilder("abcabc").indexOf('b', -5));
    }

    @Test
    public void testIndexOfCharStartIndexTooLarge() {
        assertEquals(-1, new StrBuilder("abc").indexOf('a', 10));
    }

    @Test
    public void testIndexOfCharStartIndexValid() {
        assertEquals(4, new StrBuilder("abcabc").indexOf('b', 2));
    }

    @Test
    public void testIndexOfStringFound() {
        assertEquals(2, new StrBuilder("abcdef").indexOf("cd"));
    }

    @Test
    public void testIndexOfStringNotFound() {
        assertEquals(-1, new StrBuilder("abcdef").indexOf("xyz"));
    }

    @Test
    public void testIndexOfStringStartIndexNegative() {
        assertEquals(2, new StrBuilder("abcdef").indexOf("cd", -5));
    }

    @Test
    public void testIndexOfStringNullStr() {
        assertEquals(-1, new StrBuilder("abc").indexOf((String) null, 0));
    }

    @Test
    public void testIndexOfStringStartIndexTooLarge() {
        assertEquals(-1, new StrBuilder("abc").indexOf("a", 10));
    }

    @Test
    public void testIndexOfStringLengthOne() {
        assertEquals(1, new StrBuilder("abcabc").indexOf("b", 0));
    }

    @Test
    public void testIndexOfStringLengthZero() {
        assertEquals(1, new StrBuilder("abc").indexOf("", 1));
    }

    @Test
    public void testIndexOfStringLongerThanSize() {
        assertEquals(-1, new StrBuilder("ab").indexOf("abcdef", 0));
    }

    @Test
    public void testIndexOfStringMultiCharMatch() {
        assertEquals(2, new StrBuilder("xxabcxx").indexOf("abc", 0));
    }

    @Test
    public void testIndexOfStringMultiCharNoMatch()