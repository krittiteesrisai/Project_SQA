package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    @Test
    public void testDefaultConstructor() {
        Base64 base64 = new Base64();
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor() {
        Base64 base64 = new Base64(76);
        assertNotNull(base64);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        // 'A' is a base64 character, should throw IllegalArgumentException
        byte[] invalidSeparator = new byte[] { 'A', '\n' };
        new Base64(76, invalidSeparator);
    }

    @Test
    public void testConstructorWithNullLineSeparator() {
        Base64 base64 = new Base64(76, null, true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testEncodeDecodeNullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));

        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));

        Base64 base64 = new Base64();
        assertNull(base64.encode((byte[]) null));
        assertArrayEquals(new byte[0], base64.encode(new byte[0]));

        assertNull(base64.decode((byte[]) null));
        assertArrayEquals(new byte[0], base64.decode(new byte[0]));
    }

    @Test
    public void testEncodeAndDecodeStandard() {
        byte[] data = "Hello World!".getBytes();
        byte[] encoded = Base64.encodeBase64(data);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeAndDecodeModulusCases() {
        // Modulus 1 remaining (1 byte)
        byte[] data1 = new byte[] { 0x01 };
        byte[] enc1 = Base64.encodeBase64(data1);
        assertArrayEquals(data1, Base64.decodeBase64(enc1));

        // Modulus 2 remaining (2 bytes)
        byte[] data2 = new byte[] { 0x01, 0x02 };
        byte[] enc2 = Base64.encodeBase64(data2);
        assertArrayEquals(data2, Base64.decodeBase64(enc2));
    }

    @Test
    public void testNegativeBytesEncoding() {
        // Triggers b < 0 branch -> b += 256
        byte[] data = new byte[] { (byte) 0xFF, (byte) 0x80, (byte) 0xAA };
        byte[] encoded = Base64.encodeBase64(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testChunkedEncoding() {
        byte[] data = "This is a very long string designed to test chunking mechanisms in Base64 encoding functionality properly."
                .getBytes();
        byte[] chunked = Base64.encodeBase64Chunked(data);
        assertNotNull(chunked);
        byte[] decoded = Base64.decodeBase64(chunked);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testUrlSafeEncoding() {
        // Contains characters that would normally be + or /
        byte[] data = new byte[] { (byte) 0xfb, (byte) 0xff, (byte) 0xbf };
        byte[] urlSafeEncoded = Base64.encodeBase64URLSafe(data);
        assertNotNull(urlSafeEncoded);

        String urlSafeStr = Base64.encodeBase64URLSafeString(data);
        assertNotNull(urlSafeStr);

        byte[] decoded = Base64.decodeBase64(urlSafeEncoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testObjectEncodeInterface() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] data = "Test".getBytes();
        Object result = base64.encode((Object) data);
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeException() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode((Object) Integer.valueOf(123));
    }

    @Test
    public void testObjectDecodeInterface() throws DecoderException {
        Base64 base64 = new Base64();
        byte[] encoded = Base64.encodeBase64("Test".getBytes());
        
        Object resBytes = base64.decode((Object) encoded);
        assertTrue(resBytes instanceof byte[]);

        Object resString = base64.decode((Object) new String(encoded));
        assertTrue(resString instanceof byte[]);
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeException() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode((Object) Integer.valueOf(123));
    }

    @Test
    public void testIntegerEncodingDecoding() {
        BigInteger original = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);

        // Test byte-aligned BigInteger (bitLength % 8 == 0)
        BigInteger aligned = new BigInteger("255");
        byte[] encAligned = Base64.encodeInteger(aligned);
        assertEquals(aligned, Base64.decodeInteger(encAligned));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testMaxResultSizeException() {
        byte[] data = "Exceed max result size".getBytes();
        try {
            Base64.encodeBase64(data, false, false, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Input array too big"));
        }
    }

    @Test
    public void testIsBase64AndWhitespace() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '#'));

        byte[] withWhitespace = "SGVsbG8=\r\n W3Js".getBytes();
        assertTrue(Base64.isArrayByteBase64(withWhitespace));

        byte[] invalidArray = new byte[] { '#' };
        assertFalse(Base64.isArrayByteBase64(invalidArray));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] data = "AB \n\r\tCD".getBytes();
        byte[] cleaned = Base64.discardWhitespace(data);
        assertNotNull(cleaned);
    }
}