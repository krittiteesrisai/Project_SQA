package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TarArchiveInputStreamTest {

    @Test
    public void testMatches_ShortSignature() {
        byte[] shortSig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(shortSig, shortSig.length));
    }

    @Test
    public void testMatches_PosixTar() {
        byte[] header = new byte[512];
        // POSIX Magic: ustar\0 and Version: 00
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }

    @Test
    public void testMatches_GnuTarSpace() {
        byte[] header = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }

    @Test
    public void testMatches_GnuTarZero() {
        byte[] header = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }

    @Test
    public void testMatches_AntTar() {
        byte[] header = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(header, header.length));
    }

    @Test
    public void testMatches_InvalidTar() {
        byte[] header = new byte[512];
        // สุ่มข้อมูลที่ไม่ตรงกับฟอร์แมตใดๆ
        assertFalse(TarArchiveInputStream.matches(header, header.length));
    }

    @Test
    public void testAvailable_Normal() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // กำหนดค่าจำลองผ่าน reflection หรือใช้พฤติกรรมเริ่มต้น
        assertEquals(0, tais.available());
    }

    @Test(expected = IllegalStateException.class)
    public void testRead_WithoutCurrentEntry_ThrowsException() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        byte[] buf = new byte[5];
        tais.read(buf, 0, 5);
    }

    @Test
    public void testRead_AtEOF() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.setAtEOF(true);
        byte[] buf = new byte[5];
        assertEquals(-1, tais.read(buf, 0, 5));
    }

    @Test
    public void testGetRecordSize() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, 512, 1024);
        assertEquals(1024, tais.getRecordSize());
    }

    @Test
    public void testCanReadEntryData_NonTarEntry() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testParsePaxHeaders() throws Exception {
        // สร้าง Pax header สตริงจำลอง: "21 path=test/file.txt\n"
        String paxData = "21 path=test/file.txt\n";
        InputStream is = new ByteArrayInputStream(paxData.getBytes("UTF-8"));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        
        java.util.Map<String, String> headers = tais.parsePaxHeaders(is);
        assertNotNull(headers);
        assertEquals("test/file.txt", headers.get("path"));
    }
}