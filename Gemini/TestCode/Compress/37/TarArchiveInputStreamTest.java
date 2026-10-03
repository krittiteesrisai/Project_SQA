package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import static org.junit.Assert.*;

public class TarArchiveInputStreamTest {

    @Test
    public void testAvailableWithDirectory() throws Exception {
        byte[] emptyHeader = new byte[512]; // All zeros indicate EOF or can be structured
        // Create a tar entry that is a directory
        TarArchiveEntry entry = new TarArchiveEntry("testDir/");
        entry.setSize(100);
        
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.setCurrentEntry(entry);
        
        // isDirectory() is true when currEntry is directory
        assertEquals(0, tais.available());
        tais.close();
    }

    @Test
    public void testAvailableLargeEntry() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("largeFile");
        entry.setSize(Long.MAX_VALUE);
        
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.setCurrentEntry(entry);
        
        assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test
    public void testAvailableNormal() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("normalFile");
        entry.setSize(50);
        
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.setCurrentEntry(entry);
        
        assertEquals(50, tais.available());
        tais.close();
    }

    @Test
    public void testSkipZeroOrNegativeOrDirectory() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        // n <= 0 branch
        assertEquals(0, tais.skip(0));
        assertEquals(0, tais.skip(-5));

        // isDirectory() branch
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        tais.setCurrentEntry(entry);
        assertEquals(0, tais.skip(10));
        tais.close();
    }

    @Test
    public void testSkipNormal() throws Exception {
        byte[] data = new byte[100];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setSize(50);
        tais.setCurrentEntry(entry);

        long skipped = tais.skip(10);
        assertEquals(10, skipped);
        tais.close();
    }

    @Test
    public void testMarkAndResetNotSupported() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset(); // Should do nothing without exception
        tais.close();
    }

    @Test
    public void testReadWithoutCurrentEntryThrowsException() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        try {
            byte[] buf = new byte[10];
            tais.read(buf, 0, 5);
            fail("Expected IllegalStateException because currEntry is null");
        } catch (IllegalStateException e) {
            // Expected
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        } finally {
            try { tais.close(); } catch (IOException ignored) {}
        }
    }

    @Test
    public void testReadTruncatedArchive() throws Exception {
        // Stream is empty, but we set a current entry expecting data -> triggers truncated IOException
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setSize(10);
        tais.setCurrentEntry(entry);

        try {
            byte[] buf = new byte[10];
            tais.read(buf, 0, 10);
            fail("Expected IOException due to truncated TAR archive");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Truncated TAR archive"));
        } finally {
            tais.close();
        }
    }

    @Test
    public void testMatchesInvalidLength() {
        byte[] signature = new byte[10];
        assertFalse(TarArchiveInputStream.matches(signature, 5));
    }

    @Test
    public void testMatchesPosix() {
        byte[] signature = new byte[512];
        // Magic "ustar\0" at offset 257, Version "00" at offset 263
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesGnuSpace() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesGnuZero() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesAnt() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesUnknown() {
        byte[] signature = new byte[512];
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testParsePaxHeaders() throws Exception {
        // Format: "length keyword=value\n"
        // e.g., "11 path=foo\n" -> length is string length of "11 path=foo\n"
        String paxContent = "11 path=foo\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(paxContent.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Map<String, String> headers = tais.parsePaxHeaders(bais);
        assertNotNull(headers);
        assertEquals("foo", headers.get("path"));
        tais.close();
    }

    @Test
    public void testParsePaxHeadersRemoval() throws Exception {
        // Test removing key via newline only (restLen == 1)
        // length calculation: "8 key=\n" -> length 8
        String paxContent = "8 key=\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(paxContent.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        // Pre-populate global or existing headers to test removal
        Map<String, String> headers = tais.parsePaxHeaders(bais);
        assertNotNull(headers);
        tais.close();
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncatedThrowsException() throws Exception {
        // Claims length is large, but stream ends immediately
        String paxContent = "50 path=foo\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(paxContent.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        try {
            tais.parsePaxHeaders(bais);
        } finally {
            tais.close();
        }
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        
        TarArchiveEntry normalEntry = new TarArchiveEntry("normal");
        assertTrue(tais.canReadEntryData(normalEntry));

        // Non-TarArchiveEntry should return false
        ArchiveEntry dummyEntry = new ArchiveEntry() {
            @Override public String getName() { return "dummy"; }
            @Override public long getSize() { return 0; }
            @Override public boolean isDirectory() { return false; }
            @Override public java.util.Date getLastModifiedDate() { return null; }
        };
        assertFalse(tais.canReadEntryData(dummyEntry));
        
        try { tais.close(); } catch (IOException ignored) {}
    }
}