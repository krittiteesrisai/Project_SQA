package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * JUnit4 tests for {@link Base64InputStream} (Defects4J Codec-8b).
 *
 * หมายเหตุ (comment สำคัญ):
 * - เมธอด read() มี loop "while (r == 0) r = read(singleByte, 0, 1);"
 *   จากการวิเคราะห์ read(byte[], int, int) พบว่าเมื่อ len > 0 เมธอดนี้จะไม่ return 0
 *   ออกไปเลย (loop ภายในของมันเองจะวนจนกว่า readLen != 0 หรือ EOF -1)
 *   ดังนั้น branch "r == 0" ใน read() อาจเป็น dead-code ในทางปฏิบัติ
 *   เราจึงไม่สามารถ "เดา" สร้าง input ที่ทำให้ r == 0 ได้จริงจากซอร์สที่ให้มา
 *   -> ทดสอบเฉพาะ r > 0 และ r <= 0 (EOF) ตามที่วิเคราะห์ได้จริง
 */
public class Base64InputStreamTest {

    // ---------- Helper ----------

    private byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n;
        while ((n = is.read(buf)) != -1) {
            baos.write(buf, 0, n);
        }
        return baos.toByteArray();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructorDecodesByDefault() throws IOException {
        byte[] encoded = Base64.encodeBase64("Hello".getBytes());
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] result = readAll(is);
        assertArrayEquals("Hello".getBytes(), result);
    }

    @Test
    public void testTwoArgConstructorEncodeTrue() throws IOException {
        byte[] input = "Hello World".getBytes();
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(input), true);
        byte[] result = readAll(is);
        byte[] expected = Base64.encodeBase64(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoArgConstructorEncodeFalse() throws IOException {
        byte[] encoded = Base64.encodeBase64("Hello World".getBytes());
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] result = readAll(is);
        assertArrayEquals("Hello World".getBytes(), result);
    }

    @Test
    public void testFourArgConstructorWithCustomLineLengthAndSeparator() throws IOException {
        byte[] input = "abcdefghijklmnopqrstuvwxyz0123456789".getBytes();
        byte[] lineSep = "\n".getBytes();
        int lineLength = 4;

        // ใช้ Base64 class เดียวกันเป็น reference implementation เพื่อคำนวณค่า expected
        Base64 refBase64 = new Base64(lineLength, lineSep);
        byte[] expected = refBase64.encode(input);

        Base64InputStream is = new Base64InputStream(
                new ByteArrayInputStream(input), true, lineLength, lineSep);
        byte[] actual = readAll(is);

        assertArrayEquals(expected, actual);
    }

    // ---------- markSupported ----------

    @Test
    public void testMarkSupportedAlwaysFalse() {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(is.markSupported());
    }

    // ---------- read() : single byte ----------

    @Test
    public void testReadSingleByte_EOF_EmptyStream() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, is.read());
    }

    @Test
    public void testReadSingleByte_NormalPositiveValue() throws IOException {
        // 'A' = 65, decode ของ "QQ==" ต้องได้ 65 (r>0 branch, singleByte[0]>=0)
        byte[] encoded = Base64.encodeBase64(new byte[] { 65 });
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded));
        int result = is.read();
        assertEquals(65, result);
    }

    @Test
    public void testReadSingleByte_HighValueBranch_SingleByteNegative() throws IOException {
        // สร้างค่า byte ที่ decode ออกมาแล้วเป็นค่าลบในระดับ byte (0xFF)
        // เพื่อทดสอบ branch: singleByte[0] < 0 -> return 256 + singleByte[0]
        byte[] original = { (byte) 0xFF };
        byte[] encoded = Base64.encodeBase64(original);
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded));
        int result = is.read();
        assertEquals(255, result); // 256 + (-1) = 255
    }

    @Test
    public void testReadSingleByte_MultipleSequentialReads() throws IOException {
        byte[] input = "AB".getBytes();
        byte[] encoded = Base64.encodeBase64(input);
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded));
        assertEquals('A', is.read());
        assertEquals('B', is.read());
        assertEquals(-1, is.read()); // EOF after data exhausted
    }

    // ---------- read(byte[], int, int) : validation branches ----------

    @Test(expected = NullPointerException.class)
    public void testRead_NullArray_ThrowsNPE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        is.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_NegativeOffset_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        is.read(new byte[10], -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_NegativeLen_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        is.read(new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_OffsetGreaterThanArrayLength_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        is.read(new byte[5], 6, 0); // offset > b.length
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_OffsetPlusLenGreaterThanArrayLength_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        is.read(new byte[5], 3, 5); // offset+len > b.length
    }

    @Test
    public void testRead_LenZero_ReturnsZero() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        int result = is.read(new byte[5], 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testRead_OffsetEqualsLengthWithLenZero_NoException() throws IOException {
        // offset == b.length, len == 0 -> ไม่ควร throw (ผ่านทุกเงื่อนไข if ไปที่ len==0)
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        int result = is.read(new byte[5], 5, 0);
        assertEquals(0, result);
    }

    // ---------- read(byte[], int, int) : main logic branches ----------

    @Test
    public void testRead_SetInitialBufferBranch_WhenBufferLengthEqualsLen() throws IOException {
        // เรียก read(b, 0, b.length) โดยตรง เพื่อให้ b.length == len -> setInitialBuffer branch ถูกเรียก
        byte[] input = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64(input);
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded), false);

        byte[] buf = new byte[100];
        int n = is.read(buf, 0, buf.length); // len == buf.length -> true branch
        byte[] result = new byte[n];
        System.arraycopy(buf, 0, result, 0, n);
        assertArrayEquals(input, result);
    }

    @Test
    public void testRead_SetInitialBufferBranch_WhenBufferLengthNotEqualsLen() throws IOException {
        // เรียก read(b, 0, len) โดยที่ len < b.length -> false branch (ไม่เรียก setInitialBuffer)
        byte[] input = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64(input);
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded), false);

        byte[] buf = new byte[100];
        int n = is.read(buf, 0, 5); // len (5) != buf.length (100)
        // ต้องอ่านได้บางส่วนโดยไม่ throw exception; ผลลัพธ์ยังต้องถูกต้องตามลำดับ decode
        byte[] partial = new byte[n];
        System.arraycopy(buf, 0, partial, 0, n);

        // อ่านต่อจนครบเพื่อตรวจสอบความถูกต้องทั้งหมด
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(partial);
        int r;
        byte[] rest = new byte[100];
        while ((r = is.read(rest, 0, rest.length)) != -1) {
            baos.write(rest, 0, r);
        }
        assertArrayEquals(input, baos.toByteArray());
    }

    @Test
    public void testRead_LargeInput_ForcesMultipleInternalBufferReads_Decode() throws IOException {
        // สร้าง input ขนาดใหญ่กว่า internal buffer (8192 สำหรับ decode)
        // เพื่อบังคับให้ loop while(readLen==0) วนหลายครั้ง และ !hasData() เป็น true ซ้ำ ๆ
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        byte[] input = sb.toString().getBytes();
        byte[] encoded = Base64.encodeBase64(input);

        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] result = readAll(is);
        assertArrayEquals(input, result);
    }

    @Test
    public void testRead_LargeInput_ForcesMultipleInternalBufferReads_Encode() throws IOException {
        // เช่นเดียวกันแต่สำหรับ doEncode=true (internal buffer 4096)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        byte[] input = sb.toString().getBytes();

        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(input), true);
        byte[] result = readAll(is);
        byte[] expected = Base64.encodeBase64(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRead_AfterEOF_ReturnsMinusOneRepeatedly() throws IOException {
        byte[] encoded = Base64.encodeBase64("A".getBytes());
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] buf = new byte[10];
        int first = is.read(buf, 0, buf.length);
        assertEquals(1, first); // "A" decodes to 1 byte
        int second = is.read(buf, 0, buf.length);
        assertEquals(-1, second); // EOF branch: readResults returns -1, loop exits without setting readLen=0 again
    }

    @Test
    public void testRead_DoEncodeFalse_WithEmptyUnderlyingStream_ReturnsMinusOne() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]), false);
        byte[] buf = new byte[10];
        int result = is.read(buf, 0, buf.length);
        assertEquals(-1, result);
    }

    @Test
    public void testRead_DoEncodeTrue_WithEmptyUnderlyingStream_ReturnsMinusOne() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]), true);
        byte[] buf = new byte[10];
        int result = is.read(buf, 0, buf.length);
        assertEquals(-1, result);
    }
}
