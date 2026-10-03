package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamTest {

    @Test
    public void testMatchesWithShortSignature() {
        byte[] sig = new byte[] { 0x50, 0x4B }; // สั้นเกินไป
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithValidSignatures() {
        // ทดสอบ LFH signature
        byte[] lfhSig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(lfhSig, lfhSig.length));

        // ทดสอบ EOCD signature
        byte[] eocdSig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(eocdSig, eocdSig.length));

        // ทดสอบ DD signature
        byte[] ddSig = ZipArchiveOutputStream.DD_SIG;
        assertTrue(ZipArchiveInputStream.matches(ddSig, ddSig.length));

        // ทดสอบ Single Segment Split Marker
        byte[] splitSig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        assertTrue(ZipArchiveInputStream.matches(splitSig, splitSig.length));
    }

    @Test
    public void testMatchesWithInvalidSignature() {
        byte[] invalidSig = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        assertFalse(ZipArchiveInputStream.matches(invalidSig, invalidSig.length));
    }

    @Test
    public void testConstructorAndGetNextZipEntryEmptyStream() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeValue() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        try {
            zis.skip(-1L);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testSkipZeroOrPositiveOnEmpty() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        assertEquals(0L, zis.skip(5L));
        zis.close();
    }

    @Test
    public void testCloseIdempotency() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        zis.close();
        // ปิดซ้ำต้องไม่เกิด Exception
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        zis.close();
        byte[] buf = new byte[5];
        zis.read(buf, 0, 5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBufferBounds() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        try {
            byte[] buf = new byte[5];
            zis.read(buf, -1, 5);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBufferLength() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        try {
            byte[] buf = new byte[5];
            zis.read(buf, 0, 10);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testCanReadEntryDataWithNonZipEntry() {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        
        org.apache.commons.compress.archivers.ArchiveEntry nonZipEntry = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        assertFalse(zis.canReadEntryData(nonZipEntry));
        
        try {
            zis.close();
        } catch (IOException ignored) {}
    }

    @Test
    public void testReadWithoutCurrentEntry() throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(stream);
        byte[] buf = new byte[5];
        assertEquals(-1, zis.read(buf, 0, 5));
        zis.close();
    }
}