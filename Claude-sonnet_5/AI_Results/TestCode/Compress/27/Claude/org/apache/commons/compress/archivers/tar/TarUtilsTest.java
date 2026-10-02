package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.ZipEncoding;

public class TarUtilsTest {

    // ===================== parseOctal =====================

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThan2_throws() {
        TarUtils.parseOctal(new byte[]{'0'}, 0, 1);
    }

    @Test
    public void parseOctal_leadingNul_returnsZero() {
        byte[] buf = {0, '1', '2', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test
    public void parseOctal_minLengthBoundary_valid() {
        byte[] buf = {'0', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 2));
    }

    @Test
    public void parseOctal_validWithLeadingSpacesAndTrailingSpace() {
        byte[] buf = {' ', '1', '2', '3', ' '};
        assertEquals(83L, TarUtils.parseOctal(buf, 0, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_allSpaces_throws() {
        byte[] buf = "      ".getBytes();
        TarUtils.parseOctal(buf, 0, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidDigit_throws() {
        byte[] buf = {' ', '8', ' '};
        TarUtils.parseOctal(buf, 0, 3);
    }

    @Test
    public void parseOctal_withOffset_notFromStart() {
        byte[] buf = {'X', 'X', ' ', '7', ' '};
        assertEquals(7L, TarUtils.parseOctal(buf, 2, 3));
    }

    // ===================== parseOctalOrBinary =====================

    @Test
    public void parseOctalOrBinary_highBitZero_delegatesToOctal() {
        byte[] buf = {' ', '1', '2', '3', ' '};
        assertEquals(83L, TarUtils.parseOctalOrBinary(buf, 0, 5));
    }

    @Test
    public void parseOctalOrBinary_negative_lengthLessThan9_usesLongPath() {
        // 0xff marks negative; remaining bytes = FF FF FE -> -2 (24-bit two's complement)
        byte[] buf = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe};
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buf, 0, 4));
    }

    @Test
    public void parseOctalOrBinary_negative_lengthGreaterEq9_usesBigIntegerPath() {
        byte[] buf = new byte[9];
        buf[0] = (byte) 0xff;
        for (int i = 1; i < 8; i++) buf[i] = (byte) 0xff;
        buf[8] = (byte) 0xfe; // remainder = FF FF FF FF FF FF FF FE -> -2
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buf, 0, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_bigInteger_overflowThrows() {
        // length=10 -> remainder length 9; leading 0x00 then eight 0xFF => value 2^64-1, bitLength=64 (>63)
        byte[] buf = new byte[10];
        buf[0] = (byte) 0x80; // positive marker
        buf[1] = 0x00;
        for (int i = 2; i < 10; i++) buf[i] = (byte) 0xff;
        TarUtils.parseOctalOrBinary(buf, 0, 10);
    }

    // ===================== parseBoolean =====================

    @Test
    public void parseBoolean_true() {
        assertTrue(TarUtils.parseBoolean(new byte[]{1}, 0));
    }

    @Test
    public void parseBoolean_falseZero() {
        assertFalse(TarUtils.parseBoolean(new byte[]{0}, 0));
    }

    @Test
    public void parseBoolean_falseOtherValue() {
        assertFalse(TarUtils.parseBoolean(new byte[]{2}, 0));
    }

    // ===================== parseName (3-arg) =====================

    @Test
    public void parseName_stopsAtNul() {
        byte[] buf = "abc\0xyz".getBytes();
        assertEquals("abc", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_noNul_usesFullLength() {
        byte[] buf = "abcd".getBytes();
        assertEquals("abcd", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_zeroLength_returnsEmpty() {
        byte[] buf = "abcd".getBytes();
        assertEquals("", TarUtils.parseName(buf, 0, 0));
    }

    @Test
    public void parseName_allNul_returnsEmpty() {
        byte[] buf = new byte[5];
        assertEquals("", TarUtils.parseName(buf, 0, 5));
    }

    // ===================== parseName (4-arg with encoding) =====================

    @Test
    public void parseName_customEncoding_normalDecode() throws IOException {
        byte[] buf = "hi\0\0".getBytes();
        ZipEncoding enc = new ZipEncoding() {
            public boolean canEncode(String name) { return true; }
            public ByteBuffer encode(String name) { return java.nio.ByteBuffer.wrap(new byte[0]); }
            public String decode(byte[] buffer) { return new String(buffer); }
        };
        // len trimming happens before decode is called: trailing NULs stripped -> "hi"
        assertEquals("hi", TarUtils.parseName(buf, 0, buf.length, enc));
    }

    @Test(expected = IOException.class)
    public void parseName_customEncoding_decodeThrows_propagates() throws IOException {
        byte[] buf = "hi".getBytes();
        ZipEncoding enc = new ZipEncoding() {
            public boolean canEncode(String name) { return true; }
            public ByteBuffer encode(String name) { return java.nio.ByteBuffer.wrap(new byte[0]); }
            public String decode(byte[] buffer) throws IOException {
                throw new IOException("forced");
            }
        };
        TarUtils.parseName(buf, 0, buf.length, enc);
    }

    // ===================== formatNameBytes (3-arg) =====================

    @Test
    public void formatNameBytes_shorterThanBuffer_padsWithNul() {
        byte[] buf = new byte[5];
        int off = TarUtils.formatNameBytes("AB", buf, 0, 5);
        assertEquals(5, off);
        assertArrayEquals(new byte[]{'A', 'B', 0, 0, 0}, buf);
    }

    @Test
    public void formatNameBytes_longerThanBuffer_truncated() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("ABCDE", buf, 0, 3);
        assertArrayEquals(new byte[]{'A', 'B', 'C'}, buf);
    }

    @Test
    public void formatNameBytes_emptyName_allNul() {
        byte[] buf = new byte[4];
        Arrays.fill(buf, (byte) 9); // sentinel
        TarUtils.formatNameBytes("", buf, 0, 4);
        assertArrayEquals(new byte[]{0, 0, 0, 0}, buf);
    }

    // ===================== formatNameBytes (5-arg with encoding) =====================

    @Test(expected = IOException.class)
    public void formatNameBytes_customEncoding_encodeThrows_propagates() throws IOException {
        byte[] buf = new byte[4];
        ZipEncoding enc = new ZipEncoding() {
            public boolean canEncode(String name) { return true; }
            public ByteBuffer encode(String name) throws IOException {
                throw new IOException("forced");
            }
            public String decode(byte[] buffer) { return ""; }
        };
        TarUtils.formatNameBytes("x", buf, 0, 4, enc);
    }

    // ===================== formatUnsignedOctalString =====================

    @Test
    public void formatUnsignedOctalString_zero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertArrayEquals(new byte[]{'0', '0', '0', '0'}, buf);
    }

    @Test
    public void formatUnsignedOctalString_normalValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4); // octal 10 -> padded "0010"
        assertArrayEquals(new byte[]{'0', '0', '1', '0'}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_overflow_throws() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1); // needs 2 digits, buffer=1
    }

    // ===================== formatOctalBytes =====================

    @Test
    public void formatOctalBytes_normal() {
        byte[] buf = new byte[6];
        int ret = TarUtils.formatOctalBytes(8L, buf, 0, 6);
        assertEquals(6, ret);
        assertEquals(' ', buf[4]);
        assertEquals(0, buf[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3); // idx=1, needs 2 digits
    }

    // ===================== formatLongOctalBytes =====================

    @Test
    public void formatLongOctalBytes_normal() {
        byte[] buf = new byte[5];
        int ret = TarUtils.formatLongOctalBytes(8L, buf, 0, 5);
        assertEquals(5, ret);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', ' '}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalBytes_overflow_throws() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2); // idx=1, needs 2 digits
    }

    // ===================== formatCheckSumOctalBytes =====================

    @Test
    public void formatCheckSumOctalBytes_normal() {
        byte[] buf = new byte[5];
        int ret = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 5);
        assertEquals(5, ret);
        assertArrayEquals(new byte[]{'0', '1', '0', 0, ' '}, buf);
    }

    // ===================== formatLongOctalOrBinaryBytes =====================

    /** สร้างค่าคาดหวังตาม logic ของ formatBigIntegerBinary + การเซ็ต marker byte สุดท้าย
     *  (ผลลัพธ์จริงสุดท้าย ไม่ว่า length จะ &lt;9 หรือไม่ เพราะ formatLongBinary ถูกเขียนทับเสมอ
     *  เนื่องจากไม่มี return ในโค้ดต้นฉบับ เมื่อ length&lt;9) */
    private byte[] expectedBinaryEncoding(long value, int length, boolean negative) {
        byte[] buf = new byte[length];
        BigInteger val = BigInteger.valueOf(value);
        byte[] b = val.toByteArray();
        int len = b.length;
        int off = length - len;
        byte fill = (byte) (negative ? 0xff : 0);
        for (int i = 1; i < off; i++) buf[i] = fill;
        System.arraycopy(b, 0, buf, off, len);
        buf[0] = (byte) (negative ? 0xff : 0x80);
        return buf;
    }

    @Test
    public void formatLongOctalOrBinaryBytes_positiveWithinMax_usesOctal() {
        byte[] buf = new byte[(int) TarConstants.UIDLEN];
        long value = TarConstants.MAXID; // boundary: value <= max -> octal path
        int ret = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, (int) TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, ret);
        assertEquals(' ', buf[buf.length - 1]); // formatLongOctalBytes trailing space
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_negative_lengthLessThan9_tooLarge_throws() {
        byte[] buf = new byte[8];
        // abs(value) = 2^60 >= max(2^56) for length=8 -> formatLongBinary throws
        TarUtils.formatLongOctalOrBinaryBytes(-(1L << 60), buf, 0, 8);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_negative_lengthLessThan9_fallthroughBug() {
        // Documents known missing-return behavior (Compress-27b):
        // แม้ length<9 (ควรใช้ formatLongBinary) แต่ formatBigIntegerBinary ก็ถูกเรียกซ้ำ
        // และผลลัพธ์จริงจะถูกเขียนทับด้วยค่าจาก formatBigIntegerBinary เสมอ
        byte[] buf = new byte[8];
        long value = -100L;
        int ret = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, ret);
        byte[] expected = expectedBinaryEncoding(value, 8, true);
        assertArrayEquals(expected, buf);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_negative_lengthGreaterEq9_cleanBigIntegerPath() {
        // length>=9 -> formatLongBinary ไม่ถูกเรียก, มีแค่ formatBigIntegerBinary ทำงานครั้งเดียว (ไม่มีบัค)
        byte[] buf = new byte[12];
        long value = -12345L;
        int ret = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, ret);
        byte[] expected = expectedBinaryEncoding(value, 12, true);
        assertArrayEquals(expected, buf);
    }

    // ===================== computeCheckSum =====================

    @Test
    public void computeCheckSum_sumsUnsignedBytes() {
        byte[] buf = {1, 2, 3, (byte) 200}; // 200 as unsigned byte
        assertEquals(206L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void computeCheckSum_emptyBuffer_zero() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    // ===================== verifyCheckSum =====================

    // หมายเหตุ: สมมติ TarConstants.CHKSUMLEN == 8 ตามมาตรฐาน POSIX tar (6 digits + NUL + space)
    private static final int OFF = TarConstants.CHKSUM_OFFSET;
    private static final int LEN = TarConstants.CHKSUMLEN;
    private static final int SIZE = OFF + LEN + 5;

    private long[] computeSumsIgnoringChksum(byte[] header) {
        long unsignedSum = 0, signedSum = 0;
        for (int i = 0; i < header.length; i++) {
            byte b = header[i];
            if (i >= OFF && i < OFF + LEN) b = ' ';
            unsignedSum += 0xff & b;
            signedSum += b;
        }
        return new long[]{unsignedSum, signedSum};
    }

    private void writeSixDigitOctal(byte[] header, int pos, long value) {
        String oct = Long.toOctalString(value);
        StringBuilder sb = new StringBuilder(oct);
        while (sb.length() < 6) sb.insert(0, '0');
        assertTrue("test value too large for 6 octal digits", sb.length() == 6);
        for (int i = 0; i < 6; i++) {
            header[pos + i] = (byte) sb.charAt(i);
        }
    }

    @Test
    public void verifyCheckSum_valid_unsignedMatch_true() {
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        long[] sums = computeSumsIgnoringChksum(header);
        writeSixDigitOctal(header, OFF, sums[0]);
        header[OFF + 6] = 0;
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_moreThanSixDigits_clampsDigitCount_true() {
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        long[] sums = computeSumsIgnoringChksum(header);
        writeSixDigitOctal(header, OFF, sums[0]);
        header[OFF + 6] = '0'; // extra 7th octal digit instead of NUL -> exercises "digits>=6" branch
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_leadingNonDigitBeforeAnyDigit_true() {
        // ต้องแน่ใจว่า LEN >= 7 เพื่อวางค่า: [space][6 digits][spaces...]
        assertTrue("assumption CHKSUMLEN>=7 required for this test layout", LEN >= 7);
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        long[] sums = computeSumsIgnoringChksum(header);
        header[OFF] = ' '; // non-digit, digits==0 -> neither if/else-if branch executes
        writeSixDigitOctal(header, OFF + 1, sums[0]);
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_invalid_false() {
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        long[] sums = computeSumsIgnoringChksum(header);
        long wrongSum = sums[0] > 10 ? sums[0] - 10 : sums[0] + 1; // less than unsignedSum, not equal signedSum
        writeSixDigitOctal(header, OFF, wrongSum);
        header[OFF + 6] = 0;
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_storedGreaterThanUnsigned_true() {
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        long[] sums = computeSumsIgnoringChksum(header);
        long inflated = sums[0] + 10; // storedSum > unsignedSum
        writeSixDigitOctal(header, OFF, inflated);
        header[OFF + 6] = 0;
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_signedMatchOnly_true() {
        byte[] header = new byte[SIZE];
        Arrays.fill(header, (byte) 'a');
        // ทำให้ byte นอก chksum field ตัวหนึ่งมีค่า 0xFF (สร้างความต่างระหว่าง signed/unsigned sum)
        int idx = SIZE - 1; // อยู่หลัง chksum field แน่นอน
        header[idx] = (byte) 0xff;
        long[] sums = computeSumsIgnoringChksum(header);
        long unsignedSum = sums[0];
        long signedSum = sums[1];
        assertTrue("test setup requires signedSum < unsignedSum and signedSum>=0",
                signedSum >= 0 && signedSum < unsignedSum);
        writeSixDigitOctal(header, OFF, signedSum);
        header[OFF + 6] = 0;
        for (int i = 7; i < LEN; i++) header[OFF + i] = ' ';

        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
