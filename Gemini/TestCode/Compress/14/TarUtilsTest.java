package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {

    // --- parseOctal Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooShort() {
        byte[] buffer = new byte[]{ '0' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalAllNul() {
        byte[] buffer = new byte[]{ 0, 0, 0, 0 };
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalValidWithSpacesAndNulls() {
        // " 123 \0"
        byte[] buffer = new byte[]{ ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 6);
        assertEquals(123L, result);
    }

    @Test
    public void testParseOctalValidTwoNullTrailers() {
        // "123\0\0"
        byte[] buffer = new byte[]{ '1', '2', '3', 0, 0 };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(123L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidTrailer() {
        // "123X " -> invalid trailer X
        byte[] buffer = new byte[]{ '1', '2', '3', 'X', ' ' };
        TarUtils.parseOctal(buffer, 0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        // "128 \0" -> '8' is not a valid octal digit
        byte[] buffer = new byte[]{ '1', '2', '8', ' ', 0 };
        TarUtils.parseOctal(buffer, 0, 5);
    }

    // --- parseOctalOrBinary Tests ---

    @Test
    public void testParseOctalOrBinaryAsOctal() {
        byte[] buffer = new byte[]{ '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 5);
        assertEquals(123L, result);
    }

    @Test
    public void testParseOctalOrBinaryAsBinary() {
        // First byte has 0x80 set
        byte[] buffer = new byte[]{ (byte) 0x80, 0, 0, 0, 0, 0, 0, 5 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(5L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinaryOverflow() {
        // Binary value exceeding signed long capacity
        byte[] buffer = new byte[]{ (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, 
                                    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        TarUtils.parseOctalOrBinary(buffer, 0, 8);
    }

    // --- parseBoolean Tests ---

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[]{ 1 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[]{ 0 };
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    // --- parseName & formatNameBytes Tests ---

    @Test
    public void testParseAndFormatName() {
        byte[] buffer = new byte[10];
        String name = "test";
        int updatedOffset = TarUtils.formatNameBytes(name, buffer, 0, 10);
        assertEquals(10, updatedOffset);

        String parsedName = TarUtils.parseName(buffer, 0, 10);
        assertEquals("test", parsedName);
    }

    @Test
    public void testParseNameWithNullByte() {
        byte[] buffer = new byte[]{ 'a', 'b', 0, 'c', 'd' };
        String parsedName = TarUtils.parseName(buffer, 0, 5);
        assertEquals("ab", parsedName);
    }

    // --- formatUnsignedOctalString & formatOctalBytes Tests ---

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
        int nextOffset = TarUtils.formatOctalBytes(9L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(9L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(100L, buffer, 0, 8);
        assertEquals(8, nextOffset);
    }

    // --- formatLongOctalOrBinaryBytes Tests ---

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buffer = new byte[12]; // SIZE_LEN
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buffer, 0, 12);
        assertEquals(12, nextOffset);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytesTooLarge() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buffer, 0, 2);
    }

    // --- computeCheckSum Tests ---

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[]{ 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        // 1 + 2 + 3 + 255 = 261
        assertEquals(261L, sum);
    }
}