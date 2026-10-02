# MultiValueMapTest.java

```java
import static org.junit.Assert.*;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.map.MultiValueMap;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link MultiValueMap} (Defects4J Collections-27b).
 *
 * หมายเหตุ: ทดสอบเฉพาะพฤติกรรมที่ปรากฏชัดในซอร์สโค้ดที่ให้มาเท่านั้น
 * จุดที่มีความไม่แน่ใจ (เช่น การโยน FunctorException จาก ReflectionFactory)
 * ได้กำกับด้วยคอมเมนต์อธิบายเหตุผลไว้แล้ว
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class MultiValueMapTest {

    private MultiValueMap<String, String> map;

    @Before
    public void setUp() {
        map = new MultiValueMap<String, String>();
    }

    // ============================================================
    // Helper: Collection ที่ add()/addAll() คืนค่า false เสมอ และ size()==0 เสมอ
    // ใช้เพื่อบีบให้ branch "coll.size() > 0" ใน put()/putAll(key, values) เป็น false
    // ============================================================
    private static class NoOpCollection<E> implements Collection<E> {
        @Override public int size() { return 0; }
        @Override public boolean isEmpty() { return true; }
        @Override public boolean contains(Object o) { return false; }
        @Override public Iterator<E> iterator() { return Collections.<E>emptyList().iterator(); }
        @Override public Object[] toArray() { return new Object[0]; }
        @Override public <T> T[] toArray(T[] a) { return a; }
        @Override public boolean add(E e) { return false; }
        @Override public boolean remove(Object o) { return false; }
        @Override public boolean containsAll(Collection<?> c) { return c.isEmpty(); }
        @Override public boolean addAll(Collection<? extends E> c) { return false; }
        @Override public boolean removeAll(Collection<?> c) { return false; }
        @Override public boolean retainAll(Collection<?> c) { return false; }
        @Override public void clear() { }
    }

    private MultiValueMap<String, String> newNoOpValueMap() {
        Factory<NoOpCollection<String>> factory = new Factory<NoOpCollection<String>>() {
            @Override
            public NoOpCollection<String> create() {
                return new NoOpCollection<String>();
            }
        };
        Map<String, Object> backing = new HashMap<String, Object>();
        return MultiValueMap.<String, String, NoOpCollection<String>>multiValueMap(backing, factory);
    }

    // ============================================================
    // Static factory methods
    // ============================================================

    @Test
    public void testStaticFactoryDefault() {
        Map<String, Object> backing = new HashMap<String, Object>();
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(backing);
        mvm.put("k", "v");
        assertEquals("v", mvm.getCollection("k").iterator().next());
    }

    @Test
    public void testStaticFactoryWithClass() {
        Map<String, Object> backing = new HashMap<String, Object>();
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(backing, ArrayList.class);
        mvm.put("k", "v");
        assertTrue(mvm.getCollection("k") instanceof ArrayList);
    }

    @Test
    public void testStaticFactoryWithFactory() {
        Map<String, Object> backing = new HashMap<String, Object>();
        Factory<ArrayList<String>> factory = new Factory<ArrayList<String>>() {
            @Override
            public ArrayList<String> create() {
                return new ArrayList<String>();
            }
        };
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(backing, factory);
        mvm.put("k", "v");
        assertEquals(1, mvm.size("k"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactoryThrows() {
        Map<String, Object> backing = new HashMap<String, Object>();
        Factory<ArrayList<String>> nullFactory = null;
        MultiValueMap.<String, String, ArrayList<String>>multiValueMap(backing, nullFactory);
    }

    @Test(expected = FunctorException.class)
    public void testReflectionFactoryInstantiationFailureWrapsFunctorException() {
        // AbstractCollection เป็น abstract class -> clazz.newInstance() ต้องโยน InstantiationException
        // ซึ่งถูกครอบด้วย FunctorException ตามซอร์สโค้ดของ ReflectionFactory.create()
        Map backing = new HashMap();
        MultiValueMap mvm = MultiValueMap.multiValueMap(backing, AbstractCollection.class);
        mvm.put("k", "v");
    }

    // ============================================================
    // put(key, value)
    // ============================================================

    @Test
    public void testPutNewKeyReturnsValueAndTrueBranch() {
        Object result = map.put("k", "v1");
        assertEquals("v1", result);
        assertTrue(map.containsKey("k"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testPutExistingKeyAppends() {
        map.put("k", "v1");
        Object result = map.put("k", "v2");
        assertEquals("v2", result);
        assertEquals(2, map.size("k"));
    }

    @Test
    public void testPutFalseBranchWhenCollectionStaysEmpty() {
        MultiValueMap<String, String> mvm = newNoOpValueMap();
        Object result = mvm.put("k", "v");
        assertNull(result);
        assertFalse(mvm.containsKey("k"));
    }

    // ============================================================
    // putAll(Map)
    // ============================================================

    @Test
    public void testPutAllNormalMap() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("a", "1");
        source.put("b", "2");
        map.putAll(source);
        assertEquals(1, map.size("a"));
        assertEquals(1, map.size("b"));
    }

    @Test
    public void testPutAllMultiMap() {
        MultiValueMap<String, String> source = new MultiValueMap<String, String>();
        source.put("a", "1");
        source.put("a", "2");
        map.putAll(source);
        assertEquals(2, map.size("a"));
        assertTrue(map.containsValue("a", "1"));
        assertTrue(map.containsValue("a", "2"));
    }

    // ============================================================
    // putAll(key, Collection)
    // ============================================================

    @Test
    public void testPutAllKeyValuesNullReturnsFalse() {
        boolean result = map.putAll("k", null);
        assertFalse(result);
        assertFalse(map.containsKey("k"));
    }

    @Test
    public void testPutAllKeyValuesEmptyReturnsFalse() {
        boolean result = map.putAll("k", new ArrayList<String>());
        assertFalse(result);
        assertFalse(map.containsKey("k"));
    }

    @Test
    public void testPutAllKeyValuesNewKeyTrueBranch() {
        boolean result = map.putAll("k", Arrays.asList("a", "b"));
        assertTrue(result);
        assertEquals(2, map.size("k"));
    }

    @Test
    public void testPutAllKeyValuesExistingKeyAppends() {
        map.put("k", "a");
        boolean result = map.putAll("k", Arrays.asList("b", "c"));
        assertTrue(result);
        assertEquals(3, map.size("k"));
    }

    @Test
    public void testPutAllKeyValuesFalseBranchWhenCollectionStaysEmpty() {
        MultiValueMap<String, String> mvm = newNoOpValueMap();
        boolean result = mvm.putAll("k", Arrays.asList("a", "b"));
        assertFalse(result);
        assertFalse(mvm.containsKey("k"));
    }

    // ============================================================
    // removeMapping(key, value)
    // ============================================================

    @Test
    public void testRemoveMappingKeyNotPresent() {
        assertFalse(map.removeMapping("nokey", "v"));
    }

    @Test
    public void testRemoveMappingValueNotPresent() {
        map.put("k", "v1");
        assertFalse(map.removeMapping("k", "v2"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testRemoveMappingRemovesValueKeepsKey() {
        map.put("k", "v1");
        map.put("k", "v2");
        assertTrue(map.removeMapping("k", "v1"));
        assertTrue(map.containsKey("k"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testRemoveMappingRemovesLastValueRemovesKey() {
        map.put("k", "v1");
        assertTrue(map.removeMapping("k", "v1"));
        assertFalse(map.containsKey("k"));
    }

    // ============================================================
    // containsValue(value)
    // ============================================================

    @Test
    public void testContainsValueEmptyMapFalse() {
        assertFalse(map.containsValue("v"));
    }

    @Test
    public void testContainsValueFound() {
        map.put("k", "v1");
        assertTrue(map.containsValue("v1"));
    }

    @Test
    public void testContainsValueNotFound() {
        map.put("k", "v1");
        assertFalse(map.containsValue("v2"));
    }

    // ============================================================
    // containsValue(key, value)
    // ============================================================

    @Test
    public void testContainsValueKeyOverloadKeyMissing() {
        assertFalse(map.containsValue("nokey", "v"));
    }

    @Test
    public void testContainsValueKeyOverloadValueMissing() {
        map.put("k", "v1");
        assertFalse(map.containsValue("k", "v2"));
    }

    @Test
    public void testContainsValueKeyOverloadFound() {
        map.put("k", "v1");
        assertTrue(map.containsValue("k", "v1"));
    }

    // ============================================================
    // getCollection(key)
    // ============================================================

    @Test
    public void testGetCollectionMissingKeyReturnsNull() {
        assertNull(map.getCollection("nokey"));
    }

    @Test
    public void testGetCollectionExistingKey() {
        map.put("k", "v1");
        assertNotNull(map.getCollection("k"));
    }

    // ============================================================
    // size(key)
    // ============================================================

    @Test
    public void testSizeKeyMissingIsZero() {
        assertEquals(0, map.size("nokey"));
    }

    @Test
    public void testSizeKeyPresent() {
        map.put("k", "v1");
        map.put("k", "v2");
        assertEquals(2, map.size("k"));
    }

    // ============================================================
    // iterator(key)
    // ============================================================

    @Test
    public void testIteratorKeyNotContainedIsEmpty() {
        Iterator<String> it = map.iterator("nokey");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorKeyContained() {
        map.put("k", "v1");
        map.put("k", "v2");
        Iterator<String> it = map.iterator("k");
        List<String> collected = new ArrayList<String>();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        assertEquals(2, collected.size());
        assertTrue(collected.contains("v1"));
        assertTrue(collected.contains("v2"));
    }

    // ============================================================
    // iterator() : all mappings
    // ============================================================

    @Test
    public void testIteratorAllMappingsEmptyMap() {
        Iterator<Map.Entry<String, String>> it = map.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorAllMappings() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            count++;
            try {
                entry.setValue("x");
                fail("expected UnsupportedOperationException");
            } catch (UnsupportedOperationException expected) {
                // ตามซอร์สโค้ด setValue ต้องโยน UnsupportedOperationException เสมอ
            }
        }
        assertEquals(3, count);
    }

    // ============================================================
    // totalSize()
    // ============================================================

    @Test
    public void testTotalSizeEmpty() {
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeMultipleKeys() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        assertEquals(3, map.totalSize());
    }

    // ============================================================
    // values()
    // ============================================================

    @Test
    public void testValuesViewIsCached() {
        Collection<Object> v1 = map.values();
        Collection<Object> v2 = map.values();
        assertSame(v1, v2);
    }

    @Test
    public void testValuesViewSizeReflectsTotalSize() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("b", "3");
        Collection<Object> values = map.values();
        assertEquals(3, values.size());
    }

    @Test
    public void testValuesViewClearClearsMap() {
        map.put("a", "1");
        Collection<Object> values = map.values();
        values.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testValuesViewIterator() {
        map.put("a", "1");
        map.put("b", "2");
        Collection<Object> values = map.values();
        List<Object> collected = new ArrayList<Object>();
        for (Object o : values) {
            collected.add(o);
        }
        assertEquals(2, collected.size());
        assertTrue(collected.contains("1"));
        assertTrue(collected.contains("2"));
    }

    // ============================================================
    // clear()
    // ============================================================

    @Test
    public void testClear() {
        map.put("a", "1");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
    }

    // ============================================================
    // entrySet()
    // ============================================================

    @Test
    public void testEntrySet() {
        map.put("a", "1");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        assertEquals(1, entries.size());
        Map.Entry<String, Object> entry = entries.iterator().next();
        assertEquals("a", entry.getKey());
        assertTrue(entry.getValue() instanceof Collection);
    }

    // ============================================================
    // ValuesIterator.remove()
    // ============================================================

    @Test
    public void testValuesIteratorRemoveKeepsKeyWhenNotEmpty() {
        map.put("k", "v1");
        map.put("k", "v2");
        Iterator<String> it = map.iterator("k");
        it.next();
        it.remove();
        assertTrue(map.containsKey("k"));
        assertEquals(1, map.size("k"));
    }

    @Test
    public void testValuesIteratorRemoveRemovesKeyWhenEmpty() {
        map.put("k", "v1");
        Iterator<String> it = map.iterator("k");
        it.next();
        it.remove();
        assertFalse(map.containsKey("k"));
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testStaticFactoryDefault/WithClass/WithFactory | Static factory overloads ทั้ง 3 รูปแบบ |
| testConstructorNullFactoryThrows | Constructor: `collectionFactory == null` → true (throw IAE) |
| testReflectionFactoryInstantiationFailureWrapsFunctorException | `ReflectionFactory.create()`: catch(Exception) → FunctorException |
| testPutNewKeyReturnsValueAndTrueBranch | `put()`: `coll == null` → true, `coll.size() > 0` → true |
| testPutExistingKeyAppends | `put()`: `coll == null` → false (else branch) |
| testPutFalseBranchWhenCollectionStaysEmpty | `put()`: `coll.size() > 0` → false |
| testPutAllNormalMap | `putAll(Map)`: `map instanceof MultiMap` → false |
| testPutAllMultiMap | `putAll(Map)`: `map instanceof MultiMap` → true |
| testPutAllKeyValuesNullReturnsFalse | `putAll(key,values)`: `values == null` → true |
| testPutAllKeyValuesEmptyReturnsFalse | `putAll(key,values)`: `values.size()==0` → true |
| testPutAllKeyValuesNewKeyTrueBranch | `putAll(key,values)`: `coll==null`→true, `coll.size()>0`→true |
| testPutAllKeyValuesExistingKeyAppends | `putAll(key,values)`: `coll==null`→false (else) |
| testPutAllKeyValuesFalseBranchWhenCollectionStaysEmpty | `putAll(key,values)`: `coll.size()>0`→false |
| testRemoveMappingKeyNotPresent | `removeMapping()`: `valuesForKey==null`→true |
| testRemoveMappingValueNotPresent | `removeMapping()`: `removed==false`→true |
| testRemoveMappingRemovesValueKeepsKey | `removeMapping()`: `valuesForKey.isEmpty()`→false |
| testRemoveMappingRemovesLastValueRemovesKey | `removeMapping()`: `valuesForKey.isEmpty()`→true |
| testContainsValueEmptyMapFalse/Found/NotFound | `containsValue(value)`: loop 0 iterations, contains true/false |
| testContainsValueKeyOverload* | `containsValue(key,value)`: `coll==null`→true/false |
| testGetCollectionMissingKeyReturnsNull/ExistingKey | `getCollection()` ทั้งสองผลลัพธ์ |
| testSizeKeyMissingIsZero/Present | `size(key)`: `coll==null`→true/false |
| testIteratorKeyNotContainedIsEmpty | `iterator(key)`: `!containsKey(key)`→true |
| testIteratorKeyContained | `iterator(key)`: `!containsKey(key)`→false |
| testIteratorAllMappingsEmptyMap | `iterator()`: `keyIterator.hasNext()`→false ทันที |
| testIteratorAllMappings | `iterator()`: loop ทุก key, `setValue` throw UOE |
| testTotalSizeEmpty/MultipleKeys | `totalSize()` loop 0/หลาย iteration |
| testValuesViewIsCached | `values()`: `vs != null`→true (cache) |
| testValuesViewSizeReflectsTotalSize | `Values.size()` → `totalSize()` |
| testValuesViewClearClearsMap | `Values.clear()` → `MultiValueMap.this.clear()` |
| testValuesViewIterator | `Values.iterator()` loop keySet |
| testClear | `clear()` → `decorated().clear()` |
| testEntrySet | `entrySet()` (super call) |
| testValuesIteratorRemoveKeepsKeyWhenNotEmpty | `ValuesIterator.remove()`: `values.isEmpty()`→false |
| testValuesIteratorRemoveRemovesKeyWhenEmpty | `ValuesIterator.remove()`: `values.isEmpty()`→true |

**หมายเหตุ:** บาง branch เช่น `pairs != null` ใน `containsValue(value)` ไม่สามารถบีบให้เป็น false ได้จริงในสถานการณ์ปกติ เพราะ `entrySet()` ของ decorated map ไม่คืนค่า null ตามสัญญาของ `java.util.Map` — จึงไม่ได้เขียนเทสแยกสำหรับกรณีนี้ (คงไว้เป็น implicit true เท่านั้น)