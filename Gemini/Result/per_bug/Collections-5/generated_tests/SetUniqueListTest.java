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

import org.junit.Test;

/**
 * High-coverage JUnit 4 Test Suite for SetUniqueList (Collections-5b).
 */
public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorateEmptyList() {
        List<Object> emptyList = new ArrayList<Object>();
        SetUniqueList decorated = SetUniqueList.decorate(emptyList);
        assertNotNull(decorated);
        assertTrue(decorated.isEmpty());
    }

    @Test
    public void testDecorateNonEmptyListWithDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A"); // Duplicate
        
        SetUniqueList decorated = SetUniqueList.decorate(list);
        assertEquals(2, decorated.size());
        assertEquals("A", decorated.get(0));
        assertEquals("B", decorated.get(1));
        assertTrue(decorated.contains("A"));
        assertTrue(decorated.contains("B"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test
    public void testAsSet() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        SetUniqueList decorated = SetUniqueList.decorate(list);
        Set setView = decorated.asSet();
        assertNotNull(setView);
        assertTrue(setView.contains("A"));
    }

    @Test
    public void testAddUniqueAndDuplicate() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        
        // Add unique -> returns true
        assertTrue(decorated.add("Item1"));
        assertEquals(1, decorated.size());
        
        // Add duplicate -> returns false
        assertFalse(decorated.add("Item1"));
        assertEquals(1, decorated.size());
    }

    @Test
    public void testAddAtIndexUniqueAndDuplicate() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add(0, "A");
        decorated.add(0, "B"); // [B, A]
        
        assertEquals(2, decorated.size());
        assertEquals("B", decorated.get(0));
        assertEquals("A", decorated.get(1));
        
        // Try to add duplicate "A" at index 0 (should be ignored)
        decorated.add(0, "A");
        assertEquals(2, decorated.size());
        assertEquals("B", decorated.get(0));
    }

    @Test
    public void testAddAllCollection() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        List<String> toAdd = Arrays.asList("A", "B", "A", "C");
        
        boolean changed = decorated.addAll(toAdd);
        assertTrue(changed);
        assertEquals(3, decorated.size());
        assertEquals(Arrays.asList("A", "B", "C"), decorated);
        
        // Add all existing elements -> should return false
        assertFalse(decorated.addAll(Arrays.asList("A", "B")));
    }

    @Test
    public void testAddAllAtIndexCollection() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("C");
        
        boolean changed = decorated.addAll(1, Arrays.asList("B", "A", "D")); // "A" is duplicate
        assertTrue(changed);
        assertEquals(Arrays.asList("A", "B", "D", "C"), decorated);
    }

    @Test
    public void testSetMethodScenarios() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");
        decorated.add("C");
        // Current: [A, B, C]

        // Scenario 1: pos == -1 (New element not in list)
        Object oldVal1 = decorated.set(0, "X");
        assertEquals("A", oldVal1);
        assertEquals(Arrays.asList("X", "B", "C"), decorated);

        // Scenario 2: pos == index (Setting same element to its own index)
        Object oldVal2 = decorated.set(1, "B");
        assertEquals("B", oldVal2);
        assertEquals(Arrays.asList("X", "B", "C"), decorated);

        // Scenario 3: pos != -1 && pos != index (Moving/swapping existing element)
        // Let's set index 0 to "C" (which is currently at index 2)
        Object oldVal3 = decorated.set(0, "C");
        assertEquals("X", oldVal3);
        // "C" moves to index 0, old "C" at index 2 is removed -> [C, B]
        assertEquals(2, decorated.size());
        assertEquals("C", decorated.get(0));
        assertEquals("B", decorated.get(1));
        assertFalse(decorated.contains("X"));
    }

    @Test
    public void testRemoveOperations() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.add("A");
        decorated.add("B");

        // Remove by Object
        assertTrue(decorated.remove("A"));
        assertFalse(decorated.contains("A"));
        assertEquals(1, decorated.size());

        // Remove by Index
        Object removed = decorated.remove(0);
        assertEquals("B", removed);
        assertTrue(decorated.isEmpty());
        
        // RemoveAll & RetainAll
        decorated.addAll(Arrays.asList("1", "2", "3"));
        assertTrue(decorated.removeAll(Arrays.asList("1")));
        assertEquals(2, decorated.size());

        assertTrue(decorated.retainAll(Arrays.asList("2")));
        assertEquals(1, decorated.size());
        assertEquals("2", decorated.get(0));

        // Clear
        decorated.clear();
        assertTrue(decorated.isEmpty());
        assertFalse(decorated.contains("2"));
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
        decorated.addAll(Arrays.asList("A", "B", "C", "D"));

        List sub = decorated.subList(1, 3);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
    }

    @Test
    public void testIteratorsAndDecorators() {
        SetUniqueList decorated = SetUniqueList.decorate(new ArrayList());
        decorated.addAll(Arrays.asList("A", "B", "C"));

        // Test SetListIterator
        Iterator it = decorated.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.remove(); // Removes "A"
        assertFalse(decorated.contains("A"));

        // Test SetListListIterator
        ListIterator lit = decorated.listIterator();
        assertTrue(lit.hasNext());
        assertEquals("B", lit.next());
        assertEquals("B", lit.previous());
        assertEquals("B", lit.next());
        lit.remove(); // Removes "B"
        assertFalse(decorated.contains("B"));

        // Test ListIterator add (unique vs duplicate)
        ListIterator litAdd = decorated.listIterator();
        litAdd.next(); // past "C"
        litAdd.add("D"); // Unique
        litAdd.add("D"); // Duplicate (should be ignored)
        assertTrue(decorated.contains("D"));

        // Test ListIterator unsupported set operation
        try {
            ListIterator litSet = decorated.listIterator();
            litSet.next();
            litSet.set("X");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}