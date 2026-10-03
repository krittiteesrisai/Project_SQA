package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.bag.HashBag;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive test class for UnmodifiableBoundedCollection targeting high branch coverage
 * and edge cases aligned with Defects4J requirements.
 */
public class UnmodifiableBoundedCollectionTest {

    // Helper stub for testing unhandled / non-bounded collections in factory
    private static class DummyCollection<E> extends ArrayList<E> {
        private static final long serialVersionUID = 1L;
    }

    // Helper stub for testing deep decoration unwrap limits or custom abstract decorators
    private static class DummyAbstractDecorator<E> extends AbstractCollectionDecorator<E> {
        private static final long serialVersionUID = 1L;
        protected DummyAbstractDecorator(Collection<E> coll) {
            super(coll);
        }
    }

    @Test
    public void testFactoryWithDirectBoundedCollection() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        assertNotNull(unmodifiable);
        assertTrue(unmodifiable instanceof UnmodifiableBoundedCollection);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryWithNullDirectBoundedCollection() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryWithNullCollection() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryWithNonBoundedCollection() {
        Collection<String> normalColl = new ArrayList<String>();
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(normalColl);
    }

    @Test
    public void testFactoryWithAbstractCollectionDecorator() {
        BoundedCollection<String> bag = new HashBag<String>();
        AbstractCollectionDecorator<String> decorator = new DummyAbstractDecorator<String>(bag);
        
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorator);
        assertNotNull(unmodifiable);
        assertTrue(unmodifiable instanceof UnmodifiableBoundedCollection);
    }

    @Test
    public void testFactoryWithSynchronizedCollectionAndNesting() {
        BoundedCollection<String> bag = new HashBag<String>();
        // Wrap in AbstractCollectionDecorator, then SynchronizedCollection, then AbstractCollectionDecorator
        Collection<String> nested = new DummyAbstractDecorator<String>(
            new SynchronizedCollection<String>(
                new DummyAbstractDecorator<String>(bag)
            )
        );

        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(nested);
        assertNotNull(unmodifiable);
        assertTrue(unmodifiable instanceof UnmodifiableBoundedCollection);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        unmodifiable.add("test");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAllUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        Collection<String> c = new ArrayList<String>();
        c.add("test");
        unmodifiable.addAll(c);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClearUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        unmodifiable.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        unmodifiable.remove("test");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAllUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        Collection<String> c = new ArrayList<String>();
        unmodifiable.removeAll(c);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAllUnsupported() {
        BoundedCollection<String> bag = new HashBag<String>();
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);
        Collection<String> c = new ArrayList<String>();
        unmodifiable.retainAll(c);
    }

    @Test
    public void testBoundedPropertiesAndDelegation() {
        HashBag<String> bag = new HashBag<String>();
        bag.add("A");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);

        // HashBag max size defaults to Integer.MAX_VALUE or defined capacity
        assertEquals(bag.maxSize(), unmodifiable.maxSize());
        assertEquals(bag.isFull(), unmodifiable.isFull());
    }

    @Test
    public void testIteratorUnmodifiable() {
        HashBag<String> bag = new HashBag<String>();
        bag.add("Item1");
        BoundedCollection<String> unmodifiable = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(bag);

        Iterator<String> it = unmodifiable.iterator();
        assertTrue(it.hasNext());
        assertEquals("Item1", it.next());

        try {
            it.remove();
            fail("Expected UnsupportedOperationException from iterator.remove()");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}