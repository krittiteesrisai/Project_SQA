package org.apache.commons.collections4;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;

public class IteratorUtilsTest {

    // ==================== Empty & Singleton ====================

    @Test
    public void testEmptyIterators() {
        Assert.assertNotNull(IteratorUtils.emptyIterator());
        Assert.assertNotNull(IteratorUtils.emptyListIterator());
        Assert.assertNotNull(IteratorUtils.emptyOrderedIterator());
        Assert.assertNotNull(IteratorUtils.emptyMapIterator());
        Assert.assertNotNull(IteratorUtils.emptyOrderedMapIterator());
        
        Assert.assertNotNull(IteratorUtils.EMPTY_ITERATOR);
        Assert.assertNotNull(IteratorUtils.EMPTY_LIST_ITERATOR);
        Assert.assertNotNull(IteratorUtils.EMPTY_ORDERED_ITERATOR);
        Assert.assertNotNull(IteratorUtils.EMPTY_MAP_ITERATOR);
        Assert.assertNotNull(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
    }

    @Test
    public void testSingletons() {
        Assert.assertNotNull(IteratorUtils.singletonIterator("test"));
        Assert.assertNotNull(IteratorUtils.singletonListIterator("test"));
    }

    // ==================== Array Iterators ====================

    @Test(expected = NullPointerException.class)
    public void testArrayIteratorNull() {
        IteratorUtils.arrayIterator((String[]) null);
    }

    @Test
    public void testArrayIteratorsVariants() {
        String[] arr = {"A", "B", "C"};
        Assert.assertNotNull(IteratorUtils.arrayIterator(arr));
        Assert.assertNotNull(IteratorUtils.arrayIterator(arr, 1));
        Assert.assertNotNull(IteratorUtils.arrayIterator(arr, 0, 2));

        int[] primArr = {1, 2, 3};
        Assert.assertNotNull(IteratorUtils.arrayIterator((Object) primArr));
        Assert.assertNotNull(IteratorUtils.arrayIterator((Object) primArr, 1));
        Assert.assertNotNull(IteratorUtils.arrayIterator((Object) primArr, 0, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayIteratorInvalidPrimitive() {
        IteratorUtils.arrayIterator(new Object());
    }

    @Test
    public void testArrayListIteratorVariants() {
        String[] arr = {"A", "B", "C"};
        Assert.assertNotNull(IteratorUtils.arrayListIterator(arr));
        Assert.assertNotNull(IteratorUtils.arrayListIterator(arr, 1));
        Assert.assertNotNull(IteratorUtils.arrayListIterator(arr, 0, 2));

        int[] primArr = {1, 2, 3};
        Assert.assertNotNull(IteratorUtils.arrayListIterator((Object) primArr));
        Assert.assertNotNull(IteratorUtils.arrayListIterator((Object) primArr, 1));
        Assert.assertNotNull(IteratorUtils.arrayListIterator((Object) primArr, 0, 2));
    }

    // ==================== Bounded, Unmodifiable, Chained, Collated ====================

    @Test
    public void testBoundedAndDecorators() {
        List<String> list = Arrays.asList("A", "B", "C");
        Assert.assertNotNull(IteratorUtils.boundedIterator(list.iterator(), 2));
        Assert.assertNotNull(IteratorUtils.boundedIterator(list.iterator(), 1, 2));
        Assert.assertNotNull(IteratorUtils.unmodifiableIterator(list.iterator()));
        Assert.assertNotNull(IteratorUtils.unmodifiableListIterator(new ArrayList<String>().listIterator()));
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("K", "V");
        Assert.assertNotNull(IteratorUtils.unmodifiableMapIterator(IteratorUtils.emptyMapIterator()));
        
        Assert.assertNotNull(IteratorUtils.peekingIterator(list.iterator()));
        Assert.assertNotNull(IteratorUtils.pushbackIterator(list.iterator()));
        Assert.assertNotNull(IteratorUtils.skippingIterator(list.iterator(), 1));
        
        Assert.assertNotNull(IteratorUtils.zippingIterator(list.iterator(), list.iterator()));
        Assert.assertNotNull(IteratorUtils.zippingIterator(list.iterator(), list.iterator(), list.iterator()));
        @SuppressWarnings("unchecked")
        Iterator<String>[] its = new Iterator[]{list.iterator(), list.iterator()};
        Assert.assertNotNull(IteratorUtils.zippingIterator(its));
    }

    @Test
    public void testChainedAndCollated() {
        List<String> list1 = Arrays.asList("A", "B");
        List<String> list2 = Arrays.asList("C", "D");
        
        Assert.assertNotNull(IteratorUtils.chainedIterator(list1.iterator(), list2.iterator()));
        @SuppressWarnings("unchecked")
        Iterator<String>[] its = new Iterator[]{list1.iterator(), list2.iterator()};
        Assert.assertNotNull(IteratorUtils.chainedIterator(its));
        Assert.assertNotNull(IteratorUtils.chainedIterator(Arrays.asList(list1.iterator(), list2.iterator())));

        Assert.assertNotNull(IteratorUtils.collatedIterator(null, list1.iterator(), list2.iterator()));
        Assert.assertNotNull(IteratorUtils.collatedIterator(null, its));
        Assert.assertNotNull(IteratorUtils.collatedIterator(null, Arrays.asList(list1.iterator(), list2.iterator())));
    }

    // ==================== Object Graph, Transformed, Filtered, Looping ====================

    @Test
    public void testObjectGraphAndOthers() {
        Assert.assertNotNull(IteratorUtils.objectGraphIterator("root", null));
        
        Transformer<String, String> tx = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        Assert.assertNotNull(IteratorUtils.transformedIterator(Arrays.asList("A").iterator(), tx));
        
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String input) { return true; }
        };
        Assert.assertNotNull(IteratorUtils.filteredIterator(Arrays.asList("A").iterator(), pred));
        Assert.assertNotNull(IteratorUtils.filteredListIterator(new ArrayList<String>().listIterator(), pred));
        
        Assert.assertNotNull(IteratorUtils.loopingIterator(Arrays.asList("A")));
        Assert.assertNotNull(IteratorUtils.loopingListIterator(Arrays.asList("A")));
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorNullIter() {
        IteratorUtils.transformedIterator(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIteratorNullPred() {
        IteratorUtils.filteredIterator(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredListIteratorNull() {
        IteratorUtils.filteredListIterator(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingIteratorNull() {
        IteratorUtils.loopingIterator(null);
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingListIteratorNull() {
        IteratorUtils.loopingListIterator(null);
    }

    // ==================== DOM Node & NodeList ====================

    @Test
    public void testNodeListIterators() throws Exception {
        javax.xml.parsers.DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        org.w3c.dom.Document doc = db.newDocument();
        org.w3c.dom.Element root = doc.createElement("root");
        doc.appendChild(root);

        Assert.assertNotNull(IteratorUtils.nodeListIterator(doc.getElementsByTagName("root")));
        Assert.assertNotNull(IteratorUtils.nodeListIterator((Node) root));
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListNull() {
        IteratorUtils.nodeListIterator((NodeList) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNodeNull() {
        IteratorUtils.nodeListIterator((Node) null);
    }

    // ==================== Views & Conversions ====================

    @Test
    public void testViewsAndConversions() {
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        Enumeration<String> en = vector.elements();

        Assert.assertNotNull(IteratorUtils.asIterator(en));
        Assert.assertNotNull(IteratorUtils.asIterator(en, new ArrayList<String>()));
        
        Iterator<String> it = vector.iterator();
        Assert.assertNotNull(IteratorUtils.asEnumeration(it));
        Assert.assertNotNull(IteratorUtils.asIterable(it));
        Assert.assertNotNull(IteratorUtils.asMultipleUseIterable(it));
        Assert.assertNotNull(IteratorUtils.toListIterator(it));

        Assert.assertNotNull(IteratorUtils.toArray(vector.iterator()));
        Assert.assertNotNull(IteratorUtils.toArray(vector.iterator(), String.class));
        Assert.assertNotNull(IteratorUtils.toList(vector.iterator()));
        Assert.assertNotNull(IteratorUtils.toList(vector.iterator(), 5));
    }

    @Test(expected = NullPointerException.class)
    public void testAsIteratorNullEnum() {
        IteratorUtils.asIterator((Enumeration<String>) null);
    }

    @Test(expected = NullPointerException.class)
    public void testAsIteratorNullCol() {
        IteratorUtils.asIterator(new Vector<String>().elements(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testAsEnumNull() {
        IteratorUtils.asEnumeration(null);
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterableNull() {
        IteratorUtils.asIterable(null);
    }

    @Test(expected = NullPointerException.class)
    public void testAsMultipleUseIterableNull() {
        IteratorUtils.asMultipleUseIterable(null);
    }

    @Test(expected = NullPointerException.class)
    public void testToListIteratorNull() {
        IteratorUtils.toListIterator(null);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayNull() {
        IteratorUtils.toArray(null);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayClassNull1() {
        IteratorUtils.toArray(null, String.class);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayClassNull2() {
        IteratorUtils.toArray(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    viod testToListInvalidSize() { // fixed typo in test name conceptually below
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testToListInvalidSizeReal() {
        IteratorUtils.toList(Arrays.asList("A").iterator(), 0);
    }

    // ==================== getIterator Comprehensive Branch Coverage ====================

    @Test
    public void testGetIteratorBranches() {
        // null -> emptyIterator
        Assert.assertNotNull(IteratorUtils.getIterator(null));
        // Iterator
        Iterator<String> it = Arrays.asList("A").iterator();
        Assert.assertEquals(it, IteratorUtils.getIterator(it));
        // Iterable (Collection)
        List<String> list = Arrays.asList("A");
        Assert.assertNotNull(IteratorUtils.getIterator(list));
        // Object[]
        Object[] objArr = {"A"};
        Assert.assertNotNull(IteratorUtils.getIterator(objArr));
        // Enumeration
        Vector<String> vec = new Vector<String>(); vec.add("A");
        Assert.assertNotNull(IteratorUtils.getIterator(vec.elements()));
        // Map
        Map<String, String> map = new HashMap<String, String>(); map.put("K", "V");
        Assert.assertNotNull(IteratorUtils.getIterator(map));
        // Dictionary
        Dictionary<String, String> dict = new Hashtable<String, String>(); dict.put("K", "V");
        Assert.assertNotNull(IteratorUtils.getIterator(dict));
        // Primitive Array
        int[] primArr = {1, 2};
        Assert.assertNotNull(IteratorUtils.getIterator(primArr));
        // Object with iterator() method via reflection
        class CustomIterableObject {
            public Iterator<String> iterator() { return Arrays.asList("X").iterator(); }
        }
        Assert.assertNotNull(IteratorUtils.getIterator(new CustomIterableObject()));
        // Fallback singleton
        Assert.assertNotNull(IteratorUtils.getIterator("plainObject"));
    }

    // ==================== Utility Methods (apply, find, matches, contains, get, size, toString) ====================

    @Test
    public void testUtilities() {
        List<String> list = Arrays.asList("A", "B", "C");

        Closure<String> closure = new Closure<String>() {
            public void execute(String input) {}
        };
        IteratorUtils.apply(list.iterator(), closure);
        IteratorUtils.apply(null, closure);

        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String input) { return "B".equals(input); }
        };

        Assert.assertEquals("B", IteratorUtils.find(list.iterator(), pred));
        Assert.assertNull(IteratorUtils.find(null, pred));
        Assert.assertNull(IteratorUtils.find(Arrays.asList("X").iterator(), pred));

        Assert.assertTrue(IteratorUtils.matchesAny(list.iterator(), pred));
        Assert.assertFalse(IteratorUtils.matchesAny(null, pred));

        Assert.assertFalse(IteratorUtils.matchesAll(list.iterator(), pred));
        Assert.assertTrue(IteratorUtils.matchesAll(null, pred));
        Assert.assertTrue(IteratorUtils.matchesAll(Arrays.asList("B", "B").iterator(), pred));

        Assert.assertFalse(IteratorUtils.isEmpty(list.iterator()));
        Assert.assertTrue(IteratorUtils.isEmpty(null));
        Assert.assertTrue(IteratorUtils.isEmpty(IteratorUtils.emptyIterator()));

        Assert.assertTrue(IteratorUtils.contains(list.iterator(), "B"));
        Assert.assertFalse(IteratorUtils.contains(null, "B"));

        Assert.assertEquals("B", IteratorUtils.get(list.iterator(), 1));
        Assert.assertEquals(3, IteratorUtils.size(list.iterator()));
        Assert.assertEquals(0, IteratorUtils.size(null));

        Assert.assertEquals("[A, B, C]", IteratorUtils.toString(list.iterator()));
        Assert.assertEquals("[A, B, C]", IteratorUtils.toString(list.iterator(), TransformerUtils.stringValueTransformer()));
        Assert.assertEquals("{A-B-C}", IteratorUtils.toString(list.iterator(), TransformerUtils.stringValueTransformer(), "-", "{", "}"));
        Assert.assertEquals("[]", IteratorUtils.toString(null));
    }

    @Test(expected = NullPointerException.class)
    public void testApplyNullClosure() {
        IteratorUtils.apply(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testFindNullPred() {
        IteratorUtils.find(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAnyNullPred() {
        IteratorUtils.matchesAny(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAllNullPred() {
        IteratorUtils.matchesAll(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        List<String> list = Arrays.asList("A");
        IteratorUtils.get(list.iterator(), 5);
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullTrans() {
        IteratorUtils.toString(Arrays.asList("A").iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullCustom() {
        IteratorUtils.toString(Arrays.asList("A").iterator(), TransformerUtils.stringValueTransformer(), null, "[", "]");
    }
}