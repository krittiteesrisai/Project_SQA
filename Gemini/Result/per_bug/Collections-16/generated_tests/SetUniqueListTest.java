package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Test;

public class SetUniqueListTest {

    // --- Tests for decorate() and Constructors (Boundary & Exceptions) ---

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        // ใช้ Protected constructor ผ่าน reflection หรือคลาสย่อยทางอ้อมไม่ได้เนื่องจากข้อจำกัด
        // แต่เราสามารถทดสอบผ่านคลาสย่อยหรือเรียกโดยตรงได้เพราะอยู่ package เดียวกัน
        new SetUniqueList(new ArrayList(), null);
    }

    @Test
    public void testDecorateEmptyList() {
        List emptyList = new ArrayList();
        SetUniqueList uniqueList = SetUniqueList.decorate(emptyList);
        assertNotNull(uniqueList);
        assertTrue(uniqueList.isEmpty());
    }

    @Test
    public void testDecorateListWithDuplicates() {
        List listWithDupes = new ArrayList();
        listWithDupes.add("A");
        listWithDupes.add("B");
        listWithDupes.add("A"); // duplicate
        listWithDupes.add("C");
        listWithDupes.add("B"); // duplicate

        SetUniqueList uniqueList = SetUniqueList.decorate(listWithDupes);
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("C"));
    }

    // --- Tests for add operations ---

    @Test
    public void testAddUniqueAndDuplicate() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        
        // Add unique item (should succeed, return true)
        assertTrue(list.add("Item1"));
        assertEquals(1, list.size());

        // Add duplicate item (should be ignored, return false)
        assertFalse(list.add("Item1"));
        assertEquals(1, list.size());

        // Add unique item at specific index
        list.add(0, "Item2");
        assertEquals(2, list.size());
        assertEquals("Item2", list.get(0));

        // Add duplicate item at specific index (should be ignored)
        list.add(0, "Item1");
        assertEquals(2, list.size());
        assertEquals("Item2", list.get(0)); // unchanged position 0
    }

    @Test
    public void testAddAllCollection() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        List source = Arrays.asList("B", "A", "C", "B");
        boolean changed = list.addAll(source);

        assertTrue(changed);
        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));

        // AddAll with index
        List source2 = Arrays.asList("D", "A");
        boolean changedWithIndex = list.addAll(1, source2);
        assertTrue(changedWithIndex);
        assertEquals(4, list.size());
        assertEquals("D", list.get(1));
    }

    // --- Tests for set() method (Complex branches: pos != -1 && pos != index) ---

    @Test
    public void testSetMethodReplacingExistingElement() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A"); // index 0
        list.add("B"); // index 1
        list.add("C"); // index 2

        // Replace index 0 with "B" (which is already at index 1, so pos = 1, index = 0 -> pos != -1 && pos != index)
        Object removed = list.set(0, "B");
        assertEquals("A", removed);
        assertEquals(2, list.size());
        assertEquals("B", list.get(0));
        assertEquals("C", list.get(1));
        assertFalse(list.contains("A"));
    }

    @Test
    public void testSetMethodSelfReplacement() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A"); // index 0

        // Replace index 0 with "A" itself (pos = 0, index = 0 -> pos == index)
        Object removed = list.set(0, "A");
        assertEquals("A", removed);
        assertEquals(1, list.size());
        assertEquals("A", list.get(0));
    }

    @Test
    public void testSetMethodBrandNewElement() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A"); // index 0

        // Replace index 0 with "X" (not present, pos = -1)
        Object removed = list.set(0, "X");
        assertEquals("A", removed);
        assertEquals(1, list.size());
        assertEquals("X", list.get(0));
        assertFalse(list.contains("A"));
        assertTrue(list.contains("X"));
    }

    // --- Tests for Removals and Bulk Operations ---

    @Test
    public void testRemoveOperations() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        // Remove by object
        assertTrue(list.remove("A"));
        assertFalse(list.contains("A"));
        assertEquals(1, list.size());

        // Remove by index
        Object removedObj = list.remove(0);
        assertEquals("B", removedObj);
        assertTrue(list.isEmpty());
        assertFalse(list.contains("B"));

        // RemoveAll & RetainAll & Clear
        list.addAll(Arrays.asList("X", "Y", "Z"));
        assertTrue(list.removeAll(Arrays.asList("X", "Y")));
        assertEquals(1, list.size());

        assertTrue(list.retainAll(Arrays.asList("Z")));
        assertEquals(1, list.size());

        list.clear();
        assertTrue(list.isEmpty());
        assertTrue(list.asSet().isEmpty());
    }

    // --- Tests for Iterators and SubList ---

    @Test
    public void testIteratorsAndRemoval() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.addAll(Arrays.asList("A", "B", "C"));

        // Standard Iterator remove
        Iterator it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.remove();
        assertFalse(list.contains("A"));
        assertEquals(2, list.size());

        // ListIterator next, previous and remove
        ListIterator lit = list.listIterator();
        assertTrue(lit.hasNext());
        assertEquals("B", lit.next());
        lit.remove();
        assertFalse(list.contains("B"));

        // ListIterator add (via inner class SetListListIterator)
        ListIterator litAdd = list.listIterator();
        litAdd.add("D"); // Unique add
        assertTrue(list.contains("D"));
        litAdd.add("D"); // Duplicate add (should be ignored)
        assertEquals(2, list.size()); // C and D remain

        // ListIterator set (should throw UnsupportedOperationException)
        try {
            litAdd.set("E");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSubList() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.addAll(Arrays.asList("A", "B", "C", "D"));

        List sub = list.subList(1, 3);
        assertNotNull(sub);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
    }
}