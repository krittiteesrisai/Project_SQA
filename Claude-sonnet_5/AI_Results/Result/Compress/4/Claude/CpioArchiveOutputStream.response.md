# บทวิเคราะห์และชุดทดสอบ JUnit 4

**หมายเหตุสำคัญเกี่ยวกับข้อสมมติฐาน (ตามข้อกำหนดที่ 4):**
เนื่องจากซอร์สโค้ดของ `CpioArchiveEntry` และ `CpioConstants` ไม่ได้ให้มาโดยตรง ผมอ้างอิง API จาก Apache Commons Compress (constructor `CpioArchiveEntry(short format, String name, long size)`, getters/setters เช่น `setTime`, `setChksum`, `setNumberOfLinks`, และ constants `FORMAT_NEW`, `FORMAT_NEW_CRC`, `FORMAT_OLD_ASCII`, `FORMAT_OLD_BINARY`, `CPIO_TRAILER`) — จุดใดที่ไม่มั่นใจ 100% จะมีคอมเมนต์กำกับไว้ในโค้ด

**สิ่งที่พบระหว่างวิเคราะห์ (สำคัญ):** เมธอด `finish()` มีการตรวจ `if (this.finished) return;` แต่ **ไม่มีจุดใดใน source ที่ set `this.finished = true;`** เลย ทำให้ฟิลด์นี้ไม่ทำงานตามที่ตั้งใจ (นี่คือ fault ที่ Defects4J Compress-4b มุ่งเป้า) — ผมเขียนเทสเพื่อดักจับปัญหานี้โดยเฉพาะ (`testFinish_CalledTwice_ShouldBeIdempotent_KNOWN_DEFECT`)

```java
package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

/**
 * JUnit4 test suite for CpioArchiveOutputStream (Defects4J Compress-4b).
 *
 * ข้อสมมติฐานเกี่ยวกับ CpioArchiveEntry API (ไม่ได้ให้ source มาตรง ๆ):
 *  - constructor: CpioArchiveEntry(short format, String name, long size)
 *  - setTime(long), setNumberOfLinks(long), setChksum(long)
 *  - getTime() คืน -1 เป็นค่า default ถ้ายังไม่ได้ set (ตามที่ระบุใน putArchiveEntry)
 *  - CpioConstants.FORMAT_NEW / FORMAT_NEW_CRC / FORMAT_OLD_ASCII / FORMAT_OLD_BINARY
 *    และ CPIO_TRAILER เป็น constants ที่มีอยู่จริงตามอินเตอร์เฟส CpioConstants
 * หากชื่อเมธอด/constructor จริงต่างจากนี้ ต้องปรับ helper method createEntry() ให้ตรง
 */
public class CpioArchiveOutputStreamTest {

    // ---------- Helper ----------
    private CpioArchiveEntry createEntry(short format, String name, long size, long time) {
        CpioArchiveEntry e = new CpioArchiveEntry(format, name, size);
        e.setTime(time);
        e.setNumberOfLinks(1);
        return e;
    }

    private static final short[] VALID_FORMATS = new short[] {
            CpioConstants.FORMAT_NEW,
            CpioConstants.FORMAT_NEW_CRC,
            CpioConstants.FORMAT_OLD_ASCII,
            CpioConstants.FORMAT_OLD_BINARY
    };

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorSingleArg_DefaultsToFormatNew() throws IOException {
        // ตรวจสอบว่า constructor เดียว (out) ไม่ throw และใช้ format ที่ถูกต้อง
        // (ยืนยันทางอ้อมผ่าน putArchiveEntry ที่ format ต้องตรงกับ FORMAT_NEW)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "f1", 0, 0);
        cos.putArchiveEntry(e); // ถ้า default format ไม่ตรงกับ FORMAT_NEW จะ throw IOException
        cos.closeArchiveEntry();
    }

    @Test
    public void testConstructorTwoArgs_ValidFormats_NoException() throws IOException {
        // ครอบคลุมทุก case ใน switch (format) ของ constructor - branch: break ทั้ง 4 case
        for (int i = 0; i < VALID_FORMATS.length; i++) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, VALID_FORMATS[i]);
            assertNotNull(cos);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTwoArgs_InvalidFormat_ThrowsException() {
        // ครอบคลุม default branch ของ switch (format) ใน constructor
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(baos, (short) 9999);
    }

    // ---------- ensureOpen / close tests ----------

    @Test
    public void testWriteAfterClose_ThrowsIOExceptionStreamClosed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        cos.close();
        try {
            cos.write(new byte[] { 1 }, 0, 1);
            fail("Expected IOException: Stream closed");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void testClose_Idempotent_CalledTwiceNoException() throws IOException {
        // close() ควรทำงานได้แม้เรียกซ้ำ (branch if(!closed))
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        cos.close();
        cos.close(); // ต้องไม่ throw ซ้ำ
    }

    // ---------- putArchiveEntry tests ----------

    @Test
    public void testPutArchiveEntry_TimeMinusOneAutoSetsCurrentTime() throws IOException {
        // branch: if (e.getTime() == -1) e.setTime(currentTimeMillis())
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry e = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "f1", 0);
        // ไม่เรียก setTime -> คาดว่า default = -1 (ตามสมมติฐาน)
        assertEquals(-1, e.getTime());
        cos.putArchiveEntry(e);
        assertTrue("time should have been auto-set", e.getTime() != -1);
        cos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_FormatMismatch_ThrowsIOException() throws IOException {
        // branch: if (format != this.entryFormat) throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_OLD_ASCII, "f1", 0, 0);
        try {
            cos.putArchiveEntry(e);
            fail("Expected IOException due to format mismatch");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("does not match existing format") >= 0);
        }
    }

    @Test
    public void testPutArchiveEntry_DuplicateName_ThrowsIOException() throws IOException {
        // branch: if (this.names.put(...) != null) throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e1 = createEntry(CpioConstants.FORMAT_NEW, "dup", 0, 0);
        cos.putArchiveEntry(e1);
        cos.closeArchiveEntry();

        CpioArchiveEntry e2 = createEntry(CpioConstants.FORMAT_NEW, "dup", 0, 0);
        try {
            cos.putArchiveEntry(e2);
            fail("Expected IOException due to duplicate entry name");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("duplicate entry") >= 0);
        }
    }

    @Test
    public void testPutArchiveEntry_AutoClosesPreviousEntry() throws IOException {
        // branch: if (this.entry != null) closeArchiveEntry();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e1 = createEntry(CpioConstants.FORMAT_NEW, "first", 0, 0);
        cos.putArchiveEntry(e1); // this.entry = e1, ไม่ closeArchiveEntry ด้วยตนเอง

        CpioArchiveEntry e2 = createEntry(CpioConstants.FORMAT_NEW, "second", 0, 0);
        cos.putArchiveEntry(e2); // ควร auto-close e1 (size=0 ตรงกับ written=0) แล้วเปิด e2
        cos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_PreviousEntrySizeMismatch_AutoCloseThrows() throws IOException {
        // branch: auto closeArchiveEntry() ของ entry ก่อนหน้าที่ size ไม่ตรง -> throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e1 = createEntry(CpioConstants.FORMAT_NEW, "first", 5, 0); // size=5 แต่ไม่เขียนข้อมูล
        cos.putArchiveEntry(e1);

        CpioArchiveEntry e2 = createEntry(CpioConstants.FORMAT_NEW, "second", 0, 0);
        try {
            cos.putArchiveEntry(e2);
            fail("Expected IOException from auto closeArchiveEntry() due to size mismatch");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("invalid entry size") >= 0);
        }
    }

    // ---------- writeHeader / writeNewEntry / writeOldAsciiEntry / writeOldBinaryEntry ----------

    @Test
    public void testWriteHeader_AllFormats_NoExceptionAndOutputProduced() throws IOException {
        // ครอบคลุมทุก case ของ switch (e.getFormat()) ใน writeHeader()
        for (int i = 0; i < VALID_FORMATS.length; i++) {
            short fmt = VALID_FORMATS[i];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, fmt);
            CpioArchiveEntry e = createEntry(fmt, "file_" + i, 0, 0);
            cos.putArchiveEntry(e);
            cos.closeArchiveEntry();
            assertTrue("header bytes should have been written for format " + fmt,
                    baos.size() > 0);
        }
    }

    @Test
    public void testWriteAsciiLong_OverflowBranch_TruncatesToLastNChars() throws IOException {
        // branch: tmp.length() > length -> tmpStr = tmp.substring(tmp.length()-length)
        // ใช้ size ที่แปลงเป็น hex แล้วยาวเกิน 8 ตัวอักษร (field length ของ size ใน FORMAT_NEW คือ 8, radix16)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        long hugeSize = 0x100000000L; // hex = "100000000" ยาว 9 ตัว > 8
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "bigfile", hugeSize, 0);
        cos.putArchiveEntry(e); // ต้องไม่ throw แม้ size เกิน field length (แค่ truncate)
        // ไม่ปิด entry เพราะไม่ต้องการเขียนข้อมูลจริงจำนวนมาก
    }

    // ---------- closeArchiveEntry tests ----------

    @Test
    public void testCloseArchiveEntry_SizeMismatch_ThrowsIOException() throws IOException {
        // branch: if (this.entry.getSize() != this.written) throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "f1", 5, 0);
        cos.putArchiveEntry(e);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException due to size mismatch");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("invalid entry size") >= 0);
        }
    }

    @Test
    public void testCloseArchiveEntry_CrcMismatch_ThrowsIOException() throws IOException {
        // branch: format==FORMAT_NEW_CRC && this.crc != entry.getChksum() -> throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW_CRC, "f1", 3, 0);
        e.setChksum(999); // ค่าไม่ตรงกับ sum จริง (1+2+3=6)
        cos.putArchiveEntry(e);
        cos.write(new byte[] { 1, 2, 3 }, 0, 3);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException: CRC Error");
        } catch (IOException expected) {
            assertEquals("CRC Error", expected.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntry_CrcMatch_Success() throws IOException {
        // branch: format==FORMAT_NEW_CRC && crc == chksum -> ไม่ throw
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW_CRC, "f1", 3, 0);
        e.setChksum(6); // 1+2+3 = 6
        cos.putArchiveEntry(e);
        cos.write(new byte[] { 1, 2, 3 }, 0, 3);
        cos.closeArchiveEntry(); // ต้องไม่ throw
    }

    // ---------- write(byte[], int, int) tests ----------

    @Test
    public void testWrite_NegativeOffset_ThrowsIndexOutOfBounds() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        try {
            cos.write(new byte[] { 1, 2, 3 }, -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // ok
        }
    }

    @Test
    public void testWrite_NegativeLen_ThrowsIndexOutOfBounds() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        try {
            cos.write(new byte[] { 1, 2, 3 }, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // ok
        }
    }

    @Test
    public void testWrite_OffsetPlusLenExceedsArrayLength_ThrowsIndexOutOfBounds() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        try {
            // b.length=5, off=3, len=3 -> off > (b.length-len)=2 -> true
            cos.write(new byte[5], 3, 3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // ok
        }
    }

    @Test
    public void testWrite_LenZero_ReturnsWithoutExceptionEvenWithoutCurrentEntry() throws IOException {
        // branch: else if (len == 0) return; -- ทดสอบว่า return ก่อนถึง check entry==null
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        cos.write(new byte[0], 0, 0); // ไม่มี current entry แต่ len=0 ต้องไม่ throw
    }

    @Test
    public void testWrite_NoCurrentEntry_ThrowsIOException() throws IOException {
        // branch: if (this.entry == null) throw IOException("no current CPIO entry")
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        try {
            cos.write(new byte[] { 1 }, 0, 1);
            fail("Expected IOException: no current CPIO entry");
        } catch (IOException expected) {
            assertEquals("no current CPIO entry", expected.getMessage());
        }
    }

    @Test
    public void testWrite_ExceedsEntrySize_ThrowsIOException() throws IOException {
        // branch: if (this.written + len > this.entry.getSize()) throw IOException
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "f1", 2, 0);
        cos.putArchiveEntry(e);
        try {
            cos.write(new byte[] { 1, 2, 3 }, 0, 3); // 3 > size(2)
            fail("Expected IOException: attempt to write past end of STORED entry");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("attempt to write past end") >= 0);
        }
    }

    @Test
    public void testWrite_CrcAccumulation_ForFormatNewCrc() throws IOException {
        // branch: if (this.entry.getFormat() == FORMAT_NEW_CRC) { for-loop accumulate crc }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW_CRC, "f1", 4, 0);
        e.setChksum(10); // 1+2+3+4=10
        cos.putArchiveEntry(e);
        cos.write(new byte[] { 1, 2, 3, 4 }, 0, 4);
        cos.closeArchiveEntry(); // ถ้า crc ไม่ถูกสะสมถูกต้อง จะ throw CRC Error ที่นี่
    }

    @Test
    public void testWrite_NoCrcAccumulation_ForNonCrcFormat() throws IOException {
        // branch: else ของ if(format==FORMAT_NEW_CRC) - ไม่ต้องคำนวณ crc
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "f1", 4, 0);
        cos.putArchiveEntry(e);
        cos.write(new byte[] { 1, 2, 3, 4 }, 0, 4);
        cos.closeArchiveEntry(); // ไม่ควร throw เพราะ format ไม่ใช่ NEW_CRC จึงไม่ตรวจ crc
    }

    // ---------- finish() tests ----------

    @Test
    public void testFinish_UnclosedEntry_ThrowsIOException() throws IOException {
        // branch: if (this.entry != null) throw IOException("...unclosed entries...")
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e = createEntry(CpioConstants.FORMAT_NEW, "f1", 0, 0);
        cos.putArchiveEntry(e); // ไม่ closeArchiveEntry
        try {
            cos.finish();
            fail("Expected IOException: unclosed entries");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().indexOf("unclosed entries") >= 0);
        }
    }

    @Test
    public void testFinish_WritesTrailerSuccessfully() throws IOException {
        // branch: this.entry==null -> เขียน trailer entry สำเร็จ
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        assertTrue("trailer should have been written", baos.size() > 0);
    }

    /**
     * FAULT-FINDING TEST:
     * ตาม logic ของ finish() ควรจะ idempotent (เรียกซ้ำแล้วไม่ทำอะไรเพิ่ม)
     * เพราะมีการตรวจ `if (this.finished) return;`
     * แต่จากการอ่าน source พบว่าไม่มีจุดใด set `this.finished = true;`
     * ดังนั้น การเรียก finish() ครั้งที่สองจะเขียน trailer ซ้ำอีกครั้ง (ไม่ idempotent)
     * เทสนี้แสดง expected behavior ที่ถูกต้อง (ตาม intent ของโค้ด/คอมเมนต์)
     * และจะ FAIL บนโค้ดปัจจุบันซึ่งมี defect นี้อยู่ (Defects4J Compress-4b)
     */
    @Test
    public void testFinish_CalledTwice_ShouldBeIdempotent_KNOWN_DEFECT() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        int sizeAfterFirst = baos.size();
        cos.finish(); // ควรเป็น no-op ถ้า finished flag ถูก set อย่างถูกต้อง
        int sizeAfterSecond = baos.size();
        assertEquals(
            "finish() ควร idempotent แต่พบว่ามีการเขียน trailer ซ้ำ "
                + "(fault: field 'finished' ไม่ถูก set เป็น true ใน finish())",
            sizeAfterFirst, sizeAfterSecond);
    }

    @Test
    public void testEnsureOpen_FinishAfterClose_ThrowsIOException() throws IOException {
        // branch: ensureOpen() ภายใน finish() -> throw ถ้า closed แล้ว
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        cos.close();
        try {
            cos.finish();
            fail("Expected IOException: Stream closed");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry_ReturnsCpioArchiveEntryWithCorrectName() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        ArchiveEntry ae = cos.createArchiveEntry(new File("nonexistent-file.txt"), "entryNameXYZ");
        assertTrue(ae instanceof CpioArchiveEntry);
        assertEquals("entryNameXYZ", ae.getName());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorSingleArg_DefaultsToFormatNew` | Constructor เดี่ยว → เรียก `this(out, FORMAT_NEW)` |
| `testConstructorTwoArgs_ValidFormats_NoException` | switch(format) case FORMAT_NEW/NEW_CRC/OLD_ASCII/OLD_BINARY (break) |
| `testConstructorTwoArgs_InvalidFormat_ThrowsException` | switch(format) default → IllegalArgumentException |
| `testWriteAfterClose_ThrowsIOExceptionStreamClosed` | `ensureOpen()`: `if(closed)` = true |
| `testClose_Idempotent_CalledTwiceNoException` | `close()`: `if(!closed)` true แล้ว false |
| `testPutArchiveEntry_TimeMinusOneAutoSetsCurrentTime` | `if(e.getTime()==-1)` = true |
| `testPutArchiveEntry_FormatMismatch_ThrowsIOException` | `if(format != entryFormat)` = true |
| `testPutArchiveEntry_DuplicateName_ThrowsIOException` | `if(names.put(...) != null)` = true |
| `testPutArchiveEntry_AutoClosesPreviousEntry` | `if(this.entry != null) closeArchiveEntry()` = true (สำเร็จ) |
| `testPutArchiveEntry_PreviousEntrySizeMismatch_AutoCloseThrows` | auto-close ภายใน putArchiveEntry ที่ size mismatch |
| `testWriteHeader_AllFormats_NoExceptionAndOutputProduced` | switch(e.getFormat()) ทุก case ใน `writeHeader` |
| `testWriteAsciiLong_OverflowBranch_TruncatesToLastNChars` | `writeAsciiLong`: `tmp.length() > length` = true (substring) |
| `testCloseArchiveEntry_SizeMismatch_ThrowsIOException` | `if(getSize() != written)` = true |
| `testCloseArchiveEntry_CrcMismatch_ThrowsIOException` | `if(format==FORMAT_NEW_CRC)` true และ `crc != chksum` true |
| `testCloseArchiveEntry_CrcMatch_Success` | `if(format==FORMAT_NEW_CRC)` true และ `crc == chksum` |
| `testWrite_NegativeOffset_ThrowsIndexOutOfBounds` | `write()`: `off<0` = true |
| `testWrite_NegativeLen_ThrowsIndexOutOfBounds` | `write()`: `len<0` = true |
| `testWrite_OffsetPlusLenExceedsArrayLength_ThrowsIndexOutOfBounds` | `write()`: `off > b.length-len` = true |
| `testWrite_LenZero_ReturnsWithoutExceptionEvenWithoutCurrentEntry` | `else if(len==0) return` = true (ก่อนถึง entry==null check) |
| `testWrite_NoCurrentEntry_ThrowsIOException` | `if(this.entry==null)` = true |
| `testWrite_ExceedsEntrySize_ThrowsIOException` | `if(written+len > getSize())` = true |
| `testWrite_CrcAccumulation_ForFormatNewCrc` | `if(format==FORMAT_NEW_CRC)` true → for-loop สะสม crc |
| `testWrite_NoCrcAccumulation_ForNonCrcFormat` | `if(format==FORMAT_NEW_CRC)` = false |
| `testFinish_UnclosedEntry_ThrowsIOException` | `finish()`: `if(entry != null)` = true |
| `testFinish_WritesTrailerSuccessfully` | `finish()`: happy path (entry==null, finished==false) |
| `testFinish_CalledTwice_ShouldBeIdempotent_KNOWN_DEFECT` | `finish()`: `if(this.finished) return;` — **ดักจับ fault จริง** (flag ไม่ถูก set) |
| `testEnsureOpen_FinishAfterClose_ThrowsIOException` | `finish()` → `ensureOpen()` = throw |
| `testCreateArchiveEntry_ReturnsCpioArchiveEntryWithCorrectName` | `createArchiveEntry()` path เดียว (ไม่มี branch แต่ยืนยัน behavior) |

**หมายเหตุ:** branch `else` ของ `writeAsciiLong` (radix ไม่ใช่ 16/8) เป็น dead code ที่เข้าไม่ถึงผ่าน public API เนื่องจากถูกเรียกจากภายในด้วย radix คงที่ (16 หรือ 8) เท่านั้น จึงไม่ได้เขียนเทสสำหรับ branch นี้ตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่สามารถยืนยันได้)