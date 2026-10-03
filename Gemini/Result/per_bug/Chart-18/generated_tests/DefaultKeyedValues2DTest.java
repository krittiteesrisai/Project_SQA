package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class DefaultKeyedValues2DTest {

    @Test
    public void testConstructorAndBasicCounts() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
        assertTrue(table.getRowKeys().isEmpty());
        assertTrue(table.getColumnKeys().isEmpty());

        DefaultKeyedValues2D sortedTable = new DefaultKeyedValues2D(true);
        assertEquals(0, sortedTable.getRowCount());
    }

    @Test
    public void testAddAndGetValuesUnsorted() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D(false);
        table.addValue(10.0, "R1", "C1");
        table.setValue(20.0, "R1", "C2");
        table.setValue(30.0, "R2", "C1");

        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());

        assertEquals(10.0, table.getValue(0, 0));
        assertEquals(20.0, table.getValue("R1", "C2"));
        assertEquals(30.0, table.getValue("R2", "C1"));
        assertNull(table.getValue("R2", "C2")); // Row has entry, but col is missing -> handled

        assertEquals("R1", table.getRowKey(0));
        assertEquals("R2", table.getRowKey(1));
        assertEquals("C1", table.getColumnKey(0));
        assertEquals("C2", table.getColumnKey(1));

        assertEquals(0, table.getRowIndex("R1"));
        assertEquals(1, table.getColumnIndex("C2"));
    }

    @Test
    public void testAddAndGetValuesSorted() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D(true);
        table.addValue(10.0, "Z_Row", "C1");
        table.setValue(20.0, "A_Row", "C1"); // Should be sorted before Z_Row

        assertEquals(2, table.getRowCount());
        assertEquals("A_Row", table.getRowKey(0));
        assertEquals("Z_Row", table.getRowKey(1));
        assertEquals(0, table.getRowIndex("A_Row"));
        assertEquals(1, table.getRowIndex("Z_Row"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndexNullKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.getRowIndex(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndexNullKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.getColumnIndex(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueNullRowKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.getValue(null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueNullColKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.getValue("R1", null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownColumnKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1.0, "R1", "C1");
        table.getValue("R1", "UnknownCol");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownRowKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1.0, "R1", "C1");
        table.getValue("UnknownRow", "C1");
    }

    @Test
    public void testRemoveValueAndCleanup() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(10.0, "R1", "C1");
        table.addValue(20.0, "R1", "C2");

        // Remove single value, row/col should still exist
        table.removeValue("R1", "C1");
        assertEquals(1, table.getRowCount());
        assertEquals(2, table.getColumnCount());
        assertNull(table.getValue("R1", "C1"));

        // Remove last value in row & col -> should trigger full row/col removal
        table.removeValue("R1", "C2");
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
    }

    @Test
    public void testRemoveRowAndColumnMethods() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(10.0, "R1", "C1");
        table.addValue(20.0, "R2", "C2");

        table.removeRow(0);
        assertEquals(1, table.getRowCount());

        table.addValue(30.0, "R1", "C1");
        table.removeRow("R1");
        assertEquals(0, table.getRowCount());

        table.addValue(40.0, "R2", "C2");
        table.removeColumn(0);
        assertEquals(0, table.getColumnCount());

        table.addValue(50.0, "R2", "C2");
        table.removeColumn("C2");
        assertEquals(0, table.getColumnCount());
    }

    @Test
    public void testClear() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(10.0, "R1", "C1");
        table.clear();
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
        assertTrue(table.getRowKeys().isEmpty());
    }

    @Test
    public void testEqualsAndHashCode() {
        DefaultKeyedValues2D t1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D t2 = new DefaultKeyedValues2D();

        assertEquals(t1, t1); // self
        assertFalse(t1.equals(null)); // null
        assertFalse(t1.equals("NotADataTable")); // different type

        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());

        t1.addValue(10.0, "R1", "C1");
        assertFalse(t1.equals(t2));

        t2.addValue(10.0, "R1", "C1");
        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());

        // Different column keys
        t2.setValue(20.0, "R1", "C2");
        assertFalse(t1.equals(t2));

        // Different row count / values with null comparison
        DefaultKeyedValues2D t3 = new DefaultKeyedValues2D();
        t3.addValue(null, "R1", "C1");
        DefaultKeyedValues2D t4 = new DefaultKeyedValues2D();
        t4.addValue(10.0, "R1", "C1");
        assertFalse(t3.equals(t4));
        assertFalse(t4.equals(t3));
        
        // Equal null cases
        DefaultKeyedValues2D t5 = new DefaultKeyedValues2D();
        t5.addValue(null, "R1", "C1");
        DefaultKeyedValues2D t6 = new DefaultKeyedValues2D();
        t6.addValue(null, "R1", "C1");
        assertEquals(t5, t6);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(10.0, "R1", "C1");

        DefaultKeyedValues2D clone = (DefaultKeyedValues2D) table.clone();
        assertEquals(table, clone);
        assertNotSame(table, clone);
        assertEquals(table.getRowKeys(), clone.getRowKeys());
    }
}