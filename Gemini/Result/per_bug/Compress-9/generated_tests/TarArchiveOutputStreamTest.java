package org.apache.commons.compress.archivers.tar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        if (tos != null) {
            try {
                tos.close();
            } catch (Exception e) {
                // Ignore if already closed or finished with error in tests
            }
        }
    }

    @Test
    public void testConstructorAndGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
        
        TarArchiveOutputStream customTos = new TarArchiveOutputStream(baos, 1024, 512);
        assertEquals(512, customTos.getRecordSize());
    }

    @Test(expected = IOException.class)
    public void testFinishWhenAlreadyFinished() throws IOException {
        tos.finish();
        tos.finish(); // Should throw IOException
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        tos.finish(); // Should throw IOException because entry is unclosed
    }

    @Test
    public void testCloseIdempotencyAndFinishTrigger() throws IOException {
        tos.close();
        // Calling close again should be safe due to closed flag check
        tos.close();
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenFinished() throws IOException {
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry); // Should throw IOException
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileNameErrorMode() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tos.putArchiveEntry(entry); // Should throw RuntimeException
    }

    @Test
    public void testLongFileNameGnuMode() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(5);
        
        tos.putArchiveEntry(entry);
        tos.write(new byte[]{1, 2, 3, 4, 5});
        tos.closeArchiveEntry();
        tos.finish();
        
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testLongFileNameTruncateMode() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longName = "a".repeat(TarConstants.NAMELEN + 10);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        assertNotNull(tos);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWhenNotOpened() throws IOException {
        tos.closeArchiveEntry(); // Should throw IOException
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWhenFinished() throws IOException {
        tos.finish();
        tos.closeArchiveEntry(); // Should throw IOException
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithIncompleteData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(100);
        tos.putArchiveEntry(entry);
        tos.write(new byte[]{1, 2, 3}); // Written only 3 bytes out of 100
        tos.closeArchiveEntry(); // Should throw IOException
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsDeclaredSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(2);
        tos.putArchiveEntry(entry);
        tos.write(new byte[]{1, 2, 3}); // Exceeds size 2
    }

    @Test
    public void testWriteWithAssemblyAndBufferHandling() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        // Write data across multiple chunks to trigger assembly buffer logic (assemLen > 0)
        int size = 600; // Larger than standard record size to test loops
        entry.setSize(size);
        tos.putArchiveEntry(entry);
        
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = (byte) (i % 128);
        }
        
        // Write in small chunks (e.g., 33 bytes) to force assembly buffer handling
        int chunk = 33;
        for (int i = 0; i < size; i += chunk) {
            int length = Math.min(chunk, size - i);
            tos.write(data, i, length);
        }
        
        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testDirectoryEntryHandling() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("mydir/");
        entry.setDirectory(true);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        assertNotNull(tos);
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryWhenFinished() throws IOException {
        tos.finish();
        tos.createArchiveEntry(new File("dummy"), "dummy");
    }

    @Test
    public void testFlush() throws IOException {
        tos.flush();
        assertNotNull(tos);
    }
}