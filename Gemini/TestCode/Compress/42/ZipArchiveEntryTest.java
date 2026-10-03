package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.File;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    @Test
    public void testStringConstructorAndSetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test\\path\\file.txt");
        assertEquals("test/path/file.txt", entry.getName());
        assertFalse(entry.isDirectory());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("test/dir/");
        assertEquals("test/dir/", dirEntry.getName());
        assertTrue(dirEntry.isDirectory());

        entry.setName(null);
        assertNull(entry.getName());
    }

    @Test
    public void testFileConstructor() {
        File mockFile = new File("nonexistent_file_for_test.txt");
        ZipArchiveEntry entry = new ZipArchiveEntry(mockFile, "custom/name");
        assertEquals("custom/name", entry.getName());

        File mockDir = new File(".");
        ZipArchiveEntry dirEntry = new ZipArchiveEntry(mockDir, "dirname");
        assertTrue(dirEntry.isDirectory());
        assertEquals("dirname/", dirEntry.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(-1);
    }

    @Test
    public void testSetMethodValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testAttributesAndPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setInternalAttributes(5);
        assertEquals(5, entry.getInternalAttributes());

        entry.setExternalAttributes(100L);
        assertEquals(100L, entry.getExternalAttributes());

        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testUnixModeAndSymlink() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        // Set Unix mode with LINK_FLAG
        int mode = UnixStat.LINK_FLAG | 0644;
        entry.setUnixMode(mode);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(mode, entry.getUnixMode());
        assertTrue(entry.isUnixSymlink());

        ZipArchiveEntry fatEntry = new ZipArchiveEntry("fat.txt");
        assertEquals(0, fatEntry.getUnixMode());
        assertFalse(fatEntry.isUnixSymlink());
    }

    @Test
    public void testSizeValidation() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(1024L);
        assertEquals(1024L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(-5L);
    }

    @Test
    public void testExtraFieldsManagement() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertNotNull(entry.getExtraFields());
        assertEquals(0, entry.getExtraFields().length);

        // Add extra field
        AsiExtraField extraField = new AsiExtraField();
        extraField.setMode(0755);
        entry.addExtraField(extraField);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(extraField.getHeaderId()));

        // Add as first extra field
        AsiExtraField firstField = new AsiExtraField();
        firstField.setMode(0644);
        entry.addAsFirstExtraField(firstField);
        assertEquals(2, entry.getExtraFields().length);
        assertEquals(firstField.getHeaderId(), entry.getExtraFields()[0].getHeaderId());

        // Remove extra field
        entry.removeExtraField(firstField.getHeaderId());
        assertEquals(1, entry.getExtraFields().length);

        // Test unparseable extra field
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(2, entry.getExtraFields(true).length);
        assertNotNull(entry.getUnparseableExtraFieldData());

        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.removeExtraField(new ZipShort(1234));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraFieldWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.extraFields = null; // force null via inheritance/internal state if package-private or use reflection/methods
        // Actually, let's invoke removeExtraField when extraFields is initially null
        ZipArchiveEntry fresh = new ZipArchiveEntry("fresh.txt");
        fresh.removeExtraField(new ZipShort(1234));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testCloneAndCopyConstructors() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setInternalAttributes(10);
        entry.setExternalAttributes(20L);

        ZipArchiveEntry copy = new ZipArchiveEntry(entry);
        assertEquals(entry.getName(), copy.getName());
        assertEquals(entry.getInternalAttributes(), copy.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), copy.getExternalAttributes());

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
    }

    @Test
    public void testSetExtraBytesAndCentralDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        byte[] extraData = new byte[] { 0x01, 0x00, 0x02, 0x00, 0x12, 0x34 };
        entry.setExtra(extraData);
        assertNotNull(entry.getLocalFileDataExtra());

        entry.setCentralDirectoryExtra(extraData);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testRawNameAndFlag() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertNull(entry.getRawName());

        entry.setRawFlag(5);
        assertEquals(5, entry.getRawFlag());

        entry.setVersionMadeBy(20);
        assertEquals(20, entry.getVersionMadeBy());

        entry.setVersionRequired(10);
        assertEquals(10, entry.getVersionRequired());
    }

    @Test
    public void testGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertNotNull(entry.getGeneralPurposeBit());
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        entry.setGeneralPurposeBit(gpb);
        assertEquals(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setTime(1000L);
        Date date = entry.getLastModifiedDate();
        assertNotNull(date);
        assertEquals(new Date(1000L), date);
    }

    @Test
    public void testEqualsAndHashCode() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("test.txt");

        assertTrue(e1.equals(e1));
        assertFalse(e1.equals(null));
        assertFalse(e1.equals("Some String"));
        assertTrue(e1.equals(e2));
        assertEquals(e1.hashCode(), e2.hashCode());

        // Test differences in properties
        e2.setComment("comment");
        assertFalse(e1.equals(e2));

        ZipArchiveEntry e3 = new ZipArchiveEntry("other.txt");
        assertFalse(e1.equals(e3));
    }
}