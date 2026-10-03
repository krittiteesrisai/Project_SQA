package org.jfree.data;

import org.junit.Before;
import org.junit.Test;
import org.jfree.chart.util.SortOrder;

import java.util.List;

import static org.junit.Assert.*;

public class DefaultKeyedValuesTest {

    private DefaultKeyedValues keyedValues;

    @Before
    public void setUp() {
        keyedValues = new DefaultKeyedValues();
    }

    @Test
    public void testConstructorAndInitialState() {
        assertEquals(0, keyedValues.getItemCount());
        assertTrue(keyedValues.getKeys().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullKey() {
        keyedValues.getIndex(null);
    }

    @Test
    public void testGetIndexNotFound() {
        assertEquals(-1, keyedValues.getIndex("NonExistentKey"));
    }

    @Test
    public void testAddAndGetValues() {
        keyedValues.setValue("Key1", 10.5);
        keyedValues.setValue("Key2", (Number) null);

        assertEquals(2, keyedValues.getItemCount());
        assertEquals(10.5, keyedValues.getValue("Key1").doubleValue(), 0.0001);
        assertNull(keyedValues.getValue("Key2"));
        assertEquals(0, keyedValues.getIndex("Key1"));
        assertEquals(1, keyedValues.getIndex("Key2"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownKey() {
        keyedValues.getValue("MissingKey");
    }

    @Test
    public void testUpdateExistingValue() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.setValue("Key1", 20.0); // Trigger keyIndex >= 0 branch in setValue
        assertEquals(1, keyedValues.getItemCount());
        assertEquals(20.0, keyedValues.getValue("Key1").doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValueOutOfBoundsNegative() {
        keyedValues.insertValue(-1, "Key", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValueOutOfBoundsTooLarge() {
        keyedValues.insertValue(1, "Key", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValueNullKey() {
        keyedValues.insertValue(0, null, 1.0);
    }

    @Test
    public void testInsertValueSamePosition() {
        keyedValues.setValue("Key1", 10.0);
        // pos == position branch
        keyedValues.insertValue(0, "Key1", 15.0);
        assertEquals(1, keyedValues.getItemCount());
        assertEquals(15.0, keyedValues.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testInsertValueNewPositionAndRelocate() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.setValue("Key2", 20.0);
        // Insert existing key "Key1" at position 1 (pos != position and pos >= 0)
        keyedValues.insertValue(1, "Key1", 99.0);
        assertEquals(2, keyedValues.getItemCount());
        assertEquals("Key2", keyedValues.getKey(0));
        assertEquals("Key1", keyedValues.getKey(1));
        assertEquals(99.0, keyedValues.getValue("Key1").doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveValueByIndexWithRebuild() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.setValue("Key2", 20.0);
        keyedValues.setValue("Key3", 30.0);

        // Removes index 0, index < this.keys.size() is true, triggers rebuildIndex
        keyedValues.removeValue(0);
        assertEquals(2, keyedValues.getItemCount());
        assertEquals("Key2", keyedValues.getKey(0));
        assertEquals(1, keyedValues.getIndex("Key3"));
    }

    @Test
    public void testRemoveValueByKeyNotFound() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.removeValue("UnknownKey"); // index < 0 branch returns early
        assertEquals(1, keyedValues.getItemCount());
    }

    @Test
    public void testRemoveValueByKeySuccess() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.removeValue("Key1");
        assertEquals(0, keyedValues.getItemCount());
    }

    @Test
    public void testClear() {
        keyedValues.setValue("Key1", 10.0);
        keyedValues.clear();
        assertEquals(0, keyedValues.getItemCount());
        assertTrue(keyedValues.getKeys().isEmpty());
    }

    @Test
    public void testSortByKeys() {
        keyedValues.setValue("Z", 1.0);
        keyedValues.setValue("A", 2.0);
        keyedValues.sortByKeys(SortOrder.ASCENDING);
        assertEquals("A", keyedValues.getKey(0));
        assertEquals("Z", keyedValues.getKey(1));
    }

    @Test
    public void testSortByValues() {
        keyedValues.setValue("Key1", 50.0);
        keyedValues.setValue("Key2", 10.0);
        keyedValues.setValue("Key3", (Number) null); // null value branch in sorting
        keyedValues.sortByValues(SortOrder.ASCENDING);
        assertEquals("Key2", keyedValues.getKey(0));
        assertEquals("Key1", keyedValues.getKey(1));
        assertEquals("Key3", keyedValues.getKey(2));
    }

    @Test
    public void testEqualsAndHashCode() {
        DefaultKeyedValues kv1 = new DefaultKeyedValues();
        DefaultKeyedValues kv2 = new DefaultKeyedValues();

        assertTrue(kv1.equals(kv1)); // obj == this
        assertFalse(kv1.equals("NotAKeyedValues")); // not instance of KeyedValues

        kv1.setValue("K1", 10.0);
        assertFalse(kv1.equals(kv2)); // different counts

        kv2.setValue("K2", 10.0);
        assertFalse(kv1.equals(kv2)); // different keys

        kv2 = new DefaultKeyedValues();
        kv2.setValue("K1", 20.0);
        assertFalse(kv1.equals(kv2)); // different values (non-null mismatch)

        kv2 = new DefaultKeyedValues();
        kv2.setValue("K1", (Number) null);
        assertFalse(kv1.equals(kv2)); // v1 not null, v2 is null

        DefaultKeyedValues kv3 = new DefaultKeyedValues();
        kv3.setValue("K1", (Number) null);
        DefaultKeyedValues kv4 = new DefaultKeyedValues();
        kv4.setValue("K1", 10.0);
        assertFalse(kv3.equals(kv4)); // v1 is null, v2 not null

        DefaultKeyedValues kv5 = new DefaultKeyedValues();
        kv5.setValue("K1", (Number) null);
        DefaultKeyedValues kv6 = new DefaultKeyedValues();
        kv6.setValue("K1", (Number) null);
        assertTrue(kv5.equals(kv6)); // both null values match

        assertEquals(kv1.hashCode(), kv1.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        keyedValues.setValue("Key1", 10.0);
        DefaultKeyedValues clone = (DefaultKeyedValues) keyedValues.clone();
        
        assertNotSame(keyedValues, clone);
        assertEquals(keyedValues, clone);
    }
}