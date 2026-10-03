package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import org.apache.commons.collections.bag.HashBag;

/**
 * High-coverage JUnit 4 test suite for CollectionUtils targeting deep branch/condition coverage and edge cases.
 */
public class CollectionUtilsTest {

    @Test
    public void testUnion() {
        List a = Arrays.asList(new String[]{"A", "B", "B", "C"});
        List b = Arrays.asList(new String[]{"B", "C", "C", "D"});
        Collection result = CollectionUtils.union(a, b);
        assertNotNull(result);
        // Max cardinality: A=1, B=2, C=2, D=1 -> Total size 6
        assertEquals(6, result.size());
    }

    @Test
    public void testIntersection() {
        List a = Arrays.asList(new String[]{"A", "B", "B", "C"});
        List b = Arrays.asList(new String[]{"B", "C", "C", "D"});
        Collection result = CollectionUtils.intersection(a, b);
        assertNotNull(result);
        // Min cardinality: A=0, B=1, C=1, D=0 -> Total size 2 (B, C)
        assertEquals(2, result.size());
    }

    @Test
    public void testDisjunction() {
        List a = Arrays.asList(new String[]{"A", "B", "B", "C"});
        List b = Arrays.asList(new String[]{"B", "C", "C", "D"});
        Collection result = CollectionUtils.disjunction(a, b);
        assertNotNull(result);
        // max - min: A=1-0=1, B=2-1=1, C=2-1=1, D=1-0=1 -> Total size 4
        assertEquals(4, result.size());
    }

    @Test
    public void testSubtract() {
        List a = Arrays.asList(new String[]{"A", "B", "B", "C"});
        List b = Arrays.asList(new String[]{"B", "C"});
        Collection result = CollectionUtils.subtract(a, b);
        assertNotNull(result);
        // a - b removes one B and one C -> A, B
        assertEquals(2, result.size());
    }

    @Test
    public void testContainsAny() {
        List coll1 = Arrays.asList(new String[]{"A", "B"});
        List coll2 = Arrays.asList(new String[]{"B", "C"});
        List coll3 = Arrays.asList(new String[]{"X", "Y"});

        // coll1.size() < coll2.size() -> true, match found
        assertTrue(CollectionUtils.containsAny(coll1, coll2));

        // coll1.size() < coll2.size() -> true, no match
        assertFalse(CollectionUtils.containsAny(coll1, coll3));

        // coll1.size() >= coll2.size() -> true, match found
        assertTrue(CollectionUtils.containsAny(coll2, coll1));

        // coll1.size() >= coll2.size() -> true, no match
        assertFalse(CollectionUtils.containsAny(coll3, coll1));
    }

    @Test
    public void testGetCardinalityMap() {
        List list = Arrays.asList(new String[]{"A", "B", "A"});
        Map map = CollectionUtils.getCardinalityMap(list);
        assertEquals(new Integer(2), map.get("A"));
        assertEquals(new Integer(1), map.get("B"));
    }

    @Test
    public void testIsSubCollectionAndProperSubCollection() {
        List a = Arrays.asList(new String[]{"A", "B"});
        List b = Arrays.asList(new String[]{"A", "B", "C"});
        List c = Arrays.asList(new String[]{"A", "B"});

        assertTrue(CollectionUtils.isSubCollection(a, b));
        assertTrue(CollectionUtils.isProperSubCollection(a, b));
        assertTrue(CollectionUtils.isSubCollection(a, c));
        assertFalse(CollectionUtils.isProperSubCollection(a, c));
        assertFalse(CollectionUtils.isSubCollection(b, a));
    }

    @Test
    public void testIsEqualCollection() {
        List a = Arrays.asList(new String[]{"A", "B"});
        List b = Arrays.asList(new String[]{"B", "A"});
        List c = Arrays.asList(new String[]{"A", "C"});
        List d = Arrays.asList(new String[]{"A"});

        assertTrue(CollectionUtils.isEqualCollection(a, b));
        assertFalse(CollectionUtils.isEqualCollection(a, c));
        assertFalse(CollectionUtils.isEqualCollection(a, d));
    }

    @Test
    public void testCardinality() {
        // Set branch
        Set set = new HashSet();
        set.add("A");
        assertEquals(1, CollectionUtils.cardinality("A", set));
        assertEquals(0, CollectionUtils.cardinality("B", set));

        // Bag branch
        Bag bag = new HashBag();
        bag.add("A", 3);
        assertEquals(3, CollectionUtils.cardinality("A", bag));

        // Null object branch in standard collection
        List listWithNull = new ArrayList();
        listWithNull.add(null);
        listWithNull.add(null);
        listWithNull.add("A");
        assertEquals(2, CollectionUtils.cardinality(null, listWithNull));
        assertEquals(1, CollectionUtils.cardinality("A", listWithNull));
        assertEquals(0, CollectionUtils.cardinality("B", listWithNull));
    }

    @Test
    public void testFindPredicate() {
        List list = Arrays.asList(new String[]{"A", "BB", "CCC"});
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return ((String) object).length() == 2;
            }
        };
        assertEquals("BB", CollectionUtils.find(list, predicate));
        assertNull(CollectionUtils.find(null, predicate));
        assertNull(CollectionUtils.find(list, null));
    }

    @Test
    public void testForAllDo() {
        List list = new ArrayList(Arrays.asList(new String[]{"a", "b"}));
        Closure closure = new Closure() {
            public void execute(Object input) {
                // Do nothing or side effect
            }
        };
        CollectionUtils.forAllDo(list, closure);
        CollectionUtils.forAllDo(null, closure);
        CollectionUtils.forAllDo(list, null);
        assertEquals(2, list.size());
    }

    @Test
    public void testFilter() {
        List list = new ArrayList(Arrays.asList(new String[]{"A", "B", "C"}));
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "A".equals(object);
            }
        };
        CollectionUtils.filter(list, predicate);
        assertEquals(1, list.size());

        // Null checks
        CollectionUtils.filter(null, predicate);
        CollectionUtils.filter(list, null);
    }

    @Test
    public void testTransform() {
        // List branch
        List list = new ArrayList(Arrays.asList(new String[]{"a", "b"}));
        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                return ((String) input).toUpperCase();
            }
        };
        CollectionUtils.transform(list, transformer);
        assertEquals("A", list.get(0));

        // Non-List branch (e.g. Set)
        Set set = new HashSet(Arrays.asList(new String[]{"x", "y"}));
        CollectionUtils.transform(set, transformer);
        assertTrue(set.contains("X"));

        // Null checks
        CollectionUtils.transform(null, transformer);
        CollectionUtils.transform(list, null);
    }

    @Test
    public void testCountMatchesAndExists() {
        List list = Arrays.asList(new String[]{"A", "B", "A"});
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "A".equals(object);
            }
        };
        assertEquals(2, CollectionUtils.countMatches(list, predicate));
        assertEquals(0, CollectionUtils.countMatches(null, predicate));
        assertEquals(0, CollectionUtils.countMatches(list, null));

        assertTrue(CollectionUtils.exists(list, predicate));
        assertFalse(CollectionUtils.exists(null, predicate));
        assertFalse(CollectionUtils.exists(list, null));
    }

    @Test
    public void testSelectAndSelectRejected() {
        List list = Arrays.asList(new String[]{"A", "B", "A"});
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "A".equals(object);
            }
        };
        Collection selected = CollectionUtils.select(list, predicate);
        assertEquals(2, selected.size());

        Collection rejected = CollectionUtils.selectRejected(list, predicate);
        assertEquals(1, rejected.size());

        List output = new ArrayList();
        CollectionUtils.select(list, predicate, output);
        CollectionUtils.selectRejected(list, predicate, output);
        CollectionUtils.select(null, predicate, output);
        CollectionUtils.select(list, null, output);
    }

    @Test
    public void testCollect() {
        List list = Arrays.asList(new String[]{"a", "b"});
        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                return ((String) input).toUpperCase();
            }
        };
        Collection result1 = CollectionUtils.collect(list, transformer);
        assertEquals(2, result1.size());

        Collection result2 = CollectionUtils.collect(list.iterator(), transformer);
        assertEquals(2, result2.size());

        List output = new ArrayList();
        CollectionUtils.collect((Collection) null, transformer, output);
        CollectionUtils.collect((Iterator) null, transformer, output);
    }

    @Test
    public void testAddIgnoreNullAndAddAll() {
        List list = new ArrayList();
        assertTrue(CollectionUtils.addIgnoreNull(list, "A"));
        assertFalse(CollectionUtils.addIgnoreNull(list, null));

        CollectionUtils.addAll(list, list.iterator());
        CollectionUtils.addAll(list, Collections.enumeration(list));
        CollectionUtils.addAll(list, new String[]{"B", "C"});
        assertEquals(3, list.size());
    }

    @Test
    public void testIndexAndGet() {
        Map map = new HashMap();
        map.put("key1", "val1");
        map.put(new Integer(0), "val0");

        assertEquals("val0", CollectionUtils.index(map, new Integer(0)));
        assertEquals("val1", CollectionUtils.index(map, new Integer(1)));
        assertEquals(map, CollectionUtils.index(map, new Integer(-1)));
        assertEquals("val1", CollectionUtils.index(map, "key1"));

        List list = Arrays.asList(new String[]{"A", "B"});
        assertEquals("A", CollectionUtils.index(list, 0));
        assertEquals("A", CollectionUtils.get(list, 0));
        assertEquals("A", CollectionUtils.get(new String[]{"A", "B"}, 0));
        assertEquals("val1", CollectionUtils.get(map, 0));
        assertEquals("A", CollectionUtils.get(list.iterator(), 0));
        assertEquals("A", CollectionUtils.get(Collections.enumeration(list), 0));

        // Edge cases / Exceptions
        try {
            CollectionUtils.get(list, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            CollectionUtils.get(list, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            CollectionUtils.get(null, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            CollectionUtils.get(new Object(), 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSizeAndSizeIsEmpty() {
        Map map = new HashMap();
        map.put("K", "V");
        List list = Arrays.asList(new String[]{"A"});
        String[] arr = new String[]{"A"};

        assertEquals(1, CollectionUtils.size(map));
        assertEquals(1, CollectionUtils.size(list));
        assertEquals(1, CollectionUtils.size(arr));
        assertEquals(1, CollectionUtils.size(list.iterator()));
        assertEquals(1, CollectionUtils.size(Collections.enumeration(list)));

        assertFalse(CollectionUtils.sizeIsEmpty(list));
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList()));

        try {
            CollectionUtils.size(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}

        try {
            CollectionUtils.sizeIsEmpty(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void testIsEmptyAndIsNotEmpty() {
        assertTrue(CollectionUtils.isEmpty(null));
        assertTrue(CollectionUtils.isEmpty(new ArrayList()));
        assertFalse(CollectionUtils.isEmpty(Arrays.asList(new String[]{"A"})));

        assertFalse(CollectionUtils.isNotEmpty(null));
        assertTrue(CollectionUtils.isNotEmpty(Arrays.asList(new String[]{"A"})));
    }

    @Test
    public void testReverseArray() {
        String[] arr = new String[]{"A", "B", "C"};
        CollectionUtils.reverseArray(arr);
        assertEquals("C", arr[0]);
        assertEquals("A", arr[2]);
    }

    @Test
    public void testIsFullAndMaxSize() {
        Bag bag = new HashBag();
        assertFalse(CollectionUtils.isFull(bag));
        assertEquals(-1, CollectionUtils.maxSize(bag));

        try {
            CollectionUtils.isFull(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {}

        try {
            CollectionUtils.maxSize(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {}
    }

    @Test
    public void testDecorators() {
        List list = new ArrayList();
        assertNotNull(CollectionUtils.synchronizedCollection(list));
        assertNotNull(CollectionUtils.unmodifiableCollection(list));
        assertNotNull(CollectionUtils.predicatedCollection(list, PredicateUtils.truePredicate()));
        assertNotNull(CollectionUtils.typedCollection(list, String.class));
        assertNotNull(CollectionUtils.transformedCollection(list, TransformerUtils.nopTransformer()));
    }
}