package org.apache.commons.compress.archivers.sevenz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static org.junit.Assert.*;

public class SevenZOutputFileTest {

    private File tempFile;
    private SevenZOutputFile outputfile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("sevenz_test_", ".7z");
        outputfile = new SevenZOutputFile(tempFile);
    }

    @After
    public void tearDown() throws IOException {
        if (outputfile != null) {
            try {
                outputfile.close();
            } catch (IOException e) {
                // Ignore if already closed in tests
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testFinishAlreadyFinishedThrowsException() throws IOException {
        // Trigger finish once successfully
        outputfile.finish();
        
        // Trigger finish second time to cover: if (finished) throw new IOException(...)
        try {
            outputfile.finish();
            fail("Expected IOException because archive is already finished");
        } catch (IOException e) {
            assertEquals("This archive has already been finished", e.getMessage());
        }
    }

    @Test
    public void testCloseCallsFinishIfNotFinished() throws IOException {
        SevenZArchiveEntry entry = outputfile.createArchiveEntry(tempFile, "test.txt");
        outputfile.putArchiveEntry(entry);
        outputfile.write(new byte[] { 1, 2, 3 });
        outputfile.closeArchiveEntry();

        // Calling close() directly should invoke finish() internally since finished is false
        outputfile.close();
        
        // Verify file size > 0 meaning header was written
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testWriteWithZeroOrNegativeLength() throws IOException {
        SevenZArchiveEntry entry = outputfile.createArchiveEntry(tempFile, "empty_write.txt");
        outputfile.putArchiveEntry(entry);
        
        // Triggers if (len > 0) branch with len <= 0 (should do nothing safely)
        byte[] data = new byte[] { 1, 2, 3 };
        outputfile.write(data, 0, 0);
        outputfile.write(data, 1, -1);
        
        outputfile.closeArchiveEntry();
        outputfile.finish();
        
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testArchiveWithDirectoryAndEmptyFiles() throws IOException {
        // Directory entry (no stream)
        File dummyDir = tempFile; // just using as a File reference
        SevenZArchiveEntry dirEntry = outputfile.createArchiveEntry(dummyDir, "mydir");
        dirEntry.setDirectory(true);
        outputfile.putArchiveEntry(dirEntry);
        outputfile.closeArchiveEntry();

        // File with content (has stream)
        SevenZArchiveEntry fileEntry = outputfile.createArchiveEntry(dummyDir, "mydir/file.txt");
        outputfile.putArchiveEntry(fileEntry);
        outputfile.write('A');
        outputfile.closeArchiveEntry();

        outputfile.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testMetadataFieldsCoverages() throws IOException {
        SevenZArchiveEntry entry = outputfile.createArchiveEntry(tempFile, "meta.txt");
        
        // Set optional fields to trigger ctime, atime, mtime, windows attributes branches
        entry.setHasCreationDate(true);
        entry.setCreationDate(new Date());
        
        entry.setHasAccessDate(true);
        entry.setAccessDate(new Date());
        
        entry.setHasLastModifiedDate(true);
        entry.setLastModifiedDate(new Date());
        
        entry.setHasWindowsAttributes(true);
        entry.setWindowsAttributes(32); // Archive attribute

        outputfile.putArchiveEntry(entry);
        outputfile.write(new byte[] { 10, 20, 30 });
        outputfile.closeArchiveEntry();

        outputfile.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testMultipleEntriesMixedStreamStates() throws IOException {
        // Entry 1: No stream (empty file / anti item / empty stream branch)
        SevenZArchiveEntry entry1 = outputfile.createArchiveEntry(tempFile, "empty.txt");
        entry1.setAntiItem(true);
        outputfile.putArchiveEntry(entry1);
        outputfile.closeArchiveEntry();

        // Entry 2: With stream
        SevenZArchiveEntry entry2 = outputfile.createArchiveEntry(tempFile, "content.txt");
        outputfile.putArchiveEntry(entry2);
        outputfile.write("Hello 7z".getBytes());
        outputfile.closeArchiveEntry();

        outputfile.setContentCompression(SevenZMethod.COPY);
        outputfile.finish();
        assertTrue(tempFile.length() > 0);
    }
}