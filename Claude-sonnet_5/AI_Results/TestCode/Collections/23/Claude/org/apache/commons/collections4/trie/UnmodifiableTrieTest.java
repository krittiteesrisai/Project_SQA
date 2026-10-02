package org.apache.commons.collections4.trie;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link UnmodifiableTrie} (Collections-23b).
 *
 * ใช้ EasyMock ในการจำลอง {@link Trie} เพื่อตรวจสอบว่า UnmodifiableTrie
 * ทำการ delegate เมธอด "อ่าน" ไปยัง delegate จริง และ throw
 * UnsupportedOperationException สำหรับเมธอด "เขียน" ทุกตัว
 * รวมถึงตรวจสอบว่า Collection/Map ที่คืนกลับมาเป็น unmodifiable
 */
public class UnmodifiableTrieTest {

    private Trie<String, String> mockTrie;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        // EasyMock 2.0 ไม่รองรับ generic mock โดยตรง จึงต้อง cast จาก raw type
        mockTrie = createMock(Trie.class);
    }

    @After
    public void tearDown() {
        // ไม่มี resource พิเศษต้อง cleanup
    }

    // ------------------------------------------------------------------
    // Constructor / Factory method
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullTrie_ThrowsIllegalArgumentException() {
        new UnmodifiableTrie<String, String>(null);
    }

    @Test
    public void testConstructor_ValidTrie_CreatesInstance() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertNotNull(trie);
        verify(mockTrie);
    }

    @Test
    public void testFactoryMethod_UnmodifiableTrie_CreatesInstance() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = UnmodifiableTrie.unmodifiableTrie(mockTrie);
        assertNotNull(trie);
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // entrySet / keySet / values : delegate + unmodifiable wrapper
    // ------------------------------------------------------------------

    @Test
    public void testEntrySet_DelegatesAndReturnsUnmodifiableSet() {
        Set<Map.Entry<String, String>> realSet = new HashSet<Map.Entry<String, String>>();
        realSet.add(new AbstractMap.SimpleEntry<String, String>("k1", "v1"));
        expect(mockTrie.entrySet()).andReturn(realSet);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        Set<Map.Entry<String, String>> result = trie.entrySet();

        assertEquals(realSet, result);
        try {
            result.add(new AbstractMap.SimpleEntry<String, String>("k2", "v2"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    @Test
    public void testKeySet_DelegatesAndReturnsUnmodifiableSet() {
        Set<String> realSet = new HashSet<String>();
        realSet.add("k1");
        expect(mockTrie.keySet()).andReturn(realSet);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        Set<String> result = trie.keySet();

        assertEquals(realSet, result);
        try {
            result.add("k2");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    @Test
    public void testValues_DelegatesAndReturnsUnmodifiableCollection() {
        java.util.Collection<String> realValues = new java.util.ArrayList<String>();
        realValues.add("v1");
        expect(mockTrie.values()).andReturn(realValues);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        java.util.Collection<String> result = trie.values();

        assertEquals(realValues, result);
        try {
            result.add("v2");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // Mutator methods : must throw UnsupportedOperationException
    // ------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_ThrowsUnsupportedOperationException() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        trie.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPut_ThrowsUnsupportedOperationException() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        trie.put("k", "v");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll_ThrowsUnsupportedOperationException() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        Map<String, String> m = new TreeMap<String, String>();
        m.put("k", "v");
        trie.putAll(m);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_ThrowsUnsupportedOperationException() {
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        trie.remove("k");
    }

    // ------------------------------------------------------------------
    // Simple read-only delegation methods
    // ------------------------------------------------------------------

    @Test
    public void testContainsKey_Delegates_True() {
        expect(mockTrie.containsKey("k1")).andReturn(true);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertTrue(trie.containsKey("k1"));
        verify(mockTrie);
    }

    @Test
    public void testContainsKey_Delegates_False() {
        expect(mockTrie.containsKey("k1")).andReturn(false);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertFalse(trie.containsKey("k1"));
        verify(mockTrie);
    }

    @Test
    public void testContainsValue_Delegates() {
        expect(mockTrie.containsValue("v1")).andReturn(true);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertTrue(trie.containsValue("v1"));
        verify(mockTrie);
    }

    @Test
    public void testGet_Delegates_NonNull() {
        expect(mockTrie.get("k1")).andReturn("v1");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("v1", trie.get("k1"));
        verify(mockTrie);
    }

    @Test
    public void testGet_Delegates_Null() {
        expect(mockTrie.get("unknown")).andReturn(null);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertNull(trie.get("unknown"));
        verify(mockTrie);
    }

    @Test
    public void testIsEmpty_Delegates_True() {
        expect(mockTrie.isEmpty()).andReturn(true);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertTrue(trie.isEmpty());
        verify(mockTrie);
    }

    @Test
    public void testIsEmpty_Delegates_False() {
        expect(mockTrie.isEmpty()).andReturn(false);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertFalse(trie.isEmpty());
        verify(mockTrie);
    }

    @Test
    public void testSize_Delegates_Zero() {
        expect(mockTrie.size()).andReturn(0);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals(0, trie.size());
        verify(mockTrie);
    }

    @Test
    public void testSize_Delegates_Positive() {
        expect(mockTrie.size()).andReturn(5);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals(5, trie.size());
        verify(mockTrie);
    }

    @Test
    public void testFirstKey_Delegates() {
        expect(mockTrie.firstKey()).andReturn("first");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("first", trie.firstKey());
        verify(mockTrie);
    }

    @Test
    public void testLastKey_Delegates() {
        expect(mockTrie.lastKey()).andReturn("last");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("last", trie.lastKey());
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // headMap / subMap / tailMap / prefixMap : delegate + unmodifiable
    // ------------------------------------------------------------------

    @Test
    public void testHeadMap_DelegatesAndReturnsUnmodifiableSortedMap() {
        SortedMap<String, String> real = new TreeMap<String, String>();
        real.put("a", "1");
        expect(mockTrie.headMap("b")).andReturn(real);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        SortedMap<String, String> result = trie.headMap("b");

        assertEquals(real, result);
        try {
            result.put("x", "y");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    @Test
    public void testSubMap_DelegatesAndReturnsUnmodifiableSortedMap() {
        SortedMap<String, String> real = new TreeMap<String, String>();
        real.put("a", "1");
        expect(mockTrie.subMap("a", "z")).andReturn(real);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        SortedMap<String, String> result = trie.subMap("a", "z");

        assertEquals(real, result);
        try {
            result.put("x", "y");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    @Test
    public void testTailMap_DelegatesAndReturnsUnmodifiableSortedMap() {
        SortedMap<String, String> real = new TreeMap<String, String>();
        real.put("m", "1");
        expect(mockTrie.tailMap("a")).andReturn(real);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        SortedMap<String, String> result = trie.tailMap("a");

        assertEquals(real, result);
        try {
            result.put("x", "y");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    @Test
    public void testPrefixMap_DelegatesAndReturnsUnmodifiableSortedMap() {
        SortedMap<String, String> real = new TreeMap<String, String>();
        real.put("pre1", "1");
        expect(mockTrie.prefixMap("pre")).andReturn(real);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        SortedMap<String, String> result = trie.prefixMap("pre");

        assertEquals(real, result);
        try {
            result.put("x", "y");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // comparator
    // ------------------------------------------------------------------

    @Test
    public void testComparator_Delegates_NonNull() {
        @SuppressWarnings("unchecked")
        Comparator<String> comparator = createMock(Comparator.class);
        expect(mockTrie.comparator()).andReturn(comparator);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals(comparator, trie.comparator());
        verify(mockTrie);
    }

    @Test
    public void testComparator_Delegates_Null() {
        expect(mockTrie.comparator()).andReturn(null);
        replay(mockTrie);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertNull(trie.comparator());
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // mapIterator : delegate + wrapped by UnmodifiableOrderedMapIterator
    // ------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    @Test
    public void testMapIterator_Delegates_ReturnsNonNullWrapper() {
        OrderedMapIterator<String, String> mockIt = createMock(OrderedMapIterator.class);
        expect(mockTrie.mapIterator()).andReturn(mockIt);
        replay(mockTrie, mockIt);

        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        OrderedMapIterator<String, String> result = trie.mapIterator();

        // ตรวจสอบเพียงว่า delegate ถูกเรียก และผลลัพธ์ไม่เป็น null
        // (ไม่เดา behavior ภายในของ UnmodifiableOrderedMapIterator
        //  เนื่องจากไม่มีซอร์สโค้ดของคลาสนั้นให้พิจารณา)
        assertNotNull(result);
        verify(mockTrie, mockIt);
    }

    // ------------------------------------------------------------------
    // nextKey / previousKey
    // ------------------------------------------------------------------

    @Test
    public void testNextKey_Delegates_NonNull() {
        expect(mockTrie.nextKey("k1")).andReturn("k2");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("k2", trie.nextKey("k1"));
        verify(mockTrie);
    }

    @Test
    public void testNextKey_Delegates_Null() {
        expect(mockTrie.nextKey("lastKey")).andReturn(null);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertNull(trie.nextKey("lastKey"));
        verify(mockTrie);
    }

    @Test
    public void testPreviousKey_Delegates_NonNull() {
        expect(mockTrie.previousKey("k2")).andReturn("k1");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("k1", trie.previousKey("k2"));
        verify(mockTrie);
    }

    @Test
    public void testPreviousKey_Delegates_Null() {
        expect(mockTrie.previousKey("firstKey")).andReturn(null);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertNull(trie.previousKey("firstKey"));
        verify(mockTrie);
    }

    // ------------------------------------------------------------------
    // hashCode / equals / toString
    // ------------------------------------------------------------------

    @Test
    public void testHashCode_Delegates() {
        expect(mockTrie.hashCode()).andReturn(12345);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals(12345, trie.hashCode());
        verify(mockTrie);
    }

    @Test
    public void testEquals_Delegates_True() {
        Object other = new Object();
        expect(mockTrie.equals(other)).andReturn(true);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertTrue(trie.equals(other));
        verify(mockTrie);
    }

    @Test
    public void testEquals_Delegates_False() {
        Object other = new Object();
        expect(mockTrie.equals(other)).andReturn(false);
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertFalse(trie.equals(other));
        verify(mockTrie);
    }

    @Test
    public void testToString_Delegates() {
        expect(mockTrie.toString()).andReturn("mockedTrieString");
        replay(mockTrie);
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(mockTrie);
        assertEquals("mockedTrieString", trie.toString());
        verify(mockTrie);
    }
}
