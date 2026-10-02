# JUnit 4 Test Suite: ZipArchiveInputStreamTest

## หมายเหตุสำคัญก่อนเริ่ม

เนื่องจาก `ZipArchiveInputStream` เป็นคลาสที่ parse binary format ของ ZIP โดยตรง (ไม่มี dependency injection ที่ mock ได้ง่าย) แนวทางที่ปลอดภัยและไม่ต้อง "เดา behavior" ของคลาสอื่น (เช่น `ZipArchiveOutputStream`) คือการ**สร้าง byte array ของ Local File Header (LFH) ด้วยมือ** ตาม comment ในซอร์สโค้ด (LFH_LEN=30, layout ตามที่ระบุ) สำหรับกรณีที่ต้องการควบคุมทุกฟิลด์อย่างแม่นยำ (เช่น general purpose bit, data descriptor flag) และใช้ `ZipArchiveOutputStream` จริงเฉพาะกรณีที่ต้องการ archive ที่สมบูรณ์ (มี Central Directory + EOCD) เท่านั้น

จุดที่ไม่แน่ใจ 100% จะมีคอมเมนต์กำกับไว้ในโค้ด (เช่น `getNameSource()` getter ที่ไม่ได้เห็น source ตรง ๆ แต่อนุมานจาก `setNameSource(...)`)

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

/**
 * Unit tests for {@link ZipArchiveInputStream}.
 *
 * แนวทาง: สร้าง Local File Header (LFH) ด้วยมือ (ตาม layout ที่ commented ในซอร์ส
 * - LFH_LEN = 30 bytes) เพื่อควบคุม general-purpose-bit / method / size ได้แม่นยำ
 * โดยไม่พึ่งพา behavior ภายในของ ZipArchiveOutputStream (ยกเว้นกรณีที่ต้องใช้
 * archive ที่สมบูรณ์จริง ๆ เช่น การทดสอบ Central Directory).
 */
public class ZipArchiveInputStreamTest {

    // ===================== Low-level byte helpers =====================

    private static void putShortLE(final byte[] b, final int off, final int value) {
        b[off] = (byte) (value & 0xFF);
        b[off + 1] = (byte) ((value >> 8) & 0xFF);
    }

    private static void putIntLE(final byte[] b, final int off, final long value) {
        b[off] = (byte) (value & 0xFF);
        b[off + 1] = (byte) ((value >> 8) & 0xFF);
        b[off + 2] = (byte) ((value >> 16) & 0xFF);
        b[off + 3] = (byte) ((value >> 24) & 0xFF);
    }

    private static byte[] deflateRaw(final byte[] data) throws IOException {
        final Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true); // nowrap=true (raw deflate)
        deflater.setInput(data);
        deflater.finish();
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final byte[] tmp = new byte[1024];
        while (!deflater.finished()) {
            final int n = deflater.deflate(tmp);
            bos.write(tmp, 0, n);
        }
        deflater.end();
        return bos.toByteArray();
    }

    /**
     * Builds a single hand-crafted Local File Header + optional file data.
     *
     * @param name file name
     * @param uncompressedData original data (used for CRC calc), can be null (no CRC calc, DD case)
     * @param storedData bytes actually written after the header (compressed or raw), can be null
     * @param method ZipEntry.STORED (0) or ZipEntry.DEFLATED (8)
     * @param gpFlags general purpose bit flags (e.g. 0x0008 = uses data descriptor, 0x0800 = UTF8)
     */
    private static byte[] buildLocalEntry(final String name, final byte[] uncompressedData,
                                           final byte[] storedData, final int method,
                                           final int gpFlags) throws IOException {
        final byte[] nameBytes = name.getBytes("UTF-8");
        final CRC32 crc32 = new CRC32();
        if (uncompressedData != null) {
            crc32.update(uncompressedData);
        }
        final long crc = crc32.getValue();
        final int compressedLen = storedData != null ? storedData.length : 0;
        final int uncompressedLen = uncompressedData != null ? uncompressedData.length : 0;

        final byte[] header = new byte[30]; // LFH_LEN
        putIntLE(header, 0, 0x04034b50L); // LFH signature "PK\3\4"
        putShortLE(header, 4, 20);         // version needed to extract (arbitrary valid value)
        putShortLE(header, 6, gpFlags);    // general purpose bit flag
        putShortLE(header, 8, method);     // compression method
        putShortLE(header, 10, 0);         // last mod time
        putShortLE(header, 12, 0x21);      // last mod date (arbitrary non-zero)
        if ((gpFlags & 0x0008) != 0) {
            // uses data descriptor: crc/csize/size fields are ignored by the reader,
            // but must still occupy the 12 bytes.
            putIntLE(header, 14, 0);
            putIntLE(header, 18, 0);
            putIntLE(header, 22, 0);
        } else {
            putIntLE(header, 14, crc);
            putIntLE(header, 18, compressedLen);
            putIntLE(header, 22, uncompressedLen);
        }
        putShortLE(header, 26, nameBytes.length); // file name length
        putShortLE(header, 28, 0);                // extra field length

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(header);
        out.write(nameBytes);
        if (storedData != null) {
            out.write(storedData);
        }
        return out.toByteArray();
    }

    private static byte[] buildStoredEntry(final String name, final byte[] data) throws IOException {
        return buildLocalEntry(name, data, data, ZipEntry.STORED, 0);
    }

    private static byte[] buildDeflatedEntry(final String name, final byte[] data) throws IOException {
        final byte[] compressed = deflateRaw(data);
        return buildLocalEntry(name, data, compressed, ZipEntry.DEFLATED, 0);
    }

    private static byte[] buildStoredEntryWithDataDescriptorFlag(final String name) throws IOException {
        return buildLocalEntry(name, null, null, ZipEntry.STORED, 0x0008);
    }

    private static byte[] buildStoredEntryWithUtf8Flag(final String name, final byte[] data) throws IOException {
        return buildLocalEntry(name, data, data, ZipEntry.STORED, 0x0800);
    }

    private static byte[] readAll(final ZipArchiveInputStream zis) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final byte[] buf = new byte[1024];
        int n;
        while ((n = zis.read(buf, 0, buf.length)) != -1) {
            baos.write(buf, 0, n);
        }
        return baos.toByteArray();
    }

    // ===================== matches() static method =====================

    @Test
    public void testMatchesTooShort() {
        final byte[] sig = {0x50, 0x4b};
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesLFHSignature() {
        final byte[] sig = ZipArchiveOutputStream.LFH_SIG.clone();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesEOCDSignature() {
        final byte[] sig = ZipArchiveOutputStream.EOCD_SIG.clone();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesDDSignature() {
        final byte[] sig = ZipArchiveOutputStream.DD_SIG.clone();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesSingleSegmentSplitMarker() {
        final byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesNoMatch() {
        final byte[] sig = {0x00, 0x00, 0x00, 0x00};
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    // ===================== Constructors =====================

    @Test
    public void testConstructorDefaultEncoding() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(ZipEncodingHelper.UTF8, zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructorWithEncoding() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "Cp437");
        assertEquals("Cp437", zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructorWithEncodingAndUnicodeFalse() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", false);
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructorWithAllowStoredEntriesWithDataDescriptor() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        assertNotNull(zis);
        zis.close();
    }

    // ===================== getNextZipEntry() =====================

    @Test
    public void testGetNextZipEntryEmptyStreamReturnsNull() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntryTruncatedHeaderReturnsNull() throws IOException {
        // fewer than LFH_LEN(30) bytes -> readFully throws EOFException internally -> caught -> null
        final byte[] truncated = new byte[10];
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(truncated));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test(expected = ZipException.class)
    public void testGetNextZipEntryInvalidSignatureThrowsZipException() throws IOException {
        final byte[] bogus = new byte[30];
        bogus[0] = (byte) 0xFF;
        bogus[1] = (byte) 0xFF;
        bogus[2] = (byte) 0xFF;
        bogus[3] = (byte) 0xFF;
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(bogus));
        zis.getNextZipEntry();
    }

    @Test
    public void testGetNextZipEntryValidStoredEntryFullRead() throws IOException {
        final byte[] content = "Hello World".getBytes("UTF-8");
        final byte[] zipBytes = buildStoredEntry("test.txt", content);
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));

        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertEquals(content.length, entry.getSize());

        final byte[] readContent = readAll(zis);
        assertArrayEquals(content, readContent);
        zis.close();
    }

    @Test
    public void testGetNextZipEntryValidDeflatedEntryFullRead() throws IOException {
        final byte[] content = "Some deflate-compressible content, repeated repeated repeated."
            .getBytes("UTF-8");
        final byte[] zipBytes = buildDeflatedEntry("deflated.txt", content);
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));

        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("deflated.txt", entry.getName());
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());

        final byte[] readContent = readAll(zis);
        assertArrayEquals(content, readContent);
        zis.close();
    }

    @Test
    public void testMultipleEntriesSequentialRead() throws IOException {
        final byte[] c1 = "AAAA".getBytes("UTF-8");
        final byte[] c2 = "BBBBBB".getBytes("UTF-8");
        final ByteArrayOutputStream combined = new ByteArrayOutputStream();
        combined.write(buildStoredEntry("a.txt", c1));
        combined.write(buildDeflatedEntry("b.txt", c2));

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(combined.toByteArray()));

        final ZipArchiveEntry e1 = zis.getNextZipEntry();
        assertNotNull(e1);
        assertEquals("a.txt", e1.getName());
        assertArrayEquals(c1, readAll(zis));

        final ZipArchiveEntry e2 = zis.getNextZipEntry();
        assertNotNull(e2);
        assertEquals("b.txt", e2.getName());
        assertArrayEquals(c2, readAll(zis));

        // stream ends right after 2nd entry data -> EOF while reading next header -> null
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntryAfterClosedReturnsNull() throws IOException {
        final byte[] zipBytes = buildStoredEntry("f.txt", "content".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.close();
        assertNull(zis.getNextZipEntry()); // closed == true branch
    }

    @Test
    public void testGetNextZipEntryReachesCentralDirectoryReturnsNull() throws IOException {
        // Build a genuinely complete/valid archive (with CFH + EOCD) using the real writer,
        // so that skipRemainderOfArchive() can complete without unexpected EOFException.
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        final ZipArchiveEntry entry = new ZipArchiveEntry("only.txt");
        entry.setMethod(ZipEntry.DEFLATED); // DEFLATED always supported regardless of DD usage
        zos.putArchiveEntry(entry);
        zos.write("payload".getBytes("UTF-8"));
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        // allow=true to be resilient in case writer decides to use data descriptor internally
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, true);

        final ZipArchiveEntry read1 = zis.getNextZipEntry();
        assertNotNull(read1);
        assertEquals("only.txt", read1.getName());

        // second call: internally closes current entry, then hits CFH signature -> hitCentralDirectory=true
        assertNull(zis.getNextZipEntry());
        // third call: hitCentralDirectory already true -> short-circuit branch -> still null
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntryWithUtf8FlagSetsNameSource() throws IOException {
        final byte[] zipBytes = buildStoredEntryWithUtf8Flag("utf8.txt", "data".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        // สมมติฐาน: getNameSource() มีอยู่คู่กับ setNameSource() ที่เห็นในซอร์ส (ไม่ได้เห็น getter ตรง ๆ)
        assertEquals(ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG, entry.getNameSource());
        zis.close();
    }

    // ===================== read() =====================

    @Test(expected = IOException.class)
    public void testReadWhenClosedThrowsIOException() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test
    public void testReadWhenCurrentNullReturnsMinusOne() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, zis.read(new byte[10], 0, 10));
        zis.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidOffsetTooLargeThrowsAIOOBE() throws IOException {
        final byte[] zipBytes = buildStoredEntry("x.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        zis.read(new byte[5], 10, 1); // offset > buffer.length
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadNegativeLengthThrowsAIOOBE() throws IOException {
        final byte[] zipBytes = buildStoredEntry("x.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        zis.read(new byte[5], 0, -1); // length < 0
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadNegativeOffsetThrowsAIOOBE() throws IOException {
        final byte[] zipBytes = buildStoredEntry("x.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        zis.read(new byte[5], -1, 1); // offset < 0
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadLengthExceedsRemainingBufferThrowsAIOOBE() throws IOException {
        final byte[] zipBytes = buildStoredEntry("x.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        zis.read(new byte[5], 2, 5); // buffer.length - offset (3) < length (5)
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws IOException {
        final byte[] zipBytes = buildStoredEntry("z.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        assertEquals(0, zis.read(new byte[5], 0, 0));
        zis.close();
    }

    @Test
    public void testReadBoundaryOffsetEqualsBufferLengthWithZeroLength() throws IOException {
        final byte[] zipBytes = buildStoredEntry("z2.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        // offset == buffer.length, length == 0 -> should NOT throw (offset > length is false when equal)
        assertEquals(0, zis.read(new byte[5], 5, 0));
        zis.close();
    }

    @Test
    public void testReadStoredReturnsMinusOneAfterFullyRead() throws IOException {
        final byte[] content = "abcde".getBytes("UTF-8");
        final byte[] zipBytes = buildStoredEntry("done.txt", content);
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        final byte[] buf = new byte[content.length];
        assertEquals(content.length, zis.read(buf, 0, buf.length));
        // second call: current.bytesRead >= csize branch -> -1
        assertEquals(-1, zis.read(buf, 0, buf.length));
        zis.close();
    }

    @Test(expected = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.class)
    public void testReadStoredWithDataDescriptorNotAllowedThrowsUnsupported() throws IOException {
        final byte[] zipBytes = buildStoredEntryWithDataDescriptorFlag("dd.txt");
        // default constructor -> allowStoredEntriesWithDataDescriptor = false
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        zis.read(new byte[10], 0, 10);
    }

    // ===================== skip() =====================

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeValueThrowsIllegalArgumentException() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.skip(-1);
    }

    @Test
    public void testSkipZeroValueReturnsZero() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zis.skip(0));
        zis.close();
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        final byte[] content = "0123456789".getBytes("UTF-8");
        final byte[] zipBytes = buildStoredEntry("s.txt", content);
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();

        assertEquals(5, zis.skip(5));
        final byte[] rest = new byte[5];
        assertEquals(5, zis.read(rest, 0, 5));
        assertArrayEquals("56789".getBytes("UTF-8"), rest);
        zis.close();
    }

    // ===================== close() =====================

    @Test
    public void testCloseIdempotent() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.close(); // should not throw the 2nd time (closed flag guards it)
    }

    // ===================== canReadEntryData() =====================

    @Test
    public void testCanReadEntryDataNonZipArchiveEntryReturnsFalse() throws IOException {
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final ArchiveEntry fakeEntry = new ArchiveEntry() {
            @Override public String getName() { return "fake"; }
            @Override public long getSize() { return 0; }
            @Override public boolean isDirectory() { return false; }
            @Override public Date getLastModifiedDate() { return new Date(); }
        };
        assertFalse(zis.canReadEntryData(fakeEntry));
        zis.close();
    }

    @Test
    public void testCanReadEntryDataStoredEntryReturnsTrue() throws IOException {
        final byte[] zipBytes = buildStoredEntry("y.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertTrue(zis.canReadEntryData(entry));
        zis.close();
    }

    @Test
    public void testCanReadEntryDataStoredWithDataDescriptorNotAllowedReturnsFalse() throws IOException {
        final byte[] zipBytes = buildStoredEntryWithDataDescriptorFlag("dd2.txt");
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertFalse(zis.canReadEntryData(entry));
        zis.close();
    }

    // ===================== getNextEntry() delegation =====================

    @Test
    public void testGetNextEntryDelegatesToGetNextZipEntry() throws IOException {
        final byte[] zipBytes = buildStoredEntry("z.txt", "abc".getBytes("UTF-8"));
        final ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        final ArchiveEntry entry = zis.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("z.txt", entry.getName());
        zis.close();
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testMatchesTooShort | `matches()`: `length < LFH_SIG.length` → true |
| testMatchesLFHSignature | `matches()`: `checksig(...,LFH_SIG)` → true |
| testMatchesEOCDSignature | `matches()`: LFH ไม่ตรง, `checksig(...,EOCD_SIG)` → true |
| testMatchesDDSignature | `matches()`: `checksig(...,DD_SIG)` → true |
| testMatchesSingleSegmentSplitMarker | `matches()`: split-marker branch → true |
| testMatchesNoMatch | `matches()`: ทุก `checksig` → false, `checksig` loop คืน false ทันทีที่ byte ไม่ตรง |
| testConstructorDefaultEncoding..WithAllow... | Constructor overloads ทั้ง 4 แบบ (chained calls) |
| testGetNextZipEntryEmptyStreamReturnsNull | `readFirstLocalFileHeader` → EOFException → catch → null |
| testGetNextZipEntryTruncatedHeaderReturnsNull | `readFully` EOF branch (< LFH_LEN bytes) |
| testGetNextZipEntryInvalidSignatureThrowsZipException | sig ไม่ตรง CFH/AED/LFH → throw ZipException |
| testGetNextZipEntryValidStoredEntryFullRead | happy path: LFH parse, `!hasDataDescriptor`, method STORED, `readStored` full |
| testGetNextZipEntryValidDeflatedEntryFullRead | method DEFLATED, `readDeflated`/`readFromInflater`, `fill()` |
| testMultipleEntriesSequentialRead | `firstEntry=false` branch (`closeEntry()`), EOF บน header ที่สอง |
| testGetNextZipEntryAfterClosedReturnsNull | `closed` flag → return null ทันที |
| testGetNextZipEntryReachesCentralDirectoryReturnsNull | sig==CFH_SIG → `hitCentralDirectory=true`, `skipRemainderOfArchive()`, short-circuit call ที่ 3 |
| testGetNextZipEntryWithUtf8FlagSetsNameSource | `hasUTF8Flag` → true branch, `setNameSource` |
| testReadWhenClosedThrowsIOException | `read()`: `closed==true` → throw |
| testReadWhenCurrentNullReturnsMinusOne | `read()`: `current==null` → -1 |
| testReadInvalidOffsetTooLargeThrowsAIOOBE | `offset > buffer.length` |
| testReadNegativeLengthThrowsAIOOBE | `length < 0` |
| testReadNegativeOffsetThrowsAIOOBE | `offset < 0` |
| testReadLengthExceedsRemainingBufferThrowsAIOOBE | `buffer.length - offset < length` |
| testReadZeroLengthReturnsZero | boundary: length=0 ผ่านทุกเงื่อนไข |
| testReadBoundaryOffsetEqualsBufferLengthWithZeroLength | boundary: `offset==buffer.length` ไม่ throw |
| testReadStoredReturnsMinusOneAfterFullyRead | `readStored`: `bytesRead>=csize` → -1 |
| testReadStoredWithDataDescriptorNotAllowedThrowsUnsupported | `supportsDataDescriptorFor` → false → `UnsupportedZipFeatureException` |
| testSkipNegativeValueThrowsIllegalArgumentException | `skip()`: `value<0` → throw |
| testSkipZeroValueReturnsZero | `skip()`: loop ไม่รัน (`skipped<value` false ทันที) |
| testSkipWithinEntry | `skip()`: loop รัน, เรียก `read()` ภายใน |
| testCloseIdempotent | `close()`: `!closed` → false รอบสอง (idempotent) |
| testCanReadEntryDataNonZipArchiveEntryReturnsFalse | `canReadEntryData`: `instanceof` false |
| testCanReadEntryDataStoredEntryReturnsTrue | `canReadEntryData`: true/true → true |
| testCanReadEntryDataStoredWithDataDescriptorNotAllowedReturnsFalse | `canReadEntryData`: `supportsDataDescriptorFor` false → false |
| testGetNextEntryDelegatesToGetNextZipEntry | `getNextEntry()` delegate |

**ข้อจำกัดที่ยอมรับ:** ไม่ได้ทดสอบ branch ของ `UNSHRINKING/IMPLODING/BZIP2/ENHANCED_DEFLATED` ใน `read()` เพราะต้องพึ่งพา method code ภายในของ `ZipMethod` enum ที่ไม่ปรากฏใน source ที่ให้มา (เสี่ยงต่อการเดา behavior) จึงงดตามข้อกำหนดที่ 4