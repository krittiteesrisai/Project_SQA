# JUnit 4 Test Suite: IOContextTest

## การวิเคราะห์ Branch/Condition ในซอร์สโค้ด

จากการวิเคราะห์ IOContext.java พบ branch หลักดังนี้:

1. **`_verifyAlloc(buffer)`**: `if (buffer != null) throw ...` — ใช้ในทุก allocXxx() method (12 จุดเรียก)
2. **`_verifyRelease(byte[]/char[])`**: `if ((toRelease != src) && (toRelease.length <= src.length)) throw ...` — เป็น compound condition ที่ต้องทดสอบทั้ง 4 กรณี (true/true, true/false, false/*)
3. **`if (buf != null)`** ในทุก releaseXxx() method — ต้องทดสอบทั้ง null และ non-null

## โค้ดทดสอบ

```java
package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

/**
 * Unit tests for {@link IOContext}.
 * Target: JacksonCore Defects4J bug id 14b
 */
public class IOContextTest {

    private BufferRecycler recycler;
    private IOContext ctx;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        ctx = new IOContext(recycler, "source", true);
    }

    // =====================================================================
    // Constructor / basic getters
    // =====================================================================

    @Test
    public void testConstructorAndGetters_managedTrue() {
        Object src = new Object();
        IOContext c = new IOContext(recycler, src, true);
        assertSame(src, c.getSourceReference());
        assertTrue(c.isResourceManaged());
        assertNull(c.getEncoding()); // encoding not set yet -> default null
    }

    @Test
    public void testConstructorAndGetters_managedFalse() {
        IOContext c = new IOContext(recycler, null, false);
        assertNull(c.getSourceReference());
        assertFalse(c.isResourceManaged());
    }

    @Test
    public void testSetEncoding() {
        ctx.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, ctx.getEncoding());
    }

    @Test
    public void testWithEncoding_returnsSameInstanceAndSetsField() {
        IOContext returned = ctx.withEncoding(JsonEncoding.UTF16_BE);
        assertSame(ctx, returned);
        assertEquals(JsonEncoding.UTF16_BE, ctx.getEncoding());
    }

    @Test
    public void testConstructTextBuffer_notNull() {
        TextBuffer tb = ctx.constructTextBuffer();
        assertNotNull(tb);
    }

    // =====================================================================
    // allocReadIOBuffer()
    // =====================================================================

    @Test
    public void testAllocReadIOBuffer_firstCallSucceeds() {
        byte[] buf = ctx.allocReadIOBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBuffer_secondCallThrows() {
        ctx.allocReadIOBuffer();
        ctx.allocReadIOBuffer(); // _verifyAlloc: buffer != null -> throw
    }

    @Test
    public void testAllocReadIOBufferWithMinSize_firstCallSucceeds() {
        byte[] buf = ctx.allocReadIOBuffer(5000);
        assertNotNull(buf);
        assertTrue(buf.length >= 5000);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferWithMinSize_secondCallThrows() {
        ctx.allocReadIOBuffer(100);
        ctx.allocReadIOBuffer(200);
    }

    // =====================================================================
    // allocWriteEncodingBuffer()
    // =====================================================================

    @Test
    public void testAllocWriteEncodingBuffer_firstCallSucceeds() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBuffer_secondCallThrows() {
        ctx.allocWriteEncodingBuffer();
        ctx.allocWriteEncodingBuffer();
    }

    @Test
    public void testAllocWriteEncodingBufferWithMinSize_firstCallSucceeds() {
        byte[] buf = ctx.allocWriteEncodingBuffer(8000);
        assertNotNull(buf);
        assertTrue(buf.length >= 8000);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferWithMinSize_secondCallThrows() {
        ctx.allocWriteEncodingBuffer(100);
        ctx.allocWriteEncodingBuffer(200);
    }

    // =====================================================================
    // allocBase64Buffer()
    // =====================================================================

    @Test
    public void testAllocBase64Buffer_firstCallSucceeds() {
        byte[] buf = ctx.allocBase64Buffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64Buffer_secondCallThrows() {
        ctx.allocBase64Buffer();
        ctx.allocBase64Buffer();
    }

    // =====================================================================
    // allocTokenBuffer()
    // =====================================================================

    @Test
    public void testAllocTokenBuffer_firstCallSucceeds() {
        char[] buf = ctx.allocTokenBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBuffer_secondCallThrows() {
        ctx.allocTokenBuffer();
        ctx.allocTokenBuffer();
    }

    @Test
    public void testAllocTokenBufferWithMinSize_firstCallSucceeds() {
        char[] buf = ctx.allocTokenBuffer(3000);
        assertNotNull(buf);
        assertTrue(buf.length >= 3000);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferWithMinSize_secondCallThrows() {
        ctx.allocTokenBuffer(100);
        ctx.allocTokenBuffer(200);
    }

    // =====================================================================
    // allocConcatBuffer()
    // =====================================================================

    @Test
    public void testAllocConcatBuffer_firstCallSucceeds() {
        char[] buf = ctx.allocConcatBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBuffer_secondCallThrows() {
        ctx.allocConcatBuffer();
        ctx.allocConcatBuffer();
    }

    // =====================================================================
    // allocNameCopyBuffer(int)
    // =====================================================================

    @Test
    public void testAllocNameCopyBuffer_firstCallSucceeds() {
        char[] buf = ctx.allocNameCopyBuffer(64);
        assertNotNull(buf);
        assertTrue(buf.length >= 64);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBuffer_secondCallThrows() {
        ctx.allocNameCopyBuffer(64);
        ctx.allocNameCopyBuffer(128);
    }

    // =====================================================================
    // releaseReadIOBuffer(byte[])
    // =====================================================================

    @Test
    public void testReleaseReadIOBuffer_null_noException() {
        // buf == null -> outer if false -> no-op
        ctx.releaseReadIOBuffer(null);
    }

    @Test
    public void testReleaseReadIOBuffer_sameBuffer_success() {
        byte[] buf = ctx.allocReadIOBuffer();
        ctx.releaseReadIOBuffer(buf); // toRelease == src -> condition false -> no throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseReadIOBuffer_differentEqualLength_throws() {
        byte[] buf = ctx.allocReadIOBuffer();
        byte[] other = new byte[buf.length]; // different ref, length <= src.length
        ctx.releaseReadIOBuffer(other);
    }

    @Test
    public void testReleaseReadIOBuffer_differentLargerBuffer_success() {
        byte[] buf = ctx.allocReadIOBuffer();
        byte[] larger = new byte[buf.length + 10]; // upgrade allowed (core#255)
        ctx.releaseReadIOBuffer(larger); // no throw
    }

    // NOTE: กรณีนี้แสดงพฤติกรรมที่อาจเป็น "fault" ในซอร์ส —
    // ถ้ายังไม่เคย alloc มาก่อน (_readIOBuffer == null) แล้วเรียก release ด้วย buf ที่ไม่ null
    // จะเกิด NullPointerException จาก src.length เนื่องจาก src เป็น null
    @Test(expected = NullPointerException.class)
    public void testReleaseReadIOBuffer_neverAllocated_throwsNPE() {
        byte[] buf = new byte[10];
        ctx.releaseReadIOBuffer(buf);
    }

    // =====================================================================
    // releaseWriteEncodingBuffer(byte[])
    // =====================================================================

    @Test
    public void testReleaseWriteEncodingBuffer_null_noException() {
        ctx.releaseWriteEncodingBuffer(null);
    }

    @Test
    public void testReleaseWriteEncodingBuffer_sameBuffer_success() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        ctx.releaseWriteEncodingBuffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWriteEncodingBuffer_differentEqualLength_throws() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        byte[] other = new byte[buf.length];
        ctx.releaseWriteEncodingBuffer(other);
    }

    @Test
    public void testReleaseWriteEncodingBuffer_differentLargerBuffer_success() {
        byte[] buf = ctx.allocWriteEncodingBuffer();
        byte[] larger = new byte[buf.length + 10];
        ctx.releaseWriteEncodingBuffer(larger);
    }

    // =====================================================================
    // releaseBase64Buffer(byte[])
    // =====================================================================

    @Test
    public void testReleaseBase64Buffer_null_noException() {
        ctx.releaseBase64Buffer(null);
    }

    @Test
    public void testReleaseBase64Buffer_sameBuffer_success() {
        byte[] buf = ctx.allocBase64Buffer();
        ctx.releaseBase64Buffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseBase64Buffer_differentEqualLength_throws() {
        byte[] buf = ctx.allocBase64Buffer();
        byte[] other = new byte[buf.length];
        ctx.releaseBase64Buffer(other);
    }

    @Test
    public void testReleaseBase64Buffer_differentLargerBuffer_success() {
        byte[] buf = ctx.allocBase64Buffer();
        byte[] larger = new byte[buf.length + 10];
        ctx.releaseBase64Buffer(larger);
    }

    // =====================================================================
    // releaseTokenBuffer(char[])
    // =====================================================================

    @Test
    public void testReleaseTokenBuffer_null_noException() {
        ctx.releaseTokenBuffer(null);
    }

    @Test
    public void testReleaseTokenBuffer_sameBuffer_success() {
        char[] buf = ctx.allocTokenBuffer();
        ctx.releaseTokenBuffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseTokenBuffer_differentEqualLength_throws() {
        char[] buf = ctx.allocTokenBuffer();
        char[] other = new char[buf.length];
        ctx.releaseTokenBuffer(other);
    }

    @Test
    public void testReleaseTokenBuffer_differentLargerBuffer_success() {
        char[] buf = ctx.allocTokenBuffer();
        char[] larger = new char[buf.length + 10];
        ctx.releaseTokenBuffer(larger);
    }

    @Test(expected = NullPointerException.class)
    public void testReleaseTokenBuffer_neverAllocated_throwsNPE() {
        // เช่นเดียวกับ readIOBuffer แต่เป็น char[] overload ของ _verifyRelease
        char[] buf = new char[10];
        ctx.releaseTokenBuffer(buf);
    }

    // =====================================================================
    // releaseConcatBuffer(char[])
    // =====================================================================

    @Test
    public void testReleaseConcatBuffer_null_noException() {
        ctx.releaseConcatBuffer(null);
    }

    @Test
    public void testReleaseConcatBuffer_sameBuffer_success() {
        char[] buf = ctx.allocConcatBuffer();
        ctx.releaseConcatBuffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseConcatBuffer_differentEqualLength_throws() {
        char[] buf = ctx.allocConcatBuffer();
        char[] other = new char[buf.length];
        ctx.releaseConcatBuffer(other);
    }

    @Test
    public void testReleaseConcatBuffer_differentLargerBuffer_success() {
        char[] buf = ctx.allocConcatBuffer();
        char[] larger = new char[buf.length + 10];
        ctx.releaseConcatBuffer(larger);
    }

    // =====================================================================
    // releaseNameCopyBuffer(char[])
    // =====================================================================

    @Test
    public void testReleaseNameCopyBuffer_null_noException() {
        ctx.releaseNameCopyBuffer(null);
    }

    @Test
    public void testReleaseNameCopyBuffer_sameBuffer_success() {
        char[] buf = ctx.allocNameCopyBuffer(64);
        ctx.releaseNameCopyBuffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseNameCopyBuffer_differentEqualLength_throws() {
        char[] buf = ctx.allocNameCopyBuffer(64);
        char[] other = new char[buf.length];
        ctx.releaseNameCopyBuffer(other);
    }

    @Test
    public void testReleaseNameCopyBuffer_differentLargerBuffer_success() {
        char[] buf = ctx.allocNameCopyBuffer(64);
        char[] larger = new char[buf.length + 10];
        ctx.releaseNameCopyBuffer(larger);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndGetters_managedTrue/False` | Constructor field assignment, `isResourceManaged()` true/false, `getSourceReference()` null/non-null |
| `testSetEncoding`, `testWithEncoding_*` | `setEncoding()`, `withEncoding()` return value และ side-effect |
| `testConstructTextBuffer_notNull` | `constructTextBuffer()` การเรียกใช้ปกติ |
| `testAlloc*_firstCallSucceeds` (6 buffer types) | `_verifyAlloc`: branch `buffer == null` (ไม่ throw) |
| `testAlloc*_secondCallThrows` (6 buffer types + minSize variants) | `_verifyAlloc`: branch `buffer != null` → throw `IllegalStateException` |
| `testAllocReadIOBufferWithMinSize`, `testAllocWriteEncodingBufferWithMinSize`, `testAllocTokenBufferWithMinSize` | Overload `allocXxx(int minSize)` เส้นทางที่ต่างจาก no-arg |
| `testRelease*_null_noException` (6 buffer types) | `if (buf != null)` → false branch (no-op) |
| `testRelease*_sameBuffer_success` (6 buffer types) | `_verifyRelease`: `toRelease == src` → condition false (short-circuit AND) |
| `testRelease*_differentEqualLength_throws` (6 buffer types) | `_verifyRelease`: `toRelease != src` **AND** `length <= src.length` → true/true → throw `IllegalArgumentException` |
| `testRelease*_differentLargerBuffer_success` (6 buffer types) | `_verifyRelease`: `toRelease != src` **AND** `length > src.length` → true/false → no throw (upgrade case ตาม core#255) |
| `testReleaseReadIOBuffer_neverAllocated_throwsNPE`, `testReleaseTokenBuffer_neverAllocated_throwsNPE` | เคสพิเศษ: `src == null` (ยังไม่เคย alloc) แล้ว release ด้วย non-null buffer → `NullPointerException` จาก `src.length` (⚠️ เป็นพฤติกรรมที่อาจไม่ถูกดีไซน์ไว้ ควร verify กับทีมพัฒนา) |

### หมายเหตุสำคัญ
- Comment ในโค้ดทดสอบระบุชัดเจนว่ากรณี `neverAllocated_throwsNPE` เป็นพฤติกรรมที่พบจากการอ่านซอร์ส (ไม่ได้เดา) — หาก `_readIOBuffer`/`_tokenCBuffer` เป็น `null` (ยังไม่ alloc) และเรียก release ด้วย buffer ที่ไม่ null จะเกิด NPE เนื่องจาก `src.length` ถูกเรียกบน `null` reference ซึ่งอาจถือเป็น fault ที่ควรมี null-check เพิ่มใน `_verifyRelease`
- ไม่ได้ทดสอบ `BufferRecycler` เอง เนื่องจากไม่มีซอร์สโค้ดให้ในคำถาม (ใช้ constructor ปกติ `new BufferRecycler()` ตามที่มีอยู่จริงใน jackson-core)