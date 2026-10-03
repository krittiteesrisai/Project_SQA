package org.apache.commons.collections4.trie;

import static org.junit.Assert.*;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

import org.junit.Before;
import org.junit.Test;

public class AbstractPatriciaTrieTest {

    private PatriciaTrie<String> trie;

    @Before
    public void setUp() {
        trie = new PatriciaTrie<String>();
    }

    @Test(expected = NullPointerException.class)
    public void testPutNullKeyThrowsException() {
        trie.put(null, "value");
    }

    @Test
    public void testPutAndGetZeroLengthKey() {
        // Zero length key is stored in root
        assertNull(trie.put("", "rootValue"));
        assertEquals("rootValue", trie.get(""));
        assertEquals(1, trie.size());

        // Overwrite root value
        assertEquals("rootValue", trie.put("", "newValue"));
        assertEquals("newValue", trie.get(""));
        assertEquals(1, trie.size());
    }

    @Test
    public void testPutAndGetStandardKeys() {
        assertNull(trie.put("A", "ValA"));
        assertNull(trie.put("B", "ValB"));
        assertNull(trie.put("C", "ValC"));

        assertEquals(3, trie.size());
        assertEquals("ValA", trie.get("A"));
        assertEquals("ValB", trie.get("B"));
        assertEquals("ValC", trie.get("C"));
        assertTrue(trie.containsKey("B"));
        assertFalse(trie.containsKey("Z"));
    }

    @Test
    public void testPutExactMatchExistingKey() {
        trie.put("Test", "Value1");
        assertEquals("Value1", trie.put("Test", "Value2"));
        assertEquals("Value2", trie.get("Test"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testRemoveNullAndNonExistent() {
        assertNull(trie.remove(null));
        assertNull(trie.remove("NonExistent"));

        trie.put("Key", "Val");
        assertNull(trie.remove("OtherKey"));
        assertEquals("Val", trie.remove("Key"));
        assertEquals(0, trie.size());
    }

    @Test
    public void testRemoveExternalAndInternalNodes() {
        trie.put("Romane", "1");
        trie.put("Romanus", "2");
        trie.put("Romulus", "3");
        trie.put("Rubens", "4");
        trie.put("Ruber", "5");

        // Remove external / internal nodes
        assertEquals("2", trie.remove("Romanus"));
        assertEquals("1", trie.remove("Romane"));
        assertEquals(3, trie.size());

        assertNull(trie.get("Romane"));
        assertNull(trie.get("Romanus"));
        assertEquals("3", trie.get("Romulus"));
    }

    @Test
    public void testSelectAndSelectKeyAndValue() {
        trie.put("H", "ValueH");
        trie.put("L", "ValueL");

        // XOR distance test based on Javadoc example
        Map.Entry<String, String> selected = trie.select("D");
        assertNotNull(selected);
        assertEquals("L", selected.getKey());
        assertEquals("ValueL", trie.selectValue("D"));
        assertEquals("L", trie.selectKey("D"));
    }

    @Test
    public void testSelectEmptyTrie() {
        assertNull(trie.select("D"));
        assertNull(trie.selectKey("D"));
        assertNull(trie.selectValue("D"));
    }

    @Test
    public void testCeilingAndFloorAndHigherAndLowerEntries() {
        trie.put("Apple", "1");
        trie.put("Banana", "2");
        trie.put("Cherry", "3");

        // Ceiling
        assertEquals("Banana", trie.ceilingEntry("Banana").getKey());
        assertEquals("Cherry", trie.ceilingEntry("Bat").getKey());
        assertNull(trie.ceilingEntry("Zebra"));

        // Floor
        assertEquals("Banana", trie.floorEntry("Banana").getKey());
        assertEquals("Banana", floorKeySafe("Bat"));
        assertNull(trie.floorEntry("Aardvark"));

        // Higher
        assertEquals("Cherry", trie.higherEntry("Banana").getKey());
        assertEquals("Apple", trie.higherEntry("").getKey());

        // Lower
        assertEquals("Apple", trie.lowerEntry("Banana").getKey());
        assertNull(trie.lowerEntry("Apple"));
        assertNull(trie.lowerEntry(""));
    }

    private String floorKeySafe(String key) {
        var entry = trie.floorEntry(key);
        return entry != null ? entry.getKey() : null;
    }

    @Test
    public void testPrefixMapOperations() {
        trie.put("Test1", "1");
        trie.put("Test2", "2");
        trie.put("Other", "3");

        SortedMap<String, String> prefixMap = trie.prefixMap("Test");
        assertEquals(2, prefixMap.size());
        assertTrue(prefixMap.containsKey("Test1"));
        assertTrue(prefixMap.containsKey("Test2"));
        assertFalse(prefixMap.containsKey("Other"));

        assertEquals("Test1", prefixMap.firstKey());
        assertEquals("Test2", prefixMap.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrefixMapNoSuchElementFirstKey() {
        trie.put("Other", "3");
        SortedMap<String, String> prefixMap = trie.prefixMap("Test");
        prefixMap.firstKey();
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrefixMapNoSuchElementLastKey() {
        trie.put("Other", "3");
        SortedMap<String, String> prefixMap = trie.prefixMap("Test");
        prefixMap.lastKey();
    }

    @Test
    public void testIteratorConcurrentModification() {
        trie.put("A", "1");
        trie.put("B", "2");

        Iterator<String> it = trie.keySet().iterator();
        assertTrue(it.hasNext());
        
        trie.put("C", "3"); // Trigger concurrent modification

        try {
            it.next();
            fail("Expected ConcurrentModificationException");
        } catch (ConcurrentModificationException e) {
            // Expected
        }
    }

    @Test
    public void testIteratorRemove() {
        trie.put("A", "1");
        trie.put("B", "2");

        Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();

        assertEquals(1, trie.size());
        assertFalse(trie.containsKey("A"));
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNextThrowsException() {
        trie.put("A", "1");
        Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        it.remove();
    }

    @Test
    public void testClearTrie() {
        trie.put("A", "1");
        trie.put("B", "2");
        assertEquals(2, trie.size());

        trie.clear();
        assertEquals(0, trie.size());
        assertNull(trie.get("A"));
    }

    @Test
    public void testRangeMapInvalidArguments() {
        trie.put("A", "1");
        trie.put("C", "3");

        try {
            trie.subMap("C", "A");
            fail("Expected IllegalArgumentException for fromKey > toKey");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}