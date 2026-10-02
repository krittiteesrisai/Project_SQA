package org.apache.commons.collections;

import org.junit.Test;
import org.apache.commons.collections.buffer.CircularFifoBuffer;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.collections.functors.ConstantTransformer;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.collections.functors.SwitchTransformer;
import java.util.Enumeration;
import org.apache.commons.collections.iterators.IteratorEnumeration;
import java.util.StringTokenizer;
import org.apache.commons.collections.iterators.SingletonIterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections.functors.UniquePredicate;
import org.apache.commons.collections.collection.SynchronizedCollection;
import org.apache.commons.collections.set.UnmodifiableSortedSet;
import org.apache.commons.collections.collection.UnmodifiableCollection;
import org.apache.commons.collections.set.ListOrderedSet;
import org.apache.commons.collections.list.FixedSizeList;
import java.util.LinkedHashMap;
import org.apache.commons.collections.bag.PredicatedSortedBag;
import org.apache.commons.collections.bag.UnmodifiableSortedBag;
import java.util.LinkedList;
import java.util.HashMap;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.collection.TransformedCollection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyIterator;

public final class org_apache_commons_collections_CollectionUtilsTest {
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isFull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFull(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
 * @utbot.returnsFrom {@code return ((BoundedCollection) coll).isFull();}
 *  */
    @Test
    public void testIsFull_ReturnBoundedCollectioncollIsFull() throws Exception  {
        CircularFifoBuffer circularFifoBuffer = ((CircularFifoBuffer) createInstance("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class circularFifoBufferType = Class.forName("java.util.Collection");
        Method isFullMethod = collectionUtilsClazz.getDeclaredMethod("isFull", circularFifoBufferType);
        isFullMethod.setAccessible(true);
        java.lang.Object[] isFullMethodArguments = new java.lang.Object[1];
        isFullMethodArguments[0] = circularFifoBuffer;
        boolean actual = ((Boolean) isFullMethod.invoke(null, isFullMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
 * @utbot.returnsFrom {@code return ((BoundedCollection) coll).isFull();}
 *  */
    @Test
    public void testIsFull_ReturnBoundedCollectioncollIsFull_1() throws Exception  {
        CircularFifoBuffer circularFifoBuffer = ((CircularFifoBuffer) createInstance("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(circularFifoBuffer, "org.apache.commons.collections.buffer.BoundedFifoBuffer", "maxElements", 1);
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class circularFifoBufferType = Class.forName("java.util.Collection");
        Method isFullMethod = collectionUtilsClazz.getDeclaredMethod("isFull", circularFifoBufferType);
        isFullMethod.setAccessible(true);
        java.lang.Object[] isFullMethodArguments = new java.lang.Object[1];
        isFullMethodArguments[0] = circularFifoBuffer;
        boolean actual = ((Boolean) isFullMethod.invoke(null, isFullMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
 * @utbot.returnsFrom {@code return ((BoundedCollection) coll).isFull();}
 *  */
    @Test
    public void testIsFull_ReturnBoundedCollectioncollIsFull_2() throws Exception  {
        CircularFifoBuffer circularFifoBuffer = ((CircularFifoBuffer) createInstance("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(circularFifoBuffer, "org.apache.commons.collections.buffer.BoundedFifoBuffer", "start", -1);
        setField(circularFifoBuffer, "org.apache.commons.collections.buffer.BoundedFifoBuffer", "maxElements", 1);
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class circularFifoBufferType = Class.forName("java.util.Collection");
        Method isFullMethod = collectionUtilsClazz.getDeclaredMethod("isFull", circularFifoBufferType);
        isFullMethod.setAccessible(true);
        java.lang.Object[] isFullMethodArguments = new java.lang.Object[1];
        isFullMethodArguments[0] = circularFifoBuffer;
        boolean actual = ((Boolean) isFullMethod.invoke(null, isFullMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isFull(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coll == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testIsFull_ThrowNullPointerException() {
        CollectionUtils.isFull(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isFull(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
     */
    @Test
    public void testIsFullReturnsFalse() {
        Collection collection = emptyList();
        
        boolean actual = CollectionUtils.isFull(collection);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.index
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method index(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,int)}
 * @utbot.invokes {@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return index(obj, new Integer(idx));}
 *  */
    @Test
    public void testIndex_CollectionUtilsIndex() {
        Object actual = CollectionUtils.index(((Object) null), -1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.index
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method index(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.util.Iterator,int)}
 * @utbot.returnsFrom {@code return iterator;}
 *  */
    @Test
    public void testIndex_IteratorHasNext() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class intType = int.class;
        Method indexMethod = collectionUtilsClazz.getDeclaredMethod("index", iteratorType, intType);
        indexMethod.setAccessible(true);
        java.lang.Object[] indexMethodArguments = new java.lang.Object[2];
        indexMethodArguments[0] = iterator;
        indexMethodArguments[1] = -255;
        Object actual = indexMethod.invoke(null, indexMethodArguments);
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        setField(expected, "java.util.ArrayList$Itr", "cursor", 3);
        setField(expected, "java.util.ArrayList$Itr", "lastRet", 2);
        setField(expected, "java.util.ArrayList$Itr", "expectedModCount", 3);
        setField(expected, "java.util.ArrayList$Itr", "this$0", arrayList);
        
        int expectedCursor = ((Integer) getFieldValue(expected, "java.util.ArrayList$Itr", "cursor"));
        int actualCursor = ((Integer) getFieldValue(actual, "java.util.ArrayList$Itr", "cursor"));
        assertEquals(expectedCursor, actualCursor);
        
        int expectedLastRet = ((Integer) getFieldValue(expected, "java.util.ArrayList$Itr", "lastRet"));
        int actualLastRet = ((Integer) getFieldValue(actual, "java.util.ArrayList$Itr", "lastRet"));
        assertEquals(expectedLastRet, actualLastRet);
        
        int expectedExpectedModCount = ((Integer) getFieldValue(expected, "java.util.ArrayList$Itr", "expectedModCount"));
        int actualExpectedModCount = ((Integer) getFieldValue(actual, "java.util.ArrayList$Itr", "expectedModCount"));
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method index(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.util.Iterator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(iterator.hasNext())
 *  */
    @Test
    public void testIndex_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.index] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.index(CollectionUtils.java:787) */
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class intType = int.class;
        Method indexMethod = collectionUtilsClazz.getDeclaredMethod("index", iteratorType, intType);
        indexMethod.setAccessible(true);
        java.lang.Object[] indexMethodArguments = new java.lang.Object[2];
        indexMethodArguments[0] = ((Object) null);
        indexMethodArguments[1] = -255;
        try {
            indexMethod.invoke(null, indexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.index
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method index(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (index instanceof Integer): False}
 * @utbot.executesCondition {@code (idx < 0): True}
 *  */
    @Test
    public void testIndex_NotIndexNotInstanceOfInteger() {
        Object actual = CollectionUtils.index(((Object) null), ((Object) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (index instanceof Integer): True}
 * @utbot.executesCondition {@code (idx < 0): True}
 *  */
    @Test
    public void testIndex_IdxLessThanZero() {
        Integer integer = -1;
        
        Object actual = CollectionUtils.index(((Object) null), ((Object) integer));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#index(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (index instanceof Integer): True}
 * @utbot.executesCondition {@code (idx < 0): False}
 * @utbot.executesCondition {@code (obj instanceof Map): False}
 * @utbot.executesCondition {@code (obj instanceof List): False}
 * @utbot.executesCondition {@code (obj instanceof Object[]): True}
 *  */
    @Test
    public void testIndex_ObjInstanceOfObject() {
        Object object = new Object();
        Integer integer = 0;
        
        Object actual = CollectionUtils.index(object, ((Object) integer));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.get
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#get(java.lang.Object,int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_ThrowIndexOutOfBoundsException() {
        CollectionUtils.get(null, -1);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#get(java.lang.Object,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (object instanceof Map): False}
 * @utbot.executesCondition {@code (object instanceof List): False}
 * @utbot.executesCondition {@code (object instanceof Object[]): True}
 * @utbot.returnsFrom {@code return ((Object[]) object)[index];}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ((Object[]) object)[index];
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException() {
        Object object = new Object();
        
        CollectionUtils.get(object, 0);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#get(java.lang.Object,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (object instanceof Map): False}
 * @utbot.executesCondition {@code (object instanceof List): False}
 * @utbot.executesCondition {@code (object instanceof Object[]): False}
 * @utbot.executesCondition {@code (object instanceof Iterator): False}
 * @utbot.executesCondition {@code (object instanceof Collection): False}
 * @utbot.executesCondition {@code (object instanceof Enumeration): False}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: object == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException_1() {
        CollectionUtils.get(null, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)}
 * @utbot.returnsFrom {@code return (coll == null || coll.isEmpty());}
 *  */
    @Test
    public void testIsEmpty_CollNotEqualsNullOrCollIsEmpty() {
        ArrayList arrayList = new ArrayList();
        
        boolean actual = CollectionUtils.isEmpty(arrayList);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)}
 * @utbot.returnsFrom {@code return (coll == null || coll.isEmpty());}
 *  */
    @Test
    public void testIsEmpty_CollEqualsNullOrCollIsEmpty() {
        boolean actual = CollectionUtils.isEmpty(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)}
 * @utbot.returnsFrom {@code return (coll == null || coll.isEmpty());}
 *  */
    @Test
    public void testIsEmpty_CollEqualsNullOrCollIsEmpty_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        boolean actual = CollectionUtils.isEmpty(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#size(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof Map): False}
 * @utbot.executesCondition {@code (object instanceof Collection): False}
 * @utbot.executesCondition {@code (object instanceof Object[]): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testSize_ObjectInstanceOfObject() {
        java.lang.Object[] objectArray = {null};
        
        int actual = CollectionUtils.size(objectArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#size(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof Map): False}
 * @utbot.executesCondition {@code (object instanceof Collection): False}
 * @utbot.executesCondition {@code (object instanceof Object[]): False}
 * @utbot.executesCondition {@code (object instanceof Iterator): False}
 * @utbot.executesCondition {@code (object instanceof Enumeration): False}
 * @utbot.executesCondition {@code (if (object instanceof Iterator) {
 *     Iterator it = (Iterator) object;
 *     while (it.hasNext()) {
 *         total++;
 *         it.next();
 *     }
 * } else if (object instanceof Enumeration) {
 *     Enumeration it = (Enumeration) object;
 *     while (it.hasMoreElements()) {
 *         total++;
 *         it.nextElement();
 *     }
 * } else if (object == null) {
 *     throw new IllegalArgumentException("Unsupported object type: null");
 * } else {
 *     try {
 *         total = Array.getLength(object);
 *     } catch (IllegalArgumentException ex) {
 *         throw new IllegalArgumentException("Unsupported object type: " + object.getClass().getName());
 *     }
 * }): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: object == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSize_ThrowIllegalArgumentException() {
        CollectionUtils.size(null);
    }
    ///endregion
    
    ///region Errors report for size
    
    public void testSize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.collect
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collect(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ArrayList answer = new ArrayList(inputCollection.size());
 *  */
    @Test
    public void testCollect_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.collect] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.collect(CollectionUtils.java:573) */
        CollectionUtils.collect(((Collection) null), ((Transformer) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collect(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)}
     */
    @Test
    public void testCollect() {
        Collection collection = emptyList();
        Object object = new Object();
        ConstantTransformer constantTransformer = new ConstantTransformer(object);
        
        ArrayList actual = ((ArrayList) CollectionUtils.collect(collection, ((Transformer) constantTransformer)));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method collect(java.util.Collection, org.apache.commons.collections.Transformer)
    
    @Test
    public void testCollect1() {
        HashSet hashSet = new HashSet();
        
        ArrayList actual = ((ArrayList) CollectionUtils.collect(hashSet, ((Transformer) null)));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.collect
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collect(java.util.Collection, org.apache.commons.collections.Transformer, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)}
 * @utbot.executesCondition {@code (inputCollection != null): False}
 * @utbot.returnsFrom {@code return outputCollection;}
 *  */
    @Test
    public void testCollect_InputCollectionEqualsNull() {
        Collection actual = CollectionUtils.collect(((Collection) null), ((Transformer) null), ((Collection) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collect(java.util.Collection, org.apache.commons.collections.Transformer, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)}
     */
    @Test
    public void testCollect2() {
        Collection collection = emptyList();
        Object object = new Object();
        ConstantTransformer constantTransformer = new ConstantTransformer(object);
        Collection collection1 = emptyList();
        
        List actual = ((List) CollectionUtils.collect(collection, ((Transformer) constantTransformer), collection1));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.collect
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collect(java.util.Iterator, org.apache.commons.collections.Transformer)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)}
 * @utbot.invokes {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)}
 * @utbot.returnsFrom {@code return answer;}
 *  */
    @Test
    public void testCollect_CollectionUtilsCollect() {
        ArrayList actual = ((ArrayList) CollectionUtils.collect(((Iterator) null), ((Transformer) null)));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.collect
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collect(java.util.Iterator, org.apache.commons.collections.Transformer, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)}
 * @utbot.executesCondition {@code (inputIterator != null): False}
 * @utbot.returnsFrom {@code return outputCollection;}
 *  */
    @Test
    public void testCollect_InputIteratorEqualsNull() {
        Collection actual = CollectionUtils.collect(((Iterator) null), ((Transformer) null), ((Collection) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.transform
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transform(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.executesCondition {@code (collection != null): False}
 *  */
    @Test
    public void testTransform_CollectionEqualsNull() {
        CollectionUtils.transform(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.executesCondition {@code (collection != null): True}
 * @utbot.executesCondition {@code (transformer != null): False}
 *  */
    @Test
    public void testTransform_TransformerEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.transform(arrayList, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method transform(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)}
     */
    @Test
    public void testTransform() {
        Collection collection = emptyList();
        Object object = new Object();
        ConstantTransformer constantTransformer = new ConstantTransformer(object);
        
        CollectionUtils.transform(collection, constantTransformer);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method transform(java.util.Collection, org.apache.commons.collections.Transformer)
    
    @Test
    public void testTransform1() throws Exception  {
        HashSet hashSet = new HashSet();
        SwitchTransformer switchTransformer = ((SwitchTransformer) createInstance("org.apache.commons.collections.functors.SwitchTransformer"));
        
        CollectionUtils.transform(hashSet, switchTransformer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection, java.util.Enumeration)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)}
 *  */
    @Test
    public void testAddAll_EnumerationHasMoreElements() throws Exception  {
        Object compoundEnumeration = createInstance("java.lang.CompoundEnumeration");
        java.util.Enumeration[] enums = {};
        setField(compoundEnumeration, "java.lang.CompoundEnumeration", "enums", enums);
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class collectionType = Class.forName("java.util.Collection");
        Class compoundEnumerationType = Class.forName("java.util.Enumeration");
        Method addAllMethod = collectionUtilsClazz.getDeclaredMethod("addAll", collectionType, compoundEnumerationType);
        addAllMethod.setAccessible(true);
        java.lang.Object[] addAllMethodArguments = new java.lang.Object[2];
        addAllMethodArguments[0] = ((Object) null);
        addAllMethodArguments[1] = compoundEnumeration;
        addAllMethod.invoke(null, addAllMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection, java.util.Enumeration)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(enumeration.hasMoreElements())
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Object compoundEnumeration = createInstance("java.lang.CompoundEnumeration");
        java.util.Enumeration[] enums = {};
        setField(compoundEnumeration, "java.lang.CompoundEnumeration", "enums", enums);
        setField(compoundEnumeration, "java.lang.CompoundEnumeration", "index", -1);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.lang.CompoundEnumeration.next(ClassLoader.java:2730)
            java.base/java.lang.CompoundEnumeration.hasMoreElements(ClassLoader.java:2739)
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:673) */
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class collectionType = Class.forName("java.util.Collection");
        Class compoundEnumerationType = Class.forName("java.util.Enumeration");
        Method addAllMethod = collectionUtilsClazz.getDeclaredMethod("addAll", collectionType, compoundEnumerationType);
        addAllMethod.setAccessible(true);
        java.lang.Object[] addAllMethodArguments = new java.lang.Object[2];
        addAllMethodArguments[0] = ((Object) null);
        addAllMethodArguments[1] = compoundEnumeration;
        try {
            addAllMethod.invoke(null, addAllMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(enumeration.hasMoreElements())
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:673) */
        CollectionUtils.addAll(((Collection) null), ((Enumeration) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection, java.util.Enumeration)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Enumeration)}
     */
    @Test
    public void testAddAll() {
        Collection collection = emptyList();
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(null);
        Iterator iterator = emptyIterator();
        iteratorEnumeration.setIterator(iterator);
        
        CollectionUtils.addAll(collection, iteratorEnumeration);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(java.util.Collection, java.util.Enumeration)
    
    @Test(expected = StackOverflowError.class)
    public void testAddAll1() throws Throwable  {
        Object compoundEnumeration = createInstance("java.lang.CompoundEnumeration");
        java.util.Enumeration[] enums = new java.util.Enumeration[9];
        Object compoundEnumeration1 = createInstance("java.lang.CompoundEnumeration");
        setField(compoundEnumeration1, "java.lang.CompoundEnumeration", "enums", enums);
        enums[0] = ((Enumeration) compoundEnumeration1);
        enums[1] = ((Enumeration) compoundEnumeration1);
        enums[2] = ((Enumeration) compoundEnumeration1);
        enums[3] = ((Enumeration) compoundEnumeration1);
        enums[4] = ((Enumeration) compoundEnumeration1);
        enums[5] = ((Enumeration) compoundEnumeration1);
        enums[6] = ((Enumeration) compoundEnumeration1);
        enums[7] = ((Enumeration) compoundEnumeration1);
        enums[8] = ((Enumeration) compoundEnumeration1);
        setField(compoundEnumeration, "java.lang.CompoundEnumeration", "enums", enums);
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class collectionType = Class.forName("java.util.Collection");
        Class compoundEnumerationType = Class.forName("java.util.Enumeration");
        Method addAllMethod = collectionUtilsClazz.getDeclaredMethod("addAll", collectionType, compoundEnumerationType);
        addAllMethod.setAccessible(true);
        java.lang.Object[] addAllMethodArguments = new java.lang.Object[2];
        addAllMethodArguments[0] = ((Object) null);
        addAllMethodArguments[1] = compoundEnumeration;
        try {
            addAllMethod.invoke(null, addAllMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddAll2() throws Exception  {
        StringTokenizer stringTokenizer = ((StringTokenizer) createInstance("java.util.StringTokenizer"));
        setField(stringTokenizer, "java.util.StringTokenizer", "maxPosition", 1);
        String str = "";
        setField(stringTokenizer, "java.util.StringTokenizer", "str", str);
        setField(stringTokenizer, "java.util.StringTokenizer", "delimiters", str);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            java.base/java.util.StringTokenizer.skipDelimiters(StringTokenizer.java:249)
            java.base/java.util.StringTokenizer.hasMoreTokens(StringTokenizer.java:321)
            java.base/java.util.StringTokenizer.hasMoreElements(StringTokenizer.java:389)
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:673) */
        CollectionUtils.addAll(((Collection) null), stringTokenizer);
    }
    
    @Test
    public void testAddAll3() throws Exception  {
        StringTokenizer stringTokenizer = ((StringTokenizer) createInstance("java.util.StringTokenizer"));
        setField(stringTokenizer, "java.util.StringTokenizer", "maxPosition", 1);
        String str = "";
        setField(stringTokenizer, "java.util.StringTokenizer", "str", str);
        setField(stringTokenizer, "java.util.StringTokenizer", "delimiters", str);
        setField(stringTokenizer, "java.util.StringTokenizer", "hasSurrogates", true);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.StringIndexOutOfBoundsException: index 0, length 0]
            java.base/java.lang.String.checkIndex(String.java:4567)
            java.base/java.lang.String.codePointAt(String.java:1549)
            java.base/java.util.StringTokenizer.skipDelimiters(StringTokenizer.java:254)
            java.base/java.util.StringTokenizer.hasMoreTokens(StringTokenizer.java:321)
            java.base/java.util.StringTokenizer.hasMoreElements(StringTokenizer.java:389)
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:673) */
        CollectionUtils.addAll(((Collection) null), stringTokenizer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(iterator.hasNext())
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:660) */
        CollectionUtils.addAll(((Collection) null), ((Iterator) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addAll(java.util.Collection, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.util.Iterator)}
     */
    @Test
    public void testAddAllThrowsUOE() {
        Collection collection = emptyList();
        SingletonIterator singletonIterator = new SingletonIterator(null);
        AbstractIteratorDecorator abstractIteratorDecorator = new AbstractIteratorDecorator(singletonIterator);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.AbstractList.add(AbstractList.java:153)
            java.base/java.util.AbstractList.add(AbstractList.java:111)
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:661) */
        CollectionUtils.addAll(collection, abstractIteratorDecorator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object[])}
 *  */
    @Test
    public void testAddAll4() {
        java.lang.Object[] objectArray = {};
        
        CollectionUtils.addAll(((Collection) null), objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = elements.length; i < size; i++)} once
 *  */
    @Test
    public void testAddAll_CollectionAdd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        java.lang.Object[] objectArray = {null};
        
        CollectionUtils.addAll(((Collection) arrayList), objectArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0, size = elements.length; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collection.add(elements[i]);
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException2() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:687) */
        CollectionUtils.addAll(((Collection) null), objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, size = elements.length; i < size; i++)
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:686) */
        CollectionUtils.addAll(((Collection) null), ((java.lang.Object[]) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addAll(java.util.Collection, [Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addAll(java.util.Collection,java.lang.Object[])}
     */
    @Test
    public void testAddAllThrowsUOEWithNonEmptyObjectArray() {
        Collection collection = emptyList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addAll] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.AbstractList.add(AbstractList.java:153)
            java.base/java.util.AbstractList.add(AbstractList.java:111)
            org.apache.commons.collections.CollectionUtils.addAll(CollectionUtils.java:687) */
        CollectionUtils.addAll(collection, objectArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection, [Ljava.lang.Object;)
    
    @Test
    public void testAddAll5() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
        
        CollectionUtils.addAll(((Collection) arrayList), objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.filter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filter(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 *  */
    @Test
    public void testFilter_PredicateEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.filter(arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#filter(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): False}
 *  */
    @Test
    public void testFilter_CollectionEqualsNull() {
        CollectionUtils.filter(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method filter(java.util.Collection, org.apache.commons.collections.Predicate)
    
    @Test
    public void testFilter1() {
        HashSet hashSet = new HashSet();
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        CollectionUtils.filter(hashSet, uniquePredicate);
    }
    
    @Test
    public void testFilter2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        CollectionUtils.filter(arrayList, uniquePredicate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.find
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method find(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFind_PredicateEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        Object actual = CollectionUtils.find(arrayList, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#find(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFind_CollectionEqualsNull() {
        Object actual = CollectionUtils.find(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method find(java.util.Collection, org.apache.commons.collections.Predicate)
    
    @Test
    public void testFind1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        Object actual = CollectionUtils.find(arrayList, uniquePredicate);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.synchronizedCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method synchronizedCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#synchronizedCollection(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.collection.SynchronizedCollection#decorate(java.util.Collection)}
 * @utbot.returnsFrom {@code return SynchronizedCollection.decorate(collection);}
 *  */
    @Test
    public void testSynchronizedCollection_SynchronizedCollectionDecorate() throws Exception  {
        HashSet hashSet = new HashSet();
        
        SynchronizedCollection actual = ((SynchronizedCollection) CollectionUtils.synchronizedCollection(hashSet));
        
        SynchronizedCollection expected = ((SynchronizedCollection) createInstance("org.apache.commons.collections.collection.SynchronizedCollection"));
        setField(expected, "org.apache.commons.collections.collection.SynchronizedCollection", "collection", hashSet);
        setField(expected, "org.apache.commons.collections.collection.SynchronizedCollection", "lock", expected);
        
        // org.apache.commons.collections.collection.SynchronizedCollection is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method synchronizedCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#synchronizedCollection(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.collection.SynchronizedCollection#decorate(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return SynchronizedCollection.decorate(collection);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSynchronizedCollection_ThrowIllegalArgumentException() {
        CollectionUtils.synchronizedCollection(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.removeAll
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection, java.util.Collection)
    
    @Test
    public void testRemoveAll1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ArrayList arrayList1 = new ArrayList();
        
        ArrayList actual = ((ArrayList) CollectionUtils.removeAll(arrayList, arrayList1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAll(java.util.Collection, java.util.Collection)
    
    @Test
    public void testRemoveAll2() {
        HashSet hashSet = new HashSet();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.removeAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ListUtils.retainAll(ListUtils.java:238)
            org.apache.commons.collections.CollectionUtils.removeAll(CollectionUtils.java:1121) */
        CollectionUtils.removeAll(hashSet, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.retainAll
    
    ///region FUZZER: ERROR SUITE for method retainAll(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#retainAll(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testRetainAllThrowsNPE() {
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ListUtils.retainAll(ListUtils.java:238)
            org.apache.commons.collections.CollectionUtils.retainAll(CollectionUtils.java:1101) */
        CollectionUtils.retainAll(collection, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection, java.util.Collection)
    
    @Test
    public void testRetainAll1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        ArrayList arrayList1 = new ArrayList();
        
        ArrayList actual = ((ArrayList) CollectionUtils.retainAll(arrayList, arrayList1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.exists
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exists(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testExists_PredicateEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        boolean actual = CollectionUtils.exists(arrayList, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (collection != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testExists_CollectionEqualsNull() {
        boolean actual = CollectionUtils.exists(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method exists(java.util.Collection, org.apache.commons.collections.Predicate)
    
    @Test
    public void testExists1() {
        HashSet hashSet = new HashSet();
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        boolean actual = CollectionUtils.exists(hashSet, uniquePredicate);
        
        assertFalse(actual);
    }
    
    @Test
    public void testExists2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        boolean actual = CollectionUtils.exists(arrayList, uniquePredicate);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.unmodifiableCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unmodifiableCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return UnmodifiableCollection.decorate(collection);}
 *  */
    @Test
    public void testUnmodifiableCollection_ReturnUnmodifiableCollectionDecorate_1() throws Exception  {
        UnmodifiableSortedSet unmodifiableSortedSet = ((UnmodifiableSortedSet) createInstance("org.apache.commons.collections.set.UnmodifiableSortedSet"));
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class unmodifiableSortedSetType = Class.forName("java.util.Collection");
        Method unmodifiableCollectionMethod = collectionUtilsClazz.getDeclaredMethod("unmodifiableCollection", unmodifiableSortedSetType);
        unmodifiableCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableCollectionMethodArguments[0] = unmodifiableSortedSet;
        UnmodifiableSortedSet actual = ((UnmodifiableSortedSet) unmodifiableCollectionMethod.invoke(null, unmodifiableCollectionMethodArguments));
        
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        assertNull(actualCollection);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return UnmodifiableCollection.decorate(collection);}
 *  */
    @Test
    public void testUnmodifiableCollection_ReturnUnmodifiableCollectionDecorate() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        UnmodifiableCollection actual = ((UnmodifiableCollection) CollectionUtils.unmodifiableCollection(arrayList));
        
        UnmodifiableCollection expected = ((UnmodifiableCollection) createInstance("org.apache.commons.collections.collection.UnmodifiableCollection"));
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#unmodifiableCollection(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.collection.UnmodifiableCollection#decorate(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableCollection_ThrowIllegalArgumentException() {
        CollectionUtils.unmodifiableCollection(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.maxSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maxSize(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#maxSize(java.util.Collection)}
 * @utbot.executesCondition {@code (coll instanceof BoundedCollection): True}
 * @utbot.invokes {@link org.apache.commons.collections.BoundedCollection#maxSize()}
 * @utbot.returnsFrom {@code return ((BoundedCollection) coll).maxSize();}
 *  */
    @Test
    public void testMaxSize_CollInstanceOfBoundedCollection() throws Exception  {
        CircularFifoBuffer circularFifoBuffer = ((CircularFifoBuffer) createInstance("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class circularFifoBufferType = Class.forName("java.util.Collection");
        Method maxSizeMethod = collectionUtilsClazz.getDeclaredMethod("maxSize", circularFifoBufferType);
        maxSizeMethod.setAccessible(true);
        java.lang.Object[] maxSizeMethodArguments = new java.lang.Object[1];
        maxSizeMethodArguments[0] = circularFifoBuffer;
        int actual = ((Integer) maxSizeMethod.invoke(null, maxSizeMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#maxSize(java.util.Collection)}
 * @utbot.executesCondition {@code (coll instanceof BoundedCollection): False}
 * @utbot.invokes {@link org.apache.commons.collections.collection.UnmodifiableBoundedCollection#decorateUsing(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.collection.UnmodifiableBoundedCollection#decorateUsing(java.util.Collection)}
 * @utbot.returnsFrom {@code return -1;}
 * @utbot.caughtException {@code IllegalArgumentException ex}
 *  */
    @Test
    public void testMaxSize_CatchIllegalArgumentException() {
        HashSet hashSet = new HashSet();
        
        int actual = CollectionUtils.maxSize(hashSet);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maxSize(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#maxSize(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coll == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaxSize_ThrowNullPointerException() {
        CollectionUtils.maxSize(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maxSize(java.util.Collection)
    
    @Test
    public void testMaxSize1() throws Exception  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections.bag.SynchronizedBag$SynchronizedBagSet");
        BoundedFifoBuffer collection = ((BoundedFifoBuffer) createInstance("org.apache.commons.collections.BoundedFifoBuffer"));
        setField(synchronizedBagSet, "org.apache.commons.collections.collection.SynchronizedCollection", "collection", collection);
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method maxSizeMethod = collectionUtilsClazz.getDeclaredMethod("maxSize", synchronizedBagSetType);
        maxSizeMethod.setAccessible(true);
        java.lang.Object[] maxSizeMethodArguments = new java.lang.Object[1];
        maxSizeMethodArguments[0] = synchronizedBagSet;
        int actual = ((Integer) maxSizeMethod.invoke(null, maxSizeMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testMaxSize2() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        BoundedFifoBuffer collection = ((BoundedFifoBuffer) createInstance("org.apache.commons.collections.BoundedFifoBuffer"));
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        int actual = CollectionUtils.maxSize(listOrderedSet);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testMaxSize3() throws Exception  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections.bag.SynchronizedBag$SynchronizedBagSet");
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method maxSizeMethod = collectionUtilsClazz.getDeclaredMethod("maxSize", synchronizedBagSetType);
        maxSizeMethod.setAccessible(true);
        java.lang.Object[] maxSizeMethodArguments = new java.lang.Object[1];
        maxSizeMethodArguments[0] = synchronizedBagSet;
        int actual = ((Integer) maxSizeMethod.invoke(null, maxSizeMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testMaxSize4() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        Object collection = createInstance("org.apache.commons.collections.bag.SynchronizedBag$SynchronizedBagSet");
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        int actual = CollectionUtils.maxSize(listOrderedSet);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maxSize(java.util.Collection)
    
    @Test
    public void testMaxSize5() throws Exception  {
        FixedSizeList fixedSizeList = ((FixedSizeList) createInstance("org.apache.commons.collections.list.FixedSizeList"));
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.maxSize] produces [java.lang.NullPointerException]
            org.apache.commons.collections.collection.AbstractCollectionDecorator.size(AbstractCollectionDecorator.java:107)
            org.apache.commons.collections.list.FixedSizeList.maxSize(FixedSizeList.java:159)
            org.apache.commons.collections.CollectionUtils.maxSize(CollectionUtils.java:1073) */
        CollectionUtils.maxSize(fixedSizeList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.union
    
    ///region FUZZER: ERROR SUITE for method union(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#union(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testUnionThrowsNPE() {
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.union] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.union(CollectionUtils.java:92) */
        CollectionUtils.union(collection, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method union(java.util.Collection, java.util.Collection)
    
    @Test
    public void testUnion1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.union] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.union(CollectionUtils.java:92) */
        CollectionUtils.union(arrayList, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.subtract
    
    ///region OTHER: ERROR SUITE for method subtract(java.util.Collection, java.util.Collection)
    
    @Test
    public void testSubtract1() {
        HashSet hashSet = new HashSet();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.subtract(CollectionUtils.java:181) */
        CollectionUtils.subtract(hashSet, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isNotEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNotEmpty(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)}
 * @utbot.returnsFrom {@code return !CollectionUtils.isEmpty(coll);}
 *  */
    @Test
    public void testIsNotEmpty_ReturnNotCollectionUtilsIsEmpty() {
        ArrayList arrayList = new ArrayList();
        
        boolean actual = CollectionUtils.isNotEmpty(arrayList);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)}
 * @utbot.returnsFrom {@code return !CollectionUtils.isEmpty(coll);}
 *  */
    @Test
    public void testIsNotEmpty_ReturnNotCollectionUtilsIsEmpty_1() {
        boolean actual = CollectionUtils.isNotEmpty(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isNotEmpty(java.util.Collection)
    
    @Test
    public void testIsNotEmpty1() {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        boolean actual = CollectionUtils.isNotEmpty(hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.intersection
    
    ///region OTHER: ERROR SUITE for method intersection(java.util.Collection, java.util.Collection)
    
    @Test
    public void testIntersection1() {
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.intersection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.intersection(CollectionUtils.java:122) */
        CollectionUtils.intersection(arrayList, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.addIgnoreNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addIgnoreNull(java.util.Collection, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return (object == null ? false : collection.add(object));}
 *  */
    @Test
    public void testAddIgnoreNull_ObjectEqualsNull() {
        boolean actual = CollectionUtils.addIgnoreNull(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addIgnoreNull(java.util.Collection, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collection.add(object)
 *  */
    @Test
    public void testAddIgnoreNull_ThrowNullPointerException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addIgnoreNull] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.addIgnoreNull(CollectionUtils.java:649) */
        CollectionUtils.addIgnoreNull(null, byteArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addIgnoreNull(java.util.Collection, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
     */
    @Test
    public void testAddIgnoreNullThrowsUOE() {
        Collection collection = emptyList();
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.addIgnoreNull] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.AbstractList.add(AbstractList.java:153)
            java.base/java.util.AbstractList.add(AbstractList.java:111)
            org.apache.commons.collections.CollectionUtils.addIgnoreNull(CollectionUtils.java:649) */
        CollectionUtils.addIgnoreNull(collection, object);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIgnoreNull(java.util.Collection, java.lang.Object)
    
    @Test
    public void testAddIgnoreNull1() {
        HashSet hashSet = new HashSet();
        Object object = new Object();
        
        boolean actual = CollectionUtils.addIgnoreNull(hashSet, object);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.reverseArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverseArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#reverseArray(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverseArray_IterateWhileLoop() {
        java.lang.Object[] objectArray = {null, null};
        
        CollectionUtils.reverseArray(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#reverseArray(java.lang.Object[])}
 *  */
    @Test
    public void testReverseArray() {
        java.lang.Object[] objectArray = {null};
        
        CollectionUtils.reverseArray(objectArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reverseArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#reverseArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int j = array.length - 1;
 *  */
    @Test
    public void testReverseArray_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.reverseArray] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.reverseArray(CollectionUtils.java:1002) */
        CollectionUtils.reverseArray(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.getFreq
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFreq(java.lang.Object, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#getFreq(java.lang.Object,java.util.Map)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer count = (Integer) freqMap.get(obj);
 *  */
    @Test
    public void testGetFreq_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.getFreq] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getFreq(CollectionUtils.java:1015) */
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class mapType = Class.forName("java.util.Map");
        Method getFreqMethod = collectionUtilsClazz.getDeclaredMethod("getFreq", objectType, mapType);
        getFreqMethod.setAccessible(true);
        java.lang.Object[] getFreqMethodArguments = new java.lang.Object[2];
        getFreqMethodArguments[0] = ((Object) null);
        getFreqMethodArguments[1] = ((Object) null);
        try {
            getFreqMethod.invoke(null, getFreqMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFreq(java.lang.Object, java.util.Map)
    
    @Test
    public void testGetFreq1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method getFreqMethod = collectionUtilsClazz.getDeclaredMethod("getFreq", objectType, linkedHashMapType);
        getFreqMethod.setAccessible(true);
        java.lang.Object[] getFreqMethodArguments = new java.lang.Object[2];
        getFreqMethodArguments[0] = object;
        getFreqMethodArguments[1] = linkedHashMap;
        int actual = ((Integer) getFreqMethod.invoke(null, getFreqMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isEqualCollection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqualCollection(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.size() != b.size()
 *  */
    @Test
    public void testIsEqualCollection_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.isEqualCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.isEqualCollection(CollectionUtils.java:304) */
        CollectionUtils.isEqualCollection(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.size() != b.size()
 *  */
    @Test
    public void testIsEqualCollection_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.isEqualCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.isEqualCollection(CollectionUtils.java:304) */
        CollectionUtils.isEqualCollection(arrayList, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isEqualCollection(java.util.Collection, java.util.Collection)
    
    @Test
    public void testIsEqualCollection1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        HashSet hashSet = new HashSet();
        
        boolean actual = CollectionUtils.isEqualCollection(arrayList, hashSet);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsEqualCollection2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        boolean actual = CollectionUtils.isEqualCollection(arrayList, arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.containsAny
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsAny(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coll1.size() < coll2.size()
 *  */
    @Test
    public void testContainsAny_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.containsAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.containsAny(CollectionUtils.java:200) */
        CollectionUtils.containsAny(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coll1.size() < coll2.size()
 *  */
    @Test
    public void testContainsAny_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.containsAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.containsAny(CollectionUtils.java:200) */
        CollectionUtils.containsAny(arrayList, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsAny(java.util.Collection, java.util.Collection)
    
    @Test
    public void testContainsAny1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        boolean actual = CollectionUtils.containsAny(arrayList, arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.cardinality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cardinality(java.lang.Object, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = coll.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testCardinality_ThrowNullPointerException_1() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.cardinality] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.cardinality(CollectionUtils.java:346) */
        CollectionUtils.cardinality(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = coll.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testCardinality_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.cardinality] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.cardinality(CollectionUtils.java:340) */
        CollectionUtils.cardinality(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cardinality(java.lang.Object, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#cardinality(java.lang.Object,java.util.Collection)}
     */
    @Test
    public void testCardinalityReturnsZero() {
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        
        int actual = CollectionUtils.cardinality(null, hashSet);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method cardinality(java.lang.Object, java.util.Collection)
    
    @Test
    public void testCardinality1() throws Exception  {
        java.lang.Object[] entrySetArray = createArray("java.util.HashMap$EntrySet", 0);
        PredicatedSortedBag predicatedSortedBag = ((PredicatedSortedBag) createInstance("org.apache.commons.collections.bag.PredicatedSortedBag"));
        Object collection = createInstance("java.util.Hashtable$KeySet");
        setField(predicatedSortedBag, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.cardinality] produces [java.lang.ClassCastException: class java.util.Hashtable$KeySet cannot be cast to class org.apache.commons.collections.Bag (java.util.Hashtable$KeySet is in module java.base of loader 'bootstrap'; org.apache.commons.collections.Bag is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            org.apache.commons.collections.bag.PredicatedBag.getBag(PredicatedBag.java:87)
            org.apache.commons.collections.bag.PredicatedBag.getCount(PredicatedBag.java:105)
            org.apache.commons.collections.CollectionUtils.cardinality(CollectionUtils.java:336) */
        CollectionUtils.cardinality(entrySetArray, predicatedSortedBag);
    }
    
    @Test
    public void testCardinality2() throws Throwable  {
        Object object = new Object();
        UnmodifiableSortedBag unmodifiableSortedBag = ((UnmodifiableSortedBag) createInstance("org.apache.commons.collections.bag.UnmodifiableSortedBag"));
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.cardinality] produces [java.lang.NullPointerException]
            org.apache.commons.collections.bag.AbstractBagDecorator.getCount(AbstractBagDecorator.java:65)
            org.apache.commons.collections.CollectionUtils.cardinality(CollectionUtils.java:336) */
        Class collectionUtilsClazz = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class unmodifiableSortedBagType = Class.forName("java.util.Collection");
        Method cardinalityMethod = collectionUtilsClazz.getDeclaredMethod("cardinality", objectType, unmodifiableSortedBagType);
        cardinalityMethod.setAccessible(true);
        java.lang.Object[] cardinalityMethodArguments = new java.lang.Object[2];
        cardinalityMethodArguments[0] = object;
        cardinalityMethodArguments[1] = unmodifiableSortedBag;
        try {
            cardinalityMethod.invoke(null, cardinalityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.disjunction
    
    ///region FUZZER: ERROR SUITE for method disjunction(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#disjunction(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testDisjunctionThrowsNPE() {
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.disjunction] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.disjunction(CollectionUtils.java:155) */
        CollectionUtils.disjunction(collection, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method disjunction(java.util.Collection, java.util.Collection)
    
    @Test
    public void testDisjunction1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.disjunction] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.disjunction(CollectionUtils.java:155) */
        CollectionUtils.disjunction(arrayList, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.countMatches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method countMatches(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (inputCollection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCountMatches_PredicateEqualsNull() {
        LinkedList linkedList = new LinkedList();
        
        int actual = CollectionUtils.countMatches(linkedList, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#countMatches(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.executesCondition {@code (inputCollection != null): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testCountMatches_InputCollectionEqualsNull() {
        int actual = CollectionUtils.countMatches(null, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method countMatches(java.util.Collection, org.apache.commons.collections.Predicate)
    
    @Test
    public void testCountMatches1() {
        HashSet hashSet = new HashSet();
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        int actual = CollectionUtils.countMatches(hashSet, uniquePredicate);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testCountMatches2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        int actual = CollectionUtils.countMatches(arrayList, uniquePredicate);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.select
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method select(java.util.Collection, org.apache.commons.collections.Predicate, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
 * @utbot.executesCondition {@code (inputCollection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 *  */
    @Test
    public void testSelect_PredicateEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.select(arrayList, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
 * @utbot.executesCondition {@code (inputCollection != null): False}
 *  */
    @Test
    public void testSelect_InputCollectionEqualsNull() {
        CollectionUtils.select(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select(java.util.Collection, org.apache.commons.collections.Predicate, java.util.Collection)
    
    @Test
    public void testSelect1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        UniquePredicate uniquePredicate = new UniquePredicate();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.select] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.select(CollectionUtils.java:517) */
        CollectionUtils.select(arrayList, uniquePredicate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.select
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method select(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ArrayList answer = new ArrayList(inputCollection.size());
 *  */
    @Test
    public void testSelect_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.select] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.select(CollectionUtils.java:496) */
        CollectionUtils.select(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method select(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#select(java.util.Collection,org.apache.commons.collections.Predicate)}
     */
    @Test
    public void testSelect() {
        Collection collection = emptyList();
        
        ArrayList actual = ((ArrayList) CollectionUtils.select(collection, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.sizeIsEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sizeIsEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#sizeIsEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return ((Object[]) object).length == 0;}
 *  */
    @Test
    public void testSizeIsEmpty_ObjectobjectLengthEqualsZero() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = CollectionUtils.sizeIsEmpty(objectArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#sizeIsEmpty(java.lang.Object)}
 * @utbot.returnsFrom {@code return ((Object[]) object).length == 0;}
 *  */
    @Test
    public void testSizeIsEmpty_ObjectobjectLengthNotEqualsZero() {
        java.lang.Object[] objectArray = {null};
        
        boolean actual = CollectionUtils.sizeIsEmpty(objectArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sizeIsEmpty(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#sizeIsEmpty(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof Collection): False}
 * @utbot.executesCondition {@code (object instanceof Map): False}
 * @utbot.executesCondition {@code (object instanceof Object[]): False}
 * @utbot.executesCondition {@code (object instanceof Iterator): False}
 * @utbot.executesCondition {@code (object instanceof Enumeration): False}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: object == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_ThrowIllegalArgumentException() {
        CollectionUtils.sizeIsEmpty(null);
    }
    ///endregion
    
    ///region Errors report for sizeIsEmpty
    
    public void testSizeIsEmpty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.selectRejected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method selectRejected(java.util.Collection, org.apache.commons.collections.Predicate, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
 * @utbot.executesCondition {@code (inputCollection != null): True}
 * @utbot.executesCondition {@code (predicate != null): False}
 *  */
    @Test
    public void testSelectRejected_PredicateEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.selectRejected(arrayList, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate,java.util.Collection)}
 * @utbot.executesCondition {@code (inputCollection != null): False}
 *  */
    @Test
    public void testSelectRejected_InputCollectionEqualsNull() {
        CollectionUtils.selectRejected(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.selectRejected
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method selectRejected(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ArrayList answer = new ArrayList(inputCollection.size());
 *  */
    @Test
    public void testSelectRejected_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.selectRejected] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.selectRejected(CollectionUtils.java:535) */
        CollectionUtils.selectRejected(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method selectRejected(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#selectRejected(java.util.Collection,org.apache.commons.collections.Predicate)}
     */
    @Test
    public void testSelectRejected() {
        Collection collection = emptyList();
        
        ArrayList actual = ((ArrayList) CollectionUtils.selectRejected(collection, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isSubCollection
    
    ///region FUZZER: ERROR SUITE for method isSubCollection(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isSubCollection(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testIsSubCollectionThrowsNPE() {
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.isSubCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229)
            org.apache.commons.collections.CollectionUtils.isSubCollection(CollectionUtils.java:255) */
        CollectionUtils.isSubCollection(collection, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.forAllDo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forAllDo(java.util.Collection, org.apache.commons.collections.Closure)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)}
 * @utbot.executesCondition {@code (collection != null): True}
 * @utbot.executesCondition {@code (closure != null): False}
 *  */
    @Test
    public void testForAllDo_ClosureEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.forAllDo(arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#forAllDo(java.util.Collection,org.apache.commons.collections.Closure)}
 * @utbot.executesCondition {@code (collection != null): False}
 *  */
    @Test
    public void testForAllDo_CollectionEqualsNull() {
        CollectionUtils.forAllDo(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.getCardinalityMap
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCardinalityMap(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = coll.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testGetCardinalityMap_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.getCardinalityMap] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.getCardinalityMap(CollectionUtils.java:229) */
        CollectionUtils.getCardinalityMap(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCardinalityMap(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.CollectionUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#getCardinalityMap(java.util.Collection)}
     */
    @Test
    public void testGetCardinalityMap() {
        Collection collection = emptyList();
        
        HashMap actual = ((HashMap) CollectionUtils.getCardinalityMap(collection));
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.typedCollection
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method typedCollection(java.util.Collection, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTypedCollection_ThrowIllegalArgumentException_1() {
        Class class1 = Object.class;
        
        CollectionUtils.typedCollection(null, class1);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TypedCollection.decorate(collection, type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTypedCollection_ThrowIllegalArgumentException() {
        CollectionUtils.typedCollection(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.predicatedCollection
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method predicatedCollection(java.util.Collection, org.apache.commons.collections.Predicate)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return PredicatedCollection.decorate(collection, predicate);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPredicatedCollection_ThrowIllegalArgumentException() {
        ArrayList arrayList = new ArrayList();
        
        CollectionUtils.predicatedCollection(arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#predicatedCollection(java.util.Collection,org.apache.commons.collections.Predicate)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPredicatedCollection_ThrowIllegalArgumentException_1() {
        CollectionUtils.predicatedCollection(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.transformedCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transformedCollection(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.invokes {@link org.apache.commons.collections.collection.TransformedCollection#decorate(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.returnsFrom {@code return TransformedCollection.decorate(collection, transformer);}
 *  */
    @Test
    public void testTransformedCollection_TransformedCollectionDecorate() throws Exception  {
        ArrayList arrayList = new ArrayList();
        ChainedTransformer chainedTransformer = new ChainedTransformer(null);
        
        TransformedCollection actual = ((TransformedCollection) CollectionUtils.transformedCollection(arrayList, chainedTransformer));
        
        TransformedCollection expected = ((TransformedCollection) createInstance("org.apache.commons.collections.collection.TransformedCollection"));
        ChainedTransformer transformer = ((ChainedTransformer) createInstance("org.apache.commons.collections.functors.ChainedTransformer"));
        setField(expected, "org.apache.commons.collections.collection.TransformedCollection", "transformer", transformer);
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Transformer expectedTransformer = ((Transformer) getFieldValue(expected, "org.apache.commons.collections.collection.TransformedCollection", "transformer"));
        Transformer actualTransformer = ((Transformer) getFieldValue(actual, "org.apache.commons.collections.collection.TransformedCollection", "transformer"));
        org.apache.commons.collections.Transformer[] actualTransformerITransformers = ((org.apache.commons.collections.Transformer[]) getFieldValue(actualTransformer, "org.apache.commons.collections.functors.ChainedTransformer", "iTransformers"));
        assertNull(actualTransformerITransformers);
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformedCollection(java.util.Collection, org.apache.commons.collections.Transformer)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTransformedCollection_ThrowIllegalArgumentException() {
        CollectionUtils.transformedCollection(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return TransformedCollection.decorate(collection, transformer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTransformedCollection_ThrowIllegalArgumentException_1() {
        HashSet hashSet = new HashSet();
        
        CollectionUtils.transformedCollection(hashSet, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.CollectionUtils.isProperSubCollection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isProperSubCollection(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (a.size() < b.size()) && CollectionUtils.isSubCollection(a, b);
 *  */
    @Test
    public void testIsProperSubCollection_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.isProperSubCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.isProperSubCollection(CollectionUtils.java:288) */
        CollectionUtils.isProperSubCollection(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (a.size() < b.size()) && CollectionUtils.isSubCollection(a, b);
 *  */
    @Test
    public void testIsProperSubCollection_ThrowNullPointerException() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections.CollectionUtils.isProperSubCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.CollectionUtils.isProperSubCollection(CollectionUtils.java:288) */
        CollectionUtils.isProperSubCollection(arrayList, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields955646894639200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields955646894639200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass955646894648700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields955646894639200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass955646894648700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields955646895064100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields955646895064100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass955646895067200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields955646895064100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass955646895067200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

