package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class MultiKeyTest {

    @Test
    public void testConstructor2Keys() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testConstructor3Keys() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testConstructor4Keys() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
        assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testConstructor5Keys() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
        assertEquals("D", mk.getKey(3));
        assertEquals("E", mk.getKey(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorArrayNullThrowsException() {
        new MultiKey<String>(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorArrayBooleanNullThrowsException() {
        String[] keys = null;
        new MultiKey<String>(keys, true);
    }

    @Test
    public void testConstructorArrayWithClone() {
        String[] keys = new String[] { "X", "Y" };
        MultiKey<String> mk = new MultiKey<String>(keys, true);
        assertEquals(2, mk.size());
        // Modify original array to ensure it was cloned
        keys[0] = "Z";
        assertEquals("X", mk.getKey(0));
    }

    @Test
    public void testConstructorArrayWithoutClone() {
        String[] keys = new String[] { "X", "Y" };
        MultiKey<String> mk = new MultiKey<String>(keys, false);
        assertEquals(2, mk.size());
        // Note: Contract states array shouldn't be modified if not cloned, 
        // but this verifies the branch where makeClone is false.
        assertEquals("X", mk.getKey(0));
    }

    @Test
    public void testGetKeysCloned() {
        String[] keys = new String[] { "1", "2" };
        MultiKey<String> mk = new MultiKey<String>(keys);
        String[] retrievedKeys = mk.getKeys();
        assertNotSame(keys, retrievedKeys);
        assertArrayEquals(keys, retrievedKeys);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetKeyOutOfBounds() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        mk.getKey(5);
    }

    @Test
    public void testEqualsAndHashCode() {
        MultiKey<String> mk1 = new MultiKey<String>("A", "B");
        MultiKey<String> mk2 = new MultiKey<String>("A", "B");
        MultiKey<String> mk3 = new MultiKey<String>("A", "C");
        MultiKey<String> mk4 = new MultiKey<String>("A", "B", "C");

        // Reflexive & Identity
        assertTrue(mk1.equals(mk1));
        
        // Logical Equality
        assertTrue(mk1.equals(mk2));
        assertEquals(mk1.hashCode(), mk2.hashCode());

        // Inequality cases
        assertFalse(mk1.equals(mk3));
        assertFalse(mk1.equals(mk4));
        assertFalse(mk1.equals(null));
        assertFalse(mk1.equals("NotA-MultiKey"));
    }

    @Test
    public void testHashCodeWithNullKeys() {
        // Covers branch where key == null inside calculateHashCode loop
        MultiKey<String> mkNull = new MultiKey<String>(new String[] { null, "A", null }, true);
        MultiKey<String> mkNull2 = new MultiKey<String>(new String[] { null, "A", null }, true);
        
        assertEquals(mkNull, mkNull2);
        assertEquals(mkNull.hashCode(), mkNull2.hashCode());
    }

    @Test
    public void testToString() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertEquals("MultiKey[A, B]", mk.toString());
    }

    @Test
    public void testSerializationAndReadResolve() throws Exception {
        MultiKey<String> original = new MultiKey<String>("Test1", "Test2");
        
        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        MultiKey<String> deserialized = (MultiKey<String>) ois.readObject();
        ois.close();

        assertEquals(original, deserialized);
        assertEquals(original.hashCode(), deserialized.hashCode());
    }
}