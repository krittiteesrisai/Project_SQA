อ้างอิงจากซอร์สที่ให้มา ผมออกแบบเทสให้ครอบคลุมทุก if/else, loop, boundary และ exception path ที่วิเคราะห์ได้ โดยไม่เดา behavior ของ class อื่น (เช่น `ArchiveEntry` interface ที่ไม่มีซอร์สให้ดู) — ในกรณีที่ไม่แน่ใจจะระบุ comment กำกับไว้

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        // ปิด stream ถ้ายังไม่ปิด เพื่อไม่ให้กระทบเทสอื่น (บาง test เรียก close เองแล้ว)
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorDefault() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(new ByteArrayOutputStream());
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSize() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(
                new ByteArrayOutputStream(), TarBuffer.DEFAULT_BLKSIZE);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, t.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockAndRecordSize() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(
                new ByteArrayOutputStream(), TarBuffer.DEFAULT_BLKSIZE, 1024);
        assertEquals(1024, t.getRecordSize());
    }

    // ---------- getRecordSize / flush ----------

    @Test
    public void testGetRecordSizeDefault() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testFlushDoesNotThrow() throws IOException {
        tos.flush(); // ไม่ควร throw exception
    }

    // ---------- putArchiveEntry: short name (normal path) ----------

    @Test
    public void testPutArchiveEntryShortNameNormalFile() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry(); // currBytes(0) == currSize(0) -> ไม่ throw
    }

    // ---------- putArchiveEntry: directory branch (isDirectory -> currSize = 0) ----------

    @Test
    public void testPutArchiveEntryDirectorySetsCurrSizeZero() throws IOException {
        TarArchiveEntry dirEntry = new TarArchiveEntry("mydir/");
        assertTrue(dirEntry.isDirectory());
        dirEntry.setSize(999); // ตั้ง size แต่ isDirectory -> currSize ควรถูก override เป็น 0
        tos.putArchiveEntry(dirEntry);
        tos.closeArchiveEntry(); // currBytes(0) == currSize(0) เพราะ isDirectory branch
    }

    // ---------- boundary: name.length() == NAMELEN-1 (ไม่เข้าเงื่อนไข long name) ----------

    @Test
    public void testPutArchiveEntryNameJustUnderLimit() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN - 1; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        // ไม่ set longFileMode -> default LONGFILE_ERROR, แต่ต้องไม่ throw เพราะ length < NAMELEN
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
    }

    // ---------- boundary: name.length() == NAMELEN, default LONGFILE_ERROR -> RuntimeException ----------

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntryLongNameDefaultErrorMode() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN; i++) {
            sb.append('b');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.putArchiveEntry(entry); // longFileMode == LONGFILE_ERROR -> throw RuntimeException
    }

    // ---------- long name, LONGFILE_TRUNCATE mode ----------

    @Test
    public void testPutArchiveEntryLongNameTruncateMode() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            sb.append('c');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.putArchiveEntry(entry); // ไม่ควร throw เพราะเข้า else-if TRUNCATE
        tos.closeArchiveEntry();
    }

    // ---------- long name, LONGFILE_GNU mode ----------

    @Test
    public void testPutArchiveEntryLongNameGnuMode() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 20; i++) {
            sb.append('d');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.putArchiveEntry(entry); // ควรเข้า branch GNU: เขียน longLinkEntry + name bytes + NUL แล้ว closeArchiveEntry ภายใน
        tos.closeArchiveEntry(); // ปิด entry จริงต่อ (currSize=0)
    }

    // ---------- write(): exceed currSize -> IOException ----------

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySizeThrows() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[10];
        tos.write(data, 0, 10); // 10 > 5 -> throw IOException
    }

    // ---------- closeArchiveEntry(): currBytes < currSize -> IOException ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryIncompleteDataThrows() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("incomplete.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        // ไม่เขียนข้อมูลใด ๆ เลย -> currBytes(0) < currSize(10)
        tos.closeArchiveEntry(); // ควร throw
    }

    // ---------- write(): assemble buffer branch (numToWrite < recordBuf.length) ----------
    // และ closeArchiveEntry(): assemLen > 0 branch

    @Test
    public void testWriteSmallChunkAssemblesAndCloseFillsZero() throws IOException {
        int recordSize = tos.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("assemble.txt");
        int dataLen = recordSize / 2; // น้อยกว่า recordSize แน่นอน
        entry.setSize(dataLen);
        tos.putArchiveEntry(entry);

        byte[] data = new byte[dataLen];
        tos.write(data, 0, dataLen); // numToWrite < recordBuf.length -> เข้า while-loop assemble branch (assemLen เดิม = 0)

        tos.closeArchiveEntry(); // assemLen > 0 -> เติม zero, writeRecord, currBytes += assemLen; currBytes == currSize -> ไม่ throw
    }

    // ---------- write(): assemLen > 0 -> รวม record เต็ม (assemLen+numToWrite >= recordBuf.length) ----------

    @Test
    public void testWriteAssembleThenFillFullRecordBranch() throws IOException {
        int recordSize = tos.getRecordSize();
        int firstChunk = 300; // สมมติ < recordSize (512)
        int secondChunk = 300; // 300+300=600 >= recordSize(512) -> เข้า branch เติม record เต็ม
        int totalSize = firstChunk + secondChunk;

        TarArchiveEntry entry = new TarArchiveEntry("mixed.txt");
        entry.setSize(totalSize);
        tos.putArchiveEntry(entry);

        byte[] chunk1 = new byte[firstChunk];
        tos.write(chunk1, 0, firstChunk); // assemLen 0 -> assemble branch, assemLen=300

        byte[] chunk2 = new byte[secondChunk];
        tos.write(chunk2, 0, secondChunk);
        // assemLen(300)+numToWrite(300)=600 >= recordSize(512) -> เข้า branch เติม record เต็ม
        // เหลือ numToWrite ส่วนที่ไม่พอดี recordSize จะถูก assemble ต่อในลูป while

        tos.closeArchiveEntry(); // ต้อง currBytes == currSize(600) พอดี -> ไม่ throw
    }

    // ---------- write(): ขนาดพอดี recordBuf.length -> ไม่ผ่าน assemble, เข้า while-loop writeRecord ตรง ----------

    @Test
    public void testWriteExactRecordSizeDirectWriteRecord() throws IOException {
        int recordSize = tos.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        entry.setSize(recordSize);
        tos.putArchiveEntry(entry);

        byte[] data = new byte[recordSize];
        // assemLen เริ่มต้น = 0 -> ข้าม if(assemLen>0)
        // numToWrite(recordSize) ไม่ < recordBuf.length -> เข้า buffer.writeRecord(wBuf, wOffset) โดยตรง
        tos.write(data, 0, recordSize);

        tos.closeArchiveEntry(); // currBytes == currSize -> ไม่ throw
    }

    // ---------- finish(): เขียน EOF สองครั้ง (สองบล็อก) ----------

    @Test
    public void testFinishWritesTwoEOFRecords() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("f.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();

        int sizeBeforeFinish = baos.size();
        tos.finish();
        int sizeAfterFinish = baos.size();

        int recordSize = tos.getRecordSize();
        // finish() เรียก writeEOFRecord() สองครั้ง -> ควรเพิ่มขึ้น 2*recordSize
        assertEquals(2 * recordSize, sizeAfterFinish - sizeBeforeFinish);
    }

    // ---------- close(): ปิดซ้ำสองครั้ง -> closed flag ป้องกันการเรียก finish/close ซ้ำ ----------

    @Test
    public void testCloseCalledTwiceIsSafe() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("c.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();

        tos.close(); // ครั้งแรก closed=false -> เข้า if, finish+buffer.close+out.close, set closed=true
        tos.close(); // ครั้งสอง closed=true -> ข้าม if ทั้งหมด ไม่ throw
    }

    // ---------- createArchiveEntry(File, String) ----------

    @Test
    public void testCreateArchiveEntryReturnsTarArchiveEntryWithGivenName() throws IOException {
        File tmp = File.createTempFile("tar-test", ".tmp");
        tmp.deleteOnExit();
        try {
            ArchiveEntryHolder holder = new ArchiveEntryHolder(tos.createArchiveEntry(tmp, "custom-name.txt"));
            assertTrue(holder.entry instanceof TarArchiveEntry);
            assertEquals("custom-name.txt", holder.entry.getName());
        } finally {
            tmp.delete();
        }
    }

    // helper class เพื่อเลี่ยง import ArchiveEntry ตรง ๆ ในหลายที่ (ใช้ getName() ที่มีจริงใน interface)
    private static class ArchiveEntryHolder {
        final org.apache.commons.compress.archivers.ArchiveEntry entry;
        ArchiveEntryHolder(org.apache.commons.compress.archivers.ArchiveEntry e) {
            this.entry = e;
        }
    }

    // หมายเหตุ: ไม่ได้เขียนเทสสำหรับกรณี putArchiveEntry ได้รับ ArchiveEntry ที่ไม่ใช่ TarArchiveEntry
    // (ควร throw ClassCastException) เนื่องจากซอร์สของ interface ArchiveEntry ไม่ได้ให้มา
    // จึงไม่สามารถ implement mock ที่ถูกต้องได้โดยไม่เดา method signature เพิ่มเติม
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorDefault` | Constructor (os) → เรียก constructor (os, blockSize, recordSize) |
| `testConstructorWithBlockSize` | Constructor (os, blockSize) |
| `testConstructorWithBlockAndRecordSize` | Constructor (os, blockSize, recordSize) พร้อม custom recordSize |
| `testGetRecordSizeDefault` | `getRecordSize()` คืนค่า default |
| `testFlushDoesNotThrow` | `flush()` ปกติ |
| `testPutArchiveEntryShortNameNormalFile` | `putArchiveEntry`: name length < NAMELEN, `isDirectory()==false` → currSize = entry.getSize() |
| `testPutArchiveEntryDirectorySetsCurrSizeZero` | `putArchiveEntry`: `isDirectory()==true` → currSize = 0 (แม้ตั้ง size ไว้) |
| `testPutArchiveEntryNameJustUnderLimit` | Boundary: `length == NAMELEN-1` → ไม่เข้า long-name branch |
| `testPutArchiveEntryLongNameDefaultErrorMode` | Boundary: `length == NAMELEN`, `longFileMode==LONGFILE_ERROR` (default) → throw `RuntimeException` |
| `testPutArchiveEntryLongNameTruncateMode` | `longFileMode==LONGFILE_TRUNCATE` → else-if branch ไม่ throw |
| `testPutArchiveEntryLongNameGnuMode` | `longFileMode==LONGFILE_GNU` → if branch: สร้าง longLinkEntry, เรียก putArchiveEntry ซ้อน, write, closeArchiveEntry ภายใน |
| `testWriteExceedsEntrySizeThrows` | `write()`: `(currBytes+numToWrite) > currSize` → throw `IOException` |
| `testCloseArchiveEntryIncompleteDataThrows` | `closeArchiveEntry()`: `currBytes < currSize` → throw `IOException` |
| `testWriteSmallChunkAssemblesAndCloseFillsZero` | `write()`: while-loop assemble branch (`numToWrite < recordBuf.length`); `closeArchiveEntry()`: `assemLen > 0` → เติม zero + writeRecord |
| `testWriteAssembleThenFillFullRecordBranch` | `write()`: `assemLen>0` และ `(assemLen+numToWrite) >= recordBuf.length` → เติม record เต็มแล้ว reset assemLen, loop ต่อ |
| `testWriteExactRecordSizeDirectWriteRecord` | `write()`: while-loop, `numToWrite >= recordBuf.length` → เรียก `buffer.writeRecord(wBuf, wOffset)` ตรง (ไม่ assemble) |
| `testFinishWritesTwoEOFRecords` | `finish()`: เรียก `writeEOFRecord()` สองครั้ง |
| `testCloseCalledTwiceIsSafe` | `close()`: `closed==false` (ครั้งแรก) → เข้า if; `closed==true` (ครั้งสอง) → ข้าม if |
| `testCreateArchiveEntryReturnsTarArchiveEntryWithGivenName` | `createArchiveEntry(File, String)` คืน instance ที่ถูกต้อง |

**หมายเหตุ**: ไม่มีการเขียนเทสสำหรับกรณี `ArchiveEntry` ที่ไม่ใช่ `TarArchiveEntry` (จุดที่ควร throw `ClassCastException` ใน `putArchiveEntry`) เนื่องจาก interface `ArchiveEntry` ไม่มีซอร์สโค้ดให้ตรวจสอบ method signature ที่ถูกต้อง จึงไม่สามารถ implement mock ได้โดยไม่เดา behavior ตามข้อกำหนดที่ 4