package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Test;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueListNullList() {
        SetUniqueList.setUniqueList(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        List<String> list = new ArrayList<String>();
        new SetUniqueList<String>(list, null);
    }

    @Test
    public void testSetUniqueListEmptyList() {
        List<String> list = new ArrayList<String>();
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertNotNull(uniqueList);
        assertTrue(uniqueList.isEmpty());
    }

    @Test
    public void testSetUniqueListWithDuplicates() {
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals(3, uniqueList.size());
        assertEquals(Arrays.asList("A", "B", "C"), uniqueList);
    }

    @Test
    public void testAsSet() {
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B"));
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Set<String> setView = uniqueList.asSet();
        assertNotNull(setView);
        assertTrue(setView.contains("A"));
        assertTrue(setView.contains("B"));
        
        // Unmodifiable check
        try {
            setView.add("C");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testAddObjectAndDuplicate() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        assertTrue(uniqueList.add("A"));
        assertFalse(uniqueList.add("A")); // Duplicate should return false
        assertEquals(1, uniqueList.size());
    }

    @Test
    public void testAddAtIndexAndDuplicate() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add(0, "A");
        uniqueList.add(0, "A"); // Duplicate, should be ignored
        assertEquals(1, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
    }

    @Test
    public void testAddAllCollection() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A")));
        boolean changed = uniqueList.addAll(Arrays.asList("A", "B", "C", "B"));
        assertTrue(changed);
        assertEquals(3, uniqueList.size());
        assertEquals(Arrays.asList("A", "B", "C"), uniqueList);

        // Add all existing elements (should not change)
        boolean changedAgain = uniqueList.addAll(Arrays.asList("A", "B"));
        assertFalse(changedAgain);
    }

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "C")));
        boolean changed = uniqueList.addAll(1, Arrays.asList("B", "C", "D"));
        assertTrue(changed);
        assertEquals(Arrays.asList("A", "B", "C", "D"), uniqueList);
    }

    @Test
    public void testSetMethod() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        
        // Move "C" to index 0 (pos = 2, index = 0 -> pos != -1 && pos != index)
        String removed = uniqueList.set(0, "C");
        assertEquals("A", removed);
        assertEquals(Arrays.asList("C", "B"), uniqueList);

        // Set element already at the same index (pos = 0, index = 0 -> pos == index)
        String removedSame = uniqueList.set(0, "C");
        assertEquals("C", removedSame);
        assertEquals(Arrays.asList("C", "B"), uniqueList);

        // Set completely new element
        String removedNew = uniqueList.set(1, "D");
        assertEquals("B", removedNew);
        assertEquals(Arrays.asList("C", "D"), uniqueList);
    }

    @Test
    public void testRemoveObject() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        assertTrue(uniqueList.remove("A"));
        assertFalse(uniqueList.remove("Z"));
        assertEquals(1, uniqueList.size());
    }

    @Test
    public void testRemoveIndex() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        String removed = uniqueList.remove(0);
        assertEquals("A", removed);
        assertEquals(1, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testRemoveAll() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        boolean changed = uniqueList.removeAll(Arrays.asList("A", "C", "Z"));
        assertTrue(changed);
        assertEquals(Arrays.asList("B"), uniqueList);
    }

    @Test
    public void testRetainAllScenarios() {
        // Scenario 1: retainAll results in same size (no change)
        SetUniqueList<String> list1 = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        assertFalse(list1.retainAll(Arrays.asList("A", "B", "C")));

        // Scenario 2: retainAll results in size 0 (clear)
        SetUniqueList<String> list2 = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        assertTrue(list2.retainAll(Arrays.asList("X", "Y")));
        assertTrue(list2.isEmpty());

        // Scenario 3: retainAll partial filtering
        SetUniqueList<String> list3 = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        assertTrue(list3.retainAll(Arrays.asList("A", "C")));
        assertEquals(Arrays.asList("A", "C"), list3);
    }

    @Test
    public void testContainsAndContainsAll() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        assertTrue(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("Z"));
        assertTrue(uniqueList.containsAll(Arrays.asList("A", "B")));
        assertFalse(uniqueList.containsAll(Arrays.asList("A", "Z")));
    }

    @Test
    public void testClear() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        uniqueList.clear();
        assertTrue(uniqueList.isEmpty());
        assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testIterators() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));

        // Test SetListIterator
        Iterator<String> it = uniqueList.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        it.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));

        // Test SetListListIterator
        ListIterator<String> listIt = uniqueList.listIterator();
        assertTrue(listIt.hasNext());
        assertEquals("B", listIt.next());
        assertEquals("B", listIt.previous());
        assertEquals("B", listIt.next());
        
        listIt.remove();
        assertEquals(1, uniqueList.size());

        // Test ListIterator add and Unsupported set
        ListIterator<String> listIt2 = uniqueList.listIterator(1);
        listIt2.add("D");
        listIt2.add("D"); // Duplicate via iterator should be ignored
        assertTrue(uniqueList.contains("D"));

        try {
            listIt2.set("E");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testSubListAndCreateSetBasedOnList() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));
        List<String> sub = uniqueList.subList(1, 3);
        assertNotNull(sub);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
    }
}