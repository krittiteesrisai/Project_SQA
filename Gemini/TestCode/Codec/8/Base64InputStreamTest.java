package org.apache.commons.codec.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class Base64InputStreamTest {

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Test
    public void testMarkSupported() {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        assertFalse(b64is.markSupported());
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullByteArray() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        b64is.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        byte[] buf = new byte[10];
        b64is.read(buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        byte[] buf = new byte[10];
        b64is.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        byte[] buf = new byte[10];
        b64is.read(buf, 11, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        byte[] buf = new byte[10];
        b64is.read(buf, 5, 6);
    }

    @Test
    public void testReadZeroLength() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        Base64InputStream b64is = new Base64InputStream(in);
        byte[] buf = new byte[10];
        int result = b64is.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testDecodeStream() throws IOException {
        // "SGVsbG8gV29ybGQ=" -> "Hello World"
        String original = "SGVsbG8gV29ybGQ=";
        InputStream in = new ByteArrayInputStream(original.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(in, false);
        
        byte[] buf = new byte[11];
        int read = b64is.read(buf, 0, 11);
        assertEquals(11, read);
        assertEquals("Hello World", new String(buf, "UTF-8"));
    }

    @Test
    public void testEncodeStreamWithCustomLineLength() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello World".getBytes("UTF-8"));
        // ใช้ Constructor แบบกำหนด lineLength และ lineSeparator
        byte[] separator = new byte[] { '\r', '\n' };
        Base64InputStream b64is = new Base64InputStream(in, true, 4, separator);
        
        byte[] buf = new byte[100];
        int read = b64is.read(buf, 0, 100);
        assertTrue(read > 0);
        String encoded = new String(buf, 0, read, "UTF-8");
        assertTrue(encoded.contains("\r\n"));
    }

    @Test
    public void testReadSingleByteEOF() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64is = new Base64InputStream(in);
        int val = b64is.read();
        assertEquals(-1, val);
    }

    @Test
    public void testReadSingleByteValid() throws IOException {
        // "QQ==" -> 'A'
        InputStream in = new ByteArrayInputStream("QQ==".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(in, false);
        int val = b64is.read();
        assertEquals('A', val);
    }

    @Test
    public void testDefaultConstructorAndFullBufferRead() throws IOException {
        // Trigger branch: c > 0 && b.length == len (Codec-8 specific target)
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(in); // Uses default decode constructor
        
        byte[] buf = new byte[5];
        int read = b64is.read(buf, 0, 5);
        assertEquals(5, read);
        assertEquals("Hello", new String(buf, "UTF-8"));
    }

    @Test
    public void testNonBase64CharactersHandling() throws IOException {
        // ส่งข้อมูลที่มีอักขระนอกกลุ่ม Base64 เพื่อทดสอบการวนลูป (readLen == 0)
        InputStream in = new ByteArrayInputStream("   \t\n".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(in, false);
        int val = b64is.read();
        assertEquals(-1, val);
    }
}