package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link Base64InputStream} (Defects4J: Codec-6b).
 *
 * หมายเหตุ (assumptions):
 * - พฤติกรรมภายในของ org.apache.commons.codec.binary.Base64 (encode/decode/hasData/readResults)
 *   ไม่ได้แสดงใน source ที่ให้มา แต่จำเป็นต้องพึ่งพาเพื่อทดสอบ Base64InputStream ได้จริง
 *   จึงใช้พฤติกรรมมาตรฐานที่เป็นที่รู้จักของ Base64 (RFC 2045) เช่น การข้าม non-base64 char
 *   และผลลัพธ์ decode ของสตริง base64 ที่รู้จักกันดี ("SGVsbG8sIFdvcmxkIQ==" -> "Hello, World!")
 * - คอมเมนต์ในซอร์สโค้ดต้นทาง (เกี่ยวกับ CODEC-101 และ readResults คืนค่า 0)
 *   ถูกใช้เป็นฐานอ้างอิงสำหรับทดสอบ while(r==0) loop ใน read()
 */
public class Base64InputStreamTest {

    // ---------- Helper methods ----------

    private byte[] readAllBytesViaSingleByteRead(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b;
        while ((b = is.read()) != -1) {
            baos.write(b);
        }
        return baos.toByteArray();
    }

    private byte[] readAllBytesViaBulkRead(InputStream is, int bufSize) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[bufSize];
        int n;
        while ((n = is.read(buf, 0, buf.length)) != -1) {
            if (n > 0) {
                baos.write(buf, 0, n);
            }
        }
        return baos.toByteArray();
    }

    /** InputStream ที่ throw IOException เสมอ เพื่อทดสอบการ propagate exception */
    private static class ThrowingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("Simulated IO failure");
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            throw new IOException("Simulated IO failure");
        }
    }

    /** InputStream ที่ในการเรียกครั้งแรก return 0 (ไม่มีข้อมูล แต่ไม่ EOF) แล้วค่อยส่งข้อมูลจริง */
    private static class ZeroThenDataInputStream extends InputStream {
        private int callCount = 0;
        private final byte[] data;
        private int dataPos = 0;

        ZeroThenDataInputStream(byte[] data) {
            this.data = data;
        }

        @Override
        public int read() throws IOException {
            byte[] single = new byte[1];
            int n = read(single, 0, 1);
            if (n <= 0) {
                return -1;
            }
            return single[0] & 0xFF;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            callCount++;
            if (callCount == 1) {
                return 0; // simulate underlying stream returning 0 without EOF
            }
            if (dataPos >= data.length) {
                return -1;
            }
            int toCopy = Math.min(len, data.length - dataPos);
            System.arraycopy(data, dataPos, b, off, toCopy);
            dataPos += toCopy;
            return toCopy;
        }
    }

    // ---------- Constructor / basic decode-encode ----------

    @Test
    public void testConstructorDefaultIsDecode() throws IOException {
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes(); // "Hello, World!"
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] decoded = readAllBytesViaSingleByteRead(b64is);
        assertArrayEquals("Hello, World!".getBytes(), decoded);
    }

    @Test
    public void testDecodeKnownStringExplicitFalse() throws IOException {
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] decoded = readAllBytesViaBulkRead(b64is, 16);
        assertArrayEquals("Hello, World!".getBytes(), decoded);
    }

    @Test
    public void testEncodeDecodeRoundTrip() throws IOException {
        String original = "Apache Commons Codec Base64InputStream test.";
        byte[] originalBytes = original.getBytes();

        Base64InputStream encodeStream = new Base64InputStream(new ByteArrayInputStream(originalBytes), true);
        byte[] encoded = readAllBytesViaSingleByteRead(encodeStream);

        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] decoded = readAllBytesViaSingleByteRead(decodeStream);

        assertArrayEquals(originalBytes, decoded);
    }

    @Test
    public void testEncodeWithCustomLineLengthAndSeparatorRoundTrip() throws IOException {
        String original = "The quick brown fox jumps over the lazy dog. 0123456789";
        byte[] originalBytes = original.getBytes();
        byte[] lineSeparator = {'\n'};

        Base64InputStream encodeStream =
                new Base64InputStream(new ByteArrayInputStream(originalBytes), true, 4, lineSeparator);
        byte[] encoded = readAllBytesViaSingleByteRead(encodeStream);

        // ตรวจว่ามีการแบ่งบรรทัดจริง (lineLength=4 น้อยกว่าความยาว encoded ปกติ)
        assertTrue(new String(encoded).contains("\n"));

        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] decoded = readAllBytesViaSingleByteRead(decodeStream);
        assertArrayEquals(originalBytes, decoded);
    }

    // ---------- read() single byte ----------

    @Test
    public void testReadSingleByteEOFOnEmptyStream() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, b64is.read());
    }

    @Test
    public void testReadSingleByteNormal() throws IOException {
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        int first = b64is.read();
        assertEquals('H', first);
    }

    @Test
    public void testReadAfterEOFReturnsMinusOneRepeatedly() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, b64is.read());
        assertEquals(-1, b64is.read());
    }

    @Test(timeout = 5000)
    public void testUnderlyingReadReturningZeroIsHandled() throws IOException {
        // ทดสอบ branch: c > 0 เป็น false (c==0) และ while(r==0) loop ใน read()
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ZeroThenDataInputStream(encoded), false);
        byte[] result = readAllBytesViaSingleByteRead(b64is);
        assertArrayEquals("Hello, World!".getBytes(), result);
    }

    @Test(timeout = 5000)
    public void testDecodeAllNonBase64DataEventuallyReachesEOF() throws IOException {
        // อ้างอิงคอมเมนต์ CODEC-101 ในซอร์ส: readResults อาจ return 0 ถ้าข้อมูลไม่ใช่ base64
        // สตรีมข้อมูลนี้เป็น whitespace ทั้งหมด (ไม่ใช่ base64 alphabet ที่ถูกต้อง)
        byte[] junk = "\n\n\n\n\n".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(junk), false);
        int result = b64is.read();
        assertEquals(-1, result);
    }

    // ---------- read(byte[], offset, len) - argument validation ----------

    @Test(expected = NullPointerException.class)
    public void testReadNullArrayThrowsNPE() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        b64is.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffsetThrowsIOOBE() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        b64is.read(new byte[10], -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLenThrowsIOOBE() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        b64is.read(new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetGreaterThanLengthThrowsIOOBE() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        // offset(20) > b.length(10), len=0 เพื่อ isolate เงื่อนไขนี้จาก len==0-check
        b64is.read(new byte[10], 20, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenGreaterThanLengthThrowsIOOBE() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        // offset(5) not > length(10), but offset+len(15) > length(10)
        b64is.read(new byte[10], 5, 10);
    }

    @Test
    public void testReadLenZeroReturnsZero() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        int n = b64is.read(new byte[10], 0, 0);
        assertEquals(0, n);
    }

    @Test
    public void testReadOffsetEqualsLengthWithZeroLenReturnsZero() throws IOException {
        // boundary: offset == b.length (ไม่ throw เพราะไม่ใช่ ">" strictly)
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        byte[] buf = new byte[10];
        int n = b64is.read(buf, 10, 0);
        assertEquals(0, n);
    }

    @Test
    public void testReadOffsetPlusLenEqualsLengthDoesNotThrow() throws IOException {
        // boundary: offset+len == b.length (ไม่ throw เพราะไม่ใช่ ">" strictly)
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] buf = new byte[10];
        int n = b64is.read(buf, 2, 8); // offset+len = 10 == buf.length
        assertTrue(n <= 8);
    }

    // ---------- read(byte[], offset, len) - functional / optimization branch ----------

    @Test
    public void testReadWithBufferLengthEqualsLenOptimizedPath() throws IOException {
        // b.length == len -> setInitialBuffer branch ถูกเรียก (เมื่อ c>0)
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] decoded = readAllBytesViaBulkRead(b64is, 8192); // buf.length == len ทุกครั้งที่เรียก read
        assertArrayEquals("Hello, World!".getBytes(), decoded);
    }

    @Test
    public void testReadWithBufferLengthGreaterThanLenNoOptimization() throws IOException {
        // b.length != len -> ข้าม setInitialBuffer branch
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] buf = new byte[50];
        int len = 5; // buf.length(50) != len(5)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n;
        while ((n = b64is.read(buf, 0, len)) != -1) {
            if (n > 0) {
                out.write(buf, 0, n);
            }
        }
        assertArrayEquals("Hello, World!".getBytes(), out.toByteArray());
    }

    @Test
    public void testReadWithNonZeroOffset() throws IOException {
        byte[] encoded = "SGVsbG8sIFdvcmxkIQ==".getBytes();
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] buf = new byte[20];
        int n = b64is.read(buf, 3, 5);
        assertTrue(n > 0 && n <= 5);
    }

    // ---------- IOException propagation ----------

    @Test(expected = IOException.class)
    public void testUnderlyingIOExceptionPropagatesOnSingleByteRead() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ThrowingInputStream());
        b64is.read();
    }

    @Test(expected = IOException.class)
    public void testUnderlyingIOExceptionPropagatesOnBulkRead() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ThrowingInputStream());
        b64is.read(new byte[10], 0, 10);
    }

    // ---------- markSupported ----------

    @Test
    public void testMarkSupportedReturnsFalse() throws IOException {
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(b64is.markSupported());
    }
}
