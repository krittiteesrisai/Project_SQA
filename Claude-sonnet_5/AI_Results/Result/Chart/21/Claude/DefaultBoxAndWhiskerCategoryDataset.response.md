# วิเคราะห์และออกแบบชุดทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `DefaultBoxAndWhiskerCategoryDataset` พบจุดที่ต้องทดสอบหลัก ๆ คือ:

- เมธอด `add(BoxAndWhiskerItem, Comparable, Comparable)` มีเงื่อนไขซับซ้อนหลายจุด (การอัปเดต min/max, การเช็ค null ของ outlier, เงื่อนไข `updateBounds()`)
- **หมายเหตุสำคัญ**: เมธอด `updateBounds()` มี Javadoc ระบุว่า "by iterating over the entire dataset to find the current bounds" แต่โค้ดจริงแค่ set ค่าเป็น `NaN` โดยไม่ได้ iterate ใด ๆ — นี่คือ fault ที่รู้จักกันดีใน Defects4J Chart-21b จึงเขียนเทสเฉพาะเพื่อดักจับ (คาดว่าจะ **fail** บนซอร์สที่ให้มา ซึ่งเป็นพฤติกรรมที่ต้องการ)
- เมธอด getter ที่มี pattern `if (item != null)` ทั้งแบบ index และแบบ key ต้องทดสอบทั้งสองสาขา
- `equals()` มี 3 สาขา (same instance / instanceof true / instanceof false)
- `clone()` ต้อง deep-copy field `data`

**ข้อสมมติที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา** (คอมเมนต์ไว้ในโค้ด):
1. Constructor ของ `BoxAndWhiskerItem` เป็น `BoxAndWhiskerItem(Number, Number, Number, Number, Number, Number, Number, Number, List)`
2. `KeyedObjects2D.getObject(row, col)` คืนค่า `null` เมื่อไม่มีข้อมูลตรง cell นั้น (sparse table)
3. `KeyedObjects2D.addObject(item, null, key)` จะ throw `IllegalArgumentException` เมื่อ key เป็น null

```java
package org.jfree.data.statistics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link DefaultBoxAndWhiskerCategoryDataset}
 * (Defects4J Chart-21b)
 */
public class DefaultBoxAndWhiskerCategoryDatasetTest {

    private DefaultBoxAndWhiskerCategoryDataset dataset;
    private DefaultBoxAndWhiskerCategoryDataset sparseDataset;

    @Before
    public void setUp() {
        this.dataset = new DefaultBoxAndWhiskerCategoryDataset();

        // dataset สำหรับทดสอบ item == null branch (sparse table)
        this.sparseDataset = new DefaultBoxAndWhiskerCategoryDataset();
        List outliers1 = new ArrayList();
        outliers1.add(new Double(100.0));
        this.sparseDataset.add(
                createItem(1.0, 2.0, 1.5, 2.5, 0.5, 3.0,
                        new Double(0.0), new Double(4.0), outliers1),
                "R1", "C1");
        this.sparseDataset.add(
                createItem(10.0, 11.0, 10.5, 11.5, 9.5, 12.0,
                        new Double(9.0), new Double(13.0), new ArrayList()),
                "R2", "C2");
        // (R1,C2) และ (R2,C1) ไม่ถูก set ค่า -> คาดว่า getObject() คืน null (ข้อสมมติ #2)
    }

    /**
     * Helper สำหรับสร้าง BoxAndWhiskerItem
     * (ข้อสมมติ #1: constructor รับ Number ทั้งหมด อนุญาตให้ minOutlier/maxOutlier เป็น null ได้)
     */
    private BoxAndWhiskerItem createItem(double mean, double median, double q1,
            double q3, double minRegular, double maxRegular,
            Double minOutlier, Double maxOutlier, List outliers) {
        return new BoxAndWhiskerItem(new Double(mean), new Double(median),
                new Double(q1), new Double(q3), new Double(minRegular),
                new Double(maxRegular), minOutlier, maxOutlier, outliers);
    }

    private BoxAndWhiskerItem createItem(double mean, double median, double q1,
            double q3, double minRegular, double maxRegular,
            Double minOutlier, Double maxOutlier) {
        return createItem(mean, median, q1, q3, minRegular, maxRegular,
                minOutlier, maxOutlier, new ArrayList());
    }

    // ---------------------------------------------------------------
    // Constructor / initial state
    // ---------------------------------------------------------------

    @Test
    public void testInitialState() {
        assertEquals(0, this.dataset.getRowCount());
        assertEquals(0, this.dataset.getColumnCount());
        assertTrue(Double.isNaN(this.dataset.getRangeLowerBound(true)));
        assertTrue(Double.isNaN(this.dataset.getRangeUpperBound(true)));
        Range r = this.dataset.getRangeBounds(true);
        assertEquals(0.0, r.getLowerBound(), 0.0000001);
        assertEquals(0.0, r.getUpperBound(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // add(BoxAndWhiskerItem, Comparable, Comparable)
    // ---------------------------------------------------------------

    @Test
    public void testAdd_FirstItem_SetsInitialBounds() {
        // isNaN(max) true, isNaN(min) true ; outer if -> false (แถวแรก, index ไม่ตรง -1)
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(1.0), new Double(10.0)), "R1", "C1");
        assertEquals(1.0, this.dataset.getRangeLowerBound(true), 0.0001);
        assertEquals(10.0, this.dataset.getRangeUpperBound(true), 0.0001);
    }

    @Test
    public void testAdd_SecondItem_UpdatesBothBounds() {
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(1.0), new Double(10.0)), "R1", "C1");
        // else-if maxval>max true, else-if minval<min true
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(0.5), new Double(20.0)), "R2", "C2");
        assertEquals(0.5, this.dataset.getRangeLowerBound(true), 0.0001);
        assertEquals(20.0, this.dataset.getRangeUpperBound(true), 0.0001);
    }

    @Test
    public void testAdd_ThirdItem_NoChange() {
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(1.0), new Double(10.0)), "R1", "C1");
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(0.5), new Double(20.0)), "R2", "C2");
        // else-if maxval>max false, else-if minval<min false
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(5.0), new Double(15.0)), "R3", "C3");
        assertEquals(0.5, this.dataset.getRangeLowerBound(true), 0.0001);
        assertEquals(20.0, this.dataset.getRangeUpperBound(true), 0.0001);
    }

    @Test
    public void testAdd_NullOutliers_NoExceptionAndNoBoundsChange() {
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8,
                new Double(1.0), new Double(10.0)), "R1", "C1");
        // item.getMinOutlier()!=null -> false, item.getMaxOutlier()!=null -> false
        this.dataset.add(createItem(5, 5, 4, 6, 2, 8, null, null), "R2", "C2");
        // minval/maxval = NaN -> NaN comparisons เป็น false เสมอ ไม่มีการอัปเดต
        assertEquals(1.0, this.dataset.getRangeLowerBound(true), 0.0001);
        assertEquals(10.0, this.dataset.getRangeUpperBound(true), 0.0001);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_NullItem_ThrowsNPE() {
        // item เป็น null -> item.getMinOutlier() จะ throw NPE
        this.dataset.add((BoxAndWhiskerItem) null, "R1", "C1");
    }

    @Test
    public void testAdd_NullRowKey_ThrowsException() {
        // ข้อสมมติ #3: ไม่แน่ใจ exception type ที่แท้จริงจาก KeyedObjects2D.addObject
        // จึงตรวจสอบว่ามี RuntimeException เกิดขึ้นเมื่อ rowKey เป็น null
        boolean thrown = false;
        try {
            this.dataset.add(createItem(1, 1, 1, 1, 1, 1,
                    new Double(0), new Double(1)), null, "C1");
        } catch (RuntimeException e) {
            thrown = true;
        }
        assertTrue("Expected a RuntimeException for null rowKey", thrown);
    }

    @Test
    public void testAdd_NullColumnKey_ThrowsException() {
        // เช่นเดียวกับด้านบน (ข้อสมมติ #3)
        boolean thrown = false;
        try {
            this.dataset.add(createItem(1, 1, 1, 1, 1, 1,
                    new Double(0), new Double(1)), "R1", null);
        } catch (RuntimeException e) {
            thrown = true;
        }
        assertTrue("Expected a RuntimeException for null columnKey", thrown);
    }

    @Test
    public void testAdd_ListOverload_ComputesStatistics() {
        List values = Arrays.asList(new Double(1), new Double(2), new Double(3),
                new Double(4), new Double(5));
        this.dataset.add(values, "R1", "C1");
        assertNotNull(this.dataset.getItem(0, 0));
        // median ของลิสต์เรียงแล้ว [1,2,3,4,5] ควรเป็นค่ากลาง = 3.0
        assertEquals(3.0, this.dataset.getMedianValue(0, 0).doubleValue(), 0.0001);
    }

    /**
     * *** เทสดักจับ Fault (Chart-21b) ***
     * Javadoc ของ updateBounds() ระบุว่าต้อง "iterate ทั้ง dataset เพื่อหาขอบเขตใหม่"
     * แต่โค้ดจริง set เป็น NaN เฉยๆโดยไม่ iterate -> ทำให้ค่า bound ที่แท้จริงของ cell อื่น ๆ
     * ที่ยังอยู่ใน dataset สูญหายไป เทสนี้คาดหวังผลลัพธ์ที่ "ถูกต้องตามที่ตั้งใจ"
     * ซึ่งควร FAIL บนซอร์สที่ให้มา (แสดงว่าดักจับ fault ได้จริง)
     */
    @Test
    public void testAdd_OverwriteMaxMinCell_ExposesUpdateBoundsBug() {
        // itemA ที่ (R1,C1): min=2.0, max=10.0 -> จะกลายเป็น cached max & min
        this.dataset.add(createItem(5, 5, 4, 6, 1, 9,
                new Double(2.0), new Double(10.0)), "R1", "C1");
        // itemB ที่ (R2,C2): min=5.0, max=8.0 -> ไม่ทำให้ cached bound เปลี่ยน
        this.dataset.add(createItem(5, 5, 4, 6, 1, 9,
                new Double(5.0), new Double(8.0)), "R2", "C2");

        // overwrite cell (R1,C1) ด้วย itemC: min=6.0, max=4.0
        // r,c ของ cell นี้ตรงกับ maximumRangeValueRow/Column และ minimumRangeValueRow/Column เดิม
        // -> เข้าเงื่อนไข updateBounds() ถูกเรียก (สาขา true ของ outer if)
        this.dataset.add(createItem(5, 5, 4, 6, 1, 9,
                new Double(6.0), new Double(4.0)), "R1", "C1");

        // ค่าที่ถูกต้อง (ถ้า updateBounds() ทำงานตาม Javadoc):
        // min ที่แท้จริง = min(itemB.min=5.0, itemC.min=6.0) = 5.0
        // max ที่แท้จริง = max(itemB.max=8.0, itemC.max=4.0) = 8.0
        assertEquals("คาดว่า min ที่แท้จริงคือ 5.0 (พบ fault: updateBounds ไม่ recompute จริง)",
                5.0, this.dataset.getRangeLowerBound(true), 0.0001);
        assertEquals("คาดว่า max ที่แท้จริงคือ 8.0 (พบ fault: updateBounds ไม่ recompute จริง)",
                8.0, this.dataset.getRangeUpperBound(true), 0.0001);
    }

    // ---------------------------------------------------------------
    // getItem / getValue
    // ---------------------------------------------------------------

    @Test
    public void testGetItem() {
        assertNotNull(this.sparseDataset.getItem(0, 0));
        assertNull(this.sparseDataset.getItem(0, 1));
    }

    @Test
    public void testGetValue() {
        assertEquals(2.0, this.dataset2Item("R1", "C1")
                .getMedianValue(0, 0).doubleValue(), 0.0001); // ok placeholder replaced below
    }

    // helper เพื่อลดโค้ดซ้ำสำหรับ getValue test (ใช้ sparseDataset)
    private DefaultBoxAndWhiskerCategoryDataset dataset2Item(String r, String c) {
        return this.sparseDataset;
    }

    @Test
    public void testGetValue_ByIndexAndKey_MedianDelegate() {
        // by index - non null
        assertEquals(2.0, this.sparseDataset.getValue(0, 0).doubleValue(), 0.0001);
        // by index - null item branch
        assertNull(this.sparseDataset.getValue(0, 1));
        // by key - non null
        assertEquals(2.0, this.sparseDataset.getValue("R1", "C1").doubleValue(), 0.0001);
        // by key - null item branch
        assertNull(this.sparseDataset.getValue("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getMeanValue
    // ---------------------------------------------------------------

    @Test
    public void testGetMeanValue() {
        assertEquals(1.0, this.sparseDataset.getMeanValue(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMeanValue(0, 1));
        assertEquals(1.0, this.sparseDataset.getMeanValue("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMeanValue("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getMedianValue
    // ---------------------------------------------------------------

    @Test
    public void testGetMedianValue() {
        assertEquals(2.0, this.sparseDataset.getMedianValue(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMedianValue(0, 1));
        assertEquals(2.0, this.sparseDataset.getMedianValue("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMedianValue("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getQ1Value / getQ3Value
    // ---------------------------------------------------------------

    @Test
    public void testGetQ1Value() {
        assertEquals(1.5, this.sparseDataset.getQ1Value(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getQ1Value(0, 1));
        assertEquals(1.5, this.sparseDataset.getQ1Value("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getQ1Value("R1", "C2"));
    }

    @Test
    public void testGetQ3Value() {
        assertEquals(2.5, this.sparseDataset.getQ3Value(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getQ3Value(0, 1));
        assertEquals(2.5, this.sparseDataset.getQ3Value("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getQ3Value("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getMinRegularValue / getMaxRegularValue
    // ---------------------------------------------------------------

    @Test
    public void testGetMinRegularValue() {
        assertEquals(0.5, this.sparseDataset.getMinRegularValue(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMinRegularValue(0, 1));
        assertEquals(0.5, this.sparseDataset.getMinRegularValue("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMinRegularValue("R1", "C2"));
    }

    @Test
    public void testGetMaxRegularValue() {
        assertEquals(3.0, this.sparseDataset.getMaxRegularValue(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMaxRegularValue(0, 1));
        assertEquals(3.0, this.sparseDataset.getMaxRegularValue("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMaxRegularValue("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getMinOutlier / getMaxOutlier
    // ---------------------------------------------------------------

    @Test
    public void testGetMinOutlier() {
        assertEquals(0.0, this.sparseDataset.getMinOutlier(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMinOutlier(0, 1));
        assertEquals(0.0, this.sparseDataset.getMinOutlier("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMinOutlier("R1", "C2"));
    }

    @Test
    public void testGetMaxOutlier() {
        assertEquals(4.0, this.sparseDataset.getMaxOutlier(0, 0).doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMaxOutlier(0, 1));
        assertEquals(4.0, this.sparseDataset.getMaxOutlier("R1", "C1").doubleValue(), 0.0001);
        assertNull(this.sparseDataset.getMaxOutlier("R1", "C2"));
    }

    // ---------------------------------------------------------------
    // getOutliers
    // ---------------------------------------------------------------

    @Test
    public void testGetOutliers() {
        List outliers = this.sparseDataset.getOutliers(0, 0);
        assertNotNull(outliers);
        assertEquals(1, outliers.size());
        assertEquals(100.0, ((Number) outliers.get(0)).doubleValue(), 0.0001);

        assertNull(this.sparseDataset.getOutliers(0, 1));

        List outliersByKey = this.sparseDataset.getOutliers("R1", "C1");
        assertNotNull(outliersByKey);
        assertEquals(1, outliersByKey.size());

        assertNull(this.sparseDataset.getOutliers("R1", "C2"));

        // item2 มี outliers เป็น list ว่าง (ไม่ null) -> ตรวจสอบ branch item!=null แต่ list ว่าง
        List emptyOutliers = this.sparseDataset.getOutliers(1, 1);
        assertNotNull(emptyOutliers);
        assertEquals(0, emptyOutliers.size());
    }

    // ---------------------------------------------------------------
    // Row/Column key & index accessors, counts
    // ---------------------------------------------------------------

    @Test
    public void testColumnAndRowKeyAccessors() {
        assertEquals(0, this.sparseDataset.getColumnIndex("C1"));
        assertEquals(1, this.sparseDataset.getColumnIndex("C2"));
        assertEquals("C1", this.sparseDataset.getColumnKey(0));
        assertEquals(2, this.sparseDataset.getColumnKeys().size());

        assertEquals(0, this.sparseDataset.getRowIndex("R1"));
        assertEquals(1, this.sparseDataset.getRowIndex("R2"));
        assertEquals("R1", this.sparseDataset.getRowKey(0));
        assertEquals(2, this.sparseDataset.getRowKeys().size());
    }

    @Test
    public void testRowAndColumnCount() {
        assertEquals(2, this.sparseDataset.getRowCount());
        assertEquals(2, this.sparseDataset.getColumnCount());
        assertEquals(0, this.dataset.getRowCount());
        assertEquals(0, this.dataset.getColumnCount());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameInstance() {
        assertTrue(this.dataset.equals(this.dataset));
    }

    @Test
    public void testEquals_EqualData() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6,
                new Double(0), new Double(10));
        DefaultBoxAndWhiskerCategoryDataset d1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset d2 = new DefaultBoxAndWhiskerCategoryDataset();
        d1.add(item, "R1", "C1");
        d2.add(item, "R1", "C1");
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));
    }

    @Test
    public void testEquals_DifferentData() {
        BoxAndWhiskerItem item = createItem(1, 2, 3, 4, 5, 6,
                new Double(0), new Double(10));
        DefaultBoxAndWhiskerCategoryDataset d1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset d2 = new DefaultBoxAndWhiskerCategoryDataset();
        d1.add(item, "R1", "C1");
        // d2 ไม่มีข้อมูล -> ต่างกัน
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(this.dataset.equals("not a dataset"));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(this.dataset.equals(null));
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testClone_IndependentCopy() throws CloneNotSupportedException {
        this.dataset.add(createItem(1, 2, 3, 4, 5, 6,
                new Double(0), new Double(10)), "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset clone =
                (DefaultBoxAndWhiskerCategoryDataset) this.dataset.clone();

        assertNotSame(this.dataset, clone);
        assertTrue(this.dataset.equals(clone));

        // เพิ่มข้อมูลใน clone แล้วตรวจสอบว่า original ไม่ถูกกระทบ (data field ถูก clone จริง)
        clone.add(createItem(1, 2, 3, 4, 5, 6,
                new Double(0), new Double(10)), "R2", "C2");
        assertEquals(1, this.dataset.getRowCount());
        assertEquals(2, clone.getRowCount());
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInitialState` | ค่าเริ่มต้นจาก constructor (NaN, Range(0,0)) |
| `testAdd_FirstItem_SetsInitialBounds` | `isNaN(max)`=true, `isNaN(min)`=true, outer-if=false |
| `testAdd_SecondItem_UpdatesBothBounds` | `else-if maxval>max`=true, `else-if minval<min`=true |
| `testAdd_ThirdItem_NoChange` | `else-if maxval>max`=false, `else-if minval<min`=false |
| `testAdd_NullOutliers_NoExceptionAndNoBoundsChange` | `getMinOutlier()!=null`=false, `getMaxOutlier()!=null`=false, NaN comparisons |
| `testAdd_NullItem_ThrowsNPE` | item เป็น null -> NPE |
| `testAdd_NullRowKey_ThrowsException` | null rowKey (unverified exception type, commented) |
| `testAdd_NullColumnKey_ThrowsException` | null columnKey (unverified, commented) |
| `testAdd_ListOverload_ComputesStatistics` | `add(List,...)` overload |
| `testAdd_OverwriteMaxMinCell_ExposesUpdateBoundsBug` | outer-if=true (updateBounds ถูกเรียก) — **fault-detecting test** |
| `testGetItem` | `getItem` non-null/null |
| `testGetValue_ByIndexAndKey_MedianDelegate` | `getValue` delegate ทั้ง 2 overload, null/non-null |
| `testGetMeanValue` | `item!=null` true/false ทั้ง index/key |
| `testGetMedianValue` | เช่นเดียวกัน |
| `testGetQ1Value` / `testGetQ3Value` | เช่นเดียวกัน |
| `testGetMinRegularValue` / `testGetMaxRegularValue` | เช่นเดียวกัน |
| `testGetMinOutlier` / `testGetMaxOutlier` | เช่นเดียวกัน |
| `testGetOutliers` | null item, non-null พร้อม list, list ว่าง |
| `testColumnAndRowKeyAccessors` | getColumnIndex/Key/Keys, getRowIndex/Key/Keys |
| `testRowAndColumnCount` | getRowCount/getColumnCount กรณีมี/ไม่มีข้อมูล |
| `testEquals_SameInstance` | `obj == this` = true |
| `testEquals_EqualData` | instanceof=true, data equal |
| `testEquals_DifferentData` | instanceof=true, data ไม่ equal |
| `testEquals_DifferentType` | instanceof=false |
| `testEquals_Null` | obj=null -> instanceof=false |
| `testClone_IndependentCopy` | `clone()` deep copy field `data` |

**ข้อควรทราบ**: เทส `testAdd_OverwriteMaxMinCell_ExposesUpdateBoundsBug` ถูกออกแบบให้ **ล้มเหลว (FAIL)** บนซอร์ส Chart-21b ที่ให้มา เนื่องจากเป็นการดักจับ fault จริงของเมธอด `updateBounds()` ที่ไม่ได้ recompute ค่าตาม Javadoc — ตรงตามข้อกำหนดที่ต้องการชุดทดสอบที่ "มีโอกาสดักจับ fault ได้จริง"