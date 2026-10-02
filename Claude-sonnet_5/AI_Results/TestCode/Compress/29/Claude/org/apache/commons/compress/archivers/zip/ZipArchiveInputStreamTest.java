package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link ZipArchiveInputStream} (Defects4J Compress-29b).
 *
 * หมายเหตุทั่วไป (assumptions ที่ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง แต่เป็นค่ามาตรฐานของสเปก ZIP
 * หรือค่าคงที่ที่ระบุไว้ชัดเจนในคลาสเป้าหมาย):
 *  - LFH_LEN = 30, CFH_LEN = 46 (ระบุในซอร์สเป้าหมายแล้ว)
 *  - WORD = 4, SHORT = 2, DWORD = 8 (สอดคล้องกับผลรวมของฟิลด์ LFH_LEN=30 ที่ระบุในคอมเมนต์ซอร์ส)
 *  - LFH_SIG=0x04034b50, CFH_SIG=0x02014b50, EOCD_SIG=0x06054b50, DD_SIG=0x08074b50 (สเปก ZIP มาตรฐาน)
 *  - ZipFile.MIN_EOCD_SIZE ไม่ได้แสดงในซอร์สที่ให้มา จึงออกแบบ test ให้ทนทานต่อค่านี้
 *    (เติม zero-padding จำนวนมากพอ เพื่อไม่ให้ผลการทดสอบผันแปรตามค่าจริงของ constant นี้)
 *  - ZipUtil.canHandleEntryData(...) สมมติว่าคืนค่า true สำหรับ entry แบบ STORED ธรรมดา
 *    ที่ไม่มี encryption/feature พิเศษ (ไม่ได้แสดง implementation ในซอร์สที่ให้มา)
 */
public class ZipArchiveInputStreamTest {

    // ---- ZIP signature constants (มาตรฐานสเปก ZIP) ----
    private static final long LFH_SIG = 0x04034b50L;
    private static final long CFH_SIG = 0x02014b50L;
    private static final long EOCD_SIG = 0x06054b50L;
    private static final long DD_SIG = 0x08074b50L;

    // ================= Helper methods =================

    private static void writeShortLE(ByteArrayOutputStream out, int v) {
        out.write(v & 0xFF);
        out.write((v >>> 8) & 0xFF);
    }

    private static void writeIntLE(ByteArrayOutputStream out, long v) {
        out.write((int) (v & 0xFF));
        out.write((int) ((v >>> 8) & 0xFF));
        out.write((int) ((v >>> 16) & 0xFF));
        out.write((int) ((v >>> 24) & 0xFF));
    }

    private static byte[] intToLEBytes(long v) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeIntLE(out, v);
        return out.toByteArray();
    }

    private static byte[] concat(byte[]... arrays) {
        int total = 0;
        for (byte[] a : arrays) total += a.length;
        byte[] result = new byte[total];
        int pos = 0;
        for (byte[] a : arrays) {
            System.arraycopy(a, 0, result, pos, a.length);
            pos += a.length;
        }
        return result;
    }

    private static byte[] deflateRaw(byte[] input) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(input);
        deflater.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        while (!deflater.finished()) {
            int n = deflater.deflate(buf);
            bos.write(buf, 0, n);
        }
        deflater.end();
        return bos.toByteArray();
    }

    /** สร้าง Local File Header (30 bytes) + ชื่อไฟล์ + extra field ตามที่กำหนด */
    private static byte[] buildLocalFileHeader(String name, int method, int gpFlag,
            long crc, long csize, long usize, byte[] extra) throws IOException {
        byte[] nameBytes = name.getBytes("UTF-8");
        if (extra == null) extra = new byte[0];
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeIntLE(out, LFH_SIG);
        writeShortLE(out, 20);      // version needed
        writeShortLE(out, gpFlag);  // general purpose bit flag
        writeShortLE(out, method);  // compression method
        writeShortLE(out, 0);       // time
        writeShortLE(out, 0);       // date
        writeIntLE(out, crc);
        writeIntLE(out, csize);
        writeIntLE(out, usize);
        writeShortLE(out, nameBytes.length);
        writeShortLE(out, extra.length);
        out.write(nameBytes);
        out.write(extra);
        return out.toByteArray();
    }

    /** entry แบบ STORED ที่ไม่มี data descriptor (เป็น entry ปกติที่อ่านได้สมบูรณ์) */
    private static byte[] buildStoredEntryNoDD(String name, byte[] data) throws IOException {
        CRC32 crc = new CRC32();
        crc.update(data);
        byte[] header = buildLocalFileHeader(name, 0, 0, crc.getValue(), data.length, data.length, null);
        return concat(header, data);
    }

    /** entry แบบ DEFLATED ที่ไม่มี data descriptor */
    private static byte[] buildDeflatedEntryNoDD(String name, byte[] data) throws IOException {
        byte[] compressed = deflateRaw(data);
        CRC32 crc = new CRC32();
        crc.update(data);
        byte[] header = buildLocalFileHeader(name, 8, 0, crc.getValue(), compressed.length, data.length, null);
        return concat(header, compressed);
    }

    /** สร้าง data descriptor (มี signature) + 8 ไบต์สุดท้ายที่เลียนแบบ header ถัดไป
     *  เพื่อให้ readDataDescriptor() ตีความขนาดเป็นแบบ 4-byte (ไม่ใช่ ZIP64 8-byte) */
    private static byte[] buildDataDescriptorWithTerminator(long crc, long size, long terminatorSig) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeIntLE(out, DD_SIG);
        writeIntLE(out, crc);
        writeIntLE(out, size);   // compressed size
        writeIntLE(out, size);   // uncompressed size
        writeIntLE(out, terminatorSig); // เลียนแบบ signature ของ header ถัดไป
        writeIntLE(out, 0);      // ไบต์ที่เหลือของ header ถัดไป (ไม่ถูกใช้ในการทดสอบนี้)
        return out.toByteArray();
    }

    /** central file header แบบ placeholder ยาว totalLen ไบต์ (มีเฉพาะ signature ถูกต้อง ส่วนที่เหลือเป็น 0) */
    private static byte[] buildCfhPlaceholder(int totalLen) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeIntLE(out, CFH_SIG);
        for (int i = 4; i < totalLen; i++) out.write(0);
        return out.toByteArray();
    }

    private static ZipArchiveInputStream newStoredEntryStream() throws IOException {
        byte[] full = buildStoredEntryNoDD("f.txt", "HELLO".getBytes("UTF-8"));
        return new ZipArchiveInputStream(new ByteArrayInputStream(full));
    }

    private static byte[] readAll(ZipArchiveInputStream zis) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[16];
        int n;
        while ((n = zis.read(buffer, 0, buffer.length)) != -1) {
            bos.write(buffer, 0, n);
        }
        return bos.toByteArray();
    }

    // ================= Constructor tests =================

    @Test
    public void testConstructor_DefaultUTF8_DoesNotThrow() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testConstructor_CustomOptions_ReadsStoredEntry() throws Exception {
        // ใช้ constructor 4-arg: encoding=null (ให้ใช้ default), useUnicodeExtraFields=false,
        // allowStoredEntriesWithDataDescriptor=false -> ครอบคลุมสาขา !hasUTF8Flag && !useUnicodeExtraFields
        byte[] full = buildStoredEntryNoDD("plain.txt", "XY".getBytes("UTF-8"));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(
                new ByteArrayInputStream(full), null, false, false);
        ZipArchiveEntry e = zis.getNextZipEntry();
        assertNotNull(e);
        assertEquals("plain.txt", e.getName());
        assertArrayEquals("XY".getBytes("UTF-8"), readAll(zis));
        zis.close();
    }

    // ================= matches() =================

    @Test
    public void testMatches_TooShortLength_ReturnsFalse() {
        byte[] sig = intToLEBytes(LFH_SIG);
        assertFalse(ZipArchiveInputStream.matches(sig, 3)); // length < LFH_SIG.length -> false
    }

    @Test
    public void testMatches_LFHSignature_ReturnsTrue() {
        byte[] sig = intToLEBytes(LFH_SIG);
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_EOCDSignature_ReturnsTrue() {
        byte[] sig = intToLEBytes(EOCD_SIG);
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_InvalidSignature_ReturnsFalse() {
        byte[] sig = {0x11, 0x22, 0x33, 0x44};
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    // ================= getNextZipEntry() =================

    @Test
    public void testGetNextZipEntry_EmptyStream_ReturnsNull() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntry_InvalidSignature_ReturnsNull() throws Exception {
        byte[] garbage = new byte[30]; // ครบ LFH_LEN แต่ signature ไม่ตรงกับ LFH/CFH/AED/DD/split-marker
        garbage[0] = 0x11; garbage[1] = 0x22; garbage[2] = 0x33; garbage[3] = 0x44;
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(garbage));
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntry_StoredEntry_ReadsContentCorrectly() throws Exception {
        byte[] data = "Hello Zip".getBytes("UTF-8");
        byte[] full = buildStoredEntryNoDD("hello.txt", data);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(full));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("hello.txt", entry.getName());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertArrayEquals(data, readAll(zis));
        // เมื่อไม่มี entry ถัดไป ต้อง return null (EOFException ถูก catch ภายใน)
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_DeflatedEntry_ReadsContentCorrectly() throws Exception {
        byte[] data = "The quick brown fox jumps over the lazy dog".getBytes("UTF-8");
        byte[] full = buildDeflatedEntryNoDD("fox.txt", data);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(full));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        assertArrayEquals(data, readAll(zis));
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_MultipleEntries_SequentialRead() throws Exception {
        byte[] e1 = buildStoredEntryNoDD("a.txt", "AAA".getBytes("UTF-8"));
        byte[] e2 = buildDeflatedEntryNoDD("b.txt", "BBBBBB".getBytes("UTF-8"));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(concat(e1, e2)));

        ZipArchiveEntry entry1 = zis.getNextZipEntry();
        assertEquals("a.txt", entry1.getName());
        // ไม่อ่าน content ของ entry1 เพื่อทดสอบว่า closeEntry() (เรียกอัตโนมัติ) drain ข้อมูลที่เหลือให้

        ZipArchiveEntry entry2 = zis.getNextZipEntry();
        assertNotNull(entry2);
        assertEquals("b.txt", entry2.getName());
        assertArrayEquals("BBBBBB".getBytes("UTF-8"), readAll(zis));

        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_AfterClosedStream_ReturnsNull() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.close();
        assertNull(zis.getNextZipEntry()); // closed == true -> return null
    }

    @Test
    public void testGetNextZipEntry_HitsCentralDirectory_ReturnsNullGracefully() throws Exception {
        byte[] entry1 = buildStoredEntryNoDD("a.txt", new byte[] {1, 2, 3});
        byte[] cfh = buildCfhPlaceholder(46); // ตาม CFH_LEN ที่ระบุในซอร์ส
        byte[] eocdSig = intToLEBytes(EOCD_SIG);
        byte[] pad = new byte[100]; // padding เผื่อค่า MIN_EOCD_SIZE จริง (ดูหมายเหตุด้านบน)
        byte[] full = concat(entry1, cfh, eocdSig, pad);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(full));
        ZipArchiveEntry e1 = zis.getNextZipEntry();
        assertNotNull(e1);
        assertEquals("a.txt", e1.getName());

        assertNull(zis.getNextZipEntry()); // เจอ CFH -> hitCentralDirectory=true -> return null
        assertNull(zis.getNextZipEntry()); // เรียกซ้ำ ต้องได้ null ทันที (short-circuit ด้วย hitCentralDirectory)
    }

    @Test(expected = EOFException.class)
    public void testGetNextZipEntry_TruncatedCentralDirectory_ThrowsEOFException() throws Exception {
        byte[] entry1 = buildStoredEntryNoDD("a.txt", new byte[] {1, 2, 3});
        byte[] cfh = buildCfhPlaceholder(30); // มีแค่พอสำหรับอ่าน LFH_BUF แต่ไม่มีข้อมูลถัดไปเลย
        byte[] full = concat(entry1, cfh);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(full));
        zis.getNextZipEntry(); // อ่าน entry แรกสำเร็จ
        zis.getNextZipEntry(); // ควรพัง EOFException ระหว่าง skipRemainderOfArchive()
    }

    // ================= read() =================

    @Test
    public void testRead_WhenClosed_ThrowsIOException() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.close();
        try {
            zis.read(new byte[10], 0, 10);
            fail("expected IOException");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void testRead_WhenNoCurrentEntry_ReturnsMinusOne() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, zis.read(new byte[10], 0, 10));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_OffsetGreaterThanBufferLength_ThrowsAIOOBE() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.getNextZipEntry();
        zis.read(new byte[5], 6, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_NegativeLength_ThrowsAIOOBE() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.getNextZipEntry();
        zis.read(new byte[5], 0, -1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_NegativeOffset_ThrowsAIOOBE() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.getNextZipEntry();
        zis.read(new byte[5], -1, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_LengthExceedsRemainingBuffer_ThrowsAIOOBE() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.getNextZipEntry();
        zis.read(new byte[5], 2, 10); // buffer.length - offset(3) < length(10)
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testRead_StoredWithDataDescriptor_NotAllowed_ThrowsUnsupportedZipFeatureException() throws Exception {
        byte[] header = buildLocalFileHeader("s.txt", 0, 0x0008, 0, 0, 0, null);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(
                new ByteArrayInputStream(header), "UTF-8", true, false);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        zis.read(new byte[10], 0, 10);
    }

    @Test
    public void testRead_StoredWithDataDescriptor_Allowed_ReadsCorrectly() throws Exception {
        byte[] data = {0x41, 0x42}; // "AB"
        CRC32 crc = new CRC32();
        crc.update(data);
        byte[] header = buildLocalFileHeader("d.txt", 0, 0x0008, 0, 0, 0, null);
        byte[] ddTail = buildDataDescriptorWithTerminator(crc.getValue(), data.length, CFH_SIG);
        byte[] full = concat(header, data, ddTail);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(
                new ByteArrayInputStream(full), "UTF-8", true, true);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertTrue(entry.getGeneralPurposeBit().usesDataDescriptor());

        byte[] buffer = new byte[10];
        int n = zis.read(buffer, 0, buffer.length);
        assertEquals(2, n);
        assertArrayEquals(data, Arrays.copyOf(buffer, n));

        assertEquals(-1, zis.read(buffer, 0, buffer.length)); // cached entry หมดแล้ว
        assertEquals(2, entry.getSize());
        assertEquals(2, entry.getCompressedSize());
        zis.close();
    }

    // ================= canReadEntryData() =================

    @Test
    public void testCanReadEntryData_NonZipArchiveEntry_ReturnsFalse() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ArchiveEntry notZipEntry = null; // instanceof ZipArchiveEntry เป็น false เสมอสำหรับ null
        assertFalse(zis.canReadEntryData(notZipEntry));
    }

    @Test
    public void testCanReadEntryData_SupportedZipArchiveEntry_ReturnsTrue() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = new ZipArchiveEntry("x.txt");
        entry.setMethod(ZipEntry.STORED);
        assertTrue(zis.canReadEntryData(entry));
    }

    // ================= skip() =================

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_NegativeValue_ThrowsIllegalArgumentException() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.skip(-1);
    }

    @Test
    public void testSkip_ZeroValue_ReturnsZero() throws Exception {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zis.skip(0));
    }

    @Test
    public void testSkip_DuringEntryRead_SkipsBytesCorrectly() throws Exception {
        byte[] data = "0123456789".getBytes("UTF-8");
        byte[] full = buildStoredEntryNoDD("num.txt", data);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(full));
        zis.getNextZipEntry();
        long skipped = zis.skip(5);
        assertEquals(5, skipped);
        byte[] rest = readAll(zis);
        assertArrayEquals("56789".getBytes("UTF-8"), rest);
        zis.close();
    }

    // ================= close() =================

    @Test
    public void testClose_IdempotentClose() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        zis.close();
        zis.close(); // เรียกซ้ำต้องไม่มี exception (closed flag ป้องกันไว้)
    }

    // ================= getNextEntry() =================

    @Test
    public void testGetNextEntry_ReturnsSameAsGetNextZipEntry() throws Exception {
        ZipArchiveInputStream zis = newStoredEntryStream();
        ArchiveEntry entry = zis.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("f.txt", entry.getName());
        zis.close();
    }
}
