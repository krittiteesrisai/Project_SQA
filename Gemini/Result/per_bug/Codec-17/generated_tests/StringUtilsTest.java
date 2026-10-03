package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testEqualsCharSequence() {
        // cs1 == cs2 (Both null)
        assertTrue(StringUtils.equals(null, null));

        // cs1 == cs2 (Same reference)
        String s = "abc";
        assertTrue(StringUtils.equals(s, s));

        // cs1 == null || cs2 == null
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));

        // cs1 instanceof String && cs2 instanceof String
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "abcd"));

        // Non-String CharSequences (StringBuilder / StringBuffer)
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        StringBuffer sf1 = new StringBuffer("abc");
        
        assertTrue(StringUtils.equals(sb1, sb2));
        assertTrue(StringUtils.equals(sb1, "abc"));
        assertTrue(StringUtils.equals("abc", sb1));
        assertTrue(StringUtils.equals(sb1, sf1));
        assertFalse(StringUtils.equals(sb1, new StringBuilder("abd")));
    }

    @Test
    public void testGetBytesIso8859_1() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        byte[] expected = "abc".getBytes(StandardCharsets.ISO_8859_1);
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1("abc"));
    }

    @Test
    public void testGetBytesUsAscii() {
        assertNull(StringUtils.getBytesUsAscii(null));
        byte[] expected = "abc".getBytes(StandardCharsets.US_ASCII);
        assertArrayEquals(expected, StringUtils.getBytesUsAscii("abc"));
    }

    @Test
    public void testGetBytesUtf16() {
        assertNull(StringUtils.getBytesUtf16(null));
        byte[] expected = "abc".getBytes(StandardCharsets.UTF_16);
        assertArrayEquals(expected, StringUtils.getBytesUtf16("abc"));
    }

    @Test
    public void testGetBytesUtf16Be() {
        assertNull(StringUtils.getBytesUtf16Be(null));
        byte[] expected = "abc".getBytes(StandardCharsets.UTF_16BE);
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be("abc"));
    }

    @Test
    public void testGetBytesUtf16Le() {
        assertNull(StringUtils.getBytesUtf16Le(null));
        byte[] expected = "abc".getBytes(StandardCharsets.UTF_16LE);
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le("abc"));
    }

    @Test
    public void testGetBytesUtf8() {
        assertNull(StringUtils.getBytesUtf8(null));
        byte[] expected = "abc".getBytes(StandardCharsets.UTF_8);
        assertArrayEquals(expected, StringUtils.getBytesUtf8("abc"));
    }

    @Test
    public void testGetByteBufferUtf8() {
        assertNull(StringUtils.getByteBufferUtf8(null));
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("abc");
        assertNotNull(buffer);
        assertArrayEquals("abc".getBytes(StandardCharsets.UTF_8), buffer.array());
    }

    @Test
    public void testGetBytesUnchecked() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
        byte[] expected = "abc".getBytes(StandardCharsets.UTF_8);
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("abc", "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedInvalidCharset() {
        StringUtils.getBytesUnchecked("abc", "INVALID-CHARSET-XYZ");
    }

    @Test
    public void testNewStringIso8859_1() {
        assertNull(StringUtils.newStringIso8859_1(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.ISO_8859_1);
        assertEquals("abc", StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringUsAscii() {
        assertNull(StringUtils.newStringUsAscii(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.US_ASCII);
        assertEquals("abc", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16() {
        assertNull(StringUtils.newStringUtf16(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.UTF_16);
        assertEquals("abc", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16Be() {
        assertNull(StringUtils.newStringUtf16Be(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.UTF_16BE);
        assertEquals("abc", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Le() {
        assertNull(StringUtils.newStringUtf16Le(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.UTF_16LE);
        assertEquals("abc", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8() {
        assertNull(StringUtils.newStringUtf8(null));
        byte[] bytes = "abc".getBytes(StandardCharsets.UTF_8);
        assertEquals("abc", StringUtils.newStringUtf8(bytes));
    }

    @Test
    public void testNewStringWithCharsetName() {
        assertNull(StringUtils.newString(null, "UTF-8"));
        byte[] bytes = "abc".getBytes(StandardCharsets.UTF_8);
        assertEquals("abc", StringUtils.newString(bytes, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringInvalidCharset() {
        byte[] bytes = {97, 98, 99};
        StringUtils.newString(bytes, "INVALID-CHARSET-XYZ");
    }
}