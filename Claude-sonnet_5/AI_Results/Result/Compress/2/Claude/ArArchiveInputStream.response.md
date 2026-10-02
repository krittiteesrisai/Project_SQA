# JUnit 4 Test Suite สำหรับ `ArArchiveInputStream`

## หมายเหตุก่อนเริ่ม
- ค่า `HEADER` อ้างอิงได้จาก method `matches()` ในซอร์ส (0x21,0x3c,0x61,0x72,0x63,0x68,0x3e,0x0a = `"!<arch>\n"`)
- ค่า `TRAILER` **ไม่ปรากฏในซอร์สที่ให้มา** (เป็นค่าคงที่ใน `ArArchiveEntry` ที่ไม่ได้แสดง) — สมมติค่ามาตรฐานของรูปแบบไฟล์ ar คือ `` "`\n" `` (0x60 0x0A) ซึ่งเป็นค่าจริงที่ใช้ในไลบรารี commons-compress เพื่อให้สามารถสร้าง fixture ทดสอบได้
- เมธอด `getName()` และ `getSize()` ที่เรียกจาก entry ใช้ตาม interface `ArchiveEntry` ที่ import อยู่ในซอร์สจริง (ไม่ได้เดา behavior เฉพาะของ `ArArchiveEntry`)
- ใช้ **reflection** เข้าถึง field `offset` (private) เพื่อตรวจสอบพฤติกรรม/ข้อบกพร่องของ `read()` โดยตรง (white-box testing)

```java
package org.apache.commons.compress.archivers.ar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

public class ArArchiveInputStreamTest {

    // อ้างอิงจาก matches(): 0x21,0x3c,0x61,0x72,0x63,0x68,0x3e,0x0a = "!<arch>\n"
    private static final byte[] HEADER_BYTES = "!<arch>\n".getBytes();

    // หมายเหตุ: ค่า TRAILER ไม่ปรากฏในซอร์สที่ให้มา
    // สมมติเป็นค่ามาตรฐานของรูปแบบ ar คือ "`\n" (0x60 0x0A)
    private static final byte[] TRAILER_BYTES = "`\n".getBytes();

    // ---------- Helper methods ----------

    private static byte[] pad(String s, int len) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) {
            sb.append(' ');
        }
        return sb.substring(0, len).getBytes();
    }

    private byte[] buildEntryHeader(String name, long length) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(pad(name, 16), 0, 16);
        baos.write(pad("0", 12), 0, 12);
        baos.write(pad("0", 6), 0, 6);
        baos.write(pad("0", 6), 0, 6);
        baos.write(pad("100644", 8), 0, 8);
        baos.write(pad(String.valueOf(length), 10), 0, 10);
        byte[] core = baos.toByteArray();
        byte[] result = new byte[core.length + TRAILER_BYTES.length];
        System.arraycopy(core, 0, result, 0, core.length);
        System.arraycopy(TRAILER_BYTES, 0, result, core.length, TRAILER_BYTES.length);
        return result;
    }

    private byte[] concat(byte[]... arrays) {
        int total = 0;
        for (byte[] a : arrays) total += a.length;
        byte[] result = new byte[total];
        int pos = 0;
        for (byte[] a : arrays) {
            System.arraycopy(a, 0, result, pos, a.length);
            pos += a.length;
        }
        return result;
    }

    private long getOffset(ArArchiveInputStream ais) throws Exception {
        Field f = ArArchiveInputStream.class.getDeclaredField("offset");
        f.setAccessible(true);
        return f.getLong(ais);
    }

    private static class CountingInputStream extends ByteArrayInputStream {
        int closeCount = 0;
        CountingInputStream(byte[] buf) {
            super(buf);
        }
        @Override
        public void close() throws IOException {
            closeCount++;
            super.close();
        }
    }

    // ---------- getNextArEntry() ----------

    @Test
    public void testGetNextArEntry_ValidSingleEntry() throws IOException {
        byte[] data = concat(HEADER_BYTES, buildEntryHeader("test.txt", 5));
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        ArArchiveEntry entry = ais.getNextArEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(5L, entry.getSize());
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_HeaderTooShort() throws IOException {
        byte[] data = "abcd".getBytes(); // สั้นกว่า HEADER 8 ไบต์ -> read != expected.length
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        ais.getNextArEntry();
    }

    @Test
    public void testGetNextArEntry_InvalidHeaderContent() {
        byte[] data = "XXXXXXXX".getBytes(); // ยาว 8 ไบต์ แต่เนื้อหาไม่ตรง
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        try {
            ais.getNextArEntry();
            fail("ควร throw IOException เนื่องจาก header ไม่ถูกต้อง");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid header"));
        }
    }

    @Test
    public void testGetNextArEntry_EofAfterHeader_ReturnsNull() throws IOException {
        byte[] data = HEADER_BYTES.clone(); // มีแค่ header ไม่มี entry ตามมา
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        assertNull(ais.getNextArEntry());
    }

    @Test
    public void testGetNextArEntry_TrailerReadFailure() {
        // ตัด trailer ให้เหลือแค่ 1 ไบต์ (ต้องการ 2 ไบต์) -> read != expected.length
        byte[] fullHeader = buildEntryHeader("a.txt", 1);
        byte[] truncated = new byte[fullHeader.length - 1];
        System.arraycopy(fullHeader, 0, truncated, 0, truncated.length);
        byte[] data = concat(HEADER_BYTES, truncated);
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        try {
            ais.getNextArEntry();
            fail("ควร throw IOException เนื่องจากอ่าน trailer ไม่ครบ");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("failed to read entry header"));
        }
    }

    @Test
    public void testGetNextArEntry_TrailerMismatch() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(pad("b.txt", 16), 0, 16);
        baos.write(pad("0", 12), 0, 12);
        baos.write(pad("0", 6), 0, 6);
        baos.write(pad("0", 6), 0, 6);
        baos.write(pad("100644", 8), 0, 8);
        baos.write(pad("1", 10), 0, 10);
        baos.write(new byte[] { 'X', 'Y' }, 0, 2); // trailer ผิด แต่ยาวครบ 2 ไบต์
        byte[] data = concat(HEADER_BYTES, baos.toByteArray());
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        try {
            ais.getNextArEntry();
            fail("ควร throw IOException เนื่องจาก trailer ไม่ตรง");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry header"));
        }
    }

    @Test
    public void testGetNextArEntry_OddOffset_PaddingByteConsumed() throws IOException {
        byte[] entry1 = buildEntryHeader("odd.txt", 3);
        byte[] content1 = new byte[] { 'A', 'B', 'C' }; // 3 ไบต์ (คี่)
        byte[] pad1 = new byte[] { '\n' }; // padding 1 ไบต์ เพื่อให้ offset กลับมาเป็นคู่
        byte[] entry2 = buildEntryHeader("second.txt", 4);
        byte[] data = concat(HEADER_BYTES, entry1, content1, pad1, entry2);

        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        ArArchiveEntry e1 = ais.getNextArEntry();
        assertNotNull(e1);
        assertEquals("odd.txt", e1.getName());

        byte[] contentBuf = new byte[3];
        int read = ais.read(contentBuf);
        assertEquals(3, read); // offset เป็นเลขคี่แล้ว (68+3=71)

        ArArchiveEntry e2 = ais.getNextArEntry(); // ต้องอ่าน padding byte ก่อน (offset % 2 != 0)
        assertNotNull(e2);
        assertEquals("second.txt", e2.getName());
        assertEquals(4L, e2.getSize());
    }

    @Test
    public void testGetNextEntry_DelegatesToGetNextArEntry() throws IOException {
        byte[] data = concat(HEADER_BYTES, buildEntryHeader("delegate.txt", 2));
        ArArchiveInputStream ais = new ArArchiveInputStream(new ByteArrayInputStream(data));
        ArchiveEntry entry = ais.getNextEntry();
        assertNotNull(entry);
        assertEquals("delegate.txt", entry.getName());
        assertEquals(2L, entry.getSize());
    }

    // ---------- close() ----------

    @Test
    public void testClose_ClosesUnderlyingStreamOnlyOnce() throws IOException {
        CountingInputStream cis = new CountingInputStream(new byte[0]);
        ArArchiveInputStream ais = new ArArchiveInputStream(cis);
        ais.close();
        ais.close(); // เรียกซ้ำ ต้องไม่ close underlying stream ซ้ำ
        assertEquals(1, cis.closeCount);
    }

    // ---------- read() : single byte ----------

    @Test
    public void testReadSingleByte_NonZeroByte_IncrementsOffset() throws Exception {
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[] { 5 }));
        int result = ais.read();
        assertEquals(5, result);
        assertEquals(1L, getOffset(ais));
    }

    @Test
    public void testReadSingleByte_ZeroByte_OffsetNotIncremented_DocumentedDefect() throws Exception {
        // หมายเหตุ: fault ที่มีอยู่จริงในซอร์ส เนื่องจากเงื่อนไข (ret > 0)
        // ใช้ "ค่าไบต์ที่อ่านได้" ตัดสิน ไม่ใช่ "จำนวนไบต์ที่อ่านสำเร็จ"
        // ทำให้ไบต์ค่า 0x00 (NUL) ถูกตีความเหมือน EOF และไม่ทำให้ offset เพิ่มขึ้น
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[] { 0 }));
        int result = ais.read();
        assertEquals(0, result); // อ่านค่าไบต์ 0 ได้จริง (ไม่ใช่ EOF)
        assertEquals(0L, getOffset(ais)); // แต่ offset ไม่ถูกเพิ่ม -> เผยให้เห็น defect
    }

    @Test
    public void testReadSingleByte_Eof_ReturnsMinusOne_OffsetUnchanged() throws Exception {
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[0]));
        int result = ais.read();
        assertEquals(-1, result);
        assertEquals(0L, getOffset(ais));
    }

    // ---------- read(byte[]) / read(byte[], off, len) ----------

    @Test
    public void testReadByteArray_NormalRead_IncrementsOffsetByCount() throws Exception {
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[] { 1, 2, 3, 0, 0 }));
        byte[] buf = new byte[5];
        int read = ais.read(buf);
        assertEquals(5, read);
        assertEquals(5L, getOffset(ais)); // นับตามจำนวนไบต์อ่านจริง ไม่ใช่ค่าไบต์
    }

    @Test
    public void testReadByteArrayOffLen_ZeroLength_OffsetUnchanged() throws Exception {
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[] { 1, 2, 3 }));
        byte[] buf = new byte[3];
        int read = ais.read(buf, 0, 0);
        assertEquals(0, read);
        assertEquals(0L, getOffset(ais));
    }

    @Test
    public void testReadByteArray_Eof_ReturnsMinusOne_OffsetUnchanged() throws Exception {
        ArArchiveInputStream ais = new ArArchiveInputStream(
                new ByteArrayInputStream(new byte[0]));
        byte[] buf = new byte[4];
        int read = ais.read(buf);
        assertEquals(-1, read);
        assertEquals(0L, getOffset(ais));
    }

    // ---------- matches(byte[], int) ----------

    @Test
    public void testMatches_LengthLessThan8_ReturnsFalse() {
        byte[] sig = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e }; // 7 ไบต์
        assertFalse(ArArchiveInputStream.matches(sig, 7));
    }

    @Test
    public void testMatches_AllBytesCorrect_ReturnsTrue() {
        byte[] sig = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        assertTrue(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatches_EachBytePositionWrong_ReturnsFalse() {
        byte[] correct = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        for (int i = 0; i < correct.length; i++) {
            byte[] sig = correct.clone();
            sig[i] = (byte) (sig[i] + 1); // ทำให้ตำแหน่งที่ i ผิด
            assertFalse("ตำแหน่งที่ " + i + " ควรทำให้ matches คืนค่า false",
                    ArArchiveInputStream.matches(sig, 8));
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetNextArEntry_ValidSingleEntry` | offset==0 (true) → header match ผ่าน, available()!=0, offset%2==0, trailer match ผ่าน, path สำเร็จทั้งหมด |
| `testGetNextArEntry_HeaderTooShort` | `read != expected.length` (header) → throw "failed to read header" |
| `testGetNextArEntry_InvalidHeaderContent` | loop เทียบ byte header ไม่ตรง → throw "invalid header" |
| `testGetNextArEntry_EofAfterHeader_ReturnsNull` | `input.available()==0` → return null |
| `testGetNextArEntry_TrailerReadFailure` | `read != expected.length` (trailer) → throw "failed to read entry header" |
| `testGetNextArEntry_TrailerMismatch` | loop เทียบ byte trailer ไม่ตรง → throw "invalid entry header" |
| `testGetNextArEntry_OddOffset_PaddingByteConsumed` | `offset % 2 != 0` (true) → เรียก `read()` เพื่อ skip padding, ตรวจ offset==0 (false) รอบสอง |
| `testGetNextEntry_DelegatesToGetNextArEntry` | `getNextEntry()` เรียก `getNextArEntry()` สำเร็จ |
| `testClose_ClosesUnderlyingStreamOnlyOnce` | `!closed` (true ครั้งแรก, false ครั้งสอง) ใน `close()` |
| `testReadSingleByte_NonZeroByte_IncrementsOffset` | `read()`: `ret > 0` = true (byte>0) |
| `testReadSingleByte_ZeroByte_OffsetNotIncremented_DocumentedDefect` | `read()`: `ret > 0` = false (byte==0) — เผย defect |
| `testReadSingleByte_Eof_ReturnsMinusOne_OffsetUnchanged` | `read()`: `ret > 0` = false (ret==-1, EOF) |
| `testReadByteArray_NormalRead_IncrementsOffsetByCount` | `read(b,off,len)`: `ret > 0` = true (นับจำนวนไบต์จริง) |
| `testReadByteArrayOffLen_ZeroLength_OffsetUnchanged` | `read(b,off,len)`: `ret > 0` = false (len=0 → ret=0) |
| `testReadByteArray_Eof_ReturnsMinusOne_OffsetUnchanged` | `read(b,off,len)`: `ret > 0` = false (ret==-1, EOF) |
| `testMatches_LengthLessThan8_ReturnsFalse` | `matches()`: `length < 8` = true |
| `testMatches_AllBytesCorrect_ReturnsTrue` | `matches()`: ทุก if-condition = false → return true |
| `testMatches_EachBytePositionWrong_ReturnsFalse` | `matches()`: แต่ละ `signature[i] != x` = true (ตำแหน่ง 0-7 ทั้งหมด) |

**ข้อสังเกต:** เทส `testReadSingleByte_ZeroByte_OffsetNotIncremented_DocumentedDefect` ถูกออกแบบมาเพื่อ "ยืนยัน" พฤติกรรมปัจจุบันของโค้ด (`ret > 0` ใช้ค่าไบต์ตัดสินแทนจำนวนไบต์ที่อ่านได้) ซึ่งเป็นข้อบกพร่องเชิงตรรกะที่อาจทำให้การนับ `offset` ผิดพลาดเมื่อพบไบต์ 0x00 — หากมีการแก้ไขโค้ดในอนาคต (เช่นเปลี่ยนเป็น `ret != -1`) เทสนี้จะ **fail** และช่วยดักจับการเปลี่ยนแปลง behavior ได้