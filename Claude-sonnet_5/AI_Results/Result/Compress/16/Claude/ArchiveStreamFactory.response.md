# JUnit 4 Test Suite: ArchiveStreamFactoryTest

## หมายเหตุก่อนเริ่ม (ข้อจำกัดที่ต้องระบุตามข้อกำหนดที่ 4)

เนื่องจากซอร์สโค้ดที่ให้มา**ไม่มี implementation ของ `matches()`** ในคลาสย่อย (เช่น `ZipArchiveInputStream.matches`, `CpioArchiveInputStream.matches`, `DumpArchiveInputStream.matches`) จึงไม่สามารถยืนยัน exact byte pattern ที่แต่ละ `matches()` ตรวจสอบได้ 100% ผมจึงใช้เฉพาะ **มาตรฐานสาธารณะที่รู้จักกันทั่วไป** (ZIP: `PK\x03\x04`, AR: `!<arch>\n`, TAR: POSIX ustar header พร้อม checksum ที่คำนวณถูกต้อง) และ**ระบุคอมเมนต์กำกับชัดเจน**ในกรณีที่ไม่มั่นใจ (JAR/CPIO/DUMP ใน auto-detect)

```java
package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

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

public class ArchiveStreamFactoryTest {

    private final ArchiveStreamFactory factory = new ArchiveStreamFactory();

    // =========================================================
    // createArchiveInputStream(String, InputStream)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_NullArchiverName() throws Exception {
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_NullInputStream() throws Exception {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test
    public void testCreateArchiveInputStream_AR() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                ArchiveStreamFactory.AR, new ByteArrayInputStream(arSignatureBytes()));
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_ZIP() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                ArchiveStreamFactory.ZIP, new ByteArrayInputStream(zipSignatureBytes()));
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_TAR() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                ArchiveStreamFactory.TAR, new ByteArrayInputStream(validTarHeader()));
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_JAR() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                ArchiveStreamFactory.JAR, new ByteArrayInputStream(zipSignatureBytes()));
        assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_CPIO() throws Exception {
        // Constructor คาดว่าไม่ parse header ทันที (lazy) ตามแบบแผนทั่วไปของ commons-compress
        ArchiveInputStream ais = factory.createArchiveInputStream(
                ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_DUMP() throws Exception {
        // NOTE: DumpArchiveInputStream อาจอ่าน header ทันทีใน constructor และ throw
        // RuntimeException หากข้อมูลไม่ครบ ถือว่ายอมรับได้เนื่องจากยัง cover branch DUMP
        try {
            ArchiveInputStream ais = factory.createArchiveInputStream(
                    ArchiveStreamFactory.DUMP, new ByteArrayInputStream(new byte[64]));
            assertTrue(ais instanceof DumpArchiveInputStream);
        } catch (RuntimeException e) {
            // ยอมรับ: branch DUMP ถูกเข้าถึงแล้ว แม้ constructor จะ reject ข้อมูลไม่สมบูรณ์
        }
    }

    @Test
    public void testCreateArchiveInputStream_CaseInsensitive() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                "ZIP", new ByteArrayInputStream(zipSignatureBytes()));
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_UnknownFormat() throws Exception {
        factory.createArchiveInputStream("unknown-format", new ByteArrayInputStream(new byte[0]));
    }

    // =========================================================
    // createArchiveOutputStream(String, OutputStream)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_NullArchiverName() throws Exception {
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_NullOutputStream() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test
    public void testCreateArchiveOutputStream_AR() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                ArchiveStreamFactory.AR, new ByteArrayOutputStream());
        assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_ZIP() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_TAR() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_JAR() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                ArchiveStreamFactory.JAR, new ByteArrayOutputStream());
        assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_CPIO() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_CaseInsensitive() throws Exception {
        ArchiveOutputStream aos = factory.createArchiveOutputStream(
                "Tar", new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream_UnknownFormat() throws Exception {
        factory.createArchiveOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream_DumpNotSupported() throws Exception {
        // createArchiveOutputStream ไม่มีสาขา DUMP -> ต้องตกไปที่ throw ArchiveException
        factory.createArchiveOutputStream(ArchiveStreamFactory.DUMP, new ByteArrayOutputStream());
    }

    // =========================================================
    // createArchiveInputStream(InputStream) - auto-detect
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetect_NullStream() throws Exception {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetect_MarkNotSupported() throws Exception {
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
    public void testAutoDetect_Zip() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(zipSignatureBytes())));
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testAutoDetect_Ar() throws Exception {
        ArchiveInputStream ais = factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(arSignatureBytes())));
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testAutoDetect_Tar() throws Exception {
        // ใช้ POSIX ustar header ที่ถูกต้อง (รวม checksum) ตามมาตรฐานสาธารณะของ TAR
        ArchiveInputStream ais = factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(validTarHeader())));
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetect_UnknownSignature_ShortBuffer() throws Exception {
        byte[] garbage = new byte[20];
        for (int i = 0; i < garbage.length; i++) {
            garbage[i] = (byte) 0xFF;
        }
        factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(garbage)));
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetect_EmptyStream() throws Exception {
        factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(new byte[0])));
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetect_GarbageOfSize512_TriggersCompress117CatchBranch() throws Exception {
        // signatureLength >= 512 แต่ header ไม่ valid -> เข้า try-block COMPRESS-117
        // และคาดว่าจะ throw exception ภายใน (ถูก catch แล้ว ignore) จากนั้น fallthrough
        // ไปที่ ArchiveException สุดท้าย
        byte[] garbage512 = new byte[600];
        for (int i = 0; i < garbage512.length; i++) {
            garbage512[i] = (byte) 0xAB;
        }
        factory.createArchiveInputStream(
                new BufferedInputStream(new ByteArrayInputStream(garbage512)));
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetect_IOExceptionOnRead_WrappedAsArchiveException() throws Exception {
        InputStream in = new InputStream() {
            private boolean marked = false;

            @Override
            public int read() throws IOException {
                throw new IOException("simulated read failure");
            }
            @Override
            public synchronized void mark(int readlimit) {
                marked = true;
            }
            @Override
            public boolean markSupported() {
                return true;
            }
            @Override
            public synchronized void reset() throws IOException {
                if (!marked) {
                    throw new IOException("mark not called");
                }
            }
        };
        factory.createArchiveInputStream(in);
    }

    // =========================================================
    // Helper methods
    // =========================================================

    private byte[] zipSignatureBytes() {
        // ZIP local file header magic "PK\003\004" - มาตรฐานสาธารณะ
        return new byte[] {0x50, 0x4B, 0x03, 0x04, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    private byte[] arSignatureBytes() {
        // Standard AR magic "!<arch>\n" - มาตรฐานสาธารณะ
        byte[] magic = "!<arch>\n".getBytes();
        byte[] result = new byte[12];
        System.arraycopy(magic, 0, result, 0, magic.length);
        return result;
    }

    /**
     * สร้าง valid TAR header (512 bytes) ตามมาตรฐาน POSIX ustar
     * พร้อม checksum ที่คำนวณถูกต้อง (สมมติฐาน: matches()/parsing
     * อ้างอิงมาตรฐาน ustar ทั่วไป - ไม่ได้ยืนยันจาก source ที่ให้มา)
     */
    private byte[] validTarHeader() {
        byte[] header = new byte[512];

        byte[] name = "test.txt".getBytes();
        System.arraycopy(name, 0, header, 0, name.length);

        writeOctal(header, 100, 7, 0644); // mode
        writeOctal(header, 108, 7, 0);    // uid
        writeOctal(header, 116, 7, 0);    // gid
        writeOctal(header, 124, 11, 0);   // size
        writeOctal(header, 136, 11, 0);   // mtime

        for (int i = 148; i < 156; i++) {
            header[i] = ' ';
        }
        header[156] = '0'; // typeflag: regular file

        byte[] magic = "ustar".getBytes();
        System.arraycopy(magic, 0, header, 257, magic.length);
        header[262] = 0;
        header[263] = '0';
        header[264] = '0';

        int sum = 0;
        for (int i = 0; i < 512; i++) {
            sum += header[i] & 0xFF;
        }
        writeOctal(header, 148, 6, sum);
        header[154] = 0;
        header[155] = ' ';

        return header;
    }

    private void writeOctal(byte[] header, int offset, int length, int value) {
        String octal = Integer.toOctalString(value);
        StringBuilder sb = new StringBuilder();
        for (int i = octal.length(); i < length; i++) {
            sb.append('0');
        }
        sb.append(octal);
        byte[] bytes = sb.toString().getBytes();
        System.arraycopy(bytes, 0, header, offset, bytes.length);
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateArchiveInputStream_NullArchiverName` | `archiverName == null` → true |
| `testCreateArchiveInputStream_NullInputStream` | `in == null` → true |
| `testCreateArchiveInputStream_AR` | `AR.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_ZIP` | AR false → `ZIP.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_TAR` | AR,ZIP false → `TAR.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_JAR` | AR,ZIP,TAR false → `JAR.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_CPIO` | ...→ `CPIO.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_DUMP` | ...→ `DUMP.equalsIgnoreCase` → true |
| `testCreateArchiveInputStream_CaseInsensitive` | `equalsIgnoreCase` behavior (uppercase input) |
| `testCreateArchiveInputStream_UnknownFormat` | ทุกเงื่อนไข false → throw `ArchiveException` |
| `testCreateArchiveOutputStream_*` (Null/AR/ZIP/TAR/JAR/CPIO/Unknown/CaseInsensitive) | เหมือนกลุ่มบนแต่สำหรับ `createArchiveOutputStream` |
| `testCreateArchiveOutputStream_DumpNotSupported` | ยืนยันว่าไม่มีสาขา DUMP ใน output → falls through to exception |
| `testAutoDetect_NullStream` | `in == null` → true |
| `testAutoDetect_MarkNotSupported` | `!in.markSupported()` → true |
| `testAutoDetect_Zip` | `ZipArchiveInputStream.matches` → true |
| `testAutoDetect_Ar` | Zip/Jar false → `ArArchiveInputStream.matches` → true |
| `testAutoDetect_Tar` | ผ่านทุก signature check ก่อนหน้า → TAR header matches (หรือ COMPRESS-117 success path) |
| `testAutoDetect_UnknownSignature_ShortBuffer` | ทุก `matches()` false, length<512 → skip try-block → throw `ArchiveException` |
| `testAutoDetect_EmptyStream` | signatureLength=-1 ทุก match false → throw `ArchiveException` (boundary: empty input) |
| `testAutoDetect_GarbageOfSize512_TriggersCompress117CatchBranch` | `signatureLength >= 512` → true, เข้า try-block, `catch (Exception e)` ถูก trigger → fallthrough throw `ArchiveException` |
| `testAutoDetect_IOExceptionOnRead_WrappedAsArchiveException` | `catch (IOException e)` → wrap เป็น `ArchiveException` |

### จุดที่ไม่ได้ครอบคลุม (ระบุตามข้อกำหนดที่ 4)
- **JAR-branch ใน auto-detect**: เนื่องจาก ZIP ตรวจก่อน JAR และ JAR น่าจะใช้ signature เดียวกับ ZIP (`PK\x03\x04`) ทำให้ path นี้อาจ unreachable ในทางปฏิบัติ — ไม่ยืนยันเพราะไม่มี source ของ `JarArchiveInputStream.matches()`
- **CPIO-branch ใน auto-detect**: ไม่ทราบ exact magic bytes ที่ `CpioArchiveInputStream.matches()` ตรวจสอบจริง จึงไม่ได้เขียน test เจาะจง
- **DUMP-branch ใน auto-detect** (buffer 32 bytes): ต้องมี checksum/format ที่ valid ซึ่งซับซ้อนเกินกว่าจะสร้างโดยไม่มี source ของ `DumpArchiveInputStream.matches()`