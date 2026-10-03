package org.apache.commons.compress.archivers.tar;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamTest extends TestCase {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    protected void setUp() throws Exception {
        super.setUp();
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    protected void tearDown() throws Exception {
        try {
            tos.close();
        } catch (Exception e) {
            // Ignored for cleanup
        }
        super.tearDown();
    }

    // --- Tests for Constructor and Basic Getters ---
    public void testConstructorAndGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
        
        TarArchiveOutputStream customTos = new TarArchiveOutputStream(baos, 1024, 512);
        assertEquals(512, customTos.getRecordSize());
    }

    // --- Tests for finish() and close() ---
    public void testFinishWithUnclosedEntryThrowsException() {
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(10);
            tos.putArchiveEntry(entry);
            
            tos.finish();
            fail("Expected IOException due to unclosed entry");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    public void testCloseIdempotency() throws IOException {
        tos.close();
        // Calling close again should not throw an exception (Branch closed == true)
        tos.close();
        assertTrue(true);
    }

    // --- Tests for putArchiveEntry and Long File Modes ---
    public void testPutArchiveEntryDirectory() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("mydir/", TarConstants.LF_DIR);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }

    public void testLongFileModeError() {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        try {
            TarArchiveEntry entry = new TarArchiveEntry(longName);
            entry.setSize(0);
            tos.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name in ERROR mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    public void testLongFileModeTruncate() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        assertTrue(baos.size() > 0);
    }

    public void testLongFileModeGnu() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write("hello".getBytes());
        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }

    // --- Tests for closeArchiveEntry (Incomplete data) ---
    public void testCloseArchiveEntryWithIncompleteDataThrowsException() {
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(100); // Expects 100 bytes
            tos.putArchiveEntry(entry);
            tos.write("short".getBytes()); // Writes only 5 bytes
            tos.closeArchiveEntry();
            fail("Expected IOException because data written < entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("before the"));
        }
    }

    // --- Tests for write() branches (assembly and limits) ---
    public void testWriteExceedsSpecifiedSize() {
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(5);
            tos.putArchiveEntry(entry);
            tos.write("too long data".getBytes());
            fail("Expected IOException for writing more than entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size in header"));
        }
    }

    public void testWriteWithAssemblyBufferAccumulationAndFlush() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(600);
        tos.putArchiveEntry(entry);

        // Write small chunk (less than record size) -> triggers assemLen accumulation
        byte[] smallData = new byte[300];
        tos.write(smallData, 0, smallData.length);

        // Write another chunk that fills and exceeds record size (triggers assemLen >= recordBuf.length branch)
        byte[] largeData = new byte[350];
        tos.write(largeData, 0, largeData.length);

        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }
}