# ชุดทดสอบ JUnit 4 สำหรับ `ZipArchiveEntry`

> **หมายเหตุสำคัญ (ข้อกำหนดที่ 4):**
> - คลาสนี้พึ่งพา `ZipExtraField`, `ZipShort`, `ExtraFieldUtils` ที่ไม่มีซอร์สให้ในโจทย์ ผมจึงสร้าง **stub implementation** ของ `ZipExtraField` ขึ้นมาเองภายในไฟล์ทดสอบ โดยอ้างอิง signature มาตรฐานของ interface นี้ใน commons-compress (`getHeaderId()`, `getLocalFileDataData()`, `getCentralDirectoryData()`, `parseFromLocalFileData(...)`, `parseFromCentralDirectoryData(...)`) — หากใน environment จริง signature ต่างจากนี้ต้องปรับ stub ให้ตรง
> - หลีกเลี่ยงการทดสอบ `setExtra(byte[])` / `ExtraFieldUtils.parse(...)` ด้วยข้อมูล malformed ที่ซับซ้อน เพราะพฤติกรรมการ throw ขึ้นกับ implementation ของ `ExtraFieldUtils` ที่ไม่มีซอร์สให้ดู (จึงทดสอบเฉพาะกรณี array ว่างซึ่งปลอดภัยตาม logic ของลูป)
> - เมธอด `equals()` เทียบด้วยฟิลด์ภายใน `name` (ตั้งค่าผ่าน `setName()` เท่านั้น) ไม่ใช่ `getName()` — เมื่อสร้างด้วย public constructor `ZipArchiveEntry(String)` ฟิลด์ `name` จะยังเป็น `null` เสมอ (ไม่มีการเรียก `setName`) ทำให้ entry สองตัวที่มีชื่อ super ต่างกันแต่ยัง `equals()==true` ได้ — นี่คือพฤติกรรมที่ **อ่านได้ตรงจากซอร์สโค้ดจริง** (ไม่ได้เดา) และเป็นจุดที่มีโอกาสเป็น fault จึงเขียนเทสต์ยืนยันพฤติกรรมนี้ไว้อย่างชัดเจนพร้อมคอมเมนต์

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link ZipArchiveEntry} (Defects4J Compress-6b).
 * Placed in the same package to access protected members (setName, setPlatform,
 * protected no-arg constructor).
 */
public class ZipArchiveEntryTest {

    // ---------------------------------------------------------------
    // Stub ZipExtraField implementation (signature ตามมาตรฐาน commons-compress)
    // ---------------------------------------------------------------
    private static class SimpleExtraField implements ZipExtraField {
        private ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        SimpleExtraField(int id, byte[] localData, byte[] centralData) {
            this.headerId = new ZipShort(id);
            this.localData = localData;
            this.centralData = centralData;
        }

        public ZipShort getHeaderId() {
            return headerId;
        }

        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        public byte[] getLocalFileDataData() {
            return localData;
        }

        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        public void parseFromLocalFileData(byte[] data, int offset, int length)
                throws ZipException {
            localData = new byte[length];
            System.arraycopy(data, offset, localData, 0, length);
        }

        public void parseFromCentralDirectoryData(byte[] data, int offset, int length)
                throws ZipException {
            centralData = new byte[length];
            System.arraycopy(data, offset, centralData, 0, length);
        }
    }

    private File tmpDir;
    private File tmpFile;

    @Before
    public void setUp() throws IOException {
        tmpDir = File.createTempFile("zae-test", "dir");
        tmpDir.delete();
        tmpDir.mkdir();

        tmpFile = File.createTempFile("zae-test", ".bin");
        FileOutputStream fos = new FileOutputStream(tmpFile);
        fos.write(new byte[]{1, 2, 3, 4, 5}); // known length = 5
        fos.close();
    }

    @After
    public void tearDown() {
        if (tmpFile != null) tmpFile.delete();
        if (tmpDir != null) tmpDir.delete();
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testStringConstructor() {
        ZipArchiveEntry e = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt", e.getName());
        assertFalse(e.isDirectory());
        assertEquals(-1, e.getMethod());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, e.getPlatform());
    }

    @Test
    public void testProtectedNoArgConstructor() {
        ZipArchiveEntry e = new ZipArchiveEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testZipEntryCopyConstructor_nullExtra() throws ZipException {
        ZipEntry ze = new ZipEntry("plain.txt");
        // extra is null by default -> else branch: setExtra() called
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals("plain.txt", e.getName());
        assertNotNull(e.getLocalFileDataExtra());
        assertEquals(0, e.getLocalFileDataExtra().length);
    }

    @Test
    public void testZipEntryCopyConstructor_emptyExtra() throws ZipException {
        ZipEntry ze = new ZipEntry("withExtra.txt");
        ze.setExtra(new byte[0]); // non-null but empty -> if-branch calls ExtraFieldUtils.parse
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals("withExtra.txt", e.getName());
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testZipEntryCopyConstructor_methodSet() throws ZipException {
        ZipEntry ze = new ZipEntry("m.txt");
        ze.setMethod(ZipEntry.STORED);
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals(ZipEntry.STORED, e.getMethod());
    }

    @Test
    public void testZipArchiveEntryCopyConstructor() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("orig.txt");
        original.setInternalAttributes(5);
        original.setExternalAttributes(123L);
        original.addExtraField(new SimpleExtraField(1, new byte[]{9}, new byte[]{9}));

        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(123L, copy.getExternalAttributes());
        assertEquals(1, copy.getExtraFields().length);
    }

    @Test
    public void testFileConstructor_directory_appendsSlash() {
        ZipArchiveEntry e = new ZipArchiveEntry(tmpDir, "dirName");
        assertTrue(e.getName().endsWith("/"));
        assertTrue(e.isDirectory());
    }

    @Test
    public void testFileConstructor_directory_alreadyHasSlash() {
        ZipArchiveEntry e = new ZipArchiveEntry(tmpDir, "dirName/");
        assertEquals("dirName/", e.getName());
    }

    @Test
    public void testFileConstructor_regularFile_setsSize() {
        ZipArchiveEntry e = new ZipArchiveEntry(tmpFile, "file.bin");
        assertEquals("file.bin", e.getName());
        assertEquals(5L, e.getSize());
    }

    @Test
    public void testFileConstructor_nonExistentFile_noSizeSet() {
        File notExist = new File(tmpDir, "does-not-exist-xyz");
        assertFalse(notExist.exists());
        ZipArchiveEntry e = new ZipArchiveEntry(notExist, "ghost");
        assertEquals("ghost", e.getName());
        // isFile()==false -> setSize branch skipped: default size == -1 (java.util.zip.ZipEntry default)
        assertEquals(-1L, e.getSize());
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testClone_noExtraFields() {
        ZipArchiveEntry e = new ZipArchiveEntry("clone.txt");
        ZipArchiveEntry clone = (ZipArchiveEntry) e.clone();
        assertEquals(e.getName(), clone.getName());
        assertEquals(0, clone.getExtraFields().length);
    }

    @Test
    public void testClone_withExtraFields_isIndependent() {
        ZipArchiveEntry e = new ZipArchiveEntry("clone2.txt");
        e.addExtraField(new SimpleExtraField(10, new byte[]{1, 2}, new byte[]{1, 2}));
        e.setInternalAttributes(7);
        e.setExternalAttributes(999L);

        ZipArchiveEntry clone = (ZipArchiveEntry) e.clone();
        assertEquals(7, clone.getInternalAttributes());
        assertEquals(999L, clone.getExternalAttributes());
        assertEquals(1, clone.getExtraFields().length);

        // independence check: modifying clone should not affect original
        clone.addExtraField(new SimpleExtraField(20, new byte[]{3}, new byte[]{3}));
        assertEquals(2, clone.getExtraFields().length);
        assertEquals(1, e.getExtraFields().length);
    }

    // ---------------------------------------------------------------
    // isSupportedCompressionMethod / method
    // ---------------------------------------------------------------

    @Test
    public void testIsSupportedCompressionMethod_defaultFalse() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertFalse(e.isSupportedCompressionMethod()); // method == -1
    }

    @Test
    public void testIsSupportedCompressionMethod_stored() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setMethod(ZipEntry.STORED);
        assertTrue(e.isSupportedCompressionMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod_deflated() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setMethod(ZipEntry.DEFLATED);
        assertTrue(e.isSupportedCompressionMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod_otherMethod() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setMethod(12); // unknown method
        assertFalse(e.isSupportedCompressionMethod());
    }

    @Test
    public void testSetMethod_negativeThrows() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        try {
            e.setMethod(-5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testSetMethod_zeroIsValid() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setMethod(0);
        assertEquals(0, e.getMethod());
    }

    // ---------------------------------------------------------------
    // internal/external attributes
    // ---------------------------------------------------------------

    @Test
    public void testInternalAttributes() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertEquals(0, e.getInternalAttributes());
        e.setInternalAttributes(42);
        assertEquals(42, e.getInternalAttributes());
    }

    @Test
    public void testExternalAttributes() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertEquals(0L, e.getExternalAttributes());
        e.setExternalAttributes(1234L);
        assertEquals(1234L, e.getExternalAttributes());
    }

    // ---------------------------------------------------------------
    // Unix mode / platform
    // ---------------------------------------------------------------

    @Test
    public void testGetUnixMode_beforeSet_returnsZero() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertEquals(0, e.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, e.getPlatform());
    }

    @Test
    public void testSetUnixMode_readOnlyBit_whenNoOwnerWrite() {
        // mode without owner-write bit (0200) -> read-only flag = 1
        ZipArchiveEntry e = new ZipArchiveEntry("readonly.txt");
        e.setUnixMode(0555);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
        assertEquals(0555, e.getUnixMode());
        assertEquals(1, e.getExternalAttributes() & 1); // read-only bit set
    }

    @Test
    public void testSetUnixMode_writableBit_noReadOnlyFlag() {
        // mode with owner-write bit set (0755) -> read-only flag = 0
        ZipArchiveEntry e = new ZipArchiveEntry("writable.txt");
        e.setUnixMode(0755);
        assertEquals(0755, e.getUnixMode());
        assertEquals(0, e.getExternalAttributes() & 1);
    }

    @Test
    public void testSetUnixMode_directoryFlagSet() {
        ZipArchiveEntry e = new ZipArchiveEntry("adir/"); // isDirectory()==true
        e.setUnixMode(0755);
        assertEquals(0x10, e.getExternalAttributes() & 0x10);
    }

    @Test
    public void testSetUnixMode_notDirectory_flagNotSet() {
        ZipArchiveEntry e = new ZipArchiveEntry("afile.txt");
        e.setUnixMode(0755);
        assertEquals(0, e.getExternalAttributes() & 0x10);
    }

    @Test
    public void testSetPlatform_direct() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
    }

    // ---------------------------------------------------------------
    // extra fields
    // ---------------------------------------------------------------

    @Test
    public void testSetExtraFields_emptyArray() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testSetExtraFields_multipleFields_preservesOrder() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        ZipExtraField f1 = new SimpleExtraField(1, new byte[]{1}, new byte[]{1});
        ZipExtraField f2 = new SimpleExtraField(2, new byte[]{2}, new byte[]{2});
        e.setExtraFields(new ZipExtraField[]{f1, f2});
        ZipExtraField[] result = e.getExtraFields();
        assertEquals(2, result.length);
        assertEquals(new ZipShort(1), result[0].getHeaderId());
        assertEquals(new ZipShort(2), result[1].getHeaderId());
    }

    @Test
    public void testSetExtraFields_duplicateHeaderId_overwrites() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        ZipExtraField f1 = new SimpleExtraField(1, new byte[]{1}, new byte[]{1});
        ZipExtraField f1b = new SimpleExtraField(1, new byte[]{9}, new byte[]{9});
        e.setExtraFields(new ZipExtraField[]{f1, f1b});
        assertEquals(1, e.getExtraFields().length); // same header id -> collapses to 1
    }

    @Test
    public void testGetExtraFields_whenNull_returnsEmptyArray() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testAddExtraField_firstTime_extraFieldsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        assertEquals(1, e.getExtraFields().length);
    }

    @Test
    public void testAddExtraField_replaceExisting() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        e.addExtraField(new SimpleExtraField(1, new byte[]{9}, new byte[]{9}));
        ZipExtraField[] fields = e.getExtraFields();
        assertEquals(1, fields.length);
        assertArrayEquals(new byte[]{9}, fields[0].getLocalFileDataData());
    }

    @Test
    public void testAddAsFirstExtraField_whenExtraFieldsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addAsFirstExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        assertEquals(1, e.getExtraFields().length);
    }

    @Test
    public void testAddAsFirstExtraField_movesToFront() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        ZipExtraField f1 = new SimpleExtraField(1, new byte[]{1}, new byte[]{1});
        ZipExtraField f2 = new SimpleExtraField(2, new byte[]{2}, new byte[]{2});
        e.setExtraFields(new ZipExtraField[]{f1, f2});

        // f2 already exists but should be moved to be first
        e.addAsFirstExtraField(f2);
        ZipExtraField[] result = e.getExtraFields();
        assertEquals(2, result.length);
        assertEquals(new ZipShort(2), result[0].getHeaderId());
        assertEquals(new ZipShort(1), result[1].getHeaderId());
    }

    @Test
    public void testRemoveExtraField_whenNull_throws() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        try {
            e.removeExtraField(new ZipShort(1));
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException ex) {
            // expected
        }
    }

    @Test
    public void testRemoveExtraField_notFound_throws() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        try {
            e.removeExtraField(new ZipShort(99));
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException ex) {
            // expected
        }
    }

    @Test
    public void testRemoveExtraField_success() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        e.removeExtraField(new ZipShort(1));
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testGetExtraField_whenNull_returnsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertNull(e.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testGetExtraField_found() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        ZipExtraField f = new SimpleExtraField(1, new byte[]{1}, new byte[]{1});
        e.addExtraField(f);
        assertSame(f, e.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testGetExtraField_notFound_returnsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        assertNull(e.getExtraField(new ZipShort(99)));
    }

    // -- setExtra(byte[]) / mergeExtraFields (only safe empty-array case) --

    @Test
    public void testSetExtraByteArray_empty_noException() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setExtra(new byte[0]); // extraFields == null -> mergeExtraFields calls setExtraFields(f) branch
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testSetExtraByteArray_mergeWithExistingField_localBranch() throws ZipException {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}, new byte[]{1}));
        // extraFields != null now: calling setExtra(byte[0]) again exercises the
        // "else" branch of mergeExtraFields (loop body simply doesn't execute since f.length==0)
        e.setExtra(new byte[0]);
        assertEquals(1, e.getExtraFields().length); // existing field untouched
    }

    // -- setCentralDirectoryExtra --

    @Test
    public void testSetCentralDirectoryExtra_empty() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setCentralDirectoryExtra(new byte[0]);
        assertEquals(0, e.getExtraFields().length);
    }

    // -- getLocalFileDataExtra / getCentralDirectoryExtra --

    @Test
    public void testGetLocalFileDataExtra_defaultNull_returnsEmpty() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        byte[] extra = e.getLocalFileDataExtra();
        assertNotNull(extra);
        assertEquals(0, extra.length);
    }

    @Test
    public void testGetLocalFileDataExtra_afterAddField_nonEmpty() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1, 2, 3}, new byte[]{9}));
        byte[] extra = e.getLocalFileDataExtra();
        assertTrue(extra.length > 0);
    }

    @Test
    public void testGetCentralDirectoryExtra_empty() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        byte[] cd = e.getCentralDirectoryExtra();
        assertNotNull(cd);
        assertEquals(0, cd.length);
    }

    // ---------------------------------------------------------------
    // name / isDirectory
    // ---------------------------------------------------------------

    @Test
    public void testGetName_defaultUsesSuper() {
        ZipArchiveEntry e = new ZipArchiveEntry("super-name.txt");
        assertEquals("super-name.txt", e.getName());
    }

    @Test
    public void testSetName_overridesSuper() {
        ZipArchiveEntry e = new ZipArchiveEntry("super-name.txt");
        e.setName("override.txt");
        assertEquals("override.txt", e.getName());
    }

    @Test
    public void testIsDirectory_true() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testIsDirectory_false() {
        ZipArchiveEntry e = new ZipArchiveEntry("file.txt");
        assertFalse(e.isDirectory());
    }

    // ---------------------------------------------------------------
    // hashCode
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_matchesNameHashCode() {
        ZipArchiveEntry e = new ZipArchiveEntry("hash-me.txt");
        assertEquals("hash-me.txt".hashCode(), e.hashCode());
    }

    // ---------------------------------------------------------------
    // getLastModifiedDate
    // ---------------------------------------------------------------

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        long t = System.currentTimeMillis();
        e.setTime(t);
        Date d = e.getLastModifiedDate();
        assertEquals(e.getTime(), d.getTime());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameReference() {
        ZipArchiveEntry e = new ZipArchiveEntry("same.txt");
        assertTrue(e.equals(e));
    }

    @Test
    public void testEquals_null() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertFalse(e.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        assertFalse(e.equals("a string"));
    }

    /**
     * ข้อสังเกต (อ่านตรงจากซอร์ส): equals() เทียบฟิลด์ภายใน `name` ไม่ใช่ getName().
     * เมื่อสร้างด้วย public constructor ZipArchiveEntry(String) ฟิลด์ `name` จะยังเป็น null เสมอ
     * (ไม่มีการเรียก setName ในเส้นทางนี้) ดังนั้น entry สองตัวที่ "ชื่อ super ต่างกัน"
     * จะยังถูกตัดสินว่า equals()==true ซึ่งขัดกับ contract ปกติของ equals — นี่คือพฤติกรรม
     * จริงของโค้ด (ไม่ใช่การเดา) และเป็นจุดที่ควรถูก flag ว่าอาจเป็น fault.
     */
    @Test
    public void testEquals_bothInternalNameFieldNull_returnsTrueEvenIfSuperNameDiffers() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("nameA.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("nameB.txt");
        // internal `name` field is null for both -> current implementation says equal
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_internalNameSet_sameValue_true() throws ZipException {
        ZipEntry z1 = new ZipEntry("same-copy.txt");
        ZipEntry z2 = new ZipEntry("same-copy.txt");
        ZipArchiveEntry e1 = new ZipArchiveEntry(z1); // setName() called inside this constructor
        ZipArchiveEntry e2 = new ZipArchiveEntry(z2);
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_internalNameSet_differentValue_false() throws ZipException {
        ZipEntry z1 = new ZipEntry("copyA.txt");
        ZipEntry z2 = new ZipEntry("copyB.txt");
        ZipArchiveEntry e1 = new ZipArchiveEntry(z1);
        ZipArchiveEntry e2 = new ZipArchiveEntry(z2);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_oneInternalNameNull_otherSet_false() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("plain.txt"); // internal name == null
        ZipEntry z2 = new ZipEntry("plain.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry(z2); // internal name == "plain.txt"
        // e1.name == null, e2.name != null -> covers "if (name==null) { other.name!=null -> false }"
        assertFalse(e1.equals(e2));
    }
}
```

## สรุปตาราง Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testStringConstructor | Constructor `ZipArchiveEntry(String)` ค่าเริ่มต้นทุกฟิลด์ |
| testProtectedNoArgConstructor | Constructor ว่าง (`this("")`) |
| testZipEntryCopyConstructor_nullExtra | `entry.getExtra()==null` → else-branch `setExtra()` |
| testZipEntryCopyConstructor_emptyExtra | `entry.getExtra()!=null` → if-branch `setExtraFields(parse(...))` |
| testZipEntryCopyConstructor_methodSet | `setMethod(entry.getMethod())` |
| testZipArchiveEntryCopyConstructor | Constructor `ZipArchiveEntry(ZipArchiveEntry)` คัดลอก attrs/extra |
| testFileConstructor_directory_appendsSlash | `isDirectory() && !endsWith("/")` = true |
| testFileConstructor_directory_alreadyHasSlash | `isDirectory() && !endsWith("/")` = false (มี "/") |
| testFileConstructor_regularFile_setsSize | `inputFile.isFile()` = true → `setSize` |
| testFileConstructor_nonExistentFile_noSizeSet | `inputFile.isFile()` = false → skip `setSize` |
| testClone_noExtraFields / testClone_withExtraFields_isIndependent | `clone()` ทั้ง extraFields null/non-null, ตรวจ deep-independence |
| testIsSupportedCompressionMethod_* (4 tests) | `method==STORED`, `==DEFLATED`, `==-1`, อื่น ๆ |
| testSetMethod_negativeThrows / testSetMethod_zeroIsValid | `if (method<0)` true/false |
| testInternalAttributes / testExternalAttributes | getter/setter ตรงไปตรงมา |
| testGetUnixMode_beforeSet_returnsZero | `platform != PLATFORM_UNIX` → return 0 |
| testSetUnixMode_readOnlyBit_* / _writableBit_* | เงื่อนไข `(mode & 0200)==0 ? 1 : 0` ทั้ง 2 branch |
| testSetUnixMode_directoryFlagSet / _notDirectory_flagNotSet | เงื่อนไข `isDirectory() ? 0x10 : 0` ทั้ง 2 branch |
| testSetPlatform_direct | setter ตรง ๆ |
| testSetExtraFields_emptyArray / _multipleFields_preservesOrder / _duplicateHeaderId_overwrites | loop `for` ใน `setExtraFields`, 0/หลาย/ซ้ำ header id |
| testGetExtraFields_whenNull_returnsEmptyArray | `extraFields==null` branch |
| testAddExtraField_firstTime_extraFieldsNull / _replaceExisting | `if (extraFields==null)` true/false |
| testAddAsFirstExtraField_whenExtraFieldsNull / _movesToFront | `if (copy!=null)` true/false |
| testRemoveExtraField_whenNull_throws / _notFound_throws / _success | ทั้ง 2 เงื่อนไข throw + success path |
| testGetExtraField_whenNull_returnsNull / _found / _notFound_returnsNull | `if (extraFields!=null)` ทั้ง 2 branch + found/not-found |
| testSetExtraByteArray_empty_noException / _mergeWithExistingField_localBranch | `mergeExtraFields`: `extraFields==null` branch และ else-branch (loop ว่าง) |
| testSetCentralDirectoryExtra_empty | เส้นทาง `local=false` ของ `mergeExtraFields`/`setCentralDirectoryExtra` |
| testGetLocalFileDataExtra_defaultNull_returnsEmpty / _afterAddField_nonEmpty | `extra != null ? extra : new byte[0]` ทั้ง 2 branch |
| testGetCentralDirectoryExtra_empty | `mergeCentralDirectoryData` เส้นทางว่าง |
| testGetName_defaultUsesSuper / testSetName_overridesSuper | `name == null ? super.getName() : name` ทั้ง 2 branch |
| testIsDirectory_true / _false | `endsWith("/")` ทั้ง 2 branch |
| testHashCode_matchesNameHashCode | `hashCode()` ใช้ `getName()` |
| testGetLastModifiedDate | `new Date(getTime())` |
| testEquals_sameReference | `this==obj` → true |
| testEquals_null | `obj==null` → false |
| testEquals_differentClass | `getClass()!=obj.getClass()` → false |
| testEquals_bothInternalNameFieldNull_returnsTrueEvenIfSuperNameDiffers | เผยพฤติกรรม/fault: `name==null` ทั้งคู่ → true แม้ super name ต่างกัน |
| testEquals_internalNameSet_sameValue_true | `name!=null && name.equals(other.name)` → true |
| testEquals_internalNameSet_differentValue_false | `name!=null && !name.equals(other.name)` → false |
| testEquals_oneInternalNameNull_otherSet_false | `name==null` (this) แต่ `other.name!=null` → false |

หมายเหตุ: ครอบคลุมแทบทุก if/else และ loop branch ที่วิเคราะห์ได้จากซอร์ส ยกเว้นเส้นทาง exception ภายใน `ExtraFieldUtils.parse` ที่มี malformed bytes ซึ่งไม่มีซอร์สให้ตรวจสอบ จึงไม่เขียนเทสต์เดา behavior ตามข้อกำหนดที่ 4