package org.apache.commons.compress.archivers.cpio;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CpioArchiveOutputStreamTest extends TestCase {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream out;

    protected void setUp() throws Exception {
        super.setUp();
        baos = new ByteArrayOutputStream();
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
    }

    protected void tearDown() throws Exception {
        try {
            out.close();
        } catch (Exception e) {
            // ignore
        }
        super.tearDown();
    }

    public void testConstructorWithInvalidFormat() {
        try {
            new CpioArchiveOutputStream(new ByteArrayOutputStream(), (short) 9999);
            fail("Expected IllegalArgumentException for unknown header type");
        } catch (IllegalArgumentException e) {
            assertEquals("Unknown header type", e.getMessage());
        }
    }

    public void testPutNextEntryDefaultValuesAndFormatting() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("file1");
        entry.setFileSize(5);
        entry.setTime(-1); // Triggers time assignment
        entry.setFormat((short) -1); // Triggers default format assignment

        out.putNextEntry(entry);
        out.write("12345".getBytes());
        out.closeArchiveEntry();
        out.finish();

        assertTrue(baos.size() > 0);
    }

    public void testDuplicateEntryThrowsException() throws IOException {
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup");
        entry1.setFileSize(0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup");
        entry2.setFileSize(0);

        out.putNextEntry(entry1);
        out.closeArchiveEntry();

        try {
            out.putNextEntry(entry2);
            fail("Expected IOException for duplicate entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
    }

    public void testWriteOutOfBoundsAndEdgeCases() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };

        // 1. Write when no entry is active
        try {
            out.write(data, 0, 5);
            fail("Expected IOException for no current CPIO entry");
        } catch (IOException e) {
            assertEquals("no current CPIO entry", e.getMessage());
        }

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file2");
        entry.setFileSize(3);
        out.putNextEntry(entry);

        // 2. Len == 0 (Edge Case)
        out.write(data, 0, 0);

        // 3. Invalid offset/length parameters (IndexOutOfBoundsException)
        try {
            out.write(data, -1, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            out.write(data, 0, 10);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        // 4. Writing past end of STORED entry
        try {
            out.write(data, 0, 4);
            fail("Expected IOException for writing past end");
        } catch (IOException e) {
            assertEquals("attempt to write past end of STORED entry", e.getMessage());
        }

        out.write(data, 0, 3);
        out.closeArchiveEntry();
    }

    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "mismatch");
        entry.setFileSize(5);
        out.putNextEntry(entry);
        out.write("12".getBytes()); // Wrote only 2 bytes instead of 5

        try {
            out.closeArchiveEntry();
            fail("Expected IOException for invalid entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry size"));
        }
    }

    public void testFormatsCoverageNewCrcAsciiBinary() throws IOException {
        // Test FORMAT_NEW_CRC
        CpioArchiveOutputStream crcOut = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry crcEntry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcfile");
        crcEntry.setFileSize(3);
        // Calculate expected CRC sum for "abc" -> 'a'+'b'+'c' = 97+98+99 = 294
        long expectedCrc = 'a' + 'b' + 'c';
        crcEntry.setChksum(expectedCrc);

        crcOut.putNextEntry(crcEntry);
        crcOut.write("abc".getBytes());
        crcOut.closeArchiveEntry();
        crcOut.finish();
        crcOut.close();

        // Test FORMAT_OLD_ASCII
        ByteArrayOutputStream baosAscii = new ByteArrayOutputStream();
        CpioArchiveOutputStream asciiOut = new CpioArchiveOutputStream(baosAscii, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry asciiEntry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "asciifile");
        asciiEntry.setFileSize(2);
        asciiOut.putNextEntry(asciiEntry);
        asciiOut.write("ok".getBytes());
        asciiOut.closeArchiveEntry();
        asciiOut.close();

        // Test FORMAT_OLD_BINARY
        ByteArrayOutputStream baosBin = new ByteArrayOutputStream();
        CpioArchiveOutputStream binOut = new CpioArchiveOutputStream(baosBin, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry binEntry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "binfile");
        binEntry.setFileSize(2);
        binOut.putNextEntry(binEntry);
        binOut.write("hi".getBytes());
        binOut.closeArchiveEntry();
        binOut.close();
    }

    public void testCrcError() throws IOException {
        CpioArchiveOutputStream crcOut = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry crcEntry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "badcrc");
        crcEntry.setFileSize(2);
        crcEntry.setChksum(99999); // Incorrect checksum

        crcOut.putNextEntry(crcEntry);
        crcOut.write("xy".getBytes());

        try {
            crcOut.closeArchiveEntry();
            fail("Expected IOException for CRC Error");
        } catch (IOException e) {
            assertEquals("CRC Error", e.getMessage());
        }
        crcOut.close();
    }

    public void testEnsureOpenChecksAfterClose() throws IOException {
        out.close();

        try {
            out.putNextEntry(new CpioArchiveEntry("test"));
            fail("Expected IOException because stream is closed");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }

        try {
            out.write(new byte[1], 0, 1);
            fail("Expected IOException because stream is closed");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }

        try {
            out.finish();
            fail("Expected IOException because stream is closed");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    public void testFinishIdempotencyAndActiveEntry() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "finishfile");
        entry.setFileSize(2);
        out.putNextEntry(entry);
        out.write("ab".getBytes());

        // Calling finish with an active entry should auto-close it and write TRAILER!!!
        out.finish();
        
        // Calling finish again should return immediately (idempotent branch)
        out.finish();
    }
}