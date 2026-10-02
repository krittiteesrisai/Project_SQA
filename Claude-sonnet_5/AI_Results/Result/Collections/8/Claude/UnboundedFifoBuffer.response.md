# UnboundedFifoBufferTest.java

```java
package org.apache.commons.collections.buffer;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.BufferUnderflowException;
import org.junit.Test;

/**
 * Unit tests for {@link UnboundedFifoBuffer}
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดตามซอร์สที่ให้มา
 * ไม่มีการเดา behavior ที่ไม่มีในซอร์ส หากมีการใช้ reflection เพื่อบังคับ state
 * จะมีคอมเมนต์กำกับชัดเจนว่าเป็นการทดสอบ branch ภายในที่ปกติไม่สามารถ trigger ได้จาก public API
 */
public class UnboundedFifoBufferTest {

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_EmptyBuffer() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        assertTrue(buf.isEmpty());
        assertEquals(0, buf.size());
    }

    @Test
    public void testConstructorWithPositiveSize() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(1); // boundary: smallest valid size
        assertTrue(buf.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroSizeThrows() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeSizeThrows() {
        new UnboundedFifoBuffer(-5);
    }

    // ---------- add() tests ----------

    @Test(expected = NullPointerException.class)
    public void testAddNullThrowsNPE() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add(null);
    }

    @Test
    public void testAddSingleElement_SizeAndIsEmptyFalse() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        assertFalse(buf.isEmpty());
        assertEquals(1, buf.size());
        assertEquals("a", buf.get());
    }

    // ---------- isEmpty()/size() basic branches (tail>=head) ----------

    @Test
    public void testIsEmptyTrueInitially() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        assertTrue(buf.isEmpty());
    }

    @Test
    public void testIsEmptyFalseAfterAdd() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("x");
        assertFalse(buf.isEmpty());
    }

    // ---------- get() tests ----------

    @Test(expected = BufferUnderflowException.class)
    public void testGetOnEmptyThrows() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.get();
    }

    @Test
    public void testGetDoesNotRemove() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        assertEquals("a", buf.get());
        assertEquals(2, buf.size()); // ยืนยันว่า get() ไม่ลบ
    }

    // ---------- remove() tests ----------

    @Test(expected = BufferUnderflowException.class)
    public void testRemoveOnEmptyThrows() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.remove();
    }

    @Test
    public void testRemoveAdvancesHeadAndReturnsElement() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        Object removed = buf.remove();
        assertEquals("a", removed);
        assertEquals(1, buf.size());
        assertEquals("b", buf.get());
    }

    /**
     * ทดสอบ branch defensive "if (element != null)" ใน remove()
     * โดยปกติ branch นี้ไม่สามารถ reach ได้จาก public API เพราะ add(null) ถูกห้าม
     * จึงใช้ reflection บังคับตั้งค่า buffer[head] = null เพื่อ cover branch นี้โดยเฉพาะ
     * (คอมเมนต์กำกับตามข้อกำหนด เนื่องจากเป็นการทดสอบ internal branch ที่ไม่ได้เกิดจาก usage ปกติ)
     */
    @Test
    public void testRemove_DefensiveNullBranch_ViaReflection() throws Exception {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a"); // size = 1, head=0, tail=1

        Field bufferField = UnboundedFifoBuffer.class.getDeclaredField("buffer");
        bufferField.setAccessible(true);
        Object[] internalArray = (Object[]) bufferField.get(buf);

        Field headField = UnboundedFifoBuffer.class.getDeclaredField("head");
        headField.setAccessible(true);
        int head = headField.getInt(buf);

        // บังคับให้ buffer[head] เป็น null โดยไม่ผ่าน add()/remove() ปกติ
        internalArray[head] = null;

        Object result = buf.remove();
        assertNull(result); // element == null -> return null โดยไม่ increment head
        // เนื่องจาก head ไม่ถูก increment เมื่อ element==null, size() คำนวณจาก head/tail เดิม (ยังคงเป็น 1)
        assertEquals(1, buf.size());
    }

    // ---------- size() branch: tail < head (wrap-around) ----------

    @Test
    public void testSize_TailLessThanHead_WrapAroundBranch() {
        // ใช้ initialSize=3 -> buffer.length=4 เพื่อบังคับให้เกิด wrap-around ได้ง่าย
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(3);
        buf.add("a"); // buffer[0]=a tail=1
        buf.add("b"); // buffer[1]=b tail=2
        buf.add("c"); // buffer[2]=c tail=3
        buf.remove();  // ลบ a, head=1
        buf.add("d");  // size=2 -> ไม่ resize, buffer[3]=d, tail=increment(3)=0

        // ตอนนี้ head=1, tail=0 -> tail < head -> เข้า branch "if (tail < head)"
        assertEquals(3, buf.size()); // b,c,d
        assertFalse(buf.isEmpty());

        // ตรวจสอบลำดับข้อมูลผ่าน iterator (เพื่อยืนยันความถูกต้องของ index wrap)
        Iterator it = buf.iterator();
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    // ---------- add() resize branch + copy loop with wrap-around ----------

    @Test
    public void testAdd_ResizeTriggeredWithWrapAroundCopyLoop() {
        // initialSize=3 -> buffer.length=4
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(3);
        buf.add("a"); // tail=1
        buf.add("b"); // tail=2
        buf.add("c"); // tail=3
        buf.remove();  // head=1, size=2
        buf.add("d");  // tail=increment(3)=0 (wrap) size=3, head=1,tail=0

        // ต่อไปนี้จะ trigger resize: size()=3, size()+1=4 >= buffer.length(4) -> true
        buf.add("e");

        // ยืนยันว่า resize เกิดขึ้นจริงและข้อมูลถูก copy ถูกต้องตามลำดับ (รวม wrap ระหว่าง copy loop)
        assertEquals(4, buf.size());
        Iterator it = buf.iterator();
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("d", it.next());
        assertEquals("e", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAdd_NoResizeWhenBelowThreshold() {
        // ทดสอบ branch "size()+1 >= buffer.length" เป็น false (กรณีปกติไม่ resize)
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(10); // buffer.length=11
        for (int i = 0; i < 5; i++) {
            buf.add("item" + i);
        }
        assertEquals(5, buf.size());
    }

    // ---------- iterator() tests ----------

    @Test
    public void testIterator_EmptyBuffer_HasNextFalse() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        Iterator it = buf.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_HasNextAndNext_OrderCorrect() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        buf.add("c");

        Iterator it = buf.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextOnExhaustedIteratorThrows() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        Iterator it = buf.iterator();
        it.next(); // consume the only element
        it.next(); // should throw NoSuchElementException
    }

    @Test(expected = IllegalStateException.class)
    public void testIterator_RemoveWithoutNextThrowsIllegalState() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        Iterator it = buf.iterator();
        it.remove(); // lastReturnedIndex == -1
    }

    @Test
    public void testIterator_RemoveHeadElement_QuickPath() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        buf.add("c");

        Iterator it = buf.iterator();
        Object first = it.next(); // lastReturnedIndex == head
        assertEquals("a", first);

        it.remove(); // ควรเข้า branch "lastReturnedIndex == head" -> เรียก UnboundedFifoBuffer.this.remove()

        assertEquals(2, buf.size());
        assertEquals("b", buf.get());

        // ทดสอบต่อว่า iterator ยังทำงานถูกต้องหลัง remove
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
    }

    @Test(expected = IllegalStateException.class)
    public void testIterator_RemoveCalledTwiceThrowsIllegalState() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        Iterator it = buf.iterator();
        it.next();
        it.remove();
        it.remove(); // lastReturnedIndex reset to -1 หลัง remove ครั้งแรก -> throw
    }

    /**
     * ทดสอบ branch "shift loop" (lastReturnedIndex != head) และ decrement() wrap-around
     * โดยสร้าง state ที่ head/tail wrap ผ่าน buffer แล้วลบ element กลาง
     */
    @Test
    public void testIterator_RemoveMiddleElement_ShiftPathAndDecrementWrap() {
        // initialSize=3 -> buffer.length=4, สร้าง wrap-around state เดียวกับ testSize_TailLessThanHead
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(3);
        buf.add("a");
        buf.add("b");
        buf.add("c");
        buf.remove();   // head=1
        buf.add("d");   // tail wraps to 0 -> head=1, tail=0 (b,c,d)

        Iterator it = buf.iterator();
        Object b = it.next(); // index -> head(1), lastReturnedIndex=1
        assertEquals("b", b);
        Object c = it.next(); // lastReturnedIndex=2 (!=head) -> shift path จะถูกใช้เมื่อ remove()
        assertEquals("c", c);

        it.remove(); // ลบ "c": lastReturnedIndex=2 != head(1)
                      // shift loop จะย้าย d ไปทับตำแหน่ง c, tail จะ decrement (0 -> wrap เป็น length-1=3)

        assertEquals(2, buf.size()); // เหลือ b, d
        // ตรวจสอบลำดับที่เหลือผ่าน iterator ใหม่
        Iterator it2 = buf.iterator();
        assertEquals("b", it2.next());
        assertEquals("d", it2.next());
        assertFalse(it2.hasNext());

        // ตรวจสอบว่า iterator เดิมยังสามารถ iterate ต่อได้ถูกต้อง (index ถูก decrement)
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_RemoveAllElementsSequentially() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        buf.add("a");
        buf.add("b");
        buf.add("c");

        Iterator it = buf.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        assertTrue(buf.isEmpty());
        assertEquals(0, buf.size());
    }
}
```

---

# สรุปตาราง Coverage (Branch/Condition Mapping)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor_EmptyBuffer` | default constructor → เรียก `this(32)`, ตรวจ isEmpty/size initial |
| `testConstructorWithPositiveSize` | constructor(int) กรณี `initialSize > 0` (boundary=1) |
| `testConstructorWithZeroSizeThrows` | constructor(int) branch `initialSize <= 0` (boundary=0) → throw |
| `testConstructorWithNegativeSizeThrows` | constructor(int) branch `initialSize <= 0` (ค่าลบ) → throw |
| `testAddNullThrowsNPE` | add() branch `obj == null` → throw NPE |
| `testAddSingleElement_SizeAndIsEmptyFalse` | add() branch `obj != null`, path ปกติไม่ resize |
| `testIsEmptyTrueInitially` | isEmpty() → `size()==0` = true |
| `testIsEmptyFalseAfterAdd` | isEmpty() → `size()==0` = false |
| `testGetOnEmptyThrows` | get() branch `isEmpty()==true` → throw BufferUnderflowException |
| `testGetDoesNotRemove` | get() branch `isEmpty()==false` → return โดยไม่ remove |
| `testRemoveOnEmptyThrows` | remove() branch `isEmpty()==true` → throw |
| `testRemoveAdvancesHeadAndReturnsElement` | remove() branch `isEmpty()==false` และ `element != null` = true |
| `testRemove_DefensiveNullBranch_ViaReflection` | remove() branch defensive `element != null` = **false** (ใช้ reflection บังคับ, คอมเมนต์กำกับ) |
| `testSize_TailLessThanHead_WrapAroundBranch` | size() branch `tail < head` = true (wrap-around) |
| `testAdd_ResizeTriggeredWithWrapAroundCopyLoop` | add() branch `size()+1 >= buffer.length` = true, resize copy loop พร้อม `increment()` wrap |
| `testAdd_NoResizeWhenBelowThreshold` | add() branch `size()+1 >= buffer.length` = false |
| `testIterator_EmptyBuffer_HasNextFalse` | iterator.hasNext() → `index != tail` = false (ตอน empty) |
| `testIterator_HasNextAndNext_OrderCorrect` | iterator.hasNext()=true, next() branch `!hasNext()`=false (ปกติ) |
| `testIterator_NextOnExhaustedIteratorThrows` | iterator.next() branch `!hasNext()`=true → throw NoSuchElementException |
| `testIterator_RemoveWithoutNextThrowsIllegalState` | iterator.remove() branch `lastReturnedIndex == -1` = true → throw |
| `testIterator_RemoveHeadElement_QuickPath` | iterator.remove() branch `lastReturnedIndex == head` = true (quick path) |
| `testIterator_RemoveCalledTwiceThrowsIllegalState` | iterator.remove() ซ้ำ → `lastReturnedIndex==-1` หลัง remove ครั้งแรก |
| `testIterator_RemoveMiddleElement_ShiftPathAndDecrementWrap` | iterator.remove() branch `lastReturnedIndex != head` (shift loop while `i != tail`) และ `decrement()` branch `index < 0` = true (wrap) |
| `testIterator_RemoveAllElementsSequentially` | วน loop `hasNext()`/`next()`/`remove()` ซ้ำจนกว่า buffer จะ empty (ครอบคลุม loop หลายรอบ) |

**หมายเหตุ:**
- `increment()` และ `decrement()` เป็น private methods จึงถูกทดสอบทางอ้อมผ่าน public API (`add`, `remove`, `iterator`) ตามที่ระบุใน test cases ข้างต้น (โดยเฉพาะ wrap-around cases)
- `writeObject`/`readObject` (custom serialization) ไม่ได้ทดสอบตรง ๆ เนื่องจากไม่มีการระบุ requirement หรือ library เพิ่มเติมสำหรับ serialization testing ในข้อกำหนด (หากต้องการเพิ่ม สามารถต่อยอดด้วย `ObjectOutputStream`/`ObjectInputStream` แยกได้)
- Branch defensive ใน `remove()` (`element != null` = false) ไม่สามารถเกิดขึ้นได้จาก public API ตามปกติ เนื่องจาก `add(null)` ถูกป้องกันไว้แล้ว จึงใช้ reflection เพื่อ cover branch นี้พร้อมคอมเมนต์กำกับชัดเจนตามข้อกำหนด