package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class TarArchiveInputStreamTest {

    @Test
    public void testSkipNegativeAndZero() throws IOException {
        byte[] data = new byte[512];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        assertEquals(0L, tais.skip(-5L));
        assertEquals(0L, tais.skip(0L));
        tais.close();
    }

    @Test
    public void testSkipPositiveWithinBounds() throws IOException {
        byte[] data = new byte[512];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        
        // Mocking entry state manually or via stream
        tais.setCurrentEntry(new TarArchiveEntry("test.txt"));
        tais.getCurrentEntry().setSize(100);

        long skipped = tais.skip(50);
        assertEquals(50L, skipped);
        tais.close();
    }

    @Test
    public void testAvailableWithLargeEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        
        TarArchiveEntry entry = new TarArchiveEntry("large.txt");
        entry.setSize((long) Integer.MAX_VALUE + 500L);
        tais.setCurrentEntry(entry);

        assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test
    public void testAvailableWithNormalEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        
        TarArchiveEntry entry = new TarArchiveEntry("normal.txt");
        entry.setSize(150);
        tais.setCurrentEntry(entry);

        assertEquals(150, tais.available());
        tais.close();
    }

    @Test
    public void testMarkAndResetNotSupported() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        assertFalse(tais.markSupported());
        tais.mark(10);
        tais.reset(); // Should do nothing without exception
        tais.close();
    }

    @Test
    public void testGetNextTarEntryWithEOF() throws IOException {
        byte[] emptyData = new byte[1024]; // Zero bytes represent EOF records
        ByteArrayInputStream bais = new ByteArrayInputStream(emptyData);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        assertNull(tais.getNextTarEntry());
        assertNull(tais.getNextTarEntry()); // Test hasHitEOF branch
        tais.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testReadWithoutCurrentEntryThrowsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[100]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        byte[] buf = new byte[10];
        try {
            tais.read(buf, 0, 10);
        } finally {
            tais.close();
        }
    }

    @Test
    public void testMatchesSignatures() {
        // Test short signature
        assertFalse(TarArchiveInputStream.matches(new byte[5], 5));

        // Test POSIX magic & version
        byte[] posixSig = new byte[512];
        System.arraycopy("ustar\0".getBytes(), 0, posixSig, 257, 6);
        System.arraycopy("00".getBytes(), 0, posixSig, 263, 2);
        assertTrue(TarArchiveInputStream.matches(posixSig, posixSig.length));

        // Test GNU space magic & version
        byte[] gnuSpaceSig = new byte[512];
        System.arraycopy("ustar ".getBytes(), 0, gnuSpaceSig, 257, 6);
        System.arraycopy(" \0".getBytes(), 0, gnuSpaceSig, 263, 2);
        assertTrue(TarArchiveInputStream.matches(gnuSpaceSig, gnuSpaceSig.length));

        // Test ANT magic & version
        byte[] antSig = new byte[512];
        System.arraycopy("ustar\0".getBytes(), 0, antSig, 257, 6);
        System.arraycopy("ustar\0".getBytes(), 0, antSig, 263, 6);
        assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));
        
        // Test invalid
        byte[] invalidSig = new byte[512];
        assertFalse(TarArchiveInputStream.matches(invalidSig, invalidSig.length));
    }

    @Test
    public void testParsePaxHeadersValid() throws IOException {
        String paxData = "25 path=a/b/file.txt\n11 size=1024\n";
        InputStream is = new ByteArrayInputStream(paxData.getBytes("UTF-8"));
        TarArchiveInputStream tais = new TarArchiveInputStream(is);

        Map<String, String> headers = tais.parsePaxHeaders(is);
        assertEquals("a/b/file.txt", headers.get("path"));
        assertEquals("1024", headers.get("size"));
        tais.close();
    }

    @Test
    public void testCanReadEntryData() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry normalEntry = new TarArchiveEntry("normal");
        assertTrue(tais.canReadEntryData(normalEntry));

        // Non-tar archive entry should return false
        assertFalse(tais.canReadEntryData(null));
        tais.close();
    }
}