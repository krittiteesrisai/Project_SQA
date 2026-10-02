package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class SevenZFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ---------- Byte-format helper utilities ----------

    private static final byte[] SIG = {
        (byte) '7', (byte) 'z', (byte) 0xBC, (byte) 0xAF, (byte) 0x27, (byte) 0x1C
    };

    /** เขียนค่า value เป็น little-endian numBytes ไบต์ (ตรงกับรูปแบบที่ SevenZFile อ่านด้วย reverseBytes) */
    private static byte[] le(long value, int numBytes) {
        byte[] b = new byte[numBytes];
        for (int i = 0; i < numBytes; i++) {
            b[i] = (byte) (value & 0xFF);
            value >>>= 8;
        }
        return b;
    }

    private static long crc32(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        return crc.getValue();
    }

    /** สร้าง Signature Header (32 bytes) ตาม startHeader ที่กำหนด */
    private static byte[] buildSignatureHeader(long offset, long size, long nextHeaderCrc,
                                                 byte major, byte minor) throws IOException {
        ByteArrayOutputStream startHeaderStream = new ByteArrayOutputStream();
        startHeaderStream.write(le(offset, 8));
        startHeaderStream.write(le(size, 8));
        startHeaderStream.write(le(nextHeaderCrc, 4));
        byte[] startHeader = startHeaderStream.toByteArray(); // 20 bytes
        long startHeaderCrc = crc32(startHeader);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(SIG);
        out.write(major);
        out.write(minor);
        out.write(le(startHeaderCrc, 4));
        out.write(startHeader);
        return out.toByteArray(); // 32 bytes
    }

    /** สร้างไฟล์ 7z ที่ valid ครบ (signature header + nextHeader) จาก nextHeader bytes ที่กำหนด */
    private static byte[] buildArchive(byte[] nextHeader) throws IOException {
        long crc = crc32(nextHeader);
        byte[] sigHeader = buildSignatureHeader(0, nextHeader.length, crc, (byte) 0, (byte) 4);
        byte[] result = new byte[sigHeader.length + nextHeader.length];
        System.arraycopy(sigHeader, 0, result, 0, sigHeader.length);
        System.arraycopy(nextHeader, 0, result, sigHeader.length, nextHeader.length);
        return result;
    }

    private File writeFile(byte[] data) throws IOException {
        File f = tempFolder.newFile("test.7z");
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(data);
        } finally {
            fos.close();
        }
        return f;
    }

    // ---------- 1. matches() : static method boundary/branch ----------

    @Test
    public void matches_exactSignature_true() {
        assertTrue(SevenZFile.matches(SIG, SIG.length));
    }

    @Test
    public void matches_longerBufferWithCorrectPrefix_true() {
        byte[] buf = new byte[]{SIG[0], SIG[1], SIG[2], SIG[3], SIG[4], SIG[5], 0x00, 0x00};
        assertTrue(SevenZFile.matches(buf, buf.length));
    }

    @Test
    public void matches_lengthShorterThanSignature_false() {
        // boundary: length < sevenZSignature.length (6)
        assertFalse(SevenZFile.matches(SIG, 5));
    }

    @Test
    public void matches_emptyArrayZeroLength_false() {
        assertFalse(SevenZFile.matches(new byte[0], 0));
    }

    @Test
    public void matches_mismatchAtLastByte_false() {
        byte[] buf = Arrays.copyOf(SIG, SIG.length);
        buf[5] = 0x00; // ทำให้ไบต์สุดท้ายไม่ตรง
        assertFalse(SevenZFile.matches(buf, buf.length));
    }

    // ---------- 2. Constructor: bad signature ----------

    @Test
    public void constructor_badSignature_throwsIOException() throws Exception {
        File f = writeFile(new byte[]{0, 0, 0, 0, 0, 0});
        thrown.expect(IOException.class);
        thrown.expectMessage("Bad 7z signature");
        new SevenZFile(f);
    }

    // ---------- 3. Constructor: unsupported version (major != 0) ----------

    @Test
    public void constructor_unsupportedVersion_throwsIOException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(SIG);
        out.write(1); // major = 1 -> unsupported
        out.write(0); // minor
        File f = writeFile(out.toByteArray());
        thrown.expect(IOException.class);
        thrown.expectMessage("Unsupported 7z version");
        new SevenZFile(f);
    }

    // ---------- 4. nextHeaderSize cast overflow branch ----------

    @Test
    public void constructor_nextHeaderSizeOverflow_throwsIOException() throws Exception {
        // 2^32 -> cast เป็น int จะกลายเป็น 0 ทำให้ mismatch กับค่า long เดิม
        byte[] sigHeader = buildSignatureHeader(0, 4294967296L, 0L, (byte) 0, (byte) 4);
        File f = writeFile(sigHeader);
        thrown.expect(IOException.class);
        thrown.expectMessage("cannot handle nextHeaderSize");
        new SevenZFile(f);
    }

    // ---------- 5. NextHeader CRC mismatch ----------

    @Test
    public void constructor_nextHeaderCrcMismatch_throwsIOException() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00}; // kHeader,kFilesInfo,numFiles=0,term,end
        byte[] archiveBytes = buildArchive(nextHeader);
        // corrupt หนึ่งไบต์ใน nextHeader (อยู่หลัง signature header 32 ไบต์)
        archiveBytes[32 + 2] = (byte) (archiveBytes[32 + 2] ^ 0xFF);
        File f = writeFile(archiveBytes);
        thrown.expect(IOException.class);
        thrown.expectMessage("NextHeader CRC mismatch");
        new SevenZFile(f);
    }

    // ---------- 6. StartHeader CRC mismatch (ตรวจผ่าน CRC32VerifyingInputStream) ----------

    @Test
    public void constructor_startHeaderCrcMismatch_throwsIOException() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        byte[] archiveBytes = buildArchive(nextHeader);
        // corrupt byte ภายใน startHeader (offset 12..31) โดยไม่แก้ startHeaderCrc field เอง
        archiveBytes[15] = (byte) (archiveBytes[15] ^ 0x01);
        File f = writeFile(archiveBytes);
        // ไม่ทราบข้อความ exception ที่แน่นอนจาก CRC32VerifyingInputStream (ไม่มีซอร์สให้)
        // จึงตรวจสอบเพียงว่าเป็น IOException
        thrown.expect(IOException.class);
        new SevenZFile(f);
    }

    // ---------- 7. Top-level nid ไม่ใช่ kHeader/kEncodedHeader ----------

    @Test
    public void readHeaders_unknownTopLevelNid_throwsBrokenArchive() throws Exception {
        byte[] nextHeader = {0x02}; // ไม่ใช่ kEncodedHeader(23) และไม่ใช่ kHeader(1)
        File f = writeFile(buildArchive(nextHeader));
        thrown.expect(IOException.class);
        thrown.expectMessage("Broken or unsupported archive: no Header");
        new SevenZFile(f);
    }

    // ---------- 8. kAdditionalStreamsInfo branch ----------

    @Test
    public void readHeader_additionalStreamsInfo_throwsUnsupported() throws Exception {
        byte[] nextHeader = {0x01, 0x03}; // kHeader, kAdditionalStreamsInfo
        File f = writeFile(buildArchive(nextHeader));
        thrown.expect(IOException.class);
        thrown.expectMessage("Additional streams unsupported");
        new SevenZFile(f);
    }

    // ---------- 9. kArchiveProperties branch (empty properties) + NPE ที่ derive ได้จาก source ----------

    @Test
    public void readHeader_archivePropertiesEmpty_constructsButFilesIsNull() throws Exception {
        // kHeader, kArchiveProperties, (immediate kEnd ของ property loop), kEnd (จบ header)
        byte[] nextHeader = {0x01, 0x02, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f);
        try {
            // เนื่องจากไม่มี kFilesInfo section, archive.files ไม่ถูก set (เป็น null)
            // getEntries() เรียก Arrays.asList(archive.files) -> NullPointerException
            // (พฤติกรรมนี้ derive ได้ตรงจาก source ที่ให้มา ไม่ใช่การเดา)
            thrown.expect(NullPointerException.class);
            sevenZFile.getEntries();
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- 10. Badly terminated header ----------

    @Test
    public void readHeader_badlyTerminated_throwsIOException() throws Exception {
        // kHeader, kFilesInfo, numFiles=0, propertyTerminator(0), finalNid=7 (ไม่ใช่ kEnd)
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x07};
        File f = writeFile(buildArchive(nextHeader));
        thrown.expect(IOException.class);
        thrown.expectMessage("Badly terminated header, found 7");
        new SevenZFile(f);
    }

    // ---------- 11. Valid empty archive (0 files) : boundary getNextEntry() ----------

    @Test
    public void validEmptyArchive_getNextEntryReturnsNullImmediately() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f);
        try {
            assertNull(sevenZFile.getNextEntry());
            Iterator<SevenZArchiveEntry> it = sevenZFile.getEntries().iterator();
            assertFalse(it.hasNext());
            assertNotNull(sevenZFile.toString()); // ต้องไม่ throw
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- 12. Archive มี 1 entry (directory, no stream) : ครอบคลุม kEmptyStream + buildDecodingStream early-return ----------

    @Test
    public void archiveWithOneEmptyStreamEntry_getNextEntryThenNull() throws Exception {
        // kHeader, kFilesInfo, numFiles=1, propType=kEmptyStream(14), size=1, bits=0x80(bit0=1), term(0), finalKEnd(0)
        byte[] nextHeader = {0x01, 0x05, 0x01, 0x0E, 0x01, (byte) 0x80, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f);
        try {
            SevenZArchiveEntry entry = sevenZFile.getNextEntry();
            assertNotNull(entry);
            assertTrue(entry.isDirectory());   // สมมติฐาน API มาตรฐานของ SevenZArchiveEntry
            assertEquals(0L, entry.getSize());

            // entry ถัดไปควรเป็น null (boundary: currentEntryIndex >= files.length-1)
            assertNull(sevenZFile.getNextEntry());

            // เนื่องจาก folderIndex<0 -> deferredBlockStreams ไม่ถูกเติม -> read() ต้อง throw
            thrown.expect(IllegalStateException.class);
            thrown.expectMessage("No current 7z entry");
            sevenZFile.read();
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- 13. read() ก่อนเรียก getNextEntry() เลย ----------

    @Test
    public void read_beforeAnyGetNextEntry_throwsIllegalStateException() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f);
        try {
            thrown.expect(IllegalStateException.class);
            sevenZFile.read();
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- 14. Single-arg constructor (password = null path) ----------

    @Test
    public void singleArgConstructor_delegatesWithNullPassword() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f); // ไม่ระบุ password
        try {
            assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- 15. Password copy branch + zero-out on close() ----------

    @Test
    public void constructor_withPassword_copiesAndZerosOnClose() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        byte[] pwd = new byte[]{1, 2, 3, 4};
        SevenZFile sevenZFile = new SevenZFile(f, pwd);

        Field pwField = SevenZFile.class.getDeclaredField("password");
        pwField.setAccessible(true);
        byte[] storedBeforeClose = (byte[]) pwField.get(sevenZFile);

        assertNotNull(storedBeforeClose);
        assertArrayEquals(pwd, storedBeforeClose);
        assertNotSame(pwd, storedBeforeClose); // ต้องเป็นการ copy ไม่ใช่ reference เดียวกัน

        sevenZFile.close();
        byte[] storedAfterClose = (byte[]) pwField.get(sevenZFile);
        assertNull(storedAfterClose); // password ต้องถูก set เป็น null หลัง close()
    }

    // ---------- 16. close() เรียกซ้ำได้โดยไม่ throw (idempotent, file==null branch) ----------

    @Test
    public void close_calledTwice_doesNotThrow() throws Exception {
        byte[] nextHeader = {0x01, 0x05, 0x00, 0x00, 0x00};
        File f = writeFile(buildArchive(nextHeader));
        SevenZFile sevenZFile = new SevenZFile(f);
        sevenZFile.close();
        sevenZFile.close(); // เข้าเงื่อนไข if(file != null) เป็น false รอบสอง
    }
}
