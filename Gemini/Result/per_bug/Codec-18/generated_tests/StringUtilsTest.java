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
    public void testEquals_SameReferenceAndNulls() {
        assertTrue(StringUtils.equals(null, null));
        String str = "test";
        assertTrue(StringUtils.equals(str, str));
    }

    @Test
    public void testEquals_OneNull() {
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_StringInstances() {
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "abcd"));
    }

    @Test
    public void testEquals_NonStringCharSequences() {
        CharSequence sb1 = new StringBuilder("abc");
        CharSequence sb2 = new StringBuilder("abc");
        CharSequence sb3 = new StringBuilder("abd");
        CharSequence cb = java.nio.CharBuffer.wrap("abc");

        assertTrue(StringUtils.equals(sb1, sb2));
        assertTrue(StringUtils.equals(sb1, cb));
        assertFalse(StringUtils.equals(sb1, sb3));
    }

    @Test
    public void testGetBytes_NullInput() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        assertNull(StringUtils.getBytesUsAscii(null));
        assertNull(StringUtils.getBytesUtf16(null));
        assertNull(StringUtils.getBytesUtf16Be(null));
        assertNull(StringUtils.getBytesUtf16Le(null));
        assertNull(StringUtils.getBytesUtf8(null));
        assertNull(StringUtils.getByteBufferUtf8(null));
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytes_ValidEncodings() {
        String data = "A";
        assertNotNull(StringUtils.getBytesIso8859_1(data));
        assertNotNull(StringUtils.getBytesUsAscii(data));
        assertNotNull(StringUtils.getBytesUtf16(data));
        assertNotNull(StringUtils.getBytesUtf16Be(data));
        assertNotNull(StringUtils.getBytesUtf16Le(data));
        assertNotNull(StringUtils.getBytesUtf8(data));
        
        ByteBuffer buffer = StringUtils.getByteBufferUtf8(data);
        assertNotNull(buffer);
        assertTrue(buffer.hasRemaining());

        assertArrayEquals(data.getBytes(StandardCharsets.UTF_8), StringUtils.getBytesUnchecked(data, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_UnsupportedEncoding() {
        StringUtils.getBytesUnchecked("test", "NON-EXISTENT-CHARSET");
    }

    @Test
    public void testNewString_NullInput() {
        assertNull(StringUtils.newStringIso8859_1(null));
        assertNull(StringUtils.newStringUsAscii(null));
        assertNull(StringUtils.newStringUtf16(null));
        assertNull(StringUtils.newStringUtf16Be(null));
        assertNull(StringUtils.newStringUtf16Le(null));
        assertNull(StringUtils.newStringUtf8(null));
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewString_ValidDecodings() {
        byte[] bytes = "A".getBytes(StandardCharsets.UTF_8);
        assertEquals("A", StringUtils.newStringIso8859_1(bytes));
        assertEquals("A", StringUtils.newStringUsAscii(bytes));
        assertEquals("A", StringUtils.newStringUtf16(bytes));
        assertEquals("A", StringUtils.newStringUtf16Be(bytes));
        assertEquals("A", StringUtils.newStringUtf16Le(bytes));
        assertEquals("A", StringUtils.newStringUtf8(bytes));
        assertEquals("A", StringUtils.newString(bytes, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_UnsupportedEncoding() {
        byte[] bytes = new byte[] { 65 };
        StringUtils.newString(bytes, "NON-EXISTENT-CHARSET");
    }
}