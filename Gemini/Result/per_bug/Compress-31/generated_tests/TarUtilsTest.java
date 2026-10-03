package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TarUtilsTest {

    // --- parseOctal Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooShort() {
        byte[] buffer = new byte[]{ '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[]{ 0, '1', '2', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalValidWithSpacesAndNulls() {
        // " 123 \0" -> octal 123 = decimal 83
        byte[] buffer = new byte[]{ ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 6);
        assertEquals(83L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidByte() {
        byte[] buffer = new byte[]{ '1', '8', ' ' }; // '8' is invalid in octal
        TarUtils.parseOctal(buffer, 0, 3);
    }

    @Test
    public void testParseOctalTerminatedByNullInside() {
        byte[] buffer = new byte[]{ '1', '2', 0, '3', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(10L, result); // Stops at 0
    }

    // --- parseOctalOrBinary Tests ---

    @Test
    public void testParseOctalOrBinaryAsOctal() {
        byte[] buffer = new byte[]{ '0', '7', '7', ' ' };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(63L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryPositiveLong() {
        // Most significant bit set (0x80), length < 9
        byte[] buffer = new byte[]{ (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 5 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 9);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryNegativeLong() {
        // Negative binary (0xff)
        byte[] buffer = new byte[]{ (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertTrue(result < 0);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryBigIntegerPositive() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[11] = 10;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(10L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinaryBigIntegerNegative() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0xff;
        for (int i = 1; i < 12; i++) {
            buffer[i] = (byte) 0xff;
        }
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(-1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinaryExceedsSignedLong() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        // Fill with bits that exceed 63 bits
        for (int i = 1; i < 12; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 12);
    }

    // --- parseBoolean Tests ---

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[]{ 0, 1, 2 };
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertTrue(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    // --- parseName Tests ---

    @Test
    public void testParseNameBasic() throws IOException {
        byte[] buffer = new byte[]{ 't', 'e', 's', 't', 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);
    }

    @Test
    public void testParseNameEmpty() throws IOException {
        byte[] buffer = new byte[]{ 0, 0 };
        String name = TarUtils.parseName(buffer, 0, 2);
        assertEquals("", name);
    }

    // --- formatNameBytes Tests ---

    @Test
    public void testFormatNameBytesNormalAndTruncate() {
        byte[] buffer = new byte[5];
        int offset = TarUtils.formatNameBytes("hello", buffer, 0, 5);
        assertEquals(5, offset);
        assertEquals("hello", new String(buffer));

        // Truncate case
        int offset2 = TarUtils.formatNameBytes("toolong", buffer, 0, 4);
        assertEquals(4, offset2);
    }

    // --- formatUnsignedOctalString & Format Octal Tests ---

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringValue() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 4);
        assertEquals("0010", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(7L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buffer = new byte[12];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buffer, 0, 12);
        assertEquals(12, nextOffset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryNegative() {
        byte[] buffer = new byte[12];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(-1L, buffer, 0, 12);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0xff, buffer[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinaryTooLarge() {
        byte[] buffer = new byte[4];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buffer, 0, 4);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(123L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    // --- Checksum Tests ---

    @Test
    public void testComputeAndVerifyCheckSum() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        long sum = TarUtils.computeCheckSum(header);
        assertTrue(sum > 0);

        // Test verify checksum heuristic
        boolean isValid = TarUtils.verifyCheckSum(header);
        // Might be false or true depending on checksum bytes, let's format a valid checksum
        int checksumOffset = 148; // CHKSUM_OFFSET
        TarUtils.formatCheckSumOctalBytes(sum, header, checksumOffset, 8);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumCompress177Heuristic() {
        byte[] header = new byte[512];
        // Set stored sum greater than unsigned sum to trigger COMPRESS-177 branch (storedSum > unsignedSum)
        int checksumOffset = 148;
        TarUtils.formatCheckSumOctalBytes(999999L, header, checksumOffset, 8);
        boolean valid = TarUtils.verifyCheckSum(header);
        assertTrue(valid);
    }
}