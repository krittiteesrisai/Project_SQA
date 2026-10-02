package org.jfree.data;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * JUnit 4 test class for org.jfree.data.KeyedObjects2D
 * (Defects4J: Chart-22b)
 *
 * หมายเหตุ: บาง test-case ใช้ reflection เพื่อบังคับสถานะภายใน (private field)
 * ให้อยู่ในสภาวะที่ปกติแล้ว "ไม่สามารถเกิดขึ้นได้" ผ่าน public API
 * (เช่น rowData == null หรือ columnKey == null ใน getObject(int,int))
 * เพื่อให้ครอบคลุม branch ป้องกัน (defensive) ที่มีอยู่ในซอร์สโค้ด
 * การทำเช่นนี้ไม่ได้ "เดา" behavior ใหม่ แต่ทดสอบ branch ที่มีอยู่แล้วจริงในโค้ด
 */
public class KeyedObjects2DTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private KeyedObjects2D data;

    @Before
    public void setUp() {
        data = new KeyedObjects2D();
    }

    // ---------- Constructor / empty state ----------

    @Test
    public void testEmptyConstructor() {
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertTrue(data.getRowKeys().isEmpty());
        assertTrue(data.getColumnKeys().isEmpty());
    }

    // ---------- setObject / addObject ----------

    @Test
    public void testSetObject_NewRowNewColumn() {
        data.setObject("A1", "R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals("A1", data.getObject("R1", "C1"));
    }

    @Test
    public void testSetObject_ExistingRowNewColumn() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R1", "C2"); // rowIndex >= 0 branch
        assertEquals(1, data.getRowCount());
        assertEquals(2, data.getColumnCount());
        assertEquals("A1", data.getObject("R1", "C1"));
        assertEquals("A2", data.getObject("R1", "C2"));
    }

    @Test
    public void testSetObject_ExistingRowExistingColumn_Update() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A1-updated", "R1", "C1"); // columnIndex >= 0 branch (no new col)
        assertEquals(1, data.getColumnCount());
        assertEquals("A1-updated", data.getObject("R1", "C1"));
    }

    @Test
    public void testSetObject_NullRowKey_ThrowsException() {
        thrown.expect(IllegalArgumentException.class);
        data.setObject("A1", null, "C1");
    }

    @Test
    public void testSetObject_NullColumnKey_ThrowsException() {
        thrown.expect(IllegalArgumentException.class);
        data.setObject("A1", "R1", null);
    }

    @Test
    public void testAddObject_DelegatesToSetObject() {
        data.addObject("A1", "R1", "C1");
        assertEquals("A1", data.getObject("R1", "C1"));
    }

    // ---------- getObject(int, int) ----------

    @Test
    public void testGetObjectByIndex_ValidIndex_IndexFound() {
        data.setObject("A1", "R1", "C1");
        assertEquals("A1", data.getObject(0, 0));
    }

    @Test
    public void testGetObjectByIndex_ColumnNotPresentInRow_IndexNegativeBranch() {
        // R1 only has C1; R2 only has C2 -> columnKeys = [C1, C2]
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R2", "C2");
        // row 0 (R1) does not contain column 1 (C2) -> rowData.getIndex() returns -1
        assertNull(data.getObject(0, 1));
    }

    @Test
    public void testGetObjectByIndex_RowDataNull_DefensiveBranch() throws Exception {
        data.setObject("A1", "R1", "C1");
        forceListElementNull("rows", 0);
        assertNull(data.getObject(0, 0)); // rowData == null branch
    }

    @Test
    public void testGetObjectByIndex_ColumnKeyNull_DefensiveBranch() throws Exception {
        data.setObject("A1", "R1", "C1");
        forceListElementNull("columnKeys", 0);
        assertNull(data.getObject(0, 0)); // columnKey == null branch
    }

    @Test
    public void testGetObjectByIndex_OutOfRangeRow_ThrowsIndexOutOfBounds() {
        data.setObject("A1", "R1", "C1");
        thrown.expect(IndexOutOfBoundsException.class);
        data.getObject(5, 0);
    }

    @Test
    public void testGetObjectByIndex_OutOfRangeColumn_ThrowsIndexOutOfBounds() {
        data.setObject("A1", "R1", "C1");
        thrown.expect(IndexOutOfBoundsException.class);
        data.getObject(0, 5);
    }

    // ---------- getObject(Comparable, Comparable) ----------

    @Test
    public void testGetObjectByKey_Valid() {
        data.setObject("A1", "R1", "C1");
        assertEquals("A1", data.getObject("R1", "C1"));
    }

    @Test
    public void testGetObjectByKey_NullRowKey_ThrowsException() {
        thrown.expect(IllegalArgumentException.class);
        data.getObject(null, "C1");
    }

    @Test
    public void testGetObjectByKey_NullColumnKey_ThrowsException() {
        thrown.expect(IllegalArgumentException.class);
        data.getObject("R1", null);
    }

    @Test
    public void testGetObjectByKey_UnknownRowKey_ThrowsUnknownKeyException() {
        data.setObject("A1", "R1", "C1");
        thrown.expect(UnknownKeyException.class);
        data.getObject("UNKNOWN_ROW", "C1");
    }

    @Test
    public void testGetObjectByKey_UnknownColumnKey_ThrowsUnknownKeyException() {
        data.setObject("A1", "R1", "C1");
        thrown.expect(UnknownKeyException.class);
        data.getObject("R1", "UNKNOWN_COL");
    }

    // ---------- getRowKey / getRowIndex ----------

    @Test
    public void testGetRowKey_Valid() {
        data.setObject("A1", "R1", "C1");
        assertEquals("R1", data.getRowKey(0));
    }

    @Test
    public void testGetRowKey_OutOfRange_ThrowsException() {
        thrown.expect(IndexOutOfBoundsException.class);
        data.getRowKey(0);
    }

    @Test
    public void testGetRowIndex_Found() {
        data.setObject("A1", "R1", "C1");
        assertEquals(0, data.getRowIndex("R1"));
    }

    @Test
    public void testGetRowIndex_NotFound() {
        data.setObject("A1", "R1", "C1");
        assertEquals(-1, data.getRowIndex("UNKNOWN"));
    }

    @Test
    public void testGetRowKeys_Unmodifiable() {
        data.setObject("A1", "R1", "C1");
        List rowKeys = data.getRowKeys();
        thrown.expect(UnsupportedOperationException.class);
        rowKeys.add("R2");
    }

    // ---------- getColumnKey / getColumnIndex ----------

    @Test
    public void testGetColumnKey_Valid() {
        data.setObject("A1", "R1", "C1");
        assertEquals("C1", data.getColumnKey(0));
    }

    @Test
    public void testGetColumnKey_OutOfRange_ThrowsException() {
        thrown.expect(IndexOutOfBoundsException.class);
        data.getColumnKey(0);
    }

    @Test
    public void testGetColumnIndex_Found() {
        data.setObject("A1", "R1", "C1");
        assertEquals(0, data.getColumnIndex("C1"));
    }

    @Test
    public void testGetColumnIndex_NotFound() {
        data.setObject("A1", "R1", "C1");
        assertEquals(-1, data.getColumnIndex("UNKNOWN"));
    }

    @Test
    public void testGetColumnKeys_Unmodifiable() {
        data.setObject("A1", "R1", "C1");
        List colKeys = data.getColumnKeys();
        thrown.expect(UnsupportedOperationException.class);
        colKeys.add("C2");
    }

    // ---------- removeObject ----------

    @Test
    public void testRemoveObject_RowNotAllNull_RowRemains() {
        data.setObject("A1", "R1", "C1");
        data.setObject("B1", "R1", "C2");
        data.removeObject("R1", "C1"); // C2 still has value -> allNull=false
        assertEquals(1, data.getRowCount());
        assertNull(data.getObject("R1", "C1"));
        assertEquals("B1", data.getObject("R1", "C2"));
    }

    @Test
    public void testRemoveObject_RowAllNull_RowRemoved() {
        data.setObject("A1", "R1", "C1");
        data.removeObject("R1", "C1"); // only value -> allNull=true -> row removed
        assertEquals(0, data.getRowCount());
    }

    @Test
    public void testRemoveObject_MultiColumns_AllBecomeNull_RowRemoved() {
        data.setObject("A1", "R1", "C1");
        data.setObject("B1", "R1", "C2");
        data.removeObject("R1", "C1"); // C2 still non-null -> row remains
        assertEquals(1, data.getRowCount());
        data.removeObject("R1", "C2"); // now all null -> row removed
        assertEquals(0, data.getRowCount());
    }

    // ---------- removeRow ----------

    @Test
    public void testRemoveRowByIndex() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R2", "C1");
        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test
    public void testRemoveRowByIndex_OutOfRange_ThrowsException() {
        thrown.expect(IndexOutOfBoundsException.class);
        data.removeRow(0);
    }

    @Test
    public void testRemoveRowByKey_Valid() {
        data.setObject("A1", "R1", "C1");
        data.removeRow("R1");
        assertEquals(0, data.getRowCount());
    }

    @Test
    public void testRemoveRowByKey_UnknownKey_ThrowsException() {
        // getRowIndex returns -1 -> removeRow(-1) -> List.remove(int) => IndexOutOfBoundsException
        thrown.expect(IndexOutOfBoundsException.class);
        data.removeRow("UNKNOWN");
    }

    // ---------- removeColumn ----------

    @Test
    public void testRemoveColumnByIndex() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R1", "C2");
        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveColumnByKey_Valid() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R1", "C2");
        data.removeColumn("C1");
        assertEquals(1, data.getColumnCount());
        assertEquals(-1, data.getColumnIndex("C1"));
    }

    @Test
    public void testRemoveColumnByKey_UnknownKey_ThrowsUnknownKeyException() {
        data.setObject("A1", "R1", "C1");
        thrown.expect(UnknownKeyException.class);
        data.removeColumn("UNKNOWN_COL");
    }

    @Test
    public void testRemoveColumnByKey_MultipleRows_LoopCoverage() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R2", "C1");
        data.setObject("A3", "R3", "C1");
        data.removeColumn("C1"); // iterates through all 3 rows in while-loop
        assertEquals(0, data.getColumnCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_SameInstance() {
        data.setObject("A1", "R1", "C1");
        assertTrue(data.equals(data));
    }

    @Test
    public void testEquals_NullObject() {
        assertFalse(data.equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(data.equals("Not a KeyedObjects2D"));
    }

    @Test
    public void testEquals_DifferentRowKeys() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject("A1", "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A1", "R2", "C1");
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_DifferentColumnKeys() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject("A1", "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A1", "R1", "C2");
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_OneNullOneNotNull_Value() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject(null, "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A1", "R1", "C1");
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_DifferentValues() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject("A1", "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A2", "R1", "C1");
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_FullyEqualObjects() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject("A1", "R1", "C1");
        d1.setObject("A2", "R1", "C2");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A1", "R1", "C1");
        d2.setObject("A2", "R1", "C2");
        assertTrue(d1.equals(d2));
    }

    @Test
    public void testEquals_BothValuesNull() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject(null, "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject(null, "R1", "C1");
        assertTrue(d1.equals(d2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_ConsistentForEqualObjects() {
        KeyedObjects2D d1 = new KeyedObjects2D();
        d1.setObject("A1", "R1", "C1");
        KeyedObjects2D d2 = new KeyedObjects2D();
        d2.setObject("A1", "R1", "C1");
        assertEquals(d1.hashCode(), d2.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_IndependentCopy() throws CloneNotSupportedException {
        data.setObject("A1", "R1", "C1");
        KeyedObjects2D clone = (KeyedObjects2D) data.clone();
        assertTrue(data.equals(clone));
        assertNotSame(data, clone);

        // Modifying the original should not affect the clone
        data.setObject("A1-modified", "R1", "C1");
        assertEquals("A1", clone.getObject("R1", "C1"));
        assertEquals("A1-modified", data.getObject("R1", "C1"));
    }

    @Test
    public void testClone_EmptyObject() throws CloneNotSupportedException {
        KeyedObjects2D clone = (KeyedObjects2D) data.clone();
        assertEquals(0, clone.getRowCount());
        assertEquals(0, clone.getColumnCount());
    }

    // ---------- Helper (reflection) ----------

    /**
     * ใช้ reflection เพื่อบังคับ element ของ private list field ให้เป็น null
     * สำหรับทดสอบ defensive branch ที่ไม่สามารถ trigger ได้ผ่าน public API ปกติ
     */
    @SuppressWarnings("unchecked")
    private void forceListElementNull(String fieldName, int index) throws Exception {
        Field field = KeyedObjects2D.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        List list = (List) field.get(data);
        list.set(index, null);
    }
}
