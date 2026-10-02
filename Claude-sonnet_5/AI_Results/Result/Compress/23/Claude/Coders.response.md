# วิเคราะห์และข้อจำกัดที่ต้องระบุก่อน

คลาส `Coders` เป็น `package-private` และอ้างอิงคลาส `Coder` และ `SevenZMethod` ที่ **ไม่ได้ให้ซอร์สมาด้วย** ดังนั้นตาม requirement #4 ผมต้อง**สมมติ**โครงสร้างขั้นต่ำที่จำเป็น โดยอ้างอิงจากวิธีที่ `Coders.java` เรียกใช้งานเท่านั้น (ไม่เดาเกินสิ่งที่เห็นในซอร์ส) และคอมเมนต์กำกับไว้ในโค้ด:

- `Coder` มี constructor แบบ no-arg และฟิลด์ `decompressionMethodId` (`byte[]`), `properties` (`byte[]`) ที่เข้าถึงได้ในแพ็กเกจเดียวกัน (ตรงกับ `coder.decompressionMethodId`, `coder.properties[0]` ที่ใช้ตรงๆในซอร์ส)
- `SevenZMethod` มี static field `COPY, LZMA, LZMA2, DEFLATE, BZIP2, AES256SHA256` และมีเมธอด `getId()` คืน `byte[]` (ตรงกับ `coderId.method.getId()`)
- สำหรับ branch “unsupported method” ของ `addEncoder` ซึ่งไม่มีทางเรียกผ่าน public constant ได้ (เพราะทุก constant อยู่ใน `coderTable` แล้ว) ผมใช้ reflection สร้างอินสแตนซ์ใหม่ พร้อม `Assume.assumeNoException` เพื่อ skip อย่างปลอดภัยหากสมมติฐานเรื่อง constructor ผิด

```java
package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.junit.Assume;
import org.junit.Test;
import org.tukaani.xz.LZMAInputStream;

/**
 * Unit tests for {@link Coders} (Defects4J Compress-23b).
 *
 * หมายเหตุสมมติฐาน (assumptions) — เนื่องจากไม่มีซอร์สของ Coder และ SevenZMethod ให้มา:
 *  1) Coder เป็นคลาส package-private มี constructor no-arg และมีฟิลด์ package-visible
 *     ชื่อ decompressionMethodId (byte[]) และ properties (byte[]) ตรงกับที่ใช้ในคลาส Coders
 *  2) SevenZMethod มี static field COPY, LZMA, LZMA2, DEFLATE, BZIP2, AES256SHA256
 *     และมีเมธอด getId() คืนค่า byte[] ตรงกับที่เห็นในซอร์ส Coders
 *  3) สำหรับ branch "unsupported method" ของ addEncoder เราพยายามสร้างอินสแตนซ์ SevenZMethod
 *     ใหม่ด้วย reflection (เดา constructor เป็น (byte[])) — ถ้าไม่สำเร็จจะ assumeNoException
 *     เพื่อ skip การทดสอบนั้นแทนที่จะ fail แบบผิดสมมติฐาน
 */
public class CodersTest {

    // ---------- Helper ----------

    private static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        int n;
        while ((n = in.read(buf, 0, buf.length)) != -1) {
            bos.write(buf, 0, n);
        }
        return bos.toByteArray();
    }

    private static Coder newCoder(byte[] methodId, byte[] properties) {
        Coder c = new Coder();
        c.decompressionMethodId = methodId;
        c.properties = properties;
        return c;
    }

    // ---------- addDecoder / addEncoder: unsupported branch ----------

    @Test(expected = IOException.class)
    public void addDecoderThrowsWhenMethodUnknown() throws IOException {
        Coder coder = newCoder(new byte[] { (byte) 0x77, (byte) 0x77 }, null);
        Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
    }

    @Test
    public void addDecoderThrowsWithExpectedMessage() {
        Coder coder = newCoder(new byte[] { (byte) 0x77 }, null);
        try {
            Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
            fail("expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("Unsupported compression method"));
        }
    }

    @Test
    public void addEncoderThrowsWhenMethodUnknown() {
        try {
            Constructor<SevenZMethod> ctor = SevenZMethod.class.getDeclaredConstructor(byte[].class);
            ctor.setAccessible(true);
            SevenZMethod unknown = ctor.newInstance(new byte[] { (byte) 0x7F, (byte) 0x7F });
            try {
                Coders.addEncoder(new ByteArrayOutputStream(), unknown, null);
                fail("expected IOException");
            } catch (IOException e) {
                assertTrue(e.getMessage().startsWith("Unsupported compression method"));
            }
        } catch (Exception reflectionFailure) {
            // สมมติฐานเรื่อง constructor ของ SevenZMethod ผิด -> skip แทนที่จะ fail
            Assume.assumeNoException(reflectionFailure);
        }
    }

    // ---------- COPY ----------

    @Test
    public void copyEncoderReturnsSameStream() throws IOException {
        OutputStream out = new ByteArrayOutputStream();
        OutputStream result = Coders.addEncoder(out, SevenZMethod.COPY, null);
        assertSame(out, result);
    }

    @Test
    public void copyDecoderReturnsSameStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        Coder coder = newCoder(SevenZMethod.COPY.getId(), null);
        InputStream result = Coders.addDecoder(in, coder, null);
        assertSame(in, result);
    }

    // ---------- DEFLATE ----------

    @Test
    public void deflateEncoderProducesDeflaterOutputStream() throws IOException {
        OutputStream result = Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.DEFLATE, null);
        assertTrue(result instanceof DeflaterOutputStream);
    }

    @Test
    public void deflateRoundTrip() throws IOException {
        byte[] data = "Hello Apache Commons Compress!".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encOut = Coders.addEncoder(baos, SevenZMethod.DEFLATE, null);
        encOut.write(data);
        encOut.close();

        Coder coder = newCoder(SevenZMethod.DEFLATE.getId(), null);
        InputStream decIn = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);
        byte[] result = readAll(decIn);
        assertArrayEquals(data, result);
    }

    @Test
    public void deflateRoundTripSingleByteRead() throws IOException {
        // อ่านแบบ byte-by-byte เพื่อพยายามครอบคลุมเส้นทางอ่านอีกแบบ
        byte[] data = "X".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encOut = Coders.addEncoder(baos, SevenZMethod.DEFLATE, null);
        encOut.write(data);
        encOut.close();

        Coder coder = newCoder(SevenZMethod.DEFLATE.getId(), null);
        InputStream decIn = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int b;
        while ((b = decIn.read()) != -1) {
            result.write(b);
        }
        assertArrayEquals(data, result.toByteArray());
    }

    // ---------- BZIP2 ----------

    @Test
    public void bzip2EncoderProducesBZip2Stream() throws IOException {
        OutputStream result = Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.BZIP2, null);
        assertTrue(result instanceof BZip2CompressorOutputStream);
        result.close();
    }

    @Test
    public void bzip2RoundTrip() throws IOException {
        byte[] data = "BZip2 round trip test data 1234567890".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encOut = Coders.addEncoder(baos, SevenZMethod.BZIP2, null);
        encOut.write(data);
        encOut.close();

        Coder coder = newCoder(SevenZMethod.BZIP2.getId(), null);
        InputStream decIn = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);
        byte[] result = readAll(decIn);
        assertArrayEquals(data, result);
    }

    // ---------- LZMA ----------

    @Test
    public void lzmaEncoderNotSupported() {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.LZMA, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok: LZMADecoder ไม่ override encode()
        } catch (IOException e) {
            fail("unexpected IOException: " + e);
        }
    }

    @Test
    public void lzmaDecoderValidDictSizeSucceeds() throws IOException {
        // propsByte=0x5D (lc=3,lp=0,pb=2 ค่ามาตรฐานของ LZMA), dictSize=0x1000(4096)=DICT_SIZE_MIN
        byte[] props = new byte[] { 0x5D, 0x00, 0x10, 0x00, 0x00 };
        Coder coder = newCoder(SevenZMethod.LZMA.getId(), props);
        InputStream result = Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
        assertTrue(result instanceof LZMAInputStream);
    }

    @Test
    public void lzmaDecoderDictSizeTooLargeThrows() {
        // properties[4]=0x80 (high-bit set) : ถ้าคำนวณ dictSize ถูกต้องควรได้ 2^31 > DICT_SIZE_MAX
        // NOTE: โค้ดต้นทางมี potential bug เรื่อง sign-extension ของ byte ก่อน shift
        // (ขาด "& 0xff") อาจทำให้ dictSize กลายเป็นค่าลบและไม่ throw ตามคาด
        // -> การทดสอบนี้มีไว้เพื่อดักจับข้อบกพร่องดังกล่าวโดยเฉพาะ
        byte[] props = new byte[] { 0x5D, 0x00, 0x00, 0x00, (byte) 0x80 };
        Coder coder = newCoder(SevenZMethod.LZMA.getId(), props);
        try {
            Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
            fail("expected IOException: Dictionary larger than 4GiB maximum size");
        } catch (IOException e) {
            assertEquals("Dictionary larger than 4GiB maximum size", e.getMessage());
        } catch (RuntimeException e) {
            fail("Defect detected: expected IOException but got " + e.getClass() + ": " + e.getMessage());
        }
    }

    // ---------- AES256SHA256 ----------

    @Test
    public void aesDecoderNullPasswordThrowsOnRead() throws IOException {
        byte[] props = new byte[] { 0x00, 0x00 }; // numCyclesPower=0, ivSize=0, saltSize=0
        Coder coder = newCoder(SevenZMethod.AES256SHA256.getId(), props);
        InputStream in = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder, null);
        try {
            in.read();
            fail("expected IOException due to missing password");
        } catch (IOException e) {
            assertEquals("Cannot read encrypted files without a password", e.getMessage());
        }
    }

    @Test
    public void aesDecoderSaltIvTooLongThrowsOnRead() throws IOException {
        // byte0=0xC0, byte1=0x0F -> ivSize=16, saltSize=1 -> ต้องการ properties.length>=19
        // แต่ properties.length=2 -> trigger branch "Salt size + IV size too long"
        byte[] props = new byte[] { (byte) 0xC0, (byte) 0x0F };
        Coder coder = newCoder(SevenZMethod.AES256SHA256.getId(), props);
        InputStream in = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder,
                "password".getBytes());
        try {
            in.read();
            fail("expected IOException: Salt size + IV size too long");
        } catch (IOException e) {
            assertEquals("Salt size + IV size too long", e.getMessage());
        }
    }

    @Test
    public void aesDecoderNumCyclesPowerMaxBranchSucceeds() throws IOException {
        // byte0=0x3F -> numCyclesPower==0x3f (branch: aesKeyBytes derived directly จาก salt+password)
        // byte1=0x00 -> ivSize=0, saltSize=0
        byte[] props = new byte[] { 0x3F, 0x00 };
        Coder coder = newCoder(SevenZMethod.AES256SHA256.getId(), props);
        InputStream in = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder,
                "password".getBytes());
        byte[] buf = new byte[16];
        int n = in.read(buf, 0, buf.length);
        assertEquals(16, n);
        in.close();
    }

    @Test
    public void aesDecoderShaLoopBranchSucceeds() throws IOException {
        // byte0=0x08 -> numCyclesPower=8 (2^8=256 รอบ) เพื่อครอบคลุม branch การเพิ่มค่า extra[]
        // ทั้งกรณี "!=0 -> break" และกรณีล้น ("==0" -> เดิน loop k ต่อไป)
        byte[] props = new byte[] { 0x08, 0x00 };
        Coder coder = newCoder(SevenZMethod.AES256SHA256.getId(), props);
        InputStream in = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder,
                "password".getBytes());
        byte[] buf = new byte[16];
        int n = in.read(buf, 0, buf.length);
        assertEquals(16, n);
    }

    @Test
    public void aesDecoderCachesCipherInputStreamOnRepeatedRead() throws IOException {
        byte[] props = new byte[] { 0x00, 0x00 };
        Coder coder = newCoder(SevenZMethod.AES256SHA256.getId(), props);
        InputStream in = Coders.addDecoder(new ByteArrayInputStream(new byte[32]), coder,
                "password".getBytes());
        byte[] buf = new byte[16];
        int n1 = in.read(buf, 0, buf.length); // isInitialized: false -> init()
        int n2 = in.read(buf, 0, buf.length); // isInitialized: true -> cached stream
        assertEquals(16, n1);
        assertEquals(16, n2);
        in.close(); // close() เป็น no-op ตามซอร์ส ต้องไม่ throw
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `addDecoderThrowsWhenMethodUnknown` / `addDecoderThrowsWithExpectedMessage` | `addDecoder`: loop ครบทุก entry ไม่ match → falls through → throw IOException + message |
| `addEncoderThrowsWhenMethodUnknown` | `addEncoder`: loop ไม่ match → throw IOException (ผ่าน reflection สร้าง method ปลอม) |
| `copyEncoderReturnsSameStream` | `addEncoder` match COPY, `CopyDecoder.encode` |
| `copyDecoderReturnsSameStream` | `addDecoder` match COPY, `CopyDecoder.decode` |
| `deflateEncoderProducesDeflaterOutputStream` | `addEncoder` match DEFLATE, `DeflateDecoder.encode` |
| `deflateRoundTrip` / `deflateRoundTripSingleByteRead` | `addDecoder` match DEFLATE, `DeflateDecoder.decode`, `DummyByteAddingInputStream` (ผ่าน `InflaterInputStream` internal read) |
| `bzip2EncoderProducesBZip2Stream` | `addEncoder` match BZIP2, `BZIP2Decoder.encode` |
| `bzip2RoundTrip` | `addDecoder` match BZIP2, `BZIP2Decoder.decode` |
| `lzmaEncoderNotSupported` | `addEncoder` match LZMA → `CoderBase.encode()` default → `UnsupportedOperationException` |
| `lzmaDecoderValidDictSizeSucceeds` | `LZMADecoder.decode`: `dictSize <= DICT_SIZE_MAX` (false branch ของ if) |
| `lzmaDecoderDictSizeTooLargeThrows` | `LZMADecoder.decode`: `dictSize > DICT_SIZE_MAX` (true branch) — ทดสอบดักจับ potential sign-extension defect |
| `aesDecoderNullPasswordThrowsOnRead` | `AES...init()`: `passwordBytes == null` → throw |
| `aesDecoderSaltIvTooLongThrowsOnRead` | `AES...init()`: `2+saltSize+ivSize > properties.length` → throw |
| `aesDecoderNumCyclesPowerMaxBranchSucceeds` | `AES...init()`: `numCyclesPower == 0x3f` (true branch, direct key derivation) |
| `aesDecoderShaLoopBranchSucceeds` | `AES...init()`: `numCyclesPower != 0x3f` (SHA-256 loop), inner `extra[k]` increment/carry loop ทั้ง break และ continue |
| `aesDecoderCachesCipherInputStreamOnRepeatedRead` | `AES...init()`: `isInitialized == true` (cached) vs `false` (first call) |

**ข้อจำกัดที่ยังไม่ครอบคลุม/ไม่สามารถยืนยันได้จากซอร์สที่ให้มา:**
- `LZMA2Decoder` ไม่มีซอร์สโค้ดให้ จึงไม่สามารถทดสอบพฤติกรรมภายในได้ (ทดสอบผ่านโดยอ้อมเฉพาะการวน loop ผ่าน entry นี้เมื่อทดสอบ unsupported-method เท่านั้น)
- `DummyByteAddingInputStream.read()` (no-arg) อาจไม่ถูกเรียกจริงผ่าน `InflaterInputStream` มาตรฐานของ JDK (ซึ่ง implement single-byte read ด้วยการเรียก `read(byte[],off,len)` ภายใน) จึงไม่สามารถยืนยัน branch นี้ได้ 100%
- Environment ที่รัน test ต้องรองรับ AES-256 (Unlimited Strength) มิฉะนั้น test กลุ่ม AES success-path อาจ throw `GeneralSecurityException`→IOException ที่ไม่ได้ถูกทดสอบไว้โดยตรง (ไม่ได้เขียน branch สำหรับกรณีนี้เพราะไม่มีข้อมูลยืนยันจากซอร์สว่า environment เป็นอย่างไร)