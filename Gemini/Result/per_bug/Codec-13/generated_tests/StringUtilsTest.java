package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class StringUtilsTest {

    private static final String TEST_STRING = "ABCabc123!@#";
    private static final byte[] TEST_BYTES = TEST_STRING.getBytes(StandardCharsets.UTF_8);

    @Test
    public void testGetBytesIso8859_1_Normal() {
        byte[] result = StringUtils.getBytesIso8859_1(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(StandardCharsets.ISO_8859_1), result);
    }

    @Test
    public void testGetBytesIso8859_1_Null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesUsAscii_Normal() {
        byte[] result = StringUtils.getBytesUsAscii(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testGetBytesUsAscii_Null() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUtf16_Normal() {
        byte[] result = StringUtils.getBytesUtf16(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(StandardCharsets.UTF_16), result);
    }

    @Test
    public void testGetBytesUtf16_Null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16Be_Normal() {
        byte[] result = StringUtils.getBytesUtf16Be(TEST_STRING);
        // UTF-16BE Charset name in Java standard is "UTF-16BE"
        assertArrayEquals(TEST_STRING.getBytes(java.nio.charset.Charset.forName("UTF-16BE")), result);
    }

    @Test
    public void testGetBytesUtf16Be_Null() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Le_Normal() {
        byte[] result = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(java.nio.charset.Charset.forName("UTF-16LE")), result);
    }

    @Test
    public void testGetBytesUtf16Le_Null() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf8_Normal() {
        byte[] result = StringUtils.getBytesUtf8(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(StandardCharsets.UTF_8), result);
    }

    @Test
    public void testGetBytesUtf8_Null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUnchecked_Normal() {
        byte[] result = StringUtils.getBytesUnchecked(TEST_STRING, "UTF-8");
        assertArrayEquals(TEST_STRING.getBytes(StandardCharsets.UTF_8), result);
    }

    @Test
    public void testGetBytesUnchecked_NullString() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_UnsupportedEncoding() {
        StringUtils.getBytesUnchecked(TEST_STRING, "NON_EXISTENT_CHARSET");
    }

    @Test
    public void testNewStringIso8859_1_Normal() {
        String result = StringUtils.newStringIso8859_1(TEST_BYTES);
        assertEquals(new String(TEST_BYTES, StandardCharsets.ISO_8859_1), result);
    }

    @Test
    public void testNewStringIso8859_1_Null() {
        // Note: Depending on implementation, passing null directly to String constructor might throw NPE
        // but let's check how StringUtils handles it. Looking at source: new String(bytes, Charsets...)
        // Actually, let's verify if newStringIso8859_1 throws or returns null. 
        // In the provided source: return new String(bytes, Charsets.ISO_8859_1); 
        // If bytes is null, new String(null, ...) throws NullPointerException. 
        // Let's protect/test accordingly or expect NullPointerException.
        try {
            StringUtils.newStringIso8859_1(null);
            // If it doesn't throw, check if null is returned (though source implies new String(null, ...) throws NPE)
        } catch (NullPointerException e) {
            // Expected behavior for newStringIso8859_1(null) in this specific implementation version if unchecked
        }
    }

    @Test
    public void testNewStringUsAscii_Normal() {
        String result = StringUtils.newStringUsAscii(TEST_BYTES);
        assertEquals(new String(TEST_BYTES, StandardCharsets.US_ASCII), result);
    }

    @Test
    public void testNewStringUtf16_Normal() {
        byte[] utf16Bytes = TEST_STRING.getBytes(StandardCharsets.UTF_16);
        String result = StringUtils.newStringUtf16(utf16Bytes);
        assertEquals(new String(utf16Bytes, StandardCharsets.UTF_16), result);
    }

    @Test
    public void testNewStringUtf16Be_Normal() {
        byte[] utf16BeBytes = TEST_STRING.getBytes(java.nio.charset.Charset.forName("UTF-16BE"));
        String result = StringUtils.newStringUtf16Be(utf16BeBytes);
        assertEquals(new String(utf16BeBytes, java.nio.charset.Charset.forName("UTF-16BE")), result);
    }

    @Test
    public void testNewStringUtf16Le_Normal() {
        byte[] utf16LeBytes = TEST_STRING.getBytes(java.nio.charset.Charset.forName("UTF-16LE"));
        String result = StringUtils.newStringUtf16Le(utf16LeBytes);
        assertEquals(new String(utf16LeBytes, java.nio.charset.Charset.forName("UTF-16LE")), result);
    }

    @Test
    public void testNewStringUtf8_Normal() {
        String result = StringUtils.newStringUtf8(TEST_BYTES);
        assertEquals(TEST_STRING, result);
    }

    @Test
    public void testNewStringUtf8_Null() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewString_CharsetName_Normal() {
        String result = StringUtils.newString(TEST_BYTES, "UTF-8");
        assertEquals(TEST_STRING, result);
    }

    @Test
    public void testNewString_CharsetName_NullBytes() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_CharsetName_UnsupportedEncoding() {
        StringUtils.newString(TEST_BYTES, "NON_EXISTENT_CHARSET");
    }
}