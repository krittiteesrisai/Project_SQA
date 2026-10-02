package org.apache.commons.collections.keyvalue;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link MultiKey}.
 * Target: Defects4J Collections-11b
 */
public class MultiKeyTest {

    // ---------------------------------------------------------------
    // Constructor: two keys
    // ---------------------------------------------------------------
    @Test
    public void testTwoArgConstructor() {
        MultiKey mk = new MultiKey("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testTwoArgConstructorWithNulls() {
        MultiKey mk = new MultiKey(null, null);
        assertEquals(2, mk.size());
        assertNull(mk.getKey(0));
        assertNull(mk.getKey(1));
        // both null -> total stays 0 (loop branch: keys[i] != null == false both times)
        assertEquals(0, mk.hashCode());
    }

    // ---------------------------------------------------------------
    // Constructor: three keys
    // ---------------------------------------------------------------
    @Test
    public void testThreeArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("C", mk.getKey(2));
    }

    // ---------------------------------------------------------------
    // Constructor: four keys
    // ---------------------------------------------------------------
    @Test
    public void testFourArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("D", mk.getKey(3));
    }

    // ---------------------------------------------------------------
    // Constructor: five keys
    // ---------------------------------------------------------------
    @Test
    public void testFiveArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("E", mk.getKey(4));
    }

    // ---------------------------------------------------------------
    // Constructor: array (clones by default -> makeClone == true branch)
    // ---------------------------------------------------------------
    @Test
    public void testArrayConstructorClonesArray() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys);
        // mutate original array after construction
        keys[0] = "CHANGED";
        // Because array was cloned, MultiKey internal state must be unaffected
        assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullThrows() {
        new MultiKey((Object[]) null);
    }

    // ---------------------------------------------------------------
    // Constructor: array + boolean makeClone
    // ---------------------------------------------------------------
    @Test
    public void testArrayBooleanConstructorMakeCloneTrue() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, true);
        keys[0] = "CHANGED";
        assertEquals("A", mk.getKey(0)); // unaffected because cloned
    }

    @Test
    public void testArrayBooleanConstructorMakeCloneFalse() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, false);
        keys[0] = "CHANGED";
        // Not cloned -> internal array is same reference, so change is reflected
        assertEquals("CHANGED", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructorNullThrowsMakeCloneTrue() {
        new MultiKey((Object[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructorNullThrowsMakeCloneFalse() {
        new MultiKey((Object[]) null, false);
    }

    // ---------------------------------------------------------------
    // getKeys() - returns a clone (does not expose internal array)
    // ---------------------------------------------------------------
    @Test
    public void testGetKeysReturnsClone() {
        MultiKey mk = new MultiKey("A", "B");
        Object[] result = mk.getKeys();
        result[0] = "CHANGED";
        // internal state must remain unaffected because getKeys() clones
        assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testGetKeysContent() {
        MultiKey mk = new MultiKey("A", "B", "C");
        Object[] result = mk.getKeys();
        assertArrayEquals(new Object[] {"A", "B", "C"}, result);
    }

    // ---------------------------------------------------------------
    // getKey(index)
    // ---------------------------------------------------------------
    @Test
    public void testGetKeyValidIndex() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyNegativeIndexThrows() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyTooLargeIndexThrows() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(2); // valid indices are 0,1
    }

    // ---------------------------------------------------------------
    // size()
    // ---------------------------------------------------------------
    @Test
    public void testSizeForVariousConstructors() {
        assertEquals(2, new MultiKey("A", "B").size());
        assertEquals(3, new MultiKey("A", "B", "C").size());
        assertEquals(4, new MultiKey("A", "B", "C", "D").size());
        assertEquals(5, new MultiKey("A", "B", "C", "D", "E").size());
        assertEquals(1, new MultiKey(new Object[] {"A"}).size());
        assertEquals(0, new MultiKey(new Object[] {}).size());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------
    @Test
    public void testEqualsSameInstance() {
        MultiKey mk = new MultiKey("A", "B");
        assertTrue(mk.equals(mk)); // other == this branch
    }

    @Test
    public void testEqualsNull() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals(null)); // not instanceof branch
    }

    @Test
    public void testEqualsDifferentType() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals("Not a MultiKey")); // not instanceof branch
    }

    @Test
    public void testEqualsSameKeysEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEqualsDifferentKeysNotEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsDifferentLengthNotEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsWithNullElementsInsideKeys() {
        MultiKey mk1 = new MultiKey(null, "B");
        MultiKey mk2 = new MultiKey(null, "B");
        assertTrue(mk1.equals(mk2));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------
    @Test
    public void testHashCodeConsistentAcrossCalls() {
        MultiKey mk = new MultiKey("A", "B");
        int h1 = mk.hashCode();
        int h2 = mk.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCodeEqualForEqualObjects() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeComputationWithNoNulls() {
        MultiKey mk = new MultiKey("A", "B");
        int expected = "A".hashCode() ^ "B".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeComputationWithSomeNulls() {
        MultiKey mk = new MultiKey("A", null);
        int expected = "A".hashCode(); // null contributes 0 (skip branch)
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeComputationAllNulls() {
        MultiKey mk = new MultiKey(new Object[] {null, null, null});
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCodeEmptyArray() {
        // Loop does not execute at all -> total stays 0
        MultiKey mk = new MultiKey(new Object[] {});
        assertEquals(0, mk.hashCode());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------
    @Test
    public void testToStringContainsPrefixAndKeys() {
        MultiKey mk = new MultiKey("A", "B");
        String s = mk.toString();
        assertTrue(s.startsWith("MultiKey"));
        assertTrue(s.contains("A"));
        assertTrue(s.contains("B"));
    }

    @Test
    public void testToStringWithNullKey() {
        MultiKey mk = new MultiKey((Object) null, (Object) null);
        String s = mk.toString();
        assertTrue(s.startsWith("MultiKey"));
        // Arrays.asList(...).toString() typically renders null as "null"
        assertTrue(s.contains("null"));
    }
}
