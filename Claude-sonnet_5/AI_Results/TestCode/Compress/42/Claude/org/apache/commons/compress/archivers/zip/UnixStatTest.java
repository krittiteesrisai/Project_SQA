package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test สำหรับ UnixStat
 *
 * หมายเหตุ:
 * UnixStat เป็น interface ที่มีเฉพาะ constant fields (int) ไม่มี method
 * และไม่มี logic เชิง branch/condition/loop ใด ๆ ในซอร์สโค้ด
 * ดังนั้นการทดสอบจึงเน้นตรวจสอบว่า "ค่าคงที่" แต่ละตัวมีค่าตรงตามที่กำหนดไว้ในสเปค (stat.h ของ Unix)
 * โดยแปลงค่า octal literal เป็นค่า decimal ที่คำนวณแยกต่างหาก เพื่อป้องกันการพิมพ์ผิดในซอร์ส
 * (ไม่มี branch ให้ cover เนื่องจากเป็น interface constants ล้วน ๆ)
 */
public class UnixStatTest {

    // ---------------------------------------------------------
    // PERM_MASK = 07777 (octal) = 4095 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testPermMask() {
        assertEquals(4095, UnixStat.PERM_MASK);
        // ตรวจสอบขอบเขต: ค่าต้องไม่เกิน 07777 (12 bits ทั้งหมดเป็น 1)
        assertEquals(0x0FFF, UnixStat.PERM_MASK);
    }

    // ---------------------------------------------------------
    // LINK_FLAG = 0120000 (octal) = 40960 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testLinkFlag() {
        assertEquals(40960, UnixStat.LINK_FLAG);
    }

    // ---------------------------------------------------------
    // FILE_FLAG = 0100000 (octal) = 32768 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testFileFlag() {
        assertEquals(32768, UnixStat.FILE_FLAG);
    }

    // ---------------------------------------------------------
    // DIR_FLAG = 040000 (octal) = 16384 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testDirFlag() {
        assertEquals(16384, UnixStat.DIR_FLAG);
    }

    // ---------------------------------------------------------
    // DEFAULT_LINK_PERM = 0777 (octal) = 511 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testDefaultLinkPerm() {
        assertEquals(511, UnixStat.DEFAULT_LINK_PERM);
        // ค่านี้ต้องไม่เกิน PERM_MASK (ขอบเขตของ permission bits)
        assertEquals(UnixStat.DEFAULT_LINK_PERM,
                UnixStat.DEFAULT_LINK_PERM & UnixStat.PERM_MASK);
    }

    // ---------------------------------------------------------
    // DEFAULT_DIR_PERM = 0755 (octal) = 493 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testDefaultDirPerm() {
        assertEquals(493, UnixStat.DEFAULT_DIR_PERM);
        assertEquals(UnixStat.DEFAULT_DIR_PERM,
                UnixStat.DEFAULT_DIR_PERM & UnixStat.PERM_MASK);
    }

    // ---------------------------------------------------------
    // DEFAULT_FILE_PERM = 0644 (octal) = 420 (decimal)
    // ---------------------------------------------------------
    @Test
    public void testDefaultFilePerm() {
        assertEquals(420, UnixStat.DEFAULT_FILE_PERM);
        assertEquals(UnixStat.DEFAULT_FILE_PERM,
                UnixStat.DEFAULT_FILE_PERM & UnixStat.PERM_MASK);
    }

    // ---------------------------------------------------------
    // ตรวจสอบว่า flag ทั้งสามตัว (LINK/FILE/DIR) ไม่มีบิตซ้อนทับกัน
    // (สมมติฐานที่สมเหตุสมผลตามการออกแบบของ stat.h แต่ไม่ได้ถูกระบุ
    //  เป็น behavior โดยตรงในซอร์ส จึงเขียนกำกับไว้เป็น sanity check เท่านั้น)
    // ---------------------------------------------------------
    @Test
    public void testFlagsAreDistinct() {
        assertEquals(0, UnixStat.LINK_FLAG & UnixStat.FILE_FLAG & UnixStat.DIR_FLAG);
    }
}
