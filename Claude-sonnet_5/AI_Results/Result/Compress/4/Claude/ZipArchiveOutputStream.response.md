# JUnit 4 Test Suite: ZipArchiveOutputStreamTest

## หมายเหตุก่อนเริ่ม

- ทดสอบผ่าน `ByteArrayOutputStream` (non-seekable) และ `File` (seekable ผ่าน `RandomAccessFile`) เพื่อครอบคลุมทั้งสองเส้นทาง (`raf == null` / `raf != null`)
- ในแต่ละ test จะเรียก `zos.close()` เพียงครั้งเดียวเท่านั้น (ไม่เรียก `finish()` ซ้ำกับ `close()`) เพื่อป้องกันการเขียน End-Of-Central-Directory ซ้ำซ้อนซึ่งจะทำให้ผลลัพธ์ไบต์ไม่ถูกต้อง
- จุดที่พฤติกรรมไม่ชัดเจนจากซอร์ส (เช่น `write(null,...)`) จะมีคอมเมนต์กำกับไว้ชัดเจนว่าไม่ได้เดา logic เพิ่มเติม แต่อ้างอิงพฤติกรรมปริยายของ Java API ที่ถูกเรียกใช้ภายใน

```java
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ZipArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    // ================= Constructors =================

    @Test
    public void testConstructor_OutputStream_NotSeekable() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertFalse("OutputStream-based archive must not be seekable", zos.isSeekable());
        zos.close();
    }

    @Test
    public void testConstructor_File_Seekable() throws IOException {
        File f = folder.newFile("seekable.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        assertTrue("File-based archive should use RandomAccessFile", zos.isSeekable());
        zos.close();
    }

    // ================= Encoding getters/setters =================

    @Test
    public void testGetEncoding_Default() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertEquals("UTF8", zos.getEncoding());
        zos.close();
    }

    @Test
    public void testSetEncoding_NonUtf8() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setEncoding("ASCII");
        assertEquals("ASCII", zos.getEncoding());
        zos.close();
    }

    @Test
    public void testSetEncoding_Null() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setEncoding(null); // ค่า null -> ใช้ platform default encoding
        assertNull(zos.getEncoding());
        zos.close();
    }

    // ================= useEFS / general purpose flag =================

    private int generalPurposeFlag(byte[] data) {
        // byte[4..5] = version needed, byte[6..7] = general purpose bit flag (little endian)
        return (data[6] & 0xFF) | ((data[7] & 0xFF) << 8);
    }

    @Test
    public void testSetUseLanguageEncodingFlag_TrueOnUtf8() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setUseLanguageEncodingFlag(true); // encoding เป็น UTF-8 อยู่แล้ว -> useEFS ยังคง true
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        zos.closeArchiveEntry();
        byte[] snapshot = baos.toByteArray(); // จับภาพก่อน finish() เพื่อไม่ปนกับ CD/EOCD
        int flag = generalPurposeFlag(snapshot);
        assertTrue("EFS flag ควรถูกเซ็ต", (flag & ZipArchiveOutputStream.EFS_FLAG) != 0);
        zos.close();
    }

    @Test
    public void testSetUseLanguageEncodingFlag_False() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setUseLanguageEncodingFlag(false); // บังคับ useEFS = false ไม่ว่า encoding จะเป็นอะไร
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        zos.closeArchiveEntry();
        byte[] snapshot = baos.toByteArray();
        int flag = generalPurposeFlag(snapshot);
        assertEquals("ไม่ควรมี flag bit ใดถูกเซ็ตสำหรับ STORED โดยไม่มี EFS", 0, flag);
        zos.close();
    }

    // ================= setLevel boundaries =================

    @Test
    public void testSetLevel_Valid() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setLevel(5);
        zos.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_TooLow_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setLevel(-2); // ต่ำกว่า DEFAULT_COMPRESSION(-1)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_TooHigh_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setLevel(10); // สูงกว่า BEST_COMPRESSION(9)
    }

    @Test
    public void testSetLevel_BoundaryDefaultCompression() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setLevel(-1); // ขอบเขตล่างที่ถูกต้อง
        zos.close();
    }

    @Test
    public void testSetLevel_BoundaryBestCompression() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.setLevel(9); // ขอบเขตบนที่ถูกต้อง
        zos.close();
    }

    // ================= setMethod / setComment =================

    @Test
    public void testSetMethod_DefaultAppliedWhenEntryUnspecified() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(-1); // ไม่ระบุ method
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        assertEquals(ZipArchiveOutputStream.STORED, e.getMethod());
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testSetComment_ProducesNonEmptyOutput() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setComment("hello world");
        zos.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    // ================= putArchiveEntry =================

    @Test
    public void testPutArchiveEntry_TimeNotSpecified_SetsCurrentTime() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        assertEquals(-1, e.getTime());
        zos.putArchiveEntry(e);
        assertTrue(e.getTime() != -1);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_STORED_NoRAF_MissingSize_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setCrc(0);
        // size ปล่อยเป็น -1 (ไม่ระบุ)
        zos.putArchiveEntry(e);
    }

    @Test(expected = ZipException.class)
    public void testPutArchiveEntry_STORED_NoRAF_MissingCrc_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        // crc ปล่อยเป็น -1 (ไม่ระบุ)
        zos.putArchiveEntry(e);
    }

    @Test
    public void testPutArchiveEntry_STORED_NoRAF_ValidSetsCompressedSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(5);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        assertEquals(5, e.getCompressedSize());
        zos.write(new byte[]{1,2,3,4,5}, 0, 5);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testPutArchiveEntry_STORED_WithRAF_NoValidationNeeded() throws IOException {
        File f = folder.newFile("stored_raf.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        // size/crc ไม่ถูกกำหนด แต่ raf != null จึงไม่ต้อง validate
        zos.putArchiveEntry(e);
        zos.write(new byte[]{9,9,9}, 0, 3);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testPutArchiveEntry_DEFLATED_CompressionLevelChanged() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(3); // ตั้ง hasCompressionLevelChanged = true
        ZipArchiveEntry e = new ZipArchiveEntry("a.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e); // ควร apply level ใหม่แล้ว reset flag
        zos.write("hello".getBytes(), 0, 5);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testPutArchiveEntry_EmptyFileName() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry(""); // ชื่อไฟล์ว่าง (edge case)
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        zos.closeArchiveEntry();
        zos.close();
    }

    // ================= closeArchiveEntry =================

    @Test
    public void testCloseArchiveEntry_NullEntry_NoOp() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.closeArchiveEntry(); // entry == null -> return ทันที ไม่ควร throw
        zos.close();
    }

    @Test
    public void testCloseArchiveEntry_DEFLATED_SetsSizesAndCrc() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("d.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        byte[] data = "the quick brown fox".getBytes();
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        assertEquals(data.length, e.getSize());
        assertTrue(e.getCompressedSize() >= 0);
        zos.close();
    }

    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_STORED_NoRAF_BadCrc_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("s.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(3);
        e.setCrc(12345L); // crc ผิดโดยตั้งใจ
        zos.putArchiveEntry(e);
        zos.write(new byte[]{1,2,3}, 0, 3);
        zos.closeArchiveEntry(); // ควร throw เพราะ crc ไม่ตรง
    }

    @Test(expected = ZipException.class)
    public void testCloseArchiveEntry_STORED_NoRAF_BadSize_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("s2.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(999); // size ผิดโดยตั้งใจ
        byte[] data = new byte[]{1,2,3};
        CRC32 crc = new CRC32();
        crc.update(data);
        e.setCrc(crc.getValue());
        zos.putArchiveEntry(e);
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry(); // crc ถูก แต่ size ผิด -> ควร throw
    }

    @Test
    public void testCloseArchiveEntry_STORED_NoRAF_Valid() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("s3.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = new byte[]{5,6,7,8};
        e.setSize(data.length);
        CRC32 crc = new CRC32();
        crc.update(data);
        e.setCrc(crc.getValue());
        zos.putArchiveEntry(e);
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testCloseArchiveEntry_STORED_WithRAF_UpdatesHeader() throws IOException {
        File f = folder.newFile("stored_raf2.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        ZipArchiveEntry e = new ZipArchiveEntry("r.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        zos.putArchiveEntry(e);
        byte[] data = new byte[]{1,1,1,1,1};
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        assertEquals(data.length, e.getSize());
        assertEquals(data.length, e.getCompressedSize());
        zos.close();
    }

    // ================= write =================

    @Test
    public void testWrite_DEFLATED_ZeroLength_NoOp() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("z.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        zos.write(new byte[0], 0, 0); // length == 0 -> ข้าม if(length>0)
        zos.closeArchiveEntry();
        assertEquals(0, e.getSize());
        zos.close();
    }

    @Test
    public void testWrite_DEFLATED_SmallBlock() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("small.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        byte[] data = "small block of data".getBytes();
        zos.write(data, 0, data.length); // length <= DEFLATER_BLOCK_SIZE
        zos.closeArchiveEntry();
        assertEquals(data.length, e.getSize());
        zos.close();
    }

    @Test
    public void testWrite_DEFLATED_MultipleFullBlocksWithRemainder() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("large.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        int len = 8192 * 2 + 100; // > DEFLATER_BLOCK_SIZE และไม่ใช่ตัวคูณลงตัว
        byte[] data = new byte[len];
        for (int i = 0; i < len; i++) {
            data[i] = (byte) (i % 251);
        }
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        assertEquals(len, e.getSize());
        zos.close();
    }

    @Test
    public void testWrite_DEFLATED_ExactMultipleOfBlockSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("exact.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        int len = 8192 * 2; // ตัวคูณลงตัว -> ข้าม remainder branch
        byte[] data = new byte[len];
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
        assertEquals(len, e.getSize());
        zos.close();
    }

    @Test
    public void testWrite_STORED_UpdatesWrittenAndCrcDirectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry e = new ZipArchiveEntry("stored.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = new byte[]{10,20,30};
        e.setSize(data.length);
        CRC32 crc = new CRC32();
        crc.update(data);
        e.setCrc(crc.getValue());
        zos.putArchiveEntry(e);
        zos.write(data, 0, data.length); // non-DEFLATED path
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test(expected = NullPointerException.class)
    public void testWrite_NullBuffer_ThrowsNPE_ForDeflatedEntry() throws IOException {
        // ไม่มีการเช็ค null ในซอร์สโค้ดโดยตรง
        // คาดหวังพฤติกรรมปริยายจาก def.setInput()/crc.update() เมื่อรับ null array
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("n.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        zos.write(null, 0, 5);
    }

    // ================= finish =================

    @Test(expected = IOException.class)
    public void testFinish_WithOpenEntry_Throws() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry e = new ZipArchiveEntry("open.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        // ไม่ปิด entry -> finish() ต้อง throw
        zos.finish();
    }

    @Test
    public void testFinish_MultipleEntries_WritesCentralDirectory() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        for (int i = 0; i < 3; i++) {
            ZipArchiveEntry e = new ZipArchiveEntry("f" + i + ".txt");
            e.setMethod(ZipArchiveOutputStream.STORED);
            byte[] data = ("data" + i).getBytes();
            e.setSize(data.length);
            CRC32 crc = new CRC32();
            crc.update(data);
            e.setCrc(crc.getValue());
            zos.putArchiveEntry(e);
            zos.write(data, 0, data.length);
            zos.closeArchiveEntry();
        }
        zos.close(); // close() เรียก finish() ให้เพียงครั้งเดียว
        byte[] out = baos.toByteArray();
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06};
        boolean found = false;
        for (int i = out.length - 4; i >= 0; i--) {
            if (out[i] == eocd[0] && out[i+1] == eocd[1]
                && out[i+2] == eocd[2] && out[i+3] == eocd[3]) {
                found = true;
                break;
            }
        }
        assertTrue("ควรมี EOCD signature ในผลลัพธ์", found);
    }

    // ================= close / flush =================

    @Test
    public void testClose_NoEntriesStillProducesValidStream() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.close(); // ไม่มี entry -> finish() ทำงานปกติ ไม่ throw
    }

    @Test
    public void testFlush_NoException() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zos.flush(); // out != null branch
        zos.close();
    }

    // ================= createArchiveEntry =================

    @Test
    public void testCreateArchiveEntry_ReturnsZipArchiveEntry() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        File f = folder.newFile("inp.bin");
        Object entry = zos.createArchiveEntry(f, "inp.bin");
        assertTrue(entry instanceof ZipArchiveEntry);
        zos.close();
    }

    // ================= Unicode extra fields =================

    @Test
    public void testUnicodeExtraFieldPolicy_Always_AddsPathExtraField() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        ZipArchiveEntry e = new ZipArchiveEntry("always.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        boolean found = false;
        for (ZipExtraField field : e.getExtraFields()) {
            if (field instanceof UnicodePathExtraField) {
                found = true;
            }
        }
        assertTrue("ALWAYS policy ควรเพิ่ม UnicodePathExtraField", found);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testUnicodeExtraFieldPolicy_Never_NoExtraFieldAdded() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        // default policy คือ NEVER
        ZipArchiveEntry e = new ZipArchiveEntry("never.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        boolean found = false;
        for (ZipExtraField field : e.getExtraFields()) {
            if (field instanceof UnicodePathExtraField) {
                found = true;
            }
        }
        assertFalse("NEVER policy ไม่ควรเพิ่ม UnicodePathExtraField", found);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testUnicodeExtraFieldPolicy_NotEncodable_NonAsciiName() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("US-ASCII");
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        ZipArchiveEntry e = new ZipArchiveEntry("caf\u00e9.txt"); // 'é' ไม่สามารถ encode เป็น ASCII
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        boolean found = false;
        for (ZipExtraField field : e.getExtraFields()) {
            if (field instanceof UnicodePathExtraField) {
                found = true;
            }
        }
        assertTrue("ชื่อที่ encode ไม่ได้ควร trigger UnicodePathExtraField", found);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testUnicodeExtraFieldPolicy_CommentNotEncodable_AddsCommentExtraField() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("US-ASCII");
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        ZipArchiveEntry e = new ZipArchiveEntry("plain.txt");
        e.setComment("caf\u00e9 comment"); // comment ไม่สามารถ encode เป็น ASCII
        e.setMethod(ZipArchiveOutputStream.STORED);
        e.setSize(0);
        e.setCrc(0);
        zos.putArchiveEntry(e);
        boolean found = false;
        for (ZipExtraField field : e.getExtraFields()) {
            if (field instanceof UnicodeCommentExtraField) {
                found = true;
            }
        }
        assertTrue("comment ที่ encode ไม่ได้ควร trigger UnicodeCommentExtraField", found);
        zos.closeArchiveEntry();
        zos.close();
    }

    @Test
    public void testFallbackToUTF8_NonEncodableName_UsesUtf8Encoding() throws IOException {
        File f = folder.newFile("fallback.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f); // seekable
        zos.setEncoding("US-ASCII");
        zos.setFallbackToUTF8(true);
        ZipArchiveEntry e = new ZipArchiveEntry("caf\u00e9.txt");
        e.setMethod(ZipArchiveOutputStream.STORED);
        zos.putArchiveEntry(e); // ไม่ควร throw, ใช้ UTF8_ZIP_ENCODING แทน
        zos.closeArchiveEntry();
        zos.close();
    }

    // ================= Integration: write then read back =================

    @Test
    public void testWriteThenReadBack_WithZipFile() throws IOException {
        File f = folder.newFile("roundtrip.zip");
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(f);
        ZipArchiveEntry e = new ZipArchiveEntry("hello.txt");
        e.setMethod(ZipArchiveOutputStream.DEFLATED);
        zos.putArchiveEntry(e);
        byte[] content = "Hello, Compress!".getBytes();
        zos.write(content, 0, content.length);
        zos.closeArchiveEntry();
        zos.close();

        ZipFile zf = new ZipFile(f);
        try {
            Enumeration en = zf.getEntriesInPhysicalOrder();
            assertTrue(en.hasMoreElements());
            ZipArchiveEntry readEntry = (ZipArchiveEntry) en.nextElement();
            assertEquals("hello.txt", readEntry.getName());
            InputStream is = zf.getInputStream(readEntry);
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int c;
            while ((c = is.read()) != -1) {
                bo.write(c);
            }
            assertArrayEquals(content, bo.toByteArray());
        } finally {
            zf.close();
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_OutputStream_NotSeekable | Constructor(OutputStream), `raf == null` |
| testConstructor_File_Seekable | Constructor(File), `_raf` สำเร็จ, `raf != null` |
| testGetEncoding_Default / testSetEncoding_NonUtf8 / testSetEncoding_Null | setEncoding/getEncoding, ค่า null |
| testSetUseLanguageEncodingFlag_TrueOnUtf8 | `useEFS = b && isUTF8()` → true branch |
| testSetUseLanguageEncodingFlag_False | `useEFS = false` explicit branch |
| testSetLevel_Valid/_TooLow_Throws/_TooHigh_Throws/_BoundaryDefault/_BoundaryBest | if-condition ทั้ง 2 ด้านของ `level` boundary |
| testSetMethod_DefaultAppliedWhenEntryUnspecified | `entry.getMethod() == -1` true branch |
| testSetComment_ProducesNonEmptyOutput | setComment, writeCentralDirectoryEnd comment encode |
| testPutArchiveEntry_TimeNotSpecified_SetsCurrentTime | `entry.getTime() == -1` true branch |
| testPutArchiveEntry_STORED_NoRAF_MissingSize_Throws | STORED+raf==null, size==-1 → ZipException |
| testPutArchiveEntry_STORED_NoRAF_MissingCrc_Throws | STORED+raf==null, crc==-1 → ZipException |
| testPutArchiveEntry_STORED_NoRAF_ValidSetsCompressedSize | STORED+raf==null valid path |
| testPutArchiveEntry_STORED_WithRAF_NoValidationNeeded | STORED+raf!=null skip validation |
| testPutArchiveEntry_DEFLATED_CompressionLevelChanged | `hasCompressionLevelChanged` true branch |
| testPutArchiveEntry_EmptyFileName | boundary: empty string filename |
| testCloseArchiveEntry_NullEntry_NoOp | `entry == null` return branch |
| testCloseArchiveEntry_DEFLATED_SetsSizesAndCrc | DEFLATED branch, deflate loop |
| testCloseArchiveEntry_STORED_NoRAF_BadCrc_Throws | STORED+raf==null CRC mismatch |
| testCloseArchiveEntry_STORED_NoRAF_BadSize_Throws | STORED+raf==null size mismatch |
| testCloseArchiveEntry_STORED_NoRAF_Valid | STORED+raf==null valid path |
| testCloseArchiveEntry_STORED_WithRAF_UpdatesHeader | STORED+raf!=null else-branch, header rewrite |
| testWrite_DEFLATED_ZeroLength_NoOp | `length > 0` false branch |
| testWrite_DEFLATED_SmallBlock | `length <= DEFLATER_BLOCK_SIZE` true branch |
| testWrite_DEFLATED_MultipleFullBlocksWithRemainder | fullblocks loop + `done < length` true |
| testWrite_DEFLATED_ExactMultipleOfBlockSize | `done < length` false branch |
| testWrite_STORED_UpdatesWrittenAndCrcDirectly | else (non-DEFLATED) branch of write() |
| testWrite_NullBuffer_ThrowsNPE_ForDeflatedEntry | malformed input (null array), unguarded native behavior |
| testFinish_WithOpenEntry_Throws | `entry != null` → IOException |
| testFinish_MultipleEntries_WritesCentralDirectory | entries loop, writeCentralDirectoryEnd |
| testClose_NoEntriesStillProducesValidStream | close()->finish() empty entries |
| testFlush_NoException | `out != null` branch |
| testCreateArchiveEntry_ReturnsZipArchiveEntry | createArchiveEntry() |
| testUnicodeExtraFieldPolicy_Always_AddsPathExtraField | policy==ALWAYS branch |
| testUnicodeExtraFieldPolicy_Never_NoExtraFieldAdded | policy==NEVER (skip block) |
| testUnicodeExtraFieldPolicy_NotEncodable_NonAsciiName | `!encodable` true branch |
| testUnicodeExtraFieldPolicy_CommentNotEncodable_AddsCommentExtraField | comment != null/!="" & !commentEncodable |
| testFallbackToUTF8_NonEncodableName_UsesUtf8Encoding | `!encodable && fallbackToUTF8` true branch |
| testWriteThenReadBack_WithZipFile | Integration: DEFLATED+raf!=null, writeDataDescriptor early-return, header rewrite ผ่านการอ่านจริง |