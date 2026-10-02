# DefaultKeyedValues2DTest.java

```java
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.UnknownKeyException;
import org.junit.Test;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jfree.data.DefaultKeyedValues2D (Defects4J Chart-18b).
 * Focus: branch/condition coverage and fault detection.
 */
public class DefaultKeyedValues2DTest {

    private DefaultKeyedValues2D data;

    @Before
    public void setUp() {
        data = new DefaultKeyedValues2D(); // default constructor -> sortRowKeys = false
    }

    // -------------------------------------------------------------
    // Constructors / basic empty state
    // -------------------------------------------------------------

    @Test
    public void testDefaultConstructor_EmptyState() {
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertTrue(data.getRowKeys().isEmpty());
        assertTrue(data.getColumnKeys().isEmpty());
    }

    // -------------------------------------------------------------
    // setValue / addValue branches
    // -------------------------------------------------------------

    @Test
    public void testAddValueAndGetValueByIndex_Normal() {
        data.addValue(new Double(1.0), "R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals(1.0, data.getValue(0, 0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByIndex_ColumnNotPresentInRow_ReturnsNull() {
        // R1 only has C1, R2 only has C2 -> R1 at column index of C2 must be null
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C2");
        // columnKeys = [C1, C2]; row 0 = R1 (has only C1)
        Number result = data.getValue(0, 1); // R1, C2 -> not present in row's own data
        assertNull(result);
    }

    @Test
    public void testSetValue_UpdateExistingCell() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(99.0), "R1", "C1"); // rowIndex >= 0 branch (existing row)
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals(99.0, data.getValue(0, 0).doubleValue(), 0.0001);
    }

    @Test
    public void testSetValue_NewColumnOnExistingRow_ColumnIndexNegativeBranch() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R1", "C2"); // columnIndex < 0 -> columnKeys.add
        assertEquals(2, data.getColumnCount());
    }

    @Test
    public void testSetValue_ExistingColumnIndexBranch() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C1"); // columnIndex >= 0 branch (already exists)
        assertEquals(1, data.getColumnCount());
    }

    @Test
    public void testSetValue_SortRowKeysTrue_InsertionOrder() {
        DefaultKeyedValues2D sortedData = new DefaultKeyedValues2D(true);
        sortedData.setValue(new Double(2.0), "B", "C1");
        sortedData.setValue(new Double(1.0), "A", "C1"); // must be inserted before B
        sortedData.setValue(new Double(3.0), "C", "C1"); // appended after B

        List rowKeys = sortedData.getRowKeys();
        assertEquals("A", rowKeys.get(0));
        assertEquals("B", rowKeys.get(1));
        assertEquals("C", rowKeys.get(2));
    }

    @Test
    public void testSetValue_SortRowKeysFalse_InsertionOrderPreserved() {
        data.setValue(new Double(2.0), "B", "C1");
        data.setValue(new Double(1.0), "A", "C1"); // appended, NOT sorted
        List rowKeys = data.getRowKeys();
        assertEquals("B", rowKeys.get(0));
        assertEquals("A", rowKeys.get(1));
    }

    // -------------------------------------------------------------
    // getRowIndex
    // -------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndex_NullKey_ThrowsException() {
        data.getRowIndex(null);
    }

    @Test
    public void testGetRowIndex_SortFalse_UsesIndexOf() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C1");
        assertEquals(1, data.getRowIndex("R2"));
        assertEquals(-1, data.getRowIndex("UNKNOWN"));
    }

    @Test
    public void testGetRowIndex_SortTrue_UsesBinarySearch() {
        DefaultKeyedValues2D sortedData = new DefaultKeyedValues2D(true);
        sortedData.setValue(new Double(1.0), "A", "C1");
        sortedData.setValue(new Double(2.0), "B", "C1");
        sortedData.setValue(new Double(3.0), "C", "C1");
        assertEquals(1, sortedData.getRowIndex("B"));
    }

    // -------------------------------------------------------------
    // getColumnIndex
    // -------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_NullKey_ThrowsException() {
        data.getColumnIndex(null);
    }

    @Test
    public void testGetColumnIndex_Normal() {
        data.setValue(new Double(1.0), "R1", "C1");
        assertEquals(0, data.getColumnIndex("C1"));
        assertEquals(-1, data.getColumnIndex("UNKNOWN"));
    }

    // -------------------------------------------------------------
    // getRowKeys / getColumnKeys unmodifiable
    // -------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRowKeysUnmodifiable() {
        data.setValue(new Double(1.0), "R1", "C1");
        List rowKeys = data.getRowKeys();
        rowKeys.add("HACK");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetColumnKeysUnmodifiable() {
        data.setValue(new Double(1.0), "R1", "C1");
        List columnKeys = data.getColumnKeys();
        columnKeys.add("HACK");
    }

    // -------------------------------------------------------------
    // getValue(Comparable, Comparable)
    // -------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKeys_NullRowKey_Throws() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.getValue((Comparable) null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKeys_NullColumnKey_Throws() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.getValue("R1", (Comparable) null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKeys_UnknownColumnKey_ThrowsUnknownKeyException() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.getValue("R1", "UNKNOWN_COL");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKeys_UnknownRowKey_ThrowsUnknownKeyException() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.getValue("UNKNOWN_ROW", "C1");
    }

    @Test
    public void testGetValueByKeys_ValidButNotSetInRow_ReturnsNull() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C2");
        // C2 exists in structure, R1 row exists, but R1 has no entry for C2
        Number result = data.getValue("R1", "C2");
        assertNull(result);
    }

    @Test
    public void testGetValueByKeys_ValidValue() {
        data.setValue(new Double(5.5), "R1", "C1");
        assertEquals(5.5, data.getValue("R1", "C1").doubleValue(), 0.0001);
    }

    // -------------------------------------------------------------
    // removeValue - covering row/column removal cascade branches
    // -------------------------------------------------------------

    @Test
    public void testRemoveValue_RowAndColumnRemainAfterRemoval() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R1", "C2");
        data.setValue(new Double(3.0), "R2", "C1");

        data.removeValue("R1", "C1");

        assertNull(data.getValue("R1", "C1"));
        // R1 still has C2 -> row not removed
        assertTrue(data.getRowKeys().contains("R1"));
        // R2 still has C1 -> column not removed
        assertTrue(data.getColumnKeys().contains("C1"));
    }

    @Test
    public void testRemoveValue_RowRemoved_ColumnRemains() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C1");

        data.removeValue("R1", "C1");

        // R1 only had C1 -> now all null -> row removed
        assertFalse(data.getRowKeys().contains("R1"));
        // R2 still has C1 with value -> column remains
        assertTrue(data.getColumnKeys().contains("C1"));
        assertEquals(2.0, data.getValue("R2", "C1").doubleValue(), 0.0001);
    }

    @Test
    public void testRemoveValue_RowAndColumnBothRemoved() {
        data.setValue(new Double(1.0), "R1", "C1");

        data.removeValue("R1", "C1");

        // Only one cell existed -> both row and column should be removed
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertFalse(data.getRowKeys().contains("R1"));
        assertFalse(data.getColumnKeys().contains("C1"));
    }

    // -------------------------------------------------------------
    // removeRow
    // -------------------------------------------------------------

    @Test
    public void testRemoveRow_ByIndex() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C1");

        data.removeRow(0);

        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test
    public void testRemoveRow_ByKey() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C1");

        data.removeRow("R1");

        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRow_ByUnknownKey_ThrowsIndexOutOfBounds() {
        data.setValue(new Double(1.0), "R1", "C1");
        // getRowIndex("UNKNOWN") returns -1 -> removeRow(-1) triggers
        // IndexOutOfBoundsException from List.remove(int) as-is in source.
        data.removeRow("UNKNOWN");
    }

    // -------------------------------------------------------------
    // removeColumn
    // -------------------------------------------------------------

    @Test
    public void testRemoveColumn_ByIndex() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R1", "C2");

        data.removeColumn(0); // removes C1

        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveColumn_ByKey() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R1", "C2");

        data.removeColumn("C1");

        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    // -------------------------------------------------------------
    // clear
    // -------------------------------------------------------------

    @Test
    public void testClear() {
        data.setValue(new Double(1.0), "R1", "C1");
        data.setValue(new Double(2.0), "R2", "C2");

        data.clear();

        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
    }

    // -------------------------------------------------------------
    // equals
    // -------------------------------------------------------------

    @Test
    public void testEquals_NullOtherObject() {
        assertFalse(data.equals(null));
    }

    @Test
    public void testEquals_SameInstance() {
        assertTrue(data.equals(data));
    }

    @Test
    public void testEquals_NotKeyedValues2DInstance() {
        assertFalse(data.equals("a string"));
    }

    @Test
    public void testEquals_DifferentRowKeys() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(new Double(1.0), "R1", "C1");
        other.setValue(new Double(1.0), "R2", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_DifferentColumnKeys() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(new Double(1.0), "R1", "C1");
        other.setValue(new Double(1.0), "R1", "C2");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_DifferentValues() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(new Double(1.0), "R1", "C1");
        other.setValue(new Double(2.0), "R1", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_OneNullOneNotNullValue() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(null, "R1", "C1");
        other.setValue(new Double(2.0), "R1", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_EqualStructures() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(new Double(1.0), "R1", "C1");
        other.setValue(new Double(1.0), "R1", "C1");
        assertTrue(data.equals(other));
        assertTrue(other.equals(data));
    }

    @Test
    public void testEquals_BothNullValuesEqual() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(null, "R1", "C1");
        other.setValue(null, "R1", "C1");
        assertTrue(data.equals(other));
    }

    // -------------------------------------------------------------
    // hashCode
    // -------------------------------------------------------------

    @Test
    public void testHashCode_ConsistentForEqualObjects() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.setValue(new Double(1.0), "R1", "C1");
        other.setValue(new Double(1.0), "R1", "C1");
        assertEquals(data.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_EmptyStructure_NoException() {
        // Just ensure hashCode() does not throw on empty lists.
        int h = data.hashCode();
        assertNotNull(h); // autoboxed int always non-null; trivial sanity check
    }

    // -------------------------------------------------------------
    // clone
    // -------------------------------------------------------------

    @Test
    public void testClone_DeepCopyOfRows() throws Exception {
        data.setValue(new Double(1.0), "R1", "C1");
        DefaultKeyedValues2D clone = (DefaultKeyedValues2D) data.clone();

        // modify original's cell value after cloning
        data.setValue(new Double(999.0), "R1", "C1");

        // clone should be unaffected due to deep clone of rows
        assertEquals(1.0, clone.getValue("R1", "C1").doubleValue(), 0.0001);
        assertEquals(999.0, data.getValue("R1", "C1").doubleValue(), 0.0001);
    }

    @Test
    public void testClone_ShallowCopyOfKeyListsIsIndependentList() throws Exception {
        data.setValue(new Double(1.0), "R1", "C1");
        DefaultKeyedValues2D clone = (DefaultKeyedValues2D) data.clone();

        // adding a new row/column to original should not affect clone's key list size
        data.setValue(new Double(2.0), "R2", "C2");

        assertEquals(1, clone.getRowCount());
        assertEquals(1, clone.getColumnCount());
        assertEquals(2, data.getRowCount());
        assertEquals(2, data.getColumnCount());
    }

    // -------------------------------------------------------------
    // boundary tests: getRowKey / getColumnKey out-of-range
    // -------------------------------------------------------------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_OutOfBoundsIndex_Throws() {
        data.getRowKey(0); // empty structure
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_OutOfBoundsIndex_Throws() {
        data.getColumnKey(0); // empty structure
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndex_OutOfBoundsRow_Throws() {
        data.getValue(0, 0); // empty structure - rows.get(0) fails
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_EmptyState | สถานะเริ่มต้นว่าง (baseline) |
| testAddValueAndGetValueByIndex_Normal | addValue→setValue, getValue(int,int) กรณี index>=0 |
| testGetValueByIndex_ColumnNotPresentInRow_ReturnsNull | getValue(int,int): index<0 branch |
| testSetValue_UpdateExistingCell | setValue: rowIndex>=0 branch |
| testSetValue_NewColumnOnExistingRow_ColumnIndexNegativeBranch | setValue: columnIndex<0 branch |
| testSetValue_ExistingColumnIndexBranch | setValue: columnIndex>=0 branch |
| testSetValue_SortRowKeysTrue_InsertionOrder | setValue: rowIndex<0 & sortRowKeys=true branch |
| testSetValue_SortRowKeysFalse_InsertionOrderPreserved | setValue: rowIndex<0 & sortRowKeys=false branch |
| testGetRowIndex_NullKey_ThrowsException | getRowIndex: null-check branch |
| testGetRowIndex_SortFalse_UsesIndexOf | getRowIndex: else branch (indexOf) |
| testGetRowIndex_SortTrue_UsesBinarySearch | getRowIndex: if sortRowKeys branch (binarySearch) |
| testGetColumnIndex_NullKey_ThrowsException | getColumnIndex: null-check branch |
| testGetColumnIndex_Normal | getColumnIndex: normal path |
| testGetRowKeysUnmodifiable / testGetColumnKeysUnmodifiable | Unmodifiable list behavior |
| testGetValueByKeys_NullRowKey_Throws / NullColumnKey_Throws | getValue(Comparable,Comparable): null-checks |
| testGetValueByKeys_UnknownColumnKey_ThrowsUnknownKeyException | columnKeys.contains == false branch |
| testGetValueByKeys_UnknownRowKey_ThrowsUnknownKeyException | row<0 branch (else → UnknownKeyException) |
| testGetValueByKeys_ValidButNotSetInRow_ReturnsNull | col<0 branch → null |
| testGetValueByKeys_ValidValue | col>=0 branch → value |
| testRemoveValue_RowAndColumnRemainAfterRemoval | removeValue: allNull=false (loop break) ทั้ง row & column |
| testRemoveValue_RowRemoved_ColumnRemains | removeValue: row allNull=true (remove), column allNull=false |
| testRemoveValue_RowAndColumnBothRemoved | removeValue: ทั้ง row และ column allNull=true (ลบทั้งคู่ พร้อม loop ลบ cell) |
| testRemoveRow_ByIndex / ByKey | removeRow(int), removeRow(Comparable) |
| testRemoveRow_ByUnknownKey_ThrowsIndexOutOfBounds | removeRow(Comparable) กรณี key ไม่พบ → IndexOutOfBoundsException |
| testRemoveColumn_ByIndex / ByKey | removeColumn(int), removeColumn(Comparable) |
| testClear | clear(): ล้างข้อมูลทั้งหมด |
| testEquals_NullOtherObject | equals: o==null branch |
| testEquals_SameInstance | equals: o==this branch |
| testEquals_NotKeyedValues2DInstance | equals: instanceof check branch |
| testEquals_DifferentRowKeys | equals: rowKeys ไม่เท่ากัน branch |
| testEquals_DifferentColumnKeys | equals: columnKeys ไม่เท่ากัน branch |
| testEquals_DifferentValues | equals: value ไม่ตรงกัน (v1.equals(v2)=false) |
| testEquals_OneNullOneNotNullValue | equals: v1==null, v2!=null branch |
| testEquals_EqualStructures | equals: ทุกเงื่อนไข true → return true |
| testEquals_BothNullValuesEqual | equals: v1==null, v2==null branch |
| testHashCode_ConsistentForEqualObjects / EmptyStructure | hashCode() ทำงานถูกต้องและไม่ throw |
| testClone_DeepCopyOfRows | clone(): ตรวจ deep copy ของ rows |
| testClone_ShallowCopyOfKeyListsIsIndependentList | clone(): ตรวจว่า key lists เป็น independent list ใหม่ |
| testGetRowKey_/getColumnKey_/getValueByIndex_OutOfBoundsIndex_Throws | Boundary: index นอกขอบเขตกับ list ว่าง → IndexOutOfBoundsException |

**หมายเหตุ:** 
- ในเมธอด `getValue(int,int)` เงื่อนไข `if (rowData != null)` ในซอร์สโค้ดจะเป็น `true` เสมอในทางปฏิบัติ เพราะ `rows` list ถูกเติมด้วย `DefaultKeyedValues` ที่ไม่เป็น null เท่านั้นผ่าน `setValue()` — จึงไม่สามารถ trigger branch `false` ได้โดยไม่ reflection/mock ดังนั้นไม่ได้เขียนทดสอบสำหรับ branch นี้โดยเฉพาะ
- `removeColumn(Comparable)` กรณี key ไม่รู้จักไม่ได้ทดสอบเนื่องจากพฤติกรรมขึ้นกับ `DefaultKeyedValues.removeValue()` ซึ่งไม่มีซอร์สโค้ดให้ตรวจสอบ (ป้องกันการเดา behavior)