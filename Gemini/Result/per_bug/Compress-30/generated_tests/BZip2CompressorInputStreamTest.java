import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BZip2CompressorInputStreamTest {

    @Test(expected = IOException.class)
    public void testConstructorWithNullInputStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructorWithInvalidMagicBytes() throws IOException {
        byte[] invalidData = new byte[] { 'X', 'Y', 'Z', '1', '2', '3' };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidData);
        new BZip2CompressorInputStream(bais);
    }

    @Test(expected = IOException.class)
    public void testConstructorWithInvalidBlockSize() throws IOException {
        // 'B', 'Z', 'h', แต่ตามด้วย blockSize เป็น '0' (ซึ่งต่ำกว่า '1')
        byte[] invalidBlockSize = new byte[] { 'B', 'Z', 'h', '0', '1', '2' };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidBlockSize);
        new BZip2CompressorInputStream(bais);
    }

    @Test
    public void testMatchesEdgeCases() {
        // Length < 3
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z' }, 2));
        
        // Invalid prefix bytes
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'X', 'Z', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'X', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'X' }, 3));

        // Valid prefix
        Assert.assertTrue(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'h', '1' }, 4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayNegativeOffset() throws IOException {
        byte[] dummyHeader = new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' };
        ByteArrayInputStream bais = new ByteArrayInputStream(dummyHeader);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        byte[] dest = new byte[10];
        try {
            bzIn.read(dest, -1, 5);
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayNegativeLength() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        byte[] dest = new byte[10];
        try {
            bzIn.read(dest, 0, -1);
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayOutOfBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        byte[] dest = new byte[5];
        try {
            bzIn.read(dest, 2, 5); // 2 + 5 = 7 > 5
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        bzIn.read(); // Should throw IOException("stream closed")
    }

    @Test(expected = IOException.class)
    public void testReadArrayOnClosedStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        byte[] dest = new byte[5];
        bzIn.read(dest, 0, 5); // Should throw IOException("stream closed")
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '1', '3', '1', '4', '1', '5', '9', '2', '6' });
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false);
        bzIn.close();
        bzIn.close(); // Should not throw exception
    }
}