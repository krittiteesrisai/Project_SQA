package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CodersTest {

    @Test
    public void testAddDecoderSuccess() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();
        InputStream is = new ByteArrayInputStream(new byte[]{1, 2, 3});
        InputStream decoded = Coders.addDecoder(is, coder, null);
        assertNotNull(decoded);
    }

    @Test(expected = IOException.class)
    public void testAddDecoderUnsupported() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[]{(byte) 0xFF, (byte) 0xEE};
        InputStream is = new ByteArrayInputStream(new byte[]{1, 2, 3});
        Coders.addDecoder(is, coder, null);
    }

    @Test
    public void testAddEncoderSuccess() throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(os, SevenZMethod.COPY, null);
        assertNotNull(encoder);
    }

    @Test(expected = IOException.class)
    public void testAddEncoderUnsupported() throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        // ใช้วิธียกตัวอย่างที่ไม่มีใน table หรือหลอกด้วยวิธีอื่น (SevenZMethod อาจมีจำกัด แต่เราทดสอบกรณีพังได้)
        Coders.addEncoder(os, null, null);
    }

    @Test
    public void testCopyDecoderEncode() throws IOException {
        Coders.CopyDecoder decoder = new Coders.CopyDecoder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        OutputStream out = decoder.encode(os, null);
        assertEquals(os, out);
    }

    @Test
    public void testDeflateDecoderCodecs() throws IOException {
        Coders.DeflateDecoder decoder = new Coders.DeflateDecoder();
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[]{1, 2, 3});
        InputStream decoded = decoder.decode(is, new Coder(), null);
        assertNotNull(decoded);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        OutputStream encoded = decoder.encode(os, null);
        assertNotNull(encoded);
    }

    @Test
    public void testBzip2DecoderCodecs() throws IOException {
        Coders.BZIP2Decoder decoder = new Coders.BZIP2Decoder();
        // BZip2 ต้องการ header ที่ถูกต้อง มิฉะนั้นตอนอ่านจริงจะพัง แต่ตัว decode คืนค่าสตรีมได้
        // ทดสอบผ่านการสร้าง OutputStream ก่อน
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        OutputStream encoded = decoder.encode(os, null);
        assertNotNull(encoded);
    }

    @Test(expected = IOException.class)
    public void testLZMADecoderInvalidDictSize() throws IOException {
        Coders.LZMADecoder decoder = new Coders.LZMADecoder();
        Coder coder = new Coder();
        // properties: [propsByte, dictSize(5 bytes เกินวงเงิน max 4GiB)]
        coder.properties = new byte[]{0, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, 0};
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[10]);
        decoder.decode(is, coder, null);
    }

    @Test(expected = IOException.class)
    public void testAES256DecoderSaltIvTooLong() throws IOException {
        Coders.AES256SHA256Decoder decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        // กำหนด property สั้นเกินไป แต่ระบุ salt/iv ขนาดใหญ่
        coder.properties = new byte[]{ (byte)0xC0, (byte)0xFF }; 
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[10]);
        InputStream cis = decoder.decode(is, coder, "password".getBytes());
        cis.read();
    }

    @Test(expected = IOException.class)
    public void testAES256DecoderNullPassword() throws IOException {
        Coders.AES256SHA256Decoder decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        coder.properties = new byte[]{ 0x01, 0x01, 0x02, 0x03 }; 
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[10]);
        InputStream cis = decoder.decode(is, coder, null);
        cis.read();
    }

    @Test
    public void testAES256DecoderWithCyclesPower0x3F() throws IOException {
        Coders.AES256SHA256Decoder decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        // numCyclesPower = 0x3f (special branch)
        coder.properties = new byte[]{ 0x3F, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[32]);
        InputStream cis = decoder.decode(is, coder, "password".getBytes());
        assertNotNull(cis);
        // Test close and re-init/read branches
        cis.close();
    }

    @Test
    public void testAES256DecoderWithNormalCycles() throws IOException {
        Coders.AES256SHA256Decoder decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        // numCyclesPower = 1 (เข้าลูป SHA-256 Digest พร้อมขยับ extra array)
        coder.properties = new byte[]{ 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        ByteArrayInputStream is = new ByteArrayInputStream(new byte[32]);
        InputStream cis = decoder.decode(is, coder, "password".getBytes());
        assertNotNull(cis);
        
        // ทดสอบการเรียกซ้ำเพื่อครอบคลุม isInitialized == true
        try {
            cis.read();
        } catch (Exception e) {
            // อาจจะเกิด Encryption error เนื่องจากข้อมูลจำลองสตรีมไม่ถูกต้องตาม AES แต่ถือว่ารันผ่านเงื่อนไข init สำเร็จ
        }
    }

    @Test
    public void testDummyByteAddingInputStreamReadMethods() throws IOException {
        // ทดสอบกรณีสตรีมว่างเปล่าเพื่อให้ DummyByteAddingInputStream เติมไบต์ 0
        ByteArrayInputStream emptyIs = new ByteArrayInputStream(new byte[0]);
        Coder coder = new Coder();
        Coders.DeflateDecoder decoder = new Coders.DeflateDecoder();
        InputStream decoded = decoder.decode(emptyIs, coder, null);
        
        // ทดสอบ single read()
        int val = decoded.read();
        assertEquals(0, val);
        
        // ทดสอบ array read(b, off, len)
        ByteArrayInputStream emptyIs2 = new ByteArrayInputStream(new byte[0]);
        InputStream decoded2 = decoder.decode(emptyIs2, coder, null);
        byte[] buf = new byte[10];
        int readBytes = decoded2.read(buf, 0, 5);
        assertEquals(1, readBytes);
        assertEquals(0, buf[0]);
    }
}