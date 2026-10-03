package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BZip2CompressorInputStreamTest {

    @Test(expected = IOException.class)
    public void testConstructorNullStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testInvalidMagicBytes() throws IOException {
        byte[] invalidData = new byte[] { 'X', 'Y', 'Z', '1', '2', '3' };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidData);
        new BZip2CompressorInputStream(bais);
    }

    @Test(expected = IOException.class)
    public void testInvalidBlockSize() throws IOException {
        // 'B', 'Z', 'h', แล้วตามด้วย block size ที่นอกเหนือจาก '1'-'9' เช่น '0'
        byte[] invalidBlockSizeData = new byte[] { 'B', 'Z', 'h', '0', '1', '2', '3', '4', '5', '6' };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidBlockSizeData);
        new BZip2CompressorInputStream(bais);
    }

    @Test
    public void testMatches() {
        // Length < 3
        assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z' }, 2));

        // Invalid signature bytes
        assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'X', 'Z', 'h', 0, 0 }, 5));
        assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'X', 'h', 0, 0 }, 5));
        assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'X', 0, 0 }, 5));

        // Valid signature
        assertTrue(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'h', '1', 0 }, 5));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeOffset() throws IOException {
        byte[] validHeader = new byte[] { 'B', 'Z', 'h', '1', '1', '1', '1', '1', '1', '1' };
        ByteArrayInputStream bais = new ByteArrayInputStream(validHeader);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false)) {
            byte[] dest = new byte[10];
            bzIn.read(dest, -1, 5);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeLength() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1' });
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false)) {
            byte[] dest = new byte[10];
            bzIn.read(dest, 0, -1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayOutOfBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1' });
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false)) {
            byte[] dest = new byte[5];
            bzIn.read(dest, 2, 5); // 2 + 5 > 5
        }
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        bzIn.read();
    }

    @Test(expected = IOException.class)
    public void testReadByteArrayOnClosedStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        byte[] dest = new byte[5];
        bzIn.read(dest, 0, 5);
    }

    @Test
    public void testCloseIdempotency() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        // ปิดซ้ำต้องไม่เกิด Exception
        bzIn.close();
    }
}