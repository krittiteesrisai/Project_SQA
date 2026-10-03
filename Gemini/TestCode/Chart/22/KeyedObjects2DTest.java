package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive test suite for KeyedObjects2D targeting high branch and condition coverage.
 */
public class KeyedObjects2DTest {

    @Test
    public void testConstructorAndInitialState() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        assertEquals(0, ko2d.getRowCount());
        assertEquals(0, ko2d.getColumnCount());
        assertNotNull(ko2d.getRowKeys());
        assertNotNull(ko2d.getColumnKeys());
    }

    @Test
    public void testAddAndGetObjectByIndex() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");

        assertEquals(1, ko2d.getRowCount());
        assertEquals(1, ko2d.getColumnCount());
        assertEquals("Val1", ko2d.getObject(0, 0));
        assertEquals("R1", ko2d.getRowKey(0));
        assertEquals("C1", ko2d.getColumnKey(0));
        assertEquals(0, ko2d.getRowIndex("R1"));
        assertEquals(0, ko2d.getColumnIndex("C1"));
    }

    @Test
    public void testGetRowAndColumnIndexNotFound() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        assertEquals(-1, ko2d.getRowIndex("NON_EXISTENT"));
        assertEquals(-1, ko2d.getColumnIndex("NON_EXISTENT"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByNullRowKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.getObject(null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByNullColumnKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.getObject("R1", null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByUnknownRowKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.getObject("UNKNOWN_ROW", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByUnknownColumnKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.getObject("R1", "UNKNOWN_COL");
    }

    @Test
    public void testGetObjectByKeysValid() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        assertEquals("Val1", ko2d.getObject("R1", "C1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectNullRowKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.setObject("Val", null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectNullColumnKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.setObject("Val", "R1", null);
    }

    @Test
    public void testSetObjectExistingRowAndColumn() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.setObject("Val1", "R1", "C1");
        ko2d.setObject("Val2", "R1", "C1"); // Update existing
        assertEquals("Val2", ko2d.getObject("R1", "C1"));
        assertEquals(1, ko2d.getRowCount());
        assertEquals(1, ko2d.getColumnCount());
    }

    @Test
    public void testRemoveObject() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.removeObject("R1", "C1");
        // Since row becomes empty, row should be removed automatically
        assertEquals(0, ko2d.getRowCount());
    }

    @Test
    public void testRemoveRowByIndex() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.removeRow(0);
        assertEquals(0, ko2d.getRowCount());
    }

    @Test
    public void testRemoveRowByKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.removeRow("R1");
        assertEquals(0, ko2d.getRowCount());
    }

    @Test
    public void testRemoveColumnByIndex() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.removeColumn(0);
        assertEquals(0, ko2d.getColumnCount());
    }

    @Test
    public void testRemoveColumnByKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.addObject("Val1", "R1", "C1");
        ko2d.removeColumn("C1");
        assertEquals(0, ko2d.getColumnCount());
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveColumnUnknownKey() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.removeColumn("UNKNOWN_COL");
    }

    @Test
    public void testEqualsAndHashCode() {
        KeyedObjects2D ko1 = new KeyedObjects2D();
        KeyedObjects2D ko2 = new KeyedObjects2D();

        assertTrue(ko1.equals(ko1)); // Self
        assertFalse(ko1.equals(null)); // Null
        assertFalse(ko1.equals("SomeString")); // Different class

        assertTrue(ko1.equals(ko2));
        assertEquals(ko1.hashCode(), ko2.hashCode());

        ko1.addObject("V1", "R1", "C1");
        assertFalse(ko1.equals(ko2));

        ko2.addObject("V1", "R1", "C1");
        assertTrue(ko1.equals(ko2));
        assertEquals(ko1.hashCode(), ko2.hashCode());

        // Different column keys
        KeyedObjects2D ko3 = new KeyedObjects2D();
        ko3.addObject("V1", "R1", "C2");
        assertFalse(ko1.equals(ko3));

        // Different row counts / values with null checks
        KeyedObjects2D ko4 = new KeyedObjects2D();
        ko4.addObject(null, "R1", "C1");
        assertFalse(ko1.equals(ko4));
        assertFalse(ko4.equals(ko1));
        
        KeyedObjects2D ko5 = new KeyedObjects2D();
        ko5.addObject(null, "R1", "C1");
        assertTrue(ko4.equals(ko5));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        KeyedObjects2D ko1 = new KeyedObjects2D();
        ko1.addObject("Val1", "R1", "C1");

        KeyedObjects2D clone = (KeyedObjects2D) ko1.clone();
        assertNotSame(ko1, clone);
        assertEquals(ko1, clone);
        assertEquals("Val1", clone.getObject("R1", "C1"));
    }
}