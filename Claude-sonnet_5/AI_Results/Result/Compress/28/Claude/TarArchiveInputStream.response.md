# วิเคราะห์และแผนการทดสอบ

เนื่องจาก `TarArchiveInputStream` มีทั้ง private/protected/package-private members ที่มีผลต่อ branch coverage มาก (เช่น `parsePaxHeaders`, `isEOFRecord`, `readRecord`, `getLongNameData`, `setCurrentEntry`, `isAtEOF/setAtEOF`) ผมจึง**วางคลาสทดสอบไว้ใน package เดียวกัน** (`org.apache.commons.compress.archivers.tar`) เพื่อเข้าถึง method เหล่านี้ได้โดยตรง (white-box testing) และใช้ **reflection** เพื่อตั้งค่า private field (`entrySize`, `entryOffset`, `hasHitEOF`, `currEntry`) สำหรับทดสอบ branch ที่เข้าถึงได้ยากผ่าน public API เท่านั้น (เช่น boundary ของ `available()`, `IllegalStateException` ใน `read()`)

> ⚠️ หมายเหตุสมมติฐาน: ใช้ `TarArchiveOutputStream`/`TarArchiveEntry` (คลาสพี่น้องใน package เดียวกัน ที่ compile อยู่แล้วในโปรเจกต์) เพื่อสร้างข้อมูล tar ที่ valid สำหรับ integration test — ไม่ได้เดา behavior ของ `TarArchiveInputStream` เอง แต่ใช้เป็น test-data generator เท่านั้น จุดที่ใช้ `LONGFILE_GNU` ถูกคอมเมนต์กำกับไว้ว่าเป็นสมมติฐานเรื่อง API ที่มีในเวอร์ชันนี้

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

public class TarArchiveInputStreamTest {

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    /** Wrapper stream that remembers whether close() was called. */
    private static class FlagCloseInputStream extends InputStream {
        private final InputStream delegate;
        boolean closed = false;
        FlagCloseInputStream(InputStream delegate) { this.delegate = delegate; }
        @Override public int read() throws IOException { return delegate.read(); }
        @Override public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }
        @Override public void close() throws IOException {
            closed = true;
            delegate.close();
        }
    }

    private static void setField(TarArchiveInputStream t, String field, Object value) throws Exception {
        Field f = TarArchiveInputStream.class.getDeclaredField(field);
        f.setAccessible(true);
        f.set(t, value);
    }

    private static Object getField(TarArchiveInputStream t, String field) throws Exception {
        Field f = TarArchiveInputStream.class.getDeclaredField(field);
        f.setAccessible(true);
        return f.get(t);
    }

    /** Build a valid tar archive (as bytes) containing the given entries. */
    private static byte[] buildTar(String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        for (int i = 0; i < names.length; i++) {
            TarArchiveEntry e = new TarArchiveEntry(names[i]);
            e.setSize(contents[i].length);
            tos.putArchiveEntry(e);
            tos.write(contents[i]);
            tos.closeArchiveEntry();
        }
        tos.finish();
        tos.close();
        return bos.toByteArray();
    }

    /** Build a tar archive with a long (GNU longname) entry name. */
    private static byte[] buildTarWithLongName(String longName, byte[] content) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        // Assumption: LONGFILE_GNU mode available in this version of TarArchiveOutputStream
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry e = new TarArchiveEntry(longName);
        e.setSize(content.length);
        tos.putArchiveEntry(e);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        return bos.toByteArray();
    }

    // ------------------------------------------------------------------
    // Constructors / getRecordSize
    // ------------------------------------------------------------------

    @Test
    public void testConstructor_defaultRecordSize() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructor_withEncoding() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockSize() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockSizeAndEncoding() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockAndRecordSize() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 256);
        assertEquals(256, t.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockRecordSizeAndEncoding() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 256, "UTF-8");
        assertEquals(256, t.getRecordSize());
    }

    // ------------------------------------------------------------------
    // close()
    // ------------------------------------------------------------------

    @Test
    public void testClose_delegatesToUnderlyingStream() throws IOException {
        FlagCloseInputStream in = new FlagCloseInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveInputStream t = new TarArchiveInputStream(in);
        t.close();
        assertTrue(in.closed);
    }

    // ------------------------------------------------------------------
    // available()
    // ------------------------------------------------------------------

    @Test
    public void testAvailable_normalBranch() throws Exception {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        setField(t, "entrySize", 100L);
        setField(t, "entryOffset", 40L);
        assertEquals(60, t.available());
    }

    @Test
    public void testAvailable_overIntegerMaxBranch() throws Exception {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        setField(t, "entrySize", (long) Integer.MAX_VALUE + 100L);
        setField(t, "entryOffset", 0L);
        assertEquals(Integer.MAX_VALUE, t.available());
    }

    // ------------------------------------------------------------------
    // skip()
    // ------------------------------------------------------------------

    @Test
    public void testSkip_zeroWhenNoEntry() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        long skipped = t.skip(100);
        assertEquals(0, skipped);
    }

    @Test
    public void testSkip_capsToAvailable() throws Exception {
        byte[] tarBytes = buildTar(new String[]{"a.txt"}, new byte[][]{"HELLO-WORLD".getBytes()});
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry e = t.getNextTarEntry();
        assertNotNull(e);
        long skipped = t.skip(Long.MAX_VALUE); // request far more than available
        assertEquals(11, skipped); // "HELLO-WORLD".length()
        assertEquals(0, t.available());
    }

    // ------------------------------------------------------------------
    // reset()
    // ------------------------------------------------------------------

    @Test
    public void testReset_doesNothing() throws Exception {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        setField(t, "entryOffset", 5L);
        t.reset();
        assertEquals(5L, getField(t, "entryOffset"));
    }

    // ------------------------------------------------------------------
    // getNextTarEntry() : EOF / empty stream
    // ------------------------------------------------------------------

    @Test
    public void testGetNextTarEntry_emptyStream_returnsNullTwice() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(t.getNextTarEntry());
        // second call short-circuits via hasHitEOF branch
        assertNull(t.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_zeroRecordThenEOF_noSecondEOFRecord() throws Exception {
        // one zero-filled record (EOF marker), nothing else -> tryToConsumeSecondEOFRecord
        // reads null (isEOFRecord=true) -> shouldReset=false branch
        TarArchiveInputStream t = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[512]), 1024, 512);
        assertNull(t.getNextTarEntry());
        assertTrue((Boolean) getField(t, "hasHitEOF"));
    }

    @Test
    public void testGetNextTarEntry_zeroRecordFollowedByNonZero_resetBranch() throws Exception {
        // first record all zero (EOF marker), second record non-zero
        // -> tryToConsumeSecondEOFRecord shouldReset=true branch (mark/reset used)
        byte[] first = new byte[512];
        byte[] second = new byte[512];
        second[0] = 1; // make it non-zero so isEOFRecord(second) == false
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(first);
        bos.write(second);
        TarArchiveInputStream t = new TarArchiveInputStream(
                new ByteArrayInputStream(bos.toByteArray()), 1024, 512);
        assertNull(t.getNextTarEntry()); // headerBuf forced to null regardless of branch
    }

    // ------------------------------------------------------------------
    // getNextTarEntry() : multi-entry, skip() + skipRecordPadding() branches
    // ------------------------------------------------------------------

    @Test
    public void testGetNextTarEntry_multipleEntries_paddingBranches() throws IOException {
        byte[] tarBytes = buildTar(
                new String[]{"a.txt", "b.txt", "c.txt"},
                new byte[][]{
                        "0123456789".getBytes(),  // size=10 -> not multiple of 512 -> padding TRUE branch
                        new byte[0],               // size=0  -> skipRecordPadding FALSE branch
                        "hello".getBytes()
                });
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));

        TarArchiveEntry e1 = t.getNextTarEntry();
        assertNotNull(e1);
        assertEquals("a.txt", e1.getName());
        assertEquals(10, e1.getSize());

        // getNextTarEntry() called again: currEntry != null -> skip() + skipRecordPadding() (TRUE branch)
        TarArchiveEntry e2 = t.getNextTarEntry();
        assertNotNull(e2);
        assertEquals("b.txt", e2.getName());
        assertEquals(0, e2.getSize());

        // transition from empty entry: skipRecordPadding() FALSE branch (entrySize==0)
        TarArchiveEntry e3 = t.getNextTarEntry();
        assertNotNull(e3);
        assertEquals("c.txt", e3.getName());

        assertNull(t.getNextTarEntry()); // EOF after last entry
    }

    // ------------------------------------------------------------------
    // isEOFRecord() (protected, package-visible)
    // ------------------------------------------------------------------

    @Test
    public void testIsEOFRecord_nullRecord() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(t.isEOFRecord(null));
    }

    @Test
    public void testIsEOFRecord_allZero() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 16);
        assertTrue(t.isEOFRecord(new byte[16]));
    }

    @Test
    public void testIsEOFRecord_nonZero() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 16);
        byte[] r = new byte[16];
        r[5] = 9;
        assertFalse(t.isEOFRecord(r));
    }

    // ------------------------------------------------------------------
    // readRecord() (protected, package-visible)
    // ------------------------------------------------------------------

    @Test
    public void testReadRecord_fullRecord() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[16]), 1024, 16);
        byte[] rec = t.readRecord();
        assertNotNull(rec);
        assertEquals(16, rec.length);
    }

    @Test
    public void testReadRecord_incompleteRecord_returnsNull() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[5]), 1024, 16); // fewer bytes than recordSize
        assertNull(t.readRecord());
    }

    // ------------------------------------------------------------------
    // getLongNameData() (protected, package-visible) - direct isolated tests
    // ------------------------------------------------------------------

    @Test
    public void testGetLongNameData_malformed_noEntryAfter_returnsNull() throws Exception {
        byte[] payload = new byte[20]; // arbitrary "long name" payload, nothing follows it
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(payload), 1024, 512);
        setField(t, "entrySize", (long) payload.length);
        setField(t, "entryOffset", 0L);
        setField(t, "hasHitEOF", false);

        byte[] result = t.getLongNameData();
        assertNull(result); // Bugzilla 40334 path: currEntry stays null after getNextEntry()
    }

    @Test
    public void testGetLongNameData_trimsTrailingNulls() throws Exception {
        byte[] namePayload = new byte[]{'a', 'b', 'c', 0, 0, 0, 0, 0}; // "abc" + 5 trailing nulls
        byte[] nextHeader = Arrays.copyOfRange(
                buildTar(new String[]{"next.txt"}, new byte[][]{"x".getBytes()}), 0, 512);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(namePayload);
        bos.write(nextHeader);

        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()), 1024, 512);
        setField(t, "entrySize", (long) namePayload.length);
        setField(t, "entryOffset", 0L);
        setField(t, "hasHitEOF", false);

        byte[] result = t.getLongNameData();
        assertNotNull(result);
        assertEquals(3, result.length); // trailing nulls trimmed
        assertArrayEquals(new byte[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testGetLongNameData_noTrailingNulls_noTrimBranch() throws Exception {
        byte[] namePayload = new byte[]{'a', 'b', 'c', 'd'}; // no trailing null
        byte[] nextHeader = Arrays.copyOfRange(
                buildTar(new String[]{"next2.txt"}, new byte[][]{"y".getBytes()}), 0, 512);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(namePayload);
        bos.write(nextHeader);

        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()), 1024, 512);
        setField(t, "entrySize", (long) namePayload.length);
        setField(t, "entryOffset", 0L);
        setField(t, "hasHitEOF", false);

        byte[] result = t.getLongNameData();
        assertNotNull(result);
        assertArrayEquals(namePayload, result); // length unchanged -> no-copy branch
    }

    // ------------------------------------------------------------------
    // getNextTarEntry() : integration with GNU long name
    // ------------------------------------------------------------------

    @Test
    public void testGetNextTarEntry_gnuLongName() throws IOException {
        String longName = repeat("x", 150) + ".txt"; // > 100 chars triggers GNU longname
        byte[] tarBytes = buildTarWithLongName(longName, "content".getBytes());
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry e = t.getNextTarEntry();
        assertNotNull(e);
        assertEquals(longName, e.getName());
        assertEquals(7, e.getSize());
    }

    private static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(s);
        return sb.toString();
    }

    // ------------------------------------------------------------------
    // parsePaxHeaders() (package-visible) - direct isolated tests
    // ------------------------------------------------------------------

    @Test
    public void testParsePaxHeaders_emptyInput_returnsEmptyMap() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = t.parsePaxHeaders(new ByteArrayInputStream(new byte[0]));
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeaders_singleHeader() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String data = "12 path=foo\n"; // length prefix verified to equal total record length (12 chars)
        Map<String, String> headers = t.parsePaxHeaders(
                new ByteArrayInputStream(data.getBytes("UTF-8")));
        assertEquals(1, headers.size());
        assertEquals("foo", headers.get("path"));
    }

    @Test
    public void testParsePaxHeaders_multipleHeaders() throws IOException {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String data = "12 path=foo\n" + "8 uid=5\n";
        Map<String, String> headers = t.parsePaxHeaders(
                new ByteArrayInputStream(data.getBytes("UTF-8")));
        assertEquals(2, headers.size());
        assertEquals("foo", headers.get("path"));
        assertEquals("5", headers.get("uid"));
    }

    // ------------------------------------------------------------------
    // read(byte[], int, int)
    // ------------------------------------------------------------------

    @Test
    public void testRead_returnsMinusOne_whenEntryOffsetGteEntrySize() throws Exception {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        // default state: entrySize=0, entryOffset=0 -> entryOffset >= entrySize branch
        byte[] buf = new byte[5];
        assertEquals(-1, t.read(buf, 0, 5));
    }

    @Test
    public void testRead_throwsIllegalStateException_whenCurrEntryNull() throws Exception {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        setField(t, "entrySize", 10L);
        setField(t, "entryOffset", 0L);
        setField(t, "hasHitEOF", false);
        // currEntry stays null -> forces the else branch that throws
        try {
            t.read(new byte[5], 0, 5);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testRead_normalAndEOFBranches() throws IOException {
        byte[] tarBytes = buildTar(new String[]{"a.txt"}, new byte[][]{"0123456789".getBytes()});
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry e = t.getNextTarEntry();
        assertNotNull(e);

        byte[] buf = new byte[100];
        int n = t.read(buf, 0, 100); // numToRead capped to available()=10
        assertEquals(10, n);
        assertEquals("0123456789", new String(buf, 0, n));

        // entryOffset(10) >= entrySize(10) now -> immediate -1 branch
        assertEquals(-1, t.read(buf, 0, 10));
    }

    // ------------------------------------------------------------------
    // canReadEntryData()
    // ------------------------------------------------------------------

    @Test
    public void testCanReadEntryData_notTarArchiveEntry_returnsFalse() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(t.canReadEntryData(null)); // instanceof check on null -> false
    }

    @Test
    public void testCanReadEntryData_nonSparseTarEntry_returnsTrue() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry e = new TarArchiveEntry("file.txt");
        assertTrue(t.canReadEntryData(e));
    }

    // ------------------------------------------------------------------
    // getCurrentEntry / setCurrentEntry / isAtEOF / setAtEOF (protected, package-visible)
    // ------------------------------------------------------------------

    @Test
    public void testCurrentEntryAccessors() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry e = new TarArchiveEntry("foo.txt");
        t.setCurrentEntry(e);
        assertSame(e, t.getCurrentEntry());
    }

    @Test
    public void testEOFAccessors() {
        TarArchiveInputStream t = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(t.isAtEOF());
        t.setAtEOF(true);
        assertTrue(t.isAtEOF());
        t.setAtEOF(false);
        assertFalse(t.isAtEOF());
    }

    // ------------------------------------------------------------------
    // matches() static method
    // ------------------------------------------------------------------

    @Test
    public void testMatches_tooShort_returnsFalse() {
        assertFalse(TarArchiveInputStream.matches(new byte[0], 0));
    }

    @Test
    public void testMatches_allZero_returnsFalse() {
        byte[] sig = new byte[512];
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_realTarHeader_returnsTrue() throws IOException {
        // Round-trip assumption: header produced by TarArchiveOutputStream
        // is recognised by one of the supported magics (POSIX/GNU/ANT).
        byte[] tarBytes = buildTar(new String[]{"a.txt"}, new byte[][]{"x".getBytes()});
        byte[] header = Arrays.copyOfRange(tarBytes, 0, 512);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_* (6 methods) | constructor overload ทั้ง 6 ตัว, `getRecordSize()` |
| testClose_delegatesToUnderlyingStream | `close()` เรียก `is.close()` |
| testAvailable_normalBranch | `available()` เงื่อนไข false (ไม่เกิน Integer.MAX_VALUE) |
| testAvailable_overIntegerMaxBranch | `available()` เงื่อนไข true (เกิน Integer.MAX_VALUE) |
| testSkip_zeroWhenNoEntry / testSkip_capsToAvailable | `skip()` การ cap `numToSkip` ด้วย `available` |
| testReset_doesNothing | `reset()` no-op |
| testGetNextTarEntry_emptyStream_returnsNullTwice | `hasHitEOF` true branch (short-circuit ครั้งที่สอง), headerBuf null |
| testGetNextTarEntry_zeroRecordThenEOF_noSecondEOFRecord | `tryToConsumeSecondEOFRecord` shouldReset=false, `consumeRemainderOfLastBlock` true branch |
| testGetNextTarEntry_zeroRecordFollowedByNonZero_resetBranch | `tryToConsumeSecondEOFRecord` shouldReset=true (mark/reset) |
| testGetNextTarEntry_multipleEntries_paddingBranches | `currEntry != null` skip/padding branch, `skipRecordPadding()` true/false |
| testIsEOFRecord_* (3 methods) | `isEOFRecord()` null / all-zero / non-zero |
| testReadRecord_* (2 methods) | `readRecord()` readNow==recordSize / readNow!=recordSize |
| testGetLongNameData_malformed_noEntryAfter_returnsNull | `getLongNameData()` currEntry==null → return null |
| testGetLongNameData_trimsTrailingNulls | trailing-null trim branch (length!=longNameData.length) |
| testGetLongNameData_noTrailingNulls_noTrimBranch | ไม่ trim (length==longNameData.length) |
| testGetNextTarEntry_gnuLongName | `isGNULongNameEntry()` true branch แบบ integration |
| testParsePaxHeaders_emptyInput_returnsEmptyMap | outer while ออกจาก loop ทันที (ch==-1) |
| testParsePaxHeaders_singleHeader / _multipleHeaders | length/keyword/value parsing loop, multiple iterations |
| testRead_returnsMinusOne_whenEntryOffsetGteEntrySize | `read()` เงื่อนไข `entryOffset>=entrySize` |
| testRead_throwsIllegalStateException_whenCurrEntryNull | `read()` currEntry==null throw branch |
| testRead_normalAndEOFBranches | `read()` ปกติ + `entryOffset>=entrySize` หลัง readครบ |
| testCanReadEntryData_* (2 methods) | `instanceof TarArchiveEntry` true/false |
| testCurrentEntryAccessors | `getCurrentEntry/setCurrentEntry` |
| testEOFAccessors | `isAtEOF/setAtEOF` |
| testMatches_tooShort_returnsFalse | `matches()` length < threshold |
| testMatches_allZero_returnsFalse | `matches()` ไม่ match magic ใดๆ |
| testMatches_realTarHeader_returnsTrue | `matches()` match branch (POSIX/GNU/ANT ตัวใดตัวหนึ่ง) |

**หมายเหตุจุดที่ไม่ได้ทดสอบ (ตามข้อกำหนดห้ามเดา behavior):**
- `isGNULongLinkEntry()` path และ `readGNUSparse()` (ต้องสร้าง header byte layout ที่แน่นอนซึ่งไม่มีอยู่ใน source ที่ให้มา — `TarConstants` offset ไม่ได้แสดง)
- `applyPaxHeadersToCurrentEntry()` เป็น private แท้ ไม่สามารถเรียกตรงได้แม้อยู่ package เดียวกัน จึงทดสอบผ่าน `parsePaxHeaders()` ที่เป็น package-private แทน
- กรณี `TarArchiveEntry` constructor throw `IllegalArgumentException` (malformed header) ไม่ได้เขียนทดสอบเพราะเงื่อนไข throw ขึ้นกับ implementation ของ `TarArchiveEntry` ที่ไม่ได้ให้ source มา