package org.apache.commons.compress.archivers.zip;

import junit.framework.TestCase;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipArchiveOutputStreamTest extends TestCase {

    private ByteArrayOutputStream baos;
    private ZipArchiveOutputStream zos;
    private File tempFile;

    protected void setUp() throws Exception {
        super.setUp();
        baos = new ByteArrayOutputStream();
        zos = new ZipArchiveOutputStream(baos);
        tempFile = File.createTempFile("ziptest", ".zip");
        tempFile.deleteOnExit();
    }

    protected void tearDown() throws Exception {
        try {
            zos.close();
        } catch (Exception e) {
            // ignore
        }
        if (tempFile.exists()) {
            tempFile.delete();
        }
        super.tearDown();
    }

    public void testIsSeekableWithOutputStream() {
        assertFalse("OutputStream should not be seekable", zos.isSeekable());
    }

    public void testIsSeekableWithFile() throws IOException {
        ZipArchiveOutputStream fileZos = new ZipArchiveOutputStream(tempFile);
        try {
            assertTrue("File OutputStream should be seekable via RandomAccessFile", fileZos.isSeekable());
        } finally {
            fileZos.close();
        }
    }

    public void testSetLevelValid() {
        zos.setLevel(Deflater.BEST_SPEED);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION);
        zos.setLevel(Deflater.BEST_COMPRESSION);
        // No exception expected
    }

    public void testSetLevelInvalidLow() {
        try {
            zos.setLevel(-2);
            fail("Expected IllegalArgumentException for level < -1");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public void testSetLevelInvalidHigh() {
        try {
            zos.setLevel(10);
            fail("Expected IllegalArgumentException for level > 9");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public void testSetEncodingAndFlags() {
        zos.setEncoding("UTF8");
        assertEquals("UTF8", zos.getEncoding());
        
        zos.setUseLanguageEncodingFlag(true);
        zos.setFallbackToUTF8(true);
        zos.setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy.ALWAYS);
    }

    public void testPutStoredEntryWithoutSizeOrCrcThrowsException() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        // Size and CRC left as default (-1)
        
        try {
            zos.putArchiveEntry(entry);
            fail("Expected ZipException because size and CRC are missing for STORED without RAF");
        } catch (ZipException e) {
            // expected
        }
    }

    public void testPutStoredEntryWithRafDoesNotRequireSizeOrCrc() throws IOException {
        ZipArchiveOutputStream fileZos = new ZipArchiveOutputStream(tempFile);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            
            fileZos.putArchiveEntry(entry);
            fileZos.write(new byte[] { 1, 2, 3, 4 });
            fileZos.closeArchiveEntry();
            fileZos.finish();
        } finally {
            fileZos.close();
        }
    }

    public void testDeflatedEntryWriteSmallAndLargeBlocks() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(entry);

        // Write smaller than DEFLATER_BLOCK_SIZE (e.g., 10 bytes)
        zos.write(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });

        // Write larger than DEFLATER_BLOCK_SIZE (e.g., 9000 bytes) to trigger fullblocks loop
        byte[] largeData = new byte[9000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 128);
        }
        zos.write(largeData, 0, largeData.length);

        zos.closeArchiveEntry();
        zos.finish();
        
        assertTrue(baos.size() > 0);
    }

    public void testFinishWithUnclosedEntryThrowsException() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("unclosed.txt");
        zos.putArchiveEntry(entry);
        
        try {
            zos.finish();
            fail("Expected IOException due to unclosed entry");
        } catch (IOException e) {
            // expected
        }
    }

    public void testCommentAndFlush() throws IOException {
        zos.setComment("Test Archive Comment");
        zos.flush();
        zos.finish();
    }
}