package org.apache.commons.collections4.list; // ต้องอยู่ package เดียวกันเพื่อเข้าถึง protected member

import static org.junit.Assert.*;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetUniqueListTest {

    // ==================== Factory method: setUniqueList ====================

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueList_NullList_ThrowsException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testSetUniqueList_EmptyList() {
        List<String> list = new ArrayList<String>();
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(list);
        assertNotNull(sul);
        assertTrue(sul.isEmpty());
    }

    @Test
    public void testSetUniqueList_NonEmptyListWithDuplicates() {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "a", "c"));
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(list);
        assertEquals(3, sul.size());
        assertEquals(Arrays.asList("a", "b", "c"), sul);
    }

    // ==================== Constructor (protected) ====================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullSet_ThrowsException() {
        new SetUniqueList<String>(new ArrayList<String>(), null);
    }

    // ==================== asSet() ====================

    @Test
    public void testAsSet_UnmodifiableAndReflectsContent() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        Set<String> s = sul.asSet();
        assertTrue(s.contains("a"));
        try {
            s.add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected: unmodifiable view
        }
    }

    // ==================== add(E object) ====================

    @Test
    public void testAdd_UniqueElement_ReturnsTrue() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(sul.add("a"));
        assertEquals(1, sul.size());
    }

    @Test
    public void testAdd_DuplicateElement_ReturnsFalse() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        assertFalse(sul.add("a"));
        assertEquals(1, sul.size());
    }

    @Test
    public void testAdd_NullElement() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(sul.add(null));
        assertFalse(sul.add(null)); // duplicate null -> false branch
        assertEquals(1, sul.size());
        assertTrue(sul.contains(null));
    }

    // ==================== add(int index, E object) ====================

    @Test
    public void testAddAtIndex_UniqueElement() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        sul.add(0, "b");
        assertEquals(Arrays.asList("b", "a"), sul);
    }

    @Test
    public void testAddAtIndex_DuplicateElement_NotAdded() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        sul.add(0, "a"); // duplicate -> if branch false, no insert
        assertEquals(Arrays.asList("a"), sul);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtIndex_OutOfBounds() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add(5, "a"); // boundary
    }

    // ==================== addAll(Collection) ====================

    @Test
    public void testAddAll_Collection_MixedDuplicates() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        boolean changed = sul.addAll(Arrays.asList("a", "b", "c", "b"));
        assertTrue(changed);
        assertEquals(Arrays.asList("a", "b", "c"), sul);
    }

    @Test
    public void testAddAll_NoNewElements_ReturnsFalse() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        boolean changed = sul.addAll(Arrays.asList("a"));
        assertFalse(changed);
        assertEquals(Arrays.asList("a"), sul);
    }

    @Test
    public void testAddAll_EmptyCollection() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a")));
        boolean changed = sul.addAll(new ArrayList<String>());
        assertFalse(changed);
        assertEquals(Arrays.asList("a"), sul);
    }

    // ==================== addAll(int index, Collection) ====================

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.add("a");
        sul.add("d");
        sul.addAll(1, Arrays.asList("b", "a", "c")); // "a" duplicate skipped
        assertEquals(Arrays.asList("a", "b", "c", "d"), sul);
    }

    // ==================== set(int index, E object) ====================

    @Test
    public void testSet_NewElement_PosIsMinusOne() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        String removed = sul.set(1, "x");
        assertEquals("b", removed);
        assertEquals(Arrays.asList("a", "x", "c"), sul);
    }

    @Test
    public void testSet_SamePosition_PosEqualsIndex() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        String removed = sul.set(1, "b"); // pos==index -> no extra removal
        assertEquals("b", removed);
        assertEquals(Arrays.asList("a", "b", "c"), sul);
    }

    @Test
    public void testSet_DuplicateElsewhere_PosNotEqualsIndex() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        // "c" exists at index 2, set index 0 -> pos!=-1 && pos!=index -> remove duplicate
        String removed = sul.set(0, "c");
        assertEquals("a", removed);
        assertEquals(Arrays.asList("c", "b"), sul);
    }

    // ==================== remove(Object) ====================

    @Test
    public void testRemoveObject_Present_ReturnsTrue() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        assertTrue(sul.remove("b"));
        assertEquals(Arrays.asList("a", "c"), sul);
        assertFalse(sul.contains("b"));
    }

    @Test
    public void testRemoveObject_Absent_ReturnsFalse() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        assertFalse(sul.remove("z"));
        assertEquals(Arrays.asList("a", "b", "c"), sul);
    }

    // ==================== remove(int index) ====================

    @Test
    public void testRemoveIndex() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        String removed = sul.remove(1);
        assertEquals("b", removed);
        assertEquals(Arrays.asList("a", "c"), sul);
        assertFalse(sul.contains("b"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_OutOfBounds() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        sul.remove(0); // boundary: empty list
    }

    // ==================== removeAll(Collection) ====================

    @Test
    public void testRemoveAll_SomeMatch_ReturnsTrue() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));
        boolean changed = sul.removeAll(Arrays.asList("b", "d", "z"));
        assertTrue(changed);
        assertEquals(Arrays.asList("a", "c"), sul);
    }

    @Test
    public void testRemoveAll_NoMatch_ReturnsFalse() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b")));
        boolean changed = sul.removeAll(Arrays.asList("z", "y"));
        assertFalse(changed);
        assertEquals(Arrays.asList("a", "b"), sul);
    }

    // ==================== retainAll(Collection) ====================

    @Test
    public void testRetainAll_SameSize_NoChange() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        boolean changed = sul.retainAll(Arrays.asList("a", "b", "c", "d"));
        assertFalse(changed);
        assertEquals(Arrays.asList("a", "b", "c"), sul);
    }

    @Test
    public void testRetainAll_EmptyResult_ClearsList() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        boolean changed = sul.retainAll(Arrays.asList("x", "y"));
        assertTrue(changed);
        assertTrue(sul.isEmpty());
    }

    @Test
    public void testRetainAll_PartialRetain_UsesIterator() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));
        boolean changed = sul.retainAll(Arrays.asList("b", "d"));
        assertTrue(changed);
        assertEquals(Arrays.asList("b", "d"), sul);
    }

    // ==================== clear() ====================

    @Test
    public void testClear() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b")));
        sul.clear();
        assertTrue(sul.isEmpty());
        assertTrue(sul.asSet().isEmpty());
    }

    // ==================== contains / containsAll ====================

    @Test
    public void testContains() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a")));
        assertTrue(sul.contains("a"));
        assertFalse(sul.contains("b"));
    }

    @Test
    public void testContainsAll() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        assertTrue(sul.containsAll(Arrays.asList("a", "b")));
        assertFalse(sul.containsAll(Arrays.asList("a", "z")));
    }

    @Test
    public void testContainsAll_EmptyCollection() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a")));
        assertTrue(sul.containsAll(new ArrayList<String>()));
    }

    // ==================== iterator() ====================

    @Test
    public void testIterator_Remove_SyncsSet() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        Iterator<String> it = sul.iterator();
        it.next();
        it.remove();
        assertEquals(Arrays.asList("b", "c"), sul);
        assertFalse(sul.contains("a"));
    }

    // ==================== listIterator() / listIterator(int) ====================

    @Test
    public void testListIterator_Remove_SyncsSet() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.remove();
        assertEquals(Arrays.asList("b", "c"), sul);
        assertFalse(sul.contains("a"));
    }

    @Test
    public void testListIterator_AddUnique() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b")));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.add("x");
        assertEquals(Arrays.asList("a", "x", "b"), sul);
        assertTrue(sul.contains("x"));
    }

    @Test
    public void testListIterator_AddDuplicate_NotAdded() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b")));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.add("a"); // duplicate -> if branch false
        assertEquals(Arrays.asList("a", "b"), sul);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_Set_ThrowsUnsupported() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a")));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.set("x");
    }

    @Test
    public void testListIterator_Previous() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b")));
        ListIterator<String> it = sul.listIterator();
        it.next();
        it.next();
        assertEquals("b", it.previous());
    }

    @Test
    public void testListIteratorWithIndex() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        ListIterator<String> it = sul.listIterator(1);
        assertEquals("b", it.next());
    }

    // ==================== subList() ====================

    @Test
    public void testSubList_ReturnsSetUniqueList() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("a", "b", "c", "d")));
        List<String> sub = sul.subList(1, 3);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(Arrays.asList("b", "c"), sub);
    }

    // ==================== createSetBasedOnList() (protected) ====================

    @Test
    public void testCreateSetBasedOnList_HashSet_DirectCreate() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        Set<String> hashSet = new HashSet<String>();
        List<String> list = Arrays.asList("a", "b");
        Set<String> result = sul.createSetBasedOnList(hashSet, list);
        assertTrue(result instanceof HashSet);
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateSetBasedOnList_NonHashSet_ReflectionSuccess() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        Set<String> treeSet = new TreeSet<String>();
        List<String> list = Arrays.asList("a", "b");
        Set<String> result = sul.createSetBasedOnList(treeSet, list);
        assertTrue(result instanceof TreeSet); // try-branch succeeds (has public no-arg ctor)
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateSetBasedOnList_InstantiationException_FallbackHashSet() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        Set<String> noCtorSet = new NoArgCtorMissingSet<String>(1); // no no-arg ctor
        List<String> list = Arrays.asList("a", "b");
        Set<String> result = sul.createSetBasedOnList(noCtorSet, list);
        assertTrue(result instanceof HashSet); // catch(InstantiationException) branch
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateSetBasedOnList_IllegalAccessException_FallbackHashSet() {
        SetUniqueList<String> sul = SetUniqueList.setUniqueList(new ArrayList<String>());
        Set<String> privateCtorSet = PrivateCtorSet.<String>newInstanceForTest(); // private no-arg ctor
        List<String> list = Arrays.asList("a", "b");
        Set<String> result = sul.createSetBasedOnList(privateCtorSet, list);
        assertTrue(result instanceof HashSet); // catch(IllegalAccessException) branch
        assertEquals(2, result.size());
    }

    // ==================== Helper classes for reflection-exception branches ====================

    /** ไม่มี no-arg constructor -> ทำให้ Class#newInstance() ขว้าง InstantiationException */
    private static class NoArgCtorMissingSet<E> extends AbstractSet<E> {
        NoArgCtorMissingSet(final int dummy) {
            // มีเฉพาะ constructor ที่รับ parameter เท่านั้น
        }

        @Override
        public Iterator<E> iterator() {
            return new ArrayList<E>().iterator();
        }

        @Override
        public int size() {
            return 0;
        }
    }

    /** constructor เป็น private -> ทำให้ Class#newInstance() ขว้าง IllegalAccessException เมื่อถูกเรียกจากคลาสอื่น */
    private static class PrivateCtorSet<E> extends AbstractSet<E> {
        private PrivateCtorSet() {
        }

        static <T> PrivateCtorSet<T> newInstanceForTest() {
            return new PrivateCtorSet<T>();
        }

        @Override
        public Iterator<E> iterator() {
            return new ArrayList<E>().iterator();
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
