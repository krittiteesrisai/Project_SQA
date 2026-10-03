package org.apache.commons.compress.utils;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import static org.junit.Assert.*;

public class ChecksumCalculatingInputStreamTest {

    // --- Tests for read() ---

    @Test
    public void testReadSingleByteSuccess() throws IOException {
        byte[] data = new byte[] { 0x41 }; // 'A'
        InputStream bais = new ByteArrayInputStream(data);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        int firstRead = cis.read();
        assertEquals(0x41, firstRead);
        assertEquals(0x41, checksum.getValue());

        // อ่านซ้ำเมื่อหมดสตรีม (EOF -> ret = -1) ควบคุม Branch ret < 0
        int secondRead = cis.read();
        assertEquals(-1, secondRead);
    }

    @Test
    public void testReadSingleByteEmptyStream() throws IOException {
        byte[] data = new byte[] {};
        InputStream bais = new ByteArrayInputStream(data);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        int result = cis.read();
        assertEquals(-1, result);
        assertEquals(0L, cis.getValue());
    }

    // --- Tests for read(byte[] b) ---

    @Test
    public void testReadByteArraySuccess() throws IOException {
        byte[] data = new byte[] { 0x01, 0x02, 0x03 };
        InputStream bais = new ByteArrayInputStream(data);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[3];
        int bytesRead = cis.read(buffer);

        assertEquals(3, bytesRead);
        assertArrayEquals(data, buffer);
        assertTrue(cis.getValue() > 0);
    }

    @Test
    public void testReadByteArrayEOF() throws IOException {
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer);

        assertEquals(-1, bytesRead);
        assertEquals(0L, cis.getValue());
    }

    // --- Tests for read(byte[] b, int off, int len) ---

    @Test
    public void testReadArrayWithOffsetAndLength() throws IOException {
        byte[] data = new byte[] { 0x10, 0x20, 0x30, 0x40 };
        InputStream bais = new ByteArrayInputStream(data);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[6];
        // อ่าน 2 ไบต์ ใส่ลงใน buffer เริ่มที่ index 1
        int bytesRead = cis.read(buffer, 1, 2);

        assertEquals(2, bytesRead);
        assertEquals(0x10, buffer[1]);
        assertEquals(0x20, buffer[2]);
        assertEquals(0, buffer[0]); // ต้องไม่ถูกเขียนทับ
    }

    @Test(expected = NullPointerException.class)
    public void testReadArrayNullPointerException() throws IOException {
        InputStream bais = new ByteArrayInputStream(new byte[] { 0x01 });
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        // ส่ง buffer เป็น null เพื่อทดสอบ Edge Case
        cis.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayOutOfBounds() throws IOException {
        InputStream bais = new ByteArrayInputStream(new byte[] { 0x01 });
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[2];
        // Offset/Length ไม่ถูกต้อง
        cis.read(buffer, 0, 5);
    }

    // --- Tests for skip(long n) ---

    @Test
    public void testSkipWithAvailableData() throws IOException {
        byte[] data = new byte[] { 0x05, 0x06 };
        InputStream bais = new ByteArrayInputStream(data);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        // skip() ของคลาสนี้จะเรียก read() 1 ครั้งเพื่อเอาค่ามาคำนวณ Checksum
        long skipped = cis.skip(10L);
        assertEquals(1L, skipped);
        
        // ข้อมูลตัวแรก (0x05) ต้องถูกคำนวณเข้า checksum แล้ว
        assertEquals(1, cis.read()); // อ่านตัวที่สองต่อ (0x06)
    }

    @Test
    public void testSkipAtEOF() throws IOException {
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, bais);

        long skipped = cis.skip(5L);
        assertEquals(0L, skipped);
    }

    // --- Tests for Constructor & getValue Edge Cases ---

    @Test
    public void testNullChecksumOrInputStreamBehavior() {
        // ทดสอบกรณีส่ง InputStream เป็น null (หาก Underlying stream รองรับหรือโยน NPE ตามพฤติกรรม Stream ปกติ)
        try {
            ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(null, null);
            cis.getValue();
            fail("Expected NullPointerException or similar if operations are invoked");
        } catch (Exception e) {
            // ยอมรับได้ทั้งกรณีที่ Constructor ยอมให้สร้างแต่พังตอนเรียกใช้ หรือพังทันที
            assertNotNull(e);
        }
    }
}