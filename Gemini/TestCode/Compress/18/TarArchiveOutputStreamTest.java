package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

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
        try {
            tos.close();
        } catch (Exception e) {
            // Ignored if already closed or finished in tests
        }
    }

    @Test
    public void testDefaultConstructorAndGetters() {
        assertNotNull(tos);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
        assertEquals(0, tos.getBytesWritten());
        assertEquals(0, tos.getCount());
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
        tos.finish(); // Should throw IOException due to unclosed entry
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenFinished() throws IOException {
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry); // Should throw IOException
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

    @Test(expected = RuntimeException.class)
    public void testLongFileNameErrorMode() throws IOException {
        // Name length >= TarConstants.NAMELEN (100)
        String longName = "this_is_a_very_long_file_name_that_exceeds_the_standard_tar_limit_of_one_hundred_characters_and_should_trigger_an_error_by_default_1234567890.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileNameTruncateMode() throws IOException {
        String longName = "this_is_a_very_long_file_name_that_exceeds_the_standard_tar_limit_of_one_hundred_characters_and_should_not_throw_in_truncate_mode_1234567890.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test
    public void testLongFileNameGnuMode() throws IOException {
        String longName = "this_is_a_very_long_file_name_that_exceeds_the_standard_tar_limit_of_one_hundred_characters_and_should_use_gnu_extension_long_link_1234567890.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(5);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {1, 2, 3, 4, 5});
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test
    public void testLongFileNamePosixMode() throws IOException {
        String longName = "this_is_a_very_long_file_name_that_exceeds_the_standard_tar_limit_of_one_hundred_characters_and_should_use_posix_pax_headers_1234567890.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test(expected = RuntimeException.class)
    public void testBigNumberErrorMode() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(TarConstants.MAXSIZE + 1); // Exceeds max size
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testBigNumberPosixMode() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        tos.putArchiveEntry(entry);
        // Note: Writing actual content exceeding MAXSIZE is impractical in unit test memory,
        // but putArchiveEntry and header generation can be tested.
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsSpecifiedSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(3);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {1, 2, 3, 4}); // Writing 4 bytes when size is 3
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryUnderwritten() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("underwritten.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {1, 2, 3}); // Only write 3 bytes out of 10 specified
        tos.closeArchiveEntry(); // Should throw IOException because currBytes < currSize
    }

    @Test
    public void testAssemblyAndBufferBuffering() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("assembly.txt");
        // Write small chunks to trigger assembly buffer logic (assemLen > 0, record boundary handling)
        entry.setSize(1000);
        tos.putArchiveEntry(entry);
        
        byte[] data = new byte[300];
        tos.write(data, 0, 300);
        tos.write(data, 0, 300);
        tos.write(data, 0, 300);
        tos.write(data, 0, 100);
        
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test
    public void testDirectoryEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("mydir/");
        entry.setDirectory(true);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        File tempFile = File.createTempFile("d4j", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "temp.tmp");
        assertNotNull(entry);
        assertEquals("temp.tmp", entry.getName());
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryWhenFinished() throws Exception {
        tos.finish();
        File tempFile = File.createTempFile("d4j", ".tmp");
        tempFile.deleteOnExit();
        tos.createArchiveEntry(tempFile, "temp.tmp");
    }

    @Test
    public void testFlushAndPaxNonAscii() throws IOException {
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("ทดสอบภาษาไทย.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.flush();
        tos.finish();
    }
}