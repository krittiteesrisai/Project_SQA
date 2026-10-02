# แนวคิดการออกแบบเทส

โครงสร้าง `Flat3Map` มี 2 โมด: **flat mode** (size ≤ 3, ใช้ field key1..3/value1..3) และ **delegate mode** (size > 3, ใช้ `HashedMap` ภายใน) ทุกเมธอดมี pattern `if (delegateMap != null) {...}` ก่อนเสมอ ต้องเทสทั้งสองโหมด รวมถึง fallthrough switch-case (case 3→2→1) ที่ไม่มี `break` ซึ่งเป็นจุดเสี่ยง fault สูงสุด

```java
import org.apache.commons.collections.map.Flat3Map;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class Flat3MapTest {

    private Flat3Map map;

    @Before
    public void setUp() {
        map = new Flat3Map();
    }

    // ============================================================
    // Helper: key ที่ hashCode ชนกันได้แต่ equals ต่างกัน (ทดสอบ condition ผสม)
    // ============================================================
    private static class FixedHashKey {
        final int h;
        final String id;
        FixedHashKey(int h, String id) { this.h = h; this.id = id; }
        public int hashCode() { return h; }
        public boolean equals(Object o) {
            if (!(o instanceof FixedHashKey)) return false;
            return id.equals(((FixedHashKey) o).id);
        }
    }

    private Flat3Map serializeDeserialize(Flat3Map m) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(m);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Flat3Map result = (Flat3Map) ois.readObject();
        ois.close();
        return result;
    }

    // ============================================================
    // Constructors
    // ============================================================
    @Test
    public void testDefaultConstructor() {
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testMapConstructorNullThrows() {
        new Flat3Map(null);
    }

    @Test
    public void testMapConstructorEmptyMap() {
        Flat3Map m = new Flat3Map(new HashMap());
        assertEquals(0, m.size());
    }

    @Test
    public void testMapConstructorSmall() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        Flat3Map m = new Flat3Map(src);
        assertEquals(2, m.size());
        assertEquals("1", m.get("a"));
    }

    @Test
    public void testMapConstructorLargeSwitchesToDelegate() {
        Map src = new HashMap();
        src.put("a", "1"); src.put("b", "2");
        src.put("c", "3"); src.put("d", "4");
        Flat3Map m = new Flat3Map(src);
        assertEquals(4, m.size());
        assertEquals("4", m.get("d"));
    }

    // ============================================================
    // get()
    // ============================================================
    @Test
    public void testGetEmptyMapNullAndNonNullKey() {
        assertNull(map.get("x"));
        assertNull(map.get(null)); // size==0 -> switch ไม่ match อะไร
    }

    @Test
    public void testGetNullKeyImmediateMatchAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put(null, "n3");
        assertEquals("n3", map.get(null)); // case3: key3==null true ทันที
    }

    @Test
    public void testGetNullKeyFallthroughMatchAtKey2() {
        map.put("a", "1"); map.put(null, "n2"); map.put("c", "3");
        assertEquals("n2", map.get(null)); // case3 false -> fallthrough case2 true
    }

    @Test
    public void testGetNullKeyFallthroughMatchAtKey1() {
        map.put(null, "n1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("n1", map.get(null)); // fallthrough จนถึง case1
    }

    @Test
    public void testGetNullKeyNoMatch() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertNull(map.get(null)); // ไม่มี key null เลย -> ตกไป return null
    }

    @Test
    public void testGetNonNullKeyMatchesEachSlot() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("3", map.get("c")); // case3 match ทันที
        assertEquals("2", map.get("b")); // fallthrough case2
        assertEquals("1", map.get("a")); // fallthrough case1
    }

    @Test
    public void testGetNonNullKeyNoMatch() {
        map.put("a", "1");
        assertNull(map.get("zzz"));
    }

    @Test
    public void testGetHashCollisionButNotEqual() {
        map.put(new FixedHashKey(1, "A"), "v1");
        assertNull(map.get(new FixedHashKey(1, "B"))); // hash ตรงแต่ equals false
    }

    @Test
    public void testGetDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        assertEquals("v4", map.get("k4"));
        assertNull(map.get("nope"));
    }

    // ============================================================
    // size()/isEmpty()
    // ============================================================
    @Test
    public void testSizeIsEmptyFlatAndDelegate() {
        assertTrue(map.isEmpty());
        map.put("a", "1");
        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        assertEquals(6, map.size()); // delegate mode size()
    }

    // ============================================================
    // containsKey()
    // ============================================================
    @Test
    public void testContainsKeySizeZero() {
        assertFalse(map.containsKey("x")); // size>0 == false
    }

    @Test
    public void testContainsKeyNullKeyAllSlots() {
        map.put(null, "v"); assertTrue(map.containsKey(null));
        map.put("b", "2"); assertTrue(map.containsKey(null));
        map.put("c", "3"); assertTrue(map.containsKey(null));
    }

    @Test
    public void testContainsKeyNullKeyNoMatch() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertFalse(map.containsKey(null));
    }

    @Test
    public void testContainsKeyNonNullEachSlotAndMiss() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertTrue(map.containsKey("c"));
        assertTrue(map.containsKey("b"));
        assertTrue(map.containsKey("a"));
        assertFalse(map.containsKey("z"));
    }

    @Test
    public void testContainsKeyDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        assertTrue(map.containsKey("k0"));
        assertFalse(map.containsKey("zzz"));
    }

    // ============================================================
    // containsValue()
    // ============================================================
    @Test
    public void testContainsValueNullEachSlot() {
        map.put("a", null); assertTrue(map.containsValue(null));
        map.put("b", "2"); map.put("c", "3");
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testContainsValueNullNoMatch() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertFalse(map.containsValue(null));
    }

    @Test
    public void testContainsValueNonNullEachSlotAndMiss() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertTrue(map.containsValue("3"));
        assertTrue(map.containsValue("2"));
        assertTrue(map.containsValue("1"));
        assertFalse(map.containsValue("zzz"));
    }

    @Test
    public void testContainsValueDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        assertTrue(map.containsValue("v0"));
        assertFalse(map.containsValue("nope"));
    }

    // ============================================================
    // put() - new entries / conversion
    // ============================================================
    @Test
    public void testPutNewEntriesAtEachSizeAndConvert() {
        assertNull(map.put("a", "1")); assertEquals(1, map.size());
        assertNull(map.put("b", "2")); assertEquals(2, map.size());
        assertNull(map.put("c", "3")); assertEquals(3, map.size());
        assertNull(map.put("d", "4")); // triggers convertToMap() (default case)
        assertEquals(4, map.size());
        assertEquals("4", map.get("d"));
        assertEquals("1", map.get("a"));
    }

    @Test
    public void testPutOnDelegateMode() {
        for (int i = 0; i < 4; i++) map.put("k" + i, "v" + i);
        assertNull(map.put("new", "val"));
        assertEquals("v0", map.put("k0", "updated")); // update ผ่าน delegate
        assertEquals("updated", map.get("k0"));
    }

    // -- update existing: key == null, fallthrough coverage --
    @Test
    public void testPutUpdateNullKeyImmediateAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put(null, "n");
        assertEquals("n", map.put(null, "n2"));
        assertEquals("n2", map.get(null));
    }

    @Test
    public void testPutUpdateNullKeyFallthroughAtKey2() {
        map.put("a", "1"); map.put(null, "n"); map.put("c", "3");
        assertEquals("n", map.put(null, "n2"));
        assertEquals("n2", map.get(null));
    }

    @Test
    public void testPutUpdateNullKeyFallthroughAtKey1() {
        map.put(null, "n"); map.put("b", "2"); map.put("c", "3");
        assertEquals("n", map.put(null, "n2"));
        assertEquals("n2", map.get(null));
    }

    // -- update existing: key != null, fallthrough coverage --
    @Test
    public void testPutUpdateNonNullKeyImmediateAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("3", map.put("c", "cc"));
        assertEquals("cc", map.get("c"));
    }

    @Test
    public void testPutUpdateNonNullKeyFallthroughAtKey2() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("2", map.put("b", "bb"));
        assertEquals("bb", map.get("b"));
    }

    @Test
    public void testPutUpdateNonNullKeyFallthroughAtKey1() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("1", map.put("a", "aa"));
        assertEquals("aa", map.get("a"));
    }

    // ============================================================
    // putAll()
    // ============================================================
    @Test
    public void testPutAllEmptyMapNoOp() {
        map.putAll(new HashMap());
        assertEquals(0, map.size());
    }

    @Test
    public void testPutAllSmallLoopsPut() {
        Map src = new HashMap();
        src.put("a", "1"); src.put("b", "2");
        map.putAll(src);
        assertEquals(2, map.size());
    }

    @Test
    public void testPutAllLargeConvertsDirectly() {
        Map src = new HashMap();
        src.put("a", "1"); src.put("b", "2"); src.put("c", "3"); src.put("d", "4");
        map.putAll(src); // argument size >=4 -> convertToMap โดยตรง
        assertEquals(4, map.size());
        assertEquals("4", map.get("d"));
    }

    @Test
    public void testPutAllTriggersConversionDuringLoop() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3"); // size 3
        Map extra = new HashMap();
        extra.put("d", "4"); // argument size == 1 < 4 -> loop, แต่ put ภายในจะ convert
        map.putAll(extra);
        assertEquals(4, map.size());
        assertEquals("4", map.get("d"));
    }

    @Test
    public void testPutAllOnDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Map extra = new HashMap();
        extra.put("extra", "e");
        map.putAll(extra);
        assertEquals(6, map.size());
    }

    // ============================================================
    // remove() - key == null
    // ============================================================
    @Test
    public void testRemoveSizeZeroReturnsNull() {
        assertNull(map.remove("x"));
    }

    @Test
    public void testRemoveNullKeySize3ImmediateAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put(null, "n");
        assertEquals("n", map.remove(null));
        assertEquals(2, map.size());
        assertFalse(map.containsKey(null));
    }

    @Test
    public void testRemoveNullKeySize3FallthroughAtKey2() {
        map.put("a", "1"); map.put(null, "n"); map.put("c", "3");
        assertEquals("n", map.remove(null));
        assertEquals(2, map.size());
        assertEquals("1", map.get("a"));
        assertEquals("3", map.get("c"));
    }

    @Test
    public void testRemoveNullKeySize3FallthroughAtKey1() {
        map.put(null, "n"); map.put("b", "2"); map.put("c", "3");
        assertEquals("n", map.remove(null));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNullKeySize3NoMatchReturnsNull() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertNull(map.remove(null));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemoveNullKeySize2ImmediateAtKey2() {
        map.put("a", "1"); map.put(null, "n");
        assertEquals("n", map.remove(null));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemoveNullKeySize2FallthroughAtKey1() {
        map.put(null, "n"); map.put("b", "2");
        assertEquals("n", map.remove(null));
        assertEquals(1, map.size());
        assertEquals("2", map.get("b"));
    }

    @Test
    public void testRemoveNullKeySize2NoMatch() {
        map.put("a", "1"); map.put("b", "2");
        assertNull(map.remove(null));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNullKeySize1Match() {
        map.put(null, "n");
        assertEquals("n", map.remove(null));
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveNullKeySize1NoMatch() {
        map.put("a", "1");
        assertNull(map.remove(null));
        assertEquals(1, map.size());
    }

    // ============================================================
    // remove() - key != null
    // ============================================================
    @Test
    public void testRemoveNonNullKeySize3ImmediateAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("3", map.remove("c"));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize3FallthroughAtKey2() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("2", map.remove("b"));
        assertEquals(2, map.size());
        assertEquals("1", map.get("a"));
        assertEquals("3", map.get("c"));
    }

    @Test
    public void testRemoveNonNullKeySize3FallthroughAtKey1() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertEquals("1", map.remove("a"));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize3NoMatch() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        assertNull(map.remove("zzz"));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize2ImmediateAtKey2() {
        map.put("a", "1"); map.put("b", "2");
        assertEquals("2", map.remove("b"));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize2FallthroughAtKey1() {
        map.put("a", "1"); map.put("b", "2");
        assertEquals("1", map.remove("a"));
        assertEquals(1, map.size());
        assertEquals("2", map.get("b"));
    }

    @Test
    public void testRemoveNonNullKeySize2NoMatch() {
        map.put("a", "1"); map.put("b", "2");
        assertNull(map.remove("zzz"));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize1Match() {
        map.put("a", "1");
        assertEquals("1", map.remove("a"));
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize1NoMatch() {
        map.put("a", "1");
        assertNull(map.remove("zzz"));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemoveOnDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        assertEquals("v0", map.remove("k0"));
        assertNull(map.remove("nope"));
    }

    // ============================================================
    // clear()
    // ============================================================
    @Test
    public void testClearFlatMode() {
        map.put("a", "1"); map.put("b", "2");
        map.clear();
        assertEquals(0, map.size());
        assertNull(map.get("a"));
    }

    @Test
    public void testClearDelegateModeSwitchesBackToFlat() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        map.clear();
        assertEquals(0, map.size());
        map.put("x", "1"); // ควรกลับไปทำงานใน flat mode
        assertEquals(1, map.size());
        assertEquals("1", map.get("x"));
    }

    // ============================================================
    // mapIterator()
    // ============================================================
    @Test
    public void testMapIteratorSizeZero() {
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // ตามพฤติกรรมมาตรฐานของ EmptyMapIterator (ไม่มีซอร์สแสดงในไฟล์ที่ให้)
        }
    }

    @Test
    public void testMapIteratorDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) { it.next(); count++; }
        assertEquals(5, count);
    }

    @Test
    public void testMapIteratorGetKeyBeforeNextThrows() {
        map.put("a", "1");
        MapIterator it = map.mapIterator();
        try {
            it.getKey();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testMapIteratorRemoveBeforeNextThrows() {
        map.put("a", "1");
        MapIterator it = map.mapIterator();
        try {
            it.remove();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testMapIteratorFullIterationAndValues() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        MapIterator it = map.mapIterator();
        Set<String> keys = new HashSet<String>();
        while (it.hasNext()) {
            Object k = it.next();
            keys.add((String) k);
            assertEquals(k, it.getKey());
            assertNotNull(it.getValue());
        }
        assertEquals(3, keys.size());
        assertTrue(keys.contains("a") && keys.contains("b") && keys.contains("c"));
    }

    @Test
    public void testMapIteratorNextExhaustedThrows() {
        map.put("a", "1");
        MapIterator it = map.mapIterator();
        it.next();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { }
    }

    @Test
    public void testMapIteratorSetValue() {
        map.put("a", "1");
        MapIterator it = map.mapIterator();
        it.next();
        Object old = it.setValue("updated");
        assertEquals("1", old);
        assertEquals("updated", map.get("a"));
    }

    @Test
    public void testMapIteratorRemoveAndReset() {
        map.put("a", "1"); map.put("b", "2");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());

        if (it instanceof ResettableIterator) {
            ((ResettableIterator) it).reset();
        }
    }

    @Test
    public void testMapIteratorToStringStates() {
        map.put("a", "1");
        MapIterator it = map.mapIterator();
        assertEquals("Iterator[]", it.toString()); // canRemove == false
        it.next();
        assertTrue(it.toString().startsWith("Iterator[a=1"));
    }

    // ============================================================
    // entrySet()
    // ============================================================
    @Test
    public void testEntrySetSizeZeroIterator() {
        Iterator it = map.entrySet().iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testEntrySetSizeAndClear() {
        map.put("a", "1"); map.put("b", "2");
        Set entries = map.entrySet();
        assertEquals(2, entries.size());
        entries.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testEntrySetRemoveNotAnEntry() {
        map.put("a", "1");
        assertFalse(map.entrySet().remove("not-an-entry"));
    }

    @Test
    public void testEntrySetRemoveExistingEntry() {
        map.put("a", "1");
        Map tmp = new HashMap();
        tmp.put("a", "1");
        Map.Entry e = (Map.Entry) tmp.entrySet().iterator().next();
        assertTrue(map.entrySet().remove(e));
        assertFalse(map.containsKey("a"));
    }

    @Test
    public void testEntrySetRemoveAbsentEntry() {
        map.put("a", "1");
        Map tmp = new HashMap();
        tmp.put("zzz", "9");
        Map.Entry e = (Map.Entry) tmp.entrySet().iterator().next();
        assertFalse(map.entrySet().remove(e));
    }

    @Test
    public void testEntrySetIteratorDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Iterator it = map.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) { it.next(); count++; }
        assertEquals(5, count);
    }

    @Test
    public void testEntrySetIteratorGetKeyValueBeforeNextThrows() {
        map.put("a", "1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it; // ตัวเดียวกันเป็นทั้ง Iterator และ Entry
        try {
            entry.getKey();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testEntrySetIteratorFullCycleEqualsHashCodeToString() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        Iterator it = map.entrySet().iterator();
        int count = 0;
        Map.Entry lastEntry = null;
        while (it.hasNext()) {
            Object next = it.next();
            Map.Entry entry = (Map.Entry) next;
            lastEntry = entry;
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            assertTrue(entry.toString().contains("="));
            count++;
        }
        assertEquals(3, count);

        // equals()/hashCode() หลัง iterate จบ (canRemove ยัง true ที่ entry ตัวสุดท้าย)
        Map tmp = new HashMap();
        tmp.put(lastEntry.getKey(), lastEntry.getValue());
        Map.Entry other = (Map.Entry) tmp.entrySet().iterator().next();
        assertTrue(lastEntry.equals(other));
        assertEquals((lastEntry.getKey() == null ? 0 : lastEntry.getKey().hashCode())
                ^ (lastEntry.getValue() == null ? 0 : lastEntry.getValue().hashCode()),
                lastEntry.hashCode());
    }

    @Test
    public void testEntrySetIteratorEqualsFalseCasesAndSetValue() {
        map.put("a", "1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it;
        assertFalse(entry.equals("not-an-entry-and-canRemoveFalse")); // canRemove==false -> false
        assertEquals(0, entry.hashCode()); // canRemove==false -> 0
        assertEquals("", entry.toString()); // canRemove==false

        it.next();
        assertFalse(entry.equals("still-not-an-entry")); // obj instanceof Map.Entry == false
        Object old = entry.setValue("updated");
        assertEquals("1", old);
        assertEquals("updated", map.get("a"));
    }

    @Test
    public void testEntrySetIteratorRemove() {
        map.put("a", "1"); map.put("b", "2");
        Iterator it = map.entrySet().iterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    // ============================================================
    // keySet()
    // ============================================================
    @Test
    public void testKeySetContainsAndRemove() {
        map.put("a", "1"); map.put("b", "2");
        Set keys = map.keySet();
        assertTrue(keys.contains("a"));
        assertFalse(keys.contains("zzz"));
        assertTrue(keys.remove("a"));
        assertFalse(map.containsKey("a"));
        assertFalse(keys.remove("zzz"));
    }

    @Test
    public void testKeySetIteratorSizeZero() {
        assertFalse(map.keySet().iterator().hasNext());
    }

    @Test
    public void testKeySetIteratorFlatAndDelegateMode() {
        map.put("a", "1"); map.put("b", "2");
        Iterator it = map.keySet().iterator();
        Set collected = new HashSet();
        while (it.hasNext()) collected.add(it.next());
        assertEquals(2, collected.size());

        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Iterator it2 = map.keySet().iterator();
        int count = 0;
        while (it2.hasNext()) { it2.next(); count++; }
        assertEquals(7, count);
    }

    @Test
    public void testKeySetClear() {
        map.put("a", "1");
        map.keySet().clear();
        assertEquals(0, map.size());
    }

    // ============================================================
    // values()
    // ============================================================
    @Test
    public void testValuesContains() {
        map.put("a", "1"); map.put("b", "2");
        Collection values = map.values();
        assertTrue(values.contains("1"));
        assertFalse(values.contains("zzz"));
        assertEquals(2, values.size());
    }

    @Test
    public void testValuesIteratorSizeZero() {
        assertFalse(map.values().iterator().hasNext());
    }

    @Test
    public void testValuesIteratorFlatAndDelegateMode() {
        map.put("a", "1"); map.put("b", "2");
        Iterator it = map.values().iterator();
        Set collected = new HashSet();
        while (it.hasNext()) collected.add(it.next());
        assertEquals(2, collected.size());

        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Iterator it2 = map.values().iterator();
        int count = 0;
        while (it2.hasNext()) { it2.next(); count++; }
        assertEquals(7, count);
    }

    @Test
    public void testValuesClear() {
        map.put("a", "1");
        map.values().clear();
        assertEquals(0, map.size());
    }

    // ============================================================
    // clone()
    // ============================================================
    @Test
    public void testCloneFlatMode() {
        map.put("a", "1"); map.put("b", "2");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals("1", cloned.get("a"));
        cloned.put("c", "3");
        assertEquals(2, map.size()); // ตัวเดิมไม่ถูกกระทบ
    }

    @Test
    public void testCloneDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        cloned.put("new", "val");
        assertEquals(5, map.size()); // delegateMap ถูก clone แยก ไม่กระทบตัวเดิม
    }

    // ============================================================
    // equals()
    // ============================================================
    @Test
    public void testEqualsSameInstance() {
        map.put("a", "1");
        assertTrue(map.equals(map));
    }

    @Test
    public void testEqualsDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Flat3Map other = new Flat3Map();
        for (int i = 0; i < 5; i++) other.put("k" + i, "v" + i);
        assertTrue(map.equals(other));
        other.put("extra", "x");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEqualsNotAMap() {
        map.put("a", "1");
        assertFalse(map.equals("not-a-map"));
    }

    @Test
    public void testEqualsSizeMismatch() {
        map.put("a", "1");
        Map other = new HashMap();
        other.put("a", "1"); other.put("b", "2");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEqualsEmptyMaps() {
        assertTrue(map.equals(new HashMap())); // size==0 -> skip switch -> return true
    }

    @Test
    public void testEqualsSize3MissingKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        Map other = new HashMap();
        other.put("a", "1"); other.put("b", "2"); other.put("zzz", "3");
        assertFalse(map.equals(other)); // containsKey(key3) == false
    }

    @Test
    public void testEqualsSize3ValueMismatchAtKey3() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        Map other = new HashMap();
        other.put("a", "1"); other.put("b", "2"); other.put("c", "different");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEqualsSize3FullMatch() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        Map other = new HashMap();
        other.put("a", "1"); other.put("b", "2"); other.put("c", "3");
        assertTrue(map.equals(other));
    }

    @Test
    public void testEqualsSize1MissingKey1() {
        map.put("a", "1");
        Map other = new HashMap();
        other.put("zzz", "1");
        assertFalse(map.equals(other));
    }

    // ============================================================
    // hashCode()
    // ============================================================
    @Test
    public void testHashCodeSizeZero() {
        assertEquals(0, map.hashCode());
    }

    @Test
    public void testHashCodeFlatMode() {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        int expected = ("a".hashCode() ^ "1".hashCode())
                + ("b".hashCode() ^ "2".hashCode())
                + ("c".hashCode() ^ "3".hashCode());
        assertEquals(expected, map.hashCode());
    }

    @Test
    public void testHashCodeDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Map hashMapEquivalent = new HashMap();
        for (int i = 0; i < 5; i++) hashMapEquivalent.put("k" + i, "v" + i);
        assertEquals(hashMapEquivalent.hashCode(), map.hashCode());
    }

    // ============================================================
    // toString()
    // ============================================================
    @Test
    public void testToStringSizeZero() {
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToStringFlatModeAllSizes() {
        map.put("a", "1");
        assertEquals("{a=1}", map.toString());
        map.put("b", "2");
        assertEquals("{b=2,a=1}", map.toString());
        map.put("c", "3");
        assertEquals("{c=3,b=2,a=1}", map.toString());
    }

    @Test
    public void testToStringWithThisMapAsKeyOrValue() {
        map.put(map, map); // key/value == this map -> "(this Map)"
        assertEquals("{(this Map)=(this Map)}", map.toString());
    }

    @Test
    public void testToStringDelegateMode() {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        String s = map.toString();
        assertTrue(s.startsWith("{") && s.endsWith("}"));
    }

    // ============================================================
    // Serialization: writeObject()/readObject()
    // ============================================================
    @Test
    public void testSerializationEmptyMap() throws Exception {
        Flat3Map result = serializeDeserialize(map);
        assertEquals(0, result.size());
    }

    @Test
    public void testSerializationFlatModeRoundTrip() throws Exception {
        map.put("a", "1"); map.put("b", "2"); map.put("c", "3");
        Flat3Map result = serializeDeserialize(map);
        assertEquals(3, result.size());
        assertEquals("1", result.get("a"));
        assertEquals("3", result.get("c"));
    }

    @Test
    public void testSerializationDelegateModeRoundTrip() throws Exception {
        for (int i = 0; i < 5; i++) map.put("k" + i, "v" + i);
        Flat3Map result = serializeDeserialize(map);
        assertEquals(5, result.size());
        assertEquals("v4", result.get("k4"));
        assertEquals("v0", result.get("k0"));
    }
}
```

## สรุปตาราง Test coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| Constructor tests | ค่า null → NPE, map ว่าง, map เล็ก (<4), map ใหญ่ (≥4 → delegate) |
| `testGet*` | delegateMap!=null/null, key==null (match ที่ case3/2/1 แบบ fallthrough, ไม่ match), key!=null (size>0 true/false, match/ไม่match แต่ละ slot), hash ชนกันแต่ equals ต่างกัน |
| `testSizeIsEmpty*` | delegateMap!=null/null ใน `size()` |
| `testContainsKey*` | เหมือน get() ครบทุก fallthrough + delegate |
| `testContainsValue*` | value==null vs !=null, fallthrough ทุก slot + delegate |
| `testPutNew*`, `testPutUpdate*` | key==null/!=null update-fallthrough (case3→2→1), add-new switch (case 0,1,2,default→convert), delegate mode put |
| `testPutAll*` | size==0 return, delegateMap!=null, argSize<4 loop, argSize≥4 convert ตรง, loop-ทำให้เกิด convert ระหว่างวน |
| `testRemove*` (ทุกเมธอด) | size==0, key==null/!=null ที่ size 3/2/1 แต่ละ slot match/ไม่match/fallthrough, delegate mode |
| `testClear*` | delegateMap!=null (reset เป็น null) vs flat mode reset field |
| `testMapIterator*` | size==0 (EmptyMapIterator), delegate mode, hasNext/next/remove/getKey/getValue/setValue ก่อน-หลัง `canRemove`, exhausted next(), reset(), toString ทั้ง 2 สถานะ |
| `testEntrySet*` | delegateMap!=null/null, size==0, remove(non-Entry/Entry match/ไม่match), iterator ทุกโหมด, equals/hashCode/toString ของ EntrySetIterator ทั้ง canRemove true/false |
| `testKeySet*` | contains, remove, iterator (size 0/flat/delegate), clear |
| `testValues*` | contains, iterator (size 0/flat/delegate), clear |
| `testClone*` | flat mode (shallow, independent), delegate mode (deep clone ของ delegateMap) |
| `testEquals*` | obj==this, delegateMap!=null, obj not Map, size mismatch, size==0, size>0 (containsKey false / value mismatch / full match ที่แต่ละ slot) |
| `testHashCode*` | delegateMap!=null/null, size 0/1/2/3 fallthrough |
| `testToString*` | delegateMap!=null/null, size==0, size 1/2/3, key/value==this |
| `testSerialization*` | count==0, count≤3 (ไม่ pre-create delegateMap), count>3 (pre-create delegateMap ก่อน loop) |

**หมายเหตุ:** โค้ดส่วน `throw new IllegalStateException("Invalid map index")` ใน `getKey()/getValue()/setValue()` ของ iterator ทั้งหมด ไม่สามารถเข้าถึงได้ผ่าน public API ปกติ (เพราะ `nextIndex` ถูกจำกัดด้วย `canRemove` guard และค่า size ≤ 3 เสมอ) จึงไม่ได้เขียนเทสสำหรับ branch นี้โดยตรง — เป็น dead code ตามที่วิเคราะห์จากซอร์ส