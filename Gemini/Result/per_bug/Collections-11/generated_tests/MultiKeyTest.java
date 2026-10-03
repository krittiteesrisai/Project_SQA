package org.apache.commons.collections.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * High-coverage JUnit 4 test suite for MultiKey (Defects4J Collections-11b).
 */
public class MultiKeyTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullArray() {
        new MultiKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullArrayWithBoolean() {
        new MultiKey(null, true);
    }

    @Test
    public void testConstructorWithClone() {
        String[] keys = {"A", "B"};
        MultiKey mk = new MultiKey(keys, true);
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        
        // Modify original array to ensure it was cloned
        keys[0] = "C";
        assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testConstructorWithoutClone() {
        String[] keys = {"A", "B"};
        MultiKey mk = new MultiKey(keys, false);
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testMultiKey2To5Constructors() {
        MultiKey mk2 = new MultiKey("K1", "K2");
        assertEquals(2, mk2.size());

        MultiKey mk3 = new MultiKey("K1", "K2", "K3");
        assertEquals(3, mk3.size());

        MultiKey mk4 = new MultiKey("K1", "K2", "K3", "K4");
        assertEquals(4, mk4.size());

        MultiKey mk5 = new MultiKey("K1", "K2", "K3", "K4", "K5");
        assertEquals(5, mk5.size());
    }

    @Test
    public void testHashCodeWithNullKeys() {
        Object[] keysWithNull = { "A", null, "C" };
        MultiKey mk = new MultiKey(keysWithNull, true);
        // Verify that null key does not throw NullPointerException during hashCode calculation
        assertNotNull(mk);
        assertEquals("A", mk.getKey(0));
        assertNull(mk.getKey(1));
        assertEquals("C", mk.getKey(2));
        
        // Verify consistency of hashCode caching
        int initialHashCode = mk.hashCode();
        assertEquals(initialHashCode, mk.hashCode());
    }

    @Test
    public void testEqualsSelf() {
        MultiKey mk = new MultiKey("A", "B");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEqualsInvalidTypes() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals(null));
        assertFalse(mk.equals("NotAClusterOfMultiKey"));
    }

    @Test
    public void testEqualsEqualAndNotEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        MultiKey mk3 = new MultiKey("A", "C");
        MultiKey mk4 = new MultiKey("A", "B", "C");

        assertTrue(mk1.equals(mk2));
        assertEquals(mk1.hashCode(), mk2.hashCode());

        assertFalse(mk1.equals(mk3));
        assertFalse(mk1.equals(mk4));
    }

    @Test
    public void testAccessorsAndToString() {
        String[] keys = { "Key1", "Key2" };
        MultiKey mk = new MultiKey(keys);

        assertEquals(2, mk.size());
        assertEquals("Key1", mk.getKey(0));
        assertEquals("Key2", mk.getKey(1));

        Object[] retrievedKeys = mk.getKeys();
        assertNotSame(keys, retrievedKeys);
        assertArrayEquals(keys, retrievedKeys);

        String toStringResult = mk.toString();
        assertTrue(toStringResult.contains("MultiKey"));
        assertTrue(toStringResult.contains("Key1"));
        assertTrue(toStringResult.contains("Key2"));
    }
}