package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.codec.binary.StringUtils (Codec-17b)
 *
 * หมายเหตุสำคัญ:
 * newStringIso8859_1(byte[]) เรียก new String(bytes, Charsets.ISO_8859_1) โดยตรง
 * (ไม่ผ่าน private newString(bytes, charset) ที่มีการเช็ค null)
 * ดังนั้นเมื่อ bytes เป็น null พฤติกรรมจริงของโค้ดคือโยน NullPointerException
 * แม้ Javadoc จะระบุว่าควรคืนค่า null ก็ตาม — นี่คือ known defect ของ Codec-17b
 * เทสนี้จะยืนยันพฤติกรรมจริงตามซอร์สโค้ด (ไม่ใช่ Javadoc)
 */
public class StringUtilsTest {

    // ---------------------------------------------------------------
    // equals(CharSequence, CharSequence)
    // ---------------------------------------------------------------

    @Test
    public void testEquals_bothNull() {
        // Branch: cs1 == cs2 (both null) -> true
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_sameReference() {
        // Branch: cs1 == cs2 (same object reference, not null) -> true
        String s = "abc";
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEquals_firstNullSecondNotNull() {
        // Branch: cs1 == null || cs2 == null -> false
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_firstNotNullSecondNull() {
        // Branch: cs1 == null || cs2 == null -> false
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_bothStringsEqual() {
        // Branch: cs1 instanceof String && cs2 instanceof String -> String.equals -> true
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_bothStringsNotEqual_caseSensitive() {
        // Branch: cs1 instanceof String && cs2 instanceof String -> String.equals -> false
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEquals_nonStringCharSequence_equalContent() {
        // Branch: falls through to CharSequenceUtils.regionMatches (not both String)
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        assertTrue(StringUtils.equals(sb1, sb2));
    }

    @Test
    public void testEquals_nonStringCharSequence_differentLength() {
        // Branch: regionMatches with different lengths -> false
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abcd");
        assertFalse(StringUtils.equals(sb1, sb2));
    }

    @Test
    public void testEquals_mixedTypes_equalContent() {
        // Branch: one is String, other is not -> not both String -> regionMatches -> true
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        assertTrue(StringUtils.equals(s, sb));
    }

    @Test
    public void testEquals_mixedTypes_differentContent() {
        String s = "abc";
        StringBuilder sb = new StringBuilder("xyz");
        assertFalse(StringUtils.equals(s, sb));
    }

    // ---------------------------------------------------------------
    // getBytesIso8859_1 / getBytesUsAscii / getBytesUtf16 / getBytesUtf16Be
    // / getBytesUtf16Le / getBytesUtf8  (all go through private getBytes(),
    // which null-checks the input string)
    // ---------------------------------------------------------------

    @Test
    public void testGetBytesIso8859_1_null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_normal() {
        byte[] result = StringUtils.getBytesIso8859_1("abc");
        assertArrayEquals(new byte[] {'a', 'b', 'c'}, result);
    }

    @Test
    public void testGetBytesIso8859_1_empty() {
        // boundary: empty string
        byte[] result = StringUtils.getBytesIso8859_1("");
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testGetBytesUsAscii_null() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_normal() {
        byte[] result = StringUtils.getBytesUsAscii("abc");
        assertArrayEquals(new byte[] {'a', 'b', 'c'}, result);
    }

    @Test
    public void testGetBytesUtf16_null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_normal() throws UnsupportedEncodingException {
        byte[] expected = "abc".getBytes("UTF-16");
        byte[] result = StringUtils.getBytesUtf16("abc");
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetBytesUtf16Be_null() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_normal() throws UnsupportedEncodingException {
        byte[] expected = "abc".getBytes("UTF-16BE");
        byte[] result = StringUtils.getBytesUtf16Be("abc");
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetBytesUtf16Le_null() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_normal() throws UnsupportedEncodingException {
        byte[] expected = "abc".getBytes("UTF-16LE");
        byte[] result = StringUtils.getBytesUtf16Le("abc");
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetBytesUtf8_null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_normal() throws UnsupportedEncodingException {
        byte[] expected = "abc".getBytes("UTF-8");
        byte[] result = StringUtils.getBytesUtf8("abc");
        assertArrayEquals(expected, result);
    }

    // ---------------------------------------------------------------
    // getByteBufferUtf8 (private getByteBuffer null-checks input)
    // ---------------------------------------------------------------

    @Test
    public void testGetByteBufferUtf8_null() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_normal() throws UnsupportedEncodingException {
        ByteBuffer bb = StringUtils.getByteBufferUtf8("abc");
        byte[] expected = "abc".getBytes("UTF-8");
        byte[] actual = new byte[bb.remaining()];
        bb.get(actual);
        assertArrayEquals(expected, actual);
    }

    // ---------------------------------------------------------------
    // getBytesUnchecked(String, String)
    // ---------------------------------------------------------------

    @Test
    public void testGetBytesUnchecked_nullString_returnsNull() {
        // Branch: string == null -> return null
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUnchecked_validCharset() throws UnsupportedEncodingException {
        byte[] expected = "abc".getBytes("UTF-8");
        byte[] result = StringUtils.getBytesUnchecked("abc", "UTF-8");
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        // Branch: catch UnsupportedEncodingException -> throw IllegalStateException
        try {
            StringUtils.getBytesUnchecked("abc", "INVALID-CHARSET-XYZ");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            // expected
            assertTrue(e.getMessage().contains("INVALID-CHARSET-XYZ"));
        }
    }

    // ---------------------------------------------------------------
    // newString(byte[], String)
    // ---------------------------------------------------------------

    @Test
    public void testNewString_nullBytes_returnsNull() {
        // Branch: bytes == null -> return null
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewString_validCharset() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-8");
        String result = StringUtils.newString(bytes, "UTF-8");
        assertEquals("abc", result);
    }

    @Test
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        // Branch: catch UnsupportedEncodingException -> throw IllegalStateException
        byte[] bytes = {'a', 'b', 'c'};
        try {
            StringUtils.newString(bytes, "INVALID-CHARSET-XYZ");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            // expected
            assertTrue(e.getMessage().contains("INVALID-CHARSET-XYZ"));
        }
    }

    // ---------------------------------------------------------------
    // newStringIso8859_1 -- NOTE: does NOT use the private null-checking
    // newString(bytes, charset) helper; calls new String(bytes, charset)
    // directly. This is the documented Codec-17b defect.
    // ---------------------------------------------------------------

    @Test
    public void testNewStringIso8859_1_normal() {
        byte[] bytes = {'a', 'b', 'c'};
        String result = StringUtils.newStringIso8859_1(bytes);
        assertEquals("abc", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNewStringIso8859_1_nullBytes_throwsNPE() {
        // ตามซอร์สโค้ดจริง (ไม่ใช่ Javadoc) -- คาดหวัง NullPointerException
        // เนื่องจากไม่มีการเช็ค null ก่อนเรียก new String(bytes, charset)
        StringUtils.newStringIso8859_1(null);
    }

    // ---------------------------------------------------------------
    // newStringUsAscii / newStringUtf16 / newStringUtf16Be / newStringUtf16Le
    // / newStringUtf8 (all go through private newString(bytes, charset)
    // which DOES null-check)
    // ---------------------------------------------------------------

    @Test
    public void testNewStringUsAscii_null() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_normal() {
        byte[] bytes = {'a', 'b', 'c'};
        assertEquals("abc", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16_null() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_normal() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-16");
        assertEquals("abc", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16Be_null() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_normal() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-16BE");
        assertEquals("abc", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Le_null() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_normal() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-16LE");
        assertEquals("abc", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8_null() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_normal() throws UnsupportedEncodingException {
        byte[] bytes = "abc".getBytes("UTF-8");
        assertEquals("abc", StringUtils.newStringUtf8(bytes));
    }

    // ---------------------------------------------------------------
    // Boundary: empty byte array roundtrip (private newString: bytes != null)
    // ---------------------------------------------------------------

    @Test
    public void testNewStringUtf8_emptyArray() {
        byte[] bytes = new byte[0];
        assertEquals("", StringUtils.newStringUtf8(bytes));
    }
}
