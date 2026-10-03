package org.apache.commons.compress.compressors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.junit.Test;

public class CompressorStreamFactoryTest {

    // --- Constructor & setDecompressConcatenated Tests ---

    @Test
    public void testDefaultConstructorAndSetter() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
        
        factory.setDecompressConcatenated(false);
        assertTrue(!factory.getDecompressConcatenated());
    }

    @Test
    public void testParameterizedConstructorTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testParameterizedConstructorFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        assertTrue(!factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenatedThrowsExceptionWhenInitializedWithParam() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        // Should throw IllegalStateException because decompressUntilEOF is not null
        factory.setDecompressConcatenated(false);
    }

    // --- createCompressorInputStream(InputStream in) Tests (Auto-detect & Edge Cases) ---

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectNullStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectMarkNotSupportedStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // ByteArrayInputStream supports mark, but we can wrap in a custom InputStream that doesn't
        InputStream noMarkStream = new InputStream() {
            @Override
            public int read() {
                return -1;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createCompressorInputStream(noMarkStream);
    }

    @Test(expected = CompressorException.class)
    public void testAutoDetectNoCompressorFound() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] unknownData = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(unknownData));
        factory.createCompressorInputStream(in);
    }

    @Test
    public void testAutoDetectBZip2() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // BZip2 signature: 'B', 'Z', 'h'
        byte[] bzip2Header = new byte[] { 'B', 'Z', 'h', '9', 0, 0, 0, 0, 0, 0, 0, 0 };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(bzip2Header));
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        assertNotNull(cis);
        assertTrue(cis instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testAutoDetectGzip() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // Gzip signature: 0x1f, 0x8b
        byte[] gzipHeader = new byte[] { (byte) 0x1f, (byte) 0x8b, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(gzipHeader));
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        assertNotNull(cis);
        assertTrue(cis instanceof GzipCompressorInputStream);
    }

    @Test
    public void testAutoDetectPack200() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // Pack200 signature: 0xCA, 0xFE, 0xBA, 0xBE
        byte[] packHeader = new byte[] { (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE, 0, 0, 0, 0, 0, 0, 0, 0 };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(packHeader));
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        assertNotNull(cis);
        assertTrue(cis instanceof Pack200CompressorInputStream);
    }

    @Test
    public void testAutoDetectFramedSnappy() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // Framed Snappy signature
        byte[] snappyHeader = new byte[] { (byte) 0xff, 0x06, 0x00, 0x00, 0x73, 0x4e, 0x61, 0x50, 0x70, 0x59, 0, 0 };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(snappyHeader));
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        assertNotNull(cis);
        assertTrue(cis instanceof FramedSnappyCompressorInputStream);
    }

    @Test
    public void testAutoDetectZ() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // Z signature: 0x1f, 0x9d
        byte[] zHeader = new byte[] { (byte) 0x1f, (byte) 0x9d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        InputStream in = new java.io.BufferedInputStream(new ByteArrayInputStream(zHeader));
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        assertNotNull(cis);
        assertTrue(cis instanceof ZCompressorInputStream);
    }

    // --- createCompressorInputStream(String name, InputStream in) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamByNameNullName() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamByNameNullStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("gz", null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateInputStreamByNameUnknown() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("unknown-format", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateInputStreamByNameAllValidFormats() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[100]);

        assertTrue(factory.createCompressorInputStream("GZIP", bais) instanceof GzipCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("gz", bais) instanceof GzipCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("BZIP2", bais) instanceof BZip2CompressorInputStream);
        assertTrue(factory.createCompressorInputStream("bzip2", bais) instanceof BZip2CompressorInputStream);
        assertTrue(factory.createCompressorInputStream("XZ", bais) instanceof XZCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("xz", bais) instanceof XZCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("LZMA", bais) instanceof LZMACompressorInputStream);
        assertTrue(factory.createCompressorInputStream("lzma", bais) instanceof LZMACompressorInputStream);
        assertTrue(factory.createCompressorInputStream("PACK200", bais) instanceof Pack200CompressorInputStream);
        assertTrue(factory.createCompressorInputStream("pack200", bais) instanceof Pack200CompressorInputStream);
        assertTrue(factory.createCompressorInputStream("SNAPPY-RAW", bais) instanceof SnappyCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("snappy-raw", bais) instanceof SnappyCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("SNAPPY-FRAMED", bais) instanceof FramedSnappyCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("snappy-framed", bais) instanceof FramedSnappyCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("Z", bais) instanceof ZCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("z", bais) instanceof ZCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("DEFLATE", bais) instanceof DeflateCompressorInputStream);
        assertTrue(factory.createCompressorInputStream("deflate", bais) instanceof DeflateCompressorInputStream);
    }

    // --- createCompressorOutputStream(String name, OutputStream out) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamByNameNullName() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamByNameNullStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream("gz", null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateOutputStreamByNameUnknown() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    @Test
    public void testCreateOutputStreamByNameAllValidFormats() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        assertTrue(factory.createCompressorOutputStream("GZIP", baos) instanceof GzipCompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("gz", baos) instanceof GzipCompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("BZIP2", baos) instanceof BZip2CompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("bzip2", baos) instanceof BZip2CompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("XZ", baos) instanceof XZCompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("xz", baos) instanceof XZCompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("PACK200", baos) instanceof Pack200CompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("pack200", baos) instanceof Pack200CompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("DEFLATE", baos) instanceof DeflateCompressorOutputStream);
        assertTrue(factory.createCompressorOutputStream("deflate", baos) instanceof DeflateCompressorOutputStream);
    }
}