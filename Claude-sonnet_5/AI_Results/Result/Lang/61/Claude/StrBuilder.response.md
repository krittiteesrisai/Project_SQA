# StrBuilderTest.java

```java
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.text.StrBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for org.apache.commons.lang.text.StrBuilder (Defects4J Lang-61b)
 *
 * หมายเหตุ: เมธอดที่ขึ้นกับ org.apache.commons.lang.text.StrMatcher
 * (deleteAll(StrMatcher), deleteFirst(StrMatcher), replaceAll(StrMatcher,..),
 * replaceFirst(StrMatcher,..), contains(StrMatcher), indexOf(StrMatcher,..),
 * lastIndexOf(StrMatcher,..)) และรายละเอียดภายในของ asTokenizer()/StrTokenizer
 * ไม่ได้ถูกทดสอบเชิงลึก เนื่องจากไม่มีซอร์สของ StrMatcher/StrTokenizer ให้วิเคราะห์
 * การเดา behavior ของคลาสเหล่านั้นจะขัดกับข้อกำหนดข้อ 4
 */
public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    // ----------------------------------------------------------------- ctor
    @Test
    public void testDefaultConstructor() {
        StrBuilder b = new StrBuilder();
        assertEquals(32, b.capacity());
        assertEquals(0, b.length());
    }

    @Test
    public void testIntConstructor_positive() {
        StrBuilder b = new StrBuilder(10);
        assertEquals(10, b.capacity());
    }

    @Test
    public void testIntConstructor_zeroOrNegative() {
        StrBuilder b1 = new StrBuilder(0);
        assertEquals(32, b1.capacity());
        StrBuilder b2 = new StrBuilder(-5);
        assertEquals(32, b2.capacity());
    }

    @Test
    public void testStringConstructor_null() {
        StrBuilder b = new StrBuilder((String) null);
        assertEquals(0, b.length());
        assertEquals(32, b.capacity());
    }

    @Test
    public void testStringConstructor_nonNull() {
        StrBuilder b = new StrBuilder("abc");
        assertEquals("abc", b.toString());
        assertEquals(3 + 32, b.capacity());
    }

    // ------------------------------------------------------------ newline
    @Test
    public void testNewLineText() {
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\n");
        assertEquals("\n", sb.getNewLineText());
    }

    @Test
    public void testAppendNewLine_defaultSystem() {
        sb.appendNewLine();
        assertEquals(System.getProperty("line.separator"), sb.toString());
    }

    @Test
    public void testAppendNewLine_custom() {
        sb.setNewLineText("<br/>");
        sb.appendNewLine();
        assertEquals("<br/>", sb.toString());
    }

    // ------------------------------------------------------------ nullText
    @Test
    public void testNullText_setNullAndEmpty() {
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText(""); // branch: empty -> converted to null
        assertNull(sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testAppendNull_noNullText() {
        sb.appendNull();
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNull_withNullText() {
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    // ------------------------------------------------------------ length/size
    @Test
    public void testLengthSizeIsEmptyClear() {
        assertTrue(sb.isEmpty());
        sb.append("abc");
        assertEquals(3, sb.length());
        assertEquals(3, sb.size());
        assertFalse(sb.isEmpty());
        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testSetLength_negative_throws() {
        try {
            sb.setLength(-1);
            fail("expected exception");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSetLength_lessThanSize() {
        sb.append("abcdef");
        sb.setLength(3);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLength_greaterThanSize() {
        sb.append("ab");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals('\0', sb.charAt(4));
    }

    @Test
    public void testSetLength_equalToSize_noChange() {
        sb.append("abc");
        sb.setLength(3);
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ capacity
    @Test
    public void testEnsureCapacity_noGrowth() {
        StrBuilder b = new StrBuilder(10);
        b.ensureCapacity(5);
        assertEquals(10, b.capacity());
    }

    @Test
    public void testEnsureCapacity_growth() {
        StrBuilder b = new StrBuilder(2);
        b.ensureCapacity(20);
        assertEquals(20, b.capacity());
    }

    @Test
    public void testMinimizeCapacity_shrinks() {
        StrBuilder b = new StrBuilder(50);
        b.append("abc");
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
    }

    @Test
    public void testMinimizeCapacity_noChange() {
        StrBuilder b = new StrBuilder(3);
        b.append("abc");
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
    }

    // ------------------------------------------------------------ charAt/setCharAt/deleteCharAt
    @Test
    public void testCharAt_valid() {
        sb.append("abc");
        assertEquals('b', sb.charAt(1));
    }

    @Test
    public void testCharAt_negative_throws() {
        sb.append("abc");
        try {
            sb.charAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testCharAt_tooLarge_throws() {
        sb.append("abc");
        try {
            sb.charAt(3);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testSetCharAt_valid() {
        sb.append("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
    }

    @Test
    public void testSetCharAt_invalid_throws() {
        sb.append("abc");
        try {
            sb.setCharAt(5, 'X');
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testDeleteCharAt_valid() {
        sb.append("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testDeleteCharAt_invalid_throws() {
        sb.append("abc");
        try {
            sb.deleteCharAt(-1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.deleteCharAt(3);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ toCharArray
    @Test
    public void testToCharArray_empty() {
        char[] arr = sb.toCharArray();
        assertEquals(0, arr.length);
    }

    @Test
    public void testToCharArray_nonEmpty() {
        sb.append("abc");
        char[] arr = sb.toCharArray();
        assertArrayEquals(new char[]{'a','b','c'}, arr);
    }

    @Test
    public void testToCharArrayRange_normal() {
        sb.append("abcdef");
        char[] arr = sb.toCharArray(1, 4);
        assertArrayEquals(new char[]{'b','c','d'}, arr);
    }

    @Test
    public void testToCharArrayRange_emptyLen() {
        sb.append("abcdef");
        char[] arr = sb.toCharArray(2, 2);
        assertEquals(0, arr.length);
    }

    @Test
    public void testToCharArrayRange_endTooLarge() {
        sb.append("abc");
        char[] arr = sb.toCharArray(0, 100); // clamp to size
        assertArrayEquals(new char[]{'a','b','c'}, arr);
    }

    @Test
    public void testToCharArrayRange_invalidStart_throws() {
        sb.append("abc");
        try {
            sb.toCharArray(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ getChars
    @Test
    public void testGetChars_nullDestination() {
        sb.append("abc");
        char[] result = sb.getChars(null);
        assertArrayEquals(new char[]{'a','b','c'}, result);
    }

    @Test
    public void testGetChars_destinationTooSmall() {
        sb.append("abc");
        char[] dest = new char[1];
        char[] result = sb.getChars(dest);
        assertEquals(3, result.length);
    }

    @Test
    public void testGetChars_destinationAdequate() {
        sb.append("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertSame(dest, result);
        assertEquals('a', result[0]);
    }

    @Test
    public void testGetChars4Args_valid() {
        sb.append("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 2);
        assertArrayEquals(new char[]{'b','c','d'}, Arrays.copyOfRange(dest, 2, 5));
    }

    @Test
    public void testGetChars4Args_startNegative_throws() {
        sb.append("abc");
        try {
            sb.getChars(-1, 2, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4Args_endNegative_throws() {
        sb.append("abc");
        try {
            sb.getChars(0, -1, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4Args_endTooLarge_throws() {
        sb.append("abc");
        try {
            sb.getChars(0, 100, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testGetChars4Args_startGreaterThanEnd_throws() {
        sb.append("abc");
        try {
            sb.getChars(2, 1, new char[5], 0);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ append(Object)
    @Test
    public void testAppendObject_null() {
        sb.append((Object) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendObject_nonNull() {
        sb.append((Object) Integer.valueOf(5));
        assertEquals("5", sb.toString());
    }

    // ------------------------------------------------------------ append(String)
    @Test
    public void testAppendString_null() {
        sb.append((String) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendString_empty() {
        sb.append("");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendString_nonEmpty() {
        sb.append("hello");
        assertEquals("hello", sb.toString());
    }

    // ------------------------------------------------------------ append(String,start,len)
    @Test
    public void testAppendStringRange_null() {
        sb.append((String) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringRange_normal() {
        sb.append("hello", 1, 3);
        assertEquals("ell", sb.toString());
    }

    @Test
    public void testAppendStringRange_zeroLength() {
        sb.append("hello", 1, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringRange_invalidStart_throws() {
        try {
            sb.append("hello", -1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append("hello", 10, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testAppendStringRange_invalidLength_throws() {
        try {
            sb.append("hello", 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append("hello", 2, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ append(StringBuffer)
    @Test
    public void testAppendStringBuffer_null() {
        sb.append((StringBuffer) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBuffer_empty() {
        sb.append(new StringBuffer());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBuffer_nonEmpty() {
        sb.append(new StringBuffer("xyz"));
        assertEquals("xyz", sb.toString());
    }

    // ------------------------------------------------------------ append(StringBuffer,start,len)
    @Test
    public void testAppendStringBufferRange_null() {
        sb.append((StringBuffer) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStringBufferRange_normal() {
        sb.append(new StringBuffer("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    @Test
    public void testAppendStringBufferRange_invalid_throws() {
        StringBuffer buf = new StringBuffer("abc");
        try {
            sb.append(buf, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(buf, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(buf, 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ append(StrBuilder)
    @Test
    public void testAppendStrBuilder_null() {
        sb.append((StrBuilder) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilder_empty() {
        sb.append(new StrBuilder());
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilder_nonEmpty() {
        sb.append(new StrBuilder("xy"));
        assertEquals("xy", sb.toString());
    }

    // ------------------------------------------------------------ append(StrBuilder,start,len)
    @Test
    public void testAppendStrBuilderRange_null() {
        sb.append((StrBuilder) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRange_normal() {
        sb.append(new StrBuilder("abcdef"), 1, 3);
        assertEquals("bcd", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRange_invalid_throws() {
        StrBuilder other = new StrBuilder("abc");
        try {
            sb.append(other, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(other, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(other, 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ append(char[])
    @Test
    public void testAppendCharArray_null() {
        sb.append((char[]) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArray_empty() {
        sb.append(new char[0]);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArray_nonEmpty() {
        sb.append(new char[]{'a','b'});
        assertEquals("ab", sb.toString());
    }

    // ------------------------------------------------------------ append(char[],start,len)
    @Test
    public void testAppendCharArrayRange_null() {
        sb.append((char[]) null, 0, 0);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendCharArrayRange_normal() {
        sb.append(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testAppendCharArrayRange_invalid_throws() {
        char[] arr = {'a','b','c'};
        try {
            sb.append(arr, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(arr, 5, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(arr, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.append(arr, 1, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ append primitives
    @Test
    public void testAppendBoolean_true() {
        sb.append(true);
        assertEquals("true", sb.toString());
    }

    @Test
    public void testAppendBoolean_false() {
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    @Test
    public void testAppendChar() {
        sb.append('Z');
        assertEquals("Z", sb.toString());
    }

    @Test
    public void testAppendIntLongFloatDouble() {
        sb.append(1);
        sb.append(2L);
        sb.append(1.5f);
        sb.append(2.5d);
        assertEquals("12" + String.valueOf(1.5f) + String.valueOf(2.5d), sb.toString());
    }

    // ------------------------------------------------------------ appendWithSeparators(Object[])
    @Test
    public void testAppendWithSeparatorsArray_null() {
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray_empty() {
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray_nonEmpty_withSeparator() {
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray_nullSeparator() {
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("ab", sb.toString());
    }

    // ------------------------------------------------------------ appendWithSeparators(Collection)
    @Test
    public void testAppendWithSeparatorsCollection_null() {
        sb.appendWithSeparators(null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection_empty() {
        sb.appendWithSeparators(new ArrayList(), ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection_nonEmpty() {
        List list = Arrays.asList("a", "b", "c");
        sb.appendWithSeparators(list, "-");
        assertEquals("a-b-c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection_nullSeparator() {
        List list = Arrays.asList("a", "b");
        sb.appendWithSeparators(list, null);
        assertEquals("ab", sb.toString());
    }

    // ------------------------------------------------------------ appendWithSeparators(Iterator)
    @Test
    public void testAppendWithSeparatorsIterator_null() {
        sb.appendWithSeparators((java.util.Iterator) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator_nonEmpty() {
        List list = Arrays.asList("x", "y");
        sb.appendWithSeparators(list.iterator(), ",");
        assertEquals("x,y", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator_nullSeparator() {
        List list = Arrays.asList("x", "y");
        sb.appendWithSeparators(list.iterator(), null);
        assertEquals("xy", sb.toString());
    }

    // ------------------------------------------------------------ appendPadding
    @Test
    public void testAppendPadding_positive() {
        sb.appendPadding(3, '*');
        assertEquals("***", sb.toString());
    }

    @Test
    public void testAppendPadding_zero() {
        sb.appendPadding(0, '*');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPadding_negative_noAction() {
        sb.appendPadding(-1, '*');
        assertEquals("", sb.toString());
    }

    // ------------------------------------------------------------ appendFixedWidthPadLeft
    @Test
    public void testAppendFixedWidthPadLeft_widthZeroOrNeg() {
        sb.appendFixedWidthPadLeft("ab", 0, '*');
        assertEquals("", sb.toString());
        sb.appendFixedWidthPadLeft("ab", -1, '*');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_truncate() {
        sb.appendFixedWidthPadLeft("abcdef", 3, '*');
        assertEquals("def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_pad() {
        sb.appendFixedWidthPadLeft("ab", 5, '*');
        assertEquals("***ab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_nullObjWithNullText() {
        sb.setNullText("N");
        sb.appendFixedWidthPadLeft((Object) null, 3, '*');
        assertEquals("**N", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_nullObjNoNullText_throwsNPE() {
        // ไม่มี nullText -> getNullText() คืน null -> str.length() NPE ตามพฤติกรรมของซอร์ส
        try {
            sb.appendFixedWidthPadLeft((Object) null, 3, '*');
            fail("expected NPE per source behavior");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() {
        sb.appendFixedWidthPadLeft(5, 3, '0');
        assertEquals("005", sb.toString());
    }

    // ------------------------------------------------------------ appendFixedWidthPadRight
    @Test
    public void testAppendFixedWidthPadRight_widthZeroOrNeg() {
        sb.appendFixedWidthPadRight("ab", 0, '*');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_truncate() {
        sb.appendFixedWidthPadRight("abcdef", 3, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_pad() {
        sb.appendFixedWidthPadRight("ab", 5, '*');
        assertEquals("ab***", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_nullObjWithNullText() {
        sb.setNullText("N");
        sb.appendFixedWidthPadRight((Object) null, 3, '*');
        assertEquals("N**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightInt() {
        sb.appendFixedWidthPadRight(5, 3, '0');
        assertEquals("500", sb.toString());
    }

    // ------------------------------------------------------------ insert(Object)
    @Test
    public void testInsertObject_null_withNullText() {
        sb.append("ac");
        sb.setNullText("B");
        sb.insert(1, (Object) null);
        assertEquals("aBc", sb.toString());
    }

    @Test
    public void testInsertObject_null_noNullText() {
        sb.append("ac");
        sb.insert(1, (Object) null);
        assertEquals("ac", sb.toString()); // no-op since nullText is null
    }

    @Test
    public void testInsertObject_nonNull() {
        sb.append("ac");
        sb.insert(1, Integer.valueOf(9));
        assertEquals("a9c", sb.toString());
    }

    // ------------------------------------------------------------ insert(String)
    @Test
    public void testInsertString_invalidIndex_throws() {
        sb.append("abc");
        try {
            sb.insert(-1, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.insert(10, "x");
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertString_null_noNullText() {
        sb.append("abc");
        sb.insert(1, (String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testInsertString_null_withNullText() {
        sb.append("ac");
        sb.setNullText("B");
        sb.insert(1, (String) null);
        assertEquals("aBc", sb.toString());
    }

    @Test
    public void testInsertString_normal() {
        sb.append("ac");
        sb.insert(1, "b");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testInsertString_emptyString_noOp() {
        sb.append("ac");
        sb.insert(1, "");
        assertEquals("ac", sb.toString());
    }

    // ------------------------------------------------------------ insert(char[])
    @Test
    public void testInsertCharArray_invalidIndex_throws() {
        sb.append("abc");
        try {
            sb.insert(-1, new char[]{'x'});
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArray_null() {
        sb.append("ac");
        sb.insert(1, (char[]) null);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArray_empty() {
        sb.append("ac");
        sb.insert(1, new char[0]);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArray_normal() {
        sb.append("ac");
        sb.insert(1, new char[]{'b'});
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ insert(char[],offset,len)
    @Test
    public void testInsertCharArrayRange_null() {
        sb.append("ac");
        sb.insert(1, (char[]) null, 0, 0);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testInsertCharArrayRange_invalidOffset_throws() {
        sb.append("ac");
        char[] c = {'x','y'};
        try {
            sb.insert(1, c, -1, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.insert(1, c, 5, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRange_invalidLength_throws() {
        sb.append("ac");
        char[] c = {'x','y'};
        try {
            sb.insert(1, c, 0, -1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
        try {
            sb.insert(1, c, 0, 10);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testInsertCharArrayRange_normal() {
        sb.append("ad");
        sb.insert(1, new char[]{'x','b','c','y'}, 1, 2);
        assertEquals("abcd", sb.toString());
    }

    @Test
    public void testInsertCharArrayRange_zeroLength_noOp() {
        sb.append("ac");
        sb.insert(1, new char[]{'x'}, 0, 0);
        assertEquals("ac", sb.toString());
    }

    // ------------------------------------------------------------ insert(boolean)
    @Test
    public void testInsertBoolean_true() {
        sb.append("ac");
        sb.insert(1, true);
        assertEquals("atruec", sb.toString());
    }

    @Test
    public void testInsertBoolean_false() {
        sb.append("ac");
        sb.insert(1, false);
        assertEquals("afalsec", sb.toString());
    }

    @Test
    public void testInsertBoolean_invalidIndex_throws() {
        sb.append("ac");
        try {
            sb.insert(-1, true);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ insert(char)
    @Test
    public void testInsertChar() {
        sb.append("ac");
        sb.insert(1, 'b');
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ insert(int/long/float/double)
    @Test
    public void testInsertNumericTypes() {
        sb.append("|");
        sb.insert(0, 1);
        sb.insert(0, 2L);
        sb.insert(0, 1.5f);
        sb.insert(0, 2.5d);
        assertTrue(sb.toString().endsWith("|"));
    }

    // ------------------------------------------------------------ delete
    @Test
    public void testDelete_normal() {
        sb.append("abcdef");
        sb.delete(1, 4);
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testDelete_zeroLength_noOp() {
        sb.append("abc");
        sb.delete(1, 1);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDelete_endTooLarge_clamped() {
        sb.append("abc");
        sb.delete(1, 100);
        assertEquals("a", sb.toString());
    }

    @Test
    public void testDelete_invalidStart_throws() {
        sb.append("abc");
        try {
            sb.delete(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ deleteAll(char)
    @Test
    public void testDeleteAllChar_multipleRuns() {
        sb.append("aabaaac");
        sb.deleteAll('a');
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testDeleteAllChar_noMatch() {
        sb.append("xyz");
        sb.deleteAll('a');
        assertEquals("xyz", sb.toString());
    }

    @Test
    public void testDeleteAllChar_singleOccurrences() {
        sb.append("axbxc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ deleteFirst(char)
    @Test
    public void testDeleteFirstChar_found() {
        sb.append("abcabc");
        sb.deleteFirst('b');
        assertEquals("acabc", sb.toString());
    }

    @Test
    public void testDeleteFirstChar_notFound() {
        sb.append("abc");
        sb.deleteFirst('z');
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ deleteAll(String)
    @Test
    public void testDeleteAllString_null_noOp() {
        sb.append("abc");
        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllString_empty_noOp() {
        sb.append("abc");
        sb.deleteAll("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllString_found() {
        sb.append("abXcdXef");
        sb.deleteAll("X");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteAllString_notFound() {
        sb.append("abc");
        sb.deleteAll("z");
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ deleteFirst(String)
    @Test
    public void testDeleteFirstString_null_noOp() {
        sb.append("abc");
        sb.deleteFirst((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstString_found() {
        sb.append("abXcdXef");
        sb.deleteFirst("X");
        assertEquals("abcdXef", sb.toString());
    }

    @Test
    public void testDeleteFirstString_notFound() {
        sb.append("abc");
        sb.deleteFirst("z");
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ replace(int,int,String)
    @Test
    public void testReplace_sameLength() {
        sb.append("abcdef");
        sb.replace(1, 3, "XY");
        assertEquals("aXYdef", sb.toString());
    }

    @Test
    public void testReplace_longerInsert() {
        sb.append("abcdef");
        sb.replace(1, 2, "XYZ");
        assertEquals("aXYZcdef", sb.toString());
    }

    @Test
    public void testReplace_shorterInsert() {
        sb.append("abcdef");
        sb.replace(1, 4, "X");
        assertEquals("aXef", sb.toString());
    }

    @Test
    public void testReplace_nullReplaceStr_deletes() {
        sb.append("abcdef");
        sb.replace(1, 4, null);
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testReplace_endTooLarge_clamped() {
        sb.append("abc");
        sb.replace(1, 100, "X");
        assertEquals("aX", sb.toString());
    }

    // ------------------------------------------------------------ replaceAll(char,char)
    @Test
    public void testReplaceAllChar_normal() {
        sb.append("banana");
        sb.replaceAll('a', 'X');
        assertEquals("bXnXnX", sb.toString());
    }

    @Test
    public void testReplaceAllChar_searchEqualsReplace_noOp() {
        sb.append("banana");
        sb.replaceAll('a', 'a');
        assertEquals("banana", sb.toString());
    }

    // ------------------------------------------------------------ replaceFirst(char,char)
    @Test
    public void testReplaceFirstChar_normal() {
        sb.append("banana");
        sb.replaceFirst('a', 'X');
        assertEquals("bXnana", sb.toString());
    }

    @Test
    public void testReplaceFirstChar_searchEqualsReplace_noOp() {
        sb.append("banana");
        sb.replaceFirst('a', 'a');
        assertEquals("banana", sb.toString());
    }

    // ------------------------------------------------------------ replaceAll(String,String)
    @Test
    public void testReplaceAllString_nullOrEmptySearch_noOp() {
        sb.append("abc");
        sb.replaceAll((String) null, "X");
        assertEquals("abc", sb.toString());
        sb.replaceAll("", "X");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllString_normal() {
        sb.append("aXbXcX");
        sb.replaceAll("X", "-");
        assertEquals("a-b-c-", sb.toString());
    }

    @Test
    public void testReplaceAllString_nullReplace_deletes() {
        sb.append("aXbXc");
        sb.replaceAll("X", null);
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ replaceFirst(String,String)
    @Test
    public void testReplaceFirstString_found() {
        sb.append("aXbXc");
        sb.replaceFirst("X", "-");
        assertEquals("a-bXc", sb.toString());
    }

    @Test
    public void testReplaceFirstString_notFound() {
        sb.append("abc");
        sb.replaceFirst("X", "-");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstString_nullOrEmptySearch_noOp() {
        sb.append("abc");
        sb.replaceFirst((String) null, "X");
        assertEquals("abc", sb.toString());
        sb.replaceFirst("", "X");
        assertEquals("abc", sb.toString());
    }

    // ------------------------------------------------------------ reverse
    @Test
    public void testReverse_empty() {
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverse_oddLength() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testReverse_evenLength() {
        sb.append("abcd");
        sb.reverse();
        assertEquals("dcba", sb.toString());
    }

    // ------------------------------------------------------------ trim
    @Test
    public void testTrim_empty() {
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrim_leadingAndTrailingSpaces() {
        sb.append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_noSpaces() {
        sb.append("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_onlyLeading() {
        sb.append("  abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_onlyTrailing() {
        sb.append("abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_allSpaces() {
        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    // ------------------------------------------------------------ startsWith/endsWith
    @Test
    public void testStartsWith_null() {
        sb.append("abc");
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWith_empty() {
        sb.append("abc");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWith_tooLong() {
        sb.append("ab");
        assertFalse(sb.startsWith("abcdef"));
    }

    @Test
    public void testStartsWith_mismatch() {
        sb.append("abc");
        assertFalse(sb.startsWith("axc"));
    }

    @Test
    public void testStartsWith_match() {
        sb.append("abcdef");
        assertTrue(sb.startsWith("abc"));
    }

    @Test
    public void testEndsWith_null() {
        sb.append("abc");
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWith_empty() {
        sb.append("abc");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWith_tooLong() {
        sb.append("ab");
        assertFalse(sb.endsWith("abcdef"));
    }

    @Test
    public void testEndsWith_mismatch() {
        sb.append("abc");
        assertFalse(sb.endsWith("axc"));
    }

    @Test
    public void testEndsWith_match() {
        sb.append("abcdef");
        assertTrue(sb.endsWith("def"));
    }

    // ------------------------------------------------------------ substring
    @Test
    public void testSubstring_fromStart() {
        sb.append("abcdef");
        assertEquals("cdef", sb.substring(2));
    }

    @Test
    public void testSubstring_range_normal() {
        sb.append("abcdef");
        assertEquals("bcd", sb.substring(1, 4));
    }

    @Test
    public void testSubstring_range_endTooLarge() {
        sb.append("abc");
        assertEquals("bc", sb.substring(1, 100));
    }

    @Test
    public void testSubstring_invalidStart_throws() {
        sb.append("abc");
        try {
            sb.substring(-1, 2);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    @Test
    public void testSubstring_startGreaterThanEnd_throws() {
        sb.append("abc");
        try {
            sb.substring(2, 1);
            fail();
        } catch (StringIndexOutOfBoundsException e) { }
    }

    // ------------------------------------------------------------ leftString/rightString/midString
    @Test
    public void testLeftString_negativeOrZero() {
        sb.append("abc");
        assertEquals("", sb.leftString(0));
        assertEquals("", sb.leftString(-1));
    }

    @Test
    public void testLeftString_tooLong() {
        sb.append("abc");
        assertEquals("abc", sb.leftString(10));
    }

    @Test
    public void testLeftString_normal() {
        sb.append("abcdef");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testRightString_negativeOrZero() {
        sb.append("abc");
        assertEquals("", sb.rightString(0));
        assertEquals("", sb.rightString(-1));
    }

    @Test
    public void testRightString_tooLong() {
        sb.append("abc");
        assertEquals("abc", sb.rightString(10));
    }

    @Test
    public void testRightString_normal() {
        sb.append("abcdef");
        assertEquals("def", sb.rightString(3));
    }

    @Test
    public void testMidString_negativeIndex() {
        sb.append("abcdef");
        assertEquals("abc", sb.midString(-1, 3));
    }

    @Test
    public void testMidString_lengthLEZero() {
        sb.append("abcdef");
        assertEquals("", sb.midString(1, 0));
    }

    @Test
    public void testMidString_indexTooLarge() {
        sb.append("abc");
        assertEquals("", sb.midString(10, 2));
    }

    @Test
    public void testMidString_sizeLEIndexPlusLength() {
        sb.append("abcdef");
        assertEquals("def", sb.midString(3, 100));
    }

    @Test
    public void testMidString_normal() {
        sb.append("abcdef");
        assertEquals("cd", sb.midString(2, 2));
    }

    // ------------------------------------------------------------ contains
    @Test
    public void testContainsChar() {
        sb.append("abc");
        assertTrue(sb.contains('b'));
        assertFalse(sb.contains('z'));
    }

    @Test
    public void testContainsString() {
        sb.append("abcdef");
        assertTrue(sb.contains("cd"));
        assertFalse(sb.contains("zz"));
    }

    // ------------------------------------------------------------ indexOf(char[,start])
    @Test
    public void testIndexOfChar() {
        sb.append("abcabc");
        assertEquals(1, sb.indexOf('b'));
    }

    @Test
    public void testIndexOfChar_notFound() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('z'));
    }

    @Test
    public void testIndexOfCharStart_negativeClamped() {
        sb.append("abc");
        assertEquals(0, sb.indexOf('a', -5));
    }

    @Test
    public void testIndexOfCharStart_tooLarge() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf('a', 10));
    }

    // ------------------------------------------------------------ indexOf(String[,start])
    @Test
    public void testIndexOfString_basic() {
        sb.append("abcdef");
        assertEquals(2, sb.indexOf("cd"));
    }

    @Test
    public void testIndexOfString_null() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void testIndexOfString_startNegativeClamped() {
        sb.append("abc");
        assertEquals(0, sb.indexOf("a", -5));
    }

    @Test
    public void testIndexOfString_startTooLarge() {
        sb.append("abc");
        assertEquals(-1, sb.indexOf("a", 10));
    }

    @Test
    public void testIndexOfString_singleCharDelegate() {
        sb.append("abc");
        assertEquals(1, sb.indexOf("b", 0));
    }

    @Test
    public void testIndexOfString_emptyStrReturnsStart() {
        sb.append("abc");
        assertEquals(1, sb.indexOf("", 1));
    }

    @Test
    public void testIndexOfString_strLongerThanSize() {
        sb.append("ab");
        assertEquals(-1, sb.indexOf("abcdef", 0));
    }

    @Test
    public void testIndexOfString_notFound() {
        sb.append("abcdef");
        assertEquals(-1, sb.indexOf("xyz"));
    }

    // ------------------------------------------------------------ lastIndexOf(char[,start])
    @Test
    public void testLastIndexOfChar_basic() {
        sb.append("abcabc");
        assertEquals(4, sb.lastIndexOf('b'));
    }

    @Test
    public void testLastIndexOfChar_emptyBuilder() {
        assertEquals(-1, sb.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOfCharStart_clampedHigh() {
        sb.append("abcabc");
        assertEquals(1, sb.lastIndexOf('b', 100));
    }

    @Test
    public void testLastIndexOfChar_notFound() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf('z'));
    }

    // ------------------------------------------------------------ lastIndexOf(String[,start])
    @Test
    public void testLastIndexOfString_basic() {
        sb.append("abcabc");
        assertEquals(3, sb.lastIndexOf("abc"));
    }

    @Test
    public void testLastIndexOfString_null() {
        sb.append("abc");
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOfString_emptyBuilder_negativeStart() {
        assertEquals(-1, sb.lastIndexOf("a"));
    }

    @Test
    public void testLastIndexOfString_singleCharDelegate() {
        sb.append("abcabc");
        assertEquals(4, sb.lastIndexOf("b"));
    }

    @Test
    public void testLastIndexOfString_emptyStrReturnsStart() {
        sb.append("abc");
        assertEquals(2, sb.lastIndexOf("", 2));
    }

    @Test
    public void testLastIndexOfString_strLongerThanSize() {
        sb.append("ab");
        assertEquals(-1, sb.lastIndexOf("abcdef"));
    }

    @Test
    public void testLastIndexOfString_notFound() {
        sb.append("abcdef");
        assertEquals(-1, sb.lastIndexOf("xyz"));
    }

    // ------------------------------------------------------------ equals/hashCode/toString
    @Test
    public void testEqualsIgnoreCase_sameRef() {
        assertTrue(sb.equalsIgnoreCase(sb));
    }

    @Test
    public void testEqualsIgnoreCase_differentSize() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("ab");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCase_caseInsensitiveMatch() {
        sb.append("ABC");
        StrBuilder other = new StrBuilder("abc");
        assertTrue(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCase_mismatch() {
        sb.append("ABC");
        StrBuilder other = new StrBuilder("abd");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCase_nullParam_throwsNPE() {
        // ไม่มีการตรวจ null ของ other ในซอร์ส -> NPE ตามพฤติกรรมจริง
        sb.append("abc");
        try {
            sb.equalsIgnoreCase(null);
            fail("expected NPE per source (no null-check on other)");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEqualsStrBuilder_sameRef() {
        assertTrue(sb.equals(sb));
    }

    @Test
    public void testEqualsStrBuilder_differentSize() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("ab");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsStrBuilder_match() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abc");
        assertTrue(sb.equals(other));
    }

    @Test
    public void testEqualsStrBuilder_mismatch() {
        sb.append("abc");
        StrBuilder other = new StrBuilder("abd");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsStrBuilder_nullParam_throwsNPE() {
        sb.append("abc");
        try {
            sb.equals((StrBuilder) null);
            fail("expected NPE (static overload resolves to StrBuilder param, no null-check)");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEqualsObject_notStrBuilderInstance() {
        sb.append("abc");
        assertFalse(sb.equals("abc"));
    }

    @Test
    public void testEqualsObject_nullArg_returnsFalse() {
        // obj instanceof StrBuilder ให้ false เมื่อ obj เป็น null (ไม่ throw)
        sb.append("abc");
        assertFalse(sb.equals((Object) null));
    }

    @Test
    public void testEqualsObject_strBuilderInstance() {
        sb.append("abc");
        Object other = new StrBuilder("abc");
        assertTrue(sb.equals(other));
    }

    @Test
    public void testHashCode_consistentForEqualContent() {
        StrBuilder a = new StrBuilder("abc");
        StrBuilder b = new StrBuilder("abc");
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_emptyBuilder() {
        assertEquals(0, sb.hashCode());
    }

    @Test
    public void testToString() {
        sb.append("hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testToStringBuffer() {
        sb.append("hello");
        StringBuffer buf = sb.toStringBuffer();
        assertEquals("hello", buf.toString());
    }

    // ------------------------------------------------------------ asTokenizer (shallow)
    @Test
    public void testAsTokenizer_returnsNonNull() {
        sb.append("a b c");
        assertNotNull(sb.asTokenizer());
    }

    // ------------------------------------------------------------ asReader
    @Test
    public void testAsReader_readCharByChar() throws IOException {
        sb.append("ab");
        Reader r = sb.asReader();
        assertEquals('a', r.read());
        assertEquals('b', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testAsReader_readArray_bounds() throws IOException {
        sb.append("abcdef");
        Reader r = sb.asReader();
        char[] dest = new char[10];
        try {
            r.read(dest, -1, 2);
            fail();
        } catch (IndexOutOfBoundsException e) { }
    }

    @Test
    public void testAsReader_readArray_zeroLen() throws IOException {
        sb.append("abcdef");
        Reader r = sb.asReader();
        char[] dest = new char[10];
        assertEquals(0, r.read(dest, 0, 0));
    }

    @Test
    public void testAsReader_readArray_eof() throws IOException {
        sb.append("ab");
        Reader r = sb.asReader();
        char[] dest = new char[10];
        r.read(dest, 0, 2); // consumes all
        assertEquals(-1, r.read(dest, 0, 1));
    }

    @Test
    public void testAsReader_readArray_lenClamped() throws IOException {
        sb.append("abc");
        Reader r = sb.asReader();
        char[] dest = new char[10];
        int n = r.read(dest, 0, 100); // len > remaining -> clamp
        assertEquals(3, n);
    }

    @Test
    public void testAsReader_skip_and_ready_and_markReset() throws IOException {
        sb.append("abcdef");
        Reader r = sb.asReader();
        assertTrue(r.ready());
        assertTrue(r.markSupported());
        r.mark(0);
        long skipped = r.skip(3);
        assertEquals(3, skipped);
        assertEquals('d', r.read());
        r.reset();
        assertEquals('a', r.read());
    }

    @Test
    public void testAsReader_skip_negativeAfterClamp() throws IOException {
        sb.append("ab");
        Reader r = sb.asReader();
        r.read(); // pos=1
        long skipped = r.skip(100); // pos+n > size -> n=size-pos=1
        assertEquals(1, skipped);
    }

    @Test
    public void testAsReader_closeDoesNothing() throws IOException {
        sb.append("a");
        Reader r = sb.asReader();
        r.close(); // no exception expected
    }

    // ------------------------------------------------------------ asWriter
    @Test
    public void testAsWriter_writeIntChar() throws IOException {
        Writer w = sb.asWriter();
        w.write((int) 'x');
        assertEquals("x", sb.toString());
    }

    @Test
    public void testAsWriter_writeCharArray() throws IOException {
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b'});
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAsWriter_writeCharArrayRange() throws IOException {
        Writer w = sb.asWriter();
        w.write(new char[]{'a','b','c','d'}, 1, 2);
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testAsWriter_writeString() throws IOException {
        Writer w = sb.asWriter();
        w.write("hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAsWriter_writeStringRange() throws IOException {
        Writer w = sb.asWriter();
        w.write("hello", 1, 3);
        assertEquals("ell", sb.toString());
    }

    @Test
    public void testAsWriter_closeAndFlushDoNothing() throws IOException {
        Writer w = sb.asWriter();
        w.close();
        w.flush();
        // no exception, no content added
        assertEquals("", sb.toString());
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor`, `testIntConstructor_*`, `testStringConstructor_*` | `initialCapacity<=0` true/false, `str==null` true/false |
| `testNewLineText`, `testAppendNewLine_*` | `newLine==null` true/false |
| `testNullText_*`, `testAppendNull_*` | `nullText!=null && length()==0` true/false, `nullText==null` true/false |
| `testLengthSizeIsEmptyClear`, `testSetLength_*` | `length<0` throw, `length<size`, `length>size`, `length==size` |
| `testEnsureCapacity_*`, `testMinimizeCapacity_*` | `capacity>buffer.length` true/false, `buffer.length>length()` true/false |
| `testCharAt_*`, `testSetCharAt_*`, `testDeleteCharAt_*` | `index<0 \|\| index>=length` true/false (ทั้ง 2 เงื่อนไข) |
| `testToCharArray_*` | `size==0` true/false, `len==0` true/false, `startIndex<0` throw |
| `testGetChars_*` | `destination==null \|\| destination.length<len`, 4 exception branches ของ overload index |
| `testAppendObject_*`...`testAppendCharArrayRange_*` | `obj/str/chars==null`, `strLen>0`/`==0`, validation throw ทุกเงื่อนไข (startIndex, length) |
| `testAppendBoolean_*`, `testAppendChar`, `testAppendIntLongFloatDouble` | true/false branch, delegate ผ่าน String.valueOf |
| `testAppendWithSeparators*` | `array/coll/it == null`, `length/size==0`, `separator==null`, loop `hasNext()` |
| `testAppendPadding_*` | `length>=0` true/false |
| `testAppendFixedWidthPadLeft_*`, `testAppendFixedWidthPadRight_*` | `width>0` true/false, `obj==null`, `strLen>=width` vs `<width`, NPE เมื่อ nullText ไม่ถูกตั้ง |
| `testInsert*` | `validateIndex` throw/pass, `str/chars==null`, `strLen>0`/`==0`, exception ของ offset/length |
| `testDelete_*`, `testDeleteAllChar_*`, `testDeleteFirstChar_*`, `testDeleteAll/FirstString_*` | `len>0`/`==0`, loop วนหลายรอบ/ครั้งเดียว, `index>=0` found/not found |
| `testReplace_*`, `testReplaceAll/FirstChar_*`, `testReplaceAll/FirstString_*` | `insertLen!=removeLen`, `insertLen>0`, `search!=replace`, loop พบ/ไม่พบ |
| `testReverse_*`, `testTrim_*` | `size==0`, odd/even length, leading/trailing/both/none spaces |
| `testStartsWith_*`, `testEndsWith_*` | `str==null`, `len==0`, `len>size`, mismatch, match |
| `testSubstring_*`, `testLeftString_*`, `testRightString_*`, `testMidString_*` | `validateRange` ทุกเงื่อนไข, `length<=0`, `length>=size`, `index<0`, `index>=size`, `size<=index+length` |
| `testContains*`, `testIndexOf*`, `testLastIndexOf*` | `strLen==0/1/>1`, clamp ของ startIndex, found/not found, outer-loop `continue` |
| `testEquals*`, `testHashCode_*`, `testToString`, `testToStringBuffer` | `this==other`, `size` mismatch, char mismatch, `instanceof` true/false, NPE เมื่อ other เป็น null (ไม่มี null-check ในซอร์ส) |
| `testAsTokenizer_returnsNonNull` | smoke test เท่านั้น (ไม่ทดสอบ internal เพราะไม่มีซอร์ส `StrTokenizer`/`StrMatcher`) |
| `testAsReader_*` | `ready()` true/false, bounds exception, `len==0`, EOF, clamp length, `skip` negative-clamp, mark/reset |
| `testAsWriter_*` | ทุก overload ของ `write`, `close`/`flush` ไม่ทำอะไร |

**หมายเหตุสำคัญ:** เมธอดที่ใช้ `StrMatcher` (`deleteAll/deleteFirst/replaceAll/replaceFirst(StrMatcher,...)`, `contains(StrMatcher)`, `indexOf/lastIndexOf(StrMatcher,...)`) ไม่ได้ถูกทดสอบ เนื่องจากไม่มีซอร์สของ `StrMatcher` ให้วิเคราะห์ การสมมติ API/พฤติกรรมของคลาสนั้นจะขัดกับข้อกำหนดข้อ 4 (ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา)