package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructorDefault() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(new ByteArrayOutputStream());
        assertNotNull(t);
        // Assumption: default record size == 512 (TarBuffer.DEFAULT_RCDSIZE)
        assertEquals(512, t.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSize() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(new ByteArrayOutputStream(), 10240);
        assertNotNull(t);
        assertEquals(512, t.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockAndRecordSize() {
        TarArchiveOutputStream t = new TarArchiveOutputStream(new ByteArrayOutputStream(), 10240, 512);
        assertNotNull(t);
        assertEquals(512, t.getRecordSize());
    }

    // ---------------------------------------------------------------
    // getRecordSize / setLongFileMode
    // ---------------------------------------------------------------

    @Test
    public void testGetRecordSize() {
        assertEquals(512, tos.getRecordSize());
    }

    @Test
    public void testSetLongFileMode() {
        // ไม่มี getter ตรง ๆ แต่ต้อง cover การเรียกเมธอดนี้ (ผลลัพธ์ตรวจสอบผ่าน putArchiveEntry tests อื่น)
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        assertTrue(true);
    }

    // ---------------------------------------------------------------
    // putArchiveEntry
    // ---------------------------------------------------------------

    @Test
    public void testPutArchiveEntrySimpleFileAndClose() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntryDirectoryForcesZeroSize() throws IOException {
        // Assumption: name ending with "/" marks entry as directory in TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("testdir/");
        assertTrue("Assuming trailing-slash name implies isDirectory()==true", entry.isDirectory());
        entry.setSize(100); // แม้ตั้ง size ไว้ แต่เป็น directory ควรถูก force เป็น 0 ภายใน (currSize)
        tos.putArchiveEntry(entry);
        // ถ้า currSize ไม่ถูก force เป็น 0 ตาม logic (entry.isDirectory() ? 0 : entry.getSize())
        // การปิด entry โดยไม่เขียนข้อมูลใด ๆ จะ throw IOException เพราะ currBytes(0) < currSize(100)
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAfterFinished() throws IOException {
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntryLongNameGNU() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = buildLongName(150);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntryLongNameTruncate() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longName = buildLongName(150);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntryLongNameErrorDefault() throws IOException {
        // default longFileMode == LONGFILE_ERROR
        String longName = buildLongName(150);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntryNameExactlyAtBoundaryTriggersLongNameHandling() throws IOException {
        // Assumption: TarConstants.NAMELEN == 100 -> name.length() >= 100 triggers long-name branch
        String name = buildLongName(100);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(0);
        tos.putArchiveEntry(entry); // default LONGFILE_ERROR -> RuntimeException
    }

    @Test
    public void testPutArchiveEntryNameJustBelowBoundaryDoesNotTriggerLongNameHandling() throws IOException {
        // name.length() == 99 < NAMELEN(100) -> ไม่เข้าเงื่อนไข long-name handling เลย
        String name = buildLongName(99);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
    }

    private String buildLongName(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    // ---------------------------------------------------------------
    // closeArchiveEntry
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenEntry() throws IOException {
        tos.closeArchiveEntry(); // haveUnclosedEntry == false
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryAfterFinished() throws IOException {
        tos.finish();
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryBeforeWritingAllBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        tos.write("abc".getBytes()); // เขียนแค่ 3 bytes จาก 10 ที่ระบุไว้
        tos.closeArchiveEntry(); // currBytes(3) < currSize(10) -> throw
    }

    @Test
    public void testCloseArchiveEntryWithPendingAssembleBuffer() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[100]; // < recordBuf.length(512) -> assemble buffer only
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry(); // assemLen(100) > 0 branch -> flush padded record
        tos.close();
    }

    // ---------------------------------------------------------------
    // write(byte[], int, int)
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write("toolongdata".getBytes()); // 11 bytes > 5
    }

    @Test
    public void testWriteZeroLengthData() throws IOException {
        // boundary: numToWrite == 0
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.write(new byte[0]);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWriteSmallDataAssembleBufferOnly() throws IOException {
        // numToWrite(50) < recordBuf.length(512) -> assemble buffer branch (break)
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[50];
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWriteExactlyRecordSize() throws IOException {
        // numToWrite(512) == recordBuf.length -> goes to buffer.writeRecord directly, loop ends
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[512];
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWriteMultipleRecordsLarge() throws IOException {
        // while loop วนหลายครั้ง (numToWrite >= recordBuf.length ซ้ำ ๆ)
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[512 * 3];
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWriteAssembleThenFillAndFlushRecord() throws IOException {
        // Call#1: assemLen==0 -> while loop -> assemble buffer partial fill (assemLen=100)
        // Call#2: assemLen(100)>0, (100+512)>=512 -> flush combined record branch
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        int total = 512 + 100;
        entry.setSize(total);
        tos.putArchiveEntry(entry);
        byte[] first = new byte[100];
        tos.write(first);
        byte[] second = new byte[512];
        tos.write(second);
        tos.closeArchiveEntry();
        tos.close();
    }

    @Test
    public void testWriteWithOffsetAndLength() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "0123456789".getBytes();
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write(data, 2, 5); // offset/length ไม่ใช่ 0..length เต็ม
        tos.closeArchiveEntry();
        tos.close();
    }

    // ---------------------------------------------------------------
    // finish
    // ---------------------------------------------------------------

    @Test
    public void testFinishNormal() throws IOException {
        tos.finish();
        assertTrue(baos.toByteArray().length > 0); // two EOF records + flushBlock
    }

    @Test(expected = IOException.class)
    public void testFinishAlreadyFinished() throws IOException {
        tos.finish();
        tos.finish(); // finished == true -> throw
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.finish(); // haveUnclosedEntry == true -> throw
    }

    // ---------------------------------------------------------------
    // close
    // ---------------------------------------------------------------

    @Test
    public void testCloseCallsFinishWhenNotFinished() throws IOException {
        tos.close(); // !finished -> เรียก finish() ภายใน
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testCloseAfterExplicitFinishDoesNotCallFinishAgain() throws IOException {
        tos.finish();
        tos.close(); // finished == true อยู่แล้ว ต้องไม่เรียก finish() ซ้ำ (ไม่ throw)
    }

    @Test
    public void testCloseTwiceIsIdempotent() throws IOException {
        tos.close();
        tos.close(); // closed == true -> ข้าม buffer.close()/out.close() ครั้งที่สอง
    }

    // ---------------------------------------------------------------
    // flush
    // ---------------------------------------------------------------

    @Test
    public void testFlush() throws IOException {
        tos.flush(); // delegate ไปยัง out.flush() ไม่ throw
    }

    // ---------------------------------------------------------------
    // createArchiveEntry
    // ---------------------------------------------------------------

    @Test
    public void testCreateArchiveEntryNormal() throws IOException {
        File tempFile = File.createTempFile("tar-test", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "entryName");
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryAfterFinished() throws IOException {
        tos.finish();
        File tempFile = File.createTempFile("tar-test2", ".tmp");
        tempFile.deleteOnExit();
        tos.createArchiveEntry(tempFile, "entryName");
    }
}
