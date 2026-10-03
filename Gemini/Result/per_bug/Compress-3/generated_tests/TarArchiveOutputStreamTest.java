package org.apache.commons.compress.archivers.tar;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamTest extends TestCase {

    private ByteArrayOutputStream byteArrayOutputStream;
    private TarArchiveOutputStream tarOutputStream;

    protected void setUp() throws Exception {
        super.setUp();
        byteArrayOutputStream = new ByteArrayOutputStream();
        tarOutputStream = new TarArchiveOutputStream(byteArrayOutputStream);
    }

    protected void tearDown() throws Exception {
        try {
            tarOutputStream.close();
        } catch (Exception e) {
            // ignore
        }
        super.tearDown();
    }

    // --- Tests for Constructor and Basic Getters ---
    public void testConstructorAndGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOutputStream.getRecordSize());
        
        TarArchiveOutputStream customStream = new TarArchiveOutputStream(byteArrayOutputStream, 1024, 512);
        assertEquals(512, customStream.getRecordSize());
    }

    // --- Tests for putArchiveEntry and Long File Modes ---
    public void testPutArchiveEntryNormal() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOutputStream.putArchiveEntry(entry);
        // Clean up
        tarOutputStream.write(new byte[10], 0, 10);
        tarOutputStream.closeArchiveEntry();
    }

    public void testPutArchiveEntryDirectory() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testDir/");
        assertTrue(entry.isDirectory());
        tarOutputStream.putArchiveEntry(entry);
        tarOutputStream.closeArchiveEntry();
    }

    public void testLongFileModeError() {
        tarOutputStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        String longName = buildLongName();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        try {
            tarOutputStream.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name in ERROR mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    public void testLongFileModeTruncate() throws IOException {
        tarOutputStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longName = buildLongName();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOutputStream.putArchiveEntry(entry);
        tarOutputStream.closeArchiveEntry();
    }

    public void testLongFileModeGnu() throws IOException {
        tarOutputStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = buildLongName();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(5);
        tarOutputStream.putArchiveEntry(entry);
        tarOutputStream.write(new byte[5], 0, 5);
        tarOutputStream.closeArchiveEntry();
    }

    // --- Tests for write and Buffer Assembly ---
    public void testWriteExceedsSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(2);
        tarOutputStream.putArchiveEntry(entry);
        try {
            tarOutputStream.write(new byte[5], 0, 5);
            fail("Expected IOException when writing more than entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size in header"));
        }
    }

    public void testWriteWithAssemblyAndCloseAssembly() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("assemble.txt");
        int size = 600; // Larger than record size (512) to trigger multiple branches
        entry.setSize(size);
        tarOutputStream.putArchiveEntry(entry);

        // Write small chunks to trigger assemBuf logic
        byte[] data = new byte[100];
        for (int i = 0; i < 6; i++) {
            tarOutputStream.write(data, 0, 100);
        }
        tarOutputStream.closeArchiveEntry();
    }

    public void testWritePartialAssemblyFlush() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("partial.txt");
        entry.setSize(1000);
        tarOutputStream.putArchiveEntry(entry);

        // Write small chunk (< record size), triggering assemBuf accumulation
        tarOutputStream.write(new byte[30], 0, 30);
        
        // Write enough to exceed record size combined with assemBuf, triggering assembly flush
        tarOutputStream.write(new byte[500], 0, 500);
        
        // Write remaining to complete
        tarOutputStream.write(new byte[470], 0, 470);
        tarOutputStream.closeArchiveEntry();
    }

    // --- Tests for closeArchiveEntry with incomplete data ---
    public void testCloseArchiveEntryIncompleteData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("incomplete.txt");
        entry.setSize(100);
        tarOutputStream.putArchiveEntry(entry);
        
        // Write fewer bytes than specified (10 instead of 100)
        tarOutputStream.write(new byte[10], 0, 10);
        
        try {
            tarOutputStream.closeArchiveEntry();
            fail("Expected IOException due to incomplete entry data");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("before the '100' bytes specified"));
        }
    }

    // --- Tests for finish, close, and flush ---
    public void testFinishAndClose() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(0);
        tarOutputStream.putArchiveEntry(entry);
        tarOutputStream.closeArchiveEntry();

        tarOutputStream.finish();
        tarOutputStream.close();
        
        // Calling close again should be safe (idempotent due to 'closed' flag)
        tarOutputStream.close();
    }

    public void testFlush() throws IOException {
        tarOutputStream.flush();
        // No exception means pass
    }

    public void testCreateArchiveEntry() throws Exception {
        java.io.File tempFile = java.io.File.createTempFile("tar-test", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tarOutputStream.createArchiveEntry(tempFile, "temp.tmp");
        assertNotNull(entry);
        assertEquals("temp.tmp", entry.getName());
    }

    // Helper method to generate a name longer than TarConstants.NAMELEN (100 chars)
    private String buildLongName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 110; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}