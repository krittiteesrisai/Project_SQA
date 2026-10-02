# SetUniqueListTest.java

หมายเหตุสำคัญ:
- วางคลาสทดสอบไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`org.apache.commons.collections.list`) เพื่อให้สามารถเข้าถึง **protected constructor** และ **protected method `createSetBasedOnList`** ได้โดยตรง ซึ่งจำเป็นสำหรับการทดสอบ branch ที่ไม่สามารถเข้าถึงผ่าน public API ได้ (เช่น constructor ที่รับ `set == null`, และ branch ที่ set ไม่ใช่ `HashSet`)
- มีการเพิ่ม `import` ของคลาสเป้าหมายตามที่กำหนด (แม้จะอยู่ package เดียวกันก็ compile ผ่านได้ปกติ เพราะเป็น redundant import ที่ถูกต้องตามไวยากรณ์ Java)
- Helper class บางตัว (`NoDefaultConstructorSet`, `PrivateConstructorSet`) สร้างขึ้นเพื่อ **บังคับให้เกิด `InstantiationException` / `IllegalAccessException`** ใน `createSetBasedOnList` ตามที่ระบุไว้จริงในซอร์ส (ไม่ได้เดา behavior เพิ่มเติม)

```java
package org.apache.commons.collections.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.collections.list.SetUniqueList; // ตามข้อกำหนด (redundant แต่ compile ได้)
import org.junit.Before;
import org.junit.Test;

public class SetUniqueListTest {

    private List<String> baseList;
    private SetUniqueList<String> sul;

    @Before
    public void setUp() {
        baseList = new ArrayList<String>();
        sul = SetUniqueList.setUniqueList(baseList);
    }

    // ------------------------------------------------------------------
    // Factory method: setUniqueList()
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFactory_NullList_ThrowsException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testFactory_EmptyList_ReturnsEmptySetUniqueList() {
        List<String> empty = new ArrayList<String>();
        SetUniqueList<String> result = SetUniqueList.setUniqueList(empty);
        assertTrue(result.isEmpty());
        assertEquals(0, result.asSet().size());
    }

    @Test
    public void testFactory_NonEmptyListWithDuplicates_RemovesDuplicates() {
        List<String> input = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList<String> result = SetUniqueList.setUniqueList(input);
        // ควรเก็บลำดับแรกที่พบ และตัดตัวซ้ำออก
        assertEquals(Arrays.asList("A", "B", "C"), result);
        assertEquals(3, result.asSet().size());
    }

    // ------------------------------------------------------------------
    // Protected constructor: set == null branch
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullSet_ThrowsException() {
        new SetUniqueList<String>(new ArrayList<String>(), null);
    }

    @Test
    public void testConstructor_ValidSet_Success() {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        SetUniqueList<String> result = new SetUniqueList<String>(list, set);
        assertTrue(result.isEmpty());
    }

    // ------------------------------------------------------------------
    // asSet()
    // ------------------------------------------------------------------

    @Test
    public void testAsSet_ReturnsUnmodifiableSetView() {
        sul.add("A");
        Set<String> view = sul.asSet();
        assertTrue(view.contains("A"));
        try {
            view.add("B"); // ต้อง unmodifiable
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // คาดหวังตามคอมเมนต์ asSet() -> UnmodifiableSet
        }
    }

    // ------------------------------------------------------------------
    // add(E) - true/false branch (sizeBefore != size())
    // ------------------------------------------------------------------

    @Test
    public void testAdd_UniqueElement_ReturnsTrue() {
        boolean result = sul.add("A");
        assertTrue(result);
        assertEquals(1, sul.size());
    }

    @Test
    public void testAdd_DuplicateElement_ReturnsFalse() {
        sul.add("A");
        boolean result = sul.add("A"); // ซ้ำ
        assertFalse(result);
        assertEquals(1, sul.size());
    }

    // ------------------------------------------------------------------
    // add(int, E) - if (set.contains(object) == false) branch
    // ------------------------------------------------------------------

    @Test
    public void testAddIndex_UniqueElement_AddsAtIndex() {
        sul.add(0, "A");
        sul.add(1, "B");
        sul.add(1, "X"); // insert ระหว่าง
        assertEquals(Arrays.asList("A", "X", "B"), sul);
    }

    @Test
    public void testAddIndex_DuplicateElement_NoChange() {
        sul.add(0, "A");
        sul.add(0, "A"); // ซ้ำ -> ไม่เพิ่ม
        assertEquals(1, sul.size());
        assertEquals(Arrays.asList("A"), sul);
    }

    // ------------------------------------------------------------------
    // addAll(Collection) -> เรียก addAll(size(), coll)
    // ------------------------------------------------------------------

    @Test
    public void testAddAllCollection_EmptyCollection_ReturnsFalse() {
        boolean result = sul.addAll(new ArrayList<String>());
        assertFalse(result);
        assertTrue(sul.isEmpty());
    }

    @Test
    public void testAddAllCollection_WithDuplicates_OnlyUniqueAdded() {
        boolean result = sul.addAll(Arrays.asList("A", "B", "A", "C"));
        assertTrue(result);
        assertEquals(Arrays.asList("A", "B", "C"), sul);
    }

    // ------------------------------------------------------------------
    // addAll(int, Collection) - loop: set.add(e) true/false branch
    // ------------------------------------------------------------------

    @Test
    public void testAddAllIndex_MixedDuplicatesAtSpecificIndex() {
        sul.add("A");
        sul.add("D");
        // แทรกระหว่าง A กับ D โดยมี B ซ้ำในคอลเลกชันเอง
        boolean result = sul.addAll(1, Arrays.asList("B", "B", "C", "A"));
        assertTrue(result);
        assertEquals(Arrays.asList("A", "B", "C", "D"), sul);
    }

    @Test
    public void testAddAllIndex_AllDuplicates_ReturnsFalse() {
        sul.add("A");
        sul.add("B");
        boolean result = sul.addAll(1, Arrays.asList("A", "B"));
        assertFalse(result);
        assertEquals(Arrays.asList("A", "B"), sul);
    }

    // ------------------------------------------------------------------
    // set(int, E) - branches: pos==-1, pos==index, pos!=-1 && pos!=index
    // ------------------------------------------------------------------

    @Test
    public void testSet_NewValueNotInList_PosIsMinusOne() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        String removed = sul.set(1, "X");
        assertEquals("B", removed);
        assertEquals(Arrays.asList("A", "X", "C"), sul);
        assertTrue(sul.contains("X"));
        assertFalse(sul.contains("B"));
    }

    @Test
    public void testSet_ValueExistsElsewhere_RemovesDuplicateByIndex() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        // set index0 ด้วยค่าที่มีอยู่แล้วที่ index2 -> pos=2, index=0 (pos != index)
        String removed = sul.set(0, "C");
        assertEquals("A", removed);
        // C ตัวเดิมที่ index2 ถูกลบออกไปเพราะซ้ำ
        assertEquals(Arrays.asList("C", "B"), sul);
        assertTrue(sul.contains("C"));
        assertFalse(sul.contains("A"));
    }

    @Test
    public void testSet_SelfSwap_PosEqualsIndex_ViolationExposesSetOutOfSync() {
        // Violation ตามคอมเมนต์ในซอร์ส: set(index, object) ที่ object เดิมอยู่ index เดิม
        // (pos == index) จะไม่ remove duplicate แต่ set.add(object); set.remove(removed)
        // จะลบ object ออกจาก set ทั้งที่ list ยังมีอยู่ -> ทำให้ contains() ผิดเพี้ยน
        sul.addAll(Arrays.asList("A", "B", "C"));
        String removed = sul.set(0, "A");
        assertEquals("A", removed);
        assertEquals(Arrays.asList("A", "B", "C"), sul); // list ไม่เปลี่ยน
        // แต่ underlying set ไม่มี "A" แล้ว เพราะ set.remove(removed) ลบ "A" ออก
        assertFalse(sul.contains("A"));
    }

    // ------------------------------------------------------------------
    // remove(Object) - if (result) branch
    // ------------------------------------------------------------------

    @Test
    public void testRemoveObject_Present_ReturnsTrue() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        boolean result = sul.remove("B");
        assertTrue(result);
        assertEquals(Arrays.asList("A", "C"), sul);
        assertFalse(sul.contains("B"));
    }

    @Test
    public void testRemoveObject_NotPresent_ReturnsFalse() {
        sul.addAll(Arrays.asList("A", "B"));
        boolean result = sul.remove("Z");
        assertFalse(result);
        assertEquals(Arrays.asList("A", "B"), sul);
    }

    // ------------------------------------------------------------------
    // remove(int)
    // ------------------------------------------------------------------

    @Test
    public void testRemoveIndex_RemovesFromListAndSet() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        String removed = sul.remove(1);
        assertEquals("B", removed);
        assertEquals(Arrays.asList("A", "C"), sul);
        assertFalse(sul.contains("B"));
    }

    // ------------------------------------------------------------------
    // removeAll(Collection) - loop, result |= remove(name)
    // ------------------------------------------------------------------

    @Test
    public void testRemoveAll_MixedElementsWithDuplicatesInColl() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        // "A" ซ้ำใน coll -> รอบที่สองจะ remove ไม่สำเร็จ (false) แต่ result ต้องยัง true
        boolean result = sul.removeAll(Arrays.asList("A", "A", "Z"));
        assertTrue(result);
        assertEquals(Arrays.asList("B", "C"), sul);
    }

    @Test
    public void testRemoveAll_NoMatchingElements_ReturnsFalse() {
        sul.addAll(Arrays.asList("A", "B"));
        boolean result = sul.removeAll(Arrays.asList("X", "Y"));
        assertFalse(result);
        assertEquals(Arrays.asList("A", "B"), sul);
    }

    // ------------------------------------------------------------------
    // retainAll(Collection) - 3 branch หลัก
    // ------------------------------------------------------------------

    @Test
    public void testRetainAll_SetSameSizeAsIntersection_ReturnsFalseNoChange() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        // coll มีครบทุก element ของ set (อาจมีตัวเกินด้วยก็ได้ แต่ intersection == set.size())
        boolean result = sul.retainAll(Arrays.asList("A", "B", "C", "Z"));
        assertFalse(result);
        assertEquals(Arrays.asList("A", "B", "C"), sul);
    }

    @Test
    public void testRetainAll_EmptyIntersection_ClearsList() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        boolean result = sul.retainAll(Arrays.asList("X", "Y", "Z"));
        assertTrue(result);
        assertTrue(sul.isEmpty());
        assertEquals(0, sul.asSet().size());
    }

    @Test
    public void testRetainAll_PartialIntersection_RemovesNonMatching() {
        sul.addAll(Arrays.asList("A", "B", "C", "D"));
        boolean result = sul.retainAll(Arrays.asList("B", "D"));
        assertTrue(result);
        assertEquals(Arrays.asList("B", "D"), sul);
    }

    // ------------------------------------------------------------------
    // clear()
    // ------------------------------------------------------------------

    @Test
    public void testClear_EmptiesListAndSet() {
        sul.addAll(Arrays.asList("A", "B"));
        sul.clear();
        assertTrue(sul.isEmpty());
        assertEquals(0, sul.asSet().size());
    }

    // ------------------------------------------------------------------
    // contains(Object) / containsAll(Collection)
    // ------------------------------------------------------------------

    @Test
    public void testContains_TrueAndFalseCases() {
        sul.add("A");
        assertTrue(sul.contains("A"));
        assertFalse(sul.contains("Z"));
    }

    @Test
    public void testContainsAll_TrueAndFalseCases() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        assertTrue(sul.containsAll(Arrays.asList("A", "B")));
        assertFalse(sul.containsAll(Arrays.asList("A", "Z")));
    }

    // ------------------------------------------------------------------
    // iterator() - SetListIterator: next(), remove()
    // ------------------------------------------------------------------

    @Test
    public void testIterator_NextAndRemove_UpdatesSet() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        Iterator<String> it = sul.iterator();
        assertTrue(it.hasNext());
        String first = it.next();
        assertEquals("A", first);
        it.remove();
        assertFalse(sul.contains("A"));
        assertEquals(Arrays.asList("B", "C"), sul);
    }

    // ------------------------------------------------------------------
    // listIterator() / listIterator(int) - next(), previous(), remove(), add(), set()
    // ------------------------------------------------------------------

    @Test
    public void testListIterator_NextPreviousRemove() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = sul.listIterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        assertEquals("B", it.previous()); // ทดสอบ previous()
        it.remove();
        assertFalse(sul.contains("B"));
        assertEquals(Arrays.asList("A", "C"), sul);
    }

    @Test
    public void testListIteratorIndex_StartsAtGivenPosition() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = sul.listIterator(1);
        assertEquals("B", it.next());
    }

    @Test
    public void testListIterator_AddUniqueElement_Success() {
        sul.addAll(Arrays.asList("A", "C"));
        ListIterator<String> it = sul.listIterator(1);
        it.add("B"); // unique -> เพิ่มสำเร็จ
        assertEquals(Arrays.asList("A", "B", "C"), sul);
        assertTrue(sul.contains("B"));
    }

    @Test
    public void testListIterator_AddDuplicateElement_NoChange() {
        sul.addAll(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = sul.listIterator(1);
        it.add("A"); // ซ้ำ -> ไม่เพิ่ม (branch false)
        assertEquals(Arrays.asList("A", "B", "C"), sul);
        assertEquals(3, sul.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_SetThrowsUnsupportedOperationException() {
        sul.addAll(Arrays.asList("A", "B"));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.set("X"); // ต้อง throw ตามซอร์ส
    }

    // ------------------------------------------------------------------
    // subList() + createSetBasedOnList() - ครบทุก branch
    // ------------------------------------------------------------------

    @Test
    public void testSubList_UnderlyingSetIsHashSet_TrueBranch() {
        // sul ถูกสร้างผ่าน factory ซึ่ง set ภายในคือ HashSet เสมอ
        sul.addAll(Arrays.asList("A", "B", "C", "D"));
        List<String> sub = sul.subList(1, 3); // [B, C]
        assertEquals(Arrays.asList("B", "C"), sub);
        assertTrue(sub instanceof SetUniqueList);
        // ตรวจสอบว่า subList ยังคง unique behavior
        ((SetUniqueList<String>) sub).add("B"); // ซ้ำ ไม่เพิ่ม
        assertEquals(Arrays.asList("B", "C"), sub);
    }

    @Test
    public void testSubList_NonHashSetWithNullaryConstructor_ElseBranchSuccess() {
        // ใช้ LinkedHashSet ซึ่งไม่ใช่ HashSet.class แต่มี public no-arg constructor
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        Set<String> linkedSet = new LinkedHashSet<String>(list);
        SetUniqueList<String> customSul = new SetUniqueList<String>(list, linkedSet);

        List<String> sub = customSul.subList(1, 3); // [B, C]
        assertEquals(Arrays.asList("B", "C"), sub);
        assertTrue(sub instanceof SetUniqueList);

        SetUniqueList<String> subSul = (SetUniqueList<String>) sub;
        assertTrue(subSul.contains("B"));
        assertTrue(subSul.contains("C"));
        // ทดสอบ unique behavior ของ subSul ด้วย
        subSul.add("B"); // ซ้ำ -> ไม่เพิ่ม
        assertEquals(2, subSul.size());
    }

    @Test
    public void testSubList_InstantiationException_FallbackToHashSet() {
        // NoDefaultConstructorSet ไม่มี public no-arg constructor -> newInstance() throw InstantiationException
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        NoDefaultConstructorSet<String> customSet = new NoDefaultConstructorSet<String>(16);
        customSet.addAll(list);
        SetUniqueList<String> customSul = new SetUniqueList<String>(list, customSet);

        List<String> sub = customSul.subList(0, 2); // [A, B]
        assertEquals(Arrays.asList("A", "B"), sub);
        assertTrue(sub instanceof SetUniqueList);
        // ไม่ throw exception ออกมาสู่ผู้เรียก แสดงว่า fallback ทำงาน (catch InstantiationException)
        SetUniqueList<String> subSul = (SetUniqueList<String>) sub;
        assertTrue(subSul.contains("A"));
        assertTrue(subSul.contains("B"));
    }

    @Test
    public void testSubList_IllegalAccessException_FallbackToHashSet() {
        // PrivateConstructorSet มี constructor เป็น private -> newInstance() throw IllegalAccessException
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        PrivateConstructorSet<String> customSet = new PrivateConstructorSet<String>();
        customSet.addAll(list);
        SetUniqueList<String> customSul = new SetUniqueList<String>(list, customSet);

        List<String> sub = customSul.subList(0, 2); // [A, B]
        assertEquals(Arrays.asList("A", "B"), sub);
        assertTrue(sub instanceof SetUniqueList);
        SetUniqueList<String> subSul = (SetUniqueList<String>) sub;
        assertTrue(subSul.contains("A"));
        assertTrue(subSul.contains("B"));
    }

    // ------------------------------------------------------------------
    // Helper classes สำหรับบังคับ branch InstantiationException / IllegalAccessException
    // ในเมธอด createSetBasedOnList()
    // ------------------------------------------------------------------

    /**
     * Set ที่ไม่มี public no-arg constructor -> Class#newInstance() จะ throw
     * InstantiationException เมื่อถูกเรียกจาก createSetBasedOnList().
     */
    static class NoDefaultConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        // ไม่มี constructor ไม่มี argument (มีแต่แบบรับ capacity)
        NoDefaultConstructorSet(final int capacity) {
            super(capacity);
        }
    }

    /**
     * Set ที่มี constructor เป็น private -> เมื่อถูกเรียกจากภายนอกคลาส (เช่นจาก
     * SetUniqueList) ผ่าน reflection newInstance() จะ throw IllegalAccessException.
     */
    static class PrivateConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        private PrivateConstructorSet() {
            super();
        }
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFactory_NullList_ThrowsException` | `setUniqueList`: `list == null` → true |
| `testFactory_EmptyList_ReturnsEmptySetUniqueList` | `setUniqueList`: `list.isEmpty()` → true |
| `testFactory_NonEmptyListWithDuplicates_RemovesDuplicates` | `setUniqueList`: `list.isEmpty()` → false, ตัดซ้ำผ่าน `addAll` |
| `testConstructor_NullSet_ThrowsException` | Constructor: `set == null` → true |
| `testConstructor_ValidSet_Success` | Constructor: `set == null` → false |
| `testAsSet_ReturnsUnmodifiableSetView` | `asSet()` path, unmodifiable behavior |
| `testAdd_UniqueElement_ReturnsTrue` / `testAdd_DuplicateElement_ReturnsFalse` | `add(E)`: `sizeBefore != size()` true/false |
| `testAddIndex_UniqueElement_AddsAtIndex` / `testAddIndex_DuplicateElement_NoChange` | `add(int,E)`: `set.contains(object)==false` true/false |
| `testAddAllCollection_EmptyCollection_ReturnsFalse` / `testAddAllCollection_WithDuplicates_OnlyUniqueAdded` | `addAll(Collection)` → `addAll(size(), coll)` เส้นทาง empty/non-empty |
| `testAddAllIndex_MixedDuplicatesAtSpecificIndex` / `testAddAllIndex_AllDuplicates_ReturnsFalse` | `addAll(int,Collection)`: loop `set.add(e)` true/false |
| `testSet_NewValueNotInList_PosIsMinusOne` | `set(int,E)`: `pos == -1` |
| `testSet_ValueExistsElsewhere_RemovesDuplicateByIndex` | `set(int,E)`: `pos!=-1 && pos!=index` → true |
| `testSet_SelfSwap_PosEqualsIndex_ViolationExposesSetOutOfSync` | `set(int,E)`: `pos!=-1 && pos!=index` → false (self swap), เผย fault ของ `set.remove(removed)` |
| `testRemoveObject_Present_ReturnsTrue` / `testRemoveObject_NotPresent_ReturnsFalse` | `remove(Object)`: `if (result)` true/false |
| `testRemoveIndex_RemovesFromListAndSet` | `remove(int)` |
| `testRemoveAll_MixedElementsWithDuplicatesInColl` / `testRemoveAll_NoMatchingElements_ReturnsFalse` | `removeAll`: loop `result |= remove(name)` true/false |
| `testRetainAll_SetSameSizeAsIntersection_ReturnsFalseNoChange` | `retainAll`: `setRetainAll.size()==set.size()` → true |
| `testRetainAll_EmptyIntersection_ClearsList` | `retainAll`: `setRetainAll.size()==0` → true |
| `testRetainAll_PartialIntersection_RemovesNonMatching` | `retainAll`: else branch, iterator loop `!setRetainAll.contains(...)` |
| `testClear_EmptiesListAndSet` | `clear()` |
| `testContains_TrueAndFalseCases` / `testContainsAll_TrueAndFalseCases` | `contains`/`containsAll` true/false |
| `testIterator_NextAndRemove_UpdatesSet` | `SetListIterator.next()`, `remove()` |
| `testListIterator_NextPreviousRemove` / `testListIteratorIndex_StartsAtGivenPosition` | `SetListListIterator.next()`, `previous()`, `remove()`, `listIterator(int)` |
| `testListIterator_AddUniqueElement_Success` / `testListIterator_AddDuplicateElement_NoChange` | `SetListListIterator.add()`: `set.contains(object)==false` true/false |
| `testListIterator_SetThrowsUnsupportedOperationException` | `SetListListIterator.set()` → exception path |
| `testSubList_UnderlyingSetIsHashSet_TrueBranch` | `createSetBasedOnList`: `set.getClass().equals(HashSet.class)` → true |
| `testSubList_NonHashSetWithNullaryConstructor_ElseBranchSuccess` | `createSetBasedOnList`: else → `newInstance()` สำเร็จ |
| `testSubList_InstantiationException_FallbackToHashSet` | `createSetBasedOnList`: catch `InstantiationException` |
| `testSubList_IllegalAccessException_FallbackToHashSet` | `createSetBasedOnList`: catch `IllegalAccessException` |

**ข้อจำกัดที่ต้องกำกับ:** branch `set == null` ใน constructor ไม่สามารถเข้าถึงผ่าน public factory method ได้ (เพราะ factory ส่ง `new HashSet<E>()` เสมอ) จึงต้องทดสอบผ่านการเรียก protected constructor โดยตรง (ต้องอยู่ package เดียวกัน) — ไม่ได้เดา behavior เพิ่มเติมจากซอร์สที่ให้มา