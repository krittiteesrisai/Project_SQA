# แผนการทดสอบและโค้ด JUnit 4

**หมายเหตุสำคัญ:** ผมวางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`org.apache.commons.compress.archivers.zip`) เพื่อให้สามารถอ้างอิง package-private constants เช่น `ZipLong.LFH_SIG`, `ZipLong.CFH_SIG`, `ZipLong.DD_SIG`, `ZipLong.SINGLE_SEGMENT_SPLIT_MARKER` ได้อย่างถูกต้องตรงกับ source จริง (ไม่ต้อง hardcode ค่า signature เอง ลดการเดา) และ import คลาสเป้าหมายไว้อย่างชัดเจนตามข้อกำหนด

ผมหลีกเลี่ยงการเรียกใช้ API ของคลาสที่ไม่ได้แสดงใน source (เช่น `GeneralPurposeBit` setter) ตามข้อ 4 โดยใช้วิธี "สร้าง byte array ของ ZIP header เอง" แทน เพื่อควบคุม branch ที่ต้องการทดสอบได้ตรงและปลอดภัยที่สุด

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream; // explicit import ตามข้อกำหนด
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for {@link ZipArchiveInputStream} (Defects4J Compress-41b).
 *
 * หมายเหตุ: บาง assumption เกี่ยวกับ ZipUtil.canHandleEntryData() ถูกกำกับด้วยคอมเมนต์
 * เนื่องจากไม่มี source ของ ZipUtil ให้ตรวจสอบตรง ๆ
 */
public class ZipArchiveInputStreamTest {

    // ---------- helper: low level byte writers (little endian) ----------

    private static void writeLEShort(final OutputStream out, final int v) throws IOException {
        out.write(v & 0xFF);
        out.write((v >> 8) & 0xFF);
    }

    private static void writeLEInt(final OutputStream out, final long v) throws IOException {
        long val = v;
        for (int i = 0; i < 4; i++) {
            out.write((int) (val & 0xFF));
            val >>= 8;
        }
    }

    /**
     * สร้าง archive ที่มี entry เดียว (LFH + filename + [empty extra] + body)
     * ไม่มี data descriptor, ไม่มี central directory - เพียงพอสำหรับทดสอบ
     * getNextZipEntry()/read() ตาม logic ของ source.
     */
    private static byte[] buildSingleEntry(final String name,
                                            final byte[] rawData,
                                            final int method,
                                            final byte[] storedBody) throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeLEInt(out, 0x04034b50L); // LFH signature
        writeLEShort(out, 20);        // version needed
        writeLEShort(out, 0);         // general purpose flag = 0 (no data descriptor)
        writeLEShort(out, method);    // method
        writeLEShort(out, 0);         // time
        writeLEShort(out, 0);         // date
        final CRC32 crc = new CRC32();
        crc.update(rawData);
        writeLEInt(out, crc.getValue());
        writeLEInt(out, storedBody.length); // compressed size
        writeLEInt(out, rawData.length);    // uncompressed size
        final byte[] nameBytes = name.getBytes("UTF-8");
        writeLEShort(out, nameBytes.length);
        writeLEShort(out, 0); // extra length = 0
        out.write(nameBytes);
        out.write(storedBody);
        return out.toByteArray();
    }

    /** deflate ข้อมูลแบบ raw (nowrap) ให้ตรงกับ Inflater(true) ที่ใช้ในคลาสเป้าหมาย */
    private static byte[] rawDeflate(final byte[] data) throws IOException {
        final Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(data);
        deflater.finish();
        final byte[] buf = new byte[1024];
        int len = deflater.deflate(buf);
        deflater.end();
        return Arrays.copyOf(buf, len);
    }

    private static byte[] concat(final byte[]... arrays) throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (final byte[] a : arrays) {
            out.write(a);
        }
        return out.toByteArray();
    }

    // ============================================================
    // matches() static method
    // ============================================================

    @Test
    public void testMatches_lengthTooShort_returnsFalse() {
        final byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        // length น้อยกว่าความยาว signature -> false ทันที (boundary)
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length - 1));
    }

    @Test
    public void testMatches_lfhSignature_returnsTrue() {
        final byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_eocdSignature_returnsTrue() {
        final byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_ddSignature_returnsTrue() {
        final byte[] sig = ZipArchiveOutputStream.DD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_singleSegmentSplitMarker_returnsTrue() {
        final byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_nonMatchingSignature_returnsFalse() {
        final byte[] sig = new byte[] { 0, 0, 0, 0 };
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    // ============================================================
    // Constructors
    // ============================================================

    @Test
    public void testConstructor_defaultEncoding() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals("UTF8", zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructor_withNullEncoding() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), null);
        assertNull(zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructor_withEncodingNoUnicode() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", false);
        assertEquals("UTF-8", zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructor_fullArgs_allowStoredWithDD() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        assertNotNull(zis);
        zis.close();
    }

    // ============================================================
    // getNextZipEntry() / getNextEntry()
    // ============================================================

    @Test
    public void testGetNextEntry_emptyStream_returnsNull() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextEntry_invalidSignature_returnsNull() throws IOException {
        // 30 ไบต์ทั้งหมดเป็น 0 -> ไม่ตรงกับ LFH/CFH/AED/DD signature
        final byte[] data = new byte[30];
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextEntry_splitArchiveDDSignatureAsFirst_throwsUnsupportedFeature()
            throws IOException {
        final byte[] ddSig = ZipLong.DD_SIG.getBytes();
        final byte[] data = new byte[30];
        System.arraycopy(ddSig, 0, data, 0, 4);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(data));
        try {
            zis.getNextZipEntry();
            fail("Expected UnsupportedZipFeatureException");
        } catch (final UnsupportedZipFeatureException e) {
            assertEquals(UnsupportedZipFeatureException.Feature.SPLITTING, e.getFeature());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testGetNextEntry_singleSegmentSplitMarker_skippedAndEntryRead()
            throws IOException {
        final byte[] content = "hello".getBytes("UTF-8");
        final byte[] realEntry = buildSingleEntry("f.txt", content,
                ZipEntry.STORED, content);
        final byte[] marker = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        final byte[] full = concat(marker, realEntry);

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(full));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("f.txt", entry.getName());
        assertEquals(content.length, entry.getSize());

        final byte[] buf = new byte[100];
        final int n = zis.read(buf, 0, buf.length);
        assertEquals(content.length, n);
        assertArrayEquals(content, Arrays.copyOf(buf, n));
        zis.close();
    }

    @Test
    public void testGetNextEntry_storedEntry_readsDataCorrectly() throws IOException {
        final byte[] content = "Hello World!".getBytes("UTF-8");
        final byte[] archive = buildSingleEntry("test.txt", content, ZipEntry.STORED, content);

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        final ZipArchiveEntry entry = zis.getNextZipEntry();

        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertEquals(ZipEntry.STORED, entry.getMethod());

        final byte[] buf = new byte[100];
        final int read = zis.read(buf, 0, buf.length);
        assertEquals(content.length, read);
        assertArrayEquals(content, Arrays.copyOf(buf, read));

        // ไม่มี entry ถัดไป -> EOF -> null
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextEntry_deflatedEntry_readsDataCorrectly() throws IOException {
        final byte[] content = "The quick brown fox jumps over the lazy dog".getBytes("UTF-8");
        final byte[] compressed = rawDeflate(content);
        final byte[] archive = buildSingleEntry("data.bin", content, ZipEntry.DEFLATED, compressed);

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        final ZipArchiveEntry entry = zis.getNextZipEntry();

        assertNotNull(entry);
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());

        final byte[] buf = new byte[200];
        int totalRead = 0;
        int n;
        while ((n = zis.read(buf, totalRead, buf.length - totalRead)) > 0) {
            totalRead += n;
        }
        assertEquals(content.length, totalRead);
        assertArrayEquals(content, Arrays.copyOf(buf, totalRead));
        zis.close();
    }

    @Test
    public void testGetNextEntry_afterClose_returnsNull() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testGetNextEntry_multipleStoredEntries_sequentialRead() throws IOException {
        final byte[] c1 = "AAAA".getBytes("UTF-8");
        final byte[] c2 = "BBBBBB".getBytes("UTF-8");
        final byte[] e1 = buildSingleEntry("a.txt", c1, ZipEntry.STORED, c1);
        final byte[] e2 = buildSingleEntry("b.txt", c2, ZipEntry.STORED, c2);
        final byte[] archive = concat(e1, e2);

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));

        // entry แรก - ไม่อ่าน content เลย (เพื่อ trigger closeEntry()/drain path)
        final ZipArchiveEntry first = zis.getNextZipEntry();
        assertNotNull(first);
        assertEquals("a.txt", first.getName());

        // เรียก entry ที่สอง -> ทดสอบ branch "current != null -> closeEntry(), firstEntry=false"
        final ZipArchiveEntry second = zis.getNextZipEntry();
        assertNotNull(second);
        assertEquals("b.txt", second.getName());

        final byte[] buf = new byte[50];
        final int n = zis.read(buf, 0, buf.length);
        assertEquals(c2.length, n);
        assertArrayEquals(c2, Arrays.copyOf(buf, n));

        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test(expected = EOFException.class)
    public void testGetNextEntry_truncatedCentralDirectory_throwsEOFException() throws IOException {
        final byte[] c1 = "content".getBytes("UTF-8");
        final byte[] e1 = buildSingleEntry("only.txt", c1, ZipEntry.STORED, c1);

        // จำลอง CFH signature ที่ truncated (ไม่มี EOCD ตามมาให้ครบ)
        final byte[] cfhSig = ZipLong.CFH_SIG.getBytes();
        final byte[] fakeCfh = new byte[30];
        System.arraycopy(cfhSig, 0, fakeCfh, 0, 4);
        final byte[] archive = concat(e1, fakeCfh);

        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        assertNotNull(zis.getNextZipEntry()); // entry แรกอ่านได้ปกติ
        try {
            zis.getNextZipEntry(); // ต้อง throw EOFException จาก skipRemainderOfArchive()
        } finally {
            zis.close();
        }
    }

    @Test
    public void testGetNextEntry_delegatesToGetNextEntryOverride() throws IOException {
        final byte[] content = "x".getBytes("UTF-8");
        final byte[] archive = buildSingleEntry("x.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        final ArchiveEntry entry = zis.getNextEntry();
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("x.txt", entry.getName());
        zis.close();
    }

    // ============================================================
    // read()
    // ============================================================

    @Test
    public void testRead_noCurrentEntry_returnsMinusOne() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final byte[] buf = new byte[10];
        assertEquals(-1, zis.read(buf, 0, 10));
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsIOException() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidOffset_throwsArrayIndexOutOfBoundsException() throws IOException {
        final byte[] content = "abc".getBytes("UTF-8");
        final byte[] archive = buildSingleEntry("e.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        final byte[] buf = new byte[5];
        // offset > buffer.length -> ArrayIndexOutOfBoundsException ตาม logic ตรวจสอบเอง
        zis.read(buf, buf.length + 1, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_negativeLength_throwsArrayIndexOutOfBoundsException() throws IOException {
        final byte[] content = "abc".getBytes("UTF-8");
        final byte[] archive = buildSingleEntry("e.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        final byte[] buf = new byte[5];
        zis.read(buf, 0, -1);
    }

    @Test
    public void testRead_dataDescriptorNotSupportedForStored_throwsUnsupportedFeature()
            throws IOException {
        // สร้าง LFH ที่ general purpose flag bit3 (0x0008) = ใช้ data descriptor,
        // method = STORED, fileNameLen=extraLen=0 -> ครบ 30 ไบต์ไม่ต้องมี body
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeLEInt(out, 0x04034b50L);
        writeLEShort(out, 20);
        writeLEShort(out, 0x0008); // usesDataDescriptor = true
        writeLEShort(out, ZipEntry.STORED);
        writeLEShort(out, 0);
        writeLEShort(out, 0);
        writeLEInt(out, 0); // crc (ไม่ได้ใช้เพราะ hasDataDescriptor)
        writeLEInt(out, 0); // csize
        writeLEInt(out, 0); // size
        writeLEShort(out, 0); // filename length = 0
        writeLEShort(out, 0); // extra length = 0
        final byte[] archive = out.toByteArray();

        // allowStoredEntriesWithDataDescriptor = false (default)
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        final ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertTrue(entry.getGeneralPurposeBit().usesDataDescriptor());

        try {
            zis.read(new byte[10], 0, 10);
            fail("Expected UnsupportedZipFeatureException (DATA_DESCRIPTOR)");
        } catch (final UnsupportedZipFeatureException e) {
            assertEquals(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, e.getFeature());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testRead_zeroLength_returnsZero() throws IOException {
        final byte[] content = "abc".getBytes("UTF-8");
        final byte[] archive = buildSingleEntry("e.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        assertEquals(0, zis.read(new byte[10], 0, 0));
        zis.close();
    }

    // ============================================================
    // canReadEntryData()
    // ============================================================

    @Test
    public void testCanReadEntryData_nonZipArchiveEntry_returnsFalse() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final ArchiveEntry mockEntry = Mockito.mock(ArchiveEntry.class);
        assertFalse(zis.canReadEntryData(mockEntry));
        zis.close();
    }

    @Test
    public void testCanReadEntryData_plainStoredEntry_returnsTrue() throws IOException {
        // สมมติฐาน: ZipUtil.canHandleEntryData() คืน true สำหรับ STORED ที่ไม่มี encryption
        // (ไม่มี source ของ ZipUtil ให้ตรวจสอบตรง ๆ - กำกับเป็นคอมเมนต์ตามข้อ 4)
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        final ZipArchiveEntry entry = new ZipArchiveEntry("plain.txt");
        entry.setMethod(ZipEntry.STORED);
        assertTrue(zis.canReadEntryData(entry));
        zis.close();
    }

    // ============================================================
    // skip()
    // ============================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsIllegalArgumentException() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            zis.skip(-1);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testSkip_zeroValue_returnsZero() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zis.skip(0));
        zis.close();
    }

    @Test
    public void testSkip_partialWithinEntry_thenReadRemainder() throws IOException {
        final byte[] content = "0123456789ABCDEFGHIJ".getBytes("UTF-8"); // 20 bytes
        final byte[] archive = buildSingleEntry("f.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();

        final long skipped = zis.skip(5);
        assertEquals(5, skipped);

        final byte[] buf = new byte[100];
        final int n = zis.read(buf, 0, buf.length);
        assertEquals(15, n);
        assertEquals("56789ABCDEFGHIJ", new String(Arrays.copyOf(buf, n), "UTF-8"));
        zis.close();
    }

    @Test
    public void testSkip_moreThanAvailable_returnsPartialAmount() throws IOException {
        final byte[] content = "shortdata".getBytes("UTF-8"); // 9 bytes
        final byte[] archive = buildSingleEntry("f.txt", content, ZipEntry.STORED, content);
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();

        final long skipped = zis.skip(1000);
        // เข้าถึงได้แค่ content.length ไบต์ ก่อนที่ readStored() จะคืน -1
        assertEquals(content.length, skipped);
        zis.close();
    }

    // ============================================================
    // close()
    // ============================================================

    @Test
    public void testClose_idempotent_noException() throws IOException {
        final ZipArchiveInputStream zis =
            new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.close(); // เรียกซ้ำต้องไม่ throw
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testMatches_lengthTooShort_returnsFalse | `matches()`: `length < LFH_SIG.length` → true |
| testMatches_lfhSignature_returnsTrue | `checksig(LFH_SIG)` → true (OR แรก) |
| testMatches_eocdSignature_returnsTrue | `checksig(EOCD_SIG)` → true (OR ที่สอง) |
| testMatches_ddSignature_returnsTrue | `checksig(DD_SIG)` → true (OR ที่สาม) |
| testMatches_singleSegmentSplitMarker_returnsTrue | `checksig(SINGLE_SEGMENT_SPLIT_MARKER)` → true (OR สุดท้าย) |
| testMatches_nonMatchingSignature_returnsFalse | ทุก `checksig()` false, loop `for` ใน `checksig` คืน false ตั้งแต่ byte แรก |
| testConstructor_* (4 methods) | Constructor overload ทั้ง 4 แบบ, ค่า `encoding` (รวม null) |
| testGetNextEntry_emptyStream_returnsNull | `readFirstLocalFileHeader` → EOFException → catch → return null |
| testGetNextEntry_invalidSignature_returnsNull | sig ≠ CFH/AED และ sig ≠ LFH_SIG → return null |
| testGetNextEntry_splitArchiveDDSignatureAsFirst_throwsUnsupportedFeature | `sig.equals(DD_SIG)` ใน `readFirstLocalFileHeader` → throw SPLITTING |
| testGetNextEntry_singleSegmentSplitMarker_skippedAndEntryRead | `sig.equals(SINGLE_SEGMENT_SPLIT_MARKER)` branch, arraycopy logic |
| testGetNextEntry_storedEntry_readsDataCorrectly | LFH parsing (`!hasDataDescriptor` branch), `readStored()` ปกติ |
| testGetNextEntry_deflatedEntry_readsDataCorrectly | `readDeflated()`/`readFromInflater()` loop, `inf.needsInput()` |
| testGetNextEntry_afterClose_returnsNull | `if (closed \|\| hitCentralDirectory) return null` (closed=true) |
| testGetNextEntry_multipleStoredEntries_sequentialRead | `if (current != null) { closeEntry(); firstEntry=false; }`, `currentEntryHasOutstandingBytes()`/`drainCurrentEntryData()` |
| testGetNextEntry_truncatedCentralDirectory_throwsEOFException | `sig.equals(CFH_SIG)` → `hitCentralDirectory=true` → `skipRemainderOfArchive()` → EOFException ไม่ถูก catch |
| testGetNextEntry_delegatesToGetNextEntryOverride | `getNextEntry()` เรียก `getNextZipEntry()` |
| testRead_noCurrentEntry_returnsMinusOne | `current == null → return -1` |
| testRead_afterClose_throwsIOException | `if (closed) throw new IOException` ใน `read()` |
| testRead_invalidOffset_throwsArrayIndexOutOfBoundsException | `offset > buffer.length` boundary check |
| testRead_negativeLength_throwsArrayIndexOutOfBoundsException | `length < 0` boundary check |
| testRead_dataDescriptorNotSupportedForStored_throwsUnsupportedFeature | `supportsDataDescriptorFor()` ทุก OR-clause false → throw DATA_DESCRIPTOR |
| testRead_zeroLength_returnsZero | `readStored()` กรณี `length=0` |
| testCanReadEntryData_nonZipArchiveEntry_returnsFalse | `ae instanceof ZipArchiveEntry` → false |
| testCanReadEntryData_plainStoredEntry_returnsTrue | `canHandleEntryData && supportsDataDescriptorFor` → true |
| testSkip_negativeValue_throwsIllegalArgumentException | `value >= 0` false → throw |
| testSkip_zeroValue_returnsZero | `while (skipped < value)` ไม่ loop เลย (0<0 false) |
| testSkip_partialWithinEntry_thenReadRemainder | loop `while` จริง, คำนวณ `rem`, `SKIP_BUF` |
| testSkip_moreThanAvailable_returnsPartialAmount | `x == -1 → return skipped` (partial) |
| testClose_idempotent_noException | `if (!closed)` false บนการเรียกครั้งที่สอง |

**ข้อจำกัด/สิ่งที่ไม่ได้ทดสอบ (เพื่อไม่เดา behavior):** การทดสอบ `UnshrinkingInputStream`, `ExplodingInputStream`, `BZip2CompressorInputStream` path ใน `getNextZipEntry()`/`read()` ต้องพึ่งพา behavior ของ compression algorithm เฉพาะทางที่ซับซ้อนและไม่มี source ประกอบให้ตรวจสอบ จึงไม่รวมไว้เพื่อป้องกันการเดา และ `canReadEntryData()` กรณีที่ `ZipUtil.canHandleEntryData()` คืน false ก็ไม่ได้ทดสอบเนื่องจากไม่มี source ของ `ZipUtil` ให้ตรวจสอบเงื่อนไขที่แน่นอน