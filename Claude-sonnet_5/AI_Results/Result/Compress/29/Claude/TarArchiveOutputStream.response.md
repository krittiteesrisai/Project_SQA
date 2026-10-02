# ชุดทดสอบ JUnit 4: TarArchiveOutputStreamTest

หมายเหตุสำคัญก่อนเริ่ม: มีบางจุดที่โค้ดของ `TarArchiveOutputStream` เรียกใช้ API ของ `TarArchiveEntry` (เช่น `setLinkName`, `setSize`, `setGroupId`, การตรวจจับ directory จาก trailing `/`) ซึ่ง**ไม่ได้แสดงซอร์สโค้ดมาให้** ผมอ้างอิงจาก signature มาตรฐานของ commons-compress และ**คอมเมนต์กำกับไว้ในโค้ด**ทุกจุดที่เป็นการสมมติ เพื่อไม่ให้ผิดข้อกำหนดที่ 4

```java
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarConstants;

@SuppressWarnings("deprecation")
public class TarArchiveOutputStreamTest {

    /** OutputStream ปลอมสำหรับตรวจจับ flush()/close()/write() ของ stream ปลายทาง */
    private static class TrackingOutputStream extends OutputStream {
        final ByteArrayOutputStream delegate = new ByteArrayOutputStream();
        int flushCount = 0;
        int closeCount = 0;

        @Override
        public void write(int b) throws IOException {
            delegate.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            delegate.write(b, off, len);
        }

        @Override
        public void flush() throws IOException {
            flushCount++;
        }

        @Override
        public void close() throws IOException {
            closeCount++;
        }
    }

    private ByteArrayOutputStream baos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    // ---------- reflection helpers (เข้าถึง private field/method ของคลาสเป้าหมายโดยตรง) ----------

    private static void setField(Object target, String name, Object value) throws Exception {
        Field f = TarArchiveOutputStream.class.getDeclaredField(name);
        f.setAccessible(true);
        f.set(target, value);
    }

    private static Object getField(Object target, String name) throws Exception {
        Field f = TarArchiveOutputStream.class.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(target);
    }

    private static Object invokePrivate(Object target, String name,
            Class<?>[] paramTypes, Object[] args) throws Exception {
        Method m = TarArchiveOutputStream.class.getDeclaredMethod(name, paramTypes);
        m.setAccessible(true);
        try {
            return m.invoke(target, args);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof Exception) {
                throw (Exception) e.getCause();
            }
            throw e;
        }
    }

    private static String longName(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    // ===================== Constructors / getters =====================

    @Test
    public void testConstructor_OutputStreamOnly() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructor_WithEncoding() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructor_WithBlockSize() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructor_WithBlockSizeAndEncoding() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructor_WithBlockSizeAndRecordSize() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 20, 10);
        assertEquals(10, taos.getRecordSize());
    }

    @Test
    public void testGetBytesWritten_InitiallyZero() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        assertEquals(0, taos.getBytesWritten());
        assertEquals(0, taos.getCount());
    }

    // ===================== putArchiveEntry / closeArchiveEntry =====================

    @Test
    public void testPutAndCloseArchiveEntry_NormalFile() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        assertEquals(TarConstants.DEFAULT_RCDSIZE, taos.getBytesWritten());
    }

    @Test
    public void testPutArchiveEntry_Directory_NoThrowOnClose() throws IOException {
        // สมมติ: TarArchiveEntry("mydir/") จะถูกจัดว่าเป็น directory (พฤติกรรมมาตรฐานของ
        // commons-compress) — ไม่ assert ตรง ๆ เพื่อไม่ guess API ที่ไม่ได้ให้มา
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("mydir/");
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_AfterFinished_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.putArchiveEntry(new TarArchiveEntry("test.txt"));
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_AfterFinished_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_NoUnclosedEntry_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_PrematureClose_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[5], 0, 5);
        try {
            taos.closeArchiveEntry();
            fail("expected IOException due to premature close");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed at"));
        }
    }

    // ===================== write() =====================

    @Test(expected = IllegalStateException.class)
    public void testWrite_NoCurrentEntry_ThrowsISE() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.write(new byte[5], 0, 5);
    }

    @Test
    public void testWrite_ExceedsSize_ThrowsIOException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);
        try {
            taos.write(new byte[10], 0, 10);
            fail("expected IOException, size exceeded");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size in header"));
        }
    }

    @Test
    public void testWrite_AssemblyBuffer_AllBranches() throws Exception {
        // recordSize เล็ก ๆ ไว้ควบคุม assembly buffer ได้ง่าย โดย bypass putArchiveEntry
        // (การเขียน header จริงต้องใช้ recordSize มาตรฐาน 512) แล้วตั้งค่า field ภายในตรง ๆ
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 20, 10);
        setField(taos, "haveUnclosedEntry", Boolean.TRUE);
        setField(taos, "currSize", 12L);
        setField(taos, "currBytes", 0L);
        setField(taos, "currName", "x");

        taos.write(new byte[] {1, 2, 3, 4}, 0, 4);      // assemLen 0->4 (ยังไม่เข้า if(assemLen>0))
        taos.write(new byte[] {5, 6, 7, 8}, 0, 4);      // assemLen 4->8 (branch else ของ if(assemLen>0))
        taos.write(new byte[] {9, 10, 11, 12}, 0, 4);   // branch if เต็ม record + เศษเหลือ assembly

        long currBytes = (Long) getField(taos, "currBytes");
        int assemLen = (Integer) getField(taos, "assemLen");
        assertEquals(10, currBytes);
        assertEquals(2, assemLen);
    }

    @Test
    public void testWrite_DirectRecordWrites_NoInitialAssembly() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 20, 10);
        setField(taos, "haveUnclosedEntry", Boolean.TRUE);
        setField(taos, "currSize", 25L);
        setField(taos, "currBytes", 0L);
        setField(taos, "currName", "x");

        taos.write(new byte[25], 0, 25);

        long currBytes = (Long) getField(taos, "currBytes");
        int assemLen = (Integer) getField(taos, "assemLen");
        assertEquals(20, currBytes);
        assertEquals(5, assemLen);
    }

    @Test
    public void testWrite_ExactRecordSize_DirectWrite() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 20, 10);
        setField(taos, "haveUnclosedEntry", Boolean.TRUE);
        setField(taos, "currSize", 10L);
        setField(taos, "currBytes", 0L);
        setField(taos, "currName", "x");

        taos.write(new byte[10], 0, 10);

        long currBytes = (Long) getField(taos, "currBytes");
        int assemLen = (Integer) getField(taos, "assemLen");
        assertEquals(10, currBytes);
        assertEquals(0, assemLen);
    }

    // ===================== long file/link name handling =====================

    @Test
    public void testLongFileMode_Error_NameTooLong_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        try {
            taos.putArchiveEntry(entry);
            fail("expected RuntimeException for too-long file name");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testLongFileMode_Error_NameOk_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testLongFileMode_Truncate_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testLongFileMode_GNU_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testLongFileMode_POSIX_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry(longName(TarConstants.NAMELEN + 5));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testLongLinkName_POSIX_NoThrow() throws IOException {
        // สมมติ: TarArchiveEntry มี setLinkName(String) (ถูกใช้ผ่าน getLinkName() ในซอร์สเป้าหมาย)
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        entry.setLinkName(longName(TarConstants.NAMELEN + 5));
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testLinkName_ShortOrNull_NoPaxHeaderBranch() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    // ===================== big number handling =====================

    @Test
    public void testBigNumberMode_Error_SizeTooBig_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        try {
            taos.putArchiveEntry(entry);
            fail("expected RuntimeException for oversized entry size");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("entry size"));
            assertTrue(e.getMessage().contains("too big"));
        }
    }

    @Test
    public void testBigNumberMode_Error_GroupIdTooBig_ThrowsWithPosixHint() throws IOException {
        // สมมติ: TarArchiveEntry มี setGroupId(int) (getGroupId() ถูกใช้ในซอร์สเป้าหมาย)
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setGroupId((int) TarConstants.MAXID + 1000);
        try {
            taos.putArchiveEntry(entry);
            fail("expected RuntimeException for oversized group id");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("group id"));
            assertTrue(e.getMessage().contains("STAR or POSIX"));
        }
    }

    @Test
    public void testBigNumberMode_Posix_SizeTooBig_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        taos.putArchiveEntry(entry); // ไม่ควร throw: ใช้ PAX header แทน
    }

    @Test
    public void testBigNumberMode_Star_SizeTooBig_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        taos.putArchiveEntry(entry); // ไม่ควร throw: ข้าม addPax/failForBigNumbers ไปเลย
    }

    // ===================== non-ASCII name PAX headers =====================

    @Test
    public void testAddPaxHeadersForNonAsciiNames_True_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("caf\u00e9.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNames_False_NoThrow() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("caf\u00e9.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
    }

    @Test
    public void testStripTo7Bits_ReplacesSpecialChars() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        String result = (String) invokePrivate(taos, "stripTo7Bits",
                new Class<?>[] { String.class },
                new Object[] { "a/b\\c\u0000d" });
        assertEquals("a_b_c_d", result);
    }

    @Test
    public void testShouldBeReplaced_TrueAndFalseBranches() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        assertTrue((Boolean) invokePrivate(taos, "shouldBeReplaced",
                new Class<?>[] { char.class }, new Object[] { '/' }));
        assertTrue((Boolean) invokePrivate(taos, "shouldBeReplaced",
                new Class<?>[] { char.class }, new Object[] { '\\' }));
        assertTrue((Boolean) invokePrivate(taos, "shouldBeReplaced",
                new Class<?>[] { char.class }, new Object[] { (char) 0 }));
        assertFalse((Boolean) invokePrivate(taos, "shouldBeReplaced",
                new Class<?>[] { char.class }, new Object[] { 'a' }));
    }

    // ===================== finish() / close() =====================

    @Test
    public void testFinish_Normal_WritesEOFRecordsAndFlushes() throws IOException {
        TrackingOutputStream tracking = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tracking);
        taos.finish();
        assertEquals(1, tracking.flushCount);
        assertEquals(TarConstants.DEFAULT_BLKSIZE, taos.getBytesWritten());
    }

    @Test(expected = IOException.class)
    public void testFinish_AlreadyFinished_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.finish();
    }

    @Test
    public void testFinish_UnclosedEntry_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        try {
            taos.finish();
            fail("expected IOException due to unclosed entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("unclosed entries"));
        }
    }

    @Test
    public void testClose_CallsFinishThenClosesUnderlyingStream() throws IOException {
        TrackingOutputStream tracking = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tracking);
        taos.close();
        assertEquals(1, tracking.closeCount);
    }

    @Test
    public void testClose_Idempotent_SecondCallDoesNotCloseAgain() throws IOException {
        TrackingOutputStream tracking = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tracking);
        taos.close();
        taos.close();
        assertEquals(1, tracking.closeCount);
    }

    @Test
    public void testClose_AfterExplicitFinish_DoesNotCallFinishAgain() throws IOException {
        TrackingOutputStream tracking = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tracking);
        taos.finish();
        int flushesAfterFinish = tracking.flushCount;
        taos.close();
        assertEquals(flushesAfterFinish, tracking.flushCount);
        assertEquals(1, tracking.closeCount);
    }

    // ===================== flush() =====================

    @Test
    public void testFlush_DelegatesToUnderlyingStream() throws IOException {
        TrackingOutputStream tracking = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tracking);
        taos.flush();
        assertEquals(1, tracking.flushCount);
    }

    // ===================== createArchiveEntry() =====================

    @Test
    public void testCreateArchiveEntry_ReturnsTarArchiveEntry() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        File f = new File("this-file-should-not-exist-for-test.tmp");
        Object entry = taos.createArchiveEntry(f, "entryName");
        assertTrue(entry instanceof TarArchiveEntry);
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_AfterFinished_Throws() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.createArchiveEntry(new File("x"), "entryName");
    }

    // ===================== getCount() deprecated =====================

    @Test
    public void testGetCount_MatchesGetBytesWritten() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        assertEquals((int) taos.getBytesWritten(), taos.getCount());
    }

    // ===================== writeRecord() private branches =====================

    @Test
    public void testWriteRecord_WrongLength_ThrowsIOException() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            invokePrivate(taos, "writeRecord", new Class<?>[] { byte[].class },
                    new Object[] { new byte[10] });
            fail("expected IOException for record with wrong length");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("which is not the record size"));
        }
    }

    @Test
    public void testWriteRecordWithOffset_TooShort_ThrowsIOException() throws Exception {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            invokePrivate(taos, "writeRecord",
                    new Class<?>[] { byte[].class, int.class },
                    new Object[] { new byte[10], 5 });
            fail("expected IOException for offset+recordSize > buf.length");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("which is less than the record size"));
        }
    }

    // ===================== padAsNeeded() branch via finish() =====================

    @Test
    public void testPadAsNeeded_NoPaddingWhenAlreadyAligned() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 20, 10); // recordsPerBlock=2
        taos.finish();
        assertEquals(20, taos.getBytesWritten());
    }

    @Test
    public void testPadAsNeeded_PaddingWhenNotAligned() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 30, 10); // recordsPerBlock=3
        taos.finish();
        assertEquals(30, taos.getBytesWritten());
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่ม/เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_*` | Constructor overloads ทั้ง 5 ตัว, `getRecordSize()` |
| `testGetBytesWritten_InitiallyZero` | `getBytesWritten()`, `getCount()` เริ่มต้น |
| `testPutAndCloseArchiveEntry_NormalFile` | flow ปกติของ `putArchiveEntry`/`closeArchiveEntry`, branch `entry.isDirectory()==false` |
| `testPutArchiveEntry_Directory_NoThrowOnClose` | branch `entry.isDirectory()==true` (currSize=0) |
| `testPutArchiveEntry_AfterFinished_Throws` | `if(finished) throw` ใน `putArchiveEntry` |
| `testCloseArchiveEntry_AfterFinished_Throws` | `if(finished) throw` ใน `closeArchiveEntry` |
| `testCloseArchiveEntry_NoUnclosedEntry_Throws` | `if(!haveUnclosedEntry) throw` |
| `testCloseArchiveEntry_PrematureClose_Throws` | branch `assemLen>0`, `currBytes<currSize` throw |
| `testWrite_NoCurrentEntry_ThrowsISE` | `if(!haveUnclosedEntry) throw` ใน `write` |
| `testWrite_ExceedsSize_ThrowsIOException` | `currBytes+numToWrite>currSize` throw |
| `testWrite_AssemblyBuffer_AllBranches` | `if(assemLen>0)` ทั้งสอง sub-branch (if/else), while-loop assembly |
| `testWrite_DirectRecordWrites_NoInitialAssembly` | while-loop branch `numToWrite>=recordBuf.length` (เขียนตรง) |
| `testWrite_ExactRecordSize_DirectWrite` | boundary `numToWrite==recordBuf.length` |
| `testLongFileMode_Error_NameTooLong_Throws` | `handleLongName`: `len>=NAMELEN` + `longFileMode!=TRUNCATE` throw |
| `testLongFileMode_Error_NameOk_NoThrow` | `len>=NAMELEN==false` (return false) |
| `testLongFileMode_Truncate_NoThrow` | branch TRUNCATE (ไม่ throw ไม่ทำอะไรพิเศษ) |
| `testLongFileMode_GNU_NoThrow` | branch GNU (สร้าง longLinkEntry + write + close ซ้อน) |
| `testLongFileMode_POSIX_NoThrow` | branch POSIX (`paxHeaders.put`, return true) |
| `testLongLinkName_POSIX_NoThrow` | `linkName!=null&&length()>0==true` + handleLongName สำหรับ linkpath |
| `testLinkName_ShortOrNull_NoPaxHeaderBranch` | `linkName!=null&&length()>0==false` (short-circuit) |
| `testBigNumberMode_Error_SizeTooBig_Throws` | `failForBigNumbers` → size check throw |
| `testBigNumberMode_Error_GroupIdTooBig_ThrowsWithPosixHint` | `failForBigNumberWithPosixMessage` (gid) throw |
| `testBigNumberMode_Posix_SizeTooBig_NoThrow` | branch `bigNumberMode==POSIX` → `addPaxHeadersForBigNumbers` |
| `testBigNumberMode_Star_SizeTooBig_NoThrow` | branch `bigNumberMode==STAR` (ข้าม add/fail ทั้งคู่) |
| `testAddPaxHeadersForNonAsciiNames_True/False` | branch `addPaxHeadersForNonAsciiNames && !ASCII.canEncode` |
| `testStripTo7Bits_ReplacesSpecialChars` | loop + branch `shouldBeReplaced==true` ใน `stripTo7Bits` |
| `testShouldBeReplaced_TrueAndFalseBranches` | ทุกเงื่อนไข `c=='/'`, `c=='\\'`, `c==0`, false-case |
| `testFinish_Normal_WritesEOFRecordsAndFlushes` | flow ปกติ `finish()` |
| `testFinish_AlreadyFinished_Throws` | `if(finished) throw` ใน `finish` |
| `testFinish_UnclosedEntry_Throws` | `if(haveUnclosedEntry) throw` ใน `finish` |
| `testClose_*` | `if(!finished) finish()`, `if(!closed) close()` ทั้ง true/false |
| `testFlush_DelegatesToUnderlyingStream` | `flush()` |
| `testCreateArchiveEntry_ReturnsTarArchiveEntry` | flow ปกติ |
| `testCreateArchiveEntry_AfterFinished_Throws` | `if(finished) throw` ใน `createArchiveEntry` |
| `testGetCount_MatchesGetBytesWritten` | deprecated `getCount()` |
| `testWriteRecord_WrongLength_ThrowsIOException` | branch `record.length!=recordSize` |
| `testWriteRecordWithOffset_TooShort_ThrowsIOException` | branch `offset+recordSize>buf.length` |
| `testPadAsNeeded_NoPaddingWhenAlreadyAligned` | `padAsNeeded`: `start==0` (ไม่ pad) |
| `testPadAsNeeded_PaddingWhenNotAligned` | `padAsNeeded`: `start!=0` + for-loop เติม padding |