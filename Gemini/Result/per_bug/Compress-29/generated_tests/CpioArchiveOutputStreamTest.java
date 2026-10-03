package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Before;
import org.junit.Test;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream out;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructorFormat() {
        // ทดสอบ Constructor รับ Format ที่ไม่มีอยู่จริง (Edge case)
        new CpioArchiveOutputStream(baos, (short) 9999);
    }

    @Test
    public void testValidConstructors() throws IOException {
        // ทดสอบ Constructor หลากหลายรูปแบบเพื่อครอบคลุม Overloads
        CpioArchiveOutputStream out1 = new CpioArchiveOutputStream(baos);
        CpioArchiveOutputStream out2 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC, 512);
        CpioArchiveOutputStream out3 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII, 512, "US-ASCII");
        CpioArchiveOutputStream out4 = new CpioArchiveOutputStream(baos, "UTF-8");
        assertNotNull(out1);
        assertNotNull(out2);
        assertNotNull(out3);
        assertNotNull(out4);
        out4.close();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpenClosedStream() throws IOException {
        out.close();
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        out.putArchiveEntry(entry); // ต้องโยน IOException เพราะสตรีมถูกปิดแล้ว
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAfterFinish() throws IOException {
        out.finish();
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        out.putArchiveEntry(entry); // สตรีม finish ไปแล้ว ห้ามเพิ่ม entry
    }

    @Test(expected = IOException.class)
    public void testFormatMismatch() throws IOException {
        // สร้าง Stream แบบ FORMAT_NEW แต่พยายามใส่ Entry ที่เป็น FORMAT_OLD_ASCII
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "mismatch.txt");
        out.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryName() throws IOException {
        CpioArchiveEntry entry1 = new CpioArchiveEntry("file.txt");
        CpioArchiveEntry entry2 = new CpioArchiveEntry("file.txt");
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();
        out.putArchiveEntry(entry2); // ซ้ำชื่อ ต้องพ่น IOException
    }

    @Test
    public void testAutoSetTimeAndArtificialInodeBranches() throws IOException {
        // ทดสอบเมื่อ time == -1 และ inode/devMin == 0 (Artificial device & inode branch)
        CpioArchiveEntry entry = new CpioArchiveEntry("artificial.txt");
        entry.setTime(-1); // Trigger time setting
        entry.setInode(0);
        entry.setDeviceMin(0);
        entry.setSize(5);
        
        out.putArchiveEntry(entry);
        out.write("12345".getBytes());
        out.closeArchiveEntry();
        out.finish();
    }

    @Test
    public void testArtificialInodeIncrementElseBranch() throws IOException {
        // ทดสอบกรณี inode != 0 หรือ devMin != 0 เพื่อวิ่งเข้าเงื่อนไข Math.max(...) + 1
        CpioArchiveEntry entry1 = new CpioArchiveEntry("art1.txt");
        entry1.setInode(10);
        entry1.setDeviceMin(1);
        entry1.setSize(2);
        
        CpioArchiveEntry entry2 = new CpioArchiveEntry("art2.txt");
        entry2.setInode(5); // ค่าน้อยกว่า เพื่อให้ทดสอบ Math.max
        entry2.setDeviceMin(1);
        entry2.setSize(2);

        out.putArchiveEntry(entry1);
        out.write("ab".getBytes());
        out.closeArchiveEntry();

        out.putArchiveEntry(entry2);
        out.write("cd".getBytes());
        out.closeArchiveEntry();
        out.finish();
    }

    @Test
    public void testAllFormatsAndTrailer() throws IOException {
        // ทดสอบเขียน Format อื่นๆ และเงื่อนไข CPIO_TRAILER
        short[] formats = {
            CpioConstants.FORMAT_NEW,
            CpioConstants.FORMAT_NEW_CRC,
            CpioConstants.FORMAT_OLD_ASCII,
            CpioConstants.FORMAT_OLD_BINARY
        };

        for (short fmt : formats) {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            CpioArchiveOutputStream cOut = new CpioArchiveOutputStream(bOut, fmt, 512);
            CpioArchiveEntry entry = new CpioArchiveEntry(fmt, "sample.txt");
            entry.setSize(3);
            cOut.putArchiveEntry(entry);
            cOut.write("abc".getBytes());
            cOut.closeArchiveEntry();
            cOut.finish();
            assertTrue(bOut.size() > 0);
        }
    }

    @Test(expected = IOException.class)
    public void testCloseNonExistentEntry() throws IOException {
        out.closeArchiveEntry(); // ไม่มี entry เปิดอยู่ ต้องพ่น IOException
    }

    @Test(expected = IOException.class)
    public void testInvalidEntrySizeMismatch() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("size.txt");
        entry.setSize(10); // ตั้งใจบอกว่าขนาด 10 ไบต์
        out.putArchiveEntry(entry);
        out.write("abc".getBytes()); // เขียนแค่ 3 ไบต์
        out.closeArchiveEntry(); // ขนาดไม่ตรง ต้องพ่น IOException
    }

    @Test(expected = IOException.class)
    public void testCrcError() throws IOException {
        // ทดสอบ CRC Error สำหรับ FORMAT_NEW_CRC
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        CpioArchiveOutputStream crcOut = new CpioArchiveOutputStream(bOut, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc.txt");
        entry.setSize(3);
        entry.setChksum(99999); // ตั้งค่า Checksum จงใจให้ผิด
        crcOut.putArchiveEntry(entry);
        crcOut.write("abc".getBytes());
        crcOut.closeArchiveEntry(); // ต้องติด CRC Error
    }

    @Test
    public void testWriteEdgeCases() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("write.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);

        // ทดสอบ len == 0 (Early return)
        out.write(new byte[0], 0, 0);

        // ทดสอบเขียนปกติ
        out.write(new byte[] { 'a', 'b' }, 0, 2);
        out.closeArchiveEntry();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteIndexOutOfBoundsNegativeOffset() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("ioob.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        out.write(new byte[5], -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteIndexOutOfBoundsNegativeLen() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("ioob.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        out.write(new byte[5], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteIndexOutOfBoundsExceedLength() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("ioob.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        out.write(new byte[5], 2, 4);
    }

    @Test(expected = IOException.class)
    public void testWriteWithoutEntry() throws IOException {
        out.write(new byte[1], 0, 1); // ไม่มี Entry เปิดอยู่
    }

    @Test(expected = IOException.class)
    public void testWritePastEnd() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("past.txt");
        entry.setSize(1);
        out.putArchiveEntry(entry);
        out.write(new byte[] { 1, 2 }, 0, 2); // เขียนเกินขนาด 1 ไบต์
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry("unclosed.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        out.finish(); // ยังไม่ได้ปิด Entry ห้าม finish
    }

    @Test(expected = IOException.class)
    public void testFinishTwice() throws IOException {
        out.finish();
        out.finish(); // Finish ซ้ำต้องพ่น IOException
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("cpio-test", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry archiveEntry = out.createArchiveEntry(tempFile, "temp.tmp");
        assertNotNull(archiveEntry);
        assertEquals("temp.tmp", archiveEntry.getName());
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryAfterFinish() throws IOException {
        out.finish();
        File tempFile = File.createTempFile("cpio-test", ".tmp");
        tempFile.deleteOnExit();
        out.createArchiveEntry(tempFile, "temp.tmp");
    }
}