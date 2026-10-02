# วิเคราะห์และแผนการทดสอบ

ก่อนเขียนโค้ด ขอสรุปข้อสมมติที่ใช้ (เนื่องจากบางส่วนต้องอาศัย class ข้างเคียงในแพ็กเกจเดียวกันที่ไม่ได้ให้ซอร์สมาด้วย):

- ใช้ `TarArchiveOutputStream` และ `TarArchiveEntry` (คลาสจริงในโปรเจกต์ Commons‑Compress เดียวกัน) เพื่อสร้างไฟล์ tar จริงสำหรับทดสอบ `TarArchiveInputStream` — เป็น API มาตรฐานที่คงที่ของโปรเจกต์ ไม่ได้เดา behavior ของคลาสเป้าหมาย
- ใช้ค่าคงที่ `TarBuffer.DEFAULT_RCDSIZE` / `TarBuffer.DEFAULT_BLKSIZE` ที่**อ้างอิงตรงจากซอร์สที่ให้มา** (`this(is, blockSize, TarBuffer.DEFAULT_RCDSIZE)`) เพื่อเลี่ยงการเดาตัวเลข block/record size
- `parsePaxHeaders(Reader)` เป็น package-private จึงเทสตรงได้ (อยู่ package เดียวกัน) โดยคำนวณความยาว record ให้ตรงตาม logic จริงในซอร์ส (ไม่ได้เดา)
- ส่วนที่ **ไม่เทส** เพราะขาดข้อมูลซอร์สของ `TarArchiveEntry` (isPaxHeader/isGNUSparse/isExtended ใช้ typeflag แบบใด) และ `applyPaxHeadersToCurrentEntry`/`readGNUSparse` (private) จะระบุคอมเมนต์กำกับไว้ในโค้ด
- Branch "skip เท่ากับ/น้อยกว่า 0 → throw RuntimeException" ใน `getNextTarEntry()` วิเคราะห์แล้วว่ายากที่จะ trigger ได้จริงด้วยข้อมูลที่มี (เพราะ `read()` จะ throw IOException หรือ return -1 เท่านั้น ไม่ return 0) จึงคอมเมนต์กำกับว่าไม่ได้ทดสอบ

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link TarArchiveInputStream} (Defects4J Compress-12b).
 *
 * หมายเหตุสมมติฐาน (assumptions) ที่ใช้ในชุดทดสอบนี้:
 * - ใช้ TarArchiveOutputStream/TarArchiveEntry (คลาสจริงในโปรเจกต์เดียวกัน) เพื่อสร้าง fixture
 *   tar ไฟล์ เนื่องจากซอร์สที่ให้มาไม่ได้รวม TarArchiveOutputStream แต่เป็น API มาตรฐาน/คงที่
 *   ของ Commons-Compress
 * - ใช้ TarBuffer.DEFAULT_RCDSIZE / DEFAULT_BLKSIZE ตามที่ปรากฏจริงในซอร์สเป้าหมาย
 * - บาง private method (applyPaxHeadersToCurrentEntry, readGNUSparse) และเงื่อนไขที่พึ่งพา
 *   internal format ของ TarArchiveEntry (isPaxHeader/isGNUSparse/isExtended จริง ๆ) ไม่ได้ถูกเทส
 *   ตรง ๆ เนื่องจากไม่มีซอร์สของ TarArchiveEntry ให้ จะคอมเมนต์กำกับไว้ที่แต่ละจุด
 */
public class TarArchiveInputStreamTest {

    // ---------- Helpers ----------

    private byte[] buildTar(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        return baos.toByteArray();
    }

    private byte[] buildTarMultiple(String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        for (int i = 0; i < names.length; i++) {
            TarArchiveEntry e = new TarArchiveEntry(names[i]);
            e.setSize(contents[i].length);
            tos.putArchiveEntry(e);
            tos.write(contents[i]);
            tos.closeArchiveEntry();
        }
        tos.finish();
        tos.close();
        return baos.toByteArray();
    }

    private byte[] buildTarLongName(String longName, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        return baos.toByteArray();
    }

    private void setPrivateField(Object target, String field, Object value) throws Exception {
        Field f = TarArchiveInputStream.class.getDeclaredField(field);
        f.setAccessible(true);
        f.set(target, value);
    }

    private byte[] readAll(TarArchiveInputStream tis, int chunk) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[chunk];
        int r;
        while ((r = tis.read(buf, 0, chunk)) != -1) {
            baos.write(buf, 0, r);
        }
        return baos.toByteArray();
    }

    // ---------- Constructors / getRecordSize ----------

    @Test
    public void testDefaultConstructor_RecordSizeIsDefault() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeOnly_RecordSizeStaysDefault() {
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 10240);
        // ยืนยันตามซอร์ส: this(is, blockSize, TarBuffer.DEFAULT_RCDSIZE)
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tis.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockAndRecordSize_CustomRecordSizeApplied() {
        int customRecord = TarBuffer.DEFAULT_RCDSIZE * 2;
        TarArchiveInputStream tis = new TarArchiveInputStream(
            new ByteArrayInputStream(new byte[0]), TarBuffer.DEFAULT_BLKSIZE, customRecord);
        assertEquals(customRecord, tis.getRecordSize());
    }

    // ---------- close ----------

    @Test
    public void testClose_NoExceptionAfterReadingEntry() throws IOException {
        byte[] tar = buildTar("c.txt", "x".getBytes());
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        tis.close();
    }

    // ---------- available() ----------

    @Test
    public void testAvailable_WithinIntRange() throws Exception {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        setPrivateField(tis, "entrySize", 500L);
        setPrivateField(tis, "entryOffset", 200L);
        assertEquals(300, tis.available());
    }

    @Test
    public void testAvailable_ExceedsIntMaxReturnsIntMax() throws Exception {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        setPrivateField(tis, "entrySize", (long) Integer.MAX_VALUE + 100L);
        setPrivateField(tis, "entryOffset", 0L);
        assertEquals(Integer.MAX_VALUE, tis.available());
    }

    // ---------- skip() ----------

    @Test
    public void testSkip_ZeroReturnsZero() throws IOException {
        byte[] tar = buildTar("f", new byte[] {1, 2, 3});
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        assertEquals(0, tis.skip(0));
    }

    @Test
    public void testSkip_NegativeReturnsZero() throws IOException {
        byte[] tar = buildTar("f", new byte[] {1, 2, 3});
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        assertEquals(0, tis.skip(-10));
    }

    @Test
    public void testSkip_WithinEntry() throws IOException {
        byte[] content = "0123456789".getBytes();
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(buildTar("f", content)));
        tis.getNextTarEntry();
        long skipped = tis.skip(4);
        assertEquals(4, skipped);
        byte[] rest = new byte[6];
        int r = tis.read(rest, 0, 6);
        assertEquals(6, r);
        assertArrayEquals("456789".getBytes(), rest);
    }

    @Test
    public void testSkip_BeyondEntrySizeCapsAtRemaining() throws IOException {
        byte[] content = "abc".getBytes();
        TarArchiveInputStream tis =
            new TarArchiveInputStream(new ByteArrayInputStream(buildTar("f", content)));
        tis.getNextTarEntry();
        long skipped = tis.skip(1000);
        assertEquals(3, skipped);
        assertEquals(-1, tis.read(new byte[10], 0, 10));
    }

    // ---------- reset() ----------

    @Test
    public void testReset_IsNoOpDoesNotAffectStream() throws IOException {
        byte[] tar = buildTar("r.txt", "abc".getBytes());
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        tis.reset();
        byte[] buf = new byte[3];
        assertEquals(3, tis.read(buf, 0, 3));
        assertArrayEquals("abc".getBytes(), buf);
    }

    // ---------- getNextTarEntry() / getNextEntry() ----------

    @Test
    public void testGetNextTarEntry_EmptyArchiveReturnsNull() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_CalledAgainAfterEOFShortCircuits() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getNextTarEntry());
        assertNull(tis.getNextTarEntry()); // hasHitEOF == true -> return null ทันที
    }

    @Test
    public void testGetNextTarEntry_SingleEntryReadFullyThenNull() throws IOException {
        byte[] content = "Hello World".getBytes();
        byte[] tar = buildTar("test.txt", content);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));

        TarArchiveEntry e = tis.getNextTarEntry();
        assertNotNull(e);
        assertEquals("test.txt", e.getName());
        assertEquals(content.length, e.getSize());

        byte[] buf = new byte[content.length];
        assertEquals(content.length, tis.read(buf, 0, buf.length));
        assertArrayEquals(content, buf);

        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_MultipleEntries_SkipsUnreadRemainderOfPrevious() throws IOException {
        byte[] c1 = "First entry content".getBytes();
        byte[] c2 = "Second".getBytes();
        byte[] tar = buildTarMultiple(new String[] {"a.txt", "b.txt"}, new byte[][] {c1, c2});
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));

        TarArchiveEntry e1 = tis.getNextTarEntry();
        assertEquals("a.txt", e1.getName());
        // ไม่อ่านข้อมูลของ e1 เลย -> บังคับให้ getNextTarEntry() ต้อง skip ส่วนที่เหลือ (currEntry != null branch)

        TarArchiveEntry e2 = tis.getNextTarEntry();
        assertEquals("b.txt", e2.getName());
        byte[] buf = new byte[c2.length];
        assertEquals(c2.length, tis.read(buf, 0, buf.length));
        assertArrayEquals(c2, buf);

        assertNull(tis.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntry_ZeroSizeEntry_ReadReturnsMinusOneImmediately() throws IOException {
        byte[] tar = buildTar("empty.txt", new byte[0]);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        TarArchiveEntry e = tis.getNextTarEntry();
        assertEquals(0, e.getSize());
        assertEquals(-1, tis.read(new byte[10], 0, 10));
    }

    @Test
    public void testGetNextTarEntry_GNULongFileName_NameAndContentPreserved() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) sb.append('x');
        String longName = sb.toString();
        byte[] content = "data".getBytes();
        byte[] tar = buildTarLongName(longName, content);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        TarArchiveEntry e = tis.getNextTarEntry();
        assertNotNull(e);
        assertEquals(longName, e.getName());

        byte[] buf = new byte[content.length];
        assertEquals(content.length, tis.read(buf, 0, buf.length));
        assertArrayEquals(content, buf);
    }

    // หมายเหตุ: กรณี isPaxHeader()==true / isGNUSparse()==true / "long name entry not followed
    // by entry -> return null" ไม่ได้เทสตรง ๆ เนื่องจากต้องรู้รูปแบบ byte/typeflag ภายในของ
    // TarArchiveEntry (isPaxHeader/isGNUSparse/isExtended) ซึ่งไม่มีซอร์สให้ในโจทย์นี้

    @Test
    public void testGetNextEntry_DelegatesToGetNextTarEntry() throws IOException {
        byte[] tar = buildTar("d.txt", "y".getBytes());
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        ArchiveEntry e = tis.getNextEntry();
        assertNotNull(e);
        assertTrue(e instanceof TarArchiveEntry);
        assertEquals("d.txt", ((TarArchiveEntry) e).getName());
    }

    // ---------- read(byte[], int, int) ----------

    @Test
    public void testRead_SpanningMultipleRecords_ExactRecordChunks() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        int contentLength = recordSize * 2 + 50;
        byte[] content = new byte[contentLength];
        for (int i = 0; i < contentLength; i++) content[i] = (byte) (i % 256);
        byte[] tar = buildTar("big.bin", content);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        byte[] out = readAll(tis, recordSize);
        assertArrayEquals(content, out);
    }

    @Test
    public void testRead_SpanningMultipleRecords_IrregularSmallChunks() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        int contentLength = recordSize * 2 + 50;
        byte[] content = new byte[contentLength];
        for (int i = 0; i < contentLength; i++) content[i] = (byte) (i % 256);
        byte[] tar = buildTar("big2.bin", content);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();
        // chunk เล็กและไม่หารเท่า record -> กระตุ้น readBuf leftover ทั้งสอง sub-branch
        byte[] out = readAll(tis, recordSize / 3 + 1);
        assertArrayEquals(content, out);
    }

    @Test
    public void testRead_RequestLargerThanEntrySize_CapsAtEntrySize() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        int contentLength = recordSize + 20;
        byte[] content = new byte[contentLength];
        for (int i = 0; i < contentLength; i++) content[i] = (byte) i;
        byte[] tar = buildTar("cap.bin", content);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        tis.getNextTarEntry();

        byte[] bigBuf = new byte[contentLength + 500];
        int r = tis.read(bigBuf, 0, bigBuf.length);
        assertEquals(contentLength, r);
        byte[] trimmed = new byte[contentLength];
        System.arraycopy(bigBuf, 0, trimmed, 0, contentLength);
        assertArrayEquals(content, trimmed);

        assertEquals(-1, tis.read(new byte[5], 0, 5));
    }

    @Test
    public void testRead_TruncatedArchive_ThrowsIOException() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        byte[] content = new byte[recordSize];
        for (int i = 0; i < content.length; i++) content[i] = (byte) i;
        byte[] tar = buildTar("trunc.bin", content);

        // header ของ tar เป็น 1 record เต็มพอดีตามสเปกมาตรฐาน tar -> เก็บไว้แค่ header block เดียว
        byte[] truncated = new byte[recordSize];
        System.arraycopy(tar, 0, truncated, 0, recordSize);

        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        TarArchiveEntry e = tis.getNextTarEntry();
        assertNotNull(e); // header อ่านผ่าน แต่ประกาศ size = recordSize โดยไม่มีข้อมูลจริงตามมา

        try {
            tis.read(new byte[recordSize], 0, recordSize);
            fail("ควร throw IOException เนื่องจากไฟล์ถูก truncate");
        } catch (IOException expected) {
            // อาจถูก throw จาก TarArchiveInputStream.read() (rec==null) หรือจาก TarBuffer
            // เนื่องจากไม่มีซอร์สของ TarBuffer ให้ จึงไม่ยืนยัน exact message/ต้นทาง
        }
    }

    // ---------- canReadEntryData ----------

    @Test
    public void testCanReadEntryData_TarEntryNonSparse_ReturnsTrue() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry e = new TarArchiveEntry("x");
        assertTrue(tis.canReadEntryData(e));
    }

    @Test
    public void testCanReadEntryData_NonTarArchiveEntry_ReturnsFalse() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry fake = new ZipArchiveEntry("fake.txt"); // ArchiveEntry ที่ไม่ใช่ TarArchiveEntry
        assertFalse(tis.canReadEntryData(fake));
    }

    // หมายเหตุ: กรณี TarArchiveEntry.isGNUSparse()==true (return false) ไม่ได้เทส เนื่องจากไม่ทราบ
    // วิธีสร้าง entry แบบ GNU sparse จากซอร์สที่ให้มา

    // ---------- protected accessors ----------

    @Test
    public void testProtectedAccessors_GetSetCurrentEntry_And_EOFFlag() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getCurrentEntry());
        assertFalse(tis.isAtEOF());

        TarArchiveEntry e = new TarArchiveEntry("dummy");
        tis.setCurrentEntry(e);
        assertSame(e, tis.getCurrentEntry());

        tis.setAtEOF(true);
        assertTrue(tis.isAtEOF());
    }

    @Test
    public void testIsAtEOF_BecomesTrueAfterConsumingWholeArchive() throws IOException {
        byte[] tar = buildTar("a", "x".getBytes());
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(tar));
        assertFalse(tis.isAtEOF());
        tis.getNextTarEntry();
        tis.getNextTarEntry(); // อ่านจนเจอ EOF record -> hasHitEOF = true
        assertTrue(tis.isAtEOF());
    }

    // ---------- matches(byte[], int) ----------

    @Test
    public void testMatches_TooShortSignature_ReturnsFalse() {
        byte[] sig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_AllZeroSufficientLength_ReturnsFalse() {
        byte[] sig = new byte[300];
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_RealTarHeader_ReturnsTrue() throws IOException {
        byte[] tar = buildTar("m.txt", "data".getBytes());
        byte[] header = new byte[300];
        System.arraycopy(tar, 0, header, 0, 300);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }

    // หมายเหตุ: เนื่องจากไม่มีซอร์สของ TarConstants ให้ จึงไม่สามารถยืนยันแยกได้ว่า true-branch
    // ที่ถูก hit คือ POSIX/GNU(space)/GNU(zero)/ANT branch ใดเจาะจง ทดสอบเฉพาะผลลัพธ์ true/false โดยรวม

    // ---------- parsePaxHeaders(Reader) ----------

    @Test
    public void testParsePaxHeaders_SingleHeader() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tis.parsePaxHeaders(new StringReader("6 a=b\n"));
        assertEquals(1, headers.size());
        assertEquals("b", headers.get("a"));
    }

    @Test
    public void testParsePaxHeaders_MultipleHeaders() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tis.parsePaxHeaders(new StringReader("6 a=b\n6 c=d\n"));
        assertEquals(2, headers.size());
        assertEquals("b", headers.get("a"));
        assertEquals("d", headers.get("c"));
    }

    @Test
    public void testParsePaxHeaders_EmptyInput_ReturnsEmptyMap() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tis.parsePaxHeaders(new StringReader(""));
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeaders_DigitsOnlyNoSpaceBeforeEOF_ReturnsEmptyMap() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tis.parsePaxHeaders(new StringReader("123"));
        assertTrue(headers.isEmpty());
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeaders_TruncatedValue_ThrowsIOException() throws IOException {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // len=6 ต้องการอีก 2 ตัวอักษรหลัง '=' แต่มีจริงแค่ 1 ตัว -> got != len-read
        tis.parsePaxHeaders(new StringReader("6 a=b"));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_RecordSizeIsDefault | Constructor(is) → Constructor(is,blockSize,recordSize) chain |
| testConstructorWithBlockSizeOnly_RecordSizeStaysDefault | Constructor(is,blockSize) ใช้ DEFAULT_RCDSIZE |
| testConstructorWithBlockAndRecordSize_CustomRecordSizeApplied | Constructor 3 พารามิเตอร์เต็ม |
| testClose_NoExceptionAfterReadingEntry | close() ปกติ |
| testAvailable_WithinIntRange | available(): เงื่อนไข false (ไม่เกิน MAX_VALUE) |
| testAvailable_ExceedsIntMaxReturnsIntMax | available(): เงื่อนไข true (เกิน MAX_VALUE) |
| testSkip_ZeroReturnsZero / testSkip_NegativeReturnsZero | skip(): while(skip>0) เป็น false ทันที |
| testSkip_WithinEntry | skip(): loop ทำงาน, numRead>0 |
| testSkip_BeyondEntrySizeCapsAtRemaining | skip(): numRead==-1 → break |
| testReset_IsNoOpDoesNotAffectStream | reset() no-op |
| testGetNextTarEntry_EmptyArchiveReturnsNull | getNextTarEntry(): headerBuf==null → hasHitEOF, return null |
| testGetNextTarEntry_CalledAgainAfterEOFShortCircuits | if(hasHitEOF) return null (top) |
| testGetNextTarEntry_SingleEntryReadFullyThenNull | currEntry==null path แรก, entry ปกติ, isGNULongNameEntry/isPaxHeader/isGNUSparse = false |
| testGetNextTarEntry_MultipleEntries_SkipsUnreadRemainderOfPrevious | currEntry!=null → numToSkip>0 loop |
| testGetNextTarEntry_ZeroSizeEntry_ReadReturnsMinusOneImmediately | entrySize=0 → read() top branch |
| testGetNextTarEntry_GNULongFileName_NameAndContentPreserved | isGNULongNameEntry()==true, longName trailing-null removal, getNextEntry() ภายใน |
| testGetNextEntry_DelegatesToGetNextTarEntry | getNextEntry() delegate |
| testRead_SpanningMultipleRecords_ExactRecordChunks | while(numToRead>0) หลายรอบ, recLen>sz==false (else branch) |
| testRead_SpanningMultipleRecords_IrregularSmallChunks | recLen>sz==true, readBuf!=null ทั้ง sz>=readBuf.length และ sz<readBuf.length |
| testRead_RequestLargerThanEntrySize_CapsAtEntrySize | (numToRead+entryOffset)>entrySize == true |
| testRead_TruncatedArchive_ThrowsIOException | rec==null → throw IOException (unexpected EOF) |
| testCanReadEntryData_TarEntryNonSparse_ReturnsTrue | instanceof true, !isGNUSparse() |
| testCanReadEntryData_NonTarArchiveEntry_ReturnsFalse | instanceof false |
| testProtectedAccessors_GetSetCurrentEntry_And_EOFFlag | getCurrentEntry/setCurrentEntry/isAtEOF/setAtEOF |
| testIsAtEOF_BecomesTrueAfterConsumingWholeArchive | getRecord(): isEOFRecord→hasHitEOF=true |
| testMatches_TooShortSignature_ReturnsFalse | matches(): length < required → false |
| testMatches_AllZeroSufficientLength_ReturnsFalse | matches(): ทุก match เป็น false → final return false |
| testMatches_RealTarHeader_ReturnsTrue | matches(): true-branch (ไม่ระบุ branch ย่อยเจาะจง) |
| testParsePaxHeaders_SingleHeader | parsePaxHeaders: อ่านครบ 1 header สำเร็จ |
| testParsePaxHeaders_MultipleHeaders | parsePaxHeaders: outer while วนหลายรอบ |
| testParsePaxHeaders_EmptyInput_ReturnsEmptyMap | ch==-1 ทันที (EOF) |
| testParsePaxHeaders_DigitsOnlyNoSpaceBeforeEOF_ReturnsEmptyMap | inner while(digit) จบด้วย EOF โดยไม่เจอ space |
| testParsePaxHeaders_TruncatedValue_ThrowsIOException | got != len-read → throw IOException |

**หมายเหตุจุดที่ไม่ได้ทดสอบ (ระบุในคอมเมนต์ในโค้ด):** true-branch ของ `isPaxHeader()`, `isGNUSparse()`, `currEntry==null` หลัง GNU long name (malformed), `readGNUSparse()`, `applyPaxHeadersToCurrentEntry()`, และ RuntimeException branch ใน `getNextTarEntry()` — เนื่องจากต้องพึ่งพารายละเอียด byte-format ภายในของ `TarArchiveEntry`/`TarConstants` ที่ไม่มีซอร์สให้ในโจทย์นี้