# JUnit 4 Test Suite: IteratorUtilsTest

ด้านล่างเป็นชุดทดสอบที่ครอบคลุมทั้ง smoke test ของ factory methods (ไม่มี branch) และการทดสอบเจาะจงสำหรับทุก if/else, null-check, loop ที่มีอยู่จริงในซอร์สที่ให้มา

**หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):**
- ภายในของคลาส `NodeListIterator`, `BoundedIterator`, `CollectionUtils.checkIndexBounds()` ไม่ได้แสดงในซอร์สที่ให้มา จึงใช้ `EasyMock.createNiceMock(...)` เพื่อไม่ต้อง "เดา" ว่ามันเรียกเมธอดอะไรภายใน และ assumption เกี่ยวกับ `checkIndexBounds` (โยน `IndexOutOfBoundsException` เมื่อ index ติดลบ) ถูกกำกับด้วยคอมเมนต์ไว้ชัดเจน

```java
package org.apache.commons.collections4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import org.easymock.EasyMock;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsTest {

    // ---------- Helper classes for reflection-based getIterator() tests ----------

    /** class with public no-arg iterator() returning a real Iterator */
    static class HasIteratorMethod {
        public Iterator<String> iterator() {
            List<String> l = new ArrayList<String>();
            l.add("x");
            return l.iterator();
        }
    }

    /** class with public no-arg iterator() that returns null */
    static class NullIteratorMethod {
        public Iterator<String> iterator() {
            return null;
        }
    }

    /** class with public no-arg iterator() but wrong return type (not assignable to Iterator) */
    static class WrongReturnTypeIteratorMethod {
        public String iterator() {
            return "not-an-iterator";
        }
    }

    /** class without any iterator() method -> triggers NoSuchMethodException branch */
    static class NoIteratorMethod {
        // intentionally empty
    }

    // =====================================================================
    // Group A: simple factory methods (smoke tests, no internal branches)
    // =====================================================================

    @Test
    public void testEmptyIterators() {
        assertFalse(IteratorUtils.emptyIterator().hasNext());
        assertFalse(IteratorUtils.emptyListIterator().hasNext());
        assertFalse(IteratorUtils.emptyOrderedIterator().hasNext());
        assertFalse(IteratorUtils.emptyMapIterator().hasNext());
        assertFalse(IteratorUtils.emptyOrderedMapIterator().hasNext());
    }

    @Test
    public void testSingletonIterators() {
        Iterator<String> it = IteratorUtils.singletonIterator("a");
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertFalse(it.hasNext());

        ListIterator<String> lit = IteratorUtils.singletonListIterator("b");
        assertTrue(lit.hasNext());
        assertEquals("b", lit.next());
    }

    @Test
    public void testArrayIteratorVariants() {
        String[] arr = {"a", "b", "c"};

        Iterator<String> it1 = IteratorUtils.arrayIterator(arr);
        assertEquals("a", it1.next());

        Iterator<Object> it2 = IteratorUtils.arrayIterator((Object) arr);
        assertEquals("a", it2.next());

        Iterator<Object> it2b = IteratorUtils.arrayIterator((Object) new int[]{1, 2, 3});
        assertEquals(1, it2b.next());

        Iterator<String> it3 = IteratorUtils.arrayIterator(arr, 1);
        assertEquals("b", it3.next());

        Iterator<Object> it4 = IteratorUtils.arrayIterator((Object) arr, 1);
        assertEquals("b", it4.next());

        Iterator<String> it5 = IteratorUtils.arrayIterator(arr, 1, 2);
        assertEquals("b", it5.next());
        assertFalse(it5.hasNext());

        Iterator<Object> it6 = IteratorUtils.arrayIterator((Object) arr, 1, 2);
        assertEquals("b", it6.next());
    }

    @Test(expected = NullPointerException.class)
    public void testArrayIterator_NullArray() {
        IteratorUtils.arrayIterator((Object) null);
    }

    @Test
    public void testArrayListIteratorVariants() {
        String[] arr = {"a", "b", "c"};

        ListIterator<String> it1 = IteratorUtils.arrayListIterator(arr);
        assertEquals("a", it1.next());

        ListIterator<Object> it2 = IteratorUtils.arrayListIterator((Object) arr);
        assertEquals("a", it2.next());

        ListIterator<String> it3 = IteratorUtils.arrayListIterator(arr, 1);
        assertEquals("b", it3.next());

        ListIterator<Object> it4 = IteratorUtils.arrayListIterator((Object) arr, 1);
        assertEquals("b", it4.next());

        ListIterator<String> it5 = IteratorUtils.arrayListIterator(arr, 1, 2);
        assertEquals("b", it5.next());

        ListIterator<Object> it6 = IteratorUtils.arrayListIterator((Object) arr, 1, 2);
        assertEquals("b", it6.next());
    }

    @Test
    public void testBoundedIterator() {
        List<String> src = new ArrayList<String>();
        src.add("a"); src.add("b"); src.add("c"); src.add("d");

        Iterator<String> bi = IteratorUtils.boundedIterator(src.iterator(), 2L);
        int count = 0;
        while (bi.hasNext()) { bi.next(); count++; }
        assertEquals(2, count);

        Iterator<String> bi2 = IteratorUtils.boundedIterator(src.iterator(), 1L, 2L);
        assertEquals("b", bi2.next());
    }

    @Test
    public void testUnmodifiableIterators() {
        List<String> src = new ArrayList<String>(Collections.singletonList("a"));
        Iterator<String> ui = IteratorUtils.unmodifiableIterator(src.iterator());
        try {
            ui.next();
            ui.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        ListIterator<String> uli = IteratorUtils.unmodifiableListIterator(src.listIterator());
        assertTrue(uli.hasNext());

        MapIterator<String, String> mi =
                IteratorUtils.unmodifiableMapIterator(IteratorUtils.<String, String>emptyMapIterator());
        assertFalse(mi.hasNext());
    }

    @Test
    public void testChainedIterators() {
        List<String> a = Collections.singletonList("a");
        List<String> b = Collections.singletonList("b");

        Iterator<String> c1 = IteratorUtils.chainedIterator(a.iterator(), b.iterator());
        assertEquals("a", c1.next());
        assertEquals("b", c1.next());

        Iterator<String> c2 = IteratorUtils.chainedIterator(a.iterator(), b.iterator());
        assertEquals("a", c2.next());

        Collection<Iterator<? extends String>> col = new ArrayList<Iterator<? extends String>>();
        col.add(a.iterator());
        col.add(b.iterator());
        Iterator<String> c3 = IteratorUtils.chainedIterator(col);
        assertEquals("a", c3.next());
    }

    @Test
    public void testCollatedIterators() {
        List<Integer> a = Collections.singletonList(1);
        List<Integer> b = Collections.singletonList(2);

        Iterator<Integer> c1 = IteratorUtils.collatedIterator(null, a.iterator(), b.iterator());
        assertEquals(Integer.valueOf(1), c1.next());
        assertEquals(Integer.valueOf(2), c1.next());

        Iterator<Integer> c2 = IteratorUtils.collatedIterator(null, a.iterator(), b.iterator());
        assertTrue(c2.hasNext());

        Collection<Iterator<? extends Integer>> col = new ArrayList<Iterator<? extends Integer>>();
        col.add(a.iterator());
        col.add(b.iterator());
        Iterator<Integer> c3 = IteratorUtils.collatedIterator(null, col);
        assertTrue(c3.hasNext());
    }

    @Test
    public void testObjectGraphIterator() {
        Transformer<Object, Object> noop = new Transformer<Object, Object>() {
            public Object transform(Object input) { return input; }
        };
        Iterator<Object> it = IteratorUtils.objectGraphIterator("root", noop);
        assertTrue(it.hasNext());
        assertEquals("root", it.next());
    }

    @Test
    public void testPeekingIterator() {
        List<String> l = Collections.singletonList("a");
        Iterator<String> it = IteratorUtils.peekingIterator(l.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testPushbackIterator() {
        List<String> l = Collections.singletonList("a");
        Iterator<String> it = IteratorUtils.pushbackIterator(l.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testSkippingIterator() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b"); l.add("c");
        Iterator<String> it = IteratorUtils.skippingIterator(l.iterator(), 1L);
        assertEquals("b", it.next());
    }

    @Test
    public void testZippingIterators() {
        List<String> a = Collections.singletonList("a1");
        List<String> b = Collections.singletonList("b1");
        List<String> c = Collections.singletonList("c1");

        Iterator<String> z1 = IteratorUtils.zippingIterator(a.iterator(), b.iterator());
        assertEquals("a1", z1.next());

        Iterator<String> z2 = IteratorUtils.zippingIterator(a.iterator(), b.iterator(), c.iterator());
        assertEquals("a1", z2.next());

        @SuppressWarnings("unchecked")
        Iterator<String> z3 = IteratorUtils.zippingIterator(a.iterator(), b.iterator(), c.iterator());
        assertTrue(z3.hasNext());
    }

    // =====================================================================
    // Group B: methods with explicit branches (null checks / if-else / loops)
    // =====================================================================

    // ---- transformedIterator ----
    @Test(expected = NullPointerException.class)
    public void testTransformedIterator_NullIterator() {
        Transformer<String, String> t = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        IteratorUtils.transformedIterator(null, t);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIterator_NullTransformer() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.transformedIterator(l.iterator(), null);
    }

    @Test
    public void testTransformedIterator_Success() {
        List<String> l = Collections.singletonList("a");
        Transformer<String, String> upper = new Transformer<String, String>() {
            public String transform(String input) { return input.toUpperCase(); }
        };
        Iterator<String> it = IteratorUtils.transformedIterator(l.iterator(), upper);
        assertEquals("A", it.next());
    }

    // ---- filteredIterator ----
    @Test(expected = NullPointerException.class)
    public void testFilteredIterator_NullIterator() {
        Predicate<String> p = new Predicate<String>() {
            public boolean evaluate(String object) { return true; }
        };
        IteratorUtils.filteredIterator(null, p);
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIterator_NullPredicate() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.filteredIterator(l.iterator(), null);
    }

    @Test
    public void testFilteredIterator_Success() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> onlyB = new Predicate<String>() {
            public boolean evaluate(String object) { return "b".equals(object); }
        };
        Iterator<String> it = IteratorUtils.filteredIterator(l.iterator(), onlyB);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    // ---- filteredListIterator ----
    @Test(expected = NullPointerException.class)
    public void testFilteredListIterator_NullIterator() {
        Predicate<String> p = new Predicate<String>() {
            public boolean evaluate(String object) { return true; }
        };
        IteratorUtils.filteredListIterator(null, p);
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredListIterator_NullPredicate() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.filteredListIterator(l.listIterator(), null);
    }

    @Test
    public void testFilteredListIterator_Success() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> onlyA = new Predicate<String>() {
            public boolean evaluate(String object) { return "a".equals(object); }
        };
        ListIterator<String> it = IteratorUtils.filteredListIterator(l.listIterator(), onlyA);
        assertEquals("a", it.next());
        assertFalse(it.hasNext());
    }

    // ---- loopingIterator ----
    @Test(expected = NullPointerException.class)
    public void testLoopingIterator_NullCollection() {
        IteratorUtils.loopingIterator(null);
    }

    @Test
    public void testLoopingIterator_Success() {
        List<String> l = Collections.singletonList("a");
        ResettableIterator<String> it = IteratorUtils.loopingIterator(l);
        assertEquals("a", it.next());
        assertTrue(it.hasNext()); // loops continuously
        assertEquals("a", it.next());
    }

    // ---- loopingListIterator ----
    @Test(expected = NullPointerException.class)
    public void testLoopingListIterator_NullList() {
        IteratorUtils.loopingListIterator(null);
    }

    @Test
    public void testLoopingListIterator_Success() {
        List<String> l = Collections.singletonList("a");
        ResettableListIterator<String> it = IteratorUtils.loopingListIterator(l);
        assertEquals("a", it.next());
    }

    // ---- nodeListIterator(NodeList) ----
    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_NullNodeList() {
        IteratorUtils.nodeListIterator((NodeList) null);
    }

    @Test
    public void testNodeListIterator_Success() {
        // NiceMock: internal usage of NodeList by NodeListIterator is unknown from given source,
        // so we avoid guessing exact interactions and only assert construction does not throw.
        NodeList nodeListMock = EasyMock.createNiceMock(NodeList.class);
        EasyMock.replay(nodeListMock);
        Iterator<Node> it = IteratorUtils.nodeListIterator(nodeListMock);
        assertNotNull(it);
    }

    // ---- nodeListIterator(Node) ----
    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_NullNode() {
        IteratorUtils.nodeListIterator((Node) null);
    }

    @Test
    public void testNodeListIteratorNode_Success() {
        Node nodeMock = EasyMock.createNiceMock(Node.class);
        EasyMock.replay(nodeMock);
        Iterator<Node> it = IteratorUtils.nodeListIterator(nodeMock);
        assertNotNull(it);
    }

    // ---- asIterator(Enumeration) ----
    @Test(expected = NullPointerException.class)
    public void testAsIterator_NullEnumeration() {
        IteratorUtils.asIterator(null);
    }

    @Test
    public void testAsIterator_Success() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        Iterator<String> it = IteratorUtils.asIterator(v.elements());
        assertEquals("a", it.next());
    }

    // ---- asIterator(Enumeration, Collection) ----
    @Test(expected = NullPointerException.class)
    public void testAsIteratorWithCollection_NullEnumeration() {
        IteratorUtils.asIterator(null, new ArrayList<String>());
    }

    @Test(expected = NullPointerException.class)
    public void testAsIteratorWithCollection_NullCollection() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        IteratorUtils.asIterator(v.elements(), null);
    }

    @Test
    public void testAsIteratorWithCollection_Success() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        Collection<String> removeColl = new ArrayList<String>(v);
        Iterator<String> it = IteratorUtils.asIterator(v.elements(), removeColl);
        assertEquals("a", it.next());
    }

    // ---- asEnumeration ----
    @Test(expected = NullPointerException.class)
    public void testAsEnumeration_NullIterator() {
        IteratorUtils.asEnumeration(null);
    }

    @Test
    public void testAsEnumeration_Success() {
        List<String> l = Collections.singletonList("a");
        Enumeration<String> e = IteratorUtils.asEnumeration(l.iterator());
        assertTrue(e.hasMoreElements());
        assertEquals("a", e.nextElement());
    }

    // ---- asIterable ----
    @Test(expected = NullPointerException.class)
    public void testAsIterable_NullIterator() {
        IteratorUtils.asIterable(null);
    }

    @Test
    public void testAsIterable_Success() {
        List<String> l = Collections.singletonList("a");
        Iterable<String> iterable = IteratorUtils.asIterable(l.iterator());
        Iterator<String> it = iterable.iterator();
        assertEquals("a", it.next());
    }

    // ---- asMultipleUseIterable ----
    @Test(expected = NullPointerException.class)
    public void testAsMultipleUseIterable_NullIterator() {
        IteratorUtils.asMultipleUseIterable(null);
    }

    @Test
    public void testAsMultipleUseIterable_Success() {
        List<String> l = Collections.singletonList("a");
        Iterable<String> iterable = IteratorUtils.asMultipleUseIterable(l.iterator());
        assertEquals("a", iterable.iterator().next());
    }

    // ---- toListIterator ----
    @Test(expected = NullPointerException.class)
    public void testToListIterator_NullIterator() {
        IteratorUtils.toListIterator(null);
    }

    @Test
    public void testToListIterator_Success() {
        List<String> l = Collections.singletonList("a");
        ListIterator<String> it = IteratorUtils.toListIterator(l.iterator());
        assertEquals("a", it.next());
    }

    // ---- toArray(Iterator) ----
    @Test(expected = NullPointerException.class)
    public void testToArray_NullIterator() {
        IteratorUtils.toArray(null);
    }

    @Test
    public void testToArray_Success() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Object[] arr = IteratorUtils.toArray(l.iterator());
        assertArrayEquals(new Object[]{"a", "b"}, arr);
    }

    @Test
    public void testToArray_EmptyIterator() {
        Object[] arr = IteratorUtils.toArray(Collections.emptyList().iterator());
        assertEquals(0, arr.length);
    }

    // ---- toArray(Iterator, Class) ----
    @Test(expected = NullPointerException.class)
    public void testToArrayWithClass_NullIterator() {
        IteratorUtils.toArray(null, String.class);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayWithClass_NullClass() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.toArray(l.iterator(), null);
    }

    @Test
    public void testToArrayWithClass_Success() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        String[] arr = IteratorUtils.toArray(l.iterator(), String.class);
        assertArrayEquals(new String[]{"a", "b"}, arr);
    }

    // ---- toList(Iterator) [1-arg, delegates to 2-arg with 10] ----
    @Test
    public void testToList_OneArg() {
        List<String> l = new ArrayList<String>();
        l.add("a");
        List<String> result = IteratorUtils.toList(l.iterator());
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    // ---- toList(Iterator, int) ----
    @Test(expected = NullPointerException.class)
    public void testToList_NullIterator() {
        IteratorUtils.toList(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToList_EstimatedSizeZero() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.toList(l.iterator(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToList_EstimatedSizeNegative() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.toList(l.iterator(), -1);
    }

    @Test
    public void testToList_EstimatedSizeBoundaryOne() {
        List<String> l = Collections.singletonList("a");
        List<String> result = IteratorUtils.toList(l.iterator(), 1); // boundary: exactly 1 is valid
        assertEquals(1, result.size());
    }

    @Test
    public void testToList_EmptyIterator() {
        List<String> result = IteratorUtils.toList(Collections.<String>emptyList().iterator(), 10);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testToList_NonEmptyIterator() {
        List<String> src = new ArrayList<String>();
        src.add("a"); src.add("b"); src.add("c");
        List<String> result = IteratorUtils.toList(src.iterator(), 10);
        assertEquals(src, result);
    }

    // ---- getIterator(Object) : ALL branches ----
    @Test
    public void testGetIterator_Null() {
        Iterator<?> it = IteratorUtils.getIterator(null);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIterator_IteratorInstance() {
        List<String> l = Collections.singletonList("a");
        Iterator<String> src = l.iterator();
        Iterator<?> it = IteratorUtils.getIterator(src);
        assertSame(src, it);
    }

    @Test
    public void testGetIterator_IterableInstance() {
        List<String> l = Collections.singletonList("a");
        Iterator<?> it = IteratorUtils.getIterator(l);
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIterator_ObjectArray() {
        String[] arr = {"a", "b"};
        Iterator<?> it = IteratorUtils.getIterator(arr);
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIterator_Enumeration() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        Iterator<?> it = IteratorUtils.getIterator(v.elements());
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIterator_Map() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("k", "v");
        Iterator<?> it = IteratorUtils.getIterator(m);
        assertEquals("v", it.next());
    }

    @Test
    public void testGetIterator_NodeList() {
        NodeList nodeListMock = EasyMock.createNiceMock(NodeList.class);
        EasyMock.replay(nodeListMock);
        Iterator<?> it = IteratorUtils.getIterator(nodeListMock);
        assertNotNull(it);
    }

    @Test
    public void testGetIterator_Node() {
        Node nodeMock = EasyMock.createNiceMock(Node.class);
        EasyMock.replay(nodeMock);
        Iterator<?> it = IteratorUtils.getIterator(nodeMock);
        assertNotNull(it);
    }

    @Test
    public void testGetIterator_Dictionary() {
        Hashtable<String, String> dict = new Hashtable<String, String>();
        dict.put("k", "v");
        Iterator<?> it = IteratorUtils.getIterator(dict);
        assertEquals("v", it.next());
    }

    @Test
    public void testGetIterator_PrimitiveArray() {
        int[] arr = {1, 2, 3};
        Iterator<?> it = IteratorUtils.getIterator(arr);
        assertEquals(1, it.next());
    }

    @Test
    public void testGetIterator_ReflectionIteratorMethod_Success() {
        Iterator<?> it = IteratorUtils.getIterator(new HasIteratorMethod());
        assertEquals("x", it.next());
    }

    @Test
    public void testGetIterator_ReflectionIteratorMethod_NullReturn_FallbackToSingleton() {
        NullIteratorMethod obj = new NullIteratorMethod();
        Iterator<?> it = IteratorUtils.getIterator(obj);
        // it != null was false -> falls through to singletonIterator(obj)
        assertTrue(it.hasNext());
        assertSame(obj, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIterator_WrongReturnType_FallbackToSingleton() {
        WrongReturnTypeIteratorMethod obj = new WrongReturnTypeIteratorMethod();
        Iterator<?> it = IteratorUtils.getIterator(obj);
        assertSame(obj, it.next());
    }

    @Test
    public void testGetIterator_NoIteratorMethod_FallbackToSingleton() {
        NoIteratorMethod obj = new NoIteratorMethod();
        Iterator<?> it = IteratorUtils.getIterator(obj);
        assertSame(obj, it.next());
    }

    @Test
    public void testGetIterator_PlainObject_FallbackToSingleton() {
        Object obj = new Object();
        Iterator<?> it = IteratorUtils.getIterator(obj);
        assertSame(obj, it.next());
    }

    // ---- apply ----
    @Test(expected = NullPointerException.class)
    public void testApply_NullClosure() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.apply(l.iterator(), null);
    }

    @Test
    public void testApply_NullIterator_NoOp() {
        final List<String> collected = new ArrayList<String>();
        Closure<String> c = new Closure<String>() {
            public void execute(String input) { collected.add(input); }
        };
        IteratorUtils.apply(null, c); // iterator == null -> skip while loop, no exception
        assertTrue(collected.isEmpty());
    }

    @Test
    public void testApply_NonNullIterator() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        final List<String> collected = new ArrayList<String>();
        Closure<String> c = new Closure<String>() {
            public void execute(String input) { collected.add(input); }
        };
        IteratorUtils.apply(l.iterator(), c);
        assertEquals(l, collected);
    }

    // ---- find ----
    @Test(expected = NullPointerException.class)
    public void testFind_NullPredicate() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.find(l.iterator(), null);
    }

    @Test
    public void testFind_NullIterator_ReturnsNull() {
        Predicate<String> p = new Predicate<String>() {
            public boolean evaluate(String object) { return true; }
        };
        assertNull(IteratorUtils.find(null, p));
    }

    @Test
    public void testFind_Found() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> isB = new Predicate<String>() {
            public boolean evaluate(String object) { return "b".equals(object); }
        };
        assertEquals("b", IteratorUtils.find(l.iterator(), isB));
    }

    @Test
    public void testFind_NotFound() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> isZ = new Predicate<String>() {
            public boolean evaluate(String object) { return "z".equals(object); }
        };
        assertNull(IteratorUtils.find(l.iterator(), isZ));
    }

    // ---- matchesAny ----
    @Test(expected = NullPointerException.class)
    public void testMatchesAny_NullPredicate() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.matchesAny(l.iterator(), null);
    }

    @Test
    public void testMatchesAny_NullIterator_ReturnsFalse() {
        Predicate<String> p = new Predicate<String>() {
            public boolean evaluate(String object) { return true; }
        };
        assertFalse(IteratorUtils.matchesAny(null, p));
    }

    @Test
    public void testMatchesAny_True() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> isB = new Predicate<String>() {
            public boolean evaluate(String object) { return "b".equals(object); }
        };
        assertTrue(IteratorUtils.matchesAny(l.iterator(), isB));
    }

    @Test
    public void testMatchesAny_False() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> isZ = new Predicate<String>() {
            public boolean evaluate(String object) { return "z".equals(object); }
        };
        assertFalse(IteratorUtils.matchesAny(l.iterator(), isZ));
    }

    // ---- matchesAll ----
    @Test(expected = NullPointerException.class)
    public void testMatchesAll_NullPredicate() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.matchesAll(l.iterator(), null);
    }

    @Test
    public void testMatchesAll_NullIterator_ReturnsTrue() {
        Predicate<String> p = new Predicate<String>() {
            public boolean evaluate(String object) { return false; }
        };
        assertTrue(IteratorUtils.matchesAll(null, p));
    }

    @Test
    public void testMatchesAll_True() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("a");
        Predicate<String> isA = new Predicate<String>() {
            public boolean evaluate(String object) { return "a".equals(object); }
        };
        assertTrue(IteratorUtils.matchesAll(l.iterator(), isA));
    }

    @Test
    public void testMatchesAll_False() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Predicate<String> isA = new Predicate<String>() {
            public boolean evaluate(String object) { return "a".equals(object); }
        };
        assertFalse(IteratorUtils.matchesAll(l.iterator(), isA));
    }

    // ---- isEmpty ----
    @Test
    public void testIsEmpty_NullIterator() {
        assertTrue(IteratorUtils.isEmpty(null));
    }

    @Test
    public void testIsEmpty_EmptyIterator() {
        assertTrue(IteratorUtils.isEmpty(Collections.emptyList().iterator()));
    }

    @Test
    public void testIsEmpty_NonEmptyIterator() {
        List<String> l = Collections.singletonList("a");
        assertFalse(IteratorUtils.isEmpty(l.iterator()));
    }

    // ---- contains (delegates to matchesAny with EqualPredicate) ----
    @Test
    public void testContains_Found() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        assertTrue(IteratorUtils.contains(l.iterator(), "b"));
    }

    @Test
    public void testContains_NotFound() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        assertFalse(IteratorUtils.contains(l.iterator(), "z"));
    }

    @Test
    public void testContains_NullIterator() {
        assertFalse(IteratorUtils.contains(null, "a"));
    }

    // ---- get(iterator, index) ----
    // ASSUMPTION: CollectionUtils.checkIndexBounds(i) throws IndexOutOfBoundsException for negative i.
    // (Implementation of checkIndexBounds is not shown in the given source.)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_NegativeIndex() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.get(l.iterator(), -1);
    }

    @Test
    public void testGet_ValidIndex() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b"); l.add("c");
        assertEquals("b", IteratorUtils.get(l.iterator(), 1));
    }

    @Test
    public void testGet_BoundaryFirstIndex() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        assertEquals("a", IteratorUtils.get(l.iterator(), 0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_IndexOutOfBounds() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.get(l.iterator(), 5);
    }

    // ---- size ----
    @Test
    public void testSize_NullIterator() {
        assertEquals(0, IteratorUtils.size(null));
    }

    @Test
    public void testSize_EmptyIterator() {
        assertEquals(0, IteratorUtils.size(Collections.emptyList().iterator()));
    }

    @Test
    public void testSize_NonEmptyIterator() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b"); l.add("c");
        assertEquals(3, IteratorUtils.size(l.iterator()));
    }

    // ---- toString(iterator) [default transformer/prefix/suffix/delimiter] ----
    @Test
    public void testToString_Default_Empty() {
        assertEquals("[]", IteratorUtils.toString(Collections.emptyList().iterator()));
    }

    @Test
    public void testToString_Default_WithElements() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        assertEquals("[a, b]", IteratorUtils.toString(l.iterator()));
    }

    @Test
    public void testToString_Default_NullIterator() {
        // toString(Iterator) delegates down; the innermost method treats null iterator
        // by skipping the while loop -> only prefix+suffix remain.
        assertEquals("[]", IteratorUtils.toString((Iterator<Object>) null));
    }

    // ---- toString(iterator, transformer) ----
    @Test(expected = NullPointerException.class)
    public void testToString_WithTransformer_NullTransformer() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.toString(l.iterator(), null);
    }

    @Test
    public void testToString_WithTransformer_Success() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b");
        Transformer<String, String> upper = new Transformer<String, String>() {
            public String transform(String input) { return input.toUpperCase(); }
        };
        assertEquals("[A, B]", IteratorUtils.toString(l.iterator(), upper));
    }

    // ---- toString(iterator, transformer, delimiter, prefix, suffix) : all branches ----
    @Test(expected = NullPointerException.class)
    public void testToStringFull_NullTransformer() {
        List<String> l = Collections.singletonList("a");
        IteratorUtils.toString(l.iterator(), null, ",", "[", "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToStringFull_NullDelimiter() {
        List<String> l = Collections.singletonList("a");
        Transformer<String, String> id = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        IteratorUtils.toString(l.iterator(), id, null, "[", "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToStringFull_NullPrefix() {
        List<String> l = Collections.singletonList("a");
        Transformer<String, String> id = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        IteratorUtils.toString(l.iterator(), id, ",", null, "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToStringFull_NullSuffix() {
        List<String> l = Collections.singletonList("a");
        Transformer<String, String> id = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        IteratorUtils.toString(l.iterator(), id, ",", "[", null);
    }

    @Test
    public void testToStringFull_NullIterator() {
        Transformer<Object, String> id = new Transformer<Object, String>() {
            public String transform(Object input) { return String.valueOf(input); }
        };
        // iterator == null -> while loop skipped -> only prefix+suffix
        assertEquals("<>", IteratorUtils.toString((Iterator<Object>) null, id, ",", "<", ">"));
    }

    @Test
    public void testToStringFull_EmptyIterator() {
        Transformer<Object, String> id = new Transformer<Object, String>() {
            public String transform(Object input) { return String.valueOf(input); }
        };
        assertEquals("<>", IteratorUtils.toString(Collections.emptyList().iterator(), id, ",", "<", ">"));
    }

    @Test
    public void testToStringFull_SingleElement() {
        List<String> l = Collections.singletonList("a");
        Transformer<String, String> id = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        assertEquals("<a>", IteratorUtils.toString(l.iterator(), id, ",", "<", ">"));
    }

    @Test
    public void testToStringFull_MultipleElements_CustomDelimiter() {
        List<String> l = new ArrayList<String>();
        l.add("a"); l.add("b"); l.add("c");
        Transformer<String, String> id = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        assertEquals("<a-b-c>", IteratorUtils.toString(l.iterator(), id, "-", "<", ">"));
    }
}
```

## สรุปตาราง Coverage

| กลุ่มเมธอดทดสอบ | Method ที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testEmptyIterators`, `testSingletonIterators`, `testArrayIterator*`, `testArrayListIterator*`, `testBoundedIterator`, `testUnmodifiableIterators`, `testChainedIterators`, `testCollatedIterators`, `testObjectGraphIterator`, `testPeekingIterator`, `testPushbackIterator`, `testSkippingIterator`, `testZippingIterators` | factory methods (ไม่มี branch ภายใน) | smoke test / delegation call ให้แน่ใจว่า return ค่าที่ถูกต้อง (ไม่มี if/else ให้ครอบคลุมเพิ่ม) |
| `testTransformedIterator_*` | `transformedIterator` | null iterator → NPE, null transformer → NPE, success path |
| `testFilteredIterator_*` | `filteredIterator` | null iterator → NPE, null predicate → NPE, success path |
| `testFilteredListIterator_*` | `filteredListIterator` | null iterator → NPE, null predicate → NPE, success path |
| `testLoopingIterator_*` | `loopingIterator` | null collection → NPE, success + looping behavior |
| `testLoopingListIterator_*` | `loopingListIterator` | null list → NPE, success |
| `testNodeListIterator_*` | `nodeListIterator(NodeList)` / `(Node)` | null → NPE (ทั้ง 2 overload), success (mock) |
| `testAsIterator_*` | `asIterator(Enumeration)` | null → NPE, success |
| `testAsIteratorWithCollection_*` | `asIterator(Enumeration, Collection)` | null enum → NPE, null collection → NPE, success |
| `testAsEnumeration_*` | `asEnumeration` | null → NPE, success |
| `testAsIterable_*`, `testAsMultipleUseIterable_*` | `asIterable`, `asMultipleUseIterable` | null → NPE (ทั้งคู่), success |
| `testToListIterator_*` | `toListIterator` | null → NPE, success |
| `testToArray_*` | `toArray(Iterator)` | null → NPE, empty, non-empty |
| `testToArrayWithClass_*` | `toArray(Iterator, Class)` | null iterator → NPE, null class → NPE, success |
| `testToList_*` | `toList(Iterator)` / `toList(Iterator,int)` | null → NPE, size<1 (0, -1) → IAE, boundary size=1, empty loop, non-empty loop |
| `testGetIterator_*` (12 เมธอด) | `getIterator(Object)` | ทุก `instanceof` branch: null, Iterator, Iterable, Object[], Enumeration, Map, NodeList, Node, Dictionary, primitive array, reflection success/null-return/wrong-return-type, NoSuchMethodException fallback, plain Object fallback |
| `testApply_*` | `apply` | null closure → NPE, null iterator (skip loop), non-null iterator (loop N ครั้ง) |
| `testFind_*` | `find` | null predicate → NPE, null iterator → null, found (if true), not found (loop จบ) |
| `testMatchesAny_*` | `matchesAny` | null predicate → NPE, null iterator → false, true case, false case |
| `testMatchesAll_*` | `matchesAll` | null predicate → NPE, null iterator → true, all true, มี false ตัวเดียว |
| `testIsEmpty_*` | `isEmpty` | null → true, empty → true, non-empty → false |
| `testContains_*` | `contains` | found, not found, null iterator |
| `testGet_*` | `get` | negative index (checkIndexBounds), valid index, boundary index=0, out-of-bounds → throw |
| `testSize_*` | `size` | null iterator, empty loop, non-empty loop (N ครั้ง) |
| `testToString_Default_*`, `testToString_WithTransformer_*` | `toString(Iterator)` / `(Iterator, Transformer)` | delegation ผ่าน default params, empty, non-empty, null transformer → NPE |
| `testToStringFull_*` | `toString(Iterator, Transformer, delimiter, prefix, suffix)` | null transformer/delimiter/prefix/suffix → NPE (4 branch), null iterator (skip while, ไม่ trim), empty iterator (skip while), 1 element (trim delimiter), หลาย element (loop + trim) |

**หมายเหตุ:** เมธอดกลุ่ม A (factory) ไม่มี if/else ภายในตัวเอง (เป็นเพียง delegation) จึงไม่มี branch เพิ่มให้ทดสอบ แต่ยังคง smoke test ไว้เพื่อความมั่นใจว่าไม่มี exception ที่ผิดคาดเกิดขึ้นจากการเรียกใช้งานจริง