# UnmodifiableBoundedCollectionTest.java

**หมายเหตุก่อนเริ่ม:** ซอร์สที่ให้มาอ้างอิงคลาส `BoundedCollection`, `AbstractCollectionDecorator`, `SynchronizedCollection`, `UnmodifiableIterator` ซึ่งเป็นส่วนหนึ่งของโมดูล Commons Collections 4 เดียวกัน (ไม่ได้แสดง source แต่ต้องอยู่บน classpath เพื่อให้ compile คลาสเป้าหมายได้อยู่แล้ว) จึงใช้ API สาธารณะที่ทราบแน่ชัดจาก signature ที่ปรากฏใน source (เช่น `isFull()`, `maxSize()`, `decorated()`, constructor ของ `AbstractCollectionDecorator` ที่รับ `Collection`) ส่วนพฤติกรรมที่ *ไม่* ปรากฏชัดในซอร์ส (เช่น การเช็ค null ภายใน `AbstractCollectionDecorator`) จะเขียนคอมเมนต์กำกับไว้และหลีกเลี่ยงการ assert exception type ที่เจาะจงเกินไป

```java
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.collection.AbstractCollectionDecorator;
import org.apache.commons.collections4.collection.SynchronizedCollection;
import org.apache.commons.collections4.collection.UnmodifiableBoundedCollection;

public class UnmodifiableBoundedCollectionTest {

    // ---------------------------------------------------------------
    // Test double: BoundedCollection แบบง่าย ควบคุม isFull/maxSize ได้
    // ---------------------------------------------------------------
    private static class TestBoundedCollection<E> implements BoundedCollection<E> {
        private final List<E> list = new ArrayList<E>();
        private final int maxSize;

        TestBoundedCollection(final int maxSize) {
            this.maxSize = maxSize;
        }

        public boolean isFull() {
            return list.size() >= maxSize;
        }

        public int maxSize() {
            return maxSize;
        }

        public int size() { return list.size(); }
        public boolean isEmpty() { return list.isEmpty(); }
        public boolean contains(final Object o) { return list.contains(o); }
        public Iterator<E> iterator() { return list.iterator(); }
        public Object[] toArray() { return list.toArray(); }
        public <T> T[] toArray(final T[] a) { return list.toArray(a); }
        public boolean add(final E e) { return list.add(e); }
        public boolean remove(final Object o) { return list.remove(o); }
        public boolean containsAll(final Collection<?> c) { return list.containsAll(c); }
        public boolean addAll(final Collection<? extends E> c) { return list.addAll(c); }
        public boolean removeAll(final Collection<?> c) { return list.removeAll(c); }
        public boolean retainAll(final Collection<?> c) { return list.retainAll(c); }
        public void clear() { list.clear(); }
    }

    // ---------------------------------------------------------------
    // Test double: decorator เปล่า ๆ เพื่อทดสอบ path "AbstractCollectionDecorator"
    // สมมติว่า AbstractCollectionDecorator มี constructor protected รับ Collection<E>
    // (ตาม pattern ที่ปรากฏใน constructor ของ UnmodifiableBoundedCollection เอง)
    // ---------------------------------------------------------------
    private static class TestDecorator<E> extends AbstractCollectionDecorator<E> {
        private static final long serialVersionUID = 1L;
        TestDecorator(final Collection<E> coll) {
            super(coll);
        }
    }

    private TestBoundedCollection<String> boundedColl;

    @Before
    public void setUp() {
        boundedColl = new TestBoundedCollection<String>(3);
        boundedColl.add("a");
        boundedColl.add("b");
    }

    // =================================================================
    // Factory 1: unmodifiableBoundedCollection(BoundedCollection)
    // =================================================================

    @Test
    public void testFactory1_validCollection_wrapsCorrectly() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(boundedColl);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testFactory1_null_throwsSomeException() {
        // หมายเหตุ: ซอร์สของ UnmodifiableBoundedCollection ไม่ได้ตรวจ null เอง
        // (private constructor เรียก super(coll) ตรง ๆ) พฤติกรรมเมื่อ coll เป็น null
        // ขึ้นกับ AbstractCollectionDecorator ซึ่งไม่มีใน source ที่ให้มา
        // จึงทดสอบเพียงว่ามี exception เกิดขึ้น โดยไม่ระบุ type ที่แน่นอน
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                    (BoundedCollection<String>) null);
            fail("Expected an exception when wrapping a null BoundedCollection");
        } catch (final RuntimeException e) {
            assertNotNull(e);
        }
    }

    // =================================================================
    // Factory 2: unmodifiableBoundedCollection(Collection)
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFactory2_nullCollection_throwsIAE() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
    }

    @Test
    public void testFactory2_nullCollection_hasCorrectMessage() {
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The collection must not be null", e.getMessage());
        }
    }

    @Test
    public void testFactory2_directBoundedCollection_breaksImmediately() {
        // coll instanceof BoundedCollection == true -> break ทันที (0 รอบ unwrap)
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        (Collection<String>) boundedColl);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
    }

    @Test
    public void testFactory2_notBoundedCollection_plainArrayList_throwsIAE() {
        // ไม่ใช่ BoundedCollection, ไม่ใช่ AbstractCollectionDecorator, ไม่ใช่ SynchronizedCollection
        // -> loop วิ่งครบ 1000 รอบโดยไม่มีการ unwrap แล้ว throw IAE
        final Collection<String> plain = new ArrayList<String>(); // ครอบคลุมกรณี empty ด้วย
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(plain);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The collection is not a bounded collection", e.getMessage());
        }
    }

    @Test
    public void testFactory2_notBoundedCollection_nonEmptyList_throwsIAE() {
        final Collection<String> plain = new ArrayList<String>();
        plain.add("x");
        try {
            UnmodifiableBoundedCollection.unmodifiableBoundedCollection(plain);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("The collection is not a bounded collection", e.getMessage());
        }
    }

    @Test
    public void testFactory2_wrappedInAbstractCollectionDecorator_unwrapsOnce() {
        // coll instanceof AbstractCollectionDecorator == true -> unwrap 1 ครั้ง
        // จากนั้น coll instanceof BoundedCollection == true -> break
        final Collection<String> decorated = new TestDecorator<String>(boundedColl);

        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorated);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
    }

    @Test
    public void testFactory2_wrappedInSynchronizedCollection_unwrapsOnce() {
        // coll instanceof SynchronizedCollection == true -> unwrap 1 ครั้ง
        final Collection<String> sync =
                SynchronizedCollection.synchronizedCollection((Collection<String>) boundedColl);

        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(sync);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
    }

    @Test
    public void testFactory2_nestedDecorators_unwrapsMultipleLevels() {
        // SynchronizedCollection ครอบ TestDecorator ครอบ BoundedCollection
        // ต้อง unwrap 2 รอบก่อนพบ BoundedCollection
        final Collection<String> innerDecorator = new TestDecorator<String>(boundedColl);
        final Collection<String> outerSync =
                SynchronizedCollection.synchronizedCollection(innerDecorator);

        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(outerSync);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isFull());
    }

    @Test
    public void testFactory2_alreadyBoundedAndDecorator_priorityCheck() {
        // ผลลัพธ์จาก factory1/factory2 เป็นทั้ง BoundedCollection และ AbstractCollectionDecorator
        // เช็ค instanceof BoundedCollection ต้องมาก่อน -> break ทันทีโดยไม่ unwrap
        final BoundedCollection<String> alreadyUnmodifiable =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(boundedColl);

        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(
                        (Collection<String>) alreadyUnmodifiable);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    // =================================================================
    // Mutating methods -> ต้อง throw UnsupportedOperationException เสมอ
    // =================================================================

    private BoundedCollection<String> wrapped() {
        return UnmodifiableBoundedCollection.unmodifiableBoundedCollection(boundedColl);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_throwsUOE() {
        wrapped().add("c");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll_throwsUOE() {
        final List<String> extra = new ArrayList<String>();
        extra.add("c");
        wrapped().addAll(extra);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll_emptyArg_stillThrowsUOE() {
        // แม้ argument เป็น collection ว่าง ก็ยัง throw เพราะไม่มี logic ตรวจสอบก่อน throw
        wrapped().addAll(new ArrayList<String>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_throwsUOE() {
        wrapped().clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_throwsUOE() {
        wrapped().remove("a");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_nullArg_throwsUOE() {
        wrapped().remove(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll_throwsUOE() {
        wrapped().removeAll(new ArrayList<String>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAll_throwsUOE() {
        wrapped().retainAll(new ArrayList<String>());
    }

    // =================================================================
    // iterator() -> ต้อง unmodifiable, remove() ต้อง throw
    // =================================================================

    @Test
    public void testIterator_traversesElements() {
        final BoundedCollection<String> result = wrapped();
        final Iterator<String> it = result.iterator();

        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUOE() {
        final BoundedCollection<String> result = wrapped();
        final Iterator<String> it = result.iterator();
        it.next();
        it.remove();
    }

    @Test
    public void testIterator_emptyCollection_hasNoElements() {
        final TestBoundedCollection<String> emptyBounded = new TestBoundedCollection<String>(5);
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(emptyBounded);

        assertFalse(result.iterator().hasNext());
    }

    // =================================================================
    // isFull() / maxSize() -> delegate ไปยัง decorated()
    // =================================================================

    @Test
    public void testIsFull_notFull_returnsFalse() {
        // size=2, maxSize=3 -> ยังไม่เต็ม
        final BoundedCollection<String> result = wrapped();
        assertFalse(result.isFull());
    }

    @Test
    public void testIsFull_full_returnsTrue() {
        boundedColl.add("c"); // size=3, maxSize=3 -> เต็มพอดี (boundary)
        final BoundedCollection<String> result = wrapped();
        assertTrue(result.isFull());
    }

    @Test
    public void testIsFull_boundary_zeroMaxSize() {
        // boundary: maxSize = 0 -> isFull() ต้อง true ทันทีแม้ size = 0
        final TestBoundedCollection<String> zeroMax = new TestBoundedCollection<String>(0);
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(zeroMax);

        assertTrue(result.isFull());
        assertEquals(0, result.maxSize());
    }

    @Test
    public void testMaxSize_returnsConfiguredValue() {
        final BoundedCollection<String> result = wrapped();
        assertEquals(3, result.maxSize());
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFactory1_validCollection_wrapsCorrectly` | Factory 1: path ปกติ สร้าง instance สำเร็จ + delegate `size/isFull/maxSize` |
| `testFactory1_null_throwsSomeException` | Factory 1: กรณี `coll == null` (พฤติกรรม exception ไม่ระบุ type แน่นอน - คอมเมนต์กำกับ) |
| `testFactory2_nullCollection_throwsIAE` / `...hasCorrectMessage` | Factory 2: branch `coll == null` → throw IAE พร้อมข้อความ |
| `testFactory2_directBoundedCollection_breaksImmediately` | Factory 2: loop, `coll instanceof BoundedCollection == true` → `break` (0 รอบ) |
| `testFactory2_notBoundedCollection_plainArrayList_throwsIAE` | Factory 2: ไม่ตรงเงื่อนไขใดเลยในลูป (empty collection), ครบ 1000 รอบ → throw IAE พร้อมข้อความ |
| `testFactory2_notBoundedCollection_nonEmptyList_throwsIAE` | Factory 2: เหมือนด้านบนแต่ collection ไม่ว่าง |
| `testFactory2_wrappedInAbstractCollectionDecorator_unwrapsOnce` | Factory 2: branch `coll instanceof AbstractCollectionDecorator == true` → unwrap แล้ว break |
| `testFactory2_wrappedInSynchronizedCollection_unwrapsOnce` | Factory 2: branch `coll instanceof SynchronizedCollection == true` → unwrap แล้ว break |
| `testFactory2_nestedDecorators_unwrapsMultipleLevels` | Factory 2: loop วน >1 รอบ, สลับ branch AbstractCollectionDecorator → SynchronizedCollection → BoundedCollection |
| `testFactory2_alreadyBoundedAndDecorator_priorityCheck` | Factory 2: ตรวจลำดับความสำคัญ `instanceof BoundedCollection` มาก่อน `AbstractCollectionDecorator` |
| `testAdd_throwsUOE` | เมธอด `add()` → throw UOE เสมอ |
| `testAddAll_throwsUOE`, `testAddAll_emptyArg_stillThrowsUOE` | เมธอด `addAll()` → throw UOE ไม่ว่าง/ว่าง |
| `testClear_throwsUOE` | เมธอด `clear()` → throw UOE |
| `testRemove_throwsUOE`, `testRemove_nullArg_throwsUOE` | เมธอด `remove()` → throw UOE (ค่าปกติ/null) |
| `testRemoveAll_throwsUOE` | เมธอด `removeAll()` → throw UOE |
| `testRetainAll_throwsUOE` | เมธอด `retainAll()` → throw UOE |
| `testIterator_traversesElements` | `iterator()` คืนค่าถูกต้อง (wrap ด้วย UnmodifiableIterator) |
| `testIterator_remove_throwsUOE` | `iterator().remove()` → throw UOE (จาก UnmodifiableIterator) |
| `testIterator_emptyCollection_hasNoElements` | boundary: collection ว่าง → iterator ไม่มี element |
| `testIsFull_notFull_returnsFalse` | `isFull()` delegate, กรณี false |
| `testIsFull_full_returnsTrue` | `isFull()` delegate, กรณี true (boundary size==maxSize) |
| `testIsFull_boundary_zeroMaxSize` | boundary: `maxSize=0` → isFull true ทันที |
| `testMaxSize_returnsConfiguredValue` | `maxSize()` delegate คืนค่าถูกต้อง |

**ข้อจำกัด/ข้อสมมติที่ระบุด้วยคอมเมนต์ในโค้ด:** พฤติกรรมของ `AbstractCollectionDecorator` เมื่อรับ `null` ไม่มีอยู่ใน source ที่ให้มา จึงทดสอบแบบ generic exception พร้อมคอมเมนต์กำกับ ตามข้อกำหนดที่ 4