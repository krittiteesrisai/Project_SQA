package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void parseOctal_normalValue() {
        byte[] buf = {'7', '6', '5', ' ', '\0'};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(501L, result); // octal 765 = 7*64+6*8+5
    }

    @Test
    public void parseOctal_leadingSpacesSkipped() {
        byte[] buf = {' ', ' ', '7', ' ', '\0'};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(7L, result);
    }

    @Test
    public void parseOctal_leadingNulReturnsZero() {
        byte[] buf = {0, '7', '7', '7', ' '};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test
    public void parseOctal_allNulBufferReturnsZero() {
        byte[] buf = new byte[5]; // all zero -> allowed for missing fields
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_lengthLessThanTwoThrows() {
        byte[] buf = {'7'};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_invalidDigitThrows() {
        byte[] buf = {'7', '8', '5', ' ', '\0'}; // '8' is not a valid octal digit
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test
    public void parseOctal_embeddedNulBreaksLoop() {
        byte[] buf = {'7', 0, '5', ' ', '\0'};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(7L, result); // stops parsing at embedded NUL, '5' never read
    }

    @Test
    public void parseOctal_allSpacesReturnsZero() {
        // start==end after leading-space skip -> trailing trim loop body never executes
        byte[] buf = {' ', ' ', ' ', ' ', ' '};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void parseOctalOrBinary_delegatesToOctalWhenTopBitClear() {
        byte[] buf = {'7', '6', '5', ' ', '\0'};
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(501L, result);
    }

    @Test
    public void parseOctalOrBinary_positiveBinarySmallLength() {
        // length < 9 -> parseBinaryLong; sign byte 0x80 (not 0xff) => negative=false
        byte[] buf = {(byte) 0x80, 0, 0, 0, 0, 0, 0, 5};
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(5L, result);
    }

    @Test
    public void parseOctalOrBinary_negativeBinaryRoundTrip_smallLength() {
        // Assumption: TarConstants.UIDLEN < 9 (standard tar UID field size, usually 8)
        int length = TarConstants.UIDLEN;
        byte[] buf = new byte[length];
        long value = -100L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]); // negative marker
        long decoded = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, decoded);
    }

    @Test
    public void parseOctalOrBinary_bigIntegerPath_roundTrip_longLength() {
        int length = 12; // >= 9 -> parseBinaryBigInteger
        byte[] buf = new byte[length];
        long value = -12345L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        long decoded = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, decoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_bigIntegerOverflowThrows() {
        // length >= 9 -> parseBinaryBigInteger directly.
        // sign byte positive (0x80), remainder magnitude > 63 bits -> throws
        byte[] buf = new byte[10];
        buf[0] = (byte) 0x80;
        buf[1] = 0x7F;
        for (int i = 2; i < 10; i++) {
            buf[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buf, 0, 10);
    }

    // ---------- parseBoolean ----------

    @Test
    public void parseBoolean_trueWhenOne() {
        byte[] buf = {0, 1, 0};
        assertTrue(TarUtils.parseBoolean(buf, 1));
    }

    @Test
    public void parseBoolean_falseWhenZero() {
        byte[] buf = {0, 0, 0};
        assertFalse(TarUtils.parseBoolean(buf, 1));
    }

    @Test
    public void parseBoolean_falseWhenOtherValue() {
        byte[] buf = {0, 2, 0};
        assertFalse(TarUtils.parseBoolean(buf, 1));
    }

    // ---------- parseName ----------

    @Test
    public void parseName_trailingNulTruncates() throws Exception {
        byte[] buf = new byte[16];
        byte[] src = "test.txt".getBytes("UTF-8");
        System.arraycopy(src, 0, buf, 0, src.length);
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("test.txt", name);
    }

    @Test
    public void parseName_allNulReturnsEmptyString() {
        byte[] buf = new byte[10];
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("", name);
    }

    @Test
    public void parseName_noTrailingNulUsesFullLength() throws Exception {
        byte[] buf = "abcdef".getBytes("UTF-8");
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("abcdef", name);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void formatNameBytes_shorterNamePaddedWithNul() {
        byte[] buf = new byte[10];
        Arrays.fill(buf, (byte) 'X');
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        for (int i = 2; i < 10; i++) {
            assertEquals(0, buf[i]);
        }
    }

    @Test
    public void formatNameBytes_exactLengthNoPadding() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("abc", buf, 0, 3);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void formatNameBytes_longerNameTruncated() {
        byte[] buf = new byte[3];
        TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void formatNameBytes_emptyNameFillsAllNul() {
        byte[] buf = new byte[4];
        Arrays.fill(buf, (byte) 'Z');
        TarUtils.formatNameBytes("", buf, 0, 4);
        for (int i = 0; i < 4; i++) {
            assertEquals(0, buf[i]);
        }
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void formatUnsignedOctalString_zeroValue() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertArrayEquals(new byte[]{'0', '0', '0', '0'}, buf);
    }

    @Test
    public void formatUnsignedOctalString_exactFitNoLeadingZeroLoop() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(511L, buf, 0, 3); // octal 777
        assertArrayEquals(new byte[]{'7', '7', '7'}, buf);
    }

    @Test
    public void formatUnsignedOctalString_paddedWithLeadingZeros() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 6); // octal 10
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '1', '0'}, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_tooLargeForBufferThrows() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1); // needs 2 octal digits
    }

    // ---------- formatOctalBytes / formatLongOctalBytes / formatCheckSumOctalBytes ----------

    @Test
    public void formatOctalBytes_basic() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '1', '0', ' ', 0}, buf);
    }

    @Test
    public void formatLongOctalBytes_basic() {
        byte[] buf = new byte[7];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 7);
        assertEquals(7, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '1', '0', ' '}, buf);
    }

    @Test
    public void formatCheckSumOctalBytes_basic() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '1', '0', 0, ' '}, buf);
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void formatLongOctalOrBinaryBytes_smallValueUsesOctalEncoding() {
        int length = TarConstants.UIDLEN;
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(8L, buf, 0, length);
        assertEquals(length, newOffset);
        assertEquals(0, buf[0] & 0x80); // ASCII digit -> top bit clear
    }

    @Test
    public void formatLongOctalOrBinaryBytes_atMaxOctalBoundaryUsesOctal() {
        int length = TarConstants.UIDLEN;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXID, buf, 0, length);
        assertEquals(0, buf[0] & 0x80);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_justAboveMaxUsesBinary() {
        int length = TarConstants.UIDLEN;
        byte[] buf = new byte[length];
        long value = TarConstants.MAXID + 1;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0x80, buf[0]); // positive binary marker
    }

    @Test
    public void formatLongOctalOrBinaryBytes_nonUidLengthBoundary() {
        int length = 12; // length != UIDLEN -> maxAsOctalChar = MAXSIZE
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, buf, 0, length);
        assertEquals(0, buf[0] & 0x80);

        byte[] buf2 = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE + 1, buf2, 0, length);
        assertEquals((byte) 0x80, buf2[0]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_negativeUsesBinaryMarker() {
        int length = 12;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(-5L, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_smallLengthTooLargeThrows() {
        int length = TarConstants.UIDLEN; // assumed < 9
        byte[] buf = new byte[length];
        // NOTE: exercises formatLongBinary's bound check (val >= 2^((length-1)*8)).
        // Due to a missing 'return' after the length<9 branch in the source,
        // formatBigIntegerBinary would run redundantly if this call succeeded;
        // here we only verify the (early) exception path.
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, length);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void computeCheckSum_basic() {
        byte[] buf = {0, 1, 2, (byte) 255};
        assertEquals(258L, TarUtils.computeCheckSum(buf));
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void verifyCheckSum_validChecksumReturnsTrue() {
        int size = TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN;
        byte[] header = new byte[size];
        Arrays.fill(header, (byte) 'A');
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_wrongChecksumReturnsFalse() {
        int size = TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN;
        byte[] header = new byte[size];
        Arrays.fill(header, (byte) 'A');
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(Math.max(sum - 1000, 0L), header,
                TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_storedGreaterThanActualReturnsTrue() {
        int size = TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN;
        byte[] header = new byte[size];
        Arrays.fill(header, (byte) 'A');
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        // COMPRESS-177: stored sum intentionally larger than actual computed sum
        TarUtils.formatCheckSumOctalBytes(sum + 1000, header,
                TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_noDigitsInChecksumFieldReturnsFalse() {
        int size = TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN;
        byte[] header = new byte[size];
        Arrays.fill(header, (byte) 'A');
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' '; // no octal digit at all -> storedSum stays 0
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_digitCapBranchExercised() {
        // Assumption: TarConstants.CHKSUMLEN == 8 (standard tar checksum field size)
        int size = TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN;
        byte[] header = new byte[size];
        Arrays.fill(header, (byte) 'A');
        byte[] digits = {'1', '2', '3', '4', '5', '6', '7', '7'}; // >6 digit chars
        for (int i = 0; i < TarConstants.CHKSUMLEN && i < digits.length; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = digits[i];
        }
        boolean result = TarUtils.verifyCheckSum(header);

        long expectedStoredSum = 42798L; // octal value of first six digits "123456"
        long unsignedSum = (long) TarConstants.CHKSUM_OFFSET * ('A' & 0xff)
                + (long) TarConstants.CHKSUMLEN * (' ' & 0xff);
        boolean expected = expectedStoredSum == unsignedSum || expectedStoredSum > unsignedSum;
        assertEquals(expected, result);
    }
}
