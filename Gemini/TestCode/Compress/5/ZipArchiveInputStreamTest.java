package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamTest {

    @Test
    public void testGetNextZipEntryOnClosedStream() throws IOException {
        byte[] data = new byte[0];
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        assertNull("Closed stream should return null entry", zis.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryEof() throws IOException {
        byte[] data = new byte[5]; // Insufficient for LFH_LEN (30 bytes)
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        assertNull("Incomplete LFH should return null (EOF)", zis.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryCentralDirectory() throws IOException {
        byte[] lfh = new byte[30];
        // CFH Signature: 0x02014b50 -> 50 4b 01 02 (Little Endian)
        lfh[0] = 0x50; lfh[1] = 0x4b; lfh[2] = 0x01; lfh[3] = 0x02;
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        assertNull("CFH signature should hit central directory and return null", zis.getNextZipEntry());
        // Subsequent calls should also return null due to hitCentralDirectory flag
        assertNull("Should remain null after hitting central directory", zis.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryInvalidSignature() throws IOException {
        byte[] lfh = new byte[30];
        // Invalid signature
        lfh[0] = 0x00; lfh[1] = 0x00; lfh[2] = 0x00; lfh[3] = 0x00;
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        assertNull("Invalid signature should return null", zis.getNextZipEntry());
    }

    @Test
    public void testMatches() {
        // Less than LFH signature length (4 bytes)
        assertFalse(ZipArchiveInputStream.matches(new byte[]{0x50, 0x4b}, 2));

        // Valid LFH signature: 0x04034b50 -> 50 4b 03 04
        byte[] lfhSig = new byte[]{0x50, 0x4b, 0x03, 0x04, 0, 0, 0, 0};
        assertTrue(ZipArchiveInputStream.matches(lfhSig, lfhSig.length));

        // Valid EOCD signature: 0x06054b50 -> 50 4b 05 06
        byte[] eocdSig = new byte[]{0x50, 0x4b, 0x05, 0x06, 0, 0, 0, 0};
        assertTrue(ZipArchiveInputStream.matches(eocdSig, eocdSig.length));

        // Invalid signature
        byte[] invSig = new byte[]{0x00, 0x00, 0x00, 0x00, 0, 0, 0, 0};
        assertFalse(ZipArchiveInputStream.matches(invSig, invSig.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        try {
            zis.skip(-1L);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testSkipValidAndEof() throws IOException {
        byte[] data = new byte[10];
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        // Skip on null current entry returns 0 or handles gracefully based on read()
        long skipped = zis.skip(5L);
        assertEquals(0L, skipped);
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        zis.close();
        byte[] buf = new byte[10];
        zis.read(buf, 0, 10);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBounds() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[5];
        try {
            zis.read(buf, 0, 10); // length > buffer remaining
        } finally {
            zis.close();
        }
    }

    @Test
    public void testReadWhenNoCurrentEntry() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[5];
        int read = zis.read(buf, 0, 5);
        assertEquals(-1, read);
        zis.close();
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        zis.close();
        zis.close(); // Should not throw exception
    }
}