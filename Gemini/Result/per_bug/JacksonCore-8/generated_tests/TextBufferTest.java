package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TextBufferTest {

    private TextBuffer textBufferNullAllocator;
    private TextBuffer textBufferWithAllocator;
    private BufferRecycler bufferRecycler;

    @Before
    public void setUp() {
        textBufferNullAllocator = new TextBuffer(null);
        bufferRecycler = new BufferRecycler();
        textBufferWithAllocator = new TextBuffer(bufferRecycler);
    }

    @Test
    public void testLifeCycleAndReleaseBuffers() {
        // Test releaseBuffers with null allocator
        textBufferNullAllocator.releaseBuffers();
        assertEquals(0, textBufferNullAllocator.size());

        // Test releaseBuffers with allocator and null current segment
        textBufferWithAllocator.releaseBuffers();
        
        // Test releaseBuffers with allocator and active current segment
        textBufferWithAllocator.getCurrentSegment();
        textBufferWithAllocator.releaseBuffers();
        assertEquals(0, textBufferWithAllocator.size());
    }

    @Test
    public void testResetWithEmptyAndSegments() {
        textBufferNullAllocator.resetWithEmpty();
        assertEquals(0, textBufferNullAllocator.size());
        assertNull(textBufferNullAllocator.getTextBuffer());
        assertFalse(textBufferNullAllocator.hasTextAsCharacters());

        // Append to create segments, then reset
        textBufferNullAllocator.append('a');
        textBufferNullAllocator.finishCurrentSegment();
        textBufferNullAllocator.append('b');
        assertTrue(textBufferNullAllocator.size() > 0);
        
        textBufferNullAllocator.resetWithEmpty();
        assertEquals(0, textBufferNullAllocator.size());
    }

    @Test
    public void testResetWithShared() {
        char[] data = "HelloSharedBuffer".toCharArray();
        textBufferNullAllocator.resetWithShared(data, 5, 6); // "Shared"
        
        assertEquals(6, textBufferNullAllocator.size());
        assertEquals(5, textBufferNullAllocator.getTextOffset());
        assertTrue(textBufferNullAllocator.hasTextAsCharacters());
        assertArrayEquals(data, textBufferNullAllocator.getTextBuffer());
        assertEquals("Shared", textBufferNullAllocator.contentsAsString());
        
        // Test contentsAsDecimal with shared buffer
        TextBuffer decBuffer = new TextBuffer(null);
        decBuffer.resetWithShared("123.45".toCharArray(), 0, 6);
        assertEquals(new BigDecimal("123.45"), decBuffer.contentsAsDecimal());
    }

    @Test
    public void testResetWithSharedEmpty() {
        char[] data = "".toCharArray();
        textBufferNullAllocator.resetWithShared(data, 0, 0);
        assertEquals(0, textBufferNullAllocator.size());
        assertEquals("", textBufferNullAllocator.contentsAsString());
    }

    @Test
    public void testResetWithCopy() {
        char[] data = "CopyText".toCharArray();
        textBufferNullAllocator.resetWithCopy(data, 0, data.length);
        assertEquals("CopyText", textBufferNullAllocator.contentsAsString());
        assertEquals(8, textBufferNullAllocator.size());
    }

    @Test
    public void testResetWithString() {
        textBufferNullAllocator.resetWithString("StringValue");
        assertEquals("StringValue", textBufferNullAllocator.contentsAsString());
        assertEquals(11, textBufferNullAllocator.size());
        assertFalse(textBufferNullAllocator.hasTextAsCharacters());
        
        // Test result array caching via contentsAsArray
        char[] arr = textBufferNullAllocator.contentsAsArray();
        assertNotNull(arr);
        assertEquals("StringValue", new String(arr));
        
        // Test decimal with result array
        assertEquals(new BigDecimal("123"), new TextBuffer(null) {
            {
                resetWithString("123");
                contentsAsArray();
            }
        }.contentsAsDecimal());
    }

    @Test
    public void testAppendScenarios() {
        // Append single char (unshared trigger + normal append)
        textBufferNullAllocator.append('X');
        assertEquals("X", textBufferNullAllocator.contentsAsString());

        // Append char array (fits in current segment)
        textBufferNullAllocator.append(new char[]{'Y', 'Z'}, 0, 2);
        assertEquals("XYZ", textBufferNullAllocator.contentsAsString());

        // Append char array exceeding current segment (triggers expansion)
        char[] largeData = new char[TextBuffer.MIN_SEGMENT_LEN + 100];
        Arrays.fill(largeData, 'A');
        textBufferNullAllocator.resetWithEmpty();
        textBufferNullAllocator.append(largeData, 0, largeData.length);
        assertEquals(largeData.length, textBufferNullAllocator.size());

        // Append String (fits and overflows)
        textBufferNullAllocator.resetWithEmpty();
        textBufferNullAllocator.append("Short", 0, 5);
        
        String longStr = new String(new char[TextBuffer.MIN_SEGMENT_LEN + 50]);
        textBufferNullAllocator.append(longStr, 0, longStr.length());
        assertTrue(textBufferNullAllocator.size() > TextBuffer.MIN_SEGMENT_LEN);

        // Append with shared buffer active (forces unshare inside append)
        textBufferNullAllocator.resetWithShared("Init".toCharArray(), 0, 4);
        textBufferNullAllocator.append('!');
        assertEquals("Init!", textBufferNullAllocator.contentsAsString());
    }

    @Test
    public void testRawAccessAndSegments() {
        char[] seg1 = textBufferNullAllocator.getCurrentSegment();
        assertNotNull(seg1);
        
        textBufferNullAllocator.setCurrentLength(5);
        assertEquals(5, textBufferNullAllocator.getCurrentSegmentSize());

        // Test finishCurrentSegment and multiple segments string building
        textBufferNullAllocator.resetWithEmpty();
        textBufferNullAllocator.append("Segment1_Data", 0, 13);
        textBufferNullAllocator.finishCurrentSegment();
        textBufferNullAllocator.append("Segment2_Data", 0, 13);
        
        assertEquals("Segment1_DataSegment2_Data", textBufferNullAllocator.contentsAsString());
        
        // Test contentsAsArray with multiple segments
        char[] combinedArray = textBufferNullAllocator.contentsAsArray();
        assertNotNull(combinedArray);

        // Test expandCurrentSegment variations
        textBufferNullAllocator.expandCurrentSegment();
        textBufferNullAllocator.expandCurrentSegment(TextBuffer.MIN_SEGMENT_LEN * 2);
        
        // Test emptyAndGetCurrentSegment
        char[] emptyCurr = textBufferNullAllocator.emptyAndGetCurrentSegment();
        assertNotNull(emptyCurr);
    }

    @Test
    public void testContentsAsDoubleAndDecimalEdgeCases() {
        textBufferNullAllocator.resetWithString("123.45");
        assertEquals(123.45, textBufferNullAllocator.contentsAsDouble(), 0.001);
        
        // Single segment decimal conversion
        textBufferNullAllocator.resetWithCopy("99.99".toCharArray(), 0, 5);
        assertEquals(new BigDecimal("99.99"), textBufferNullAllocator.contentsAsDecimal());
    }

    @Test
    public void testSetCurrentAndReturn() {
        textBufferNullAllocator.resetWithEmpty();
        textBufferNullAllocator.append("TestString", 0, 10);
        String res = textBufferNullAllocator.setCurrentAndReturn(4);
        assertEquals("Test", res);

        // Multi-segment version of setCurrentAndReturn
        textBufferNullAllocator.resetWithEmpty();
        textBufferNullAllocator.append(new char[TextBuffer.MIN_SEGMENT_LEN + 10], 0, TextBuffer.MIN_SEGMENT_LEN + 10);
        textBufferNullAllocator.finishCurrentSegment();
        textBufferNullAllocator.append("Extra", 0, 5);
        String multiRes = textBufferNullAllocator.setCurrentAndReturn(3);
        assertNotNull(multiRes);
    }

    @Test
    public void testToStringOverride() {
        textBufferNullAllocator.resetWithString("ToStringTest");
        assertEquals("ToStringTest", textBufferNullAllocator.toString());
    }

    @Test
    public void testResultArrayEdgeCases() {
        // Zero size result array
        textBufferNullAllocator.resetWithEmpty();
        char[] arr = textBufferNullAllocator.contentsAsArray();
        assertNotNull(arr);
        assertEquals(0, arr.length);

        // Shared buffer with start > 0 and len > 0
        char[] shared = "ABCDE".toCharArray();
        textBufferNullAllocator.resetWithShared(shared, 1, 3); // "BCD"
        char[] sharedArr = textBufferNullAllocator.contentsAsArray();
        assertArrayEquals(new char[]{'B', 'C', 'D'}, sharedArr);

        // Shared buffer with start == 0
        textBufferNullAllocator.resetWithShared(shared, 0, 3); // "ABC"
        char[] sharedArrZero = textBufferNullAllocator.contentsAsArray();
        assertArrayEquals(new char[]{'A', 'B', 'C'}, sharedArrZero);

        // Shared buffer with len < 1
        textBufferNullAllocator.resetWithShared(shared, 1, 0);
        char[] sharedArrEmpty = textBufferNullAllocator.contentsAsArray();
        assertArrayEquals(TextBuffer.NO_CHARS, sharedArrEmpty);
    }
}