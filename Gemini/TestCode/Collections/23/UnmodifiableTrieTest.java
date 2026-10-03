package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Tire; // Note: package uses Trie
import org.apache.commons.collections4.Trie;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableTrieTest {

    private Trie<String, String> mockTrie;
    private UnmodifiableTrie<String, String> unmodifiableTrie;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        mockTrie = EasyMock.createMock(Trie.class);
        unmodifiableTrie = new UnmodifiableTrie<String, String>(mockTrie);
    }

    @After
    public void tearDown() {
        EasyMock.verify(mockTrie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTrie() {
        // Trigger branch: trie == null in constructor
        new UnmodifiableTrie<String, String>(null);
    }

    @Test
    public void testFactoryMethod() {
        // Trigger branch: factory method unmodifiableTrie()
        UnmodifiableTrie<String, String> instance = UnmodifiableTrie.unmodifiableTrie(mockTrie);
        assertNotNull(instance);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear() {
        mockTrie.clear();
        EasyMock.expectLastCall().anyTimes();
        EasyMock.replay(mockTrie);

        unmodifiableTrie.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPut() {
        EasyMock.replay(mockTrie);
        unmodifiableTrie.put("key", "value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll() {
        EasyMock.replay(mockTrie);
        unmodifiableTrie.putAll(new HashMap<String, String>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove() {
        EasyMock.replay(mockTrie);
        unmodifiableTrie.remove("key");
    }

    @Test
    public void testContainsKey() {
        EasyMock.expect(mockTrie.containsKey("testKey")).andReturn(true);
        EasyMock.expect(mockTrie.containsKey("missingKey")).andReturn(false);
        EasyMock.replay(mockTrie);

        assertTrue(unmodifiableTrie.containsKey("testKey"));
        assertFalse(unmodifiableTrie.containsKey("missingKey"));
    }

    @Test
    public void testContainsValue() {
        EasyMock.expect(mockTrie.containsValue("testVal")).andReturn(true);
        EasyMock.replay(mockTrie);

        assertTrue(unmodifiableTrie.containsValue("testVal"));
    }

    @Test
    public void testGet() {
        EasyMock.expect(mockTrie.get("key")).andReturn("value");
        EasyMock.replay(mockTrie);

        assertEquals("value", unmodifiableTrie.get("key"));
    }

    @Test
    public void testIsEmpty() {
        EasyMock.expect(mockTrie.isEmpty()).andReturn(false);
        EasyMock.replay(mockTrie);

        assertFalse(unmodifiableTrie.isEmpty());
    }

    @Test
    public void testSize() {
        EasyMock.expect(mockTrie.size()).andReturn(5);
        EasyMock.replay(mockTrie);

        assertEquals(5, unmodifiableTrie.size());
    }

    @Test
    public void testFirstAndLastKey() {
        EasyMock.expect(mockTrie.firstKey()).andReturn("A");
        EasyMock.expect(mockTrie.lastKey()).andReturn("Z");
        EasyMock.replay(mockTrie);

        assertEquals("A", unmodifiableTrie.firstKey());
        assertEquals("Z", unmodifiableTrie.lastKey());
    }

    @Test
    public void testComparator() {
        java.util.Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
        EasyMock.expect(mockTrie.comparator()).andReturn(comp);
        EasyMock.replay(mockTrie);

        assertEquals(comp, unmodifiableTrie.comparator());
    }

    @Test
    public void testNavigationKeys() {
        EasyMock.expect(mockTrie.nextKey("B")).andReturn("C");
        EasyMock.expect(mockTrie.previousKey("B")).andReturn("A");
        EasyMock.replay(mockTrie);

        assertEquals("C", unmodifiableTrie.nextKey("B"));
        assertEquals("A", unmodifiableTrie.previousKey("B"));
    }

    @Test
    public void testObjectMethods() {
        Object obj = new Object();
        EasyMock.expect(mockTrie.hashCode()).andReturn(123);
        EasyMock.expect(mockTrie.equals(obj)).andReturn(true);
        EasyMock.expect(mockTrie.toString()).andReturn("MockTrie");
        EasyMock.replay(mockTrie);

        assertEquals(123, unmodifiableTrie.hashCode());
        assertTrue(unmodifiableTrie.equals(obj));
        assertEquals("MockTrie", unmodifiableTrie.toString());
    }

    @Test
    public void testUnmodifiableViewsAndCollections() {
        // ใช้ TreeMap จริงประกอบร่างเพื่อให้แน่ใจว่า Wrapper ทำงานถูกต้องและป้องกันการแก้ไข
        TreeMap<String, String> realMap = new TreeMap<String, String>();
        realMap.put("a", "1");
        
        Trie<String, String> realTrieMock = EasyMock.createMock(Trie.class);
        EasyMock.expect(realTrieMock.entrySet()).andReturn(realMap.entrySet()).anyTimes();
        EasyMock.expect(realTrieMock.keySet()).andReturn(realMap.keySet()).anyTimes();
        EasyMock.expect(realTrieMock.values()).andReturn(realMap.values()).anyTimes();
        EasyMock.expect(realTrieMock.headMap("b")).andReturn(realMap.headMap("b")).anyTimes();
        EasyMock.expect(realTrieMock.tailMap("a")).andReturn(realMap.tailMap("a")).anyTimes();
        EasyMock.expect(realTrieMock.subMap("a", "z")).andReturn(realMap.subMap("a", "z")).anyTimes();
        EasyMock.expect(realTrieMock.prefixMap("a")).andReturn(realMap).anyTimes();
        
        OrderedMapIterator<String, String> mockIter = EasyMock.createMock(OrderedMapIterator.class);
        EasyMock.expect(realTrieMock.mapIterator()).andReturn(mockIter).anyTimes();

        EasyMock.replay(realTrieMock);

        UnmodifiableTrie<String, String> uTrie = new UnmodifiableTrie<String, String>(realTrieMock);

        // Test entrySet unmodifiable
        Set<Map.Entry<String, String>> entrySet = uTrie.entrySet();
        assertNotNull(entrySet);
        boolean entrySetUnsupported = false;
        try {
            entrySet.clear();
        } catch (UnsupportedOperationException e) {
            entrySetUnsupported = true;
        }
        assertTrue(entrySetUnsupported);

        // Test keySet unmodifiable
        Set<String> keySet = uTrie.keySet();
        assertNotNull(keySet);
        boolean keySetUnsupported = false;
        try {
            keySet.add("b");
        } catch (UnsupportedOperationException e) {
            keySetUnsupported = true;
        }
        assertTrue(keySetUnsupported);

        // Test values unmodifiable
        Collection<String> values = uTrie.values();
        assertNotNull(values);
        boolean valuesUnsupported = false;
        try {
            values.remove("1");
        } catch (UnsupportedOperationException e) {
            valuesUnsupported = true;
        }
        assertTrue(valuesUnsupported);

        // Test SortedMap views
        SortedMap<String, String> headMap = uTrie.headMap("b");
        assertNotNull(headMap);
        boolean headMapUnsupported = false;
        try {
            headMap.put("x", "2");
        } catch (UnsupportedOperationException e) {
            headMapUnsupported = true;
        }
        assertTrue(headMapUnsupported);

        SortedMap<String, String> tailMap = uTrie.tailMap("a");
        assertNotNull(tailMap);

        SortedMap<String, String> subMap = uTrie.subMap("a", "z");
        assertNotNull(subMap);

        SortedMap<String, String> prefixMap = uTrie.prefixMap("a");
        assertNotNull(prefixMap);

        // Test mapIterator wrapper
        assertNotNull(uTrie.mapIterator());
        
        EasyMock.verify(realTrieMock);
    }
}