# ชุดทดสอบ JUnit 4 สำหรับ `TarArchiveOutputStream`

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * Unit tests for TarArchiveOutputStream (Defects4J Compress-4b)
 *
 * หมายเหตุ:
 * - ใช้ recordSize=100 ในหลาย test เพื่อให้คำนวณ boundary ของ assembly buffer
 *   ได้ง่ายและไม่ผูกกับค่า default จริงของ TarBuffer.DEFAULT_RCDSIZE
 * - สมมติว่า TarArchiveEntry(String) จะกำหนด isDirectory()=true เมื่อชื่อลงท้ายด้วย '/'
 *   ตามพฤติกรรมปกติของ Apache Commons Compress (ไม่มีซอร์สของ TarArchiveEntry ให้ตรวจสอบ)
 * - สมมติว่า TarConstants.NAMELEN คือค่าที่กำหนดความยาวชื่อไฟล์สูงสุดแบบ UStar (โดยทั่วไป = 100)
 */
public class TarArchiveOutputStreamTest {

    // ---------- Helper ----------

    private String createLongName() {
        // ยาวเกิน NAMELEN แน่นอน (NAMELEN ปกติ = 100)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 50; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorDefault() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        assertNotNull(tos);
    }

    @Test
    public void testConstructorWithBlockSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 10240);
        assertNotNull(tos);
    }

    @Test
    public void testConstructorWithBlockAndRecordSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 10240, 1024);
        assertEquals(1024, tos.getRecordSize());
    }

    // ---------- getRecordSize ----------

    @Test
    public void testGetRecordSizeCustom() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        assertEquals(100, tos.getRecordSize());
    }

    // ---------- finish() ----------

    @Test
    public void testFinishWithoutUnclosedEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.finish(); // ไม่มี entry ค้าง -> ไม่ควร throw
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntryThrows() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        // ไม่เรียก closeArchiveEntry() -> haveUnclosedEntry ยังเป็น true
        tos.finish();
    }

    // ---------- close() ----------

    @Test
    public void testCloseIsIdempotent() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.close(); // closed=false -> finish() + close underlying
        tos.close(); // closed=true -> ไม่ทำอะไร, ไม่ throw
    }

    // ---------- flush() ----------

    @Test
    public void testFlush() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.flush(); // ควรเรียก out.flush() โดยไม่ throw
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        File tmp = File.createTempFile("tarTest", ".tmp");
        tmp.deleteOnExit();
        org.apache.commons.compress.archivers.ArchiveEntry entry =
                tos.createArchiveEntry(tmp, "customName");
        assertTrue(entry instanceof TarArchiveEntry);
        assertEquals("customName", entry.getName());
    }

    // ---------- putArchiveEntry: short name / normal file ----------

    @Test
    public void testPutArchiveEntryNormalFileThenClose() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("normal.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry(); // currBytes(0) == currSize(0) -> ok
    }

    // ---------- putArchiveEntry: directory ----------

    @Test
    public void testPutArchiveEntryDirectorySetsCurrSizeZero() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry dirEntry = new TarArchiveEntry("someDir/");
        dirEntry.setSize(999); // แม้กำหนด size ไว้ แต่เป็น directory -> currSize ถูกบังคับเป็น 0
        assertTrue(dirEntry.isDirectory());
        tos.putArchiveEntry(dirEntry);
        tos.closeArchiveEntry(); // ถ้า currSize ไม่ถูกบังคับเป็น 0 จะ throw ตรงนี้
    }

    // ---------- putArchiveEntry: long name, LONGFILE_ERROR (default) ----------

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntryLongNameDefaultModeThrows() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);
        // ไม่เรียก setLongFileMode -> default = LONGFILE_ERROR
        tos.putArchiveEntry(entry);
    }

    // ---------- putArchiveEntry: long name, LONGFILE_TRUNCATE ----------

    @Test
    public void testPutArchiveEntryLongNameTruncateModeDoesNotThrow() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);
        tos.putArchiveEntry(entry); // ไม่ throw เพราะ longFileMode == LONGFILE_TRUNCATE
        tos.closeArchiveEntry();
    }

    // ---------- putArchiveEntry: long name, LONGFILE_GNU ----------

    @Test
    public void testPutArchiveEntryLongNameGnuModeWritesLongLink() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);
        tos.putArchiveEntry(entry); // สร้าง longLinkEntry ภายใน แล้วเขียน header จริงต่อ
        tos.closeArchiveEntry();    // ปิด entry จริง (ไม่ใช่ longlink ซึ่งถูกปิดไปแล้วภายใน)
    }

    // ---------- closeArchiveEntry: currBytes < currSize -> IOException ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryThrowsWhenNotEnoughDataWritten() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("incomplete.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        // ไม่เขียนข้อมูลเลย
        tos.closeArchiveEntry();
    }

    // ---------- write(): exceed declared size -> IOException ----------

    @Test(expected = IOException.class)
    public void testWriteExceedsDeclaredSizeThrows() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[10];
        tos.write(data, 0, 10); // 0 + 10 > 5 -> throw
    }

    // ---------- write(): assembly buffer path (assemLen>0, merge into full record) ----------

    @Test
    public void testWriteAssemblyMergeIntoFullRecord() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // recordSize = 100 เพื่อคำนวณ boundary ง่าย
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        TarArchiveEntry entry = new TarArchiveEntry("assembly1.txt");
        entry.setSize(120); // 30 + 90 = 120 รวม
        tos.putArchiveEntry(entry);

        byte[] first = new byte[30];
        tos.write(first, 0, 30); // assemLen=0 -> เข้า while loop -> numToWrite<100 -> assemLen=30

        byte[] second = new byte[90];
        tos.write(second, 0, 90);
        // assemLen(30)>0: (30+90)=120 >= 100(recordBuf.length) -> merge เป็น full record แล้วเหลือ 20 ใน assemBuf

        tos.closeArchiveEntry(); // flush ส่วนที่เหลือ (20 bytes) -> currBytes ควร = 120 = currSize
    }

    // ---------- write(): assembly buffer path (assemLen>0, stays partial) ----------

    @Test
    public void testWriteAssemblyStaysPartial() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        TarArchiveEntry entry = new TarArchiveEntry("assembly2.txt");
        entry.setSize(70); // 30 + 40 = 70

        tos.putArchiveEntry(entry);

        byte[] first = new byte[30];
        tos.write(first, 0, 30); // assemLen=30

        byte[] second = new byte[40];
        tos.write(second, 0, 40);
        // assemLen(30)>0: (30+40)=70 < 100 -> ไม่ merge, สะสมต่อใน assemBuf (assemLen=70)

        tos.closeArchiveEntry(); // flush 70 bytes -> currBytes=70=currSize
    }

    // ---------- write(): while-loop with a full record directly (assemLen==0 initially) ----------

    @Test
    public void testWriteFullRecordDirectlyNoAssembly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        TarArchiveEntry entry = new TarArchiveEntry("fullrecord.txt");
        entry.setSize(100);
        tos.putArchiveEntry(entry);

        byte[] data = new byte[100];
        tos.write(data, 0, 100);
        // assemLen=0 (if ถูกข้าม) -> while loop: numToWrite(100) ไม่ < recordBuf.length(100)
        // -> เขียนเต็ม record ตรง ๆ, currBytes += 100

        tos.closeArchiveEntry(); // currBytes(100)==currSize(100) -> ok
    }

    // ---------- write(): while-loop หลาย record + remainder (assemLen==0 initially) ----------

    @Test
    public void testWriteMultipleFullRecordsPlusRemainder() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        TarArchiveEntry entry = new TarArchiveEntry("multirecord.txt");
        entry.setSize(250); // 2 full records (100+100) + 50 remainder
        tos.putArchiveEntry(entry);

        byte[] data = new byte[250];
        tos.write(data, 0, 250);
        // while loop วน 2 ครั้งเขียน full record (currBytes=200)
        // ครั้งที่ 3: numToWrite=50 < 100 -> เข้า assemBuf, break

        tos.closeArchiveEntry(); // flush ส่วนที่เหลือ 50 -> currBytes=250=currSize
    }

    // ---------- write(): small write directly into assembly buffer (branch: numToWrite<recordBuf.length, assemLen==0) ----------

    @Test
    public void testWriteSmallChunkGoesDirectlyToAssemblyBuffer() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos, 2000, 100);
        TarArchiveEntry entry = new TarArchiveEntry("smallchunk.txt");
        entry.setSize(20);
        tos.putArchiveEntry(entry);

        byte[] data = new byte[20];
        tos.write(data, 0, 20); // assemLen=0 -> while loop -> 20<100 -> assemLen=20, break

        tos.closeArchiveEntry(); // flush 20 bytes -> currBytes=20=currSize
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorDefault` | Constructor (1 พารามิเตอร์) — delegate chain |
| `testConstructorWithBlockSize` | Constructor (2 พารามิเตอร์) — delegate chain |
| `testConstructorWithBlockAndRecordSize` | Constructor (3 พารามิเตอร์) หลัก + `getRecordSize()` |
| `testGetRecordSizeCustom` | `getRecordSize()` คืนค่าตาม TarBuffer ที่กำหนด |
| `testFinishWithoutUnclosedEntry` | `finish()` — เงื่อนไข `haveUnclosedEntry == false` |
| `testFinishWithUnclosedEntryThrows` | `finish()` — เงื่อนไข `haveUnclosedEntry == true` → throw IOException |
| `testCloseIsIdempotent` | `close()` — `if(!closed)` true (ครั้งแรก) และ false (ครั้งที่สอง) |
| `testFlush` | `flush()` — ตรวจว่าไม่ throw exception |
| `testCreateArchiveEntry` | `createArchiveEntry(File, String)` |
| `testPutArchiveEntryNormalFileThenClose` | `putArchiveEntry` เส้นทาง short name + `isDirectory()==false`; `closeArchiveEntry` เมื่อ `assemLen==0` และ `currBytes==currSize` |
| `testPutArchiveEntryDirectorySetsCurrSizeZero` | `putArchiveEntry` เงื่อนไข `entry.isDirectory()==true` → `currSize=0` |
| `testPutArchiveEntryLongNameDefaultModeThrows` | `putArchiveEntry` เงื่อนไข name ยาว + `longFileMode==LONGFILE_ERROR` (else-if ที่ throw RuntimeException) |
| `testPutArchiveEntryLongNameTruncateModeDoesNotThrow` | `putArchiveEntry` เงื่อนไข name ยาว + `longFileMode==LONGFILE_TRUNCATE` (ไม่ throw) |
| `testPutArchiveEntryLongNameGnuModeWritesLongLink` | `putArchiveEntry` เงื่อนไข name ยาว + `longFileMode==LONGFILE_GNU` (สร้าง longLinkEntry, เรียก recursive putArchiveEntry, write, closeArchiveEntry) |
| `testCloseArchiveEntryThrowsWhenNotEnoughDataWritten` | `closeArchiveEntry()` เงื่อนไข `currBytes < currSize` → throw IOException |
| `testWriteExceedsDeclaredSizeThrows` | `write()` เงื่อนไข `(currBytes+numToWrite) > currSize` → throw IOException |
| `testWriteAssemblyMergeIntoFullRecord` | `write()` เงื่อนไข `assemLen>0` และ `(assemLen+numToWrite) >= recordBuf.length` (merge → full record write) |
| `testWriteAssemblyStaysPartial` | `write()` เงื่อนไข `assemLen>0` และ `(assemLen+numToWrite) < recordBuf.length` (สะสมต่อใน assemBuf) |
| `testWriteFullRecordDirectlyNoAssembly` | `write()` while-loop เงื่อนไข `numToWrite < recordBuf.length` เป็น false (เขียน full record ตรง ๆ) |
| `testWriteMultipleFullRecordsPlusRemainder` | `write()` while-loop วนหลายรอบ (full record หลายครั้ง) + remainder เข้า assemBuf และ `break` |
| `testWriteSmallChunkGoesDirectlyToAssemblyBuffer` | `write()` while-loop เงื่อนไข `numToWrite < recordBuf.length` เป็น true ตั้งแต่ต้น (เข้า assemBuf ทันที) |

**ข้อสังเกต/ข้อจำกัดที่ต้องระวัง (comment กำกับในโค้ด):**
- สมมติว่า `TarArchiveEntry(String)` กำหนด `isDirectory()==true` เมื่อชื่อลงท้ายด้วย `/` (พฤติกรรมมาตรฐานของ Commons Compress แต่ไม่มีซอร์สให้ตรวจสอบตรงในโจทย์นี้)
- ใช้ `recordSize=100` ในหลาย test เพื่อควบคุม boundary ของ assembly buffer ให้แน่นอน ไม่ผูกกับค่า default จริงของ `TarBuffer`
- ไม่ได้ทดสอบ `write(int)` โดยตรงเนื่องจากไม่มีการ override ในคลาสนี้ (มาจาก `ArchiveOutputStream`/`OutputStream` ซึ่งไม่มีซอร์สให้วิเคราะห์)