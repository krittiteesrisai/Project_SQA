package org.apache.commons.collections4.collection;

import org.junit.Test;
import org.apache.commons.collections4.list.FixedSizeList;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.HashSet;
import java.util.ArrayList;
import org.apache.commons.collections4.BoundedCollection;
import java.util.Collection;
import java.lang.reflect.Method;
import org.apache.commons.collections4.list.PredicatedList;
import org.apache.commons.collections4.set.PredicatedSortedSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.apache.commons.collections4.set.PredicatedSet;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.apache.commons.collections4.set.TransformedSet;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedBag;
import org.apache.commons.collections4.list.GrowthList;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections4_collection_UnmodifiableBoundedCollectionTest {
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFull()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#isFull()}
 * @utbot.returnsFrom {@code return decorated().isFull();}
 *  */
    @Test
    public void testIsFull_ReturnDecoratedIsFull() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        FixedSizeList collection = ((FixedSizeList) createInstance("org.apache.commons.collections4.list.FixedSizeList"));
        unmodifiableBoundedCollection.setCollection(collection);
        
        boolean actual = unmodifiableBoundedCollection.isFull();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#isFull()}
 * @utbot.returnsFrom {@code return decorated().isFull();}
 *  */
    @Test
    public void testIsFull_ReturnDecoratedIsFull_1() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        CircularFifoQueue collection = ((CircularFifoQueue) createInstance("org.apache.commons.collections4.queue.CircularFifoQueue"));
        unmodifiableBoundedCollection.setCollection(collection);
        
        boolean actual = unmodifiableBoundedCollection.isFull();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFull()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#isFull()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return decorated().isFull();
 *  */
    @Test
    public void testIsFull_ThrowClassCastException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        HashSet collection = new HashSet();
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class org.apache.commons.collections4.BoundedCollection (java.util.HashSet is in module java.base of loader 'bootstrap'; org.apache.commons.collections4.BoundedCollection is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated(UnmodifiableBoundedCollection.java:155)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull(UnmodifiableBoundedCollection.java:146) */
        unmodifiableBoundedCollection.isFull();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#isFull()}
 * @utbot.invokes {@link org.apache.commons.collections4.BoundedCollection#isFull()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return decorated().isFull();
 *  */
    @Test
    public void testIsFull_ThrowClassCastException_1() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        UnmodifiableBoundedCollection collection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        HashSet collection1 = new HashSet();
        collection.setCollection(collection1);
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class org.apache.commons.collections4.BoundedCollection (java.util.HashSet is in module java.base of loader 'bootstrap'; org.apache.commons.collections4.BoundedCollection is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated(UnmodifiableBoundedCollection.java:155)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull(UnmodifiableBoundedCollection.java:146)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull(UnmodifiableBoundedCollection.java:146) */
        unmodifiableBoundedCollection.isFull();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#isFull()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return decorated().isFull();
 *  */
    @Test
    public void testIsFull_ThrowNullPointerException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull(UnmodifiableBoundedCollection.java:146) */
        unmodifiableBoundedCollection.isFull();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.remove(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.clear
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#clear()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testClear_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return UnmodifiableIterator.unmodifiableIterator(decorated().iterator());
 *  */
    @Test
    public void testIterator_ThrowClassCastException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        ArrayList collection = new ArrayList();
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class org.apache.commons.collections4.BoundedCollection (java.util.ArrayList is in module java.base of loader 'bootstrap'; org.apache.commons.collections4.BoundedCollection is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated(UnmodifiableBoundedCollection.java:155)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator(UnmodifiableBoundedCollection.java:111) */
        unmodifiableBoundedCollection.iterator();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#iterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.BoundedCollection#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return UnmodifiableIterator.unmodifiableIterator(decorated().iterator());
 *  */
    @Test
    public void testIterator_ThrowClassCastException_1() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        FixedSizeList collection = ((FixedSizeList) createInstance("org.apache.commons.collections4.list.FixedSizeList"));
        HashSet collection1 = new HashSet();
        collection.setCollection(collection1);
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.FixedSizeList.iterator(FixedSizeList.java:108)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator(UnmodifiableBoundedCollection.java:111) */
        unmodifiableBoundedCollection.iterator();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return UnmodifiableIterator.unmodifiableIterator(decorated().iterator());
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator(UnmodifiableBoundedCollection.java:111) */
        unmodifiableBoundedCollection.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.addAll
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#addAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.addAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.removeAll
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#removeAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.removeAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.retainAll
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAll_ThrowUnsupportedOperationException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        unmodifiableBoundedCollection.retainAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maxSize()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.returnsFrom {@code return decorated().maxSize();}
 *  */
    @Test
    public void testMaxSize_ReturnDecoratedMaxSize() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        CircularFifoQueue collection = ((CircularFifoQueue) createInstance("org.apache.commons.collections4.queue.CircularFifoQueue"));
        unmodifiableBoundedCollection.setCollection(collection);
        
        int actual = unmodifiableBoundedCollection.maxSize();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.returnsFrom {@code return decorated().maxSize();}
 *  */
    @Test
    public void testMaxSize_ReturnDecoratedMaxSize_2() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        UnmodifiableBoundedCollection collection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        CircularFifoQueue collection1 = ((CircularFifoQueue) createInstance("org.apache.commons.collections4.queue.CircularFifoQueue"));
        collection.setCollection(collection1);
        unmodifiableBoundedCollection.setCollection(collection);
        
        int actual = unmodifiableBoundedCollection.maxSize();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.returnsFrom {@code return decorated().maxSize();}
 *  */
    @Test
    public void testMaxSize_ReturnDecoratedMaxSize_1() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        FixedSizeList collection = ((FixedSizeList) createInstance("org.apache.commons.collections4.list.FixedSizeList"));
        ArrayList collection1 = new ArrayList();
        collection1.add(null);
        collection1.add(null);
        collection1.add(null);
        collection.setCollection(collection1);
        unmodifiableBoundedCollection.setCollection(collection);
        
        int actual = unmodifiableBoundedCollection.maxSize();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maxSize()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return decorated().maxSize();
 *  */
    @Test
    public void testMaxSize_ThrowClassCastException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        ArrayList collection = new ArrayList();
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class org.apache.commons.collections4.BoundedCollection (java.util.ArrayList is in module java.base of loader 'bootstrap'; org.apache.commons.collections4.BoundedCollection is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated(UnmodifiableBoundedCollection.java:155)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize(UnmodifiableBoundedCollection.java:150) */
        unmodifiableBoundedCollection.maxSize();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.invokes {@link org.apache.commons.collections4.BoundedCollection#maxSize()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return decorated().maxSize();
 *  */
    @Test
    public void testMaxSize_ThrowClassCastException_1() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        FixedSizeList collection = ((FixedSizeList) createInstance("org.apache.commons.collections4.list.FixedSizeList"));
        HashSet collection1 = new HashSet();
        collection.setCollection(collection1);
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.size(AbstractCollectionDecorator.java:124)
            org.apache.commons.collections4.list.FixedSizeList.maxSize(FixedSizeList.java:179)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize(UnmodifiableBoundedCollection.java:150) */
        unmodifiableBoundedCollection.maxSize();
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#maxSize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return decorated().maxSize();
 *  */
    @Test
    public void testMaxSize_ThrowNullPointerException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize(UnmodifiableBoundedCollection.java:150) */
        unmodifiableBoundedCollection.maxSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decorated()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#decorated()}
 * @utbot.invokes {@link org.apache.commons.collections4.collection.AbstractCollectionDecorator#decorated()}
 * @utbot.returnsFrom {@code return (BoundedCollection<E>) super.decorated();}
 *  */
    @Test
    public void testDecorated_AbstractCollectionDecoratorDecorated() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        
        BoundedCollection actual = unmodifiableBoundedCollection.decorated();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decorated()
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#decorated()}
 * @utbot.invokes {@link org.apache.commons.collections4.collection.AbstractCollectionDecorator#decorated()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (BoundedCollection<E>) super.decorated();
 *  */
    @Test
    public void testDecorated_ThrowClassCastException() throws Exception  {
        UnmodifiableBoundedCollection unmodifiableBoundedCollection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        HashSet collection = new HashSet();
        unmodifiableBoundedCollection.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class org.apache.commons.collections4.BoundedCollection (java.util.HashSet is in module java.base of loader 'bootstrap'; org.apache.commons.collections4.BoundedCollection is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated(UnmodifiableBoundedCollection.java:155) */
        unmodifiableBoundedCollection.decorated();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unmodifiableBoundedCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} once
 * @utbot.returnsFrom {@code return new UnmodifiableBoundedCollection<E>((BoundedCollection<E>) coll);}
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_IterateForLoop() throws Exception  {
        CircularFifoQueue circularFifoQueue = ((CircularFifoQueue) createInstance("org.apache.commons.collections4.queue.CircularFifoQueue"));
        
        UnmodifiableBoundedCollection actual = ((UnmodifiableBoundedCollection) UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((Collection) circularFifoQueue)));
        
        UnmodifiableBoundedCollection expected = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        expected.setCollection(circularFifoQueue);
        
        // org.apache.commons.collections4.collection.UnmodifiableBoundedCollection is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} twice
 * @utbot.returnsFrom {@code return new UnmodifiableBoundedCollection<E>((BoundedCollection<E>) coll);}
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_CollInstanceOfSynchronizedCollection() throws Exception  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        UnmodifiableBoundedCollection collection = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        UnmodifiableBoundedCollection actual = ((UnmodifiableBoundedCollection) unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments));
        
        UnmodifiableBoundedCollection expected = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        expected.setCollection(collection);
        
        // org.apache.commons.collections4.collection.UnmodifiableBoundedCollection is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableBoundedCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: coll == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_ThrowIllegalArgumentException() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((Collection) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unmodifiableBoundedCollection(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = ((AbstractCollectionDecorator<E>) coll).decorated();
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_ThrowClassCastException() throws Exception  {
        PredicatedList predicatedList = ((PredicatedList) createInstance("org.apache.commons.collections4.list.PredicatedList"));
        HashSet collection = new HashSet();
        predicatedList.setCollection(collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.PredicatedList.decorated(PredicatedList.java:89)
            org.apache.commons.collections4.list.PredicatedList.decorated(PredicatedList.java:43)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(UnmodifiableBoundedCollection.java:85) */
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicatedList);
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} twice
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = ((AbstractCollectionDecorator<E>) coll).decorated();
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_ThrowClassCastException_1() throws Throwable  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedSortedSet collection = ((PredicatedSortedSet) createInstance("org.apache.commons.collections4.set.PredicatedSortedSet"));
        LinkedHashSet collection1 = new LinkedHashSet();
        collection.setCollection(collection1);
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection] produces [java.lang.ClassCastException: class java.util.LinkedHashSet cannot be cast to class java.util.SortedSet (java.util.LinkedHashSet and java.util.SortedSet are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.set.PredicatedSortedSet.decorated(PredicatedSortedSet.java:87)
            org.apache.commons.collections4.set.PredicatedSortedSet.decorated(PredicatedSortedSet.java:40)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(UnmodifiableBoundedCollection.java:85) */
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} twice
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = ((AbstractCollectionDecorator<E>) coll).decorated();
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_ThrowClassCastException_2() throws Throwable  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedSortedSet collection = ((PredicatedSortedSet) createInstance("org.apache.commons.collections4.set.PredicatedSortedSet"));
        LinkedList collection1 = new LinkedList();
        collection.setCollection(collection1);
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection] produces [java.lang.ClassCastException: class java.util.LinkedList cannot be cast to class java.util.Set (java.util.LinkedList and java.util.Set are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.set.PredicatedSet.decorated(PredicatedSet.java:86)
            org.apache.commons.collections4.set.PredicatedSortedSet.decorated(PredicatedSortedSet.java:87)
            org.apache.commons.collections4.set.PredicatedSortedSet.decorated(PredicatedSortedSet.java:40)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(UnmodifiableBoundedCollection.java:85) */
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < 1000; i++)} 4 times
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = ((AbstractCollectionDecorator<E>) coll).decorated();
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_ThrowClassCastException_3() throws Throwable  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection1 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedSet collection2 = ((PredicatedSet) createInstance("org.apache.commons.collections4.set.PredicatedSet"));
        ArrayList collection3 = new ArrayList();
        collection2.setCollection(collection3);
        setField(collection1, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection2);
        setField(collection, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection1);
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.util.Set (java.util.ArrayList and java.util.Set are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.set.PredicatedSet.decorated(PredicatedSet.java:86)
            org.apache.commons.collections4.set.PredicatedSet.decorated(PredicatedSet.java:40)
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(UnmodifiableBoundedCollection.java:85) */
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableBoundedCollection(java.util.Collection)
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection1() throws Throwable  {
        Object emptyNavigableSet = createInstance("java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet");
        
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class emptyNavigableSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", emptyNavigableSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = emptyNavigableSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection2() throws Throwable  {
        UnmodifiableList unmodifiableList = ((UnmodifiableList) createInstance("org.apache.commons.collections4.list.UnmodifiableList"));
        
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class unmodifiableListType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", unmodifiableListType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = unmodifiableList;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection3() throws Exception  {
        TransformedSet transformedSet = ((TransformedSet) createInstance("org.apache.commons.collections4.set.TransformedSet"));
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(transformedSet);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection4() throws Exception  {
        PredicatedSet predicatedSet = ((PredicatedSet) createInstance("org.apache.commons.collections4.set.PredicatedSet"));
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicatedSet);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection5() throws Exception  {
        SynchronizedSortedBag synchronizedSortedBag = ((SynchronizedSortedBag) createInstance("org.apache.commons.collections4.bag.SynchronizedSortedBag"));
        IndexedCollection collection = ((IndexedCollection) createInstance("org.apache.commons.collections4.collection.IndexedCollection"));
        setField(synchronizedSortedBag, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synchronizedSortedBag);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection6() throws Exception  {
        PredicatedSortedSet predicatedSortedSet = ((PredicatedSortedSet) createInstance("org.apache.commons.collections4.set.PredicatedSortedSet"));
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicatedSortedSet);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection7() throws Exception  {
        PredicatedList predicatedList = ((PredicatedList) createInstance("org.apache.commons.collections4.list.PredicatedList"));
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(predicatedList);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection8() throws Exception  {
        SynchronizedSortedBag synchronizedSortedBag = ((SynchronizedSortedBag) createInstance("org.apache.commons.collections4.bag.SynchronizedSortedBag"));
        Object collection = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection1 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection2 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedSet collection3 = ((PredicatedSet) createInstance("org.apache.commons.collections4.set.PredicatedSet"));
        setField(collection2, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection3);
        setField(collection1, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection2);
        setField(collection, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection1);
        setField(synchronizedSortedBag, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synchronizedSortedBag);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection9() throws Throwable  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection1 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection2 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedList collection3 = ((PredicatedList) createInstance("org.apache.commons.collections4.list.PredicatedList"));
        setField(collection2, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection3);
        setField(collection1, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection2);
        setField(collection, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection1);
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection10() throws Throwable  {
        Object synchronizedBagSet = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection1 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection2 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        PredicatedSortedSet collection3 = ((PredicatedSortedSet) createInstance("org.apache.commons.collections4.set.PredicatedSortedSet"));
        setField(collection2, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection3);
        setField(collection1, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection2);
        setField(collection, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection1);
        setField(synchronizedBagSet, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        Class unmodifiableBoundedCollectionClazz = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class synchronizedBagSetType = Class.forName("java.util.Collection");
        Method unmodifiableBoundedCollectionMethod = unmodifiableBoundedCollectionClazz.getDeclaredMethod("unmodifiableBoundedCollection", synchronizedBagSetType);
        unmodifiableBoundedCollectionMethod.setAccessible(true);
        java.lang.Object[] unmodifiableBoundedCollectionMethodArguments = new java.lang.Object[1];
        unmodifiableBoundedCollectionMethodArguments[0] = synchronizedBagSet;
        try {
            unmodifiableBoundedCollectionMethod.invoke(null, unmodifiableBoundedCollectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection11() throws Exception  {
        SynchronizedSortedBag synchronizedSortedBag = ((SynchronizedSortedBag) createInstance("org.apache.commons.collections4.bag.SynchronizedSortedBag"));
        Object collection = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection1 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection2 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection3 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection4 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection5 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection6 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        SynchronizedBag collection7 = ((SynchronizedBag) createInstance("org.apache.commons.collections4.bag.SynchronizedBag"));
        Object collection8 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection9 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        Object collection10 = createInstance("org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet");
        GrowthList collection11 = ((GrowthList) createInstance("org.apache.commons.collections4.list.GrowthList"));
        setField(collection10, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection11);
        setField(collection9, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection10);
        setField(collection8, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection9);
        setField(collection7, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection8);
        setField(collection6, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection7);
        setField(collection5, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection6);
        setField(collection4, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection5);
        setField(collection3, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection4);
        setField(collection2, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection3);
        setField(collection1, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection2);
        setField(collection, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection1);
        setField(synchronizedSortedBag, "org.apache.commons.collections4.collection.SynchronizedCollection", "collection", collection);
        
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synchronizedSortedBag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection)}
 * @utbot.returnsFrom {@code return new UnmodifiableBoundedCollection<E>(coll);}
 *  */
    @Test
    public void testUnmodifiableBoundedCollection_Return() throws Exception  {
        FixedSizeList fixedSizeList = ((FixedSizeList) createInstance("org.apache.commons.collections4.list.FixedSizeList"));
        
        UnmodifiableBoundedCollection actual = ((UnmodifiableBoundedCollection) UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((BoundedCollection) fixedSizeList)));
        
        UnmodifiableBoundedCollection expected = ((UnmodifiableBoundedCollection) createInstance("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        expected.setCollection(fixedSizeList);
        
        // org.apache.commons.collections4.collection.UnmodifiableBoundedCollection is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection)
    
    /**
    @utbot.classUnderTest {@link UnmodifiableBoundedCollection}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.collection.UnmodifiableBoundedCollection#unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new UnmodifiableBoundedCollection<E>(coll);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_ThrowIllegalArgumentException1() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((BoundedCollection) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields958631530277500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields958631530277500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass958631530291600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields958631530277500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass958631530291600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

