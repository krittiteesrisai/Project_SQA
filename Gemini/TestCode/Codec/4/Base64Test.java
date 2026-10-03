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
    public void testBooleanConstructor() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor() {
        Base64 base64 = new Base64(76);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testNullLineSeparatorConstructor() {
        Base64 base64 = new Base64(76, null);
        assertFalse(base64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithBase64InSeparatorThrowsException() {
        // 'A' is a base64 character, should trigger IllegalArgumentException
        new Base64(76, new byte[] { 'A', '\n' });
    }

    @Test
    public void testEncodeDecodeNullAndEmpty() {
        Base64 base64 = new Base64();
        assertNull(base64.encode((byte[]) null));
        assertNull(base64.decode((byte[]) null));
        
        assertArrayEquals(new byte[0], base64.encode(new byte[0]));
        assertArrayEquals(new byte[0], base64.decode(new byte[0]));
    }

    @Test
    public void testStandardEncodeAndDecode() {
        byte[] original = "Hello World!".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testChunkedEncode() {
        byte[] original = "This is a very long string that will definitely require chunking across multiple lines according to RFC 2045 specification standards.".getBytes();
        byte[] encoded = Base64.encodeBase64Chunked(original);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testUrlSafeEncodeAndDecode() {
        // Using characters that map differently in URL-safe mode (+ -> -, / -> _)
        byte[] original = new byte[] { (byte) 0xfb, (byte) 0xff, (byte) 0xbf };
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        assertNotNull(encoded);
        
        // Ensure no padding '=' is present in URL-safe mode
        for (byte b : encoded) {
            assertNotEquals('=', b);
        }

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeBase64StringAndDecodeString() {
        String original = "Apache Commons Codec";
        String encodedStr = Base64.encodeBase64String(original.getBytes());
        assertNotNull(encodedStr);

        byte[] decoded = Base64.decodeBase64(encodedStr);
        assertArrayEquals(original.getBytes(), decoded);
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        String original = "URL Safe Test String?+/";
        String encodedStr = Base64.encodeBase64URLSafeString(original.getBytes());
        assertNotNull(encodedStr);
        assertFalse(encodedStr.contains("+"));
        assertFalse(encodedStr.contains("/"));
        assertFalse(encodedStr.contains("="));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeMaxResultSizeExceeded() {
        byte[] original = "Exceed max result size test".getBytes();
        // Set maxResultSize to 1 to force IllegalArgumentException
        Base64.encodeBase64(original, true, false, 1);
    }

    @Test
    public void testObjectEncodeValid() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] original = "Object Test".getBytes();
        Object result = base64.encode((Object) original);
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode((Object) "Not a byte array");
    }

    @Test
    public void testObjectDecodeValidByteArray() throws DecoderException {
        Base64 base64 = new Base64();
        byte[] encoded = Base64.encodeBase64("Decode Object".getBytes());
        Object result = base64.decode((Object) encoded);
        assertTrue(result instanceof byte[] );
    }

    @Test
    public void testObjectDecodeValidString() throws DecoderException {
        Base64 base64 = new Base64();
        String encodedStr = Base64.encodeBase64String("Decode String Object".getBytes());
        Object result = base64.decode((Object) encodedStr);
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode((Object) Integer.valueOf(123));
    }

    @Test
    public void testIntegerEncodeAndDecode() {
        BigInteger original = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNullThrowsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '*'));
    }

    @Test
    public void testIsArrayByteBase64() {
        byte[] valid = "SGVsbG8=".getBytes();
        byte[] invalid = "SGVsbG*=".getBytes();
        assertTrue(Base64.isArrayByteBase64(valid));
        assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] dataWithWs = "SGVs\n bG8=\r\t".getBytes();
        byte[] groomed = Base64.discardWhitespace(dataWithWs);
        assertNotNull(groomed);
        assertTrue(Base64.isArrayByteBase64(groomed));
    }

    @Test
    public void testModulusEdgesAndStreamDecoding() {
        // Test various modulos during encoding/decoding streaming paths (modulus 1, 2)
        byte[] inputMod1 = new byte[] { 0x01 }; // 1 byte -> modulus 1 on EOF
        byte[] enc1 = Base64.encodeBase64(inputMod1);
        assertArrayEquals(inputMod1, Base64.decodeBase64(enc1));

        byte[] inputMod2 = new byte[] { 0x01, 0x02 }; // 2 bytes -> modulus 2 on EOF
        byte[] enc2 = Base64.encodeBase64(inputMod2);
        assertArrayEquals(inputMod2, Base64.decodeBase64(enc2));
    }
}