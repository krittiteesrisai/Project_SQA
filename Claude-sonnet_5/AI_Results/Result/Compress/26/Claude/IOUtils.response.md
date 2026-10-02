# JUnit 4 Test Suite สำหรับ IOUtils

## โค้ดชุดทดสอบ

```java
package org.apache.commons.compress.utils;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class IOUtilsTest {

    // ========== Helper classes สำหรับควบคุม behavior ==========

    /** InputStream ที่ควบคุมค่าที่ skip() จะคืนในแต่ละครั้งที่ถูกเรียก */
    private static class ControlledSkipInputStream extends InputStream {
        private final long[] skipReturns;
        private int index = 0;

        ControlledSkipInputStream(long[] skipReturns) {
            this.skipReturns = skipReturns;
        }

        @Override
        public int read() throws IOException {
            return -1;
        }

        @Override
        public long skip(long n) throws IOException {
            if (index < skipReturns.length) {
                return skipReturns[index++];
            }
            return 0;
        }
    }

    /** InputStream ที่จำกัดจำนวนไบต์ที่คืนต่อการ read() หนึ่งครั้ง (บังคับ partial read) */
    private static class LimitedReadInputStream extends InputStream {
        private final byte[] data;
        private int pos = 0;
        private final int maxBytesPerRead;

        LimitedReadInputStream(byte[] data, int maxBytesPerRead) {
            this.data = data;
            this.maxBytesPerRead = maxBytesPerRead;
        }

        @Override
        public int read() throws IOException {
            if (pos >= data.length) return -1;
            return data[pos++] & 0xff;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (pos >= data.length) {
                return -1;
            }
            int toRead = Math.min(len, maxBytesPerRead);
            toRead = Math.min(toRead, data.length - pos);
            System.arraycopy(data, pos, b, off, toRead);
            pos += toRead;
            return toRead;
        }
    }

    /** Closeable ที่ throw IOException เมื่อ close() ถูกเรียก */
    private static class ThrowingCloseable implements Closeable {
        boolean closeCalled = false;

        @Override
        public void close() throws IOException {
            closeCalled = true;
            throw new IOException("boom");
        }
    }

    /** Closeable ปกติที่บันทึกว่า close() ถูกเรียก */
    private static class NormalCloseable implements Closeable {
        boolean closeCalled = false;

        @Override
        public void close() throws IOException {
            closeCalled = true;
        }
    }

    // ========== copy(InputStream, OutputStream) ==========

    @Test
    public void testCopyDefaultBufferEmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out);
        assertEquals(0L, count);
        assertEquals(0, out.toByteArray().length);
    }

    @Test
    public void testCopyDefaultBufferWithData() throws IOException {
        byte[] data = "Hello World".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out);
        assertEquals(data.length, count);
        assertArrayEquals(data, out.toByteArray());
    }

    // ========== copy(InputStream, OutputStream, int) ==========

    @Test
    public void testCopyWithSmallBufferMultipleLoops() throws IOException {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out, 10); // buffer เล็ก -> loop วนหลายรอบ
        assertEquals(100L, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyWithBufferSizeEqualDataLength() throws IOException {
        byte[] data = "abc".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out, 3);
        assertEquals(3L, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test(expected = NullPointerException.class)
    public void testCopyNullInputThrowsNPE() throws IOException {
        // ไม่มีการตรวจ null ในซอร์ส -> คาดว่าจะเกิด NPE ตอนเรียก input.read()
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(null, out, 10);
    }

    // ========== skip(InputStream, long) ==========

    @Test
    public void testSkipZeroBytesRequested() throws IOException {
        // numToSkip = 0 -> ไม่เข้า while loop เลย
        InputStream in = new ControlledSkipInputStream(new long[]{});
        long skipped = IOUtils.skip(in, 0);
        assertEquals(0L, skipped);
    }

    @Test
    public void testSkipFullAmountInOneCall() throws IOException {
        // skip() คืนค่าเต็มจำนวนในครั้งเดียว -> loop จบเพราะ numToSkip=0 ไม่ break
        InputStream in = new ControlledSkipInputStream(new long[]{50});
        long skipped = IOUtils.skip(in, 50);
        assertEquals(50L, skipped);
    }

    @Test
    public void testSkipReturnsZeroTriggersBreak() throws IOException {
        // skip() คืน 0 ทันที -> break, ผลลัพธ์ = available - numToSkip = 0
        InputStream in = new ControlledSkipInputStream(new long[]{0});
        long skipped = IOUtils.skip(in, 100);
        assertEquals(0L, skipped);
    }

    @Test
    public void testSkipPartialMultipleLoops() throws IOException {
        // skip() คืนน้อยกว่าที่ขอในแต่ละครั้ง จนครบจำนวน -> loop วนหลายรอบ
        InputStream in = new ControlledSkipInputStream(new long[]{10, 10, 10, 10, 10});
        long skipped = IOUtils.skip(in, 50);
        assertEquals(50L, skipped);
    }

    @Test
    public void testSkipPartialThenZero() throws IOException {
        // skip บางส่วนสำเร็จ แล้วคืน 0 -> break ก่อนครบจำนวนที่ขอ
        InputStream in = new ControlledSkipInputStream(new long[]{20, 0});
        long skipped = IOUtils.skip(in, 50);
        assertEquals(20L, skipped);
    }

    // ========== readFully(InputStream, byte[]) ==========

    @Test
    public void testReadFullyTwoArgFullRead() throws IOException {
        byte[] data = "12345".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[5];
        int n = IOUtils.readFully(in, buf);
        assertEquals(5, n);
        assertArrayEquals(data, buf);
    }

    @Test
    public void testReadFullyTwoArgPartialRead() throws IOException {
        // stream มีข้อมูลน้อยกว่า buffer -> x==-1 -> break
        byte[] data = "123".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[10];
        int n = IOUtils.readFully(in, buf);
        assertEquals(3, n);
    }

    // ========== readFully(InputStream, byte[], int, int) ==========

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeLenThrows() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        byte[] buf = new byte[10];
        IOUtils.readFully(in, buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeOffsetThrows() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        byte[] buf = new byte[10];
        IOUtils.readFully(in, buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyLenPlusOffsetExceedsBufferThrows() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        byte[] buf = new byte[10];
        IOUtils.readFully(in, buf, 5, 10); // 5+10=15 > 10
    }

    @Test
    public void testReadFullyExactLengthNoEOF() throws IOException {
        // อ่านครบตาม len ทันที โดยไม่เจอ EOF (count==len ก่อน x==-1)
        byte[] data = "abcdef".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[6];
        int n = IOUtils.readFully(in, buf, 0, 6);
        assertEquals(6, n);
        assertArrayEquals(data, buf);
    }

    @Test
    public void testReadFullyOffsetWithinBuffer() throws IOException {
        byte[] data = "xyz".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[10];
        int n = IOUtils.readFully(in, buf, 2, 3);
        assertEquals(3, n);
        assertEquals('x', buf[2]);
        assertEquals('y', buf[3]);
        assertEquals('z', buf[4]);
    }

    @Test
    public void testReadFullyHitsEOFBeforeLen() throws IOException {
        // ข้อมูลน้อยกว่า len ที่ขอ -> x==-1 -> break ก่อนครบ
        byte[] data = "ab".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[10];
        int n = IOUtils.readFully(in, buf, 0, 10);
        assertEquals(2, n);
    }

    @Test
    public void testReadFullyMultiplePartialReadsUntilFull() throws IOException {
        // read คืนค่าทีละน้อย (partial) เพื่อให้ loop วนหลายรอบจนครบ len
        byte[] data = new byte[20];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        InputStream in = new LimitedReadInputStream(data, 3);
        byte[] buf = new byte[20];
        int n = IOUtils.readFully(in, buf, 0, 20);
        assertEquals(20, n);
        assertArrayEquals(data, buf);
    }

    @Test
    public void testReadFullyZeroLength() throws IOException {
        // len=0 -> count(0)==len(0) ทันที ไม่เข้า loop เลย
        InputStream in = new ByteArrayInputStream("abc".getBytes());
        byte[] buf = new byte[10];
        int n = IOUtils.readFully(in, buf, 0, 0);
        assertEquals(0, n);
    }

    // ========== toByteArray(InputStream) ==========

    @Test
    public void testToByteArrayWithData() throws IOException {
        byte[] data = "test data".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] result = IOUtils.toByteArray(in);
        assertArrayEquals(data, result);
    }

    @Test
    public void testToByteArrayEmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        byte[] result = IOUtils.toByteArray(in);
        assertEquals(0, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArrayNullInputThrowsNPE() throws IOException {
        IOUtils.toByteArray(null);
    }

    // ========== closeQuietly(Closeable) ==========

    @Test
    public void testCloseQuietlyWithNull() {
        // c == null -> ไม่ทำอะไร, ต้องไม่ throw exception
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietlyNormalClose() {
        NormalCloseable closeable = new NormalCloseable();
        IOUtils.closeQuietly(closeable);
        assertTrue(closeable.closeCalled);
    }

    @Test
    public void testCloseQuietlySwallowsIOException() {
        ThrowingCloseable closeable = new ThrowingCloseable();
        // ต้องไม่ throw exception ออกมา แม้ close() จะ throw IOException ภายใน
        IOUtils.closeQuietly(closeable);
        assertTrue(closeable.closeCalled);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCopyDefaultBufferEmptyStream` | `copy(2-arg)`: while-loop ไม่ execute เลย (n=-1 ทันที) |
| `testCopyDefaultBufferWithData` | `copy(2-arg)`: while-loop execute อย่างน้อย 1 รอบ |
| `testCopyWithSmallBufferMultipleLoops` | `copy(3-arg)`: while-loop วนหลายรอบ (data > buffer) |
| `testCopyWithBufferSizeEqualDataLength` | `copy(3-arg)`: while-loop วน 1 รอบพอดี |
| `testCopyNullInputThrowsNPE` | `copy(3-arg)`: กรณี input=null (ไม่มีการเช็คใน source) |
| `testSkipZeroBytesRequested` | `skip`: while-condition (`numToSkip>0`) เป็น false ทันที |
| `testSkipFullAmountInOneCall` | `skip`: `skipped!=0`, loop จบตามปกติ (ไม่ break) |
| `testSkipReturnsZeroTriggersBreak` | `skip`: `skipped==0` → break ในรอบแรก |
| `testSkipPartialMultipleLoops` | `skip`: loop วนหลายรอบด้วย partial skip จนครบ |
| `testSkipPartialThenZero` | `skip`: partial skip แล้ว break กลางทาง |
| `testReadFullyTwoArgFullRead` | `readFully(2-arg)` → เรียก 4-arg, อ่านครบ |
| `testReadFullyTwoArgPartialRead` | `readFully(2-arg)` → 4-arg, x==-1 กลางทาง |
| `testReadFullyNegativeLenThrows` | `readFully(4-arg)`: condition `len<0` true |
| `testReadFullyNegativeOffsetThrows` | `readFully(4-arg)`: condition `offset<0` true |
| `testReadFullyLenPlusOffsetExceedsBufferThrows` | `readFully(4-arg)`: condition `len+offset>b.length` true |
| `testReadFullyExactLengthNoEOF` | `readFully(4-arg)`: while-loop จบเพราะ `count==len` (ไม่ break) |
| `testReadFullyOffsetWithinBuffer` | `readFully(4-arg)`: ทดสอบ offset ทำงานถูกต้อง |
| `testReadFullyHitsEOFBeforeLen` | `readFully(4-arg)`: `x==-1` → break ก่อนครบ len |
| `testReadFullyMultiplePartialReadsUntilFull` | `readFully(4-arg)`: while-loop วนหลายรอบด้วย partial read |
| `testReadFullyZeroLength` | `readFully(4-arg)`: `len=0` → while-condition false ทันที |
| `testToByteArrayWithData` | `toByteArray`: กรณีข้อมูลปกติ (เรียก copy ภายใน) |
| `testToByteArrayEmptyStream` | `toByteArray`: กรณี stream ว่าง |
| `testToByteArrayNullInputThrowsNPE` | `toByteArray`: null input (ไม่มีการเช็คใน source, พึ่ง NPE จาก copy) |
| `testCloseQuietlyWithNull` | `closeQuietly`: condition `c!=null` เป็น false |
| `testCloseQuietlyNormalClose` | `closeQuietly`: condition `c!=null` true, try success |
| `testCloseQuietlySwallowsIOException` | `closeQuietly`: try-catch จับ IOException (swallow) |

**หมายเหตุ:**
- กรณี `toByteArray(null)` และ `copy(null, ...)` ไม่มี explicit null-check ในซอร์ส แต่จะเกิด `NullPointerException` โดยอัตโนมัติจาก `input.read()` — จึงเขียนเทสตาม behavior จริงที่คาดว่าจะเกิดขึ้น
- `skip()` ตาม comment ใน source บอกว่าจะ fallback ไปใช้ `read()` เมื่อ `skip()` คืน 0 แต่ในโค้ดจริงไม่มี fallback logic นี้ (เป็น known defect ของ Compress-26b) — เทส `testSkipReturnsZeroTriggersBreak` และ `testSkipPartialThenZero` จึงยืนยัน behavior จริงตามโค้ด (break ทันที) ไม่ใช่ตาม comment ที่ล้าสมัย