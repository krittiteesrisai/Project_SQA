package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.functors.ConstantFactory;
import org.junit.Test;

public class MultiValueMapTest {

    @Test
    public void testConstructorNullFactory() {
        try {
            new MultiValueMap(new HashMap(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The factory must not be null", e.getMessage());
        }
    }

    @Test
    public void testDecorateVariants() {
        assertNotNull(MultiValueMap.decorate(new HashMap()));
        assertNotNull(MultiValueMap.decorate(new HashMap(), ArrayList.class));
        assertNotNull(MultiValueMap.decorate(new HashMap(), new ConstantFactory(new ArrayList())));
    }

    @Test
    public void testPutAndGetCollection() {
        MultiValueMap map = new MultiValueMap();
        // Branch: coll == null (New key)
        Object added1 = map.put("key1", "value1");
        assertEquals("value1", added1);

        // Branch: coll != null (Existing key)
        Object added2 = map.put("key1", "value2");
        assertEquals("value2", added2);

        Collection col = map.getCollection("key1");
        assertNotNull(col);
        assertTrue(col.contains("value1"));
        assertTrue(col.contains("value2"));
    }

    @Test
    public void testPutDuplicateValue() {
        MultiValueMap map = new MultiValueMap();
        map.put("key1", "value1");
        // ArrayList allows duplicates by default
        Object added = map.put("key1", "value1");
        assertEquals("value1", added);
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testPutAllMapNormal() {
        MultiValueMap map = new MultiValueMap();
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("k1", "v1");
        normalMap.put("k2", "v2");

        map.putAll(normalMap);
        assertEquals("v1", map.getCollection("k1").iterator().next());
        assertEquals("v2", map.getCollection("k2").iterator().next());
    }

    @Test
    public void testPutAllMapMultiMap() {
        MultiValueMap map1 = new MultiValueMap();
        map1.put("k1", "v1");

        MultiValueMap map2 = new MultiValueMap();
        map2.putAll(map1);

        assertEquals(1, map2.size("k1"));
        assertTrue(map2.containsValue("k1", "v1"));
    }

    @Test
    public void testPutAllKeyAndValues() {
        MultiValueMap map = new MultiValueMap();
        // Branch: values == null or empty
        assertFalse(map.putAll("key1", null));
        assertFalse(map.putAll("key1", new ArrayList()));

        // Branch: coll == null
        Collection<String> values = Arrays.asList("v1", "v2");
        assertTrue(map.putAll("key1", values));
        assertEquals(2, map.size("key1"));

        // Branch: coll != null
        Collection<String> moreValues = Arrays.asList("v3");
        assertTrue(map.putAll("key1", moreValues));
        assertEquals(3, map.size("key1"));
    }

    @Test
    public void testRemoveMapping() {
        MultiValueMap map = new MultiValueMap();
        
        // Branch: valuesForKey == null
        assertNull(map.removeMapping("nonExistentKey", "val"));

        map.put("key1", "val1");
        map.put("key1", "val2");

        // Branch: removed == false
        assertNull(map.removeMapping("key1", "nonExistentVal"));

        // Branch: removed == true, but not empty
        Object removed = map.removeMapping("key1", "val1");
        assertEquals("val1", removed);
        assertTrue(map.containsKey("key1"));

        // Branch: removed == true and becomes empty (removes key)
        Object removedLast = map.removeMapping("key1", "val2");
        assertEquals("val2", removedLast);
        assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testContainsValue() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");

        assertTrue(map.containsValue("v1"));
        assertFalse(map.containsValue("notExist"));

        assertTrue(map.containsValue("k1", "v1"));
        assertFalse(map.containsValue("k1", "notExist"));
        assertFalse(map.containsValue("invalidKey", "v1"));
    }

    @Test
    public void testIteratorAndValuesIteratorRemove() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");

        // Branch: !containsKey(key)
        Iterator emptyIt = map.iterator("invalidKey");
        assertFalse(emptyIt.hasNext());
        assertEquals(EmptyIterator.class, emptyIt.getClass());

        // Branch: containsKey(key) -> ValuesIterator
        Iterator it = map.iterator("k1");
        assertTrue(it.hasNext());
        assertEquals("v1", it.next());

        // Test ValuesIterator.remove() which triggers MultiValueMap.remove(key) when empty
        it.remove();
        assertFalse(map.containsKey("k1"));
    }

    @Test
    public void testValuesViewAndTotalSize() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        assertEquals(3, map.totalSize());

        Collection allValues = map.values();
        assertNotNull(allValues);
        assertEquals(3, allValues.size());

        // Test Values view iterator and clear
        Iterator valuesIt = allValues.iterator();
        assertTrue(valuesIt.hasNext());
        
        allValues.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testClear() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testSerialization() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");

        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiValueMap deserializedMap = (MultiValueMap) ois.readObject();
        ois.close();

        assertNotNull(deserializedMap);
        assertTrue(deserializedMap.containsValue("k1", "v1"));
        assertEquals(1, deserializedMap.size("k1"));
    }
}