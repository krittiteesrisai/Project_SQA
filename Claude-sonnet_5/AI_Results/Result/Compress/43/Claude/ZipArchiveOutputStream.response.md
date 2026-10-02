# JUnit 4 Test Suite สำหรับ `ZipArchiveOutputStream`

## แนวคิดการทดสอบ

เนื่องจากคลาสนี้มี dependency ภายในจำนวนมาก (StreamCompressor, ZipEncoding, ฯลฯ) การทดสอบจึงเน้น **integration-style black-box testing** โดยใช้ `ByteArrayOutputStream`/`File` จริง แล้วอ่านผลลัพธ์กลับด้วย `java.util.zip.ZipInputStream` เพื่อยืนยันความถูกต้องของ archive ที่สร้างขึ้นจริง (ช่วยดักจับ fault ได้ดีกว่าการ mock ทั้งหมด)

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ZipArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- Helper ----------

    private Map<String, byte[]> readZipEntries(final byte[] zipBytes) throws IOException {
        final Map<String, byte[]> result = new LinkedHashMap<>();
        try (ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zipBytes))) {
            ZipEntry ze;
            while ((ze = zis.getNextEntry()) != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int n;
                while ((n = zis.read(buf)) > 0) {
                    baos.write(buf, 0, n);
                }
                result.put(ze.getName(), baos.toByteArray());
            }
        }
        return result;
    }

    private long crc32(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        return crc.getValue();
    }

    // ---------- Constructors / isSeekable ----------

    @Test
    public void testConstructorWithOutputStream_notSeekable() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        assertFalse("Stream-based constructor must not be seekable", zos.isSeekable());
        zos.finish();
        zos.close();
    }

    @Test
    public void testConstructorWithFile_isSeekable() throws IOException {
        File f = tempFolder.newFile("test1.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        assertTrue("File-based constructor should use SeekableByteChannel", zos.isSeekable());
        zos.finish();
        zos.close();
    }

    @Test
    public void testConstructorWithSeekableByteChannel_isSeekable() throws IOException {
        File f = tempFolder.newFile("test2.zip");
        try (SeekableByteChannel channel = Files.newByteChannel(f.toPath(),
                EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                        StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING))) {
            ZipArchiveOutputStream zos = new ZipArchiveOutputStream(channel);
            assertTrue(zos.isSeekable());
            zos.finish();
            zos.close();
        }
    }

    // ---------- Encoding ----------

    @Test
    public void testSetGetEncoding_default() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        assertEquals("UTF8", zos.getEncoding());
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetEncoding_nonUTF8_doesNotThrow() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", zos.getEncoding());
        // NOTE: internal useUTF8Flag becomes false (private field, not directly assertable)
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetEncoding_null_doesNotThrow() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setEncoding(null);
        assertNull(zos.getEncoding());
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetUseLanguageEncodingFlag_falseAlwaysFalse() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setUseLanguageEncodingFlag(false);
        // no public getter to verify, only asserting no exception (smoke test)
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetUseLanguageEncodingFlag_trueWithNonUTF8() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setEncoding("ISO-8859-1");
        zos.setUseLanguageEncodingFlag(true); // b && isUTF8(encoding) -> false branch
        zos.finish();
        zos.close();
    }

    // ---------- setCreateUnicodeExtraFields / setFallbackToUTF8 / setUseZip64 / setComment ----------

    @Test
    public void testSetCreateUnicodeExtraFields_smoke() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zos.setFallbackToUTF8(true);
        zos.setUseZip64(Zip64Mode.Never);
        zos.setComment("hello comment");
        zos.finish();
        zos.close();
    }

    // ---------- setLevel ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_tooLow_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION - 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_tooHigh_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setLevel(Deflater.BEST_COMPRESSION + 1);
    }

    @Test
    public void testSetLevel_boundaryValid_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION); // lower boundary
        zos.setLevel(Deflater.BEST_COMPRESSION);    // upper boundary
        zos.setLevel(0);                            // middle value
        zos.finish();
        zos.close();
    }

    // ---------- setMethod ----------

    @Test
    public void testSetMethod_changesDefault() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt"); // method not specified (-1)
        byte[] data = "hi".getBytes();
        entry.setSize(data.length);
        entry.setCrc(crc32(data));
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();
        assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());
    }

    // ---------- canWriteEntryData ----------

    @Test
    public void testCanWriteEntryData_zipEntryDefault_true() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("x.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        assertTrue(zos.canWriteEntryData(entry));
        zos.finish();
        zos.close();
    }

    @Test
    public void testCanWriteEntryData_nonZipArchiveEntry_false() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ArchiveEntry fake = mock(ArchiveEntry.class);
        assertFalse(zos.canWriteEntryData(fake));
        zos.finish();
        zos.close();
    }

    // ---------- write() ----------

    @Test(expected = IllegalStateException.class)
    public void testWrite_noCurrentEntry_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.write(new byte[]{1, 2, 3}, 0, 3);
    }

    // ---------- putArchiveEntry ----------

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.finish();
        zos.putArchiveEntry(new ZipArchiveEntry("a.txt"));
    }

    @Test(expected = java.util.zip.ZipException.class)
    public void testPutArchiveEntry_storedWithoutSize_nonSeekable_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        // size not set -> SIZE_UNKNOWN, channel == null -> ZipException expected
        zos.putArchiveEntry(entry);
    }

    @Test(expected = java.util.zip.ZipException.class)
    public void testPutArchiveEntry_storedWithoutCrc_nonSeekable_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        // crc not set -> CRC_UNKNOWN, channel == null -> ZipException expected
        zos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntry_stored_seekable_noSizeCrcRequired() throws IOException {
        File f = tempFolder.newFile("seek1.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        // size/crc not pre-set: allowed because channel != null
        zos.putArchiveEntry(entry);
        byte[] data = "hello world".getBytes();
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        byte[] zipBytes = Files.readAllBytes(f.toPath());
        Map<String, byte[]> entries = readZipEntries(zipBytes);
        assertArrayEquals(data, entries.get("a.txt"));
    }

    @Test
    public void testPutArchiveEntry_autoClosesPreviousEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);

        ZipArchiveEntry e1 = new ZipArchiveEntry("first.txt");
        e1.setMethod(ZipArchiveOutputStream.STORED);
        byte[] d1 = "AAA".getBytes();
        e1.setSize(d1.length);
        e1.setCrc(crc32(d1));
        zos.putArchiveEntry(e1);
        zos.write(d1);
        // NOTE: no explicit closeArchiveEntry() call here

        ZipArchiveEntry e2 = new ZipArchiveEntry("second.txt");
        e2.setMethod(ZipArchiveOutputStream.STORED);
        byte[] d2 = "BBBBB".getBytes();
        e2.setSize(d2.length);
        e2.setCrc(crc32(d2));
        zos.putArchiveEntry(e2); // should auto-close e1
        zos.write(d2);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertEquals(2, entries.size());
        assertArrayEquals(d1, entries.get("first.txt"));
        assertArrayEquals(d2, entries.get("second.txt"));
    }

    // ---------- closeArchiveEntry ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noCurrentEntry_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.finish();
        zos.closeArchiveEntry();
    }

    @Test(expected = java.util.zip.ZipException.class)
    public void testCloseArchiveEntry_badCrc_forStored_nonSeekable_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("bad.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "content".getBytes();
        entry.setSize(data.length);
        entry.setCrc(12345L); // wrong CRC on purpose
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry(); // expect ZipException: bad CRC checksum
    }

    @Test(expected = java.util.zip.ZipException.class)
    public void testCloseArchiveEntry_badSize_forStored_nonSeekable_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("bad2.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "content".getBytes();
        entry.setSize(999); // wrong size on purpose
        entry.setCrc(crc32(data));
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry(); // expect ZipException: bad size
    }

    @Test
    public void testCloseArchiveEntry_deflatedDefaultMethod_roundTrip() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("deflate.txt");
        // method not specified -> setDefaults() applies DEFLATED, size/crc auto-computed
        byte[] data = "The quick brown fox jumps over the lazy dog".getBytes();
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());
        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertArrayEquals(data, entries.get("deflate.txt"));
    }

    // ---------- finish() ----------

    @Test(expected = IOException.class)
    public void testFinish_calledTwice_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.finish();
        zos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry("open.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(3);
        entry.setCrc(crc32("abc".getBytes()));
        zos.putArchiveEntry(entry);
        zos.write("abc".getBytes());
        // no closeArchiveEntry() -> finish() must throw
        zos.finish();
    }

    @Test
    public void testFinish_emptyArchive_producesValidEOCD() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.finish();
        zos.close();
        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertTrue(entries.isEmpty());
    }

    // ---------- close() / flush() ----------

    @Test
    public void testClose_callsFinishAutomatically() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.close(); // should call finish() internally, no exception
        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertTrue(entries.isEmpty());
    }

    @Test
    public void testClose_calledTwice_doesNotThrow() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.close();
        zos.close(); // finished == true branch, skip finish(), only destroy() again
    }

    @Test
    public void testFlush_withUnderlyingOutputStream_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.flush(); // out != null branch
        zos.finish();
        zos.close();
    }

    @Test
    public void testFlush_withChannelOnly_noException() throws IOException {
        File f = tempFolder.newFile("flushtest.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        zos.flush(); // out == null branch (channel-based), should be no-op
        zos.finish();
        zos.close();
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry_returnsZipArchiveEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        File f = tempFolder.newFile("dummy.txt");
        Files.write(f.toPath(), "abc".getBytes());
        ArchiveEntry ae = zos.createArchiveEntry(f, "dummy.txt");
        assertTrue(ae instanceof ZipArchiveEntry);
        assertEquals("dummy.txt", ae.getName());
        zos.finish();
        zos.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.finish();
        File f = tempFolder.newFile("dummy2.txt");
        zos.createArchiveEntry(f, "dummy2.txt");
    }

    // ---------- addRawArchiveEntry ----------

    @Test
    public void testAddRawArchiveEntry_storedTwoPhase_roundTrip() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);

        byte[] data = "raw stored content".getBytes();
        ZipArchiveEntry rawEntry = new ZipArchiveEntry("raw.txt");
        rawEntry.setMethod(ZipArchiveOutputStream.STORED);
        rawEntry.setSize(data.length);
        rawEntry.setCompressedSize(data.length);
        rawEntry.setCrc(crc32(data));

        zos.addRawArchiveEntry(rawEntry, new ByteArrayInputStream(data));
        zos.finish();
        zos.close();

        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertArrayEquals(data, entries.get("raw.txt"));
    }

    // ---------- setUseZip64 combined with entry (AsNeeded default smoke test) ----------

    @Test
    public void testSetUseZip64_alwaysMode_smallEntry_stillValidArchive() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos);
        zos.setUseZip64(Zip64Mode.Always);
        ZipArchiveEntry entry = new ZipArchiveEntry("z64.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "small".getBytes();
        entry.setSize(data.length);
        entry.setCrc(crc32(data));
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        Map<String, byte[]> entries = readZipEntries(bos.toByteArray());
        assertArrayEquals(data, entries.get("z64.txt"));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithOutputStream_notSeekable` | Constructor(OutputStream), `isSeekable()` → false (channel==null) |
| `testConstructorWithFile_isSeekable` | Constructor(File) — try-branch สำเร็จ, channel!=null |
| `testConstructorWithSeekableByteChannel_isSeekable` | Constructor(SeekableByteChannel), out==null |
| `testSetGetEncoding_default` | `getEncoding()` ค่า default |
| `testSetEncoding_nonUTF8_doesNotThrow` | `setEncoding()` — `!isUTF8(encoding)` → useUTF8Flag=false |
| `testSetEncoding_null_doesNotThrow` | `setEncoding(null)` boundary null |
| `testSetUseLanguageEncodingFlag_falseAlwaysFalse` | `setUseLanguageEncodingFlag(false)` |
| `testSetUseLanguageEncodingFlag_trueWithNonUTF8` | `b && isUTF8(...)` → false branch |
| `testSetCreateUnicodeExtraFields_smoke` | setter smoke (ALWAYS policy), setFallbackToUTF8, setUseZip64, setComment |
| `testSetLevel_tooLow_throws` / `_tooHigh_throws` | `setLevel` IllegalArgumentException ทั้ง 2 ขอบ |
| `testSetLevel_boundaryValid_noException` | `setLevel` boundary values (-1, 9, 0) ไม่ throw |
| `testSetMethod_changesDefault` | `setMethod`, `setDefaults()` ตั้ง method เมื่อ -1 |
| `testCanWriteEntryData_zipEntryDefault_true` | `canWriteEntryData` instanceof true, ZipUtil.canHandleEntryData true |
| `testCanWriteEntryData_nonZipArchiveEntry_false` | `canWriteEntryData` instanceof false |
| `testWrite_noCurrentEntry_throws` | `write()` — entry==null → IllegalStateException |
| `testPutArchiveEntry_afterFinished_throws` | `putArchiveEntry` — finished==true |
| `testPutArchiveEntry_storedWithoutSize_nonSeekable_throws` | `validateSizeInformation` — STORED & size UNKNOWN & channel==null |
| `testPutArchiveEntry_storedWithoutCrc_nonSeekable_throws` | `validateSizeInformation` — CRC UNKNOWN & channel==null |
| `testPutArchiveEntry_stored_seekable_noSizeCrcRequired` | channel!=null → skip size/crc check, `rewriteSizesAndCrc` |
| `testPutArchiveEntry_autoClosesPreviousEntry` | `putArchiveEntry` — entry!=null → auto `closeArchiveEntry()` |
| `testCloseArchiveEntry_noCurrentEntry_throws` | `preClose()` — entry==null |
| `testCloseArchiveEntry_afterFinished_throws` | `preClose()` — finished==true |
| `testCloseArchiveEntry_badCrc_forStored_nonSeekable_throws` | `handleSizesAndCrc` — CRC mismatch branch |
| `testCloseArchiveEntry_badSize_forStored_nonSeekable_throws` | `handleSizesAndCrc` — size mismatch branch |
| `testCloseArchiveEntry_deflatedDefaultMethod_roundTrip` | DEFLATED branch ใน `handleSizesAndCrc`, `flushDeflater`, `writeDataDescriptor` (DEFLATED & channel==null) |
| `testFinish_calledTwice_throws` | `finish()` — finished==true |
| `testFinish_withUnclosedEntry_throws` | `finish()` — entry!=null |
| `testFinish_emptyArchive_producesValidEOCD` | `writeCentralDirectoryInChunks` loop กับ list ว่าง, `writeZip64CentralDirectory` — hasUsedZip64 false → return early |
| `testClose_callsFinishAutomatically` | `close()` — !finished → finish() |
| `testClose_calledTwice_doesNotThrow` | `close()` — finished==true → skip finish(), เรียก destroy() อีกครั้ง |
| `testFlush_withUnderlyingOutputStream_noException` | `flush()` — out!=null |
| `testFlush_withChannelOnly_noException` | `flush()` — out==null |
| `testCreateArchiveEntry_returnsZipArchiveEntry` | `createArchiveEntry` ปกติ |
| `testCreateArchiveEntry_afterFinished_throws` | `createArchiveEntry` — finished==true |
| `testAddRawArchiveEntry_storedTwoPhase_roundTrip` | `addRawArchiveEntry`, `is2PhaseSource==true`, `closeCopiedEntry(phased=true)` — skip rewriteSizesAndCrc/writeDataDescriptor, `preClose` — hasWritten==true branch |
| `testSetUseZip64_alwaysMode_smallEntry_stillValidArchive` | `shouldAddZip64Extra` — mode==Always branch, `handleZip64Extra`, `createCentralFileHeader` zip64 branch |

**หมายเหตุ:** เงื่อนไขที่เกี่ยวกับ `Zip64RequiredException` จากขนาดไฟล์เกิน 4GB หรือจำนวน entry เกิน 65536 (Zip64Mode.Never) ไม่ได้ทดสอบจริง เนื่องจากต้องสร้างข้อมูลขนาดใหญ่มากซึ่งไม่เหมาะกับ unit test — ระบุเป็นข้อจำกัดตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ตรวจสอบไม่ได้จริงในขอบเขตทดสอบที่เหมาะสม)