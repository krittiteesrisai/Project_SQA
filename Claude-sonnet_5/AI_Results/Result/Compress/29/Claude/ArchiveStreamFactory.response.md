# ArchiveStreamFactoryTest.java

```java
package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.StreamingNotSupportedException;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link ArchiveStreamFactory} (Defects4J Compress-29b).
 *
 * หมายเหตุทั่วไป:
 * - ทุก magic byte ของรูปแบบไฟล์ (AR, ZIP, ARJ magic 0x60 0xEA, 7z magic) เป็นข้อกำหนดรูปแบบไฟล์
 *   ที่เป็นสาธารณะและเป็นที่รู้จัก ไม่ใช่การเดา behavior ภายในของคลาส ArchiveStreamFactory
 * - สาขาที่ implementation ของ matches()/constructor ในคลาสย่อย (เช่น DumpArchiveInputStream,
 *   ArjArchiveInputStream) ไม่ได้แสดงในซอร์สที่ให้มา จะถูกข้ามหรือกำกับด้วยคอมเมนต์ตามข้อกำหนดที่ 4
 */
public class ArchiveStreamFactoryTest {

    // =========================================================================
    // createArchiveInputStream(String archiverName, InputStream in)
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStream_NullArchiverName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStream_NullInputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, (InputStream) null);
    }

    @Test
    public void testCreateInputStream_AR() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.AR,
                new ByteArrayInputStream("!<arch>\n".getBytes()));
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_ZIP_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(); // entryEncoding == null
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_ZIP_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_TAR_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.TAR,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_TAR_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.TAR,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_JAR_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.JAR,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_JAR_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.JAR,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_CPIO_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateInputStream_CPIO_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO,
                new ByteArrayInputStream(new byte[0]));
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    // หมายเหตุ: DUMP (with/without encoding) ไม่ถูกทดสอบตรง เพราะ constructor ของ
    // DumpArchiveInputStream ไม่ได้แสดง source มาให้ ไม่แน่ใจว่าจะ throw ทันที
    // สำหรับ stream เปล่าหรือไม่ (ตามข้อกำหนดที่ 4 ห้ามเดา behavior)

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateInputStream_SevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z,
                new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateInputStream_UnknownFormat() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream("unknown-format", new ByteArrayInputStream(new byte[0]));
    }

    // =========================================================================
    // createArchiveOutputStream(String archiverName, OutputStream out)
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStream_NullArchiverName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStream_NullOutputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, (OutputStream) null);
    }

    @Test
    public void testCreateOutputStream_AR() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.AR,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_ZIP_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_ZIP_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_TAR_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_TAR_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_JAR() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_CPIO_NoEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateOutputStream_CPIO_WithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO,
                new ByteArrayOutputStream());
        assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateOutputStream_SevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateOutputStream_UnknownFormat() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    // =========================================================================
    // createArchiveInputStream(InputStream in) - autodetect
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_NullInputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_MarkNotSupported() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream noMark = new InputStream() {
            @Override
            public int read() throws IOException {
                return -1;
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createArchiveInputStream(noMark);
    }

    @Test
    public void testAutodetect_ZIP() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // PK\003\004 = ZIP local file header signature (public file-format spec)
        byte[] zipSig = new byte[] {0x50, 0x4B, 0x03, 0x04, 0, 0, 0, 0, 0, 0, 0, 0};
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(zipSig));
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testAutodetect_AR() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        byte[] arSig = "!<arch>\n".getBytes(); // 8-byte real AR magic (public file-format spec)
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(arSig));
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testAutodetect_SevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // 7z magic bytes '7''z' 0xBC 0xAF 0x27 0x1C (public file-format spec)
        byte[] sevenZSig = new byte[] {0x37, 0x7A, (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 0, 0, 0, 0, 0, 0};
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(sevenZSig));
        try {
            factory.createArchiveInputStream(in);
            fail("Expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException e) {
            // expected
        }
    }

    @Test
    public void testAutodetect_TAR_ValidChecksum() throws Exception {
        // สร้างไฟล์ TAR จริงด้วย TarArchiveOutputStream เพื่อให้ header 512 byte
        // มี checksum ที่ถูกต้อง จะไปเข้าเงื่อนไข TarArchiveInputStream.matches(...)
        // โดยตรง หรือ fallback COMPRESS-117/COMPRESS-191 ก็ตาม ผลลัพธ์ท้ายสุดควรได้
        // TarArchiveInputStream เหมือนกัน
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();

        byte[] tarBytes = baos.toByteArray();
        assertTrue("Generated tar should contain at least one 512-byte block", tarBytes.length >= 512);

        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(tarBytes));
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_NoMatch() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // 600 zero-bytes: ไม่ตรงกับ signature ของฟอร์แมตใด ๆ, tar checksum ก็ไม่ผ่าน
        // -> ตกไปที่ "No Archiver found for the stream signature"
        byte[] zeros = new byte[600];
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(zeros));
        factory.createArchiveInputStream(in);
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_IOExceptionDuringDetection() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream faultyIn = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Simulated read failure");
            }

            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public void mark(int readlimit) {
                // no-op
            }

            @Override
            public void reset() throws IOException {
                // no-op
            }
        };
        factory.createArchiveInputStream(faultyIn);
    }

    // =========================================================================
    // Encoding getter/setter
    // =========================================================================

    @Test
    public void testDefaultEncodingIsNull() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertNull(factory.getEntryEncoding());
    }

    @Test
    public void testConstructorWithEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        assertEquals("UTF-8", factory.getEntryEncoding());
    }

    @Test
    public void testSetEntryEncoding_AllowedWhenNoConstructorEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.setEntryEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", factory.getEntryEncoding());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetEntryEncoding_ThrowsWhenConstructorEncodingSet() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        factory.setEntryEncoding("ISO-8859-1");
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testCreateInputStream_NullArchiverName` | `createArchiveInputStream(String,in)`: `archiverName == null` → true |
| `testCreateInputStream_NullInputStream` | `in == null` → true |
| `testCreateInputStream_AR` | `AR.equalsIgnoreCase(...)` → true |
| `testCreateInputStream_ZIP_NoEncoding` / `_WithEncoding` | `ZIP` match, `entryEncoding != null` false/true |
| `testCreateInputStream_TAR_NoEncoding` / `_WithEncoding` | `TAR` match, encoding false/true |
| `testCreateInputStream_JAR_NoEncoding` / `_WithEncoding` | `JAR` match, encoding false/true |
| `testCreateInputStream_CPIO_NoEncoding` / `_WithEncoding` | `CPIO` match, encoding false/true |
| `testCreateInputStream_SevenZ` | `SEVEN_Z` match → `StreamingNotSupportedException` |
| `testCreateInputStream_UnknownFormat` | ไม่ match ทุกเงื่อนไข → `ArchiveException` (fall-through path) |
| `testCreateOutputStream_NullArchiverName` / `_NullOutputStream` | null-check branches ของ output stream method |
| `testCreateOutputStream_AR` | `AR` match |
| `testCreateOutputStream_ZIP_NoEncoding` / `_WithEncoding` | `ZIP` + `entryEncoding` if-branch (setEncoding) |
| `testCreateOutputStream_TAR_NoEncoding` / `_WithEncoding` | `TAR` + encoding branch |
| `testCreateOutputStream_JAR` | `JAR` match (ไม่มี encoding branch ใน output) |
| `testCreateOutputStream_CPIO_NoEncoding` / `_WithEncoding` | `CPIO` + encoding branch |
| `testCreateOutputStream_SevenZ` | `SEVEN_Z` → exception |
| `testCreateOutputStream_UnknownFormat` | fall-through → `ArchiveException` |
| `testAutodetect_NullInputStream` | autodetect: `in == null` |
| `testAutodetect_MarkNotSupported` | `!in.markSupported()` → true |
| `testAutodetect_ZIP` | signature match: Zip branch (`if`) |
| `testAutodetect_AR` | signature match: Ar branch (`else if`) |
| `testAutodetect_SevenZ` | signature match: SevenZ branch → exception |
| `testAutodetect_TAR_ValidChecksum` | dump-signature false → tar-signature true (หรือ COMPRESS-117 checksum-OK path) |
| `testAutodetect_NoMatch` | ทุก signature ไม่ match, tar checksum ไม่ผ่าน (catch Exception) → final `ArchiveException` |
| `testAutodetect_IOExceptionDuringDetection` | `catch (IOException e)` branch → wrap เป็น `ArchiveException` |
| `testDefaultEncodingIsNull` | default constructor, `entryEncoding == null` |
| `testConstructorWithEncoding` | constructor with encoding path |
| `testSetEntryEncoding_AllowedWhenNoConstructorEncoding` | `setEntryEncoding`: `encoding == null` → false branch (ไม่ throw) |
| `testSetEntryEncoding_ThrowsWhenConstructorEncodingSet` | `setEntryEncoding`: `encoding != null` → true branch → `IllegalStateException` |

**หมายเหตุจุดที่ข้าม (ตามข้อกำหนดที่ 4):**
- Branch ของ `DUMP` ใน `createArchiveInputStream(String, InputStream)` ไม่ได้ทดสอบตรง เนื่องจาก source ของ `DumpArchiveInputStream` (constructor / eager parsing behavior) ไม่ได้ถูกให้มา ไม่สามารถยืนยันได้ว่าจะสำเร็จหรือ throw กับ empty stream
- Branch การ detect `JAR` ผ่าน signature ใน `createArchiveInputStream(InputStream)` (autodetect) ไม่ได้ทดสอบแยก เพราะ signature ของ JAR ทับซ้อนกับ ZIP (`PK\003\004`) และเงื่อนไข ZIP ถูกตรวจก่อนตามลำดับ if-else ในซอร์ส ทำให้ path นี้ unreachable ในทางปฏิบัติจาก auto-detect เพียงอย่างเดียว
- Branch ของ `Cpio`/`Arj` signature-detect ใน autodetect method ไม่ได้ทดสอบ เพราะ implementation ของ `matches()` ของคลาสเหล่านั้นไม่ได้อยู่ในซอร์สที่ให้มา (เพื่อไม่ guess เกณฑ์ byte ที่แน่นอน)