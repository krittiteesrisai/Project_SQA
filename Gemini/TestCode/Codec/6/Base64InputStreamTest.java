package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class Base64InputStreamTest {

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    // --- Tests for Constructors & markSupported ---

    @Test
    public void testConstructorsAndMarkSupported() {
        InputStream in = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        Base64InputStream b64In1 = new Base64InputStream(in);
        assertFalse("markSupported should be false", b64In1.markSupported());

        Base64InputStream b64In2 = new Base64InputStream(in, true);
        assertFalse("markSupported should be false", b64In2.markSupported());

        Base64InputStream b64In3 = new Base64InputStream(in, true, 76, new byte[] { '\r', '\n' });
        assertFalse("markSupported should be false", b64In3.markSupported());
    }

    // --- Tests for read(byte[], int, int) - Exceptions & Edge Cases ---

    @Test(expected = NullPointerException.class)
    public void testReadByteArrayNull() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        b64In.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[10];
        b64In.read(buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLen() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[10];
        b64In.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[5];
        b64In.read(buf, 6, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenExceedsLength() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[5];
        b64In.read(buf, 2, 4);
    }

    @Test
    public void testReadZeroLen() throws IOException {
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[10];
        int result = b64In.read(buf, 0, 0);
        assertEquals("Reading zero length should return 0", 0, result);
    }

    // --- Tests for Decoding ---

    @Test
    public void testDecodeStream() throws IOException {
        // "Hello" in base64 is "SGVsbG8="
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes("UTF-8"));
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[5];
        int read = b64In.read(buf, 0, 5);
        assertEquals(5, read);
        assertArrayEquals("Hello".getBytes("UTF-8"), buf);
        
        // Check EOF
        assertEquals(-1, b64In.read(buf, 0, 5));
    }

    @Test
    public void testDecodeWithOptimizationAndBufferReuse() throws IOException {
        // Trigger b.length == len optimization branch
        InputStream in = new ByteArrayInputStream("SGVsbG8=".getBytes("UTF-8"));
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[2];
        
        assertEquals(2, b64In.read(buf, 0, 2)); // "He"
        assertEquals(2, b64In.read(buf, 0, 2)); // "ll"
        assertEquals(1, b64In.read(buf, 0, 1)); // "o"
        assertEquals(-1, b64In.read(buf, 0, 1)); // EOF
    }

    // --- Tests for Encoding ---

    @Test
    public void testEncodeStream() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes("UTF-8"));
        Base64InputStream b64In = new Base64InputStream(in, true);
        byte[] buf = new byte[8];
        int read = b64In.read(buf, 0, 8);
        assertEquals(8, read);
        assertArrayEquals("SGVsbG8=".getBytes("UTF-8"), buf);
    }

    // --- Tests for single-byte read() ---

    @Test
    public void testSingleByteReadAndEof() throws IOException {
        InputStream in = new ByteArrayInputStream("Sg==".getBytes("UTF-8")); // Decodes to "H" (ASCII 72)
        Base64InputStream b64In = new Base64InputStream(in, false);
        
        int b = b64In.read();
        assertEquals(72, b); // 'H'
        
        int eof = b64In.read();
        assertEquals(-1, eof);
    }

    @Test
    public void testSingleByteReadWithNegativeByteHandling() throws IOException {
        // สร้างสตรีมที่ถอดรหัสแล้วได้ไบต์ค่าติดลบเมื่อมองเป็น signed byte (เช่น 0xFF -> 255)
        // Base64 ของไบต์ [255] คือ "/w=="
        InputStream in = new ByteArrayInputStream("/w==".getBytes("UTF-8"));
        Base64InputStream b64In = new Base64InputStream(in, false);
        
        int b = b64In.read();
        assertEquals(255, b);
    }

    // --- Edge Case: CODEC-101 Simulation (Non-base64 input returning 0 from readResults) ---

    @Test
    public void testCodec101HandlingWithNonBase64() throws IOException {
        // ข้อมูลที่ไม่ใช่ Base64 ล้วนๆ อาจทำให้ Base64InputStream ต้องวนลูปอ่านซ้ำ (while(r == 0))
        InputStream in = new ByteArrayInputStream("   \n\r   ".getBytes("UTF-8"));
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buf = new byte[10];
        int read = b64In.read(buf, 0, 10);
        assertEquals(-1, read);
    }
}