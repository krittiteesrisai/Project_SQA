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
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testLineLengthAndSeparatorConstructor() {
        byte[] sep = new byte[] {'\n'};
        Base64 base64 = new Base64(76, sep);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testFullConstructorAndUrlSafe() {
        byte[] sep = new byte[] {'\n'};
        Base64 base64 = new Base64(76, sep, true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testConstructorNullLineSeparator() {
        Base64 base64 = new Base64(76, null, false);
        assertFalse(base64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidLineSeparator() {
        // 'A' is a base64 character, should throw IllegalArgumentException
        byte[] invalidSep = new byte[] {'A', '\n'};
        new Base64(76, invalidSep, false);
    }

    @Test
    public void testEncodeDecodeNullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));

        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));

        assertNull(Base64.decodeBase64((String) null));
    }

    @Test
    public void testStandardEncodeDecode() {
        byte[] original = "Hello World!".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testUrlSafeEncodeDecode() {
        byte[] original = "Subject?v=1&data=test/val".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        String encodedStr = Base64.encodeBase64URLSafeString(original);
        assertNotNull(encoded);
        assertNotNull(encodedStr);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);

        byte[] decodedStr = Base64.decodeBase64(encodedStr);
        assertArrayEquals(original, decodedStr);
    }

    @Test
    public void testChunkedEncode() {
        byte[] original = "This is a very long string that will definitely require chunking when encoded using standard MIME chunk size definitions to verify branch coverage properly.".getBytes();
        byte[] encodedChunked = Base64.encodeBase64Chunked(original);
        assertNotNull(encodedChunked);

        byte[] decoded = Base64.decodeBase64(encodedChunked);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeBase64String() {
        byte[] original = "Commons Codec".getBytes();
        String encodedStr = Base64.encodeBase64String(original);
        assertNotNull(encodedStr);

        byte[] decoded = Base64.decodeBase64(encodedStr);
        assertArrayEquals(original, decoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeMaxResultSizeExceeded() {
        byte[] original = "Exceed max result size test data".getBytes();
        // Max result size 5 is too small for this data
        Base64.encodeBase64(original, true, false, 5);
    }

    @Test
    public void testObjectEncode() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] original = "Test Object Encode".getBytes();
        Object encodedObj = base64.encode((Object) original);
        assertTrue(encodedObj instanceof byte[]);

        byte[] decoded = base64.decode((byte[]) encodedObj);
        assertArrayEquals(original, decoded);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode((Object) "Not a byte array");
    }

    @Test
    public void testObjectDecode() throws DecoderException {
        Base64 base64 = new Base64();
        byte[] original = "Test Object Decode".getBytes();
        String encodedStr = Base64.encodeBase64String(original);

        Object decodedObjStr = base64.decode((Object) encodedStr);
        assertTrue(decodedObjStr instanceof byte[]);
        assertArrayEquals(original, (byte[]) decodedObjStr);

        byte[] encodedBytes = Base64.encodeBase64(original);
        Object decodedObjBytes = base64.decode((Object) encodedBytes);
        assertTrue(decodedObjBytes instanceof byte[]);
        assertArrayEquals(original, (byte[]) decodedObjBytes);
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode((Object) Integer.valueOf(123));
    }

    @Test
    public void testIntegerEncodeDecode() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertNotNull(encoded);

        BigInteger decodedBigInt = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decodedBigInt);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testIsBase64AndWhitespace() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertFalse(Base64.isBase64((byte) '#'));

        byte[] validArray = "SGVsbG8gV29ybGQ=".getBytes();
        assertTrue(Base64.isArrayByteBase64(validArray));

        byte[] invalidArray = "SGVsbG#8=".getBytes();
        assertFalse(Base64.isArrayByteBase64(invalidArray));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] dirty = "SG Vsb\nG8g\rV29\tybGQ=".getBytes();
        byte[] cleaned = Base64.discardWhitespace(dirty);
        assertNotNull(cleaned);
        byte[] decoded = Base64.decodeBase64(cleaned);
        assertNotNull(decoded);
    }

    @Test
    public void testStreamingDecodeModulusBranches() {
        // Trigger modulus cases (modulus 2 and 3 handling during EOF in decode)
        byte[] partial1 = Base64.decodeBase64("SGVsbG"); // 6 chars (modulus variant)
        assertNotNull(partial1);
        
        byte[] partial2 = Base64.decodeBase64("SGVsb"); // 5 chars
        assertNotNull(partial2);
    }
}