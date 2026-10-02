package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ExtraFieldUtils.class)
public class ZipArchiveEntryTest {

    // ---------------------------------------------------------------
    // Test double สำหรับ ZipExtraField ตาม contract ที่ปรากฏในซอร์สเป้าหมาย
    // ---------------------------------------------------------------
    private static final class SimpleExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        SimpleExtraField(final int id, final byte[] data) {
            this.headerId = new ZipShort(id);
            this.localData = data;
            this.centralData = data;
        }

        @Override public ZipShort getHeaderId() { return headerId; }
        @Override public ZipShort getLocalFileDataLength() { return new ZipShort(localData.length); }
        @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(centralData.length); }
        @Override public byte[] getLocalFileDataData() { return localData; }
        @Override public byte[] getCentralDirectoryData() { return centralData; }

        @Override
        public void parseFromLocalFileData(final byte[] buffer, final int offset, final int length) {
            localData = Arrays.copyOfRange(buffer, offset, offset + length);
        }

        @Override
        public void parseFromCentralDirectoryData(final byte[] buffer, final int offset, final int length)
                throws ZipException {
            centralData = Arrays.copyOfRange(buffer, offset, offset + length);
        }
    }

    // helper: สร้าง extra field bytes ตามรูปแบบ APPNOTE ที่ระบุใน Javadoc ของคลาสเป้าหมาย
    // (2-byte header id LE, 2-byte length LE, payload)
    private static byte[] buildExtraFieldBytes(final int headerId, final byte[] payload) {
        final byte[] result = new byte[4 + payload.length];
        result[0] = (byte) (headerId & 0xFF);
        result[1] = (byte) ((headerId >> 8) & 0xFF);
        final int len = payload.length;
        result[2] = (byte) (len & 0xFF);
        result[3] = (byte) ((len >> 8) & 0xFF);
        System.arraycopy(payload, 0, result, 4, payload.length);
        return result;
    }

    private static byte[] concat(final byte[] a, final byte[] b) {
        final byte[] r = new byte[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }

    // ================= Constructors =================

    @Test
    public void testConstructorWithName_simpleFile() {
        final ZipArchiveEntry e = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorWithName_directorySuffix() {
        final ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructor_backslashReplacedOnFatPlatformNoSlash() {
        // platform เริ่มต้น = PLATFORM_FAT, ไม่มี "/" ใน name -> replace \ เป็น /
        final ZipArchiveEntry e = new ZipArchiveEntry("a\\b\\c");
        assertEquals("a/b/c", e.getName());
    }

    @Test
    public void testSetName_containsSlash_noReplace() {
        final ZipArchiveEntry e = new ZipArchiveEntry("a\\b/c");
        assertEquals("a\\b/c", e.getName());
    }

    @Test
    public void testSetName_platformNotFat_noReplace() {
        final ZipArchiveEntry e = new ZipArchiveEntry("temp");
        e.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        e.setName("a\\b");
        assertEquals("a\\b", e.getName());
    }

    @Test
    public void testSetName_null_getNameFallsBackToSuper() {
        final ZipArchiveEntry e = new ZipArchiveEntry("original.txt");
        e.setName(null); // protected, accessible same-package
        // name field == null -> getName() ต้อง fallback ไปที่ super.getName()
        assertEquals("original.txt", e.getName());
    }

    @Test
    public void testProtectedNoArgConstructor() {
        final ZipArchiveEntry e = new ZipArchiveEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testConstructorFile_directory() {
        final File dir = new File(System.getProperty("java.io.tmpdir"));
        assertTrue("precondition: tmpdir must be a directory", dir.isDirectory());
        final ZipArchiveEntry e = new ZipArchiveEntry(dir, "mydir");
        assertEquals("mydir/", e.getName());
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, e.getSize());
    }

    @Test
    public void testConstructorFile_regularFile() throws Exception {
        final File f = File.createTempFile("zae", ".tmp");
        f.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(new byte[]{1, 2, 3, 4, 5});
        }
        final ZipArchiveEntry e = new ZipArchiveEntry(f, "plain.txt");
        assertEquals("plain.txt", e.getName());
        assertEquals(f.length(), e.getSize());
    }

    @Test
    public void testConstructorFromZipEntry_extraNull() throws Exception {
        final java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("plain.txt");
        final ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertNotNull(e.getExtra());
        assertEquals(0, e.getExtra().length);
    }

    @Test
    public void testConstructorFromZipEntry_extraNotNull() throws Exception {
        final java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("with_extra.txt");
        ze.setExtra(buildExtraFieldBytes(0x4444, new byte[]{7, 7}));
        ze.setMethod(java.util.zip.ZipEntry.DEFLATED);
        ze.setSize(123);
        final ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals(123, e.getSize());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, e.getMethod());
        assertNotNull(e.getExtraField(new ZipShort(0x4444)));
    }

    @Test
    public void testCopyConstructor_gpbNull() throws Exception {
        final ZipArchiveEntry src = new ZipArchiveEntry("src");
        src.setGeneralPurposeBit(null);
        final ZipArchiveEntry copy = new ZipArchiveEntry(src);
        assertNull(copy.getGeneralPurposeBit());
    }

    @Test
    public void testCopyConstructor_gpbNotNull() throws Exception {
        final ZipArchiveEntry src = new ZipArchiveEntry("src2");
        final ZipArchiveEntry copy = new ZipArchiveEntry(src);
        assertNotSame(src.getGeneralPurposeBit(), copy.getGeneralPurposeBit());
        assertEquals(src.getGeneralPurposeBit(), copy.getGeneralPurposeBit());
    }

    // ================= clone =================

    @Test
    public void testClone() {
        final ZipArchiveEntry e = new ZipArchiveEntry("foo");
        e.setInternalAttributes(5);
        e.setExternalAttributes(10L);
        e.addExtraField(new SimpleExtraField(1, new byte[]{1, 2}));
        final ZipArchiveEntry clone = (ZipArchiveEntry) e.clone();
        assertNotSame(e, clone);
        assertEquals(5, clone.getInternalAttributes());
        assertEquals(10L, clone.getExternalAttributes());
        assertEquals(1, clone.getExtraFields().length);
    }

    // ================= method =================

    @Test
    public void testGetSetMethod_valid() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setMethod(8);
        assertEquals(8, e.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negative_throws() {
        new ZipArchiveEntry("f").setMethod(-1);
    }

    // ================= internal/external attributes =================

    @Test
    public void testGetSetInternalAttributes() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setInternalAttributes(42);
        assertEquals(42, e.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setExternalAttributes(99L);
        assertEquals(99L, e.getExternalAttributes());
    }

    // ================= unix mode =================

    @Test
    public void testSetUnixMode_writable_notDirectory() {
        final ZipArchiveEntry e = new ZipArchiveEntry("file.txt");
        e.setUnixMode(0644); // owner-write bit set -> readonly flag = 0
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
        assertEquals(0644, e.getUnixMode());
        assertEquals(0, e.getExternalAttributes() & 0x1);
    }

    @Test
    public void testSetUnixMode_readonly_notDirectory() {
        final ZipArchiveEntry e = new ZipArchiveEntry("file.txt");
        e.setUnixMode(0444); // owner-write bit NOT set -> readonly flag = 1
        assertEquals(0444, e.getUnixMode());
        assertEquals(1, e.getExternalAttributes() & 0x1);
    }

    @Test
    public void testSetUnixMode_directory() {
        final ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        e.setUnixMode(0755);
        assertEquals(0x10, e.getExternalAttributes() & 0x10);
    }

    @Test
    public void testGetUnixMode_notUnixPlatform_returnsZero() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        assertEquals(0, e.getUnixMode());
    }

    @Test
    public void testIsUnixSymlink_true() {
        final ZipArchiveEntry e = new ZipArchiveEntry("link");
        e.setUnixMode(UnixStat.LINK_FLAG | 0777);
        assertTrue(e.isUnixSymlink());
    }

    @Test
    public void testIsUnixSymlink_false() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setUnixMode(0644);
        assertFalse(e.isUnixSymlink());
    }

    // ================= platform =================

    @Test
    public void testGetSetPlatform() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, e.getPlatform());
        e.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
    }

    // ================= extra fields: getters/setters =================

    @Test
    public void testGetExtraFields_freshEntry_empty() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testGetExtraFields_afterSetExtraFields_returnsCopyEachCall() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setExtraFields(new ZipExtraField[0]);
        final ZipExtraField[] a = e.getExtraFields();
        final ZipExtraField[] b = e.getExtraFields();
        assertNotSame(a, b);
        assertEquals(0, a.length);
    }

    @Test
    public void testSetExtraFields_withUnparseableAndNormal() throws Exception {
        final byte[] malformed = {1, 2, 3}; // < 4 bytes -> ต้องกลายเป็น unparseable ตาม Javadoc
        final ZipArchiveEntry tmp = new ZipArchiveEntry("t");
        tmp.setExtra(malformed);
        final UnparseableExtraFieldData unparse = tmp.getUnparseableExtraFieldData();
        assertNotNull("precondition: malformed extra should become UnparseableExtraFieldData", unparse);

        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField sf = new SimpleExtraField(0x1234, new byte[]{9, 9});
        e.setExtraFields(new ZipExtraField[]{sf, unparse});

        assertEquals(1, e.getExtraFields().length);
        assertSame(sf, e.getExtraFields()[0]);
        assertNotNull(e.getUnparseableExtraFieldData());
        assertEquals(2, e.getExtraFields(true).length);
    }

    @Test
    public void testSetExtraFields_doesNotResetUnparseableWhenNoneProvided() throws Exception {
        // สังเกต: source ไม่มี else เคลียร์ unparseableExtra หากอาร์เรย์ใหม่ไม่มี unparseable field
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setExtra(new byte[]{1, 2, 3});
        assertNotNull(e.getUnparseableExtraFieldData());
        e.setExtraFields(new ZipExtraField[]{new SimpleExtraField(1, new byte[]{1})});
        assertNotNull("current source keeps old unparseableExtra (no reset branch)",
                e.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetAllExtraFields_merged() throws Exception {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setExtra(new byte[]{1, 2, 3});
        final ZipExtraField[] all = e.getExtraFields(true);
        assertEquals(1, all.length);
        assertSame(e.getUnparseableExtraFieldData(), all[0]);
    }

    @Test
    public void testGetAllExtraFields_noUnparseable_returnsCopyEachCall() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}));
        final ZipExtraField[] a = e.getExtraFields(true);
        final ZipExtraField[] b = e.getExtraFields(true);
        assertNotSame(a, b);
        assertEquals(1, a.length);
    }

    // ================= addExtraField =================

    @Test
    public void testAddExtraField_firstField_extraFieldsWasNull() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        e.addExtraField(f1);
        assertEquals(1, e.getExtraFields().length);
        assertSame(f1, e.getExtraFields()[0]);
    }

    @Test
    public void testAddExtraField_appendWhenNoExistingMatch() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}));
        e.addExtraField(new SimpleExtraField(2, new byte[]{2}));
        assertEquals(2, e.getExtraFields().length);
    }

    @Test
    public void testAddExtraField_replacesExistingWithSameHeaderId() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        final SimpleExtraField f2 = new SimpleExtraField(2, new byte[]{2});
        final SimpleExtraField f1b = new SimpleExtraField(1, new byte[]{9, 9});
        e.addExtraField(f1);
        e.addExtraField(f2);
        e.addExtraField(f1b);
        assertEquals(2, e.getExtraFields().length);
        assertSame(f1b, e.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testAddExtraField_unparseableType() throws Exception {
        final ZipArchiveEntry tmp = new ZipArchiveEntry("t");
        tmp.setExtra(new byte[]{1, 2, 3});
        final UnparseableExtraFieldData unparse = tmp.getUnparseableExtraFieldData();

        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(unparse);
        assertSame(unparse, e.getUnparseableExtraFieldData());
    }

    // ================= addAsFirstExtraField =================

    @Test
    public void testAddAsFirstExtraField_initial() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        e.addAsFirstExtraField(f1);
        assertEquals(1, e.getExtraFields().length);
        assertSame(f1, e.getExtraFields()[0]);
    }

    @Test
    public void testAddAsFirstExtraField_prependNoMatch() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        final SimpleExtraField f2 = new SimpleExtraField(2, new byte[]{2});
        e.addAsFirstExtraField(f1);
        e.addAsFirstExtraField(f2);
        assertSame(f2, e.getExtraFields()[0]);
        assertSame(f1, e.getExtraFields()[1]);
    }

    @Test
    public void testAddAsFirstExtraField_replacesExistingMatch() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        final SimpleExtraField f2 = new SimpleExtraField(2, new byte[]{2});
        final SimpleExtraField f1b = new SimpleExtraField(1, new byte[]{9, 9});
        e.addAsFirstExtraField(f1);
        e.addAsFirstExtraField(f2);
        e.addAsFirstExtraField(f1b);
        assertEquals(2, e.getExtraFields().length);
        assertSame(f1b, e.getExtraFields()[0]);
        assertSame(f2, e.getExtraFields()[1]);
    }

    @Test
    public void testAddAsFirstExtraField_unparseableType() throws Exception {
        final ZipArchiveEntry tmp = new ZipArchiveEntry("t");
        tmp.setExtra(new byte[]{1, 2, 3});
        final UnparseableExtraFieldData unparse = tmp.getUnparseableExtraFieldData();

        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addAsFirstExtraField(unparse);
        assertSame(unparse, e.getUnparseableExtraFieldData());
    }

    // ================= removeExtraField =================

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_noFieldsAtAll_throws() {
        new ZipArchiveEntry("e").removeExtraField(new ZipShort(1));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_notFound_throws() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}));
        e.removeExtraField(new ZipShort(99));
    }

    @Test
    public void testRemoveExtraField_found() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}));
        e.addExtraField(new SimpleExtraField(2, new byte[]{2}));
        e.removeExtraField(new ZipShort(1));
        assertEquals(1, e.getExtraFields().length);
        assertNull(e.getExtraField(new ZipShort(1)));
    }

    // ================= removeUnparseableExtraFieldData =================

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseable_none_throws() {
        new ZipArchiveEntry("e").removeUnparseableExtraFieldData();
    }

    @Test
    public void testRemoveUnparseable_present() throws Exception {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setExtra(new byte[]{1, 2, 3});
        assertNotNull(e.getUnparseableExtraFieldData());
        e.removeUnparseableExtraFieldData();
        assertNull(e.getUnparseableExtraFieldData());
    }

    // ================= getExtraField =================

    @Test
    public void testGetExtraField_nullFieldsList_returnsNull() {
        assertNull(new ZipArchiveEntry("e").getExtraField(new ZipShort(1)));
    }

    @Test
    public void testGetExtraField_notFound_returnsNull() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1}));
        assertNull(e.getExtraField(new ZipShort(99)));
    }

    @Test
    public void testGetExtraField_found() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final SimpleExtraField f1 = new SimpleExtraField(1, new byte[]{1});
        e.addExtraField(f1);
        assertSame(f1, e.getExtraField(new ZipShort(1)));
    }

    // ================= setExtra(byte[]) / setCentralDirectoryExtra / merge =================

    @Test
    public void testSetExtra_mergesWithExistingField_local() {
        final ZipArchiveEntry e = new ZipArchiveEntry("m");
        final SimpleExtraField existing = new SimpleExtraField(0x2233, new byte[]{5, 5, 5});
        e.addExtraField(existing);

        final byte[] newPayload = {9, 9, 9, 9};
        e.setExtra(buildExtraFieldBytes(0x2233, newPayload));

        assertArrayEquals(newPayload, existing.getLocalFileDataData());
        assertSame(existing, e.getExtraField(new ZipShort(0x2233)));
    }

    @Test
    public void testSetCentralDirectoryExtra_mergesExistingField() {
        final ZipArchiveEntry e = new ZipArchiveEntry("m");
        final SimpleExtraField existing = new SimpleExtraField(0x2244, new byte[]{1});
        e.addExtraField(existing);

        final byte[] payload2 = {8, 8};
        e.setCentralDirectoryExtra(buildExtraFieldBytes(0x2244, payload2));

        assertArrayEquals(payload2, existing.getCentralDirectoryData());
    }

    @Test
    public void testSetExtra_mixedMergeAndAdd() {
        final ZipArchiveEntry e = new ZipArchiveEntry("m");
        e.addExtraField(new SimpleExtraField(0x1111, new byte[]{1}));

        final byte[] combined = concat(
                buildExtraFieldBytes(0x1111, new byte[]{2, 2}),
                buildExtraFieldBytes(0x9999, new byte[]{3, 3, 3}));
        e.setExtra(combined);

        assertEquals(2, e.getExtraFields().length);
        final ZipExtraField f1111 = e.getExtraField(new ZipShort(0x1111));
        assertArrayEquals(new byte[]{2, 2}, f1111.getLocalFileDataData());
        final ZipExtraField f9999 = e.getExtraField(new ZipShort(0x9999));
        assertNotNull(f9999);
        assertArrayEquals(new byte[]{3, 3, 3}, f9999.getLocalFileDataData());
    }

    @Test
    public void testSetExtra_wrapsZipExceptionAsRuntimeException() throws Exception {
        // ทดสอบ catch-branch ที่ปกติ unreachable ผ่าน public API ตาม comment ในซอร์ส
        PowerMockito.mockStatic(ExtraFieldUtils.class);
        PowerMockito.when(ExtraFieldUtils.parse(any(byte[].class), anyBoolean(),
                any(ExtraFieldUtils.UnparseableExtraField.class)))
                .thenThrow(new ZipException("boom"));

        try {
            new ZipArchiveEntry("x").setExtra(new byte[]{1, 2, 3, 4});
            fail("expected RuntimeException");
        } catch (final RuntimeException ex) {
            assertTrue(ex.getMessage().contains("Error parsing extra fields"));
        }
    }

    @Test
    public void testSetCentralDirectoryExtra_wrapsZipExceptionAsRuntimeException() throws Exception {
        PowerMockito.mockStatic(ExtraFieldUtils.class);
        PowerMockito.when(ExtraFieldUtils.parse(any(byte[].class), anyBoolean(),
                any(ExtraFieldUtils.UnparseableExtraField.class)))
                .thenThrow(new ZipException("boom"));

        try {
            new ZipArchiveEntry("x").setCentralDirectoryExtra(new byte[]{1, 2, 3, 4});
            fail("expected RuntimeException");
        } catch (final RuntimeException ex) {
            assertEquals("boom", ex.getMessage());
        }
    }

    // ================= getLocalFileDataExtra / getCentralDirectoryExtra =================

    @Test
    public void testGetLocalFileDataExtra_defaultEmpty() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        assertArrayEquals(new byte[0], e.getLocalFileDataExtra());
    }

    @Test
    public void testGetLocalFileDataExtra_afterAddField_notEmpty() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.addExtraField(new SimpleExtraField(1, new byte[]{1, 2, 3}));
        assertTrue(e.getLocalFileDataExtra().length > 0);
    }

    @Test
    public void testGetCentralDirectoryExtra_notNull() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        assertNotNull(e.getCentralDirectoryExtra());
    }

    // ================= isDirectory =================

    @Test
    public void testIsDirectory_true() {
        assertTrue(new ZipArchiveEntry("d/").isDirectory());
    }

    @Test
    public void testIsDirectory_false() {
        assertFalse(new ZipArchiveEntry("d").isDirectory());
    }

    // ================= size =================

    @Test
    public void testGetSetSize_valid() {
        final ZipArchiveEntry e = new ZipArchiveEntry("f");
        e.setSize(100L);
        assertEquals(100L, e.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throws() {
        new ZipArchiveEntry("f").setSize(-1L);
    }

    // ================= raw name =================

    @Test
    public void testSetNameWithRawName_andGetRawNameReturnsCopy() {
        final ZipArchiveEntry e = new ZipArchiveEntry("x");
        final byte[] raw = {1, 2, 3};
        e.setName("newname", raw);
        assertEquals("newname", e.getName());
        assertArrayEquals(raw, e.getRawName());
        assertNotSame(raw, e.getRawName());
    }

    @Test
    public void testGetRawName_null_whenNeverSet() {
        assertNull(new ZipArchiveEntry("e").getRawName());
    }

    // ================= hashCode =================

    @Test
    public void testHashCode_matchesNameHashCode() {
        final ZipArchiveEntry e = new ZipArchiveEntry("hello");
        assertEquals(e.getName().hashCode(), e.hashCode());
    }

    // ================= general purpose bit =================

    @Test
    public void testGetSetGeneralPurposeBit() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        e.setGeneralPurposeBit(gpb);
        assertSame(gpb, e.getGeneralPurposeBit());
        e.setGeneralPurposeBit(null);
        assertNull(e.getGeneralPurposeBit());
    }

    // ================= lastModifiedDate =================

    @Test
    public void testGetLastModifiedDate_notNull() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setTime(System.currentTimeMillis());
        assertNotNull(e.getLastModifiedDate());
    }

    // ================= equals =================

    @Test
    public void testEquals_sameObject() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        assertTrue(e.equals(e));
    }

    @Test
    public void testEquals_null() {
        assertFalse(new ZipArchiveEntry("e").equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        assertFalse(new ZipArchiveEntry("e").equals("not an entry"));
    }

    @Test
    public void testEquals_differentName() {
        final ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        final ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_commentNullTreatedAsEmpty_bothNull() throws Exception {
        final ZipArchiveEntry e1 = new ZipArchiveEntry("same");
        final ZipArchiveEntry e2 = new ZipArchiveEntry(e1);
        // comment ไม่ได้ตั้งค่าทั้งสองฝั่ง -> null ทั้งคู่ -> ถือเป็น "" ทั้งคู่ -> เท่ากัน
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_differentComment() throws Exception {
        final ZipArchiveEntry e1 = new ZipArchiveEntry("same");
        final ZipArchiveEntry e2 = new ZipArchiveEntry(e1);
        e2.setComment("changed");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_fullyEqual_viaCopyConstructor() throws Exception {
        final ZipArchiveEntry e1 = new ZipArchiveEntry("full");
        e1.setMethod(8);
        e1.setSize(10);
        e1.setComment("hi");
        final ZipArchiveEntry e2 = new ZipArchiveEntry(e1);
        assertTrue(e1.equals(e2));
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testEquals_differentSize_falseInChain() throws Exception {
        final ZipArchiveEntry e1 = new ZipArchiveEntry("full");
        e1.setSize(10);
        final ZipArchiveEntry e2 = new ZipArchiveEntry(e1);
        e2.setSize(20);
        assertFalse(e1.equals(e2));
    }

    // ================= versionMadeBy / versionRequired / rawFlag =================

    @Test
    public void testGetSetVersionMadeBy() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setVersionMadeBy(20);
        assertEquals(20, e.getVersionMadeBy());
    }

    @Test
    public void testGetSetVersionRequired() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setVersionRequired(45);
        assertEquals(45, e.getVersionRequired());
    }

    @Test
    public void testGetSetRawFlag() {
        final ZipArchiveEntry e = new ZipArchiveEntry("e");
        e.setRawFlag(7);
        assertEquals(7, e.getRawFlag());
    }
}
