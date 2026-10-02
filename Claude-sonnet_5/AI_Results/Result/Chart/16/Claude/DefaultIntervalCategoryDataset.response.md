# DefaultIntervalCategoryDatasetTest

ด้านล่างเป็นชุดทดสอบ JUnit 4 สำหรับคลาส `DefaultIntervalCategoryDataset` (Defects4J: Chart-16b)
โดยพยายามครอบคลุมทุก if/else, loop, boundary case, null/empty case ที่วิเคราะห์ได้จากซอร์สที่ให้มา

> **หมายเหตุสำคัญ (สมมติฐานที่ระบุไว้ชัดเจน):**
> - ค่า default prefix ของ series/category key มาจาก resource bundle `org.jfree.data.resources.DataPackageResources` ซึ่งจากซอร์ส JFreeChart ที่ทราบกันทั่วไปคือ `"Series"` และ `"Category"` — หากไฟล์ resource ต่างไป การทดสอบกลุ่มนี้อาจ fail และต้องปรับ string ให้ตรงกับไฟล์จริง
> - branch ของ `clone(Number[][] array)` (private static) กรณี `array == null` **ไม่สามารถเข้าถึงได้จาก public API** เพราะเมื่อ `categoryKeys`/`seriesKeys` ไม่เป็น null แล้ว `startData` จะไม่เป็น null ด้วยเสมอ (ตาม logic ของ constructor) — จึงไม่ได้เขียนเทสสำหรับกรณีนี้

```java
package org.jfree.data.category;

import static org.junit.Assert.*;

import java.util.List;

import org.jfree.data.UnknownKeyException;
import org.jfree.data.category.DefaultIntervalCategoryDataset; // ระบุ import ชัดเจนตามข้อกำหนด (แม้จะอยู่ package เดียวกัน)
import org.junit.Before;
import org.junit.Test;

public class DefaultIntervalCategoryDatasetTest {

    private double[][] starts;
    private double[][] ends;
    private DefaultIntervalCategoryDataset dataset;

    @Before
    public void setUp() {
        starts = new double[][] { {1.0, 2.0, 3.0}, {4.0, 5.0, 6.0} };
        ends   = new double[][] { {1.5, 2.5, 3.5}, {4.5, 5.5, 6.5} };
        dataset = new DefaultIntervalCategoryDataset(starts, ends);
    }

    // ================= Constructors =================

    @Test
    public void testDoubleArrayConstructor_basicCounts() {
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(3, dataset.getCategoryCount());
    }

    @Test
    public void testDoubleArrayConstructor_defaultKeys() {
        // สมมติฐาน: default prefix จาก DataPackageResources.properties = "Series"/"Category"
        assertEquals("Series 1", dataset.getSeriesKey(0));
        assertEquals("Series 2", dataset.getSeriesKey(1));
        assertEquals("Category 1", dataset.getColumnKey(0));
        assertEquals("Category 2", dataset.getColumnKey(1));
        assertEquals("Category 3", dataset.getColumnKey(2));
    }

    @Test
    public void testNumberArrayConstructor_withNullStartsEnds() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        assertEquals(0, ds.getSeriesCount());
        assertEquals(0, ds.getCategoryCount());
        assertTrue(ds.getColumnKeys().isEmpty());
        assertTrue(ds.getRowKeys().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testGetColumnCount_whenCategoryKeysNull_throwsNPE() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        ds.getColumnCount(); // categoryKeys == null -> NPE (behavior ตามซอร์ส)
    }

    @Test(expected = NullPointerException.class)
    public void testGetRowCount_whenSeriesKeysNull_throwsNPE() {
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        ds.getRowCount(); // seriesKeys == null -> NPE
    }

    @Test
    public void testConstructor_withZeroSeries() {
        Number[][] emptyStarts = new Number[0][];
        Number[][] emptyEnds = new Number[0][];
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(emptyStarts, emptyEnds);
        assertEquals(0, ds.getSeriesCount());
        assertEquals(0, ds.getCategoryCount());
        assertTrue(ds.getColumnKeys().isEmpty());
        assertTrue(ds.getRowKeys().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_seriesCountMismatch_throws() {
        Number[][] s = new Number[][] { {1.0, 2.0} };
        Number[][] e = new Number[][] { {1.0, 2.0}, {3.0, 4.0} };
        new DefaultIntervalCategoryDataset(s, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_categoryCountMismatch_throws() {
        Number[][] s = new Number[][] { {1.0, 2.0} };
        Number[][] e = new Number[][] { {1.0, 2.0, 3.0} };
        new DefaultIntervalCategoryDataset(s, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_seriesKeysLengthMismatch_throws() {
        Number[][] s = new Number[][] { {1.0, 2.0} };
        Number[][] e = new Number[][] { {1.0, 2.0} };
        Comparable[] seriesKeys = new Comparable[] {"A", "B"}; // ไม่ตรงกับ 1 series
        new DefaultIntervalCategoryDataset(seriesKeys, null, s, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_categoryKeysLengthMismatch_throws() {
        Number[][] s = new Number[][] { {1.0, 2.0} };
        Number[][] e = new Number[][] { {1.0, 2.0} };
        Comparable[] categoryKeys = new Comparable[] {"C1", "C2", "C3"}; // ไม่ตรง 2
        new DefaultIntervalCategoryDataset(null, categoryKeys, s, e);
    }

    @Test
    public void testConstructor_withCustomKeys_succeeds() {
        Number[][] s = new Number[][] { {1.0, 2.0} };
        Number[][] e = new Number[][] { {1.5, 2.5} };
        Comparable[] seriesKeys = new Comparable[] {"S1"};
        Comparable[] categoryKeys = new Comparable[] {"C1", "C2"};
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys, s, e);
        assertEquals("S1", ds.getSeriesKey(0));
        assertEquals("C1", ds.getColumnKey(0));
        assertEquals("C2", ds.getColumnKey(1));
    }

    @Test
    public void testStringNamesConstructor() {
        Number[][] s = new Number[][] { {1.0}, {2.0} };
        Number[][] e = new Number[][] { {1.5}, {2.5} };
        String[] names = new String[] {"Alpha", "Beta"};
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(names, s, e);
        assertEquals("Alpha", ds.getSeriesKey(0));
        assertEquals("Beta", ds.getSeriesKey(1));
    }

    // ================= getSeriesIndex / getSeriesKey =================

    @Test
    public void testGetSeriesIndex_found() {
        assertEquals(0, dataset.getSeriesIndex("Series 1"));
        assertEquals(1, dataset.getSeriesIndex("Series 2"));
    }

    @Test
    public void testGetSeriesIndex_notFound() {
        assertEquals(-1, dataset.getSeriesIndex("Nonexistent"));
    }

    @Test
    public void testGetSeriesKey_valid() {
        assertEquals("Series 1", dataset.getSeriesKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_indexTooHigh() {
        dataset.getSeriesKey(dataset.getSeriesCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_indexNegative() {
        dataset.getSeriesKey(-1);
    }

    // ================= setSeriesKeys =================

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_null_throws() {
        dataset.setSeriesKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_lengthMismatch_throws() {
        dataset.setSeriesKeys(new Comparable[] {"OnlyOne"});
    }

    @Test
    public void testSetSeriesKeys_valid() {
        Comparable[] newKeys = new Comparable[] {"X", "Y"};
        dataset.setSeriesKeys(newKeys);
        assertEquals("X", dataset.getSeriesKey(0));
        assertEquals("Y", dataset.getSeriesKey(1));
    }

    // ================= getCategoryCount / getColumnKeys =================

    @Test
    public void testGetCategoryCount_normal() {
        assertEquals(3, dataset.getCategoryCount());
    }

    @Test
    public void testGetColumnKeys_notNull() {
        List keys = dataset.getColumnKeys();
        assertEquals(3, keys.size());
        assertEquals("Category 1", keys.get(0));
    }

    // ================= setCategoryKeys =================

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_null_throws() {
        dataset.setCategoryKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_lengthMismatch_throws() {
        dataset.setCategoryKeys(new Comparable[] {"C1", "C2"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_containsNull_throws() {
        dataset.setCategoryKeys(new Comparable[] {"C1", null, "C3"});
    }

    @Test
    public void testSetCategoryKeys_valid() {
        Comparable[] newKeys = new Comparable[] {"A", "B", "C"};
        dataset.setCategoryKeys(newKeys);
        assertEquals("A", dataset.getColumnKey(0));
        assertEquals("C", dataset.getColumnKey(2));
    }

    // ================= getValue =================

    @Test
    public void testGetValue_byComparable_valid() {
        Number v = dataset.getValue("Series 1", "Category 1");
        assertEquals(1.5, v.doubleValue(), 0.0001); // getValue -> getEndValue
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_unknownSeries_throws() {
        dataset.getValue("NoSuchSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_unknownCategory_throws() {
        dataset.getValue("Series 1", "NoSuchCategory");
    }

    @Test
    public void testGetValue_byIndex() {
        Number v = dataset.getValue(0, 0);
        assertEquals(1.5, v.doubleValue(), 0.0001);
    }

    // ================= getStartValue =================

    @Test
    public void testGetStartValue_byComparable_valid() {
        Number v = dataset.getStartValue("Series 1", "Category 1");
        assertEquals(1.0, v.doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_unknownSeries_throws() {
        dataset.getStartValue("NoSuchSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_unknownCategory_throws() {
        dataset.getStartValue("Series 1", "NoSuchCategory");
    }

    @Test
    public void testGetStartValue_byIndex_valid() {
        Number v = dataset.getStartValue(1, 2);
        assertEquals(6.0, v.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_seriesNegative_throws() {
        dataset.getStartValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_seriesTooHigh_throws() {
        dataset.getStartValue(dataset.getSeriesCount(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_categoryNegative_throws() {
        dataset.getStartValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_categoryTooHigh_throws() {
        dataset.getStartValue(0, dataset.getCategoryCount());
    }

    // ================= getEndValue =================

    @Test
    public void testGetEndValue_byComparable_valid() {
        Number v = dataset.getEndValue("Series 2", "Category 3");
        assertEquals(6.5, v.doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_unknownSeries_throws() {
        dataset.getEndValue("NoSuchSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_unknownCategory_throws() {
        dataset.getEndValue("Series 1", "NoSuchCategory");
    }

    @Test
    public void testGetEndValue_byIndex_valid() {
        Number v = dataset.getEndValue(0, 0);
        assertEquals(1.5, v.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_seriesNegative_throws() {
        dataset.getEndValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_seriesTooHigh_throws() {
        dataset.getEndValue(dataset.getSeriesCount(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_categoryNegative_throws() {
        dataset.getEndValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_categoryTooHigh_throws() {
        dataset.getEndValue(0, dataset.getCategoryCount());
    }

    // ================= setStartValue / setEndValue =================

    @Test
    public void testSetStartValue_valid() {
        dataset.setStartValue(0, "Category 1", 99.0);
        assertEquals(99.0, dataset.getStartValue(0, 0).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_seriesNegative_throws() {
        dataset.setStartValue(-1, "Category 1", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_seriesTooHigh_throws() {
        dataset.setStartValue(dataset.getSeriesCount(), "Category 1", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_unknownCategory_throws() {
        dataset.setStartValue(0, "NoSuchCategory", 1.0);
    }

    @Test
    public void testSetEndValue_valid() {
        dataset.setEndValue(0, "Category 1", 88.0);
        assertEquals(88.0, dataset.getEndValue(0, 0).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_seriesNegative_throws() {
        dataset.setEndValue(-1, "Category 1", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_seriesTooHigh_throws() {
        dataset.setEndValue(dataset.getSeriesCount(), "Category 1", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_unknownCategory_throws() {
        dataset.setEndValue(0, "NoSuchCategory", 1.0);
    }

    // ================= getCategoryIndex =================

    @Test
    public void testGetCategoryIndex_found() {
        assertEquals(0, dataset.getCategoryIndex("Category 1"));
    }

    @Test
    public void testGetCategoryIndex_notFound() {
        assertEquals(-1, dataset.getCategoryIndex("Nope"));
    }

    // ================= getColumnIndex / getColumnKey =================

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_null_throws() {
        dataset.getColumnIndex(null);
    }

    @Test
    public void testGetColumnIndex_found() {
        assertEquals(1, dataset.getColumnIndex("Category 2"));
    }

    @Test
    public void testGetColumnIndex_notFound() {
        assertEquals(-1, dataset.getColumnIndex("Unknown"));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex_throwsAIOOBE() {
        dataset.getColumnKey(100); // ไม่มี guard ในซอร์ส -> ทดสอบขอบเขต array
    }

    // ================= getRowIndex =================

    @Test
    public void testGetRowIndex_found() {
        assertEquals(0, dataset.getRowIndex("Series 1"));
    }

    @Test
    public void testGetRowIndex_notFound() {
        assertEquals(-1, dataset.getRowIndex("Unknown"));
    }

    // ================= getRowKeys / getRowKey =================

    @Test
    public void testGetRowKeys_notNull() {
        List keys = dataset.getRowKeys();
        assertEquals(2, keys.size());
    }

    @Test
    public void testGetRowKey_valid() {
        assertEquals("Series 1", dataset.getRowKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_tooHigh_throws() {
        dataset.getRowKey(dataset.getRowCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_negative_throws() {
        dataset.getRowKey(-1);
    }

    // ================= getColumnCount / getRowCount =================

    @Test
    public void testGetColumnCount() {
        assertEquals(3, dataset.getColumnCount());
    }

    @Test
    public void testGetRowCount() {
        assertEquals(2, dataset.getRowCount());
    }

    // ================= equals =================

    @Test
    public void testEquals_sameInstance() {
        assertTrue(dataset.equals(dataset));
    }

    @Test
    public void testEquals_differentType() {
        assertFalse(dataset.equals("not a dataset"));
    }

    @Test
    public void testEquals_equalDatasets() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(starts, ends);
        assertTrue(dataset.equals(other));
        assertTrue(other.equals(dataset));
    }

    @Test
    public void testEquals_differentSeriesKeys() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(starts, ends);
        other.setSeriesKeys(new Comparable[] {"X", "Y"});
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentCategoryKeys() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(starts, ends);
        other.setCategoryKeys(new Comparable[] {"X", "Y", "Z"});
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentStartData() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(starts, ends);
        other.setStartValue(0, "Category 1", 999.0);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_differentEndData() {
        DefaultIntervalCategoryDataset other =
                new DefaultIntervalCategoryDataset(starts, ends);
        other.setEndValue(0, "Category 1", 999.0);
        assertFalse(dataset.equals(other));
    }

    @Test
    public void testEquals_bothNullStartData() {
        DefaultIntervalCategoryDataset a =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        DefaultIntervalCategoryDataset b =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_oneNullStartData() {
        DefaultIntervalCategoryDataset a =
                new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        assertFalse(a.equals(dataset));
        assertFalse(dataset.equals(a));
    }

    // ================= clone =================

    @Test
    public void testClone_isEqualButNotSame() throws Exception {
        DefaultIntervalCategoryDataset clone =
                (DefaultIntervalCategoryDataset) dataset.clone();
        assertNotSame(dataset, clone);
        assertTrue(dataset.equals(clone));
    }

    @Test
    public void testClone_deepCopy_startData() throws Exception {
        DefaultIntervalCategoryDataset clone =
                (DefaultIntervalCategoryDataset) dataset.clone();
        clone.setStartValue(0, "Category 1", 12345.0);
        // ต้นฉบับต้องไม่เปลี่ยน (ยืนยัน deep copy ของ startData)
        assertEquals(1.0, dataset.getStartValue(0, 0).doubleValue(), 0.0001);
    }

    @Test(expected = NullPointerException.class)
    public void testClone_whenKeysNull_throwsNPE() throws Exception {
        // กรณี seriesCount == 0 -> seriesKeys/categoryKeys เป็น null
        // -> clone() เรียก this.categoryKeys.clone() จะเกิด NPE
        Number[][] emptyStarts = new Number[0][];
        Number[][] emptyEnds = new Number[0][];
        DefaultIntervalCategoryDataset ds =
                new DefaultIntervalCategoryDataset(emptyStarts, emptyEnds);
        ds.clone();
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเทส | Method เป้าหมาย | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testDoubleArrayConstructor_*` | Constructor(double[][], double[][]) | เส้นทาง delegate ไปยัง Number[][] constructor, การสร้าง default keys |
| `testNumberArrayConstructor_withNullStartsEnds`, `testGetColumnCount/RowCount_whenKeysNull_throwsNPE` | Constructor(Comparable[],...) | `starts != null && ends != null` = false (skip init block) |
| `testConstructor_withZeroSeries` | Constructor | `seriesCount > 0` = false (else: seriesKeys/categoryKeys = null) |
| `testConstructor_seriesCountMismatch_throws` | Constructor | `seriesCount != ends.length` = true |
| `testConstructor_categoryCountMismatch_throws` | Constructor | `categoryCount != ends[0].length` = true |
| `testConstructor_seriesKeysLengthMismatch_throws` | Constructor | `seriesKeys != null` true, length mismatch |
| `testConstructor_categoryKeysLengthMismatch_throws` | Constructor | `categoryKeys != null` true, length mismatch |
| `testConstructor_withCustomKeys_succeeds` | Constructor | `seriesKeys != null` & `categoryKeys != null` ทั้งคู่ผ่าน |
| `testStringNamesConstructor` | Constructor(String[],...) | delegate ผ่าน seriesNames |
| `testGetSeriesIndex_found/notFound` | getSeriesIndex | loop match / loop จบไม่พบ (-1) |
| `testGetSeriesKey_valid/indexTooHigh/indexNegative` | getSeriesKey | boundary `series>=count`, `series<0`, valid |
| `testSetSeriesKeys_null/lengthMismatch/valid` | setSeriesKeys | null check, length check, success path |
| `testGetCategoryCount_normal`, ตัวที่เกี่ยวกับ zero-series | getCategoryCount | `startData!=null` true/false, `getSeriesCount()>0` true/false |
| `testGetColumnKeys_notNull`, (constructor null case) | getColumnKeys | `categoryKeys==null` true/false |
| `testSetCategoryKeys_null/lengthMismatch/containsNull/valid` | setCategoryKeys | null check, length check, loop null-element check, success |
| `testGetValue_*` | getValue(Comparable,..)/(int,int) | seriesIndex<0, itemIndex<0, valid path |
| `testGetStartValue_*` | getStartValue | UnknownKeyException x2, boundary series/category x4, valid |
| `testGetEndValue_*` | getEndValue | เช่นเดียวกับ getStartValue |
| `testSetStartValue_*` / `testSetEndValue_*` | setStartValue/setEndValue | series out-of-range, category not found, success |
| `testGetCategoryIndex_found/notFound` | getCategoryIndex | loop match/ไม่ match |
| `testGetColumnIndex_*` | getColumnIndex | null check, delegate ผลลัพธ์ found/not found |
| `testGetColumnKey_invalidIndex_throwsAIOOBE` | getColumnKey | ขอบเขต array (ไม่มี guard ในซอร์ส) |
| `testGetRowIndex_*` | getRowIndex | delegate ไป getSeriesIndex |
| `testGetRowKeys_notNull`, (constructor null case) | getRowKeys | `seriesKeys==null` true/false |
| `testGetRowKey_*` | getRowKey | boundary `row>=count`, `row<0`, valid |
| `testGetColumnCount/testGetRowCount` | getColumnCount/getRowCount | normal path (NPE case แยกไว้ในกลุ่ม constructor) |
| `testEquals_*` | equals | `obj==this`, `!instanceof`, seriesKeys/categoryKeys/startData/endData ต่างกัน, ทั้งหมดเท่ากัน, ทั้งสอง null, ฝั่งเดียว null |
| `testClone_*` | clone / private equal() / private clone() | deep copy ของ array, keys null -> NPE, ตรวจ equals หลัง clone |

**หมายเหตุ:** บาง branch (เช่น private `clone(Number[][])` กรณี array null) ไม่สามารถถูกกระตุ้นผ่าน public API ได้ในสถานะที่ constructor สร้างขึ้นได้จริง จึงไม่ได้เขียนเทสสำหรับกรณีนั้น เพื่อไม่ให้เดา behavior ที่ไม่มีทางเกิดขึ้นจริง