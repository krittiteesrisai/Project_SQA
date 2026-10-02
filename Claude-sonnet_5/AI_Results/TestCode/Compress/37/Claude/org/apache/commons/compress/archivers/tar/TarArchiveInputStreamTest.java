package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

public class TarArchiveInputStreamTest {

    // ------------------------------------------------------------------
    // Helper methods to build valid TAR byte streams via the sibling
    // writer class (avoids guessing raw byte layout by hand).
    // ------------------------------------------------------------------

    private byte[] buildSimpleTar(final String name, final byte[] content) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        final TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    private byte[] buildDirectoryTar(final String dirName) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        final TarArchiveEntry entry = new TarArchiveEntry(dirName); // trailing '/' => directory
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    private byte[] buildMultiEntryTar(final String[] names, final byte[][] contents) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        for (int i = 0; i < names.length; i++) {
            final TarArchiveEntry entry = new TarArchiveEntry(names[i]);
            entry.setSize(contents[i].length);
            taos.putArchiveEntry(entry);
            taos.write(contents[i]);
            taos.closeArchiveEntry();
        }
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    /** Custom stream that forces InputStream.read(buf,off,0) to return -1. */
    private static class ZeroLenEOFStream extends InputStream {
        private final byte[] data;
        private int pos = 0;

        ZeroLenEOFStream(final byte[] data) {
            this.data = data;
        }

        @Override
        public int read() throws IOException {
            if (pos >= data.length) {
                return -1;
            }
            return data[pos++] & 0xFF;
        }

        @Override
        public int read(final byte[] b, final int off, final int len) throws IOException {
            if (len == 0) {
                return -1; // force the "totalRead==-1 && numToRead==0" branch
            }
            final int remaining = data.length - pos;
            if (remaining <= 0) {
                return -1;
            }
            final int toCopy = Math.min(len, remaining);
            System.arraycopy(data, pos, b, off, toCopy);
            pos += toCopy;
            return toCopy;
        }
    }

    // ==================================================================
    // Constructors / simple getters
    // ==================================================================

    @Test
    public void testConstructor_defaultBlockAndRecordSize() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
    }

    @Test
    public void testConstructor_withEncoding() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertEquals("UTF-8", tais.encoding);
    }

    @Test
    public void testConstructor_withBlockSize() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockSizeAndEncoding() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, "ASCII");
        assertEquals("ASCII", tais.encoding);
    }

    @Test
    public void testConstructor_withBlockSizeAndRecordSize() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 256);
        assertEquals(256, tais.getRecordSize());
    }

    @Test
    public void testConstructor_nullEncoding() {
        // covers zipEncoding = ZipEncodingHelper.getZipEncoding(null) path
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 512, null);
        assertNull(tais.encoding);
    }

    @Test
    public void testClose_delegatesToUnderlyingStream() throws IOException {
        final InputStream mockIs = Mockito.mock(InputStream.class);
        final TarArchiveInputStream tais = new TarArchiveInputStream(mockIs);
        tais.close();
        Mockito.verify(mockIs, Mockito.times(1)).close();
    }

    @Test
    public void testMarkSupported_returnsFalse() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.markSupported());
    }

    @Test
    public void testMarkAndReset_doNothing_noException() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.mark(100); // no-op, must not throw
        tais.reset();   // no-op, must not throw
    }

    // ==================================================================
    // available()
    // ==================================================================

    @Test
    public void testAvailable_initialState_zero() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, tais.available());
    }

    @Test
    public void testAvailable_isDirectory_returnsZero() throws IOException {
        final byte[] tar = buildDirectoryTar("dir/");
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        final TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertTrue(entry.isDirectory());
        assertEquals(0, tais.available());
    }

    @Test
    public void testAvailable_normalValue() throws IOException {
        final byte[] content = "Hello World".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("hello.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        assertEquals(content.length, tais.available());
    }

    @Test
    public void testAvailable_overflow_returnsIntMaxValue() throws IOException {
        final byte[] content = "x".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("f.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        // Force entrySize - entryOffset > Integer.MAX_VALUE via reflection,
        // since real archives cannot conveniently create such state through the public API.
        Whitebox.setInternalState(tais, "entrySize", (long) Integer.MAX_VALUE + 100L);
        Whitebox.setInternalState(tais, "entryOffset", 0L);
        assertEquals(Integer.MAX_VALUE, tais.available());
    }

    // ==================================================================
    // skip()
    // ==================================================================

    @Test
    public void testSkip_zeroOrNegative_returnsZero() throws IOException {
        final byte[] content = "0123456789".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("a.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        assertEquals(0, tais.skip(0));
        assertEquals(0, tais.skip(-5));
    }

    @Test
    public void testSkip_isDirectory_returnsZero() throws IOException {
        final byte[] tar = buildDirectoryTar("dir2/");
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        assertEquals(0, tais.skip(100));
    }

    @Test
    public void testSkip_withinEntry_updatesOffset() throws IOException {
        final byte[] content = "0123456789".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("b.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        final long skipped = tais.skip(4);
        assertEquals(4, skipped);
        assertEquals(content.length - 4, tais.available());
    }

    @Test
    public void testSkip_moreThanAvailable_capsAtAvailable() throws IOException {
        final byte[] content = "0123456789".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("c.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tais.getNextTarEntry();
        final long skipped = tais.skip(9999);
        assertEquals(content.length, skipped);
        assertEquals(0, tais.available());
    }

    // ==================================================================
    // getNextTarEntry() core behaviour
    // ==================================================================

    @Test
    public void testGetNextTarEntry_emptyStream_returnsNull() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_singleEntry_readsMetadataAndContent() throws IOException {
        final byte[] content = "Hello World".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("hello.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));

        final TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("hello.txt", entry.getName());
        assertEquals(content.length, entry.getSize());

        final byte[] buf = new byte[content.length];
        final int read = tais.read(buf, 0, buf.length);
        assertEquals(content.length, read);
        assertArrayEquals(content, buf);

        // fully consumed -> next read returns -1 (entryOffset >= entrySize branch)
        assertEquals(-1, tais.read(new byte[1], 0, 1));
    }

    @Test
    public void testGetNextTarEntry_afterEOF_repeatedCallsReturnNull() throws IOException {
        final byte[] content = "abc".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("only.txt", content);
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));

        assertNotNull(tais.getNextTarEntry());
        assertNull(tais.getNextTarEntry()); // triggers hasHitEOF = true inside getRecord()
        assertNull(tais.getNextTarEntry()); // short-circuits via "if (hasHitEOF) return null;"
    }

    @Test
    public void testGetNextTarEntry_multipleEntries_skipsRemainingDataAndPadding() throws IOException {
        final byte[] c1 = new byte[600]; // not multiple of recordSize(512) -> exercises skipRecordPadding branch
        Arrays.fill(c1, (byte) 'A');
        final byte[] c2 = "second".getBytes("UTF-8");
        final byte[] tar = buildMultiEntryTar(new String[] {"first.bin", "second.txt"},
                                               new byte[][] {c1, c2});
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));

        final TarArchiveEntry e1 = tais.getNextTarEntry();
        assertEquals("first.bin", e1.getName());
        // Do NOT fully read e1 -> forces IOUtils.skip(this, Long.MAX_VALUE) + skipRecordPadding() branch
        final TarArchiveEntry e2 = tais.getNextTarEntry();
        assertNotNull(e2);
        assertEquals("second.txt", e2.getName());

        final byte[] buf = new byte[c2.length];
        tais.read(buf, 0, buf.length);
        assertArrayEquals(c2, buf);
    }

    @Test
    public void testGetNextTarEntry_directoryEntry_isDirectoryTrue() throws IOException {
        final byte[] tar = buildDirectoryTar("mydir/");
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        final TarArchiveEntry entry = tais.getNextTarEntry();
        assertTrue(entry.isDirectory());
        assertEquals(-1, tais.read(new byte[10], 0, 10)); // isDirectory() branch in read()
    }

    @Test
    public void testGetNextTarEntry_GNULongNameEntry_readsFullName() throws IOException {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('x');
        }
        final String longName = sb.toString(); // >100 chars forces GNU long name entry
        final byte[] content = "data".getBytes("UTF-8");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        final TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        final TarArchiveEntry read = tais.getNextTarEntry();
        assertNotNull(read);
        assertEquals(longName, read.getName());
    }

    @Test
    public void testGetNextTarEntry_malformedGNULongNameEntry_notFollowedByRealEntry_returnsNull()
        throws IOException {
        // Build a valid archive containing ONE GNU-long-name entry, then truncate the
        // stream right after the "L" header + padded name-data block, removing the
        // real entry header entirely -> reproduces Bugzilla 40334 scenario for long *names*.
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('y');
        }
        final String longName = sb.toString();

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        final TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(4);
        taos.putArchiveEntry(entry);
        taos.write("data".getBytes("UTF-8"));
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        final byte[] full = baos.toByteArray();
        final int cutLength = TarConstants.DEFAULT_RCDSIZE * 2; // L-header record + padded name-data record
        final byte[] truncated = Arrays.copyOfRange(full, 0, cutLength);

        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        final TarArchiveEntry result = tais.getNextTarEntry();
        // Real entry header is missing -> getLongNameData() returns null -> outer method returns null
        assertNull(result);
    }

    @Test
    public void testGetNextTarEntry_malformedHeader_throwsIOException() throws IOException {
        // Non-zero (so not treated as EOF) but structurally invalid header -> TarArchiveEntry
        // constructor should throw IllegalArgumentException, wrapped as IOException.
        final byte[] garbage = new byte[TarConstants.DEFAULT_RCDSIZE];
        Arrays.fill(garbage, (byte) 'Z');
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(garbage));
        try {
            tais.getNextTarEntry();
            fail("Expected IOException due to malformed header");
        } catch (final IOException expected) {
            assertTrue(expected.getMessage().contains("Error detected parsing the header"));
        }
    }

    // ==================================================================
    // read()
    // ==================================================================

    @Test
    public void testRead_noCurrentEntry_butOffsetLessThanSize_throwsIllegalStateException()
        throws IOException {
        // Forcing this specific state (entryOffset < entrySize while currEntry == null)
        // is not reachable through the public API; using reflection to reach the branch.
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Whitebox.setInternalState(tais, "entrySize", 10L);
        Whitebox.setInternalState(tais, "entryOffset", 0L);
        try {
            tais.read(new byte[5], 0, 5);
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException expected) {
            assertEquals("No current tar entry", expected.getMessage());
        }
    }

    @Test
    public void testRead_truncatedArchive_throwsIOException() throws IOException {
        final byte[] content = "0123456789".getBytes("UTF-8"); // claimed size = 10
        final byte[] full = buildSimpleTar("trunc.txt", content);
        // Keep only the header record; drop all content & trailer -> simulates truncated file.
        final byte[] truncated = Arrays.copyOfRange(full, 0, TarConstants.DEFAULT_RCDSIZE);

        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        final TarArchiveEntry entry = tais.getNextTarEntry();
        assertEquals(content.length, entry.getSize());

        try {
            tais.read(new byte[content.length], 0, content.length);
            fail("Expected IOException: Truncated TAR archive");
        } catch (final IOException expected) {
            assertTrue(expected.getMessage().contains("Truncated TAR archive"));
        }
    }

    @Test
    public void testRead_zeroLengthRequest_returnsMinusOneWithoutException() throws IOException {
        final byte[] content = "some content".getBytes("UTF-8");
        final byte[] tar = buildSimpleTar("z.txt", content);
        final ZeroLenEOFStream underlying = new ZeroLenEOFStream(tar);
        final TarArchiveInputStream tais = new TarArchiveInputStream(underlying);

        final TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);

        final int result = tais.read(new byte[0], 0, 0);
        assertEquals(-1, result);
        assertTrue(tais.isAtEOF()); // covers the "hasHitEOF = true" (no-exception) sub-branch
    }

    // ==================================================================
    // canReadEntryData()
    // ==================================================================

    @Test
    public void testCanReadEntryData_normalTarEntry_returnsTrue() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final TarArchiveEntry entry = new TarArchiveEntry("plain.txt");
        assertTrue(tais.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryData_nonTarArchiveEntry_returnsFalse() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final ArchiveEntry mockEntry = Mockito.mock(ArchiveEntry.class);
        assertFalse(tais.canReadEntryData(mockEntry));
    }
    // NOTE: canReadEntryData() with a *sparse* TarArchiveEntry (isSparse()==true) branch
    // is not exercised here because constructing a validly-recognised sparse entry
    // requires internal knowledge not exposed by the public writer API in this version;
    // guessing that construction would violate requirement #4.

    // ==================================================================
    // getCurrentEntry() / setCurrentEntry() / isAtEOF() / setAtEOF()
    // ==================================================================

    @Test
    public void testGetCurrentEntry_initiallyNull_thenSetAfterRead() throws IOException {
        final byte[] tar = buildSimpleTar("cur.txt", "abc".getBytes("UTF-8"));
        final TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        assertNull(tais.getCurrentEntry());
        tais.getNextTarEntry();
        assertNotNull(tais.getCurrentEntry());
        assertEquals("cur.txt", tais.getCurrentEntry().getName());
    }

    @Test
    public void testSetAtEOF_and_isAtEOF() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.isAtEOF());
        tais.setAtEOF(true);
        assertTrue(tais.isAtEOF());
    }

    @Test
    public void testSetCurrentEntry() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final TarArchiveEntry entry = new TarArchiveEntry("manual.txt");
        tais.setCurrentEntry(entry);
        assertEquals(entry, tais.getCurrentEntry());
    }

    // ==================================================================
    // isEOFRecord() / readRecord() (protected, direct access)
    // ==================================================================

    @Test
    public void testIsEOFRecord_nullRecord_true() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tais.isEOFRecord(null));
    }

    @Test
    public void testIsEOFRecord_allZero_true() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 512);
        final byte[] zeroRecord = new byte[512];
        assertTrue(tais.isEOFRecord(zeroRecord));
    }

    @Test
    public void testIsEOFRecord_nonZero_false() {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 512);
        final byte[] record = new byte[512];
        record[0] = 1;
        assertFalse(tais.isEOFRecord(record));
    }

    @Test
    public void testReadRecord_fullRecord_returnsData() throws IOException {
        final byte[] data = new byte[512];
        Arrays.fill(data, (byte) 7);
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(data), 1024, 512);
        final byte[] record = tais.readRecord();
        assertArrayEquals(data, record);
    }

    @Test
    public void testReadRecord_shortRead_returnsNull() throws IOException {
        final byte[] data = new byte[100]; // less than recordSize
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(data), 1024, 512);
        assertNull(tais.readRecord());
    }

    // ==================================================================
    // parsePaxHeaders() (package-private, direct access)
    // ==================================================================

    @Test
    public void testParsePaxHeaders_simpleKeyValue() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // self-referential length: "16 path=abc.txt\n" has exactly 16 characters
        final String record = "16 path=abc.txt\n";
        final Map<String, String> headers =
            tais.parsePaxHeaders(new ByteArrayInputStream(record.getBytes("UTF-8")));
        assertEquals("abc.txt", headers.get("path"));
    }

    @Test
    public void testParsePaxHeaders_removalWhenValueEmpty() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // Pre-populate the internal globalPaxHeaders map to prove the key gets removed.
        final Map<String, String> pre = new HashMap<String, String>();
        pre.put("x", "old-value");
        Whitebox.setInternalState(tais, "globalPaxHeaders", pre);

        // self-referential length: "5 x=\n" has exactly 5 characters, restLen == 1 (only '\n')
        final String record = "5 x=\n";
        final Map<String, String> headers =
            tais.parsePaxHeaders(new ByteArrayInputStream(record.getBytes("UTF-8")));
        assertFalse(headers.containsKey("x"));
    }

    @Test
    public void testParsePaxHeaders_truncatedValue_throwsIOException() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // Claims total length 16 (as in the valid case) but the stream is cut short
        // before all declared value bytes are available -> IOUtils.readFully() shortfall.
        final String record = "16 path=ab"; // no trailing data / newline
        try {
            tais.parsePaxHeaders(new ByteArrayInputStream(record.getBytes("UTF-8")));
            fail("Expected IOException due to truncated PAX header value");
        } catch (final IOException expected) {
            assertTrue(expected.getMessage().contains("Failed to read"));
        }
    }

    @Test
    public void testParsePaxHeaders_emptyStream_returnsHeadersUnchanged() throws IOException {
        final TarArchiveInputStream tais =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final Map<String, String> headers =
            tais.parsePaxHeaders(new ByteArrayInputStream(new byte[0]));
        assertTrue(headers.isEmpty());
    }

    // ==================================================================
    // matches() static method
    // ==================================================================

    private byte[] buildSignature(final byte[] magic, final byte[] version) {
        final int len = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN + 16;
        final byte[] sig = new byte[len];
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        return sig;
    }

    @Test
    public void testMatches_tooShortLength_returnsFalse() {
        final byte[] sig = new byte[5];
        assertFalse(TarArchiveInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_posix_returnsTrue() {
        final byte[] sig = buildSignature(TarConstants.MAGIC_POSIX, TarConstants.VERSION_POSIX);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_gnuSpace_returnsTrue() {
        final byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.VERSION_GNU_SPACE);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_gnuZero_returnsTrue() {
        final byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.VERSION_GNU_ZERO);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_ant_returnsTrue() {
        final byte[] sig = buildSignature(TarConstants.MAGIC_ANT, TarConstants.VERSION_ANT);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_noMagicMatch_returnsFalse() {
        final byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN + 16];
        // all zero bytes - won't match any of POSIX / GNU / ANT magics
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }
}
