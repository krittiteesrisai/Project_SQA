package org.apache.commons.collections4.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueListNullList() {
        SetUniqueList.setUniqueList(null);
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
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A"); // duplicate
        list.add("C");
        
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProtectedConstructorNullSet() {
        List<String> list = new ArrayList<String>();
        new SetUniqueList<String>(list, null);
    }

    @Test
    public void testAddAndDuplicateRejection() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        
        assertTrue(uniqueList.add("Item1"));
        assertFalse(uniqueList.add("Item1")); // Duplicate should return false
        assertEquals(1, uniqueList.size());
        
        uniqueList.add(0, "Item2");
        assertEquals(2, uniqueList.size());
        assertEquals("Item2", uniqueList.get(0));
        
        // Try adding duplicate at index
        uniqueList.add(0, "Item1"); // Should be ignored because "Item1" exists at index 1
        assertEquals(2, uniqueList.size());
        assertEquals("Item2", uniqueList.get(0));
        assertEquals("Item1", uniqueList.get(1));
    }

    @Test
    public void testAddAllCollection() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        List<String> source = Arrays.asList("A", "B", "A", "C");
        
        assertTrue(uniqueList.addAll(source));
        assertEquals(3, uniqueList.size());
        assertFalse(uniqueList.addAll(Arrays.asList("A", "B"))); // No changes made
    }

    @Test
    public void testAddAllAtIndex() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("Z");
        
        List<String> source = Arrays.asList("A", "B", "A");
        assertTrue(uniqueList.addAll(0, source));
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("Z", uniqueList.get(2));
    }

    @Test
    public void testSetMethod() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        
        // Set existing item to an index where it causes duplicate repositioning (pos != -1 && pos != index)
        // List is [A, B]. Set index 0 to "B". "B" is at pos 1. Index is 0.
        String removed = uniqueList.set(0, "B");
        assertEquals("A", removed);
        assertEquals(1, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        
        // Set item not in list
        uniqueList.set(0, "C");
        assertEquals("B", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));
    }

    @Test
    public void testRemoveOperations() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        
        // remove by object
        assertTrue(uniqueList.remove("A"));
        assertFalse(uniqueList.remove("Z"));
        
        // remove by index
        uniqueList.add("C");
        String removed = uniqueList.remove(0); // removes "B"
        assertEquals("B", removed);
        
        // removeAll
        uniqueList.add("A");
        uniqueList.add("B");
        assertTrue(uniqueList.removeAll(Arrays.asList("A", "B")));
        assertFalse(uniqueList.removeAll(Arrays.asList("Z")));
    }

    @Test
    public void testRetainAllScenarios() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        
        // Scenario 1: Retain all elements (size matches set size -> returns false)
        assertFalse(uniqueList.retainAll(Arrays.asList("A", "B", "C", "D")));
        
        // Scenario 2: Retain none (size 0 -> triggers clear())
        assertTrue(uniqueList.retainAll(Arrays.asList("X", "Y")));
        assertTrue(uniqueList.isEmpty());
        
        // Scenario 3: Retain partial
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        assertTrue(uniqueList.retainAll(Arrays.asList("A", "B")));
        assertEquals(2, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
        assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void testContainsAndAsSet() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        
        assertTrue(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("B"));
        assertTrue(uniqueList.containsAll(Arrays.asList("A")));
        
        Set<String> setView = uniqueList.asSet();
        assertNotNull(setView);
        assertTrue(setView.contains("A"));
    }

    @Test
    public void testSubListAndCreateSetBasedOnList() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        
        List<String> sub = uniqueList.subList(1, 3);
        assertNotNull(sub);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
        
        // Test custom set reflection branch (e.g., TreeSet instead of HashSet)
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("X");
        treeSet.add("Y");
        List<String> baseList = new ArrayList<String>();
        baseList.add("X");
        baseList.add("Y");
        
        SetUniqueList<String> customSetList = new SetUniqueList<String>(baseList, treeSet);
        List<String> subCustom = customSetList.subList(0, 1);
        assertNotNull(subCustom);
    }

    @Test
    public void testIteratorsAndDecorators() {
        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(new ArrayList<String>());
        uniqueList.add("A");
        uniqueList.add("B");
        
        // Iterator remove
        Iterator<String> it = uniqueList.iterator();
        assertEquals("A", it.next());
        it.remove();
        assertFalse(uniqueList.contains("A"));
        
        // ListIterator
        uniqueList.add("C");
        ListIterator<String> lit = uniqueList.listIterator();
        assertEquals("B", lit.next());
        assertEquals("C", lit.next());
        assertEquals("C", lit.previous());
        
        // ListIterator add
        lit.add("D");
        assertTrue(uniqueList.contains("D"));
        
        // ListIterator add duplicate (should be rejected)
        lit.add("B"); // Already exists
        
        // ListIterator set should throw UnsupportedOperationException
        try {
            lit.set("E");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}