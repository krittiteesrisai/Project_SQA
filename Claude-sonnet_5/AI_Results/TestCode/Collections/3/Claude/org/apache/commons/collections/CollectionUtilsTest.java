package org.apache.commons.collections;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import java.util.*;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.collections.CollectionUtils (Defects4J Collections-3b)
 *
 * หมายเหตุ (ข้อสมมติที่จำเป็นเนื่องจาก source ของคลาสสนับสนุนบางคลาสไม่ถูกให้มา):
 * 1) Predicate, Closure, Transformer, Bag, BoundedCollection เป็น interface ในแพ็กเกจเดียวกัน
 *    (อ้างอิงโดยตรงในซอร์ส CollectionUtils) - ใช้ EasyMock สร้าง mock ของ interface เหล่านี้
 * 2) UnmodifiableBoundedCollection.decorateUsing(Collection) จะ throw IllegalArgumentException
 *    เมื่อ collection ไม่ใช่ประเภทที่รองรับ (เช่น ไม่ใช่ BoundedFifoBuffer/CircularFifoBuffer)
 *    - ใช้ ArrayList/HashSet ธรรมดาเพื่อกระตุ้น catch branch ใน isFull()/maxSize()
 */
public class CollectionUtilsTest {

    // ---------- union / intersection / disjunction / subtract ----------

    @Test
    public void testUnion() {
        List a = Arrays.asList("a", "b", "b");
        List b = Arrays.asList("b", "c");
        Collection result = CollectionUtils.union(a, b);
        // max(freq_a, freq_b): a=1,b=2,c=1 => total size 4
        assertEquals(4, result.size());
        assertEquals(2, CollectionUtils.cardinality("b", result));
        assertEquals(1, CollectionUtils.cardinality("a", result));
        assertEquals(1, CollectionUtils.cardinality("c", result));
    }

    @Test
    public void testIntersection() {
        List a = Arrays.asList("a", "b", "b");
        List b = Arrays.asList("b", "c");
        Collection result = CollectionUtils.intersection(a, b);
        // min(freq): only b -> min(2,1)=1
        assertEquals(1, result.size());
        assertEquals(1, CollectionUtils.cardinality("b", result));
    }

    @Test
    public void testDisjunction() {
        List a = Arrays.asList("a", "b", "b");
        List b = Arrays.asList("b", "c");
        Collection result = CollectionUtils.disjunction(a, b);
        // max-min: a: max1-min0=1, b: max2-min1=1, c: max1-min0=1 => size 3
        assertEquals(3, result.size());
        assertEquals(1, CollectionUtils.cardinality("a", result));
        assertEquals(1, CollectionUtils.cardinality("b", result));
        assertEquals(1, CollectionUtils.cardinality("c", result));
    }

    @Test
    public void testSubtract() {
        List a = new ArrayList(Arrays.asList("a", "b", "b", "c"));
        List b = Arrays.asList("b");
        Collection result = CollectionUtils.subtract(a, b);
        // removes only first occurrence of "b" per element in b (list.remove(obj))
        assertEquals(3, result.size());
        assertEquals(1, CollectionUtils.cardinality("b", result));
    }

    // ---------- containsAny ----------

    @Test
    public void testContainsAny_Coll1SmallerTrue() {
        List coll1 = Arrays.asList("x");
        List coll2 = Arrays.asList("x", "y", "z");
        assertTrue(CollectionUtils.containsAny(coll1, coll2));
    }

    @Test
    public void testContainsAny_Coll1SmallerFalse() {
        List coll1 = Arrays.asList("q");
        List coll2 = Arrays.asList("x", "y", "z");
        assertFalse(CollectionUtils.containsAny(coll1, coll2));
    }

    @Test
    public void testContainsAny_Coll2SmallerOrEqualTrue() {
        List coll1 = Arrays.asList("x", "y", "z");
        List coll2 = Arrays.asList("y");
        assertTrue(CollectionUtils.containsAny(coll1, coll2));
    }

    @Test
    public void testContainsAny_Coll2SmallerOrEqualFalse() {
        List coll1 = Arrays.asList("x", "y", "z");
        List coll2 = Arrays.asList("q");
        assertFalse(CollectionUtils.containsAny(coll1, coll2));
    }

    // ---------- getCardinalityMap ----------

    @Test
    public void testGetCardinalityMap() {
        List a = Arrays.asList("a", "b", "a");
        Map map = CollectionUtils.getCardinalityMap(a);
        assertEquals(2, map.size());
        assertEquals(new Integer(2), map.get("a"));
        assertEquals(new Integer(1), map.get("b"));
    }

    // ---------- isSubCollection / isProperSubCollection ----------

    @Test
    public void testIsSubCollection_True() {
        List a = Arrays.asList("a");
        List b = Arrays.asList("a", "b");
        assertTrue(CollectionUtils.isSubCollection(a, b));
    }

    @Test
    public void testIsSubCollection_False() {
        List a = Arrays.asList("a", "a");
        List b = Arrays.asList("a");
        assertFalse(CollectionUtils.isSubCollection(a, b));
    }

    @Test
    public void testIsProperSubCollection_True() {
        List a = Arrays.asList("a");
        List b = Arrays.asList("a", "b");
        assertTrue(CollectionUtils.isProperSubCollection(a, b));
    }

    @Test
    public void testIsProperSubCollection_FalseSameSize() {
        List a = Arrays.asList("a", "b");
        List b = Arrays.asList("a", "b");
        assertFalse(CollectionUtils.isProperSubCollection(a, b)); // short-circuit on size check
    }

    @Test
    public void testIsProperSubCollection_FalseNotSubCollection() {
        List a = Arrays.asList("z");
        List b = Arrays.asList("a", "b");
        assertFalse(CollectionUtils.isProperSubCollection(a, b));
    }

    // ---------- isEqualCollection ----------

    @Test
    public void testIsEqualCollection_DifferentSize() {
        List a = Arrays.asList("a");
        List b = Arrays.asList("a", "b");
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_SameSizeDifferentMapSize() {
        List a = Arrays.asList("a", "a"); // mapa size 1
        List b = Arrays.asList("a", "b"); // mapb size 2
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_SameMapSizeDifferentFreq() {
        List a = Arrays.asList("a", "a", "b"); // {a:2,b:1}
        List b = Arrays.asList("a", "b", "b"); // {a:1,b:2}
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_True() {
        List a = Arrays.asList("a", "b", "b");
        List b = Arrays.asList("b", "a", "b");
        assertTrue(CollectionUtils.isEqualCollection(a, b));
    }

    // ---------- cardinality ----------

    @Test
    public void testCardinality_SetBranch() {
        Set s = new HashSet(Arrays.asList("a", "b"));
        assertEquals(1, CollectionUtils.cardinality("a", s));
        assertEquals(0, CollectionUtils.cardinality("z", s));
    }

    @Test
    public void testCardinality_BagBranch() {
        Bag bagMock = createMock(Bag.class);
        expect(bagMock.getCount("x")).andReturn(5);
        replay(bagMock);
        assertEquals(5, CollectionUtils.cardinality("x", bagMock));
        verify(bagMock);
    }

    @Test
    public void testCardinality_NullObjBranch() {
        List a = Arrays.asList("a", null, null, "b");
        assertEquals(2, CollectionUtils.cardinality(null, a));
    }

    @Test
    public void testCardinality_NonNullObjBranch() {
        List a = Arrays.asList("a", "b", "a");
        assertEquals(2, CollectionUtils.cardinality("a", a));
    }

    // ---------- find ----------

    @Test
    public void testFind_NullCollection() {
        Predicate p = createMock(Predicate.class);
        assertNull(CollectionUtils.find(null, p));
    }

    @Test
    public void testFind_NullPredicate() {
        List a = Arrays.asList("a", "b");
        assertNull(CollectionUtils.find(a, null));
    }

    @Test
    public void testFind_Found() {
        List a = Arrays.asList("a", "b", "c");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(false);
        expect(p.evaluate("b")).andReturn(true);
        replay(p);
        assertEquals("b", CollectionUtils.find(a, p));
        verify(p);
    }

    @Test
    public void testFind_NotFound() {
        List a = Arrays.asList("a", "b");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(false);
        expect(p.evaluate("b")).andReturn(false);
        replay(p);
        assertNull(CollectionUtils.find(a, p));
        verify(p);
    }

    // ---------- forAllDo ----------

    @Test
    public void testForAllDo_NullCollection() {
        Closure c = createMock(Closure.class);
        CollectionUtils.forAllDo(null, c); // no exception
    }

    @Test
    public void testForAllDo_NullClosure() {
        List a = Arrays.asList("a");
        CollectionUtils.forAllDo(a, null); // no exception
    }

    @Test
    public void testForAllDo_Normal() {
        List a = Arrays.asList("a", "b");
        Closure c = createMock(Closure.class);
        c.execute("a");
        c.execute("b");
        replay(c);
        CollectionUtils.forAllDo(a, c);
        verify(c);
    }

    // ---------- filter ----------

    @Test
    public void testFilter_NullCollection() {
        Predicate p = createMock(Predicate.class);
        CollectionUtils.filter(null, p); // no exception
    }

    @Test
    public void testFilter_NullPredicate() {
        List a = new ArrayList(Arrays.asList("a", "b"));
        CollectionUtils.filter(a, null);
        assertEquals(2, a.size()); // unchanged
    }

    @Test
    public void testFilter_RemovesNonMatching() {
        List a = new ArrayList(Arrays.asList("a", "b", "c"));
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true);
        expect(p.evaluate("b")).andReturn(false);
        expect(p.evaluate("c")).andReturn(true);
        replay(p);
        CollectionUtils.filter(a, p);
        assertEquals(Arrays.asList("a", "c"), a);
        verify(p);
    }

    // ---------- transform ----------

    @Test
    public void testTransform_NullCollection() {
        Transformer t = createMock(Transformer.class);
        CollectionUtils.transform(null, t); // no exception
    }

    @Test
    public void testTransform_NullTransformer() {
        List a = new ArrayList(Arrays.asList("a"));
        CollectionUtils.transform(a, null);
        assertEquals(Arrays.asList("a"), a);
    }

    @Test
    public void testTransform_ListBranch() {
        List a = new ArrayList(Arrays.asList("a", "b"));
        Transformer t = createMock(Transformer.class);
        expect(t.transform("a")).andReturn("A");
        expect(t.transform("b")).andReturn("B");
        replay(t);
        CollectionUtils.transform(a, t);
        assertEquals(Arrays.asList("A", "B"), a);
        verify(t);
    }

    @Test
    public void testTransform_NonListBranch() {
        Set a = new LinkedHashSet(Arrays.asList("a", "b"));
        Transformer t = createMock(Transformer.class);
        expect(t.transform("a")).andReturn("A");
        expect(t.transform("b")).andReturn("B");
        replay(t);
        CollectionUtils.transform(a, t);
        assertTrue(a.contains("A"));
        assertTrue(a.contains("B"));
        assertEquals(2, a.size());
        verify(t);
    }

    // ---------- countMatches ----------

    @Test
    public void testCountMatches_NullInputs() {
        assertEquals(0, CollectionUtils.countMatches(null, null));
    }

    @Test
    public void testCountMatches_Normal() {
        List a = Arrays.asList("a", "b", "a");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true).times(2);
        expect(p.evaluate("b")).andReturn(false);
        replay(p);
        assertEquals(2, CollectionUtils.countMatches(a, p));
        verify(p);
    }

    // ---------- exists ----------

    @Test
    public void testExists_NullInputs() {
        assertFalse(CollectionUtils.exists(null, null));
    }

    @Test
    public void testExists_True() {
        List a = Arrays.asList("a", "b");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true);
        replay(p);
        assertTrue(CollectionUtils.exists(a, p));
        verify(p);
    }

    @Test
    public void testExists_False() {
        List a = Arrays.asList("a", "b");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(false);
        expect(p.evaluate("b")).andReturn(false);
        replay(p);
        assertFalse(CollectionUtils.exists(a, p));
        verify(p);
    }

    // ---------- select / selectRejected ----------

    @Test
    public void testSelect() {
        List a = Arrays.asList("a", "b", "c");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true);
        expect(p.evaluate("b")).andReturn(false);
        expect(p.evaluate("c")).andReturn(true);
        replay(p);
        Collection result = CollectionUtils.select(a, p);
        assertEquals(Arrays.asList("a", "c"), new ArrayList(result));
        verify(p);
    }

    @Test(expected = NullPointerException.class)
    public void testSelect_NullInputCollectionThrowsNPE() {
        CollectionUtils.select(null, createMock(Predicate.class));
    }

    @Test
    public void testSelectWithOutput_NullPredicate() {
        List a = Arrays.asList("a", "b");
        List out = new ArrayList();
        CollectionUtils.select(a, null, out);
        assertTrue(out.isEmpty());
    }

    @Test
    public void testSelectRejected() {
        List a = Arrays.asList("a", "b", "c");
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true);
        expect(p.evaluate("b")).andReturn(false);
        expect(p.evaluate("c")).andReturn(true);
        replay(p);
        Collection result = CollectionUtils.selectRejected(a, p);
        assertEquals(Arrays.asList("b"), new ArrayList(result));
        verify(p);
    }

    @Test
    public void testSelectRejectedWithOutput_NullPredicate() {
        List a = Arrays.asList("a", "b");
        List out = new ArrayList();
        CollectionUtils.selectRejected(a, null, out);
        assertTrue(out.isEmpty());
    }

    // ---------- collect ----------

    @Test
    public void testCollectCollection() {
        List a = Arrays.asList("a", "b");
        Transformer t = createMock(Transformer.class);
        expect(t.transform("a")).andReturn("A");
        expect(t.transform("b")).andReturn("B");
        replay(t);
        Collection result = CollectionUtils.collect(a, t);
        assertEquals(Arrays.asList("A", "B"), new ArrayList(result));
        verify(t);
    }

    @Test
    public void testCollectIterator() {
        Iterator it = Arrays.asList("a", "b").iterator();
        Transformer t = createMock(Transformer.class);
        expect(t.transform("a")).andReturn("A");
        expect(t.transform("b")).andReturn("B");
        replay(t);
        Collection result = CollectionUtils.collect(it, t);
        assertEquals(Arrays.asList("A", "B"), new ArrayList(result));
        verify(t);
    }

    @Test
    public void testCollectCollectionWithOutput_NullInputCollection() {
        List out = new ArrayList();
        Collection result = CollectionUtils.collect((Collection) null, createMock(Transformer.class), out);
        assertSame(out, result);
        assertTrue(out.isEmpty());
    }

    @Test
    public void testCollectIteratorWithOutput_NullTransformer() {
        List out = new ArrayList();
        Iterator it = Arrays.asList("a").iterator();
        Collection result = CollectionUtils.collect(it, null, out);
        assertSame(out, result);
        assertTrue(out.isEmpty());
    }

    // ---------- addIgnoreNull ----------

    @Test
    public void testAddIgnoreNull_NullObject() {
        List a = new ArrayList();
        assertFalse(CollectionUtils.addIgnoreNull(a, null));
        assertTrue(a.isEmpty());
    }

    @Test
    public void testAddIgnoreNull_NonNullObject() {
        List a = new ArrayList();
        assertTrue(CollectionUtils.addIgnoreNull(a, "x"));
        assertEquals(Arrays.asList("x"), a);
    }

    // ---------- addAll overloads ----------

    @Test
    public void testAddAll_Iterator() {
        List a = new ArrayList();
        CollectionUtils.addAll(a, Arrays.asList("a", "b").iterator());
        assertEquals(Arrays.asList("a", "b"), a);
    }

    @Test
    public void testAddAll_Enumeration() {
        List a = new ArrayList();
        Vector v = new Vector(Arrays.asList("a", "b"));
        CollectionUtils.addAll(a, v.elements());
        assertEquals(Arrays.asList("a", "b"), a);
    }

    @Test
    public void testAddAll_Array() {
        List a = new ArrayList();
        CollectionUtils.addAll(a, new String[] { "a", "b" });
        assertEquals(Arrays.asList("a", "b"), a);
    }

    // ---------- index(Object, int) deprecated overload ----------

    @Test
    public void testIndexIntOverload_List() {
        List l = Arrays.asList("a", "b", "c");
        assertEquals("b", CollectionUtils.index(l, 1));
    }

    // ---------- index(Object, Object) ----------

    @Test
    public void testIndexObjObj_Map_KeyFound() {
        Map m = new HashMap();
        m.put("a", 1);
        assertEquals(1, CollectionUtils.index(m, "a"));
    }

    @Test
    public void testIndexObjObj_Map_KeyNotFound_NonIntegerIndex_ReturnsObj() {
        Map m = new HashMap();
        m.put("a", 1);
        Object result = CollectionUtils.index(m, "notAKey");
        assertSame(m, result);
    }

    @Test
    public void testIndexObjObj_Map_KeyNotFound_IntegerIndex() {
        Map m = new LinkedHashMap();
        m.put("x", 1);
        m.put("y", 2);
        Object result = CollectionUtils.index(m, new Integer(0));
        assertEquals("x", result);
    }

    @Test
    public void testIndexObjObj_List_Valid() {
        List l = Arrays.asList("a", "b", "c");
        assertEquals("b", CollectionUtils.index(l, new Integer(1)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexObjObj_List_OutOfRange() {
        List l = Arrays.asList("a");
        CollectionUtils.index(l, new Integer(5));
    }

    @Test
    public void testIndexObjObj_Array_Valid() {
        Object[] arr = new Object[] { "a", "b" };
        assertEquals("b", CollectionUtils.index(arr, new Integer(1)));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testIndexObjObj_Array_OutOfRange() {
        Object[] arr = new Object[] { "a" };
        CollectionUtils.index(arr, new Integer(5));
    }

    @Test
    public void testIndexObjObj_Enumeration_Found() {
        Vector v = new Vector(Arrays.asList("a", "b", "c"));
        Object result = CollectionUtils.index(v.elements(), new Integer(1));
        assertEquals("b", result);
    }

    @Test
    public void testIndexObjObj_Enumeration_NotFound() {
        Vector v = new Vector(Arrays.asList("a"));
        Enumeration e = v.elements();
        Object result = CollectionUtils.index(e, new Integer(5));
        assertSame(e, result); // falls through to final "return obj"
    }

    @Test
    public void testIndexObjObj_Iterator_Found() {
        Iterator it = Arrays.asList("a", "b", "c").iterator();
        assertEquals("b", CollectionUtils.index(it, new Integer(1)));
    }

    @Test
    public void testIndexObjObj_Collection_Found() {
        Collection c = Arrays.asList("a", "b", "c");
        assertEquals("b", CollectionUtils.index(c, new Integer(1)));
    }

    @Test
    public void testIndexObjObj_Collection_NotFound_ReturnsExhaustedIterator() {
        // สังเกต: เนื่องจากโค้ดสร้าง iterator ใหม่จาก collection แล้วคืน "iterator" (ไม่ใช่ obj) เมื่อไม่พบ
        Collection c = Arrays.asList("a");
        Object result = CollectionUtils.index(c, new Integer(5));
        assertTrue(result instanceof Iterator);
        assertFalse(((Iterator) result).hasNext());
    }

    @Test
    public void testIndexObjObj_DefaultType_ReturnsObj() {
        Integer obj = new Integer(42);
        Object result = CollectionUtils.index(obj, new Integer(0));
        assertSame(obj, result);
    }

    // ---------- get(Object, int) ----------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_NegativeIndexThrows() {
        CollectionUtils.get(Arrays.asList("a"), -1);
    }

    @Test
    public void testGet_Map() {
        Map m = new LinkedHashMap();
        m.put("a", 1);
        m.put("b", 2);
        Object result = CollectionUtils.get(m, 0);
        assertTrue(result instanceof Map.Entry);
        assertEquals("a", ((Map.Entry) result).getKey());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_Map_OutOfRangeThrows() {
        Map m = new HashMap();
        m.put("a", 1);
        CollectionUtils.get(m, 5);
    }

    @Test
    public void testGet_List() {
        List l = Arrays.asList("a", "b");
        assertEquals("b", CollectionUtils.get(l, 1));
    }

    @Test
    public void testGet_ObjectArray() {
        Object[] arr = { "a", "b" };
        assertEquals("b", CollectionUtils.get(arr, 1));
    }

    @Test
    public void testGet_Iterator_Found() {
        Iterator it = Arrays.asList("a", "b", "c").iterator();
        assertEquals("b", CollectionUtils.get(it, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_Iterator_NotFoundThrows() {
        Iterator it = Arrays.asList("a").iterator();
        CollectionUtils.get(it, 5);
    }

    @Test
    public void testGet_Collection() {
        Collection c = Arrays.asList("a", "b");
        assertEquals("b", CollectionUtils.get(c, 1));
    }

    @Test
    public void testGet_Enumeration_Found() {
        Vector v = new Vector(Arrays.asList("a", "b"));
        assertEquals("b", CollectionUtils.get(v.elements(), 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_Enumeration_NotFoundThrows() {
        Vector v = new Vector(Arrays.asList("a"));
        CollectionUtils.get(v.elements(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_NullThrowsIllegalArgument() {
        CollectionUtils.get(null, 0);
    }

    @Test
    public void testGet_PrimitiveArray() {
        int[] arr = { 10, 20, 30 };
        Object result = CollectionUtils.get(arr, 1);
        assertEquals(20, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_UnsupportedObjectThrowsIllegalArgument() {
        CollectionUtils.get(new Object(), 0);
    }

    // ---------- size(Object) ----------

    @Test
    public void testSize_Map() {
        Map m = new HashMap();
        m.put("a", 1);
        assertEquals(1, CollectionUtils.size(m));
    }

    @Test
    public void testSize_Collection() {
        assertEquals(2, CollectionUtils.size(Arrays.asList("a", "b")));
    }

    @Test
    public void testSize_ObjectArray() {
        assertEquals(3, CollectionUtils.size(new Object[] { "a", "b", "c" }));
    }

    @Test
    public void testSize_Iterator() {
        assertEquals(2, CollectionUtils.size(Arrays.asList("a", "b").iterator()));
    }

    @Test
    public void testSize_Enumeration() {
        Vector v = new Vector(Arrays.asList("a", "b", "c"));
        assertEquals(3, CollectionUtils.size(v.elements()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_NullThrows() {
        CollectionUtils.size(null);
    }

    @Test
    public void testSize_PrimitiveArray() {
        int[] arr = { 1, 2, 3, 4 };
        assertEquals(4, CollectionUtils.size(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_UnsupportedThrows() {
        CollectionUtils.size(new Object());
    }

    // ---------- sizeIsEmpty(Object) ----------

    @Test
    public void testSizeIsEmpty_Collection_True() {
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList()));
    }

    @Test
    public void testSizeIsEmpty_Collection_False() {
        assertFalse(CollectionUtils.sizeIsEmpty(Arrays.asList("a")));
    }

    @Test
    public void testSizeIsEmpty_Map() {
        assertTrue(CollectionUtils.sizeIsEmpty(new HashMap()));
    }

    @Test
    public void testSizeIsEmpty_ObjectArray() {
        assertTrue(CollectionUtils.sizeIsEmpty(new Object[0]));
        assertFalse(CollectionUtils.sizeIsEmpty(new Object[] { "a" }));
    }

    @Test
    public void testSizeIsEmpty_Iterator() {
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList().iterator()));
        assertFalse(CollectionUtils.sizeIsEmpty(Arrays.asList("a").iterator()));
    }

    @Test
    public void testSizeIsEmpty_Enumeration() {
        Vector empty = new Vector();
        Vector nonEmpty = new Vector(Arrays.asList("a"));
        assertTrue(CollectionUtils.sizeIsEmpty(empty.elements()));
        assertFalse(CollectionUtils.sizeIsEmpty(nonEmpty.elements()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_NullThrows() {
        CollectionUtils.sizeIsEmpty(null);
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray() {
        assertTrue(CollectionUtils.sizeIsEmpty(new int[0]));
        assertFalse(CollectionUtils.sizeIsEmpty(new int[] { 1 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_UnsupportedThrows() {
        CollectionUtils.sizeIsEmpty(new Object());
    }

    // ---------- isEmpty / isNotEmpty ----------

    @Test
    public void testIsEmpty_Null() {
        assertTrue(CollectionUtils.isEmpty(null));
    }

    @Test
    public void testIsEmpty_EmptyCollection() {
        assertTrue(CollectionUtils.isEmpty(new ArrayList()));
    }

    @Test
    public void testIsEmpty_NonEmptyCollection() {
        assertFalse(CollectionUtils.isEmpty(Arrays.asList("a")));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(CollectionUtils.isNotEmpty(null));
        assertTrue(CollectionUtils.isNotEmpty(Arrays.asList("a")));
    }

    // ---------- reverseArray ----------

    @Test
    public void testReverseArray_EvenLength() {
        Object[] arr = { "a", "b", "c", "d" };
        CollectionUtils.reverseArray(arr);
        assertArrayEquals(new Object[] { "d", "c", "b", "a" }, arr);
    }

    @Test
    public void testReverseArray_OddLength() {
        Object[] arr = { "a", "b", "c" };
        CollectionUtils.reverseArray(arr);
        assertArrayEquals(new Object[] { "c", "b", "a" }, arr);
    }

    @Test
    public void testReverseArray_Empty() {
        Object[] arr = {};
        CollectionUtils.reverseArray(arr); // j=-1,i=0 -> while(j>i) false immediately
        assertArrayEquals(new Object[] {}, arr);
    }

    @Test
    public void testReverseArray_SingleElement() {
        Object[] arr = { "a" };
        CollectionUtils.reverseArray(arr); // j=0,i=0 -> while(j>i) false
        assertArrayEquals(new Object[] { "a" }, arr);
    }

    // ---------- isFull / maxSize ----------

    @Test(expected = NullPointerException.class)
    public void testIsFull_NullThrows() {
        CollectionUtils.isFull(null);
    }

    @Test
    public void testIsFull_BoundedCollection_True() {
        BoundedCollection bc = createMock(BoundedCollection.class);
        expect(bc.isFull()).andReturn(true);
        replay(bc);
        assertTrue(CollectionUtils.isFull(bc));
        verify(bc);
    }

    @Test
    public void testIsFull_BoundedCollection_False() {
        BoundedCollection bc = createMock(BoundedCollection.class);
        expect(bc.isFull()).andReturn(false);
        replay(bc);
        assertFalse(CollectionUtils.isFull(bc));
        verify(bc);
    }

    @Test
    public void testIsFull_NonBoundedCatchBranch() {
        // ArrayList ธรรมดาไม่ถูกรองรับโดย UnmodifiableBoundedCollection.decorateUsing
        // -> คาดว่าจะเข้า catch(IllegalArgumentException) แล้วคืน false (สมมติฐานตาม javadoc)
        Collection plain = new ArrayList(Arrays.asList("a", "b"));
        assertFalse(CollectionUtils.isFull(plain));
    }

    @Test(expected = NullPointerException.class)
    public void testMaxSize_NullThrows() {
        CollectionUtils.maxSize(null);
    }

    @Test
    public void testMaxSize_BoundedCollection() {
        BoundedCollection bc = createMock(BoundedCollection.class);
        expect(bc.maxSize()).andReturn(10);
        replay(bc);
        assertEquals(10, CollectionUtils.maxSize(bc));
        verify(bc);
    }

    @Test
    public void testMaxSize_NonBoundedCatchBranch() {
        Collection plain = new ArrayList(Arrays.asList("a", "b"));
        assertEquals(-1, CollectionUtils.maxSize(plain));
    }

    // ---------- retainAll / removeAll (delegated to ListUtils - smoke test) ----------

    @Test
    public void testRetainAll_Basic() {
        List coll = Arrays.asList("a", "b", "c");
        List retain = Arrays.asList("b", "c");
        Collection result = CollectionUtils.retainAll(coll, retain);
        assertEquals(2, result.size());
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testRemoveAll_Basic() {
        List coll = Arrays.asList("a", "b", "c");
        List remove = Arrays.asList("b");
        Collection result = CollectionUtils.removeAll(coll, remove);
        assertEquals(2, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("c"));
    }

    // ---------- decorator factory methods (smoke tests) ----------

    @Test
    public void testSynchronizedCollection_Basic() {
        Collection c = CollectionUtils.synchronizedCollection(new ArrayList(Arrays.asList("a")));
        assertNotNull(c);
        assertTrue(c.contains("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSynchronizedCollection_NullThrows() {
        CollectionUtils.synchronizedCollection(null);
    }

    @Test
    public void testUnmodifiableCollection_Basic() {
        Collection c = CollectionUtils.unmodifiableCollection(new ArrayList(Arrays.asList("a")));
        assertNotNull(c);
        try {
            c.add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testPredicatedCollection_Basic() {
        Predicate p = createMock(Predicate.class);
        expect(p.evaluate("a")).andReturn(true);
        replay(p);
        Collection c = CollectionUtils.predicatedCollection(new ArrayList(), p);
        c.add("a");
        assertTrue(c.contains("a"));
        verify(p);
    }

    @Test
    public void testTypedCollection_Basic() {
        Collection c = CollectionUtils.typedCollection(new ArrayList(), String.class);
        c.add("a");
        assertTrue(c.contains("a"));
    }

    @Test
    public void testTransformedCollection_Basic() {
        Transformer t = createMock(Transformer.class);
        expect(t.transform("a")).andReturn("A");
        replay(t);
        Collection c = CollectionUtils.transformedCollection(new ArrayList(), t);
        c.add("a");
        assertTrue(c.contains("A"));
        verify(t);
    }
}
