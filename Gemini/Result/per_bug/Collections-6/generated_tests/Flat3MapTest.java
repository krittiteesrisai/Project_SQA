package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Flat3MapTest {

    @Test
    public void testBasicPutAndGet() {
        Flat3Map map = new Flat3Map();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());

        map.put("A", "ValueA");
        map.put("B", "ValueB");
        map.put("C", "ValueC");

        Assert.assertEquals(3, map.size());
        Assert.assertEquals("ValueA", map.get("A"));
        Assert.assertEquals("ValueB", map.get("B"));
        Assert.assertEquals("ValueC", map.get("ValueC") == null ? null : map.get("C")); // Safe check
        Assert.assertEquals("ValueC", map.get("C"));
        Assert.assertNull(map.get("NonExistent"));
    }

    @Test
    public void testNullKeyAndValueHandling() {
        Flat3Map map = new Flat3Map();
        map.put(null, "NullKeyValue");
        map.put("KeyNotNull", null);

        Assert.assertEquals(2, map.size());
        Assert.assertEquals("NullKeyValue", map.get(null));
        Assert.assertNull(map.get("KeyNotNull"));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.containsKey("KeyNotNull"));
        Assert.assertTrue(map.containsValue(null));
        Assert.assertTrue(map.containsValue("NullKeyValue"));

        // Update existing null key
        map.put(null, "UpdatedNullKeyValue");
        Assert.assertEquals("UpdatedNullKeyValue", map.get(null));
        Assert.assertEquals(2, map.size());
    }

    @Test
    public void testDelegateModeTransition() {
        Flat3Map map = new Flat3Map();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        Assert.assertEquals(3, map.size());

        // Exceeding size 3 triggers delegate mode (HashMap)
        map.put("4", "Four");
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("Four", map.get("4"));
        Assert.assertTrue(map.containsKey("1"));
        Assert.assertTrue(map.containsValue("Four"));

        // Delegate map put existing key
        map.put("4", "FourUpdated");
        Assert.assertEquals("FourUpdated", map.get("4"));

        // Delegate map remove
        Assert.assertEquals("FourUpdated", map.remove("4"));
        Assert.assertEquals(3, map.size());

        // Clear resets back to flat mode
        map.clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.get("1"));
    }

    @Test
    public void testPutAllAndConstructor() {
        Map<String, String> standardMap = new HashMap<String, String>();
        standardMap.put("X", "XVal");
        standardMap.put("Y", "YVal");
        standardMap.put("Z", "ZVal");
        standardMap.put("W", "WVal"); // Size 4 triggers delegate mode in putAll

        Flat3Map map = new Flat3Map(standardMap);
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("XVal", map.get("X"));

        Flat3Map emptyMap = new Flat3Map();
        emptyMap.putAll(new HashMap<String, String>());
        Assert.assertTrue(emptyMap.isEmpty());
    }

    @Test
    public void testRemoveOperationsInFlatMode() {
        Flat3Map map = new Flat3Map();
        map.put("K1", "V1");
        map.put("K2", "V2");
        map.put("K3", "V3");

        // Remove middle element (size 3)
        Assert.assertEquals("V2", map.remove("K2"));
        Assert.assertEquals(2, map.size());
        Assert.assertNull(map.get("K2"));
        Assert.assertEquals("V3", map.get("K3"));

        // Remove non-existent key
        Assert.assertNull(map.remove("NonExistent"));

        // Remove null key when present
        map.put(null, "NullVal");
        Assert.assertEquals("NullVal", map.remove(null));
        Assert.assertNull(map.get(null));

        // Drain to size 0
        map.remove("K1");
        map.remove("K3");
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.remove("K1"));
    }

    @Test
    public void testIteratorsAndExceptions() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        map.put("B", "2");

        // MapIterator testing
        org.apache.commons.collections.MapIterator it = map.mapIterator();
        Assert.assertTrue(it.hasNext());
        
        // Edge case: calling getKey() before next() / canRemove = false
        try {
            it.getKey();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }

        Assert.assertEquals("A", it.next());
        Assert.assertEquals("A", it.getKey());
        Assert.assertEquals("1", it.getValue());
        
        it.setValue("10");
        Assert.assertEquals("10", it.getValue());

        it.remove();
        Assert.assertEquals(1, map.size());

        // Empty MapIterator
        Flat3Map emptyMap = new Flat3Map();
        Assert.assertFalse(emptyMap.mapIterator().hasNext());

        // EntrySet & KeySet & Values Iterators
        map.clear();
        map.put("K1", "V1");
        
        Set entrySet = map.entrySet();
        Iterator entryIt = entrySet.iterator();
        Assert.assertTrue(entryIt.hasNext());
        Object entry = entryIt.next();
        Assert.assertNotNull(entry.toString());
        
        // Test EntrySet remove invalid obj
        Assert.assertFalse(entrySet.remove("NotAnEntry"));
        
        // Test KeySet/Values remove and contains
        Assert.assertTrue(map.keySet().contains("K1"));
        Assert.assertTrue(map.values().contains("V1"));
        map.keySet().remove("K1");
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testEntrySetIteratorExceptions() {
        Flat3Map map = new Flat3Map();
        map.put("A", "1");
        Iterator it = map.entrySet().iterator();
        
        // HasNext on empty / Exhausted
        // If we call next() twice without elements
        Object nextObj = it.next();
        Assert.assertNotNull(nextObj);
        
        try {
            it.next();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testCloneAndEqualsAndHashCode() {
        Flat3Map map1 = new Flat3Map();
        map1.put("A", "1");
        map1.put("B", "2");

        Flat3Map map2 = (Flat3Map) map1.clone();
        Assert.assertEquals(map1, map2);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
        Assert.assertTrue(map1.equals(map1));
        Assert.assertFalse(map1.equals("NotAMap"));

        Map<String, String> diffSize = new HashMap<String, String>();
        diffSize.put("A", "1");
        Assert.assertFalse(map1.equals(diffSize));

        Map<String, String> diffVal = new HashMap<String, String>();
        diffVal.put("A", "99");
        diffVal.put("B", "2");
        Assert.assertFalse(map1.equals(diffVal));
        
        // Delegate mode clone test
        map1.put("C", "3");
        map1.put("D", "4"); // triggers delegate
        Flat3Map clonedDelegate = (Flat3Map) map1.clone();
        Assert.assertEquals(map1, clonedDelegate);
    }

    @Test
    public void testToStringSelfReference() {
        Flat3Map map = new Flat3Map();
        map.put("selfKey", map);
        map.put(map, "selfVal");

        String str = map.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("(this Map)"));

        // Empty map toString
        Flat3Map empty = new Flat3Map();
        Assert.assertEquals("{}", empty.toString());
        
        // Delegate toString
        map.put("3", "v3");
        map.put("4", "v4"); // delegate mode
        Assert.assertNotNull(map.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("Key1", "Val1");
        map.put("Key2", "Val2");
        map.put("Key3", "Val3");
        map.put("Key4", "Val4"); // Delegate mode serialization check

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();
        ois.close();

        Assert.assertEquals(map.size(), deserialized.size());
        Assert.assertEquals("Val1", deserialized.get("Key1"));
        Assert.assertEquals("Val4", deserialized.get("Key4"));
    }
}