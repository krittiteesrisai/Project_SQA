# ListOrderedMapTest.java

```java
package org.apache.commons.collections4.map;

import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link ListOrderedMap} (Defects4J Collections-22b).
 * มุ่งเน้น branch/condition coverage สูงสุดตามซอร์สที่ให้มา
 */
public class ListOrderedMapTest {

    private ListOrderedMap<String, Integer> map;

    @Before
    public void setUp() {
        map = new ListOrderedMap<String, Integer>();
    }

    // ---------------------------------------------------------------
    // Constructors / factory
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_isEmpty() {
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    public void testDefaultConstructor_maintainsInsertionOrderDespiteHashMapBacking() {
        map.put("Z", 1);
        map.put("A", 2);
        map.put("M", 3);
        // ต้องคงลำดับการแทรก ไม่ใช่ลำดับของ HashMap
        assertEquals(Arrays.asList("Z", "A", "M"), map.keyList());
    }

    @Test
    public void testFactoryMethod_wrapsExistingMap_keepsIterationOrder() {
        Map<String, Integer> src = new LinkedHashMap<String, Integer>();
        src.put("X", 1);
        src.put("Y", 2);
        src.put("Z", 3);
        ListOrderedMap<String, Integer> lom = ListOrderedMap.listOrderedMap(src);
        assertEquals(Arrays.asList("X", "Y", "Z"), lom.keyList());
        assertEquals(3, lom.size());
    }

    // ---------------------------------------------------------------
    // firstKey / lastKey
    // ---------------------------------------------------------------

    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_emptyMap_throws() {
        map.firstKey();
    }

    @Test
    public void testFirstKey_nonEmpty() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals("A", map.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKey_emptyMap_throws() {
        map.lastKey();
    }

    @Test
    public void testLastKey_nonEmpty() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals("B", map.lastKey());
    }

    // ---------------------------------------------------------------
    // nextKey / previousKey
    // ---------------------------------------------------------------

    @Test
    public void testNextKey_found_middle() {
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        assertEquals("B", map.nextKey("A"));
    }

    @Test
    public void testNextKey_atEnd_returnsNull() {
        map.put("A", 1);
        map.put("B", 2);
        assertNull(map.nextKey("B"));
    }

    @Test
    public void testNextKey_notFound_returnsNull() {
        map.put("A", 1);
        assertNull(map.nextKey("Z"));
    }

    @Test
    public void testPreviousKey_found_middle() {
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        assertEquals("B", map.previousKey("C"));
    }

    @Test
    public void testPreviousKey_atStart_returnsNull() {
        map.put("A", 1);
        map.put("B", 2);
        assertNull(map.previousKey("A"));
    }

    @Test
    public void testPreviousKey_notFound_returnsNull() {
        map.put("A", 1);
        assertNull(map.previousKey("Z"));
    }

    // ---------------------------------------------------------------
    // put(K,V) / putAll(Map)
    // ---------------------------------------------------------------

    @Test
    public void testPut_newKey_addsToOrder() {
        Integer old = map.put("A", 1);
        assertNull(old);
        assertEquals(Arrays.asList("A"), map.keyList());
    }

    @Test
    public void testPut_existingKey_orderUnchanged_valueUpdated() {
        map.put("A", 1);
        map.put("B", 2);
        Integer old = map.put("A", 10);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Arrays.asList("A", "B"), map.keyList());
        assertEquals(Integer.valueOf(10), map.get("A"));
    }

    @Test
    public void testPutAll_map_addsAllInIterationOrder() {
        Map<String, Integer> src = new LinkedHashMap<String, Integer>();
        src.put("A", 1);
        src.put("B", 2);
        map.putAll(src);
        assertEquals(Arrays.asList("A", "B"), map.keyList());
    }

    // ---------------------------------------------------------------
    // putAll(int index, Map) : old==null (index++) และ old!=null (index=indexOf+1)
    // ---------------------------------------------------------------

    @Test
    public void testPutAllIndex_bothBranches() {
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        // order: A, B, C

        Map<String, Integer> toAdd = new LinkedHashMap<String, Integer>();
        toAdd.put("X", 99); // new key -> old == null branch
        toAdd.put("A", 100); // existing key -> old != null branch

        map.putAll(1, toAdd);

        assertEquals(Arrays.asList("X", "A", "B", "C"), map.keyList());
        assertEquals(Integer.valueOf(99), map.get("X"));
        assertEquals(Integer.valueOf(100), map.get("A"));
    }

    // ---------------------------------------------------------------
    // remove(Object)
    // ---------------------------------------------------------------

    @Test
    public void testRemove_existingKey() {
        map.put("A", 1);
        map.put("B", 2);
        Integer removed = map.remove("A");
        assertEquals(Integer.valueOf(1), removed);
        assertFalse(map.containsKey("A"));
        assertEquals(Arrays.asList("B"), map.keyList());
    }

    @Test
    public void testRemove_nonExistingKey_returnsNull() {
        map.put("A", 1);
        Integer removed = map.remove("Z");
        assertNull(removed);
        assertEquals(Arrays.asList("A"), map.keyList());
    }

    // ---------------------------------------------------------------
    // clear()
    // ---------------------------------------------------------------

    @Test
    public void testClear() {
        map.put("A", 1);
        map.put("B", 2);
        map.clear();
        assertTrue(map.isEmpty());
        assertTrue(map.keyList().isEmpty());
    }

    // ---------------------------------------------------------------
    // keySet() / keyList()
    // ---------------------------------------------------------------

    @Test
    public void testKeySet_containsAndSizeAndOrder() {
        map.put("A", 1);
        map.put("B", 2);
        Set<String> ks = map.keySet();
        assertEquals(2, ks.size());
        assertTrue(ks.contains("A"));
        assertFalse(ks.contains("Z"));

        Iterator<String> it = ks.iterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
    }

    @Test
    public void testKeySet_clear_clearsParent() {
        map.put("A", 1);
        map.keySet().clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testKeyList_isUnmodifiable() {
        map.put("A", 1);
        List<String> kl = map.keyList();
        try {
            kl.add("B");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // values() / valueList()  (ValuesView)
    // ---------------------------------------------------------------

    @Test
    public void testValuesView_containsAndSize() {
        map.put("A", 1);
        map.put("B", 2);
        Collection<Integer> vals = map.values();
        assertEquals(2, vals.size());
        assertTrue(vals.contains(1));
        assertFalse(vals.contains(999));
    }

    @Test
    public void testValuesView_iteratorOrder() {
        map.put("A", 1);
        map.put("B", 2);
        Iterator<Integer> it = map.values().iterator();
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
    }

    @Test
    public void testValueList_getSetRemove() {
        map.put("A", 1);
        map.put("B", 2);
        List<Integer> vlist = map.valueList();

        assertEquals(Integer.valueOf(1), vlist.get(0));

        Integer old = vlist.set(0, 100);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Integer.valueOf(100), map.get("A"));

        Integer removed = vlist.remove(1);
        assertEquals(Integer.valueOf(2), removed);
        assertFalse(map.containsKey("B"));
    }

    @Test
    public void testValuesView_clear_clearsParent() {
        map.put("A", 1);
        map.values().clear();
        assertTrue(map.isEmpty());
    }

    // ---------------------------------------------------------------
    // entrySet() (EntrySetView)
    // ---------------------------------------------------------------

    @Test
    public void testEntrySet_sizeIsEmptyContains() {
        assertTrue(map.entrySet().isEmpty());
        map.put("A", 1);
        Set<Map.Entry<String, Integer>> es = map.entrySet();
        assertEquals(1, es.size());
        assertFalse(es.isEmpty());
        Map.Entry<String, Integer> e = new AbstractMap.SimpleEntry<String, Integer>("A", 1);
        assertTrue(es.contains(e));
    }

    @Test
    public void testEntrySet_containsAll() {
        map.put("A", 1);
        map.put("B", 2);
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>();
        list.add(new AbstractMap.SimpleEntry<String, Integer>("A", 1));
        list.add(new AbstractMap.SimpleEntry<String, Integer>("B", 2));
        assertTrue(map.entrySet().containsAll(list));
    }

    @Test
    public void testEntrySet_remove_notMapEntry_returnsFalse() {
        map.put("A", 1);
        boolean removed = map.entrySet().remove("not-an-entry");
        assertFalse(removed);
        assertTrue(map.containsKey("A"));
    }

    @Test
    public void testEntrySet_remove_entryNotContained_returnsFalse() {
        map.put("A", 1);
        Map.Entry<String, Integer> wrong = new AbstractMap.SimpleEntry<String, Integer>("A", 999);
        boolean removed = map.entrySet().remove(wrong);
        assertFalse(removed);
        assertTrue(map.containsKey("A"));
    }

    @Test
    public void testEntrySet_remove_entryContained_removesFromParent() {
        map.put("A", 1);
        map.put("B", 2);
        Map.Entry<String, Integer> e = new AbstractMap.SimpleEntry<String, Integer>("A", 1);
        boolean removed = map.entrySet().remove(e);
        assertTrue(removed);
        assertFalse(map.containsKey("A"));
        assertEquals(Arrays.asList("B"), map.keyList());
    }

    @Test
    public void testEntrySet_equalsAndHashCode() {
        map.put("A", 1);
        map.put("B", 2);
        ListOrderedMap<String, Integer> other = new ListOrderedMap<String, Integer>();
        other.put("B", 2);
        other.put("A", 1);
        assertTrue(map.entrySet().equals(other.entrySet()));
        assertEquals(map.entrySet().hashCode(), other.entrySet().hashCode());
        assertTrue(map.entrySet().equals(map.entrySet()));
    }

    @Test
    public void testEntrySet_toString() {
        map.put("A", 1);
        String s = map.entrySet().toString();
        assertNotNull(s);
        assertTrue(s.contains("A"));
    }

    @Test
    public void testEntrySet_clear_clearsParent() {
        map.put("A", 1);
        map.entrySet().clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testEntrySetIterator_entryGetValueAndSetValue() {
        map.put("A", 1);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        Map.Entry<String, Integer> entry = it.next();
        assertEquals("A", entry.getKey());
        assertEquals(Integer.valueOf(1), entry.getValue());

        Integer old = entry.setValue(50);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Integer.valueOf(50), map.get("A"));
    }

    @Test
    public void testEntrySetIterator_remove_removesFromMapAndList() {
        map.put("A", 1);
        map.put("B", 2);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        it.next(); // A
        it.remove();
        assertFalse(map.containsKey("A"));
        assertEquals(Arrays.asList("B"), map.keyList());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_emptyMap() {
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToString_nonEmptyMap_multipleEntries() {
        map.put("A", 1);
        map.put("B", 2);
        String s = map.toString();
        assertEquals("{A=1, B=2}", s);
    }

    @Test
    public void testToString_selfReferenceKeyAndValue() {
        ListOrderedMap<Object, Object> selfMap = new ListOrderedMap<Object, Object>();
        selfMap.put(selfMap, selfMap);
        String s = selfMap.toString();
        assertEquals("{(this Map)=(this Map)}", s);
    }

    // ---------------------------------------------------------------
    // get(index) / getValue(index) / indexOf / setValue(index,value)
    // ---------------------------------------------------------------

    @Test
    public void testGetByIndex() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals("A", map.get(0));
        assertEquals("B", map.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetByIndex_outOfBounds_throws() {
        map.put("A", 1);
        map.get(5);
    }

    @Test
    public void testGetValueByIndex() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals(Integer.valueOf(2), map.getValue(1));
    }

    @Test
    public void testIndexOf_foundAndNotFound() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals(0, map.indexOf("A"));
        assertEquals(-1, map.indexOf("Z"));
    }

    @Test
    public void testSetValueByIndex() {
        map.put("A", 1);
        map.put("B", 2);
        Integer old = map.setValue(1, 20);
        assertEquals(Integer.valueOf(2), old);
        assertEquals(Integer.valueOf(20), map.get("B"));
    }

    // ---------------------------------------------------------------
    // put(int index, K key, V value)
    // ---------------------------------------------------------------

    @Test
    public void testPutIndex_newKey() {
        Integer old = map.put(0, "A", 1);
        assertNull(old);
        assertEquals(0, map.indexOf("A"));
        assertEquals(Integer.valueOf(1), map.get("A"));
    }

    @Test
    public void testPutIndex_existingKey_posLessThanIndex() {
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        // order A(0),B(1),C(2); move A (pos0) to index2 -> pos<index true -> index--
        Integer old = map.put(2, "A", 10);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Arrays.asList("B", "A", "C"), map.keyList());
        assertEquals(Integer.valueOf(10), map.get("A"));
    }

    @Test
    public void testPutIndex_existingKey_posGreaterOrEqualIndex() {
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        // order A(0),B(1),C(2); move C (pos2) to index0 -> pos<index(0) false -> index unchanged
        Integer old = map.put(0, "C", 30);
        assertEquals(Integer.valueOf(3), old);
        assertEquals(Arrays.asList("C", "A", "B"), map.keyList());
        assertEquals(Integer.valueOf(30), map.get("C"));
    }

    // ---------------------------------------------------------------
    // remove(int index)
    // ---------------------------------------------------------------

    @Test
    public void testRemoveByIndex() {
        map.put("A", 1);
        map.put("B", 2);
        Integer removed = map.remove(0);
        assertEquals(Integer.valueOf(1), removed);
        assertFalse(map.containsKey("A"));
        assertEquals(Arrays.asList("B"), map.keyList());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndex_outOfBounds_throws() {
        map.remove(0);
    }

    // ---------------------------------------------------------------
    // asList()
    // ---------------------------------------------------------------

    @Test
    public void testAsList_returnsKeyListView() {
        map.put("A", 1);
        map.put("B", 2);
        assertEquals(Arrays.asList("A", "B"), map.asList());
    }

    // ---------------------------------------------------------------
    // mapIterator() / OrderedMapIterator (ListOrderedMapIterator)
    // ---------------------------------------------------------------

    @Test
    public void testMapIterator_emptyMap_hasNextFalse() {
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        assertFalse(it.hasNext());
        assertFalse(it.hasPrevious());
    }

    @Test
    public void testMapIterator_nextAndGetters() {
        map.put("A", 1);
        map.put("B", 2);
        OrderedMapIterator<String, Integer> it = map.mapIterator();

        assertTrue(it.hasNext());
        String k1 = it.next();
        assertEquals("A", k1);
        assertEquals("A", it.getKey());
        assertEquals(Integer.valueOf(1), it.getValue());

        assertTrue(it.hasNext());
        String k2 = it.next();
        assertEquals("B", k2);
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIterator_previousNavigation() {
        map.put("A", 1);
        map.put("B", 2);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.next(); // A
        it.next(); // B
        assertTrue(it.hasPrevious());
        String prev = it.previous();
        assertEquals("B", prev);
    }

    @Test
    public void testMapIterator_setValue() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.next();
        Integer old = it.setValue(99);
        assertEquals(Integer.valueOf(1), old);
        assertEquals(Integer.valueOf(99), map.get("A"));
    }

    @Test
    public void testMapIterator_remove() {
        map.put("A", 1);
        map.put("B", 2);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.next(); // A
        it.remove();
        assertFalse(map.containsKey("A"));
        assertEquals(Arrays.asList("B"), map.keyList());
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_remove_beforeNext_throws() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getKey_beforeNext_throws() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getValue_beforeNext_throws() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_setValue_beforeNext_throws() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.setValue(5);
    }

    @Test
    public void testMapIterator_reset() {
        map.put("A", 1);
        map.put("B", 2);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        it.next();
        it.next();
        it.reset();
        assertTrue(it.hasNext());
        assertFalse(it.hasPrevious());
        // readable reset to false -> getKey() ต้อง throw
        try {
            it.getKey();
            fail("expected IllegalStateException after reset");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testMapIterator_toString_beforeAndAfterNext() {
        map.put("A", 1);
        OrderedMapIterator<String, Integer> it = map.mapIterator();
        assertEquals("Iterator[]", it.toString());
        it.next();
        assertEquals("Iterator[A=1]", it.toString());
    }
}
```

> หมายเหตุ: บางเมธอด/คลาสภายใน (`ValuesView`, `KeySetView`, `EntrySetView`, `ListOrderedMapIterator` ฯลฯ) เป็น package-private แต่สามารถทดสอบผ่าน interface สาธารณะ (`Map`, `List`, `Set`, `Collection`, `OrderedMapIterator`) ที่ถูก return จากเมธอด public ได้ครบถ้วน โดยไม่ต้องอ้างชื่อคลาสภายในตรง ๆ
> ส่วน constructor แบบ `protected ListOrderedMap(Map)` ไม่ได้มีการเช็ค null อย่างชัดเจนในซอร์สที่ให้มา (การ throw IllegalArgumentException ขึ้นกับ `AbstractMapDecorator` ซึ่งไม่มีซอร์สให้ตรวจสอบ) — จึงไม่เขียนเทสสำหรับกรณี null ตามข้อกำหนดที่ 4

---

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_isEmpty / _maintainsInsertionOrder... | Constructor เริ่มต้น + คงลำดับ insert |
| testFactoryMethod_wrapsExistingMap... | Constructor `protected ListOrderedMap(Map)` + `insertOrder.addAll(...)` |
| testFirstKey_emptyMap_throws / _nonEmpty | `if (size()==0)` ทั้ง true/false ของ `firstKey()` |
| testLastKey_emptyMap_throws / _nonEmpty | `if (size()==0)` ทั้ง true/false ของ `lastKey()` |
| testNextKey_found_middle / _atEnd_returnsNull / _notFound_returnsNull | เงื่อนไข `index>=0 && index<size()-1` ทุกกรณี true/false |
| testPreviousKey_found_middle / _atStart_returnsNull / _notFound_returnsNull | เงื่อนไข `index>0` ทุกกรณี true/false |
| testPut_newKey_addsToOrder / testPut_existingKey_... | `if (containsKey(key))` ทั้งสองสาขาของ `put(K,V)` |
| testPutAll_map_addsAllInIterationOrder | loop ของ `putAll(Map)` |
| testPutAllIndex_bothBranches | loop ของ `putAll(int,Map)` ทั้ง branch `old==null` (index++) และ `old!=null` (index=indexOf+1) |
| testRemove_existingKey / _nonExistingKey_returnsNull | `if (containsKey(key))` ของ `remove(Object)` |
| testClear | `clear()` ทั้ง map และ insertOrder |
| testKeySet_* | `KeySetView`: size, contains, iterator, clear |
| testKeyList_isUnmodifiable | `keyList()` unmodifiable list |
| testValuesView_* / testValueList_* | `ValuesView`: contains, size, iterator, get, set, remove(index), clear |
| testEntrySet_* (หลายเมธอด) | `EntrySetView`: size, isEmpty, contains, containsAll, remove (obj ไม่ใช่ Entry / entry ไม่ตรง / entry ตรง), equals, hashCode, toString, clear |
| testEntrySetIterator_* | `ListOrderedIterator` + `ListOrderedMapEntry.getValue/setValue` และ `remove()` |
| testToString_emptyMap / _nonEmptyMap.../_selfReference... | `if (isEmpty())`, loop entrySet, `first` flag, `key==this`/`value==this` เงื่อนไข |
| testGetByIndex / _outOfBounds_throws | `get(int)` boundary |
| testGetValueByIndex | `getValue(int)` |
| testIndexOf_foundAndNotFound | `indexOf` found(-1)/found(idx) |
| testSetValueByIndex | `setValue(int,V)` |
| testPutIndex_newKey / _posLessThanIndex / _posGreaterOrEqualIndex | `put(int,K,V)`: branch `containsKey` true/false และ `if (pos<index)` true/false |
| testRemoveByIndex / _outOfBounds_throws | `remove(int)` boundary |
| testAsList_returnsKeyListView | `asList()` |
| testMapIterator_emptyMap_hasNextFalse | `hasNext()/hasPrevious()` เมื่อ list ว่าง |
| testMapIterator_nextAndGetters / _previousNavigation | `next()/previous()` + readable=true |
| testMapIterator_setValue / _remove | การอัปเดตค่า/การลบ (readable=true path) |
| testMapIterator_remove_beforeNext_throws / getKey/getValue/setValue_beforeNext_throws | เงื่อนไข `if (readable==false)` throw `IllegalStateException` ทุกเมธอด |
| testMapIterator_reset | `reset()` และ readable กลับเป็น false |
| testMapIterator_toString_beforeAndAfterNext | เงื่อนไข `if (readable==true)` ของ `toString()` ทั้ง 2 สาขา |

หากพบว่าโค้ดจริงมี fault (เช่นลำดับ index ผิดพลาดใน `put(int,K,V)` หรือ `putAll(int,Map)`) ชุดเทสนี้จะ fail ทันทีเนื่องจากมีการตรวจสอบ `keyList()`/ค่าดัชนีอย่างละเอียดในทุกกรณี branch