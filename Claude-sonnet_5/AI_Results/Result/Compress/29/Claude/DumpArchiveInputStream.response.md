# วิเคราะห์และแนวทางการทดสอบ

จากซอร์สโค้ดที่ให้มา `DumpArchiveInputStream` มี dependency ภายในหลายคลาส (`DumpArchiveEntry`, `DumpArchiveUtil`, `DumpArchiveConstants`, `TapeInputStream`, `DumpArchiveSummary`, `Dirent`, `InvalidFormatException`, `UnrecognizedFormatException`) ซึ่ง **ไม่มี source code ให้มา** ทำให้การสร้าง byte array ที่เป็น "valid dump archive" จริง (เพื่อเทส `getNextEntry()`, `read()`, `readDirectoryEntry()` แบบ deep path) **ไม่สามารถทำได้โดยไม่เดา format ภายใน** — จึงจะเขียนคอมเมนต์กำกับไว้ในจุดที่ข้ามหรือไม่แน่ใจ

แนวทางที่เลือก:
- `matches()` เป็น static method ที่ logic ชัดเจนครบ 3 branch → ใช้ค่าที่ได้จากการเรียก `DumpArchiveUtil.verify(...)` / `DumpArchiveUtil.convert32(...)` เป็น **oracle** โดยตรง (แทนการเดาค่า/endianness) เนื่องจากคลาสทดสอบอยู่ package เดียวกันจึงเข้าถึงได้
- Constructor: ใช้ inference ที่ปลอดภัยจากโครงสร้างโค้ดจริง (เช่น constructor ประกาศ `throws ArchiveException` เท่านั้น และ catch เฉพาะ `IOException` → exception ที่ throw ภายใน try ต้องถูกครอบเป็น `ArchiveException` เสมอ ไม่ว่าจะเป็น EOF หรือ verify fail)
- จุดที่ไม่แน่ใจ (เช่น `null` InputStream) จะเขียนคอมเมนต์กำกับไว้ชัดเจน และเทสแบบ "ไม่ระบุ exception type ตายตัว"

```java
package org.apache.commons.compress.archivers.dump;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream; // target class (same package, explicit for clarity)
import org.junit.Test;

/**
 * Unit tests for {@link DumpArchiveInputStream}.
 *
 * หมายเหตุสำคัญ: คลาสนี้พึ่งพา DumpArchiveEntry / DumpArchiveUtil /
 * DumpArchiveConstants / TapeInputStream / DumpArchiveSummary ซึ่งไม่มี
 * source code ให้มาในโจทย์ ดังนั้น deep-path เช่น getNextEntry(), read()
 * แบบอ่านข้อมูลจริง, readDirectoryEntry() จึงไม่สามารถเทสได้โดยไม่เดา
 * binary format ของ dump archive จริง จึงข้ามและกำกับคอมเมนต์ไว้ทุกจุด
 */
public class DumpArchiveInputStreamTest {

    // =====================================================================
    // matches(byte[] buffer, int length) - static method, logic ชัดเจน
    // =====================================================================

    @Test
    public void matchesReturnsFalseWhenLengthLessThan32() {
        byte[] buf = new byte[31];
        assertFalse(DumpArchiveInputStream.matches(buf, 31));
    }

    @Test
    public void matchesReturnsFalseWhenLengthIsZero() {
        byte[] buf = new byte[0];
        assertFalse(DumpArchiveInputStream.matches(buf, 0));
    }

    @Test
    public void matchesAt32BoundaryUsesMagicCheckBranch() {
        // length == 32 (< TP_SIZE แน่นอน) -> ต้องเข้า branch NFS_MAGIC check
        byte[] buf = new byte[32]; // default zero-filled
        boolean expected = DumpArchiveConstants.NFS_MAGIC
                == DumpArchiveUtil.convert32(buf, 24);
        assertEquals(expected, DumpArchiveInputStream.matches(buf, 32));
    }

    @Test
    public void matchesJustBelowTpSizeUsesMagicCheckBranch() {
        int len = DumpArchiveConstants.TP_SIZE - 1;
        byte[] buf = new byte[len];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) (i % 256); // deterministic non-zero pattern
        }
        boolean expected = DumpArchiveConstants.NFS_MAGIC
                == DumpArchiveUtil.convert32(buf, 24);
        assertEquals(expected, DumpArchiveInputStream.matches(buf, len));
    }

    @Test
    public void matchesAtTpSizeBoundaryDelegatesToVerify() {
        int len = DumpArchiveConstants.TP_SIZE;
        byte[] buf = new byte[len]; // zero-filled -> verify() likely false
        boolean expected = DumpArchiveUtil.verify(buf);
        assertEquals(expected, DumpArchiveInputStream.matches(buf, len));
    }

    @Test
    public void matchesAboveTpSizeDelegatesToVerify() {
        int len = DumpArchiveConstants.TP_SIZE + 10;
        byte[] buf = new byte[len];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) (i % 256);
        }
        boolean expected = DumpArchiveUtil.verify(buf);
        assertEquals(expected, DumpArchiveInputStream.matches(buf, len));
    }

    // =====================================================================
    // Constructor - error paths (ArchiveException wrapping)
    // =====================================================================

    @Test(expected = ArchiveException.class)
    public void constructorSingleArgWithEmptyStreamThrowsArchiveException()
            throws Exception {
        // raw.readRecord() ไม่มีข้อมูลให้อ่านเลย -> คาดว่าจะเกิด IOException/EOF
        // ภายใน ซึ่งถูก catch (IOException ex) ครอบเป็น ArchiveException
        // ตามที่ระบุไว้ชัดเจนใน constructor ของซอร์สที่ให้มา
        InputStream is = new ByteArrayInputStream(new byte[0]);
        new DumpArchiveInputStream(is);
    }

    @Test(expected = ArchiveException.class)
    public void constructorTwoArgNullEncodingWithEmptyStreamThrowsArchiveException()
            throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        new DumpArchiveInputStream(is, null);
    }

    @Test(expected = ArchiveException.class)
    public void constructorWithTooShortStreamThrowsArchiveException()
            throws Exception {
        // NOTE: สมมติฐานที่อ้างจากพฤติกรรมการใช้งานใน source ที่ให้มา -
        // ไม่มีจุดใดใน getNextEntry()/readCLRI()/readBITS() ที่ตรวจสอบผลลัพธ์
        // ของ raw.readRecord() ว่าเป็น null/partial ก่อนใช้งานทันที ซึ่งบ่งชี้ว่า
        // readRecord() ต้อง throw exception เองเมื่ออ่านไม่ครบ record หนึ่งชุด
        InputStream is = new ByteArrayInputStream(new byte[10]);
        new DumpArchiveInputStream(is);
    }

    @Test(expected = ArchiveException.class)
    public void constructorWithZeroFilledNonDumpDataThrowsArchiveException()
            throws Exception {
        // บัฟเฟอร์ครบขนาด record แต่เป็น zero-filled -> DumpArchiveUtil.verify()
        // คืน false -> throw UnrecognizedFormatException
        // เนื่องจาก constructor ประกาศ throws ArchiveException เท่านั้น และ
        // exception นี้ถูก throw ภายใน try ที่ catch (IOException ex) เพียง
        // อย่างเดียว โดยไม่มี catch เฉพาะสำหรับ UnrecognizedFormatException
        // จึง "จำเป็น" (ไม่ใช่การเดา) ว่า UnrecognizedFormatException ต้องเป็น
        // IOException subtype เพื่อให้ compile ได้ และจะถูกครอบเป็น
        // ArchiveException เสมอ
        byte[] header = new byte[DumpArchiveConstants.TP_SIZE];
        InputStream is = new ByteArrayInputStream(header);
        new DumpArchiveInputStream(is);
    }

    @Test(expected = ArchiveException.class)
    public void constructorTwoArgWithEncodingAndNonDumpDataThrowsArchiveException()
            throws Exception {
        byte[] header = new byte[DumpArchiveConstants.TP_SIZE];
        InputStream is = new ByteArrayInputStream(header);
        new DumpArchiveInputStream(is, "UTF-8");
    }

    @Test
    public void constructorWithNullInputStreamThrowsSomeException() {
        // NOTE: พฤติกรรมที่แน่ชัดเมื่อส่ง InputStream เป็น null ไม่ได้ระบุไว้ใน
        // ซอร์สที่ให้มา (ขึ้นกับ implementation ของ TapeInputStream ซึ่งไม่มี
        // source ให้) จึงไม่ assert exception type ที่ตายตัว เพียงยืนยันว่า
        // การ construct ต้อง "ไม่สำเร็จ" เท่านั้น
        boolean threw = false;
        try {
            new DumpArchiveInputStream(null);
        } catch (Exception e) {
            threw = true;
        }
        assertTrue(
            "Constructing with a null InputStream is expected to fail somehow",
            threw);
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `matchesReturnsFalseWhenLengthLessThan32` | `matches()`: `length < 32` → `true` (return false) |
| `matchesReturnsFalseWhenLengthIsZero` | `matches()`: boundary กรณี length=0 ของเงื่อนไข `length < 32` |
| `matchesAt32BoundaryUsesMagicCheckBranch` | `matches()`: `length >= 32` และ `length < TP_SIZE` → เข้า branch `NFS_MAGIC == convert32(...)` (boundary length=32) |
| `matchesJustBelowTpSizeUsesMagicCheckBranch` | `matches()`: boundary `length == TP_SIZE - 1` ยังอยู่ใน branch magic-check |
| `matchesAtTpSizeBoundaryDelegatesToVerify` | `matches()`: boundary `length == TP_SIZE` → เข้า branch `DumpArchiveUtil.verify(buffer)` |
| `matchesAboveTpSizeDelegatesToVerify` | `matches()`: `length > TP_SIZE` → branch `verify(buffer)` ซ้ำอีกกรณี |
| `constructorSingleArgWithEmptyStreamThrowsArchiveException` | Constructor(is): path `catch (IOException ex) -> throw ArchiveException` จาก empty stream, ครอบคลุม overload 1 arg ที่เรียก `this(is, null)` |
| `constructorTwoArgNullEncodingWithEmptyStreamThrowsArchiveException` | Constructor(is, null): เส้นทางเดียวกันแต่เรียกตรงผ่าน 2-arg constructor |
| `constructorWithTooShortStreamThrowsArchiveException` | Constructor: header อ่านไม่ครบ record → exception path เดียวกัน (edge case ข้อมูลสั้นแต่ไม่ใช่ 0 byte) |
| `constructorWithZeroFilledNonDumpDataThrowsArchiveException` | Constructor: branch `if (!DumpArchiveUtil.verify(headerBytes)) throw new UnrecognizedFormatException();` |
| `constructorTwoArgWithEncodingAndNonDumpDataThrowsArchiveException` | Constructor(is, encoding): เส้นทาง verify-fail ผ่าน overload ที่ระบุ encoding เอง |
| `constructorWithNullInputStreamThrowsSomeException` | Constructor: กรณี input เป็น `null` (edge/null-input case, พฤติกรรมไม่ระบุแน่ชัด — กำกับคอมเมนต์) |

**จุดที่ไม่ได้ครอบคลุม (และเหตุผล):** `getNextEntry()`, `readDirectoryEntry()`, `getPath()`, `read(byte[],int,int)` เส้นทางอ่านข้อมูลจริง, `readCLRI()`/`readBITS()` เส้นทาง success, `close()`, `getBytesRead()`, `getSummary()` — ทั้งหมดต้องมี **valid binary dump archive** (checksum, SEGMENT_TYPE, header count ที่ถูกต้องตาม format จริงของ `DumpArchiveEntry`/`TapeInputStream`) ซึ่งไม่มี source ให้วิเคราะห์ จึงไม่สร้างข้อมูลปลอมขึ้นมาเพื่อหลีกเลี่ยงการ "เดา behavior" ตามข้อกำหนด