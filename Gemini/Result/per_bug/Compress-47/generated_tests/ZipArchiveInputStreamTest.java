package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamTest {

    @Test
    public void testMatchesWithShortSignature() {
        byte[] sig = new byte[] { 0x50, 0x4B }; // สั้นเกินไป (น้อยกว่า 4 ไบต์)
        boolean result = ZipArchiveInputStream.matches(sig, sig.length);
        assertFalse("Should return false for signatures shorter than LFH_SIG length", result);
    }

    @Test
    public void testMatchesWithNormalLfhSignature() {
        byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        boolean result = ZipArchiveInputStream.matches(sig, sig.length);
        assertTrue("Should return true for normal LFH signature", result);
    }

    @Test
    public void testMatchesWithEocdSignature() {
        byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        boolean result = ZipArchiveInputStream.matches(sig, sig.length);
        assertTrue("Should return true for EOCD signature", result);
    }

    @Test
    public void testMatchesWithDdSignature() {
        byte[] sig = ZipArchiveOutputStream.DD_SIG;
        boolean result = ZipArchiveInputStream.matches(sig, sig.length);
        assertTrue("Should return true for DD signature", result);
    }

    @Test
    public void testMatchesWithSingleSegmentSplitMarker() {
        byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        boolean result = ZipArchiveInputStream.matches(sig, sig.length);
        assertFalse("Should return false or handle according to checksig implementation if length matches", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeValueThrowsException() throws IOException {
        byte[] data = new byte[10];
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ZipArchiveInputStream zais = new ZipArchiveInputStream(bais)) {
            zais.skip(-1L);
        }
    }

    @Test
    public void testSkipZeroOrValidBytes() throws IOException {
        byte[] data = new byte[10];
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ZipArchiveInputStream zais = new ZipArchiveInputStream(bais)) {
            long skipped = zais.skip(0L);
            assertEquals(0L, skipped);
        }
    }

    @Test
    public void testReadOnClosedStreamThrowsException() throws IOException {
        byte[] data = new byte[10];
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
            zais.close();
            zais.read(new byte[1], 0, 1);
        } catch (IOException e) {
            assertEquals("The stream is closed", e.getMessage());
            return;
        }
        fail("Expected IOException because stream is closed");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithInvalidOffsetAndLength() throws IOException {
        byte[] data = new byte[10];
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ZipArchiveInputStream zais = new ZipArchiveInputStream(bais)) {
            // เรียกผ่าน getNextZipEntry ก่อนเพื่อให้ current ไม่เป็น null หรือจำลองสถานการณ์
            // แต่กรณีนี้ทดสอบการเช็ค Bounds ใน read() โดยตรงเมื่อ current == null จะคืน -1
            // ดังนั้นต้องจำลองผ่านโครงสร้างอาเรย์พารามิเตอร์ที่ไม่ถูกต้อง
            zais.read(new byte[5], -1, 10);
        }
    }

    @Test
    public void testGetNextZipEntryReturnsNullOnEmptyOrClosedStream() throws IOException {
        byte[] data = new byte[0];
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ZipArchiveInputStream zais = new ZipArchiveInputStream(bais)) {
            assertNull(zais.getNextZipEntry());
            
            // ทดสอบเมื่อสตรีมถูกปิดไปแล้ว
            zais.close();
            assertNull(zais.getNextZipEntry());
        }
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testReadFirstLocalFileHeaderWithSplittingMarker() throws IOException {
        // จำลองข้อมูลขึ้นต้นด้วย DD_SIG เพื่อให้เกิด UnsupportedZipFeatureException (Feature.SPLITTING)
        byte[] data = ZipArchiveOutputStream.DD_SIG;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ZipArchiveInputStream zais = new ZipArchiveInputStream(bais)) {
            zais.getNextZipEntry();
        }
    }
}