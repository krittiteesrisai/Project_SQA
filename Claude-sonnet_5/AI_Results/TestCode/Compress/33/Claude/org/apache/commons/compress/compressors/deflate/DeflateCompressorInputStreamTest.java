package org.apache.commons.compress.compressors.deflate;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.Deflater;

import org.junit.Test;

/**
 * JUnit4 tests for {@link DeflateCompressorInputStream}.
 *
 * หมายเหตุ: CompressorInputStream (superclass) ไม่ได้แสดง source ในโจทย์
 * แต่มี public API ที่รู้จักกันดีคือ getBytesRead() ซึ่งสะท้อนค่าที่ถูกสะสมจาก
 * การเรียก count(long) ภายใน read()/read(byte[],int,int) ของคลาสเป้าหมาย
 * เราใช้ API นี้เพื่อตรวจสอบ "การนับไบต์" ซึ่งเป็นจุดที่ 2 เมธอด read มี
 * พฤติกรรมต่างกัน (read() แปลง -1 เป็น 0 ก่อน count, แต่ read(buf,off,len)
 * ส่ง ret ตรง ๆ เข้า count ซึ่งอาจเป็น -1 ได้ -> จุดที่อาจเป็น fault)
 */
public class DeflateCompressorInputStreamTest {

    // ---------- Helper: บีบอัดข้อมูลด้วย java.util.zip.Deflater ----------
    private byte[] deflate(byte[] data, boolean nowrap) throws IOException {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, nowrap);
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            baos.write(buffer, 0, count);
        }
        deflater.end();
        return baos.toByteArray();
    }

    private byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[64];
        int n;
        while ((n = in.read(buf)) != -1) {
            out.write(buf, 0, n);
        }
        return out.toByteArray();
    }

    // ---------------------------------------------------------------
    // 1) Constructor เดี่ยว (default parameters -> withZlibHeader() = true)
    //    ทดสอบ round-trip: ข้อมูลบีบอัดแบบมี zlib header (nowrap=false)
    //    ต้องอ่านออกมาได้ถูกต้อง
    // ---------------------------------------------------------------
    @Test
    public void testDefaultConstructorReadsZlibHeaderedData() throws IOException {
        byte[] original = "Hello Deflate World!".getBytes();
        byte[] compressed = deflate(original, false); // nowrap=false => มี zlib header

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] result = readAll(in);
        assertArrayEquals(original, result);
        in.close();
    }

    // ---------------------------------------------------------------
    // 2) Constructor สองอาร์กิวเมนต์ พร้อม DeflateParameters
    //    withZlibHeader(true) -> nowrap=false (เหมือน default)
    // ---------------------------------------------------------------
    @Test
    public void testParametersWithZlibHeaderTrue() throws IOException {
        byte[] original = "Zlib header true test data".getBytes();
        byte[] compressed = deflate(original, false); // มี zlib header

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(true);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed), params);

        byte[] result = readAll(in);
        assertArrayEquals(original, result);
        in.close();
    }

    // ---------------------------------------------------------------
    // 3) Constructor สองอาร์กิวเมนต์: withZlibHeader(false) -> nowrap=true
    //    ทดสอบ raw deflate (ไม่มี zlib header)
    // ---------------------------------------------------------------
    @Test
    public void testParametersWithZlibHeaderFalse() throws IOException {
        byte[] original = "Raw deflate no header test".getBytes();
        byte[] compressed = deflate(original, true); // raw, ไม่มี header

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed), params);

        byte[] result = readAll(in);
        assertArrayEquals(original, result);
        in.close();
    }

    // ---------------------------------------------------------------
    // 4) กรณี mismatch: ข้อมูลบีบอัดแบบ raw (nowrap=true)
    //    แต่ decompress ด้วย default params (คาดหวัง zlib header)
    //    -> ควร throw IOException เพราะ header ไม่ตรง
    //    (ทดสอบ logic ของ !parameters.withZlibHeader() ที่ map เข้ากับ nowrap)
    // ---------------------------------------------------------------
    @Test(expected = IOException.class)
    public void testHeaderMismatchThrowsIOException() throws IOException {
        byte[] original = "mismatch test".getBytes();
        byte[] compressed = deflate(original, true); // raw ไม่มี header

        // ใช้ default constructor -> withZlibHeader()=true -> คาดหวัง header
        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        readAll(in); // ควรพังตรงนี้
    }

    // ---------------------------------------------------------------
    // 5) ข้อมูลผิดรูปแบบโดยสมบูรณ์ (random garbage) -> IOException
    // ---------------------------------------------------------------
    @Test(expected = IOException.class)
    public void testMalformedDataThrowsIOException() throws IOException {
        byte[] garbage = new byte[] {0x01, 0x02, 0x03, (byte) 0xFF, (byte) 0xAB, 0x00};

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(garbage));

        readAll(in);
    }

    // ---------------------------------------------------------------
    // 6) ค่า null สำหรับ inputStream -> ควร throw NullPointerException
    //    (มาจาก InflaterInputStream constructor ที่ตรวจ in==null)
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullInputStreamThrowsNPE() {
        new DeflateCompressorInputStream((InputStream) null);
    }

    // ---------------------------------------------------------------
    // 7) ค่า null สำหรับ parameters -> ควร throw NullPointerException
    //    (เพราะ parameters.withZlibHeader() ถูกเรียกบน null)
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullParametersThrowsNPE() {
        new DeflateCompressorInputStream(
                new ByteArrayInputStream(new byte[0]), null);
    }

    // ---------------------------------------------------------------
    // 8) อ่านทีละไบต์ (read()) จนถึง EOF -> ครอบคลุมทั้งสองสาขา
    //    (ret == -1 และ ret != -1)
    // ---------------------------------------------------------------
    @Test
    public void testReadSingleByteUntilEOF() throws IOException {
        byte[] original = new byte[] {10, 20, 30};
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        int b1 = in.read();
        int b2 = in.read();
        int b3 = in.read();
        int eof = in.read();

        assertEquals(10, b1);
        assertEquals(20, b2);
        assertEquals(30, b3);
        assertEquals(-1, eof); // สาขา ret == -1
        in.close();
    }

    // ---------------------------------------------------------------
    // 9) กรณีข้อมูลต้นฉบับว่างเปล่า -> read() ควรได้ -1 ทันที
    //    (boundary: empty input)
    // ---------------------------------------------------------------
    @Test
    public void testEmptyOriginalDataReturnsEOFImmediately() throws IOException {
        byte[] original = new byte[0];
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        int result = in.read();
        assertEquals(-1, result);
        in.close();
    }

    // ---------------------------------------------------------------
    // 10) read(byte[], off, len) แบบปกติ + EOF
    //     ทดสอบ boundary: off > 0, len < buf.length
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArrayWithOffsetAndLen() throws IOException {
        byte[] original = "abcdefghij".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] buf = new byte[20];
        // เว้น offset 5 ไบต์แรก อ่านสูงสุด 10 ไบต์
        int n = in.read(buf, 5, 10);

        assertTrue(n > 0);
        byte[] actual = Arrays.copyOfRange(buf, 5, 5 + n);
        // ผลลัพธ์ต้องเป็นส่วนหน้าของ original (อาจไม่ครบเนื่องจาก inflater buffer)
        for (int i = 0; i < n; i++) {
            assertEquals(original[i], actual[i]);
        }
        in.close();
    }

    // ---------------------------------------------------------------
    // 11) read(byte[], off, len) เมื่อ len = 0 -> ควร return 0 ทันที
    //     (boundary case)
    // ---------------------------------------------------------------
    @Test
    public void testReadWithZeroLenReturnsZero() throws IOException {
        byte[] original = "some data".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] buf = new byte[10];
        int n = in.read(buf, 0, 0);
        assertEquals(0, n);
        in.close();
    }

    // ---------------------------------------------------------------
    // 12) read(byte[], off, len) ที่ EOF -> ควร return -1
    //     และตรวจสอบว่า count(-1) ไม่ทำให้ getBytesRead() ผิดเพี้ยน
    //     (จุดนี้เป็น potential fault ตามที่วิเคราะห์จาก source: read(buf,off,len)
    //      ส่ง ret ตรง ๆ ให้ count() โดยไม่แปลง -1 เป็น 0 ก่อน เหมือนใน read())
    // ---------------------------------------------------------------
    @Test
    public void testReadByteArrayAtEOFDoesNotCorruptByteCount() throws IOException {
        byte[] original = "xyz".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] buf = new byte[10];
        int firstRead = in.read(buf, 0, buf.length);
        assertEquals(original.length, firstRead);

        long bytesReadBeforeEOF = in.getBytesRead();
        assertEquals(original.length, bytesReadBeforeEOF);

        int eofRead = in.read(buf, 0, buf.length); // ret = -1, count(-1) ถูกเรียก
        assertEquals(-1, eofRead);

        long bytesReadAfterEOF = in.getBytesRead();
        // ค่านับไบต์ไม่ควรเปลี่ยนแปลง/ติดลบ หลังจาก EOF
        assertEquals(bytesReadBeforeEOF, bytesReadAfterEOF);

        in.close();
    }

    // ---------------------------------------------------------------
    // 13) skip(n) -> ทดสอบ pass-through พฤติกรรมปกติ
    // ---------------------------------------------------------------
    @Test
    public void testSkip() throws IOException {
        byte[] original = "0123456789".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        long skipped = in.skip(5);
        assertTrue(skipped >= 0);

        byte[] rest = readAll(in);
        // ผลลัพธ์ที่เหลือควรเป็นส่วนท้ายของ original ตามจำนวนที่ skip จริง
        byte[] expectedRest = Arrays.copyOfRange(original, (int) skipped, original.length);
        assertArrayEquals(expectedRest, rest);

        in.close();
    }

    // ---------------------------------------------------------------
    // 14) skip(0) -> ทดสอบ boundary
    // ---------------------------------------------------------------
    @Test
    public void testSkipZero() throws IOException {
        byte[] original = "abcdef".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        long skipped = in.skip(0);
        assertEquals(0, skipped);
        in.close();
    }

    // ---------------------------------------------------------------
    // 15) available() -> ทดสอบ pass-through (ตาม JDK doc ของ InflaterInputStream:
    //     คืนค่า 0 หลัง EOF, มิฉะนั้นคืนค่า 1)
    // ---------------------------------------------------------------
    @Test
    public void testAvailableBeforeAndAfterEOF() throws IOException {
        byte[] original = "data".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        int availBefore = in.available();
        assertTrue(availBefore == 0 || availBefore == 1);

        readAll(in); // อ่านจนหมด -> EOF

        int availAfter = in.available();
        assertEquals(0, availAfter);

        in.close();
    }

    // ---------------------------------------------------------------
    // 16) close() -> เรียกได้โดยไม่ throw, และเรียกซ้ำได้ (idempotent ตาม
    //     พฤติกรรมทั่วไปของ InflaterInputStream.close())
    // ---------------------------------------------------------------
    @Test
    public void testCloseDoesNotThrowAndIsIdempotent() throws IOException {
        byte[] original = "closing test".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        in.close();
        in.close(); // เรียกซ้ำไม่ควร throw
    }

    // ---------------------------------------------------------------
    // 17) หลัง close() แล้วเรียก read() -> ตามพฤติกรรมทั่วไปของ
    //     InflaterInputStream ควร throw IOException
    //     (หมายเหตุ: พฤติกรรมนี้มาจาก JDK's InflaterInputStream ไม่ใช่จาก
    //      source ที่ให้มาโดยตรง จึงกำกับเป็นข้อสมมติที่ทราบจาก JDK)
    // ---------------------------------------------------------------
    @Test
    public void testReadAfterCloseThrowsIOException() throws IOException {
        byte[] original = "closed stream test".getBytes();
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));
        in.close();

        try {
            in.read();
            fail("Expected IOException after close()");
        } catch (IOException expected) {
            // expected behavior ตาม JDK's InflaterInputStream
        }
    }

    // ---------------------------------------------------------------
    // 18) ข้อมูลขนาดใหญ่กว่า buffer ภายใน (512 bytes default ของ
    //     InflaterInputStream) เพื่อทดสอบ loop การอ่านหลายรอบ
    // ---------------------------------------------------------------
    @Test
    public void testReadLargeDataAcrossMultipleBuffers() throws IOException {
        byte[] original = new byte[5000];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i % 256);
        }
        byte[] compressed = deflate(original, false);

        DeflateCompressorInputStream in =
                new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] result = readAll(in);
        assertArrayEquals(original, result);
        in.close();
    }
}
