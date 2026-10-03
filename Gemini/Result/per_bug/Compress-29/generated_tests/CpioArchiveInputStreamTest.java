package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class CpioArchiveInputStreamTest {

    // --- Tests for matches() ---
    @Test
    public void testMatchesLengthTooShort() {
        byte[] sig = new byte[] { '0', '7', '0', '7', '0' };
        assertFalse(CpioArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testMatchesBinaryNormal() {
        byte[] sig = new byte[] { 0x71, (byte) 0xc7, 0, 0, 0, 0 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesBinarySwapped() {
        byte[] sig = new byte[] { (byte) 0xc7, 0x71, 0, 0, 0, 0 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesAsciiNew() {
        // "070701"
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesAsciiNewCrc() {
        // "070702"
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x32 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesAsciiOld() {
        // "070707"
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x37 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidFirstByte() {
        byte[] sig = new byte[] { 0x31, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidSecondByte() {
        byte[] sig = new byte[] { 0x30, 0x38, 0x30, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidThirdByte() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x31, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidFourthByte() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x38, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidFifthByte() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x31, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidSixthByte() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x39 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    // --- Tests for Constructors & Basic Stream Operations ---
    @Test
    public void testConstructorsAndClose() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream cis1 = new CpioArchiveInputStream(in);
        cis1.close();
        cis1.close(); // idempotent test

        CpioArchiveInputStream cis2 = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), "US-ASCII");
        cis2.close();

        CpioArchiveInputStream cis3 = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), 512);
        cis3.close();

        CpioArchiveInputStream cis4 = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]), 512, "US-ASCII");
        cis4.close();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpenAfterClose() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        cis.close();
        cis.available();
    }

    @Test
    public void testAvailableBeforeAndAfterEOF() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // Before entry is read / setup, available checks ensureOpen
        // Let's test with a mock/empty stream where getNextEntry returns null/EOF
        // Since empty stream will throw EOFException when trying to read magic, let's test available directly via subclass or valid state if possible.
        // Actually available() checks entryEOF. Initially entryEOF is false.
        assertEquals(1, cis.available());
        cis.close();
    }

    // --- Tests for Invalid Magic and Unknown Formats ---
    @Test(expected = IOException.class)
    public void testGetNextCPIOEntryUnknownMagic() throws IOException {
        byte[] data = new byte[] { 0x00, 0x01, 'X', 'Y', 'Z', 'W', 'A', 'B' };
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(data));
        cis.getNextCPIOEntry();
    }

    // --- Tests for read() Edge Cases ---
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidOffset() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[10];
        cis.read(buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidLength() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[10];
        cis.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOutOfBounds() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[10];
        cis.read(buf, 5, 10);
    }

    @Test
    public void testReadZeroLength() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[10];
        assertEquals(0, cis.read(buf, 0, 0));
    }

    @Test
    public void testReadWhenNoEntry() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[10];
        assertEquals(-1, cis.read(buf, 0, 5));
    }

    // --- Tests for skip() Edge Cases ---
    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        cis.skip(-1L);
    }

    @Test
    public void testSkipZero() throws IOException {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        assertEquals(0, cis.skip(0L));
    }

}