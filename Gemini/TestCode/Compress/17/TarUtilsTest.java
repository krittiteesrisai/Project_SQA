package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * High-coverage JUnit 4 test suite for TarUtils (Defects4J Compress-17b)
 */
public class TarUtilsTest {

    // --- parseOctal Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooShort() {
        byte[] buffer = new byte[1];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNullReturnsZero() {
        byte[] buffer = new byte[] { 0, '1', '2', ' ', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalValidWithSpacesAndNullTrailer() {
        // " 123 \0" in ASCII: space(32), '1'(49), '2'(50), '3'(51), space(32), NUL(0)
        byte[] buffer = new byte[] { ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 6);
        assertEquals(123L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidTrailer() {
        byte[] buffer = new byte[] { '1', '2', '3', 'X' };
        TarUtils.parseOctal(buffer, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        // '8' is out of octal range ('0'-'7')
        byte[] buffer = new byte[] { '1', '8', ' ', 0 };
        TarUtils.parseOctal(buffer, 0, 4);
    }

    // --- parseOctalOrBinary Tests ---

    @Test
    public void testParseOctalOrBinaryAsOctal() {
        byte[] buffer = new byte[] { '0', '7', '7', ' ', 0 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 5);
        assertEquals(63L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryPositiveSmall() {
        // MSB set (0x80), length < 9 (e.g. 4 bytes)
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 5 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryNegativeSmall() {
        // Negative binary (0xff), length < 9
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfb }; // -5 in 2's complement
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(-5L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryBigIntegerPositive() {
        // MSB set, length >= 9
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 10 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(10L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryLongTooLargeForLength() {
        // length >= 9 inside parseBinaryLong if called directly or via invalid flows, 
        // but let's test a binary value exceeding signed long via BigInteger branch
        byte[] buffer = new byte[15];
        buffer[0] = (byte) 0x80;
        // Fill with values that exceed 63-bit integer limit
        for (int i = 1; i < 15; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 15);
    }

    // --- parseBoolean Tests ---

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] { 1 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] { 0 };
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    // --- parseName Tests ---

    @Test
    public void testParseNameStandard() throws IOException {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);
    }

    @Test
    public void testParseNameEmpty() throws IOException {
        byte[] buffer = new byte[] { 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 2);
        assertEquals("", name);
    }

    // --- formatNameBytes Tests ---

    @Test
    public void testFormatNameBytesFitAndPadding() {
        byte[] buf = new byte[6];
        int nextOffset = TarUtils.formatNameBytes("abc", buf, 0, 6);
        assertEquals(6, nextOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[4]);
        assertEquals(0, buf[5]);
    }

    @Test
    public void testFormatNameBytesTruncate() {
        byte[] buf = new byte[3];
        int nextOffset = TarUtils.formatNameBytes("toolong", buf, 0, 3);
        assertEquals(3, nextOffset);
        assertEquals('t', buf[0]);
        assertEquals('o', buf[1]);
        assertEquals('o', buf[2]);
    }

    // --- formatUnsignedOctalString & Formatting Tests ---

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals('0', buf[3]);
        assertEquals('0', buf[2]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[2];
        // Value too large for length 2 buffer
        TarUtils.formatUnsignedOctalString(1000L, buf, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buf[7]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(5L, buf, 0, 8);
        assertEquals(8, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryNegative() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(-5L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinaryTooLarge() {
        byte[] buf = new byte[4];
        // Triggers formatLongBinary exception when value is too big for the field length
        TarUtils.formatLongOctalOrBinaryBytes(0xFFFFFFFFL, buf, 0, 4);
    }

    // --- Checksum Tests ---

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[] { 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(10L, sum);
    }

    @Test
    public void testVerifyCheckSumValid() {
        byte[] header = new byte[500];
        // Format checksum area properly or mock simple valid sum
        // Setting up computeChecksum & verifyCheckSum alignment
        long computed = TarUtils.computeCheckSum(header);
        // Put octal representation of computed into checksum offset
        TarUtils.formatCheckSumOctalBytes(computed, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}