package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipFileTest {

    private File tempZipFile;

    @Before
    public void setUp() throws IOException {
        tempZipFile = File.createTempFile("test-arch-", ".zip");
    }

    @After
    public void tearDown() {
        if (tempZipFile != null && tempZipFile.exists()) {
            tempZipFile.delete();
        }
    }

    /**
     * Helper method to write a minimal valid ZIP file containing one STORED entry.
     */
    private void createSampleZipFile(File file, int method, byte[] content, String entryName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            // Local File Header
            fos.write(ZipArchiveOutputStream.LFH_SIG);
            fos.write(ZipShort.getBytes(20)); // version needed
            fos.write(ZipShort.getBytes(0));  // general purpose bit flag
            fos.write(ZipShort.getBytes(method)); // compression method
            fos.write(ZipShort.getBytes(0));  // time
            fos.write(ZipShort.getBytes(0));  // date
            
            // CRC-32 (simplified, 0 for test)
            fos.write(new byte[]{0, 0, 0, 0});
            fos.write(ZipLong.getBytes(content.length)); // compressed size
            fos.write(ZipLong.getBytes(content.length)); // uncompressed size
            
            byte[] nameBytes = entryName.getBytes("UTF-8");
            fos.write(ZipShort.getBytes(nameBytes.length));
            fos.write(ZipShort.getBytes(0)); // extra field length
            fos.write(nameBytes);
            
            // Data
            fos.write(content);

            // Central Directory
            long cfdOffset = fos.getChannel().position();
            fos.write(ZipArchiveOutputStream.CFH_SIG);
            fos.write(ZipShort.getBytes(20)); // version made by
            fos.write(ZipShort.getBytes(20)); // version needed
            fos.write(ZipShort.getBytes(0));  // general purpose bit flag
            fos.write(ZipShort.getBytes(method)); // compression method
            fos.write(ZipShort.getBytes(0));  // time
            fos.write(ZipShort.getBytes(0));  // date
            fos.write(new byte[]{0, 0, 0, 0}); // CRC
            fos.write(ZipLong.getBytes(content.length)); // compressed size
            fos.write(ZipLong.getBytes(content.length)); // uncompressed size
            fos.write(ZipShort.getBytes(nameBytes.length));
            fos.write(ZipShort.getBytes(0)); // extra len
            fos.write(ZipShort.getBytes(0)); // comment len
            fos.write(ZipShort.getBytes(0)); // disk start
            fos.write(ZipShort.getBytes(0)); // internal attrs
            fos.write(ZipLong.getBytes(0));  // external attrs
            fos.write(ZipLong.getBytes(0));  // relative offset of LFH
            fos.write(nameBytes);

            // End of Central Directory (EOCD)
            long eocdOffset = fos.getChannel().position();
            fos.write(ZipArchiveOutputStream.EOCD_SIG);
            fos.write(ZipShort.getBytes(0)); // number of this disk
            fos.write(ZipShort.getBytes(0)); // disk with start of CFH
            fos.write(ZipShort.getBytes(1)); // entries on this disk
            fos.write(ZipShort.getBytes(1)); // total entries
            fos.write(ZipLong.getBytes(cfdOffset)); // size of CFH
            fos.write(ZipLong.getBytes(cfdOffset)); // offset of CFH
            fos.write(ZipShort.getBytes(0)); // comment length
        }
    }

    @Test
    public void testValidZipFileInstantiationAndEntries() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        createSampleZipFile(tempZipFile, ZipArchiveEntry.STORED, data, "test.txt");

        ZipFile zipFile = new ZipFile(tempZipFile);
        try {
            assertNotNull(zipFile.getEncoding());
            Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
            assertTrue(entries.hasMoreElements());
            
            ZipArchiveEntry entry = entries.nextElement();
            assertEquals("test.txt", entry.getName());
            
            ZipArchiveEntry fetchedByName = zipFile.getEntry("test.txt");
            assertNotNull(fetchedByName);
            
            Enumeration<ZipArchiveEntry> physicalEntries = zipFile.getEntriesInPhysicalOrder();
            assertTrue(physicalEntries.hasMoreElements());

            assertTrue(zipFile.canReadEntryData(entry));
        } finally {
            zipFile.close();
        }
    }

    @Test
    public void testGetInputStreamStored() throws IOException {
        byte[] data = "STORED content".getBytes("UTF-8");
        createSampleZipFile(tempZipFile, ZipArchiveEntry.STORED, data, "stored.txt");

        ZipFile zipFile = new ZipFile(tempZipFile);
        try {
            ZipArchiveEntry entry = zipFile.getEntry("stored.txt");
            InputStream is = zipFile.getInputStream(entry);
            assertNotNull(is);
            
            byte[] buffer = new byte[20];
            int read = is.read(buffer);
            assertEquals(data.length, read);
            is.close();
        } finally {
            zipFile.close();
        }
    }

    @Test
    public void testGetInputStreamNonExistentEntry() throws IOException {
        createSampleZipFile(tempZipFile, ZipArchiveEntry.STORED, new byte[0], "dummy.txt");

        ZipFile zipFile = new ZipFile(tempZipFile);
        try {
            ZipArchiveEntry fakeEntry = new ZipArchiveEntry("nonexistent.txt");
            assertNull(zipFile.getInputStream(fakeEntry));
        } finally {
            zipFile.close();
        }
    }

    @Test(expected = ZipException.class)
    public void testGetInputStreamUnsupportedCompression() throws IOException {
        // Method 99 is unsupported
        createSampleZipFile(tempZipFile, 99, "unsupported".getBytes(), "unsupported.txt");

        ZipFile zipFile = new ZipFile(tempZipFile);
        try {
            ZipArchiveEntry entry = zipFile.getEntry("unsupported.txt");
            zipFile.getInputStream(entry);
        } finally {
            zipFile.close();
        }
    }

    @Test(expected = ZipException.class)
    public void testInvalidZipFileFormatThrowsException() throws IOException {
        // Write garbage data
        try (FileOutputStream fos = new FileOutputStream(tempZipFile)) {
            fos.write("NOT A ZIP FILE".getBytes());
        }

        new ZipFile(tempZipFile);
    }

    @Test
    public void testCloseQuietlyWithNull() {
        // Should not throw any exception
        ZipFile.closeQuietly(null);
    }

    @Test
    public void testCloseQuietlyWithValidZip() throws IOException {
        createSampleZipFile(tempZipFile, ZipArchiveEntry.STORED, new byte[0], "test.txt");
        ZipFile zipFile = new ZipFile(tempZipFile);
        ZipFile.closeQuietly(zipFile);
    }

    @Test
    public void testFinalizeUnclosedZipFile() throws Throwable {
        createSampleZipFile(tempZipFile, ZipArchiveEntry.STORED, new byte[0], "test.txt");
        ZipFile zipFile = new ZipFile(tempZipFile);
        // Trigger finalize explicitly or test path coverage
        zipFile.finalize();
    }
}