package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * Unit tests for {@link BaseNCodecInputStream}.
 *
 * ใช้ Base64InputStream / Base32InputStream เป็น concrete subclass
 * เนื่องจาก BaseNCodecInputStream constructor เป็น protected
 * และ BaseNCodec เป็น abstract class
 */
public class BaseNCodecInputStreamTest {

    // ---------------------------------------------------------
    // read() - single byte
    // ---------------------------------------------------------

    @Test
    public void testReadSingleByte_EncodeMode_ReturnsValidByte() throws IOException {
        // encode mode: ทุก byte ที่ decode กลับมาควรอยู่ในช่วง 0-255
        byte[] data = "A".getBytes(); // ทำให้ encode ได้ค่าที่มี high-bit possibility
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(data), true);
        int b = is.read();
        assertTrue("ค่าที่อ่านต้องอยู่ในช่วง 0-255", b >= 0 && b <= 255);
    }

    @Test
    public void testReadSingleByte_EmptyInput_ReturnsEOF() throws IOException {
        // input ว่าง -> underlying stream EOF ทันที -> decode(-1) -> readResults ควร EOF
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[0]), false);
        int b = is.read();
        assertEquals("stream ว่างควร EOF ทันที", -1, b);
    }

    @Test
    public void testReadSingleByte_UntilEOF_DecodeRoundTrip() throws IOException {
        // ทดสอบ full round-trip อ่านทีละ byte จน EOF, ตรวจว่าค่า decode ตรงกับ original
        String original = "Hello World!";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(encoded), false);

        StringBuilder sb = new StringBuilder();
        int r;
        while ((r = decodeStream.read()) != -1) {
            // ครอบคลุมทั้ง branch b<0 (256+b) และ b>=0 ของ read()
            sb.append((char) r);
        }
        assertEquals(original, sb.toString());
    }

    // ---------------------------------------------------------
    // read(byte[], int, int) - argument validation branches
    // ---------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testReadByteArray_NullArray_ThrowsNPE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        is.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_NegativeOffset_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        is.read(buf, -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_NegativeLen_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        is.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_OffsetGreaterThanLength_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        is.read(buf, 20, 1); // offset > b.length
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_OffsetPlusLenGreaterThanLength_ThrowsIOOBE() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        is.read(buf, 5, 10); // offset <= length but offset+len > length
    }

    @Test
    public void testReadByteArray_LenZero_ReturnsZero() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        int result = is.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testReadByteArray_OffsetEqualsLengthWithLenZero_ReturnsZero() throws IOException {
        // boundary: offset == b.length (ไม่ถือว่า offset > length) และ len == 0
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1, 2, 3}), false);
        byte[] buf = new byte[10];
        int result = is.read(buf, 10, 0);
        assertEquals(0, result);
    }

    // ---------------------------------------------------------
    // read(byte[], int, int) - main logic branches (encode/decode, hasData)
    // ---------------------------------------------------------

    @Test
    public void testReadByteArray_EncodeMode_ProducesCorrectBase64() throws IOException {
        String original = "The quick brown fox";
        byte[] originalBytes = original.getBytes();
        Base64InputStream encodeStream = new Base64InputStream(new ByteArrayInputStream(originalBytes), true);

        byte[] outBuf = new byte[1024];
        int totalRead = 0;
        int n;
        while ((n = encodeStream.read(outBuf, totalRead, outBuf.length - totalRead)) != -1) {
            totalRead += n;
        }
        byte[] actualEncoded = new byte[totalRead];
        System.arraycopy(outBuf, 0, actualEncoded, 0, totalRead);

        String expected = Base64.encodeBase64String(originalBytes);
        assertEquals(expected, new String(actualEncoded));
    }

    @Test
    public void testReadByteArray_DecodeMode_ProducesCorrectOriginal() throws IOException {
        String original = "Testing decode branch with commons codec!";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(encoded), false);

        byte[] outBuf = new byte[1024];
        int totalRead = 0;
        int n;
        while ((n = decodeStream.read(outBuf, totalRead, outBuf.length - totalRead)) != -1) {
            totalRead += n;
        }
        String actual = new String(outBuf, 0, totalRead);
        assertEquals(original, actual);
    }

    @Test
    public void testReadByteArray_MultipleSmallReads_CoversHasDataTrueBranch() throws IOException {
        // อ่านทีละ byte ซ้ำ ๆ เพื่อกระตุ้นให้ baseNCodec.hasData() == true
        // ในรอบถัดไป (ข้าม if-block การอ่าน underlying stream ใหม่)
        String original = "abcdef";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(encoded), false);

        byte[] singleBuf = new byte[1];
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = decodeStream.read(singleBuf, 0, 1)) != -1) {
            sb.append((char) singleBuf[0]);
        }
        assertEquals(original, sb.toString());
    }

    @Test
    public void testReadByteArray_MalformedInputWhitespaceOnly_ReturnsEOF() throws IOException {
        // อินพุตที่เป็น whitespace ล้วน -> Base64 ถือว่าไม่มีข้อมูลจริง (ignore)
        // ทดสอบ loop while(readLen==0) วนหลายรอบจนกว่า underlying stream หมด (EOF)
        byte[] whitespaceOnly = " \r\n\t   \r\n".getBytes();
        Base64InputStream decodeStream = new Base64InputStream(new ByteArrayInputStream(whitespaceOnly), false);

        byte[] buf = new byte[16];
        int result = decodeStream.read(buf, 0, buf.length);
        assertEquals("ไม่มีข้อมูล base64 จริง ควรได้ EOF", -1, result);
    }

    @Test
    public void testReadByteArray_Base32EncodeMode_CoversDifferentBufferSize() throws IOException {
        // ใช้ Base32InputStream เพื่อครอบคลุม branch doEncode -> buffer size 4096
        // (Base32 กับ Base64 ใช้ path เดียวกันใน BaseNCodecInputStream แต่ buffer ขนาดต่างกันตาม doEncode)
        String original = "Base32 test data";
        Base32InputStream encodeStream = new Base32InputStream(
                new ByteArrayInputStream(original.getBytes()), true);

        byte[] outBuf = new byte[1024];
        int totalRead = 0;
        int n;
        while ((n = encodeStream.read(outBuf, totalRead, outBuf.length - totalRead)) != -1) {
            totalRead += n;
        }
        byte[] actual = new byte[totalRead];
        System.arraycopy(outBuf, 0, actual, 0, totalRead);

        String expected = Base32.encodeBase32String(original.getBytes());
        assertEquals(expected, new String(actual));
    }

    @Test(expected = IOException.class)
    public void testReadByteArray_UnderlyingStreamThrowsIOException_PropagatesException() throws IOException {
        InputStream throwingStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("simulated I/O error");
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("simulated I/O error");
            }
        };
        Base64InputStream decodeStream = new Base64InputStream(throwingStream, false);
        byte[] buf = new byte[10];
        decodeStream.read(buf, 0, buf.length);
    }

    // ---------------------------------------------------------
    // markSupported()
    // ---------------------------------------------------------

    @Test
    public void testMarkSupported_AlwaysReturnsFalse() throws IOException {
        Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(new byte[]{1}), false);
        assertFalse(is.markSupported());
    }
}
