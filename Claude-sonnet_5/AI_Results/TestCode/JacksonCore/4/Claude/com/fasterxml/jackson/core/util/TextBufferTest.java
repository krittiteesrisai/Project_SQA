package com.fasterxml.jackson.core.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.core.util.TextBuffer; // ชัดเจนตามข้อกำหนด (ซ้ำ package แต่ไม่ผิด)
import com.fasterxml.jackson.core.util.BufferRecycler;

public class TextBufferTest {

    // ---------- helpers ----------
    private TextBuffer emptyBuf() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        return tb;
    }

    /** buffer ที่ _currentSegment ถูก init แล้ว (ปลอดภัยสำหรับ append ทั่วไป) */
    private TextBuffer initedBuf() {
        TextBuffer tb = emptyBuf();
        tb.getCurrentSegment(); // init _currentSegment length = MIN_SEGMENT_LEN(1000)
        return tb;
    }

    private static char[] rep(char c, int n) {
        char[] a = new char[n];
        Arrays.fill(a, c);
        return a;
    }

    private static String repStr(char c, int n) {
        return new String(rep(c, n));
    }

    // =========================================================
    // Fresh instance defaults
    // =========================================================
    @Test
    public void testFreshInstance_DefaultState() {
        TextBuffer tb = new TextBuffer(null);
        // ตาม field default: _inputStart=0(>=0) -> ถือว่าอยู่ใน shared mode, _inputLen=0
        assertEquals(0, tb.size());
    }

    // =========================================================
    // resetWithEmpty
    // =========================================================
    @Test
    public void testResetWithEmpty_NoSegments() {
        TextBuffer tb = emptyBuf();
        assertEquals(0, tb.size());
    }

    @Test
    public void testResetWithEmpty_WithSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 1500), 0, 1500); // trigger expand -> _hasSegments=true
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        // append ใหม่ต้องไม่มีข้อมูลเก่าหลุดมา
        tb.getCurrentSegment();
        tb.append(rep('z', 3), 0, 3);
        assertEquals("zzz", tb.contentsAsString());
    }

    // =========================================================
    // resetWithShared
    // =========================================================
    @Test
    public void testResetWithShared_Basic() {
        TextBuffer tb = emptyBuf();
        char[] buf = "abcde".toCharArray();
        tb.resetWithShared(buf, 1, 3);
        assertEquals(3, tb.size());
        assertEquals(1, tb.getTextOffset());
        assertEquals("bcd", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared_ClearsPriorSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('x', 1500), 0, 1500); // สร้าง segments
        char[] buf = "hi".toCharArray();
        tb.resetWithShared(buf, 0, 2);
        assertEquals(2, tb.size());
        assertEquals("hi", tb.contentsAsString());
    }

    // =========================================================
    // resetWithCopy
    // =========================================================
    @Test
    public void testResetWithCopy_NullCurrentSegment() {
        TextBuffer tb = new TextBuffer(null); // _currentSegment == null
        tb.resetWithCopy("hello".toCharArray(), 0, 5);
        assertEquals(5, tb.size());
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_ExistingCurrentSegment() {
        TextBuffer tb = initedBuf();
        char[] ref1 = tb.getCurrentSegment();
        tb.resetWithCopy("hello".toCharArray(), 0, 5);
        char[] ref2 = tb.getCurrentSegment();
        assertSame(ref1, ref2); // ไม่ควรถูก realloc เพราะพอดี
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_WithPriorSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('m', 1500), 0, 1500); // segments
        tb.resetWithCopy("ab".toCharArray(), 0, 2);
        assertEquals(2, tb.size());
        assertEquals("ab", tb.contentsAsString());
    }

    // =========================================================
    // resetWithString
    // =========================================================
    @Test
    public void testResetWithString_Basic() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("hello");
        assertEquals(5, tb.size());
        assertEquals("hello", tb.contentsAsString());
        assertFalse(tb.hasTextAsCharacters());
    }

    @Test
    public void testResetWithString_ClearsPriorSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('q', 1500), 0, 1500);
        tb.resetWithString("hi");
        assertEquals(2, tb.size());
    }

    // =========================================================
    // releaseBuffers
    // =========================================================
    @Test
    public void testReleaseBuffers_NullAllocator() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 5), 0, 5);
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_AllocatorNullCurrentSegment() {
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        // _currentSegment ยังเป็น null -> if(_currentSegment!=null) ทั้งบล็อกถูกข้าม
        // หมายเหตุ: กรณีนี้ resetWithEmpty() จะไม่ถูกเรียกเลย (สังเกตจาก source ตรง ๆ)
        tb.releaseBuffers(); // ต้องไม่ throw exception
        assertTrue(true);
    }

    @Test
    public void testReleaseBuffers_AllocatorNonNullCurrentSegment() {
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.getCurrentSegment(); // init currentSegment ผ่าน allocator
        tb.releaseBuffers();    // ต้องไม่ throw exception, และ resetWithEmpty ถูกเรียก
        assertEquals(0, tb.size());
    }

    // =========================================================
    // size()
    // =========================================================
    @Test
    public void testSize_Shared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abcd".toCharArray(), 0, 4);
        assertEquals(4, tb.size());
    }

    @Test
    public void testSize_ResultArray() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 7), 0, 7);
        char[] arr = tb.contentsAsArray();
        assertEquals(arr.length, tb.size());
    }

    @Test
    public void testSize_ResultString() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("hello");
        assertEquals(5, tb.size());
    }

    @Test
    public void testSize_SegmentedEmpty() {
        TextBuffer tb = emptyBuf();
        assertEquals(0, tb.size());
    }

    @Test
    public void testSize_SegmentedNonEmpty() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 9), 0, 9);
        assertEquals(9, tb.size());
    }

    // =========================================================
    // getTextOffset
    // =========================================================
    @Test
    public void testGetTextOffset_Shared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abcde".toCharArray(), 3, 2);
        assertEquals(3, tb.getTextOffset());
    }

    @Test
    public void testGetTextOffset_NotShared() {
        TextBuffer tb = emptyBuf();
        assertEquals(0, tb.getTextOffset());
    }

    // =========================================================
    // hasTextAsCharacters
    // =========================================================
    @Test
    public void testHasTextAsCharacters_Shared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("ab".toCharArray(), 0, 2);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultArrayOnly() {
        TextBuffer tb = initedBuf();
        tb.append(rep('x', 1500), 0, 1500); // multi-segment
        tb.contentsAsArray(); // set _resultArray, resultString ยังเป็น null
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultStringOnly() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("abc"); // resultArray = null ตาม resetWithString
        assertFalse(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_SegmentedDefault() {
        TextBuffer tb = emptyBuf(); // ไม่มี shared/array/string
        assertTrue(tb.hasTextAsCharacters());
    }

    // =========================================================
    // getTextBuffer
    // =========================================================
    @Test
    public void testGetTextBuffer_Shared() {
        TextBuffer tb = emptyBuf();
        char[] buf = "abcd".toCharArray();
        tb.resetWithShared(buf, 0, 4);
        assertSame(buf, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_ResultArray() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 5), 0, 5);
        char[] arr = tb.contentsAsArray();
        assertSame(arr, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_ResultString() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("hello");
        assertArrayEquals("hello".toCharArray(), tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_SingleSegment() {
        TextBuffer tb = initedBuf();
        char[] curr = tb.getCurrentSegment();
        assertSame(curr, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_MultipleSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('b', 2600), 0, 2600);
        assertEquals(2600, tb.getTextBuffer().length); // ผ่าน contentsAsArray()
    }

    @Test
    public void testGetTextBuffer_EmptyFreshReturnsNull() {
        // กรณี null-safety: ไม่เคยเรียก getCurrentSegment/append เลย
        TextBuffer tb = emptyBuf();
        assertNull(tb.getTextBuffer());
    }

    // =========================================================
    // contentsAsString
    // =========================================================
    @Test
    public void testContentsAsString_CachedResultString() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("cached");
        assertSame(tb.contentsAsString(), tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_FromResultArray() {
        TextBuffer tb = initedBuf();
        tb.append(rep('c', 4), 0, 4);
        tb.contentsAsArray(); // set _resultArray
        assertEquals("cccc", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SharedEmpty() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abc".toCharArray(), 0, 0);
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SharedNonEmpty() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abcde".toCharArray(), 1, 3);
        assertEquals("bcd", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SingleSegmentEmpty() {
        TextBuffer tb = emptyBuf(); // ไม่ append เลย, _currentSegment เป็น null ด้วย
        assertEquals("", tb.contentsAsString()); // ต้องไม่ NPE (currLen==0 shortcut)
    }

    @Test
    public void testContentsAsString_SingleSegmentNonEmpty() {
        TextBuffer tb = initedBuf();
        tb.append(rep('s', 10), 0, 10);
        assertEquals(repStr('s', 10), tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_MultipleSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('m', 2600), 0, 2600);
        assertEquals(repStr('m', 2600), tb.contentsAsString());
    }

    // =========================================================
    // contentsAsArray
    // =========================================================
    @Test
    public void testContentsAsArray_Empty() {
        TextBuffer tb = emptyBuf();
        assertEquals(0, tb.contentsAsArray().length);
    }

    @Test
    public void testContentsAsArray_Cached() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 5), 0, 5);
        char[] a1 = tb.contentsAsArray();
        char[] a2 = tb.contentsAsArray();
        assertSame(a1, a2);
    }

    @Test
    public void testContentsAsArray_FromResultString() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("abc");
        assertArrayEquals("abc".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void testContentsAsArray_SharedEmpty() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abc".toCharArray(), 0, 0);
        assertEquals(0, tb.contentsAsArray().length);
    }

    @Test
    public void testContentsAsArray_SharedStartZero() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abcd".toCharArray(), 0, 3);
        assertArrayEquals(new char[]{'a','b','c'}, tb.contentsAsArray());
    }

    @Test
    public void testContentsAsArray_SharedStartNonZero() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("abcde".toCharArray(), 2, 3);
        assertArrayEquals(new char[]{'c','d','e'}, tb.contentsAsArray());
    }

    @Test
    public void testContentsAsArray_MultipleSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('z', 2600), 0, 2600);
        assertArrayEquals(rep('z', 2600), tb.contentsAsArray());
    }

    // =========================================================
    // contentsAsDecimal
    // =========================================================
    @Test
    public void testContentsAsDecimal_ResultArray() {
        TextBuffer tb = initedBuf();
        tb.append("99".toCharArray(), 0, 2);
        tb.contentsAsArray(); // set _resultArray -> priority branch
        assertEquals(new BigDecimal("99"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_Shared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("42.5".toCharArray(), 0, 4);
        assertEquals(new BigDecimal("42.5"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_SingleSegment() {
        TextBuffer tb = initedBuf();
        tb.append("123.45", 0, 6);
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_MultipleSegments() {
        TextBuffer tb = initedBuf();
        char[] digits = rep('7', 2000);
        tb.append(digits, 0, 2000);
        assertEquals(new BigDecimal(new String(digits)), tb.contentsAsDecimal());
    }

    // =========================================================
    // contentsAsDouble
    // =========================================================
    @Test
    public void testContentsAsDouble() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("3.14");
        assertEquals(3.14, tb.contentsAsDouble(), 0.0001);
    }

    // =========================================================
    // ensureNotShared / unshare (private, ทดสอบผ่าน public API)
    // =========================================================
    @Test
    public void testEnsureNotShared_NotSharedNoOp() {
        TextBuffer tb = emptyBuf();
        tb.ensureNotShared(); // ไม่ shared -> ไม่ทำอะไร
        assertEquals(0, tb.size());
    }

    @Test
    public void testUnshare_CurrentNull() {
        TextBuffer tb = emptyBuf(); // _currentSegment == null
        tb.resetWithShared("hello".toCharArray(), 0, 5);
        tb.ensureNotShared(); // curr==null -> realloc branch
        assertEquals(5, tb.getCurrentSegmentSize());
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testUnshare_CurrentTooSmall() {
        TextBuffer tb = initedBuf(); // currentSegment length=1000
        tb.resetWithShared(rep('a', 2000), 0, 2000); // needed=2016 > 1000
        tb.ensureNotShared();
        assertEquals(2000, tb.getCurrentSegmentSize());
        assertEquals(2016, tb.getCurrentSegment().length);
    }

    @Test
    public void testUnshare_CurrentBigEnough() {
        TextBuffer tb = initedBuf(); // length=1000
        char[] ref = tb.getCurrentSegment();
        tb.resetWithShared("hi".toCharArray(), 0, 2); // needed=18 <=1000
        tb.ensureNotShared();
        assertSame(ref, tb.getCurrentSegment()); // ไม่ realloc
        assertEquals(2, tb.getCurrentSegmentSize());
    }

    @Test
    public void testUnshare_SharedLenZero() {
        TextBuffer tb = initedBuf();
        tb.resetWithShared("abc".toCharArray(), 0, 0); // sharedLen == 0
        tb.ensureNotShared();
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    // =========================================================
    // append(char)
    // =========================================================
    /**
     * FAULT-DETECTION TEST:
     * ตามซอร์สที่ให้มา append(char) ไม่ได้เช็ค (_currentSegment == null)
     * ก่อนอ่าน curr.length ถ้าเรียกทันทีหลัง resetWithEmpty() (โดยไม่เรียก
     * getCurrentSegment()/resetWithCopy() มาก่อน) จะเกิด NullPointerException
     * ทั้งที่ตามสัญญาการใช้งานทั่วไปควร append ได้สำเร็จ -> เทสนี้คาดหวัง
     * behavior ที่ถูกต้อง (จับ fault ได้จริงถ้าซอร์สยังมีบั๊กนี้)
     */
    @Test
    public void testAppendChar_DirectOnFreshBuffer_FaultCheck() {
        TextBuffer tb = emptyBuf();
        tb.append('x');
        assertEquals("x", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_RoomAvailable() {
        TextBuffer tb = initedBuf();
        tb.append('a');
        assertEquals(1, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendChar_TriggersExpand() {
        TextBuffer tb = initedBuf();
        tb.setCurrentLength(1000); // จำลองเต็มพอดี (length ของ segment=1000)
        tb.append('!');
        assertEquals(1, tb.getCurrentSegmentSize()); // reset เป็น0 แล้วเพิ่ม1 จาก expand()
        assertEquals(1001, tb.size());
    }

    @Test
    public void testAppendChar_FromShared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("hello".toCharArray(), 0, 5);
        tb.append('!');
        assertEquals("hello!", tb.contentsAsString());
    }

    // =========================================================
    // append(char[], start, len)
    // =========================================================
    @Test
    public void testAppendCharArray_DirectOnFreshBuffer_FaultCheck() {
        // เช่นเดียวกับ append(char): ไม่มีการเช็ค curr==null -> คาดหวังทำงานถูกต้อง
        TextBuffer tb = emptyBuf();
        tb.append("hi".toCharArray(), 0, 2);
        assertEquals("hi", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_ZeroLength() {
        TextBuffer tb = initedBuf();
        tb.append("abc".toCharArray(), 0, 0);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendCharArray_RoomAvailable() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 10), 0, 10);
        assertEquals(10, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendCharArray_ExactFit() {
        TextBuffer tb = initedBuf();
        tb.append(rep('b', 1000), 0, 1000); // max==len พอดี
        assertEquals(1000, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendCharArray_PartialThenSingleExpand() {
        TextBuffer tb = initedBuf();
        tb.append(rep('a', 990), 0, 990); // เติมจนเหลือที่ 10
        tb.append(rep('b', 20), 0, 20);   // เกิน -> expand 1 ครั้ง (do-while วนรอบเดียว)
        assertEquals(1010, tb.size());
        assertEquals(repStr('a', 990) + repStr('b', 20), tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_HugeMultipleExpand() {
        TextBuffer tb = initedBuf();
        tb.append(rep('c', 2600), 0, 2600); // do-while วนหลายรอบ
        assertEquals(2600, tb.size());
        assertEquals(repStr('c', 2600), tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_FromShared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("ab".toCharArray(), 0, 2);
        tb.append("cd".toCharArray(), 0, 2);
        assertEquals("abcd", tb.contentsAsString());
    }

    // =========================================================
    // append(String, offset, len)
    // =========================================================
    @Test
    public void testAppendString_DirectOnFreshBuffer_FaultCheck() {
        TextBuffer tb = emptyBuf();
        tb.append("yo", 0, 2);
        assertEquals("yo", tb.contentsAsString());
    }

    @Test
    public void testAppendString_ZeroLength() {
        TextBuffer tb = initedBuf();
        tb.append("abc", 0, 0);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendString_RoomAvailable() {
        TextBuffer tb = initedBuf();
        tb.append("hello", 0, 5);
        assertEquals(5, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendString_PartialThenSingleExpand() {
        TextBuffer tb = initedBuf();
        tb.append(repStr('a', 990), 0, 990);
        tb.append(repStr('b', 20), 0, 20);
        assertEquals(1010, tb.size());
    }

    @Test
    public void testAppendString_HugeMultipleExpand() {
        TextBuffer tb = initedBuf();
        String s = repStr('d', 2600);
        tb.append(s, 0, 2600);
        assertEquals(2600, tb.size());
        assertEquals(s, tb.contentsAsString());
    }

    @Test
    public void testAppendString_FromShared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("ab".toCharArray(), 0, 2);
        tb.append("cd", 0, 2);
        assertEquals("abcd", tb.contentsAsString());
    }

    // =========================================================
    // getCurrentSegment
    // =========================================================
    @Test
    public void testGetCurrentSegment_NullCurrent() {
        TextBuffer tb = emptyBuf();
        char[] curr = tb.getCurrentSegment();
        assertNotNull(curr);
        assertEquals(TextBuffer.MIN_SEGMENT_LEN, curr.length);
    }

    @Test
    public void testGetCurrentSegment_RoomAvailable() {
        TextBuffer tb = initedBuf();
        char[] ref = tb.getCurrentSegment();
        tb.setCurrentLength(5);
        char[] ref2 = tb.getCurrentSegment(); // ยังมีที่เหลือ ไม่ expand
        assertSame(ref, ref2);
    }

    @Test
    public void testGetCurrentSegment_NeedsExpand() {
        TextBuffer tb = initedBuf();
        tb.setCurrentLength(1000); // เต็มพอดี (>= length)
        char[] curr = tb.getCurrentSegment(); // ต้อง expand
        assertEquals(1500, curr.length);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testGetCurrentSegment_FromShared() {
        TextBuffer tb = emptyBuf();
        tb.resetWithShared("hello".toCharArray(), 0, 5);
        tb.getCurrentSegment(); // trigger unshare(1)
        assertEquals(5, tb.getCurrentSegmentSize());
    }

    // =========================================================
    // emptyAndGetCurrentSegment
    // =========================================================
    @Test
    public void testEmptyAndGetCurrentSegment_NullCurrent() {
        TextBuffer tb = new TextBuffer(null); // never used
        char[] curr = tb.emptyAndGetCurrentSegment();
        assertNotNull(curr);
        assertEquals(TextBuffer.MIN_SEGMENT_LEN, curr.length);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment_ExistingCurrent() {
        TextBuffer tb = initedBuf();
        char[] ref = tb.getCurrentSegment();
        tb.append(rep('a', 5), 0, 5);
        char[] curr = tb.emptyAndGetCurrentSegment();
        assertSame(ref, curr); // reuse array เดิม
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment_ClearsSegments() {
        TextBuffer tb = initedBuf();
        tb.append(rep('x', 1500), 0, 1500); // สร้าง segments
        tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.size());
        tb.append(rep('y', 3), 0, 3);
        assertEquals("yyy", tb.contentsAsString()); // ไม่มีข้อมูลเก่าหลุดมา
    }

    // =========================================================
    // getCurrentSegmentSize / setCurrentLength
    // =========================================================
    @Test
    public void testGetSetCurrentSegmentSize() {
        TextBuffer tb = initedBuf();
        tb.setCurrentLength(0);
        assertEquals(0, tb.getCurrentSegmentSize());
        tb.setCurrentLength(500);
        assertEquals(500, tb.getCurrentSegmentSize());
    }

    // =========================================================
    // finishCurrentSegment
    // =========================================================
    @Test
    public void testFinishCurrentSegment_FirstCall() {
        TextBuffer tb = initedBuf(); // curr length=1000
        char[] next = tb.finishCurrentSegment();
        assertEquals(1500, next.length); // 1000 + 1000/2
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegment_ClampedToMax() {
        TextBuffer tb = initedBuf();
        char[] curr = tb.getCurrentSegment();
        int guard = 0;
        while (curr.length < TextBuffer.MAX_SEGMENT_LEN && guard < 50) {
            curr = tb.finishCurrentSegment();
            guard++;
        }
        assertEquals(TextBuffer.MAX_SEGMENT_LEN, curr.length);
        // เรียกอีกครั้ง ต้องยังคงที่ MAX (คลุมกรณี newLen > MAX ถูก clamp ซ้ำ)
        char[] again = tb.finishCurrentSegment();
        assertEquals(TextBuffer.MAX_SEGMENT_LEN, again.length);
    }

    // =========================================================
    // expandCurrentSegment()
    // =========================================================
    @Test
    public void testExpandCurrentSegment_NormalGrowth() {
        TextBuffer tb = initedBuf();
        tb.finishCurrentSegment(); // curr length = 1500
        char[] expanded = tb.expandCurrentSegment();
        assertEquals(2250, expanded.length); // 1500 + 750
    }

    @Test
    public void testExpandCurrentSegment_AtMax() {
        TextBuffer tb = initedBuf();
        char[] curr = tb.getCurrentSegment();
        int guard = 0;
        while (curr.length < TextBuffer.MAX_SEGMENT_LEN && guard < 50) {
            curr = tb.finishCurrentSegment();
            guard++;
        }
        assertEquals(TextBuffer.MAX_SEGMENT_LEN, curr.length);
        char[] expanded = tb.expandCurrentSegment();
        assertEquals(TextBuffer.MAX_SEGMENT_LEN + 1, expanded.length);
    }

    // =========================================================
    // expandCurrentSegment(int minSize)
    // =========================================================
    @Test
    public void testExpandCurrentSegmentMinSize_AlreadyEnough() {
        TextBuffer tb = initedBuf();
        char[] ref = tb.getCurrentSegment(); // length=1000
        char[] result = tb.expandCurrentSegment(500);
        assertSame(ref, result);
        assertEquals(1000, result.length);
    }

    @Test
    public void testExpandCurrentSegmentMinSize_NeedsGrow() {
        TextBuffer tb = initedBuf();
        char[] ref = tb.getCurrentSegment();
        char[] result = tb.expandCurrentSegment(2000);
        assertNotSame(ref, result);
        assertEquals(2000, result.length);
    }

    // =========================================================
    // toString
    // =========================================================
    @Test
    public void testToString_DelegatesToContentsAsString() {
        TextBuffer tb = emptyBuf();
        tb.resetWithString("abc");
        assertEquals(tb.contentsAsString(), tb.toString());
    }
}
