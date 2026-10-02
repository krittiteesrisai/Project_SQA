package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;

import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Test;

/**
 * JUnit4 tests for {@link CpioArchiveInputStream} (Defects4J Compress-29b).
 *
 * หมายเหตุ: การสร้าง byte stream ของ cpio entry ใน test นี้อ้างอิง field width
 * ตามที่อ่านได้จาก readOldAsciiEntry()/readOldBinaryEntry()/readNewEntry()
 * โดยตรง ส่วน padding (getHeaderPadCount/getDataPadCount) และ fileType()
 * ไม่มีซอร์สให้ จึงเลือกขนาดข้อมูลที่ตาม "spec cpio newc" ทั่วไปแล้ว pad=0
 * (ระบุ // ASSUMPTION ไว้ทุกจุด)
 */
public class CpioArchiveInputStreamTest {

    // ---------- helpers ----------

    private static byte[] ascii(String s) throws IOException {
        return s.getBytes(CharsetNames.US_ASCII);
    }

    private static byte[] octAscii(long value, int len) throws IOException {
        String s = String.format("%0" + len + "o", value);
        return ascii(s);
    }

    private static byte[] hexAscii(long value, int len) throws IOException {
        String s = String.format("%0" + len + "x", value);
        return ascii(s);
    }

    private static byte[] concat(byte[]... parts) {
        int total = 0;
        for (byte[] p : parts) total += p.length;
        byte[] r = new byte[total];
        int pos = 0;
        for (byte[] p : parts) {
            System.arraycopy(p, 0, r, pos, p.length);
            pos += p.length;
        }
        return r;
    }

    /** สร้าง entry แบบ OLD_ASCII (magic 070707) - ไม่มี header/data padding ตามซอร์ส */
    private static byte[] buildOldAsciiEntry(long mode, String name, byte[] data) throws IOException {
        byte[] nameBytes = concat(ascii(name), new byte[]{0});
        long namesize = nameBytes.length;
        long size = data.length;
        return concat(
                ascii(CpioConstants.MAGIC_OLD_ASCII),
                octAscii(0, 6),   // device
                octAscii(0, 6),   // inode
                octAscii(mode, 6),
                octAscii(0, 6),   // uid
                octAscii(0, 6),   // gid
                octAscii(0, 6),   // nlink
                octAscii(0, 6),   // rdev
                octAscii(0, 11),  // time
                octAscii(namesize, 6),
                octAscii(size, 11),
                nameBytes,
                data
        );
    }

    /**
     * สร้าง entry แบบ NEW / NEW_CRC (magic 070701 / 070702)
     * ASSUMPTION: เลือก namesize % 4 == 2 และ data.length % 4 == 0
     * เพื่อให้ headerPadCount()/dataPadCount() เป็น 0 ตามสเปก "newc" ทั่วไป
     */
    private static byte[] buildNewEntry(String magic, long mode, String name, byte[] data, long chksum) throws IOException {
        byte[] nameBytes = concat(ascii(name), new byte[]{0});
        long namesize = nameBytes.length;
        long size = data.length;
        return concat(
                ascii(magic),
                hexAscii(0, 8),      // inode
                hexAscii(mode, 8),   // mode
                hexAscii(0, 8),      // uid
                hexAscii(0, 8),      // gid
                hexAscii(0, 8),      // nlink
                hexAscii(0, 8),      // time
                hexAscii(size, 8),   // size
                hexAscii(0, 8),      // devMaj
                hexAscii(0, 8),      // devMin
                hexAscii(0, 8),      // rdevMaj
                hexAscii(0, 8),      // rdevMin
                hexAscii(namesize, 8),
                hexAscii(chksum, 8),
                nameBytes,
                data
        );
    }

    private static byte[] trailerOldAscii() throws IOException {
        return buildOldAsciiEntry(0, CpioConstants.CPIO_TRAILER, new byte[0]);
    }

    // ================= matches() : static, ทุก branch ==================

    @Test
    public void matches_lengthLessThan6_false() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x30};
        assertFalse(CpioArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void matches_binaryNonSwapped_true() {
        byte[] sig = new byte[]{0x71, (byte) 0xC7, 0, 0, 0, 0};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_binarySwapped_true() {
        byte[] sig = new byte[]{(byte) 0xC7, 0x71, 0, 0, 0, 0};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_byte0Wrong_false() {
        byte[] sig = new byte[]{0x31, 0x37, 0x30, 0x37, 0x30, 0x31};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_byte1Wrong_false() {
        byte[] sig = new byte[]{0x30, 0x30, 0x30, 0x37, 0x30, 0x31};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_byte2Wrong_false() {
        byte[] sig = new byte[]{0x30, 0x37, 0x31, 0x37, 0x30, 0x31};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_byte3Wrong_false() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x30, 0x30, 0x31};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_byte4Wrong_false() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x31, 0x31};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_lastByte0x31_true() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x30, 0x31};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_lastByte0x32_true() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x30, 0x32};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_lastByte0x37_true() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x30, 0x37};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void matches_ascii_lastByteOther_false() {
        byte[] sig = new byte[]{0x30, 0x37, 0x30, 0x37, 0x30, 0x33};
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    // ================= Constructors ==================

    @Test
    public void constructor_default_ok() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void constructor_withEncoding_null_ok() throws IOException {
        // encoding = null -> ใช้ platform default (ตาม javadoc)
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), (String) null);
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void constructor_withBlockSize_ok() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024);
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void constructor_withBlockSizeAndEncoding_ok() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, "UTF-8");
        assertEquals(1, in.available());
        in.close();
    }

    // ================= available()/close()/ensureOpen() ==================

    @Test
    public void available_beforeEOF_returnsOne() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void available_afterTrailer_returnsZero() throws IOException {
        byte[] data = trailerOldAscii();
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(in.getNextEntry());
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void close_isIdempotent() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close(); // เรียกซ้ำ - ต้องไม่ throw (branch closed==true)
    }

    @Test(expected = IOException.class)
    public void available_afterClose_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.available();
    }

    @Test(expected = IOException.class)
    public void getNextEntry_afterClose_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.getNextEntry();
    }

    @Test(expected = IOException.class)
    public void read_afterClose_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.read(new byte[1], 0, 1);
    }

    @Test(expected = IOException.class)
    public void skip_afterClose_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.skip(1);
    }

    // ================= read() : boundary / IndexOutOfBounds / len==0 ==================

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_negativeOffset_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.read(new byte[5], -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_negativeLen_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.read(new byte[5], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_offGreaterThanLenBoundary_throws() throws IOException {
        // b.length=5, off=3, len=3 -> off > b.length-len (3>2) => true
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.read(new byte[5], 3, 3);
    }

    @Test
    public void read_offEqualsBoundary_notThrown_returnsMinus1() throws IOException {
        // b.length=5, off=2, len=3 -> off > b.length-len (2>2) เป็น false (boundary ผ่าน)
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        int r = in.read(new byte[5], 2, 3); // entry==null -> -1
        assertEquals(-1, r);
    }

    @Test
    public void read_lenZero_returnsZero() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.read(new byte[5], 0, 0));
    }

    @Test
    public void read_entryNull_returnsMinus1() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[5], 0, 5));
    }

    // ================= getNextCPIOEntry() : magic detection ==================

    @Test(expected = EOFException.class)
    public void getNextEntry_emptyStream_eof() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.getNextEntry();
    }

    @Test
    public void getNextEntry_unknownMagic_throwsIOException() throws IOException {
        byte[] bad = ascii("ABCDEF");
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(bad));
        try {
            in.getNextEntry();
            fail("ควร throw IOException สำหรับ magic ที่ไม่รู้จัก");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown magic"));
        }
    }

    @Test(expected = EOFException.class)
    public void getNextEntry_oldBinaryMagicNonSwapped_branchTaken_thenEOF() throws IOException {
        // magic ตรง (ไม่ swap) ตามคอมเมนต์ matches(): 0x71,0xC7
        byte[] magicOnly = new byte[]{0x71, (byte) 0xC7};
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(magicOnly));
        in.getNextEntry(); // เข้าสู่ readOldBinaryEntry(false) แล้วขาดข้อมูล -> EOFException
    }

    @Test(expected = EOFException.class)
    public void getNextEntry_oldBinaryMagicSwapped_branchTaken_thenEOF() throws IOException {
        byte[] magicOnly = new byte[]{(byte) 0xC7, 0x71};
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(magicOnly));
        in.getNextEntry(); // เข้าสู่ readOldBinaryEntry(true) แล้วขาดข้อมูล -> EOFException
    }

    @Test
    public void getNextEntry_oldAscii_trailer_returnsNull() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(trailerOldAscii()));
        assertNull(in.getNextEntry());
    }

    @Test
    public void getNextEntry_oldAscii_mode0_nonTrailer_throws() throws IOException {
        byte[] data = buildOldAsciiEntry(0, "foo.txt", new byte[0]);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));
        try {
            in.getNextEntry();
            fail("mode 0 ที่ไม่ใช่ trailer ต้อง throw IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Mode 0 only allowed in the trailer"));
        }
    }

    @Test
    public void getNextEntry_oldAscii_validEntry_readContent() throws IOException {
        byte[] content = ascii("Hi");
        byte[] data = concat(buildOldAsciiEntry(0100644, "one", content), trailerOldAscii());
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        CpioArchiveEntry e = (CpioArchiveEntry) in.getNextEntry();
        assertNotNull(e);
        assertEquals("one", e.getName());
        assertEquals(2, e.getSize());

        byte[] buf = new byte[10];
        int read = in.read(buf, 0, buf.length);
        assertEquals(2, read);
        assertEquals("Hi", new String(buf, 0, read, "US-ASCII"));

        // อ่านซ้ำเมื่อถึง EOF ของ entry -> -1 (format ไม่ใช่ NEW_CRC จึงไม่มีการเช็ค crc)
        assertEquals(-1, in.read(buf, 0, buf.length));

        // เรียก getNextEntry() ครั้งที่ 2 -> closeEntry() แล้วอ่าน trailer -> null
        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void getNextEntry_new_mode0_nonTrailer_throws() throws IOException {
        byte[] data = buildNewEntry(CpioConstants.MAGIC_NEW, 0, "B", new byte[0], 0);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));
        try {
            in.getNextEntry();
            fail("mode 0 ที่ไม่ใช่ trailer (NEW format) ต้อง throw IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Mode 0 only allowed in the trailer"));
        }
    }

    @Test
    public void getNextEntry_new_validEntry_noCrcCheck() throws IOException {
        byte[] content = ascii("DATA"); // length=4 -> ASSUMPTION: dataPadCount=0
        byte[] data = buildNewEntry(CpioConstants.MAGIC_NEW, 0100644, "C", content, 0);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        CpioArchiveEntry e = (CpioArchiveEntry) in.getNextEntry();
        assertNotNull(e);
        assertEquals("C", e.getName());
        assertEquals(4, e.getSize());

        byte[] buf = new byte[10];
        int read = in.read(buf, 0, buf.length);
        assertEquals(4, read);
        assertEquals("DATA", new String(buf, 0, read, "US-ASCII"));
        assertEquals(-1, in.read(buf, 0, buf.length)); // FORMAT_NEW ไม่ตรวจ crc
        in.close();
    }

    @Test
    public void getNextEntry_newCrc_correctChecksum_ok() throws IOException {
        byte[] content = ascii("DATA");
        long sum = 'D' + 'A' + 'T' + 'A'; // 282
        byte[] data = buildNewEntry(CpioConstants.MAGIC_NEW_CRC, 0100644, "D", content, sum);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        CpioArchiveEntry e = (CpioArchiveEntry) in.getNextEntry();
        assertNotNull(e);

        byte[] buf = new byte[10];
        int read = in.read(buf, 0, buf.length);
        assertEquals(4, read);
        assertEquals(-1, in.read(buf, 0, buf.length)); // crc ตรง -> ไม่ throw
        in.close();
    }

    @Test
    public void getNextEntry_newCrc_wrongChecksum_throws() throws IOException {
        byte[] content = ascii("DATA");
        long wrongSum = 999;
        byte[] data = buildNewEntry(CpioConstants.MAGIC_NEW_CRC, 0100644, "E", content, wrongSum);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        in.getNextEntry();
        byte[] buf = new byte[10];
        in.read(buf, 0, buf.length); // อ่านครบ size แล้ว
        try {
            in.read(buf, 0, buf.length); // trigger crc check ตอนถึง EOF ของ entry
            fail("checksum ไม่ตรงต้อง throw IOException");
        } catch (IOException ex) {
            assertTrue(ex.getMessage().contains("CRC Error"));
        }
    }

    // ================= skip() ==================

    @Test(expected = IllegalArgumentException.class)
    public void skip_negative_throws() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.skip(-1);
    }

    @Test
    public void skip_zero_returnsZero_loopNotEntered() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.skip(0));
    }

    @Test
    public void skip_noEntry_readReturnsMinus1_breakBranch() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // entry==null -> read()=-1 -> entryEOF=true, break -> total=0
        assertEquals(0, in.skip(10));
    }

    @Test
    public void skip_largeData_loopsOverTmpBufBoundary() throws IOException {
        // ASSUMPTION: OLD_ASCII ไม่มี data padding -> ใช้ size ที่ไม่จำเป็นต้องเป็น multiple of 4
        byte[] content = new byte[5000];
        for (int i = 0; i < content.length; i++) content[i] = (byte) ('A' + (i % 26));
        byte[] data = buildOldAsciiEntry(0100644, "big", content);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        assertNotNull(in.getNextEntry());
        // 5000 > tmpbuf.length(4096) -> loop วนอย่างน้อย 2 รอบ (len>tmpbuf.length แล้วค่อย <=)
        long skipped = in.skip(5000);
        assertEquals(5000L, skipped);
        in.close();
    }

    // ================= skipRemainderOfLastBlock() branches ==================

    @Test
    public void trailer_blockBoundaryExact_loopNotEntered() throws IOException {
        // ตามการนับ getBytesRead() ในซอร์ส (readCString ไม่ count byte NUL ตัวสุดท้าย)
        // trailer entry ทำให้ getBytesRead()=86 พอดี -> ใช้ blockSize=86 ให้ remainder=0
        CpioArchiveInputStream in = new CpioArchiveInputStream(
                new ByteArrayInputStream(trailerOldAscii()), 86);
        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void trailer_blockBoundaryNonZero_loopEnteredThenBreak() throws IOException {
        // blockSize เริ่มต้น (512) ทำให้ remainder != 0 -> loop เข้า 1 รอบแล้ว break
        // (เพราะ entryEOF ถูก set true ก่อนเรียก skipRemainderOfLastBlock เสมอ
        //  ทำให้ read() ภายใน skip() คืน -1 ทันที)
        CpioArchiveInputStream in = new CpioArchiveInputStream(
                new ByteArrayInputStream(trailerOldAscii()));
        assertNull(in.getNextEntry());
        in.close();
    }

    // ================= getNextEntry() delegation / multi-entry / closeEntry() ==================

    @Test
    public void getNextEntry_multipleEntries_closeEntryInvoked() throws IOException {
        byte[] first = buildOldAsciiEntry(0100644, "one", ascii("AB")); // ยังไม่อ่าน data
        byte[] data = concat(first, trailerOldAscii());
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));

        CpioArchiveEntry e1 = (CpioArchiveEntry) in.getNextEntry();
        assertEquals("one", e1.getName());

        // ไม่อ่าน data ของ e1 เลย -> getNextEntry() ครั้งถัดไปต้องเรียก closeEntry()
        // เพื่อ skip data ที่เหลือของ e1 ก่อนอ่าน trailer
        assertNull(in.getNextEntry());
        in.close();
    }
}
