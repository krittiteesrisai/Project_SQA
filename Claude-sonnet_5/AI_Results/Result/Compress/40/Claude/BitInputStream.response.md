# JUnit 4 Test Suite สำหรับ `BitInputStream`

## วิเคราะห์ Branch/Condition ที่ต้องครอบคลุม

1. `count < 0 || count > MAXIMUM_CACHE_SIZE` → true/false (2 เงื่อนไขย่อย)
2. `while (bitsCachedSize < count)` → เข้า loop 0 ครั้ง, 1 ครั้ง, หลายครั้ง
3. `if (nextByte < 0)` → EOF (true) / ไม่ EOF (false)
4. `if (byteOrder == ByteOrder.LITTLE_ENDIAN)` ภายใน loop → true/false
5. `if (byteOrder == ByteOrder.LITTLE_ENDIAN)` ตอนสกัดผลลัพธ์ → true/false
6. ค่าขอบเขต count = 0, count = 63 (MAXIMUM_CACHE_SIZE), count = -1, count = 64
7. `close()` และ `clearBitCache()`
8. IOException จาก underlying stream ต้อง propagate

```java
package org.apache.commons.compress.utils;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.junit.Test;

public class BitInputStreamTest {

    // ---------- Boundary / Invalid Argument Cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void readBits_negativeCount_throwsException() throws IOException {
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(new byte[]{0}), ByteOrder.BIG_ENDIAN);
        bis.readBits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readBits_countGreaterThanMax_throwsException() throws IOException {
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(new byte[]{0}), ByteOrder.BIG_ENDIAN);
        bis.readBits(64); // MAXIMUM_CACHE_SIZE + 1
    }

    @Test
    public void readBits_zeroCount_returnsZeroWithoutReadingStream() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        BitInputStream bis = new BitInputStream(mockIn, ByteOrder.BIG_ENDIAN);
        long result = bis.readBits(0);
        assertEquals(0L, result);
        verify(mockIn, never()).read(); // while-loop ไม่ควรถูกเข้า
    }

    @Test
    public void readBits_countEqualsMaximumCacheSize_noExceptionAllZeroBytes() throws IOException {
        // count == 63 (upper boundary ที่อนุญาต) ต้องไม่ throw
        byte[] data = new byte[8];
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        long result = bis.readBits(63);
        assertEquals(0L, result);
    }

    // ---------- Normal Reads: BIG_ENDIAN ----------

    @Test
    public void readBits_fullByte_bigEndian() throws IOException {
        byte[] data = {(byte) 0xAB};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        assertEquals(0xAB, bis.readBits(8));
    }

    @Test
    public void readBits_splitNibbles_bigEndian_highBitsFirst() throws IOException {
        // 0xF0 = 1111 0000  -> BIG_ENDIAN อ่านบิตสูงก่อน
        byte[] data = {(byte) 0xF0};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        long high = bis.readBits(4);
        long low  = bis.readBits(4);
        assertEquals(0xF, high);
        assertEquals(0x0, low);
    }

    @Test
    public void readBits_multiByteAccumulation_bigEndian() throws IOException {
        byte[] data = {0x12, 0x34};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        assertEquals(0x1234, bis.readBits(16));
    }

    @Test
    public void readBits_maxCount63_bigEndian_allOnes() throws IOException {
        byte[] data = new byte[8];
        for (int i = 0; i < 8; i++) data[i] = (byte) 0xFF;
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        assertEquals(Long.MAX_VALUE, bis.readBits(63)); // MASKS[63] = 0x7FFF...F
    }

    // ---------- Normal Reads: LITTLE_ENDIAN ----------

    @Test
    public void readBits_fullByte_littleEndian() throws IOException {
        byte[] data = {(byte) 0xAB};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xAB, bis.readBits(8));
    }

    @Test
    public void readBits_splitNibbles_littleEndian_lowBitsFirst() throws IOException {
        // 0xF0 = 1111 0000 -> LITTLE_ENDIAN อ่านบิตต่ำก่อน
        byte[] data = {(byte) 0xF0};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        long low  = bis.readBits(4);
        long high = bis.readBits(4);
        assertEquals(0x0, low);
        assertEquals(0xF, high);
    }

    @Test
    public void readBits_multiByteAccumulation_littleEndian() throws IOException {
        byte[] data = {0x12, 0x34};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        // ไบต์แรกอยู่ตำแหน่งบิตต่ำ, ไบต์ที่สองอยู่บิตสูง -> 0x3412
        assertEquals(0x3412, bis.readBits(16));
    }

    @Test
    public void readBits_maxCount63_littleEndian_allOnes() throws IOException {
        byte[] data = new byte[8];
        for (int i = 0; i < 8; i++) data[i] = (byte) 0xFF;
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN);
        assertEquals(Long.MAX_VALUE, bis.readBits(63));
    }

    // ---------- End of Stream (EOF) ----------

    @Test
    public void readBits_emptyStream_returnsMinusOneImmediately() throws IOException {
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(new byte[0]), ByteOrder.BIG_ENDIAN);
        assertEquals(-1L, bis.readBits(8)); // nextByte < 0 บน iteration แรก
    }

    @Test
    public void readBits_partialDataThenEof_returnsMinusOne() throws IOException {
        // มีแค่ 1 ไบต์ แต่ต้องการ 16 บิต -> EOF บน iteration ที่สอง
        byte[] data = {0x01};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);
        assertEquals(-1L, bis.readBits(16));
    }

    // ---------- clearBitCache() ----------

    @Test
    public void clearBitCache_resetsCachedBitsAndSize() throws IOException {
        byte[] data = {(byte) 0xF0, (byte) 0x0F};
        BitInputStream bis = new BitInputStream(
                new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);

        long first = bis.readBits(4); // อ่าน 4 บิตแรกจากไบต์แรก, เหลือ cache 4 บิต
        assertEquals(0xF, first);

        bis.clearBitCache(); // ล้าง cache ทิ้ง (bitsCached=0, bitsCachedSize=0)

        // อ่านไบต์ที่สองใหม่ทั้งหมด โดยไม่เอา cache เดิมมาปน
        long second = bis.readBits(8);
        assertEquals(0x0F, second);
    }

    // ---------- close() ----------

    @Test
    public void close_delegatesToUnderlyingInputStream() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        BitInputStream bis = new BitInputStream(mockIn, ByteOrder.BIG_ENDIAN);
        bis.close();
        verify(mockIn, times(1)).close();
    }

    // ---------- IOException Propagation ----------

    @Test(expected = IOException.class)
    public void readBits_ioExceptionFromUnderlyingStream_propagates() throws IOException {
        InputStream mockIn = mock(InputStream.class);
        when(mockIn.read()).thenThrow(new IOException("simulated failure"));
        BitInputStream bis = new BitInputStream(mockIn, ByteOrder.BIG_ENDIAN);
        bis.readBits(8);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `readBits_negativeCount_throwsException` | `count < 0` → true (IllegalArgumentException) |
| `readBits_countGreaterThanMax_throwsException` | `count > MAXIMUM_CACHE_SIZE` → true |
| `readBits_zeroCount_returnsZeroWithoutReadingStream` | `count` ผ่านเงื่อนไข validate (false); `while` loop เข้า 0 ครั้ง (count=0 boundary ล่าง) |
| `readBits_countEqualsMaximumCacheSize_noExceptionAllZeroBytes` | count=63 (boundary บน) ไม่ throw; loop เข้าหลายครั้งจน exit |
| `readBits_fullByte_bigEndian` | `byteOrder==LITTLE_ENDIAN` false (ทั้งใน loop และตอนสกัดผลลัพธ์), loop เข้า 1 ครั้ง |
| `readBits_splitNibbles_bigEndian_highBitsFirst` | ตรวจลำดับบิต BIG_ENDIAN ตอนสกัดผลลัพธ์ (call ที่ 2 ไม่เข้า loop เพราะ cache พอ) |
| `readBits_multiByteAccumulation_bigEndian` | loop เข้าหลายครั้ง (2 รอบ) พร้อม BIG_ENDIAN branch ใน loop |
| `readBits_maxCount63_bigEndian_allOnes` | loop เข้า 8 ครั้ง, ทดสอบ MASKS[63] และ overflow handling |
| `readBits_fullByte_littleEndian` | `byteOrder==LITTLE_ENDIAN` true (ทั้งใน loop และตอนสกัดผลลัพธ์) |
| `readBits_splitNibbles_littleEndian_lowBitsFirst` | ตรวจลำดับบิต LITTLE_ENDIAN (บิตต่ำออกก่อน) |
| `readBits_multiByteAccumulation_littleEndian` | loop เข้าหลายครั้งพร้อม LITTLE_ENDIAN branch ใน loop |
| `readBits_maxCount63_littleEndian_allOnes` | MASKS[63] กับ LITTLE_ENDIAN, `bitsCached >>>= count` |
| `readBits_emptyStream_returnsMinusOneImmediately` | `nextByte < 0` → true บน iteration แรก (EOF) |
| `readBits_partialDataThenEof_returnsMinusOne` | `nextByte < 0` → true บน iteration ที่ 2 (partial read then EOF) |
| `clearBitCache_resetsCachedBitsAndSize` | ทดสอบ method `clearBitCache()` ว่ารีเซ็ต state จริง |
| `close_delegatesToUnderlyingInputStream` | ทดสอบ method `close()` เรียก `in.close()` |
| `readBits_ioExceptionFromUnderlyingStream_propagates` | IOException จาก `in.read()` ต้อง propagate ออกจาก `readBits` |

**หมายเหตุ:** ทุกค่าคาดหวัง (expected values) คำนวณจาก logic จริงในซอร์สโค้ด (การจำลอง `bitsCached`, `bitsCachedSize`, `MASKS[]`) ไม่ได้เดา behavior เพิ่มเติมนอกเหนือจากที่ปรากฏใน source