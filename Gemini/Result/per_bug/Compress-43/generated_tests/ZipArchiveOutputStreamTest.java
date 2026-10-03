package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private ZipArchiveOutputStream zos;
    private File tempFile;

    @Before
    public void setUp() throws IOException {
        baos = new ByteArrayOutputStream();
        zos = new ZipArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        if (zos != null) {
            try {
                zos.close();
            } catch (Exception ignored) {
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testOutputStreamConstructorAndIsSeekable() {
        assertFalse("OutputStream-based stream should not be seekable", zos.isSeekable());
    }

    @Test
    public void testSeekableByteChannelConstructor() throws IOException {
        try (SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
             ZipArchiveOutputStream seekableZos = new ZipArchiveOutputStream(channel)) {
            assertTrue("SeekableByteChannel-based stream should be seekable", seekableZos.isSeekable());
        }
    }

    @Test
    public void testFileConstructor() throws IOException {
        tempFile = File.createTempFile("ziptest", ".zip");
        try (ZipArchiveOutputStream fileZos = new ZipArchiveOutputStream(tempFile)) {
            assertTrue("File-based stream should be seekable", fileZos.isSeekable());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelInvalidLow() {
        zos.setLevel(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelInvalidHigh() {
        zos.setLevel(10);
    }

    @Test
    public void testSetLevelValid() {
        zos.setLevel(Deflater.BEST_COMPRESSION);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION);
    }

    @Test
    public void testSetEncodingAndLanguageFlag() {
        zos.setEncoding("UTF-8");
        assertEquals("UTF-8", zos.getEncoding());

        zos.setUseLanguageEncodingFlag(true);
        zos.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", zos.getEncoding());
    }

    @Test(expected = ZipException.class)
    public void testStoredMethodWithoutSizeThrowsException() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        zos.putArchiveEntry(entry);
    }

    @Test(expected = ZipException.class)
    public void testStoredMethodWithoutCrcThrowsException() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(10);
        zos.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testFinishCalledTwiceThrowsException() throws IOException {
        zos.finish();
        zos.finish();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenEntryThrowsException() throws IOException {
        zos.closeArchiveEntry();
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteWithoutCurrentEntryThrowsException() throws IOException {
        byte[] data = "test".getBytes(StandardCharsets.UTF_8);
        zos.write(data, 0, data.length);
    }

    @Test
    public void testNormalZipCreationWorkflow() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("hello.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(entry);
        
        byte[] data = "Hello World!".getBytes(StandardCharsets.UTF_8);
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        zos.finish();

        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCanWriteEntryData() {
        ZipArchiveEntry validEntry = new ZipArchiveEntry("valid.txt");
        validEntry.setMethod(ZipArchiveOutputStream.DEFLATED);
        assertTrue(zos.canWriteEntryData(validEntry));

        ZipArchiveEntry invalidEntry = new ZipArchiveEntry("invalid.txt");
        invalidEntry.setMethod(ZipMethod.IMPLODING.getCode());
        assertFalse(zos.canWriteEntryData(invalidEntry));

        assertFalse(zos.canWriteEntryData(new ArchiveEntry() {
            @Override public String getName() { return "dummy"; }
            @Override public boolean isDirectory() { return false; }
            @Override public long getSize() { return 0; }
            @Override public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        }));
    }

    @Test
    public void testSetCommentAndFallback() {
        zos.setComment("Archive Comment");
        zos.setFallbackToUTF8(true);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
    }
}