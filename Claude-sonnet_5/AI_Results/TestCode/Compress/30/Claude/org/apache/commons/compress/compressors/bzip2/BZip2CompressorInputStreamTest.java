package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * JUnit4 tests for BZip2CompressorInputStream (Defects4J Compress-30b).
 *
 * หมายเหตุ: บาง branch ภายใน (เช่น CRC mismatch ที่ต้อง craft bit-level ให้ตรงกับ
 * CRC algorithm พอดี, "block overrun", blockRandomised == true ซึ่ง encoder ปัจจุบัน
 * ไม่ผลิตแล้ว) ไม่สามารถสร้าง input ที่ deterministic ได้จากซอร์สที่ให้มา
 * จึงไม่ครอบคลุมในชุดทดสอบนี้ เพื่อไม่เดา behavior
 */
public class BZip2CompressorInputStreamTest {

    // ---------- helpers ----------

    private byte[] compress(byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(baos);
        bzOut.write(data);
        bzOut.close();
        return baos.toByteArray();
    }

    private byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        return out.toByteArray();
    }

    // ---------- matches() ----------

    @Test
    public void testMatches_LengthLessThanThree_ReturnsFalse() {
        byte[] sig = {'B', 'Z', 'h'};
        assertFalse(BZip2CompressorInputStream.matches(sig, 2));
    }

    @Test
    public void testMatches_FirstByteMismatch_ReturnsFalse() {
        byte[] sig = {'X', 'Z', 'h'};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_SecondByteMismatch_ReturnsFalse() {
        byte[] sig = {'B', 'X', 'h'};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_ThirdByteMismatch_ReturnsFalse() {
        byte[] sig = {'B', 'Z', 'X'};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_AllMatch_ReturnsTrue() {
        byte[] sig = {'B', 'Z', 'h'};
        assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    // ---------- constructor / init() ----------

    @Test
    public void testConstructor_NullInputStream_ThrowsIOException() {
        try {
            new BZip2CompressorInputStream(null);
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("No InputStream", e.getMessage());
        }
    }

    @Test
    public void testConstructor_EmptyStream_ThrowsIOException() {
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[0]));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_WrongMagicByte0_ThrowsIOException() {
        byte[] bytes = {'X', 'Z', 'h', '1'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_WrongMagicByte1_ThrowsIOException() {
        byte[] bytes = {'B', 'X', 'h', '1'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_WrongMagicByte2_ThrowsIOException() {
        byte[] bytes = {'B', 'Z', 'X', '1'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void testConstructor_BlockSizeTooSmall_ThrowsIOException() {
        // '0' < '1'  -> first side of OR
        byte[] bytes = {'B', 'Z', 'h', '0'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("BZip2 block size is invalid", e.getMessage());
        }
    }

    @Test
    public void testConstructor_BlockSizeTooLarge_ThrowsIOException() {
        // ':' (58) > '9' (57) -> second side of OR
        byte[] bytes = {'B', 'Z', 'h', ':'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("BZip2 block size is invalid", e.getMessage());
        }
    }

    @Test
    public void testConstructor_TruncatedAfterHeader_ThrowsUnexpectedEOF() {
        // header OK, ไม่มี block-magic bytes ตามมาเลย
        byte[] bytes = {'B', 'Z', 'h', '1'};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("unexpected end of stream", e.getMessage());
        }
    }

    @Test
    public void testConstructor_BadBlockHeader_ThrowsIOException() {
        // header OK แต่ block-magic ไม่ตรงทั้ง end-marker และ start-marker
        byte[] bytes = {'B', 'Z', 'h', '1', 0, 0, 0, 0, 0, 0};
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("bad block header", e.getMessage());
        }
    }

    @Test
    public void testConstructor_EmptyBlockStream_ReturnsMinusOneOnRead()
            throws IOException {
        // header OK + end-of-stream magic ทันที + combinedCRC = 0 (ตรงกับค่าเริ่มต้น)
        byte[] bytes = {
            'B', 'Z', 'h', '1',
            0x17, 0x72, 0x45, 0x38, 0x50, (byte) 0x90, // end-of-stream magic
            0, 0, 0, 0 // storedCombinedCRC == 0 == computedCombinedCRC initial
        };
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(bytes));
        assertEquals(-1, in.read());
        in.close();
    }

    // ---------- round-trip decoding ----------

    @Test
    public void testRoundTrip_SmallContent() throws IOException {
        byte[] original = "Hello BZip2 World! Hello BZip2 World! 1234567890"
            .getBytes("UTF-8");
        byte[] compressed = compress(original);

        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] decoded = readAll(in);
        in.close();

        assertArrayEquals(original, decoded);
    }

    @Test
    public void testRoundTrip_EmptyContent() throws IOException {
        byte[] original = new byte[0];
        byte[] compressed = compress(original);

        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] decoded = readAll(in);
        in.close();

        assertArrayEquals(original, decoded);
    }

    @Test
    public void testRoundTrip_BlockSizeDigitBoundaryOne() throws IOException {
        byte[] original = "small content for block size boundary test".getBytes("UTF-8");
        byte[] compressed = compress(original);

        // แก้ digit ที่ตำแหน่ง index 3 ให้เป็นค่าขอบเขตล่าง '1'
        byte[] patched = compressed.clone();
        patched[3] = '1';

        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(patched));
        byte[] decoded = readAll(in);
        in.close();

        assertArrayEquals(original, decoded);
    }

    // ---------- read(byte[], offs, len) boundaries ----------

    @Test
    public void testReadByteArray_NegativeOffset_ThrowsIOOBE() throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        try {
            in.read(new byte[10], -1, 5);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadByteArray_NegativeLength_ThrowsIOOBE() throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        try {
            in.read(new byte[10], 0, -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadByteArray_OffsetPlusLenExceedsDestLength_ThrowsIOOBE()
            throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        try {
            in.read(new byte[10], 5, 10); // 5+10 > 10
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadByteArray_ZeroLength_AlwaysReturnsMinusOne()
            throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        // len == 0 -> destOffs == offs ทันที -> ต้อง return -1 แม้ยังมีข้อมูลให้อ่าน
        int result = in.read(new byte[10], 0, 0);
        assertEquals(-1, result);
        in.close();
    }

    @Test
    public void testReadByteArray_NormalRead_ReturnsData() throws IOException {
        byte[] original = "abcdef".getBytes("UTF-8");
        byte[] compressed = compress(original);
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] dest = new byte[100];
        int n = in.read(dest, 2, 6);
        assertEquals(original.length, n);
        for (int i = 0; i < original.length; i++) {
            assertEquals(original[i], dest[2 + i]);
        }
        in.close();
    }

    // ---------- closed-stream behaviour ----------

    @Test
    public void testRead_AfterClose_ThrowsIOException() throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        in.close();
        try {
            in.read();
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void testReadByteArray_AfterClose_ThrowsIOException() throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        in.close();
        try {
            in.read(new byte[10], 0, 5);
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void testClose_Idempotent() throws IOException {
        byte[] compressed = compress("abc".getBytes("UTF-8"));
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        in.close();
        in.close(); // ต้องไม่ throw
    }

    // ---------- concatenated streams ----------

    @Test
    public void testDecompressConcatenated_True_ReadsAllStreams() throws IOException {
        byte[] a = compress("FirstStreamContent".getBytes("UTF-8"));
        byte[] b = compress("SecondStreamContent".getBytes("UTF-8"));
        byte[] concatenated = new byte[a.length + b.length];
        System.arraycopy(a, 0, concatenated, 0, a.length);
        System.arraycopy(b, 0, concatenated, a.length, b.length);

        BZip2CompressorInputStream in = new BZip2CompressorInputStream(
            new ByteArrayInputStream(concatenated), true);
        byte[] decoded = readAll(in);
        in.close();

        byte[] expected = "FirstStreamContentSecondStreamContent".getBytes("UTF-8");
        assertArrayEquals(expected, decoded);
    }

    @Test
    public void testDecompressConcatenated_False_ReadsOnlyFirstStream()
            throws IOException {
        byte[] a = compress("FirstStreamContent".getBytes("UTF-8"));
        byte[] b = compress("SecondStreamContent".getBytes("UTF-8"));
        byte[] concatenated = new byte[a.length + b.length];
        System.arraycopy(a, 0, concatenated, 0, a.length);
        System.arraycopy(b, 0, concatenated, a.length, b.length);

        BZip2CompressorInputStream in = new BZip2CompressorInputStream(
            new ByteArrayInputStream(concatenated), false);
        byte[] decoded = readAll(in);
        in.close();

        byte[] expected = "FirstStreamContent".getBytes("UTF-8");
        assertArrayEquals(expected, decoded);
    }

    @Test
    public void testDecompressConcatenated_NoSecondStream_CompletesNormally()
            throws IOException {
        byte[] a = compress("OnlyOneStream".getBytes("UTF-8"));

        BZip2CompressorInputStream in = new BZip2CompressorInputStream(
            new ByteArrayInputStream(a), true);
        byte[] decoded = readAll(in);
        in.close();

        assertArrayEquals("OnlyOneStream".getBytes("UTF-8"), decoded);
    }

    @Test
    public void testDecompressConcatenated_GarbageAfterFirstStream_ThrowsIOException()
            throws IOException {
        byte[] a = compress("ValidFirstStream".getBytes("UTF-8"));
        byte[] garbage = {9, 9, 9, 9};
        byte[] concatenated = new byte[a.length + garbage.length];
        System.arraycopy(a, 0, concatenated, 0, a.length);
        System.arraycopy(garbage, 0, concatenated, a.length, garbage.length);

        BZip2CompressorInputStream in = new BZip2CompressorInputStream(
            new ByteArrayInputStream(concatenated), true);
        try {
            readAll(in);
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("Garbage after a valid BZip2 stream", e.getMessage());
        } finally {
            in.close();
        }
    }

    // ---------- one-arg constructor delegates decompressConcatenated=false ----------

    @Test
    public void testOneArgConstructor_DefaultsToNonConcatenated() throws IOException {
        byte[] a = compress("A".getBytes("UTF-8"));
        byte[] b = compress("B".getBytes("UTF-8"));
        byte[] concatenated = new byte[a.length + b.length];
        System.arraycopy(a, 0, concatenated, 0, a.length);
        System.arraycopy(b, 0, concatenated, a.length, b.length);

        // ใช้ constructor แบบ 1 อาร์กิวเมนต์ -> ควร behave เหมือน decompressConcatenated=false
        BZip2CompressorInputStream in =
            new BZip2CompressorInputStream(new ByteArrayInputStream(concatenated));
        byte[] decoded = readAll(in);
        in.close();

        assertArrayEquals("A".getBytes("UTF-8"), decoded);
    }
}
