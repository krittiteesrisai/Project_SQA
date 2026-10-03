package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.junit.Test;

public class ArchiveStreamFactoryTest {

    @Test
    public void testDefaultConstructor() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertNull(factory.getEntryEncoding());
    }

    @Test
    public void testParameterizedConstructor() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        org.junit.Assert.assertEquals("UTF-8", factory.getEntryEncoding());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetEntryEncodingThrowsExceptionWhenEncodingConstructorUsed() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        factory.setEntryEncoding("ISO-8859-1");
    }

    @Test
    public void testSetEntryEncodingSuccessWhenDefaultConstructorUsed() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.setEntryEncoding("UTF-8");
        org.junit.Assert.assertEquals("UTF-8", factory.getEntryEncoding());
    }

    // --- createArchiveInputStream(String, InputStream) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamNullName() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamNullStream() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test
    public void testCreateInputStreamAllFormats() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveStreamFactory factoryWithEncoding = new ArchiveStreamFactory("UTF-8");
        InputStream in = new ByteArrayInputStream(new byte[512]);

        // AR
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.AR, in));
        
        // ARJ
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.ARJ, in));

        // ZIP
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.ZIP, in));

        // TAR
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.TAR, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.TAR, in));

        // JAR
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.JAR, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.JAR, in));

        // CPIO
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.CPIO, in));

        // DUMP
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, in));
        assertNotNull(factoryWithEncoding.createArchiveInputStream(ArchiveStreamFactory.DUMP, in));
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateInputStreamSevenZUnsupported() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateInputStreamUnknownFormat() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream("unknown_format", new ByteArrayInputStream(new byte[0]));
    }

    // --- createArchiveOutputStream(String, OutputStream) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamNullName() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamNullStream() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test
    public void testCreateOutputStreamAllFormats() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveStreamFactory factoryWithEncoding = new ArchiveStreamFactory("UTF-8");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // AR
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.AR, out));

        // ZIP
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out));
        assertNotNull(factoryWithEncoding.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out));

        // TAR
        assertNotNull(factory.createOutputStreamWithEncoding(out, factory)); // helper or direct
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out));
        assertNotNull(factoryWithEncoding.createArchiveOutputStream(ArchiveStreamFactory.TAR, out));

        // JAR
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, out));

        // CPIO
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out));
        assertNotNull(factoryWithEncoding.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out));
    }
    
    private Object createOutputStreamWithEncoding(ByteArrayOutputStream out, ArchiveStreamFactory factory) throws Exception {
        return factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out);
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateOutputStreamSevenZUnsupported() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateOutputStreamUnknownFormat() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream("unknown_format", new ByteArrayOutputStream());
    }

    // --- createArchiveInputStream(InputStream) Autodetection Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetectNullStream() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetectMarkNotSupported() throws Exception {
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
        new ArchiveStreamFactory().createArchiveInputStream(noMarkStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetectNoArchiverFound() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[1024]);
        new ArchiveStreamFactory().createArchiveInputStream(in);
    }
}