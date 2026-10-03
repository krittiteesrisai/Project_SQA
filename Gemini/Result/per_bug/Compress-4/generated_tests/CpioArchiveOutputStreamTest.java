package org.apache.commons.compress.archivers.cpio;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class CpioArchiveOutputStreamTest extends TestCase {

    private ByteArrayOutputStream baos;

    protected void setUp() throws Exception {
        super.setUp();
        baos = new ByteArrayOutputStream();
    }

    protected void tearDown() throws Exception {
        baos = null;
        super.tearDown();
    }

    // 1. Constructor & Invalid Format Edge Case
    public void testConstructorInvalidFormat() {
        try {
            new CpioArchiveOutputStream(baos, (short) 999);
            fail("Expected IllegalArgumentException for unknown format");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testValidConstructors() {
        assertNotNull(new CpioArchiveOutputStream(baos));
        assertNotNull(new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW));
        assertNotNull(new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC));
        assertNotNull(new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII));
        assertNotNull(new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY));
    }

    // 2. EnsureOpen and Stream Closed State
    public void testEnsureOpenAfterClose() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        try {
            CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
            out.putArchiveEntry(entry);
            fail("Expected IOException because stream is closed");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    // 3. PutArchiveEntry Edge Cases: Format Mismatch & Duplicate Entry
    public void testFormatMismatch() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "test");
        try {
            out.putArchiveEntry(entry);
            fail("Expected IOException due to format mismatch");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("does not match existing format"));
        }
    }

    public void testDuplicateEntryName() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry1.setFileSize(0);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry2.setFileSize(0);
        try {
            out.putArchiveEntry(entry2);
            fail("Expected IOException due to duplicate entry name");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
    }

    // 4. Time setting fallback (time == -1)
    public void testEntryDefaultTimeSetting() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "timefile");
        assertEquals(-1L, entry.getTime());
        entry.setFileSize(0);
        
        out.putArchiveEntry(entry);
        assertTrue(entry.getTime() != -1L);
        out.closeArchiveEntry();
        out.finish();
    }

    // 5. Write Validation & Bounds Check
    public void testWriteOutOfBounds() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setFileSize(5);
        out.putArchiveEntry(entry);

        byte[] data = new byte[10];
        try {
            out.write(data, -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }

        try {
            out.write(data, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }

        try {
            out.write(data, 0, 15);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    public void testWriteZeroLength() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setFileSize(0);
        out.putArchiveEntry(entry);
        
        // len == 0 branch
        out.write(new byte[0], 0, 0);
        out.closeArchiveEntry();
    }

    public void testWriteWithoutEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[5], 0, 5);
            fail("Expected IOException when writing without current entry");
        } catch (IOException e) {
            assertEquals("no current CPIO entry", e.getMessage());
        }
    }

    public void testWritePastEnd() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setFileSize(2);
        out.putArchiveEntry(entry);

        try {
            out.write(new byte[5], 0, 5);
            fail("Expected IOException when writing past end");
        } catch (IOException e) {
            assertEquals("attempt to write past end of STORED entry", e.getMessage());
        }
    }

    // 6. CloseArchiveEntry Validation: Size mismatch & CRC Error
    public void testEntrySizeMismatch() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setFileSize(5);
        out.putArchiveEntry(entry);
        out.write(new byte[2], 0, 2); // Wrote 2 instead of 5

        try {
            out.closeArchiveEntry();
            fail("Expected IOException for invalid entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry size"));
        }
    }

    public void testCrcError() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcfile");
        entry.setFileSize(3);
        entry.setChksum(12345L); // Intentional mismatch checksum
        
        out.putArchiveEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);

        try {
            out.closeArchiveEntry();
            fail("Expected IOException for CRC Error");
        } catch (IOException e) {
            assertEquals("CRC Error", e.getMessage());
        }
    }

    // 7. Finish and Multiple Formats Write Coverage
    public void testFinishWithUnclosedEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setFileSize(0);
        out.putArchiveEntry(entry);

        try {
            out.finish();
            fail("Expected IOException because entry is unclosed");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    public void testFinishIdempotency() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        out.finish(); // Second call should return immediately due to finished flag
    }

    public void testWriteAllFormatsSuccessfully() throws IOException {
        short[] formats = {
            CpioConstants.FORMAT_NEW,
            CpioConstants.FORMAT_NEW_CRC,
            CpioConstants.FORMAT_OLD_ASCII,
            CpioConstants.FORMAT_OLD_BINARY
        };

        for (short fmt : formats) {
            ByteArrayOutputStream localBaos = new ByteArrayOutputStream();
            CpioArchiveOutputStream out = new CpioArchiveOutputStream(localBaos, fmt);
            CpioArchiveEntry entry = new CpioArchiveEntry(fmt, "file_" + fmt);
            byte[] content = "hello".getBytes();
            entry.setFileSize(content.length);
            if (fmt == CpioConstants.FORMAT_NEW_CRC) {
                long computedCrc = 0;
                for (byte b : content) computedCrc += b & 0xFF;
                entry.setChksum(computedCrc);
            }
            
            out.putArchiveEntry(entry);
            out.write(content, 0, content.length);
            out.closeArchiveEntry();
            out.finish();
            out.close();
            assertTrue(localBaos.size() > 0);
        }
    }

    public void testCreateArchiveEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        File dummyFile = new File("dummy");
        assertNotNull(out.createArchiveEntry(dummyFile, "entryName"));
    }
}