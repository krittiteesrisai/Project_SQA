package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.MultiMap;

/**
 * Comprehensive JUnit 4 Test Suite for MultiValueMap focusing on 
 * Branch/Condition Coverage and Edge Cases (Defects4J: Collections-4b).
 */
public class MultiValueMapTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactory() {
        // Edge Case: Null collection factory should throw IllegalArgumentException
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testDecorateMethods() {
        MultiValueMap map1 = MultiValueMap.decorate(new HashMap());
        assertNotNull(map1);

        MultiValueMap map2 = MultiValueMap.decorate(new HashMap(), ArrayList.class);
        assertNotNull(map2);

        MultiValueMap map3 = MultiValueMap.decorate(new HashMap(), new Factory() {
            public Object create() {
                return new ArrayList();
            }
        });
        assertNotNull(map3);
    }

    @Test
    public void testPutAndGetCollection() {
        MultiValueMap map = new MultiValueMap();
        
        // Branch: coll == null (First insert)
        Object added1 = map.put("key1", "value1");
        // Note: Depending on implementation details, put might return value or null on first add
        assertNotNull(map.getCollection("key1"));
        assertEquals(1, map.size("key1"));

        // Branch: coll != null (Subsequent insert)
        Object added2 = map.put("key1", "value2");
        assertEquals(2, map.size("key1"));
        assertTrue(map.containsValue("key1", "value2"));
    }

    @Test
    public void testRemoveMappingEdgeCases() {
        MultiValueMap map = new MultiValueMap();
        
        // Branch: valuesForKey == null
        assertNull(map.removeMapping("nonExistentKey", "val"));

        map.put("key1", "val1");
        
        // Branch: removed == false (Value not present in collection)
        assertNull(map.removeMapping("key1", "nonExistentVal"));

        // Branch: valuesForKey.isEmpty() becomes true -> removes key from map
        Object removed = map.removeMapping("key1", "val1");
        assertEquals("val1", removed);
        assertNull(map.getCollection("key1"));
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testContainsValue() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        
        assertTrue(map.containsValue("v1"));
        assertFalse(map.containsValue("v_not_exist"));
        
        // Test containsValue(key, value)
        assertTrue(map.containsValue("k1", "v1"));
        assertFalse(map.containsValue("k1", "v_not_exist"));
        assertFalse(map.containsValue("k_not_exist", "v1"));
    }

    @Test
    public void testPutAllMapAndMultiMap() {
        MultiValueMap map = new MultiValueMap();
        
        // Normal Map putAll
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("A", "Apple");
        normalMap.put("B", "Banana");
        map.putAll(normalMap);
        assertEquals(1, map.size("A"));

        // MultiMap putAll
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("A", "Apricot");
        
        MultiValueMap targetMap = new MultiValueMap();
        targetMap.putAll(multiMap);
        assertEquals(2, targetMap.size("A"));
    }

    @Test
    public void testPutAllCollectionEdgeCases() {
        MultiValueMap map = new MultiValueMap();
        
        // Branch: values == null or size == 0
        assertFalse(map.putAll("key1", null));
        assertFalse(map.putAll("key1", Collections.EMPTY_LIST));

        // Branch: coll == null with valid collection
        boolean changed = map.putAll("key2", Arrays.asList("v1", "v2"));
        // Depending on implementation, returns addAll result or false due to size check
        assertEquals(2, map.size("key2"));

        // Branch: coll != null with valid collection
        boolean changedAgain = map.putAll("key2", Arrays.asList("v3"));
        assertEquals(3, map.size("key2"));
    }

    @Test
    public void testIteratorAndEmptyIterator() {
        MultiValueMap map = new MultiValueMap();
        
        // Branch: !containsKey(key) -> returns EmptyIterator.INSTANCE
        Iterator emptyIt = map.iterator("missingKey");
        assertNotNull(emptyIt);
        assertFalse(emptyIt.hasNext());

        // Branch: containsKey(key) -> returns ValuesIterator
        map.put("key1", "val1");
        Iterator it = map.iterator("key1");
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("val1", it.next());
    }

    @Test
    public void testValuesIteratorRemoveAndClear() {
        MultiValueMap map = new MultiValueMap();
        map.put("key1", "val1");
        map.put("key1", "val2");

        Iterator it = map.iterator("key1");
        assertTrue(it.hasNext());
        assertEquals("val1", it.next());
        it.remove(); // removes val1, collection not empty yet
        
        assertEquals(1, map.size("key1"));

        assertTrue(it.hasNext());
        assertEquals("val2", it.next());
        it.remove(); // removes val2, collection empty -> should remove key from map
        
        assertFalse(map.containsKey("key1"));

        // Test MultiValueMap clear and totalSize and Values view
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals(2, map.totalSize());

        Collection allValues = map.values();
        assertNotNull(allValues);
        assertEquals(2, allValues.size());

        allValues.clear();
        assertEquals(0, map.totalSize());
    }

    @Test(expected = FunctorException.class)
    public void testReflectionFactoryException() {
        // Edge Case: Class without default constructor to trigger FunctorException in ReflectionFactory
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), UninstantiableClass.class);
        map.put("key", "value"); // Triggers createCollection -> ReflectionFactory.create() -> InstantiationException
    }

    // Helper class for testing ReflectionFactory failure
    public static class UninstantiableClass extends ArrayList {
        public UninstantiableClass(String arg) {
            super();
        }
    }
}