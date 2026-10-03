package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.Test;

public class TreeListTest {

    // --- 1. Constructor & Collection Tests ---

    @Test
    public void testDefaultConstructor() {
        TreeList<String> list = new TreeList<String>();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
        assertNull(list.toArray()[0] == null ? null : list.toArray()[0]); // array length 0
    }

    @Test(expected = NullPointerException.class)
    public void testCollectionConstructorNull() {
        new TreeList<String>((Collection<String>) null);
    }

    @Test
    public void testCollectionConstructorValid() {
        ArrayList<String> source = new ArrayList<String>();
        source.add("A");
        source.add("B");
        source.add("C");

        TreeList<String> list = new TreeList<String>(source);
        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    // --- 2. Add, Get, Set, and Boundary Index Checks ---

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsNegative() {
        TreeList<String> list = new TreeList<String>();
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsTooLarge() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(1); // valid are 0
    }

    @Test
    public void testAddAndGetBoundaries() {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "First"); // root == null branch
        list.add(0, "Zero");  // insert on left
        list.add(2, "Last");  // insert on right

        assertEquals(3, list.size());
        assertEquals("Zero", list.get(0));
        assertEquals("First", list.get(1));
        assertEquals("Last", list.get(2));
    }

    @Test
    public void testSetElement() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        String old = list.set(0, "Updated");
        assertEquals("A", old);
        assertEquals("Updated", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds() {
        TreeList<String> list = new TreeList<String>();
        list.set(0, "Fail");
    }

    // --- 3. AVL Tree Rotations & Removals (Deep Branch Coverage) ---

    @Test
    public void testComplexInsertionsAndBalancing() {
        TreeList<Integer> list = new TreeList<Integer>();
        // Insert enough elements to trigger AVL rotations (Left, Right, Left-Right, Right-Left)
        for (int i = 0; i < 20; i++) {
            list.add(i, i);
        }
        assertEquals(20, list.size());
        for (int i = 0; i < 20; i++) {
            assertEquals(Integer.valueOf(i), list.get(i));
        }

        // Insert at middle
        list.add(10, 999);
        assertEquals(21, list.size());
        assertEquals(Integer.valueOf(999), list.get(10));
    }

    @Test
    public void testRemoveOperations() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Remove from middle, head, and tail to cover various AVLNode remove branches
        assertEquals("C", list.remove(2)); // remove node with two children
        assertEquals("A", list.remove(0)); // remove min / head
        assertEquals("E", list.remove(list.size() - 1)); // remove max / tail

        assertEquals(2, list.size());
        assertEquals("B", list.get(0));
        assertEquals("D", list.get(1));
        
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    // --- 4. Search & Array Conversion ---

    @Test
    public void testIndexOfAndContains() {
        TreeList<String> list = new TreeList<String>();
        // root == null check in indexOf
        assertEquals(-1, list.indexOf("Test"));
        assertFalse(list.contains("Test"));

        list.add("Apple");
        list.add(null);
        list.add("Banana");

        assertEquals(0, list.indexOf("Apple"));
        assertEquals(1, list.indexOf(null));
        assertEquals(2, list.indexOf("Banana"));
        assertEquals(-1, list.indexOf("Orange"));

        assertTrue(list.contains("Apple"));
        assertTrue(list.contains(null));
        assertFalse(list.contains("Orange"));
    }

    @Test
    public void testToArray() {
        TreeList<String> list = new TreeList<String>();
        Object[] emptyArr = list.toArray();
        assertEquals(0, emptyArr.length);

        list.add("X");
        list.add("Y");
        Object[] arr = list.toArray();
        assertEquals(2, arr.length);
        assertEquals("X", arr[0]);
        assertEquals("Y", arr[1]);
    }

    // --- 5. Iterators and Edge Cases ---

    @Test
    public void testIteratorForwardAndBackward() {
        TreeList<String> list = new TreeList<String>();
        list.add("One");
        list.add("Two");

        ListIterator<String> it = list.listIterator();
        assertTrue(it.hasNext());
        assertFalse(it.hasPrevious());
        assertEquals(0, it.nextIndex());
        assertEquals(-1, it.previousIndex());

        assertEquals("One", it.next());
        assertEquals("Two", it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());

        assertEquals("Two", it.previous());
        assertEquals("One", it.previous());
        assertFalse(it.hasPrevious());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextNoSuchElement() {
        TreeList<String> list = new TreeList<String>();
        ListIterator<String> it = list.listIterator();
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorPreviousNoSuchElement() {
        TreeList<String> list = new TreeList<String>();
        ListIterator<String> it = list.listIterator();
        it.previous();
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNext() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.remove(); // currentIndex == -1
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorSetWithoutCurrent() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.set("New"); // current == null
    }

    @Test
    public void testIteratorAddAndRemoveMutations() {
        TreeList<String> list = new TreeList<String>();
        ListIterator<String> it = list.listIterator();
        
        it.add("Inserted");
        assertEquals(1, list.size());
        assertEquals("Inserted", list.get(0));

        it.previous();
        assertEquals("Inserted", it.next());
        it.remove();
        assertEquals(0, list.size());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModificationException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator();
        list.add("C"); // Modifies modCount directly
        it.next();     // Should trigger checkModCount() -> ConcurrentModificationException
    }
}