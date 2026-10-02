package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream bos;

    @Before
    public void setUp() {
        bos = new ByteArrayOutputStream();
    }

    // ==================== Constructor ====================

    @Test
    public void testConstructor_DefaultFormat_NoException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.close();
    }

    @Test
    public void testConstructor_ValidFormat_New() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        cpio.close();
    }

    @Test
    public void testConstructor_ValidFormat_NewCrc() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        cpio.close();
    }

    @Test
    public void testConstructor_ValidFormat_OldAscii() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_ASCII);
        cpio.close();
    }

    @Test
    public void testConstructor_ValidFormat_OldBinary() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_BINARY);
        cpio.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidFormat_ThrowsIllegalArgumentException() {
        // ค่า -100 ไม่ตรงกับ case ใดใน switch ของ setFormat() -> เข้า default -> throw
        new CpioArchiveOutputStream(bos, (short) -100);
    }

    // ==================== putNextEntry ====================

    @Test
    public void testPutNextEntry_TimeNotSet_AutoSetsCurrentTime() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1", 0);
        // ข้อสมมติ: ค่า default ของ time คือ -1 ตาม Javadoc ของ putNextEntry
        assertEquals(-1, entry.getTime());
        cpio.putNextEntry(entry);
        assertTrue("time ควรถูกตั้งค่าอัตโนมัติ", entry.getTime() != -1);
        cpio.closeArchiveEntry();
        cpio.close();
    }

    @Test
    public void testPutNextEntry_DuplicateName_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0);
        cpio.putNextEntry(entry1);
        cpio.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0);
        try {
            cpio.putNextEntry(entry2);
            fail("ควร throw IOException เพราะชื่อซ้ำ");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("duplicate entry"));
        }
        cpio.close();
    }

    @Test
    public void testPutNextEntry_ClosesPreviousEntryAutomatically() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "first", 3);
        cpio.putNextEntry(entry1);
        cpio.write(new byte[] { 1, 2, 3 });
        // ไม่เรียก closeArchiveEntry() เอง ให้ putNextEntry ตัวถัดไปปิด entry เดิมให้
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "second", 0);
        cpio.putNextEntry(entry2);
        cpio.closeArchiveEntry();
        cpio.close();
    }

    @Test
    public void testPutNextEntry_AfterClose_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.close();
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "x", 0);
        try {
            cpio.putNextEntry(entry);
            fail("ควร throw IOException เพราะ stream ปิดแล้ว");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void testPutNextEntry_OldAsciiFormat_WriteAndClose() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old-ascii", 3);
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 'a', 'b', 'c' });
        cpio.closeArchiveEntry();
        cpio.close();
    }

    @Test
    public void testPutNextEntry_OldBinaryFormat_WriteAndClose() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "old-binary", 4);
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 1, 2, 3, 4 });
        cpio.closeArchiveEntry();
        cpio.close();
    }

    @Test
    public void testPutNextEntry_NewFormat_PaddingNotAligned() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "12345", 5);
        cpio.putNextEntry(entry);
        cpio.write("12345".getBytes());
        cpio.closeArchiveEntry(); // size % 4 != 0 -> pad() เขียน byte เพิ่ม
        cpio.close();
    }

    @Test
    public void testCloseArchiveEntry_NewFormat_PaddingAligned() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "aligned", 8);
        cpio.putNextEntry(entry);
        cpio.write("abcdefgh".getBytes());
        cpio.closeArchiveEntry(); // size % 4 == 0 -> ไม่มี padding
        cpio.close();
    }

    // ==================== closeArchiveEntry ====================

    @Test
    public void testCloseArchiveEntry_SizeMismatch_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "mismatch", 10);
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 1, 2, 3, 4, 5 }); // เขียนแค่ 5 จาก 10
        try {
            cpio.closeArchiveEntry();
            fail("ควร throw IOException เพราะ size ไม่ตรง");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("invalid entry size"));
        }
        cpio.close();
    }

    @Test
    public void testCloseArchiveEntry_CrcMatches_NoException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc-ok", 2);
        // ข้อสมมติ: มี setChksum(long) ให้ตั้งค่าตรงกับ checksum ที่คำนวณจาก write()
        entry.setChksum('A' + 'B'); // 65 + 66 = 131
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 'A', 'B' });
        cpio.closeArchiveEntry(); // crc == chksum -> ไม่ throw
        cpio.close();
    }

    @Test
    public void testCloseArchiveEntry_CrcMismatch_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc-bad", 1);
        // ไม่ตั้ง chksum (สมมติ default = 0) แต่ byte ที่เขียนทำให้ crc = 65 -> mismatch
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 'A' });
        try {
            cpio.closeArchiveEntry();
            fail("ควร throw IOException เพราะ CRC ไม่ตรง");
        } catch (IOException expected) {
            assertEquals("CRC Error", expected.getMessage());
        }
        cpio.close();
    }

    @Test
    public void testCloseArchiveEntry_WithoutCurrentEntry_ThrowsNPE() throws IOException {
        // จากซอร์ส closeArchiveEntry() ไม่ได้ null-check this.cpioEntry ก่อนเรียก .getSize()
        // ทำให้เกิด NullPointerException แทน IOException -> พฤติกรรมจริงตามโค้ด (อาจเป็น fault)
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        try {
            cpio.closeArchiveEntry();
            fail("คาดว่าจะเกิด NullPointerException เพราะไม่มี entry ปัจจุบัน");
        } catch (NullPointerException expected) {
            // ตามการวิเคราะห์ซอร์สโค้ด
        }
        cpio.close();
    }

    // ==================== write(byte[], off, len) ====================

    @Test
    public void testWrite_StreamClosed_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.close();
        try {
            cpio.write(new byte[] { 1 }, 0, 1);
            fail("ควร throw IOException เพราะ stream ปิดแล้ว");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_NegativeOffset_ThrowsIOOBE() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.write(new byte[] { 1, 2, 3 }, -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_NegativeLength_ThrowsIOOBE() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.write(new byte[] { 1, 2, 3 }, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_OffsetPlusLenExceedsArrayLength_ThrowsIOOBE() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.write(new byte[] { 1, 2, 3 }, 2, 5);
    }

    @Test
    public void testWrite_LenZero_ReturnsWithoutTouchingEntry() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        // ไม่มี putNextEntry(); len==0 ต้อง return ก่อนเช็ค "no current CPIO entry"
        cpio.write(new byte[] { 1, 2, 3 }, 0, 0);
        cpio.close();
    }

    @Test
    public void testWrite_NoCurrentEntry_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        try {
            cpio.write(new byte[] { 1, 2, 3 }, 0, 3);
            fail("ควร throw IOException เพราะยังไม่มี entry");
        } catch (IOException expected) {
            assertEquals("no current CPIO entry", expected.getMessage());
        }
        cpio.close();
    }

    @Test
    public void testWrite_ExceedsEntrySize_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "small", 2);
        cpio.putNextEntry(entry);
        try {
            cpio.write(new byte[] { 1, 2, 3 }, 0, 3);
            fail("ควร throw IOException เพราะเขียนเกิน size ที่ประกาศ");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("attempt to write past end"));
        }
        cpio.close();
    }

    @Test
    public void testWrite_SingleIntByte_NoExceptionEvenWithoutEntry() throws IOException {
        // write(int) เป็น pass-through ตรงไปยัง out โดยไม่เรียก ensureOpen() หรือ
        // ตรวจสอบ cpioEntry เลย -> พฤติกรรมไม่สมมาตรกับ write(byte[],int,int)
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.write('X'); // ไม่ throw แม้ไม่มี entry ปัจจุบัน
        cpio.close();
        assertTrue(bos.size() >= 1);
    }

    // ==================== finish() ====================

    @Test
    public void testFinish_WritesTrailerAfterClosingCurrentEntry() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "entry", 1);
        cpio.putNextEntry(entry);
        cpio.write(new byte[] { 'z' });
        cpio.finish(); // ต้องปิด entry ปัจจุบันก่อน แล้วเขียน TRAILER!!!
        cpio.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testFinish_AfterClose_ThrowsIOException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.close();
        try {
            cpio.finish();
            fail("ควร throw IOException เพราะ stream ปิดแล้ว");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void testFinish_CalledTwice_WritesTrailerTwice_FaultDocumented() throws IOException {
        // FAULT (คาดว่าเป็นสาเหตุของ Defects4J Compress-1b):
        // field "finished" ไม่มีที่ใดใน finish() ที่ set เป็น true
        // -> เรียก finish() ครั้งที่ 2 ไม่ return ทันที และเขียน TRAILER!!! ซ้ำ
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.finish();
        int sizeAfterFirst = bos.size();
        cpio.finish(); // ควรเป็น no-op แต่ไม่ใช่ เพราะ fault ข้างต้น
        int sizeAfterSecond = bos.size();
        assertTrue("finish() ควร idempotent แต่กลับเขียนข้อมูลเพิ่ม "
                        + "(sizeAfterFirst=" + sizeAfterFirst + ", sizeAfterSecond=" + sizeAfterSecond + ")",
                sizeAfterSecond > sizeAfterFirst);
        cpio.close();
    }

    // ==================== close() ====================

    @Test
    public void testClose_CalledTwice_NoException() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        cpio.close();
        cpio.close(); // closed flag ป้องกันการเรียก super.close() ซ้ำ
    }

    // ==================== putArchiveEntry ====================

    @Test
    public void testPutArchiveEntry_DelegatesToPutNextEntry() throws IOException {
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "via-putArchiveEntry", 0);
        cpio.putArchiveEntry(entry);
        cpio.closeArchiveEntry();
        cpio.close();
    }

    @Test
    public void testPutArchiveEntry_NullCastThenNPE() throws IOException {
        // putArchiveEntry(null) cast null เป็น CpioArchiveEntry ได้โดยไม่ throw ตอน cast
        // แต่ putNextEntry(null) จะ dereference e.getTime() -> NullPointerException
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(bos);
        try {
            cpio.putArchiveEntry(null);
            fail("คาดว่าจะเกิด NullPointerException");
        } catch (NullPointerException expected) {
            // ตามการวิเคราะห์ซอร์สโค้ด
        }
        cpio.close();
    }
}
