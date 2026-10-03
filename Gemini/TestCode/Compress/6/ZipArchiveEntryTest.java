package org.apache.commons.compress.archivers.zip;

import junit.framework.TestCase;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest extends TestCase {

    public ZipArchiveEntryTest(String name) {
        super(name);
    }

    // --- Constructor & Basic Tests ---
    
    public void testConstructorWithName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());
    }

    public void testConstructorWithDirectoryName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("testDir/");
        assertEquals("testDir/", entry.getName());
        assertTrue(entry.isDirectory());
    }

    public void testConstructorFromZipEntryWithNullExtra() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("sample.txt");
        zipEntry.setExtra(null);
        ZipArchiveEntry entry = new ZipArchiveEntry(zipEntry);
        assertEquals("sample.txt", entry.getName());
        assertNotNull(entry.getLocalFileDataExtra());
    }

    public void testConstructorFromZipEntryWithExtra() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("sample.txt");
        AsiExtraField asi = new AsiExtraField();
        zipEntry.setExtra(asi.getLocalFileDataData());
        ZipArchiveEntry entry = new ZipArchiveEntry(zipEntry);
        assertNotNull(entry.getExtraFields());
    }

    public void testCopyConstructor() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("orig.txt");
        original.setInternalAttributes(5);
        original.setExternalAttributes(10L);
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals(original.getName(), copy.getName());
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
    }

    public void testFileConstructorFileAndDirectory() {
        File mockFile = new File(".");
        ZipArchiveEntry entryFile = new ZipArchiveEntry(mockFile, "dirEntry");
        // ถ้าเป็น directory และไม่ลงท้ายด้วย / จะต้องถูกเติม /
        assertTrue(entryFile.getName().endsWith("/"));

        ZipArchiveEntry entryExplicitDir = new ZipArchiveEntry(mockFile, "dirEntry/");
        assertEquals("dirEntry/", entryExplicitDir.getName());
    }

    // --- Compression Method Tests ---

    public void testMethodValidAndInvalid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        assertEquals(-1, entry.getMethod());
        assertFalse(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.STORED);
        assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertTrue(entry.isSupportedCompressionMethod());

        try {
            entry.setMethod(-5);
            fail("Expected IllegalArgumentException for negative method");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // --- Attributes & Unix Mode Tests ---

    public void testAttributesAndUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unix.txt");
        // Default platform is FAT, unix mode should return 0
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertEquals(0, entry.getUnixMode());

        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    public void testDirectoryUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0755);
        assertTrue(entry.isDirectory());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    // --- Extra Fields Branch & Edge Cases ---

    public void testExtraFieldsManagement() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra.txt");
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getExtraField(AsiExtraField.HEADER_ID));

        AsiExtraField asi = new AsiExtraField();
        entry.addExtraField(asi);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(AsiExtraField.HEADER_ID));

        // Test addAsFirstExtraField
        AsiExtraField asi2 = new AsiExtraField();
        asi2.setLinkedFile("link");
        entry.addAsFirstExtraField(asi2);
        assertEquals(asi2.getHeader_id(), entry.getExtraFields()[0].getHeaderId());

        // Test setExtraFields array
        ZipArchiveEntry entry2 = new ZipArchiveEntry("extra2.txt");
        entry2.setExtraFields(new ZipExtraField[] { asi });
        assertEquals(1, entry2.getExtraFields().length);

        // Test removeExtraField exceptions
        ZipArchiveEntry emptyEntry = new ZipArchiveEntry("empty.txt");
        try {
            emptyEntry.removeExtraField(AsiExtraField.HEADER_ID);
            fail("Expected NoSuchElementException when extraFields is null");
        } catch (NoSuchElementException e) {
            // Expected
        }

        entry.removeExtraField(AsiExtraField.HEADER_ID);
        try {
            entry.removeExtraField(AsiExtraField.HEADER_ID);
            fail("Expected NoSuchElementException when field not found");
        } catch (NoSuchElementException e) {
            // Expected
        }
    }

    public void testSetExtraBytesAndCentralDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("bytes.txt");
        AsiExtraField asi = new AsiExtraField();
        byte[] localData = asi.getLocalFileDataData();
        
        entry.setExtra(localData);
        assertNotNull(entry.getLocalFileDataData());

        byte[] centralData = asi.getCentralDirectoryData();
        entry.setCentralDirectoryExtra(centralData);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    // --- Clone, Equals & HashCode Tests ---

    public void testClone() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("clone.txt");
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(4L);
        entry.addExtraField(new AsiExtraField());

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(entry.getExtraFields().length, cloned.getExtraFields().length);
    }

    public void testEqualsAndHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");

        assertTrue(entry1.equals(entry1)); // self
        assertTrue(entry1.equals(entry2)); // equal names
        assertFalse(entry1.equals(entry3)); // different names
        assertFalse(entry1.equals(null)); // null object
        assertFalse(entry1.equals("some string")); // different class

        assertEquals(entry1.hashCode(), entry2.hashCode());
        
        // Test entry with null name field branch
        ZipArchiveEntry nullNameEntry = new ZipArchiveEntry((String) null);
        ZipArchiveEntry nullNameEntry2 = new ZipArchiveEntry((String) null);
        assertTrue(nullNameEntry.equals(nullNameEntry2));
        
        ZipArchiveEntry validNameEntry = new ZipArchiveEntry("name.txt");
        assertFalse(nullNameEntry.equals(validNameEntry));
        assertFalse(validNameEntry.equals(nullNameEntry));
    }

    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("date.txt");
        entry.setTime(123456789L);
        assertNotNull(entry.getLastModifiedDate());
    }
}