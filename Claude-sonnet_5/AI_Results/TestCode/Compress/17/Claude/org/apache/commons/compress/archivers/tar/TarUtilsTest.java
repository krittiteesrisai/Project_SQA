package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.commons.compress.archivers.zip.ZipEncoding;

/**
 * Unit tests for {@link TarUtils} (Defects4J Compress-17b).
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ package เดียวกับ TarUtils
 * เพื่อให้เข้าถึง package-private field DEFAULT_ENCODING / FALLBACK_ENCODING ได้โดยตรง
 */
public class TarUtilsTest {

    // ---------------------------------------------------------------
    // parseOctal
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThan2_throws() {
        byte[] buf = {0};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test
    public void parseOctal_leadingNul_returnsZero() {
        // ตาม javadoc: leading NUL -> คืน 0 แม้ข้อมูลหลังจากนั้นจะดูเหมือนเลขที่ valid
        byte[] buf = {0, '7', '5', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test
    public void parseOctal_allSpaces_returnsZero() {
        byte[] buf = {' ', ' '};
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 2));
    }

    @Test
    public void parseOctal_leadingSpacesSkipped() {
        byte[] buf = {' ', ' ', '7', '5', ' '};
        // "75" octal = 7*8+5 = 61
        assertEquals(61L, TarUtils.parseOctal(buf, 0, 5));
    }

    @Test
    public void parseOctal_validValueWithTrailingSpace() {
        byte[] buf = {'7', '5', '5', ' '};
        // "755" octal = 7*64+5*8+5 = 493
        assertEquals(493L, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test
    public void parseOctal_validValueWithTrailingNul() {
        byte[] buf = {'7', '5', '5', 0};
        assertEquals(493L, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_missingTrailingSpaceOrNul_throws() {
        byte[] buf = {'7', '5', '5', '5'};
        TarUtils.parseOctal(buf, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidDigitInBody_throws() {
        byte[] buf = {'7', '9', '5', ' '};
        TarUtils.parseOctal(buf, 0, 4);
    }

    // ---------------------------------------------------------------
    // parseOctalOrBinary
    // ---------------------------------------------------------------

    @Test
    public void parseOctalOrBinary_topBitZero_delegatesToOctal() {
        byte[] buf = {'7', '5', '5', ' '};
        assertEquals(493L, TarUtils.parseOctalOrBinary(buf, 0, 4));
    }

    @Test
    public void parseOctalOrBinary_negative_lengthLessThan9_roundTrip() {
        byte[] buf = new byte[8];
        long value = -12345L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void parseOctalOrBinary_negative_lengthGreaterEq9_roundTrip() {
        byte[] buf = new byte[12];
        long value = -123456789012345L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, 12));
    }

    @Test
    public void parseOctalOrBinary_positiveLarge_lengthGreaterEq9_roundTrip() {
        byte[] buf = new byte[12];
        long value = Long.MAX_VALUE / 4;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, 12));
    }

    // ---------------------------------------------------------------
    // parseBoolean
    // ---------------------------------------------------------------

    @Test
    public void parseBoolean_byteOne_true() {
        byte[] buf = {1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void parseBoolean_byteZero_false() {
        byte[] buf = {0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void parseBoolean_otherByte_false() {
        byte[] buf = {2};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    // ---------------------------------------------------------------
    // parseName
    // ---------------------------------------------------------------

    @Test
    public void parseName_stopsAtNul() {
        byte[] buf = {'a', 'b', 'c', 0, 0};
        assertEquals("abc", TarUtils.parseName(buf, 0, 5));
    }

    @Test
    public void parseName_noNul_usesWholeLength() {
        byte[] buf = {'a', 'b', 'c', 'd', 'e', 'f'};
        assertEquals("abcdef", TarUtils.parseName(buf, 0, 6));
    }

    @Test
    public void parseName_allNul_returnsEmpty() {
        byte[] buf = {0, 0, 0, 0, 0};
        assertEquals("", TarUtils.parseName(buf, 0, 5));
    }

    @Test
    public void parseName_withOffset() {
        byte[] buf = {'x', 'x', 'a', 'b', 'c', 0};
        assertEquals("abc", TarUtils.parseName(buf, 2, 4));
    }

    @Test
    public void parseName_withFallbackEncoding_direct() throws Exception {
        byte[] buf = {'a', 'b', 'c', 0, 0};
        assertEquals("abc", TarUtils.parseName(buf, 0, 5, TarUtils.FALLBACK_ENCODING));
    }

    // ---------------------------------------------------------------
    // formatNameBytes
    // ---------------------------------------------------------------

    @Test
    public void formatNameBytes_shorterThanLength_padsWithNul() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 6);
        assertEquals(6, newOffset);
        assertArrayEquals(new byte[]{'a', 'b', 'c', 0, 0, 0}, buf);
    }

    @Test
    public void formatNameBytes_exactLength_noPadding() {
        byte[] buf = new byte[6];
        TarUtils.formatNameBytes("abcdef", buf, 0, 6);
        assertArrayEquals(new byte[]{'a', 'b', 'c', 'd', 'e', 'f'}, buf);
    }

    @Test
    public void formatNameBytes_longerThanLength_truncated() {
        byte[] buf = new byte[6];
        TarUtils.formatNameBytes("abcdefgh", buf, 0, 6);
        assertArrayEquals(new byte[]{'a', 'b', 'c', 'd', 'e', 'f'}, buf);
    }

    @Test
    public void formatNameBytes_emptyName_allNul() {
        byte[] buf = new byte[4];
        TarUtils.formatNameBytes("", buf, 0, 4);
        assertArrayEquals(new byte[]{0, 0, 0, 0}, buf);
    }

    @Test
    public void formatNameBytes_withFallbackEncoding_direct() throws Exception {
        byte[] buf = new byte[4];
        TarUtils.formatNameBytes("ab", buf, 0, 4, TarUtils.FALLBACK_ENCODING);
        assertArrayEquals(new byte[]{'a', 'b', 0, 0}, buf);
    }

    // ---------------------------------------------------------------
    // formatUnsignedOctalString
    // ---------------------------------------------------------------

    @Test
    public void formatUnsignedOctalString_zero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertArrayEquals(new byte[]{'0', '0', '0', '0'}, buf);
    }

    @Test
    public void formatUnsignedOctalString_normalValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4); // octal "10"
        assertArrayEquals(new byte[]{'0', '0', '1', '0'}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_tooLarge_throws() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1); // ต้องการ >=2 digit
    }

    // ---------------------------------------------------------------
    // formatOctalBytes
    // ---------------------------------------------------------------

    @Test
    public void formatOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', ' ', 0}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3); // idx=1 -> ไม่พอสำหรับเลข 2 หลัก
    }

    // ---------------------------------------------------------------
    // formatLongOctalBytes
    // ---------------------------------------------------------------

    @Test
    public void formatLongOctalBytes_normal() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 5);
        assertEquals(5, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', ' '}, buf);
    }

    // ---------------------------------------------------------------
    // formatCheckSumOctalBytes
    // ---------------------------------------------------------------

    @Test
    public void formatCheckSumOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '1', '0', 0, ' '}, buf);
    }

    // ---------------------------------------------------------------
    // formatLongOctalOrBinaryBytes
    // ---------------------------------------------------------------

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_roundTrip() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        long value = 100L; // เล็กพอที่จะแน่ใจว่า <= MAXID เสมอ
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, TarConstants.UIDLEN);
        assertEquals(value, TarUtils.parseOctalOrBinary(buf, 0, TarConstants.UIDLEN));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_binaryOverflow_throws() {
        byte[] buf = new byte[2];
        // negative -> เข้า branch binary เสมอ, length<9 -> formatLongBinary
        // abs(value) เกิน max ที่ 1 byte field เก็บได้ (2^8)
        TarUtils.formatLongOctalOrBinaryBytes(-100000L, buf, 0, 2);
    }

    // ---------------------------------------------------------------
    // computeCheckSum
    // ---------------------------------------------------------------

    @Test
    public void computeCheckSum_emptyArray_zero() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void computeCheckSum_treatsByteAsUnsigned() {
        byte[] buf = {(byte) 0xFF}; // -1 as signed, 255 unsigned
        assertEquals(255L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void computeCheckSum_normalAsciiSum() {
        byte[] buf = {'A', 'B'}; // 65 + 66
        assertEquals(131L, TarUtils.computeCheckSum(buf));
    }

    // ---------------------------------------------------------------
    // verifyCheckSum
    // ---------------------------------------------------------------

    @Test
    public void verifyCheckSum_matchesUnsignedSum_true() {
        int offset = TarConstants.CHKSUM_OFFSET;
        int len = TarConstants.CHKSUMLEN;
        byte[] header = new byte[offset + len]; // ส่วนอื่นเป็น 0
        long spaceSum = 32L * len; // ช่อง checksum ถูกแทนด้วย ' ' ระหว่างคำนวณ
        TarUtils.formatCheckSumOctalBytes(spaceSum, header, offset, len);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_matchesSignedSumOnly_true() {
        int offset = TarConstants.CHKSUM_OFFSET;
        int len = TarConstants.CHKSUMLEN;
        byte[] header = new byte[offset + len + 1];
        header[offset + len] = (byte) 0xFF; // -1 signed / 255 unsigned

        long spaceSum = 32L * len;
        long signedSum = spaceSum - 1; // ต่างจาก unsignedSum (=spaceSum+255)
        TarUtils.formatCheckSumOctalBytes(signedSum, header, offset, len);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_storedGreaterThanUnsigned_true() {
        int offset = TarConstants.CHKSUM_OFFSET;
        int len = TarConstants.CHKSUMLEN;
        byte[] header = new byte[offset + len];
        long spaceSum = 32L * len; // unsignedSum จริง
        long storedValue = spaceSum + 16; // มากกว่า unsignedSum โดยตั้งใจ (COMPRESS-177)
        TarUtils.formatCheckSumOctalBytes(storedValue, header, offset, len);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_mismatch_false() {
        int offset = TarConstants.CHKSUM_OFFSET;
        int len = TarConstants.CHKSUMLEN;
        byte[] header = new byte[offset + len];
        // เก็บค่า 0 ซึ่งน้อยกว่า unsignedSum จริง (=32*len, len>0) และไม่เท่ากับ signedSum ด้วย
        TarUtils.formatCheckSumOctalBytes(0L, header, offset, len);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    // หมายเหตุ: ไม่ได้ทดสอบ branch ย่อยเรื่อง "digits > 6" หรือ
    // "byte ไม่ใช่ octal digit ระหว่าง parsing checksum field" โดยตรง
    // เนื่องจากไม่ทราบค่าจริงของ TarConstants.CHKSUMLEN ที่แน่นอน (สมมติเป็นค่า runtime)
    // จึงไม่ต้องการเดา behavior ที่อาจไม่ตรงกับความจริง
}
