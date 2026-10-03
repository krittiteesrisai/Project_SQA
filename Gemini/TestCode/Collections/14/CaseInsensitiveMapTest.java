package org.apache.commons.collections.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

public class CaseInsensitiveMapTest extends TestCase {

    public CaseInsensitiveMapTest(String testName) {
        super(testName);
    }

    // 1. Test Default Constructor
    public void testDefaultConstructor() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    // 2. Test Capacity Constructor (Valid & Invalid Boundaries)
    public void testCapacityConstructor() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10);
        assertTrue(map.isEmpty());

        try {
            new CaseInsensitiveMap(0);
            fail("Expected IllegalArgumentException for capacity < 1");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            new CaseInsensitiveMap(-5);
            fail("Expected IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // 3. Test Capacity and LoadFactor Constructor (Valid & Invalid Boundaries)
    public void testCapacityAndLoadFactorConstructor() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10, 0.75f);
        assertTrue(map.isEmpty());

        try {
            new CaseInsensitiveMap(0, 0.75f);
            fail("Expected IllegalArgumentException for capacity < 1");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            new CaseInsensitiveMap(10, 0.0f);
            fail("Expected IllegalArgumentException for loadFactor <= 0");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            new CaseInsensitiveMap(10, -0.5f);
            fail("Expected IllegalArgumentException for negative loadFactor");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // 4. Test Map Copy Constructor (Null, Normal, and Key Collision)
    public void testMapConstructor() {
        try {
            new CaseInsensitiveMap((Map) null);
            fail("Expected NullPointerException for null map");
        } catch (NullPointerException e) {
            // Expected
        }

        Map<String, String> source = new HashMap<String, String>();
        source.put("Key", "Value1");
        source.put("KEY", "Value2"); // Overwrites "Key" after lowercase conversion
        source.put(null, "NullValue");

        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        assertEquals(2, map.size()); // "key" and null
        assertEquals("Value2", map.get("key"));
        assertEquals("NullValue", map.get(null));
    }

    // 5. Test convertKey and Case Insensitivity (Edge Cases: null, mixed case, non-string)
    public void testCaseInsensitivityAndConvertKey() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        
        map.put("One", "1");
        map.put("TWO", "2");
        map.put(null, "NullVal");
        map.put(Integer.valueOf(123), "IntVal"); // Non-string object key

        assertEquals("1", map.get("one"));
        assertEquals("1", map.get("ONE"));
        assertEquals("1", map.get("OnE"));
        
        assertEquals("2", map.get("two"));
        assertEquals("2", map.get("Two"));

        assertEquals("NullVal", map.get(null));
        assertEquals("IntVal", map.get(Integer.valueOf(123)));

        // Verify containsKey
        assertTrue(map.containsKey("one"));
        assertTrue(map.containsKey(null));
        assertTrue(map.containsKey(123));
        assertFalse(map.containsKey("nonexistent"));

        // Verify remove
        assertEquals("1", map.remove("ONE"));
        assertNull(map.get("one"));
        assertFalse(map.containsKey("one"));
    }

    // 6. Test KeySet behavior (returns lowercase keys and nulls)
    public void testKeySet() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Hello", "World");
        map.put(null, "Nothing");

        Set keySet = map.keySet();
        assertEquals(2, keySet.size());
        assertTrue(keySet.contains("hello"));
        assertTrue(keySet.contains(null));
        assertFalse(keySet.contains("Hello"));
    }

    // 7. Test Clone method
    public void testClone() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Test", "Value");

        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();
        assertNotSame(map, cloned);
        assertEquals(map.size(), cloned.size());
        assertEquals("Value", cloned.get("test"));
    }

    // 8. Test Serialization (writeObject and readObject)
    public void testSerialization() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("SerializeKey", "SerializeValue");
        map.put(null, "NullValue");

        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserializedMap = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertEquals(2, deserializedMap.size());
        assertEquals("SerializeValue", deserializedMap.get("serializekey"));
        assertEquals("NullValue", deserializedMap.get(null));
    }
}