package org.apache.commons.collections.map;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;
import org.junit.Before;
import org.junit.Test;

public class Flat3MapTest {

    private Flat3Map map;

    @Before
    public void setUp() {
        map = new Flat3Map();
    }

    // ===================== Constructor =====================

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testMapConstructorNull() {
        new Flat3Map(null); // putAll(null) -> map.size() NPE
    }

    @Test
    public void testMapConstructorWithEntries() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        Flat3Map fm = new Flat3Map(src);
        assertEquals(2, fm.size());
        assertEquals("1", fm.get("a"));
        assertEquals("2", fm.get("b"));
    }

    @Test
    public void testMapConstructorEmptyMap() {
        Flat3Map fm = new Flat3Map(new HashMap());
        assertEquals(0, fm.size());
    }

    // ===================== get() =====================

    @Test
    public void testGetEmptyMapNullKey() {
        assertNull(map.get(null));
    }

    @Test
    public void testGetEmptyMapNonNullKey() {
        assertNull(map.get("x"));
    }

    @Test
    public void testGetNullKeySize1Match() {
        map.put(null, "v1");
        assertEquals("v1", map.get(null));
    }

    @Test
    public void testGetNullKeySize1NoMatch() {
        map.put("k1", "v1");
        assertNull(map.get(null));
    }

    @Test
    public void testGetNullKeySize2Match() {
        map.put("k1", "v1");
        map.put(null, "v2");
        assertEquals("v2", map.get(null));
    }

    @Test
    public void testGetNullKeySize2FallThroughToKey1() {
        map.put(null, "v1");
        map.put("k2", "v2");
        assertEquals("v1", map.get(null));
    }

    @Test
    public void testGetNullKeySize3Match() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        assertEquals("v3", map.get(null));
    }

    @Test
    public void testGetNullKeySize3FallThrough() {
        map.put(null, "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v1", map.get(null));
    }

    @Test
    public void testGetNonNullKeySize1MatchAndNoMatch() {
        map.put("k1", "v1");
        assertEquals("v1", map.get("k1"));
        assertNull(map.get("other"));
    }

    @Test
    public void testGetNonNullKeySize2Match() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals("v2", map.get("k2"));
        assertEquals("v1", map.get("k1"));
    }

    @Test
    public void testGetNonNullKeySize3Match() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v3", map.get("k3"));
        assertEquals("v2", map.get("k2"));
        assertEquals("v1", map.get("k1"));
    }

    @Test
    public void testGetDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4"); // triggers convertToMap
        assertEquals("v4", map.get("k4"));
        assertEquals("v1", map.get("k1"));
        assertNull(map.get("nope"));
    }

    // ===================== size()/isEmpty() =====================

    @Test
    public void testSizeAndIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("a", 1);
        assertFalse(map.isEmpty());
        assertEquals(1, map.size());
    }

    @Test
    public void testSizeDelegateMode() {
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, i);
        }
        assertEquals(5, map.size());
    }

    // ===================== containsKey() =====================

    @Test
    public void testContainsKeyEmpty() {
        assertFalse(map.containsKey("x"));
        assertFalse(map.containsKey(null));
    }

    @Test
    public void testContainsKeyNullVariants() {
        map.put(null, "v");
        assertTrue(map.containsKey(null));
        map.put("k2", "v2");
        assertTrue(map.containsKey(null));
        map.put("k3", "v3");
        assertTrue(map.containsKey(null));
    }

    @Test
    public void testContainsKeyNonNullVariants() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k2"));
        assertTrue(map.containsKey("k3"));
        assertFalse(map.containsKey("k4"));
    }

    @Test
    public void testContainsKeyDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsKey("k4"));
        assertFalse(map.containsKey("nope"));
    }

    // ===================== containsValue() =====================

    @Test
    public void testContainsValueEmpty() {
        assertFalse(map.containsValue("x"));
        assertFalse(map.containsValue(null));
    }

    @Test
    public void testContainsValueNullVariants() {
        map.put("k1", null);
        assertTrue(map.containsValue(null));
        map.put("k2", "v2");
        assertTrue(map.containsValue(null));
        map.put("k3", "v3");
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testContainsValueNonNullVariants() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertTrue(map.containsValue("v1"));
        assertTrue(map.containsValue("v2"));
        assertTrue(map.containsValue("v3"));
        assertFalse(map.containsValue("v4"));
    }

    @Test
    public void testContainsValueDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsValue("v4"));
        assertFalse(map.containsValue("nope"));
    }

    // ===================== put() =====================

    @Test
    public void testPutNewKeysUpToThree() {
        assertNull(map.put("k1", "v1"));
        assertEquals(1, map.size());
        assertNull(map.put("k2", "v2"));
        assertEquals(2, map.size());
        assertNull(map.put("k3", "v3"));
        assertEquals(3, map.size());
    }

    @Test
    public void testPutFourthTriggersDelegate() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.put("k4", "v4"));
        assertEquals(4, map.size());
        assertNull(map.put("k5", "v5"));
        assertEquals(5, map.size());
    }

    @Test
    public void testPutUpdateExistingNullKeySize1() {
        map.put(null, "v1");
        Object old = map.put(null, "v2");
        assertEquals("v1", old);
        assertEquals("v2", map.get(null));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutUpdateExistingNullKeySize2() {
        map.put("k1", "v1");
        map.put(null, "v2");
        Object old = map.put(null, "v3");
        assertEquals("v2", old);
        assertEquals(2, map.size());
    }

    @Test
    public void testPutUpdateExistingNullKeySize2FallThrough() {
        map.put(null, "v1");
        map.put("k2", "v2");
        Object old = map.put(null, "v3");
        assertEquals("v1", old);
    }

    @Test
    public void testPutUpdateExistingNullKeySize3() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        Object old = map.put(null, "v4");
        assertEquals("v3", old);
    }

    @Test
    public void testPutUpdateExistingNonNullKeySize1() {
        map.put("k1", "v1");
        Object old = map.put("k1", "v2");
        assertEquals("v1", old);
        assertEquals(1, map.size());
    }

    @Test
    public void testPutUpdateExistingNonNullKeySize2() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals("v2", map.put("k2", "v22"));
        assertEquals("v1", map.put("k1", "v11"));
    }

    @Test
    public void testPutUpdateExistingNonNullKeySize3() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v3", map.put("k3", "v33"));
        assertEquals("v2", map.put("k2", "v22"));
        assertEquals("v1", map.put("k1", "v11"));
    }

    @Test
    public void testPutUpdateInDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Object old = map.put("k4", "v44");
        assertEquals("v4", old);
        assertEquals(4, map.size());
    }

    @Test
    public void testPutNullKeyThenNonNull() {
        map.put(null, "vnull");
        map.put("k1", "v1");
        assertEquals("vnull", map.get(null));
        assertEquals("v1", map.get("k1"));
    }

    // ===================== putAll() =====================

    @Test
    public void testPutAllEmptyMap() {
        map.putAll(new HashMap());
        assertEquals(0, map.size());
    }

    @Test
    public void testPutAllSmall() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        map.putAll(src);
        assertEquals(2, map.size());
    }

    @Test
    public void testPutAllExactlyThreeBoundary() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        src.put("c", "3");
        map.putAll(src);
        assertEquals(3, map.size());
    }

    @Test
    public void testPutAllFourBoundaryTriggersDelegate() {
        Map src = new HashMap();
        src.put("a", "1");
        src.put("b", "2");
        src.put("c", "3");
        src.put("d", "4");
        map.putAll(src);
        assertEquals(4, map.size());
    }

    @Test
    public void testPutAllWhenAlreadyDelegate() {
        map.put("k1", 1);
        map.put("k2", 2);
        map.put("k3", 3);
        map.put("k4", 4); // now delegate
        Map src = new HashMap();
        src.put("k5", 5);
        map.putAll(src);
        assertEquals(5, map.size());
    }

    @Test(expected = NullPointerException.class)
    public void testPutAllNullMap() {
        map.putAll(null);
    }

    // ===================== remove() =====================

    @Test
    public void testRemoveFromEmptyMap() {
        assertNull(map.remove("x"));
        assertNull(map.remove(null));
    }

    @Test
    public void testRemoveNullKeySize1Match() {
        map.put(null, "v1");
        Object old = map.remove(null);
        assertEquals("v1", old);
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveNullKeySize2TopSlotMatch_NoShift() {
        map.put("k1", "v1");
        map.put(null, "v2");
        Object old = map.remove(null);
        assertEquals("v2", old);
        assertEquals(1, map.size());
        assertEquals("v1", map.get("k1"));
    }

    /**
     * FAULT DETECTION: ตาม Map.remove() contract ค่าที่ return ควรเป็นค่าเดิมของ
     * key ที่ถูกลบจริง (value1="v1") แต่จากการวิเคราะห์ซอร์ส บรรทัด
     * "Object old = value2;" ใน case ที่ key1==null (shift key2->key1)
     * ใช้ value2 แทน value1 ซึ่งคาดว่าเป็น fault จริง
     * -> คาดว่า assertion นี้จะ FAIL บนซอร์สที่ให้มา
     */
    @Test
    public void testRemoveNullKeySize2ShiftToKey1_ExpectedContractValue() {
        map.put(null, "v1");
        map.put("k2", "v2");
        Object old = map.remove(null);
        assertEquals("v1", old); // คาดว่า FAIL (actual code returns "v2")
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2")); // ข้อมูลใน map ยังถูกต้อง
    }

    @Test
    public void testRemoveNullKeySize2NoMatchReturnsNull() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove(null));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNullKeySize3TopSlotMatch_NoShift() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        Object old = map.remove(null);
        assertEquals("v3", old);
        assertEquals(2, map.size());
    }

    /**
     * FAULT DETECTION: คาดว่า old ควรเป็น value ของตำแหน่งที่ key เป็น null (value2="v2")
     * แต่ source จริงจะ return value3="v3" (shift-bug) -> คาดว่า FAIL
     */
    @Test
    public void testRemoveNullKeySize3ShiftFromKey2_ExpectedContractValue() {
        map.put("k1", "v1");
        map.put(null, "v2");
        map.put("k3", "v3");
        Object old = map.remove(null);
        assertEquals("v2", old); // คาดว่า FAIL (actual returns "v3")
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v3", map.get("k3"));
    }

    /**
     * FAULT DETECTION: คาดว่า old ควรเป็น value1="v1" แต่ source จริง return value3="v3"
     */
    @Test
    public void testRemoveNullKeySize3ShiftFromKey1_ExpectedContractValue() {
        map.put(null, "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object old = map.remove(null);
        assertEquals("v1", old); // คาดว่า FAIL (actual returns "v3")
        assertEquals(2, map.size());
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));
    }

    @Test
    public void testRemoveNullKeySize3NoMatch() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove(null));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize1MatchAndNoMatch() {
        map.put("k1", "v1");
        assertNull(map.remove("other"));
        assertEquals(1, map.size());
        Object old = map.remove("k1");
        assertEquals("v1", old);
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize2TopSlotMatch_NoShift() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Object old = map.remove("k2");
        assertEquals("v2", old);
        assertEquals(1, map.size());
    }

    /**
     * FAULT DETECTION: ตาม contract ควร return value1="v1" แต่ source จะ return value2="v2"
     */
    @Test
    public void testRemoveNonNullKeySize2ShiftToKey1_ExpectedContractValue() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Object old = map.remove("k1");
        assertEquals("v1", old); // คาดว่า FAIL (actual returns "v2")
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testRemoveNonNullKeySize2NoMatch() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove("other"));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNonNullKeySize3TopSlotMatch_NoShift() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object old = map.remove("k3");
        assertEquals("v3", old);
        assertEquals(2, map.size());
    }

    /**
     * FAULT DETECTION: ควร return value2="v2" แต่ source จะ return value3="v3"
     */
    @Test
    public void testRemoveNonNullKeySize3ShiftFromKey2_ExpectedContractValue() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object old = map.remove("k2");
        assertEquals("v2", old); // คาดว่า FAIL (actual returns "v3")
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v3", map.get("k3"));
    }

    /**
     * FAULT DETECTION: ควร return value1="v1" แต่ source จะ return value3="v3"
     */
    @Test
    public void testRemoveNonNullKeySize3ShiftFromKey1_ExpectedContractValue() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object old = map.remove("k1");
        assertEquals("v1", old); // คาดว่า FAIL (actual returns "v3")
        assertEquals(2, map.size());
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));
    }

    @Test
    public void testRemoveNonNullKeySize3NoMatch() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove("other"));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemoveDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Object old = map.remove("k4");
        assertEquals("v4", old);
        assertEquals(3, map.size());
    }

    // ===================== clear() =====================

    @Test
    public void testClearFlatMode() {
        map.put("k1", "v1");
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testClearDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.clear();
        assertEquals(0, map.size());
        map.put("a", "1"); // ต้องกลับไป flat mode ได้
        assertEquals(1, map.size());
    }

    // ===================== mapIterator() =====================

    @Test
    public void testMapIteratorEmpty() {
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorFlatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        MapIterator it = map.mapIterator();
        List keys = new ArrayList();
        while (it.hasNext()) {
            keys.add(it.next());
            assertNotNull(it.getValue());
        }
        assertEquals(3, keys.size());
    }

    @Test
    public void testMapIteratorDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test(expected = NoSuchElementException.class)
    public void testMapIteratorNextBeyondEnd() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorGetKeyBeforeNext() {
        map.put("k1", "v1");
        map.mapIterator().getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorGetValueBeforeNext() {
        map.put("k1", "v1");
        map.mapIterator().getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorSetValueBeforeNext() {
        map.put("k1", "v1");
        map.mapIterator().setValue("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorRemoveBeforeNext() {
        map.put("k1", "v1");
        map.mapIterator().remove();
    }

    @Test
    public void testMapIteratorSetValue() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        Object old = it.setValue("newVal");
        assertEquals("v1", old);
        assertEquals("newVal", map.get("k1"));
    }

    @Test
    public void testMapIteratorRemove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    @Test
    public void testMapIteratorResetAndToString() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        assertEquals("Iterator[]", it.toString());
        it.next();
        assertEquals("Iterator[k1=v1]", it.toString());
        ((ResettableIterator) it).reset();
        assertTrue(it.hasNext());
    }

    // ===================== entrySet() =====================

    @Test
    public void testEntrySetEmpty() {
        Set es = map.entrySet();
        assertEquals(0, es.size());
        assertFalse(es.iterator().hasNext());
    }

    @Test
    public void testEntrySetFlatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Set es = map.entrySet();
        assertEquals(2, es.size());
        int count = 0;
        for (Iterator it = es.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            assertNotNull(entry.getKey());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testEntrySetDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Set es = map.entrySet();
        assertEquals(4, es.size());
        int count = 0;
        for (Iterator it = es.iterator(); it.hasNext();) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testEntrySetClear() {
        map.put("k1", "v1");
        map.entrySet().clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testEntrySetRemoveNonEntry() {
        map.put("k1", "v1");
        assertFalse(map.entrySet().remove("not-an-entry"));
    }

    @Test
    public void testEntrySetRemoveEntryPresent() {
        map.put("k1", "v1");
        Map temp = new HashMap();
        temp.put("k1", "v1");
        Map.Entry e = (Map.Entry) temp.entrySet().iterator().next();
        boolean removed = map.entrySet().remove(e);
        assertTrue(removed);
        assertEquals(0, map.size());
    }

    @Test
    public void testEntrySetRemoveEntryAbsent() {
        Map temp = new HashMap();
        temp.put("kx", "vx");
        Map.Entry e = (Map.Entry) temp.entrySet().iterator().next();
        assertFalse(map.entrySet().remove(e));
    }

    @Test
    public void testEntrySetIteratorRemove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Iterator it = map.entrySet().iterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testEntrySetIteratorNextBeyondEnd() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        it.next();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testEntrySetIteratorRemoveBeforeNext() {
        map.put("k1", "v1");
        map.entrySet().iterator().remove();
    }

    @Test
    public void testEntrySetEntryEqualsAndHashCode() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Map temp = new HashMap();
        temp.put("k1", "v1");
        Map.Entry other = (Map.Entry) temp.entrySet().iterator().next();
        assertTrue(entry.equals(other));
        assertEquals(entry.hashCode(), other.hashCode());
        assertFalse(entry.equals("not-entry"));
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEntrySetEntrySetValue() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Object old = entry.setValue("v1-new");
        assertEquals("v1", old);
        assertEquals("v1-new", map.get("k1"));
    }

    @Test
    public void testEntrySetEntryToString() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        assertEquals("k1=v1", entry.toString());
    }

    /** ครอบคลุม branch canRemove==false ของ equals/hashCode/toString ของ EntrySetIterator */
    @Test
    public void testEntrySetIteratorCanRemoveFalseBranches() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it; // ตัว iterator เดียวกันคือ Map.Entry ก่อน next()
        assertEquals("", entry.toString());
        assertEquals(0, entry.hashCode());
        assertFalse(entry.equals(entry));
    }

    // ===================== keySet() =====================

    @Test
    public void testKeySetEmpty() {
        Set ks = map.keySet();
        assertEquals(0, ks.size());
        assertFalse(ks.iterator().hasNext());
    }

    @Test
    public void testKeySetFlatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Set ks = map.keySet();
        assertTrue(ks.contains("k1"));
        assertFalse(ks.contains("nope"));
        int count = 0;
        for (Iterator it = ks.iterator(); it.hasNext();) {
            assertNotNull(it.next());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testKeySetDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Set ks = map.keySet();
        int count = 0;
        for (Iterator it = ks.iterator(); it.hasNext();) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testKeySetRemove() {
        map.put("k1", "v1");
        assertTrue(map.keySet().remove("k1"));
        assertEquals(0, map.size());
    }

    @Test
    public void testKeySetRemoveAbsent() {
        assertFalse(map.keySet().remove("nope"));
    }

    @Test
    public void testKeySetClear() {
        map.put("k1", "v1");
        map.keySet().clear();
        assertEquals(0, map.size());
    }

    // ===================== values() =====================

    @Test
    public void testValuesEmpty() {
        Collection vals = map.values();
        assertEquals(0, vals.size());
        assertFalse(vals.iterator().hasNext());
    }

    @Test
    public void testValuesFlatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Collection vals = map.values();
        assertTrue(vals.contains("v1"));
        assertFalse(vals.contains("nope"));
        int count = 0;
        for (Iterator it = vals.iterator(); it.hasNext();) {
            assertNotNull(it.next());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testValuesDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Collection vals = map.values();
        int count = 0;
        for (Iterator it = vals.iterator(); it.hasNext();) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testValuesClear() {
        map.put("k1", "v1");
        map.values().clear();
        assertEquals(0, map.size());
    }

    // ===================== clone() =====================

    @Test
    public void testCloneFlatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals(map.get("k1"), cloned.get("k1"));
        cloned.put("k3", "v3");
        assertFalse(map.containsKey("k3"));
    }

    @Test
    public void testCloneDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals("v4", cloned.get("k4"));
    }

    // ===================== equals() =====================

    @Test
    public void testEqualsSameInstance() {
        map.put("k1", "v1");
        assertTrue(map.equals(map));
    }

    @Test
    public void testEqualsNotAMap() {
        map.put("k1", "v1");
        assertFalse(map.equals("not a map"));
    }

    @Test
    public void testEqualsDifferentSize() {
        map.put("k1", "v1");
        Map other = new HashMap();
        other.put("k1", "v1");
        other.put("k2", "v2");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEqualsSize0() {
        assertTrue(map.equals(new HashMap()));
    }

    @Test
    public void testEqualsSize1TrueAndFalse() {
        map.put("k1", "v1");
        Map same = new HashMap();
        same.put("k1", "v1");
        assertTrue(map.equals(same));

        Map missingKey = new HashMap();
        missingKey.put("other", "v1");
        assertFalse(map.equals(missingKey));

        Map diffValue = new HashMap();
        diffValue.put("k1", "different");
        assertFalse(map.equals(diffValue));
    }

    @Test
    public void testEqualsSize1NullValueMatch() {
        map.put("k1", null);
        Map other = new HashMap();
        other.put("k1", null);
        assertTrue(map.equals(other));
    }

    @Test
    public void testEqualsSize2TrueAndFalseAtCase2() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Map same = new HashMap();
        same.put("k1", "v1");
        same.put("k2", "v2");
        assertTrue(map.equals(same));

        Map diff = new HashMap();
        diff.put("k1", "v1");
        diff.put("k2", "different");
        assertFalse(map.equals(diff));
    }

    @Test
    public void testEqualsSize3TrueAndFalseAtCase3() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Map same = new HashMap();
        same.put("k1", "v1");
        same.put("k2", "v2");
        same.put("k3", "v3");
        assertTrue(map.equals(same));

        Map diff = new HashMap();
        diff.put("k1", "v1");
        diff.put("k2", "v2");
        diff.put("k3", "different");
        assertFalse(map.equals(diff));
    }

    @Test
    public void testEqualsDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Map other = new HashMap();
        other.put("k1", "v1");
        other.put("k2", "v2");
        other.put("k3", "v3");
        other.put("k4", "v4");
        assertTrue(map.equals(other));
    }

    // ===================== hashCode() =====================

    @Test
    public void testHashCodeSize0() {
        assertEquals(0, map.hashCode());
    }

    @Test
    public void testHashCodeSize1() {
        map.put("k1", "v1");
        int expected = "k1".hashCode() ^ "v1".hashCode();
        assertEquals(expected, map.hashCode());
    }

    @Test
    public void testHashCodeSize3() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        int expected = ("k1".hashCode() ^ "v1".hashCode())
                + ("k2".hashCode() ^ "v2".hashCode())
                + ("k3".hashCode() ^ "v3".hashCode());
        assertEquals(expected, map.hashCode());
    }

    @Test
    public void testHashCodeDelegateModeMatchesHashMapContract() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Map other = new HashMap();
        other.put("k1", "v1");
        other.put("k2", "v2");
        other.put("k3", "v3");
        other.put("k4", "v4");
        assertEquals(other.hashCode(), map.hashCode());
    }

    // ===================== toString() =====================

    @Test
    public void testToStringEmpty() {
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToStringSize1() {
        map.put("k1", "v1");
        assertEquals("{k1=v1}", map.toString());
    }

    @Test
    public void testToStringSize3() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("{k3=v3,k2=v2,k1=v1}", map.toString());
    }

    @Test
    public void testToStringSelfReference() {
        map.put("self", map);
        assertEquals("{self=(this Map)}", map.toString());
    }

    @Test
    public void testToStringDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertNotNull(map.toString());
    }

    // ===================== Serialization (writeObject/readObject) =====================

    @Test
    public void testSerializationRoundTripFlatMode() throws Exception {
        map.put("k1", "v1");
        map.put("k2", "v2");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Flat3Map result = (Flat3Map) ois.readObject();
        ois.close();
        assertEquals(2, result.size());
        assertEquals("v1", result.get("k1"));
        assertEquals("v2", result.get("k2"));
    }

    @Test
    public void testSerializationRoundTripDelegateMode() throws Exception {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4"); // count>3 -> readObject creates delegateMap
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Flat3Map result = (Flat3Map) ois.readObject();
        ois.close();
        assertEquals(4, result.size());
        assertEquals("v4", result.get("k4"));
    }
}
