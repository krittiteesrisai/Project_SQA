package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class CpioArchiveInputStreamTest {

    @Test
    public void testMatchesLengthTooShort() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37 };
        assertFalse(CpioArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesBinaryNormal() {
        byte[] sig = new byte[] { 0x71, (byte) 0xc7, 0x00, 0x00, 0x00, 0x00 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesBinarySwapped() {
        byte[] sig = new byte[] { (byte) 0xc7, 0x71, 0x00, 0x00, 0x00, 0x00 };
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
    public void testMatchesInvalidAsciiPrefix() {
        // ผิดตัวแรก ไม่ใช่ 0x30
        byte[] sig = new byte[] { 0x31, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));

        // ผิดตัวที่สอง
        byte[] sig2 = new byte[] { 0x30, 0x36, 0x30, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig2, 6));

        // ผิดตัวที่สาม
        byte[] sig3 = new byte[] { 0x30, 0x37, 0x31, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig3, 6));

        // ผิดตัวที่สี่
        byte[] sig4 = new byte[] { 0x30, 0x37, 0x30, 0x36, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig4, 6));

        // ผิดตัวที่ห้า
        byte[] sig5 = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x31, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig5, 6));
    }

    @Test
    public void testMatchesInvalidSuffix() {
        // ตัวสุดท้ายไม่ใช่ 1, 2, 7 (เช่น 0x33)
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x33 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test(expected = IOException.class)
    public void testEnsureOpenThrowsExceptionWhenClosed() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        ais.close();
        ais.available(); // ต้องโยน IOException เพราะสตรีมถูกปิดแล้ว
    }

    @Test
    public void testAvailableBeforeAndAfterRead() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        // ตอนเริ่มต้นสตรีมยังไม่ถูกอ่านตัวเอนทรี (แต่เช็ค open ได้)
        // ทดสอบพฤติกรรม available() เมื่อ entryEOF = false
        try {
            ais.available();
        } catch (IOException e) {
            // expected if stream state requires entry
        }
        ais.close();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidOffset() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        byte[] buf = new byte[10];
        ais.read(buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidLen() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        byte[] buf = new byte[10];
        ais.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOutOfBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        byte[] buf = new byte[10];
        ais.read(buf, 5, 10);
    }

    @Test
    public void testReadZeroLen() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        byte[] buf = new byte[10];
        assertEquals(0, ais.read(buf, 0, 0));
        ais.close();
    }

    @Test
    public void testReadWhenNoEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        byte[] buf = new byte[10];
        assertEquals(-1, ais.read(buf, 0, 5));
        ais.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        ais.skip(-1);
    }

    @Test(expected = IOException.class)
    public void testGetNextCPIOEntryUnknownMagic() throws IOException {
        // ข้อมูลจำลองที่มี magic ผิดพลาด
        byte[] badData = new byte[] { 0x12, 0x34, 0x56, 0x78, 0x00, 0x00, 0x00, 0x00 };
        ByteArrayInputStream bais = new ByteArrayInputStream(badData);
        CpioArchiveInputStream ais = new CpioArchiveInputStream(bais);
        try {
            ais.getNextCPIOEntry();
        } finally {
            ais.close();
        }
    }
}