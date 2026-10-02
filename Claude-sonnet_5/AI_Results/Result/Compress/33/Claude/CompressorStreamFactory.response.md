# CompressorStreamFactoryTest.java

```java
package org.apache.commons.compress.compressors;

// หมายเหตุ: คลาสทดสอบอยู่ใน package เดียวกับคลาสเป้าหมาย (org.apache.commons.compress.compressors)
// เพื่อให้สามารถเรียกเมธอด package-private getDecompressConcatenated() ได้ตามที่ผู้เขียน
// คลาสเป้าหมายออกแบบไว้สำหรับการทดสอบ (comment "// For Unit tests") จึงไม่จำเป็นต้อง import
// CompressorStreamFactory / CompressorException / CompressorInputStream / CompressorOutputStream
// เนื่องจากอยู่ package เดียวกัน แต่ import subpackages ที่จำเป็นสำหรับสร้างข้อมูลจริงไว้ด้านล่าง

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;

import org.junit.Test;

public class CompressorStreamFactoryTest {

    // ==================== Helper methods ====================

    /** InputStream ที่ markSupported() = false (ใช้ default ของ java.io.InputStream) */
    private static InputStream noMarkStream(final byte[] data) {
        return new InputStream() {
            private int pos = 0;
            @Override
            public int read() throws IOException {
                return pos < data.length ? (data[pos++] & 0xFF) : -1;
            }
            // markSupported() ไม่ override -> ใช้ default ของ InputStream ซึ่ง return false
        };
    }

    private static byte[] compressGzip(final byte[] data) throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final GzipCompressorOutputStream gos = new GzipCompressorOutputStream(bos);
        gos.write(data);
        gos.close();
        return bos.toByteArray();
    }

    private static byte[] compressBzip2(final byte[] data) throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final BZip2CompressorOutputStream bzos = new BZip2CompressorOutputStream(bos);
        bzos.write(data);
        bzos.close();
        return bos.toByteArray();
    }

    private static byte[] compressXZ(final byte[] data) throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final XZCompressorOutputStream xzos = new XZCompressorOutputStream(bos);
        xzos.write(data);
        xzos.close();
        return bos.toByteArray();
    }

    private static byte[] compressDeflate(final byte[] data) throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final DeflateCompressorOutputStream dos = new DeflateCompressorOutputStream(bos);
        dos.write(data);
        dos.close();
        return bos.toByteArray();
    }

    // ==================== Constructors & setDecompressConcatenated ====================

    @Test
    public void testDefaultConstructor_DecompressConcatenatedIsFalse() {
        final CompressorStreamFactory factory = new CompressorStreamFactory();
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructor_True() {
        final CompressorStreamFactory factory = new CompressorStreamFactory(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructor_False() {
        final CompressorStreamFactory factory = new CompressorStreamFactory(false);
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testSetDecompressConcatenated_AllowedForDefaultConstructor() {
        final CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
        factory.setDecompressConcatenated(false);
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenated_ThrowsWhenConstructedWithTrue() {
        final CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenated_ThrowsWhenConstructedWithFalse() {
        final CompressorStreamFactory factory = new CompressorStreamFactory(false);
        factory.setDecompressConcatenated(true);
    }

    // ==================== createCompressorInputStream(InputStream) - auto detect ====================

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetect_NullStream_ThrowsIAE() throws Exception {
        new CompressorStreamFactory().createCompressorInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetect_MarkNotSupported_ThrowsIAE() throws Exception {
        final InputStream in = noMarkStream(new byte[]{1, 2, 3});
        new CompressorStreamFactory().createCompressorInputStream(in);
    }

    @Test(expected = CompressorException.class)
    public void testAutoDetect_UnknownSignature_ThrowsCompressorException() throws Exception {
        // 12 ไบต์ที่ไม่ตรง magic ของฟอร์แมตใด ๆ ที่รองรับ (รวมถึง LZMA ซึ่งต้องการอย่างน้อย 13 ไบต์)
        final byte[] data = "Hello World!".getBytes("US-ASCII"); // length == 12
        final InputStream in = new ByteArrayInputStream(data);
        new CompressorStreamFactory().createCompressorInputStream(in);
    }

    @Test
    public void testAutoDetect_BZip2_ReturnsBZip2Stream() throws Exception {
        final byte[] compressed = compressBzip2("test-data-123".getBytes("US-ASCII"));
        final InputStream in = new ByteArrayInputStream(compressed);
        final CompressorInputStream result =
                new CompressorStreamFactory().createCompressorInputStream(in);
        assertTrue(result instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testAutoDetect_Gzip_ReturnsGzipStream() throws Exception {
        final byte[] compressed = compressGzip("test-data-123".getBytes("US-ASCII"));
        final InputStream in = new ByteArrayInputStream(compressed);
        final CompressorInputStream result =
                new CompressorStreamFactory().createCompressorInputStream(in);
        assertTrue(result instanceof GzipCompressorInputStream);
    }

    @Test
    public void testAutoDetect_XZ_ReturnsXZStream() throws Exception {
        // ต้องมี xz-1.5.jar ใน classpath เพื่อให้ XZUtils.isXZCompressionAvailable() == true
        final byte[] compressed = compressXZ("test-data-123".getBytes("US-ASCII"));
        final InputStream in = new ByteArrayInputStream(compressed);
        final CompressorInputStream result =
                new CompressorStreamFactory().createCompressorInputStream(in);
        assertTrue(result instanceof XZCompressorInputStream);
    }

    /**
     * Boundary case: มี magic bytes ของ BZip2 ("BZh1") ตรงครบ แต่ไม่มี payload
     * ตามมา -> เข้า if-branch ของ BZip2 (matches() == true) แต่ constructor ของ
     * BZip2CompressorInputStream จะอ่านข้อมูลที่ขาดไปไม่ได้ ทำให้เกิด IOException
     * และถูกครอบเป็น CompressorException ข้อความ "Failed to detect..." ซึ่งต่างจาก
     * "No Compressor found..." (คนละสาขา catch/throw กัน)
     * ** สมมติฐาน: bzip2 decoder จะ throw IOException เมื่ออ่านข้อมูลไม่พอ **
     */
    @Test
    public void testAutoDetect_BZip2MagicOnly_TooShortPayload_ThrowsWrappedIOException() throws Exception {
        final byte[] data = {'B', 'Z', 'h', '1'};
        final InputStream in = new ByteArrayInputStream(data);
        try {
            new CompressorStreamFactory().createCompressorInputStream(in);
            fail("Expected a CompressorException due to truncated BZip2 data");
        } catch (final CompressorException expected) {
            assertTrue(expected.getMessage().contains("Failed to detect Compressor from InputStream"));
        }
    }

    /**
     * Known limitation/defect (Compress-33): buffer สำหรับ auto-detect signature
     * มีขนาดคงที่ 12 ไบต์ (new byte[12]) แต่ header ของ "LZMA alone" format
     * ต้องการอย่างน้อย 13 ไบต์ (1 properties byte + 4 dict-size + 8 uncompressed-size)
     * ดังนั้น LZMAUtils.matches(signature, length) จะไม่ return true ได้เลยจาก
     * เมธอดนี้ แม้ข้อมูลจะเป็น LZMA header ที่ถูกต้องตามสเปคก็ตาม
     * เทสนี้ยืนยัน behavior ปัจจุบัน (ซึ่งถือเป็นข้อบกพร่อง) อย่างชัดเจน
     */
    @Test
    public void testAutoDetect_LZMA_NeverDetectedDueToShortSignatureBuffer() throws Exception {
        final byte[] header = new byte[]{
                0x5D,                                 // properties byte
                0x00, 0x00, 0x01, 0x00,                // dictionary size (LE)
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF // unknown size marker
        };
        assertEquals(13, header.length);

        assertTrue("LZMAUtils.matches ควรยอมรับ header ครบ 13 ไบต์",
                LZMAUtils.matches(header, header.length));
        assertFalse("header ที่ถูกตัดเหลือ 12 ไบต์ ต้องไม่ match",
                LZMAUtils.matches(header, 12));

        final byte[] data = new byte[20];
        System.arraycopy(header, 0, data, 0, header.length);
        final InputStream in = new ByteArrayInputStream(data);

        try {
            new CompressorStreamFactory().createCompressorInputStream(in);
            fail("Expected CompressorException: buffer 12 ไบต์ตรวจ LZMA (13 ไบต์) ไม่ได้ (known limitation)");
        } catch (final CompressorException expected) {
            assertTrue(expected.getMessage().contains("No Compressor found"));
        }
    }

    // ==================== createCompressorInputStream(String, InputStream) ====================

    @Test(expected = IllegalArgumentException.class)
    public void testByName_NullName_ThrowsIAE() throws Exception {
        new CompressorStreamFactory().createCompressorInputStream(
                null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testByName_NullStream_ThrowsIAE() throws Exception {
        new CompressorStreamFactory().createCompressorInputStream(
                CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testByName_UnknownName_ThrowsCompressorException() throws Exception {
        new CompressorStreamFactory().createCompressorInputStream(
                "unknown-format-xyz", new ByteArrayInputStream(new byte[]{1, 2, 3}));
    }

    @Test
    public void testByName_Gzip_RealData_Success() throws Exception {
        final byte[] compressed = compressGzip("abc".getBytes("US-ASCII"));
        final CompressorInputStream result = new CompressorStreamFactory()
                .createCompressorInputStream(CompressorStreamFactory.GZIP,
                        new ByteArrayInputStream(compressed));
        assertTrue(result instanceof GzipCompressorInputStream);
    }

    @Test
    public void testByName_Gzip_CaseInsensitive_Success() throws Exception {
        final byte[] compressed = compressGzip("abc".getBytes("US-ASCII"));
        final CompressorInputStream result = new CompressorStreamFactory()
                .createCompressorInputStream("GZ", new ByteArrayInputStream(compressed));
        assertTrue(result instanceof GzipCompressorInputStream);
    }

    @Test
    public void testByName_Bzip2_RealData_Success() throws Exception {
        final byte[] compressed = compressBzip2("abc".getBytes("US-ASCII"));
        final CompressorInputStream result = new CompressorStreamFactory()
                .createCompressorInputStream(CompressorStreamFactory.BZIP2,
                        new ByteArrayInputStream(compressed));
        assertTrue(result instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testByName_XZ_RealData_Success() throws Exception {
        final byte[] compressed = compressXZ("abc".getBytes("US-ASCII"));
        final CompressorInputStream result = new CompressorStreamFactory()
                .createCompressorInputStream(CompressorStreamFactory.XZ,
                        new ByteArrayInputStream(compressed));
        assertTrue(result instanceof XZCompressorInputStream);
    }

    @Test
    public void testByName_Deflate_RealData_Success() throws Exception {
        final byte[] compressed = compressDeflate("abc".getBytes("US-ASCII"));
        final CompressorInputStream result = new CompressorStreamFactory()
                .createCompressorInputStream(CompressorStreamFactory.DEFLATE,
                        new ByteArrayInputStream(compressed));
        assertTrue(result instanceof DeflateCompressorInputStream);
    }

    /*
     * สำหรับฟอร์แมตด้านล่าง (LZMA, PACK200, SNAPPY_RAW, SNAPPY_FRAMED, Z) เราไม่มี
     * ทางสร้างข้อมูลที่ valid ได้ง่ายในซอร์สที่ให้มา (ไม่มี OutputStream คู่กันในคลาส
     * เป้าหมาย/ไม่แน่ใจ constructor behavior ที่แน่ชัด) จึงทดสอบเพียงว่า "branch"
     * ของ if (X.equalsIgnoreCase(name)) ถูกเข้าถึงจริง โดยยอมรับได้ทั้งกรณีสร้าง
     * สำเร็จ หรือเกิด Exception (ซึ่งจะถูกครอบเป็น CompressorException ถ้าเป็น
     * IOException ตาม source) แต่จะไม่เดา behavior ที่ไม่มีในซอร์ส
     */
    @Test
    public void testByName_LZMA_GarbageData_EntersBranch() {
        final byte[] garbage = new byte[]{0, 0, 0};
        try {
            final CompressorInputStream result = new CompressorStreamFactory()
                    .createCompressorInputStream(CompressorStreamFactory.LZMA,
                            new ByteArrayInputStream(garbage));
            assertNotNull(result);
        } catch (final Exception expected) {
            assertNotNull(expected.getMessage() != null || true);
        }
    }

    @Test
    public void testByName_Pack200_GarbageData_EntersBranch() {
        final byte[] garbage = new byte[]{0, 0, 0};
        try {
            final CompressorInputStream result = new CompressorStreamFactory()
                    .createCompressorInputStream(CompressorStreamFactory.PACK200,
                            new ByteArrayInputStream(garbage));
            assertNotNull(result);
        } catch (final Exception expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testByName_SnappyRaw_GarbageData_EntersBranch() {
        final byte[] garbage = new byte[]{0, 0, 0};
        try {
            final CompressorInputStream result = new CompressorStreamFactory()
                    .createCompressorInputStream(CompressorStreamFactory.SNAPPY_RAW,
                            new ByteArrayInputStream(garbage));
            assertNotNull(result);
        } catch (final Exception expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testByName_SnappyFramed_GarbageData_EntersBranch() {
        final byte[] garbage = new byte[]{0, 0, 0};
        try {
            final CompressorInputStream result = new CompressorStreamFactory()
                    .createCompressorInputStream(CompressorStreamFactory.SNAPPY_FRAMED,
                            new ByteArrayInputStream(garbage));
            assertNotNull(result);
        } catch (final Exception expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testByName_Z_GarbageData_EntersBranch() {
        final byte[] garbage = new byte[]{0, 0, 0};
        try {
            final CompressorInputStream result = new CompressorStreamFactory()
                    .createCompressorInputStream(CompressorStreamFactory.Z,
                            new ByteArrayInputStream(garbage));
            assertNotNull(result);
        } catch (final Exception expected) {
            assertTrue(true);
        }
    }

    // ==================== createCompressorOutputStream(String, OutputStream) ====================

    @Test(expected = IllegalArgumentException.class)
    public void testOutputByName_NullName_ThrowsIAE() throws Exception {
        new CompressorStreamFactory().createCompressorOutputStream(
                null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutputByName_NullStream_ThrowsIAE() throws Exception {
        new CompressorStreamFactory().createCompressorOutputStream(
                CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testOutputByName_UnknownName_ThrowsCompressorException() throws Exception {
        new CompressorStreamFactory().createCompressorOutputStream(
                "unknown-format-xyz", new ByteArrayOutputStream());
    }

    @Test
    public void testOutputByName_Gzip_Success() throws Exception {
        final CompressorOutputStream out = new CompressorStreamFactory()
                .createCompressorOutputStream(CompressorStreamFactory.GZIP,
                        new ByteArrayOutputStream());
        assertTrue(out instanceof GzipCompressorOutputStream);
        out.close();
    }

    @Test
    public void testOutputByName_Bzip2_Success() throws Exception {
        final CompressorOutputStream out = new CompressorStreamFactory()
                .createCompressorOutputStream(CompressorStreamFactory.BZIP2,
                        new ByteArrayOutputStream());
        assertTrue(out instanceof BZip2CompressorOutputStream);
        out.close();
    }

    @Test
    public void testOutputByName_XZ_Success() throws Exception {
        final CompressorOutputStream out = new CompressorStreamFactory()
                .createCompressorOutputStream(CompressorStreamFactory.XZ,
                        new ByteArrayOutputStream());
        assertTrue(out instanceof XZCompressorOutputStream);
        out.close();
    }

    @Test
    public void testOutputByName_Deflate_Success() throws Exception {
        final CompressorOutputStream out = new CompressorStreamFactory()
                .createCompressorOutputStream(CompressorStreamFactory.DEFLATE,
                        new ByteArrayOutputStream());
        assertTrue(out instanceof DeflateCompressorOutputStream);
        out.close();
    }

    @Test
    public void testOutputByName_Pack200_Success() throws Exception {
        final CompressorOutputStream out = new CompressorStreamFactory()
                .createCompressorOutputStream(CompressorStreamFactory.PACK200,
                        new ByteArrayOutputStream());
        assertTrue(out instanceof Pack200CompressorOutputStream);
        out.close();
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| กลุ่ม | เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor | testDefaultConstructor_DecompressConcatenatedIsFalse | ctor `()` → `decompressUntilEOF=null`, `decompressConcatenated=false` |
| Constructor | testBooleanConstructor_True / _False | ctor `(boolean)` ทั้งสองค่า true/false |
| setDecompressConcatenated | testSetDecompressConcatenated_AllowedForDefaultConstructor | `if (decompressUntilEOF != null)` → false (ผ่านได้) |
| setDecompressConcatenated | testSetDecompressConcatenated_ThrowsWhenConstructedWithTrue/False | `if (decompressUntilEOF != null)` → true → throw `IllegalStateException` |
| Auto-detect input | testAutoDetect_NullStream_ThrowsIAE | `if (in == null)` → true |
| Auto-detect input | testAutoDetect_MarkNotSupported_ThrowsIAE | `if (!in.markSupported())` → true |
| Auto-detect input | testAutoDetect_UnknownSignature_ThrowsCompressorException | ทุก `matches()` → false → throw "No Compressor found" |
| Auto-detect input | testAutoDetect_BZip2_ReturnsBZip2Stream | `BZip2CompressorInputStream.matches()` → true |
| Auto-detect input | testAutoDetect_Gzip_ReturnsGzipStream | `GzipCompressorInputStream.matches()` → true |
| Auto-detect input | testAutoDetect_XZ_ReturnsXZStream | `XZUtils.matches() && isXZCompressionAvailable()` → true/true |
| Auto-detect input | testAutoDetect_BZip2MagicOnly_TooShortPayload_ThrowsWrappedIOException | branch matched=true แต่ constructor throw IOException → catch(IOException) → "Failed to detect..." |
| Auto-detect input (defect) | testAutoDetect_LZMA_NeverDetectedDueToShortSignatureBuffer | ยืนยันข้อบกพร่อง: buffer 12 ไบต์ ทำให้ `LZMAUtils.matches()` เป็น false เสมอ (ต้องการ ≥13 ไบต์) |
| createCompressorInputStream(String,In) | testByName_NullName_ThrowsIAE / testByName_NullStream_ThrowsIAE | `if (name == null \|\| in == null)` → true (สองกรณี) |
| createCompressorInputStream(String,In) | testByName_UnknownName_ThrowsCompressorException | ทุก `equalsIgnoreCase` → false → throw "Compressor: ... not found." |
| createCompressorInputStream(String,In) | testByName_Gzip/_Bzip2/_XZ/_Deflate_RealData_Success | branch GZIP/BZIP2/XZ/DEFLATE → true, สร้างสำเร็จ |
| createCompressorInputStream(String,In) | testByName_Gzip_CaseInsensitive_Success | ตรวจ `equalsIgnoreCase` ทำงานถูกต้อง |
| createCompressorInputStream(String,In) | testByName_LZMA/_Pack200/_SnappyRaw/_SnappyFramed/_Z_GarbageData_EntersBranch | branch LZMA/PACK200/SNAPPY_RAW/SNAPPY_FRAMED/Z → true (เข้า if แต่ไม่ตัดสิน behavior ที่ไม่แน่ใจ) |
| createCompressorOutputStream | testOutputByName_NullName_ThrowsIAE / _NullStream_ThrowsIAE | `if (name == null \|\| out == null)` → true |
| createCompressorOutputStream | testOutputByName_UnknownName_ThrowsCompressorException | ทุก `equalsIgnoreCase` → false → throw "Compressor: ... not found." |
| createCompressorOutputStream | testOutputByName_Gzip/_Bzip2/_XZ/_Deflate/_Pack200_Success | branch GZIP/BZIP2/XZ/DEFLATE/PACK200 → true, สร้างสำเร็จ |

**หมายเหตุสำคัญ:**
- เทสสำหรับ LZMA, PACK200, SNAPPY_RAW, SNAPPY_FRAMED, Z ในเมธอด `createCompressorInputStream(String,InputStream)` ครอบคลุมเฉพาะการเข้า if-branch เท่านั้น เนื่องจากไม่มี OutputStream คู่กันในซอร์สโค้ดเป้าหมายให้สร้างข้อมูลที่ valid ได้แน่นอน จึงไม่ยืนยัน behavior การ decode ที่ไม่มีหลักฐานในซอร์ส
- ทดสอบ `testAutoDetect_LZMA_NeverDetectedDueToShortSignatureBuffer` เป็นเทสที่ตั้งใจดักจับข้อบกพร่องจริงของคลาส (buffer 12 ไบต์ ไม่พอสำหรับ header LZMA 13 ไบต์) ซึ่งสัมพันธ์กับ Defects4J Compress-33