package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link TarArchiveOutputStream}
 * (Defects4J Compress-18b).
 *
 * หมายเหตุ: คลาส TarArchiveEntry / TarBuffer ไม่ได้ให้ source มาด้วย
 * จึงอ้างอิงตาม public API ที่ปรากฏการเรียกใช้งานจริงในซอร์สของ
 * TarArchiveOutputStream เท่านั้น (เช่น setSize/getSize/isDirectory/
 * getUserId/getGroupId/getDevMajor/getDevMinor/getModTime/getName
 * และ TarConstants.NAMELEN/MAXSIZE/MAXID/DEFAULT_RCDSIZE)
 * จุดใดที่ต้องสมมติ behavior ของ TarArchiveEntry ที่ไม่ปรากฏในซอร์ส
 * ที่ให้มา จะมีคอมเมนต์กำกับไว้ชัดเจน
 */
public class TarArchiveOutputStreamTest {

    private TarArchiveOutputStream newTos(ByteArrayOutputStream bos) {
        return new TarArchiveOutputStream(bos);
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructorDefault_getRecordSize() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testConstructorWithEncoding_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, "UTF-8");
        assertNotNull(tos);
    }

    @Test
    public void testConstructorWithBlockAndRecordSize_getRecordSize() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 1024, 256);
        assertEquals(256, tos.getRecordSize());
    }

    // ---------------------------------------------------------------
    // putArchiveEntry / closeArchiveEntry - basic & error branches
    // ---------------------------------------------------------------

    @Test
    public void testPutAndCloseSimpleEntry_directoryForcesZeroSize() throws IOException {
        // สมมติ (ตาม convention มาตรฐานของ Tar) ว่าชื่อลงท้ายด้วย '/'
        // ทำให้ isDirectory() คืนค่า true - ไม่มีใน source ที่ให้มา
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry dir = new TarArchiveEntry("mydir/");
        dir.setSize(12345); // ค่านี้ควรถูกมองข้ามเพราะเป็น directory
        tos.putArchiveEntry(dir);
        // ไม่ write อะไรเลย เพราะ currSize ต้องถูกบังคับเป็น 0
        tos.closeArchiveEntry(); // ต้องไม่ throw เพราะ currBytes(0) >= currSize(0)
        tos.close();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.finish();
        tos.putArchiveEntry(new TarArchiveEntry("a.txt"));
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.finish();
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_withoutOpenEntry_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_notEnoughBytesWritten_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        // เขียนไม่ครบ 10 bytes
        tos.write(new byte[5], 0, 5);
        tos.closeArchiveEntry();
    }

    // ---------------------------------------------------------------
    // write() - boundary / assembly branches
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write(new byte[10], 0, 10); // 10 > 5 -> IOException
    }

    @Test
    public void testWrite_mixedAssemblyBranches_thenPaddingClose() throws IOException {
        int rs = TarBuffer.DEFAULT_RCDSIZE;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");

        int w1 = 100;          // < rs -> while-loop "fill assemble buffer" branch
        int w2 = 50;           // assemLen(100)+50 < rs -> assemLen>0 "append" (else) branch
        int w3 = rs - 100;     // assemLen(150)+w3 >= rs -> assemLen>0 "merge & flush" branch,
                                // then remainder goes back into while-loop fill branch
        int total = w1 + w2 + w3;
        entry.setSize(total);
        tos.putArchiveEntry(entry);

        tos.write(new byte[w1], 0, w1);
        tos.write(new byte[w2], 0, w2);
        tos.write(new byte[w3], 0, w3);

        // ปิด entry ขณะ assemLen > 0 -> เข้า branch เติม 0 แล้ว writeRecord (padding branch)
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWrite_directFullRecordWithoutPriorAssembly_thenPaddingClose() throws IOException {
        int rs = TarBuffer.DEFAULT_RCDSIZE;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("b.txt");

        int size = rs + 50; // เขียนครั้งเดียว >= rs โดยที่ assemLen เดิม = 0
        entry.setSize(size);
        tos.putArchiveEntry(entry);

        tos.write(new byte[size], 0, size);
        // -> main while-loop เขียน record เต็มโดยตรง (ไม่มี assembly ก่อนหน้า)
        // -> ส่วนที่เหลือ (50 bytes) ถูกเก็บใน assemBuf (fill branch)
        tos.closeArchiveEntry(); // assemLen=50>0 -> padding branch
        tos.close();
    }

    @Test
    public void testWrite_exactRecordMultiple_noPaddingOnClose() throws IOException {
        int rs = TarBuffer.DEFAULT_RCDSIZE;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("c.txt");
        entry.setSize(rs);
        tos.putArchiveEntry(entry);

        tos.write(new byte[rs], 0, rs); // เขียนพอดี 1 record เต็ม, assemLen จบที่ 0
        tos.closeArchiveEntry(); // assemLen==0 -> skip padding-if branch
        tos.close();
    }

    // ---------------------------------------------------------------
    // finish() / close()
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testFinish_calledTwice_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.finish();
        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        tos.putArchiveEntry(entry); // เปิด entry แต่ยังไม่ close
        tos.finish();
    }

    @Test
    public void testClose_callsFinishIfNotFinished_andIsIdempotent() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.close(); // ควร trigger finish() ภายใน (finished == false)
        tos.close(); // เรียกซ้ำ - finished == true, closed == true -> ต้องไม่ throw
        assertTrue(tos.getBytesWritten() > 0);
    }

    // ---------------------------------------------------------------
    // Long file name modes
    // ---------------------------------------------------------------

    private String longName(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileName_defaultErrorMode_throwsRuntimeException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        // ไม่ setLongFileMode -> ค่าเริ่มต้น LONGFILE_ERROR
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileName_truncateMode_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testLongFileName_gnuMode_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        tos.putArchiveEntry(entry); // ภายในจะ put/write/close longlink entry ก่อน
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testLongFileName_posixMode_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        tos.putArchiveEntry(entry); // ภายในจะเรียก writePaxHeaders()
        tos.closeArchiveEntry();
        tos.close();
    }

    // ---------------------------------------------------------------
    // Big number modes
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testBigNumber_defaultErrorMode_positiveOverflow_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setUserId(Integer.MAX_VALUE); // > TarConstants.MAXID
        tos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testBigNumber_defaultErrorMode_negativeValue_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setDevMajor(-1); // value < 0 branch
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testBigNumber_posixMode_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setUserId(Integer.MAX_VALUE);
        tos.putArchiveEntry(entry); // ควรเข้า addPaxHeadersForBigNumbers + writePaxHeaders
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testBigNumber_starMode_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setUserId(Integer.MAX_VALUE);
        tos.putArchiveEntry(entry); // ไม่ควร fail และไม่เพิ่ม pax header
        tos.closeArchiveEntry();
        tos.close();
    }

    // ---------------------------------------------------------------
    // Non-ASCII pax header
    // ---------------------------------------------------------------

    @Test
    public void testAddPaxHeadersForNonAsciiNames_pathHeader_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("café.txt"); // มีอักขระ non-ASCII
        tos.putArchiveEntry(entry); // ควรเรียก writePaxHeaders เพราะ ASCII.canEncode == false
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNames_asciiName_noPaxHeader() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("plain.txt"); // ASCII เต็มรูป
        tos.putArchiveEntry(entry); // ไม่ควรเข้า pax header branch
        tos.closeArchiveEntry();
        tos.close();
    }

    // ---------------------------------------------------------------
    // createArchiveEntry
    // ---------------------------------------------------------------

    @Test
    public void testCreateArchiveEntry_normal() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        ArchiveEntry entry = tos.createArchiveEntry(new File("."), "dot");
        assertNotNull(entry);
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throws() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.finish();
        tos.createArchiveEntry(new File("."), "dot");
    }

    // ---------------------------------------------------------------
    // Misc: flush / getCount / getBytesWritten
    // ---------------------------------------------------------------

    @Test
    public void testFlush_noException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        tos.flush(); // ต้องไม่ throw
    }

    @Test
    public void testGetCountDeprecated_matchesBytesWritten() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        assertEquals((int) tos.getBytesWritten(), tos.getCount());
    }

    // ---------------------------------------------------------------
    // stripTo7Bits (private) - ทดสอบผ่าน reflection
    // ---------------------------------------------------------------

    @Test
    public void testStripTo7Bits_removesHighBit_andDropsNulChar() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = newTos(bos);

        Method m = TarArchiveOutputStream.class
                .getDeclaredMethod("stripTo7Bits", String.class);
        m.setAccessible(true);

        // 0x00 -> stripped == 0 -> ต้องถูกตัดออก (if branch: stripped != 0 == false)
        // 0xC1 (0x41 | 0x80) -> stripped == 0x41 ('A') -> ต้องถูกเก็บไว้ (branch true)
        String input = "AB" + (char) 0x00 + (char) 0xC1;
        String result = (String) m.invoke(tos, input);

        assertEquals("ABA", result);
    }
}
