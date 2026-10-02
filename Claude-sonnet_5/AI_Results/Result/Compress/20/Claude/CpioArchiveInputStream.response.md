# CpioArchiveInputStreamTest.java

หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4 - ไม่เดา behavior ที่ไม่มีในซอร์ส):

- คลาส `CpioArchiveEntry`, `CpioUtil`, `CpioConstants` และ `ArchiveUtils` ไม่ได้แสดงซอร์สมาให้ แต่เป็น dependency ที่มีอยู่จริงในไลบรารี (compiled) จึงอ้างอิง **ค่าคงที่** (`CpioConstants.MAGIC_NEW`, `MAGIC_NEW_CRC`, `MAGIC_OLD_ASCII`, `CPIO_TRAILER`, `MAGIC_OLD_BINARY`) ตรงจากซอร์สจริงแทนการเดาค่า string/เลขเอง
- สำหรับ old-binary format แบบ **swapHalfWord=true** (byte-swap) ไม่มีซอร์สของ `CpioUtil.byteArray2long` ให้ตรวจสอบ algorithm ที่แน่ชัด จึง **ไม่สร้าง** unit test ที่ประกอบ payload เต็มรูปแบบสำหรับสาขานี้ (เพื่อไม่เดา behavior) แต่ยังคง cover เงื่อนไขนี้ผ่าน `matches()` ซึ่งเป็น static method ที่ไม่พึ่ง `CpioUtil`
- สมมติฐาน padding ของ format ใหม่ (align 4 byte) และ old-binary (align 2 byte) และ old-ascii (ไม่มี padding) เป็นไปตามสเปก cpio มาตรฐานที่ implementation นี้อ้างอิงในคอมเมนต์ (jRPM / cpio 2.5) — คอมเมนต์กำกับไว้ในโค้ด
- มี 1 เทส (`testSkipRemainderOfLastBlock_AllowsReadingConcatenatedArchive`) ที่ตั้งใจตรวจสอบ **contract ที่ถูกต้อง** ของ `skipRemainderOfLastBlock()` (สามารถอ่าน archive ที่ซ้อนต่อกันได้) ซึ่งจากการไล่ logic พบว่า `entryEOF` ถูกตั้งเป็น `true` **ก่อน** เรียก `skipRemainderOfLastBlock()` ทำให้ `skip()`->`read()` คืน -1 ทันที และไม่ได้ข้าม padding จริง — เทสนี้จึงมีโอกาสสูงที่จะ **fail** และช่วยดักจับ fault นี้ได้จริงตามข้อกำหนดที่ 3

```java
package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CpioArchiveInputStreamTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ---------------------------------------------------------------
    // Helper builders
    // ---------------------------------------------------------------

    private static byte[] concat(byte[]... parts) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (byte[] p : parts) {
            if (p != null) {
                out.write(p);
            }
        }
        return out.toByteArray();
    }

    private static void appendHex8(StringBuilder sb, long v) {
        String s = Long.toHexString(v);
        for (int i = s.length(); i < 8; i++) {
            sb.append('0');
        }
        sb.append(s);
    }

    private static void appendOct(StringBuilder sb, long v, int width) {
        String s = Long.toOctalString(v);
        for (int i = s.length(); i < width; i++) {
            sb.append('0');
        }
        sb.append(s);
    }

    /** New / New-CRC format entry builder (assumes 4-byte alignment per cpio "newc" spec). */
    private static byte[] newEntry(boolean crc, String name, long mode, byte[] data,
                                    long checksum) throws IOException {
        String magic = crc ? CpioConstants.MAGIC_NEW_CRC : CpioConstants.MAGIC_NEW;
        long filesize = data == null ? 0 : data.length;
        long namesize = name.length() + 1;

        StringBuilder sb = new StringBuilder();
        sb.append(magic);
        appendHex8(sb, 0);        // ino
        appendHex8(sb, mode);     // mode
        appendHex8(sb, 0);        // uid
        appendHex8(sb, 0);        // gid
        appendHex8(sb, 1);        // nlink
        appendHex8(sb, 0);        // mtime
        appendHex8(sb, filesize); // filesize
        appendHex8(sb, 0);        // devmaj
        appendHex8(sb, 0);        // devmin
        appendHex8(sb, 0);        // rdevmaj
        appendHex8(sb, 0);        // rdevmin
        appendHex8(sb, namesize); // namesize
        appendHex8(sb, checksum); // checksum

        byte[] header = sb.toString().getBytes(StandardCharsets.US_ASCII);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(header);
        out.write(name.getBytes(StandardCharsets.US_ASCII));
        out.write(0);
        int total = header.length + (int) namesize;
        int pad1 = (4 - (total % 4)) % 4;
        for (int i = 0; i < pad1; i++) {
            out.write(0);
        }
        if (data != null) {
            out.write(data);
            int pad2 = (4 - (data.length % 4)) % 4;
            for (int i = 0; i < pad2; i++) {
                out.write(0);
            }
        }
        return out.toByteArray();
    }

    private static byte[] newTrailer(boolean crc) throws IOException {
        return newEntry(crc, CpioConstants.CPIO_TRAILER, 0, null, 0);
    }

    /** Old ASCII ("odc") format entry builder - assumed NO padding at all. */
    private static byte[] oldAsciiEntry(String name, long mode, byte[] data) throws IOException {
        long filesize = data == null ? 0 : data.length;
        long namesize = name.length() + 1;

        StringBuilder sb = new StringBuilder();
        sb.append(CpioConstants.MAGIC_OLD_ASCII);
        appendOct(sb, 0, 6);        // device
        appendOct(sb, 0, 6);        // inode
        appendOct(sb, mode, 6);     // mode
        appendOct(sb, 0, 6);        // uid
        appendOct(sb, 0, 6);        // gid
        appendOct(sb, 1, 6);        // nlink
        appendOct(sb, 0, 6);        // rdev
        appendOct(sb, 0, 11);       // mtime
        appendOct(sb, namesize, 6); // namesize
        appendOct(sb, filesize, 11);// filesize

        byte[] header = sb.toString().getBytes(StandardCharsets.US_ASCII);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(header);
        out.write(name.getBytes(StandardCharsets.US_ASCII));
        out.write(0);
        if (data != null) {
            out.write(data);
        }
        return out.toByteArray();
    }

    private static byte[] oldAsciiTrailer() throws IOException {
        return oldAsciiEntry(CpioConstants.CPIO_TRAILER, 0, null);
    }

    /** Old binary format entry builder - swapHalfWord = false only (see class-level notes). */
    private static void write2BE(ByteArrayOutputStream out, long v) {
        out.write((int) ((v >> 8) & 0xFF));
        out.write((int) (v & 0xFF));
    }

    private static void write4BE(ByteArrayOutputStream out, long v) {
        out.write((int) ((v >> 24) & 0xFF));
        out.write((int) ((v >> 16) & 0xFF));
        out.write((int) ((v >> 8) & 0xFF));
        out.write((int) (v & 0xFF));
    }

    private static byte[] oldBinaryEntry(String name, long mode, byte[] data) throws IOException {
        long filesize = data == null ? 0 : data.length;
        long namesize = name.length() + 1;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long magic = CpioConstants.MAGIC_OLD_BINARY; // real constant from source, not guessed
        write2BE(out, magic);   // magic, normal (non-swapped) order
        write2BE(out, 0);       // device
        write2BE(out, 0);       // inode
        write2BE(out, mode);    // mode
        write2BE(out, 0);       // uid
        write2BE(out, 0);       // gid
        write2BE(out, 1);       // nlink
        write2BE(out, 0);       // rdev
        write4BE(out, 0);       // mtime
        write2BE(out, namesize);// namesize
        write4BE(out, filesize);// filesize
        out.write(name.getBytes(StandardCharsets.US_ASCII));
        out.write(0);

        int total = 26 + (int) namesize; // magic(2) + 24-byte header + namesize
        int pad1 = total % 2;
        for (int i = 0; i < pad1; i++) {
            out.write(0);
        }
        if (data != null) {
            out.write(data);
            int pad2 = data.length % 2;
            for (int i = 0; i < pad2; i++) {
                out.write(0);
            }
        }
        return out.toByteArray();
    }

    private static byte[] oldBinaryTrailer() throws IOException {
        return oldBinaryEntry(CpioConstants.CPIO_TRAILER, 0, null);
    }

    private static long sumBytes(byte[] data) {
        long c = 0;
        for (byte b : data) {
            c += b & 0xFF;
        }
        return c;
    }

    private static byte[] readAll(CpioArchiveInputStream in, int expectedLen) throws IOException {
        byte[] buf = new byte[expectedLen];
        int off = 0;
        int r;
        while (off < expectedLen && (r = in.read(buf, off, expectedLen - off)) != -1) {
            off += r;
        }
        return buf;
    }

    // ---------------------------------------------------------------
    // Constructors / close / available / ensureOpen
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_DefaultBlockSize_AvailableInitially1() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void testConstructor_CustomBlockSize() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), 16);
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void testClose_IsIdempotent_AndBlocksFurtherReads() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close(); // ต้องไม่ throw ครั้งที่สอง (closed flag already true)

        thrown.expect(IOException.class);
        in.available(); // ensureOpen -> throw
    }

    @Test
    public void testAvailable_AfterClose_Throws() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        thrown.expect(IOException.class);
        thrown.expectMessage("Stream closed");
        in.available();
    }

    // ---------------------------------------------------------------
    // getNextEntry() / getNextCPIOEntry() - format detection branches
    // ---------------------------------------------------------------

    @Test
    public void testGetNextEntry_NewFormat_FullRoundTrip() throws Exception {
        byte[] data = "Hello".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(
            newEntry(false, "test.txt", 33188, data, 0),
            newTrailer(false));

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        CpioArchiveEntry e = in.getNextEntry();
        assertNotNull(e);
        assertEquals("test.txt", e.getName());
        assertEquals(5L, e.getSize());

        byte[] read = readAll(in, 5);
        assertArrayEquals(data, read);
        assertEquals(-1, in.read(new byte[10], 0, 10)); // entryEOF branch
        assertEquals(0, in.available());

        assertNull(in.getNextEntry()); // trailer -> null
        in.close();
    }

    @Test
    public void testGetNextEntry_NewFormat_ModeZeroNonTrailer_Throws() throws Exception {
        byte[] stream = newEntry(false, "bad.txt", 0, null, 0);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        thrown.expect(IOException.class);
        thrown.expectMessage("Mode 0 only allowed in the trailer");
        in.getNextEntry();
    }

    @Test
    public void testGetNextEntry_NewCrcFormat_CorrectCrc_RoundTrip() throws Exception {
        byte[] data = "abcdef".getBytes(StandardCharsets.US_ASCII);
        long crc = sumBytes(data);
        byte[] stream = concat(
            newEntry(true, "crcfile.bin", 33188, data, crc),
            newTrailer(true));

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        CpioArchiveEntry e = in.getNextEntry();
        assertEquals("crcfile.bin", e.getName());

        byte[] read = readAll(in, data.length);
        assertArrayEquals(data, read);
        // อ่านต่อจน EOF จริง -> ต้อง trigger การเทียบ crc โดยไม่ throw เพราะ crc ถูกต้อง
        assertEquals(-1, in.read(new byte[1], 0, 1));
        in.close();
    }

    @Test
    public void testGetNextEntry_NewCrcFormat_WrongCrc_Throws() throws Exception {
        byte[] data = "abcdef".getBytes(StandardCharsets.US_ASCII);
        long wrongCrc = sumBytes(data) + 1;
        byte[] stream = concat(
            newEntry(true, "crcfile.bin", 33188, data, wrongCrc),
            newTrailer(true));

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        in.getNextEntry();
        readAll(in, data.length);

        thrown.expect(IOException.class);
        thrown.expectMessage("CRC Error");
        in.read(new byte[1], 0, 1); // triggers EOF check -> crc mismatch
    }

    @Test
    public void testGetNextEntry_OldAsciiFormat_RoundTrip() throws Exception {
        byte[] data = "OldAscii".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(
            oldAsciiEntry("oldascii.txt", 493, data),
            oldAsciiTrailer());

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        CpioArchiveEntry e = in.getNextEntry();
        assertEquals("oldascii.txt", e.getName());
        assertEquals(data.length, e.getSize());

        byte[] read = readAll(in, data.length);
        assertArrayEquals(data, read);

        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testGetNextEntry_OldAsciiFormat_ModeZeroNonTrailer_Throws() throws Exception {
        byte[] stream = oldAsciiEntry("bad.txt", 0, null);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        thrown.expect(IOException.class);
        thrown.expectMessage("Mode 0 only allowed in the trailer");
        in.getNextEntry();
    }

    @Test
    public void testGetNextEntry_OldBinaryFormat_NonSwapped_RoundTrip() throws Exception {
        byte[] data = "Bin".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(
            oldBinaryEntry("bin.dat", 33188, data),
            oldBinaryTrailer());

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        CpioArchiveEntry e = in.getNextEntry();
        assertEquals("bin.dat", e.getName());
        assertEquals(data.length, e.getSize());

        byte[] read = readAll(in, data.length);
        assertArrayEquals(data, read);

        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testGetNextEntry_UnknownMagic_Throws() throws Exception {
        byte[] stream = "ABCDEF".getBytes(StandardCharsets.US_ASCII);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        thrown.expect(IOException.class);
        thrown.expectMessage("Unknown magic");
        in.getNextEntry();
    }

    @Test
    public void testGetNextEntry_CalledTwice_TriggersCloseEntrySkip() throws Exception {
        byte[] data1 = "UNREAD-DATA".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(
            newEntry(false, "first.txt", 33188, data1, 0),
            newEntry(false, "second.txt", 33188, null, 0),
            newTrailer(false));

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        CpioArchiveEntry e1 = in.getNextEntry();
        assertEquals("first.txt", e1.getName());
        // ไม่อ่าน data1 เลย -> เรียก getNextEntry() อีกครั้งต้อง closeEntry() ให้ถูกต้อง
        CpioArchiveEntry e2 = in.getNextEntry();
        assertNotNull(e2);
        assertEquals("second.txt", e2.getName());
        in.close();
    }

    @Test
    public void testGetNextEntry_Delegation() throws Exception {
        byte[] stream = newTrailer(false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        assertNull(in.getNextEntry()); // trailer -> null ผ่าน getNextCPIOEntry()
        in.close();
    }

    // ---------------------------------------------------------------
    // read(byte[], int, int)
    // ---------------------------------------------------------------

    @Test
    public void testRead_NegativeOffset_Throws() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        thrown.expect(IndexOutOfBoundsException.class);
        in.read(new byte[5], -1, 2);
    }

    @Test
    public void testRead_NegativeLength_Throws() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        thrown.expect(IndexOutOfBoundsException.class);
        in.read(new byte[5], 0, -1);
    }

    @Test
    public void testRead_OffsetPlusLengthExceedsBuffer_Throws() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        thrown.expect(IndexOutOfBoundsException.class);
        in.read(new byte[5], 4, 2);
    }

    @Test
    public void testRead_ZeroLength_ReturnsZero_EvenWithoutEntry() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.read(new byte[5], 0, 0)); // len==0 branch, entry ยัง null ก็ไม่เป็นไร
        in.close();
    }

    @Test
    public void testRead_NoCurrentEntry_ReturnsMinusOne() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[5], 0, 5)); // entry == null branch
        in.close();
    }

    @Test
    public void testRead_AfterEntryFullyRead_ReturnsMinusOne_AndAvailableZero() throws Exception {
        byte[] data = "X".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(newEntry(false, "f.txt", 33188, data, 0), newTrailer(false));
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        in.getNextEntry();
        readAll(in, data.length);
        assertEquals(-1, in.read(new byte[5], 0, 5));
        assertEquals(0, in.available());
        in.close();
    }

    // ---------------------------------------------------------------
    // skip(long)
    // ---------------------------------------------------------------

    @Test
    public void testSkip_NegativeLength_Throws() throws Exception {
        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        thrown.expect(IllegalArgumentException.class);
        in.skip(-1);
    }

    @Test
    public void testSkip_WithinEntryData() throws Exception {
        byte[] data = "0123456789".getBytes(StandardCharsets.US_ASCII);
        byte[] stream = concat(newEntry(false, "s.txt", 33188, data, 0), newTrailer(false));
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        in.getNextEntry();

        long skipped = in.skip(4);
        assertEquals(4, skipped);
        byte[] rest = readAll(in, 6);
        assertArrayEquals("456789".getBytes(StandardCharsets.US_ASCII), rest);
        in.close();
    }

    @Test
    public void testSkip_LargerThanTmpBuf_LoopsMultipleTimes() throws Exception {
        byte[] data = new byte[5000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        byte[] stream = concat(newEntry(false, "big.bin", 33188, data, 0), newTrailer(false));
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        in.getNextEntry();

        long skipped = in.skip(5000); // > tmpbuf.length(4096) -> loop หลายรอบ
        assertEquals(5000, skipped);
        assertEquals(-1, in.read(new byte[1], 0, 1));
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void testSkip_BeyondEntrySize_SetsEntryEOF() throws Exception {
        byte[] data = "1234567890".getBytes(StandardCharsets.US_ASCII); // 10 bytes
        byte[] stream = concat(newEntry(false, "s2.txt", 33188, data, 0), newTrailer(false));
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(stream));
        in.getNextEntry();

        long skipped = in.skip(100); // ขอเกินขนาดจริง
        assertEquals(10, skipped);
        assertEquals(0, in.available()); // entryEOF ต้องเป็น true
        in.close();
    }

    // ---------------------------------------------------------------
    // skipRemainderOfLastBlock() - fault-sensitive test
    // ---------------------------------------------------------------

    /**
     * เทสนี้ตรวจสอบว่าหลังจากอ่าน TRAILER ของ archive แรก stream จะถูกเลื่อนตำแหน่งให้ตรงกับ
     * ขอบ block (blockSize) เพื่อให้สามารถอ่าน archive ที่ต่อกันมาถัดไปได้ถูกต้อง
     * ตาม logic ใน skipRemainderOfLastBlock().
     *
     * หมายเหตุ: จากการไล่ source พบว่า entryEOF ถูกตั้งเป็น true ก่อนเรียก
     * skipRemainderOfLastBlock() ทำให้ skip()->read() คืนค่า -1 ทันที และไม่ได้
     * ข้าม padding จริง ๆ  เทสนี้จึงมีโอกาส "fail" กับ source ที่มี fault นี้อยู่
     * ซึ่งเป็นจุดประสงค์ตามข้อกำหนดที่ 3 (ดักจับ fault ได้จริง)
     */
    @Test
    public void testSkipRemainderOfLastBlock_AllowsReadingConcatenatedArchive() throws Exception {
        int blockSize = 16;

        byte[] firstArchive = newTrailer(false); // เฉพาะ trailer entry เดียว
        int trailerLen = firstArchive.length;
        int remainder = trailerLen % blockSize;
        int padLen = remainder == 0 ? 0 : blockSize - remainder;
        byte[] pad = new byte[padLen];

        byte[] secondArchive = concat(
            newEntry(false, "second-archive.txt", 33188, null, 0),
            newTrailer(false));

        byte[] full = concat(firstArchive, pad, secondArchive);

        CpioArchiveInputStream in =
            new CpioArchiveInputStream(new ByteArrayInputStream(full), blockSize);

        assertNull(in.getNextEntry()); // trailer ของ archive แรก

        CpioArchiveEntry e2 = in.getNextEntry(); // ต้องข้าม padding แล้วอ่าน archive ที่สองได้
        assertNotNull("คาดว่าจะสามารถอ่าน archive ที่สองได้ถ้า padding ถูกข้ามอย่างถูกต้อง", e2);
        assertEquals("second-archive.txt", e2.getName());
        in.close();
    }

    // ---------------------------------------------------------------
    // matches(byte[], int) - static method
    // ---------------------------------------------------------------

    @Test
    public void testMatches_LengthLessThan6_False() {
        byte[] sig = {0x30, 0x37, 0x30, 0x37, 0x30};
        assertFalse(CpioArchiveInputStream.matches(sig, 5));
        assertFalse(CpioArchiveInputStream.matches(sig, 0));
    }

    @Test
    public void testMatches_BinaryNormalOrder_True() {
        byte[] sig = {0x71, (byte) 0xC7, 0, 0, 0, 0};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatches_BinarySwappedOrder_True() {
        byte[] sig = {(byte) 0xC7, 0x71, 0, 0, 0, 0};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatches_AsciiValidLastBytes_True() {
        byte[] lastBytes = {0x31, 0x32, 0x37};
        for (byte lb : lastBytes) {
            byte[] sig = {0x30, 0x37, 0x30, 0x37, 0x30, lb};
            assertTrue("last byte=" + lb, CpioArchiveInputStream.matches(sig, 6));
        }
    }

    @Test
    public void testMatches_AsciiInvalidLastByte_False() {
        byte[] sig = {0x30, 0x37, 0x30, 0x37, 0x30, 0x33}; // 0x33 ไม่ตรงเงื่อนไขใด
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatches_AsciiWrongPrefix_False() {
        // ตรวจแต่ละตำแหน่ง (index 0..4) ที่ทำให้ล้มเหลว
        byte[] base = {0x30, 0x37, 0x30, 0x37, 0x30, 0x31};

        byte[] wrong0 = base.clone(); wrong0[0] = 0x31;
        assertFalse(CpioArchiveInputStream.matches(wrong0, 6));

        byte[] wrong1 = base.clone(); wrong1[1] = 0x31;
        assertFalse(CpioArchiveInputStream.matches(wrong1, 6));

        byte[] wrong2 = base.clone(); wrong2[2] = 0x31;
        assertFalse(CpioArchiveInputStream.matches(wrong2, 6));

        byte[] wrong3 = base.clone(); wrong3[3] = 0x31;
        assertFalse(CpioArchiveInputStream.matches(wrong3, 6));

        byte[] wrong4 = base.clone(); wrong4[4] = 0x31;
        assertFalse(CpioArchiveInputStream.matches(wrong4, 6));
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_DefaultBlockSize_AvailableInitially1 | Constructor (1-arg), available() เมื่อ entryEOF=false |
| testConstructor_CustomBlockSize | Constructor (2-arg blockSize) |
| testClose_IsIdempotent_AndBlocksFurtherReads | close() เมื่อ closed=false/true, ensureOpen() throw |
| testAvailable_AfterClose_Throws | ensureOpen() throw ผ่าน available() |
| testGetNextEntry_NewFormat_FullRoundTrip | branch MAGIC_NEW, entryEOF true หลัง read, trailer→null, available()=0/1 |
| testGetNextEntry_NewFormat_ModeZeroNonTrailer_Throws | mode==0 && name!=TRAILER → throw (new format) |
| testGetNextEntry_NewCrcFormat_CorrectCrc_RoundTrip | branch MAGIC_NEW_CRC, FORMAT_NEW_CRC crc accumulate, crc match (ไม่ throw) |
| testGetNextEntry_NewCrcFormat_WrongCrc_Throws | crc mismatch → throw IOException "CRC Error" |
| testGetNextEntry_OldAsciiFormat_RoundTrip | branch MAGIC_OLD_ASCII, readAsciiLong radix8 |
| testGetNextEntry_OldAsciiFormat_ModeZeroNonTrailer_Throws | mode==0 non-trailer throw (old ascii) |
| testGetNextEntry_OldBinaryFormat_NonSwapped_RoundTrip | branch MAGIC_OLD_BINARY (swapHalfWord=false) |
| testGetNextEntry_UnknownMagic_Throws | else branch: throw "Unknown magic" |
| testGetNextEntry_CalledTwice_TriggersCloseEntrySkip | entry!=null → closeEntry() while-loop |
| testGetNextEntry_Delegation | getNextEntry() delegate ไป getNextCPIOEntry() |
| testRead_NegativeOffset_Throws | off<0 → IndexOutOfBoundsException |
| testRead_NegativeLength_Throws | len<0 → IndexOutOfBoundsException |
| testRead_OffsetPlusLengthExceedsBuffer_Throws | off > b.length-len → IndexOutOfBoundsException |
| testRead_ZeroLength_ReturnsZero_EvenWithoutEntry | len==0 → return 0 (ก่อนเช็ค entry null) |
| testRead_NoCurrentEntry_ReturnsMinusOne | entry==null → return -1 |
| testRead_AfterEntryFullyRead_ReturnsMinusOne_AndAvailableZero | entryEOF==true → return -1, available()=0 |
| testSkip_NegativeLength_Throws | n<0 → IllegalArgumentException |
| testSkip_WithinEntryData | skip() ปกติ (len<=tmpbuf.length) |
| testSkip_LargerThanTmpBuf_LoopsMultipleTimes | len>tmpbuf.length → clip, loop หลายรอบ |
| testSkip_BeyondEntrySize_SetsEntryEOF | read()==-1 ภายใน skip() → entryEOF=true, break |
| testSkipRemainderOfLastBlock_AllowsReadingConcatenatedArchive | skipRemainderOfLastBlock(): readFromLastBlock!=0 branch, ทดสอบ fault ที่อาจเกิด |
| testMatches_LengthLessThan6_False | length<6 → false |
| testMatches_BinaryNormalOrder_True | signature[0]==0x71 && signature[1]==0xc7 → true |
| testMatches_BinarySwappedOrder_True | signature[1]==0x71 && signature[0]==0xc7 → true |
| testMatches_AsciiValidLastBytes_True | last byte 0x31/0x32/0x37 → true (loop 3 กรณี) |
| testMatches_AsciiInvalidLastByte_False | last byte อื่น → false |
| testMatches_AsciiWrongPrefix_False | signature[0..4] ผิดแต่ละตำแหน่ง → false (5 กรณี) |