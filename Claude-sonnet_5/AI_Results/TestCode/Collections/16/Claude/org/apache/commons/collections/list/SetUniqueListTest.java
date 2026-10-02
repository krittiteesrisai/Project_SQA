package org.apache.commons.collections.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.collections.list.SetUniqueList;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.collections.list.SetUniqueList
 * (Defects4J: Collections-16b)
 *
 * หมายเหตุ:
 * - ทดสอบผ่าน public API เท่านั้น เนื่องจาก constructor SetUniqueList(List, Set)
 *   เป็น protected และไม่มี public path ใดส่ง null Set เข้าไปได้ (decorate()
 *   สร้าง new HashSet() เสมอ) จึงไม่สามารถทดสอบ branch "set == null" ใน
 *   constructor ได้จากภายนอก package นี้ -> ไม่ครอบคลุม branch นั้น (คอมเมนต์กำกับ)
 * - Inner class SetListIterator / SetListListIterator เป็น package-private
 *   แต่ถูก return ผ่าน Iterator/ListIterator interface (public) จึงสามารถ
 *   เรียก method ผ่าน reference ชนิด interface ได้ตามปกติ
 */
public class SetUniqueListTest {

    private SetUniqueList setUniqueList;

    @Before
    public void setUp() {
        setUniqueList = SetUniqueList.decorate(new ArrayList());
    }

    // -----------------------------------------------------------------
    // decorate()
    // -----------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_NullList_ThrowsException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_EmptyList() {
        List src = new ArrayList();
        SetUniqueList result = SetUniqueList.decorate(src);
        assertNotNull(result);
        assertEquals(0, result.size());
        assertTrue(result.asSet().isEmpty());
    }

    @Test
    public void testDecorate_NonEmptyListNoDuplicates() {
        List src = new ArrayList(Arrays.asList("A", "B", "C"));
        SetUniqueList result = SetUniqueList.decorate(src);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(result));
    }

    @Test
    public void testDecorate_NonEmptyListWithDuplicates_KeepsFirstIndexed() {
        // input มี duplicate: A,B,A,C,B -> ควรได้ A,B,C (คงลำดับ first-occurrence)
        List src = new ArrayList(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList result = SetUniqueList.decorate(src);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(result));
    }

    @Test
    public void testDecorate_AllDuplicateElements() {
        List src = new ArrayList(Arrays.asList("X", "X", "X"));
        SetUniqueList result = SetUniqueList.decorate(src);
        assertEquals(1, result.size());
        assertEquals("X", result.get(0));
    }

    // -----------------------------------------------------------------
    // add(Object)
    // -----------------------------------------------------------------

    @Test
    public void testAdd_Object_Unique_ReturnsTrue() {
        boolean changed = setUniqueList.add("A");
        assertTrue(changed);
        assertEquals(1, setUniqueList.size());
        assertTrue(setUniqueList.contains("A"));
    }

    @Test
    public void testAdd_Object_Duplicate_ReturnsFalse() {
        setUniqueList.add("A");
        boolean changed = setUniqueList.add("A"); // duplicate
        assertFalse(changed);
        assertEquals(1, setUniqueList.size());
    }

    // -----------------------------------------------------------------
    // add(int, Object)
    // -----------------------------------------------------------------

    @Test
    public void testAddIndex_Unique_Inserted() {
        setUniqueList.add("A");
        setUniqueList.add("C");
        setUniqueList.add(1, "B"); // unique -> ควรถูกแทรก
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(setUniqueList));
    }

    @Test
    public void testAddIndex_Duplicate_NotInserted() {
        setUniqueList.add("A");
        setUniqueList.add("B");
        setUniqueList.add(0, "A"); // duplicate -> ไม่ถูกแทรก ไม่มี exception
        assertEquals(2, setUniqueList.size());
        assertEquals(Arrays.asList("A", "B"), new ArrayList(setUniqueList));
    }

    // -----------------------------------------------------------------
    // addAll(Collection)
    // -----------------------------------------------------------------

    @Test
    public void testAddAll_Collection_AllUnique_ReturnsTrue() {
        boolean changed = setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        assertTrue(changed);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAll_Collection_Empty_ReturnsFalse() {
        // loop ทำงาน 0 ครั้ง (for-loop branch: hasNext() == false ทันที)
        boolean changed = setUniqueList.addAll(new ArrayList());
        assertFalse(changed);
        assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testAddAll_Collection_AllDuplicates_ReturnsFalse() {
        setUniqueList.add("A");
        boolean changed = setUniqueList.addAll(Arrays.asList("A", "A"));
        assertFalse(changed);
        assertEquals(1, setUniqueList.size());
    }

    // -----------------------------------------------------------------
    // addAll(int, Collection) - ครอบคลุม branch "index++" ทั้งจริงและเท็จ
    // -----------------------------------------------------------------

    @Test
    public void testAddAllIndex_MixedUniqueAndDuplicate() {
        setUniqueList.add("A");
        // เพิ่ม A(dup),B(new),A(dup again),C(new) ที่ index=1
        boolean changed = setUniqueList.addAll(1, Arrays.asList("A", "B", "A", "C"));
        assertTrue(changed);
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(setUniqueList));
    }

    // -----------------------------------------------------------------
    // set(int, Object)
    // -----------------------------------------------------------------

    @Test
    public void testSet_ObjectNotInList_PosIsMinusOne() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        Object removed = setUniqueList.set(1, "D"); // D ไม่มีในลิสต์ -> pos == -1
        assertEquals("B", removed);
        assertEquals(Arrays.asList("A", "D", "C"), new ArrayList(setUniqueList));
        assertFalse(setUniqueList.contains("B")); // B ถูก set.remove ไปแล้ว
        assertTrue(setUniqueList.contains("D"));
    }

    @Test
    public void testSet_ExistingObjectDifferentIndex_RemovesDuplicate() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        // C มีอยู่แล้วที่ index=2, ย้ายไป index=0 -> pos(2) != -1 && pos(2) != index(0)
        Object removed = setUniqueList.set(0, "C");
        assertEquals("A", removed);
        assertEquals(Arrays.asList("C", "B"), new ArrayList(setUniqueList));
        assertFalse(setUniqueList.contains("A"));
        assertTrue(setUniqueList.contains("C"));
    }

    /**
     * ทดสอบกรณี pos == index (set object ทับตำแหน่งเดิมของตัวเอง)
     * ตามลอจิกของซอร์ส: set.remove(removed) จะถูกเรียกโดยไม่มีการ set.add ชดเชย
     * เนื่องจาก removed == object ตัวเดียวกัน ผลลัพธ์คือ "B" จะถูกลบออกจาก
     * internal Set ทั้งที่ยังอยู่ใน List จริง (นี่คือพฤติกรรม/ข้อบกพร่องที่อาจ
     * เกิดขึ้นจริงตามซอร์สที่ให้มา - เขียนไว้เพื่อดักจับ fault นี้)
     */
    @Test
    public void testSet_SameIndexSameObject_CausesSetInconsistency() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        Object removed = setUniqueList.set(1, "B"); // pos == index == 1
        assertEquals("B", removed);
        // List ยังคงมี B อยู่ที่ตำแหน่งเดิม
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(setUniqueList));
        // แต่ internal Set ไม่มี B แล้ว (ตามลอจิก set.add(object); set.remove(removed))
        // เป็นพฤติกรรมตามซอร์สโค้ดจริง - ใช้ดักจับ fault ถ้ามีการแก้ไขในอนาคต
        assertFalse("Known defect: internal set loses element though list still holds it",
                setUniqueList.contains("B"));
    }

    // -----------------------------------------------------------------
    // remove(Object) / remove(int)
    // -----------------------------------------------------------------

    @Test
    public void testRemove_Object_Exists() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        boolean result = setUniqueList.remove("A");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("A"));
    }

    @Test
    public void testRemove_Object_NotExists() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        boolean result = setUniqueList.remove("Z");
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testRemove_Index() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        Object removed = setUniqueList.remove(1);
        assertEquals("B", removed);
        assertEquals(2, setUniqueList.size());
        assertFalse(setUniqueList.contains("B"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Index_OutOfBounds() {
        setUniqueList.remove(0); // list ว่าง -> ต้อง throw
    }

    // -----------------------------------------------------------------
    // removeAll / retainAll / clear
    // -----------------------------------------------------------------

    @Test
    public void testRemoveAll() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        boolean changed = setUniqueList.removeAll(Arrays.asList("A", "C"));
        assertTrue(changed);
        assertEquals(Arrays.asList("B"), new ArrayList(setUniqueList));
        assertFalse(setUniqueList.contains("A"));
        assertFalse(setUniqueList.contains("C"));
    }

    @Test
    public void testRemoveAll_NoMatch_ReturnsFalse() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        boolean changed = setUniqueList.removeAll(Arrays.asList("Z"));
        assertFalse(changed);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testRetainAll() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        boolean changed = setUniqueList.retainAll(Arrays.asList("B"));
        assertTrue(changed);
        assertEquals(Arrays.asList("B"), new ArrayList(setUniqueList));
        assertFalse(setUniqueList.contains("A"));
    }

    @Test
    public void testClear() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
        assertTrue(setUniqueList.asSet().isEmpty());
    }

    // -----------------------------------------------------------------
    // contains / containsAll
    // -----------------------------------------------------------------

    @Test
    public void testContains_True() {
        setUniqueList.add("A");
        assertTrue(setUniqueList.contains("A"));
    }

    @Test
    public void testContains_False() {
        assertFalse(setUniqueList.contains("A"));
    }

    @Test
    public void testContainsAll_True() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        assertTrue(setUniqueList.containsAll(Arrays.asList("A", "B")));
    }

    @Test
    public void testContainsAll_False() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        assertFalse(setUniqueList.containsAll(Arrays.asList("A", "Z")));
    }

    // -----------------------------------------------------------------
    // asSet()
    // -----------------------------------------------------------------

    @Test
    public void testAsSet_ReflectsContent() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        Set s = setUniqueList.asSet();
        assertEquals(2, s.size());
        assertTrue(s.contains("A"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSet_IsUnmodifiable() {
        setUniqueList.add("A");
        Set s = setUniqueList.asSet();
        s.add("B"); // ต้อง throw เพราะเป็น UnmodifiableSet
    }

    // -----------------------------------------------------------------
    // iterator()
    // -----------------------------------------------------------------

    @Test
    public void testIterator_RemoveUpdatesUnderlyingSet() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        java.util.Iterator it = setUniqueList.iterator();
        assertEquals("A", it.next());
        it.remove();
        assertFalse(setUniqueList.contains("A"));
        assertEquals(2, setUniqueList.size());
    }

    // -----------------------------------------------------------------
    // listIterator()
    // -----------------------------------------------------------------

    @Test
    public void testListIterator_NextPrevious() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        ListIterator it = setUniqueList.listIterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        assertEquals("B", it.previous());
    }

    @Test
    public void testListIterator_Remove() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        ListIterator it = setUniqueList.listIterator();
        it.next(); // A
        it.remove();
        assertFalse(setUniqueList.contains("A"));
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testListIterator_Add_Unique() {
        setUniqueList.addAll(Arrays.asList("A", "C"));
        ListIterator it = setUniqueList.listIterator();
        it.next(); // A
        it.add("B"); // unique -> should insert
        assertEquals(Arrays.asList("A", "B", "C"), new ArrayList(setUniqueList));
        assertTrue(setUniqueList.contains("B"));
    }

    @Test
    public void testListIterator_Add_Duplicate_NotInserted() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        ListIterator it = setUniqueList.listIterator();
        it.next(); // A
        it.add("B"); // duplicate -> ไม่ถูกแทรก
        assertEquals(2, setUniqueList.size());
        assertEquals(Arrays.asList("A", "B"), new ArrayList(setUniqueList));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_Set_ThrowsUnsupported() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.set("Z"); // ต้อง throw ตามซอร์ส
    }

    @Test
    public void testListIteratorWithIndex_StartsAtGivenIndex() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        ListIterator it = setUniqueList.listIterator(1);
        assertEquals("B", it.next());
    }

    // -----------------------------------------------------------------
    // subList()
    // -----------------------------------------------------------------

    @Test
    public void testSubList_ReturnsSetUniqueListInstance() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C", "D"));
        List sub = setUniqueList.subList(1, 3);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(Arrays.asList("B", "C"), new ArrayList(sub));
    }

    @Test
    public void testSubList_AddDuplicate_SharesSameSet() {
        setUniqueList.addAll(Arrays.asList("A", "B", "C"));
        List sub = setUniqueList.subList(0, 2); // [A, B]
        // A มีอยู่แล้วใน set หลัก (share set เดียวกัน) -> add ผ่าน sublist ต้องถูกปฏิเสธ
        boolean changed = sub.add("A");
        assertFalse(changed);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_InvalidRange_ThrowsException() {
        setUniqueList.addAll(Arrays.asList("A", "B"));
        setUniqueList.subList(0, 5); // toIndex เกินขนาด list
    }
}
