package org.apache.commons.compress.archivers.tar;

import junit.framework.TestCase;

/**
 * High-coverage JUnit 4 (JUnit 3 compatible syntax for runner) test suite for TarUtils.
 * Focuses on Branch/Condition coverage and edge cases targeting Defects4J (Compress-8b).
 */
public class TarUtilsTest extends TestCase {

    public TarUtilsTest(String name) {
        super(name);
    }

    // --- Tests for parseOctal ---

    public void testParseOctal_AllNuls() {
        byte[] buffer = new byte[] { 0, 0, 0, 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    public void testParseOctal_LeadingSpacesAndZeros() {
        // "  0123" with trailing space and NUL
        byte[] buffer = "  0123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, result); // Octal 123 = Decimal 83
    }

    public void testParseOctal_ValidSimple() {
        byte[] buffer = "123 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, result);
    }

    public void testParseOctal_EarlyNullTermination() {
        // Should stop parsing at the first NUL byte
        byte[] buffer = new byte[] { '1', '2', 0, '3', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(10L, result); // Octal 12 = Decimal 10
    }

    public void testParseOctal_SpaceBreaksPadding() {
        byte[] buffer = "123 45".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, result);
    }

    public void testParseOctal_InvalidByteThrowsException() {
        byte[] buffer = "128 ".getBytes(); // '8' is invalid in octal
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException due to invalid octal digit '8'");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    // --- Tests for parseName ---

    public void testParseName_Normal() {
        byte[] buffer = "hello\0world".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", name);
    }

    public void testParseName_FullLengthNoNull() {
        byte[] buffer = "test".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("test", name);
    }

    public void testParseName_HighBitBytes() {
        // Test sign extension handling with (b & 0xFF)
        byte[] buffer = new byte[] { (byte) 0x80, (byte) 0xFF, 0 };
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals(2, name.length());
        assertEquals(128, name.charAt(0));
        assertEquals(255, name.charAt(1));
    }

    // --- Tests for formatNameBytes ---

    public void testFormatNameBytes_ShortNamePaddedWithNulls() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatNameBytes("test", buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals('t', buffer[0]);
        assertEquals('s', buffer[3]);
        assertEquals(0, buffer[4]); // Padding null
        assertEquals(0, buffer[7]); // Padding null
    }

    public void testFormatNameBytes_LongNameTruncated() {
        byte[] buffer = new byte[3];
        int nextOffset = TarUtils.formatNameBytes("toolong", buffer, 0, buffer.length);
        assertEquals(3, nextOffset);
        assertEquals('t', buffer[0]);
        assertEquals('o', buffer[1]);
        assertEquals('o', buffer[2]);
    }

    // --- Tests for formatUnsignedOctalString & formatOctalBytes variants ---

    public void testFormatUnsignedOctalString_Zero() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, buffer.length);
        assertEquals("0000", new String(buffer));
    }

    public void testFormatUnsignedOctalString_ValueFit() {
        byte[] buffer = new byte[4];
        // Octal of 8 = "10" -> padded with leading zeros -> "0010"
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, buffer.length);
        assertEquals("0010", new String(buffer));
    }

    public void testFormatUnsignedOctalString_ValueTooLargeThrowsException() {
        byte[] buffer = new byte[2];
        try {
            // Value too large for length 2 buffer
            TarUtils.formatUnsignedOctalString(64L, buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException because value does not fit");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer"));
        }
    }

    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(7L, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        // Format: octal with leading zeros, followed by space and NUL
        // length = 8, idx = 6. Octal '7' in 6 chars = "000007", then ' ' and '\0'
        assertEquals('7', buffer[5]);
        assertEquals(' ', buffer[6]);
        assertEquals(0, buffer[7]);
    }

    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        // Format: octal with leading zeros, followed by space (no trailing NUL at the very end of idx)
        assertEquals(' ', buffer[7]);
    }

    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(7L, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        // Format: octal, followed by NUL and then space
        assertEquals(0, buffer[6]);
        assertEquals(' ', buffer[7]);
    }

    // --- Tests for computeCheckSum ---

    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        // 1 + 2 + 3 + 255 = 261
        assertEquals(261L, sum);
    }
}