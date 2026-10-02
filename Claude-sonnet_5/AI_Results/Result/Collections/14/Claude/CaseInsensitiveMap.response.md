# CaseInsensitiveMapTest.java

```java
package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link CaseInsensitiveMap}.
 *
 * หมายเหตุ:
 * - ค่า DEFAULT_CAPACITY / DEFAULT_LOAD_FACTOR / DEFAULT_THRESHOLD
 *   เป็น field ภายใน AbstractHashedMap (ไม่ปรากฏใน source ที่ให้มา)
 *   จึงไม่ทดสอบค่าตัวเลขจริงของ default แต่ทดสอบผ่าน behavior ที่สังเกตได้
 * - IllegalArgumentException สำหรับ initialCapacity/loadFactor ที่ผิดพลาด
 *   เป็น behavior จาก super class (AbstractHashedMap) แต่ถูก trigger
 *   จาก constructor ของ CaseInsensitiveMap โดยตรง จึงยังทดสอบไว้เพื่อ
 *   ครอบคลุม branch การเรียก super(...)
 */
public class CaseInsensitiveMapTest {

    // ---------------------------------------------------------
    // Constructor: no-arg
    // ---------------------------------------------------------
    @Test
    public void testDefaultConstructor_EmptyMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    // ---------------------------------------------------------
    // Constructor: initialCapacity
    // ---------------------------------------------------------
    @Test
    public void testConstructor_InitialCapacity_Valid() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testConstructor_InitialCapacity_BoundaryOne() {
        // boundary: minimum valid capacity
        CaseInsensitiveMap map = new CaseInsensitiveMap(1);
        assertTrue(map.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InitialCapacity_Zero_Throws() {
        new CaseInsensitiveMap(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InitialCapacity_Negative_Throws() {
        new CaseInsensitiveMap(-1);
    }

    // ---------------------------------------------------------
    // Constructor: initialCapacity, loadFactor
    // ---------------------------------------------------------
    @Test
    public void testConstructor_CapacityAndLoadFactor_Valid() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(10, 0.5f);
        assertTrue(map.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_LoadFactor_Negative_Throws() {
        new CaseInsensitiveMap(10, -0.1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Capacity_Negative_WithLoadFactor_Throws() {
        new CaseInsensitiveMap(-5, 0.75f);
    }

    // ---------------------------------------------------------
    // Constructor: Map copy
    // ---------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullMap_Throws() {
        new CaseInsensitiveMap((Map) null);
    }

    @Test
    public void testConstructor_CopyMap_EmptySource() {
        Map source = new LinkedHashMap();
        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        assertTrue(map.isEmpty());
    }

    @Test
    public void testConstructor_CopyMap_NormalKeys() {
        Map source = new LinkedHashMap();
        source.put("One", "1");
        source.put("Two", "2");
        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        assertEquals(2, map.size());
        assertEquals("1", map.get("one"));
        assertEquals("1", map.get("ONE"));
        assertEquals("2", map.get("TWO"));
    }

    @Test
    public void testConstructor_CopyMap_DuplicateCaseKeysCollapse() {
        // "One" and "ONE" differ only by case -> should collapse to a single entry
        Map source = new LinkedHashMap();
        source.put("One", "first");
        source.put("ONE", "second"); // overwrites due to same lower-cased key
        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        assertEquals(1, map.size());
        assertEquals("second", map.get("one"));
    }

    @Test
    public void testConstructor_CopyMap_WithNullKey() {
        Map source = new LinkedHashMap();
        source.put(null, "nullValue");
        source.put("Key", "value");
        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        assertEquals(2, map.size());
        assertEquals("nullValue", map.get(null));
        assertEquals("value", map.get("key"));
    }

    // ---------------------------------------------------------
    // convertKey behavior (tested indirectly through put/get/keySet)
    // ---------------------------------------------------------
    @Test
    public void testPutGet_CaseInsensitivity() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");
        map.put("one", "Four"); // overwrites "One" entry due to case-insensitivity

        assertEquals(3, map.size());
        assertEquals("Four", map.get("ONE"));
        assertEquals("Four", map.get("One"));
        assertEquals("Two", map.get("TWO"));
        assertEquals("Three", map.get(null));
    }

    @Test
    public void testPut_NullKey_StoresAndRetrievable() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put(null, "value1");
        assertEquals(1, map.size());
        assertEquals("value1", map.get(null));
    }

    @Test
    public void testPut_NonStringKey_ConvertedViaToString() {
        // convertKey calls key.toString().toLowerCase() for non-null, non-String keys
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Integer intKey = Integer.valueOf(42);
        map.put(intKey, "intValue");
        // toString() of Integer -> "42" -> toLowerCase() -> "42"
        assertEquals("intValue", map.get("42"));
    }

    @Test
    public void testKeySet_ContainsLowercaseKeysAndNull() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "1");
        map.put("Two", "2");
        map.put(null, "3");

        Set keys = map.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("one"));
        assertTrue(keys.contains("two"));
        assertTrue(keys.contains(null));
        assertFalse(keys.contains("One")); // original case should not exist
    }

    @Test
    public void testContainsKey_CaseInsensitive() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Hello", "world");
        assertTrue(map.containsKey("HELLO"));
        assertTrue(map.containsKey("hello"));
        assertFalse(map.containsKey("bye"));
    }

    @Test
    public void testRemove_CaseInsensitive() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Key", "value");
        Object removed = map.remove("KEY");
        assertEquals("value", removed);
        assertTrue(map.isEmpty());
    }

    // ---------------------------------------------------------
    // clone()
    // ---------------------------------------------------------
    @Test
    public void testClone_ShallowCopy_ProducesEqualMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "1");
        map.put(null, "null-val");

        Object clonedObj = map.clone();
        assertTrue(clonedObj instanceof CaseInsensitiveMap);

        CaseInsensitiveMap cloned = (CaseInsensitiveMap) clonedObj;
        assertEquals(map.size(), cloned.size());
        assertEquals("1", cloned.get("ONE"));
        assertEquals("null-val", cloned.get(null));

        // modifying original should not affect clone (shallow map-level independence)
        map.put("Two", "2");
        assertFalse(cloned.containsKey("two"));
    }

    @Test
    public void testClone_EmptyMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Object clonedObj = map.clone();
        assertTrue(clonedObj instanceof CaseInsensitiveMap);
        assertTrue(((CaseInsensitiveMap) clonedObj).isEmpty());
    }

    // ---------------------------------------------------------
    // Serialization (writeObject / readObject)
    // ---------------------------------------------------------
    @Test
    public void testSerialization_RoundTrip_PreservesData() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("One", "1");
        map.put("Two", "2");
        map.put(null, "3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertEquals(map.size(), deserialized.size());
        assertEquals("1", deserialized.get("ONE"));
        assertEquals("2", deserialized.get("TWO"));
        assertEquals("3", deserialized.get(null));
    }

    @Test
    public void testSerialization_EmptyMap_RoundTrip() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertTrue(deserialized.isEmpty());
    }

    // ---------------------------------------------------------
    // Iterator over converted (lowercase) keys - extra check for loop branch
    // ---------------------------------------------------------
    @Test
    public void testIterateKeySet_AllLowerCaseOrNull() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("ABC", "1");
        map.put("DEF", "2");
        map.put(null, "3");

        Iterator it = map.keySet().iterator();
        int nullCount = 0;
        while (it.hasNext()) {
            Object key = it.next();
            if (key == null) {
                nullCount++;
            } else {
                assertEquals(key.toString(), key.toString().toLowerCase());
            }
        }
        assertEquals(1, nullCount);
    }
}
```

## สรุปตาราง Test Method vs Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor_EmptyMap` | Constructor แบบ no-arg → เรียก `super(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR, DEFAULT_THRESHOLD)` |
| `testConstructor_InitialCapacity_Valid` | Constructor(int) กรณีค่าปกติ (>0) |
| `testConstructor_InitialCapacity_BoundaryOne` | Constructor(int) กรณีค่าขอบเขตต่ำสุดที่ valid = 1 |
| `testConstructor_InitialCapacity_Zero_Throws` | Constructor(int) กรณี capacity = 0 → throw `IllegalArgumentException` |
| `testConstructor_InitialCapacity_Negative_Throws` | Constructor(int) กรณี capacity < 0 → throw exception |
| `testConstructor_CapacityAndLoadFactor_Valid` | Constructor(int, float) กรณีค่าปกติ |
| `testConstructor_LoadFactor_Negative_Throws` | Constructor(int, float) กรณี loadFactor < 0 → throw exception |
| `testConstructor_Capacity_Negative_WithLoadFactor_Throws` | Constructor(int, float) กรณี capacity < 0 → throw exception |
| `testConstructor_NullMap_Throws` | Constructor(Map) กรณี map == null → throw `NullPointerException` |
| `testConstructor_CopyMap_EmptySource` | Constructor(Map) กรณี source map ว่าง (loop ไม่ทำงาน) |
| `testConstructor_CopyMap_NormalKeys` | Constructor(Map) กรณี key ปกติหลายตัว (loop ทำงานหลายรอบ) |
| `testConstructor_CopyMap_DuplicateCaseKeysCollapse` | Constructor(Map) กรณี key ต่างแค่ตัวพิมพ์ → `convertKey` ทำให้ key ชนกัน (if-branch key != null) |
| `testConstructor_CopyMap_WithNullKey` | Constructor(Map) กรณีมี null key ผสมกับ key ปกติ (`convertKey` else-branch) |
| `testPutGet_CaseInsensitivity` | `convertKey`: ทั้ง if (key != null) และ else (key == null) branch ผ่าน put/get |
| `testPut_NullKey_StoresAndRetrievable` | `convertKey` else-branch (คืน `AbstractHashedMap.NULL`) |
| `testPut_NonStringKey_ConvertedViaToString` | `convertKey` if-branch เรียก `key.toString().toLowerCase()` กับ non-String object |
| `testKeySet_ContainsLowercaseKeysAndNull` | ตรวจผลลัพธ์ `keySet()` ครอบคลุมทั้ง lowercase key และ null key |
| `testContainsKey_CaseInsensitive` | `containsKey` ผ่าน `convertKey` if-branch |
| `testRemove_CaseInsensitive` | `remove` ผ่าน `convertKey` if-branch |
| `testClone_ShallowCopy_ProducesEqualMap` | `clone()` กรณี map มีข้อมูล (รวม null key) |
| `testClone_EmptyMap` | `clone()` กรณี map ว่าง |
| `testSerialization_RoundTrip_PreservesData` | `writeObject` / `readObject` กรณีมีข้อมูล (รวม null key) |
| `testSerialization_EmptyMap_RoundTrip` | `writeObject` / `readObject` กรณี map ว่าง |
| `testIterateKeySet_AllLowerCaseOrNull` | Loop ผ่าน keySet iterator ตรวจสอบทุก key ว่าเป็น lowercase หรือ null (ครอบคลุม while-loop iteration branch) |

**หมายเหตุเพิ่มเติม:**
- ไม่ได้ทดสอบค่าคงที่ `DEFAULT_CAPACITY`, `DEFAULT_LOAD_FACTOR`, `DEFAULT_THRESHOLD` ตรง ๆ เนื่องจากไม่มีอยู่ใน source ที่ให้มา (อยู่ใน `AbstractHashedMap`)
- Exception ที่ throw จาก `super(...)` (เช่น `IllegalArgumentException`, `NullPointerException`) เป็น behavior ที่มาจาก `AbstractHashedMap` แต่ยังคงทดสอบเพื่อยืนยันว่า constructor ของ `CaseInsensitiveMap` ส่งพารามิเตอร์ต่อไปอย่างถูกต้อง