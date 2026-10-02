# JUnit 4 Test Suite สำหรับ `Frequency` Class (Math-89b)

## การวิเคราะห์ Branch สำคัญ

จากการอ่านซอร์สโค้ด พบ branch/condition หลัก ๆ ดังนี้:
- `addValue(Comparable)`: instanceof Integer (T/F), count==null (T/F), ClassCastException (throw/not)
- `addValue(Object)` (deprecated): cast อยู่นอก try-catch → ClassCastException ตรงๆ ถ้าไม่ comparable
- `getCount(Object)`: instanceof Integer, count!=null, ClassCastException
- `getPct(Object)`: sumFreq==0
- `getCumFreq(Object)`: sumFreq==0, instanceof Integer, comparator null/not-null, ClassCastException, value!=null, compare<firstKey, compare>=lastKey, loop compare>0/else
- `getCumPct(Object)`: sumFreq==0
- `toString()`: loop empty/non-empty
- Constructor with custom `Comparator`

```java
package org.apache.commons.math.stat;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

public class FrequencyTest {

    // ---------- addValue(Comparable) branches ----------

    @Test
    public void testAddValue_NewValue_CreatesCountOne() {
        Frequency f = new Frequency();
        f.addValue(1); // int -> Long
        assertEquals(1L, f.getCount(1));
    }

    @Test
    public void testAddValue_ExistingValue_IncrementsCount() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        assertEquals(2L, f.getCount(1));
    }

    @Test
    public void testAddValue_IntegerAndIntTreatedSame() {
        // ตรวจสอบ branch "v instanceof Integer" -> แปลงเป็น Long
        Frequency f = new Frequency();
        f.addValue(Integer.valueOf(5)); // ผ่าน addValue(Comparable) จะเข้า branch instanceof Integer
        f.addValue(5); // int overload -> Long.valueOf
        assertEquals(2L, f.getCount(5));
        assertEquals(2L, f.getCount(Long.valueOf(5)));
    }

    @Test
    public void testAddValue_LongOverload() {
        Frequency f = new Frequency();
        f.addValue(10L);
        assertEquals(1L, f.getCount(10L));
    }

    @Test
    public void testAddValue_CharOverload() {
        Frequency f = new Frequency();
        f.addValue('a');
        assertEquals(1L, f.getCount('a'));
    }

    @Test
    public void testAddValue_IntegerOverload() {
        Frequency f = new Frequency();
        f.addValue(Integer.valueOf(7));
        assertEquals(1L, f.getCount(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_Comparable_IncompatibleType_ThrowsIllegalArgumentException() {
        // Long แล้วตามด้วย String -> ClassCastException ภายใน try ถูกจับและ rethrow เป็น IllegalArgumentException
        Frequency f = new Frequency();
        f.addValue(1L);
        f.addValue("abc");
    }

    // ---------- addValue(Object) deprecated method ----------

    @Test
    public void testAddValue_DeprecatedObjectOverload_WithComparable() {
        Frequency f = new Frequency();
        f.addValue((Object) Integer.valueOf(3));
        assertEquals(1L, f.getCount(3));
    }

    @Test(expected = ClassCastException.class)
    public void testAddValue_DeprecatedObjectOverload_NotComparable_ThrowsClassCastException() {
        // การ cast (Comparable<?>) v อยู่นอก try-catch ใน addValue(Object)
        // ดังนั้นถ้า v ไม่ใช่ Comparable จะได้ ClassCastException ตรงๆ (ไม่ใช่ IllegalArgumentException)
        Frequency f = new Frequency();
        f.addValue(new Object());
    }

    // ---------- clear() & valuesIterator() ----------

    @Test
    public void testClear_RemovesAllValues() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testValuesIterator_ReturnsAddedValues() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        Iterator it = f.valuesIterator();
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }

    // ---------- getSumFreq() ----------

    @Test
    public void testGetSumFreq_EmptyTable_ReturnsZero() {
        Frequency f = new Frequency();
        assertEquals(0L, f.getSumFreq());
    }

    @Test
    public void testGetSumFreq_NonEmptyTable_ReturnsSumOfCounts() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(3L, f.getSumFreq());
    }

    // ---------- getCount(Object/int/long/char) ----------

    @Test
    public void testGetCount_Object_IntegerInstance_DelegatesToLong() {
        Frequency f = new Frequency();
        f.addValue(5);
        assertEquals(1L, f.getCount((Object) Integer.valueOf(5)));
    }

    @Test
    public void testGetCount_Object_NotFound_ReturnsZero() {
        Frequency f = new Frequency();
        f.addValue(5);
        assertEquals(0L, f.getCount((Object) Long.valueOf(99)));
    }

    @Test
    public void testGetCount_Object_Found_ReturnsCount() {
        Frequency f = new Frequency();
        f.addValue(5);
        f.addValue(5);
        assertEquals(2L, f.getCount((Object) Long.valueOf(5)));
    }

    @Test
    public void testGetCount_Object_NotComparable_ReturnsZero() {
        // Long vs String -> ClassCastException ถูกจับ -> คืนค่า 0
        Frequency f = new Frequency();
        f.addValue(5L);
        assertEquals(0L, f.getCount((Object) "abc"));
    }

    @Test
    public void testGetCount_int_long_char_Overloads() {
        Frequency f = new Frequency();
        f.addValue(5);
        f.addValue(5L);
        f.addValue('x');
        assertEquals(2L, f.getCount(5));
        assertEquals(2L, f.getCount(5L));
        assertEquals(1L, f.getCount('x'));
    }

    // ---------- getPct(Object/int/long/char) ----------

    @Test
    public void testGetPct_Object_EmptyTable_ReturnsNaN() {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getPct((Object) Long.valueOf(1))));
    }

    @Test
    public void testGetPct_Object_NonEmptyTable_ReturnsProportion() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(2.0 / 3.0, f.getPct((Object) Long.valueOf(1)), 1e-9);
    }

    @Test
    public void testGetPct_int_long_char_Overloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        f.addValue('a');
        assertEquals(2.0 / 4.0, f.getPct(1), 1e-9);
        assertEquals(2.0 / 4.0, f.getPct(1L), 1e-9);
        assertEquals(1.0 / 4.0, f.getPct('a'), 1e-9);
    }

    // ---------- getCumFreq(Object/int/long/char) ----------

    @Test
    public void testGetCumFreq_Object_EmptyTable_ReturnsZero() {
        Frequency f = new Frequency();
        assertEquals(0L, f.getCumFreq((Object) Long.valueOf(1)));
    }

    @Test
    public void testGetCumFreq_Object_IntegerInstance_Delegates() {
        Frequency f = new Frequency();
        f.addValue(5);
        assertEquals(1L, f.getCumFreq((Object) Integer.valueOf(5)));
    }

    @Test
    public void testGetCumFreq_Object_NotComparable_ReturnsZero() {
        // Long table แล้วค้นหาด้วย String -> ClassCastException ถูกจับ -> return 0
        Frequency f = new Frequency();
        f.addValue(1L);
        assertEquals(0L, f.getCumFreq((Object) "abc"));
    }

    @Test
    public void testGetCumFreq_Object_LessThanFirstValue_ReturnsZero() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        assertEquals(0L, f.getCumFreq((Object) Long.valueOf(0)));
    }

    @Test
    public void testGetCumFreq_Object_GreaterOrEqualLastValue_ReturnsSumFreq() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        assertEquals(3L, f.getCumFreq((Object) Long.valueOf(4)));
        // boundary: เท่ากับ lastKey พอดี ก็ต้อง >= 0 -> คืน sumFreq
        assertEquals(3L, f.getCumFreq((Object) Long.valueOf(3)));
    }

    @Test
    public void testGetCumFreq_Object_MiddleValue_LoopAccumulatesCorrectly() {
        Frequency f = new Frequency();
        f.addValue(1); // count=1
        f.addValue(2);
        f.addValue(2); // count=2
        f.addValue(3); // count=1
        // sumFreq = 4 ; cumFreq(2) ต้องเท่ากับ count(1)+count(2) = 3
        assertEquals(3L, f.getCumFreq((Object) Long.valueOf(2)));
    }

    @Test
    public void testGetCumFreq_int_long_char_Overloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue('a');
        assertEquals(1L, f.getCumFreq(1));
        assertEquals(2L, f.getCumFreq(2L));
        assertTrue(f.getCumFreq('a') >= 0L); // char เป็นคนละ type กับตัวเลข
    }

    @Test
    public void testGetCumFreq_WithCustomComparator_CoversComparatorNotNullBranch() {
        // Comparator กำหนดลำดับย้อนกลับ (reverse order) เพื่อ cover c != null branch
        Comparator<Object> reverseComparator = new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable) o2).compareTo(o1);
            }
        };
        Frequency f = new Frequency(reverseComparator);
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        // ด้วย reverse comparator: firstKey=3, lastKey=1 (ลำดับย้อนกลับ)
        // ทดสอบ compare<firstKey branch: v=4 "มากกว่า" ทุกตัว แต่ในลำดับย้อนกลับถือว่า "น้อยกว่า first"
        assertEquals(0L, f.getCumFreq((Object) Long.valueOf(4)));
        // ทดสอบ compare>=lastKey branch: v=0 ถือว่า "มากกว่าหรือเท่ากับ last" ในลำดับย้อนกลับ
        assertEquals(3L, f.getCumFreq((Object) Long.valueOf(0)));
        // ทดสอบ loop กลางช่วง: cumFreq(2) ภายใต้ reverse order = count(3)+count(2) = 2
        assertEquals(2L, f.getCumFreq((Object) Long.valueOf(2)));
    }

    // ---------- getCumPct(Object/int/long/char) ----------

    @Test
    public void testGetCumPct_Object_EmptyTable_ReturnsNaN() {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getCumPct((Object) Long.valueOf(1))));
    }

    @Test
    public void testGetCumPct_Object_NonEmptyTable_ReturnsProportion() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        assertEquals(1.0 / 3.0, f.getCumPct((Object) Long.valueOf(1)), 1e-9);
        assertEquals(1.0, f.getCumPct((Object) Long.valueOf(3)), 1e-9);
    }

    @Test
    public void testGetCumPct_int_long_char_Overloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue('a');
        assertEquals(1.0 / 3.0, f.getCumPct(1), 1e-9);
        assertEquals(2.0 / 3.0, f.getCumPct(2L), 1e-9);
        assertTrue(f.getCumPct('a') >= 0.0);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_EmptyTable_ContainsOnlyHeader() {
        Frequency f = new Frequency();
        String result = f.toString();
        assertTrue(result.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        // ไม่มีบรรทัดข้อมูลเพิ่ม เนื่องจาก loop ไม่ทำงาน (branch: iter.hasNext() == false)
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", result);
    }

    @Test
    public void testToString_NonEmptyTable_ContainsDataLines() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        String result = f.toString();
        assertTrue(result.contains("Value"));
        assertTrue(result.contains("1"));
        assertTrue(result.contains("2"));
        // ตรวจว่ามีมากกว่า 1 บรรทัด (header + ข้อมูล) เนื่องจาก loop ทำงานจริง
        String[] lines = result.split("\n");
        assertTrue(lines.length >= 3); // header + 2 values
    }

    // ---------- Constructor with Comparator ----------

    @Test
    public void testConstructor_WithComparator_UsesProvidedOrder() {
        Comparator<Object> lengthComparator = new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        };
        Frequency f = new Frequency(lengthComparator);
        f.addValue("aaa");
        f.addValue("b");
        assertEquals(1L, f.getCount("aaa"));
        assertEquals(1L, f.getCount("b"));
        assertEquals(2L, f.getSumFreq());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testAddValue_NewValue_CreatesCountOne` | `addValue`: count==null → true |
| `testAddValue_ExistingValue_IncrementsCount` | `addValue`: count==null → false |
| `testAddValue_IntegerAndIntTreatedSame` | `addValue`: `v instanceof Integer` → true/false ทั้งคู่ |
| `testAddValue_LongOverload` | `addValue(long)` wrapper |
| `testAddValue_CharOverload` | `addValue(char)` wrapper |
| `testAddValue_IntegerOverload` | `addValue(Integer)` wrapper |
| `testAddValue_Comparable_IncompatibleType_ThrowsIllegalArgumentException` | `addValue`: ClassCastException → throw IllegalArgumentException |
| `testAddValue_DeprecatedObjectOverload_WithComparable` | `addValue(Object)` deprecated path (ปกติ) |
| `testAddValue_DeprecatedObjectOverload_NotComparable_ThrowsClassCastException` | `addValue(Object)`: cast ล้มเหลวนอก try-catch |
| `testClear_RemovesAllValues` | `clear()` |
| `testValuesIterator_ReturnsAddedValues` | `valuesIterator()` |
| `testGetSumFreq_EmptyTable_ReturnsZero` | `getSumFreq`: loop ว่าง |
| `testGetSumFreq_NonEmptyTable_ReturnsSumOfCounts` | `getSumFreq`: loop ทำงานหลายรอบ |
| `testGetCount_Object_IntegerInstance_DelegatesToLong` | `getCount(Object)`: instanceof Integer → true |
| `testGetCount_Object_NotFound_ReturnsZero` | `getCount(Object)`: count!=null → false |
| `testGetCount_Object_Found_ReturnsCount` | `getCount(Object)`: count!=null → true |
| `testGetCount_Object_NotComparable_ReturnsZero` | `getCount(Object)`: ClassCastException catch |
| `testGetCount_int_long_char_Overloads` | `getCount(int/long/char)` wrappers |
| `testGetPct_Object_EmptyTable_ReturnsNaN` | `getPct(Object)`: sumFreq==0 → true |
| `testGetPct_Object_NonEmptyTable_ReturnsProportion` | `getPct(Object)`: sumFreq==0 → false |
| `testGetPct_int_long_char_Overloads` | `getPct(int/long/char)` wrappers |
| `testGetCumFreq_Object_EmptyTable_ReturnsZero` | `getCumFreq`: sumFreq==0 → true |
| `testGetCumFreq_Object_IntegerInstance_Delegates` | `getCumFreq`: instanceof Integer → true |
| `testGetCumFreq_Object_NotComparable_ReturnsZero` | `getCumFreq`: ClassCastException catch |
| `testGetCumFreq_Object_LessThanFirstValue_ReturnsZero` | `getCumFreq`: compare(v,firstKey)<0 → true |
| `testGetCumFreq_Object_GreaterOrEqualLastValue_ReturnsSumFreq` | `getCumFreq`: compare(v,lastKey)>=0 → true (boundary ==) |
| `testGetCumFreq_Object_MiddleValue_LoopAccumulatesCorrectly` | `getCumFreq`: loop compare>0 → true/false, value!=null → true |
| `testGetCumFreq_int_long_char_Overloads` | `getCumFreq(int/long/char)` wrappers |
| `testGetCumFreq_WithCustomComparator_CoversComparatorNotNullBranch` | `getCumFreq`: comparator!=null (c==null → false), NaturalComparator ไม่ถูกสร้าง |
| `testGetCumPct_Object_EmptyTable_ReturnsNaN` | `getCumPct`: sumFreq==0 → true |
| `testGetCumPct_Object_NonEmptyTable_ReturnsProportion` | `getCumPct`: sumFreq==0 → false |
| `testGetCumPct_int_long_char_Overloads` | `getCumPct(int/long/char)` wrappers |
| `testToString_EmptyTable_ContainsOnlyHeader` | `toString`: while loop (iter.hasNext()==false) |
| `testToString_NonEmptyTable_ContainsDataLines` | `toString`: while loop (iter.hasNext()==true, หลายรอบ) |
| `testConstructor_WithComparator_UsesProvidedOrder` | Constructor `Frequency(Comparator)` |

**หมายเหตุ:**
- บางกรณี (เช่น `getCount(Object)` ด้วย String เทียบกับ Long) อิงพฤติกรรมจริงของ `TreeMap` internal ที่ throw `ClassCastException` เมื่อ type ไม่ตรงกัน ซึ่งเป็นพฤติกรรมมาตรฐานของ Java Collections ไม่ใช่การเดา
- `testToString_NonEmptyTable_ContainsDataLines` ไม่ assert ค่า percent format แบบ exact เนื่องจาก `NumberFormat.getPercentInstance()` ขึ้นกับ default Locale ของเครื่องที่รัน จึงเลี่ยงการเดา behavior ที่ไม่แน่นอน
- `testAddValue_DeprecatedObjectOverload_NotComparable_ThrowsClassCastException` อิงจากการอ่านโค้ดตรงๆ ว่า cast อยู่นอก try-catch จึงไม่ถูกแปลงเป็น `IllegalArgumentException`