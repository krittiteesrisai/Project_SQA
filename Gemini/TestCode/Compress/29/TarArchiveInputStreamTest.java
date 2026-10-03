package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TarArchiveInputStreamTest {

    @Test
    public void testSkipNegativeOrZero() throws IOException {
        byte[] data = new byte[512];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        assertEquals(0, tais.skip(0));
        assertEquals(0, tais.skip(-10));
    }

    @Test
    public void testAvailableWithLargeSize() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.setCurrentEntry(new TarArchiveEntry("test"));
        tais.getCurrentEntry().setSize(Long.MAX_VALUE);
        
        assertEquals(Integer.MAX_VALUE, tais.available());
    }

    @Test
    public void testGetNextTarEntryHitEOF() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tais.getNextTarEntry());
        // เรียกซ้ำขณะที่ hit EOF แล้ว เพื่อเทส branch hasHitEOF = true
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testReadWithoutCurrentEntryThrowsException() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        try {
            tais.read(new byte[1], 0, 1);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No current tar entry", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testReadAtEOFReturnsMinusOne() throws IOException {
        byte[] header = new byte[512]; // Zero filled = EOF record
        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNull(entry);
        
        // ทดสอบ read เมื่อ hasHitEOF เป็น true
        assertEquals(-1, tais.read(new byte[10], 0, 10));
    }

    @Test
    public void testMarkAndResetSupported() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.markSupported());
        // เมธอด mark และ reset ว่างเปล่า เรียกเพื่อความสมบูรณ์ของ Branch Coverage
        tais.mark(100);
        tais.reset();
    }

    @Test
    public void testGetRecordSize() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 1024, 2048);
        assertEquals(2048, tais.getRecordSize());
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tais.canReadEntryData(new TarArchiveEntry("normal")));
        assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testMatchesStaticMethod() {
        // ทดสอบความยาวน้อยกว่าที่กำหนด
        assertFalse(TarArchiveInputStream.matches(new byte[5], 5));

        // ทดสอบ POSIX Magic & Version
        byte[] posixSig = new byte[512];
        System.arraycopy("ustar\0".getBytes(), 0, posixSig, 257, 6);
        System.arraycopy("00".getBytes(), 0, posixSig, 263, 2);
        assertTrue(TarArchiveInputStream.matches(posixSig, posixSig.length));

        // ทดสอบ GNU Magic & Version (Space)
        byte[] gnuSpaceSig = new byte[512];
        System.arraycopy("ustar ".getBytes(), 0, gnuSpaceSig, 257, 6);
        System.arraycopy(" \0".getBytes(), 0, gnuSpaceSig, 263, 2);
        assertTrue(TarArchiveInputStream.matches(gnuSpaceSig, gnuSpaceSig.length));

        // ทดสอบ Ant Magic & Version
        byte[] antSig = new byte[512];
        System.arraycopy("ustar\0".getBytes(), 0, antSig, 257, 6);
        System.arraycopy("ustar\0".getBytes(), 0, antSig, 263, 6);
        assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));

        // ทดสอบค่าที่ไม่ตรงเงื่อนไขใดๆ เลย
        assertFalse(TarArchiveInputStream.matches(new byte[512], 512));
    }
}