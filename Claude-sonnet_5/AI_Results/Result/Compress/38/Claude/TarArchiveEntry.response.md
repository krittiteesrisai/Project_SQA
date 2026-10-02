# TarArchiveEntryTest - JUnit 4 Test Suite

หมายเหตุสำคัญก่อนเริ่ม:
- วาง test class ไว้ใน package เดียวกับ source (`org.apache.commons.compress.archivers.tar`) เพื่อให้เข้าถึง package-private methods (`fillGNUSparse0xData`, `fillGNUSparse1xData`, `fillStarSparseData`, `parseTarHeader(...)` บาง overload) และ field `TarUtils.DEFAULT_ENCODING` ได้ตามจริงที่ source ใช้งานอยู่ (ไม่ได้เดา behavior เพิ่ม เพราะอ้างอิงจาก call site ในซอร์สที่ให้มา)
- Offset ของฟิลด์ GNU/XSTAR ที่ใช้ poke byte คำนวณจากชื่อ constant ที่ปรากฏตรงในซอร์ส (`ATIMELEN_GNU`, `PREFIXLEN_XSTAR`, ...) และตรวจสอบสอดคล้องกับ offset ที่ระบุใน Javadoc ของคลาส (offset 345, 482, 483, 508) จึงมั่นใจว่าไม่ใช่การเดา
- บาง branch (เช่น OS-specific ใน `normalizeFileName`, การ mock `System.getProperty`) **ไม่ได้ทดสอบ** เพราะต้อง mock static ของ `System` ซึ่งเสี่ยงทำให้ JVM/JUnit ไม่เสถียร และ source ไม่ได้ expose พฤติกรรมนี้ให้ inject ได้ตรง ๆ — คอมเมนต์ไว้ในโค้ด
- ใช้ Mockito (ไม่ใช้ PowerMock) สำหรับ mock `File` เพราะ `File` ไม่ใช่ final class/method

```java
package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry; // explicit import ตามข้อกำหนด (redundant เพราะ same package แต่ compile ได้)
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;

public class TarArchiveEntryTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- helper: offset ก่อนเข้า switch(type) ใน parseTarHeader ----------
    // คำนวณจาก layout ที่ระบุตรงในซอร์ส parseTarHeader(byte[], ZipEncoding, boolean)
    private static int prefixOffset() {
        return TarConstants.NAMELEN + TarConstants.MODELEN + TarConstants.UIDLEN
            + TarConstants.GIDLEN + TarConstants.SIZELEN + TarConstants.MODTIMELEN
            + TarConstants.CHKSUMLEN + 1 /* linkflag byte */
            + TarConstants.NAMELEN /* linkname */
            + TarConstants.MAGICLEN + TarConstants.VERSIONLEN
            + TarConstants.UNAMELEN + TarConstants.GNAMELEN
            + TarConstants.DEVLEN + TarConstants.DEVLEN;
    }

    // =========================================================
    // Constructors: TarArchiveEntry(String) / (String, boolean)
    // =========================================================

    @Test
    public void testConstructor_nameOnly_file() {
        TarArchiveEntry e = new TarArchiveEntry("foo/bar.txt");
        assertEquals("foo/bar.txt", e.getName());
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, e.getMode());
        assertFalse(e.isDirectory());
        assertNull(e.getFile());
    }

    @Test
    public void testConstructor_nameOnly_directory() {
        TarArchiveEntry e = new TarArchiveEntry("foo/bar/");
        assertEquals("foo/bar/", e.getName());
        assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, e.getMode());
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructor_leadingSlash_strippedByDefault() {
        TarArchiveEntry e = new TarArchiveEntry("/abs/path");
        assertEquals("abs/path", e.getName());
    }

    @Test
    public void testConstructor_leadingSlash_preservedWhenFlagTrue() {
        TarArchiveEntry e = new TarArchiveEntry("/abs/path", true);
        assertEquals("/abs/path", e.getName());
    }

    @Test
    public void testConstructor_multipleLeadingSlashes_allStripped() {
        TarArchiveEntry e = new TarArchiveEntry("///abs/path");
        assertEquals("abs/path", e.getName());
    }

    @Test
    public void testConstructor_emptyName() {
        // boundary: empty string, ไม่ endsWith "/" -> ถือเป็น "file"
        TarArchiveEntry e = new TarArchiveEntry("");
        assertEquals("", e.getName());
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, e.getMode());
    }

    // =========================================================
    // Constructors: TarArchiveEntry(String, byte[, boolean])
    // =========================================================

    @Test
    public void testConstructor_nameAndLinkFlag_generic() {
        TarArchiveEntry e = new TarArchiveEntry("name", TarConstants.LF_SYMLINK);
        assertTrue(e.isSymbolicLink());
        assertEquals("name", e.getName());
    }

    @Test
    public void testConstructor_nameAndLinkFlag_longName_setsGnuMagic() {
        TarArchiveEntry e = new TarArchiveEntry("name", TarConstants.LF_GNUTYPE_LONGNAME);
        assertTrue(e.isGNULongNameEntry());
        byte[] buf = new byte[512];
        e.writeEntryHeader(buf);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        // ผ่าน FORMAT_OLDGNU branch ใน evaluateType เพราะ magic = MAGIC_GNU
        assertTrue(parsed.isGNULongNameEntry());
    }

    @Test
    public void testConstructor_nameAndLinkFlag_notLongName_keepsPosixMagic() {
        TarArchiveEntry e = new TarArchiveEntry("name2", TarConstants.LF_NORMAL);
        byte[] buf = new byte[512];
        e.writeEntryHeader(buf);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertFalse(parsed.isGNULongNameEntry());
        assertFalse(parsed.isExtended()); // ไม่เข้า FORMAT_OLDGNU branch
    }

    // =========================================================
    // Constructors: TarArchiveEntry(File) / (File, String)
    // =========================================================

    @Test
    public void testConstructor_fileEntry_regularFile() throws IOException {
        File f = tempFolder.newFile("data.txt");
        java.nio.file.Files.write(f.toPath(), new byte[]{1, 2, 3, 4, 5});
        TarArchiveEntry e = new TarArchiveEntry(f);
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, e.getMode());
        assertEquals(5L, e.getSize());
        assertSame(f, e.getFile());
    }

    @Test
    public void testConstructor_fileEntry_directory() throws IOException {
        File dir = tempFolder.newFolder("subdir");
        TarArchiveEntry e = new TarArchiveEntry(dir);
        assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, e.getMode());
        assertTrue(e.getName().endsWith("/"));
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructor_fileWithCustomName_directory_alreadyEndsWithSlash() throws IOException {
        File dir = tempFolder.newFolder("subdir2");
        TarArchiveEntry e = new TarArchiveEntry(dir, "customName/");
        assertEquals("customName/", e.getName());
    }

    @Test
    public void testConstructor_fileWithCustomName_directory_appendsSlash() throws IOException {
        File dir = tempFolder.newFolder("subdir3");
        TarArchiveEntry e = new TarArchiveEntry(dir, "customName");
        assertEquals("customName/", e.getName());
    }

    @Test
    public void testConstructor_fileWithNameNormalizedToEmpty_directory() {
        // boundary: normalizedName length == 0 -> name = "" + "/"
        File mockDir = Mockito.mock(File.class);
        Mockito.when(mockDir.isDirectory()).thenReturn(true);
        Mockito.when(mockDir.lastModified()).thenReturn(0L);
        TarArchiveEntry e = new TarArchiveEntry(mockDir, "/");
        assertEquals("/", e.getName());
    }

    // =========================================================
    // Constructor/parseTarHeader จาก byte[] (round-trip กับ writeEntryHeader)
    // =========================================================

    @Test
    public void testByteArrayConstructor_roundTrip_basicFields() {
        TarArchiveEntry original = new TarArchiveEntry("round/trip.txt");
        original.setSize(1234L);
        original.setUserId(42);
        original.setGroupId(24);
        original.setUserName("user");
        original.setGroupName("group");
        original.setLinkName("link");

        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);

        assertEquals(original.getName(), parsed.getName());
        assertEquals(1234L, parsed.getSize());
        assertEquals(42L, parsed.getLongUserId());
        assertEquals(24L, parsed.getLongGroupId());
        assertEquals("user", parsed.getUserName());
        assertEquals("group", parsed.getGroupName());
        assertEquals("link", parsed.getLinkName());
        assertTrue(parsed.isCheckSumOK());
        assertNull(parsed.getFile());
    }

    @Test
    public void testParseTarHeader_direct_defaultEncoding() {
        TarArchiveEntry original = new TarArchiveEntry("direct/parse.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        TarArchiveEntry target = new TarArchiveEntry("placeholder");
        target.parseTarHeader(buf);
        assertEquals("direct/parse.txt", target.getName());
    }

    @Test
    public void testParseTarHeader_direct_withEncoding() throws IOException {
        TarArchiveEntry original = new TarArchiveEntry("direct2/parse.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        TarArchiveEntry target = new TarArchiveEntry("placeholder2");
        target.parseTarHeader(buf, TarUtils.DEFAULT_ENCODING);
        assertEquals("direct2/parse.txt", target.getName());
    }

    @Test
    public void testByteArrayConstructor_withEncoding() throws IOException {
        TarArchiveEntry original = new TarArchiveEntry("enc/file.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        TarArchiveEntry parsed = new TarArchiveEntry(buf, TarUtils.DEFAULT_ENCODING);
        assertEquals("enc/file.txt", parsed.getName());
    }

    // =========================================================
    // writeEntryHeaderField branch: starMode / value เกินขนาดฟิลด์ / value < 0
    // =========================================================

    @Test
    public void testWriteEntryHeader_starModeFalse_valueTooLarge_fallsBackToZero() throws IOException {
        TarArchiveEntry e = new TarArchiveEntry("big.txt");
        e.setUserId(1L << 30); // เกิน capacity ของ UIDLEN(8) octal ปกติ, starMode=false
        byte[] buf = new byte[512];
        e.writeEntryHeader(buf, TarUtils.DEFAULT_ENCODING, false);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals(0L, parsed.getLongUserId());
    }

    @Test
    public void testWriteEntryHeader_starModeTrue_valueTooLarge_writtenAsBinary() throws IOException {
        TarArchiveEntry e = new TarArchiveEntry("big2.txt");
        long largeUid = 1L << 30;
        e.setUserId(largeUid);
        byte[] buf = new byte[512];
        e.writeEntryHeader(buf, TarUtils.DEFAULT_ENCODING, true);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals(largeUid, parsed.getLongUserId());
    }

    @Test
    public void testWriteEntryHeader_negativeValue_starModeFalse_fallsBackToZero() throws IOException {
        TarArchiveEntry e = new TarArchiveEntry("neg.txt");
        e.setUserId(-5L);
        byte[] buf = new byte[512];
        e.writeEntryHeader(buf, TarUtils.DEFAULT_ENCODING, false);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals(0L, parsed.getLongUserId());
    }

    // =========================================================
    // evaluateType / parseTarHeader switch branches: POSIX, OLDGNU, XSTAR
    // =========================================================

    @Test
    public void testParseTarHeader_posixDirectoryNameFixup_appendsSlash() {
        // linkFlag=LF_DIR แต่ name เดิมไม่มี '/' -> โดน fix-up ต่อ '/'
        TarArchiveEntry original = new TarArchiveEntry("noSlashDir", TarConstants.LF_DIR);
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals("noSlashDir/", parsed.getName());
    }

    @Test
    public void testParseTarHeader_posixPrefixNonEmpty_prependsToName() {
        TarArchiveEntry original = new TarArchiveEntry("base.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        int off = prefixOffset();
        byte[] prefixBytes = "myprefix".getBytes();
        System.arraycopy(prefixBytes, 0, buf, off, prefixBytes.length);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals("myprefix/base.txt", parsed.getName());
    }

    @Test
    public void testParseTarHeader_posixPrefixEmpty_noChange() {
        TarArchiveEntry original = new TarArchiveEntry("plain.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf); // prefix area ถูก zero-fill โดย writeEntryHeader
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals("plain.txt", parsed.getName());
    }

    @Test
    public void testParseTarHeader_oldGnuFormat_isExtendedTrue() {
        TarArchiveEntry original = new TarArchiveEntry("gnu/file.txt", TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf); // magic = MAGIC_GNU -> FORMAT_OLDGNU

        int isExtendedOffset = prefixOffset()
            + TarConstants.ATIMELEN_GNU + TarConstants.CTIMELEN_GNU + TarConstants.OFFSETLEN_GNU
            + TarConstants.LONGNAMESLEN_GNU + TarConstants.PAD2LEN_GNU + TarConstants.SPARSELEN_GNU;
        buf[isExtendedOffset] = 1;

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertTrue(parsed.isExtended());
    }

    @Test
    public void testParseTarHeader_oldGnuFormat_isExtendedFalseByDefault() {
        TarArchiveEntry original = new TarArchiveEntry("gnu2/file.txt", TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);
        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertFalse(parsed.isExtended());
        assertEquals(0L, parsed.getRealSize());
    }

    @Test
    public void testParseTarHeader_xstarFormat_prefixNonEmpty_prependsToName() {
        TarArchiveEntry original = new TarArchiveEntry("xstarfile.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        byte[] xstarMagic = TarConstants.MAGIC_XSTAR.getBytes();
        System.arraycopy(xstarMagic, 0, buf, TarConstants.XSTAR_MAGIC_OFFSET, xstarMagic.length);

        int off = prefixOffset();
        byte[] prefixBytes = "xprefix".getBytes();
        System.arraycopy(prefixBytes, 0, buf, off, prefixBytes.length);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals("xprefix/xstarfile.txt", parsed.getName());
    }

    @Test
    public void testParseTarHeader_xstarFormat_prefixEmpty_noChange() {
        TarArchiveEntry original = new TarArchiveEntry("xstarfile2.txt");
        byte[] buf = new byte[512];
        original.writeEntryHeader(buf);

        byte[] xstarMagic = TarConstants.MAGIC_XSTAR.getBytes();
        System.arraycopy(xstarMagic, 0, buf, TarConstants.XSTAR_MAGIC_OFFSET, xstarMagic.length);
        // prefix area ยังเป็น zero -> length()==0 branch

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        assertEquals("xstarfile2.txt", parsed.getName());
    }

    // =========================================================
    // fillGNUSparse0xData / fillGNUSparse1xData / fillStarSparseData
    // =========================================================

    @Test
    public void testFillGNUSparse0xData_withName() {
        TarArchiveEntry e = new TarArchiveEntry("orig");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("GNU.sparse.size", "12345");
        headers.put("GNU.sparse.name", "sparseName");
        e.fillGNUSparse0xData(headers);
        assertTrue(e.isPaxGNUSparse());
        assertTrue(e.isGNUSparse());
        assertEquals(12345L, e.getRealSize());
        assertEquals("sparseName", e.getName());
    }

    @Test
    public void testFillGNUSparse0xData_withoutName() {
        TarArchiveEntry e = new TarArchiveEntry("orig2");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("GNU.sparse.size", "999");
        e.fillGNUSparse0xData(headers);
        assertEquals("orig2", e.getName()); // ไม่มี key "GNU.sparse.name" -> ไม่เปลี่ยน
        assertEquals(999L, e.getRealSize());
    }

    @Test
    public void testFillGNUSparse1xData() {
        TarArchiveEntry e = new TarArchiveEntry("orig3");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("GNU.sparse.realsize", "555");
        headers.put("GNU.sparse.name", "sparse1xName");
        e.fillGNUSparse1xData(headers);
        assertTrue(e.isPaxGNUSparse());
        assertEquals(555L, e.getRealSize());
        assertEquals("sparse1xName", e.getName());
    }

    @Test
    public void testFillStarSparseData_withRealSize() {
        TarArchiveEntry e = new TarArchiveEntry("orig4");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("SCHILY.realsize", "7777");
        e.fillStarSparseData(headers);
        assertTrue(e.isStarSparse());
        assertTrue(e.isSparse());
        assertEquals(7777L, e.getRealSize());
    }

    @Test
    public void testFillStarSparseData_withoutRealSize() {
        TarArchiveEntry e = new TarArchiveEntry("orig5");
        Map<String, String> headers = new HashMap<String, String>();
        e.fillStarSparseData(headers);
        assertTrue(e.isStarSparse());
        assertEquals(0L, e.getRealSize());
    }

    // =========================================================
    // isXxx() type-check methods
    // =========================================================

    @Test
    public void testIsOldGNUSparse_true() {
        TarArchiveEntry e = new TarArchiveEntry("s", TarConstants.LF_GNUTYPE_SPARSE);
        assertTrue(e.isOldGNUSparse());
        assertTrue(e.isGNUSparse());
    }

    @Test
    public void testIsOldGNUSparse_false() {
        TarArchiveEntry e = new TarArchiveEntry("s2");
        assertFalse(e.isOldGNUSparse());
        assertFalse(e.isGNUSparse());
    }

    @Test
    public void testIsGNULongLinkEntry() {
        TarArchiveEntry e = new TarArchiveEntry("l", TarConstants.LF_GNUTYPE_LONGLINK);
        assertTrue(e.isGNULongLinkEntry());
    }

    @Test
    public void testIsGNULongLinkEntry_false() {
        TarArchiveEntry e = new TarArchiveEntry("l2");
        assertFalse(e.isGNULongLinkEntry());
    }

    @Test
    public void testIsPaxHeader_lowerCase() {
        TarArchiveEntry e = new TarArchiveEntry("p", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        assertTrue(e.isPaxHeader());
    }

    @Test
    public void testIsPaxHeader_upperCase() {
        TarArchiveEntry e = new TarArchiveEntry("p2", TarConstants.LF_PAX_EXTENDED_HEADER_UC);
        assertTrue(e.isPaxHeader());
    }

    @Test
    public void testIsPaxHeader_false() {
        TarArchiveEntry e = new TarArchiveEntry("p3");
        assertFalse(e.isPaxHeader());
    }

    @Test
    public void testIsGlobalPaxHeader() {
        TarArchiveEntry e = new TarArchiveEntry("g", TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        assertTrue(e.isGlobalPaxHeader());
        assertFalse(e.isPaxHeader());
    }

    @Test
    public void testIsDirectory_fileBased_true() throws IOException {
        File dir = tempFolder.newFolder("dirTest");
        assertTrue(new TarArchiveEntry(dir).isDirectory());
    }

    @Test
    public void testIsDirectory_fileBased_false() throws IOException {
        File f = tempFolder.newFile("fileTest.txt");
        assertFalse(new TarArchiveEntry(f).isDirectory());
    }

    @Test
    public void testIsDirectory_noFile_linkFlagDir() {
        TarArchiveEntry e = new TarArchiveEntry("nodir", TarConstants.LF_DIR);
        assertTrue(e.isDirectory());
    }

    @Test
    public void testIsDirectory_noFile_nameEndsWithSlash() {
        assertTrue(new TarArchiveEntry("adir/").isDirectory());
    }

    @Test
    public void testIsDirectory_noFile_false() {
        assertFalse(new TarArchiveEntry("afile.txt").isDirectory());
    }

    @Test
    public void testIsFile_fileBased_true() throws IOException {
        File f = tempFolder.newFile("isFile.txt");
        assertTrue(new TarArchiveEntry(f).isFile());
    }

    @Test
    public void testIsFile_fileBased_false_directory() throws IOException {
        File dir = tempFolder.newFolder("isFileDir");
        assertFalse(new TarArchiveEntry(dir).isFile());
    }

    @Test
    public void testIsFile_noFile_linkFlagNormal_true() {
        assertTrue(new TarArchiveEntry("normalfile.txt").isFile());
    }

    @Test
    public void testIsFile_noFile_linkFlagOldNorm_true() {
        TarArchiveEntry e = new TarArchiveEntry("oldnorm", TarConstants.LF_OLDNORM);
        assertTrue(e.isFile());
    }

    @Test
    public void testIsFile_noFile_otherLinkFlag_nameNotEndingSlash_true() {
        TarArchiveEntry e = new TarArchiveEntry("sym", TarConstants.LF_SYMLINK);
        assertTrue(e.isFile());
    }

    @Test
    public void testIsFile_noFile_nameEndingSlash_false() {
        TarArchiveEntry e = new TarArchiveEntry("adir/", TarConstants.LF_SYMLINK);
        assertFalse(e.isFile());
    }

    @Test
    public void testTypeCheckMethods_trueCases() {
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_SYMLINK).isSymbolicLink());
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_LINK).isLink());
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_CHR).isCharacterDevice());
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_BLK).isBlockDevice());
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_FIFO).isFIFO());
    }

    @Test
    public void testTypeCheckMethods_falseCases() {
        TarArchiveEntry plain = new TarArchiveEntry("plain.txt");
        assertFalse(plain.isSymbolicLink());
        assertFalse(plain.isLink());
        assertFalse(plain.isCharacterDevice());
        assertFalse(plain.isBlockDevice());
        assertFalse(plain.isFIFO());
    }

    @Test
    public void testIsSparse_variants() {
        assertTrue(new TarArchiveEntry("a", TarConstants.LF_GNUTYPE_SPARSE).isSparse());

        TarArchiveEntry star = new TarArchiveEntry("b");
        star.fillStarSparseData(new HashMap<String, String>());
        assertTrue(star.isSparse());

        assertFalse(new TarArchiveEntry("c").isSparse());
    }

    // =========================================================
    // getDirectoryEntries()
    // =========================================================

    @Test
    public void testGetDirectoryEntries_fileNull() {
        TarArchiveEntry e = new TarArchiveEntry("nofile");
        assertEquals(0, e.getDirectoryEntries().length);
    }

    @Test
    public void testGetDirectoryEntries_notDirectory() throws IOException {
        File f = tempFolder.newFile("notdir.txt");
        TarArchiveEntry e = new TarArchiveEntry(f);
        assertEquals(0, e.getDirectoryEntries().length);
    }

    @Test
    public void testGetDirectoryEntries_listNull() {
        File mockDir = Mockito.mock(File.class);
        Mockito.when(mockDir.isDirectory()).thenReturn(true);
        Mockito.when(mockDir.list()).thenReturn(null);
        Mockito.when(mockDir.lastModified()).thenReturn(0L);
        Mockito.when(mockDir.getPath()).thenReturn("/mockdir");

        TarArchiveEntry e = new TarArchiveEntry(mockDir);
        assertEquals(0, e.getDirectoryEntries().length);
    }

    @Test
    public void testGetDirectoryEntries_withChildren() {
        File mockDir = Mockito.mock(File.class);
        Mockito.when(mockDir.isDirectory()).thenReturn(true);
        Mockito.when(mockDir.list()).thenReturn(new String[]{"child1", "child2"});
        Mockito.when(mockDir.lastModified()).thenReturn(0L);
        Mockito.when(mockDir.getPath()).thenReturn("mockdir");

        TarArchiveEntry e = new TarArchiveEntry(mockDir);
        TarArchiveEntry[] entries = e.getDirectoryEntries();
        assertEquals(2, entries.length);
    }

    // =========================================================
    // equals / hashCode / isDescendent
    // =========================================================

    @Test
    public void testEquals_sameName() {
        TarArchiveEntry a = new TarArchiveEntry("same/name.txt");
        TarArchiveEntry b = new TarArchiveEntry("same/name.txt");
        assertTrue(a.equals(b));           // overload equals(TarArchiveEntry)
        assertTrue(a.equals((Object) b));  // overload equals(Object)
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEquals_differentName() {
        TarArchiveEntry a = new TarArchiveEntry("a.txt");
        TarArchiveEntry b = new TarArchiveEntry("b.txt");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_null() {
        TarArchiveEntry a = new TarArchiveEntry("a.txt");
        assertFalse(a.equals((Object) null));
    }

    @Test
    public void testEquals_differentClass() {
        TarArchiveEntry a = new TarArchiveEntry("a.txt");
        assertFalse(a.equals("a.txt"));
    }

    @Test
    public void testIsDescendent_true() {
        TarArchiveEntry parent = new TarArchiveEntry("dir/");
        TarArchiveEntry child = new TarArchiveEntry("dir/child.txt");
        assertTrue(parent.isDescendent(child));
    }

    @Test
    public void testIsDescendent_false() {
        TarArchiveEntry a = new TarArchiveEntry("dir1/");
        TarArchiveEntry b = new TarArchiveEntry("dir2/child.txt");
        assertFalse(a.isDescendent(b));
    }

    // =========================================================
    // Setters/Getters ทั่วไป
    // =========================================================

    @Test
    public void testSetName_respectsPreserveLeadingSlashesFlag() {
        TarArchiveEntry e1 = new TarArchiveEntry("start", true);
        e1.setName("/newname");
        assertEquals("/newname", e1.getName());

        TarArchiveEntry e2 = new TarArchiveEntry("start2", false);
        e2.setName("/newname2");
        assertEquals("newname2", e2.getName());
    }

    @Test
    public void testSetGetMode() {
        TarArchiveEntry e = new TarArchiveEntry("m");
        e.setMode(0755);
        assertEquals(0755, e.getMode());
    }

    @Test
    public void testGetSetLinkName() {
        TarArchiveEntry e = new TarArchiveEntry("l");
        assertEquals("", e.getLinkName());
        e.setLinkName("target");
        assertEquals("target", e.getLinkName());
    }

    @Test
    public void testUserId_intSetter_positive() {
        TarArchiveEntry e = new TarArchiveEntry("u");
        e.setUserId(100);
        assertEquals(100, e.getUserId());
        assertEquals(100L, e.getLongUserId());
    }

    @Test
    public void testUserId_intSetter_negativeWrap() {
        TarArchiveEntry e = new TarArchiveEntry("u2");
        e.setUserId(-1);
        assertEquals(-1, e.getUserId());
        assertEquals(-1L, e.getLongUserId());
    }

    @Test
    public void testUserId_longSetter_beyondIntRange() {
        TarArchiveEntry e = new TarArchiveEntry("u3");
        long big = 4294967296L + 5; // 2^32 + 5
        e.setUserId(big);
        assertEquals(big, e.getLongUserId());
        assertEquals(5, e.getUserId());
    }

    @Test
    public void testGroupId_intSetter() {
        TarArchiveEntry e = new TarArchiveEntry("g");
        e.setGroupId(50);
        assertEquals(50, e.getGroupId());
        assertEquals(50L, e.getLongGroupId());
    }

    @Test
    public void testGroupId_longSetter() {
        TarArchiveEntry e = new TarArchiveEntry("g2");
        e.setGroupId(123456789012L);
        assertEquals(123456789012L, e.getLongGroupId());
    }

    @Test
    public void testUserNameGroupName() {
        TarArchiveEntry e = new TarArchiveEntry("n");
        e.setUserName("bob");
        e.setGroupName("staff");
        assertEquals("bob", e.getUserName());
        assertEquals("staff", e.getGroupName());
    }

    @Test
    public void testSetIds() {
        TarArchiveEntry e = new TarArchiveEntry("ids");
        e.setIds(11, 22);
        assertEquals(11, e.getUserId());
        assertEquals(22, e.getGroupId());
    }

    @Test
    public void testSetNames() {
        TarArchiveEntry e = new TarArchiveEntry("names");
        e.setNames("u", "g");
        assertEquals("u", e.getUserName());
        assertEquals("g", e.getGroupName());
    }

    @Test
    public void testSetModTime_long() {
        TarArchiveEntry e = new TarArchiveEntry("t");
        long millis = 123_456_000L;
        e.setModTime(millis);
        assertEquals(millis / 1000, e.getModTime().getTime() / 1000);
    }

    @Test
    public void testSetModTime_date() {
        TarArchiveEntry e = new TarArchiveEntry("t2");
        Date d = new Date(987_654_000L);
        e.setModTime(d);
        assertEquals(d.getTime() / 1000, e.getModTime().getTime() / 1000);
        assertEquals(e.getModTime(), e.getLastModifiedDate());
    }

    @Test
    public void testIsCheckSumOK_defaultFalse() {
        assertFalse(new TarArchiveEntry("cs").isCheckSumOK());
    }

    @Test
    public void testGetFile_nullForNameConstructor() {
        assertNull(new TarArchiveEntry("f").getFile());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negativeThrows() {
        new TarArchiveEntry("s").setSize(-1L);
    }

    @Test
    public void testSetSize_validBoundaryZeroAndPositive() {
        TarArchiveEntry e = new TarArchiveEntry("s2");
        e.setSize(0L);
        assertEquals(0L, e.getSize());
        e.setSize(100L);
        assertEquals(100L, e.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajor_negativeThrows() {
        new TarArchiveEntry("d").setDevMajor(-1);
    }

    @Test
    public void testSetDevMajor_valid() {
        TarArchiveEntry e = new TarArchiveEntry("d2");
        e.setDevMajor(5);
        assertEquals(5, e.getDevMajor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinor_negativeThrows() {
        new TarArchiveEntry("d3").setDevMinor(-2);
    }

    @Test
    public void testSetDevMinor_valid() {
        TarArchiveEntry e = new TarArchiveEntry("d4");
        e.setDevMinor(7);
        assertEquals(7, e.getDevMinor());
    }

    @Test
    public void testGetRealSize_defaultZero() {
        assertEquals(0L, new TarArchiveEntry("r").getRealSize());
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด Test | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_nameOnly_*`, `testConstructor_leadingSlash_*`, `testConstructor_multipleLeadingSlashes_*`, `testConstructor_emptyName` | `normalizeFileName`: loop strip leading `/` (0,1,หลายครั้ง), `preserveLeadingSlashes` true/false; `isDir` true/false ใน constructor(String,boolean) |
| `testConstructor_nameAndLinkFlag_*` | if `linkFlag == LF_GNUTYPE_LONGNAME` true/false ใน constructor(String,byte,boolean) |
| `testConstructor_fileEntry_*`, `testConstructor_fileWithCustomName_*`, `testConstructor_fileWithNameNormalizedToEmpty_directory` | `file.isDirectory()` true/false; `nameLength==0 \|\| charAt!='/'` true/false ใน constructor(File,String) |
| `testByteArrayConstructor_*`, `testParseTarHeader_direct_*` | constructor(byte[]) / (byte[],ZipEncoding) / parseTarHeader overloads, try/catch fallback path (implicit) |
| `testWriteEntryHeader_starMode*`, `testWriteEntryHeader_negativeValue_*` | `writeEntryHeaderField`: `!starMode && (value<0 \|\| value>=limit)` true/false, starMode true/false |
| `testParseTarHeader_posix*`, `testParseTarHeader_oldGnuFormat_*`, `testParseTarHeader_xstar*` | `evaluateType` → FORMAT_POSIX/FORMAT_OLDGNU/FORMAT_XSTAR; `isDirectory() && !endsWith("/")`; `prefix.length()>0` true/false; `isExtended` true/false |
| `testFillGNUSparse0xData_*`, `testFillGNUSparse1xData`, `testFillStarSparseData_*` | `headers.containsKey(...)` true/false ในทั้ง 3 เมธอด |
| `testIsOldGNUSparse_*`, `testIsGNULongLinkEntry*`, `testIsPaxHeader_*`, `testIsGlobalPaxHeader` | เงื่อนไข `linkFlag == LF_xxx` แต่ละค่า true/false, OR ของ `isPaxHeader` (LC/UC) |
| `testIsDirectory_*` | `file!=null` → `file.isDirectory()`; `file==null` → `linkFlag==LF_DIR`; → `name.endsWith("/")`; → `false` (ครบ 4 return path) |
| `testIsFile_*` | `file!=null`→`file.isFile()`; `file==null`→`LF_OLDNORM\|\|LF_NORMAL`; → `!endsWith("/")` true/false |
| `testTypeCheckMethods_*`, `testIsSparse_variants` | `isSymbolicLink/isLink/isCharacterDevice/isBlockDevice/isFIFO` true/false; `isGNUSparse \|\| isStarSparse` แต่ละ operand |
| `testGetDirectoryEntries_*` | `file==null`; `!file.isDirectory()`; `list()==null`; loop สร้าง entries ปกติ |
| `testEquals_*`, `testIsDescendent_*` | `equals(Object)`: null, different class, same class-equal name-diff name; `equals(TarArchiveEntry)` โดยตรง; `isDescendent` true/false |
| `testSetName_*`, `testSetGetMode`, `testGetSetLinkName` | setter normalize ตาม flag; getter/setter ปกติ |
| `testUserId_*`, `testGroupId_*` | overflow/negative wraparound ของ `(int)(value & 0xffffffff)` |
| `testUserNameGroupName`, `testSetIds`, `testSetNames` | convenience setter เรียก setter ย่อยถูกต้อง |
| `testSetModTime_*` | `setModTime(long)` และ `setModTime(Date)`, `getLastModifiedDate()==getModTime()` |
| `testIsCheckSumOK_defaultFalse`, `testGetFile_nullForNameConstructor` | ค่า default ก่อน parse header |
| `testSetSize_negativeThrows`, `testSetSize_validBoundaryZeroAndPositive` | `if(size<0) throw` true/false, boundary 0 |
| `testSetDevMajor_*`, `testSetDevMinor_*` | `if(devNo<0) throw` true/false สำหรับทั้งสองเมธอด |
| `testGetRealSize_defaultZero` | ค่า default `realSize` |

**ข้อจำกัดที่ระบุไว้ (ไม่ทดสอบเพื่อไม่เดา behavior)**: branch OS-specific (`windows`/`netware`) ใน `normalizeFileName` เนื่องจากต้อง mock `System.getProperty("os.name")` แบบ static ซึ่งเสี่ยงกระทบ JVM/test infra และไม่ได้ระบุ contract ชัดเจนใน source ที่ให้มาว่าจะ inject ค่าได้อย่างไร รวมถึง exception path ของ `writeEntryHeader(byte[])`/`parseTarHeader(byte[])` (catch IOException แล้ว fallback encoding) เนื่องจากไม่มีข้อมูลพอที่จะสร้างอินพุตที่ทำให้ `TarUtils`/`ZipEncoding` โยน `IOException` ได้อย่างแน่นอนจากซอร์สที่ให้มา