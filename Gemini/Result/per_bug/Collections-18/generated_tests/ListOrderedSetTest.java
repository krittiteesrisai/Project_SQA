package org.apache.commons.collections.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.apache.commons.collections.OrderedIterator;

public class ListOrderedSetTest {

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactorySetNull() {
        ListOrderedSet.listOrderedSet(null, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactoryListNull() {
        ListOrderedSet.listOrderedSet(new HashSet<String>(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactorySetNotEmpty() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        ListOrderedSet.listOrderedSet(set, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactoryListNotEmpty() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        ListOrderedSet.listOrderedSet(new HashSet<String>(), list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetListArgNull() {
        ListOrderedSet.listOrderedSet((List<String>) null);
    }

    @Test
    public void testListOrderedSetListArgWithDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A"); // Duplicate

        ListOrderedSet<String> los = ListOrderedSet.listOrderedSet(list);
        assertEquals(2, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
    }

    @Test
    public void testConstructorsAndAsList() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        assertTrue(los.isEmpty());

        Set<String> set = new HashSet<String>();
        set.add("X");
        ListOrderedSet<String> los2 = new ListOrderedSet<String>(set);
        assertEquals(1, los2.size());
        
        List<String> list = new ArrayList<String>();
        list.add("Y");
        ListOrderedSet<String> los3 = ListOrderedSet.listOrderedSet(set, list); // ผ่านเงื่อนไขว่างทั้งคู่ภายใน Factory แต่นี่ทดสอบ Constructor ผ่าน Factory
        assertNotNull(los3.asList());
    }

    @Test
    public void testAddAndDuplicates() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        assertTrue(los.add("One"));
        assertFalse(los.add("One")); // Duplicate add
        assertEquals(1, los.size());
        assertEquals("One", los.get(0));
        assertEquals(0, los.indexOf("One"));
        assertEquals(-1, los.indexOf("NotFound"));
    }

    @Test
    public void testAddAtIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("C");
        los.add(1, "B"); // แทรกกลาง
        los.add(1, "A"); // ซ้ำ ไม่ควรเพิ่ม

        assertEquals(3, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
    }

    @Test
    public void testAddAllCollection() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        List<String> items = Arrays.asList("A", "B", "A");
        assertTrue(los.addAll(items));
        assertFalse(los.addAll(Arrays.asList("A", "B"))); // ไม่มีอะไรเปลี่ยน
        assertEquals(2, los.size());
    }

    @Test
    public void testAddAllAtIndexCollection() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("D");

        boolean changed = los.addAll(1, Arrays.asList("B", "C", "A"));
        assertTrue(changed);
        assertEquals(4, los.size());
        assertEquals("A", los.get(0));
        assertEquals("B", los.get(1));
        assertEquals("C", los.get(2));
        assertEquals("D", los.get(3));
    }

    @Test
    public void testRemoveObjectAndIndex() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");

        assertTrue(los.remove("A"));
        assertFalse(los.remove("NotExists"));

        Object removedObj = los.remove(0);
        assertEquals("B", removedObj);
        assertTrue(los.isEmpty());
    }

    @Test
    public void testRemoveAll() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");
        los.add("C");

        assertTrue(los.removeAll(Arrays.asList("A", "C")));
        assertEquals(1, los.size());
        assertEquals("B", los.get(0));
    }

    @Test
    public void testRetainAllScenarios() {
        // Scenario 1: retainAll ไม่เปลี่ยนแปลง (returns false)
        ListOrderedSet<String> los1 = new ListOrderedSet<String>();
        los1.add("A");
        assertFalse(los1.retainAll(Arrays.asList("A", "B")));

        // Scenario 2: retainAll ทำให้ Set ว่างเปล่า (collection.size() == 0)
        ListOrderedSet<String> los2 = new ListOrderedSet<String>();
        los2.add("A");
        assertTrue(los2.retainAll(Arrays.asList("B")));
        assertTrue(los2.isEmpty());

        // Scenario 3: retainAll เหลือบางตัว ต้องลบออกจาก setOrder ด้วย
        ListOrderedSet<String> los3 = new ListOrderedSet<String>();
        los3.add("A");
        los3.add("B");
        los3.add("C");
        assertTrue(los3.retainAll(Arrays.asList("A", "C")));
        assertEquals(2, los3.size());
        assertEquals("A", los3.get(0));
        assertEquals("C", los3.get(1));
    }

    @Test
    public void testToArrayMethods() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");

        Object[] arr1 = los.toArray();
        assertEquals(2, arr1.length);

        String[] arr2 = new String[2];
        String[] arr3 = los.toArray(arr2);
        assertSame(arr2, arr3);
        assertEquals("A", arr3[0]);
    }

    @Test
    public void testToStringAndClear() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        assertNotNull(los.toString());

        los.clear();
        assertTrue(los.isEmpty());
    }

    @Test
    public void testIteratorOperations() {
        ListOrderedSet<String> los = new ListOrderedSet<String>();
        los.add("A");
        los.add("B");

        OrderedIterator<String> it = los.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("A", it.previous());
        assertEquals("A", it.next());

        it.remove(); // ทดสอบการลบผ่าน Iterator
        assertEquals(1, los.size());
        assertEquals("B", los.get(0));
    }
}