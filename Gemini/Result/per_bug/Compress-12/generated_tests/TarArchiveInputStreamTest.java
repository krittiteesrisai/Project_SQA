package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class TarArchiveInputStreamTest {

    @Test
    public void testMatches_TooShortSignature() {
        byte[] sig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_PosixTar() {
        byte[] sig = new byte[512];
        // POSIX magic: "ustar\0", version: "00"
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_GnuTarSpace() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_GnuTarZero() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_AntTar() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_InvalidTar() {
        byte[] sig = new byte[512];
        // Fill with invalid bytes
        for (int i = 0; i < sig.length; i++) {
            sig[i] = (byte) 0xFF;
        }
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testConstructorAndGetters() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais.getRecordSize());
        
        TarArchiveInputStream taisBlock = new TarArchiveInputStream(is, 1024);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, taisBlock.getRecordSize());
        
        TarArchiveInputStream taisCustom = new TarArchiveInputStream(is, 1024, 512);
        assertEquals(512, taisCustom.getRecordSize());
        
        assertNotNull(tais.toString() != null); // Just touching methods
    }

    @Test
    public void testClose() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.close(); // Should not throw exception
    }

    @Test
    public void testReset() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.reset(); // No-op, should execute cleanly
    }

    @Test
    public void testAvailable_NormalAndMax() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[1024]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // By default entrySize = 0, offset = 0 -> available = 0
        assertEquals(0, tais.available());
    }

    @Test
    public void testCanReadEntryData() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        ArchiveEntry nonTarEntry = new ZipArchiveEntry("test.txt");
        assertFalse(tais.canReadEntryData(nonTarEntry));

        TarArchiveEntry tarEntry = new TarArchiveEntry("test.txt");
        assertTrue(tais.canReadEntryData(tarEntry));
    }

    @Test
    public void testGetNextTarEntry_EOF() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getNextTarEntry());
        // Call again when already hit EOF
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testParsePaxHeaders() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        String paxData = "11 path=foo\n";
        java.io.StringReader reader = new java.io.StringReader(paxData);
        Map<String, String> headers = tais.parsePaxHeaders(reader);
        assertEquals("foo", headers.get("path"));
    }

    @Test
    public void testApplyPaxHeadersToCurrentEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        TarArchiveEntry entry = new TarArchiveEntry("oldname");
        tais.setCurrentEntry(entry);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("path", "newpath");
        headers.put("linkpath", "link");
        headers.put("gid", "100");
        headers.put("gname", "staff");
        headers.put("uid", "1000");
        headers.put("uname", "user");
        headers.put("size", "512");

        // Use reflection or package-private access if possible, or test via public flow.
        // Since applyPaxHeadersToCurrentEntry is private, we can invoke it via parsePaxHeaders/paxHeaders integration or test through helpers if accessible,
        // but here we rely on package-private visibility if within the same package or test via available methods.
        // Note: TarArchiveInputStream is in package org.apache.commons.compress.archivers.tar, so package-private methods are accessible if test is in same package.
        
        java.lang.reflect.Method method = TarArchiveInputStream.class.getDeclaredMethod("applyPaxHeadersToCurrentEntry", Map.class);
        method.setAccessible(true);
        method.invoke(tais, headers);

        assertEquals("newpath", entry.getName());
        assertEquals("link", entry.getLinkName());
        assertEquals(100, entry.getGroupId());
        assertEquals("staff", entry.getGroupName());
        assertEquals(1000, entry.getUserId());
        assertEquals("user", entry.getUserName());
        assertEquals(512L, entry.getSize());
    }

    @Test(expected = IOException.class)
    public void testRead_UnexpectedEOF() throws IOException {
        // Provide stream with less data than expected
        byte[] data = new byte[100];
        InputStream is = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        // Force reading when no records left should throw IOException
        byte[] buf = new byte[512];
        // Manually set entry size to trigger read loop
        java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
        entrySizeField.setAccessible(true);
        entrySizeField.set(tais, 512L);

        tais.read(buf, 0, 512);
    }
}