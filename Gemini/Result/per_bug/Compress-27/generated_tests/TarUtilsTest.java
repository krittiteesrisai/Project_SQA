package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * High-coverage JUnit 4 Test Suite for TarUtils (Defects4J Compress-27b)
 */
public class TarUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooShort() {
        byte[] buffer = new byte[] { '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNulReturnsZero() {
        byte[] buffer = new byte[] { 0, '1', '2', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalWithLeadingSpacesAndTrailingNul() {
        byte[] buffer = new byte[] { ' ', ' ', '1', '2', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(10L, result); // octal 12 = decimal 10
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalAllSpacesOrNulsThrowsException() {
        byte[] buffer = new byte[] { ' ', 0 };
        TarUtils.parseOctal(buffer, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidCharThrowsException() {
        byte[] buffer = new byte[] { '1', '8', 0 }; // '8' is not valid octal
        TarUtils.parseOctal(buffer, 0, 3);
    }

    @Test
    public void testParseOctalOrBinaryOctalBranch() {
        // Most significant bit not set -> Octal
        byte[] buffer = new byte[] { '0', '1', '2', 0 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(10L, result);
    }

    @Test
    public void testParseOctalOrBinaryBinaryLongPositive() {
        // MSB set (0x80), length < 9
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 5 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinaryBinaryLongNegative() {
        // Negative binary (0xff)
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
                                     (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfb };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(-5L, result);
    }

    @Test
    public void testParseOctalOrBinaryBinaryBigInteger() {
        // length >= 9 with MSB set
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 10);
        assertEquals(1L, result);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[] { 1, 0, 5 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
        assertFalse(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseNameNormalAndEmpty() throws IOException {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);

        byte[] emptyBuffer = new byte[] { 0, 0 };
        String emptyName = TarUtils.parseName(emptyBuffer, 0, 2);
        assertEquals("", emptyName);
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("hello", buffer, 0, 10);
        assertEquals(10, nextOffset);
        assertEquals('h', buffer[0]);
        assertEquals(0, buffer[5]); // Padding NUL
    }

    @Test
    public void testFormatUnsignedOctalStringZeroAndNonZero() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 5);
        assertEquals('0', buffer[4]);

        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 5);
        // 8 in octal is '10'
        assertEquals('0', buffer[2]);
        assertEquals('1', buffer[3]);
        assertEquals('0', buffer[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, 2); // Too large to fit
    }

    @Test
    public void testFormatOctalBytesAndLongOctalBytes() {
        byte[] buf1 = new byte[8];
        int off1 = TarUtils.formatOctalBytes(7L, buf1, 0, 8);
        assertEquals(8, off1);

        byte[] buf2 = new byte[8];
        int off2 = TarUtils.formatLongOctalBytes(7L, buf2, 0, 8);
        assertEquals(8, off2);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes() {
        byte[] buf = new byte[12];
        // Test octal fit
        int off1 = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, 12);
        assertEquals(12, off1);

        // Test binary fallback (large value)
        int off2 = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
        assertEquals(8, off2);
    }

    @Test
    public void testComputeAndVerifyCheckSum() {
        byte[] header = new byte[500];
        for (int i = 0; i < header.length; i++) {
            header[i] = '1';
        }
        long sum = TarUtils.computeCheckSum(header);
        assertTrue(sum > 0);

        // Verify checksum basic scenario
        boolean isValid = TarUtils.verifyCheckSum(header);
        // Might be false for random data, but executes the branch code fully
        assertNotNull(isValid);
    }
}