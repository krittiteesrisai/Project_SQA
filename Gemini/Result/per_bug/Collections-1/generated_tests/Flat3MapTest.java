package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.Test;
import org.apache.commons.collections.MapIterator;

public class Flat3MapTest {

    @Test
    public void testEmptyMapOperations() {
        Flat3Map map = new Flat3Map();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("key"));
        assertNull(map.get(null));
        assertFalse(map.containsKey("key"));
        assertFalse(map.containsKey(null));
        assertFalse(map.containsValue("value"));
        assertFalse(map.containsValue(null));
        assertNull(map.remove("key"));
        assertNull(map.remove(null));
        assertEquals("{}", map.toString());
        assertEquals(0, map.hashCode());
    }

    @Test
    public void testPutAndGetFlatMode() {
        Flat3Map map = new Flat3Map();
        assertNull(map.put("A", "ValA"));
        assertNull(map.put(null, "ValNull"));
        assertNull(map.put("B", "ValB"));
        
        assertEquals(3, map.size());
        assertFalse(map.isEmpty());

        assertEquals("ValA", map.get("A"));
        assertEquals("ValNull", map.get(null));
        assertEquals("ValB", map.get("B"));
        assertNull(map.get("NonExistent"));

        assertTrue(map.containsKey("A"));
        assertTrue(map.containsKey(null));
        assertTrue(map.containsKey("B"));
        assertFalse(map.containsKey("C"));

        assertTrue(map.containsValue("ValA"));
        assertTrue(map.containsValue("ValNull"));
        assertTrue(map.containsValue("ValB"));
        assertFalse(map.containsValue("ValC"));
        assertFalse(map.containsValue(null));

        // Update existing keys
        assertEquals("ValA", map.put("A", "NewValA"));
        assertEquals("NewValA", map.get("A"));
        assertEquals("ValNull", map.put(null, "NewValNull"));
        assertEquals("NewValNull", map.get(null));
    }

    @Test
    public void testTransitionToDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        assertEquals(3, map.size());

        // Trigger size 4 -> Delegate Mode
        assertNull(map.put("D", "4"));
        assertEquals(4, map.size());
        assertFalse(map.isEmpty());

        assertEquals("1", map.get("A"));
        assertEquals("2", map.get("B"));
        assertEquals("3", map.get("C"));
        assertEquals("4", map.get("D"));

        assertTrue(map.containsKey("D"));
        assertTrue(map.containsValue("4"));

        // Update in delegate mode
        assertEquals("4", map.put("D", "New4"));
        assertEquals("New4", map.get("D"));

        // Remove in delegate mode
        assertEquals("New4", map.remove("D"));
        assertEquals(3, map.size());
    }

    @Test
    public void testConstructorWithMap() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("K1", "V1");
        source.put("K2", "V2");

        Flat3Map map = new Flat3Map(source);
        assertEquals(2, map.size());
        assertEquals("V1", map.get("K1"));
        assertEquals("V2", map.get("K2"));

        // Test with > 3 elements map constructor
        source.put("K3", "V3");
        source.put("K4", "V4");
        Flat3Map delegateMap = new Flat3Map(source);
        assertEquals(4, delegateMap.size());
        assertEquals("V4", delegateMap.get("K4"));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullMap() {
        new Flat3Map((Map) null);
    }

    @Test
    public void testPutAll() {
        Flat3Map map = new Flat3Map();
        Map<String, String> source = new HashMap<String, String>();
        source.put("1", "A");
        source.put("2", "B");

        map.putAll(source);
        assertEquals(2, map.size());

        // PutAll with empty map
        map.putAll(new HashMap());
        assertEquals(2, map.size());

        // PutAll triggering delegate mode
        Map<String, String> largeSource = new HashMap<String, String>();
        largeSource.put("3", "C");
        largeSource.put("4", "D");
        largeSource.put("5", "E");
        map.putAll(largeSource);
        assertEquals(5, map.size());
    }

    @Test(expected = NullPointerException.class)
    public void testPutAllNull() {
        Flat3Map map = new Flat3Map();
        map.putAll(null);
    }

    @Test
    public void testRemoveFlatMode() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put(null, "2");
        map.put("B", "3");

        // Remove non-existent
        assertNull(map.remove("NonExistent"));

        // Remove middle key (null) when size = 3
        assertEquals("2", map.remove(null));
        assertEquals(2, map.size());
        assertNull(map.get(null));

        // Remove key1 when size = 2
        assertEquals("1", map.remove("A"));
        assertEquals(1, map.size());

        // Remove last key (size = 1 -> 0)
        assertEquals("3", map.remove("B"));
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testRemoveEdgeCases() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        // Remove key3 directly
        assertEquals("3", map.remove("C"));
        
        map.put("C", "3");
        // Remove key2 when size = 3
        assertEquals("2", map.remove("B"));
        
        Flat3Map map2 = new Flat3Map();
        map2.put("A", "1");
        map2.put(null, "2");
        // Remove key1 (null) when size = 2
        assertEquals("2", map2.remove(null));
    }

    @Test
    public void testClear() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());

        // Clear in delegate mode
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4"); // delegate mode
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    public void testMapIterator() {
        Flat3Map map = new Flat3Map();
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());

        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        it = map.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertEquals("A", it.getKey());
        assertEquals("1", it.getValue());

        assertEquals("New1", it.setValue("New1"));
        assertEquals("New1", it.getValue());

        it.remove();
        assertEquals(2, map.size());

        // Delegate mode iterator
        map.put("D", "4");
        MapIterator delegateIt = map.mapIterator();
        assertTrue(delegateIt.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testMapIteratorNoNext() {
        Flat3Map map = new Flat3Map();
        MapIterator it = map.mapIterator();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorInvalidRemove() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        MapIterator it = map.mapIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorInvalidGetKey() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        MapIterator it = map.mapIterator();
        it.getKey();
    }

    @Test
    public void testViewsAndSets() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");

        // KeySet
        Set keySet = map.keySet();
        assertEquals(2, keySet.size());
        assertTrue(keySet.contains("A"));
        keySet.remove("A");
        assertEquals(1, map.size());
        keySet.clear();
        assertTrue(map.isEmpty());

        // Values
        map.put("A", "1");
        Collection values = map.values();
        assertEquals(1, values.size());
        assertTrue(values.contains("1"));
        values.clear();
        assertTrue(map.isEmpty());

        // EntrySet
        map.put("A", "1");
        Set entrySet = map.entrySet();
        assertEquals(1, entrySet.size());
        assertFalse(entrySet.contains("NotAnEntry"));
        
        Iterator entryIt = entrySet.iterator();
        assertTrue(entryIt.hasNext());
        Map.Entry entry = (Map.Entry) entryIt.next();
        assertEquals("A", entry.getKey());
        assertEquals("1", entry.getValue());
        
        entry.setValue("New1");
        assertEquals("New1", map.get("A"));

        assertNotNull(entry.hashCode());
        assertTrue(entry.equals(entry));
        assertFalse(entry.equals(null));

        entrySet.remove(entry);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testDelegateModeViews() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4"); // delegate mode

        assertNotNull(map.keySet());
        assertNotNull(map.values());
        assertNotNull(map.entrySet());
        
        Iterator keyIt = map.keySet().iterator();
        assertTrue(keyIt.hasNext());

        Iterator valIt = map.values().iterator();
        assertTrue(valIt.hasNext());
    }

    @Test
    public void testClone() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        Flat3Map clone = (Flat3Map) map.clone();
        assertEquals(map, clone);

        // Delegate mode clone
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        Flat3Map delegateClone = (Flat3Map) map.clone();
        assertEquals(map, delegateClone);
    }

    @Test
    public void testEqualsAndHashCode() {
        Flat3Map map1 = new Flat3Map();
        Flat3Map map2 = new Flat3Map();

        assertEquals(map1, map1);
        assertEquals(map1, map2);
        assertEquals(map1.hashCode(), map2.hashCode());

        map1.put("A", "1");
        assertNotEquals(map1, map2);
        assertNotEquals(map1, "NotAMap");

        map2.put("A", "1");
        assertEquals(map1, map2);
        assertEquals(map1.hashCode(), map2.hashCode());

        // Different sizes
        map2.put("B", "2");
        assertNotEquals(map1, map2);

        // Delegate mode equals
        map1.put("B", "2");
        map1.put("C", "3");
        map1.put("D", "4");
        map2.put("C", "3");
        map2.put("D", "4");
        assertEquals(map1, map1);
        assertEquals(map1, map2);
        assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void testSerialization() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4"); // delegate mode (>3)

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();
        ois.close();

        assertEquals(map, deserialized);
        assertEquals(4, deserialized.size());
        assertEquals("4", deserialized.get("D"));
    }
    
    @Test
    public void toStringTest() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        assertTrue(map.toString().contains("A=1"));
        
        map.put("B", map); // self reference for branch
        assertTrue(map.toString().contains("(this Map)"));

        map.put("C", "3");
        map.put("D", "4"); // delegate mode
        assertNotNull(map.toString());
    }
}