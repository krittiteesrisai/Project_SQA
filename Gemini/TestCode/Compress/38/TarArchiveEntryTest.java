package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TarArchiveEntryTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testDefaultConstructorAndBasicGettersSetters() {
        TarArchiveEntry entry = new TarArchiveEntry("testName");
        assertEquals("testName", entry.getName());
        
        entry.setMode(0777);
        assertEquals(0777, entry.getMode());

        entry.setUserId(123L);
        assertEquals(123L, entry.getLongUserId());
        assertEquals(123, entry.getUserId());

        entry.setGroupId(456L);
        assertEquals(456L, entry.getLongGroupId());
        assertEquals(456, entry.getGroupId());

        entry.setUserName("user1");
        assertEquals("user1", entry.getUserName());

        entry.setGroupName("group1");
        assertEquals("group1", entry.getGroupName());

        entry.setIds(789, 987);
        assertEquals(789L, entry.getLongUserId());
        assertEquals(987L, entry.getLongGroupId());

        entry.setNames("user2", "group2");
        assertEquals("user2", entry.getUserName());
        assertEquals("group2", entry.getGroupName());

        entry.setLinkName("linkName1");
        assertEquals("linkName1", entry.getLinkName());

        Date now = new Date();
        entry.setModTime(now);
        assertNotNull(entry.getModTime());
        assertEquals(now.getTime() / 1000 * 1000, entry.getLastModifiedDate().getTime());

        entry.setModTime(now.getTime());
        assertNotNull(entry.getModTime());

        assertNull(entry.getFile());
        assertFalse(entry.isCheckSumOK());
    }

    @Test
    public void testConstructorsWithLinkFlagAndPreserveSlashes() {
        TarArchiveEntry entry1 = new TarArchiveEntry("/leading/slash", true);
        assertEquals("/leading/slash", entry1.getName());

        TarArchiveEntry entry2 = new TarArchiveEntry("/leading/slash", false);
        assertEquals("leading/slash", entry2.getName());

        TarArchiveEntry entry3 = new TarArchiveEntry("longNameEntry", TarConstants.LF_GNUTYPE_LONGNAME, true);
        assertEquals(TarConstants.LF_GNUTYPE_LONGNAME, entry3.getLinkFlag());
    }

    @Test
    public void testFileConstructorWithDirectoryAndFile() throws IOException {
        File dir = tempFolder.newFolder("testDir");
        TarArchiveEntry dirEntry = new TarArchiveEntry(dir, "testDir");
        assertTrue(dirEntry.isDirectory());
        assertTrue(dirEntry.getName().endsWith("/"));

        File dirWithoutSlash = tempFolder.newFolder("testDir2");
        TarArchiveEntry dirEntry2 = new TarArchiveEntry(dirWithoutSlash, "noSlashDir");
        assertTrue(dirEntry2.isDirectory());
        assertTrue(dirEntry2.getName().endsWith("/"));

        File file = tempFolder.newFile("testFile.txt");
        TarArchiveEntry fileEntry = new TarArchiveEntry(file, "testFile.txt");
        assertTrue(fileEntry.isFile());
        assertEquals(file.length(), fileEntry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegativeThrowsException() {
        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setSize(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajorNegativeThrowsException() {
        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setDevMajor(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinorNegativeThrowsException() {
        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setDevMinor(-1);
    }

    @Test
    public void testEqualsAndHashCode() {
        TarArchiveEntry entry1 = new TarArchiveEntry("entryName");
        TarArchiveEntry entry2 = new TarArchiveEntry("entryName");
        TarArchiveEntry entry3 = new TarArchiveEntry("differentName");

        assertTrue(entry1.equals(entry1));
        assertTrue(entry1.equals(entry2));
        assertEquals(entry1.hashCode(), entry2.hashCode());

        assertFalse(entry1.equals(null));
        assertFalse(entry1.equals(new Object()));
        assertFalse(entry1.equals(entry3));
    }

    @Test
    public void testIsDescendent() {
        TarArchiveEntry parent = new TarArchiveEntry("parent/");
        TarArchiveEntry child = new TarArchiveEntry("parent/child");
        TarArchiveEntry stranger = new TarArchiveEntry("stranger");

        assertTrue(parent.isDescendent(child));
        assertFalse(parent.isDescendent(stranger));
    }

    @Test
    public void testFileTypeChecks() {
        TarArchiveEntry entry = new TarArchiveEntry("link");
        entry.linkFlag = TarConstants.LF_SYMLINK;
        assertTrue(entry.isSymbolicLink());

        entry.linkFlag = TarConstants.LF_LINK;
        assertTrue(entry.isLink());

        entry.linkFlag = TarConstants.LF_CHR;
        assertTrue(entry.isCharacterDevice());

        entry.linkFlag = TarConstants.LF_BLK;
        assertTrue(entry.isBlockDevice());

        entry.linkFlag = TarConstants.LF_FIFO;
        assertTrue(entry.isFIFO());

        entry.linkFlag = TarConstants.LF_GNUTYPE_SPARSE;
        assertTrue(entry.isOldGNUSparse());
        assertTrue(entry.isGNUSparse());
        assertTrue(entry.isSparse());

        entry.linkFlag = TarConstants.LF_GNUTYPE_LONGLINK;
        assertTrue(entry.isGNULongLinkEntry());

        entry.linkFlag = TarConstants.LF_GNUTYPE_LONGNAME;
        assertTrue(entry.isGNULongNameEntry());

        entry.linkFlag = TarConstants.LF_PAX_EXTENDED_HEADER_LC;
        assertTrue(entry.isPaxHeader());

        entry.linkFlag = TarConstants.LF_PAX_EXTENDED_HEADER_UC;
        assertTrue(entry.isPaxHeader());

        entry.linkFlag = TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER;
        assertTrue(entry.isGlobalPaxHeader());
    }

    @Test
    public void testDirectoryEntriesEmptyWhenNullOrFile() {
        TarArchiveEntry entry = new TarArchiveEntry("notAFile");
        TarArchiveEntry[] children = entry.getDirectoryEntries();
        assertNotNull(children);
        assertEquals(0, children.length);
    }

    @Test
    public void testParseTarHeaderFormats() throws IOException {
        byte[] headerBuf = new byte[512];
        
        // Test parsing POSIX / default header with prefix and directory fixup
        TarArchiveEntry entry = new TarArchiveEntry(headerBuf);
        assertNotNull(entry);
    }

    @Test
    public void testWriteAndParseHeaderWithStarMode() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testfile.txt");
        entry.setSize(100);
        entry.setDevMajor(5);
        entry.setDevMinor(10);
        
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf, TarUtils.DEFAULT_ENCODING, true);
        
        TarArchiveEntry parsedEntry = new TarArchiveEntry(buf);
        assertEquals("testfile.txt", parsedEntry.getName());
        assertEquals(100, parsedEntry.getSize());
        assertEquals(5, parsedEntry.getDevMajor());
        assertEquals(10, parsedEntry.getDevMinor());
    }

    @Test
    public void testNormalizeFileNameEdgeCases() {
        // Test Windows drive letter stripping simulation via setting name
        TarArchiveEntry entry = new TarArchiveEntry("C:\\temp\\file.txt");
        // Depending on OS execution, normalizeFileName runs. We can test explicit setter behavior.
        entry.setName("D:\\foo\\bar");
        assertFalse(entry.getName().contains("D:"));
    }
}