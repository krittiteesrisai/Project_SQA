# วิเคราะห์และออกแบบ Test Suite

จากการวิเคราะห์ซอร์สโค้ด `SetUniqueList` พบ branch/condition หลักดังนี้:
- `decorate()`: null check, empty/non-empty list
- constructor: null set check
- `add(Object)`/`add(int,Object)`: set.contains() true/false
- `addAll(int, Collection)`: loop iteration, sizeBeforeAddNext != size() true/false
- `set(int, Object)`: pos == -1, pos == index, pos != -1 && pos != index
- `remove`, `removeAll`, `retainAll`, `contains`, `containsAll`: true/false ผลลัพธ์
- inner class iterators: next/previous/remove/add (มี contains check)/set (throw exception)

## Test Code (SetUniqueListTest.java)

```java
package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link SetUniqueList} (Defects4J: Collections-15b)
 * ใช้เฉพาะ JUnit 4 ตามข้อกำหนด
 */
public class SetUniqueListTest {

    private List backingList;
    private SetUniqueList setUniqueList;

    @Before
    public void setUp() {
        backingList = new ArrayList();
        setUniqueList = SetUniqueList.decorate(backingList);
    }

    // =========================================================
    // decorate()
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullListThrows() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorateEmptyList() {
        List list = new ArrayList();
        SetUniqueList sl = SetUniqueList.decorate(list);
        assertNotNull(sl);
        assertEquals(0, sl.size());
    }

    @Test
    public void testDecorateNonEmptyListWithDuplicates() {
        // มี duplicate "a" -> ควรถูกกรองเหลือค่าแรกที่พบ
        List list = new ArrayList(Arrays.asList("a", "b", "a", "c"));
        SetUniqueList sl = SetUniqueList.decorate(list);
        assertEquals(3, sl.size());
        assertEquals("a", sl.get(0));
        assertEquals("b", sl.get(1));
        assertEquals("c", sl.get(2));
    }

    @Test
    public void testDecorateNonEmptyListNoDuplicates() {
        List list = new ArrayList(Arrays.asList("a", "b", "c"));
        SetUniqueList sl = SetUniqueList.decorate(list);
        assertEquals(3, sl.size());
    }

    // =========================================================
    // Constructor (protected) - เข้าถึงได้เพราะอยู่ package เดียวกัน
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSetThrows() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test
    public void testConstructorValid() {
        SetUniqueList sl = new SetUniqueList(new ArrayList(), new HashSet());
        assertEquals(0, sl.size());
    }

    // =========================================================
    // asSet()
    // =========================================================

    @Test
    public void testAsSet() {
        setUniqueList.add("a");
        Set s = setUniqueList.asSet();
        assertTrue(s.contains("a"));
        assertEquals(1, s.size());
    }

    // หมายเหตุ: สมมติฐานว่า UnmodifiableSet.decorate() คืน Set ที่ throw
    // UnsupportedOperationException เมื่อแก้ไข ตาม naming convention ของ class
    // (ไม่ได้เห็น source ของ UnmodifiableSet ตรง ๆ ในไฟล์ที่ให้มา)
    @Test(expected = UnsupportedOperationException.class)
    public void testAsSetIsUnmodifiable() {
        Set s = setUniqueList.asSet();
        s.add("x");
    }

    // =========================================================
    // add(Object)
    // =========================================================

    @Test
    public void testAddNewElementReturnsTrue() {
        assertTrue(setUniqueList.add("a"));
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAddDuplicateElementReturnsFalse() {
        setUniqueList.add("a");
        assertFalse(setUniqueList.add("a"));
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAddNullElement() {
        assertTrue(setUniqueList.add(null));
        assertTrue(setUniqueList.contains(null));
        // เพิ่ม null ซ้ำ -> ต้องถือเป็น duplicate เหมือนกัน
        assertFalse(setUniqueList.add(null));
        assertEquals(1, setUniqueList.size());
    }

    // =========================================================
    // add(int, Object)
    // =========================================================

    @Test
    public void testAddAtIndexNewElement() {
        setUniqueList.add(0, "a");
        assertEquals(1, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
    }

    @Test
    public void testAddAtIndexDuplicateElementIgnored() {
        setUniqueList.add(0, "a");
        setUniqueList.add(0, "a"); // duplicate -> ถูก skip
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtNegativeIndexThrows() {
        setUniqueList.add(-1, "a");
    }

    // =========================================================
    // addAll(Collection)
    // =========================================================

    @Test
    public void testAddAllEmptyCollection() {
        boolean changed = setUniqueList.addAll(new ArrayList());
        assertFalse(changed);
        assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testAddAllNoDuplicates() {
        boolean changed = setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        assertTrue(changed);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAllWithDuplicatesInsideCollection() {
        boolean changed = setUniqueList.addAll(Arrays.asList("a", "a", "b"));
        assertTrue(changed);
        assertEquals(2, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
    }

    @Test
    public void testAddAllAllDuplicatesAlreadyPresent() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean changed = setUniqueList.addAll(Arrays.asList("a", "b"));
        assertFalse(changed);
        assertEquals(2, setUniqueList.size());
    }

    // =========================================================
    // addAll(int, Collection)
    // =========================================================

    @Test
    public void testAddAllAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("d");
        boolean changed = setUniqueList.addAll(1, Arrays.asList("b", "c"));
        assertTrue(changed);
        assertEquals(Arrays.asList("a", "b", "c", "d"), setUniqueList);
    }

    @Test
    public void testAddAllAtIndexWithDuplicateInMiddle() {
        setUniqueList.add("a");
        setUniqueList.add("d");
        // "a" เป็น duplicate -> index ไม่ควรถูก increment สำหรับตัวนี้
        boolean changed = setUniqueList.addAll(1, Arrays.asList("a", "b"));
        assertTrue(changed);
        assertEquals(Arrays.asList("a", "b", "d"), setUniqueList);
    }

    // =========================================================
    // set(int, Object)
    // =========================================================

    @Test
    public void testSetNewObjectNotInList() {
        // pos == -1 branch
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(Arrays.asList("c", "b"), setUniqueList);
    }

    @Test
    public void testSetSamePositionSameObject() {
        // pos == index branch
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "a");
        assertEquals("a", removed);
        assertEquals(Arrays.asList("a", "b"), setUniqueList);
    }

    @Test
    public void testSetObjectAlreadyExistsAtDifferentIndex() {
        // pos != -1 && pos != index branch
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(Arrays.asList("c", "b"), setUniqueList);
        assertEquals(2, setUniqueList.size());
    }

    // =========================================================
    // remove(Object)
    // =========================================================

    @Test
    public void testRemoveObjectPresent() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean result = setUniqueList.remove("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObjectNotPresent() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("z");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    // =========================================================
    // remove(int)
    // =========================================================

    @Test
    public void testRemoveByIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.remove(0);
        assertEquals("a", removed);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexOutOfBoundsThrows() {
        setUniqueList.remove(0); // list ว่าง
    }

    // =========================================================
    // removeAll(Collection)
    // =========================================================

    @Test
    public void testRemoveAllHasChange() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        boolean changed = setUniqueList.removeAll(Arrays.asList("a", "c"));
        assertTrue(changed);
        assertEquals(Arrays.asList("b"), setUniqueList);
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveAllNoMatch() {
        setUniqueList.add("a");
        boolean changed = setUniqueList.removeAll(Arrays.asList("z"));
        assertFalse(changed);
        assertEquals(1, setUniqueList.size());
    }

    // =========================================================
    // retainAll(Collection)
    // =========================================================

    @Test
    public void testRetainAllHasChange() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        boolean changed = setUniqueList.retainAll(Arrays.asList("a", "c"));
        assertTrue(changed);
        assertEquals(Arrays.asList("a", "c"), setUniqueList);
    }

    @Test
    public void testRetainAllNoChange() {
        setUniqueList.addAll(Arrays.asList("a", "b"));
        boolean changed = setUniqueList.retainAll(Arrays.asList("a", "b", "c"));
        assertFalse(changed);
        assertEquals(2, setUniqueList.size());
    }

    // =========================================================
    // clear()
    // =========================================================

    @Test
    public void testClear() {
        setUniqueList.addAll(Arrays.asList("a", "b"));
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    // =========================================================
    // contains(Object) / containsAll(Collection)
    // =========================================================

    @Test
    public void testContainsTrue() {
        setUniqueList.add("a");
        assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContainsFalseOnEmptyList() {
        assertFalse(setUniqueList.contains("z"));
    }

    @Test
    public void testContainsAllTrue() {
        setUniqueList.addAll(Arrays.asList("a", "b"));
        assertTrue(setUniqueList.containsAll(Arrays.asList("a", "b")));
    }

    @Test
    public void testContainsAllFalse() {
        setUniqueList.add("a");
        assertFalse(setUniqueList.containsAll(Arrays.asList("a", "z")));
    }

    @Test
    public void testContainsAllEmptyCollectionReturnsTrue() {
        assertTrue(setUniqueList.containsAll(new ArrayList()));
    }

    // =========================================================
    // iterator()
    // =========================================================

    @Test
    public void testIteratorNextAndRemove() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        Iterator it = setUniqueList.iterator();
        assertTrue(it.hasNext());
        Object first = it.next();
        assertEquals("a", first);
        it.remove();
        assertEquals(2, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testIteratorFullTraversal() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        Iterator it = setUniqueList.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    // =========================================================
    // listIterator()
    // =========================================================

    @Test
    public void testListIteratorNextPreviousRemove() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        ListIterator it = setUniqueList.listIterator();
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("b", it.previous());
        it.remove();
        assertEquals(2, setUniqueList.size());
        assertFalse(setUniqueList.contains("b"));
    }

    @Test
    public void testListIteratorAddNewElement() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("b");
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIteratorAddDuplicateElementIgnored() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("a"); // duplicate -> set.contains == true -> ignore
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetThrowsUnsupported() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // =========================================================
    // listIterator(int)
    // =========================================================

    @Test
    public void testListIteratorWithIndex() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c"));
        ListIterator it = setUniqueList.listIterator(1);
        assertEquals("b", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorWithInvalidIndexThrows() {
        setUniqueList.listIterator(5); // list ว่าง, index ผิดขอบเขต
    }

    // =========================================================
    // subList(int, int)
    // =========================================================

    @Test
    public void testSubList() {
        setUniqueList.addAll(Arrays.asList("a", "b", "c", "d"));
        List sub = setUniqueList.subList(1, 3);
        assertEquals(Arrays.asList("b", "c"), sub);
        assertTrue(sub instanceof SetUniqueList);
    }

    @Test
    public void testSubListSharesSetWithParent() {
        // subList ใช้ set เดียวกับ parent -> ป้องกัน duplicate ข้าม sublist ได้
        setUniqueList.addAll(Arrays.asList("a", "b", "c", "d"));
        List sub = setUniqueList.subList(1, 3);
        boolean added = sub.add("a"); // "a" มีอยู่แล้วใน parent list
        assertFalse(added);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubListInvalidRangeThrows() {
        setUniqueList.addAll(Arrays.asList("a", "b"));
        setUniqueList.subList(0, 5);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDecorateNullListThrows | `decorate()`: list==null → throw |
| testDecorateEmptyList | `decorate()`: list.isEmpty()==true |
| testDecorateNonEmptyListWithDuplicates | `decorate()`: isEmpty==false, กรอง duplicate |
| testDecorateNonEmptyListNoDuplicates | `decorate()`: isEmpty==false, ไม่มี duplicate |
| testConstructorNullSetThrows | constructor: set==null → throw |
| testConstructorValid | constructor: set!=null ปกติ |
| testAsSet / testAsSetIsUnmodifiable | `asSet()` และพฤติกรรม unmodifiable (สมมติฐาน) |
| testAddNewElementReturnsTrue | `add(Object)`: sizeBefore!=size() → true |
| testAddDuplicateElementReturnsFalse | `add(Object)`: sizeBefore==size() → false |
| testAddNullElement | `add(Object)` กับค่า null |
| testAddAtIndexNewElement | `add(int,Object)`: contains==false |
| testAddAtIndexDuplicateElementIgnored | `add(int,Object)`: contains==true |
| testAddAtNegativeIndexThrows | boundary: index ผิดขอบเขต |
| testAddAllEmptyCollection | `addAll(Collection)`: loop ไม่ execute |
| testAddAllNoDuplicates / testAddAllWithDuplicatesInsideCollection / testAddAllAllDuplicatesAlreadyPresent | `addAll(int,Collection)`: sizeBeforeAddNext != size() true/false, return true/false |
| testAddAllAtIndex / testAddAllAtIndexWithDuplicateInMiddle | `addAll(int,Collection)`: index++ branch true/false |
| testSetNewObjectNotInList | `set()`: pos==-1 |
| testSetSamePositionSameObject | `set()`: pos==index |
| testSetObjectAlreadyExistsAtDifferentIndex | `set()`: pos!=-1 && pos!=index |
| testRemoveObjectPresent/NotPresent | `remove(Object)`: true/false |
| testRemoveByIndex / testRemoveIndexOutOfBoundsThrows | `remove(int)` และ boundary |
| testRemoveAllHasChange/NoMatch | `removeAll()`: true/false |
| testRetainAllHasChange/NoChange | `retainAll()`: true/false |
| testClear | `clear()` |
| testContainsTrue/False, testContainsAll* | `contains()`, `containsAll()` true/false |
| testIteratorNextAndRemove/FullTraversal | `iterator()`: next/remove, loop |
| testListIteratorNextPreviousRemove | `listIterator()`: next/previous/remove |
| testListIteratorAddNewElement/DuplicateIgnored | inner `add(Object)`: contains true/false |
| testListIteratorSetThrowsUnsupported | inner `set()`: throw exception |
| testListIteratorWithIndex/InvalidIndexThrows | `listIterator(int)` + boundary |
| testSubList / testSubListSharesSetWithParent / testSubListInvalidRangeThrows | `subList()` และการแชร์ set ร่วมกับ parent |

**หมายเหตุสำคัญ:** เคส `testAsSetIsUnmodifiable` อ้างอิงพฤติกรรมของ `UnmodifiableSet.decorate()` ซึ่งไม่มี source ให้ตรวจสอบตรง ๆ ในไฟล์ที่ให้มา แต่เป็นสมมติฐานที่สมเหตุสมผลตามชื่อคลาส