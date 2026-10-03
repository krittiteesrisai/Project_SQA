package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TextBufferTest {

    private BufferRecycler recycler;
    private TextBuffer buffer;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        buffer = new TextBuffer(recycler);
    }

    @Test
    public void testLifecycleAndReleaseBuffersNullAllocator() {
        // Test releaseBuffers with null allocator (Branch: _allocator == null)
        TextBuffer nullAllocBuffer = new TextBuffer(null);
        nullAllocBuffer.append('a');
        nullAllocBuffer.releaseBuffers();
        assertEquals(0, nullAllocBuffer.size());
    }

    @Test
    public void testReleaseBuffersWithAllocator() {
        // Test releaseBuffers with valid allocator and current segment
        buffer.append("Hello World");
        assertNotNull(buffer.getCurrentSegment());
        buffer.releaseBuffers();
        assertEquals(0, buffer.size());
    }

    @Test
    public void testResetWithMethods() {
        // Test resetWithEmpty, resetWithShared, resetWithCopy, resetWithString
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());

        char[] shared = "SharedContent".toCharArray();
        buffer.resetWithShared(shared, 2, 6);
        assertEquals(6, buffer.size());
        assertEquals(2, buffer.getTextOffset());
        assertTrue(buffer.hasTextAsCharacters());
        assertEquals("aredCo", buffer.contentsAsString());

        buffer.resetWithCopy(shared, 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("Share", buffer.contentsAsString());

        buffer.resetWithString("StringValue");
        assertEquals(11, buffer.size());
        assertFalse(buffer.hasTextAsCharacters());
        assertEquals("StringValue", buffer.contentsAsString());
        // Accessing array from string result
        assertNotNull(buffer.contentsAsArray());
    }

    @Test
    public void testSizeBranches() {
        // 1. Shared buffer size
        buffer.resetWithShared(new char[]{'a', 'b'}, 0, 2);
        assertEquals(2, buffer.size());

        // 2. Result array size
        buffer.resetWithEmpty();
        buffer.contentsAsArray(); // forces resultArray if empty or triggers build
        
        // 3. Result string size
        buffer.resetWithString("Test");
        assertEquals(4, buffer.size());
    }

    @Test
    public void testGetTextBufferBranches() {
        // Shared input buffer
        char[] data = {'x', 'y', 'z'};
        buffer.resetWithShared(data, 0, 3);
        assertArrayEquals(data, buffer.getTextBuffer());

        // Result array
        buffer.resetWithEmpty();
        buffer.append('a');
        char[] arr = buffer.contentsAsArray();
        assertArrayEquals(arr, buffer.getTextBuffer());

        // Result string
        buffer.resetWithString("abc");
        assertArrayEquals(new char[]{'a', 'b', 'c'}, buffer.getTextBuffer());

        // Single segment without multiple segments
        buffer.resetWithEmpty();
        buffer.append("hello");
        char[] seg = buffer.getTextBuffer();
        assertNotNull(seg);

        // Multiple segments (forces contentsAsArray inside getTextBuffer)
        buffer.resetWithEmpty();
        buffer.setCurrentLength(10);
        buffer.finishCurrentSegment();
        buffer.append("more data");
        assertNotNull(buffer.getTextBuffer());
    }

    @Test
    public void testContentsAsStringBranches() {
        // Empty shared len < 1
        buffer.resetWithShared(new char[]{'a'}, 0, 0);
        assertEquals("", buffer.contentsAsString());

        // Shared with content
        buffer.resetWithShared(new char[]{'a', 'b', 'c'}, 1, 2);
        assertEquals("bc", buffer.contentsAsString());

        // Segmented contents combining segments
        buffer.resetWithEmpty();
        buffer.append("Segment1");
        buffer.finishCurrentSegment();
        buffer.append("Segment2");
        assertEquals("Segment1Segment2", buffer.contentsAsString());
    }

    @Test
    public void testContentsAsDecimal() {
        // Result array decimal
        buffer.resetWithString("123.45");
        buffer.contentsAsArray();
        BigDecimal dec1 = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), dec1);

        // Shared buffer decimal
        char[] numChars = "99.99".toCharArray();
        buffer.resetWithShared(numChars, 0, 5);
        BigDecimal dec2 = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("99.99"), dec2);

        // Single segment decimal
        buffer.resetWithEmpty();
        buffer.append("55.55");
        BigDecimal dec3 = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("55.55"), dec3);

        // Multi-segment decimal
        buffer.resetWithEmpty();
        buffer.append("1234");
        buffer.finishCurrentSegment();
        buffer.append("5678");
        BigDecimal dec4 = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("12345678"), dec4);
    }

    @Test
    public void testContentsAsDouble() {
        buffer.resetWithString("123.45");
        assertEquals(123.45, buffer.contentsAsDouble(), 0.001);
    }

    @Test
    public void testEnsureNotSharedAndAppends() {
        // ensureNotShared & append(char)
        buffer.resetWithShared(new char[]{'h', 'i'}, 0, 2);
        buffer.ensureNotShared();
        buffer.append('!');
        assertEquals("hi!", buffer.contentsAsString());

        // append(char[], int, int) with max >= len and max < len (expansion)
        buffer.resetWithEmpty();
        char[] src = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        buffer.append(src, 0, 5); // fits
        buffer.append(src, 5, 20); // exceeds current space, triggers copy/expand
        
        // append(String, int, int)
        buffer.resetWithEmpty();
        buffer.append("Hello", 0, 5);
        buffer.append(" World!! Extra long string to force multiple segment expansions and boundary checks.", 0, 75);
    }

    @Test
    public void testCurrentSegmentOperations() {
        // getCurrentSegment with shared buffer (triggers unshare)
        buffer.resetWithShared(new char[]{'a'}, 0, 1);
        char[] seg = buffer.getCurrentSegment();
        assertNotNull(seg);

        // getCurrentSegment with null currentSegment
        buffer.resetWithEmpty();
        // Clear currentSegment to test null branch
        // We can achieve this via releaseBuffers or reflection if needed, but emptyAndGetCurrentSegment covers null
        char[] emptyCurr = buffer.emptyAndGetCurrentSegment();
        assertNotNull(emptyCurr);
        
        // getCurrentSize & setCurrentLength
        buffer.setCurrentLength(5);
        assertEquals(5, buffer.getCurrentSegmentSize());

        // expandCurrentSegment
        buffer.expandCurrentSegment();
    }

    @Test
    public void testBuildResultArrayEdgeCases() {
        // len < 1 in shared array
        buffer.resetWithShared(new char[]{'a'}, 0, 0);
        assertArrayEquals(TextBuffer.NO_CHARS, buffer.contentsAsArray());

        // start == 0 vs start > 0 in shared array
        buffer.resetWithShared(new char[]{'a', 'b', 'c'}, 0, 2);
        assertArrayEquals(new char[]{'a', 'b'}, buffer.contentsAsArray());

        buffer.resetWithShared(new char[]{'a', 'b', 'c'}, 1, 2);
        assertArrayEquals(new char[]{'b', 'c'}, buffer.contentsAsArray());

        // size < 1 non-shared
        buffer.resetWithEmpty();
        assertArrayEquals(TextBuffer.NO_CHARS, buffer.contentsAsArray());
    }

    @Test
    public void testToStringOverride() {
        buffer.resetWithString("ToStringTest");
        assertEquals("ToStringTest", buffer.toString());
    }
}