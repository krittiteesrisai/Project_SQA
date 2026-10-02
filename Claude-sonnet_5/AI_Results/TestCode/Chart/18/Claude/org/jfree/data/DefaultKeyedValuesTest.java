package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link DefaultKeyedValues} (Defects4J Chart-18b)
 * เน้น branch coverage และการดักจับ fault ที่อาจซ่อนอยู่ใน removeValue(int)
 * ซึ่งมีเงื่อนไข rebuildIndex ที่อาจไม่ถูก call เมื่อลบ item ตัวสุดท้าย
 */
public class DefaultKeyedValuesTest {

    private DefaultKeyedValues dkv;

    @Before
    public void setUp() {
        dkv = new DefaultKeyedValues();
    }

    // ---------------------------------------------------------------
    // getItemCount()
    // ---------------------------------------------------------------

    @Test
    public void testGetItemCount_Empty() {
        assertEquals(0, dkv.getItemCount());
    }

    @Test
    public void testGetItemCount_AfterAdd() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        assertEquals(2, dkv.getItemCount());
    }

    // ---------------------------------------------------------------
    // getValue(int) / getKey(int) - boundary & out of range
    // ---------------------------------------------------------------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_IndexOutOfBounds() {
        dkv.getValue(0); // empty list
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_IndexOutOfBounds() {
        dkv.getKey(0); // empty list
    }

    @Test
    public void testGetValue_ValidIndex() {
        dkv.addValue("A", 5.0);
        assertEquals(5.0, dkv.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetKey_ValidIndex() {
        dkv.addValue("A", 5.0);
        assertEquals("A", dkv.getKey(0));
    }

    // ---------------------------------------------------------------
    // getIndex(Comparable)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_NullKey_ThrowsException() {
        dkv.getIndex(null);
    }

    @Test
    public void testGetIndex_KeyNotFound_ReturnsNegativeOne() {
        dkv.addValue("A", 1.0);
        assertEquals(-1, dkv.getIndex("Z"));
    }

    @Test
    public void testGetIndex_KeyFound() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        assertEquals(1, dkv.getIndex("B"));
    }

    // ---------------------------------------------------------------
    // getKeys()
    // ---------------------------------------------------------------

    @Test
    public void testGetKeys_ReturnsClonedListNotSameReference() {
        dkv.addValue("A", 1.0);
        List keys1 = dkv.getKeys();
        List keys2 = dkv.getKeys();
        assertEquals(keys1, keys2);
        assertNotSame(keys1, keys2); // ต้องเป็น clone คนละ instance
    }

    @Test
    public void testGetKeys_Empty() {
        List keys = dkv.getKeys();
        assertTrue(keys.isEmpty());
    }

    // ---------------------------------------------------------------
    // getValue(Comparable)
    // ---------------------------------------------------------------

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKey_UnknownKey_ThrowsException() {
        dkv.getValue("NotExist");
    }

    @Test
    public void testGetValueByKey_Found() {
        dkv.addValue("A", 3.5);
        assertEquals(3.5, dkv.getValue("A").doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKey_NullKey_ThrowsException() {
        // getValue(Comparable) -> getIndex(null) -> IllegalArgumentException
        dkv.getValue((Comparable) null);
    }

    // ---------------------------------------------------------------
    // addValue(Comparable, double) / addValue(Comparable, Number)
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_Double_DelegatesToSetValue() {
        dkv.addValue("A", 10.0);
        assertEquals(10.0, dkv.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testAddValue_NullNumberValue_Allowed() {
        dkv.addValue("A", (Number) null);
        assertNull(dkv.getValue(0));
    }

    // ---------------------------------------------------------------
    // setValue(Comparable, Number) - null key / update / add branches
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_NullKey_ThrowsException() {
        dkv.setValue(null, new Double(1.0));
    }

    @Test
    public void testSetValue_NewKey_AddedBranch() {
        dkv.setValue("A", new Double(1.0));
        assertEquals(1, dkv.getItemCount());
        assertEquals(0, dkv.getIndex("A"));
    }

    @Test
    public void testSetValue_ExistingKey_UpdateBranch() {
        dkv.setValue("A", new Double(1.0));
        dkv.setValue("A", new Double(99.0));
        assertEquals(1, dkv.getItemCount()); // ไม่เพิ่มรายการใหม่
        assertEquals(99.0, dkv.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testSetValue_Double_Delegate() {
        dkv.setValue("A", 7.0);
        assertEquals(7.0, dkv.getValue("A").doubleValue(), 0.0001);
    }

    // ---------------------------------------------------------------
    // insertValue(int, Comparable, Number)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_PositionNegative_ThrowsException() {
        dkv.insertValue(-1, "A", new Double(1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_PositionTooLarge_ThrowsException() {
        dkv.insertValue(1, "A", new Double(1.0)); // itemCount=0, allowed range [0,0]
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_NullKey_ThrowsException() {
        dkv.insertValue(0, null, new Double(1.0));
    }

    @Test
    public void testInsertValue_PositionEqualsItemCount_Boundary_Allowed() {
        // position == getItemCount() ต้องไม่ throw (ขอบเขตบน)
        dkv.insertValue(0, "A", new Double(1.0));
        assertEquals(1, dkv.getItemCount());
    }

    @Test
    public void testInsertValue_SamePosition_UpdateInPlace() {
        dkv.addValue("A", 1.0);
        // pos ของ "A" คือ 0 และ position ที่ระบุก็คือ 0 -> pos==position
        dkv.insertValue(0, "A", new Double(50.0));
        assertEquals(1, dkv.getItemCount());
        assertEquals(50.0, dkv.getValue("A").doubleValue(), 0.0001);
        assertEquals(0, dkv.getIndex("A"));
    }

    @Test
    public void testInsertValue_ExistingKeyDifferentPosition_MovesKey() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        // "B" อยู่ที่ index 1, ย้ายไปที่ position 0
        dkv.insertValue(0, "B", new Double(99.0));
        assertEquals(2, dkv.getItemCount());
        assertEquals("B", dkv.getKey(0));
        assertEquals(99.0, dkv.getValue("B").doubleValue(), 0.0001);
        assertEquals("A", dkv.getKey(1));
        assertEquals(0, dkv.getIndex("B"));
        assertEquals(1, dkv.getIndex("A"));
    }

    @Test
    public void testInsertValue_NewKey_InsertsAtPosition() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.insertValue(1, "C", new Double(3.0)); // key ใหม่ ไม่พบใน pos>=0 branch
        assertEquals(3, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals("C", dkv.getKey(1));
        assertEquals("B", dkv.getKey(2));
        assertEquals(1, dkv.getIndex("C"));
    }

    @Test
    public void testInsertValue_Double_Delegate() {
        dkv.insertValue(0, "A", 8.0);
        assertEquals(8.0, dkv.getValue("A").doubleValue(), 0.0001);
    }

    // ---------------------------------------------------------------
    // removeValue(int) - ตรวจ branch rebuildIndex (index < keys.size())
    // ---------------------------------------------------------------

    @Test
    public void testRemoveValueByIndex_MiddleIndex_RebuildsIndex() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.addValue("C", 3.0);
        dkv.removeValue(1); // ลบ "B" กลางลิสต์ -> index(1) < keys.size()(2) -> rebuild
        assertEquals(2, dkv.getItemCount());
        assertEquals(0, dkv.getIndex("A"));
        assertEquals(1, dkv.getIndex("C")); // index ต้องถูก rebuild ถูกต้อง
        assertEquals(-1, dkv.getIndex("B"));
    }

    @Test
    public void testRemoveValueByIndex_LastIndex_NoRebuildBranch_FaultDetection() {
        // กรณีนี้ตรวจ branch: if (index < this.keys.size()) rebuildIndex();
        // เมื่อลบ item ตัวสุดท้าย หลังลบ keys.size() จะลดลงเท่ากับ index เดิม
        // ทำให้เงื่อนไขเป็น false และไม่ rebuild -> indexMap อาจมี key ค้างอยู่ (fault)
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.addValue("C", 3.0);
        dkv.removeValue(2); // ลบ "C" ตัวสุดท้าย, index(2) not < keys.size()(2)
        assertEquals(2, dkv.getItemCount());
        // ตาม contract ของ getIndex คีย์ที่ถูกลบไปแล้วต้องคืน -1
        // ถ้า implementation มี fault (ไม่ rebuild) จะยังคืน index เดิม (2) แทน -1
        assertEquals(-1, dkv.getIndex("C"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveValueByIndex_OutOfBounds_ThrowsException() {
        dkv.removeValue(0); // list ว่าง
    }

    // ---------------------------------------------------------------
    // removeValue(Comparable)
    // ---------------------------------------------------------------

    @Test
    public void testRemoveValueByKey_NotFound_NoExceptionNoChange() {
        dkv.addValue("A", 1.0);
        dkv.removeValue("Z"); // index<0 -> return เฉย ๆ ไม่ throw
        assertEquals(1, dkv.getItemCount());
    }

    @Test
    public void testRemoveValueByKey_Found_RemovesItem() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.removeValue("A");
        assertEquals(1, dkv.getItemCount());
        assertEquals(-1, dkv.getIndex("A"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveValueByKey_NullKey_ThrowsException() {
        dkv.removeValue((Comparable) null); // getIndex(null) -> IllegalArgumentException
    }

    // ---------------------------------------------------------------
    // clear()
    // ---------------------------------------------------------------

    @Test
    public void testClear_EmptiesAllStorage() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.clear();
        assertEquals(0, dkv.getItemCount());
        assertEquals(-1, dkv.getIndex("A"));
    }

    // ---------------------------------------------------------------
    // sortByKeys(SortOrder)
    // ---------------------------------------------------------------

    @Test
    public void testSortByKeys_Ascending() {
        dkv.addValue("C", 3.0);
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.sortByKeys(SortOrder.ASCENDING);
        assertEquals("A", dkv.getKey(0));
        assertEquals("B", dkv.getKey(1));
        assertEquals("C", dkv.getKey(2));
    }

    @Test
    public void testSortByKeys_Descending() {
        dkv.addValue("A", 1.0);
        dkv.addValue("C", 3.0);
        dkv.addValue("B", 2.0);
        dkv.sortByKeys(SortOrder.DESCENDING);
        assertEquals("C", dkv.getKey(0));
        assertEquals("B", dkv.getKey(1));
        assertEquals("A", dkv.getKey(2));
    }

    @Test(expected = NullPointerException.class)
    public void testSortByKeys_NullOrder_ThrowsSomeException() {
        // ตาม Javadoc: order == null ไม่อนุญาต แต่ source ไม่ได้ check เอง
        // ปล่อยให้ comparator/Arrays.sort โยน NPE - ไม่ยืนยัน behavior ที่แน่นอน
        dkv.addValue("A", 1.0);
        dkv.sortByKeys(null);
    }

    // ---------------------------------------------------------------
    // sortByValues(SortOrder)
    // ---------------------------------------------------------------

    @Test
    public void testSortByValues_Ascending() {
        dkv.addValue("A", 3.0);
        dkv.addValue("B", 1.0);
        dkv.addValue("C", 2.0);
        dkv.sortByValues(SortOrder.ASCENDING);
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 0.0001);
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 0.0001);
        assertEquals(3.0, dkv.getValue(2).doubleValue(), 0.0001);
    }

    @Test
    public void testSortByValues_Descending() {
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 3.0);
        dkv.addValue("C", 2.0);
        dkv.sortByValues(SortOrder.DESCENDING);
        assertEquals(3.0, dkv.getValue(0).doubleValue(), 0.0001);
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 0.0001);
        assertEquals(1.0, dkv.getValue(2).doubleValue(), 0.0001);
    }

    @Test
    public void testSortByValues_WithNullValue_SortsToEnd() {
        // อ้างอิงตาม Javadoc เท่านั้น: "null values will sort to the end of the
        // list irrespective of the sort order" - ไม่ทราบ implementation
        // ภายในของ KeyedValueComparator แน่ชัด จึง comment กำกับไว้
        dkv.addValue("A", 1.0);
        dkv.addValue("B", (Number) null);
        dkv.addValue("C", 2.0);
        dkv.sortByValues(SortOrder.ASCENDING);
        assertNull(dkv.getValue(2)); // null ควรอยู่ท้ายสุด
    }

    // ---------------------------------------------------------------
    // equals(Object)
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameInstance_ReturnsTrue() {
        dkv.addValue("A", 1.0);
        assertTrue(dkv.equals(dkv));
    }

    @Test
    public void testEquals_NotInstanceOfKeyedValues_ReturnsFalse() {
        dkv.addValue("A", 1.0);
        assertFalse(dkv.equals("not a KeyedValues"));
        assertFalse(dkv.equals(null));
    }

    @Test
    public void testEquals_DifferentItemCount_ReturnsFalse() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        other.addValue("A", 1.0);
        other.addValue("B", 2.0);
        assertFalse(dkv.equals(other));
    }

    @Test
    public void testEquals_DifferentKeys_ReturnsFalse() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        other.addValue("Z", 1.0);
        assertFalse(dkv.equals(other));
    }

    @Test
    public void testEquals_BothValuesNull_ReturnsTrue() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", (Number) null);
        other.addValue("A", (Number) null);
        assertTrue(dkv.equals(other));
    }

    @Test
    public void testEquals_OneValueNullOtherNot_ReturnsFalse() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", (Number) null);
        other.addValue("A", new Double(1.0));
        assertFalse(dkv.equals(other));
    }

    @Test
    public void testEquals_ValuesNotEqual_ReturnsFalse() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        other.addValue("A", 2.0);
        assertFalse(dkv.equals(other));
    }

    @Test
    public void testEquals_AllEqual_ReturnsTrue() {
        DefaultKeyedValues other = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        other.addValue("A", 1.0);
        other.addValue("B", 2.0);
        assertTrue(dkv.equals(other));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_ConsistentWithKeysList() {
        dkv.addValue("A", 1.0);
        int expected = dkv.getKeys().hashCode();
        assertEquals(expected, dkv.hashCode());
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testClone_IndependentCopy() throws CloneNotSupportedException {
        dkv.addValue("A", 1.0);
        DefaultKeyedValues clone = (DefaultKeyedValues) dkv.clone();
        assertNotSame(dkv, clone);
        assertEquals(dkv, clone);

        // แก้ไข clone ต้องไม่กระทบต้นฉบับ (deep-ish clone ของ ArrayList/HashMap)
        clone.setValue("A", 999.0);
        assertEquals(1.0, dkv.getValue("A").doubleValue(), 0.0001);
        assertEquals(999.0, clone.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testClone_AddingToCloneDoesNotAffectOriginal() throws CloneNotSupportedException {
        dkv.addValue("A", 1.0);
        DefaultKeyedValues clone = (DefaultKeyedValues) dkv.clone();
        clone.addValue("B", 2.0);
        assertEquals(1, dkv.getItemCount());
        assertEquals(2, clone.getItemCount());
    }
}
