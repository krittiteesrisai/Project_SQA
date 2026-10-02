# CSVRecordTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

// Import แบบชัดเจนตามข้อกำหนด แม้ CSVRecord อยู่ package เดียวกัน (redundant แต่ compile ได้)
import org.apache.commons.csv.CSVRecord;

/**
 * JUnit 4 test suite for {@link CSVRecord} (Defects4J: Csv-6b)
 *
 * หมายเหตุ: CSVRecord constructor และ methods บางตัว (values(), putIn) เป็น
 * package-private จึงต้องอยู่ใน package org.apache.commons.csv เดียวกัน
 */
public class CSVRecordTest {

    private enum TestEnum {
        NAME, AGE
    }

    // ---------- Helper builders ----------

    private Map<String, Integer> buildMapping() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("NAME", 0);
        mapping.put("AGE", 1);
        return mapping;
    }

    // ---------- Constructor branch: values != null ? values : EMPTY_STRING_ARRAY ----------

    @Test
    public void testConstructor_NullValues_UsesEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
        assertArrayEquals(new String[0], record.values());
    }

    @Test
    public void testConstructor_NonNullValues_UsesGivenArray() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(2, record.size());
        assertArrayEquals(values, record.values());
    }

    // ---------- get(int) ----------

    @Test
    public void testGetByIndex_Valid() {
        String[] values = {"foo", "bar"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("foo", record.get(0));
        assertEquals("bar", record.get(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_OutOfBounds() {
        String[] values = {"foo"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5); // ไม่มีการ catch ใน get(int) จึงคาดหวัง exception ตรง ๆ
    }

    // ---------- get(Enum) ----------

    @Test
    public void testGetByEnum_Valid() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("John", record.get(TestEnum.NAME));
        assertEquals("30", record.get(TestEnum.AGE));
    }

    // ---------- get(String) ----------

    @Test(expected = IllegalStateException.class)
    public void testGetByName_NoMapping_ThrowsIllegalStateException() {
        String[] values = {"foo"};
        CSVRecord record = new CSVRecord(values, null, null, 1L); // mapping == null
        record.get("anything");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByName_NotMapped_ThrowsIllegalArgumentException() {
        String[] values = {"foo"};
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("NOT_EXIST"); // index == null branch
    }

    @Test
    public void testGetByName_Valid() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("John", record.get("NAME"));
        assertEquals("30", record.get("AGE"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByName_IndexOutOfValuesLength_ThrowsIllegalArgumentException() {
        // mapping ระบุ index 1 แต่ values มีแค่ 1 ตัว (index 0) -> ArrayIndexOutOfBoundsException
        // ถูก catch แล้ว rethrow เป็น IllegalArgumentException
        String[] values = {"John"};
        Map<String, Integer> mapping = buildMapping(); // AGE -> 1
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("AGE");
    }

    // ---------- getComment() ----------

    @Test
    public void testGetComment_Null() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetComment_NotNull() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, "my comment", 1L);
        assertEquals("my comment", record.getComment());
    }

    @Test
    public void testGetComment_EmptyString() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, "", 1L);
        assertEquals("", record.getComment());
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, null, 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_BoundaryZero() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, null, 0L);
        assertEquals(0L, record.getRecordNumber());
    }

    // ---------- isConsistent() ----------

    @Test
    public void testIsConsistent_MappingNull_ReturnsTrue() {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_MappingSizeMatchesValuesLength_ReturnsTrue() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = buildMapping(); // size = 2
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_MappingSizeMismatch_ReturnsFalse() {
        String[] values = {"John"}; // length 1
        Map<String, Integer> mapping = buildMapping(); // size 2
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    // ---------- isMapped() ----------

    @Test
    public void testIsMapped_MappingNull_ReturnsFalse() {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, null, 1L);
        assertFalse(record.isMapped("NAME"));
    }

    @Test
    public void testIsMapped_KeyExists_ReturnsTrue() {
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(new String[] {"John", "30"}, mapping, null, 1L);
        assertTrue(record.isMapped("NAME"));
    }

    @Test
    public void testIsMapped_KeyNotExists_ReturnsFalse() {
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(new String[] {"John", "30"}, mapping, null, 1L);
        assertFalse(record.isMapped("UNKNOWN"));
    }

    // ---------- isSet() ----------

    @Test
    public void testIsSet_MappedAndIndexWithinRange_ReturnsTrue() {
        Map<String, Integer> mapping = buildMapping(); // NAME->0, AGE->1
        CSVRecord record = new CSVRecord(new String[] {"John", "30"}, mapping, null, 1L);
        assertTrue(record.isSet("NAME"));
    }

    @Test
    public void testIsSet_MappedButIndexOutOfRange_ReturnsFalse() {
        // mapping มี AGE->1 แต่ values มีแค่ 1 ตัว (index 0) -> index(1) < length(1) เป็น false
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(new String[] {"John"}, mapping, null, 1L);
        assertFalse(record.isSet("AGE"));
    }

    @Test
    public void testIsSet_NotMapped_ReturnsFalse() {
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(new String[] {"John", "30"}, mapping, null, 1L);
        assertFalse(record.isSet("UNKNOWN"));
    }

    @Test
    public void testIsSet_MappingNull_ReturnsFalse() {
        CSVRecord record = new CSVRecord(new String[] {"John"}, null, null, 1L);
        assertFalse(record.isSet("NAME"));
    }

    @Test
    public void testIsSet_BoundaryIndexEqualsLength_ReturnsFalse() {
        // index == values.length -> ไม่ < length -> false (ทดสอบขอบเขต)
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("COL", 2);
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 1L); // length=2
        assertFalse(record.isSet("COL"));
    }

    // ---------- iterator() / toList() ----------

    @Test
    public void testIterator_IteratesAllValuesInOrder() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_EmptyValues_NoNext() {
        CSVRecord record = new CSVRecord(null, null, null, 1L); // -> EMPTY_STRING_ARRAY
        Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- putIn() / toMap() ----------

    @Test
    public void testPutIn_PopulatesGivenMap() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> target = new HashMap<String, String>();
        Map<String, String> result = record.putIn(target);

        assertSame(target, result);
        assertEquals("John", result.get("NAME"));
        assertEquals("30", result.get("AGE"));
        assertEquals(2, result.size());
    }

    @Test
    public void testPutIn_EmptyMapping_LoopDoesNotExecute() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = new HashMap<String, Integer>(); // empty -> loop 0 รอบ
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> target = new HashMap<String, String>();
        Map<String, String> result = record.putIn(target);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testToMap_ReturnsPopulatedNewMap() {
        String[] values = {"John", "30"};
        Map<String, Integer> mapping = buildMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> map = record.toMap();
        assertEquals("John", map.get("NAME"));
        assertEquals("30", map.get("AGE"));
        assertEquals(2, map.size());
    }

    @Test
    public void testToMap_EmptyMapping_ReturnsEmptyMap() {
        String[] values = {"John"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> map = record.toMap();
        assertTrue(map.isEmpty());
    }

    // ---------- size() ----------

    @Test
    public void testSize_NonEmptyValues() {
        CSVRecord record = new CSVRecord(new String[] {"a", "b", "c"}, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSize_EmptyValues_Boundary() {
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testSize_NullValues_UsesEmptyArrayBoundary() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_ReflectsValuesArray() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[a, b]", record.toString());
    }

    @Test
    public void testToString_EmptyValues() {
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        assertEquals("[]", record.toString());
    }

    // ---------- values() (package-private) ----------

    @Test
    public void testValues_ReturnsUnderlyingArray() {
        String[] values = {"x", "y"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertArrayEquals(values, record.values());
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_NullValues_UsesEmptyArray | Constructor: `values != null ? values : EMPTY_STRING_ARRAY` (false branch) |
| testConstructor_NonNullValues_UsesGivenArray | Constructor: same ternary (true branch) |
| testGetByIndex_Valid | `get(int)` ปกติ |
| testGetByIndex_OutOfBounds | `get(int)` ArrayIndexOutOfBoundsException ไม่ถูก catch |
| testGetByEnum_Valid | `get(Enum)` เรียกผ่าน `get(String)` |
| testGetByName_NoMapping_ThrowsIllegalStateException | `get(String)`: `mapping == null` -> true |
| testGetByName_NotMapped_ThrowsIllegalArgumentException | `get(String)`: `index == null` -> true |
| testGetByName_Valid | `get(String)`: mapping != null, index != null, try สำเร็จ |
| testGetByName_IndexOutOfValuesLength_ThrowsIllegalArgumentException | `get(String)`: catch `ArrayIndexOutOfBoundsException` branch |
| testGetComment_Null / _NotNull / _EmptyString | `getComment()` ค่าขอบเขต null/ว่าง/มีค่า |
| testGetRecordNumber / _BoundaryZero | `getRecordNumber()` ค่าปกติ/ขอบเขต 0 |
| testIsConsistent_MappingNull_ReturnsTrue | `isConsistent()`: `mapping == null` -> true |
| testIsConsistent_MappingSizeMatchesValuesLength_ReturnsTrue | `isConsistent()`: mapping != null, size == length -> true |
| testIsConsistent_MappingSizeMismatch_ReturnsFalse | `isConsistent()`: mapping != null, size != length -> false |
| testIsMapped_MappingNull_ReturnsFalse | `isMapped()`: `mapping != null ? ... : false` (false branch) |
| testIsMapped_KeyExists_ReturnsTrue | `isMapped()`: true branch, containsKey true |
| testIsMapped_KeyNotExists_ReturnsFalse | `isMapped()`: true branch, containsKey false |
| testIsSet_MappedAndIndexWithinRange_ReturnsTrue | `isSet()`: isMapped true && index < length -> true |
| testIsSet_MappedButIndexOutOfRange_ReturnsFalse | `isSet()`: isMapped true && index >= length -> false |
| testIsSet_NotMapped_ReturnsFalse | `isSet()`: isMapped false (short-circuit) |
| testIsSet_MappingNull_ReturnsFalse | `isSet()` ผ่าน `isMapped()` mapping null |
| testIsSet_BoundaryIndexEqualsLength_ReturnsFalse | `isSet()` ขอบเขต index == length |
| testIterator_IteratesAllValuesInOrder | `iterator()`/`toList()` ค่าปกติ |
| testIterator_EmptyValues_NoNext | `iterator()` กับ array ว่าง (boundary) |
| testPutIn_PopulatesGivenMap | `putIn()` loop ทำงานหลายรอบ |
| testPutIn_EmptyMapping_LoopDoesNotExecute | `putIn()` loop 0 รอบ (boundary) |
| testToMap_ReturnsPopulatedNewMap | `toMap()` ปกติ |
| testToMap_EmptyMapping_ReturnsEmptyMap | `toMap()` mapping ว่าง |
| testSize_NonEmptyValues / _EmptyValues_Boundary / _NullValues_UsesEmptyArrayBoundary | `size()` ค่าปกติ/ขอบเขต 0/ผ่าน constructor null |
| testToString_ReflectsValuesArray / _EmptyValues | `toString()` ปกติ/ขอบเขตว่าง |
| testValues_ReturnsUnderlyingArray | `values()` (package-private) |

**หมายเหตุ:** โค้ดใน `putIn()` ไม่มีการเช็ค `mapping == null` จึงไม่ได้เขียนเทสเรียก `toMap()`/`putIn()` เมื่อ mapping เป็น null เพราะจะเกิด `NullPointerException` ที่ไม่ถูกระบุ behavior ไว้ในซอร์ส (ไม่เดา behavior เพิ่มเติมตามข้อกำหนดที่ 4)