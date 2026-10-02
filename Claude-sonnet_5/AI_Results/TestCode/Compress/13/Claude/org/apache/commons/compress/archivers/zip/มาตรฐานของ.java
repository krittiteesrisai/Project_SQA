package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
// ASSUMPTION: UnrecognizedExtraField เป็น public class มาตรฐานของ commons-compress
// ใช้เป็น concrete ZipExtraField implementation สำหรับทดสอบ (ไม่ได้ระบุใน source ที่ให้มา)
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;

/**
 * Unit tests for {@link ZipArchiveEntry} (Defects4J Compress-13b).
 */
public class ZipArchiveEntryTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- Helper subclass เพื่อเข้าถึง protected no-arg constructor ----------
    private static class TestableEntry extends ZipArchiveEntry {
        TestableEntry() {
            super();
        }
    }

    // ===================== Constructors =====================

    @Test
    public void testConstructorWithPlainName() {
        ZipArchiveEntry e = new ZipArchiveEntry("file.txt");
        assertEquals("file.txt", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorWithDirectoryName() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        assertEquals("dir/", e.getName());
        assertTrue(e.isDirectory());
    }

    @Test
    public void testProtectedNoArgConstructorDefaultsToEmptyName() {
        ZipArchiveEntry e = new TestableEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testFileConstructorRegularFile() throws IOException {
        File f = tempFolder.newFile("plain.txt");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(new byte[]{1, 2, 3, 4, 5});
        fos.close();

        ZipArchiveEntry entry = new ZipArchiveEntry(f, "plain.txt");
        assertEquals("plain.txt", entry.getName());
        assertFalse(entry.isDirectory());
        assertEquals(5L, entry.getSize());
    }

    @Test
    public void testFileConstructorDirectoryAppendsSlash() throws IOException {
        File dir = tempFolder.newFolder("subdir");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "subdir");
        assertEquals("subdir/", entry.getName());
        assertTrue(entry.isDirectory());
        // isFile() == false -> setSize() ไม่ถูกเรียก -> ค่า default SIZE_UNKNOWN
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, entry.getSize());
    }

    @Test
    public void testFileConstructorDirectoryNameAlreadyHasSlash() throws IOException {
        File dir = tempFolder.newFolder("subdir2");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "subdir2/");
        assertEquals("subdir2/", entry.getName()); // ไม่ถูกเติม "/" ซ้ำ
    }

    @Test
    public void testFileConstructorNonExistentFileKeepsNameAndUnknownSize() {
        File notExist = new File(tempFolder.getRoot(), "doesNotExist.txt");
        ZipArchiveEntry entry = new ZipArchiveEntry(notExist, "doesNotExist.txt");
        assertEquals("doesNotExist.txt", entry.getName());
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZipEntryConstructorThrowsWhenMethodUnset() throws Exception {
        // java.util.zip.ZipEntry.getMethod() คืน -1 โดย default -> setMethod(-1) ต้อง throw
        ZipEntry ze = new ZipEntry("foo.txt");
        new ZipArchiveEntry(ze);
    }

    @Test
    public void testZipEntryConstructorNoExtraInitializesEmptyExtra() throws Exception {
        ZipEntry ze = new ZipEntry("foo.txt");
        ze.setMethod(ZipEntry.STORED);
        ze.setSize(10L);
        assertNull(ze.getExtra());

        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        assertEquals("foo.txt", entry.getName());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertEquals(10L, entry.getSize());
        // ตามคอมเมนต์ใน source: "initializes extra data to an empty byte array"
        assertEquals(0, entry.getLocalFileDataExtra().length);
    }

    @Test
    public void testZipEntryConstructorWithExtraParsesFields() throws Exception {
        ZipEntry ze = new ZipEntry("bar.txt");
        ze.setMethod(ZipEntry.DEFLATED);
        byte[] extra = {0x34, 0x12, 0x02, 0x00, 'x', 'y'};
        ze.setExtra(extra);

        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        assertEquals("bar.txt", entry.getName());
        assertNotNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testCopyConstructorFromZipArchiveEntry() throws Exception {
        ZipArchiveEntry original = new ZipArchiveEntry("orig.txt");
        original.setInternalAttributes(7);
        original.setExternalAttributes(123L);
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(99));
        uef.setLocalFileDataData(new byte[]{9, 9});
        original.addExtraField(uef);

        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals(original.getName(), copy.getName());
        assertEquals(7, copy.getInternalAttributes());
        assertEquals(123L, copy.getExternalAttributes());
        assertNotNull(copy.getExtraField(new ZipShort(99)));
    }

    // ===================== clone() =====================

    @Test
    public void testClone() throws Exception {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        e1.setInternalAttributes(3);
        e1.setExternalAttributes(99L);
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        uef.setLocalFileDataData(new byte[]{1, 2});
        e1.addExtraField(uef);

        ZipArchiveEntry clone = (ZipArchiveEntry) e1.clone();
        assertNotSame(e1, clone);
        assertEquals(e1.getInternalAttributes(), clone.getInternalAttributes());
        assertEquals(e1.getExternalAttributes(), clone.getExternalAttributes());
        assertEquals(e1.getName(), clone.getName());
        assertSame(uef, clone.getExtraField(new ZipShort(1))); // shallow copy ของ extraFields
        assertTrue(e1.equals(clone));
    }

    // ===================== method =====================

    @Test
    public void testGetMethodDefaultIsMinusOne() {
        assertEquals(-1, new ZipArchiveEntry("a.txt").getMethod());
    }

    @Test
    public void testSetMethodZeroValid() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(0);
        assertEquals(0, e.getMethod());
    }

    @Test
    public void testSetMethodPositiveValid() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(8);
        assertEquals(8, e.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegativeThrows() {
        new ZipArchiveEntry("a.txt").setMethod(-5);
    }

    // ===================== internal / external attributes =====================

    @Test
    public void testInternalAttributesDefaultZero() {
        assertEquals(0, new ZipArchiveEntry("a.txt").getInternalAttributes());
    }

    @Test
    public void testSetGetInternalAttributes() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setInternalAttributes(42);
        assertEquals(42, e.getInternalAttributes());
    }

    @Test
    public void testExternalAttributesDefaultZero() {
        assertEquals(0L, new ZipArchiveEntry("a.txt").getExternalAttributes());
    }

    @Test
    public void testSetGetExternalAttributes() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExternalAttributes(555L);
        assertEquals(555L, e.getExternalAttributes());
    }

    // ===================== setUnixMode / getUnixMode / getPlatform =====================

    @Test
    public void testGetPlatformDefaultFat() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, new ZipArchiveEntry("a.txt").getPlatform());
    }

    @Test
    public void testGetUnixModeBeforeSetUnixModeIsZero() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExternalAttributes(0xFFFFFFFFL); // ตั้งตรง ๆ โดยไม่ผ่าน setUnixMode
        assertEquals(0, e.getUnixMode()); // platform != PLATFORM_UNIX -> 0
    }

    @Test
    public void testSetUnixModeSetsPlatformUnixAndValueForFile() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt"); // ไม่ใช่ directory
        e.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
        assertEquals(0644, e.getUnixMode());
        assertEquals(0, e.getExternalAttributes() & 0x10); // ไม่ใช่ directory -> ไม่ตั้ง flag 0x10
    }

    @Test
    public void testSetUnixModeForDirectorySetsDirFlag() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir/"); // directory
        e.setUnixMode(0755);
        assertEquals(0755, e.getUnixMode());
        assertEquals(0x10, e.getExternalAttributes() & 0x10);
    }

    @Test
    public void testSetUnixModeOwnerWriteBitSet_ReadOnlyFlagZero() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setUnixMode(0200); // owner-write bit set -> (mode & 0200) != 0 -> เพิ่ม 0
        assertEquals(0, e.getExternalAttributes() & 1);
    }

    @Test
    public void testSetUnixModeOwnerWriteBitClear_ReadOnlyFlagOne() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setUnixMode(0444); // owner-write bit clear -> (mode & 0200) == 0 -> เพิ่ม 1
        assertEquals(1, e.getExternalAttributes() & 1);
    }

    // ===================== extraFields: get/set =====================

    @Test
    public void testGetExtraFieldsEmptyByDefault() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        assertEquals(0, e.getExtraFields().length);
        assertEquals(0, e.getExtraFields(true).length);
    }

    @Test
    public void testGetExtraFieldNullWhenNoFieldsAtAll() {
        assertNull(new ZipArchiveEntry("a.txt").getExtraField(new ZipShort(1)));
    }

    @Test
    public void testSetExtraFieldsEmptyArray() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, e.getExtraFields().length);
        assertNull(e.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraFieldsWithNormalField() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(5));
        uef.setLocalFileDataData(new byte[]{1});
        e.setExtraFields(new ZipExtraField[]{uef});
        assertEquals(1, e.getExtraFields().length);
        assertSame(uef, e.getExtraField(new ZipShort(5)));
    }

    @Test
    public void testGetExtraFieldsNoArgExcludesUnparseable() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x01}); // malformed -> unparseableExtra != null, extraFields = empty map
        assertEquals(0, e.getExtraFields().length);         // includeUnparseable=false
        assertEquals(1, e.getExtraFields(true).length);     // includeUnparseable=true
    }

    // ===================== addExtraField / addAsFirstExtraField =====================

    @Test
    public void testAddExtraFieldOnFreshEntry_extraFieldsWasNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(7));
        e.addExtraField(uef);
        assertSame(uef, e.getExtraField(new ZipShort(7)));
    }

    @Test
    public void testAddExtraFieldReplacesExistingSameHeaderId() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef1 = new UnrecognizedExtraField();
        uef1.setHeaderId(new ZipShort(7));
        e.addExtraField(uef1);

        UnrecognizedExtraField uef2 = new UnrecognizedExtraField();
        uef2.setHeaderId(new ZipShort(7));
        e.addExtraField(uef2);

        assertEquals(1, e.getExtraFields().length);
        assertSame(uef2, e.getExtraField(new ZipShort(7)));
    }

    @Test
    public void testAddAsFirstExtraFieldOnEmptyEntry_copyIsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        e.addAsFirstExtraField(uef);
        ZipExtraField[] fields = e.getExtraFields();
        assertEquals(1, fields.length);
        assertSame(uef, fields[0]);
    }

    @Test
    public void testAddAsFirstExtraFieldPrependsWhenFieldsExist_copyNotNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField first = new UnrecognizedExtraField();
        first.setHeaderId(new ZipShort(1));
        e.addExtraField(first);
        UnrecognizedExtraField second = new UnrecognizedExtraField();
        second.setHeaderId(new ZipShort(2));
        e.addExtraField(second);

        UnrecognizedExtraField newFirst = new UnrecognizedExtraField();
        newFirst.setHeaderId(new ZipShort(3));
        e.addAsFirstExtraField(newFirst);

        ZipExtraField[] fields = e.getExtraFields();
        assertEquals(3, fields.length);
        assertSame(newFirst, fields[0]);
    }

    // ===================== removeExtraField / removeUnparseableExtraFieldData =====================

    @Test
    public void testRemoveExtraFieldThrowsWhenNoFieldsAtAll() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        try {
            e.removeExtraField(new ZipShort(1));
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException ex) {
            // expected: extraFields == null
        }
    }

    @Test
    public void testRemoveExtraFieldThrowsWhenTypeNotFound() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        e.addExtraField(uef);
        try {
            e.removeExtraField(new ZipShort(2));
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException ex) {
            // expected: remove() returns null
        }
    }

    @Test
    public void testRemoveExtraFieldSucceeds() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        e.addExtraField(uef);
        e.removeExtraField(new ZipShort(1));
        assertNull(e.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataThrowsWhenNone() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        try {
            e.removeUnparseableExtraFieldData();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException ex) {
            // expected
        }
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataSucceeds() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x01}); // malformed -> unparseableExtra != null
        assertNotNull(e.getUnparseableExtraFieldData());
        e.removeUnparseableExtraFieldData();
        assertNull(e.getUnparseableExtraFieldData());
    }

    // ===================== setExtra(byte[]) / setCentralDirectoryExtra / merge =====================

    @Test
    public void testSetExtraValidBytesOnFreshEntry_extraFieldsWasNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x34, 0x12, 0x04, 0x00, 'a', 'b', 'c', 'd'});
        assertNotNull(e.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testSetExtraMergesWithExistingFieldSameId_localBranch() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x34, 0x12, 0x04, 0x00, 'a', 'b', 'c', 'd'});
        e.setExtra(new byte[]{0x34, 0x12, 0x04, 0x00, 'w', 'x', 'y', 'z'}); // existing!=null, local=true
        assertEquals(1, e.getExtraFields().length);
    }

    @Test
    public void testSetExtraAddsNewFieldWhenExtraFieldsAlreadyExists_existingNullBranch() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'a', 'b'});
        e.setExtra(new byte[]{0x78, 0x56, 0x02, 0x00, 'c', 'd'}); // new headerId -> existing == null
        assertEquals(2, e.getExtraFields().length);
    }

    @Test
    public void testSetExtraMalformedDataNoExceptionCapturedAsUnparseable() {
        // ตาม Javadoc: malformed extra data จะไม่ throw, จะถูกเก็บเป็น UnparseableExtraFieldData
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x01}); // สั้นเกินกว่าจะอ่าน header+length ได้
        assertNotNull(e.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetCentralDirectoryExtraOnFreshEntry() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setCentralDirectoryExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'p', 'q'});
        assertNotNull(e.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testSetCentralDirectoryExtraMergesExisting_nonLocalBranch() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'a', 'b'});
        e.setCentralDirectoryExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'c', 'd'}); // local=false, existing!=null
        assertEquals(1, e.getExtraFields().length);
    }

    // ===================== getLocalFileDataExtra / getCentralDirectoryExtra =====================

    @Test
    public void testGetLocalFileDataExtra_nullSuperExtra_returnsEmptyArray() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        assertArrayEquals(new byte[0], e.getLocalFileDataExtra());
    }

    @Test
    public void testGetLocalFileDataExtra_afterSetExtra_nonEmpty() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'a', 'b'});
        assertTrue(e.getLocalFileDataExtra().length > 0);
    }

    @Test
    public void testGetCentralDirectoryExtraNotNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setCentralDirectoryExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'a', 'b'});
        assertNotNull(e.getCentralDirectoryExtra());
    }

    // ===================== getName / isDirectory / setName(String) / hashCode =====================

    @Test
    public void testIsDirectoryTrue() {
        assertTrue(new ZipArchiveEntry("dir/").isDirectory());
    }

    @Test
    public void testIsDirectoryFalse() {
        assertFalse(new ZipArchiveEntry("file.txt").isDirectory());
    }

    @Test
    public void testGetNameFallsBackToSuperWhenNameFieldNull() throws Exception {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        Field f = ZipArchiveEntry.class.getDeclaredField("name");
        f.setAccessible(true);
        f.set(e, null); // จำลอง branch name == null
        assertEquals("a.txt", e.getName()); // fallback ไปที่ super.getName()
    }

    @Test
    public void testHashCodeMatchesNameHashCode() {
        ZipArchiveEntry e = new ZipArchiveEntry("hello.txt");
        assertEquals("hello.txt".hashCode(), e.hashCode());
    }

    // ===================== getSize / setSize =====================

    @Test
    public void testSetSizeValidPositive() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setSize(100L);
        assertEquals(100L, e.getSize());
    }

    @Test
    public void testSetSizeZeroBoundary() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setSize(0L);
        assertEquals(0L, e.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegativeThrows() {
        new ZipArchiveEntry("a.txt").setSize(-1L);
    }

    // ===================== getRawName =====================

    @Test
    public void testGetRawNameDefaultNull() {
        assertNull(new ZipArchiveEntry("a.txt").getRawName());
    }

    @Test
    public void testGetRawNameReturnsDefensiveCopy() throws Exception {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        byte[] raw = new byte[]{1, 2, 3};
        Field f = ZipArchiveEntry.class.getDeclaredField("rawName");
        f.setAccessible(true);
        f.set(e, raw);

        byte[] got = e.getRawName();
        assertArrayEquals(raw, got);
        assertNotSame(raw, got); // ต้องเป็นสำเนา (System.arraycopy) ไม่ใช่ reference เดียวกัน
        got[0] = 99;
        assertEquals(1, raw[0]); // ของเดิมต้องไม่เปลี่ยน
    }

    // ===================== GeneralPurposeBit =====================

    @Test
    public void testGeneralPurposeBitDefaultNotNull() {
        assertNotNull(new ZipArchiveEntry("a.txt").getGeneralPurposeBit());
    }

    @Test
    public void testSetGetGeneralPurposeBit() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        e.setGeneralPurposeBit(gpb);
        assertSame(gpb, e.getGeneralPurposeBit());
    }

    // ===================== getLastModifiedDate =====================

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setTime(123456L);
        assertEquals(new Date(e.getTime()), e.getLastModifiedDate());
    }

    // ===================== equals() =====================

    @Test
    public void testEqualsSameInstance() {
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        assertTrue(e.equals(e));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(new ZipArchiveEntry("a.txt").equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(new ZipArchiveEntry("a.txt").equals("a.txt"));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b.txt");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsSameNameDefaultFieldsTrue() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        assertTrue(e1.equals(e2));
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testEqualsCommentOneNullOneNotFalse() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e2.setComment("hello");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsCommentDifferentFalse() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setComment("hello");
        e2.setComment("world");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsCommentSameContinuesTrue() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setComment("same");
        e2.setComment("same");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentTime() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setTime(1000L);
        e2.setTime(2000L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentInternalAttributes() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setInternalAttributes(1);
        e2.setInternalAttributes(2);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentPlatform() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setUnixMode(0755);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentExternalAttributes() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setExternalAttributes(5L);
        e2.setExternalAttributes(6L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentMethod() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setMethod(0);
        e2.setMethod(8);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentSize() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setSize(1);
        e2.setSize(2);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentCrc() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setCrc(1L);
        e2.setCrc(2L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentCompressedSize() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setCompressedSize(10L);
        e2.setCompressedSize(20L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentExtraData() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        e1.setExtra(new byte[]{0x34, 0x12, 0x02, 0x00, 'a', 'b'});
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentGeneralPurposeBit() {
        // ASSUMPTION: GeneralPurposeBit.useUTF8ForNames(boolean) มีอยู่จริง
        // (ไม่ได้ระบุใน source ที่ให้มา แต่เป็น API มาตรฐานของ commons-compress)
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("a.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        e1.setGeneralPurposeBit(gpb);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsFullyEqualClones() throws Exception {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        e1.setTime(1000L);
        e1.setInternalAttributes(1);
        e1.setExternalAttributes(2L);
        e1.setMethod(8);
        e1.setSize(10L);
        e1.setCrc(123L);
        e1.setCompressedSize(5L);
        e1.setComment("c");

        ZipArchiveEntry e2 = (ZipArchiveEntry) e1.clone();
        assertTrue(e1.equals(e2));
        assertTrue(e2.equals(e1));
    }
}
