package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    // ---------------------------------------------------------------
    // Helper utilities
    // ---------------------------------------------------------------

    private byte[] readAll(TarArchiveInputStream tis) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[64];
        int n;
        while ((n = tis.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, n);
        }
        return out.toByteArray();
    }

    private void addEntry(TarArchiveOutputStream taos, String name, int size) throws IOException {
        TarArchiveEntry e = new TarArchiveEntry(name);
        e.setSize(size);
        taos.putArchiveEntry(e);
        taos.write(new byte[size]);
        taos.closeArchiveEntry();
    }

    private byte[] buildSignature(String magic, String version) {
        int len = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN;
        byte[] sig = new byte[len];
        byte[] m = magic.getBytes();
        System.arraycopy(m, 0, sig, TarConstants.MAGIC_OFFSET,
                Math.min(m.length, TarConstants.MAGICLEN));
        byte[] v = version.getBytes();
        System.arraycopy(v, 0, sig, TarConstants.VERSION_OFFSET,
                Math.min(v.length, TarConstants.VERSIONLEN));
        return sig;
    }

    /** InputStream ที่ปิด (close) แล้วจดจำสถานะไว้ ใช้ทดสอบ close() delegation */
    private static class CountingCloseInputStream extends InputStream {
        boolean closed = false;
        private final InputStream delegate;
        CountingCloseInputStream(InputStream d) { delegate = d; }
        @Override public int read() throws IOException { return delegate.read(); }
        @Override public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }
        @Override public void close() throws IOException { closed = true; delegate.close(); }
    }

    /** InputStream ที่ไม่รองรับ mark/reset เพื่อทดสอบ branch marked=false */
    private static class NoMarkInputStream extends InputStream {
        private final InputStream delegate;
        NoMarkInputStream(InputStream d) { delegate = d; }
        @Override public int read() throws IOException { return delegate.read(); }
        @Override public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }
        @Override public boolean markSupported() { return false; }
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_RecordSize() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
        assertNull(tis.encoding); // ไม่ระบุ encoding -> null
    }

    @Test
    public void testConstructorWithEncoding() {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
        assertEquals("UTF-8", tis.encoding);
    }

    @Test
    public void testConstructorWithBlockSize() {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), 1024, "UTF-8");
        assertEquals("UTF-8", tis.encoding);
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), 2048, 256);
        assertEquals(256, tis.getRecordSize());
    }

    @Test
    public void testConstructorFullWithEncoding() {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), 2048, 256, "ASCII");
        assertEquals(256, tis.getRecordSize());
        assertEquals("ASCII", tis.encoding);
    }

    @Test
    public void testConstructor_NullInputStream_DoesNotThrowImmediately() {
        // source ไม่มีการ null-check ใน constructor จึงคาดว่าไม่ throw ทันที
        TarArchiveInputStream tis = new TarArchiveInputStream(null);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    // ---------------------------------------------------------------
    // mark / reset / markSupported / close
    // ---------------------------------------------------------------

    @Test
    public void testMarkSupportedIsFalse() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tis.markSupported());
    }

    @Test
    public void testMarkDoesNothing() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tis.mark(100); // ไม่ควร throw
    }

    @Test
    public void testResetDoesNothing() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tis.reset(); // ไม่ควร throw
    }

    @Test
    public void testClose_DelegatesToUnderlyingStream() throws IOException {
        CountingCloseInputStream cs = new CountingCloseInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveInputStream tis = new TarArchiveInputStream(cs);
        tis.close();
        assertTrue(cs.closed);
    }

    // ---------------------------------------------------------------
    // isEOFRecord / readRecord (protected, same-package access)
    // ---------------------------------------------------------------

    @Test
    public void testIsEOFRecord_NullIsTrue() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tis.isEOFRecord(null));
    }

    @Test
    public void testIsEOFRecord_ZeroArrayIsTrue() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] zero = new byte[tis.getRecordSize()];
        assertTrue(tis.isEOFRecord(zero));
    }

    @Test
    public void testIsEOFRecord_NonZeroArrayIsFalse() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] nz = new byte[tis.getRecordSize()];
        nz[0] = 1;
        assertFalse(tis.isEOFRecord(nz));
    }

    @Test
    public void testReadRecord_ShortStreamReturnsNull() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        assertNull(tis.readRecord());
    }

    @Test
    public void testReadRecord_FullRecordReturned() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] full = new byte[tis.getRecordSize()];
        full[0] = 9;
        TarArchiveInputStream tis2 = new TarArchiveInputStream(new ByteArrayInputStream(full));
        byte[] rec = tis2.readRecord();
        assertArrayEquals(full, rec);
    }

    // ---------------------------------------------------------------
    // getNextTarEntry(): EOF / malformed cases
    // ---------------------------------------------------------------

    @Test
    public void testGetNextTarEntry_EmptyStream_ReturnsNull() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testGetNextTarEntry_SingleEOFRecord_ReturnsNull() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[512])); // 1 zero record
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testGetNextTarEntry_DoubleZeroRecord_MarkSupported_NoException() throws IOException {
        byte[] data = new byte[1024]; // 2 zero records
        // ByteArrayInputStream รองรับ mark/reset โดย default
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_ZeroThenGarbage_MarkSupported_NoException() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 512; i < 1024; i++) data[i] = 1; // second record ไม่ใช่ zero record
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(data));
        // ทดสอบ branch shouldReset=true, marked=true (pushback+reset) ไม่ throw
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_ZeroThenGarbage_NoMarkSupport_NoException() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 512; i < 1024; i++) data[i] = 1;
        InputStream noMark = new NoMarkInputStream(new ByteArrayInputStream(data));
        TarArchiveInputStream tis = new TarArchiveInputStream(noMark);
        // marked=false -> ไม่เรียก is.reset() แม้ shouldReset=true
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetLongNameData_NoFollowingEntry_ReturnsNull() throws IOException {
        // entrySize/entryOffset เริ่มต้นเป็น 0 -> read() คืน -1 ทันที (ไม่ยุ่งกับ header parsing)
        // จากนั้น getNextEntry() ภายในจะพบ EOF ของ underlying stream -> currEntry=null -> คืน null
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getLongNameData());
    }

    // ---------------------------------------------------------------
    // getNextTarEntry(): happy paths (ใช้ TarArchiveOutputStream สร้างไฟล์จริง)
    // ---------------------------------------------------------------

    @Test
    public void testGetNextTarEntry_SingleEntryRoundTrip() throws IOException {
        byte[] content = "Hello, TAR!".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry read = tis.getNextTarEntry();
        assertNotNull(read);
        assertEquals("file.txt", read.getName());
        assertEquals(content.length, read.getSize());
        assertArrayEquals(content, readAll(tis));

        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testGetNextTarEntry_MultipleEntries_SkipPaddingBranches() throws IOException {
        // ครอบคลุม skipRecordPadding(): size%recordSize!=0 (10), ==0 & >0 (512), และ size==0
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        addEntry(taos, "e1", 10);
        addEntry(taos, "e2", 512);
        addEntry(taos, "e3", 0);
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        TarArchiveEntry r1 = tis.getNextTarEntry(); // ไม่อ่าน content -> ทดสอบ skip ภายใน
        assertEquals("e1", r1.getName());
        assertEquals(10, r1.getSize());

        TarArchiveEntry r2 = tis.getNextTarEntry();
        assertEquals("e2", r2.getName());
        assertEquals(512, r2.getSize());

        TarArchiveEntry r3 = tis.getNextTarEntry();
        assertEquals("e3", r3.getName());
        assertEquals(0, r3.getSize());

        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_LongGNUFileName() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) sb.append('a');
        String longName = sb.toString();
        byte[] content = "data".getBytes();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry read = tis.getNextTarEntry();
        assertNotNull(read);
        assertEquals(longName, read.getName()); // isGNULongNameEntry() branch ถูกประมวลผลถูกต้อง
        assertArrayEquals(content, readAll(tis));
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testAfterArchiveEnd_getNextTarEntry_ReturnsNullRepeatedly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        addEntry(taos, "only.txt", 0);
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        assertNotNull(tis.getNextTarEntry());
        assertNull(tis.getNextTarEntry());       // ตรวจ EOF จริง
        assertNull(tis.getNextTarEntry());       // hasHitEOF==true -> short-circuit ทันที
    }

    // ---------------------------------------------------------------
    // read()
    // ---------------------------------------------------------------

    @Test
    public void testRead_AfterHasHitEOF_ReturnsMinusOne() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]));
        assertNull(tis.getNextTarEntry());
        assertTrue(tis.isAtEOF());
        byte[] buf = new byte[10];
        assertEquals(-1, tis.read(buf, 0, buf.length)); // branch: hasHitEOF==true
    }

    // NOTE: การ throw IllegalStateException("No current tar entry") ใน read()
    // จากการวิเคราะห์ source พบว่า currEntry จะเป็น null ก็ต่อเมื่อ hasHitEOF ก็ true
    // ไปด้วยเสมอ (ทุก path ที่ set currEntry=null จะผ่าน getRecord()/isEOFRecord()
    // ที่ set hasHitEOF=true ควบคู่กัน) ดังนั้น branch entryOffset<entrySize && currEntry==null
    // ดูเหมือนจะ unreachable ผ่าน public API ที่ให้มา จึงไม่เขียนเทสสำหรับ branch นี้
    // เพื่อไม่ "เดา" สถานะที่ไม่เกิดขึ้นจริง

    // ---------------------------------------------------------------
    // available()
    // ---------------------------------------------------------------

    @Test
    public void testAvailable_NormalCase() throws IOException {
        byte[] content = new byte[10];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        addEntry(taos, "a", content.length);
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tis.getNextTarEntry();
        assertEquals(10, tis.available());
        byte[] buf = new byte[4];
        tis.read(buf, 0, 4);
        assertEquals(6, tis.available());
    }

    @Test
    public void testAvailable_BoundaryExceedsIntMax_UsingReflection() throws Exception {
        // ใช้ reflection ตั้งค่า field private เพื่อทดสอบ branch (entrySize-entryOffset)>Integer.MAX_VALUE
        // โดยไม่ต้องสร้างข้อมูลจริงขนาด > 2GB
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
        entrySizeField.setAccessible(true);
        entrySizeField.setLong(tis, (long) Integer.MAX_VALUE + 100L);
        Field entryOffsetField = TarArchiveInputStream.class.getDeclaredField("entryOffset");
        entryOffsetField.setAccessible(true);
        entryOffsetField.setLong(tis, 0L);

        assertEquals(Integer.MAX_VALUE, tis.available());
    }

    // ---------------------------------------------------------------
    // skip()
    // ---------------------------------------------------------------

    @Test
    public void testSkip_NonPositiveReturnsZero() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, tis.skip(0));
        assertEquals(0, tis.skip(-10));
    }

    @Test
    public void testSkip_NormalSkipWithinEntry() throws IOException {
        byte[] content = "0123456789".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry e = new TarArchiveEntry("s.txt");
        e.setSize(content.length);
        taos.putArchiveEntry(e);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tis.getNextTarEntry();
        assertEquals(3, tis.skip(3));
        byte[] rest = readAll(tis);
        assertArrayEquals("3456789".getBytes(), rest);
    }

    @Test
    public void testSkip_ClampedToAvailable() throws IOException {
        byte[] content = "0123456789".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry e = new TarArchiveEntry("s2.txt");
        e.setSize(content.length);
        taos.putArchiveEntry(e);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tis.getNextTarEntry();
        assertEquals(10, tis.skip(1000)); // clamp เป็น available == 10
        byte[] buf = new byte[5];
        assertEquals(-1, tis.read(buf, 0, 5)); // entryOffset>=entrySize
    }

    // ---------------------------------------------------------------
    // getCurrentEntry()
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentEntry_BeforeAndAfter() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]));
        assertNull(tis.getCurrentEntry());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        addEntry(taos, "cur.txt", 0);
        taos.finish();
        taos.close();

        TarArchiveInputStream tis2 = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry e = tis2.getNextTarEntry();
        assertSame(e, tis2.getCurrentEntry());
    }

    // ---------------------------------------------------------------
    // canReadEntryData()
    // ---------------------------------------------------------------

    @Test
    public void testCanReadEntryData_TarEntryNonSparse_True() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        addEntry(taos, "d.txt", 0);
        taos.finish();
        taos.close();

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry e = tis.getNextTarEntry();
        assertTrue(tis.canReadEntryData(e));
    }

    @Test
    public void testCanReadEntryData_NonTarArchiveEntry_False() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry zae = new ZipArchiveEntry("x"); // ArchiveEntry แต่ไม่ใช่ TarArchiveEntry
        assertFalse(tis.canReadEntryData(zae));
    }

    // NOTE: canReadEntryData() สำหรับ GNU sparse entry (isGNUSparse()==true) ไม่ได้เขียนเทส
    // เนื่องจากไม่มีซอร์สของ TarArchiveEntry ให้ทราบวิธีสร้าง sparse entry ที่ปลอดภัย/ถูกต้อง

    // ---------------------------------------------------------------
    // matches() static method
    // ---------------------------------------------------------------

    @Test
    public void testMatches_TooShortLength_False() {
        byte[] sig = buildSignature(TarConstants.MAGIC_POSIX, TarConstants.VERSION_POSIX);
        int minLen = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN;
        assertFalse(TarArchiveInputStream.matches(sig, minLen - 1)); // boundary: length น้อยกว่าที่ต้องการ 1
    }

    @Test
    public void testMatches_ExactBoundaryLength_Posix_True() {
        byte[] sig = buildSignature(TarConstants.MAGIC_POSIX, TarConstants.VERSION_POSIX);
        int minLen = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN;
        assertTrue(TarArchiveInputStream.matches(sig, minLen)); // boundary: length พอดี
    }

    @Test
    public void testMatches_GnuSpace_True() {
        byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.VERSION_GNU_SPACE);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_GnuZero_True() {
        byte[] sig = buildSignature(TarConstants.MAGIC_GNU, TarConstants.VERSION_GNU_ZERO);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_Ant_True() {
        byte[] sig = buildSignature(TarConstants.MAGIC_ANT, TarConstants.VERSION_ANT);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_NoMatch_False() {
        int len = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN;
        byte[] sig = new byte[len]; // all-zero, ไม่ match magic ใด ๆ
        assertFalse(TarArchiveInputStream.matches(sig, len));
    }

    // ---------------------------------------------------------------
    // parsePaxHeaders() (package-private, เข้าถึงได้ตรงเพราะอยู่ package เดียวกัน)
    // ---------------------------------------------------------------

    @Test
    public void testParsePaxHeaders_EmptyInput_ReturnsEmptyMap() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tis.parsePaxHeaders(new ByteArrayInputStream(new byte[0]));
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeaders_SingleHeader() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // "12 path=foo\n" คำนวณความยาวตามสูตร PAX: len = digits+space+keyword+'='+value+'\n'
        byte[] data = "12 path=foo\n".getBytes("UTF-8");
        Map<String, String> headers = tis.parsePaxHeaders(new ByteArrayInputStream(data));
        assertEquals(1, headers.size());
        assertEquals("foo", headers.get("path"));
    }

    @Test
    public void testParsePaxHeaders_MultipleHeaders() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] data = ("12 path=foo\n" + "10 size=5\n").getBytes("UTF-8");
        Map<String, String> headers = tis.parsePaxHeaders(new ByteArrayInputStream(data));
        assertEquals(2, headers.size());
        assertEquals("foo", headers.get("path"));
        assertEquals("5", headers.get("size"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeaders_TruncatedValue_ThrowsIOException() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // "12 path=fo" -> restLen ที่คำนวณได้คือ 4 byte ("foo\n") แต่มีจริงแค่ 2 byte -> got!=restLen
        byte[] data = "12 path=fo".getBytes("UTF-8");
        tis.parsePaxHeaders(new ByteArrayInputStream(data));
    }

    // NOTE: applyPaxHeadersToCurrentEntry(), paxHeaders(), readGNUSparse() เป็น private methods
    // และการทดสอบ end-to-end ผ่าน getNextTarEntry() ต้องสร้าง raw header block ของ PAX/GNU-sparse
    // ซึ่งต้องอาศัยรายละเอียด parsing ภายในของ TarArchiveEntry ที่ไม่ได้แสดงในซอร์สที่ให้มา
    // จึงไม่เขียนเทสสำหรับ path เหล่านี้เพื่อไม่ "เดา" รูปแบบไบต์ที่ไม่ยืนยันได้
}
