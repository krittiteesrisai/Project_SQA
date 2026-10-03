package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnixStatTest {

    @Test
    public void testConstantsValues() {
        // ตรวจสอบค่าคงที่ของ Permission Mask (07777 ในเลขฐาน 8 คือ 4095 ในเลขฐาน 10)
        assertEquals(07777, UnixStat.PERM_MASK);

        // ตรวจสอบค่าคงที่ของ File Type Flags
        assertEquals(0120000, UnixStat.LINK_FLAG);
        assertEquals(0100000, UnixStat.FILE_FLAG);
        assertEquals(040000, UnixStat.DIR_FLAG);

        // ตรวจสอบค่า Default Permissions
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testFlagAndPermissionInteractions() {
        // ทดสอบจำลองการทำ Bitwise AND กับ PERM_MASK ว่าสามารถกรองเฉพาะ Permission ได้ถูกต้อง
        int sampleFileMode = UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM;
        
        // แยก Type ออกมา
        int fileType = sampleFileMode & ~UnixStat.PERM_MASK;
        assertEquals(UnixStat.FILE_FLAG, fileType);

        // แยก Permission ออกมา
        int permissions = sampleFileMode & UnixStat.PERM_MASK;
        assertEquals(UnixStat.DEFAULT_FILE_PERM, permissions);
    }

    @Test
    public void testDirectoryFlagAndPermissionInteractions() {
        int sampleDirMode = UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM;
        
        assertEquals(UnixStat.DIR_FLAG, sampleDirMode & ~UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_DIR_PERM, sampleDirMode & UnixStat.PERM_MASK);
    }

    @Test
    public void testLinkFlagAndPermissionInteractions() {
        int sampleLinkMode = UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM;
        
        assertEquals(UnixStat.LINK_FLAG, sampleLinkMode & ~UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_LINK_PERM, sampleLinkMode & UnixStat.PERM_MASK);
    }
}