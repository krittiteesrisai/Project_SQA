package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.compress.archivers.tar.TarUtils
 * (Defects4J Compress-14b)
 *
 * หมายเหตุ:
 * - ทดสอบตาม behavior ที่ปรากฏจริงใน source code เท่านั้น
 * - สำหรับ formatLongOctalOrBinaryBytes ใช้ค่าคงที่จาก TarConstants
 *   (UIDLEN, MAXID, MAXSIZE) โดยตรง ไม่ hardcode ตัวเลข เพื่อไม่เดา behavior
 */
public class TarUtilsTest {

    // ==================== parseOctal ====================

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThan2_throws() {
        byte[] buf = {0};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test
    public void parseOctal_allNUL_returnsZero() {
        byte[] buf = new byte[8]; // all zero
        assertEquals(0L, TarUtils.parseOctal(buf, 0, 8));
    }

    @Test
    public void parseOctal_normalValue_primaryAndSecondaryTrailerRemoved() {
        // trailing NUL (primary) + space (secondary)
        byte[] buf = "755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length)); // 0755 = 493
    }

    @Test
    public void parseOctal_leadingSpacesSkipped() {
        byte[] buf = "  755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 0, buf.length));
    }

    @Test
    public void parseOctal_doubleTrailer_spaceSpace() {
        byte[] buf = "77  ".getBytes(); // two trailing spaces
        assertEquals(63L, TarUtils.parseOctal(buf, 0, buf.length)); // 077 = 63
    }

    @Test
    public void parseOctal_singleTrailer_secondarySkipped() {
        // last byte = space (primary removed), second-last = digit (secondary skipped)
        byte[] buf = {'7', '7', '7', ' '};
        assertEquals(511L, TarUtils.parseOctal(buf, 0, buf.length)); // 0777 = 511
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidTrailer_throws() {
        byte[] buf = "755X".getBytes(); // no trailing NUL/space
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidDigit_throws() {
        byte[] buf = "7A5 \0".getBytes();
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test
    public void parseOctal_withNonZeroOffset() {
        byte[] buf = "XX755 \0YY".getBytes();
        assertEquals(493L, TarUtils.parseOctal(buf, 2, 5));
    }

    // ==================== parseOctalOrBinary ====================

    @Test
    public void parseOctalOrBinary_highBitNotSet_delegatesToOctal() {
        byte[] buf = "755 \0".getBytes();
        assertEquals(493L, TarUtils.parseOctalOrBinary(buf, 0, buf.length));
    }

    @Test
    public void parseOctalOrBinary_highBitSet_binaryValue() {
        byte[] buf = new byte[] { (byte) 0x80, 5 };
        assertEquals(5L, TarUtils.parseOctalOrBinary(buf, 0, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_binaryOverflow_throws() {
        byte[] buf = new byte[9];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buf, 0, buf.length);
    }

    // ==================== parseBoolean ====================

    @Test
    public void parseBoolean_true() {
        assertTrue(TarUtils.parseBoolean(new byte[] {1}, 0));
    }

    @Test
    public void parseBoolean_falseZero() {
        assertFalse(TarUtils.parseBoolean(new byte[] {0}, 0));
    }

    @Test
    public void parseBoolean_falseOther() {
        assertFalse(TarUtils.parseBoolean(new byte[] {2}, 0));
    }

    // ==================== parseName ====================

    @Test
    public void parseName_stopsAtNUL() {
        byte[] buf = "abc\0def".getBytes();
        assertEquals("abc", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_noNUL_usesFullLength() {
        byte[] buf = "abcdef".getBytes();
        assertEquals("abcdef", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_emptyImmediateNUL() {
        byte[] buf = {0, 'x', 'y'};
        assertEquals("", TarUtils.parseName(buf, 0, buf.length));
    }

    @Test
    public void parseName_signExtension() {
        byte[] buf = new byte[] { (byte) 0xFF };
        String name = TarUtils.parseName(buf, 0, 1);
        assertEquals(1, name.length());
        assertEquals(255, name.charAt(0));
    }

    // ==================== formatNameBytes ====================

    @Test
    public void formatNameBytes_shorterThanLength_padsNUL() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals(0, buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[4]);
    }

    @Test
    public void formatNameBytes_longerThanLength_truncates() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void formatNameBytes_emptyName_allNUL() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("", buf, 0, 3);
        assertEquals(0, buf[0]);
        assertEquals(0, buf[1]);
        assertEquals(0, buf[2]);
    }

    // ==================== formatUnsignedOctalString ====================

    @Test
    public void formatUnsignedOctalString_zeroValue() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 3);
        assertEquals("000", new String(buf));
    }

    @Test
    public void formatUnsignedOctalString_normalValue() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 3);
        assertEquals("010", new String(buf)); // 8 decimal = 010 octal
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_overflow_throws() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // ==================== formatOctalBytes ====================

    @Test
    public void formatOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(' ', buf[4]);
        assertEquals(0, buf[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3);
    }

    // ==================== formatLongOctalBytes ====================

    @Test
    public void formatLongOctalBytes_normal() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(' ', buf[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalBytes_overflow_throws() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2);
    }

    // ==================== formatLongOctalOrBinaryBytes ====================

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_withinMaxId() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertEquals(' ', buf[TarConstants.UIDLEN - 1]); // trailing space => octal path
    }

    @Test
    public void formatLongOctalOrBinaryBytes_binaryPath_exceedsMaxId() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID + 1, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertTrue((buf[0] & 0x80) != 0); // binary marker bit set
    }

    @Test
    public void formatLongOctalOrBinaryBytes_octalPath_usesMaxSizeForNonUidLength() {
        int length = 12; // != UIDLEN -> uses MAXSIZE
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXSIZE, buf, 0, length);
        assertEquals(length, newOffset);
        assertEquals(' ', buf[length - 1]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_binaryPath_usesMaxSizeForNonUidLength() {
        int length = 12;
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXSIZE + 1, buf, 0, length);
        assertEquals(length, newOffset);
        assertTrue((buf[0] & 0x80) != 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_binaryOverflow_throws() {
        int length = 4; // too small for Long.MAX_VALUE in binary form
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, length);
    }

    // ==================== formatCheckSumOctalBytes ====================

    @Test
    public void formatCheckSumOctalBytes_normal() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 6);
        assertEquals(6, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('1', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals(0, buf[4]);
        assertEquals(' ', buf[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatCheckSumOctalBytes_overflow_throws() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 3);
    }

    // ==================== computeCheckSum ====================

    @Test
    public void computeCheckSum_emptyArray() {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }

    @Test
    public void computeCheckSum_normalValues() {
        byte[] buf = {1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void computeCheckSum_negativeByteMasked() {
        byte[] buf = { (byte) 0xFF }; // -1 signed, ต้อง mask เป็น 255
        assertEquals(255L, TarUtils.computeCheckSum(buf));
    }
}
