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
