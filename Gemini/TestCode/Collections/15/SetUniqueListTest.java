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

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test
    public void testDecorateEmptyList() {
        List emptyList = new ArrayList();
        SetUniqueList decorated = SetUniqueList.decorate(emptyList);
        assertNotNull(decorated);
        assertTrue(decorated.isEmpty());
    }

    @Test
    public void testDecorateListWithDuplicates() {
        List listWithDupes = new ArrayList();
        listWithDupes.add("A");
        listWithDupes.add("B");
        listWithDupes.add("A"); // Duplicate

        SetUniqueList decorated = SetUniqueList.decorate(listWithDupes);
        assertEquals(2, decorated.size());
        assertEquals("A", decorated.get(0));
        assertEquals("B", decorated.get(1));
    }

    @Test
    public void testAddUniqueAndDuplicate() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        
        // Add unique -> should return true
        assertTrue(decorated.add("A"));
        assertEquals(1, decorated.size());

        // Add duplicate -> should return false
        assertFalse(decorated.add("A"));
        assertEquals(1, decorated.size());
    }

    @Test
    public void testAddAtIndexUniqueAndDuplicate() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add(0, "A");
        assertEquals(1, decorated.size());

        // Try to add duplicate at index 0, should be ignored
        decorated.add(0, "A");
        assertEquals(1, decorated.size());
        assertEquals("A", decorated.get(0));
    }

    @Test
    public void testAddAllCollection() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        List toAdd = Arrays.asList("A", "B", "A", "C");

        boolean changed = decorated.addAll(toAdd);
        assertTrue(changed);
        assertEquals(3, decorated.size());
        assertEquals("A", decorated.get(0));
        assertEquals("B", decorated.get(1));
        assertEquals("C", decorated.get(2));

        // Adding already existing collection should result in no change
        boolean changedAgain = decorated.addAll(toAdd);
        assertFalse(changedAgain);
    }

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("C");

        List toAdd = Arrays.asList("B", "A"); // A is duplicate
        boolean changed = decorated.addAll(1, toAdd);
        
        assertTrue(changed);
        assertEquals(3, decorated.size());
        assertEquals("A", decorated.get(0));
        assertEquals("B", decorated.get(1));
        assertEquals("C", decorated.get(2));
    }

    @Test
    public void testSetMethodBranches() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");
        decorated.add("C");

        // Branch 1: pos == index (Setting item to its own index)
        Object oldA = decorated.set(0, "A");
        assertEquals("A", oldA);
        assertEquals(3, decorated.size());

        // Branch 2: pos == -1 (Item not in list yet)
        Object oldD = decorated.set(0, "D");
        assertEquals("A", oldD);
        assertEquals("D", decorated.get(0));
        assertFalse(decorated.contains("A"));

        // Branch 3: pos != -1 && pos != index (Item exists elsewhere, shifting/replacing)
        // Current list: [D, B, C]
        // Set index 0 to "C" (which is at index 2)
        Object oldC = decorated.set(0, "C");
        assertEquals("D", oldC);
        assertEquals("C", decorated.get(0));
        assertEquals("B", decorated.get(1));
        assertEquals(2, decorated.size()); // C from index 2 should have been removed
    }

    @Test
    public void testRemovalsAndClear() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");
        decorated.add("C");

        // Remove by object
        assertTrue(decorated.remove("A"));
        assertFalse(decorated.contains("A"));
        assertEquals(2, decorated.size());

        // Remove by index
        Object removedObj = decorated.remove(0);
        assertEquals("B", removedObj);
        assertFalse(decorated.contains("B"));

        // RemoveAll & RetainAll
        decorated.add("X");
        decorated.add("Y");
        assertTrue(decorated.removeAll(Arrays.asList("X")));
        assertFalse(decorated.contains("X"));

        assertTrue(decorated.retainAll(Arrays.asList("C")));
        assertTrue(decorated.contains("C"));

        // Clear
        decorated.clear();
        assertTrue(decorated.isEmpty());
        assertTrue(decorated.asSet().isEmpty());
    }

    @Test
    public void testContainsAndContainsAll() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");

        assertTrue(decorated.contains("A"));
        assertFalse(decorated.contains("Z"));

        assertTrue(decorated.containsAll(Arrays.asList("A", "B")));
        assertFalse(decorated.containsAll(Arrays.asList("A", "Z")));
    }

    @Test
    public void testSubList() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");
        decorated.add("C");

        List sub = decorated.subList(1, 3);
        assertNotNull(sub);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
    }

    @Test
    public void testIteratorsAndDecoratedMethods() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");

        // Standard Iterator
        Iterator it = decorated.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.remove();
        assertFalse(decorated.contains("A"));

        // ListIterator
        ListIterator lit = decorated.listIterator();
        assertTrue(lit.hasNext());
        assertEquals("B", lit.next());
        assertTrue(lit.hasPrevious());
        assertEquals("B", lit.previous());

        // ListIterator add
        lit.add("C");
        assertTrue(decorated.contains("C"));

        // ListIterator unsupported set operation
        try {
            lit.set("D");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}