# JUnit 4 Test Suite สำหรับ ListOrderedSet

```java
package org.apache.commons.collections.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections.OrderedIterator;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.collections.set.ListOrderedSet
 * (Defects4J: Collections-18b)
 */
public class ListOrderedSetTest {

    private ListOrderedSet<String> los;

    @Before
    public void setUp() {
        los = new ListOrderedSet<String>();
    }

    // ------------------------------------------------------------------
    // Constructor / Factory: listOrderedSet(Set, List)
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFactorySetList_nullSet_throws() {
        ListOrderedSet.listOrderedSet(null, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorySetList_nullList_throws() {
        ListOrderedSet.listOrderedSet(new HashSet<String>(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorySetList_nonEmptySet_throws() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        ListOrderedSet.listOrderedSet(set, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorySetList_nonEmptyList_throws() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        ListOrderedSet.listOrderedSet(new HashSet<String>(), list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorySetList_bothNonEmpty_throws() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        List<String> list = new ArrayList<String>();
        list.add("b");
        ListOrderedSet.listOrderedSet(set, list);
    }

    @Test
    public void testFactorySetList_success() {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(set, list);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ------------------------------------------------------------------
    // Factory: listOrderedSet(Set)
    // ------------------------------------------------------------------

    @Test
    public void testFactorySet_success() {
        Set<String> set = new HashSet<String>();
        set.add("x");
        set.add("y");
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(set);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    // ------------------------------------------------------------------
    // Factory: listOrderedSet(List)
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryList_nullList_throws() {
        ListOrderedSet.listOrderedSet((List<String>) null);
    }

    @Test
    public void testFactoryList_withDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a"); // duplicate
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(list);
        assertEquals(2, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
    }

    @Test
    public void testFactoryList_noDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(list);
        assertEquals(3, result.size());
    }

    // ------------------------------------------------------------------
    // Default constructor
    // ------------------------------------------------------------------

    @Test
    public void testDefaultConstructor_empty() {
        ListOrderedSet<String> newSet = new ListOrderedSet<String>();
        assertTrue(newSet.isEmpty());
        assertEquals(0, newSet.size());
    }

    // ------------------------------------------------------------------
    // asList()
    // ------------------------------------------------------------------

    @Test
    public void testAsList_reflectsOrder() {
        los.add("first");
        los.add("second");
        List<String> asList = los.asList();
        assertEquals(2, asList.size());
        assertEquals("first", asList.get(0));
        assertEquals("second", asList.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_isUnmodifiable() {
        los.add("a");
        List<String> asList = los.asList();
        asList.add("b"); // should throw
    }

    // ------------------------------------------------------------------
    // clear()
    // ------------------------------------------------------------------

    @Test
    public void testClear_emptiesBothCollections() {
        los.add("a");
        los.add("b");
        los.clear();
        assertEquals(0, los.size());
        assertTrue(los.asList().isEmpty());
    }

    @Test
    public void testClear_onAlreadyEmptySet() {
        los.clear(); // no exception expected
        assertEquals(0, los.size());
    }

    // ------------------------------------------------------------------
    // iterator()
    // ------------------------------------------------------------------

    @Test
    public void testIterator_ordersPreserved() {
        los.add("c");
        los.add("a");
        los.add("b");
        Iterator<String> it = los.iterator();
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_isOrderedIteratorInstance() {
        los.add("a");
        OrderedIterator<String> it = los.iterator();
        assertNotNull(it);
    }

    @Test
    public void testIterator_removeUpdatesSetAndList() {
        los.add("a");
        los.add("b");
        Iterator<String> it = los.iterator();
        it.next(); // "a"
        it.remove();
        assertFalse(los.contains("a"));
        assertEquals(1, los.size());
        assertEquals(1, los.asList().size());
    }

    @Test
    public void testIterator_hasPrevious_and_previous() {
        los.add("a");
        los.add("b");
        OrderedIterator<String> it = los.iterator();
        // access via cast since interface exposes previous methods
        ListOrderedSet.OrderedSetIterator<String> osi =
                (ListOrderedSet.OrderedSetIterator<String>) it;
        assertEquals("a", osi.next());
        assertEquals("b", osi.next());
        assertTrue(osi.hasPrevious());
        assertEquals("b", osi.previous());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextOnEmpty_throws() {
        Iterator<String> it = los.iterator();
        it.next(); // should throw NoSuchElementException from underlying iterator
    }

    // ------------------------------------------------------------------
    // add(E)
    // ------------------------------------------------------------------

    @Test
    public void testAdd_newElement_returnsTrue() {
        boolean result = los.add("a");
        assertTrue(result);
        assertEquals(1, los.size());
        assertEquals("a", los.get(0));
    }

    @Test
    public void testAdd_duplicateElement_returnsFalse() {
        los.add("a");
        boolean result = los.add("a"); // duplicate
        assertFalse(result);
        assertEquals(1, los.size()); // no duplicate stored
    }

    @Test
    public void testAdd_null_allowedIfSetSupportsIt() {
        // HashSet allows null; verify decorator delegates correctly
        boolean result = los.add(null);
        assertTrue(result);
        assertTrue(los.contains(null));
    }

    // ------------------------------------------------------------------
    // addAll(Collection)
    // ------------------------------------------------------------------

    @Test
    public void testAddAll_allNewElements_returnsTrue() {
        Collection<String> coll = Arrays.asList("a", "b", "c");
        boolean result = los.addAll(coll);
        assertTrue(result);
        assertEquals(3, los.size());
    }

    @Test
    public void testAddAll_someDuplicates_returnsTrueOverall() {
        los.add("a");
        Collection<String> coll = Arrays.asList("a", "b");
        boolean result = los.addAll(coll); // "a" fails, "b" succeeds -> overall true
        assertTrue(result);
        assertEquals(2, los.size());
    }

    @Test
    public void testAddAll_allDuplicates_returnsFalse() {
        los.add("a");
        los.add("b");
        Collection<String> coll = Arrays.asList("a", "b");
        boolean result = los.addAll(coll);
        assertFalse(result);
        assertEquals(2, los.size());
    }

    @Test
    public void testAddAll_emptyCollection_returnsFalse() {
        boolean result = los.addAll(new ArrayList<String>());
        assertFalse(result);
    }

    // ------------------------------------------------------------------
    // remove(Object)
    // ------------------------------------------------------------------

    @Test
    public void testRemove_existingElement_returnsTrue() {
        los.add("a");
        boolean result = los.remove("a");
        assertTrue(result);
        assertFalse(los.contains("a"));
        assertEquals(0, los.asList().size());
    }

    @Test
    public void testRemove_nonExistingElement_returnsFalse() {
        boolean result = los.remove("notPresent");
        assertFalse(result);
    }

    // ------------------------------------------------------------------
    // removeAll(Collection)
    // ------------------------------------------------------------------

    @Test
    public void testRemoveAll_someElementsRemoved_returnsTrue() {
        los.add("a");
        los.add("b");
        los.add("c");
        Collection<String> toRemove = Arrays.asList("a", "z"); // "a" exists, "z" doesn't
        boolean result = los.removeAll(toRemove);
        assertTrue(result);
        assertEquals(2, los.size());
        assertFalse(los.contains("a"));
    }

    @Test
    public void testRemoveAll_noElementsRemoved_returnsFalse() {
        los.add("a");
        Collection<String> toRemove = Arrays.asList("x", "y");
        boolean result = los.removeAll(toRemove);
        assertFalse(result);
        assertEquals(1, los.size());
    }

    @Test
    public void testRemoveAll_emptyCollection_returnsFalse() {
        los.add("a");
        boolean result = los.removeAll(new ArrayList<String>());
        assertFalse(result);
    }

    // ------------------------------------------------------------------
    // retainAll(Collection)
    // ------------------------------------------------------------------

    @Test
    public void testRetainAll_noChange_returnsFalse() {
        los.add("a");
        los.add("b");
        // retaining everything already present -> underlying retainAll returns false
        boolean result = los.retainAll(Arrays.asList("a", "b", "c"));
        assertFalse(result);
        assertEquals(2, los.size());
    }

    @Test
    public void testRetainAll_resultsInEmptySet_clearsSetOrder() {
        los.add("a");
        los.add("b");
        boolean result = los.retainAll(Arrays.asList("z")); // nothing matches
        assertTrue(result);
        assertEquals(0, los.size());
        assertTrue(los.asList().isEmpty());
    }

    @Test
    public void testRetainAll_partialRetain_updatesOrder() {
        los.add("a");
        los.add("b");
        los.add("c");
        boolean result = los.retainAll(Arrays.asList("a", "c"));
        assertTrue(result);
        assertEquals(2, los.size());
        List<String> order = los.asList();
        assertEquals("a", order.get(0));
        assertEquals("c", order.get(1));
        assertFalse(los.contains("b"));
    }

    // ------------------------------------------------------------------
    // toArray()
    // ------------------------------------------------------------------

    @Test
    public void testToArray_ordersPreserved() {
        los.add("x");
        los.add("y");
        Object[] arr = los.toArray();
        assertEquals(2, arr.length);
        assertEquals("x", arr[0]);
        assertEquals("y", arr[1]);
    }

    @Test
    public void testToArray_typed() {
        los.add("x");
        los.add("y");
        String[] arr = los.toArray(new String[0]);
        assertEquals(2, arr.length);
        assertEquals("x", arr[0]);
        assertEquals("y", arr[1]);
    }

    @Test
    public void testToArray_emptySet() {
        Object[] arr = los.toArray();
        assertEquals(0, arr.length);
    }

    // ------------------------------------------------------------------
    // get(int)
    // ------------------------------------------------------------------

    @Test
    public void testGet_validIndex() {
        los.add("a");
        los.add("b");
        assertEquals("a", los.get(0));
        assertEquals("b", los.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_invalidIndex_throws() {
        los.add("a");
        los.get(5);
    }

    // ------------------------------------------------------------------
    // indexOf(Object)
    // ------------------------------------------------------------------

    @Test
    public void testIndexOf_existingElement() {
        los.add("a");
        los.add("b");
        assertEquals(1, los.indexOf("b"));
    }

    @Test
    public void testIndexOf_nonExistingElement_returnsMinusOne() {
        los.add("a");
        assertEquals(-1, los.indexOf("notPresent"));
    }

    // ------------------------------------------------------------------
    // add(int, E)
    // ------------------------------------------------------------------

    @Test
    public void testAddIndexed_newElement_insertsAtPosition() {
        los.add("a");
        los.add("c");
        los.add(1, "b"); // insert between a and c
        assertEquals(3, los.size());
        assertEquals("a", los.get(0));
        assertEquals("b", los.get(1));
        assertEquals("c", los.get(2));
    }

    @Test
    public void testAddIndexed_existingElement_noOp() {
        los.add("a");
        los.add("b");
        los.add(0, "b"); // already contained -> should do nothing
        assertEquals(2, los.size());
        assertEquals("a", los.get(0));
        assertEquals("b", los.get(1));
    }

    // ------------------------------------------------------------------
    // addAll(int, Collection)
    // ------------------------------------------------------------------

    @Test
    public void testAddAllIndexed_allNewElements_returnsTrue() {
        los.add("a");
        los.add("d");
        Collection<String> toAdd = Arrays.asList("b", "c");
        boolean result = los.addAll(1, toAdd);
        assertTrue(result);
        assertEquals(4, los.size());
        assertEquals("a", los.get(0));
        assertEquals("b", los.get(1));
        assertEquals("c", los.get(2));
        assertEquals("d", los.get(3));
    }

    @Test
    public void testAddAllIndexed_allDuplicates_returnsFalse() {
        los.add("a");
        los.add("b");
        Collection<String> toAdd = Arrays.asList("a", "b");
        boolean result = los.addAll(0, toAdd); // both already contained
        assertFalse(result);
        assertEquals(2, los.size());
    }

    @Test
    public void testAddAllIndexed_mixedElements_returnsTrue() {
        los.add("a");
        Collection<String> toAdd = Arrays.asList("a", "b", "c"); // "a" skipped, b,c added
        boolean result = los.addAll(1, toAdd);
        assertTrue(result);
        assertEquals(3, los.size());
        assertEquals("a", los.get(0));
        assertEquals("b", los.get(1));
        assertEquals("c", los.get(2));
    }

    @Test
    public void testAddAllIndexed_emptyCollection_returnsFalse() {
        los.add("a");
        boolean result = los.addAll(0, new ArrayList<String>());
        assertFalse(result);
        assertEquals(1, los.size());
    }

    // ------------------------------------------------------------------
    // remove(int)
    // ------------------------------------------------------------------

    @Test
    public void testRemoveIndexed_validIndex() {
        los.add("a");
        los.add("b");
        los.add("c");
        Object removed = los.remove(1);
        assertEquals("b", removed);
        assertEquals(2, los.size());
        assertFalse(los.contains("b"));
        assertEquals("a", los.get(0));
        assertEquals("c", los.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexed_invalidIndex_throws() {
        los.add("a");
        los.remove(5);
    }

    // ------------------------------------------------------------------
    // toString()
    // ------------------------------------------------------------------

    @Test
    public void testToString_reflectsListOrder() {
        los.add("b");
        los.add("a");
        String str = los.toString();
        // ArrayList.toString order: [b, a]
        assertEquals("[b, a]", str);
    }

    @Test
    public void testToString_emptySet() {
        assertEquals("[]", los.toString());
    }

    // ------------------------------------------------------------------
    // Combined / integration-like scenarios
    // ------------------------------------------------------------------

    @Test
    public void testSize_afterMultipleOperations() {
        los.add("a");
        los.add("b");
        los.add("a"); // duplicate ignored
        los.remove("b");
        assertEquals(1, los.size());
        assertTrue(los.contains("a"));
    }

    @Test
    public void testContains_afterClear() {
        los.add("a");
        los.clear();
        assertFalse(los.contains("a"));
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testFactorySetList_nullSet_throws | `set == null` → true |
| testFactorySetList_nullList_throws | `list == null` → true |
| testFactorySetList_nonEmptySet_throws | `set.size() > 0` → true |
| testFactorySetList_nonEmptyList_throws | `list.size() > 0` → true |
| testFactorySetList_bothNonEmpty_throws | ทั้งสองเงื่อนไข OR true |
| testFactorySetList_success | ทุกเงื่อนไข false → return new instance |
| testFactorySet_success | `listOrderedSet(Set)` constructor path |
| testFactoryList_nullList_throws | `list == null` → true ใน `listOrderedSet(List)` |
| testFactoryList_withDuplicates | `retainAll` ลด duplicate |
| testFactoryList_noDuplicates | ไม่มี duplicate ให้ retain |
| testDefaultConstructor_empty | Default constructor path |
| testAsList_reflectsOrder / testAsList_isUnmodifiable | `asList()` และ unmodifiable behavior |
| testClear_emptiesBothCollections / testClear_onAlreadyEmptySet | `clear()` ปกติ/ empty |
| testIterator_ordersPreserved / Instance / removeUpdates / hasPrevious_previous / nextOnEmpty_throws | `iterator()`, `OrderedSetIterator.next/remove/hasPrevious/previous`, NoSuchElementException path |
| testAdd_newElement_returnsTrue | `collection.add()==true` branch |
| testAdd_duplicateElement_returnsFalse | `collection.add()==false` branch |
| testAdd_null_allowedIfSetSupportsIt | null-element edge case |
| testAddAll_allNewElements_returnsTrue / someDuplicates / allDuplicates / emptyCollection | loop `result |= add(e)` ทุก combination true/false |
| testRemove_existingElement_returnsTrue / nonExistingElement_returnsFalse | `if (result)` branch true/false |
| testRemoveAll_someElementsRemoved / noElementsRemoved / emptyCollection | loop `result |= remove()` true/false/empty |
| testRetainAll_noChange_returnsFalse | `collection.retainAll()==false` → early return |
| testRetainAll_resultsInEmptySet_clearsSetOrder | `collection.size()==0` branch |
| testRetainAll_partialRetain_updatesOrder | else branch, loop `it.remove()` |
| testToArray_* | `toArray()` และ `toArray(T[])`, empty case |
| testGet_validIndex / invalidIndex_throws | `get(int)` boundary/IndexOutOfBounds |
| testIndexOf_existingElement / nonExistingElement | `indexOf()` found/not found |
| testAddIndexed_newElement_insertsAtPosition / existingElement_noOp | `if (!contains(object))` true/false |
| testAddAllIndexed_allNewElements / allDuplicates / mixedElements / emptyCollection | loop `if (contains(e)) continue;`, `changed` true/false, `if (changed)` branch |
| testRemoveIndexed_validIndex / invalidIndex_throws | `remove(int)` boundary/IndexOutOfBounds |
| testToString_reflectsListOrder / emptySet | `toString()` ปกติ/ empty |
| testSize_afterMultipleOperations / testContains_afterClear | Integration scenario ครอบคลุมหลาย method ร่วมกัน |

**หมายเหตุ:**
- ไม่ได้ mock ด้วย EasyMock เนื่องจาก behavior ของคลาสนี้ผูกกับ internal state ของ `Set`/`List` จริง การใช้ mock จะทำให้ทดสอบ behavior ไม่ตรงกับ source จริง (ตามข้อกำหนดห้ามเดา behavior)
- Edge case เช่น `null` element ใน `add()` ทดสอบเพื่อดูว่า `HashSet` decorator รองรับ null ตาม default constructor (ไม่ได้ระบุ behavior พิเศษในซอร์ส จึงทดสอบตาม default `HashSet` behavior)
- `testIterator_nextOnEmpty_throws` อาศัย behavior ของ `ListIterator` มาตรฐานของ Java (NoSuchElementException) ซึ่ง source ใช้ `AbstractIteratorDecorator` wrap ตรงๆ