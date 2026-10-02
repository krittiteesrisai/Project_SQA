# SetUniqueListTest.java

```java
package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link SetUniqueList} (Defects4J: Collections-5b).
 *
 * หมายเหตุ: การทดสอบบางส่วน (เช่น การใช้งาน set(int,Object) เมื่อ pos == -1)
 * ตั้งอยู่บนสมมติฐานว่า internal Set ต้อง sync กับเนื้อหาของ List เสมอ
 * ตามเจตนาการออกแบบของคลาส (Javadoc ระดับคลาส + method contains()/asSet())
 * หากพฤติกรรมจริงไม่ตรง จะถือเป็นการดักจับ fault ที่มีอยู่ในซอร์ส
 */
public class SetUniqueListTest {

    // ---------- decorate() factory ----------

    @Test
    public void testDecorate_NullList_ThrowsIllegalArgumentException() {
        try {
            SetUniqueList.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDecorate_EmptyList_WrapsSameListInstance() {
        List empty = new ArrayList();
        SetUniqueList sl = SetUniqueList.decorate(empty);
        assertNotNull(sl);
        assertTrue(sl.isEmpty());
        // adding through decorator should reflect in original underlying list too
        sl.add("X");
        assertEquals(1, empty.size());
    }

    @Test
    public void testDecorate_ListWithDuplicates_KeepsFirstOccurrence() {
        List src = new ArrayList(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList sl = SetUniqueList.decorate(src);
        assertEquals(3, sl.size());
        assertEquals("A", sl.get(0));
        assertEquals("B", sl.get(1));
        assertEquals("C", sl.get(2));
    }

    // ---------- constructor ----------

    @Test
    public void testConstructor_NullSet_ThrowsIllegalArgumentException() {
        try {
            new SetUniqueList(new ArrayList(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // ---------- asSet() ----------

    @Test
    public void testAsSet_ReturnsSetContainingAllElements() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        Set asSet = sl.asSet();
        assertTrue(asSet.contains("A"));
        assertTrue(asSet.contains("B"));
        assertEquals(2, asSet.size());
    }

    @Test
    public void testAsSet_ModifyThrowsUnsupportedOperationException() {
        // สมมติฐาน: UnmodifiableSet.decorate() คืนค่า set ที่ไม่รองรับการแก้ไข
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        Set asSet = sl.asSet();
        try {
            asSet.add("Z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- add(Object) ----------

    @Test
    public void testAdd_NewElement_ReturnsTrueAndSizeIncreases() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList());
        boolean result = sl.add("A");
        assertTrue(result);
        assertEquals(1, sl.size());
    }

    @Test
    public void testAdd_DuplicateElement_ReturnsFalseAndSizeUnchanged() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList());
        sl.add("A");
        boolean result = sl.add("A");
        assertFalse(result);
        assertEquals(1, sl.size());
    }

    // ---------- add(int, Object) ----------

    @Test
    public void testAddAtIndex_NewElement_InsertsAtSpecifiedPosition() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "C")));
        sl.add(1, "B");
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(sl));
    }

    @Test
    public void testAddAtIndex_DuplicateElement_NoInsertionOccurs() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        sl.add(0, "B"); // "B" already present -> no-op
        assertEquals(3, sl.size());
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(sl));
    }

    // ---------- addAll(Collection) ----------

    @Test
    public void testAddAllCollection_AllNewElements_ReturnsTrue() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        boolean result = sl.addAll(Arrays.asList("B", "C"));
        assertTrue(result);
        assertEquals(3, sl.size());
    }

    @Test
    public void testAddAllCollection_AllDuplicateElements_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        boolean result = sl.addAll(Arrays.asList("A", "B"));
        assertFalse(result);
        assertEquals(2, sl.size());
    }

    @Test
    public void testAddAllCollection_MixedElements_OnlyNewAdded() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        boolean result = sl.addAll(Arrays.asList("A", "B", "A", "C"));
        assertTrue(result);
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(sl));
    }

    // ---------- addAll(int, Collection) ----------

    @Test
    public void testAddAllAtIndex_InsertsNewElementsAtIndex() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "D")));
        boolean result = sl.addAll(1, Arrays.asList("B", "C", "A"));
        assertTrue(result);
        // "A" is duplicate, ignored; B, C inserted starting at index provided to add()
        assertEquals(Arrays.asList("A", "B", "C", "D"), new ArrayList(sl));
    }

    @Test
    public void testAddAllAtIndex_EmptyCollection_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        boolean result = sl.addAll(0, new ArrayList());
        assertFalse(result);
        assertEquals(1, sl.size());
    }

    // ---------- set(int, Object) ----------

    @Test
    public void testSet_NewObjectNotInList_NormalSetOccurs() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        Object removed = sl.set(1, "D"); // "D" not present -> pos == -1
        assertEquals("B", removed);
        assertEquals(Arrays.asList("A", "D", "C"), new ArrayList(sl));
        // ตามเจตนาของคลาส internal set ควร sync กับ list เสมอ:
        assertTrue("New element should be reflected via contains()", sl.contains("D"));
        assertFalse("Removed element should no longer be reflected via contains()", sl.contains("B"));
    }

    @Test
    public void testSet_ObjectAtSameIndex_NoChange() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        Object removed = sl.set(2, "C"); // pos == index (self swap)
        assertEquals("C", removed);
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(sl));
    }

    @Test
    public void testSet_DuplicateObjectAtDifferentIndex_RemovesDuplicate() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        Object removed = sl.set(0, "C"); // "C" exists at index 2, index=0 -> pos != -1, pos != index
        assertEquals("A", removed);
        assertEquals(Arrays.asList("C", "B"), new ArrayList(sl));
        assertFalse(sl.contains("A"));
        assertTrue(sl.contains("C"));
    }

    // ---------- remove(Object) ----------

    @Test
    public void testRemoveObject_ExistingElement_RemovesFromListAndSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        boolean result = sl.remove("A");
        assertTrue(result);
        assertFalse(sl.contains("A"));
        assertEquals(1, sl.size());
    }

    @Test
    public void testRemoveObject_NonExistingElement_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        boolean result = sl.remove("Z");
        assertFalse(result);
        assertEquals(1, sl.size());
    }

    // ---------- remove(int) ----------

    @Test
    public void testRemoveIndex_ValidIndex_RemovesElementFromListAndSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        Object removed = sl.remove(1);
        assertEquals("B", removed);
        assertFalse(sl.contains("B"));
        assertEquals(2, sl.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_OutOfBounds_ThrowsException() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList());
        sl.remove(0);
    }

    // ---------- removeAll(Collection) ----------

    @Test
    public void testRemoveAll_RemovesMatchingElementsFromBoth() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        boolean result = sl.removeAll(Arrays.asList("A", "C"));
        assertTrue(result);
        assertEquals(Arrays.asList("B"), new ArrayList(sl));
        assertFalse(sl.contains("A"));
        assertFalse(sl.contains("C"));
    }

    @Test
    public void testRemoveAll_NoMatchingElements_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        boolean result = sl.removeAll(Arrays.asList("Z"));
        assertFalse(result);
        assertEquals(1, sl.size());
    }

    // ---------- retainAll(Collection) ----------

    @Test
    public void testRetainAll_KeepsOnlyMatchingElements() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        boolean result = sl.retainAll(Arrays.asList("B"));
        assertTrue(result);
        assertEquals(Arrays.asList("B"), new ArrayList(sl));
        assertFalse(sl.contains("A"));
    }

    @Test
    public void testRetainAll_AllElementsRetained_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        boolean result = sl.retainAll(Arrays.asList("A", "B", "C"));
        assertFalse(result);
        assertEquals(2, sl.size());
    }

    // ---------- clear() ----------

    @Test
    public void testClear_EmptiesListAndSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        sl.clear();
        assertTrue(sl.isEmpty());
        assertFalse(sl.contains("A"));
        assertTrue(sl.asSet().isEmpty());
    }

    // ---------- contains(Object) / containsAll(Collection) ----------

    @Test
    public void testContains_ElementPresent_ReturnsTrue() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        assertTrue(sl.contains("A"));
    }

    @Test
    public void testContains_ElementAbsent_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        assertFalse(sl.contains("Z"));
    }

    @Test
    public void testContainsAll_AllPresent_ReturnsTrue() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        assertTrue(sl.containsAll(Arrays.asList("A", "C")));
    }

    @Test
    public void testContainsAll_NotAllPresent_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        assertFalse(sl.containsAll(Arrays.asList("A", "Z")));
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_NextReturnsElementsInOrder() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        Iterator it = sl.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_RemoveAlsoRemovesFromSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        Iterator it = sl.iterator();
        it.next(); // "A"
        it.remove();
        assertFalse(sl.contains("A"));
        assertEquals(1, sl.size());
    }

    // ---------- listIterator() ----------

    @Test
    public void testListIterator_NextAndPrevious() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        ListIterator it = sl.listIterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        assertEquals("B", it.previous());
        assertEquals("A", it.previous());
    }

    @Test
    public void testListIterator_Remove_UpdatesSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        ListIterator it = sl.listIterator();
        it.next(); // "A"
        it.remove();
        assertFalse(sl.contains("A"));
        assertEquals(1, sl.size());
    }

    @Test
    public void testListIterator_AddNewElement_InsertsAndUpdatesSet() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "C")));
        ListIterator it = sl.listIterator();
        it.next(); // "A"
        it.add("B"); // new element, not contained
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(sl));
        assertTrue(sl.contains("B"));
    }

    @Test
    public void testListIterator_AddDuplicateElement_NoInsertion() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B")));
        ListIterator it = sl.listIterator();
        it.next(); // "A"
        it.add("B"); // duplicate -> should not insert
        assertEquals(Arrays.asList("A", "B"), new ArrayList(sl));
        assertEquals(2, sl.size());
    }

    @Test
    public void testListIterator_Set_ThrowsUnsupportedOperationException() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        ListIterator it = sl.listIterator();
        it.next();
        try {
            it.set("Z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- listIterator(int) ----------

    @Test
    public void testListIteratorWithIndex_StartsAtGivenPosition() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C")));
        ListIterator it = sl.listIterator(1);
        assertEquals("B", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorWithIndex_OutOfBounds_ThrowsException() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A")));
        sl.listIterator(5);
    }

    // ---------- subList(int, int) ----------

    @Test
    public void testSubList_ReturnsSetUniqueListView() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C", "D")));
        List sub = sl.subList(1, 3);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(Arrays.asList("B", "C"), new ArrayList(sub));
    }

    @Test
    public void testSubList_AddDuplicateFromParent_NotAdded() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList(Arrays.asList("A", "B", "C", "D")));
        List sub = sl.subList(1, 3); // shares same underlying `set` field
        sub.add("A"); // "A" already exists in parent's set -> should be rejected
        assertEquals(2, sub.size());
    }

    // ---------- boundary: empty list operations ----------

    @Test
    public void testEmptyList_SizeAndIsEmpty() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList());
        assertEquals(0, sl.size());
        assertTrue(sl.isEmpty());
    }

    @Test
    public void testAddAll_EmptyCollectionToEmptyList_ReturnsFalse() {
        SetUniqueList sl = SetUniqueList.decorate(new ArrayList());
        boolean result = sl.addAll(new ArrayList());
        assertFalse(result);
        assertTrue(sl.isEmpty());
    }
}
```

---

## สรุปตาราง Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDecorate_NullList_* | `decorate()`: `list == null` → throw |
| testDecorate_EmptyList_* | `decorate()`: `list.isEmpty()` == true branch |
| testDecorate_ListWithDuplicates_* | `decorate()`: else branch (copy, clear, addAll) + de-dup logic ผ่าน `add()` |
| testConstructor_NullSet_* | constructor: `set == null` → throw |
| testAsSet_* | `asSet()` การคืนค่า set และ unmodifiable behavior |
| testAdd_NewElement_* / testAdd_DuplicateElement_* | `add(Object)`: `sizeBefore != size()` true/false → `add(int,Object)`: `set.contains == false` ทั้งสองสาขา |
| testAddAtIndex_* | `add(int,Object)`: if-contains / else (no-op) |
| testAddAllCollection_* (3 cases) | `addAll(Collection)`: loop มี/ไม่มี element ใหม่, ผลรวม true/false |
| testAddAllAtIndex_* | `addAll(int,Collection)`: loop insert, empty collection → false |
| testSet_NewObjectNotInList_* | `set()`: `pos == -1` branch |
| testSet_ObjectAtSameIndex_* | `set()`: `pos == index` branch |
| testSet_DuplicateObjectAtDifferentIndex_* | `set()`: else branch (remove duplicate) |
| testRemoveObject_* | `remove(Object)`: true/false ผลลัพธ์ |
| testRemoveIndex_* | `remove(int)`: valid index + boundary (IndexOutOfBounds) |
| testRemoveAll_* | `removeAll()`: match/no-match |
| testRetainAll_* | `retainAll()`: change/no-change |
| testClear_* | `clear()` ล้างทั้ง list และ set |
| testContains_* / testContainsAll_* | `contains()`/`containsAll()` true/false |
| testIterator_* | `iterator()`, `SetListIterator.next()/remove()` |
| testListIterator_NextAndPrevious | `SetListListIterator.next()/previous()` |
| testListIterator_Remove_* | `SetListListIterator.remove()` sync กับ set |
| testListIterator_AddNewElement_* / AddDuplicateElement_* | `SetListListIterator.add()`: if-contains true/false |
| testListIterator_Set_* | `SetListListIterator.set()`: throw UnsupportedOperationException |
| testListIteratorWithIndex_* | `listIterator(int)` + boundary out-of-bounds |
| testSubList_* | `subList()` คืน `SetUniqueList` ใหม่ที่ share set เดียวกัน + de-dup ข้าม sublist |
| testEmptyList_* / testAddAll_EmptyCollection_* | boundary case: list ว่าง, collection ว่าง |

**ข้อสังเกตสำคัญ:** เทส `testSet_NewObjectNotInList_NormalSetOccurs` อาจ **ล้มเหลว** กับซอร์สโค้ดเวอร์ชัน Collections-5b เนื่องจากเมื่อ `pos == -1` โค้ดไม่ได้อัปเดต `set` field (ไม่ `set.remove(removed)` และไม่ `set.add(object)`) ทำให้ `contains()` ไม่ sync กับเนื้อหาจริงของ list — นี่คือจุดที่มีโอกาสดักจับ fault ได้ตามที่ระบุไว้ในหัวข้อ Defects4J Collections-5b