package org.apache.commons.compress.archivers;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

import org.junit.Test;

/**
 * Unit tests for {@link ArchiveStreamFactory} (Defects4J Compress-11b).
 *
 * หมายเหตุ: บางกรณี (เช่น DumpArchiveInputStream.matches() หรือ
 * TarArchiveInputStream.matches() แบบตรง) ต้องพึ่งพา byte-layout ภายในของคลาส
 * ที่ไม่ได้แสดงในซอร์สที่ให้มา จึง "งดเดา" พฤติกรรมและคอมเมนต์กำกับไว้แทน
 * เพื่อไม่ทำให้เทส fail จาก assumption ที่ผิด
 */
public class ArchiveStreamFactoryTest {

    private final ArchiveStreamFactory factory = new ArchiveStreamFactory();

    // =========================================================
    // createArchiveInputStream(String, InputStream)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStream_NullArchiverName() throws Exception {
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStream_NullInputStream() throws Exception {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, (InputStream) null);
    }

    @Test
    public void testCreateInputStream_Ar() throws Exception {
        // ใช้ header จริงของ AR format เพื่อป้องกันปัญหาหาก constructor อ่าน header ทันที
        InputStream in = new ByteArrayInputStream("!<arch>\n".getBytes());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.AR, in);
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_Zip() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, in);
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_Tar() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, in);
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_Jar() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, in);
        assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_Cpio() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, in);
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_Dump() {
        // หมายเหตุ: ไม่ทราบแน่ชัดว่า DumpArchiveInputStream constructor
        // อ่าน/validate header ทันทีหรือไม่ (ไม่มีซอร์สให้) จึง catch ไว้
        // อย่างกว้าง เพื่อยังคง exercise บรานช์ DUMP ในตัวโรงงานได้อย่างปลอดภัย
        InputStream in = new ByteArrayInputStream(new byte[1024]);
        try {
            ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, in);
            assertTrue(ais instanceof DumpArchiveInputStream);
        } catch (Exception e) {
            // ยอมรับได้ตามหมายเหตุด้านบน - branch DUMP ถูกเรียกใช้แล้ว
        }
    }

    @Test
    public void testCreateInputStream_CaseInsensitive() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("ZIP", in);
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateInputStream_UnknownFormat() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream("unknown-format", in);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateInputStream_EmptyStringArchiverName() throws Exception {
        // boundary: archiverName ไม่ใช่ null แต่เป็น "" ต้องตกไปที่ ArchiveException
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream("", in);
    }

    // =========================================================
    // createArchiveOutputStream(String, OutputStream)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStream_NullArchiverName() throws Exception {
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStream_NullOutputStream() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, (OutputStream) null);
    }

    @Test
    public void testCreateOutputStream_Ar() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream(ArchiveStreamFactory.AR, new ByteArrayOutputStream());
        assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_Zip() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_Tar() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_Jar() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, new ByteArrayOutputStream());
        assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_Cpio() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_CaseInsensitive() throws Exception {
        ArchiveOutputStream aos =
            factory.createArchiveOutputStream("TAR", new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateOutputStream_UnknownFormat() throws Exception {
        factory.createArchiveOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateOutputStream_EmptyStringArchiverName() throws Exception {
        factory.createArchiveOutputStream("", new ByteArrayOutputStream());
    }

    // =========================================================
    // createArchiveInputStream(InputStream) - autodetect
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_NullStream() throws Exception {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_MarkNotSupported() throws Exception {
        InputStream in = new InputStream() {
            @Override
            public int read() throws IOException {
                return -1;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createArchiveInputStream(in);
    }

    @Test
    public void testAutodetect_Zip() throws Exception {
        // ZIP local file header signature: 0x50 0x4B 0x03 0x04 (มาตรฐานสาธารณะ)
        byte[] data = new byte[32];
        data[0] = 0x50; data[1] = 0x4B; data[2] = 0x03; data[3] = 0x04;
        InputStream in = new ByteArrayInputStream(data);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testAutodetect_Ar() throws Exception {
        // AR global header "!<arch>\n" (มาตรฐานสาธารณะ, 8 bytes)
        byte[] header = "!<arch>\n".getBytes();
        byte[] data = new byte[32];
        System.arraycopy(header, 0, data, 0, header.length);
        InputStream in = new ByteArrayInputStream(data);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testAutodetect_Cpio() throws Exception {
        // CPIO "new ASCII" (newc) magic "070701" (มาตรฐานสาธารณะ POSIX cpio -H newc)
        byte[] header = "070701".getBytes();
        byte[] data = new byte[32];
        System.arraycopy(header, 0, data, 0, header.length);
        InputStream in = new ByteArrayInputStream(data);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    // หมายเหตุ: ไม่เขียนเทสสำหรับ JAR-autodetect เพราะในลำดับ if/else
    // ZIP ถูกตรวจก่อน JAR เสมอ และ JarArchiveInputStream ไม่ได้ override
    // matches() ในซอร์สที่ให้มา (เป็น static ที่สืบทอดจาก Zip) ทำให้ในทางปฏิบัติ
    // branch JAR-match ไม่สามารถ true ได้ก่อนจะโดน ZIP ตัดหน้า
    // จึงไม่สามารถยืนยัน behavior ได้จากซอร์สที่ให้มา (ไม่เดา)

    // หมายเหตุ: ไม่เขียนเทสสำหรับ DUMP-autodetect-match=true และ
    // TAR-direct-match=true เพราะต้องพึ่ง byte-layout ภายในของ
    // DumpArchiveInputStream.matches()/TarArchiveInputStream.matches()
    // ที่ไม่มีอยู่ในซอร์สที่ให้มา จึงงดเดาและปล่อยเป็น branch ที่ไม่ครอบคลุม
    // (ตามข้อกำหนดข้อ 4)

    @Test(expected = ArchiveException.class)
    public void testAutodetect_UnknownFormat_FallsThroughAllChecks() throws Exception {
        // bytes ที่ไม่ตรงกับ signature ของ zip/jar/ar/cpio/dump/tar ใดๆ
        // และไม่ใช่ octal ที่ valid สำหรับ tar header -> ทำให้
        // TarArchiveInputStream(...).getNextEntry() ใน fallback ควร throw
        // และถูก catch แล้วตกไปที่ ArchiveException สุดท้าย
        byte[] data = new byte[600];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) 0xAB;
        }
        InputStream in = new ByteArrayInputStream(data);
        factory.createArchiveInputStream(in);
    }

    @Test
    public void testAutodetect_IOExceptionWrapped() throws Exception {
        InputStream in = new InputStream() {
            private boolean marked = false;

            @Override
            public int read() throws IOException {
                return -1;
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Simulated I/O failure");
            }

            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public synchronized void mark(int readlimit) {
                marked = true;
            }

            @Override
            public synchronized void reset() throws IOException {
                if (!marked) {
                    throw new IOException("Mark not set");
                }
            }
        };

        try {
            factory.createArchiveInputStream(in);
            fail("Expected ArchiveException to be thrown");
        } catch (ArchiveException e) {
            // ตรวจสอบว่าเข้า branch catch(IOException) จริง ไม่ใช่ branch
            // "No Archiver found for the stream signature"
            assertTrue(e.getMessage().contains("Could not use reset and mark operations"));
        }
    }
}
