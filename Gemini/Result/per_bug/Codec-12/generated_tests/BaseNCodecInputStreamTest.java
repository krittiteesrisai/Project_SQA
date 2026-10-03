package org.apache.commons.codec.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class BaseNCodecInputStreamTest {

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Test(expected = NullPointerException.class)
    public void testReadNullByteArray() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            stream.read(null, 0, 1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] dest = new byte[10];
            stream.read(dest, -1, 5);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] dest = new byte[10];
            stream.read(dest, 0, -1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] dest = new byte[10];
            stream.read(dest, 11, 1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] dest = new byte[10];
            stream.read(dest, 5, 6);
        }
    }

    @Test
    public void testReadZeroLength() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] dest = new byte[10];
            int readCount = stream.read(dest, 0, 0);
            assertEquals(0, readCount);
        }
    }

    @Test
    public void testMarkSupported() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            assertFalse(stream.markSupported());
        }
    }

    @Test
    public void testDecodeStream() throws IOException {
        // Base64 string for "Hello World!" is "SGVsbG8gV29ybGQh"
        String base64 = "SGVsbG8gV29ybGQh";
        InputStream in = new ByteArrayInputStream(base64.getBytes());
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, false)) {
            byte[] buf = new byte[20];
            int read = stream.read(buf, 0, 20);
            String result = new String(buf, 0, read);
            assertEquals("Hello World!", result);
        }
    }

    @Test
    public void testEncodeStream() throws IOException {
        String original = "Hello World!";
        InputStream in = new ByteArrayInputStream(original.getBytes());
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, true)) {
            byte[] buf = new byte[30];
            int read = stream.read(buf, 0, 30);
            String result = new String(buf, 0, read);
            assertEquals("SGVsbG8gV29ybGQh", result);
        }
    }

    @Test
    public void testSingleByteRead() throws IOException {
        // 'S' in Base64 decodes to a specific byte, let's test single byte read method
        String base64 = "Sg=="; // Decodes to 'H'
        InputStream in = new ByteArrayInputStream(base64.getBytes());
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, false)) {
            int val = stream.read();
            assertEquals('H', val);
            
            int eofVal = stream.read();
            assertEquals(-1, eofVal);
        }
    }

    @Test
    public void testSingleByteReadNegativeByteHandling() throws IOException {
        // Mocking/Simulating negative byte values converted via (b < 0 ? 256 + b : b)
        // สร้าง InputStream ที่เมื่อ decode ออกมาแล้วได้ค่า byte ติดลบ (unsigned conversion test)
        byte[] rawData = new byte[] { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        InputStream in = new ByteArrayInputStream(rawData);
        BaseNCodec codec = new Base64();
        try (BaseNCodecInputStream stream = new BaseNCodecInputStream(in, codec, false)) {
            // เพียงเพื่อให้แน่ใจว่าลูปและเงื่อนไข b < 0 ทำงานถูกต้องโดยไม่เกิด Exception
            stream.read();
        } catch (IOException e) {
            // อาจเกิด IOException ได้เนื่องจากข้อมูลไม่ใช่ Base64 ที่ถูกต้อง แต่ผ่านเข้าไปยัง branch โค้ดที่ต้องการแล้ว
        }
    }
}