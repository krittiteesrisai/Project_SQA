package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TextBufferTest {

    private BufferRecycler recycler;
    private TextBuffer textBuffer;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        textBuffer = new TextBuffer(recycler);
    }

    @Test
    public void testLifecycleAndNullAllocator() {
        TextBuffer nullAllocBuffer = new TextBuffer(null);
        nullAllocBuffer.releaseBuffers();
        assertEquals(0, nullAllocBuffer.size());
    }

    @Test
    public void testResetWithEmptyAndShared() {
        char[] data = "HelloSharedWorld".toCharArray();
        textBuffer.resetWithShared(data, 5, 6); // "Shared"
        
        assertEquals(6, textBuffer.size());
        assertEquals(5, textBuffer.getTextOffset());
        assertTrue(textBuffer.hasTextAsCharacters());
        assertArrayEquals(data, textBuffer.getTextBuffer());
        assertEquals("Shared", textBuffer.contentsAsString());
        assertEquals("Shared", textBuffer.toString());

        // Test contentsAsArray with start == 5 (non-zero start)
        char[] arr = textBuffer.contentsAsArray();
        assertEquals(6, arr.length);
        assertEquals('S', arr[0]);

        // Test resetWithShared with empty len
        textBuffer.resetWithShared(data, 0, 0);
        assertEquals("", textBuffer.contentsAsString());
        assertArrayEquals(TextBuffer.NO_CHARS, textBuffer.contentsAsArray());
    }

    @Test
    public void testResetWithSharedZeroStart() {
        char[] data = "ZeroStart".toCharArray();
        textBuffer.resetWithShared(data, 0, 9);
        char[] arr = textBuffer.contentsAsArray();
        assertEquals(9, arr.length);
        assertEquals('Z', arr[0]);
    }

    @Test
    public void testResetWithCopy() {
        char[] data = "CopyText".toCharArray();
        textBuffer.resetWithCopy(data, 0, data.length);
        assertEquals("CopyText", textBuffer.contentsAsString());
        
        // Test resetting copy when segments exist
        textBuffer.append("ExtraSegmentContentToForceMoreDataHereAndExpandBufferToLargeSize1234567890", 0, 75);
        textBuffer.resetWithCopy(data, 0, 4);
        assertEquals("Copy", textBuffer.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        textBuffer.resetWithString("StringValue");
        assertEquals(11, textBuffer.size());
        assertFalse(textBuffer.hasTextAsCharacters());
        assertEquals("StringValue", textBuffer.contentsAsString());
        assertArrayEquals("StringValue".toCharArray(), textBuffer.contentsAsArray());
        
        // Test second call to contentsAsArray when result array is already cached
        assertArrayEquals("StringValue".toCharArray(), textBuffer.contentsAsArray());
    }

    @Test
    public void testAppendCharAndUnshare() {
        char[] shared = "UnshareMePlease".toCharArray();
        textBuffer.resetWithShared(shared, 0, shared.length);
        
        // Appending should trigger unshare()
        textBuffer.append('!');
        assertEquals("UnshareMePlease!", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayEdges() {
        // Normal append fitting in segment
        textBuffer.append("Short", 0, 5);
        assertEquals("Short", textBuffer.contentsAsString());

        // Append forcing max < len and multiple expansions
        char[] largeData = new char[TextBuffer.MIN_SEGMENT_LEN + 500];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = 'A';
        }
        textBuffer.resetWithEmpty();
        textBuffer.append(largeData, 0, largeData.length);
        assertEquals(largeData.length, textBuffer.size());
    }

    @Test
    public void testAppendStringEdges() {
        textBuffer.resetWithEmpty();
        String base = "TestStringAppend";
        textBuffer.append(base, 0, 4); // "Test"
        
        // Append forcing max > 0 but not enough for full len
        char[] curr = textBuffer.getCurrentSegment();
        int remainingSpace = curr.length - textBuffer.getCurrentSegmentSize();
        
        String hugeStr = new String(new char[remainingSpace + 100]).replace('\0', 'B');
        textBuffer.append(hugeStr, 0, hugeStr.length());
        assertTrue(textBuffer.contentsAsString().startsWith("Test"));
    }

    @Test
    public void testSegmentOperationsAndFinish() {
        textBuffer.resetWithEmpty();
        char[] seg1 = textBuffer.getCurrentSegment();
        assertNotNull(seg1);

        // Fill and finish current segment to build multiple segments
        textBuffer.setCurrentLength(seg1.length);
        char[] seg2 = textBuffer.finishCurrentSegment();
        assertNotNull(seg2);

        // Access via contentsAsString with segments
        textBuffer.append('X');
        assertTrue(textBuffer.contentsAsString().length() > 0);
        assertNotNull(textBuffer.contentsAsArray());
    }

    @Test
    public void testExpandCurrentSegmentVariants() {
        textBuffer.resetWithEmpty();
        char[] seg = textBuffer.getCurrentSegment();
        
        // Expand normally
        char[] expanded = textBuffer.expandCurrentSegment();
        assertNotNull(expanded);

        // Expand with minSize smaller than current
        char[] same = textBuffer.expandCurrentSegment(10);
        assertSame(expanded, same);

        // Expand with minSize larger than current
        char[] bigger = textBuffer.expandCurrentSegment(50000);
        assertTrue(bigger.length >= 50000);
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        textBuffer.resetWithString("Initial");
        char[] seg = textBuffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, textBuffer.size());
    }

    @Test
    public void contentsAsDecimalTest() {
        // Test with resultArray
        textBuffer.resetWithString("123.45");
        textBuffer.contentsAsArray(); // populate _resultArray
        BigDecimal dec1 = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), dec1);

        // Test with shared buffer
        char[] numChars = "987.65".toCharArray();
        textBuffer.resetWithShared(numChars, 0, 6);
        BigDecimal dec2 = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("987.65"), dec2);

        // Test with single segment
        textBuffer.resetWithEmpty();
        textBuffer.append("555.55", 0, 6);
        BigDecimal dec3 = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("555.55"), dec3);

        // Test with multiple segments / fallback to contentsAsArray
        textBuffer.resetWithEmpty();
        char[] hugeNum = new char[TextBuffer.MIN_SEGMENT_LEN + 10];
        java.util.Arrays.fill(hugeNum, '1');
        hugeNum[3] = '.'; // make it a valid or invalid decimal format handled by NumberInput, 
        // using valid number format snippet:
        char[] validNum = "123456789.123456789".toCharArray();
        textBuffer.append(validNum, 0, validNum.length);
        assertNotNull(textBuffer.contentsAsDecimal());
    }

    @Test
    public void contentsAsDoubleTest() {
        textBuffer.resetWithString("123.45");
        assertEquals(123.45, textBuffer.contentsAsDouble(), 0.001);
    }

    @Test
    public void testReleaseBuffersWithSegment() {
        textBuffer.resetWithEmpty();
        textBuffer.getCurrentSegment();
        textBuffer.finishCurrentSegment();
        textBuffer.releaseBuffers();
        assertEquals(0, textBuffer.size());
    }
}