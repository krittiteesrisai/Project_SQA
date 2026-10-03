package org.apache.commons.collections4.map;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.collections4.OrderedMapIterator;

/**
 * Comprehensive JUnit 4 Test Suite for ListOrderedMap (Defects4J Collections-22b).
 * Aiming for maximum branch/condition coverage and edge case validation.
 */
public class ListOrderedMapTest {

    private ListOrderedMap<String, String> map;

    @Before
    public void setUp() {
        map = new ListOrderedMap<String, String>();
    }

    @Test
    public void testFactoryAndDefaultConstructor() {
        assertNotNull(map);
        assertTrue(map.isEmpty());

        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("A", "Apple");
        ListOrderedMap<String, String> decorated = ListOrderedMap.listOrderedMap(normalMap);
        assertEquals(1, decorated.size());
        assertEquals("Apple", decorated.get("A"));
        assertEquals("A", decorated.firstKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryNullMap() {
        ListOrderedMap.listOrderedMap(null);
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKeyEmptyMap() {
        map.firstKey();
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKeyEmptyMap() {
        map.lastKey();
    }

    @Test
    public void testFirstAndLastKeyNonEmpty() {
        map.put("One", "1");
        map.put("Two", "2");
        assertEquals("One", map.firstKey());
        assertEquals("Two", map.lastKey());
    }

    @Test
    public void testNextAndPreviousKey() {
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        // nextKey branches
        assertEquals("B", map.nextKey("A"));
        assertEquals("C", map.nextKey("B"));
        assertNull(map.nextKey("C")); // at end
        assertNull(map.nextKey("NotExists")); // not found (-1)

        // previousKey branches
        assertNull(map.previousKey("A")); // at start
        assertEquals("A", map.previousKey("B"));
        assertEquals("B", map.previousKey("C"));
        assertNull(map.previousKey("NotExists")); // not found (-1)
    }

    @Test
    public void testPutDuplicateKeyUpdatesValueWithoutChangingOrder() {
        map.put("A", "First");
        map.put("B", "Second");
        assertEquals(2, map.size());
        assertEquals("First", map.get("A"));

        // Re-adding existing key
        String old = map.put("A", "Updated");
        assertEquals("First", old);
        assertEquals("Updated", map.get("A"));
        assertEquals(2, map.size());
        assertEquals("A", map.firstKey()); // Order preserved
    }

    @Test
    public void testPutAllMap() {
        Map<String, String> src = new HashMap<String, String>();
        src.put("X", "10");
        src.put("Y", "20");
        map.putAll(src);
        assertEquals(2, map.size());
        assertEquals("10", map.get("X"));
    }

    @Test
    public void testPutAllWithIndex() {
        map.put("A", "1");
        map.put("C", "3");

        Map<String, String> src = new HashMap<String, String>();
        src.put("B", "2");
        
        // Insert at index 1 (between A and C)
        map.putAll(1, src);
        assertEquals("B", map.get(1));
        assertEquals(3, map.size());
    }

    @Test
    public void testIndexedPutReordering() {
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        // Re-insert existing key "C" at index 0 (pos < index branch vs pos >= index)
        map.put(0, "C", "3-new");
        assertEquals("C", map.firstKey());
        assertEquals("3-new", map.getValue("C"));

        // Re-insert existing key "A" at index 2 (pos < index branch)
        map.put(2, "A", "1-new");
        assertEquals("C", map.get(0));
        assertEquals("B", map.get(1));
        assertEquals("A", map.get(2));
    }

    @Test
    public void testRemoveByKeyAndIndex() {
        map.put("A", "1");
        map.put("B", "2");

        assertNull(map.remove("NotExists"));
        assertEquals("1", map.remove("A"));
        assertEquals(1, map.size());

        map.put("C", "3");
        assertEquals("2", map.remove(0)); // Remove by index
        assertEquals(1, map.size());
        assertEquals("C", map.firstKey());
    }

    @Test
    public void testClear() {
        map.put("A", "1");
        assertFalse(map.isEmpty());
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    public void testViewsAndToString() {
        assertEquals("{}", map.toString());

        map.put("A", "1");
        map.put("B", "2");
        
        assertTrue(map.toString().contains("A=1"));
        assertTrue(map.keySet().contains("A"));
        assertTrue(map.values().contains("2"));
        assertEquals(2, map.keyList().size());
        assertEquals(2, map.valueList().size());
        assertEquals(2, map.asList().size());

        // Test self-reference in toString
        ListOrderedMap<Object, Object> selfMap = new ListOrderedMap<Object, Object>();
        selfMap.put("self", selfMap);
        String str = selfMap.toString();
        assertTrue(str.contains("(this Map)"));
    }

    @Test
    public void testEntrySetViewOperations() {
        map.put("A", "1");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        
        assertFalse(entries.isEmpty());
        assertTrue(entries.contains(map.entrySet().iterator().next()));
        
        // Remove invalid object type from entrySet
        assertFalse(entries.remove("NotAnEntry"));
        
        // Remove valid entry
        Map.Entry<String, String> entryToRemove = entries.iterator().next();
        assertTrue(entries.remove(entryToRemove));
        assertTrue(map.isEmpty());
    }

    @Test
    public void testOrderedMapIteratorEdgeCases() {
        map.put("A", "1");
        map.put("B", "2");

        OrderedMapIterator<String, String> it = map.mapIterator();
        
        // Before next(), calling getState methods should throw IllegalStateException
        try { it.getKey(); fail(); } catch (IllegalStateException e) { /* expected */ }
        try { it.getValue(); fail(); } catch (IllegalStateException e) { /* expected */ }
        try { it.setValue("X"); fail(); } catch (IllegalStateException e) { /* expected */ }
        try { it.remove(); fail(); } catch (IllegalStateException e) { /* expected */ }

        assertEquals("Iterator[]", it.toString());

        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasPrevious() == false); // At first element, listIterator behavior depends on cursor
        
        assertEquals("A", it.getKey());
        assertEquals("1", it.getValue());
        assertEquals("Iterator[A=1]", it.toString());

        it.setValue("1-updated");
        assertEquals("1-updated", map.get("A"));

        // Test remove via iterator
        it.remove();
        assertFalse(map.containsKey("A"));

        // Test reset
        it.reset();
        assertTrue(it.hasNext());
    }

    @Test
    public void testValuesViewMutations() {
        map.put("A", "1");
        map.put("B", "2");
        
        Iterator<String> valIt = map.values().iterator();
        assertTrue(valIt.hasNext());
        assertEquals("1", valIt.next());

        // Test ValuesView methods directly
        assertEquals("2", map.values().toArray()[1]);
        map.values().clear();
        assertTrue(map.isEmpty());
    }
}