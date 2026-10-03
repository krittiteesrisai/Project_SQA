package org.apache.commons.compress.archivers.ar;

import junit.framework.TestCase;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ArArchiveInputStreamTest extends TestCase {

    // Helper stream for testing close state
    private static class DummyInputStream extends InputStream {
        private boolean closed = false;
        @Override
        public int read() throws IOException {
            return -1;
        }
        @Override
        public void close() throws IOException {
            closed = true;
            super.close();
        }
        public boolean isClosed() {
            return closed;
        }
    }

    // --- Tests for matches() ---
    
    public void testMatchesLengthTooShort() {
        byte[] sig = "!<arch>\n".getBytes();
        assertFalse(ArArchiveInputStream.matches(sig, 7));
    }

    public void testMatchesValidSignature() {
        byte[] sig = ArArchiveEntry.HEADER.getBytes();
        assertTrue(ArArchiveInputStream.matches(sig, sig.length));
    }

    public void testMatchesInvalidBytes() {
        byte[] sig = ArArchiveEntry.HEADER.getBytes();
        // Mutate first byte
        sig[0] = 0x00;
        assertFalse(ArArchiveInputStream.matches(sig, sig.length));
    }

    public void testMatchesAllBytePositions() {
        byte[] validSig = ArArchiveEntry.HEADER.getBytes();
        for (int i = 0; i < 8; i++) {
            byte[] mutated = validSig.clone();
            mutated[i] = (byte) (mutated[i] + 1);
            assertFalse("Should fail when byte at index " + i + " is incorrect",
                    ArArchiveInputStream.matches(mutated, mutated.length));
        }
    }

    // --- Tests for Constructor & close() ---

    public void testCloseStream() throws IOException {
        DummyInputStream dummy = new DummyInputStream();
        ArArchiveInputStream ais = new ArArchiveInputStream(dummy);
        ais.close();
        assertTrue(dummy.isClosed());
        // Call close again to test !closed branch guard
        ais.close();
    }

    // --- Tests for getNextArEntry() / getNextEntry() ---

    public void testGetNextArEntryTruncatedHeader() {
        // Less bytes than HEADER length
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[]{ '!', '<' });
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ais.getNextArEntry();
            fail("Expected IOException due to truncated header");
        } catch (IOException e) {
            assertEquals("failed to read header", e.getMessage());
        }
    }

    public void testGetNextArEntryInvalidHeaderContent() {
        // Correct length but wrong magic bytes
        byte[] wrongHeader = "INVALID_HDR".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(wrongHeader);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ais.getNextArEntry();
            fail("Expected IOException due to invalid header content");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("invalid header"));
        }
    }

    public void testGetNextArEntryAvailableZero() throws IOException {
        // Provide valid header, but then available() becomes 0 immediately
        // Note: ByteArrayInputStream.available() decreases as bytes are read.
        // We supply exactly the header.
        byte[] header = ArArchiveEntry.HEADER.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        
        // First call consumes header (offset becomes header.length)
        // Wait, if input.available() == 0 after header, it returns null.
        // Let's test standard EOF behavior:
        assertNull(ais.getNextArEntry());
    }

    public void testGetNextArEntrySuccessAndPadding() throws Exception {
        // Construct a valid ar archive stream with one entry having odd length content or standard format
        StringBuilder sb = new StringBuilder();
        sb.append(ArArchiveEntry.HEADER);
        // Entry header: name (16), lastmodified (12), userid (6), groupid (6), filemode (8), length (10), trailer (2) = 60 bytes
        // Total header size for entry = 60 bytes
        String entryHeader = padRight("testfile.txt", 16) +
                             padRight("123456", 12) +
                             padRight("0", 6) +
                             padRight("0", 6) +
                             padRight("100644", 8) +
                             padRight("5", 10) + // length = 5
                             ArArchiveEntry.TRAILER;
        
        sb.append(entryHeader);
        sb.append("12345"); // content length 5 (odd or even, let's test odd content to trigger offset % 2 != 0 padding)
        
        ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes());
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        
        ArArchiveEntry entry = ais.getNextArEntry();
        assertNotNull(entry);
        assertEquals("testfile.txt", entry.getName());
        assertEquals(5, entry.getLength());
        
        // Calling getNextEntry() via interface polymorphism
        // Next call should hit EOF or handle padding if another entry existed.
        assertNull(ais.getNextEntry());
    }

    public void testGetNextArEntryInvalidEntryHeaderTrailer() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArArchiveEntry.HEADER);
        
        // Entry header with invalid trailer
        String entryHeader = padRight("testfile.txt", 16) +
                             padRight("123456", 12) +
                             padRight("0", 6) +
                             padRight("0", 6) +
                             padRight("100644", 8) +
                             padRight("5", 10) +
                             "XX"; // Wrong trailer instead of "`\n"
        
        sb.append(entryHeader);
        
        ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes());
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        
        try {
            ais.getNextArEntry();
            fail("Expected IOException due to invalid entry header trailer");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry header"));
        }
    }

    public void testGetNextArEntryTruncatedEntryHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArArchiveEntry.HEADER);
        sb.append("SHORT_METADATA"); // Not enough bytes for full entry metadata + trailer
        
        ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes());
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        
        try {
            ais.getNextArEntry();
            fail("Expected IOException due to truncated entry header");
        } catch (IOException e) {
            assertEquals("failed to read entry header", e.getMessage());
        }
    }

    // Utility helper for padding strings in ar header simulation
    private String padRight(String s, int n) {
        if (s.length() >= n) {
            return s.substring(0, n);
        }
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < n) {
            sb.append(" ");
        }
        return sb.toString();
    }
}