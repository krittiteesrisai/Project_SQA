# MultiValueMapTest.java

```java
package org.apache.commons.collections.map;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link MultiValueMap} (Defects4J: Collections-4b)
 * มุ่งเน้น branch/condition coverage สูงสุดตามซอร์สโค้ดที่ให้มา
 */
public class MultiValueMapTest {

    // ------------------------------------------------------------------
    // Helper: Collection ที่ add() คืนค่า false เสมอ และ size() = 0 เสมอ
    // ใช้ทดสอบ branch "coll.size() > 0" ให้เป็น false ใน put()/putAll(key,values)
    // ------------------------------------------------------------------
    private static class NoAddCollection extends AbstractCollection {
        public Iterator iterator() {
            return new ArrayList().iterator();
        }
        public int size() {
            return 0;
        }
        public boolean add(Object o) {
            return false;
        }
    }

    private static class NoAddFactory implements Factory {
        public Object create() {
            return new NoAddCollection();
        }
    }

    // ==================================================================
    // Static decorate() factory methods
    // ==================================================================

    @Test
    public void testDecorateDefaultMap() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertTrue(multiMap.getCollection("a") instanceof ArrayList);
    }

    @Test
    public void testDecorateWithClass() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), LinkedList.class);
        multiMap.put("a", "1");
        assertTrue(multiMap.getCollection("a") instanceof LinkedList);
    }

    @Test
    public void testDecorateWithFactory() {
        Factory factory = new Factory() {
            public Object create() {
                return new ArrayList();
            }
        };
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), factory);
        multiMap.put("a", "1");
        assertTrue(multiMap.getCollection("a") instanceof ArrayList);
    }

    @Test
    public void testDefaultNoArgConstructor() {
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put("a", "1");
        assertTrue(multiMap.getCollection("a") instanceof ArrayList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullFactory_Throws() {
        // covers: if (collectionFactory == null) throw new IllegalArgumentException
        MultiValueMap.decorate(new HashMap(), (Factory) null);
    }

    // ==================================================================
    // clear()
    // ==================================================================

    @Test
    public void testClear() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("b", "2");
        multiMap.clear();
        assertTrue(multiMap.isEmpty());
        assertEquals(0, multiMap.totalSize());
    }

    // ==================================================================
    // removeMapping(key, value)
    // ==================================================================

    @Test
    public void testRemoveMapping_KeyNotPresent_ReturnsNull() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertNull(multiMap.removeMapping("nokey", "x"));
    }

    @Test
    public void testRemoveMapping_ValueNotInCollection_ReturnsNull() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertNull(multiMap.removeMapping("a", "not-there"));
        assertEquals(1, multiMap.size("a"));
    }

    @Test
    public void testRemoveMapping_RemovesValue_KeyStaysNotEmpty() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        Object removed = multiMap.removeMapping("a", "1");
        assertEquals("1", removed);
        assertTrue(multiMap.containsKey("a"));
        assertEquals(1, multiMap.size("a"));
    }

    @Test
    public void testRemoveMapping_RemovesValue_KeyRemovedWhenEmpty() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Object removed = multiMap.removeMapping("a", "1");
        assertEquals("1", removed);
        assertFalse(multiMap.containsKey("a"));
    }

    // ==================================================================
    // containsValue(Object value)
    // ==================================================================

    @Test
    public void testContainsValue_EmptyMap_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertFalse(multiMap.containsValue("x"));
    }

    @Test
    public void testContainsValue_Found_True() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("b", "2");
        assertTrue(multiMap.containsValue("2"));
    }

    @Test
    public void testContainsValue_NotFound_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertFalse(multiMap.containsValue("999"));
    }

    /**
     * หมายเหตุ: branch "if (pairs == null) return false;" เป็น dead-code
     * ในทางปฏิบัติเพราะ entrySet() ของ Map มาตรฐานไม่คืน null
     * จึงใช้ EasyMock (Nice Mock) จำลอง Map ที่ entrySet() คืน null
     * เพื่อบังคับให้เข้า branch นี้โดยเฉพาะ
     */
    @Test
    public void testContainsValue_NullEntrySet_ReturnsFalse() {
        Map mockMap = createNiceMock(Map.class);
        expect(mockMap.entrySet()).andReturn(null);
        replay(mockMap);

        MultiValueMap multiMap = MultiValueMap.decorate(mockMap);
        assertFalse(multiMap.containsValue("anything"));

        verify(mockMap);
    }

    // ==================================================================
    // put(key, value)
    // ==================================================================

    @Test
    public void testPut_NewKey_ReturnsNull_DueToImplQuirk() {
        // ตามซอร์ส: เมื่อ coll.size() > 0 หลังสร้างใหม่ -> result ถูก reset เป็น false
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        Object result = multiMap.put("a", "1");
        assertNull(result);
        assertTrue(multiMap.getCollection("a").contains("1"));
    }

    @Test
    public void testPut_ExistingKey_ReturnsValue() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Object result = multiMap.put("a", "2");
        assertEquals("2", result);
        assertEquals(2, multiMap.size("a"));
    }

    @Test
    public void testPut_ZeroSizeCollectionFactory_ReturnsNull_NotStored() {
        // covers: if (coll.size() > 0) เป็น false -> ไม่ put ลง map, return null
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), new NoAddFactory());
        Object result = multiMap.put("a", "1");
        assertNull(result);
        assertNull(multiMap.getCollection("a"));
    }

    // ==================================================================
    // putAll(Map map)
    // ==================================================================

    @Test
    public void testPutAllMap_NormalMap_UsesPut() {
        Map normal = new HashMap();
        normal.put("x", "1");
        normal.put("y", "2");

        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.putAll(normal);

        assertEquals(1, multiMap.size("x"));
        assertEquals(1, multiMap.size("y"));
    }

    @Test
    public void testPutAllMap_MultiMapSource_UsesPutAllCollection() {
        MultiValueMap source = MultiValueMap.decorate(new HashMap());
        source.put("a", "1");
        source.put("a", "2");
        source.put("b", "3");

        MultiValueMap dest = MultiValueMap.decorate(new HashMap());
        dest.putAll(source);

        assertEquals(2, dest.size("a"));
        assertEquals(1, dest.size("b"));
    }

    @Test
    public void testPutAllMap_EmptyMap_NoOp() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.putAll(new HashMap());
        assertTrue(multiMap.isEmpty());
    }

    // ==================================================================
    // values()
    // ==================================================================

    @Test
    public void testValues_FirstCallCreatesInstance() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Collection v = multiMap.values();
        assertNotNull(v);
    }

    @Test
    public void testValues_CachedSameInstance() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Collection v1 = multiMap.values();
        Collection v2 = multiMap.values();
        assertSame(v1, v2);
    }

    @Test
    public void testValues_ContentMatchesAllEntries() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        multiMap.put("b", "3");

        Collection allValues = multiMap.values();
        assertEquals(3, allValues.size());

        List actual = new ArrayList();
        for (Iterator it = allValues.iterator(); it.hasNext(); ) {
            actual.add(it.next());
        }
        assertEquals(3, actual.size());
        assertTrue(actual.contains("1"));
        assertTrue(actual.contains("2"));
        assertTrue(actual.contains("3"));
    }

    @Test
    public void testValues_ClearDelegatesToMapClear() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Collection vals = multiMap.values();
        vals.clear();
        assertTrue(multiMap.isEmpty());
        assertEquals(0, multiMap.totalSize());
    }

    // ==================================================================
    // containsValue(key, value)
    // ==================================================================

    @Test
    public void testContainsValueKey_KeyNotPresent_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertFalse(multiMap.containsValue("nokey", "x"));
    }

    @Test
    public void testContainsValueKey_ValuePresent_True() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertTrue(multiMap.containsValue("a", "1"));
    }

    @Test
    public void testContainsValueKey_ValueNotPresent_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertFalse(multiMap.containsValue("a", "2"));
    }

    // ==================================================================
    // getCollection(key)
    // ==================================================================

    @Test
    public void testGetCollection_NotPresent_Null() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertNull(multiMap.getCollection("nokey"));
    }

    @Test
    public void testGetCollection_Present_NotNull() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        assertNotNull(multiMap.getCollection("a"));
        assertTrue(multiMap.getCollection("a").contains("1"));
    }

    // ==================================================================
    // size(key)
    // ==================================================================

    @Test
    public void testSizeKey_NotPresent_Zero() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertEquals(0, multiMap.size("nokey"));
    }

    @Test
    public void testSizeKey_Present_Count() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        assertEquals(2, multiMap.size("a"));
    }

    // ==================================================================
    // putAll(key, Collection values)
    // ==================================================================

    @Test
    public void testPutAllKeyCollection_NullValues_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertFalse(multiMap.putAll("a", null));
    }

    @Test
    public void testPutAllKeyCollection_EmptyValues_False() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertFalse(multiMap.putAll("a", new ArrayList()));
    }

    @Test
    public void testPutAllKeyCollection_NewKey_ResultFalse_DueToImplQuirk() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        List values = new ArrayList();
        values.add("1");
        values.add("2");
        boolean result = multiMap.putAll("a", values);
        assertFalse(result);
        assertEquals(2, multiMap.size("a"));
    }

    @Test
    public void testPutAllKeyCollection_ExistingKey_ResultTrue() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        List values = new ArrayList();
        values.add("2");
        values.add("3");
        boolean result = multiMap.putAll("a", values);
        assertTrue(result);
        assertEquals(3, multiMap.size("a"));
    }

    @Test
    public void testPutAllKeyCollection_ZeroSizeFactory_NotStored() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), new NoAddFactory());
        List values = new ArrayList();
        values.add("1");
        boolean result = multiMap.putAll("a", values);
        assertFalse(result);
        assertNull(multiMap.getCollection("a"));
    }

    // ==================================================================
    // iterator(key)
    // ==================================================================

    @Test
    public void testIterator_KeyNotPresent_ReturnsEmptyIteratorInstance() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        Iterator it = multiMap.iterator("nokey");
        assertSame(EmptyIterator.INSTANCE, it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_KeyPresent_IteratesValues() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        Iterator it = multiMap.iterator("a");
        List collected = new ArrayList();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        assertEquals(2, collected.size());
    }

    @Test
    public void testValuesIteratorRemove_NotEmptyAfter_KeyStays() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        Iterator it = multiMap.iterator("a");
        it.next();
        it.remove();
        assertTrue(multiMap.containsKey("a"));
        assertEquals(1, multiMap.size("a"));
    }

    @Test
    public void testValuesIteratorRemove_EmptyAfter_KeyRemoved() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        Iterator it = multiMap.iterator("a");
        it.next();
        it.remove();
        assertFalse(multiMap.containsKey("a"));
    }

    // ==================================================================
    // totalSize()
    // ==================================================================

    @Test
    public void testTotalSize_EmptyMap_Zero() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        assertEquals(0, multiMap.totalSize());
    }

    @Test
    public void testTotalSize_MultipleKeysAndValues() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap());
        multiMap.put("a", "1");
        multiMap.put("a", "2");
        multiMap.put("b", "3");
        assertEquals(3, multiMap.totalSize());
    }

    // ==================================================================
    // createCollection() ผ่าน ReflectionFactory
    // ==================================================================

    @Test
    public void testCreateCollection_ReflectionFactory_Success() {
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), ArrayList.class);
        multiMap.put("a", "1");
        assertTrue(multiMap.getCollection("a") instanceof ArrayList);
    }

    @Test(expected = FunctorException.class)
    public void testCreateCollection_ReflectionFactory_Failure_AbstractClass() {
        // AbstractList เป็น abstract class -> newInstance() ล้มเหลว -> FunctorException
        MultiValueMap multiMap = MultiValueMap.decorate(new HashMap(), AbstractList.class);
        multiMap.put("a", "1");
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDecorateDefaultMap, testDecorateWithClass, testDecorateWithFactory, testDefaultNoArgConstructor | Static factory methods ทั้ง 3 overload + constructor เริ่มต้น |
| testConstructor_NullFactory_Throws | `if (collectionFactory == null)` → throw IllegalArgumentException |
| testClear | `clear()` ล้าง underlying map |
| testRemoveMapping_KeyNotPresent_ReturnsNull | `if (valuesForKey == null) return null` |
| testRemoveMapping_ValueNotInCollection_ReturnsNull | `if (removed == false) return null` |
| testRemoveMapping_RemovesValue_KeyStaysNotEmpty | `if (valuesForKey.isEmpty())` → false |
| testRemoveMapping_RemovesValue_KeyRemovedWhenEmpty | `if (valuesForKey.isEmpty())` → true, `remove(key)` |
| testContainsValue_EmptyMap_False | loop ไม่ทำงาน → return false |
| testContainsValue_Found_True | `coll.contains(value)` → true, return true กลางลูป |
| testContainsValue_NotFound_False | loop ครบทุก entry, return false |
| testContainsValue_NullEntrySet_ReturnsFalse | `if (pairs == null) return false` (ใช้ EasyMock จำลอง dead-code branch) |
| testPut_NewKey_ReturnsNull_DueToImplQuirk | `coll == null` → create, `coll.size() > 0` true → put + result=false |
| testPut_ExistingKey_ReturnsValue | `coll != null` → else branch |
| testPut_ZeroSizeCollectionFactory_ReturnsNull_NotStored | `coll.size() > 0` → false, ไม่ put ลง map |
| testPutAllMap_NormalMap_UsesPut | `putAll(Map)` else branch (ไม่ใช่ MultiMap) |
| testPutAllMap_MultiMapSource_UsesPutAllCollection | `putAll(Map)` if branch (instanceof MultiMap) |
| testPutAllMap_EmptyMap_NoOp | loop ไม่ execute (0 iteration) |
| testValues_FirstCallCreatesInstance, testValues_CachedSameInstance | `vs != null ? vs : (values = new Values())` ทั้งสอง branch |
| testValues_ContentMatchesAllEntries | `Values.iterator()` + chain ของ ValuesIterator |
| testValues_ClearDelegatesToMapClear | `Values.clear()` → `MultiValueMap.this.clear()` |
| testContainsValueKey_KeyNotPresent_False | `containsValue(key,value)`: `coll == null` → false |
| testContainsValueKey_ValuePresent_True / ValueNotPresent_False | `coll != null` → `coll.contains(value)` true/false |
| testGetCollection_NotPresent_Null / Present_NotNull | `getCollection()` ทั้งสองกรณี |
| testSizeKey_NotPresent_Zero / Present_Count | `size(key)`: `coll == null` true/false |
| testPutAllKeyCollection_NullValues_False / EmptyValues_False | `values == null \|\| values.size() == 0` ทั้งสอง sub-condition |
| testPutAllKeyCollection_NewKey_ResultFalse_DueToImplQuirk | `coll == null` → create, `coll.size() > 0` true |
| testPutAllKeyCollection_ExistingKey_ResultTrue | `coll != null` → else branch |
| testPutAllKeyCollection_ZeroSizeFactory_NotStored | `coll.size() > 0` → false |
| testIterator_KeyNotPresent_ReturnsEmptyIteratorInstance | `!containsKey(key)` → true, return EmptyIterator.INSTANCE |
| testIterator_KeyPresent_IteratesValues | `!containsKey(key)` → false, return ValuesIterator |
| testValuesIteratorRemove_NotEmptyAfter_KeyStays | `ValuesIterator.remove()`: `values.isEmpty()` → false |
| testValuesIteratorRemove_EmptyAfter_KeyRemoved | `ValuesIterator.remove()`: `values.isEmpty()` → true, remove(key) |
| testTotalSize_EmptyMap_Zero / MultipleKeysAndValues | `totalSize()` loop 0 และ >0 iteration |
| testCreateCollection_ReflectionFactory_Success | `ReflectionFactory.create()` try success path |
| testCreateCollection_ReflectionFactory_Failure_AbstractClass | `ReflectionFactory.create()` catch → FunctorException |

**หมายเหตุสำคัญ:** พฤติกรรมที่ `put()`/`putAll(key,values)` คืน `null`/`false` แม้ operation สำเร็จ (เมื่อ `coll.size() > 0` หลังสร้าง collection ใหม่) เป็นพฤติกรรมที่อ่านตรงจากซอร์สโค้ดจริง (มีคอมเมนต์ "only add if non-zero size to maintain class state") จึงไม่ถือเป็นการเดา แต่เป็นการยืนยัน (assert) ตาม logic ที่มีอยู่จริงในคลาส เพื่อดักจับ regression หากมีการแก้ไข behavior นี้ในอนาคต