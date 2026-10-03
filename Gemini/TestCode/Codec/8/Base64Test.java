package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class Base64Test {

    @Test
    public void testDefaultConstructorAndIsUrlSafe() {
        Base64 base64 = new Base64();
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testUrlSafeConstructor() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        // Line separator containing a base64 character ('A') should throw IllegalArgumentException
        new Base64(76, new byte[] { 'A', '\n' });
    }

    @Test
    public void testConstructorWithNullLineSeparator() {
        Base64 base64 = new Base64(76, null, false);
        assertNotNull(base64);
    }

    @Test
    public void testEncodeDecodeNullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        
        assertNull(Base64.encodeBase64URLSafe(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64URLSafe(new byte[0]));
    }

    @Test
    public void testEncodeDecodeStandard() {
        byte[] original = "Hello World!".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeChunkedAndUrlSafe() {
        byte[] original = "Hello Base64 Chunked and URL Safe Test data with symbols + / =".getBytes();
        
        byte[] encodedChunked = Base64.encodeBase64Chunked(original);
        assertNotNull(encodedChunked);
        assertArrayEquals(original, Base64.decodeBase64(encodedChunked));

        byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(original);
        assertNotNull(encodedUrlSafe);
        assertArrayEquals(original, Base64.decodeBase64(encodedUrlSafe));
        
        String urlSafeString = Base64.encodeBase64URLSafeString(original);
        assertNotNull(urlSafeString);
        assertArrayEquals(original, Base64.decodeBase64(urlSafeString));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeMaxResultSizeExceeded() {
        byte[] original = "Exceed max size".getBytes();
        Base64.encodeBase64(original, false, false, 2);
    }

    @Test
    public void testObjectEncodeDecodeInterface() throws Exception {
        Base64 base64 = new Base64();
        
        // Encode Object
        byte[] original = "Test Object".getBytes();
        Object encodedObj = base64.encode((Object) original);
        assertTrue(encodedObj instanceof byte[]);

        // Decode Object (byte[])
        Object decodedByteObj = base64.decode(encodedObj);
        assertArrayEquals(original, (byte[]) decodedByteObj);

        // Decode Object (String)
        String encodedStr = base64.encodeToString(original);
        Object decodedStrObj = base64.decode((Object) encodedStr);
        assertArrayEquals(original, (byte[]) decodedStrObj);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode((Object) "Not a byte array");
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidObjectType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode((Object) new Integer(123));
    }

    @Test
    public void testIntegerEncodingAndDecoding() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);

        // Test BigInteger with byte alignment edge cases
        BigInteger smallInt = BigInteger.valueOf(255);
        byte[] encodedSmall = Base64.encodeInteger(smallInt);
        assertEquals(smallInt, Base64.decodeInteger(encodedSmall));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testIsBase64AndWhitespaceAndDiscard() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '#'));

        byte[] dataWithWs = "SGVs\nbG8K".getBytes();
        assertTrue(Base64.isArrayByteBase64(dataWithWs));

        byte[] invalidData = "SGVs#lo".getBytes();
        assertFalse(Base64.isArrayByteBase64(invalidData));

        byte[] groomed = Base64.discardWhitespace("AB \n\r\tCD".getBytes());
        assertNotNull(groomed);
    }

    @Test
    public void testDecodeModulusEdgeCases() {
        // Testing various padding / modulus lengths in decode stream to hit switch cases 2 and 3
        byte[] mod2 = Base64.encodeBase64("A".getBytes()); // 2 chars + padding
        assertArrayEquals("A".getBytes(), Base64.decodeBase64(mod2));

        byte[] mod3 = Base64.encodeBase64("AB".getBytes()); // 3 chars + padding
        assertArrayEquals("AB".getBytes(), Base64.decodeBase64(mod3));
    }
}