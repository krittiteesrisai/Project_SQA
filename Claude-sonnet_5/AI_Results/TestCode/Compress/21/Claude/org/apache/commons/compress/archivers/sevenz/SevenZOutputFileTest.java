package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class SevenZOutputFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- Helper methods ----------

    private File newArchiveFile() throws IOException {
        return tempFolder.newFile("test.7z");
    }

    private SevenZArchiveEntry newEntry(String name) {
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName(name);
        return entry;
    }

    /**
     * อ่านข้อมูลของ entry ปัจจุบันจาก SevenZFile จนครบขนาดที่กำหนด
     * สมมติว่า SevenZFile#read(byte[], int, int) มีอยู่จริงตาม API มาตรฐานของ commons-compress
     */
    private byte[] readFully(SevenZFile sevenZFile, int size) throws IOException {
        byte[] buf = new byte[size];
        int off = 0;
        while (off < size) {
            int read = sevenZFile.read(buf, off, size - off);
            if (read < 0) {
                break;
            }
            off += read;
        }
        return buf;
    }

    // ---------- createArchiveEntry() ----------

    @Test
    public void testCreateArchiveEntryForFile() throws IOException {
        File dummyFile = tempFolder.newFile("dummy.txt");
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = out.createArchiveEntry(dummyFile, "dummy.txt");
            assertFalse(entry.isDirectory());
            assertEquals("dummy.txt", entry.getName());
            assertNotNull(entry.getLastModifiedDate());
        } finally {
            out.close();
        }
    }

    @Test
    public void testCreateArchiveEntryForDirectory() throws IOException {
        File dummyDir = tempFolder.newFolder("dummyDir");
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = out.createArchiveEntry(dummyDir, "dummyDir");
            assertTrue(entry.isDirectory());
        } finally {
            out.close();
        }
    }

    // ---------- putArchiveEntry() ----------

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntryWithWrongType_throwsClassCastException() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            ArchiveEntry wrongType = new ZipArchiveEntry("not-a-7z-entry");
            out.putArchiveEntry(wrongType); // ต้อง throw ClassCastException จากการ cast ภายในเมธอด
        } finally {
            out.close();
        }
    }

    // ---------- write() / closeArchiveEntry() : basic round trip ----------

    @Test
    public void testWriteSingleFileWithContentAndReadBack() throws IOException {
        File archiveFile = newArchiveFile();
        byte[] content = "Hello 7z World!".getBytes("UTF-8");

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry("hello.txt");
            out.putArchiveEntry(entry);
            out.write(content);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertNotNull(read);
            assertEquals("hello.txt", read.getName());
            assertFalse(read.isDirectory());
            assertTrue(read.hasStream());
            assertTrue(read.getHasCrc());
            assertEquals(content.length, read.getSize());
            byte[] readContent = readFully(sevenZFile, content.length);
            assertArrayEquals(content, readContent);
            assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWriteMultipleFilesWithContentAndReadBack() throws IOException {
        File archiveFile = newArchiveFile();
        byte[] c1 = "first".getBytes("UTF-8");
        byte[] c2 = "second-file-content".getBytes("UTF-8");
        byte[] c3 = new byte[300]; // ทดสอบ boundary ของ writeUint64 (>127 -> 2-byte encoding)
        Arrays.fill(c3, (byte) 7);

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry e1 = newEntry("a.txt");
            out.putArchiveEntry(e1);
            out.write(c1);
            out.closeArchiveEntry();

            SevenZArchiveEntry e2 = newEntry("b.txt");
            out.putArchiveEntry(e2);
            out.write(c2, 0, c2.length);
            out.closeArchiveEntry();

            SevenZArchiveEntry e3 = newEntry("c.bin");
            out.putArchiveEntry(e3);
            out.write(c3);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry r1 = sevenZFile.getNextEntry();
            assertEquals("a.txt", r1.getName());
            assertArrayEquals(c1, readFully(sevenZFile, (int) r1.getSize()));

            SevenZArchiveEntry r2 = sevenZFile.getNextEntry();
            assertEquals("b.txt", r2.getName());
            assertArrayEquals(c2, readFully(sevenZFile, (int) r2.getSize()));

            SevenZArchiveEntry r3 = sevenZFile.getNextEntry();
            assertEquals("c.bin", r3.getName());
            assertArrayEquals(c3, readFully(sevenZFile, (int) r3.getSize()));

            assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- Empty / zero-length content branches ----------

    @Test
    public void testWriteEmptyFile_NoWriteCalled() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry("empty.txt");
            out.putArchiveEntry(entry);
            // ไม่เรียก write เลย -> currentOutputStream เป็น null -> closeArchiveEntry ควร else branch
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertNotNull(read);
            assertFalse(read.hasStream());
            assertEquals(0, read.getSize());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWriteWithZeroLength_DoesNotCreateStream() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry("zerolen.txt");
            out.putArchiveEntry(entry);
            out.write(new byte[0], 0, 0); // len==0 -> if(len>0) false -> ไม่เรียก getCurrentOutputStream()
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertFalse(read.hasStream());
            assertEquals(0, read.getSize());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWriteDirectoryEntry_NoStream() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry("dir");
            entry.setDirectory(true);
            out.putArchiveEntry(entry);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertTrue(read.isDirectory());
            assertFalse(read.hasStream());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWriteSingleByteApi() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry("singlebyte.bin");
            out.putArchiveEntry(entry);
            out.write((int) 'X'); // เทส write(int) overload
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertEquals(1, read.getSize());
            byte[] content = readFully(sevenZFile, 1);
            assertEquals('X', content[0]);
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- Mixed empty-stream / empty-file / anti-item branches ----------

    @Test
    public void testMixedEntries_EmptyStreamsAndEmptyFilesBranches() throws IOException {
        File archiveFile = newArchiveFile();
        byte[] content = "data".getBytes("UTF-8");

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            // entry มี content -> hasStream = true
            SevenZArchiveEntry withContent = newEntry("with-content.txt");
            out.putArchiveEntry(withContent);
            out.write(content);
            out.closeArchiveEntry();

            // entry ไม่มี content แต่ไม่ใช่ directory -> hasEmptyFiles branch = true
            SevenZArchiveEntry emptyFile = newEntry("empty-file.txt");
            out.putArchiveEntry(emptyFile);
            out.closeArchiveEntry();

            // directory (ไม่มี stream, isDirectory=true) -> isDir=true, ไม่ถูกนับเป็น "emptyFile"
            SevenZArchiveEntry dir = newEntry("dir");
            dir.setDirectory(true);
            out.putArchiveEntry(dir);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry r1 = sevenZFile.getNextEntry();
            assertEquals("with-content.txt", r1.getName());
            assertTrue(r1.hasStream());

            SevenZArchiveEntry r2 = sevenZFile.getNextEntry();
            assertEquals("empty-file.txt", r2.getName());
            assertFalse(r2.hasStream());
            assertFalse(r2.isDirectory());

            SevenZArchiveEntry r3 = sevenZFile.getNextEntry();
            assertEquals("dir", r3.getName());
            assertFalse(r3.hasStream());
            assertTrue(r3.isDirectory());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testAntiItemEntry_TriggersAntiItemsBranch() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry anti = newEntry("anti.txt");
            anti.setAntiItem(true); // ไม่มี stream, isAntiItem = true -> writeFileAntiItems: hasAntiItems=true
            out.putArchiveEntry(anti);
            out.closeArchiveEntry();

            // เพิ่ม entry อีกตัวที่ไม่ anti เพื่อให้ bitset มีทั้ง true/false (>1 บิต)
            SevenZArchiveEntry notAnti = newEntry("notanti.txt");
            out.putArchiveEntry(notAnti);
            out.closeArchiveEntry();
        } finally {
            out.close(); // ต้องไม่ throw exception ระหว่าง writeFileAntiItems()
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry r1 = sevenZFile.getNextEntry();
            assertEquals("anti.txt", r1.getName());
            // isAntiItem() getter สมมติว่ามีอยู่ตาม pattern ปกติของ SevenZArchiveEntry
            assertTrue(r1.isAntiItem());

            SevenZArchiveEntry r2 = sevenZFile.getNextEntry();
            assertEquals("notanti.txt", r2.getName());
            assertFalse(r2.isAntiItem());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- Empty archive (no entries at all) ----------

    @Test
    public void testEmptyArchive_NoEntries() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        out.close(); // finish() ถูกเรียกโดย close() เพราะยังไม่ finished

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- finish() / close() lifecycle branches ----------

    @Test(expected = IOException.class)
    public void testFinishCalledTwice_throwsIOException() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            out.finish();
            out.finish(); // ต้อง throw IOException ("already been finished")
        } finally {
            // ปิดไฟล์ raw กันไฟล์ handle รั่ว โดยไม่พึ่ง close() ของ SevenZOutputFile (เพราะ finished=true แล้ว)
            out.close();
        }
    }

    @Test
    public void testCloseWithoutManualFinish_callsFinishAutomatically() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        // ไม่เรียก finish() เอง
        out.close(); // ควรเรียก finish() ให้อัตโนมัติแล้วปิดไฟล์ โดยไม่ throw

        // ตรวจสอบว่าไฟล์ที่ได้ยังอ่านได้ปกติ (พิสูจน์ว่า header ถูกเขียนสมบูรณ์)
        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        sevenZFile.close();
    }

    @Test
    public void testCloseAfterManualFinish_doesNotThrow() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        out.finish();
        out.close(); // finished == true แล้ว -> ไม่เรียก finish() ซ้ำ, ไม่ throw
    }

    // ---------- Content compression method branches ----------

    @Test
    public void testContentCompressionCopy_RoundTrip() throws IOException {
        File archiveFile = newArchiveFile();
        byte[] content = "COPY-method-content".getBytes("UTF-8");

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            out.setContentCompression(SevenZMethod.COPY);
            SevenZArchiveEntry entry = newEntry("copy.txt");
            out.putArchiveEntry(entry);
            out.write(content);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertArrayEquals(content, readFully(sevenZFile, (int) read.getSize()));
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testContentCompressionLZMA2Default_RoundTrip() throws IOException {
        File archiveFile = newArchiveFile();
        byte[] content = new byte[2048];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 251);
        }

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            // ไม่เรียก setContentCompression -> ใช้ default = LZMA2
            SevenZArchiveEntry entry = newEntry("lzma2.bin");
            out.putArchiveEntry(entry);
            out.write(content);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertArrayEquals(content, readFully(sevenZFile, (int) read.getSize()));
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- UTF-16LE file name encoding boundary ----------

    @Test
    public void testFileNameWithNonAsciiCharacters_RoundTrip() throws IOException {
        File archiveFile = newArchiveFile();
        String name = "ทดสอบ-файл-.txt"; // มีทั้งไทย, ซีริลลิก, และ ascii
        byte[] content = "x".getBytes("UTF-8");

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = newEntry(name);
            out.putArchiveEntry(entry);
            out.write(content);
            out.closeArchiveEntry();
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry read = sevenZFile.getNextEntry();
            assertEquals(name, read.getName());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- Date / attribute related branches (creation/access/modified/windows attrs) ----------
    // หมายเหตุ: ไม่แน่ใจว่า setXxxDate() จะ set flag has-Xxx อัตโนมัติหรือไม่ (ไม่มีซอร์สของ
    // SevenZArchiveEntry ให้ตรวจสอบ) จึงเรียก setHasXxx(true) กำกับไว้อย่างชัดเจนเพื่อบังคับ branch
    // ที่ต้องการทดสอบใน SevenZOutputFile โดยไม่พึ่งพฤติกรรม auto-set ที่ไม่ทราบแน่ชัด

    @Test
    public void testAllEntriesHaveCreationDate_EqualBranch() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            for (int i = 0; i < 2; i++) {
                SevenZArchiveEntry entry = newEntry("f" + i + ".txt");
                entry.setCreationDate(new Date());
                entry.setHasCreationDate(true); // บังคับให้ numCreationDates == files.size()
                out.putArchiveEntry(entry);
                out.closeArchiveEntry();
            }
        } finally {
            out.close(); // ต้องไม่ throw ระหว่าง writeFileCTimes() (branch: numCreationDates == files.size())
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            assertNotNull(sevenZFile.getNextEntry());
            assertNotNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testSomeEntriesHaveAccessDate_BitSetBranch() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry withDate = newEntry("with-date.txt");
            withDate.setAccessDate(new Date());
            withDate.setHasAccessDate(true);
            out.putArchiveEntry(withDate);
            out.closeArchiveEntry();

            SevenZArchiveEntry withoutDate = newEntry("without-date.txt");
            out.putArchiveEntry(withoutDate);
            out.closeArchiveEntry();
        } finally {
            out.close(); // branch: numAccessDates != files.size() -> ใช้ BitSet
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            assertNotNull(sevenZFile.getNextEntry());
            assertNotNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWindowsAttributes_MixedBranch() throws IOException {
        File archiveFile = newArchiveFile();
        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry withAttr = newEntry("attr.txt");
            withAttr.setWindowsAttributes(0x20);
            withAttr.setHasWindowsAttributes(true);
            out.putArchiveEntry(withAttr);
            out.closeArchiveEntry();

            SevenZArchiveEntry withoutAttr = newEntry("noattr.txt");
            out.putArchiveEntry(withoutAttr);
            out.closeArchiveEntry();
        } finally {
            out.close(); // branch: numWindowsAttributes != files.size() -> BitSet path
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            assertNotNull(sevenZFile.getNextEntry());
            assertNotNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    // ---------- writeUint64 boundary values (ผ่าน content size ต่าง ๆ) ----------

    @Test
    public void testUint64EncodingBoundarySizes() throws IOException {
        File archiveFile = newArchiveFile();
        // ขนาดที่ตกขอบของการเข้ารหัส uint64 (1-byte vs 2-byte header เป็นต้น)
        int[] sizes = {0, 1, 127, 128, 255, 256};

        SevenZOutputFile out = new SevenZOutputFile(archiveFile);
        try {
            for (int size : sizes) {
                SevenZArchiveEntry entry = newEntry("size-" + size + ".bin");
                out.putArchiveEntry(entry);
                if (size > 0) {
                    byte[] content = new byte[size];
                    Arrays.fill(content, (byte) 1);
                    out.write(content);
                }
                out.closeArchiveEntry();
            }
        } finally {
            out.close();
        }

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            for (int size : sizes) {
                SevenZArchiveEntry read = sevenZFile.getNextEntry();
                assertNotNull(read);
                assertEquals(size, read.getSize());
                if (size > 0) {
                    byte[] content = readFully(sevenZFile, size);
                    byte[] expected = new byte[size];
                    Arrays.fill(expected, (byte) 1);
                    assertArrayEquals(expected, content);
                }
            }
            assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }
}
