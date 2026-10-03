package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TarUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidLengthTooShort() {
        byte[] buffer = new byte[10];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNulReturnsZero() {
        byte[] buffer = new byte[] { 0, '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalWithSpacesAndTrailers() {
        // "  123 \0"
        byte[] buffer = new byte[] { ' ', ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(123L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        // '8' is invalid in octal
        byte[] buffer = new byte[] { '1', '8', ' ', 0 };
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinaryOctalBranch() {
        // MSB is 0 -> Octal
        byte[] buffer = new byte[] { '0', '0', '0', '0', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(83L, result); // octal 123
    }

    @Test
    public void testParseOctalOrBinaryBinaryLongPositive() {
        // MSB set, length < 9, positive
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 5 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinaryBinaryLongNegative() {
        // MSB set (0xff), length < 9, negative (2's complement)
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertTrue(result < 0);
    }

    @Test
    public void testParseOctalOrBinaryBinaryBigIntegerPositive() {
        // MSB set, length >= 9
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinaryBinaryBigIntegerOverflow() {
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
        byte[] buffer = new byte[] { 1, 0, 5 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
        assertFalse(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseNameDefaultAndFallbackEncoding() throws IOException {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 0 };
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("test", name);

        // Test empty name branch (all zeros)
        byte[] emptyBuffer = new byte[] { 0, 0 };
        assertEquals("", TarUtils.parseName(emptyBuffer, 0, emptyBuffer.length));
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buf = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("hello", buf, 0, 10);
        assertEquals(10, nextOffset);
        assertEquals('h', buf[0]);
        assertEquals(0, buf[5]); // padding NUL
    }

    @Test
    public void testFormatUnsignedOctalStringEdgeCases() {
        byte[] buf = new byte[8];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 8);
        assertEquals('0', buf[7]);

        TarUtils.formatUnsignedOctalString(63L, buf, 0, 8);
        
        // Test exception when value doesn't fit
        try {
            TarUtils.formatUnsignedOctalString(Long.MAX_VALUE, buf, 0, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit"));
        }
    }

    @Test
    public void testFormatOctalBytesAndLongOctalBytes() {
        byte[] buf = new byte[12];
        int off1 = TarUtils.formatOctalBytes(123L, buf, 0, 12);
        assertEquals(12, off1);

        int off2 = TarUtils.formatLongOctalBytes(123L, buf, 0, 12);
        assertEquals(12, off2);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes() {
        byte[] buf = new byte[12];
        // Test as octal
        int off1 = TarUtils.formatLongOctalOrBinaryBytes(123L, buf, 0, 12);
        assertEquals(12, off1);

        // Test as binary (negative)
        int off2 = TarUtils.formatLongOctalOrBinaryBytes(-1L, buf, 0, 12);
        assertEquals(12, off2);

        // Test as binary (large positive value)
        int off3 = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 12);
        assertEquals(12, off3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinaryTooLarge() {
        byte[] buf = new byte[4];
        // Forces formatLongBinary to throw exception when val >= max
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 4);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int off = TarUtils.formatCheckSumOctalBytes(123L, buf, 0, 8);
        assertEquals(8, off);
    }

    @Test
    public void testComputeAndVerifyCheckSum() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        long sum = TarUtils.computeCheckSum(header);
        assertTrue(sum > 0);

        // Verify checksum basic execution
        boolean isValid = TarUtils.verifyCheckSum(header);
        // Might be false since checksum bytes aren't properly populated, but exercises the branch
        assertFalse(isValid);
    }
}