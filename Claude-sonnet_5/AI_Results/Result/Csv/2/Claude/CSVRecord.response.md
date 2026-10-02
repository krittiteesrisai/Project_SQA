## การวิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `CSVRecord` มีจุดตัดสินใจ (branch) หลักดังนี้:

- **Constructor**: `values != null ? values : EMPTY_STRING_ARRAY`
- **get(String)**: `mapping == null` throw exception, และ `index != null ? values[index] : null`
- **isConsistent()**: `mapping == null ? true : mapping.size() == values.length`
- **isMapped(String)**: `mapping != null ? mapping.containsKey(name) : false`
- **isSet(String)**: `isMapped(name) && mapping.get(name).intValue() < values.length`

เนื่องจาก constructor เป็น package-private จึงต้องวาง test class ไว้ใน package `org.apache.commons.csv` เดียวกัน

```java
package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link CSVRecord}.
 * Tests aim to maximize branch/condition coverage.
 */
public class CSVRecordTest {

    // ---------- Constructor: values != null ? values : EMPTY_STRING_ARRAY ----------

    @Test
    public void testConstructor_withNullValues_usesEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
        assertArrayEquals(new String[0], record.values());
    }

    @Test
    public void testConstructor_withNonNullValues_usesProvidedArray() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(3, record.size());
        assertArrayEquals(values, record.values());
    }

    @Test
    public void testConstructor_withEmptyArray() {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(0, record.size());
    }

    // ---------- get(int) ----------

    @Test
    public void testGetByIndex_validIndex() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("c", record.get(2));
    }

    @Test
    public void testGetByIndex_boundaryFirstAndLast() {
        String[] values = {"x", "y", "z"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("x", record.get(0));
        assertEquals("z", record.get(values.length - 1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_outOfBounds_throwsException() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5); // index เกินขอบเขต -> คาดหวัง exception
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_negativeIndex_throwsException() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(-1);
    }

    // ---------- get(String) ----------

    @Test(expected = IllegalStateException.class)
    public void testGetByName_nullMapping_throwsIllegalStateException() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("colA"); // mapping == null -> ต้อง throw
    }

    @Test
    public void testGetByName_existingKey_returnsValue() {
        String[] values = {"val1", "val2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        mapping.put("colB", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("val1", record.get("colA"));
        assertEquals("val2", record.get("colB"));
    }

    @Test
    public void testGetByName_nonExistingKey_returnsNull() {
        String[] values = {"val1", "val2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.get("colX")); // key ไม่มีใน mapping -> null
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByName_mappingIndexOutOfBounds_throwsException() {
        // มี mapping ชี้ index ที่เกินขนาด values -> ตรวจสอบว่า throw จริง (ไม่ handle exception)
        String[] values = {"val1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 5); // index เกิน values.length
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("colA");
    }

    // ---------- isConsistent() ----------

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeEqualsValuesLength_returnsTrue() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        mapping.put("colB", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeNotEqualsValuesLength_returnsFalse() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    // ---------- isMapped(String) ----------

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        String[] values = {"a"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isMapped("colA"));
    }

    @Test
    public void testIsMapped_mappingContainsKey_returnsTrue() {
        String[] values = {"a"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isMapped("colA"));
    }

    @Test
    public void testIsMapped_mappingDoesNotContainKey_returnsFalse() {
        String[] values = {"a"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isMapped("colX"));
    }

    // ---------- isSet(String) ----------

    @Test
    public void testIsSet_notMapped_returnsFalse() {
        String[] values = {"a"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("colX")); // isMapped == false -> short-circuit false
    }

    @Test
    public void testIsSet_mappedAndIndexWithinBounds_returnsTrue() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isSet("colA")); // index 1 < values.length(2)
    }

    @Test
    public void testIsSet_mappedButIndexOutOfBounds_returnsFalse() {
        String[] values = {"a"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("colA", 5); // index >= values.length
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("colA"));
    }

    @Test
    public void testIsSet_nullMapping_returnsFalse() {
        String[] values = {"a"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isSet("colA")); // isMapped(null mapping)==false
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_iteratesOverValues() {
        String[] values = {"x", "y", "z"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertEquals("y", it.next());
        assertEquals("z", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_emptyValues_noElements() {
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- values() ----------

    @Test
    public void testValues_returnsUnderlyingArray() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertArrayEquals(values, record.values());
    }

    // ---------- getComment() ----------

    @Test
    public void testGetComment_nullComment_returnsNull() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetComment_nonNullComment_returnsComment() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, "this is a comment", 1L);
        assertEquals("this is a comment", record.getComment());
    }

    @Test
    public void testGetComment_emptyStringComment() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, "", 1L);
        assertEquals("", record.getComment());
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber_zero() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 0L);
        assertEquals(0L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_positiveValue() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_maxLongBoundary() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, record.getRecordNumber());
    }

    // ---------- size() ----------

    @Test
    public void testSize_withValues() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSize_withEmptyValues() {
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testSize_withNullValues() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_withValues() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[a, b, c]", record.toString());
    }

    @Test
    public void testToString_withEmptyValues() {
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        assertEquals("[]", record.toString());
    }

    @Test
    public void testToString_withNullValues() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals("[]", record.toString());
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_withNullValues_usesEmptyArray` | Constructor: `values == null` → ใช้ `EMPTY_STRING_ARRAY` |
| `testConstructor_withNonNullValues_usesProvidedArray` | Constructor: `values != null` → ใช้ array ที่ส่งมา |
| `testConstructor_withEmptyArray` | Constructor: boundary array ว่างที่ไม่ใช่ null |
| `testGetByIndex_validIndex` | `get(int)` กรณี index ปกติ |
| `testGetByIndex_boundaryFirstAndLast` | `get(int)` boundary index แรก/สุดท้าย |
| `testGetByIndex_outOfBounds_throwsException` | `get(int)` index เกินขอบเขต → Exception |
| `testGetByIndex_negativeIndex_throwsException` | `get(int)` index ติดลบ → Exception |
| `testGetByName_nullMapping_throwsIllegalStateException` | `get(String)`: `mapping == null` branch |
| `testGetByName_existingKey_returnsValue` | `get(String)`: `index != null` → true branch |
| `testGetByName_nonExistingKey_returnsNull` | `get(String)`: `index != null` → false branch (null) |
| `testGetByName_mappingIndexOutOfBounds_throwsException` | `get(String)` เมื่อ mapping index เกิน values.length (fault-detect) |
| `testIsConsistent_nullMapping_returnsTrue` | `isConsistent()`: `mapping == null` → true |
| `testIsConsistent_mappingSizeEqualsValuesLength_returnsTrue` | `isConsistent()`: ขนาดตรงกัน → true |
| `testIsConsistent_mappingSizeNotEqualsValuesLength_returnsFalse` | `isConsistent()`: ขนาดไม่ตรงกัน → false |
| `testIsMapped_nullMapping_returnsFalse` | `isMapped()`: `mapping != null` → false branch |
| `testIsMapped_mappingContainsKey_returnsTrue` | `isMapped()`: `containsKey` → true |
| `testIsMapped_mappingDoesNotContainKey_returnsFalse` | `isMapped()`: `containsKey` → false |
| `testIsSet_notMapped_returnsFalse` | `isSet()`: short-circuit `isMapped() == false` |
| `testIsSet_mappedAndIndexWithinBounds_returnsTrue` | `isSet()`: ทั้งสองเงื่อนไขเป็น true |
| `testIsSet_mappedButIndexOutOfBounds_returnsFalse` | `isSet()`: `isMapped()==true` แต่ index เกิน → false |
| `testIsSet_nullMapping_returnsFalse` | `isSet()` ผ่าน `isMapped()` เมื่อ mapping null |
| `testIterator_iteratesOverValues` | `iterator()` การวนซ้ำค่าปกติ |
| `testIterator_emptyValues_noElements` | `iterator()` กรณี values ว่าง |
| `testValues_returnsUnderlyingArray` | `values()` คืน array ตรง reference |
| `testGetComment_nullComment_returnsNull` | `getComment()` กรณี comment null |
| `testGetComment_nonNullComment_returnsComment` | `getComment()` กรณี comment มีค่า |
| `testGetComment_emptyStringComment` | `getComment()` boundary string ว่าง |
| `testGetRecordNumber_zero` | `getRecordNumber()` boundary 0 |
| `testGetRecordNumber_positiveValue` | `getRecordNumber()` ค่าปกติ |
| `testGetRecordNumber_maxLongBoundary` | `getRecordNumber()` boundary Long.MAX_VALUE |
| `testSize_withValues` | `size()` ค่าปกติ |
| `testSize_withEmptyValues` | `size()` boundary array ว่าง |
| `testSize_withNullValues` | `size()` ค่าจาก null values (ผ่าน EMPTY_STRING_ARRAY) |
| `testToString_withValues` | `toString()` รูปแบบ Arrays.toString ปกติ |
| `testToString_withEmptyValues` | `toString()` boundary array ว่าง |
| `testToString_withNullValues` | `toString()` กรณีสร้างจาก null values |

**หมายเหตุ**: 
- ทดสอบ `testGetByName_mappingIndexOutOfBounds_throwsException` เป็นการตรวจสอบพฤติกรรมที่ไม่มี bounds-check ใน `get(String)` — เป็นไปตามซอร์สโค้ดจริง (ไม่ใช่การเดา)
- ไม่มีการทดสอบ constructor กับ `mapping` ที่เป็น non-Map ผิดปกติ เนื่องจากไม่มี logic เพิ่มเติมในซอร์สที่ต้องทดสอบเกินจากที่ระบุ