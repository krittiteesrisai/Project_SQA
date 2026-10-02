package org.apache.commons.compress.archivers.zip;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

import static org.junit.Assert.*;

public class ZipFileTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private File twoEntriesZip;
    private static final String STORED_NAME = "stored.txt";
    private static final String DEFLATED_NAME = "deflated.txt";
    private static final byte[] STORED_CONTENT;
    private static final byte[] DEFLATED_CONTENT;

    static {
        try {
            STORED_CONTENT = "Hello STORED content".getBytes("UTF-8");
            DEFLATED_CONTENT = ("Hello DEFLATED content, repeated repeated "
                + "repeated repeated to allow compression.").getBytes("UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() throws IOException {
        twoEntriesZip = folder.newFile("two-entries.zip");
        writeTwoEntriesZip(twoEntriesZip);
    }

    // ---------- helpers -------------------------------------------------

    private void writeTwoEntriesZip(File f) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        ZipOutputStream zos = new ZipOutputStream(fos);
        try {
            // STORED entry - crc & size must be pre-computed for JDK ZipOutputStream
            ZipEntry stored = new ZipEntry(STORED_NAME);
            stored.setMethod(ZipEntry.STORED);
            stored.setSize(STORED_CONTENT.length);
            CRC32 crc = new CRC32();
            crc.update(STORED_CONTENT);
            stored.setCrc(crc.getValue());
            zos.putNextEntry(stored);
            zos.write(STORED_CONTENT);
            zos.closeEntry();

            // DEFLATED entry (default method)
            ZipEntry deflated = new ZipEntry(DEFLATED_NAME);
            zos.putNextEntry(deflated);
            zos.write(DEFLATED_CONTENT);
            zos.closeEntry();
        } finally {
            zos.close();
        }
    }

    private byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        int n;
        while ((n = in.read(buf)) != -1) {
            bos.write(buf, 0, n);
        }
        return bos.toByteArray();
    }

    // ---------- constructor / open error paths ---------------------------

    @Test
    public void testConstructorNullFile_throwsNPE() throws IOException {
        // f.getAbsolutePath() on null File -> NullPointerException (not explicitly
        // documented in javadoc, but is the actual, deterministic behavior of the code)
        thrown.expect(NullPointerException.class);
        new ZipFile((File) null);
    }

    @Test
    public void testConstructorFileNotFound_throwsIOException() throws IOException {
        File notExist = new File(folder.getRoot(), "does-not-exist.zip");
        thrown.expect(IOException.class);
        new ZipFile(notExist);
    }

    @Test
    public void testConstructorEmptyFile_throwsZipException_archiveNotZip()
        throws IOException {
        File empty = folder.newFile("empty.zip"); // 0 bytes
        thrown.expect(ZipException.class);
        thrown.expectMessage("archive is not a ZIP archive");
        new ZipFile(empty);
    }

    @Test
    public void testConstructorCorruptCentralDirectory_throwsIOException()
        throws IOException {
        // Craft: LFH signature at offset 0, followed immediately by a minimal
        // EOCD (22 bytes) whose "offset of start of CD" points back to offset 0.
        // sig(at CD offset) != CFH_SIG AND startsWithLocalFileHeader() == true
        // -> "central directory is empty, can't expand corrupt archive."
        byte[] data = new byte[] {
            0x50, 0x4b, 0x03, 0x04, // LFH sig @0
            0x50, 0x4b, 0x05, 0x06, // EOCD sig @4
            0, 0,                   // disk number
            0, 0,                   // disk w/ CD start
            0, 0,                   // total entries this disk
            0, 0,                   // total entries
            0, 0, 0, 0,             // size of CD
            0, 0, 0, 0,             // offset of start of CD -> 0
            0, 0                    // comment length
        };
        File corrupt = folder.newFile("corrupt.zip");
        FileOutputStream fos = new FileOutputStream(corrupt);
        try {
            fos.write(data);
        } finally {
            fos.close();
        }

        thrown.expect(IOException.class);
        thrown.expectMessage("central directory is empty");
        new ZipFile(corrupt);
    }

    @Test
    public void testTruncatedArchive_throwsIOException() throws IOException {
        // Build a valid archive in memory, then cut off the tail (EOCD gets
        // mangled) - only the exception *family* is guaranteed, not the exact
        // message, since the truncation point is not precisely engineered.
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(bos);
        ZipEntry e = new ZipEntry("trunc.txt");
        zos.putNextEntry(e);
        zos.write("some content".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        byte[] full = bos.toByteArray();
        byte[] truncated = new byte[Math.max(0, full.length - 5)];
        System.arraycopy(full, 0, truncated, 0, truncated.length);

        File truncFile = folder.newFile("truncated.zip");
        FileOutputStream fos = new FileOutputStream(truncFile);
        try {
            fos.write(truncated);
        } finally {
            fos.close();
        }

        thrown.expect(IOException.class);
        new ZipFile(truncFile);
    }

    // ---------- normal read path ------------------------------------------

    @Test
    public void testOpenEmptyValidZip_noEntries() throws IOException {
        File emptyValid = folder.newFile("empty-valid.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(emptyValid));
        zos.close(); // valid archive with zero entries

        ZipFile zf = new ZipFile(emptyValid);
        try {
            Enumeration<ZipArchiveEntry> entries = zf.getEntries();
            assertFalse("empty archive should yield no entries",
                        entries.hasMoreElements());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testStoredEntry_readContent() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            ZipArchiveEntry entry = zf.getEntry(STORED_NAME);
            assertNotNull(entry);
            assertEquals(ZipArchiveEntry.STORED, entry.getMethod());
            assertTrue(zf.canReadEntryData(entry));

            InputStream in = zf.getInputStream(entry);
            assertNotNull(in);
            byte[] read = readAll(in);
            assertArrayEquals(STORED_CONTENT, read);
        } finally {
            zf.close();
        }
    }

    @Test
    public void testDeflatedEntry_readContent() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            ZipArchiveEntry entry = zf.getEntry(DEFLATED_NAME);
            assertNotNull(entry);
            assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
            assertTrue(zf.canReadEntryData(entry));

            InputStream in = zf.getInputStream(entry);
            assertNotNull(in);
            byte[] read = readAll(in);
            assertArrayEquals(DEFLATED_CONTENT, read);
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEntry_unknownName_returnsNull() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            assertNull(zf.getEntry("no-such-entry.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEntry_knownName_returnsEntry() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            ZipArchiveEntry entry = zf.getEntry(STORED_NAME);
            assertNotNull(entry);
            assertEquals(STORED_NAME, entry.getName());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEncoding_returnsGivenValue() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip, "UTF-8");
        try {
            assertEquals("UTF-8", zf.getEncoding());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEncoding_nullEncoding_returnsNull() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip, null);
        try {
            assertNull(zf.getEncoding());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testConstructorUseUnicodeExtraFieldsFalse_stillOpens()
        throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip, "UTF-8", false);
        try {
            assertNotNull(zf.getEntry(STORED_NAME));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEntriesInPhysicalOrder_matchesInsertionOrder()
        throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            Enumeration<ZipArchiveEntry> phys = zf.getEntriesInPhysicalOrder();
            assertTrue(phys.hasMoreElements());
            ZipArchiveEntry first = phys.nextElement();
            assertTrue(phys.hasMoreElements());
            ZipArchiveEntry second = phys.nextElement();
            assertFalse(phys.hasMoreElements());

            // entries were written in this order and offsets increase monotonically
            assertEquals(STORED_NAME, first.getName());
            assertEquals(DEFLATED_NAME, second.getName());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testMultipleEntries_getEntriesEnumerationCount()
        throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            Enumeration<ZipArchiveEntry> entries = zf.getEntries();
            int count = 0;
            while (entries.hasMoreElements()) {
                entries.nextElement();
                count++;
            }
            assertEquals(2, count);
        } finally {
            zf.close();
        }
    }

    // ---------- getInputStream branches ------------------------------------

    @Test
    public void testGetInputStream_entryNotInArchive_returnsNull()
        throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            ZipArchiveEntry foreign = new ZipArchiveEntry("not-in-archive.txt");
            assertNull(zf.getInputStream(foreign));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetInputStream_unsupportedMethod_throwsZipException()
        throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        try {
            ZipArchiveEntry entry = zf.getEntry(STORED_NAME);
            assertNotNull(entry);
            entry.setMethod(9999); // not STORED(0) nor DEFLATED(8)

            thrown.expect(ZipException.class);
            thrown.expectMessage("unsupported compression method");
            zf.getInputStream(entry);
        } finally {
            zf.close();
        }
    }

    // ---------- close / closeQuietly ----------------------------------------

    @Test
    public void testClose_thenCloseAgain_noException() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        zf.close();
        zf.close(); // should be idempotent / not throw
    }

    @Test
    public void testCloseQuietly_null_noException() {
        ZipFile.closeQuietly(null); // must not throw
    }

    @Test
    public void testCloseQuietly_validZipFile_noException() throws IOException {
        ZipFile zf = new ZipFile(twoEntriesZip);
        ZipFile.closeQuietly(zf); // internal close(), swallow any IOException
        // second closeQuietly call also must not throw
        ZipFile.closeQuietly(zf);
    }
}
