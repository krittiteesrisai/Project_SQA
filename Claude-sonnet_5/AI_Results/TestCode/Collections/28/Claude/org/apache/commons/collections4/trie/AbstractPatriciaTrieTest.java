package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test สำหรับ {@link AbstractPatriciaTrie} (Defects4J Collections-28b)
 *
 * ดูหมายเหตุ/ข้อสมมติฐานทั้งหมดที่ด้านบนของคำตอบ
 */
public class AbstractPatriciaTrieTest {

    private AbstractPatriciaTrie<String, String> trie;

    @Before
    public void setUp() {
        // PatriciaTrie<V> extends AbstractPatriciaTrie<String, V>
        // ใช้เป็นตัวสร้าง instance ของคลาส abstract เป้าหมาย
        trie = new PatriciaTrie<String>();
    }

    private static AbstractPatriciaTrie.TrieEntry<String, String> newEntry(
            final String key, final String value, final int bitIndex) {
        return new AbstractPatriciaTrie.TrieEntry<String, String>(key, value, bitIndex);
    }

    // ---------------------------------------------------------------
    // size() / clear() / put() / get()
    // ---------------------------------------------------------------

    @Test
    public void testNewTrieIsEmpty() {
        assertEquals(0, trie.size());
        assertTrue(trie.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testPutNullKeyThrowsNPE() {
        trie.put(null, "x");
    }

    @Test
    public void testPutEmptyStringKey_FirstTime_IncrementsSize() {
        assertNull(trie.put("", "v1"));
        assertEquals(1, trie.size());
        assertEquals("v1", trie.get(""));
    }

    @Test
    public void testPutEmptyStringKey_SecondTime_UpdatesValueOnly() {
        trie.put("", "v1");
        final String old = trie.put("", "v2");
        assertEquals("v1", old);
        assertEquals(1, trie.size());
        assertEquals("v2", trie.get(""));
    }

    @Test
    public void testPutAndGetNormalKey() {
        assertNull(trie.put("A", "1"));
        assertEquals(1, trie.size());
        assertEquals("1", trie.get("A"));
    }

    @Test
    public void testPutUpdateExistingKey_ReturnsOldValue() {
        trie.put("A", "1");
        final String old = trie.put("A", "2");
        assertEquals("1", old);
        assertEquals("2", trie.get("A"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testGetNonExistingKey_ReturnsNull() {
        trie.put("A", "1");
        assertNull(trie.get("B"));
    }

    @Test
    public void testGetOnEmptyTrie_ReturnsNull() {
        assertNull(trie.get("A"));
    }

    @Test
    public void testGetNullKey_ReturnsNull() {
        // ครอบคลุมสาขา key==null ภายใน getEntry()
        assertNull(trie.get(null));
    }

    @Test
    public void testClear_ResetsTrie() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.clear();
        assertEquals(0, trie.size());
        assertTrue(trie.isEmpty());
        assertNull(trie.get("A"));
        trie.put("A", "3");
        assertEquals(1, trie.size());
        assertEquals("3", trie.get("A"));
    }

    // ---------------------------------------------------------------
    // containsKey()
    // ---------------------------------------------------------------

    @Test
    public void testContainsKeyNull_ReturnsFalse() {
        assertFalse(trie.containsKey(null));
    }

    @Test
    public void testContainsKey_Existing_True() {
        trie.put("A", "1");
        assertTrue(trie.containsKey("A"));
    }

    @Test
    public void testContainsKey_NonExisting_False() {
        trie.put("A", "1");
        assertFalse(trie.containsKey("B"));
    }

    // ---------------------------------------------------------------
    // remove()
    // ---------------------------------------------------------------

    @Test
    public void testRemoveNullKey_ReturnsNull() {
        assertNull(trie.remove(null));
    }

    @Test
    public void testRemoveNonExistingKey_ReturnsNull() {
        trie.put("A", "1");
        assertNull(trie.remove("Z"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testRemoveExistingKey_ReturnsValueAndDecrementsSize() {
        trie.put("A", "1");
        trie.put("B", "2");
        final String removed = trie.remove("A");
        assertEquals("1", removed);
        assertEquals(1, trie.size());
        assertFalse(trie.containsKey("A"));
        assertTrue(trie.containsKey("B"));
    }

    @Test
    public void testRemoveAllKeys_StructuralVariety() {
        // โครงสร้างหลากหลาย เพื่อกระตุ้นทั้ง external และ internal node removal
        final String[] keys = {"A", "AB", "ABC", "B", "BA", "C", "CA", "CAB"};
        for (int i = 0; i < keys.length; i++) {
            trie.put(keys[i], "v" + i);
        }
        assertEquals(keys.length, trie.size());
        for (final String k : keys) {
            assertTrue(trie.containsKey(k));
        }
        for (int i = 0; i < keys.length; i++) {
            final String removedValue = trie.remove(keys[i]);
            assertEquals("v" + i, removedValue);
            for (int j = 0; j < keys.length; j++) {
                if (j <= i) {
                    assertFalse(trie.containsKey(keys[j]));
                } else {
                    assertTrue(trie.containsKey(keys[j]));
                }
            }
        }
        assertEquals(0, trie.size());
    }

    @Test
    public void testRemoveEntryDirect() {
        trie.put("A", "1");
        trie.put("B", "2");
        final AbstractPatriciaTrie.TrieEntry<String, String> entry = trie.getEntry("A");
        assertNotNull(entry);
        final String old = trie.removeEntry(entry);
        assertEquals("1", old);
        assertFalse(trie.containsKey("A"));
        assertEquals(1, trie.size());
    }

    // ---------------------------------------------------------------
    // firstKey / lastKey / nextKey / previousKey
    // ---------------------------------------------------------------

    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_EmptyTrie_Throws() {
        trie.firstKey();
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKey_EmptyTrie_Throws() {
        trie.lastKey();
    }

    @Test
    public void testFirstKeyLastKey_SingleCharKeys() {
        trie.put("B", "2");
        trie.put("A", "1");
        trie.put("C", "3");
        assertEquals("A", trie.firstKey());
        assertEquals("C", trie.lastKey());
    }

    @Test(expected = NullPointerException.class)
    public void testNextKey_NullKey_Throws() {
        trie.nextKey(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPreviousKey_NullKey_Throws() {
        trie.previousKey(null);
    }

    @Test
    public void testNextKey_KeyNotPresent_ReturnsNull() {
        trie.put("A", "1");
        assertNull(trie.nextKey("Z"));
    }

    @Test
    public void testPreviousKey_KeyNotPresent_ReturnsNull() {
        trie.put("A", "1");
        assertNull(trie.previousKey("Z"));
    }

    @Test
    public void testNextKeyPreviousKey_Sequence() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        assertEquals("B", trie.nextKey("A"));
        assertEquals("C", trie.nextKey("B"));
        assertNull(trie.nextKey("C"));

        assertEquals("B", trie.previousKey("C"));
        assertEquals("A", trie.previousKey("B"));
        assertNull(trie.previousKey("A"));
    }

    // ---------------------------------------------------------------
    // select / selectKey / selectValue
    // ---------------------------------------------------------------

    @Test
    public void testSelect_EmptyTrie_ReturnsNull() {
        assertNull(trie.select("A"));
        assertNull(trie.selectKey("A"));
        assertNull(trie.selectValue("A"));
    }

    @Test
    public void testSelect_NonEmptyTrie_ReturnsEntry() {
        trie.put("A", "1");
        final Map.Entry<String, String> entry = trie.select("A");
        assertNotNull(entry);
        assertEquals("A", entry.getKey());
        assertEquals("1", entry.getValue());
        assertEquals("A", trie.selectKey("A"));
        assertEquals("1", trie.selectValue("A"));
    }

    // ---------------------------------------------------------------
    // higherEntry / ceilingEntry / lowerEntry / floorEntry
    // ---------------------------------------------------------------

    @Test
    public void testHigherEntry_EmptyKey_RootEmpty_ReturnsFirstEntry() {
        trie.put("A", "1");
        final AbstractPatriciaTrie.TrieEntry<String, String> e = trie.higherEntry("");
        assertNotNull(e);
        assertEquals("A", e.getKey());
    }

    @Test
    public void testHigherEntry_EmptyKey_RootNonEmptySizeOne_ReturnsNull() {
        trie.put("", "root");
        assertNull(trie.higherEntry(""));
    }

    @Test
    public void testHigherEntry_EmptyKey_RootNonEmptyMultiple_ReturnsNextEntry() {
        trie.put("", "root");
        trie.put("A", "1");
        final AbstractPatriciaTrie.TrieEntry<String, String> e = trie.higherEntry("");
        assertNotNull(e);
        assertEquals("A", e.getKey());
    }

    @Test
    public void testCeilingEntry_EmptyKey_RootNonEmpty_ReturnsRoot() {
        trie.put("", "root");
        final AbstractPatriciaTrie.TrieEntry<String, String> e = trie.ceilingEntry("");
        assertEquals("root", e.getValue());
    }

    @Test
    public void testCeilingEntry_EmptyKey_RootEmpty_ReturnsFirstEntry() {
        trie.put("A", "1");
        final AbstractPatriciaTrie.TrieEntry<String, String> e = trie.ceilingEntry("");
        assertEquals("A", e.getKey());
    }

    @Test
    public void testFloorEntry_EmptyKey_RootNonEmpty_ReturnsRoot() {
        trie.put("", "root");
        final AbstractPatriciaTrie.TrieEntry<String, String> e = trie.floorEntry("");
        assertEquals("root", e.getValue());
    }

    @Test
    public void testFloorEntry_EmptyKey_RootEmpty_ReturnsNull() {
        trie.put("A", "1");
        assertNull(trie.floorEntry(""));
    }

    @Test
    public void testLowerEntry_EmptyKey_AlwaysNull() {
        trie.put("A", "1");
        assertNull(trie.lowerEntry(""));
    }

    @Test
    public void testCeilingHigherLowerFloor_KeyBetweenExisting() {
        trie.put("A", "1");
        trie.put("C", "3");

        assertEquals("C", trie.higherEntry("B").getKey());
        assertEquals("C", trie.ceilingEntry("B").getKey());
        assertEquals("A", trie.lowerEntry("B").getKey());
        assertEquals("A", trie.floorEntry("B").getKey());

        assertEquals(2, trie.size()); // ยืนยันว่า temp add/remove ไม่กระทบ size จริง
    }

    @Test
    public void testCeilingFloor_KeyEqualsExisting_ReturnsFound() {
        trie.put("A", "1");
        trie.put("C", "3");
        assertEquals("A", trie.ceilingEntry("A").getKey());
        assertEquals("A", trie.floorEntry("A").getKey());
        assertEquals("C", trie.ceilingEntry("C").getKey());
        assertEquals("C", trie.floorEntry("C").getKey());
    }

    @Test
    public void testHigherLower_KeyEqualsExisting_ReturnsAdjacent() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        assertEquals("B", trie.higherEntry("A").getKey());
        assertNull(trie.higherEntry("C"));
        assertEquals("B", trie.lowerEntry("C").getKey());
        assertNull(trie.lowerEntry("A"));
    }

    // ---------------------------------------------------------------
    // keySet / values / entrySet
    // ---------------------------------------------------------------

    @Test
    public void testKeySet_Basic() {
        trie.put("A", "1");
        trie.put("B", "2");
        assertEquals(2, trie.keySet().size());
        assertTrue(trie.keySet().contains("A"));
        assertFalse(trie.keySet().contains("Z"));
    }

    @Test
    public void testKeySet_Remove() {
        trie.put("A", "1");
        assertTrue(trie.keySet().remove("A"));
        assertFalse(trie.containsKey("A"));
        assertFalse(trie.keySet().remove("A"));
    }

    @Test
    public void testKeySet_Clear() {
        trie.put("A", "1");
        trie.keySet().clear();
        assertEquals(0, trie.size());
    }

    @Test
    public void testValues_Basic() {
        trie.put("A", "1");
        trie.put("B", "2");
        assertEquals(2, trie.values().size());
        assertTrue(trie.values().contains("1"));
        assertFalse(trie.values().contains("Z"));
    }

    @Test
    public void testValues_Remove() {
        trie.put("A", "1");
        trie.put("B", "2");
        assertTrue(trie.values().remove("1"));
        assertFalse(trie.containsKey("A"));
        assertEquals(1, trie.size());
        assertFalse(trie.values().remove("999"));
    }

    @Test
    public void testEntrySet_Basic() {
        trie.put("A", "1");
        assertEquals(1, trie.entrySet().size());
        final Map.Entry<String, String> match = new AbstractMap.SimpleEntry<String, String>("A", "1");
        final Map.Entry<String, String> mismatch = new AbstractMap.SimpleEntry<String, String>("A", "X");
        assertTrue(trie.entrySet().contains(match));
        assertFalse(trie.entrySet().contains(mismatch));
        assertFalse(trie.entrySet().contains("not-an-entry"));
    }

    @Test
    public void testEntrySet_Remove() {
        trie.put("A", "1");
        final Map.Entry<String, String> match = new AbstractMap.SimpleEntry<String, String>("A", "1");
        assertTrue(trie.entrySet().remove(match));
        assertFalse(trie.containsKey("A"));
        assertFalse(trie.entrySet().remove("not-an-entry"));
    }

    @Test
    public void testEntrySet_Clear() {
        trie.put("A", "1");
        trie.entrySet().clear();
        assertEquals(0, trie.size());
    }

    @Test
    public void testIterator_RemoveViaEntrySetIterator() {
        trie.put("A", "1");
        trie.put("B", "2");
        final Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertEquals(1, trie.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testIterator_RemoveWithoutNext_ThrowsIllegalStateException() {
        trie.put("A", "1");
        final Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        it.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextAfterExhausted_ThrowsNoSuchElementException() {
        final Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        assertFalse(it.hasNext());
        it.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIterator_ConcurrentModification_Throws() {
        trie.put("A", "1");
        trie.put("B", "2");
        final Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        it.next();
        trie.put("C", "3");
        it.next();
    }

    // ---------------------------------------------------------------
    // mapIterator() -- OrderedMapIterator
    // ---------------------------------------------------------------

    @Test
    public void testMapIterator_ForwardTraversal() {
        trie.put("A", "1");
        trie.put("B", "2");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertEquals("A", it.getKey());
        assertEquals("1", it.getValue());
        assertEquals("B", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIterator_SetValue() {
        trie.put("A", "1");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        it.next();
        final String old = it.setValue("999");
        assertEquals("1", old);
        assertEquals("999", trie.get("A"));
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_GetKeyBeforeNext_Throws() {
        trie.put("A", "1");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        it.getKey();
    }

    @Test
    public void testMapIterator_PreviousTraversal() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        it.next();
        it.next();
        it.next();
        assertTrue(it.hasPrevious());
        assertEquals("C", it.previous());
        assertEquals("B", it.previous());
        assertEquals("A", it.previous());
    }

    // ---------------------------------------------------------------
    // headMap / tailMap / subMap
    // ---------------------------------------------------------------

    @Test
    public void testHeadMap_ExclusiveOfToKey() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        final SortedMap<String, String> head = trie.headMap("C");
        assertEquals(2, head.size());
        assertTrue(head.containsKey("A"));
        assertTrue(head.containsKey("B"));
        assertFalse(head.containsKey("C"));
    }

    @Test
    public void testTailMap_InclusiveOfFromKey() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        final SortedMap<String, String> tail = trie.tailMap("B");
        assertEquals(2, tail.size());
        assertTrue(tail.containsKey("B"));
        assertTrue(tail.containsKey("C"));
        assertFalse(tail.containsKey("A"));
    }

    @Test
    public void testSubMap_FromInclusiveToExclusive() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        trie.put("D", "4");
        final SortedMap<String, String> sub = trie.subMap("B", "D");
        assertEquals(2, sub.size());
        assertTrue(sub.containsKey("B"));
        assertTrue(sub.containsKey("C"));
        assertFalse(sub.containsKey("D"));
        assertFalse(sub.containsKey("A"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubMap_FromGreaterThanTo_Throws() {
        trie.subMap("D", "A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeMap_PutOutOfRange_Throws() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        final SortedMap<String, String> head = trie.headMap("C");
        head.put("Z", "out-of-range");
    }

    @Test
    public void testRangeMap_PutInRange_Succeeds() {
        trie.put("A", "1");
        trie.put("C", "3");
        final SortedMap<String, String> sub = trie.subMap("A", "C");
        sub.put("B", "2");
        assertEquals("2", trie.get("B"));
    }

    @Test
    public void testHeadMap_FirstKeyLastKey() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        final SortedMap<String, String> head = trie.headMap("C");
        assertEquals("A", head.firstKey());
        assertEquals("B", head.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testHeadMap_FirstKey_EmptyRange_Throws() {
        trie.put("C", "3");
        final SortedMap<String, String> head = trie.headMap("A");
        head.firstKey();
    }

    @Test
    public void testSubMap_EntrySet_SizeAndIteration() {
        trie.put("A", "1");
        trie.put("B", "2");
        trie.put("C", "3");
        trie.put("D", "4");
        final SortedMap<String, String> sub = trie.subMap("B", "D");
        int count = 0;
        for (final Map.Entry<String, String> e : sub.entrySet()) {
            assertTrue(e.getKey().equals("B") || e.getKey().equals("C"));
            count++;
        }
        assertEquals(2, count);
        assertEquals(2, sub.entrySet().size());
    }

    // ---------------------------------------------------------------
    // prefixMap
    // ---------------------------------------------------------------

    @Test
    public void testPrefixMap_ZeroLengthKey_ReturnsSameInstance() {
        trie.put("A", "1");
        final SortedMap<String, String> prefix = trie.prefixMap("");
        assertSame(trie, prefix);
    }

    @Test
    public void testPrefixMap_Basic() {
        trie.put("Apple", "1");
        trie.put("Application", "2");
        trie.put("Banana", "3");
        final SortedMap<String, String> prefix = trie.prefixMap("App");
        assertTrue(prefix.containsKey("Apple"));
        assertTrue(prefix.containsKey("Application"));
        assertFalse(prefix.containsKey("Banana"));
    }

    // ---------------------------------------------------------------
    // comparator()
    // ---------------------------------------------------------------

    @Test
    public void testComparator_NotNull() {
        assertNotNull(trie.comparator());
    }

    // ---------------------------------------------------------------
    // serialization
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_RoundTrip() throws IOException, ClassNotFoundException {
        trie.put("A", "1");
        trie.put("B", "2");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(trie);
        oos.close();

        final ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        @SuppressWarnings("unchecked")
        final AbstractPatriciaTrie<String, String> restored =
                (AbstractPatriciaTrie<String, String>) ois.readObject();
        ois.close();

        assertEquals(2, restored.size());
        assertEquals("1", restored.get("A"));
        assertEquals("2", restored.get("B"));
    }

    // ---------------------------------------------------------------
    // isValidUplink (static)
    // ---------------------------------------------------------------

    @Test
    public void testIsValidUplink_NullNext_ReturnsFalse() {
        final AbstractPatriciaTrie.TrieEntry<String, String> from = newEntry("A", "1", 5);
        assertFalse(AbstractPatriciaTrie.isValidUplink(null, from));
    }

    @Test
    public void testIsValidUplink_BitIndexGreater_ReturnsFalse() {
        final AbstractPatriciaTrie.TrieEntry<String, String> next = newEntry("A", "1", 5);
        final AbstractPatriciaTrie.TrieEntry<String, String> from = newEntry("B", "2", 3);
        assertFalse(AbstractPatriciaTrie.isValidUplink(next, from));
    }

    @Test
    public void testIsValidUplink_EmptyNext_ReturnsFalse() {
        final AbstractPatriciaTrie.TrieEntry<String, String> next = newEntry(null, null, -1);
        final AbstractPatriciaTrie.TrieEntry<String, String> from = newEntry("A", "1", 5);
        assertFalse(AbstractPatriciaTrie.isValidUplink(next, from));
    }

    @Test
    public void testIsValidUplink_ValidUplink_ReturnsTrue() {
        final AbstractPatriciaTrie.TrieEntry<String, String> next = newEntry("A", "1", 3);
        final AbstractPatriciaTrie.TrieEntry<String, String> from = newEntry("B", "2", 5);
        assertTrue(AbstractPatriciaTrie.isValidUplink(next, from));
    }

    // ---------------------------------------------------------------
    // TrieEntry - isEmpty / isInternalNode / isExternalNode
    // ---------------------------------------------------------------

    @Test
    public void testTrieEntry_isEmpty_TrueWhenKeyNull() {
        assertTrue(newEntry(null, null, -1).isEmpty());
    }

    @Test
    public void testTrieEntry_isEmpty_FalseWhenKeyPresent() {
        assertFalse(newEntry("A", "1", 0).isEmpty());
    }

    @Test
    public void testTrieEntry_isExternalNode_DefaultSelfLoop() {
        final AbstractPatriciaTrie.TrieEntry<String, String> e = newEntry("A", "1", 0);
        assertTrue(e.isExternalNode());
        assertFalse(e.isInternalNode());
    }

    @Test
    public void testTrieEntry_isInternalNode_WhenLeftRightNotSelf() {
        final AbstractPatriciaTrie.TrieEntry<String, String> e = newEntry("A", "1", 5);
        e.left = newEntry("B", "2", 1);
        e.right = newEntry("C", "3", 2);
        assertTrue(e.isInternalNode());
        assertFalse(e.isExternalNode());
    }

    // ---------------------------------------------------------------
    // TrieEntry.toString()
    // ---------------------------------------------------------------

    @Test
    public void testTrieEntry_toString_RootWithNullLinks() {
        final AbstractPatriciaTrie.TrieEntry<String, String> root = newEntry(null, null, -1);
        root.parent = null;
        root.left = null;
        root.right = null;
        root.predecessor = null;

        final String s = root.toString();
        assertTrue(s.contains("RootEntry("));
        assertTrue(s.contains("parent=null"));
        assertTrue(s.contains("left=null"));
        assertTrue(s.contains("right=null"));
        assertFalse(s.contains("predecessor="));
    }

    @Test
    public void testTrieEntry_toString_LinksPointToRoot() {
        final AbstractPatriciaTrie.TrieEntry<String, String> rootLike = newEntry(null, null, -1);
        final AbstractPatriciaTrie.TrieEntry<String, String> e = newEntry("A", "1", 4);
        e.parent = rootLike;
        e.left = rootLike;
        e.right = rootLike;
        e.predecessor = rootLike;

        final String s = e.toString();
        assertTrue(s.contains("Entry("));
        assertTrue(s.contains("parent=ROOT"));
        assertTrue(s.contains("left=ROOT"));
        assertTrue(s.contains("right=ROOT"));
        assertTrue(s.contains("predecessor=ROOT"));
    }

    @Test
    public void testTrieEntry_toString_LinksPointToNormalEntries() {
        final AbstractPatriciaTrie.TrieEntry<String, String> other = newEntry("X", "9", 7);
        final AbstractPatriciaTrie.TrieEntry<String, String> e = newEntry("A", "1", 4);
        e.parent = other;
        e.left = other;
        e.right = other;
        e.predecessor = other;

        final String s = e.toString();
        assertTrue(s.contains("parent=X [7]"));
        assertTrue(s.contains("left=X [7]"));
        assertTrue(s.contains("right=X [7]"));
        assertTrue(s.contains("predecessor=X [7]"));
    }
}
