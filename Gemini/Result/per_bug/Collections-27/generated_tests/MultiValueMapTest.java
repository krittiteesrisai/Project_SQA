package org.apache.commons.collections4.map;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.MultiMap;
import org.junit.Test;

public class MultiValueMapTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactory() {
        new MultiValueMap<String, String>(new HashMap<String, Object>(), null);
    }

    @Test
    public void testFactoryCreationAndMultiValueMapConstructors() {
        MultiValueMap<String, String> map1 = new MultiValueMap<String, String>();
        assertNotNull(map1);

        MultiValueMap<String, String> map2 = MultiValueMap.multiValueMap(new HashMap<String, Object>());
        assertNotNull(map2);

        MultiValueMap<String, String> map3 = MultiValueMap.multiValueMap(new HashMap<String, Collection<String>>(), ArrayList.class);
        assertNotNull(map3);

        MultiValueMap<String, String> map4 = MultiValueMap.multiValueMap(new HashMap<String, Collection<String>>(), new Factory<ArrayList<String>>() {
            @Override
            public ArrayList<String> create() {
                return new ArrayList<String>();
            }
        });
        assertNotNull(map4);
    }

    @Test
    public void testPutAndGetCollection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        
        // Branch: coll == null (First value for key)
        Object added1 = map.put("key1", "value1");
        assertEquals("value1", added1);
        
        // Branch: coll != null (Subsequent value for key)
        Object added2 = map.put("key1", "value2");
        assertEquals("value2", added2);

        Collection<String> col = map.getCollection("key1");
        assertNotNull(col);
        assertTrue(col.contains("value1"));
        assertTrue(col.contains("value2"));
        assertEquals(2, map.size("key1"));
        
        // Non-existent key
        assertNull(map.getCollection("nonExistent"));
        assertEquals(0, map.size("nonExistent"));
    }

    @Test
    public void testContainsValue() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");
        map.put("key2", "val2");

        assertTrue(map.containsValue("val1"));
        assertTrue(map.containsValue("val2"));
        assertFalse(map.containsValue("notPresent"));

        assertTrue(map.containsValue("key1", "val1"));
        assertFalse(map.containsValue("key1", "val2"));
        assertFalse(map.containsValue("nonExistentKey", "val1"));
    }

    @Test
    public void testRemoveMapping() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");
        map.put("key1", "val2");

        // Remove non-existent key
        assertFalse(map.removeMapping("nonExistent", "val1"));

        // Remove non-existent value for existing key
        assertFalse(map.removeMapping("key1", "val3"));

        // Remove valid mapping but key still has values
        assertTrue(map.removeMapping("key1", "val1"));
        assertTrue(map.containsKey("key1"));

        // Remove last value, should remove key as well
        assertTrue(map.removeMapping("key1", "val2"));
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testPutAllKeyAndCollection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();

        // Null or empty values collection
        assertFalse(map.putAll("key1", null));
        assertFalse(map.putAll("key1", new ArrayList<String>()));

        // PutAll with new key (coll == null)
        boolean changed1 = map.putAll("key1", Arrays.asList("a", "b"));
        assertTrue(changed1);
        assertEquals(2, map.size("key1"));

        // PutAll with existing key (coll != null)
        boolean changed2 = map.putAll("key1", Arrays.asList("c"));
        assertTrue(changed2);
        assertEquals(3, map.size("key1"));
    }

    @Test
    public void testPutAllMap() {
        // Standard Map
        Map<String, String> standardMap = new HashMap<String, String>();
        standardMap.put("k1", "v1");
        standardMap.put("k2", "v2");

        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.putAll(standardMap);
        assertEquals(1, map.size("k1"));

        // MultiMap instance
        MultiValueMap<String, String> multiMapSrc = new MultiValueMap<String, String>();
        multiMapSrc.put("mk1", "mv1");

        MultiValueMap<String, String> map2 = new MultiValueMap<String, String>();
        map2.putAll((Map<String, Object>) (Map<?, ?>) multiMapSrc);
        assertEquals(1, map2.size("mk1"));
    }

    @Test
    public void testIterators() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");
        map.put("key1", "val2");

        // Iterator for specific key (exists)
        Iterator<String> itKey = map.iterator("key1");
        assertNotNull(itKey);
        assertTrue(itKey.hasNext());
        assertEquals("val1", itKey.next());

        // Iterator for specific key (does not exist -> EmptyIterator)
        Iterator<String> itMissing = map.iterator("missing");
        assertNotNull(itMissing);
        assertFalse(itMissing.hasNext());

        // Global iterator over all entries
        Iterator<Map.Entry<String, String>> globalIt = map.iterator();
        assertNotNull(globalIt);
        assertTrue(globalIt.hasNext());
        Map.Entry<String, String> entry = globalIt.next();
        assertNotNull(entry.getKey());
        assertNotNull(entry.getValue());

        // Test entry.setValue throws UnsupportedOperationException
        try {
            entry.setValue("newVal");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testValuesViewAndClear() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");
        map.put("key2", "val2");

        assertEquals(2, map.totalSize());

        Collection<Object> values = map.values();
        assertNotNull(values);
        assertEquals(2, values.size());

        // Test values clear / map clear
        map.clear();
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testValuesIteratorRemove() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("key1", "val1");

        Iterator<String> it = map.iterator("key1");
        assertTrue(it.hasNext());
        assertEquals("val1", it.next());
        it.remove();

        // Key should be removed automatically when collection becomes empty via ValuesIterator.remove()
        assertFalse(map.containsKey("key1"));
    }

    @Test(expected = FunctorException.class)
    public void testReflectionFactoryException() {
        // Pass a class without a default no-arg constructor to trigger instantiation exception
        MultiValueMap<String, PrivateClass> map = MultiValueMap.multiValueMap(
            new HashMap<String, Collection<PrivateClass>>(), 
            PrivateClass.class
        );
        map.put("k", new PrivateClass("test"));
    }

    private static class PrivateClass {
        private final String val;
        public PrivateClass(String val) {
            this.val = val;
        }
    }
}