# วิเคราะห์และออกแบบ Test Cases

จากการวิเคราะห์ซอร์สโค้ด พบว่าการทดสอบ decompression ของ block ข้อมูลจริง (BWT/MTF/Huffman) ทำได้ยากมากเพราะต้องมีข้อมูลที่ผ่านการบีบอัดจริงจาก encoder ซึ่งไม่มีอยู่ใน classpath ที่กำหนด ผมจึงใช้ **"minimal empty-content BZip2 stream"** (14 bytes ที่เป็นค่าคงที่ตามสเปค BZip2: header `BZh9` + EOS magic `0x177245385090` + CRC `0x00000000`) เป็นข้อมูลหลักในการทดสอบ path ที่ไม่ต้อง decode block จริง และเสริมด้วยการสร้าง byte array ผิดรูปแบบเพื่อยิง exception branch ต่าง ๆ

> **หมายเหตุ (ตามข้อกำหนดที่ 4):** เมธอดที่เกี่ยวกับการ decode ข้อมูลจริง เช่น `recvDecodingTables`, `getAndMoveToFrontDecode`, `setupRandPartB/C`, CRC mismatch ของ block ข้อมูลจริง ฯลฯ **ไม่ได้ถูกทดสอบ** เนื่องจากต้องใช้ byte stream ที่บีบอัดจริงซึ่งไม่สามารถสร้างได้โดยไม่มี BZip2 encoder อยู่ใน classpath — ไม่ขอเดาผลลัพธ์

```java
package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class BZip2CompressorInputStreamTest {

    // ---------------------------------------------------------------
    // Fixtures
    // ---------------------------------------------------------------

    /**
     * Minimal valid BZip2 stream representing an empty (zero-byte) payload.
     * Layout: "BZh9" (header, blockSize100k=9)
     *       + 0x17 0x72 0x45 0x38 0x50 0x90 (End-Of-Stream block magic)
     *       + 0x00 0x00 0x00 0x00 (combined CRC = 0)
     * รวม 14 bytes — เป็นค่าคงที่ที่รู้จักกันดีของ "smallest possible bzip2 file".
     */
    private static final byte[] EMPTY_BZIP2 = {
        0x42, 0x5A, 0x68, 0x39,
        0x17, 0x72, 0x45, 0x38, 0x50, (byte) 0x90,
        0x00, 0x00, 0x00, 0x00
    };

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] r = new byte[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }

    /** InputStream ที่ throw IOException ทุกครั้งที่ read() เพื่อทดสอบ propagation */
    private static class ThrowingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("boom");
        }
    }

    // ---------------------------------------------------------------
    // Constructor / init() branch tests
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testConstructor_NullInputStream_ThrowsIOException() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test
    public void testConstructor_EmptyUnderlyingStream_ThrowsIOException() {
        // magic0 == -1 && isFirstStream == true -> falls through to signature check -> fails
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[0]));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_InvalidSignature_ThrowsIOException() {
        byte[] bad = { 0x00, 0x00, 0x00 };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bad));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_InvalidBlockSizeChar_ThrowsIOException() {
        // "BZh" + '0' (blockSize < '1')
        byte[] bad = { 0x42, 0x5A, 0x68, 0x30 };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bad));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("BZip2 block size is invalid", e.getMessage());
        }
    }

    @Test
    public void testConstructor_BadBlockHeader_ThrowsIOException() {
        // header ok, then 6 bytes that match neither data-block magic nor EOS magic
        byte[] bad = { 0x42, 0x5A, 0x68, 0x39, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bad));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("bad block header", e.getMessage());
        }
    }

    @Test
    public void testConstructor_TruncatedAfterHeader_ThrowsIOException() {
        // only 4-byte header, EOF before block magic can be read fully
        byte[] bad = { 0x42, 0x5A, 0x68, 0x39 };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bad));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("unexpected end of stream", e.getMessage());
        }
    }

    @Test
    public void testConstructor_UnderlyingReadThrowsIOException_Propagates() {
        try {
            new BZip2CompressorInputStream(new ThrowingInputStream());
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // Empty-content valid stream tests (EOF path, decompressConcatenated true/false)
    // ---------------------------------------------------------------

    @Test
    public void testEmptyBzip2Stream_SingleArgConstructor_ReadReturnsEOF() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testEmptyBzip2Stream_DecompressConcatenatedTrue_ReturnsEOF() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2), true);
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testConcatenatedTwoEmptyStreams_DecompressConcatenatedTrue_ReturnsEOFAfterBoth()
        throws IOException {
        byte[] twoStreams = concat(EMPTY_BZIP2, EMPTY_BZIP2);
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(twoStreams), true);
        // ต้องอ่านผ่านทั้งสอง stream แล้วจึงเจอ EOF จริง
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testConcatenatedTwoEmptyStreams_DecompressConcatenatedFalse_StopsAfterFirst()
        throws IOException {
        byte[] twoStreams = concat(EMPTY_BZIP2, EMPTY_BZIP2);
        ByteArrayInputStream bais = new ByteArrayInputStream(twoStreams);
        BZip2CompressorInputStream in = new BZip2CompressorInputStream(bais, false);
        assertEquals(-1, in.read());
        // decompressConcatenated = false -> ไม่ควรอ่านสตรีมที่สองเลย
        assertEquals("second stream must remain unread",
                     EMPTY_BZIP2.length, bais.available());
        in.close();
    }

    // ---------------------------------------------------------------
    // close() tests
    // ---------------------------------------------------------------

    @Test
    public void testClose_ReadAfterClose_ThrowsIOException() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        in.close();
        try {
            in.read();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void testClose_ReadByteArrayAfterClose_ThrowsIOException() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        in.close();
        try {
            in.read(new byte[10], 0, 5);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void testClose_CalledTwice_NoException() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        in.close();
        in.close(); // ต้องไม่ throw เพราะ in == null บนรอบที่สอง
    }

    // ---------------------------------------------------------------
    // read(byte[], offs, len) boundary / validation tests
    // ---------------------------------------------------------------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_NegativeOffset_ThrowsIndexOutOfBounds() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        try {
            in.read(new byte[5], -1, 2);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_NegativeLength_ThrowsIndexOutOfBounds() throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        try {
            in.read(new byte[5], 0, -1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_OffsetPlusLenExceedsDestLength_ThrowsIndexOutOfBounds()
        throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        try {
            in.read(new byte[5], 3, 4); // 3+4=7 > 5
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadByteArray_ZeroLength_ReturnsMinusOne() throws IOException {
        // ตามซอร์ส: destOffs == offs เสมอเมื่อ len == 0 -> คืนค่า -1 (ไม่ใช่ 0 ตาม convention ปกติของ InputStream)
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        int result = in.read(new byte[5], 2, 0);
        assertEquals(-1, result);
        in.close();
    }

    @Test
    public void testReadByteArray_ExactBoundary_OffsetPlusLenEqualsDestLength_NoException()
        throws IOException {
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZIP2));
        // offs+len == dest.length พอดี -> ไม่ควร throw IndexOutOfBoundsException
        int result = in.read(new byte[5], 3, 2);
        assertEquals(-1, result); // stream ว่างเปล่าอยู่แล้ว
        in.close();
    }

    // ---------------------------------------------------------------
    // matches() static method tests
    // ---------------------------------------------------------------

    @Test
    public void testMatches_LengthLessThanThree_ReturnsFalse() {
        byte[] sig = { 0x42, 0x5A };
        assertFalse(BZip2CompressorInputStream.matches(sig, 2));
    }

    @Test
    public void testMatches_WrongFirstByte_ReturnsFalse() {
        byte[] sig = { 0x00, 0x5A, 0x68 };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_WrongSecondByte_ReturnsFalse() {
        byte[] sig = { 0x42, 0x00, 0x68 };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_WrongThirdByte_ReturnsFalse() {
        byte[] sig = { 0x42, 0x5A, 0x00 };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_ValidSignature_ExactLengthThree_ReturnsTrue() {
        byte[] sig = { 0x42, 0x5A, 0x68 };
        assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_ValidSignature_LengthGreaterThanThree_ReturnsTrue() {
        byte[] sig = EMPTY_BZIP2; // length 14, first 3 bytes are BZh
        assertTrue(BZip2CompressorInputStream.matches(sig, sig.length));
    }
}
```

# ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullInputStream_ThrowsIOException` | `init()`: `if (null == in)` → true |
| `testConstructor_EmptyUnderlyingStream_ThrowsIOException` | `init()`: `magic0==-1 && isFirstStream` → false (ไม่ return), signature check ผิด, `isFirstStream` true message branch |
| `testConstructor_InvalidSignature_ThrowsIOException` | `init()`: `magic0!='B' || magic1!='Z' || magic2!='h'` → true |
| `testConstructor_InvalidBlockSizeChar_ThrowsIOException` | `init()`: `(blockSize<'1')||(blockSize>'9')` → true |
| `testConstructor_BadBlockHeader_ThrowsIOException` | `initBlock()`: while-loop break (magic ไม่ตรง EOS), `if(magic!=data-block-magic)` → true → throw |
| `testConstructor_TruncatedAfterHeader_ThrowsIOException` | `bsR()`: `thech<0` → throw "unexpected end of stream" |
| `testConstructor_UnderlyingReadThrowsIOException_Propagates` | Exception propagation จาก `in.read()` ภายใน `init()` |
| `testEmptyBzip2Stream_SingleArgConstructor_ReadReturnsEOF` | Constructor `(InputStream)` delegate → `(in,false)`, `initBlock` while-loop match EOS ครั้งเดียว, `complete()` short-circuit `!decompressConcatenated` true |
| `testEmptyBzip2Stream_DecompressConcatenatedTrue_ReturnsEOF` | `complete()`: ประเมิน `!init(false)` เมื่อ stream หมด → true |
| `testConcatenatedTwoEmptyStreams_DecompressConcatenatedTrue_ReturnsEOFAfterBoth` | `initBlock` while-loop วนซ้ำ 2 รอบ, `complete()` คืน false (continue loop) แล้วคืน true รอบสุดท้าย |
| `testConcatenatedTwoEmptyStreams_DecompressConcatenatedFalse_StopsAfterFirst` | `complete()`: `!decompressConcatenated` → true (short-circuit ไม่เรียก `init(false)`) |
| `testClose_ReadAfterClose_ThrowsIOException` | `read()`: `if(this.in!=null)` → false → throw |
| `testClose_ReadByteArrayAfterClose_ThrowsIOException` | `read(byte[],..)`: `if(this.in==null)` → true → throw |
| `testClose_CalledTwice_NoException` | `close()`: `if(inShadow!=null)` → false บนรอบสอง |
| `testReadByteArray_NegativeOffset_*` | `read(byte[],..)`: `offs<0` → true |
| `testReadByteArray_NegativeLength_*` | `read(byte[],..)`: `len<0` → true |
| `testReadByteArray_OffsetPlusLenExceedsDestLength_*` | `read(byte[],..)`: `offs+len>dest.length` → true |
| `testReadByteArray_ZeroLength_ReturnsMinusOne` | while-loop ไม่ execute (`destOffs<hi` false ทันที), `destOffs==offs` → true → return -1 |
| `testReadByteArray_ExactBoundary_*` | `offs+len>dest.length` → false (boundary เท่ากันไม่ throw), loop `b>=0` false ทันที |
| `testMatches_LengthLessThanThree_*` | `matches()`: `length<3` → true |
| `testMatches_WrongFirstByte_*` | `matches()`: `signature[0]!='B'` → true |
| `testMatches_WrongSecondByte_*` | `matches()`: `signature[1]!='Z'` → true |
| `testMatches_WrongThirdByte_*` | `matches()`: `signature[2]!='h'` → true |
| `testMatches_ValidSignature_ExactLengthThree_*` | `matches()`: ทุก condition false → return true (boundary length==3) |
| `testMatches_ValidSignature_LengthGreaterThanThree_*` | `matches()`: length>3 ยังคืน true ถูกต้อง |

**Branch ที่ไม่ได้ครอบคลุม (ระบุไว้อย่างชัดเจน ไม่เดา):** การ decode block ข้อมูลจริง (`recvDecodingTables`, `getAndMoveToFrontDecode`, `setupRandPartB/C`, `endBlock` CRC mismatch, `close()` เมื่อ `in==System.in`) เนื่องจากไม่มีเครื่องมือ BZip2 encoder ใน classpath ที่กำหนดสำหรับสร้างข้อมูลบีบอัดจริงที่ถูกต้อง