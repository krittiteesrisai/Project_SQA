# TextBufferTest.java

```java
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.BufferRecycler;

/**
 * JUnit4 test suite for {@link TextBuffer} (Defects4J JacksonCore-1b).
 *
 * หมายเหตุ:
 * - บางเทสใช้ Reflection เพื่อ set private field (_currentSegment, _currentSize)
 *   เพื่อสร้าง boundary state ที่ยากจะสร้างผ่าน public API เพียงอย่างเดียว
 *   (white-box technique, ไม่ใช่การเดา behavior)
 * - ค่าคงที่ MIN_SEGMENT_LEN=1000, MAX_SEGMENT_LEN=0x40000(262144)
 *   ถูกใช้ตรง ๆ ตามที่ประกาศในซอร์สต้นฉบับ
 */
public class TextBufferTest {

    // ---------- reflection helper ----------
    private static void setField(TextBuffer tb, String name, Object value) throws Exception {
        Field f = TextBuffer.class.getDeclaredField(name);
        f.setAccessible(true);
        f.set(tb, value);
    }

    private static final int MIN_SEGMENT_LEN = 1000;
    private static final int MAX_SEGMENT_LEN = 0x40000;

    // =====================================================================
    // Constructor / initial state (default field values, no reset called)
    // =====================================================================

    @Test
    public void testInitialState_DefaultSharedZero() {
        // _inputStart default int = 0 -> ">=0" branch true even without explicit reset
        TextBuffer tb = new TextBuffer(null);
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
    }

    // =====================================================================
    // resetWithEmpty
    // =====================================================================

    @Test
    public void testResetWithEmpty_NoSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void testResetWithEmpty_WithSegments_ClearsThem() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(makeStr(1500), 0, 1500); // forces expand -> _hasSegments = true
        assertTrue(tb.size() > 0);

        tb.resetWithEmpty(); // must hit clearSegments() branch
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    // =====================================================================
    // resetWithShared
    // =====================================================================

    @Test
    public void testResetWithShared_Basic() {
        char[] buf = "_ABCD_".toCharArray();
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared(buf, 1, 4);

        assertEquals(4, tb.size());
        assertEquals(1, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertSame(buf, tb.getTextBuffer());
        assertEquals("ABCD", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared_ClearsExistingSegments() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(makeStr(1500), 0, 1500); // creates segments

        char[] buf = "XY".toCharArray();
        tb.resetWithShared(buf, 0, 2); // must call clearSegments()
        assertEquals(2, tb.size());
        assertEquals("XY", tb.contentsAsString());
    }

    // =====================================================================
    // resetWithCopy
    // =====================================================================

    @Test
    public void testResetWithCopy_AllocatesNewSegment_WhenNoneExists() {
        TextBuffer tb = new TextBuffer(null); // currentSegment == null, hasSegments=false
        char[] buf = "hello".toCharArray();
        tb.resetWithCopy(buf, 0, 5);
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_ClearsExistingSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(makeStr(1500), 0, 1500); // hasSegments = true

        tb.resetWithCopy("world".toCharArray(), 0, 5); // clearSegments branch
        assertEquals("world", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy_ZeroLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy(new char[0], 0, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    // =====================================================================
    // resetWithString
    // =====================================================================

    @Test
    public void testResetWithString_Basic() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hello");
        assertEquals(5, tb.size());
        assertEquals("hello", tb.contentsAsString());
        // resultArray ยังไม่ถูกสร้าง ณ จุดนี้ -> hasTextAsCharacters() ต้อง false
        assertFalse(tb.hasTextAsCharacters());
    }

    @Test
    public void testResetWithString_ClearsExistingSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(makeStr(1500), 0, 1500); // hasSegments = true

        tb.resetWithString("abc"); // clearSegments branch
        assertEquals("abc", tb.contentsAsString());
    }

    // =====================================================================
    // size()
    // =====================================================================

    @Test
    public void testSize_SharedBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("hello".toCharArray(), 0, 5);
        assertEquals(5, tb.size());
    }

    @Test
    public void testSize_ResultArrayBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("abcdef".toCharArray(), 0, 6);
        tb.contentsAsArray(); // sets _resultArray
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
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('a');
        tb.append('b');
        assertEquals(2, tb.size());
    }

    // =====================================================================
    // getTextOffset()
    // =====================================================================

    @Test
    public void testGetTextOffset_SharedAndNonShared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("hello".toCharArray(), 2, 3);
        assertEquals(2, tb.getTextOffset());

        tb.resetWithEmpty();
        assertEquals(0, tb.getTextOffset());
    }

    // =====================================================================
    // hasTextAsCharacters()
    // =====================================================================

    @Test
    public void testHasTextAsCharacters_SharedTrue() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultArrayTrue() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("abc".toCharArray(), 0, 3);
        tb.contentsAsArray();
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_ResultStringFalse() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abc");
        assertFalse(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharacters_SegmentedTrue() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('x');
        assertTrue(tb.hasTextAsCharacters());
    }

    // =====================================================================
    // getTextBuffer()
    // =====================================================================

    @Test
    public void testGetTextBuffer_SharedBranch() {
        char[] buf = "abc".toCharArray();
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared(buf, 0, 3);
        assertSame(buf, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBuffer_ResultArrayCacheBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("abc".toCharArray(), 0, 3);
        char[] arr1 = tb.contentsAsArray();
        char[] arr2 = tb.getTextBuffer();
        assertSame(arr1, arr2);
    }

    @Test
    public void testGetTextBuffer_ResultStringBranch_BuildsArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("abc");
        char[] arr = tb.getTextBuffer();
        assertArrayEquals("abc".toCharArray(), arr);
    }

    @Test
    public void testGetTextBuffer_NoSegmentsBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('a');
        tb.append('b');
        char[] result = tb.getTextBuffer();
        assertEquals('a', result[0]);
        assertEquals('b', result[1]);
    }

    @Test
    public void testGetTextBuffer_HasSegmentsBranch_UsesContentsAsArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        String s = makeStr(1500);
        tb.append(s, 0, 1500); // forces multiple segments
        char[] result = tb.getTextBuffer();
        assertEquals(1500, result.length);
        assertEquals(s, new String(result));
    }

    // =====================================================================
    // contentsAsString()
    // =====================================================================

    @Test
    public void testContentsAsString_CachedResultStringShortCircuit() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hi");
        String s1 = tb.contentsAsString();
        String s2 = tb.contentsAsString();
        assertSame(s1, s2); // cached, no rebuild
    }

    @Test
    public void testContentsAsString_FromResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("abc".toCharArray(), 0, 3);
        tb.contentsAsArray(); // sets _resultArray, _resultString still null
        assertEquals("abc", tb.contentsAsString());
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
        tb.resetWithShared("_ABC_".toCharArray(), 1, 3);
        assertEquals("ABC", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SingleSegmentEmptyCurrent() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // no append -> currLen == 0, segLen == 0
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_SingleSegmentWithContent() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('h');
        tb.append('i');
        assertEquals("hi", tb.contentsAsString());
    }

    @Test
    public void testContentsAsString_MultiSegmentCombine() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        String s = makeStr(2500); // > MIN_SEGMENT_LEN -> multi segment
        tb.append(s, 0, s.length());
        assertEquals(s, tb.contentsAsString());
    }

    // =====================================================================
    // contentsAsArray()
    // =====================================================================

    @Test
    public void testContentsAsArray_CacheAndBuild_EmptyReturnsNoChars() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // size() == 0
        char[] result = tb.contentsAsArray();
        assertEquals(0, result.length);
        assertSame(result, tb.contentsAsArray()); // cached
    }

    // =====================================================================
    // contentsAsDecimal() / contentsAsDouble()
    // =====================================================================

    @Test
    public void testContentsAsDecimal_ResultArrayBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithCopy("123.45".toCharArray(), 0, 6);
        tb.contentsAsArray();
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_SharedBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("_9.5_".toCharArray(), 1, 3);
        assertEquals(new BigDecimal("9.5"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_SingleSegmentBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append("7.25", 0, 4);
        assertEquals(new BigDecimal("7.25"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimal_MultiSegmentBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2500; i++) sb.append('1');
        sb.append(".5");
        String num = sb.toString();
        tb.append(num, 0, num.length());
        assertEquals(new BigDecimal(num), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDouble() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("3.14");
        assertEquals(3.14, tb.contentsAsDouble(), 0.0001);
    }

    // =====================================================================
    // ensureNotShared()
    // =====================================================================

    @Test
    public void testEnsureNotShared_SharedBecomesUnshared() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abc".toCharArray(), 0, 3);
        tb.ensureNotShared();
        assertEquals(0, tb.getTextOffset()); // no longer shared
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testEnsureNotShared_NotSharedNoOp() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.ensureNotShared(); // should do nothing, no exception
        assertEquals(0, tb.size());
    }

    // =====================================================================
    // append(char)
    // =====================================================================

    @Test
    public void testAppendChar_ShareBranchUnshares() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("ab".toCharArray(), 0, 2);
        tb.append('c');
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_RoomAvailable() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('x');
        assertEquals("x", tb.contentsAsString());
    }

    @Test
    public void testAppendChar_ExpandBranch() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] tiny = new char[2];
        tiny[0] = 'A';
        tiny[1] = 'B';
        setField(tb, "_currentSegment", tiny);
        setField(tb, "_currentSize", 2); // full -> forces expand(1)
        tb.append('C');
        assertEquals("ABC", tb.contentsAsString());
    }

    @Test(expected = NullPointerException.class)
    public void testAppendChar_NoCurrentSegment_DocumentedEdgeCase() {
        // จากการวิเคราะห์ source: หลัง resetWithEmpty() แล้วไม่เคย
        // ensure current segment (เช่นผ่าน getCurrentSegment()/resetWithCopy)
        // การเรียก append() ตรง ๆ จะทำให้ curr == null -> curr.length ทำให้ NPE
        // นี่เป็น behavior จริงที่สืบมาจากการอ่านซอร์ส ไม่ได้เดา
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.append('x');
    }

    // =====================================================================
    // append(char[], start, len)
    // =====================================================================

    @Test
    public void testAppendCharArray_SharedBranchUnshares() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("_ABCD_".toCharArray(), 1, 4);
        tb.append(new char[] { 'E', 'F' }, 0, 2);
        assertEquals("ABCDEF", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_RoomEnough() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(new char[] { 'a', 'b', 'c' }, 0, 3);
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_ZeroLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append(new char[] { 'a', 'b', 'c' }, 0, 3);
        tb.append(new char[0], 0, 0); // no-op, boundary
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_PartialThenSingleExpand() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] small = new char[10];
        Arrays.fill(small, 0, 8, 'X');
        setField(tb, "_currentSegment", small);
        setField(tb, "_currentSize", 8); // room = 2

        char[] toAppend = { 'a', 'b', 'c', 'd', 'e' }; // len 5 > room(2)
        tb.append(toAppend, 0, 5);

        assertEquals("XXXXXXXXabcde", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray_MultipleExpandIterations() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // length = MIN_SEGMENT_LEN (1000)

        int totalLen = 300000; // > MAX_SEGMENT_LEN -> forces >=2 do-while iterations
        char[] big = new char[totalLen];
        Arrays.fill(big, 'x');
        tb.append(big, 0, totalLen);

        assertEquals(totalLen, tb.size());
        String result = tb.contentsAsString();
        assertEquals(totalLen, result.length());
        assertEquals('x', result.charAt(0));
        assertEquals('x', result.charAt(totalLen - 1));
    }

    // =====================================================================
    // append(String, offset, len)
    // =====================================================================

    @Test
    public void testAppendString_SharedBranchUnshares() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("_ABCD_".toCharArray(), 1, 4);
        tb.append("EF", 0, 2);
        assertEquals("ABCDEF", tb.contentsAsString());
    }

    @Test
    public void testAppendString_RoomEnough() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append("abc", 0, 3);
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testAppendString_PartialThenExpand() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] small = new char[10];
        Arrays.fill(small, 0, 8, 'Y');
        setField(tb, "_currentSegment", small);
        setField(tb, "_currentSize", 8); // room = 2

        tb.append("abcde", 0, 5); // len 5 > room(2)

        assertEquals("YYYYYYYYabcde", tb.contentsAsString());
    }

    // =====================================================================
    // getCurrentSegment()
    // =====================================================================

    @Test
    public void testGetCurrentSegment_SharedUnshares() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("abcd".toCharArray(), 0, 4);
        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
        assertEquals(4, tb.getCurrentSegmentSize());
    }

    @Test
    public void testGetCurrentSegment_NullAllocatesNew() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
        assertEquals(MIN_SEGMENT_LEN, seg.length);
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testGetCurrentSegment_ExpandWhenFull() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] full = new char[5];
        setField(tb, "_currentSegment", full);
        setField(tb, "_currentSize", 5); // full -> expand(1) branch

        char[] seg = tb.getCurrentSegment();
        assertEquals(7, seg.length); // 5 + max(2,1) = 7
        assertEquals(0, tb.getCurrentSegmentSize()); // expand() resets currentSize
    }

    @Test
    public void testGetCurrentSegment_ReturnsExistingWhenRoomAvailable() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        char[] arr = new char[10];
        setField(tb, "_currentSegment", arr);
        setField(tb, "_currentSize", 3); // room available

        char[] seg = tb.getCurrentSegment();
        assertSame(arr, seg);
        assertEquals(3, tb.getCurrentSegmentSize());
    }

    // =====================================================================
    // emptyAndGetCurrentSegment()
    // =====================================================================

    @Test
    public void testEmptyAndGetCurrentSegment_NullBranch() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(MIN_SEGMENT_LEN, seg.length);
        assertEquals(0, tb.size());
    }

    @Test
    public void testEmptyAndGetCurrentSegment_ExistingBranch() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        String s = makeStr(1500);
        tb.append(s, 0, 1500); // forces hasSegments = true

        char[] seg = tb.emptyAndGetCurrentSegment(); // must clearSegments()
        assertNotNull(seg);
        assertEquals(0, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    // =====================================================================
    // getCurrentSegmentSize() / setCurrentLength()
    // =====================================================================

    @Test
    public void testGetSetCurrentLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.setCurrentLength(5);
        assertEquals(5, tb.getCurrentSegmentSize());
    }

    // =====================================================================
    // finishCurrentSegment()
    // =====================================================================

    @Test
    public void testFinishCurrentSegment_GrowsAndResets() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // length = 1000
        char[] next = tb.finishCurrentSegment();
        assertEquals(1500, next.length); // 1000 + (1000>>1)=1500
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    // =====================================================================
    // expandCurrentSegment()
    // =====================================================================

    @Test
    public void testExpandCurrentSegment_NormalGrowth() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // length 1000
        char[] result = tb.expandCurrentSegment();
        assertEquals(1500, result.length); // 1000 + 500
    }

    @Test
    public void testExpandCurrentSegment_CappedGrowth() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        setField(tb, "_currentSegment", new char[200000]);
        char[] result = tb.expandCurrentSegment();
        // 200000 + 100000 = 300000 > MAX -> capped
        assertEquals(MAX_SEGMENT_LEN, result.length);
    }

    @Test
    public void testExpandCurrentSegment_AtMaxBoundary() throws Exception {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        setField(tb, "_currentSegment", new char[MAX_SEGMENT_LEN]);
        char[] result = tb.expandCurrentSegment();
        assertEquals(MAX_SEGMENT_LEN + 1, result.length);
    }

    // =====================================================================
    // toString()
    // =====================================================================

    @Test
    public void testToString_DelegatesToContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("hello");
        assertEquals(tb.contentsAsString(), tb.toString());
    }

    // =====================================================================
    // releaseBuffers()
    // =====================================================================

    @Test
    public void testReleaseBuffers_NullAllocator() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();
        tb.getCurrentSegment();
        tb.append('a');
        tb.releaseBuffers();
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_WithAllocator_NoCurrentSegment() {
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.releaseBuffers(); // _currentSegment == null -> inner if skipped, no exception
        assertEquals(0, tb.size());
    }

    @Test
    public void testReleaseBuffers_WithAllocator_WithCurrentSegment() {
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.resetWithEmpty();
        tb.getCurrentSegment(); // allocate a currentSegment via allocator
        tb.releaseBuffers();
        assertEquals(0, tb.size());
        // ต้องใช้งานต่อได้ตามปกติหลัง release
        char[] seg = tb.getCurrentSegment();
        assertNotNull(seg);
    }

    // ---------- helper ----------
    private static String makeStr(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        return sb.toString();
    }
}
```

---

## สรุปตาราง Method/Branch Coverage

| กลุ่มเมธอดเป้าหมาย | เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor / initial state | testInitialState_DefaultSharedZero | ค่า default `_inputStart>=0` โดยไม่มี reset |
| resetWithEmpty | testResetWithEmpty_NoSegments, testResetWithEmpty_WithSegments_ClearsThem | `_hasSegments` true/false |
| resetWithShared | testResetWithShared_Basic, testResetWithShared_ClearsExistingSegments | `_hasSegments` true/false, offset/len ตั้งค่าถูกต้อง |
| resetWithCopy | testResetWithCopy_AllocatesNewSegment_WhenNoneExists, testResetWithCopy_ClearsExistingSegments, testResetWithCopy_ZeroLength | `_hasSegments` true/false, `_currentSegment==null`, len=0 boundary |
| resetWithString | testResetWithString_Basic, testResetWithString_ClearsExistingSegments | `_hasSegments` true/false |
| size() | testSize_SharedBranch/ResultArrayBranch/ResultStringBranch/SegmentedBranch | 4 branch ของ size() ทั้งหมด |
| getTextOffset() | testGetTextOffset_SharedAndNonShared | ternary true/false |
| hasTextAsCharacters() | testHasTextAsCharacters_SharedTrue/ResultArrayTrue/ResultStringFalse/SegmentedTrue | ทุก branch (shared, resultArray, resultString, fallback) |
| getTextBuffer() | testGetTextBuffer_SharedBranch/ResultArrayCacheBranch/ResultStringBranch_BuildsArray/NoSegmentsBranch/HasSegmentsBranch_UsesContentsAsArray | 5 branch ทั้งหมด |
| contentsAsString() | testContentsAsString_CachedResultStringShortCircuit/FromResultArray/SharedEmptyLen/SharedNonEmpty/SingleSegmentEmptyCurrent/SingleSegmentWithContent/MultiSegmentCombine | cache-shortcut, resultArray, shared(len<1/len>=1), segLen==0(curr==0/curr>0), segLen>0 (loop) |
| contentsAsArray() | testContentsAsArray_CacheAndBuild_EmptyReturnsNoChars | cache branch, size<1 → NO_CHARS |
| contentsAsDecimal() | testContentsAsDecimal_ResultArrayBranch/SharedBranch/SingleSegmentBranch/MultiSegmentBranch | 4 branch ทั้งหมด |
| contentsAsDouble() | testContentsAsDouble | delegate ไป parseDouble |
| ensureNotShared() | testEnsureNotShared_SharedBecomesUnshared/NotSharedNoOp | if true/false |
| append(char) | testAppendChar_ShareBranchUnshares/RoomAvailable/ExpandBranch, testAppendChar_NoCurrentSegment_DocumentedEdgeCase | unshare-if, room-enough, expand-branch, NPE edge case (curr==null) |
| append(char[],start,len) | testAppendCharArray_SharedBranchUnshares/RoomEnough/ZeroLength/PartialThenSingleExpand/MultipleExpandIterations | unshare, max>=len, max=0 boundary, max>0 partial+1 loop, multi-loop (>MAX_SEGMENT_LEN) |
| append(String,offset,len) | testAppendString_SharedBranchUnshares/RoomEnough/PartialThenExpand | unshare, max>=len, max>0 partial+loop |
| getCurrentSegment() | testGetCurrentSegment_SharedUnshares/NullAllocatesNew/ExpandWhenFull/ReturnsExistingWhenRoomAvailable | unshare-if, curr==null, curr full→expand, room available |
| emptyAndGetCurrentSegment() | testEmptyAndGetCurrentSegment_NullBranch/ExistingBranch | curr==null vs curr!=null (+clearSegments) |
| getCurrentSegmentSize/setCurrentLength | testGetSetCurrentLength | getter/setter |
| finishCurrentSegment() | testFinishCurrentSegment_GrowsAndResets | growth formula, reset currentSize |
| expandCurrentSegment() | testExpandCurrentSegment_NormalGrowth/CappedGrowth/AtMaxBoundary | ternary `len==MAX` true/false, min() cap vs no-cap |
| toString() | testToString_DelegatesToContentsAsString | delegate |
| releaseBuffers() | testReleaseBuffers_NullAllocator/WithAllocator_NoCurrentSegment/WithAllocator_WithCurrentSegment | `_allocator==null`, allocator!=null & `_currentSegment==null`/`!=null` |

**หมายเหตุสำคัญ:** เทส `testAppendChar_NoCurrentSegment_DocumentedEdgeCase` คาด `NullPointerException` ซึ่งได้จากการไล่ตามซอร์สโค้ดจริง (`_currentSegment` ยัง `null` หลัง `resetWithEmpty()` แล้วเรียก `append()` ตรง ๆ) — เป็นข้อสังเกตเกี่ยวกับข้อจำกัดการใช้งาน API ไม่ใช่การเดา behavior