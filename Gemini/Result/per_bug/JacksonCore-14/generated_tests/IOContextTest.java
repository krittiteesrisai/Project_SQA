package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IOContextTest {

    private BufferRecycler bufferRecycler;
    private Object sourceRef;
    private IOContext ioContext;

    @Before
    public void setUp() {
        bufferRecycler = new BufferRecycler();
        sourceRef = new Object();
        ioContext = new IOContext(bufferRecycler, sourceRef, true);
    }

    @After
    public void tearDown() {
        ioContext = null;
        bufferRecycler = null;
        sourceRef = null;
    }

    @Test
    public void testConstructorsAndAccessors() {
        assertNotNull(ioContext.getSourceReference());
        assertEquals(sourceRef, ioContext.getSourceReference());
        assertTrue(ioContext.isResourceManaged());
        assertNull(ioContext.getEncoding());

        // Test setEncoding and withEncoding
        ioContext.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, ioContext.getEncoding());

        IOContext chainedContext = ioContext.withEncoding(JsonEncoding.UTF16_BE);
        assertEquals(JsonEncoding.UTF16_BE, chainedContext.getEncoding());
        assertSame(ioContext, chainedContext);

        // Test with null sourceRef and resourceManaged = false
        IOContext nullRefContext = new IOContext(bufferRecycler, null, false);
        assertNull(nullRefContext.getSourceReference());
        assertFalse(nullRefContext.isResourceManaged());
    }

    @Test
    public void testConstructTextBuffer() {
        TextBuffer textBuffer = ioContext.constructTextBuffer();
        assertNotNull(textBuffer);
    }

    @Test
    public void testReadIOBufferLifecycle() {
        // Standard allocation and release
        byte[] buf = ioContext.allocReadIOBuffer();
        assertNotNull(buf);
        ioContext.releaseReadIOBuffer(buf);

        // Release null should be safe (covers buf != null branch false)
        ioContext.releaseReadIOBuffer(null);

        // Allocation with minSize
        byte[] bufWithSize = ioContext.allocReadIOBuffer(100);
        assertNotNull(bufWithSize);
        ioContext.releaseReadIOBuffer(bufWithSize);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferTwiceThrowsException() {
        ioContext.allocReadIOBuffer();
        ioContext.allocReadIOBuffer(); // Should throw IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferWithMinSizeTwiceThrowsException() {
        ioContext.allocReadIOBuffer(50);
        ioContext.allocReadIOBuffer(50); // Should throw IllegalStateException
    }

    @Test
    public void testWriteEncodingBufferLifecycle() {
        byte[] buf = ioContext.allocWriteEncodingBuffer();
        assertNotNull(buf);
        ioContext.releaseWriteEncodingBuffer(buf);
        ioContext.releaseWriteEncodingBuffer(null);

        byte[] bufWithSize = ioContext.allocWriteEncodingBuffer(200);
        assertNotNull(bufWithSize);
        ioContext.releaseWriteEncodingBuffer(bufWithSize);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferTwiceThrowsException() {
        ioContext.allocWriteEncodingBuffer();
        ioContext.allocWriteEncodingBuffer();
    }

    @Test
    public void testBase64BufferLifecycle() {
        byte[] buf = ioContext.allocBase64Buffer();
        assertNotNull(buf);
        ioContext.releaseBase64Buffer(buf);
        ioContext.releaseBase64Buffer(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64BufferTwiceThrowsException() {
        ioContext.allocBase64Buffer();
        ioContext.allocBase64Buffer();
    }

    @Test
    public void testTokenBufferLifecycle() {
        char[] buf = ioContext.allocTokenBuffer();
        assertNotNull(buf);
        ioContext.releaseTokenBuffer(buf);
        ioContext.releaseTokenBuffer(null);

        char[] bufWithSize = ioContext.allocTokenBuffer(150);
        assertNotNull(bufWithSize);
        ioContext.releaseTokenBuffer(bufWithSize);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferTwiceThrowsException() {
        ioContext.allocTokenBuffer();
        ioContext.allocTokenBuffer();
    }

    @Test
    public void testConcatBufferLifecycle() {
        char[] buf = ioContext.allocConcatBuffer();
        assertNotNull(buf);
        ioContext.releaseConcatBuffer(buf);
        ioContext.releaseConcatBuffer(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBufferTwiceThrowsException() {
        ioContext.allocConcatBuffer();
        ioContext.allocConcatBuffer();
    }

    @Test
    public void testNameCopyBufferLifecycle() {
        char[] buf = ioContext.allocNameCopyBuffer(80);
        assertNotNull(buf);
        ioContext.releaseNameCopyBuffer(buf);
        ioContext.releaseNameCopyBuffer(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBufferTwiceThrowsException() {
        ioContext.allocNameCopyBuffer(50);
        ioContext.allocNameCopyBuffer(50);
    }

    @Test
    public void testVerifyReleaseValidUpgradeByte() {
        byte[] src = ioContext.allocReadIOBuffer();
        // Upgrade buffer: different instance but larger or equal length
        byte[] largerBuf = new byte[src.length + 10];
        // Should not throw exception
        ioContext.releaseReadIOBuffer(largerBuf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyReleaseInvalidSmallerByteThrowsException() {
        byte[] src = ioContext.allocReadIOBuffer();
        // Smaller buffer trying to be released -> triggers IllegalArgumentException
        byte[] smallerBuf = new byte[src.length > 0 ? src.length - 1 : 0];
        ioContext.releaseReadIOBuffer(smallerBuf);
    }

    @Test
    public void testVerifyReleaseValidUpgradeChar() {
        char[] src = ioContext.allocTokenBuffer();
        char[] largerBuf = new char[src.length + 10];
        // Should not throw exception
        ioContext.releaseTokenBuffer(largerBuf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyReleaseInvalidSmallerCharThrowsException() {
        char[] src = ioContext.allocTokenBuffer();
        char[] smallerBuf = new char[src.length > 0 ? src.length - 1 : 0];
        ioContext.releaseTokenBuffer(smallerBuf);
    }
}