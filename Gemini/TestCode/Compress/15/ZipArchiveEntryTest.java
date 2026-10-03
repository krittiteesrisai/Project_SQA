package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;
import java.util.zip.ZipEntry;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    @Test
    public void testConstructorAndNameHandling() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test\\path\\file.txt");
        assertEquals("test/path/file.txt", entry.getName());
        assertFalse(entry.isDirectory());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("test\\dir\\");
        assertEquals("test/dir/", dirEntry.getName());
        assertTrue(dirEntry.isDirectory());

        ZipArchiveEntry nullNameEntry = new ZipArchiveEntry((String) null);
        assertNull(nullNameEntry.getName());
    }

    @Test
    public void testFileConstructor() {
        File mockFile = new File("nonexistent.txt");
        ZipArchiveEntry entry = new ZipArchiveEntry(mockFile, "entryName");
        assertEquals("entryName", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-5L);
    }

    @Test
    public void testUnixModeAndPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertEquals(0, entry.getUnixMode());

        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testExtraFieldsManagement() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getExtraFields().length);

        // Add standard extra field
        AsiExtraField asi = new AsiExtraField();
        asi.setUserId(1000);
        entry.addExtraField(asi);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(asi.getHeaderId()));

        // Add as first extra field
        AsiExtraField asi2 = new AsiExtraField();
        asi2.setUserId(2000);
        entry.addAsFirstExtraField(asi2);
        assertEquals(asi2, entry.getExtraFields()[0]);

        // Remove extra field
        entry.removeExtraField(asi.getHeaderId());
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(1234));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNullUnparseableExtraFieldData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testGetExtraFieldsWithUnparseable() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        ZipExtraField[] fields = entry.getExtraFields(true);
        assertNotNull(fields);
    }

    @Test
    public void testCloneAndCopyConstructors() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original");
        original.setInternalAttributes(5);
        original.setExternalAttributes(10L);

        ZipArchiveEntry cloned = (ZipArchiveEntry) original.clone();
        assertEquals(original.getName(), cloned.getName());
        assertEquals(original.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(original.getExternalAttributes(), cloned.getExternalAttributes());

        ZipEntry zipEntry = new ZipEntry("zipEntry");
        ZipArchiveEntry entryFromZipEntry = new ZipArchiveEntry(zipEntry);
        assertEquals("zipEntry", entryFromZipEntry.getName());

        ZipArchiveEntry entryFromZipArchiveEntry = new ZipArchiveEntry(original);
        assertEquals(original.getName(), entryFromZipArchiveEntry.getName());
    }

    @Test
    public void testEqualsAndHashCode() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("file.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("file.txt");

        assertTrue(e1.equals(e1));
        assertFalse(e1.equals(null));
        assertFalse(e1.equals("some string"));
        assertTrue(e1.equals(e2));
        assertEquals(e1.hashCode(), e2.hashCode());

        // Test name differences in equals
        ZipArchiveEntry e3 = new ZipArchiveEntry("other.txt");
        assertFalse(e1.equals(e3));

        // Test comment differences
        e1.setComment("comment1");
        assertFalse(e1.equals(e2));
        e2.setComment("comment1");
        assertTrue(e1.equals(e2));

        // Test null name branch in equals
        ZipArchiveEntry nullName1 = new ZipArchiveEntry((String) null);
        ZipArchiveEntry nullName2 = new ZipArchiveEntry((String) null);
        ZipArchiveEntry validName = new ZipArchiveEntry("name");
        assertTrue(nullName1.equals(nullName2));
        assertFalse(nullName1.equals(validName));
        assertFalse(validName.equals(nullName1));
    }

    @Test
    public void testSetCentralDirectoryExtraAndRawName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        byte[] dummyData = new byte[] { 0x01, 0x00, 0x02, 0x00, 0x00, 0x00 };
        entry.setCentralDirectoryExtra(dummyData);
        assertNotNull(entry.getCentralDirectoryExtra());

        assertNull(entry.getRawName());
    }
}