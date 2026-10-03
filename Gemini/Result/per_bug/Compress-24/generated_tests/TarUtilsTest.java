package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TarUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidLength() {
        byte[] buffer = new byte[10];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[]{0, '1', '2', ' ', 0};
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalWithLeadingSpacesAndTrailers() {
        // "  123 \0" -> octal 123 = decimal 83
        byte[] buffer = new byte[]{' ', ' ', '1', '2', '3', ' ', 0};
        long result = TarUtils.parseOctal(buffer, 0, 7);
        assertEquals(83L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidTrailer() {
        byte[] buffer = new byte[]{'1', '2', '3', 'A'};
        TarUtils.parseOctal(buffer, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = new byte[]{'1', '8', '3', ' '};
        TarUtils.parseOctal(buffer, 0, 4);
    }

    @Test
    public void testParseOctalOrBinaryOctal() {
        byte[] buffer = new byte[]{'0', '1', '2', ' '};
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(10L, result);
    }

    @Test
    public void testParseOctalOrBinaryBinaryPositiveLong() {
        // Most significant bit set (0x80), length < 9
        byte[] buffer = new byte[]{(byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 5};
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(5L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryLongExceedsSignedLong() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80;
        // length >= 9 should trigger exception in parseBinaryLong if called directly or via helper logic
        // Let's force a scenario that hits parseBinaryLong with length >= 9
        // Wait, parseOctalOrBinary routes length >= 9 to parseBinaryBigInteger. 
        // To test parseBinaryLong's internal check: length >= 9 throws exception.
        // We can invoke parseOctalOrBinary with length 9 and MSB set.
        TarUtils.parseOctalOrBinary(buffer, 0, 9); 
    }

    @Test
    public void testParseOctalOrBinaryBinaryBigInteger() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[11] = 10;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(10L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryBigIntegerExceeds63Bits() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        // Fill with high bits to exceed 63-bit BigInteger
        for (int i = 1; i < buffer.length; i++) {
            buffer[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 12);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[]{0, 1, 2};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertTrue(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseName() throws IOException {
        byte[] buffer = new byte[]{'t', 'e', 's', 't', 0, 0};
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);

        byte[] emptyBuffer = new byte[]{0, 0};
        assertEquals("", TarUtils.parseName(emptyBuffer, 0, 2));
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buffer = new byte[5];
        int nextOffset = TarUtils.formatNameBytes("abc", buffer, 0, 5);
        assertEquals(5, nextOffset);
        assertEquals('a', buffer[0]);
        assertEquals(0, buffer[4]);

        // Test truncation branch
        int truncatedOffset = TarUtils.formatNameBytes("toolongname", buffer, 0, 3);
        assertEquals(3, truncatedOffset);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        // Value too large for length 2
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatOctalBytes(123L, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buffer[6]);
        assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatLongOctalBytes(123L, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals(' ', buffer[7]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes() {
        byte[] buffer = new byte[12];
        // Small value fits in octal
        int offset1 = TarUtils.formatLongOctalOrBinaryBytes(100L, buffer, 0, 12);
        assertEquals(12, offset1);

        // Large value forces binary
        int offset2 = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buffer, 0, 12);
        assertEquals(12, offset2);
        assertEquals((byte) 0x80, buffer[0]);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatCheckSumOctalBytes(123L, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals(0, buffer[6]);
        assertEquals(' ', buffer[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[]{'a', 'b', 'c'};
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(97 + 98 + 99, sum);
    }

    @Test
    public void testVerifyCheckSum() {
        byte[] header = new byte[512];
        // Fill with dummy data and valid checksum representation
        for (int i = 0; i < header.length; i++) {
            header[i] = 1;
        }
        // Set checksum field to spaces/octal digits as expected by verifyCheckSum
        long unsignedSum = TarUtils.computeCheckSum(header);
        // Format unsigned sum into checksum field
        TarUtils.formatCheckSumOctalBytes(unsignedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }
}