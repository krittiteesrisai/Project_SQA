package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ZipArchiveInputStreamTest {

    @Test
    public void testMatchesWithInvalidLength() {
        byte[] signature = new byte[] { 'P', 'K', 0x03, 0x04 };
        // ความยาวน้อยกว่า LFH_SIG.length (ซึ่งคือ 4 แต่ส่งไป 2)
        boolean matches = ZipArchiveInputStream.matches(signature, 2);
        assertFalse(matches);
    }

    @Test
    public void testMatchesWithValidLfhSignature() {
        byte[] signature = ZipArchiveOutputStream.LFH_SIG;
        boolean matches = ZipArchiveInputStream.matches(signature, signature.length);
        assertTrue(matches);
    }

    @Test
    public void testMatchesWithValidEocdSignature() {
        byte[] signature = ZipArchiveOutputStream.EOCD_SIG;
        boolean matches = ZipArchiveInputStream.matches(signature, signature.length);
        assertTrue(matches);
    }

    @Test
    public void testMatchesWithValidDdSignature() {
        byte[] signature = ZipArchiveOutputStream.DD_SIG;
        boolean matches = ZipArchiveInputStream.matches(signature, signature.length);
        assertTrue(matches);
    }

    @Test
    public void testMatchesWithSingleSegmentSplitMarker() {
        byte[] signature = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        boolean matches = ZipArchiveInputStream.matches(signature, signature.length);
        assertTrue(matches);
    }

    @Test
    public void testConstructorAndGetNextZipEntryEmptyStream() throws IOException {
        ByteArrayInputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(emptyStream)) {
            ZipArchiveEntry entry = zais.getNextZipEntry();
            assertNull(entry);
        }
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStreamThrowsException() throws IOException {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream);
        zais.close();
        zais.read(new byte[1], 0, 1);
    }

    @Test
    public void testReadWhenCurrentIsNullReturnsMinusOne() throws IOException {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            int result = zais.read(new byte[1], 0, 1);
            assertEquals(-1, result);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithInvalidOffsetOrLength() throws IOException {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            zais.read(new byte[5], -1, 2);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithOffsetExceedingBuffer() throws IOException {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            zais.read(new byte[5], 6, 1);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeValueThrowsException() throws IOException {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            zais.skip(-5);
        }
    }

    @Test
    public void testSkipZeroOrPositiveValue() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(data);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            long skipped = zais.skip(0);
            assertEquals(0, skipped);
            
            long skippedPositive = zais.skip(2);
            // เนื่องจากยังไม่มี entry ปัจจุบัน (current == null) read() จะคืนค่า -1 ทำให้ skip หยุดและคืนค่าที่สะสม
            assertEquals(0, skippedPositive);
        }
    }

    @Test
    public void testCanReadEntryDataWithNonZipArchiveEntry() {
        ByteArrayInputStream dummyStream = new ByteArrayInputStream(new byte[10]);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(dummyStream)) {
            ArchiveEntry nonZipEntry = new ArchiveEntry() {
                @Override public String getName() { return "test"; }
                @Override public long getSize() { return 0; }
                @Override public boolean isDirectory() { return false; }
                @Override public java.util.Date getLastModifiedDate() { return null; }
            };
            assertFalse(zais.canReadEntryData(nonZipEntry));
        }
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testReadFirstLocalFileHeaderWithSplittingMarker() throws IOException {
        // จำลอง DD_SIG ใน Header ตัวแรกเพื่อทดสอบ UnsupportedZipFeatureException (SPLITTING)
        byte[] data = new byte[30];
        System.arraycopy(ZipArchiveOutputStream.DD_SIG, 0, data, 0, 4);
        ByteArrayInputStream splitStream = new ByteArrayInputStream(data);
        try (ZipArchiveInputStream zais = new ZipArchiveInputStream(splitStream)) {
            zais.getNextZipEntry();
        }
    }
}