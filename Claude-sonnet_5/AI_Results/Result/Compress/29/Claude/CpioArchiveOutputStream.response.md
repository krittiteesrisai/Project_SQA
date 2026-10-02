# วิเคราะห์และชุดทดสอบ

**หมายเหตุสำคัญเกี่ยวกับ `CpioArchiveEntry`:** ซอร์สโค้ดที่ให้มาไม่ได้แสดง full source ของ `CpioArchiveEntry` แต่มีการอ้างอิง getter/setter หลายตัว (เช่น `setTime`, `setName`, `setNumberOfLinks`) ผมใช้ constructor `CpioArchiveEntry(short format, String name, long size)` และ setter มาตรฐาน (`setInode`, `setDeviceMin`, `setChksum`, `setTime`) ตาม public API ทั่วไปของ Apache Commons Compress ซึ่งไม่ได้แสดงตรง ๆ ในซอร์สที่ให้มา — **จุดนี้เป็นสมมติฐาน (assumption) ที่ทำเครื่องหมายด้วยคอมเมนต์ในโค้ด**

```java
package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Before;
import org.junit.Test;

/**
 * หมายเหตุ: CpioArchiveEntry ไม่ได้ถูกให้ source มาในโจทย์
 * การเรียกใช้ constructor/setter ของ CpioArchiveEntry ในเทสนี้
 * อ้างอิงจาก public API มาตรฐานของ Apache Commons Compress
 * (สมมติฐาน - อาจไม่ตรงกับ signature จริงทุกกรณี)
 */
public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream bos;

    @Before
    public void setUp() {
        bos = new ByteArrayOutputStream();
    }

    // ================= Constructor =================

    @Test
    public void testConstructor_defaultFormat() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat() {
        new CpioArchiveOutputStream(bos, (short) 9999);
    }

    @Test
    public void testConstructor_allValidFormats() throws IOException {
        new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW).close();
        new CpioArchiveOutputStream(new ByteArrayOutputStream(), CpioConstants.FORMAT_NEW_CRC).close();
        new CpioArchiveOutputStream(new ByteArrayOutputStream(), CpioConstants.FORMAT_OLD_ASCII).close();
        new CpioArchiveOutputStream(new ByteArrayOutputStream(), CpioConstants.FORMAT_OLD_BINARY).close();
    }

    @Test
    public void testConstructor_withBlockSize() throws IOException {
        CpioArchiveOutputStream cos =
            new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW, 256);
        cos.close();
    }

    @Test
    public void testConstructor_withEncoding() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, "UTF-8");
        cos.close();
    }

    @Test
    public void testConstructor_withNullEncoding() throws IOException {
        // ตาม Javadoc: null ใช้ platform default encoding
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(
                bos, CpioConstants.FORMAT_NEW, CpioConstants.BLOCK_SIZE, null);
        cos.close();
    }

    // ================= putArchiveEntry =================

    @Test
    public void testPutArchiveEntry_setsTimeWhenMinusOne() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test", 0);
        entry.setTime(-1);
        cos.putArchiveEntry(entry);
        assertTrue(entry.getTime() != -1);
        cos.closeArchiveEntry();
        cos.close();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test", 0));
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterClosed() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test", 0));
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_formatMismatch() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "test", 0);
        cos.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_duplicateEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0));
        cos.closeArchiveEntry();
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0));
    }

    @Test
    public void testPutArchiveEntry_closesPreviousEntryAutomatically() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "a", 0));
        // ไม่เรียก closeArchiveEntry() เอง - ให้ putArchiveEntry ปิดให้อัตโนมัติ
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "b", 0));
        cos.closeArchiveEntry();
        cos.close();
    }

    @Test
    public void testPutArchiveEntry_nullNameCausesException() {
        // ไม่มีการ validate null name ใน putArchiveEntry เอง
        // แต่ writeCString -> zipEncoding.encode(null) คาดว่าจะ error
        // (ชนิด exception ไม่ระบุแน่ชัดจากซอร์สที่ให้มา จึงตรวจแค่ว่ามี exception เกิดขึ้น)
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, null, 0);
        boolean thrown = false;
        try {
            cos.putArchiveEntry(entry);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // ================= writeHeader (ผ่าน putArchiveEntry) =================

    @Test
    public void testWriteHeader_formatNew() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "new", 0));
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWriteHeader_formatNewCrc() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "newcrc", 0));
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWriteHeader_formatOldAscii() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_ASCII);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old", 0));
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWriteHeader_formatOldBinary() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_BINARY);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "oldbin", 0));
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    // ================= nextArtificalDeviceAndInode branches =================

    @Test
    public void testWriteNewEntry_artificialInodeAssigned() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "a1", 0);
        entry.setInode(0);
        entry.setDeviceMin(0);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.close();
    }

    @Test
    public void testWriteNewEntry_explicitInodeAndDevMin() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "a2", 0);
        entry.setInode(5);
        entry.setDeviceMin(1);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.close();
    }

    // ================= closeArchiveEntry =================

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        cos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterClosed() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        cos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noCurrentEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_sizeMismatch() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "size", 5));
        cos.closeArchiveEntry(); // ไม่เขียนข้อมูล -> written(0) != size(5)
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_crcMismatch() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc", 3);
        entry.setChksum(999); // checksum ผิด
        cos.putArchiveEntry(entry);
        cos.write(new byte[]{1, 2, 3}, 0, 3);
        cos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_crcMatch() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc2", 3);
        byte[] data = {1, 2, 3};
        long sum = 0;
        for (byte b : data) sum += b & 0xFF;
        entry.setChksum(sum);
        cos.putArchiveEntry(entry);
        cos.write(data, 0, data.length);
        cos.closeArchiveEntry(); // ต้องไม่ throw
        cos.close();
    }

    // ================= write =================

    @Test(expected = IOException.class)
    public void testWrite_afterClosed() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        cos.write(new byte[]{1}, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.write(new byte[10], -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeLength() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.write(new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_offsetPlusLenExceedsArrayLength() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.write(new byte[10], 5, 10); // off > b.length - len
    }

    @Test
    public void testWrite_zeroLengthReturnsEarly() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        // ไม่มี entry ปัจจุบัน แต่ len==0 ต้อง return ก่อนถึง entry==null check
        cos.write(new byte[10], 0, 0);
        cos.close();
    }

    @Test(expected = IOException.class)
    public void testWrite_noCurrentEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.write(new byte[]{1}, 0, 1);
    }

    @Test(expected = IOException.class)
    public void testWrite_pastEndOfEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "small", 2));
        cos.write(new byte[]{1, 2, 3}, 0, 3); // เกิน size 2
    }

    @Test
    public void testWrite_exactBoundarySizeSucceeds() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "boundary", 3));
        cos.write(new byte[]{1, 2, 3}, 0, 3); // written+len == size พอดี
        cos.closeArchiveEntry();
        cos.close();
    }

    @Test
    public void testWrite_crcAccumulation_newCrcFormat() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc3", 2);
        entry.setChksum(1 + 2);
        cos.putArchiveEntry(entry);
        cos.write(new byte[]{1, 2}, 0, 2);
        cos.closeArchiveEntry();
        cos.close();
    }

    @Test
    public void testWrite_noCrcAccumulation_newFormat() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "nocrc", 2);
        cos.putArchiveEntry(entry);
        cos.write(new byte[]{1, 2}, 0, 2); // ไม่สะสม crc เพราะไม่ใช่ FORMAT_NEW_CRC
        cos.closeArchiveEntry();
        cos.close();
    }

    // ================= finish =================

    @Test(expected = IOException.class)
    public void testFinish_afterClosed() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        cos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_alreadyFinished() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        cos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_unclosedEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "unclosed", 5));
        cos.finish();
    }

    @Test
    public void testFinish_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        assertTrue(bos.toByteArray().length % CpioConstants.BLOCK_SIZE == 0);
        cos.close();
    }

    @Test
    public void testFinish_noPaddingNeeded() throws IOException {
        // blockSize=1 -> lengthOfLastBlock ต้องเป็น 0 เสมอ -> ข้าม pad()
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW, 1);
        cos.finish();
        cos.close();
    }

    @Test(expected = ArithmeticException.class)
    public void testFinish_zeroBlockSizeThrowsArithmeticException() throws IOException {
        // ไม่มีการ validate blockSize=0 ในซอร์ส -> คาดว่าเกิด ArithmeticException
        // จากการหารด้วยศูนย์ใน finish() (ทดสอบดัก fault ที่อาจเกิดขึ้น)
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW, 0);
        cos.finish();
    }

    // ================= close =================

    @Test
    public void testClose_callsFinishIfNotFinished() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.close();
        cos.close(); // เรียกซ้ำต้อง idempotent ไม่ throw
    }

    @Test
    public void testClose_afterExplicitFinish() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        cos.close(); // finished=true แล้ว ต้องแค่ปิด underlying stream
    }

    // ================= createArchiveEntry =================

    @Test
    public void testCreateArchiveEntry_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        File f = File.createTempFile("cpio", ".tmp");
        f.deleteOnExit();
        ArchiveEntry entry = cos.createArchiveEntry(f, "entryName");
        assertNotNull(entry);
        cos.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos);
        cos.finish();
        File f = File.createTempFile("cpio", ".tmp");
        f.deleteOnExit();
        cos.createArchiveEntry(f, "entryName");
    }

    // ================= writeAsciiLong (indirect via header) =================

    @Test
    public void testWriteAsciiLong_octalTruncation_oldAsciiFormat() throws IOException {
        // time field ของ OLD_ASCII มี length=11 (radix 8)
        // Long.MAX_VALUE -> octal string ยาวเกิน 11 ตัว -> เข้า branch truncation
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "trunc", 0);
        entry.setTime(Long.MAX_VALUE);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWriteAsciiLong_hexNoTruncation_newFormat() throws IOException {
        // ค่าเล็ก -> tmp.length() <= length -> branch เติม '0' ข้างหน้า
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "pad", 0));
        cos.closeArchiveEntry();
        cos.close();
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_*` | validate format switch (4 case ที่ valid + default → `IllegalArgumentException`), encoding null vs non-null, blockSize ต่าง ๆ |
| `testPutArchiveEntry_setsTimeWhenMinusOne` | `if (e.getTime() == -1)` = true |
| `testPutArchiveEntry_afterFinished` | `if(finished) throw` ใน `putArchiveEntry` |
| `testPutArchiveEntry_afterClosed` | `ensureOpen()` throw ผ่าน `putArchiveEntry` |
| `testPutArchiveEntry_formatMismatch` | `if (format != this.entryFormat) throw` |
| `testPutArchiveEntry_duplicateEntry` | `if (this.names.put(...) != null) throw` |
| `testPutArchiveEntry_closesPreviousEntryAutomatically` | `if (this.entry != null) closeArchiveEntry()` = true |
| `testPutArchiveEntry_nullNameCausesException` | edge case null name (ไม่มีการ validate ใน source) |
| `testWriteHeader_format*` | switch-case ทั้ง 4 กรณีใน `writeHeader` |
| `testWriteNewEntry_artificialInodeAssigned` | `if (inode==0 && devMin==0)` = true ใน `writeNewEntry` |
| `testWriteNewEntry_explicitInodeAndDevMin` | else branch (คำนวณ `nextArtificalDeviceAndInode`) |
| `testCloseArchiveEntry_afterFinished/afterClosed` | `if(finished)`, `ensureOpen()` ใน `closeArchiveEntry` |
| `testCloseArchiveEntry_noCurrentEntry` | `if (entry == null) throw` |
| `testCloseArchiveEntry_sizeMismatch` | `if (size != written) throw` |
| `testCloseArchiveEntry_crcMismatch/crcMatch` | `if (FORMAT_NEW_CRC && crc != chksum)` ทั้ง true/false |
| `testWrite_afterClosed` | `ensureOpen()` ใน `write` |
| `testWrite_negativeOffset/Length/offsetPlusLen` | `if (off<0 \|\| len<0 \|\| off>b.length-len)` |
| `testWrite_zeroLengthReturnsEarly` | `else if (len == 0) return;` |
| `testWrite_noCurrentEntry` | `if (entry == null) throw` |
| `testWrite_pastEndOfEntry` / `exactBoundarySizeSucceeds` | `if (written+len > size)` ทั้ง true/false (boundary) |
| `testWrite_crcAccumulation/noCrcAccumulation` | `if (format == FORMAT_NEW_CRC)` loop สะสม crc ทั้ง true/false |
| `testFinish_afterClosed/alreadyFinished/unclosedEntry` | `ensureOpen()`, `if(finished)`, `if(entry != null)` ใน `finish` |
| `testFinish_success/noPaddingNeeded` | `if (lengthOfLastBlock != 0)` ทั้ง true/false |
| `testFinish_zeroBlockSizeThrowsArithmeticException` | fault-detection: ไม่มีการป้องกัน `blockSize=0` |
| `testClose_*` | `if(!finished) finish()`, `if(!closed) out.close()` ทั้ง true/false (idempotent) |
| `testCreateArchiveEntry_success/afterFinished` | `if(finished) throw` ใน `createArchiveEntry` |
| `testWriteAsciiLong_octalTruncation/hexNoTruncation` | `if (tmp.length() <= length)` ทั้ง true/false ภายใน `writeAsciiLong` |

**หมายเหตุจุดที่ไม่สามารถทดสอบได้จาก public API:** `default` case ใน `writeHeader` (unknown format) เป็น dead code เนื่องจาก constructor validate format ไว้ก่อนแล้ว ไม่สามารถเข้าถึงได้โดยไม่ใช้ reflection ซึ่งขัดกับหลักการไม่เดา behavior จึงไม่ได้เขียนเทสสำหรับ branch นี้