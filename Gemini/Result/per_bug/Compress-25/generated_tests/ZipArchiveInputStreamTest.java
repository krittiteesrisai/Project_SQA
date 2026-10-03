package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamTest {

    @Test
    public void testMatchesWithShortSignature() {
        byte[] shortSig = new byte[] { 0x50, 0x4b };
        boolean matches = ZipArchiveInputStream.matches(shortSig, shortSig.length);
        assertFalse("Signature shorter than LFH length should return false", matches);
    }

    @Test
    public void testMatchesWithNormalLFH() {
        byte[] lfhSig = ZipArchiveOutputStream.LFH_SIG;
        boolean matches = ZipArchiveInputStream.matches(lfhSig, lfhSig.length);
        assertTrue("Normal LFH signature should match", matches);
    }

    @Test
    public void testMatchesWithEOCD() {
        byte[] eocdSig = ZipArchiveOutputStream.EOCD_SIG;
        boolean matches = ZipArchiveInputStream.matches(eocdSig, eocdSig.length);
        assertTrue("EOCD signature should match", matches);
    }

    @Test
    public void testMatchesWithDD() {
        byte[] ddSig = ZipArchiveOutputStream.DD_SIG;
        boolean matches = ZipArchiveInputStream.matches(ddSig, ddSig.length);
        assertTrue("DD signature should match", matches);
    }

    @Test
    public void testMatchesWithSingleSegmentSplitMarker() {
        byte[] marker = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        boolean matches = ZipArchiveInputStream.matches(marker, marker.length);
        assertTrue("Single segment split marker should match", matches);
    }

    @Test
    public void testGetNextZipEntryReturnsNullOnEmptyOrEOF() throws IOException {
        ByteArrayInputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(emptyStream);
        assertNull("Empty stream should return null for next entry", zais.getNextZipEntry());
        zais.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            zais.skip(-1);
        } finally {
            zais.close();
        }
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStreamThrowsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        zais.close();
        byte[] buf = new byte[5];
        zais.read(buf, 0, 5);
    }

    @Test
    public void testReadWhenCurrentIsNullReturnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        byte[] buf = new byte[5];
        int result = zais.read(buf, 0, 5);
        assertEquals("Reading when no entry is active should return -1", -1, result);
        zais.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBufferBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        byte[] buf = new byte[5];
        // Trigger invalid offset/length bounds checking
        zais.read(buf, -1, 5);
    }

    @Test
    public void testCanReadEntryDataWithNonZipEntry() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        org.apache.commons.compress.archivers.ArchiveEntry nonZipEntry = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("test");
        assertFalse("Non-zip entry should not be readable", zais.canReadEntryData(nonZipEntry));
        try {
            zais.close();
        } catch (IOException ignored) {}
    }

    @Test
    public void testGetNextZipEntryHitCentralDirectory() throws IOException {
        // Construct stream starting with Central File Header signature
        byte[] cfhBytes = new byte[] { 
            (byte) 0x50, (byte) 0x4b, 0x01, 0x02, // CFH Signature
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
            0, 0, 0, 0, 0, 0 
        };
        ByteArrayInputStream bais = new ByteArrayInputStream(cfhBytes);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        assertNull("Encountering CFH should hit central directory and return null", zais.getNextZipEntry());
        zais.close();
    }
}