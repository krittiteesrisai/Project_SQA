package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link TarUtils} (Defects4J Compress-24b).
 *
 * หมายเหตุ: บาง branch (เช่น catch(IOException) ใน parseName(3-arg)/formatNameBytes(4-arg)
 * ที่ fallback ไป FALLBACK_ENCODING) ไม่สามารถ trigger ได้จาก public API ด้วยอินพุตปกติ
 * เนื่องจาก DEFAULT_ENCODING ไม่ throw IOException สำหรับ input ทั่วไป จึงไม่ทดสอบ branch นั้นตรง ๆ
 * (ไม่ขอเดา behavior เพิ่มเติม)
 */
public class TarUtilsTest {

    // ---------- helper ----------
    private static String octalPadded(long v, int width) {
        return String.format("%0" + width + "o", v);
    }

    // =========================================================
    // parseOctal
    // =========================================================

    @Test
    public void parseOctal_normalValue() {
        byte[] buf = "0000755\0".getBytes();
        long v = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(Long.parseLong("755", 8), v);
    }

    @Test
    public void parseOctal_leadingSpacesSkipped() {
        byte[] buf = " 17\0".getBytes();
        long v = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(15L, v);
    }

    @Test
    public void parseOctal_allZeroBuffer_returnsZero() {
        byte[] buf = new byte[5]; // all zero
        long v = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, v);
    }

    @Test
    public void parseOctal_leadingNulByte_returnsZeroImmediately() {
        // buffer[start] == 0 -> short circuit even though rest looks like valid octal
        byte[] buf = {0, '7', '5', '5', ' '};
        long v = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, v);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThan2_throws() {
        byte[] buf = {'1'};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_missingTrailingSpaceOrNul_throws() {
        byte[] buf = {'1', '2', '3', '4'}; // no trailing space/NUL
        TarUtils.parseOctal(buf, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidOctalDigit_throws() {
        byte[] buf = {'7', '8', ' ', '\0'};
        TarUtils.parseOctal(buf, 0, 4);
    }

    @Test
    public void parseOctal_multipleTrailingNulsTrimmed() {
        byte[] buf = {' ', '1', '7', '\0', '\0'};
        long v = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(15L, v);
    }

    // =========================================================
    // parseOctalOrBinary
    // =========================================================

    @Test
    public void parseOctalOrBinary_delegatesToOctal_whenMsbNotSet() {
        byte[] buf = "0000755\0".getBytes();
        long v = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(Long.parseLong("755", 8), v);
    }

    @Test
    public void parseOctalOrBinary_negativeBinary_smallLength() {
        // all 0xFF including flag byte -> classic two's complement -1
        byte[] buf = new byte[8];
        Arrays.fill(buf, (byte) 0xFF);
        long v = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(-1L, v);
    }

    @Test
    public void parseOctalOrBinary_positiveBinary_smallLength_zeroMagnitude() {
        byte[] buf = new byte[5];
        buf[0] = (byte) 0x80; // positive flag, rest zero magnitude
        long v = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(0L, v);
    }

    @Test
    public void parseOctalOrBinary_bigIntegerPath_normalValue() {
        // length >= 9 -> parseBinaryBigInteger branch
        byte[] buf = new byte[10];
        buf[0] = (byte) 0x80; // positive flag
        buf[9] = 1;           // remainder = 9 bytes, value = 1
        long v = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(1L, v);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_bigIntegerPath_overflowThrows() {
        byte[] buf = new byte[10];
        buf[0] = (byte) 0x80; // positive flag
        buf[1] = 0x7F;
        for (int i = 2; i < 10; i++) {
            buf[i] = (byte) 0xFF;
        }
        // remainder (9 bytes) has bitLength > 63 -> must throw
        TarUtils.parseOctalOrBinary(buf, 0, buf.length);
    }

    // =========================================================
    // parseBoolean
    // =========================================================

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

    // =========================================================
    // parseName (3-arg and 4-arg)
    // =========================================================

    @Test
    public void parseName_stopsAtTrailingNul() {
        byte[] buf = "hello\0\0\0".getBytes();
        String s = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("hello", s);
    }

    @Test
    public void parseName_noNul_usesFullLength() {
        byte[] buf = "abcde".getBytes();
        String s = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("abcde", s);
    }

    @Test
    public void parseName_allNulBuffer_returnsEmptyString() {
        byte[] buf = new byte[4];
        String s = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("", s);
    }

    @Test
    public void parseName_withOffset() {
        byte[] buf = "XXhello\0".getBytes();
        String s = TarUtils.parseName(buf, 2, 6);
        assertEquals("hello", s);
    }

    @Test
    public void parseName_withExplicitEncoding_UTF8() throws IOException {
        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buf = "abc\0\0".getBytes("UTF-8");
        String s = TarUtils.parseName(buf, 0, buf.length, enc);
        assertEquals("abc", s);
    }

    // =========================================================
    // formatNameBytes (4-arg and 5-arg)
    // =========================================================

    @Test
    public void formatNameBytes_shorterThanBuffer_padsWithNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, buf.length);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'a', 'b', 0, 0, 0}, buf);
    }

    @Test
    public void formatNameBytes_exactLength_noPadding() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("abcde", buf, 0, buf.length);
        assertArrayEquals("abcde".getBytes(), buf);
    }

    @Test
    public void formatNameBytes_longerThanBuffer_truncated() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("abcdefgh", buf, 0, buf.length);
        assertArrayEquals("abcde".getBytes(), buf);
    }

    @Test
    public void formatNameBytes_emptyName_allNul() {
        byte[] buf = new byte[4];
        TarUtils.formatNameBytes("", buf, 0, buf.length);
        assertArrayEquals(new byte[]{0, 0, 0, 0}, buf);
    }

    @Test
    public void formatNameBytes_withExplicitEncoding() throws IOException {
        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("ab", buf, 0, buf.length, enc);
        assertArrayEquals(new byte[]{'a', 'b', 0, 0, 0}, buf);
    }

    // =========================================================
    // formatUnsignedOctalString
    // =========================================================

    @Test
    public void formatUnsignedOctalString_zeroValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buf, 0, buf.length);
        assertArrayEquals("0000".getBytes(), buf);
    }

    @Test
    public void formatUnsignedOctalString_normalValue_leadingZeroPad() {
        byte[] buf = new byte[5];
        TarUtils.formatUnsignedOctalString(8, buf, 0, buf.length);
        assertArrayEquals(octalPadded(8, 5).getBytes(), buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_valueTooLarge_throws() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8, buf, 0, buf.length); // needs 2 octal digits
    }

    // =========================================================
    // formatOctalBytes / formatLongOctalBytes / formatCheckSumOctalBytes
    // =========================================================

    @Test
    public void formatOctalBytes_valueAndTrailer() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatOctalBytes(8, buf, 0, buf.length);
        assertEquals(4, newOffset);
        byte[] expected = (octalPadded(8, 2) + " \0").getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void formatLongOctalBytes_valueAndTrailingSpace() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatLongOctalBytes(8, buf, 0, buf.length);
        assertEquals(4, newOffset);
        byte[] expected = (octalPadded(8, 3) + " ").getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void formatCheckSumOctalBytes_nulThenSpace() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8, buf, 0, buf.length);
        assertEquals(4, newOffset);
        byte[] expected = (octalPadded(8, 2) + "\0 ").getBytes();
        assertArrayEquals(expected, buf);
    }

    // =========================================================
    // formatLongOctalOrBinaryBytes
    // =========================================================

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_UIDLEN() {
        long value = TarConstants.MAXID; // fits as octal exactly at boundary
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                value, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        // must equal plain octal formatting (formatLongOctalBytes) contract
        byte[] expected = new byte[TarConstants.UIDLEN];
        TarUtils.formatLongOctalBytes(value, expected, 0, TarConstants.UIDLEN);
        assertArrayEquals(expected, buf);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_boundaryMaxSize() {
        long value = TarConstants.MAXSIZE; // length != UIDLEN -> uses MAXSIZE
        int length = TarConstants.SIZELEN;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        byte[] expected = new byte[length];
        TarUtils.formatLongOctalBytes(value, expected, 0, length);
        assertArrayEquals(expected, buf);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_negative_smallLength_roundTrip() {
        // length(UIDLEN)=8 < 9 -> exercises the "if (length < 9) formatLongBinary(...)"
        // branch followed (per source, unconditionally) by formatBigIntegerBinary(...).
        // We only assert the documented round-trip contract with parseOctalOrBinary;
        // if the double-write defect corrupts the buffer this test will fail,
        // which is the intended fault-detection behaviour.
        long value = -5L;
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertEquals((byte) 0xff, buf[0]); // negative flag byte must be set
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_positiveExceedsMax_flagByteSet() {
        long value = TarConstants.MAXID + 1; // too big for octal encoding
        byte[] buf = new byte[TarConstants.UIDLEN];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        assertEquals((byte) 0x80, buf[0]); // positive binary flag must be set
    }

    @Test
    public void formatLongOctalOrBinaryBytes_lengthGe9_bigIntegerOnly_roundTrip() {
        // SIZELEN = 12 >= 9 -> only formatBigIntegerBinary path is invoked
        long value = -123456789L;
        int length = TarConstants.SIZELEN;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, parsed);
    }

    // =========================================================
    // computeCheckSum
    // =========================================================

    @Test
    public void computeCheckSum_emptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void computeCheckSum_normalArray_unsignedMasking() {
        byte[] buf = {1, -1, 127}; // -1 -> 255 unsigned
        long expected = 1 + 255 + 127;
        assertEquals(expected, TarUtils.computeCheckSum(buf));
    }

    // =========================================================
    // verifyCheckSum
    // =========================================================

    @Test
    public void verifyCheckSum_correctSum_returnsTrue() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        // all data bytes are 0; checksum field replaced by ' '(32) * CHKSUMLEN during scoring
        long expectedUnsignedSum = 32L * TarConstants.CHKSUMLEN;
        TarUtils.formatCheckSumOctalBytes(
                expectedUnsignedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_incorrectSum_returnsFalse() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        long correctSum = 32L * TarConstants.CHKSUMLEN;
        TarUtils.formatCheckSumOctalBytes(
                correctSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        // corrupt a data byte outside checksum field to raise the actual sum
        // above the stored value (and not trigger the storedSum > unsignedSum rule)
        header[0] = 100;
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_storedGreaterThanUnsigned_returnsTrue_compress177() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        // fill checksum field with '7' repeated -> only first 6 digits are counted
        // (digits++ < 6 branch), giving a large stored value (octal "777777")
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = '7';
        }
        // rest of header is all zero -> actual unsigned sum is small
        // (CHKSUMLEN * ' ' contributions only)
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_nonOctalByteInChecksumField_doesNotThrow() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        // a non-octal char after some valid digits triggers "else if (digits > 0)" branch
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = 'Z'; // invalid octal char
        // must not throw, and must return a boolean deterministically
        boolean result = TarUtils.verifyCheckSum(header);
        assertFalse(result); // stored=1, real sum from spaces etc. will not match, not > either
    }
}
