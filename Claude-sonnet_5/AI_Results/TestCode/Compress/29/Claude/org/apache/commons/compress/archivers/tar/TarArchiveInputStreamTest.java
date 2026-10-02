package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    // ==================================================================
    // Helper methods
    // ==================================================================

    /** สร้าง tar archive อย่างง่าย 1 entry ด้วย TarArchiveOutputStream (สมมติ API มาตรฐาน) */
    private byte[] buildSimpleTar(String name, byte[] content) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.close();
        return bos.toByteArray();
    }

    /** สร้าง signature byte[] สำหรับทดสอบ matches() โดยอ้างอิงค่าคงที่จริงจาก TarConstants */
    private byte[] buildSignature(String magic, int magicLen, String version, int versionLen,
                                   int magicOffset, int versionOffset) throws IOException {
        int len = versionOffset + versionLen;
        byte[] sig = new byte[len];
        byte[] magicBytes = magic.getBytes("US-ASCII");
        byte[] versionBytes = version.getBytes("US-ASCII");
        System.arraycopy(magicBytes, 0, sig, magicOffset, Math.min(magicBytes.length, magicLen));
        System.arraycopy(versionBytes, 0, sig, versionOffset, Math.min(versionBytes.length, versionLen));
        return sig;
    }

    private static String repeat(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) sb.append(s);
        return sb.toString();
    }

    // ==================================================================
    // Constructors
    // ==================================================================

    @Test
    public void testDefaultConstructor() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithEncoding() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSize() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 512);
        assertEquals(512, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithAllParams() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 512, "UTF-8");
        assertEquals(512, tis.getRecordSize());
    }

    // ==================================================================
    // getNextTarEntry() - EOF handling / malformed input
    // ==================================================================

    @Test
    public void testGetNextEntryOnEmptyStreamReturnsNull() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testGetNextEntryReturnsNullOnZeroFilledEOFRecord() throws IOException {
        // สอง record ที่เป็น zero ทั้งหมด -> EOF ตัวแรกพบ, tryToConsumeSecondEOFRecord พบ EOF ตัวที่สองด้วย
        byte[] data = new byte[TarConstants.DEFAULT_RCDSIZE * 2];
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
        // เรียกซ้ำ -> ต้อง short-circuit เพราะ hasHitEOF = true แล้ว
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextEntryTruncatedRecordReturnsNull() throws IOException {
        // ข้อมูลน้อยกว่า 1 record เต็ม -> readRecord() คืน null -> isEOFRecord(null) = true
        byte[] data = new byte[10];
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testTryToConsumeSecondEOFRecordResetsWhenSecondRecordIsData() throws IOException {
        // record แรกเป็น EOF (zero) แต่ record ถัดไปไม่ใช่ zero ทั้งหมด
        // -> shouldReset = true, marked = true (ByteArrayInputStream.markSupported()==true)
        // -> เข้า path เรียก is.reset()
        byte[] zeroRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] fakeDataRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        fakeDataRecord[0] = 1; // ไม่ใช่ zero ทั้งหมด
        byte[] combined = new byte[zeroRecord.length + fakeDataRecord.length];
        System.arraycopy(zeroRecord, 0, combined, 0, zeroRecord.length);
        System.arraycopy(fakeDataRecord, 0, combined, zeroRecord.length, fakeDataRecord.length);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(combined));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
        // ไม่ throw exception ถือว่าผ่าน best-effort สำหรับ branch shouldReset=true, marked=true
    }

    // ==================================================================
    // Round-trip กับ archive จริง (TarArchiveOutputStream)
    // ==================================================================

    @Test
    public void testReadSimpleEntryRoundTrip() throws IOException {
        byte[] content = "Hello World".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("test.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));

        TarArchiveEntry entry = tis.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(content.length, entry.getSize());

        byte[] buf = new byte[content.length];
        int totalRead = 0, r;
        while (totalRead < buf.length && (r = tis.read(buf, totalRead, buf.length - totalRead)) != -1) {
            totalRead += r;
        }
        assertEquals(content.length, totalRead);
        assertArrayEquals(content, buf);

        assertNull(tis.getNextTarEntry()); // ไม่มี entry เพิ่ม
        tis.close();
    }

    @Test
    public void testMultipleEntriesRoundTrip() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry e1 = new TarArchiveEntry("one.txt");
        e1.setSize(3);
        tos.putArchiveEntry(e1);
        tos.write("one".getBytes("UTF-8"));
        tos.closeArchiveEntry();

        TarArchiveEntry e2 = new TarArchiveEntry("two.txt");
        e2.setSize(3);
        tos.putArchiveEntry(e2);
        tos.write("two".getBytes("UTF-8"));
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry r1 = tis.getNextTarEntry();
        assertEquals("one.txt", r1.getName());
        // เรียกซ้ำโดยไม่อ่านข้อมูล entry แรกจนหมด -> ต้อง skip ส่วนที่เหลือ + padding (currEntry!=null branch)
        TarArchiveEntry r2 = tis.getNextTarEntry();
        assertEquals("two.txt", r2.getName());
        assertNull(tis.getNextTarEntry());
        tis.close();
    }

    @Test
    public void testGetNextEntryWithZeroSizeEntry_paddingBranchFalse() throws IOException {
        // entrySize == 0 -> skipRecordPadding(): if (entrySize>0 && ...) เป็น false
        byte[] tarBytes = buildSimpleTar("empty.txt", new byte[0]);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry entry = tis.getNextTarEntry();
        assertEquals(0, entry.getSize());
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGNULongNameEntryRoundTrip() throws IOException {
        // NOTE: พึ่งพา LONGFILE_GNU ของ TarArchiveOutputStream (ซอร์สไม่ได้แสดงในโจทย์
        // แต่เป็น public API มาตรฐานของ commons-compress) เพื่อ trigger
        // currEntry.isGNULongNameEntry() == true และ getLongNameData() แบบสำเร็จ (ไม่ null)
        String longName = repeat("x", 150) + ".txt";
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(3);
        tos.putArchiveEntry(entry);
        tos.write("abc".getBytes("UTF-8"));
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry read = tis.getNextTarEntry();
        assertNotNull(read);
        assertEquals(longName, read.getName());
        tis.close();
    }

    // ไม่ทดสอบกรณี GNU long-name/long-link ที่ "malformed (ไม่ตามด้วย entry จริง)"
    // เพราะต้องสร้าง raw header bytes ด้วยมือซึ่งต้องรู้ byte layout ภายในของ
    // TarArchiveEntry (ไม่มีซอร์สให้ในโจทย์) — ข้ามเพื่อไม่เดา behavior

    // ==================================================================
    // read() branches
    // ==================================================================

    @Test
    public void testReadReturnsMinusOneWhenHasHitEOF() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tis.setAtEOF(true);
        byte[] buf = new byte[10];
        assertEquals(-1, tis.read(buf, 0, 10));
    }

    @Test
    public void testReadReturnsMinusOneWhenEntryFullyConsumed() throws IOException {
        byte[] content = "abc".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("c.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        tis.getNextTarEntry();
        byte[] buf = new byte[3];
        assertEquals(3, tis.read(buf, 0, 3));
        assertEquals(-1, tis.read(buf, 0, 3)); // entryOffset >= entrySize
    }

    @Test
    public void testReadThrowsIllegalStateWhenNoCurrentEntry() throws IOException {
        byte[] content = "data".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("f.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry entry = tis.getNextTarEntry();
        assertNotNull(entry);
        tis.setCurrentEntry(null); // จำลอง currEntry == null แต่ entryOffset < entrySize
        byte[] buf = new byte[4];
        try {
            tis.read(buf, 0, 4);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testReadTruncatedArchiveThrowsIOException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("trunc.txt");
        entry.setSize(100);
        tos.putArchiveEntry(entry);
        tos.write(new byte[100]);
        tos.closeArchiveEntry();
        tos.close();
        byte[] tarBytes = bos.toByteArray();

        // ตัดข้อมูลให้เหลือ header + เนื้อหาบางส่วนเท่านั้น (ไม่ครบ 100 + padding)
        byte[] truncated = new byte[TarConstants.DEFAULT_RCDSIZE + 10];
        System.arraycopy(tarBytes, 0, truncated, 0, truncated.length);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        TarArchiveEntry read = tis.getNextTarEntry();
        assertNotNull(read);
        assertEquals(100, read.getSize());

        byte[] buf = new byte[100];
        try {
            int total = 0;
            int r;
            while (total < 100) {
                r = tis.read(buf, total, 100 - total);
                if (r == -1) break;
                total += r;
            }
            fail("Expected IOException for truncated archive");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Truncated"));
        }
    }

    @Test
    public void testReadWithZeroLengthRequest() throws IOException {
        // Boundary case: numToRead == 0 (ตาม java.io.InputStream contract คืน 0 เสมอ
        // จึงไม่สามารถ trigger branch "hasHitEOF = true" จาก totalRead==-1 กับ numToRead==0 ได้
        // ผ่าน public API แบบมาตรฐาน - เก็บไว้เป็น boundary test เท่านั้น)
        byte[] content = "abc".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("z.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        tis.getNextTarEntry();
        byte[] buf = new byte[0];
        int r = tis.read(buf, 0, 0);
        assertTrue(r == 0 || r == -1);
    }

    // ==================================================================
    // available()
    // ==================================================================

    @Test
    public void testAvailableNormal() throws IOException {
        byte[] content = "12345".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("a.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        tis.getNextTarEntry();
        assertEquals(5, tis.available());
        byte[] buf = new byte[2];
        tis.read(buf, 0, 2);
        assertEquals(3, tis.available());
    }

    @Test
    public void testAvailableReturnsIntMaxWhenRemainingExceedsIntMax() throws IOException {
        // NOTE: พึ่งพาว่า TarArchiveEntry/TarArchiveOutputStream เขียน/อ่านค่า size
        // ที่เกิน Integer.MAX_VALUE ได้อย่างถูกต้องด้วย octal encoding มาตรฐาน
        // (ซอร์สของ TarArchiveEntry ไม่ได้แสดงในโจทย์ ถือเป็นสมมติฐาน)
        long bigSize = (long) Integer.MAX_VALUE + 100L;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(bigSize);
        tos.putArchiveEntry(entry); // header ถูกเขียนลง bos แล้ว ณ จุดนี้

        byte[] headerOnly = bos.toByteArray();
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(headerOnly));
        TarArchiveEntry read = tis.getNextTarEntry();
        assertNotNull(read);
        assertEquals(Integer.MAX_VALUE, tis.available());
    }

    // ==================================================================
    // skip()
    // ==================================================================

    @Test
    public void testSkipNegativeReturnsZero() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, tis.skip(-5));
    }

    @Test
    public void testSkipZeroReturnsZero() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, tis.skip(0));
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        byte[] content = "abcdefghij".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("s.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        tis.getNextTarEntry();
        long skipped = tis.skip(4);
        assertEquals(4, skipped);
        assertEquals(6, tis.available());
    }

    @Test
    public void testSkipBeyondEntryLimitsToAvailable() throws IOException {
        byte[] content = "abc".getBytes("UTF-8");
        byte[] tarBytes = buildSimpleTar("s2.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        tis.getNextTarEntry();
        long skipped = tis.skip(1000);
        assertEquals(3, skipped); // ถูกจำกัดด้วย Math.min(n, available)
    }

    // ==================================================================
    // mark/reset/markSupported
    // ==================================================================

    @Test
    public void testMarkSupportedFalse() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tis.markSupported());
    }

    @Test
    public void testMarkDoesNothing() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tis.mark(100); // ไม่ throw, ไม่มีผลข้างเคียงสังเกตได้
    }

    @Test
    public void testResetDoesNothing() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tis.reset(); // ไม่ throw
    }

    // ==================================================================
    // close()
    // ==================================================================

    @Test
    public void testCloseClosesUnderlyingStream() throws IOException {
        final boolean[] closed = {false};
        InputStream in = new ByteArrayInputStream(new byte[0]) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        TarArchiveInputStream tis = new TarArchiveInputStream(in);
        tis.close();
        assertTrue(closed[0]);
    }

    // ==================================================================
    // canReadEntryData()
    // ==================================================================

    @Test
    public void testCanReadEntryDataForTarEntryReturnsTrue() {
        TarArchiveEntry entry = new TarArchiveEntry("foo.txt");
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tis.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataForNonTarEntryReturnsFalse() {
        // ใช้ ZipArchiveEntry เป็นตัวแทน ArchiveEntry ที่ไม่ใช่ TarArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("dummy.txt");
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tis.canReadEntryData(zipEntry));
    }

    // ==================================================================
    // getCurrentEntry / setCurrentEntry / isAtEOF / setAtEOF
    // ==================================================================

    @Test
    public void testGetCurrentEntryInitiallyNull() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getCurrentEntry());
    }

    @Test
    public void testSetAndGetCurrentEntry() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry e = new TarArchiveEntry("a");
        tis.setCurrentEntry(e);
        assertSame(e, tis.getCurrentEntry());
    }

    @Test
    public void testSetAndIsAtEOF() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tis.isAtEOF());
        tis.setAtEOF(true);
        assertTrue(tis.isAtEOF());
    }

    // ==================================================================
    // matches() - static
    // ==================================================================

    @Test
    public void testMatchesTooShortReturnsFalse() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET]; // สั้นกว่าที่ต้องการ
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesPosixReturnsTrue() throws IOException {
        byte[] sig = buildSignature(TarConstants.MAGIC_POSIX, TarConstants.MAGICLEN,
                TarConstants.VERSION_POSIX, TarConstants.VERSIONLEN,
                TarConstants.MAGIC_OFFSET, TarConstants.VERSION_OFFSET);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuSpaceReturnsTrue() throws IOException {
        byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.MAGICLEN,
                TarConstants.VERSION_GNU_SPACE, TarConstants.VERSIONLEN,
                TarConstants.MAGIC_OFFSET, TarConstants.VERSION_OFFSET);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuZeroReturnsTrue() throws IOException {
        byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.MAGICLEN,
                TarConstants.VERSION_GNU_ZERO, TarConstants.VERSIONLEN,
                TarConstants.MAGIC_OFFSET, TarConstants.VERSION_OFFSET);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesAntReturnsTrue() throws IOException {
        byte[] sig = buildSignature(TarConstants.MAGIC_ANT, TarConstants.MAGICLEN,
                TarConstants.VERSION_ANT, TarConstants.VERSIONLEN,
                TarConstants.MAGIC_OFFSET, TarConstants.VERSION_OFFSET);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesNoneReturnsFalse() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN]; // all-zero
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    // ==================================================================
    // parsePaxHeaders() - package-private, ทดสอบ logic โดยตรง
    // ==================================================================

    @Test
    public void testParsePaxHeadersSingleEntry() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // "6 a=b\n" : len=6, keyword="a", value="b" (อนุมานตามลอจิกในซอร์ส)
        InputStream in = new ByteArrayInputStream("6 a=b\n".getBytes("UTF-8"));
        Map<String, String> headers = tis.parsePaxHeaders(in);
        assertEquals("b", headers.get("a"));
        assertEquals(1, headers.size());
    }

    @Test
    public void testParsePaxHeadersEmptyStreamReturnsEmptyMap() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Map<String, String> headers = tis.parsePaxHeaders(in);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeadersMultipleEntries() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String data = "6 a=b\n" + "6 c=d\n";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        Map<String, String> headers = tis.parsePaxHeaders(in);
        assertEquals("b", headers.get("a"));
        assertEquals("d", headers.get("c"));
        assertEquals(2, headers.size());
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersMalformedThrowsIOException() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // len ประกาศว่า rest ต้องมี 5 bytes แต่มีจริงแค่ 2 bytes ก่อน EOF
        InputStream in = new ByteArrayInputStream("9 a=b\n".getBytes("UTF-8"));
        tis.parsePaxHeaders(in);
    }
}
