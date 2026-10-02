# JUnit 4 Test Suite: ZipArchiveEntryTest

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสทดสอบอยู่ใน package เดียวกับคลาสเป้าหมาย (`org.apache.commons.compress.archivers.zip`) จึงสามารถเข้าถึง protected members และคลาสร่วม package อื่น ๆ (ZipShort, ZipExtraField, UnparseableExtraFieldData, GeneralPurposeBit, ExtraFieldUtils) ได้โดยตรง
- บาง behavior (เช่น รายละเอียดภายในของ `ExtraFieldUtils.parse`, API ที่แน่นอนของ `GeneralPurposeBit`) ไม่ได้อยู่ในซอร์สที่ให้มา จึงมีคอมเมนต์กำกับไว้ว่าเป็น "assumption" ตามข้อกำหนด
- พบ **fault ที่อาจเกิดจริง**: constructor `ZipArchiveEntry(ZipEntry)` เรียก `setMethod(entry.getMethod())` โดยไม่ตรวจสอบว่า method ยังเป็นค่า default (-1) หรือไม่ → จะ throw `IllegalArgumentException` เสมอถ้าไม่ตั้ง method มาก่อน จึงเขียนเทสเพื่อดักจับ (documented) พฤติกรรมนี้ไว้ชัดเจน

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ZipArchiveEntryTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    /** สร้าง extra-field bytes ที่ถูกต้องตามสเปค: headerId(2B LE) + length(2B LE) + data */
    private byte[] buildExtraField(int headerId, byte[] data) {
        byte[] b = new byte[4 + data.length];
        b[0] = (byte) (headerId & 0xFF);
        b[1] = (byte) ((headerId >> 8) & 0xFF);
        int len = data.length;
        b[2] = (byte) (len & 0xFF);
        b[3] = (byte) ((len >> 8) & 0xFF);
        System.arraycopy(data, 0, b, 4, data.length);
        return b;
    }

    /** parse extra field เดี่ยว ๆ ให้ได้ ZipExtraField object จริง (แทนการเดา constructor) */
    private ZipExtraField parseSingleField(int headerId, byte[] data) throws ZipException {
        byte[] raw = buildExtraField(headerId, data);
        ZipExtraField[] fields = ExtraFieldUtils.parse(raw, true,
                ExtraFieldUtils.UnparseableExtraField.READ);
        return fields[0];
    }

    /** ข้อมูล malformed: header ประกาศ length มากกว่าข้อมูลจริง -> ควรกลาย เป็น UnparseableExtraFieldData
     *  (อ้างอิง Javadoc ของคลาส: "Any extra data that cannot be parsed ... will be consumed as unparseable extra data") */
    private byte[] malformedExtra(int headerId) {
        return new byte[]{(byte) headerId, 0x00, 0x10, 0x00, 1, 2};
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithName_regularFile() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithName_directory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        assertTrue(entry.isDirectory());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithName_null_throws() {
        // Behavior มาจาก java.util.zip.ZipEntry(String) ของ JDK ที่ throw NPE เมื่อ name เป็น null
        new ZipArchiveEntry((String) null);
    }

    @Test
    public void testConstructorFromZipEntry_noExtra_setsEmptyExtra() throws ZipException {
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("foo.txt");
        base.setMethod(java.util.zip.ZipEntry.DEFLATED);
        base.setSize(10);
        ZipArchiveEntry entry = new ZipArchiveEntry(base);
        assertEquals("foo.txt", entry.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(10, entry.getSize());
        // ตาม comment ในซอร์ส: "initializes extra data to an empty byte array"
        assertNotNull(entry.getExtra());
    }

    @Test
    public void testConstructorFromZipEntry_withExtra_parsesFields() throws ZipException {
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("foo.txt");
        base.setMethod(java.util.zip.ZipEntry.STORED);
        base.setExtra(buildExtraField(0x1234, new byte[]{1, 2, 3, 4}));
        ZipArchiveEntry entry = new ZipArchiveEntry(base);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFromZipEntry_defaultMethodNegative_throws() throws ZipException {
        // FAULT-CATCHING TEST:
        // java.util.zip.ZipEntry ค่า default ของ method คือ -1 (ตาม JDK javadoc)
        // constructor ของ ZipArchiveEntry เรียก setMethod(entry.getMethod()) โดยไม่ตรวจสอบก่อน
        // ทำให้ throw IllegalArgumentException เสมอถ้าไม่ตั้ง method มาก่อนสร้าง
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("foo.txt");
        new ZipArchiveEntry(base);
    }

    @Test
    public void testConstructorFromZipArchiveEntry_copiesAttributes() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("foo.txt");
        original.setMethod(0); // ต้องตั้งค่า method ก่อน มิฉะนั้น copy constructor จะ throw (ดูเทสด้านบน)
        original.setInternalAttributes(5);
        original.setExternalAttributes(123L);
        ZipExtraField field = parseSingleField(0x1234, new byte[]{9, 9});
        original.addExtraField(field);

        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(123L, copy.getExternalAttributes());
        assertEquals(1, copy.getExtraFields(true).length);
    }

    @Test
    public void testProtectedConstructor_emptyName() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        assertEquals("", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorFileDirectory_appendsSlashWhenMissing() throws IOException {
        File dir = tempFolder.newFolder("subdir");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "subdir");
        assertTrue(entry.getName().endsWith("/"));
    }

    @Test
    public void testConstructorFileDirectory_keepsExistingSlash() throws IOException {
        File dir = tempFolder.newFolder("subdir2");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "subdir2/");
        assertEquals("subdir2/", entry.getName());
    }

    @Test
    public void testConstructorFile_regularFile_setsSizeFromFile() throws IOException {
        File f = tempFolder.newFile("a.txt");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(new byte[]{1, 2, 3});
        fos.close();
        ZipArchiveEntry entry = new ZipArchiveEntry(f, "a.txt");
        assertEquals(3, entry.getSize());
        assertFalse(entry.getName().endsWith("/"));
    }

    // ---------------------------------------------------------------
    // clone
    // ---------------------------------------------------------------

    @Test
    public void testClone_copiesAttributesAndExtraFields() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setInternalAttributes(7);
        entry.setExternalAttributes(77L);
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1});
        entry.addExtraField(field);

        ZipArchiveEntry clone = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getInternalAttributes(), clone.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), clone.getExternalAttributes());
        assertEquals(entry.getExtraFields(true).length, clone.getExtraFields(true).length);
    }

    // ---------------------------------------------------------------
    // method
    // ---------------------------------------------------------------

    @Test
    public void testDefaultMethod_isMinusOne() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testSetGetMethod_validValue() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negative_throws() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.setMethod(-1);
    }

    // ---------------------------------------------------------------
    // internal / external attributes
    // ---------------------------------------------------------------

    @Test
    public void testInternalAttributes_defaultAndSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        assertEquals(0, entry.getInternalAttributes());
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributes_defaultAndSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        assertEquals(0L, entry.getExternalAttributes());
        entry.setExternalAttributes(999L);
        assertEquals(999L, entry.getExternalAttributes());
    }

    // ---------------------------------------------------------------
    // unix mode
    // ---------------------------------------------------------------

    @Test
    public void testSetUnixMode_writableFile_notDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setUnixMode(0644); // (mode & 0200) != 0 -> readonlyBit=0 ; isDirectory=false -> dirBit=0
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
    }

    @Test
    public void testSetUnixMode_readOnly_directory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0444); // (mode & 0200)==0 -> readonlyBit=1 ; isDirectory=true -> dirBit=0x10
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0444, entry.getUnixMode());
        assertEquals(1 | 0x10, entry.getExternalAttributes() & 0xFF);
    }

    @Test
    public void testGetUnixMode_nonUnixPlatform_returnsZero() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals(0, entry.getUnixMode());
    }

    // ---------------------------------------------------------------
    // platform
    // ---------------------------------------------------------------

    @Test
    public void testGetSetPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    // ---------------------------------------------------------------
    // extra fields: set / get
    // ---------------------------------------------------------------

    @Test
    public void testSetExtraFields_mixedNormalAndUnparseable() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField normal = parseSingleField(0x1234, new byte[]{1, 2});
        ZipExtraField[] parsedMalformed = ExtraFieldUtils.parse(malformedExtra(0x01), true,
                ExtraFieldUtils.UnparseableExtraField.READ);
        UnparseableExtraFieldData unparseable = null;
        for (ZipExtraField f : parsedMalformed) {
            if (f instanceof UnparseableExtraFieldData) {
                unparseable = (UnparseableExtraFieldData) f;
            }
        }
        assertNotNull("expected malformed bytes to yield UnparseableExtraFieldData", unparseable);

        entry.setExtraFields(new ZipExtraField[]{normal, unparseable});
        assertEquals(1, entry.getExtraFields().length);       // normal only
        assertEquals(2, entry.getExtraFields(true).length);   // normal + unparseable
        assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetExtraFields_noneSet_returnsEmptyArrays() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals(0, entry.getExtraFields().length);
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testGetExtraFields_extraFieldsNonNull_noUnparseable_bothCallsEqualLength() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField f1 = parseSingleField(0x1234, new byte[]{1});
        ZipExtraField f2 = parseSingleField(0x1234, new byte[]{2, 2}); // replace ตัวเดิม
        entry.addExtraField(f1);
        entry.addExtraField(f2);
        assertEquals(entry.getExtraFields(false).length, entry.getExtraFields(true).length);
        assertSame(f2, entry.getExtraField(new ZipShort(0x1234)));
    }

    // ---------------------------------------------------------------
    // addExtraField
    // ---------------------------------------------------------------

    @Test
    public void testAddExtraField_whenExtraFieldsNull_createsMap() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1});
        entry.addExtraField(field);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testAddExtraField_unparseable_extraFieldsStaysNull() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField[] parsed = ExtraFieldUtils.parse(malformedExtra(0x01), true,
                ExtraFieldUtils.UnparseableExtraField.READ);
        UnparseableExtraFieldData u = (UnparseableExtraFieldData) parsed[0];
        entry.addExtraField(u);
        assertSame(u, entry.getUnparseableExtraFieldData());
        // extraFields ยังเป็น null ภายใน -> getExtraFields(false) ต้องว่าง, (true) ต้องมี 1
        assertEquals(0, entry.getExtraFields(false).length);
        assertEquals(1, entry.getExtraFields(true).length);
    }

    // ---------------------------------------------------------------
    // addAsFirstExtraField
    // ---------------------------------------------------------------

    @Test
    public void testAddAsFirstExtraField_noExisting_copyIsNull() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1});
        entry.addAsFirstExtraField(field);
        assertEquals(1, entry.getExtraFields().length);
        assertSame(field, entry.getExtraFields()[0]);
    }

    @Test
    public void testAddAsFirstExtraField_withExisting_movesToFront() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField f1 = parseSingleField(0x1111, new byte[]{1});
        ZipExtraField f2 = parseSingleField(0x2222, new byte[]{2});
        entry.addExtraField(f1);
        entry.addExtraField(f2);
        entry.addAsFirstExtraField(f2);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertSame(f2, fields[0]);
    }

    @Test
    public void testAddAsFirstExtraField_unparseable() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField[] parsed = ExtraFieldUtils.parse(malformedExtra(0x01), true,
                ExtraFieldUtils.UnparseableExtraField.READ);
        UnparseableExtraFieldData u = (UnparseableExtraFieldData) parsed[0];
        entry.addAsFirstExtraField(u);
        assertSame(u, entry.getUnparseableExtraFieldData());
    }

    // ---------------------------------------------------------------
    // removeExtraField
    // ---------------------------------------------------------------

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_extraFieldsNull_throws() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.removeExtraField(new ZipShort(0x1234));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_notFound_throws() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.addExtraField(parseSingleField(0x1234, new byte[]{1}));
        entry.removeExtraField(new ZipShort(0x9999));
    }

    @Test
    public void testRemoveExtraField_success() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.addExtraField(parseSingleField(0x1234, new byte[]{1}));
        entry.removeExtraField(new ZipShort(0x1234));
        assertEquals(0, entry.getExtraFields().length);
    }

    // ---------------------------------------------------------------
    // removeUnparseableExtraFieldData
    // ---------------------------------------------------------------

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_whenNull_throws() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testRemoveUnparseableExtraFieldData_success() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setExtra(malformedExtra(0x01));
        assertNotNull(entry.getUnparseableExtraFieldData());
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    // ---------------------------------------------------------------
    // getExtraField
    // ---------------------------------------------------------------

    @Test
    public void testGetExtraField_extraFieldsNull_returnsNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testGetExtraField_found() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1});
        entry.addExtraField(field);
        assertSame(field, entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testGetExtraField_notFound() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.addExtraField(parseSingleField(0x1234, new byte[]{1}));
        assertNull(entry.getExtraField(new ZipShort(0x5678)));
    }

    // ---------------------------------------------------------------
    // setExtra(byte[]) / setCentralDirectoryExtra / mergeExtraFields
    // ---------------------------------------------------------------

    @Test
    public void testSetExtra_validData_mergesFields() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setExtra(buildExtraField(0x1234, new byte[]{5, 6, 7}));
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testSetCentralDirectoryExtra_validData() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setCentralDirectoryExtra(buildExtraField(0x1234, new byte[]{5, 6, 7}));
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testMergeExtraFields_localBranch_updatesExistingInPlace() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1, 2});
        entry.addExtraField(field);

        entry.setExtra(buildExtraField(0x1234, new byte[]{9, 9, 9})); // local=true, existing!=null
        assertEquals(1, entry.getExtraFields().length);
        assertSame(field, entry.getExtraField(new ZipShort(0x1234))); // ยังเป็น object เดิม (parse ใน local field)
    }

    @Test
    public void testMergeExtraFields_centralBranch_updatesExistingInPlace() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        ZipExtraField field = parseSingleField(0x1234, new byte[]{1, 2});
        entry.addExtraField(field);

        entry.setCentralDirectoryExtra(buildExtraField(0x1234, new byte[]{9, 9, 9})); // local=false
        assertEquals(1, entry.getExtraFields().length);
        assertSame(field, entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testMergeExtraFields_unparseableExisting_getsReplaced() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setExtra(malformedExtra(0x01));
        assertNotNull(entry.getUnparseableExtraFieldData());

        entry.setExtra(malformedExtra(0x02)); // existing (unparseableExtra) != null branch
        assertNotNull(entry.getUnparseableExtraFieldData());
    }

    // NOTE: catch(ZipException) -> RuntimeException ใน setExtra(byte[]) ไม่สามารถทดสอบได้
    // เพราะตาม comment ในซอร์ส ("actually this is not possible as of Commons Compress 1.1")
    // ExtraFieldUtils.parse ที่ใช้ policy READ จะไม่ throw ZipException จริง ๆ จึงไม่เขียนเทสสำหรับ branch นี้

    // ---------------------------------------------------------------
    // getLocalFileDataExtra / getCentralDirectoryExtra
    // ---------------------------------------------------------------

    @Test
    public void testGetLocalFileDataExtra_whenSuperExtraNull_returnsEmptyArray() {
        // Constructor ZipArchiveEntry(String) ไม่เรียก setExtra() ใด ๆ เลย
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertNull(entry.getExtra());
        byte[] result = entry.getLocalFileDataExtra();
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetLocalFileDataExtra_whenSet_returnsNonEmpty() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.addExtraField(parseSingleField(0x1234, new byte[]{1, 2}));
        byte[] result = entry.getLocalFileDataExtra();
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testGetCentralDirectoryExtra_nonEmpty() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.addExtraField(parseSingleField(0x1234, new byte[]{1, 2}));
        byte[] result = entry.getCentralDirectoryExtra();
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    // ---------------------------------------------------------------
    // name
    // ---------------------------------------------------------------

    @Test
    public void testGetName_normal() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt", entry.getName());
    }

    @Test
    public void testGetName_fallsBackToSuper_whenFieldNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setName(null); // protected -> accessible ในแพ็กเกจเดียวกัน
        assertEquals("foo.txt", entry.getName());
    }

    @Test
    public void testIsDirectory_true() {
        assertTrue(new ZipArchiveEntry("dir/").isDirectory());
    }

    @Test
    public void testIsDirectory_false() {
        assertFalse(new ZipArchiveEntry("file.txt").isDirectory());
    }

    @Test
    public void testSetName_backslashReplaced_onFatPlatform_noSlash() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt"); // platform default = FAT
        entry.setName("a\\b\\c");
        assertEquals("a/b/c", entry.getName());
    }

    @Test
    public void testSetName_notReplaced_whenSlashAlreadyPresent() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setName("a/b\\c"); // มี "/" อยู่แล้ว -> indexOf("/") != -1
        assertEquals("a/b\\c", entry.getName());
    }

    @Test
    public void testSetName_notReplaced_onUnixPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setName("a\\b\\c");
        assertEquals("a\\b\\c", entry.getName());
    }

    @Test
    public void testSetNameWithRawName_getRawNameReturnsDefensiveCopy() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        byte[] raw = new byte[]{1, 2, 3};
        entry.setName("bar.txt", raw);
        assertEquals("bar.txt", entry.getName());
        byte[] got = entry.getRawName();
        assertArrayEquals(raw, got);
        assertNotSame(raw, got);
    }

    @Test
    public void testGetRawName_defaultNull() {
        assertNull(new ZipArchiveEntry("foo.txt").getRawName());
    }

    // ---------------------------------------------------------------
    // size
    // ---------------------------------------------------------------

    @Test
    public void testGetSize_default() {
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, new ZipArchiveEntry("foo.txt").getSize());
    }

    @Test
    public void testSetSize_zero_boundaryValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }

    @Test
    public void testSetSize_positive() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setSize(100L);
        assertEquals(100L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throws() {
        new ZipArchiveEntry("foo.txt").setSize(-1L);
    }

    // ---------------------------------------------------------------
    // hashCode
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_matchesNameHashCode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt".hashCode(), entry.hashCode());
    }

    // ---------------------------------------------------------------
    // general purpose bit
    // ---------------------------------------------------------------

    @Test
    public void testGeneralPurposeBit_defaultNotNull() {
        assertNotNull(new ZipArchiveEntry("foo.txt").getGeneralPurposeBit());
    }

    @Test
    public void testSetGetGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        // สมมติฐาน (assumption): GeneralPurposeBit มีเมธอด useEncryption(boolean)/usesEncryption()
        // ตาม API มาตรฐานของ Apache Commons Compress ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง
        gpb.useEncryption(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    // ---------------------------------------------------------------
    // getLastModifiedDate
    // ---------------------------------------------------------------

    @Test
    public void testGetLastModifiedDate_matchesTime() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        entry.setTime(123456789L);
        Date date = entry.getLastModifiedDate();
        assertNotNull(date);
        assertEquals(entry.getTime(), date.getTime());
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo.txt");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(new ZipArchiveEntry("foo.txt").equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(new ZipArchiveEntry("foo.txt").equals("not a ZipArchiveEntry"));
    }

    @Test
    public void testEquals_differentName_returnsFalse() {
        assertFalse(new ZipArchiveEntry("foo.txt").equals(new ZipArchiveEntry("bar.txt")));
    }

    // หมายเหตุ: เงื่อนไข "if (myName == null)" ภายใน equals() เป็น dead branch ในทางปฏิบัติ
    // เพราะ myName มาจาก getName() ซึ่งไม่มีทางคืนค่า null ได้ (getName() มี fallback ไปที่ super.getName()
    // ซึ่งไม่เป็น null เสมอตาม constructor ของ java.util.zip.ZipEntry) จึงไม่เขียนเทสสำหรับ branch นี้โดยตรง

    @Test
    public void testEquals_oneCommentNull_otherNonNull_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setComment(null);
        b.setComment("world");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentComment_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setComment("hello");
        b.setComment("world");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_sameNonNullComment_stillEqual() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setComment("same");
        b.setComment("same");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentTime_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setTime(1000L);
        b.setTime(2000L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentInternalAttributes_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setInternalAttributes(1);
        b.setInternalAttributes(2);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentPlatform_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        b.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentExternalAttributes_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setExternalAttributes(1L);
        b.setExternalAttributes(2L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentMethod_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setMethod(1);
        b.setMethod(2);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentSize_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setSize(1L);
        b.setSize(2L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentCrc_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setCrc(111L);
        b.setCrc(222L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentCompressedSize_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.setCompressedSize(10L);
        b.setCompressedSize(20L);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentExtraData_returnsFalse() throws ZipException {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        a.addExtraField(parseSingleField(0x1111, new byte[]{1}));
        b.addExtraField(parseSingleField(0x2222, new byte[]{2}));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentGpb_returnsFalse() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        GeneralPurposeBit gpbA = new GeneralPurposeBit();
        gpbA.useEncryption(true);
        GeneralPurposeBit gpbB = new GeneralPurposeBit();
        gpbB.useEncryption(false);
        a.setGeneralPurposeBit(gpbA);
        b.setGeneralPurposeBit(gpbB);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_allFieldsEqual_returnsTrue() {
        ZipArchiveEntry a = new ZipArchiveEntry("foo.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("foo.txt");
        assertTrue(a.equals(b));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorWithName_regularFile/_directory | isDirectory() true/false ผ่าน endsWith("/") |
| testConstructorWithName_null_throws | super(name) กับ name=null (NPE จาก JDK) |
| testConstructorFromZipEntry_noExtra_setsEmptyExtra | branch `extra != null` = false → setExtra() |
| testConstructorFromZipEntry_withExtra_parsesFields | branch `extra != null` = true → setExtraFields |
| testConstructorFromZipEntry_defaultMethodNegative_throws | **Fault**: setMethod(-1) throw ภายใน copy constructor |
| testConstructorFromZipArchiveEntry_copiesAttributes | constructor 3 พารามิเตอร์ + getExtraFields(true) |
| testProtectedConstructor_emptyName | protected no-arg constructor |
| testConstructorFileDirectory_appendsSlashWhenMissing | `isDirectory()&&!endsWith("/")` = true |
| testConstructorFileDirectory_keepsExistingSlash | `isDirectory()&&!endsWith("/")` = false (endsWith=true) |
| testConstructorFile_regularFile_setsSizeFromFile | `isFile()` = true → setSize() ; `isDirectory()`=false |
| testClone_copiesAttributesAndExtraFields | clone() copy internal/external/extraFields |
| testDefaultMethod_isMinusOne | ค่า default ของ method field |
| testSetGetMethod_validValue | setMethod(method>=0) |
| testSetMethod_negative_throws | `method < 0` → throw |
| testInternalAttributes_defaultAndSet / testExternalAttributes_defaultAndSet | getter/setter ปกติ |
| testSetUnixMode_writableFile_notDirectory | ternary readonly=false, dir=false |
| testSetUnixMode_readOnly_directory | ternary readonly=true, dir=true |
| testGetUnixMode_nonUnixPlatform_returnsZero | `platform != PLATFORM_UNIX` = true |
| testGetSetPlatform | setPlatform/getPlatform |
| testSetExtraFields_mixedNormalAndUnparseable | loop + instanceof branch ทั้งสองแบบ |
| testGetExtraFields_noneSet_returnsEmptyArrays | extraFields==null, unparseableExtra==null (ทั้ง true/false) |
| testGetExtraFields_extraFieldsNonNull_noUnparseable... | extraFields!=null, unparseableExtra==null |
| testAddExtraField_whenExtraFieldsNull_createsMap | `extraFields==null` → new map |
| testAddExtraField_unparseable_extraFieldsStaysNull | instanceof UnparseableExtraFieldData = true |
| testAddAsFirstExtraField_noExisting_copyIsNull | `copy != null` = false |
| testAddAsFirstExtraField_withExisting_movesToFront | `copy != null` = true |
| testAddAsFirstExtraField_unparseable | instanceof = true |
| testRemoveExtraField_extraFieldsNull_throws | `extraFields==null` → throw |
| testRemoveExtraField_notFound_throws | `remove(type)==null` → throw |
| testRemoveExtraField_success | remove สำเร็จ |
| testRemoveUnparseableExtraFieldData_whenNull_throws | `unparseableExtra==null` → throw |
| testRemoveUnparseableExtraFieldData_success | ลบสำเร็จ |
| testGetExtraField_extraFieldsNull_returnsNull | `extraFields != null` = false |
| testGetExtraField_found/_notFound | `extraFields != null` = true, พบ/ไม่พบ |
| testSetExtra_validData_mergesFields | setExtra(byte[]) → mergeExtraFields, extraFields==null branch |
| testSetCentralDirectoryExtra_validData | เหมือนข้างบนแต่ local=false |
| testMergeExtraFields_localBranch... | mergeExtraFields: existing!=null, local=true |
| testMergeExtraFields_centralBranch... | mergeExtraFields: existing!=null, local=false |
| testMergeExtraFields_unparseableExisting_getsReplaced | instanceof UnparseableExtraFieldData ภายใน merge loop |
| testGetLocalFileDataExtra_whenSuperExtraNull_returnsEmptyArray | `extra != null` = false |
| testGetLocalFileDataExtra_whenSet_returnsNonEmpty | `extra != null` = true |
| testGetCentralDirectoryExtra_nonEmpty | getCentralDirectoryExtra() |
| testGetName_normal / _fallsBackToSuper_whenFieldNull | `name==null` = false/true |
| testIsDirectory_true/_false | endsWith("/") |
| testSetName_backslashReplaced_onFatPlatform_noSlash | condition ทั้งหมด true |
| testSetName_notReplaced_whenSlashAlreadyPresent | `indexOf("/")==-1` = false |
| testSetName_notReplaced_onUnixPlatform | `platform==FAT` = false |
| testSetNameWithRawName_getRawNameReturnsDefensiveCopy | `rawName != null` = true, defensive copy |
| testGetRawName_defaultNull | `rawName != null` = false |
| testGetSize_default / testSetSize_* | size default, size>=0 boundary(0), negative throw |
| testHashCode_matchesNameHashCode | hashCode() |
| testGeneralPurposeBit_defaultNotNull / testSetGetGeneralPurposeBit | getter/setter gpb |
| testGetLastModifiedDate_matchesTime | new Date(getTime()) |
| testEquals_sameInstance | `this==obj` = true |
| testEquals_null_returnsFalse | `obj==null` = true |
| testEquals_differentClass_returnsFalse | `getClass()!=obj.getClass()` = true |
| testEquals_differentName_returnsFalse | name mismatch (`!myName.equals`) |
| testEquals_oneCommentNull_otherNonNull_returnsFalse | `myComment==null && otherComment!=null` |
| testEquals_differentComment_returnsFalse | `!myComment.equals(otherComment)` |
| testEquals_sameNonNullComment_stillEqual | comment equal branch (true) |
| testEquals_differentTime/_InternalAttributes/_Platform/_ExternalAttributes/_Method/_Size/_Crc/_CompressedSize/_ExtraData/_Gpb | falsify แต่ละเงื่อนไขใน `&&` chain ทีละตัว |
| testEquals_allFieldsEqual_returnsTrue | ทุกเงื่อนไขเป็น true → return true |

**หมายเหตุ branch ที่ไม่ได้ทดสอบ (พร้อมเหตุผล):**
- `if (myName == null)` ใน `equals()` — unreachable ในทางปฏิบัติเพราะ `getName()` ไม่คืน null
- catch(`ZipException`) → `RuntimeException` ใน `setExtra(byte[])` — ตาม comment ในซอร์สระบุว่า "not possible as of Commons Compress 1.1"