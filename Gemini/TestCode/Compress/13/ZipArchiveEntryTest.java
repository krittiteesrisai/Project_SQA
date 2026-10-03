package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.File;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    @Test
    public void testStringConstructorAndIsDirectory() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("folder/");
        assertTrue("Should be directory if name ends with /", entry1.isDirectory());
        assertEquals("folder/", entry1.getName());

        ZipArchiveEntry entry2 = new ZipArchiveEntry("folder");
        assertFalse("Should not be directory if name does not end with /", entry2.isDirectory());
        assertEquals("folder", entry2.getName());
    }

    @Test
    public void testZipEntryConstructor() throws Exception {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("test.txt");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(50L);
        ze.setComment("my comment");

        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
        assertEquals(50L, entry.getSize());
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testZipEntryConstructorWithExtraBytes() throws Exception {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("test.txt");
        // Extra field with header ID 0x000A (10) and length 4
        byte[] extra = new byte[] { 0x0A, 0x00, 0x04, 0x00, 0x01, 0x02, 0x03, 0x04 };
        ze.setExtra(extra);

        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        assertNotNull(entry.getExtraFields());
    }

    @Test
    public void testZipArchiveEntryCopyConstructor() throws Exception {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setInternalAttributes(1);
        original.setExternalAttributes(2L);
        original.setMethod(ZipArchiveEntry.STORED);
        
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals("original.txt", copy.getName());
        assertEquals(1, copy.getInternalAttributes());
        assertEquals(2L, copy.getExternalAttributes());
        assertEquals(ZipArchiveEntry.STORED, copy.getMethod());
    }

    @Test
    public void testFileConstructorWithDirectory() {
        File mockDir = new File("."); // ปัจจุบันถือว่าเป็น Directory
        ZipArchiveEntry entry = new ZipArchiveEntry(mockDir, "myDir");
        // ถ้าเป็น directory และชื่อไม่ลงท้ายด้วย / จะต้องถูกเติม /
        assertTrue(entry.isDirectory());
        assertTrue(entry.getName().endsWith("/"));
    }

    @Test
    public void testFileConstructorWithFile() {
        // ใช้ไฟล์ชั่วคราวเพื่อทดสอบ isFile()
        File tempFile = null;
        try {
            tempFile = File.createTempFile("compress-test", ".tmp");
            ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "tempFile.tmp");
            assertFalse(entry.isDirectory());
            assertEquals("tempFile.tmp", entry.getName());
            assertEquals(tempFile.length(), entry.getSize());
        } catch (Exception e) {
            fail("IOException during temp file creation: " + e.getMessage());
        } finally {
            if (tempFile != null && tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Test
    public void testClone() throws Exception {
        ZipArchiveEntry original = new ZipArchiveEntry("clone.txt");
        original.setInternalAttributes(5);
        ZipArchiveEntry cloned = (ZipArchiveEntry) original.clone();
        
        assertEquals(original.getName(), cloned.getName());
        assertEquals(original.getInternalAttributes(), cloned.getInternalAttributes());
        assertNotSame(original, cloned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-2);
    }

    @Test
    public void testSetMethodValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-1L);
    }

    @Test
    public void testSetSizeValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(1024L);
        assertEquals(1024L, entry.getSize());
    }

    @Test
    public void testAttributesAndPlatformAndUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unix.txt");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertEquals(0, entry.getUnixMode()); // เพราะไม่ใช่ Unix platform

        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());

        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testExtraFieldsManagement() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra.txt");
        
        // ทดสอบตอน extraFields เป็น null
        ZipExtraField[] emptyFields = entry.getExtraFields(true);
        assertNotNull(emptyFields);
        assertEquals(0, emptyFields.length);

        assertNull(entry.getExtraField(new ZipShort(123)));

        // เพิ่ม Extra Field ปกติ
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0755);
        entry.addExtraField(asi);
        
        assertNotNull(entry.getExtraField(asi.getHeaderId()));
        assertEquals(1, entry.getExtraFields().length);

        // เพิ่มเป็นตัวแรก
        AsiExtraField asi2 = new AsiExtraField();
        asi2.setHeaderId(new ZipShort(999));
        entry.addAsFirstExtraField(asi2);
        assertEquals(asi2.getHeaderId(), entry.getExtraFields()[0].getHeaderId());

        // แทนที่ด้วย setExtraFields อาเรย์
        ZipExtraField[] newFieldsArray = new ZipExtraField[] { asi };
        entry.setExtraFields(newFieldsArray);
        assertEquals(1, entry.getExtraFields().length);

        // ลบ Extra Field
        entry.removeExtraField(asi.getHeaderId());
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraFieldWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(111));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraFieldWhenNotNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.addExtraField(new AsiExtraField());
        entry.removeExtraField(new ZipShort(999));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testUnparseableExtraFieldHandling() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[] { 1, 2, 3 }, 0, 3);

        entry.addExtraField(unparseable);
        assertNotNull(entry.getUnparseableExtraFieldData());
        
        // ทดสอบ getExtraFields แบบรวม Unparseable
        ZipExtraField[] allFields = entry.getExtraFields(true);
        assertEquals(1, allFields.length);

        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraAndCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        // Byte อาเรย์จำลอง extra field ที่ถูกต้องตามรูปแบบ PKWare (Header ID 2 ไบต์, Length 2 ไบต์)
        byte[] extraBytes = new byte[] { 0x0A, 0x00, 0x00, 0x00 };
        entry.setExtra(extraBytes);
        assertNotNull(entry.getLocalFileDataExtra());

        entry.setCentralDirectoryExtra(extraBytes);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test(expected = RuntimeException.class)
    public void testSetCentralDirectoryExtraException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        // ข้อมูลไม่ครบถ้วนอาจทำให้เกิด ZipException ซึ่งถูกห่อด้วย RuntimeException
        entry.setCentralDirectoryExtra(new byte[] { 0x01 });
    }

    @Test
    public void testRawNameAndGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNull(entry.getRawName());

        byte[] raw = new byte[] { 't', 'e', 's', 't' };
        entry.setName("test", raw);
        assertArrayEquals(raw, entry.getRawName());

        assertNotNull(entry.getGeneralPurposeBit());
        entry.setGeneralPurposeBit(new GeneralPurposeBit());
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testHashCodeAndLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("my-entry");
        assertEquals("my-entry".hashCode(), entry.hashCode());

        entry.setTime(1000L);
        Date date = entry.getLastModifiedDate();
        assertEquals(new Date(1000L), date);
    }

    @Test
    public void testEqualsContract() throws Exception {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");

        // Self
        assertTrue(entry1.equals(entry1));
        // Null / Different Class
        assertFalse(entry1.equals(null));
        assertFalse(entry1.equals("some string"));

        // Name mismatch
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");
        assertFalse(entry1.equals(entry3));

        // Comment mismatch
        entry1.setComment("commentA");
        entry2.setComment("commentB");
        assertFalse(entry1.equals(entry2));

        // Equal base properties
        entry2.setComment("commentA");
        assertTrue(entry1.equals(entry2));

        // Time mismatch
        entry1.setTime(100L);
        entry2.setTime(200L);
        assertFalse(entry1.equals(entry2));
    }
}