以下คือชุดทดสอบ JUnit 4 สำหรับคลาส `CSVRecord` (Csv-9b) โดยวางไฟล์ทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`org.apache.commons.csv`) เพื่อให้สามารถเรียกใช้ constructor และ method ที่เป็น package-private (`putIn`, `values()`) ได้โดยตรง

```java
package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    // enum สำหรับทดสอบ get(Enum)
    private enum Header {
        FIRST, SECOND
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructorWithNullValuesUsesEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
        assertArrayEquals(new String[0], record.values());
    }

    @Test
    public void testConstructorWithValues() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(3, record.size());
        assertArrayEquals(values, record.values());
    }

    // ---------- get(int) ----------

    @Test
    public void testGetIntBoundaryFirstAndLast() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("c", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetIntOutOfBoundsThrows() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(2); // index == length -> out of bounds
    }

    // ---------- get(Enum) ----------

    @Test
    public void testGetEnumDelegatesToGetString() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("FIRST", 0);
        mapping.put("SECOND", 1);
        String[] values = {"v1", "v2"};
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("v1", record.get(Header.FIRST));
        assertEquals("v2", record.get(Header.SECOND));
    }

    // ---------- get(String) ----------

    @Test(expected = IllegalStateException.class)
    public void testGetStringNullMappingThrowsIllegalState() {
        String[] values = {"a"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("anything");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStringUnmappedNameThrowsIllegalArgument() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        String[] values = {"a"};
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("NOT_EXIST");
    }

    @Test
    public void testGetStringValidMapping() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        String[] values = {"x", "y"};
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("x", record.get("A"));
        assertEquals("y", record.get("B"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStringIndexOutOfValuesRangeThrowsIllegalArgument() {
        // mapping มี index ที่เกินขนาดของ values array -> เข้า catch(ArrayIndexOutOfBoundsException)
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 5);
        String[] values = {"x", "y"}; // length = 2, index 5 เกินขอบเขต
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("A");
    }

    // ---------- getComment() ----------

    @Test
    public void testGetCommentNull() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetCommentNonNull() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, "my comment", 1L);
        assertEquals("my comment", record.getComment());
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    // ---------- isConsistent() ----------

    @Test
    public void testIsConsistentTrueWhenMappingNull() {
        CSVRecord record = new CSVRecord(new String[]{"a", "b"}, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentTrueWhenSizeMatches() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        CSVRecord record = new CSVRecord(new String[]{"x", "y"}, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentFalseWhenSizeMismatch() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        // values length ไม่ตรงกับ mapping.size()
        CSVRecord record = new CSVRecord(new String[]{"x"}, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    // ---------- isMapped() ----------

    @Test
    public void testIsMappedFalseWhenMappingNull() {
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 1L);
        assertFalse(record.isMapped("A"));
    }

    @Test
    public void testIsMappedTrueAndFalseWithMapping() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        CSVRecord record = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertTrue(record.isMapped("A"));
        assertFalse(record.isMapped("B"));
    }

    // ---------- isSet() ----------

    @Test
    public void testIsSetFalseWhenNotMapped() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        CSVRecord record = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertFalse(record.isSet("B")); // isMapped=false -> short-circuit false
    }

    @Test
    public void testIsSetTrueWhenMappedAndIndexWithinRange() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        CSVRecord record = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertTrue(record.isSet("A"));
    }

    @Test
    public void testIsSetFalseWhenMappedButIndexOutOfRange() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        // values ว่าง -> index(0) ไม่ < values.length(0)
        CSVRecord record = new CSVRecord(new String[0], mapping, null, 1L);
        assertFalse(record.isSet("A"));
    }

    // ---------- iterator() ----------

    @Test
    public void testIteratorReturnsAllValuesInOrder() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        List<String> collected = new ArrayList<String>();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        assertEquals(3, collected.size());
        assertEquals("a", collected.get(0));
        assertEquals("b", collected.get(1));
        assertEquals("c", collected.get(2));
    }

    @Test
    public void testIteratorOnEmptyValues() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- putIn() (package-private) ----------

    @Test
    public void testPutInPutsOnlyColumnsWithinRange() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        mapping.put("C", 5); // index เกิน values.length -> ต้องถูกข้าม (skip)
        String[] values = {"x", "y"};
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> result = record.putIn(new HashMap<String, String>());

        assertEquals(2, result.size());
        assertEquals("x", result.get("A"));
        assertEquals("y", result.get("B"));
        assertFalse(result.containsKey("C"));
    }

    // ---------- size() ----------

    @Test
    public void testSizeReflectsValuesLength() {
        CSVRecord record = new CSVRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSizeZeroWhenValuesNull() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    // ---------- toMap() ----------

    @Test
    public void testToMapWithFullMapping() {
        Map<String, Integer> mapping = new LinkedHashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        String[] values = {"1", "2"};
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> map = record.toMap();
        assertEquals(2, map.size());
        assertEquals("1", map.get("A"));
        assertEquals("2", map.get("B"));
    }

    @Test(expected = NullPointerException.class)
    public void testToMapThrowsWhenMappingNull() {
        // putIn ไม่มีการ null-check mapping -> ควร NPE เมื่อ mapping เป็น null
        CSVRecord record = new CSVRecord(new String[]{"a"}, null, null, 1L);
        record.toMap();
    }

    // ---------- toString() ----------

    @Test
    public void testToStringMatchesArraysToString() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(java.util.Arrays.toString(values), record.toString());
    }

    @Test
    public void testToStringEmptyValues() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    // ---------- values() (package-private) ----------

    @Test
    public void testValuesReturnsSameReferenceArray() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertSame(values, record.values());
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithNullValuesUsesEmptyArray` | Constructor: `values != null ? values : EMPTY_STRING_ARRAY` → false branch (values==null) |
| `testConstructorWithValues` | Constructor: true branch (values!=null) |
| `testGetIntBoundaryFirstAndLast` | `get(int)` boundary index แรก/สุดท้าย |
| `testGetIntOutOfBoundsThrows` | `get(int)` index เกินขอบ → AIOOBE |
| `testGetEnumDelegatesToGetString` | `get(Enum)` → เรียก `get(String)` |
| `testGetStringNullMappingThrowsIllegalState` | `get(String)`: `mapping == null` → true branch |
| `testGetStringUnmappedNameThrowsIllegalArgument` | `get(String)`: `index == null` → true branch |
| `testGetStringValidMapping` | `get(String)`: try-block สำเร็จ (ไม่เข้า catch) |
| `testGetStringIndexOutOfValuesRangeThrowsIllegalArgument` | `get(String)`: catch(ArrayIndexOutOfBoundsException) branch |
| `testGetCommentNull` / `testGetCommentNonNull` | `getComment()` ค่า null/non-null |
| `testGetRecordNumber` | `getRecordNumber()` |
| `testIsConsistentTrueWhenMappingNull` | `isConsistent()`: `mapping == null` → true (short-circuit) |
| `testIsConsistentTrueWhenSizeMatches` | `isConsistent()`: `mapping.size() == values.length` → true |
| `testIsConsistentFalseWhenSizeMismatch` | `isConsistent()`: size mismatch → false |
| `testIsMappedFalseWhenMappingNull` | `isMapped()`: `mapping != null` → false (short-circuit) |
| `testIsMappedTrueAndFalseWithMapping` | `isMapped()`: `containsKey` true/false |
| `testIsSetFalseWhenNotMapped` | `isSet()`: `isMapped()` false → short-circuit false |
| `testIsSetTrueWhenMappedAndIndexWithinRange` | `isSet()`: mapped true และ index < values.length → true |
| `testIsSetFalseWhenMappedButIndexOutOfRange` | `isSet()`: mapped true แต่ index >= values.length → false |
| `testIteratorReturnsAllValuesInOrder` | `iterator()` วนซ้ำค่าที่มีอยู่ |
| `testIteratorOnEmptyValues` | `iterator()` กรณี array ว่าง (loop ไม่ทำงาน) |
| `testPutInPutsOnlyColumnsWithinRange` | `putIn()`: for-loop, `col < values.length` true/false branch |
| `testSizeReflectsValuesLength` / `testSizeZeroWhenValuesNull` | `size()` ค่าปกติ/ค่าศูนย์ |
| `testToMapWithFullMapping` | `toMap()` เรียก `putIn()` สำเร็จ |
| `testToMapThrowsWhenMappingNull` | `toMap()`/`putIn()` เมื่อ mapping เป็น null (NPE จาก `mapping.entrySet()`) |
| `testToStringMatchesArraysToString` / `testToStringEmptyValues` | `toString()` ค่าปกติ/ค่าว่าง |
| `testValuesReturnsSameReferenceArray` | `values()` ตรวจสอบว่า reference เดียวกัน |

**หมายเหตุ:** 
- เคส `testToMapThrowsWhenMappingNull` อ้างอิงจาก behavior ที่มีอยู่จริงในซอร์ส (ไม่มีการ null-check ใน `putIn()` ก่อนเรียก `mapping.entrySet()`) จึงคาดว่าจะเกิด `NullPointerException` — เป็นการทดสอบพฤติกรรมจริงของโค้ด ไม่ใช่การเดา
- ไม่มีการทดสอบ behavior ของ `CSVFormat#getNullString()` เนื่องจากไม่มีอยู่ในซอร์สโค้ดที่ให้มา (ตาม comment ใน Javadoc แต่ไม่ปรากฏ logic จริงในคลาสนี้)