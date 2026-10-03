package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TarUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_LengthTooShort() {
        byte[] buffer = new byte[]{ '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctal_LeadingNull() {
        byte[] buffer = new byte[]{ 0, '1', '2', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_ValidWithSpacesAndNulls() {
        // " 123 \0" in ASCII
        byte[] buffer = new byte[]{ ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 6);
        assertEquals(123L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_InvalidByte() {
        // Contains '8' which is invalid octal
        byte[] buffer = new byte[]{ '1', '8', ' ' };
        TarUtils.parseOctal(buffer, 0, 3);
    }

    @Test
    public void testParseOctalOrBinary_OctalPath() {
        byte[] buffer = new byte[]{ '0', '7', '5', '5', ' ' };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 5);
        assertEquals(493L, result);
    }

    @Test
    public void testParseOctalOrBinary_BinaryLongPositive() {
        // Most significant bit set, length < 9
        byte[] buffer = new byte[]{ (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 1 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(1L, result);
    }

    @Test
    public void testParseOctalOrBinary_BinaryLongNegative() {
        byte[] buffer = new byte[]{ (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertTrue(result < 0);
    }

    @Test
    public void testParseOctalOrBinary_BinaryBigIntegerPositive() {
        // length >= 9, positive binary
        byte[] buffer = new byte[]{ (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 10);
        assertEquals(1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_BinaryBigIntegerOverflow() {
        // Exceeds 63 bits
        byte[] buffer = new byte[15];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < buffer.length; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[]{ 1, 0 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
        assertFalse(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void testParseName_NormalAndEmpty() throws IOException {
        byte[] buffer = new byte[]{ 't', 'e', 's', 't', 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);

        byte[] emptyBuf = new byte[]{ 0, 0 };
        assertEquals("", TarUtils.parseName(emptyBuf, 0, 2));
    }

    @Test
    public void testFormatNameBytes() throws IOException {
        byte[] buf = new byte[5];
        int nextOffset = TarUtils.formatNameBytes("abc", buf, 0, 5);
        assertEquals(5, nextOffset);
        assertEquals('a', buf[0]);
        assertEquals(0, buf[3]); // padded NUL
    }

    @Test
    public void testFormatUnsignedOctalString_Zero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals('0', buf[3]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_Overflow() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(999L, buf, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatOctalBytes(123L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatLongOctalBytes(123L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buf[7]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_OctalAndBinary() {
        byte[] buf = new byte[12];
        // Octal path
        int off1 = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, 12);
        assertEquals(12, off1);

        // Binary negative path
        int off2 = TarUtils.formatLongOctalOrBinaryBytes(-1L, buf, 0, 12);
        assertEquals(12, off2);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinary_TooLarge() {
        byte[] buf = new byte[4];
        // Force formatLongBinary overflow
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 4);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatCheckSumOctalBytes(123L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals(0, buf[6]);
        assertEquals(' ', buf[7]);
    }

    @Test
    public void testComputeAndVerifyCheckSum() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'a';
        }
        long sum = TarUtils.computeCheckSum(header);
        assertTrue(sum > 0);

        // Format checksum into header and verify
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}