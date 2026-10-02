package com.fasterxml.jackson.core.util;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextBufferTest {

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private static char[] makeSequential(int n) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (char) ('A' + (i % 26));
        }
        return arr;
    }

    private static String repeat(char c, int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, c);
        return new String(arr);
    }

    /**
     * สร้าง TextBuffer ที่ current segment ถูกจองขนาด MIN_SEGMENT_LEN (1000)
     * แน่นอนแล้ว โดยไม่มีเนื้อหาใด ๆ ถูกเติมเข้าไป (append ความยาว 0)
     * เพื่อให้การ append ข้อมูลขนาดใหญ่ในลำดับถัดไปบังคับ branch
     * expand()/segmentation ได้จริง (ไม่ใช่การจองพอดีจาก unshare() ครั้งแรก)
     */
    private static TextBuffer primedBuffer() {
        TextBuffer tb = new TextBuffer(null);
        tb.append(TextBuffer.NO_CHARS, 0, 0);
        return tb;
    }

    // ---------------------------------------------------------------
    // Constructor / basic fresh-state
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_FreshState() {
        TextBuffer tb = new TextBuffer(null);
        // _inputStart default = 0 (>=0) -> size() คืน _inputLen(=0)
        assertEquals(0, tb.size());
    }

    @Test
    public void testGetTextOffset_FreshBufferBeforeAnyReset() {
        // หมายเหตุ: _inputStart default = 0 จึงคืน 0 อยู่แล้ว ไม่ต่างจากกรณี normal
        TextBuffer tb = new TextBuffer(null);
        assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void testGetTextBuffer_FreshBufferBeforeAnyReset() {
        // หมายเหตุ: ตาม source, _inputStart default=0 (>=0) ทำให้ getTextBuffer()
        // คืน _inputBuffer ซึ่งยังเป็น null เนื่องจากยังไม่เคยเรียก resetWith*/append
        // เป็น edge case ที่แสดงพฤติกรรมจริงของ field ที่ไม่ได้ initialize ชัดเจน
        TextBuffer tb = new TextBuffer(null);
        assertNull(tb.getTextBuffer());
    }

    // ---------------------------------------------------------------
    // resetWithEmpty()
    // ---------------------------------------------------------------

    @Test
    public void testResetWithEmpty_NoSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testResetWithEmpty_AfterSegmentsCreated() {
        TextBuffer tb = primedBuffer();
        char[] big = makeSequential(2500);
        tb.append(big, 0, big.length); // จะ overflow 1000 -> hasSegments = true
        assertEquals(2500, tb.size());

        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // resetWithShared()
    // ---------------------------------------------------------------

    @Test
    public void testResetWithShared_Basic() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "Hello World".toCharArray();
        tb.resetWithShared(src, 2, 5); // "llo W"
        assertEquals(5, tb.size());
        assertEquals(2, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertEquals("llo W", tb.contentsAsString());
        assertSame(src, tb.getTextBuffer());
    }

    @Test
    public void testResetWithShared_ClearsExistingSegments() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(2500), 0, 2500); // hasSegments = true
        char[] src = "abc".toCharArray();
        tb.resetWithShared(src, 0, 3);
        assertEquals(3, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
        assertEquals("abc", tb.contentsAsString());
    }

    @Test(expected = NullPointerException.class)
    public void testResetWithShared_NullBuffer_ThrowsOnContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared(null, 0, 3); // _inputLen=3 >=1 -> new String(null,...) -> NPE
        tb.contentsAsString();
    }

    @Test
    public void testResetWithShared_ZeroLength_ContentsEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 0);
        assertEquals("", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // resetWithCopy()
    // ---------------------------------------------------------------

    @Test
    public void testResetWithCopy_FreshCurrentSegmentNull_IsIndependentCopy() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "Test".toCharArray();
        tb.resetWithCopy(src, 0, 4);
        assertEquals(4, tb.size());
        assertEquals("Test", tb.contentsAsString());

        src[0] = 'X'; // แก้ต้นฉบับ ไม่ควรกระทบข้อมูลที่ copy ไปแล้ว
        assertEquals("Test", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_WithExistingSegments() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(2500), 0, 2500); // hasSegments = true
        tb.resetWithCopy("hi".toCharArray(), 0, 2);
        assertEquals(2, tb.size());
        assertEquals("hi", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // resetWithString()
    // ---------------------------------------------------------------

    @Test
    public void testResetWithString_Basic() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("Sample");
        assertEquals(6, tb.size());
        assertFalse(tb.hasTextAsCharacters());
        assertEquals("Sample", tb.contentsAsString());
        assertArrayEquals("Sample".toCharArray(), tb.getTextBuffer());
    }

    @Test
    public void testResetWithString_ClearsExistingSegments() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(2500), 0, 2500);
        tb.resetWithString("X");
        assertEquals(1, tb.size());
        assertEquals("X", tb.contentsAsString());
    }

    @Test
    public void testResetWithString_NullValue_TreatedAsEmptyFallback() {
        // หมายเหตุ: _resultString ถูก set เป็น null ตรง ๆ, แต่ _inputStart ถูกตั้ง -1
        // ทำให้ size()/contentsAsString() ตกไปยัง branch segmented (currLen==0 -> "")
        // แทนที่จะเกิด NullPointerException
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString(null);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // releaseBuffers()
    // ---------------------------------------------------------------

    @Test
    public void testReleaseBuffers_NullAllocator() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_WithAllocator_CurrentSegmentNotNull() {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a'); // establishes _currentSegment
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_WithAllocator_CurrentSegmentNull() {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // ไม่เคย append -> _currentSegment ยังเป็น null
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    // ---------------------------------------------------------------
    // size()
    // ---------------------------------------------------------------

    @Test
    public void testSize_ResultArrayBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abcdef");
        tb.contentsAsArray(); // ทำให้ _resultArray != null
        assertEquals(6, tb.size());
    }

    @Test
    public void testSize_ResultStringBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hello");
        assertEquals(5, tb.size());
    }

    @Test
    public void testSize_SegmentedBranch() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(1500), 0, 1500); // overflow -> segmentSize>0
        assertEquals(1500, tb.size());
    }

    // ---------------------------------------------------------------
    // getTextOffset()
    // ---------------------------------------------------------------

    @Test
    public void testGetTextOffset_SharedNonZero() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("hello".toCharArray(), 3, 2);
        assertEquals(3, tb.getTextOffset());
    }

    @Test
    public void testGetTextOffset_NotShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hi");
        assertEquals(0, tb.getTextOffset());
    }

    // ---------------------------------------------------------------
    // hasTextAsCharacters()
    // ---------------------------------------------------------------

    @Test
    public void testHasTextAsCharacters_Shared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abc");
        tb.contentsAsArray();
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultStringOnly_False() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abc");
        assertFalse(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_DefaultSegmentedTrue() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        assertTrue(tb.hasTextAsCharacters());
    }

    // ---------------------------------------------------------------
    // getTextBuffer()
    // ---------------------------------------------------------------

    @Test
    public void testGetTextBuffer_Shared() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "abcdef".toCharArray();
        tb.resetWithShared(src, 1, 3);
        assertSame(src, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_ResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abc");
        char[] arr = tb.contentsAsArray();
        assertSame(arr, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_ResultStringConvertsAndCaches() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("xyz");
        char[] arr = tb.getTextBuffer();
        assertArrayEquals("xyz".toCharArray(), arr);
    }

    @Test
    public void testGetTextBuffer_SingleSegmentNoSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        char[] buf = tb.getTextBuffer();
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
    }

    @Test
    public void testGetTextBuffer_WithSegments_UsesContentsAsArray() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(1500), 0, 1500);
        char[] buf = tb.getTextBuffer();
        assertEquals(1500, buf.length);
    }

    // ---------------------------------------------------------------
    // contentsAsString()
    // ---------------------------------------------------------------

    @Test
    public void testContentsAsString_FromCachedResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("hey".toCharArray(), 0, 3); // _resultString=null
        tb.contentsAsArray(); // set _resultArray, _resultString ยังคง null
        assertEquals("hey", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SharedEmptyLen() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 0);
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SharedNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abcdef".toCharArray(), 1, 4);
        assertEquals("bcde", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SingleSegmentEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SingleSegmentNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        tb.append('c');
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_MultipleSegmentsCombine() {
        TextBuffer tb = primedBuffer();
        char[] chunk = makeSequential(2500);
        tb.append(chunk, 0, chunk.length);
        assertEquals(new String(chunk), tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // contentsAsArray()
    // ---------------------------------------------------------------

    @Test
    public void testContentsAsArray_CachesResult() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("hi".toCharArray(), 0, 2);
        char[] first = tb.contentsAsArray();
        char[] second = tb.contentsAsArray();
        assertSame(first, second);
    }

    // ---------------------------------------------------------------
    // contentsAsDecimal()
    // ---------------------------------------------------------------

    @Test
    public void testContentsAsDecimal_FromResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123.45".toCharArray(), 0, 6);
        tb.contentsAsArray();
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_FromSharedBuffer() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("999.99".toCharArray(), 0, 6);
        assertEquals(new BigDecimal("999.99"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_FromSingleSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("42".toCharArray(), 0, 2);
        assertEquals(new BigDecimal("42"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_Aggregated() {
        TextBuffer tb = primedBuffer();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1500; i++) sb.append('1');
        char[] chars = sb.toString().toCharArray();
        tb.append(chars, 0, chars.length);
        assertEquals(new BigDecimal(sb.toString()), tb.contentsAsDecimal());
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimal_InvalidNumber_Throws() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("abc".toCharArray(), 0, 3);
        tb.contentsAsDecimal();
    }

    // ---------------------------------------------------------------
    // contentsAsDouble()
    // ---------------------------------------------------------------

    @Test
    public void testContentsAsDouble() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("3.14");
        assertEquals(3.14, tb.contentsAsDouble(), 0.0001);
    }

    // ---------------------------------------------------------------
    // ensureNotShared()
    // ---------------------------------------------------------------

    @Test
    public void testEnsureNotShared_WhenShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abcdef".toCharArray(), 1, 3);
        tb.ensureNotShared();
        assertEquals(0, tb.getTextOffset());
        assertEquals("bcd", tb.contentsAsString());
    }

    @Test
    public void testEnsureNotShared_WhenNotShared_NoEffect() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("xyz");
        tb.ensureNotShared();
        assertEquals("xyz", tb.contentsAsString());
    }

    @Test
    public void testUnshare_ReusesExistingLargeSegment_NoExceptionCorrectContent() {
        // หมายเหตุ: ไม่สามารถตรวจสอบว่า array ถูก reuse จริงหรือไม่ (private field)
        // ทดสอบเชิง black-box ว่าเนื้อหาถูกต้องเมื่อ currentSegment มีขนาดใหญ่พอแล้ว
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.finishCurrentSegment(); // segment ใหม่ยาวขึ้น (~1500)
        tb.resetWithShared("hi".toCharArray(), 0, 2);
        tb.ensureNotShared();
        assertEquals("hi", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // append(char c)
    // ---------------------------------------------------------------

    @Test
    public void testAppendChar_Basic() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('X');
        assertEquals("X", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_TriggersExpand() {
        TextBuffer tb = new TextBuffer(null);
        for (int i = 0; i < 1001; i++) tb.append('a');
        assertEquals(1001, tb.size());
    }

    @Test
    public void testAppendChar_WhenShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        tb.append('d');
        assertEquals("abcd", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_WithAllocator() {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('z');
        assertEquals("z", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_ManyAppends_ClampsAtMaxSegmentLen() {
        TextBuffer tb = new TextBuffer(null);
        int totalChars = 700_000; // เพียงพอให้ expand() clamp ที่ MAX_SEGMENT_LEN
        for (int i = 0; i < totalChars; i++) tb.append('a');
        assertEquals(totalChars, tb.size());
        char[] curr = tb.getCurrentSegment();
        assertTrue(curr.length <= TextBuffer.MAX_SEGMENT_LEN);
    }

    // ---------------------------------------------------------------
    // append(char[], start, len)
    // ---------------------------------------------------------------

    @Test
    public void testAppendCharArray_FitsInCurrent() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("hello".toCharArray(), 0, 5);
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_ZeroLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.append(new char[]{'a', 'b', 'c'}, 1, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_PartialThenExpand() {
        TextBuffer tb = primedBuffer();
        char[] big = makeSequential(1500);
        tb.append(big, 0, 1500);
        assertEquals(new String(big), tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_MultipleExpandIterations() {
        TextBuffer tb = primedBuffer();
        char[] huge = makeSequential(600_000);
        tb.append(huge, 0, huge.length);
        assertEquals(huge.length, tb.size());
        assertEquals(new String(huge), tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_WhenShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        tb.append("def".toCharArray(), 0, 3);
        assertEquals("abcdef", tb.contentsAsString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAppendCharArray_InvalidRange_Throws() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "abc".toCharArray();
        tb.append(src, 1, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testAppendCharArray_NullArray_Throws() {
        TextBuffer tb = new TextBuffer(null);
        tb.append((char[]) null, 0, 3);
    }

    // ---------------------------------------------------------------
    // append(String, offset, len)
    // ---------------------------------------------------------------

    @Test
    public void testAppendString_FitsInCurrent() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("hello", 0, 5);
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testAppendString_ZeroLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("abc", 1, 0);
        assertEquals(0, tb.size());
    }

    @Test
    public void testAppendString_PartialThenExpand() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("", 0, 0); // priming (เทียบเท่า NO_CHARS สำหรับ String overload)
        String s = repeat('x', 1500);
        tb.append(s, 0, 1500);
        assertEquals(s, tb.contentsAsString());
    }

    @Test
    public void testAppendString_MultipleExpandIterations() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("", 0, 0); // priming
        String s = repeat('y', 600_000);
        tb.append(s, 0, s.length());
        assertEquals(s, tb.contentsAsString());
    }

    @Test
    public void testAppendString_WhenShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        tb.append("def", 0, 3);
        assertEquals("abcdef", tb.contentsAsString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAppendString_InvalidRange_Throws() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("abc", 1, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testAppendString_NullString_Throws() {
        TextBuffer tb = new TextBuffer(null);
        tb.append((String) null, 0, 3);
    }

    // ---------------------------------------------------------------
    // getCurrentSegment()
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentSegment_WhenShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        assertNotNull(tb.getCurrentSegment());
    }

    @Test
    public void testGetCurrentSegment_CurrNull() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty(); // inputStart=-1, currentSegment ยังเป็น null
        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
    }

    @Test
    public void testGetCurrentSegment_ExpandBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] seg = tb.getCurrentSegment();
        tb.setCurrentLength(seg.length); // จำลองว่าเต็มพอดี
        char[] seg2 = tb.getCurrentSegment(); // currentSize>=length -> expand()
        assertTrue(seg2.length > seg.length);
    }

    // ---------------------------------------------------------------
    // emptyAndGetCurrentSegment()
    // ---------------------------------------------------------------

    @Test
    public void testEmptyAndGetCurrentSegment_CurrNull() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment_CurrNotNull() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment_WithSegments() {
        TextBuffer tb = primedBuffer();
        tb.append(makeSequential(1500), 0, 1500); // hasSegments = true
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, tb.size());
    }

    // ---------------------------------------------------------------
    // getCurrentSegmentSize() / setCurrentLength()
    // ---------------------------------------------------------------

    @Test
    public void testGetSetCurrentSegmentSize() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        assertEquals(2, tb.getCurrentSegmentSize());
        tb.setCurrentLength(1);
        assertEquals(1, tb.getCurrentSegmentSize());
        assertEquals("a", tb.contentsAsString());
    }

    // ---------------------------------------------------------------
    // setCurrentAndReturn()
    // ---------------------------------------------------------------

    @Test
    public void testSetCurrentAndReturn_SingleSegmentEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        assertEquals("", tb.setCurrentAndReturn(0));
    }

    @Test
    public void testSetCurrentAndReturn_SingleSegmentNonEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        tb.append('c');
        assertEquals("abc", tb.setCurrentAndReturn(3));
    }

    @Test
    public void testSetCurrentAndReturn_MultiSegment() {
        TextBuffer tb = primedBuffer();
        char[] big = makeSequential(1500);
        tb.append(big, 0, 1500);
        String s = tb.setCurrentAndReturn(tb.getCurrentSegmentSize());
        assertEquals(new String(big), s);
    }

    // ---------------------------------------------------------------
    // finishCurrentSegment()
    // ---------------------------------------------------------------

    @Test
    public void testFinishCurrentSegment_NormalGrowth() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a'); // segment length = MIN_SEGMENT_LEN (1000)
        char[] newSeg = tb.finishCurrentSegment();
        assertTrue(newSeg.length >= TextBuffer.MIN_SEGMENT_LEN);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegment_GrowsAndClampsAtMax() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] seg = null;
        for (int i = 0; i < 30; i++) {
            seg = tb.finishCurrentSegment();
            if (seg.length == TextBuffer.MAX_SEGMENT_LEN) break;
        }
        assertEquals(TextBuffer.MAX_SEGMENT_LEN, seg.length);
    }

    // ---------------------------------------------------------------
    // expandCurrentSegment() (no-arg)
    // ---------------------------------------------------------------

    @Test
    public void testExpandCurrentSegment_NormalGrowth() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] before = tb.getCurrentSegment();
        int oldLen = before.length;
        char[] after = tb.expandCurrentSegment();
        int expected = oldLen + (oldLen >> 1);
        if (expected > TextBuffer.MAX_SEGMENT_LEN) {
            expected = oldLen + (oldLen >> 2);
        }
        assertEquals(expected, after.length);
    }

    @Test
    public void testExpandCurrentSegment_ClampBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] seg = null;
        for (int i = 0; i < 30; i++) {
            seg = tb.finishCurrentSegment();
            if (seg.length + (seg.length >> 1) > TextBuffer.MAX_SEGMENT_LEN) break;
        }
        int oldLen = seg.length;
        int expectedNormal = oldLen + (oldLen >> 1);
        assertTrue("ต้องอยู่ในช่วงที่กระตุ้น clamp branch", expectedNormal > TextBuffer.MAX_SEGMENT_LEN);

        char[] grown = tb.expandCurrentSegment();
        int expectedClamped = oldLen + (oldLen >> 2);
        assertEquals(expectedClamped, grown.length);
    }

    // ---------------------------------------------------------------
    // expandCurrentSegment(minSize)
    // ---------------------------------------------------------------

    @Test
    public void testExpandCurrentSegmentMinSize_AlreadyBigEnough() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] curr = tb.getCurrentSegment();
        char[] result = tb.expandCurrentSegment(curr.length);
        assertSame(curr, result);
    }

    @Test
    public void testExpandCurrentSegmentMinSize_NeedsGrow() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        char[] result = tb.expandCurrentSegment(5000);
        assertEquals(5000, result.length);
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_DelegatesToContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hi there");
        assertEquals(tb.contentsAsString(), tb.toString());
    }
}
