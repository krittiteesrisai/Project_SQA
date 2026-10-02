## UnixStatTest.java

```java
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
```

## สรุปตาราง Coverage

| เมธอดทดสอบ | ครอบคลุม field/ค่า | หมายเหตุ |
|---|---|---|
| `testPermMask()` | `PERM_MASK` (07777) | ตรวจค่าคงที่และขอบเขตบิต mask สูงสุด |
| `testLinkFlag()` | `LINK_FLAG` (0120000) | ตรวจค่าคงที่ตรงตามสเปค stat.h |
| `testFileFlag()` | `FILE_FLAG` (0100000) | ตรวจค่าคงที่ตรงตามสเปค stat.h |
| `testDirFlag()` | `DIR_FLAG` (040000) | ตรวจค่าคงที่ตรงตามสเปค stat.h |
| `testDefaultLinkPerm()` | `DEFAULT_LINK_PERM` (0777) | ตรวจค่า + ตรวจว่าอยู่ในขอบเขตของ `PERM_MASK` |
| `testDefaultDirPerm()` | `DEFAULT_DIR_PERM` (0755) | ตรวจค่า + ตรวจว่าอยู่ในขอบเขตของ `PERM_MASK` |
| `testDefaultFilePerm()` | `DEFAULT_FILE_PERM` (0644) | ตรวจค่า + ตรวจว่าอยู่ในขอบเขตของ `PERM_MASK` |
| `testFlagsAreDistinct()` | `LINK_FLAG`, `FILE_FLAG`, `DIR_FLAG` | sanity check ว่าไม่มีบิตซ้อนทับกันระหว่าง flag ประเภทไฟล์ (ไม่ใช่ behavior ที่ระบุตรง ๆ ในซอร์ส) |

**หมายเหตุสำคัญ:** เนื่องจาก `UnixStat` เป็น interface ที่ประกอบด้วย constant fields (`int`) เพียงอย่างเดียว ไม่มี method, ไม่มี if/else, ไม่มี loop ใด ๆ ในซอร์สโค้ด จึง **ไม่มี branch/condition ให้ทดสอบตามความหมายของ branch coverage แบบดั้งเดิม** การทดสอบข้างต้นจึงเป็นการยืนยันความถูกต้องของค่าคงที่ (value verification) เพื่อป้องกัน regression หากมีการแก้ไขค่าคงที่โดยไม่ตั้งใจในอนาคต