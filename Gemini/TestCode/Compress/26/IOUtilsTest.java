package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class IOUtilsTest {

    // --- Tests for copy methods ---

    @Test
    public void testCopyDefaultBufferSize() throws IOException {
        byte[] data = new byte[10000]; // Larger than default buffer 8024
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        long copied = IOUtils.copy(in, out);
        assertEquals(data.length, copied);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyCustomBufferSize() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Use a buffer size smaller than data length
        long copied = IOUtils.copy(in, out, 2);
        assertEquals(5, copied);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyEmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        long copied = IOUtils.copy(in, out);
        assertEquals(0, copied);
        assertEquals(0, out.size());
    }

    // --- Tests for skip method ---

    @Test
    public void testSkipNormal() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        InputStream in = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(in, 3);
        assertEquals(3, skipped);
        assertEquals(4, in.read()); // Next byte should be 4
    }

    @Test
    public void testSkipZeroOrNegative() throws IOException {
        byte[] data = new byte[] { 1, 2, 3 };
        InputStream in = new ByteArrayInputStream(data);

        assertEquals(0, IOUtils.skip(in, 0));
        assertEquals(0, IOUtils.skip(in, -5));
        assertEquals(1, in.read()); // Stream untouched
    }

    @Test
    public void testSkipBeyondStreamLengthAndZeroSkipFallback() throws IOException {
        // Create a custom InputStream where skip() returns 0 immediately (simulating streams that don't support native skip)
        InputStream restrictedStream = new InputStream() {
            private final byte[] content = { 1, 2, 3 };
            private int index = 0;

            @Override
            public int read() throws IOException {
                if (index < content.length) {
                    return content[index++];
                }
                return -1;
            }

            @Override
            public long skip(long n) throws IOException {
                // Simulate skip returning 0 forcing fallback to read() if implemented, 
                // or testing the 'skipped == 0' break branch in IOUtils.skip
                return 0;
            }
        };

        // Since skip() returns 0, IOUtils.skip should break immediately and return 0
        long skipped = IOUtils.skip(restrictedStream, 5);
        assertEquals(0, skipped);
    }

    // --- Tests for readFully methods ---

    @Test
    public void testReadFullyArray() throws IOException {
        byte[] data = new byte[] { 10, 20, 30, 40, 50 };
        InputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[3];

        int readBytes = IOUtils.readFully(in, buffer);
        assertEquals(3, readBytes);
        assertArrayEquals(new byte[] { 10, 20, 30 }, buffer);
    }

    @Test
    public void testReadFullyWithOffsetAndLen() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        InputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        int readBytes = IOUtils.readFully(in, buffer, 2, 4);
        assertEquals(4, readBytes);
        assertArrayEquals(new byte[] { 0, 0, 1, 2, 3, 4, 0, 0, 0, 0 }, buffer);
    }

    @Test
    public void testReadFullyEOFReachedEarly() throws IOException {
        byte[] data = new byte[] { 1, 2 };
        InputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];

        int readBytes = IOUtils.readFully(in, buffer, 0, 5);
        assertEquals(2, readBytes); // Only 2 bytes available, should break on EOF (x == -1)
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeLen() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        IOUtils.readFully(in, new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        IOUtils.readFully(in, new byte[10], -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyOutOfBounds() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        IOUtils.readFully(in, new byte[10], 5, 6); // 5 + 6 > 10
    }

    // --- Tests for toByteArray method ---

    @Test
    public void testToByteArray() throws IOException {
        byte[] data = new byte[] { 9, 8, 7, 6, 5 };
        InputStream in = new ByteArrayInputStream(data);

        byte[] result = IOUtils.toByteArray(in);
        assertArrayEquals(data, result);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArrayNull() throws IOException {
        IOUtils.toByteArray(null);
    }

    // --- Tests for closeQuietly method ---

    @Test
    public void testCloseQuietlyWithNull() {
        // Should not throw any exception
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietlyNormal() {
        Closeable closeable = new Closeable() {
            boolean closed = false;
            @Override
            public void close() throws IOException {
                closed = true;
            }
        };
        IOUtils.closeQuietly(closeable);
    }

    @Test
    public void testCloseQuietlySwalowsException() {
        Closeable faultyCloseable = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("Simulated close error");
            }
        };
        // Should catch and ignore the IOException internally
        IOUtils.closeQuietly(faultyCloseable);
    }
}