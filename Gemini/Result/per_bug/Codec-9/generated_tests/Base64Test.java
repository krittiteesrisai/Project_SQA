package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    @Test
    public void testDefaultConstructorAndIsUrlSafe() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        // 'A' is a base64 character, should throw IllegalArgumentException
        new Base64(76, new byte[] { 'A', '\n' }, false);
    }

    @Test
    public void testConstructorWithNullLineSeparator() {
        Base64 b64 = new Base64(76, null, false);
        assertNotNull(b64);
    }

    @Test
    public void testNullAndEmptyEncodings() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertNull(Base64.encodeBase64(null, true, true, 100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64MaxResultSizeExceeded() {
        byte[] data = "Hello World".getBytes();
        Base64.encodeBase64(data, false, false, 2);
    }

    @Test
    public void testNullAndEmptyDecodings() {
        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        assertNull(Base64.decodeBase64((String) null));
    }

    @Test
    public void testStandardEncodeAndDecode() {
        byte[] original = "Many hands make light work.".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testUrlSafeEncodeAndDecode() {
        byte[] original = "Subject?>>>".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
        assertEquals("U3ViamVjdD8+++", Base64.encodeBase64String(original));
        assertEquals("U3ViamVjdD8___", Base64.encodeBase64URLSafeString(original));
    }

    @Test
    public void testChunkedEncoding() {
        byte[] original = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.".getBytes();
        byte[] encoded = Base64.encodeBase64Chunked(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testNegativeByteValuesEncoding() {
        // Bytes > 127 cast to negative in Java bytes
        byte[] original = new byte[] { (byte) 0xFF, (byte) 0x80, (byte) 0x00 };
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testModulusTriggersInEncodeEOF() {
        Base64 encoder1 = new Base64(0, Base64.CHUNK_SEPARATOR, false);
        byte[] res1 = encoder1.encode(new byte[] { 0x01 }); // Modulus 1
        assertNotNull(res1);

        Base64 encoder2 = new Base64(0, Base64.CHUNK_SEPARATOR, true); // URL-Safe skips padding
        byte[] res2 = encoder2.encode(new byte[] { 0x01, 0x02 }); // Modulus 2
        assertNotNull(res2);
    }

    @Test
    public void testModulusTriggersInDecodeEOF() {
        // Decodes strings with missing padding to trigger modulus 2 and 3 handling in decode
        byte[] decoded2 = Base64.decodeBase64("QQ"); // Modulus 2 remaining
        assertNotNull(decoded2);

        byte[] decoded3 = Base64.decodeBase64("QUE"); // Modulus 3 remaining
        assertNotNull(decoded3);
    }

    @Test
    public void testIsBase64Validation() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '#'));

        assertTrue(Base64.isBase64("SGVsbG8="));
        assertFalse(Base64.isBase64("SGVsbG8=#"));

        assertTrue(Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
        assertFalse(Base64.isArrayByteBase64("SGVsbG8=#".getBytes()));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] data = "SGVs\n bG8=\r\t ".getBytes();
        byte[] groomed = Base64.discardWhitespace(data);
        assertNotNull(groomed);
    }

    @Test
    public void testObjectEncodeInterface() throws EncoderException {
        Base64 b64 = new Base64();
        byte[] original = "Test".getBytes();
        Object encoded = b64.encode((Object) original);
        assertTrue(encoded instanceof byte[]);
        
        String stringEnc = b64.encodeToString(original);
        assertNotNull(stringEnc);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws EncoderException {
        Base64 b64 = new Base64();
        b64.encode((Object) "NotAByteArray");
    }

    @Test
    public void testObjectDecodeInterface() throws DecoderException {
        Base64 b64 = new Base64();
        String encodedStr = "VGVzdA==";
        Object decoded1 = b64.decode((Object) encodedStr);
        assertTrue(decoded1 instanceof byte[]);

        Object decoded2 = b64.decode((Object) encodedStr.getBytes());
        assertTrue(decoded2 instanceof byte[]);
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws DecoderException {
        Base64 b64 = new Base64();
        b64.decode((Object) Integer.valueOf(123));
    }

    @Test
    public void testIntegerEncodingAndDecoding() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);

        // Test with BigInteger byte-aligned
        BigInteger alignedInt = new BigInteger("255");
        byte[] encodedAligned = Base64.encodeInteger(alignedInt);
        assertEquals(alignedInt, Base64.decodeInteger(encodedAligned));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testHasDataAndAvail() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
        
        b64.encode("Hello".getBytes(), 0, 5);
        assertTrue(b64.hasData());
        assertTrue(b64.avail() > 0);
    }
}