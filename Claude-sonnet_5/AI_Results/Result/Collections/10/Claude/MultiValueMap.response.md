# MultiValueMapTest.java

```java
package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collection;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite สำหรับ org.apache.commons.collections.map.MultiValueMap
 *
 * หมายเหตุ: เนื่องจากไม่ได้รับซอร์สของ AbstractMapDecorator
 * ทดสอบนี้จึงอ้างอิงเฉพาะ behavior ที่ MultiValueMap ประกาศเอง
 * และใช้เมธอด Map มาตรฐาน (containsKey, get, remove, clear, keySet, entrySet)
 * เพราะเป็นสัญญาของ decorator pattern ตามที่ javadoc ของคลาสระบุไว้
 */
public class MultiValueMapTest {

    private MultiValueMap map;

    @Before
    public void setUp() {
        map = MultiValueMap.decorate(new HashMap());
    }

    // ------------------------------------------------------------------
    // Helper: Collection ที่ "add" แล้วแต่ size() คืน 0 เสมอ
    // ใช้เพื่อบังคับให้เข้ากิ่ง (coll.size() > 0) เป็น false
    // ใน put() และ putAll(key, values) ซึ่งปกติไม่เกิดกับ ArrayList
    // ------------------------------------------------------------------
    private static class NoGrowCollection extends AbstractCollection {
        private final List backing = new ArrayList();

        public Iterator iterator() {
            return backing.iterator();
        }

        public int size() {
            return 0; // แจ้ง size ปลอมเป็น 0 เสมอ เพื่อจำลอง "ไม่ได้เพิ่มจริง"
        }

        public boolean add(Object o) {
            backing.add(o);
            return true;
        }
    }

    // ==================================================================
    // Constructor / decorate() factory methods
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testProtectedConstructorNullFactoryThrows() {
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testDecorateDefaultMapUsesArrayList() {
        MultiValueMap m = MultiValueMap.decorate(new HashMap());
        m.put("k", "1");
        m.put("k", "1"); // ArrayList เก็บซ้ำได้
        assertEquals(2, m.size("k"));
        assertTrue(m.getCollection("k") instanceof ArrayList);
    }

    @Test
    public void testDefaultConstructor() {
        MultiValueMap m = new MultiValueMap();
        m.put("a", "x");
        assertTrue(m.getCollection("a") instanceof ArrayList);
    }

    @Test
    public void testDecorateWithCollectionClass() {
        MultiValueMap m = MultiValueMap.decorate(new HashMap(), LinkedList.class);
        m.put("k", "v");
        assertTrue(m.getCollection("k") instanceof LinkedList);
    }

    @Test(expected = FunctorException.class)
    public void testDecorateWithCollectionClassInstantiationFailure() {
        // Integer ไม่มี no-arg constructor -> ReflectionFactory.create() throw FunctorException
        MultiValueMap m = MultiValueMap.decorate(new HashMap(), Integer.class);
        m.put("k", "v"); // trigger createCollection()
    }

    @Test
    public void testDecorateWithCustomFactory() {
        Factory setFactory = new Factory() {
            public Object create() {
                return new HashSet();
            }
        };
        MultiValueMap m = MultiValueMap.decorate(new HashMap(), setFactory);
        m.put("k", "a");
        m.put("k", "a"); // HashSet ไม่เก็บค่าซ้ำ
        assertEquals(1, m.size("k"));
        assertTrue(m.getCollection("k") instanceof HashSet);
    }

    // ==================================================================
    // put(Object,Object)
    // ==================================================================

    @Test
    public void testPutNewKeyCreatesCollectionAndReturnsValue() {
        Object result = map.put("key", "value");
        assertEquals("value", result);
        assertTrue(map.containsKey("key"));
        assertEquals(1, map.size("key"));
    }

    @Test
    public void testPutExistingKeyAddsToCollection() {
        map.put("key", "v1");
        Object result = map.put("key", "v2");
        assertEquals("v2", result);
        assertEquals(2, map.size("key"));
    }

    @Test
    public void testPutWithNonGrowingCollectionReturnsNullAndSkipsKey() {
        Factory noGrowFactory = new Factory() {
            public Object create() {
                return new NoGrowCollection();
            }
        };
        MultiValueMap m = MultiValueMap.decorate(new HashMap(), noGrowFactory);
        Object result = m.put("key", "value");
        assertNull(result); // coll.size() > 0 == false -> result ยังเป็น false
        assertFalse(m.containsKey("key"));
    }

    // ==================================================================
    // putAll(Map)
    // ==================================================================

    @Test
    public void testPutAllMapNonMultiMap() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        map.putAll(src);
        assertEquals(1, map.size("a"));
        assertEquals(1, map.size("b"));
    }

    @Test
    public void testPutAllMapWithMultiMapSource() {
        MultiValueMap src = MultiValueMap.decorate(new HashMap());
        src.put("k", "1");
        src.put("k", "2");

        map.putAll(src); // src instanceof MultiMap -> ใช้ putAll(key, coll)
        assertEquals(2, map.size("k"));
        assertTrue(map.getCollection("k").contains("1"));
        assertTrue(map.getCollection("k").contains("2"));
    }

    @Test
    public void testPutAllMapEmptySource() {
        Map empty = new HashMap();
        map.putAll(empty);
        assertTrue(map.isEmpty());
    }

    // ==================================================================
    // putAll(Object key, Collection values)
    // ==================================================================

    @Test
    public void testPutAllKeyValuesNullReturnsFalse() {
        boolean result = map.putAll("key", null);
        assertFalse(result);
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testPutAllKeyValuesEmptyCollectionReturnsFalse() {
        boolean result = map.putAll("key", new ArrayList());
        assertFalse(result);
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testPutAllKeyNewKeyCreatesCollection() {
        List values = new ArrayList();
        values.add("a");
        values.add("b");
        boolean result = map.putAll("key", values);
        assertTrue(result);
        assertEquals(2, map.size("key"));
    }

    @Test
    public void testPutAllKeyExistingKeyAddsAll() {
        map.put("key", "existing");
        List values = new ArrayList();
        values.add("a");
        values.add("b");
        boolean result = map.putAll("key", values);
        assertTrue(result);
        assertEquals(3, map.size("key"));
    }

    @Test
    public void testPutAllKeyWithNonGrowingCollectionBranch() {
        Factory noGrowFactory = new Factory() {
            public Object create() {
                return new NoGrowCollection();
            }
        };
        MultiValueMap m = MultiValueMap.decorate(new HashMap(), noGrowFactory);
        List values = new ArrayList();
        values.add("x");
        boolean result = m.putAll("key", values);
        assertFalse(result); // coll.size() > 0 == false
        assertFalse(m.containsKey("key"));
    }

    // ==================================================================
    // removeMapping(Object key, Object value)
    // ==================================================================

    @Test
    public void testRemoveMappingKeyNotPresentReturnsNull() {
        Object result = map.removeMapping("nokey", "value");
        assertNull(result);
    }

    @Test
    public void testRemoveMappingValueNotPresentReturnsNull() {
        map.put("key", "a");
        Object result = map.removeMapping("key", "b");
        assertNull(result);
        assertEquals(1, map.size("key")); // ไม่ถูกกระทบ
    }

    @Test
    public void testRemoveMappingRemovesValueKeepsKeyWhenNonEmpty() {
        map.put("key", "a");
        map.put("key", "b");
        Object result = map.removeMapping("key", "a");
        assertEquals("a", result);
        assertTrue(map.containsKey("key"));
        assertEquals(1, map.size("key"));
    }

    @Test
    public void testRemoveMappingRemovesValueRemovesKeyWhenEmpty() {
        map.put("key", "a");
        Object result = map.removeMapping("key", "a");
        assertEquals("a", result);
        assertFalse(map.containsKey("key"));
        assertNull(map.getCollection("key"));
    }

    // ==================================================================
    // containsValue(Object value)
    // ==================================================================

    @Test
    public void testContainsValueOnEmptyMapReturnsFalse() {
        assertFalse(map.containsValue("x"));
    }

    @Test
    public void testContainsValueFound() {
        map.put("a", "1");
        map.put("b", "2");
        assertTrue(map.containsValue("2"));
    }

    @Test
    public void testContainsValueNotFound() {
        map.put("a", "1");
        assertFalse(map.containsValue("zzz"));
    }

    // ==================================================================
    // containsValue(Object key, Object value)
    // ==================================================================

    @Test
    public void testContainsValueKeyMissingReturnsFalse() {
        assertFalse(map.containsValue("nokey", "v"));
    }

    @Test
    public void testContainsValueKeyPresentValuePresent() {
        map.put("key", "v1");
        assertTrue(map.containsValue("key", "v1"));
    }

    @Test
    public void testContainsValueKeyPresentValueAbsent() {
        map.put("key", "v1");
        assertFalse(map.containsValue("key", "v2"));
    }

    // ==================================================================
    // getCollection(Object key)
    // ==================================================================

    @Test
    public void testGetCollectionMissingKeyReturnsNull() {
        assertNull(map.getCollection("nokey"));
    }

    @Test
    public void testGetCollectionPresentKey() {
        map.put("key", "v1");
        Collection c = map.getCollection("key");
        assertNotNull(c);
        assertTrue(c.contains("v1"));
    }

    // ==================================================================
    // size(Object key)
    // ==================================================================

    @Test
    public void testSizeKeyMissingReturnsZero() {
        assertEquals(0, map.size("nokey"));
    }

    @Test
    public void testSizeKeyPresentReturnsCollectionSize() {
        map.put("key", "a");
        map.put("key", "b");
        assertEquals(2, map.size("key"));
    }

    // ==================================================================
    // totalSize()
    // ==================================================================

    @Test
    public void testTotalSizeEmptyMap() {
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeMultipleKeys() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        assertEquals(3, map.totalSize());
    }

    // ==================================================================
    // iterator(Object key)
    // ==================================================================

    @Test
    public void testIteratorMissingKeyReturnsEmptyIterator() {
        Iterator it = map.iterator("nokey");
        assertSame(EmptyIterator.INSTANCE, it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorPresentKeyIteratesValues() {
        map.put("key", "a");
        map.put("key", "b");
        Iterator it = map.iterator("key");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ==================================================================
    // ValuesIterator.remove()
    // ==================================================================

    @Test
    public void testValuesIteratorRemoveKeepsKeyWhenNonEmpty() {
        map.put("key", "a");
        map.put("key", "b");
        Iterator it = map.iterator("key");
        it.next();
        it.remove();
        assertTrue(map.containsKey("key"));
        assertEquals(1, map.size("key"));
    }

    @Test
    public void testValuesIteratorRemoveRemovesKeyWhenEmpty() {
        map.put("key", "onlyone");
        Iterator it = map.iterator("key");
        it.next();
        it.remove();
        assertFalse(map.containsKey("key"));
    }

    // ==================================================================
    // values() -> Values inner class
    // ==================================================================

    @Test
    public void testValuesViewCachedInstance() {
        Collection v1 = map.values();
        Collection v2 = map.values();
        assertSame(v1, v2); // ควรเป็น instance เดิม (cache)
    }

    @Test
    public void testValuesViewIterationAcrossKeys() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        Collection values = map.values();
        List collected = new ArrayList();
        for (Iterator it = values.iterator(); it.hasNext();) {
            collected.add(it.next());
        }
        assertEquals(3, collected.size());
        assertTrue(collected.contains("1"));
        assertTrue(collected.contains("2"));
        assertTrue(collected.contains("3"));
    }

    @Test
    public void testValuesViewSizeMatchesTotalSize() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("b", "3");
        assertEquals(map.totalSize(), map.values().size());
    }

    @Test
    public void testValuesViewClearClearsUnderlyingMap() {
        map.put("a", "1");
        map.put("b", "2");
        map.values().clear();
        assertFalse(map.containsKey("a"));
        assertFalse(map.containsKey("b"));
        assertEquals(0, map.totalSize());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testProtectedConstructorNullFactoryThrows | Constructor: `collectionFactory == null` → throw IllegalArgumentException |
| testDecorateDefaultMapUsesArrayList | decorate(Map) + ReflectionFactory(ArrayList) success path |
| testDefaultConstructor | Default constructor (HashMap+ArrayList) |
| testDecorateWithCollectionClass | decorate(Map,Class) success (LinkedList) |
| testDecorateWithCollectionClassInstantiationFailure | ReflectionFactory.create() → catch Exception → throw FunctorException |
| testDecorateWithCustomFactory | decorate(Map,Factory) กำหนด collection type เอง |
| testPutNewKeyCreatesCollectionAndReturnsValue | put(): `coll == null` true branch, `coll.size()>0` true |
| testPutExistingKeyAddsToCollection | put(): `coll == null` false → else branch (`coll.add`) |
| testPutWithNonGrowingCollectionReturnsNullAndSkipsKey | put(): `coll.size()>0` false branch (result ยังเป็น false) |
| testPutAllMapNonMultiMap | putAll(Map): `map instanceof MultiMap` false branch |
| testPutAllMapWithMultiMapSource | putAll(Map): `map instanceof MultiMap` true branch |
| testPutAllMapEmptySource | putAll(Map): loop ไม่ทำงาน (empty entrySet) |
| testPutAllKeyValuesNullReturnsFalse | putAll(key,values): `values == null` true |
| testPutAllKeyValuesEmptyCollectionReturnsFalse | putAll(key,values): `values.size()==0` true |
| testPutAllKeyNewKeyCreatesCollection | putAll(key,values): `coll==null` true, `coll.size()>0` true |
| testPutAllKeyExistingKeyAddsAll | putAll(key,values): `coll==null` false → else (`coll.addAll`) |
| testPutAllKeyWithNonGrowingCollectionBranch | putAll(key,values): `coll.size()>0` false branch |
| testRemoveMappingKeyNotPresentReturnsNull | removeMapping(): `valuesForKey==null` true |
| testRemoveMappingValueNotPresentReturnsNull | removeMapping(): `removed==false` true |
| testRemoveMappingRemovesValueKeepsKeyWhenNonEmpty | removeMapping(): `valuesForKey.isEmpty()` false |
| testRemoveMappingRemovesValueRemovesKeyWhenEmpty | removeMapping(): `valuesForKey.isEmpty()` true → remove(key) |
| testContainsValueOnEmptyMapReturnsFalse | containsValue(value): loop ไม่ execute → false |
| testContainsValueFound | containsValue(value): `coll.contains(value)` true → return true |
| testContainsValueNotFound | containsValue(value): loop จบไม่พบ → false |
| testContainsValueKeyMissingReturnsFalse | containsValue(key,value): `coll==null` true |
| testContainsValueKeyPresentValuePresent | containsValue(key,value): `coll.contains(value)` true |
| testContainsValueKeyPresentValueAbsent | containsValue(key,value): `coll.contains(value)` false |
| testGetCollectionMissingKeyReturnsNull | getCollection(): key ไม่มี → null |
| testGetCollectionPresentKey | getCollection(): key มี → คืน Collection |
| testSizeKeyMissingReturnsZero | size(key): `coll==null` true → 0 |
| testSizeKeyPresentReturnsCollectionSize | size(key): `coll==null` false → coll.size() |
| testTotalSizeEmptyMap | totalSize(): loop ไม่ execute → 0 |
| testTotalSizeMultipleKeys | totalSize(): loop สะสมหลาย key |
| testIteratorMissingKeyReturnsEmptyIterator | iterator(key): `!containsKey(key)` true → EmptyIterator |
| testIteratorPresentKeyIteratesValues | iterator(key): `!containsKey(key)` false → ValuesIterator |
| testValuesIteratorRemoveKeepsKeyWhenNonEmpty | ValuesIterator.remove(): `values.isEmpty()` false |
| testValuesIteratorRemoveRemovesKeyWhenEmpty | ValuesIterator.remove(): `values.isEmpty()` true → remove(key) |
| testValuesViewCachedInstance | values(): `valuesView==null` true/false (cache) |
| testValuesViewIterationAcrossKeys | Values.iterator(): IteratorChain รวมหลาย key |
| testValuesViewSizeMatchesTotalSize | Values.size() → totalSize() |
| testValuesViewClearClearsUnderlyingMap | Values.clear() → MultiValueMap.clear() |

**หมายเหตุ (ตามข้อกำหนดที่ 4):**
- กิ่ง `if (pairs == null)` ใน `containsValue(Object value)` ไม่สามารถทดสอบได้จริง เพราะ `Map.entrySet()` มาตรฐานไม่คืนค่า `null` — ไม่มีการเดา behavior เพิ่มเติม จึงข้ามการทดสอบกิ่งนี้
- Field/Method จาก `AbstractMapDecorator` (เช่น `containsKey`, `remove`, `clear`, `size()` ที่ไม่มี argument) ไม่มีซอร์สโค้ดให้ตรวจสอบ แต่ถูกใช้ตาม decorator pattern ที่ระบุใน javadoc ของ `MultiValueMap` เอง — ใช้เพื่อ verify state เท่านั้น ไม่ได้ทดสอบ behavior ภายในของมัน