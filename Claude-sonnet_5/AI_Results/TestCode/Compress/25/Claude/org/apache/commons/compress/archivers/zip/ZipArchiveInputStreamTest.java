package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    // ---------- Helpers ----------

    private byte[] intToLE(long v) {
        return new byte[] {
            (byte) (v & 0xff),
            (byte) ((v >> 8) & 0xff),
            (byte) ((v >> 16) & 0xff),
            (byte) ((v >> 24) & 0xff)
        };
    }

    private byte[] shortToLE(int v) {
        return new byte[] {
            (byte) (v & 0xff),
            (byte) ((v >> 8) & 0xff)
        };
    }

    /**
     * สร้าง Local File Header (30 bytes) + filename แบบ manual
     * โดยไม่ใช้ data descriptor (gp flag = 0)
     */
    private byte[] buildLocalFileHeader(String name, int method, long crc,
                                         long compressedSize, long uncompressedSize) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(ZipArchiveOutputStream.LFH_SIG);
        out.write(shortToLE(20));      // version needed to extract
        out.write(shortToLE(0));       // general purpose bit flag: no DD, no UTF8
        out.write(shortToLE(method));  // compression method
        out.write(shortToLE(0));       // last mod time
        out.write(shortToLE(0x21));    // last mod date (arbitrary valid value)
        out.write(intToLE(crc));
        out.write(intToLE(compressedSize));
        out.write(intToLE(uncompressedSize));
        byte[] nameBytes = name.getBytes("UTF-8");
        out.write(shortToLE(nameBytes.length));
        out.write(shortToLE(0));       // extra field length
        out.write(nameBytes);
        return out.toByteArray();
    }

    private byte[] createStoredZipArchive(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(content.length);
        CRC32 crc = new CRC32();
        crc.update(content);
        entry.setCrc(crc.getValue());
        zos.putArchiveEntry(entry);
        zos.write(content);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();
        return baos.toByteArray();
    }

    // ---------- matches() ----------

    @Test
    public void testMatches_TooShort() {
        // length < LFH_SIG.length -> false, ไม่แตะ checksig เพื่อเลี่ยง OOB
        assertFalse(ZipArchiveInputStream.matches(new byte[] { 0x50 }, 1));
    }

    @Test
    public void testMatches_LFHSignature() {
        byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_EOCDSignature() {
        byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_DDSignature() {
        byte[] sig = ZipArchiveOutputStream.DD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_SplitMarker() {
        byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_NoMatch() {
        assertFalse(ZipArchiveInputStream.matches(new byte[] { 0, 0, 0, 0 }, 4));
    }

    // ---------- getNextZipEntry / getNextEntry: boundary & malformed ----------

    @Test
    public void testEmptyStreamReturnsNullEntry() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextEntryDelegatesToGetNextZipEntry() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextEntry());
        zis.close();
    }

    @Test
    public void testShortStreamLessThanHeaderReturnsNull() throws IOException {
        // น้อยกว่า LFH_LEN (30 bytes) -> readFully throws EOFException -> catch -> return null
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testUnrecognizedSignatureReturnsNull() throws IOException {
        // 30 bytes ศูนย์ทั้งหมด: ไม่ตรง LFH/CFH/AED/DD/SplitMarker sig ใด ๆ
        byte[] junk = new byte[30];
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(junk));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testSplitArchiveSignatureThrows() throws IOException {
        byte[] data = new byte[30];
        System.arraycopy(ZipArchiveOutputStream.DD_SIG, 0, data, 0, 4);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
    }

    @Test
    public void testSingleSegmentSplitMarkerIsSkipped() throws IOException {
        byte[] marker = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        byte[] header = new byte[30]; // ศูนย์ทั้งหมด -> หลัง reconstruct จะไม่ตรง LFH_SIG -> return null
        ByteArrayOutputStream archive = new ByteArrayOutputStream();
        archive.write(marker);
        archive.write(header);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive.toByteArray()));
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    // ---------- Real round-trip via ZipArchiveOutputStream ----------

    @Test
    public void testStoredEntryRoundTrip() throws IOException {
        byte[] content = "Hello World, this is stored content!".getBytes("UTF-8");
        byte[] archive = createStoredZipArchive("stored.txt", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        ZipArchiveEntry read = zis.getNextZipEntry();
        assertNotNull(read);
        assertEquals("stored.txt", read.getName());
        assertEquals(ZipEntry.STORED, read.getMethod());

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n;
        while ((n = zis.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, n);
        }
        assertArrayEquals(content, result.toByteArray());

        // ครั้งต่อไปจะเจอ Central Directory -> hitCentralDirectory=true -> return null
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testDeflatedEntryRoundTrip_andDataDescriptorPath() throws IOException {
        byte[] content = new byte[5000];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 251);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("deflated.bin");
        entry.setMethod(ZipEntry.DEFLATED);
        // ไม่ set size/crc ล่วงหน้า -> ให้ ZipArchiveOutputStream ใช้ data descriptor เอง (stream ไม่ seekable)
        zos.putArchiveEntry(entry);
        zos.write(content);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry read = zis.getNextZipEntry();
        assertNotNull(read);
        assertEquals(ZipEntry.DEFLATED, read.getMethod());

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n;
        while ((n = zis.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, n);
        }
        assertArrayEquals(content, result.toByteArray());

        // เรียกครั้งถัดไปเพื่อกระตุ้น closeEntry() -> readDataDescriptor() (hasDataDescriptor=true path)
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testMultipleEntriesAndClosedStreamAfterCentralDirectory() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        for (int i = 0; i < 2; i++) {
            ZipArchiveEntry e = new ZipArchiveEntry("file" + i + ".txt");
            e.setMethod(ZipEntry.STORED);
            byte[] c = ("data" + i).getBytes("UTF-8");
            e.setSize(c.length);
            CRC32 crc = new CRC32();
            crc.update(c);
            e.setCrc(crc.getValue());
            zos.putArchiveEntry(e);
            zos.write(c);
            zos.closeArchiveEntry();
        }
        zos.finish();
        zos.close();

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        int count = 0;
        while (zis.getNextZipEntry() != null) {
            count++;
            byte[] buf = new byte[16];
            while (zis.read(buf, 0, buf.length) != -1) {
                // drain
            }
        }
        assertEquals(2, count);
        assertNull(zis.getNextZipEntry()); // closed=false, hitCentralDirectory=true -> null ทันที
        zis.close();
    }

    // ---------- close() / read() boundary ----------

    @Test(expected = IOException.class)
    public void testReadAfterCloseThrows() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.read(new byte[1], 0, 1);
    }

    @Test
    public void testReadWithoutCurrentEntryReturnsMinusOne() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, zis.read(new byte[10], 0, 10));
        zis.close();
    }

    @Test
    public void testReadInvalidArgumentsThrowsArrayIndexOutOfBounds() throws IOException {
        byte[] content = "abc".getBytes("UTF-8");
        byte[] archive = createStoredZipArchive("f.txt", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        byte[] buf = new byte[5];

        try {
            zis.read(buf, 10, 1); // offset > buffer.length
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }

        try {
            zis.read(buf, 0, -1); // length < 0
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }

        try {
            zis.read(buf, -1, 1); // offset < 0
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }

        try {
            zis.read(buf, 3, 4); // buffer.length - offset (2) < length (4)
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }

        zis.close();
    }

    @Test
    public void testCloseIsIdempotent() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.close(); // ต้องไม่ throw ซ้ำ (guard ด้วย closed flag)
    }

    // ---------- skip() ----------

    @Test
    public void testSkipNegativeThrows() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            zis.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        zis.close();
    }

    @Test
    public void testSkipZeroReturnsZero() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zis.skip(0));
        zis.close();
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        byte[] content = "0123456789".getBytes("UTF-8");
        byte[] archive = createStoredZipArchive("s.txt", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        long skipped = zis.skip(5);
        assertEquals(5, skipped);

        byte[] buf = new byte[5];
        int n = zis.read(buf, 0, 5);
        assertEquals(5, n);
        assertArrayEquals("56789".getBytes("UTF-8"), buf);
        zis.close();
    }

    @Test
    public void testSkipBeyondAvailableReturnsPartial() throws IOException {
        byte[] content = "abcde".getBytes("UTF-8"); // 5 bytes
        byte[] archive = createStoredZipArchive("p.txt", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        long skipped = zis.skip(100); // ขอ skip เกินขนาด entry -> x==-1 branch
        assertEquals(5, skipped);
        zis.close();
    }

    @Test
    public void testSkipLargeAmountAcrossMultipleReads() throws IOException {
        byte[] content = new byte[2000];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 256);
        }
        byte[] archive = createStoredZipArchive("big.bin", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();
        // 1500 > SKIP_BUF.length(1024) -> ต้อง loop มากกว่า 1 รอบ ครอบทั้งสองแขนงของ ternary ใน skip()
        long skipped = zis.skip(1500);
        assertEquals(1500, skipped);

        byte[] buf = new byte[500];
        int n = zis.read(buf, 0, 500);
        assertEquals(500, n);
        byte[] expected = new byte[500];
        System.arraycopy(content, 1500, expected, 0, 500);
        assertArrayEquals(expected, buf);
        zis.close();
    }

    // ---------- readStored(): buffer refill & truncation ----------

    @Test
    public void testLargeStoredEntryMultipleBufferRefills() throws IOException {
        byte[] content = new byte[20000];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 97);
        }
        byte[] archive = createStoredZipArchive("large.bin", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        zis.getNextZipEntry();

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = zis.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, n);
        }
        assertArrayEquals(content, result.toByteArray());
        zis.close();
    }

    @Test
    public void testTruncatedStoredEntryReadReturnsMinusOne() throws IOException {
        // ประกาศ compressed/uncompressed size = 100 แต่ให้ข้อมูลจริงเพียง 10 bytes (ไฟล์ถูกตัดตอน)
        // ตรวจสอบ behavior ปัจจุบัน: readStored() คืน -1 เงียบ ๆ โดยไม่ throw
        // (นี่คือจุดที่อาจเป็น fault-prone area ของ Compress-25 ตาม pattern ของ defect นี้)
        byte[] header = buildLocalFileHeader("t.bin", ZipEntry.STORED, 0, 100, 100);
        byte[] partialBody = new byte[10];
        ByteArrayOutputStream archive = new ByteArrayOutputStream();
        archive.write(header);
        archive.write(partialBody);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive.toByteArray()));
        ZipArchiveEntry e = zis.getNextZipEntry();
        assertNotNull(e);

        byte[] buf = new byte[1024];
        int totalRead = 0;
        int n;
        while ((n = zis.read(buf, totalRead, buf.length - totalRead)) != -1) {
            totalRead += n;
        }
        assertEquals(10, totalRead);
        zis.close();
    }

    // ---------- canReadEntryData ----------

    @Test
    public void testCanReadEntryDataNonZipArchiveEntry() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ArchiveEntry fake = new TarArchiveEntry("test"); // ไม่ใช่ ZipArchiveEntry
        assertFalse(zis.canReadEntryData(fake));
        zis.close();
    }

    @Test
    public void testCanReadEntryDataForSupportedZipEntry() throws IOException {
        byte[] content = "abc".getBytes("UTF-8");
        byte[] archive = createStoredZipArchive("f.txt", content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive));
        ZipArchiveEntry read = zis.getNextZipEntry();
        assertTrue(zis.canReadEntryData(read));
        zis.close();
    }

    // ---------- Unsupported compression method ----------

    @Test
    public void testUnsupportedCompressionMethodThrowsOnRead() throws IOException {
        // method=99: ไม่ตรง STORED/DEFLATED/UNSHRINKING/IMPLODING
        // หมายเหตุ: ก่อนถึง branch else ใน read() มีการเรียก ZipUtil.checkRequestedFeatures(...)
        // ซึ่ง source ไม่ได้ให้มาในไฟล์นี้ - จึงยืนยันได้แค่ผลลัพธ์สุดท้ายคือ UnsupportedZipFeatureException
        byte[] content = "xx".getBytes("UTF-8");
        byte[] header = buildLocalFileHeader("u.bin", 99, 0, content.length, content.length);
        ByteArrayOutputStream archive = new ByteArrayOutputStream();
        archive.write(header);
        archive.write(content);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(archive.toByteArray()));
        ZipArchiveEntry e = zis.getNextZipEntry();
        assertNotNull(e);
        assertEquals(99, e.getMethod());

        try {
            zis.read(new byte[10], 0, 10);
            fail("Expected UnsupportedZipFeatureException");
        } catch (UnsupportedZipFeatureException expected) {
            // expected
        }
        zis.close();
    }

    // ---------- Constructors / encoding ----------

    @Test
    public void testEncodingConstructorsDoNotThrow() throws IOException {
        ZipArchiveInputStream z1 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        z1.close();

        ZipArchiveInputStream z2 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", false);
        z2.close();

        // encoding = null -> ใช้ platform default ตาม Javadoc ของ constructor
        ZipArchiveInputStream z3 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), null, true, true);
        z3.close();
    }
}
