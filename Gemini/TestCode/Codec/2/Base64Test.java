package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class Base64Test {

    @Test
    public void testDefaultConstructorAndUrlSafe() {
        Base64 b64Default = new Base64();
        assertFalse(b64Default.isUrlSafe());

        Base64 b64UrlSafe = new Base64(true);
        assertTrue(b64UrlSafe.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        // 'A' เป็นตัวอักษร Base64 ห้ามนำมาทำเป็น lineSeparator
        byte[] invalidSeparator = new byte[]{'A', '\n'};
        new Base64(76, invalidSeparator, false);
    }

    @Test
    public void testEncodeBase64NullAndEmpty() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testDecodeBase64NullAndEmpty() {
        assertNull(Base64.decodeBase64(null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeAndDecodeStandard() {
        byte[] original = "Hello, Defects4J!".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        assertNotNull(encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeAndDecodeChunked() {
        // สร้างข้อมูลยาวพอที่จะเกิดการ Chunking (เกิน 76 ตัวอักษร)
        byte[] original = new byte[200];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i % 256);
        }
        byte[] encoded = Base64.encodeBase64Chunked(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeAndDecodeUrlSafe() {
        byte[] original = "Subject?v=1&data=abc/xyz+123==".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        // ตรวจสอบว่าไม่มีตัว '+' หรือ '/' แต่มี '-' หรือ '_' แทน
        for (byte b : encoded) {
            assertNotEquals('+', b);
            assertNotEquals('/', b);
        }
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testObjectEncodeValidAndInvalid() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] original = "Test".getBytes();
        Object encodedObj = base64.encode((Object) original);
        assertTrue(encodedObj instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode("NotAByteArray");
    }

    @Test
    public void testObjectDecodeValidAndInvalid() throws DecoderException {
        Base64 base64 = new Base64();
        byte[] encoded = Base64.encodeBase64("Test".getBytes());
        Object decodedObj = base64.decode((Object) encoded);
        assertTrue(decodedObj instanceof byte[]);
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode("NotAByteArray");
    }

    @Test
    public void testIsBase64AndWhitespaceAndNonBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '#'));

        byte[] withWhitespace = "SGVsbG8=\r\n Wmxk".getBytes();
        assertTrue(Base64.isArrayByteBase64(withWhitespace));

        byte[] groomed = Base64.discardWhitespace("SGVs\tbG8=\n".getBytes());
        assertNotNull(groomed);

        byte[] nonBase64Discarded = Base64.discardNonBase64("SGVs#bG8=".getBytes());
        assertNotNull(nonBase64Discarded);
    }

    @Test
    public void testIntegerEncodingAndDecoding() {
        BigInteger originalInt = new BigInteger("12345678901234567890");
        byte[] encodedInt = Base64.encodeInteger(originalInt);
        BigInteger decodedInt = Base64.decodeInteger(encodedInt);
        assertEquals(originalInt, decodedInt);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testStreamingModulusScenarios() {
        // ทดสอบการเข้ารหัสและถอดรหัสผ่าน instance ตรงๆ เพื่อครอบคลุม modulus เคส 1, 2, และ EOF branches
        Base64 b64 = new Base64(0);
        byte[] data = new byte[]{1, 2}; // ทำให้ modulus เหลือเศษตอนท้าย
        b64.encode(data, 0, data.length);
        b64.encode(data, 0, -1); // Trigger EOF case
        assertTrue(b64.hasData());
        assertTrue(b64.avail() > 0);
        
        byte[] dest = new byte[10];
        int readCount = b64.readResults(dest, 0, dest.length);
        assertTrue(readCount > 0);
    }
}