# JUnit 4 Test Suite: XYSeriesTest

ด้านล่างเป็นชุดทดสอบสำหรับคลาส `XYSeries` (Defects4J Chart-5b) ที่พยายามครอบคลุม branch/condition ต่าง ๆ ให้ได้มากที่สุด รวมถึงพยายาม trigger จุดที่อาจเป็น known defect (เกี่ยวกับ `addOrUpdate` เมื่อ `allowDuplicateXValues = true` แต่ `indexOf` เจอ index ที่ไม่เป็นลบ — บั๊กที่เกี่ยวข้องกับ bug 1955483 ตาม comment ในซอร์ส)

```java
package org.jfree.data.xy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;

public class XYSeriesTest {

    private XYSeries series;

    @Before
    public void setUp() {
        series = new XYSeries("Test");
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        XYSeries s = new XYSeries("S1");
        assertTrue(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testConstructorWithAutoSort() {
        XYSeries s = new XYSeries("S2", false);
        assertFalse(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
    }

    @Test
    public void testConstructorFull() {
        XYSeries s = new XYSeries("S3", false, false);
        assertFalse(s.getAutoSort());
        assertFalse(s.getAllowDuplicateXValues());
    }

    // สมมติฐาน: superclass Series ตรวจสอบ key == null และ throw IllegalArgumentException
    // (ไม่มีใน source ของ XYSeries โดยตรง แต่ระบุใน javadoc "key (null not permitted)")
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKey() {
        new XYSeries(null);
    }

    // ---------- getItemCount / getItems ----------

    @Test
    public void testGetItemCountEmpty() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemsUnmodifiable() {
        series.add(1.0, 2.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new XYDataItem(2.0, 3.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getMaximumItemCount / setMaximumItemCount ----------

    @Test
    public void testMaximumItemCountDefault() {
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCountNoRemoval() {
        series.add(1.0, 1.0);
        series.setMaximumItemCount(5);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testSetMaximumItemCountEmptySeriesNoEvent() {
        // dataRemoved == false branch, ไม่มี fireSeriesChanged
        series.setMaximumItemCount(5);
        assertEquals(5, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCountWithRemoval() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        series.setMaximumItemCount(1);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testSetMaximumItemCountZero() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    // ---------- add(XYDataItem, boolean) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        series.add((XYDataItem) null, true);
    }

    @Test
    public void testAddAutoSortInsertNew() {
        XYSeries s = new XYSeries("k", true, true);
        s.add(2.0, 2.0);
        s.add(1.0, 1.0);
        s.add(3.0, 3.0);
        assertEquals(1.0, s.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, s.getX(1).doubleValue(), 0.0001);
        assertEquals(3.0, s.getX(2).doubleValue(), 0.0001);
    }

    @Test
    public void testAddAutoSortDuplicateAllowed_InsertMiddle() {
        XYSeries s = new XYSeries("k", true, true);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
        s.add(2.0, 3.0);
        s.add(1.0, 4.0); // duplicate -> ต้อง insert หลัง 1.0 ตัวเดิมทั้งหมด ก่อน 2.0
        assertEquals(4, s.getItemCount());
        assertEquals(1.0, s.getX(2).doubleValue(), 0.0001);
    }

    @Test
    public void testAddAutoSortDuplicateAllowed_AppendAtEnd() {
        XYSeries s = new XYSeries("k", true, true);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0); // duplicate ของ item ตัวสุดท้าย -> while loop ไปจนถึง size -> append
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getY(1).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAddAutoSortDuplicateNotAllowed() {
        XYSeries s = new XYSeries("k", true, false);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
    }

    @Test
    public void testAddNoAutoSortNoDuplicateNew() {
        XYSeries s = new XYSeries("k", false, false);
        s.add(2.0, 2.0);
        s.add(1.0, 1.0);
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, s.getX(1).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAddNoAutoSortNoDuplicateExisting() {
        XYSeries s = new XYSeries("k", false, false);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
    }

    @Test
    public void testAddNoAutoSortDuplicateAllowed() {
        XYSeries s = new XYSeries("k", false, true);
        s.add(1.0, 1.0);
        s.add(1.0, 2.0);
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testAddExceedsMaximumItemCount() {
        XYSeries s = new XYSeries("k");
        s.setMaximumItemCount(2);
        s.add(1.0, 1.0);
        s.add(2.0, 2.0);
        s.add(3.0, 3.0);
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddNotifyFalse() {
        final boolean[] fired = {false};
        series.addChangeListener(new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                fired[0] = true;
            }
        });
        series.add(1.0, 1.0, false);
        assertFalse(fired[0]);
    }

    @Test
    public void testAddNotifyTrue() {
        final boolean[] fired = {false};
        series.addChangeListener(new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                fired[0] = true;
            }
        });
        series.add(1.0, 1.0, true);
        assertTrue(fired[0]);
    }

    @Test
    public void testAddDoubleDouble() {
        series.add(1.0, 2.0);
        assertEquals(2.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddDoubleNullY() {
        series.add(1.0, (Number) null);
        assertNull(series.getY(0));
    }

    // ---------- delete ----------

    @Test
    public void testDeleteRange() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test
    public void testDeleteSingleItem() {
        series.add(1.0, 1.0);
        series.delete(0, 0);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeleteNoRemovalWhenStartGreaterThanEnd() {
        series.add(1.0, 1.0);
        series.delete(1, 0); // loop ไม่ execute (start > end)
        assertEquals(1, series.getItemCount());
    }

    // ---------- remove ----------

    @Test
    public void testRemoveByIndex() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        XYDataItem removed = series.remove(0);
        assertEquals(1.0, removed.getX().doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveByXValueFound() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        XYDataItem removed = series.remove(new Double(1.0));
        assertEquals(1.0, removed.getX().doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByXValueNotFound() {
        series.add(1.0, 1.0);
        series.remove(new Double(99.0)); // indexOf < 0 -> data.remove(negative) throws
    }

    // ---------- clear ----------

    @Test
    public void testClearWithData() {
        series.add(1.0, 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testClearEmpty() {
        series.clear(); // data.size() == 0 -> ไม่ทำอะไร
        assertEquals(0, series.getItemCount());
    }

    // ---------- getDataItem / getX / getY ----------

    @Test
    public void testGetDataItemXY() {
        series.add(5.0, 6.0);
        XYDataItem item = series.getDataItem(0);
        assertEquals(5.0, item.getX().doubleValue(), 0.0001);
        assertEquals(5.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(6.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItemOutOfBounds() {
        series.getDataItem(0); // empty series
    }

    // ---------- updateByIndex ----------

    @Test
    public void testUpdateByIndex() {
        series.add(1.0, 1.0);
        series.updateByIndex(0, new Double(99.0));
        assertEquals(99.0, series.getY(0).doubleValue(), 0.0001);
    }

    // ---------- update(Number, Number) ----------

    @Test
    public void testUpdateFound() {
        series.add(1.0, 1.0);
        series.update(new Double(1.0), new Double(50.0));
        assertEquals(50.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNotFound() {
        series.add(1.0, 1.0);
        series.update(new Double(99.0), new Double(50.0));
    }

    // ---------- addOrUpdate(double,double) / (Number,Number) ----------

    @Test
    public void testAddOrUpdateDoubleDoubleNew() {
        XYDataItem overwritten = series.addOrUpdate(1.0, 1.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullX() {
        series.addOrUpdate(null, new Double(1.0));
    }

    @Test
    public void testAddOrUpdateOverwriteExisting() {
        XYSeries s = new XYSeries("k", true, false);
        s.add(1.0, 1.0);
        XYDataItem overwritten = s.addOrUpdate(new Double(1.0), new Double(2.0));
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getY().doubleValue(), 0.0001);
        assertEquals(2.0, s.getY(0).doubleValue(), 0.0001);
        assertEquals(1, s.getItemCount());
    }

    /*
     * หมายเหตุ: กรณีนี้อ้างอิงตาม javadoc ว่าเมื่อ allowDuplicateXValues=true
     * addOrUpdate() ควรจะ "add" รายการใหม่เสมอ (ไม่ overwrite) และ overwritten
     * ควรเป็น null อย่างไรก็ตาม อ้างอิง source code จริง เมื่อ indexOf()
     * (ผ่าน Collections.binarySearch) เจอ index ที่ไม่เป็นลบ แต่
     * allowDuplicateXValues=true เงื่อนไข (index>=0 && !allowDuplicateXValues)
     * จะเป็น false และเข้า else-branch ซึ่งคำนวณ data.add(-index-1, item)
     * โดยใช้ index ที่เป็นค่าไม่ลบ (บวก) เป็นค่าที่ผิด อาจทำให้เกิด
     * IndexOutOfBoundsException — นี่คือพฤติกรรมที่เกี่ยวข้องกับ known defect
     * (bug 1955483) ที่ระบุใน source comment ดังนั้น test นี้เขียนขึ้นตาม
     * "พฤติกรรมที่คาดหวังตาม javadoc" เพื่อ "ดักจับ" ข้อบกพร่องดังกล่าว
     */
    @Test
    public void testAddOrUpdateAllowDuplicate_AlwaysInsertsNew() {
        XYSeries s = new XYSeries("k", true, true);
        s.add(1.0, 1.0);
        XYDataItem overwritten = s.addOrUpdate(new Double(1.0), new Double(2.0));
        assertNull(overwritten);
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testAddOrUpdateAutoSortInsertNew() {
        XYSeries s = new XYSeries("k", true, false);
        s.add(1.0, 1.0);
        s.add(3.0, 3.0);
        XYDataItem overwritten = s.addOrUpdate(new Double(2.0), new Double(2.0));
        assertNull(overwritten);
        assertEquals(3, s.getItemCount());
        assertEquals(2.0, s.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateNoAutoSortInsertNew() {
        XYSeries s = new XYSeries("k", false, false);
        s.add(1.0, 1.0);
        XYDataItem overwritten = s.addOrUpdate(new Double(2.0), new Double(2.0));
        assertNull(overwritten);
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateExceedsMaximumItemCount() {
        XYSeries s = new XYSeries("k", true, false);
        s.setMaximumItemCount(2);
        s.add(1.0, 1.0);
        s.add(2.0, 2.0);
        s.addOrUpdate(new Double(3.0), new Double(3.0));
        assertEquals(2, s.getItemCount());
        assertEquals(2.0, s.getX(0).doubleValue(), 0.0001);
    }

    // ---------- indexOf ----------

    @Test
    public void testIndexOfAutoSortFound() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        int idx = series.indexOf(new Double(2.0));
        assertEquals(1, idx);
    }

    @Test
    public void testIndexOfAutoSortNotFound() {
        series.add(1.0, 1.0);
        int idx = series.indexOf(new Double(99.0));
        assertTrue(idx < 0);
    }

    @Test
    public void testIndexOfNoAutoSortFound() {
        XYSeries s = new XYSeries("k", false, true);
        s.add(5.0, 5.0);
        s.add(1.0, 1.0);
        int idx = s.indexOf(new Double(1.0));
        assertEquals(1, idx);
    }

    @Test
    public void testIndexOfNoAutoSortNotFound() {
        XYSeries s = new XYSeries("k", false, true);
        s.add(5.0, 5.0);
        int idx = s.indexOf(new Double(99.0));
        assertEquals(-1, idx);
    }

    // ---------- toArray ----------

    @Test
    public void testToArrayWithNullY() {
        series.add(1.0, (Number) null);
        series.add(2.0, 3.0);
        double[][] arr = series.toArray();
        assertEquals(2, arr.length);
        assertEquals(2, arr[0].length);
        assertTrue(Double.isNaN(arr[1][0]));
        assertEquals(3.0, arr[1][1], 0.0001);
    }

    @Test
    public void testToArrayEmpty() {
        double[][] arr = series.toArray();
        assertEquals(0, arr[0].length);
    }

    // ---------- clone ----------

    @Test
    public void testClone() throws CloneNotSupportedException {
        series.add(1.0, 1.0);
        XYSeries clone = (XYSeries) series.clone();
        assertEquals(series, clone);
        assertNotSame(series, clone);
        clone.add(2.0, 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2, clone.getItemCount());
    }

    // ---------- createCopy ----------

    @Test
    public void testCreateCopy() throws CloneNotSupportedException {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(1.0, copy.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, copy.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateCopyEmptyData() throws CloneNotSupportedException {
        // data.size() == 0 -> if-branch (this.data.size() > 0) เป็น false, loop ไม่ execute
        XYSeries copy = series.createCopy(0, -1);
        assertEquals(0, copy.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(series.equals("not a series"));
    }

    // สมมติฐาน: super.equals() (จาก Series) เปรียบเทียบ key/description ด้วย
    @Test
    public void testEqualsDifferentKey() {
        XYSeries other = new XYSeries("OtherKey");
        assertFalse(series.equals(other));
    }

    @Test
    public void testEqualsDifferentMaximumItemCount() {
        XYSeries s1 = new XYSeries("Test");
        XYSeries s2 = new XYSeries("Test");
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentAutoSort() {
        XYSeries s1 = new XYSeries("Test", true);
        XYSeries s2 = new XYSeries("Test", false);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentAllowDuplicate() {
        XYSeries s1 = new XYSeries("Test", true, true);
        XYSeries s2 = new XYSeries("Test", true, false);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentData() {
        XYSeries s1 = new XYSeries("Test");
        XYSeries s2 = new XYSeries("Test");
        s1.add(1.0, 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsTrue() {
        XYSeries s1 = new XYSeries("Test");
        XYSeries s2 = new XYSeries("Test");
        s1.add(1.0, 1.0);
        s2.add(1.0, 1.0);
        assertTrue(s1.equals(s2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCodeEmpty() {
        // count == 0 -> ทุก if(count>...) เป็น false
        int hc = series.hashCode();
        assertEquals(hc, series.hashCode()); // consistency check
    }

    @Test
    public void testHashCodeOneItem() {
        series.add(1.0, 1.0);
        // count == 1 -> เฉพาะ (count > 0) true, (count>1) false, (count>2) false
        int hc = series.hashCode();
        assertEquals(hc, series.hashCode());
    }

    @Test
    public void testHashCodeTwoItems() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        // count == 2 -> (count>0) true, (count>1) true, (count>2) false
        int hc = series.hashCode();
        assertEquals(hc, series.hashCode());
    }

    @Test
    public void testHashCodeThreeItems() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        // count == 3 -> ทุก if branch เป็น true
        int hc = series.hashCode();
        assertEquals(hc, series.hashCode());
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor / testConstructorWithAutoSort / testConstructorFull | constructor delegation ทั้ง 3 แบบ |
| testConstructorNullKey | สมมติฐาน null key ⇒ IllegalArgumentException (ไม่มีในซอร์ส XYSeries ตรง ๆ) |
| testGetItemCountEmpty / testGetItemsUnmodifiable | getItemCount(), getItems() ค่าปกติ + unmodifiable list |
| testMaximumItemCountDefault / testSetMaximumItemCountNoRemoval / testSetMaximumItemCountEmptySeriesNoEvent / testSetMaximumItemCountWithRemoval / testSetMaximumItemCountZero | while loop เข้า/ไม่เข้า, if(dataRemoved) true/false |
| testAddNullItem | item==null ⇒ throw |
| testAddAutoSortInsertNew | autoSort=true, index<0 (insert ตำแหน่งใหม่) |
| testAddAutoSortDuplicateAllowed_InsertMiddle | autoSort=true, index>=0, allowDuplicate=true, while loop สแกน duplicate, index<size (insert กลาง) |
| testAddAutoSortDuplicateAllowed_AppendAtEnd | while loop ไปจนสุด, index>=size (append) |
| testAddAutoSortDuplicateNotAllowed | autoSort=true, allowDuplicate=false ⇒ throw SeriesException |
| testAddNoAutoSortNoDuplicateNew | autoSort=false, allowDuplicate=false, ไม่พบ index ⇒ add |
| testAddNoAutoSortNoDuplicateExisting | autoSort=false, allowDuplicate=false, พบ index ⇒ throw |
| testAddNoAutoSortDuplicateAllowed | autoSort=false, allowDuplicate=true ⇒ add ตรง ๆ |
| testAddExceedsMaximumItemCount | getItemCount()>max ⇒ remove(0) |
| testAddNotifyFalse / testAddNotifyTrue | notify flag true/false |
| testAddDoubleDouble / testAddDoubleNullY | overload add(double,double)/add(double,Number) พร้อม null y |
| testDeleteRange / testDeleteSingleItem / testDeleteNoRemovalWhenStartGreaterThanEnd | for loop เข้า (หลายรอบ/รอบเดียว) และไม่เข้า (start>end) |
| testRemoveByIndex / testRemoveByXValueFound / testRemoveByXValueNotFound | remove(int), remove(Number) พบ/ไม่พบ (IndexOutOfBoundsException) |
| testClearWithData / testClearEmpty | if(data.size()>0) true/false |
| testGetDataItemXY / testGetDataItemOutOfBounds | ค่าปกติ / out-of-range |
| testUpdateByIndex | updateByIndex ปกติ |
| testUpdateFound / testUpdateNotFound | if(index<0) true/false |
| testAddOrUpdateDoubleDoubleNew | delegate เข้า addOrUpdate(Number,Number) |
| testAddOrUpdateNullX | x==null ⇒ throw |
| testAddOrUpdateOverwriteExisting | index>=0 && !allowDuplicate ⇒ overwrite + clone |
| testAddOrUpdateAllowDuplicate_AlwaysInsertsNew | **กรณีทดสอบ known-defect** (bug 1955483) — index>=0 แต่ allowDuplicate=true |
| testAddOrUpdateAutoSortInsertNew / testAddOrUpdateNoAutoSortInsertNew | else-branch: autoSort true/false (insert ตำแหน่งคำนวณ/ท้าย list) |
| testAddOrUpdateExceedsMaximumItemCount | if(getItemCount()>max) ในเส้นทาง addOrUpdate |
| testIndexOfAutoSortFound / testIndexOfAutoSortNotFound | autoSort=true branch พบ/ไม่พบ |
| testIndexOfNoAutoSortFound / testIndexOfNoAutoSortNotFound | autoSort=false loop พบ/ไม่พบ (-1) |
| testToArrayWithNullY / testToArrayEmpty | if(y!=null) true/false, loop มี/ไม่มีข้อมูล |
| testClone | clone() deep-copy data |
| testCreateCopy / testCreateCopyEmptyData | if(data.size()>0) true/false, for loop |
| testEqualsSameInstance ... testEqualsTrue | ทุก if branch ใน equals() |
| testHashCodeEmpty/OneItem/TwoItems/ThreeItems | if(count>0)/(count>1)/(count>2) ทุก branch |

**หมายเหตุสำคัญ:** เมธอด `testAddOrUpdateAllowDuplicate_AlwaysInsertsNew` เขียนตามพฤติกรรมที่ระบุใน javadoc (ควร insert ใหม่เสมอเมื่อ `allowDuplicateXValues=true`) แต่จาก source code จริงอาจ throw `IndexOutOfBoundsException` เนื่องจาก known defect ที่เกี่ยวข้องกับ bug 1955483 — จึงมีโอกาสสูงที่ test นี้จะ "แดง" (fail) บนโค้ดที่มีบั๊ก ซึ่งตรงตามเป้าหมายของการดักจับ fault