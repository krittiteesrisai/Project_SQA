# TreeListTest.java

```java
package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ org.apache.commons.collections.list.TreeList (Collections-20b)
 * ครอบคลุม: constructor, get/set/add/remove/clear, indexOf/contains, toArray,
 * iterator/listIterator (รวม ConcurrentModificationException, IllegalStateException),
 * boundary cases และพยายามกระตุ้น branch การ balance/rotate ของ AVL tree ภายใน
 * (ผ่าน public API เท่านั้น เพราะ AVLNode เป็น package-private และไม่ได้ expose state)
 */
public class TreeListTest {

    private TreeList<Integer> tree;

    @Before
    public void setUp() {
        tree = new TreeList<Integer>();
    }

    // ===================== Constructor =====================

    @Test
    public void testNewListIsEmpty() {
        assertEquals(0, tree.size());
        assertTrue(tree.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullCollectionThrowsNPE() {
        // ตาม javadoc: throws NullPointerException if the collection is null
        new TreeList<Integer>(null);
    }

    @Test
    public void testConstructorWithCollectionCopiesElements() {
        List<Integer> src = Arrays.asList(1, 2, 3, 4, 5);
        TreeList<Integer> t = new TreeList<Integer>(src);
        assertEquals(src, t);
        assertEquals(5, t.size());
    }

    @Test
    public void testConstructorWithEmptyCollection() {
        TreeList<Integer> t = new TreeList<Integer>(Collections.<Integer>emptyList());
        assertEquals(0, t.size());
    }

    // ===================== get() =====================

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativeIndexThrowsOnEmptyList() {
        tree.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexZeroThrowsOnEmptyList() {
        // size()=0 -> checkInterval(0,0,-1) -> 0>-1 -> throws
        tree.get(0);
    }

    @Test
    public void testGetValidIndices() {
        tree.add(0, 10);
        tree.add(1, 20);
        tree.add(2, 30);
        assertEquals(Integer.valueOf(10), tree.get(0));
        assertEquals(Integer.valueOf(20), tree.get(1));
        assertEquals(Integer.valueOf(30), tree.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexEqualsSizeThrows() {
        tree.add(0, 1);
        tree.get(1); // size=1, valid range [0,0]
    }

    // ===================== add() =====================

    @Test
    public void testAddAtBeginning() {
        tree.add(0, 1);
        tree.add(0, 2);
        assertEquals(Arrays.asList(2, 1), tree);
    }

    @Test
    public void testAddAtEnd() {
        tree.add(0, 1);
        tree.add(1, 2);
        assertEquals(Arrays.asList(1, 2), tree);
    }

    @Test
    public void testAddAtMiddle() {
        tree.add(0, 1);
        tree.add(1, 3);
        tree.add(1, 2);
        assertEquals(Arrays.asList(1, 2, 3), tree);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexNegativeThrows() {
        tree.add(-1, 100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexGreaterThanSizeThrows() {
        tree.add(1, 100); // size=0, valid endIndex=size()=0
    }

    @Test
    public void testAddManyPrependTriggersRotations() {
        // เติมที่ index 0 ซ้ำ ๆ ทำให้ tree เอียงขวา -> กระตุ้น rotateLeft/insertOnLeft
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            tree.add(0, i);
            expected.add(0, i);
        }
        assertEquals(expected, tree);
        assertEquals(50, tree.size());
    }

    @Test
    public void testAddManyAppendTriggersRotations() {
        // เติมที่ index size() ซ้ำ ๆ -> กระตุ้น rotateRight/insertOnRight
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            tree.add(tree.size(), i);
            expected.add(i);
        }
        assertEquals(expected, tree);
    }

    @Test
    public void testAddManyAtMiddleTriggersRotations() {
        // แทรกกลางซ้ำ ๆ ทำให้เกิด zig-zag imbalance -> อาจกระตุ้น double rotation
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            int idx = tree.size() / 2;
            tree.add(idx, i);
            expected.add(idx, i);
        }
        assertEquals(expected, tree);
    }

    // ===================== set() =====================

    @Test
    public void testSetValidIndex() {
        tree.add(0, 1);
        tree.add(1, 2);
        Integer old = tree.set(1, 99);
        assertEquals(Integer.valueOf(2), old);
        assertEquals(Integer.valueOf(99), tree.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetNegativeIndexThrows() {
        tree.add(0, 1);
        tree.set(-1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetIndexEqualsSizeThrows() {
        tree.add(0, 1);
        tree.set(1, 5);
    }

    // ===================== remove(index) =====================

    @Test
    public void testRemoveSingleElementList() {
        // root ไม่มีทั้ง left/right subtree -> removeSelf() คืน null
        tree.add(0, 42);
        Integer removed = tree.remove(0);
        assertEquals(Integer.valueOf(42), removed);
        assertEquals(0, tree.size());
        assertTrue(tree.isEmpty());
    }

    @Test
    public void testRemoveRootWithOnlyRightSubtree() {
        // add(0,1) แล้ว add(1,2) -> root มี right subtree อย่างเดียว
        tree.add(0, 1);
        tree.add(1, 2);
        Integer removed = tree.remove(0); // remove root
        assertEquals(Integer.valueOf(1), removed);
        assertEquals(Arrays.asList(2), tree);
    }

    @Test
    public void testRemoveRootWithOnlyLeftSubtree() {
        // add(0,1) แล้ว add(0,2) -> root มี left subtree อย่างเดียว, root.relativePosition=1
        tree.add(0, 1);
        tree.add(0, 2);
        Integer removed = tree.remove(1); // remove root ที่ index 1
        assertEquals(Integer.valueOf(1), removed);
        assertEquals(Arrays.asList(2), tree);
    }

    @Test
    public void testRemoveFromLargerTreeVariousPositions() {
        // สร้าง tree ขนาดใหญ่พอมี node ที่มีทั้ง left และ right subtree
        // แล้วลบจากตำแหน่ง front/back/middle หลายรอบ เพื่อกระตุ้นหลาย branch
        // ของ removeSelf() (ทั้งกรณี heightRightMinusLeft>0 และ <=0)
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 40; i++) {
            tree.add(tree.size(), i);
            expected.add(i);
        }
        for (int i = 0; i < 10; i++) {
            Integer r1 = tree.remove(0);
            Integer r2 = expected.remove(0);
            assertEquals(r2, r1);
        }
        for (int i = 0; i < 10; i++) {
            Integer r1 = tree.remove(tree.size() - 1);
            Integer r2 = expected.remove(expected.size() - 1);
            assertEquals(r2, r1);
        }
        for (int i = 0; i < 10; i++) {
            int idx = tree.size() / 2;
            Integer r1 = tree.remove(idx);
            Integer r2 = expected.remove(idx);
            assertEquals(r2, r1);
        }
        assertEquals(expected, tree);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveNegativeIndexThrows() {
        tree.add(0, 1);
        tree.remove(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexEqualsSizeThrows() {
        tree.add(0, 1);
        tree.remove(1);
    }

    // ===================== clear() =====================

    @Test
    public void testClearResetsListToEmpty() {
        tree.add(0, 1);
        tree.add(1, 2);
        tree.clear();
        assertEquals(0, tree.size());
        assertTrue(tree.isEmpty());
        // ต้อง add ต่อได้ปกติหลัง clear (root ถูกตั้งเป็น null)
        tree.add(0, 99);
        assertEquals(Arrays.asList(99), tree);
    }

    // ===================== indexOf() / contains() =====================

    @Test
    public void testIndexOfOnEmptyListReturnsMinusOne() {
        // root == null -> indexOf ต้องคืน -1 ทันที
        assertEquals(-1, tree.indexOf(100));
    }

    @Test
    public void testIndexOfFoundElement() {
        tree.add(0, 5);
        tree.add(1, 6);
        tree.add(2, 7);
        assertEquals(1, tree.indexOf(6));
    }

    @Test
    public void testIndexOfNotFoundElement() {
        tree.add(0, 5);
        assertEquals(-1, tree.indexOf(999));
    }

    @Test
    public void testIndexOfNullElementFound() {
        // ทดสอบ branch: value==null ? value==object : value.equals(object)
        tree.add(0, 1);
        tree.add(1, null);
        tree.add(2, 3);
        assertEquals(1, tree.indexOf(null));
    }

    @Test
    public void testContainsTrueAndFalse() {
        tree.add(0, 1);
        tree.add(1, 2);
        assertTrue(tree.contains(1));
        assertFalse(tree.contains(999));
    }

    // ===================== toArray() =====================

    @Test
    public void testToArrayEmptyList() {
        Object[] arr = tree.toArray();
        assertEquals(0, arr.length);
    }

    @Test
    public void testToArrayNonEmptyList() {
        tree.add(0, 1);
        tree.add(1, 2);
        tree.add(2, 3);
        Object[] arr = tree.toArray();
        assertArrayEquals(new Object[] {1, 2, 3}, arr);
    }

    // ===================== iterator()/listIterator() =====================

    @Test
    public void testIteratorBasicForwardTraversal() {
        tree.add(0, 1);
        tree.add(1, 2);
        tree.add(2, 3);
        Iterator<Integer> it = tree.iterator();
        List<Integer> collected = new ArrayList<Integer>();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        assertEquals(Arrays.asList(1, 2, 3), collected);
    }

    @Test
    public void testIteratorBasicBackwardTraversal() {
        tree.add(0, 1);
        tree.add(1, 2);
        tree.add(2, 3);
        ListIterator<Integer> it = tree.listIterator(tree.size());
        List<Integer> collected = new ArrayList<Integer>();
        while (it.hasPrevious()) {
            collected.add(it.previous());
        }
        assertEquals(Arrays.asList(3, 2, 1), collected);
    }

    @Test
    public void testIteratorHasNextHasPrevious() {
        tree.add(0, 1);
        ListIterator<Integer> it = tree.listIterator();
        assertTrue(it.hasNext());
        assertFalse(it.hasPrevious());
        it.next();
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextThrowsNoSuchElementAtEnd() {
        ListIterator<Integer> it = tree.listIterator(); // list ว่าง
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorPreviousThrowsNoSuchElementAtStart() {
        tree.add(0, 1);
        ListIterator<Integer> it = tree.listIterator(0);
        it.previous(); // ยังไม่เลื่อนไปข้างหน้า
    }

    @Test
    public void testIteratorNextIndexPreviousIndex() {
        tree.add(0, 1);
        tree.add(1, 2);
        ListIterator<Integer> it = tree.listIterator();
        assertEquals(0, it.nextIndex());
        assertEquals(-1, it.previousIndex());
        it.next();
        assertEquals(1, it.nextIndex());
        assertEquals(0, it.previousIndex());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIteratorConcurrentModificationOnNext() {
        tree.add(0, 1);
        tree.add(1, 2);
        ListIterator<Integer> it = tree.listIterator();
        tree.add(2, 3); // แก้ modCount ผ่าน list โดยตรง ไม่ผ่าน iterator
        it.next();      // ต้อง throw CME
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutMoveThrowsIllegalState() {
        tree.add(0, 1);
        ListIterator<Integer> it = tree.listIterator();
        it.remove(); // currentIndex == -1
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorSetWithoutMoveThrowsIllegalState() {
        tree.add(0, 1);
        ListIterator<Integer> it = tree.listIterator();
        it.set(99); // current == null
    }

    @Test
    public void testIteratorRemoveAfterNext() {
        // remove() หลัง next() -> เข้า branch else (nextIndex != currentIndex)
        tree.add(0, 1);
        tree.add(1, 2);
        tree.add(2, 3);
        ListIterator<Integer> it = tree.listIterator();
        Integer v = it.next(); // v=1, currentIndex=0, nextIndex=1
        assertEquals(Integer.valueOf(1), v);
        it.remove();
        assertEquals(Arrays.asList(2, 3), tree);
        assertEquals(0, it.nextIndex()); // nextIndex-- ทำให้กลับไปเป็น 0
    }

    @Test
    public void testIteratorRemoveAfterPrevious() {
        // remove() หลัง previous() -> เข้า branch if (nextIndex == currentIndex)
        tree.add(0, 1);
        tree.add(1, 2);
        tree.add(2, 3);
        ListIterator<Integer> it = tree.listIterator(tree.size());
        Integer v = it.previous(); // v=3
        assertEquals(Integer.valueOf(3), v);
        it.remove();
        assertEquals(Arrays.asList(1, 2), tree);
    }

    @Test
    public void testIteratorSetAfterNext() {
        tree.add(0, 1);
        tree.add(1, 2);
        ListIterator<Integer> it = tree.listIterator();
        it.next();
        it.set(100);
        assertEquals(Arrays.asList(100, 2), tree);
    }

    @Test
    public void testIteratorAdd() {
        tree.add(0, 1);
        tree.add(1, 3);
        ListIterator<Integer> it = tree.listIterator(1);
        it.add(2);
        assertEquals(Arrays.asList(1, 2, 3), tree);
        assertEquals(2, it.nextIndex());
    }

    @Test
    public void testListIteratorFromIndexBoundaryValid() {
        tree.add(0, 1);
        tree.add(1, 2);
        // fromIndex=0 และ fromIndex=size() ต้องใช้ได้ทั้งคู่ (checkInterval(x,0,size()))
        ListIterator<Integer> itStart = tree.listIterator(0);
        assertNotNull(itStart);
        ListIterator<Integer> itEnd = tree.listIterator(tree.size());
        assertNotNull(itEnd);
        assertFalse(itEnd.hasNext());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorFromIndexNegativeThrows() {
        tree.listIterator(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorFromIndexGreaterThanSizeThrows() {
        tree.add(0, 1);
        tree.listIterator(2); // size=1, valid endIndex=size()=1
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNewListIsEmpty`, `testConstructorWithNullCollectionThrowsNPE`, `testConstructorWithCollectionCopiesElements`, `testConstructorWithEmptyCollection` | constructor เปล่า/มี collection, NPE เมื่อ coll=null (ตาม javadoc), addAll เมื่อ collection ว่าง |
| `testGetNegativeIndexThrowsOnEmptyList`, `testGetIndexZeroThrowsOnEmptyList`, `testGetValidIndices`, `testGetIndexEqualsSizeThrows` | `checkInterval`: index<start, index>end (บน list ว่างและไม่ว่าง), กรณี index ถูกต้อง |
| `testAddAtBeginning/End/Middle`, `testAddIndexNegativeThrows`, `testAddIndexGreaterThanSizeThrows` | `add()`: root==null (สร้างใหม่) vs root!=null (`insert`), `checkInterval` invalid ทั้งสองด้าน |
| `testAddManyPrependTriggersRotations`, `testAddManyAppendTriggersRotations`, `testAddManyAtMiddleTriggersRotations` | `insertOnLeft`/`insertOnRight`, `balance()` case -2/-1/0/1/2, single & double rotation (`rotateLeft`/`rotateRight`) |
| `testSetValidIndex`, `testSetNegativeIndexThrows`, `testSetIndexEqualsSizeThrows` | `set()` valid/invalid index |
| `testRemoveSingleElementList` | `removeSelf()`: left==null && right==null → return null |
| `testRemoveRootWithOnlyRightSubtree` | `removeSelf()`: right!=null, left==null branch |
| `testRemoveRootWithOnlyLeftSubtree` | `removeSelf()`: right==null, left!=null branch (relativePosition>0) |
| `testRemoveFromLargerTreeVariousPositions` | `removeSelf()` กรณีมีทั้ง left/right (heightRightMinusLeft>0 และ <=0), `remove()` recursive left/right, `balance()` หลังลบ |
| `testRemoveNegativeIndexThrows`, `testRemoveIndexEqualsSizeThrows` | `checkInterval` invalid บน `remove()` |
| `testClearResetsListToEmpty` | `clear()` และ add ต่อหลัง clear |
| `testIndexOfOnEmptyListReturnsMinusOne` | `indexOf()`: root==null → -1 |
| `testIndexOfFoundElement`, `testIndexOfNotFoundElement`, `testIndexOfNullElementFound` | `AVLNode.indexOf`: left search, value match (null/non-null), right search, not found |
| `testContainsTrueAndFalse` | `contains()` true/false |
| `testToArrayEmptyList`, `testToArrayNonEmptyList` | `toArray()`: root==null vs root!=null |
| `testIteratorBasicForwardTraversal`, `testIteratorBasicBackwardTraversal` | `iterator()`, `listIterator()`, `next()`/`previous()` เดินหน้า/ถอยหลังปกติ |
| `testIteratorHasNextHasPrevious`, `testIteratorNextIndexPreviousIndex` | `hasNext`, `hasPrevious`, `nextIndex`, `previousIndex` |
| `testIteratorNextThrowsNoSuchElementAtEnd`, `testIteratorPreviousThrowsNoSuchElementAtStart` | `NoSuchElementException` ทั้ง `next()` และ `previous()` |
| `testIteratorConcurrentModificationOnNext` | `checkModCount()` → `ConcurrentModificationException` |
| `testIteratorRemoveWithoutMoveThrowsIllegalState`, `testIteratorSetWithoutMoveThrowsIllegalState` | `IllegalStateException` เมื่อ currentIndex/current ยังไม่ถูกตั้งค่า |
| `testIteratorRemoveAfterNext` | `remove()`: branch else (`nextIndex != currentIndex`) |
| `testIteratorRemoveAfterPrevious` | `remove()`: branch if (`nextIndex == currentIndex`) |
| `testIteratorSetAfterNext` | `set()` เมื่อ current != null |
| `testIteratorAdd` | `add(obj)` ของ iterator |
| `testListIteratorFromIndexBoundaryValid`, `testListIteratorFromIndexNegativeThrows`, `testListIteratorFromIndexGreaterThanSizeThrows` | `checkInterval` ของ `listIterator(fromIndex)` ทั้ง valid boundary (0, size()) และ invalid |

**หมายเหตุ:** `default: throw new RuntimeException("tree inconsistent!")` ใน `balance()` เป็น guard clause ที่ไม่ควรถูกเรียกถ้าโค้ดถูกต้อง (ไม่มีทางเข้าถึงได้ผ่าน public API ปกติ) จึงไม่ได้เขียนเทสเฉพาะสำหรับ branch นี้ เพราะจะเป็นการเดา behavior ที่ไม่มีอยู่จริงในการใช้งานปกติ