package org.apache.commons.compress.archivers.zip.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.junit.Test;

/**
 * Unit tests for {@link ZipArchiveInputStream} (Defects4J Compress-5b).
 *
 * หมายเหตุ: ไม่มีการอ้างอิงไฟล์ zip จริง - ทุกกรณีสร้าง byte[] ของ
 * Local/Central File Header ขึ้นมาเองตามสเปกของรูปแบบ ZIP เพื่อควบคุม
 * ทุก branch อย่างชัดเจน ค่าคงที่ signature (LFH/CFH/EOCD) อ้างอิงจาก
 * มาตรฐาน ZIP format ทั่วไป (PK\x03\x04, PK\x01\x02, PK\x05\x06)
 */
public class ZipArchiveInputStreamTest {

    // ------------------------------------------------------------------
    // Helper utilities to build minimal ZIP byte structures
    // ------------------------------------------------------------------

    private static final byte[] LFH_SIG_BYTES  = { 0x50, 0x4B, 0x03, 0x04 };
    private static final byte[] CFH_SIG_BYTES  = { 0x50, 0x4B, 0x01, 0x02 };
    private static final byte[] EOCD_SIG_BYTES = { 0x50, 0x4B, 0x05, 0x06 };

    private static byte[] leShort(int value) {
        return new byte[] { (byte) (value & 0xFF), (byte) ((value >> 8) & 0xFF) };
    }

    private static byte[] leWord(long value) {
        return new byte[] {
            (byte) (value & 0xFF),
            (byte) ((value >> 8) & 0xFF),
            (byte) ((value >> 16) & 0xFF),
            (byte) ((value >> 24) & 0xFF)
        };
    }

    private static byte[] concat(byte[]... parts) {
        int total = 0;
        for (byte[] p : parts) total += p.length;
        byte[] out = new byte[total];
        int pos = 0;
        for (byte[] p : parts) {
            System.arraycopy(p, 0, out, pos, p.length);
            pos += p.length;
        }
        return out;
    }

    /** 30-byte fixed part of a Local File Header. */
    private static byte[] buildLfh(int gpFlag, int method, long crc,
                                    long compSize, long uncompSize,
                                    int nameLen, int extraLen) {
        return concat(
            LFH_SIG_BYTES,
            leShort(20),           // version needed to extract (arbitrary)
            leShort(gpFlag),
            leShort(method),
            leShort(0),             // last mod time
            leShort(0x21),          // last mod date (arbitrary valid value)
            leWord(crc),
            leWord(compSize),
            leWord(uncompSize),
            leShort(nameLen),
            leShort(extraLen)
        );
    }

    private static byte[] deflate(byte[] data) {
        Deflater def = new Deflater(Deflater.DEFAULT_COMPRESSION, true); // raw deflate (nowrap)
        def.setInput(data);
        def.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        while (!def.finished()) {
            int n = def.deflate(buf);
            bos.write(buf, 0, n);
        }
        def.end();
        return bos.toByteArray();
    }

    private static byte[] buildStoredEntry(String name, byte[] data, boolean efs) {
        int gpFlag = efs ? 0x0800 : 0; // bit 11 = EFS(UTF-8) flag
        byte[] nameBytes = name.getBytes();
        byte[] lfh = buildLfh(gpFlag, 0 /* STORED */, 0, data.length, data.length,
                               nameBytes.length, 0);
        return concat(lfh, nameBytes, data);
    }

    private static byte[] buildDeflatedEntryWithDataDescriptor(String name, byte[] data) {
        int gpFlag = 0x0008; // bit 3 -> has data descriptor
        byte[] nameBytes = name.getBytes();
        byte[] compressed = deflate(data);
        byte[] lfh = buildLfh(gpFlag, 8 /* DEFLATED */, 0, 0, 0,
                               nameBytes.length, 0);
        // code unconditionally reads 4*WORD = 16 bytes as data descriptor
        byte[] dataDescriptor = concat(leWord(0), leWord(0), leWord(0), leWord(0));
        return concat(lfh, nameBytes, compressed, dataDescriptor);
    }

    private static byte[] readAll(ZipArchiveInputStream zin, int expectedLength) throws IOException {
        byte[] out = new byte[expectedLength];
        int total = 0;
        while (total < expectedLength) {
            int r = zin.read(out, total, expectedLength - total);
            if (r == -1) break;
            total += r;
        }
        assertEquals(expectedLength, total);
        return out;
    }

    // ------------------------------------------------------------------
    // getNextZipEntry()
    // ------------------------------------------------------------------

    @Test
    public void testGetNextZipEntry_StoredWithEfsFlag() throws IOException {
        byte[] data = "Hello World!".getBytes();
        byte[] zipBytes = buildStoredEntry("test.txt", data, true);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zin.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(0, entry.getMethod());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_StoredWithoutEfsFlag() throws IOException {
        byte[] data = "abc".getBytes();
        byte[] zipBytes = buildStoredEntry("plain.txt", data, false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zin.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("plain.txt", entry.getName());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_DeflatedWithDataDescriptor() throws IOException {
        byte[] data = "The quick brown fox jumps over the lazy dog".getBytes();
        byte[] zipBytes = buildDeflatedEntryWithDataDescriptor("fox.txt", data);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zin.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(8, entry.getMethod());
        byte[] out = readAll(zin, data.length);
        assertArrayEquals(data, out);
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_ClosedStreamReturnsNull() throws IOException {
        byte[] zipBytes = buildStoredEntry("a.txt", "x".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.close();
        assertNull(zin.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntry_EofReturnsNull() throws IOException {
        byte[] tooShort = new byte[10]; // < 30 bytes -> readFully -> EOFException -> null
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(tooShort));
        assertNull(zin.getNextZipEntry());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_CentralDirectorySignatureReturnsNullAndStops() throws IOException {
        byte[] cfh = new byte[30];
        System.arraycopy(CFH_SIG_BYTES, 0, cfh, 0, 4);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(cfh));
        assertNull(zin.getNextZipEntry());
        assertNull(zin.getNextZipEntry()); // hitCentralDirectory short-circuit
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_UnknownSignatureReturnsNull() throws IOException {
        byte[] junk = new byte[30]; // doesn't match LFH nor CFH
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(junk));
        assertNull(zin.getNextZipEntry());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_SecondCallTriggersCloseEntryOnPreviousCurrent() throws IOException {
        byte[] e1 = buildStoredEntry("first.txt", "12345".getBytes(), false);
        byte[] e2 = buildStoredEntry("second.txt", "67890".getBytes(), false);
        byte[] all = concat(e1, e2);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(all));
        ZipArchiveEntry first = zin.getNextZipEntry();
        assertNotNull(first);
        assertEquals("first.txt", first.getName());
        // ยังไม่อ่าน payload ของ entry แรก -> เรียกครั้งถัดไปต้อง closeEntry() เอง
        ZipArchiveEntry second = zin.getNextZipEntry();
        assertNotNull(second);
        assertEquals("second.txt", second.getName());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_DataDescriptorConsumedWhenClosingEntry() throws IOException {
        byte[] data = "abcdef".getBytes();
        byte[] deflatedEntry = buildDeflatedEntryWithDataDescriptor("d1.txt", data);
        byte[] secondEntry = buildStoredEntry("d2.txt", "next".getBytes(), false);
        byte[] all = concat(deflatedEntry, secondEntry);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(all));
        ZipArchiveEntry e1 = zin.getNextZipEntry();
        assertEquals("d1.txt", e1.getName());
        ZipArchiveEntry e2 = zin.getNextZipEntry();
        assertNotNull(e2);
        assertEquals("d2.txt", e2.getName());
        zin.close();
    }

    @Test
    public void testGetNextZipEntry_NoUnicodeExtraFieldsFlagDisabled() throws IOException {
        byte[] data = "z".getBytes();
        byte[] zipBytes = buildStoredEntry("noextra.txt", data, false);
        ZipArchiveInputStream zin =
            new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes), "UTF-8", false);
        ZipArchiveEntry entry = zin.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("noextra.txt", entry.getName());
        zin.close();
    }

    // ------------------------------------------------------------------
    // getNextEntry()
    // ------------------------------------------------------------------

    @Test
    public void testGetNextEntry_DelegatesToGetNextZipEntry() throws IOException {
        byte[] zipBytes = buildStoredEntry("d.txt", "d".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        Object entry = zin.getNextEntry();
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("d.txt", ((ZipArchiveEntry) entry).getName());
        zin.close();
    }

    // ------------------------------------------------------------------
    // read()
    // ------------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testRead_OnClosedStreamThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("x.txt", "x".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.close();
        zin.read(new byte[10], 0, 10);
    }

    @Test
    public void testRead_NoCurrentEntryReturnsMinusOne() throws IOException {
        byte[] zipBytes = buildStoredEntry("x.txt", "x".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        int r = zin.read(new byte[10], 0, 10); // current == null
        assertEquals(-1, r);
        zin.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_InvalidBoundsThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("x.txt", "hello".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        byte[] buffer = new byte[5];
        zin.read(buffer, 3, 5); // buffer.length - start < length
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_NegativeLengthThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("n.txt", "abc".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        zin.read(new byte[10], 0, -1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_NegativeStartThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("n.txt", "abc".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        zin.read(new byte[10], -1, 2);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_StartGreaterThanBufferLengthThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("n.txt", "abc".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        zin.read(new byte[10], 11, 1);
    }

    @Test
    public void testRead_StoredEntryFullReadAndExhaustion() throws IOException {
        byte[] data = "0123456789".getBytes();
        byte[] zipBytes = buildStoredEntry("num.txt", data, false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        byte[] out = readAll(zin, data.length);
        assertArrayEquals(data, out);
        assertEquals(-1, zin.read(new byte[4], 0, 4)); // readBytesOfEntry >= csize
        zin.close();
    }

    @Test
    public void testRead_DeflatedEntryFullRead() throws IOException {
        byte[] data = "some deflate content that is long enough to compress".getBytes();
        byte[] zipBytes = buildDeflatedEntryWithDataDescriptor("f.txt", data);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        byte[] out = readAll(zin, data.length);
        assertArrayEquals(data, out);
        zin.close();
        // หมายเหตุ: ไม่ยืนยัน exact timing ของ inf.finished() หลัง read สุดท้าย
        // เพราะ Inflater อาจต้องมี call เพิ่มเพื่อ detect BFINAL - ไม่ hard-code
    }

    @Test(expected = ZipException.class)
    public void testRead_MalformedDeflateDataCausesZipException() throws IOException {
        byte[] garbage = new byte[] { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        String name = "bad.bin";
        byte[] nameBytes = name.getBytes();
        int gpFlag = 0x0008;
        byte[] lfh = buildLfh(gpFlag, 8, 0, 0, 0, nameBytes.length, 0);
        byte[] dataDescriptor = concat(leWord(0), leWord(0), leWord(0), leWord(0));
        byte[] zipBytes = concat(lfh, nameBytes, garbage, dataDescriptor);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        zin.read(new byte[16], 0, 16);
    }

    // ------------------------------------------------------------------
    // close()
    // ------------------------------------------------------------------

    @Test
    public void testClose_IsIdempotent() throws IOException {
        byte[] zipBytes = buildStoredEntry("c.txt", "c".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.close();
        zin.close(); // เรียกซ้ำต้องไม่มี exception
    }

    // ------------------------------------------------------------------
    // skip()
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_NegativeValueThrows() throws IOException {
        byte[] zipBytes = buildStoredEntry("s.txt", "s".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.skip(-1);
    }

    @Test
    public void testSkip_ZeroReturnsZero() throws IOException {
        byte[] zipBytes = buildStoredEntry("s.txt", "hello".getBytes(), false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        assertEquals(0, zin.skip(0));
        zin.close();
    }

    @Test
    public void testSkip_PartialWithinEntry() throws IOException {
        byte[] data = "abcdefghij".getBytes();
        byte[] zipBytes = buildStoredEntry("s.txt", data, false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        long skipped = zin.skip(4);
        assertEquals(4, skipped);
        byte[] rest = readAll(zin, data.length - 4);
        assertArrayEquals("efghij".getBytes(), rest);
        zin.close();
    }

    @Test
    public void testSkip_BeyondAvailableReturnsActualSkipped() throws IOException {
        byte[] data = "abc".getBytes();
        byte[] zipBytes = buildStoredEntry("s.txt", data, false);
        ZipArchiveInputStream zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zin.getNextZipEntry();
        long skipped = zin.skip(100);
        assertEquals(data.length, skipped); // x == -1 branch
        zin.close();
    }

    // ------------------------------------------------------------------
    // matches() / checksig()
    // ------------------------------------------------------------------

    @Test
    public void testMatches_TooShortReturnsFalse() {
        assertFalse(ZipArchiveInputStream.matches(LFH_SIG_BYTES, 2));
    }

    @Test
    public void testMatches_LocalFileHeaderSignatureReturnsTrue() {
        byte[] sig = { 0x50, 0x4B, 0x03, 0x04, 0, 0, 0, 0 };
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_EndOfCentralDirectorySignatureReturnsTrue() {
        byte[] sig = { 0x50, 0x4B, 0x05, 0x06, 0, 0, 0, 0 };
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_NonMatchingSignatureReturnsFalse() {
        byte[] sig = { 0x00, 0x00, 0x00, 0x00, 0, 0, 0, 0 };
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }
}
