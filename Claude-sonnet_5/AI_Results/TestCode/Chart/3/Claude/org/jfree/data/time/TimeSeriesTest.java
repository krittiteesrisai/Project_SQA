package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link TimeSeries} (Defects4J Chart-3b).
 *
 * หมายเหตุสมมติฐานที่ใช้ (เนื่องจากไม่มีซอร์สโค้ดของคลาสเหล่านี้ให้ตรวจสอบ):
 *  - Year.getSerialIndex() คืนค่าปีตัวเลขตรง ๆ (ใช้เฉพาะเพื่อคำนวณผลลัพธ์ที่คาดหวังใน
 *    การทดสอบ removeAgedItems / setMaximumItemAge)
 *  - Series (superclass) .equals()/.hashCode() ทำงานตามปกติ (เทียบ key เป็นหลัก)
 *  - TimeSeriesDataItem.equals()/compareTo() เทียบตาม period (และ value สำหรับ equals)
 */
public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    // ===================== Constructors =====================

    @Test
    public void testDefaultConstructorDescriptions() {
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testConstructorWithDomainRange() {
        TimeSeries s = new TimeSeries("s", "Dom", "Ran");
        assertEquals("Dom", s.getDomainDescription());
        assertEquals("Ran", s.getRangeDescription());
    }

    // ===================== domain/range description =====================

    @Test
    public void testSetDomainDescription() {
        series.setDomainDescription("MyDomain");
        assertEquals("MyDomain", series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() {
        series.setRangeDescription("MyRange");
        assertEquals("MyRange", series.getRangeDescription());
    }

    // ===================== getItems =====================

    @Test
    public void testGetItemsIsUnmodifiable() {
        series.add(new Year(2000), 1.0);
        List items = series.getItems();
        try {
            items.add(new TimeSeriesDataItem(new Year(2001), 2.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ===================== maximumItemCount =====================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegativeThrows() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountTruncatesOldest() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2003), 4.0);
        series.add(new Year(2004), 5.0);
        series.setMaximumItemCount(3);
        assertEquals(3, series.getItemCount());
        assertEquals(new Year(2002), series.getTimePeriod(0));
        assertEquals(new Year(2004), series.getTimePeriod(2));
    }

    @Test
    public void testSetMaximumItemCountNoTruncationNeeded() {
        series.add(new Year(2000), 1.0);
        series.setMaximumItemCount(5); // count(1) not > maximum(5): delete branch skipped
        assertEquals(1, series.getItemCount());
    }

    // ===================== maximumItemAge =====================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegativeThrows() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAgeRemovesOldItems() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2003), 4.0);
        series.setMaximumItemAge(1);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2002), series.getTimePeriod(0));
        assertEquals(new Year(2003), series.getTimePeriod(1));
    }

    // ===================== getDataItem =====================

    @Test
    public void testGetDataItemByIndex() {
        series.add(new Year(2000), 1.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(new Year(2000), item.getPeriod());
        assertEquals(1.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemByPeriodFound() {
        series.add(new Year(2000), 1.0);
        TimeSeriesDataItem item = series.getDataItem(new Year(2000));
        assertNotNull(item);
        assertEquals(1.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemByPeriodNotFound() {
        series.add(new Year(2000), 1.0);
        assertNull(series.getDataItem(new Year(1999)));
    }

    // ===================== getTimePeriod / getNextTimePeriod / getTimePeriods =====================

    @Test
    public void testGetTimePeriod() {
        series.add(new Year(2000), 1.0);
        assertEquals(new Year(2000), series.getTimePeriod(0));
    }

    @Test
    public void testGetNextTimePeriod() {
        series.add(new Year(2000), 1.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Year(2001), next);
    }

    @Test
    public void testGetTimePeriods() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(new Year(2000)));
        assertTrue(periods.contains(new Year(2001)));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        TimeSeries other = new TimeSeries("other");
        other.add(new Year(2001), 20.0);
        other.add(new Year(2002), 30.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Year(2002)));
    }

    // ===================== getIndex =====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullThrows() {
        series.getIndex(null);
    }

    // ===================== getValue =====================

    @Test
    public void testGetValueByIndex() {
        series.add(new Year(2000), 5.0);
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriodFound() {
        series.add(new Year(2000), 5.0);
        assertEquals(5.0, series.getValue(new Year(2000)).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriodNotFound() {
        series.add(new Year(2000), 5.0);
        assertNull(series.getValue(new Year(1999)));
    }

    // ===================== add(TimeSeriesDataItem[,boolean]) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItemThrows() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test
    public void testAddFirstItem() {
        series.add(new Year(2000), 1.0);
        assertEquals(1, series.getItemCount());
        assertEquals(Year.class, series.getTimePeriodClass());
    }

    @Test
    public void testAddAppend() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(1));
    }

    @Test
    public void testAddInsertMiddle() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2001), 2.0); // else branch, binarySearch < 0
        assertEquals(3, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(1));
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicateThrows() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2000), 2.0);
    }

    @Test(expected = SeriesException.class)
    public void testAddMismatchTimePeriodClassThrows() {
        series.add(new Year(2000), 1.0);
        series.add(new Day(1, 1, 2000), 2.0);
    }

    @Test
    public void testAddExceedsMaximumItemCountRemovesOldest() {
        series.setMaximumItemCount(2);
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(0));
    }

    @Test
    public void testAddDoubleValueWrapper() {
        series.add(new Year(2000), 9.0);
        assertEquals(9.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddNumberValueWrapper() {
        series.add(new Year(2000), new Double(9.5));
        assertEquals(9.5, series.getValue(0).doubleValue(), 0.0001);
    }

    // ===================== update =====================

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriodNotFoundThrows() {
        series.add(new Year(2000), 1.0);
        series.update(new Year(1999), new Double(5.0));
    }

    @Test
    public void testUpdateByIndexIterateTrue() {
        series.add(new Year(2000), 1.0);  // min
        series.add(new Year(2001), 5.0);
        series.add(new Year(2002), 10.0); // max
        series.update(0, new Double(20.0)); // old value == min -> iterate = true
        assertEquals(5.0, series.getMinY(), 0.0001);
        assertEquals(20.0, series.getMaxY(), 0.0001);
    }

    @Test
    public void testUpdateByIndexIterateFalse() {
        series.add(new Year(2000), 1.0);  // min
        series.add(new Year(2001), 5.0);  // not a bound
        series.add(new Year(2002), 10.0); // max
        series.update(1, new Double(7.0));
        assertEquals(1.0, series.getMinY(), 0.0001);
        assertEquals(10.0, series.getMaxY(), 0.0001);
        assertEquals(7.0, series.getValue(1).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateByIndexOldValueNullThenNonNull() {
        series.add(new Year(2000), (Number) null);
        series.update(0, new Double(3.0));
        assertEquals(3.0, series.getMinY(), 0.0001);
        assertEquals(3.0, series.getMaxY(), 0.0001);
    }

    @Test
    public void testUpdateByIndexToNullValue() {
        series.add(new Year(2000), 1.0);  // min
        series.add(new Year(2001), 5.0);  // not a bound
        series.add(new Year(2002), 10.0); // max
        series.update(1, (Number) null); // iterate=false, value==null -> both branches skipped
        assertEquals(1.0, series.getMinY(), 0.0001);
        assertEquals(10.0, series.getMaxY(), 0.0001);
        assertNull(series.getValue(1));
    }

    // ===================== addAndOrUpdate =====================

    @Test
    public void testAddAndOrUpdate() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);

        TimeSeries other = new TimeSeries("other");
        other.add(new Year(2001), 99.0); // overwrite
        other.add(new Year(2002), 3.0);  // new

        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(3, series.getItemCount());
        assertEquals(99.0, series.getValue(new Year(2001)).doubleValue(), 0.0001);
    }

    // ===================== addOrUpdate =====================

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullItemThrows() {
        series.addOrUpdate((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddOrUpdateMismatchClassThrows() {
        series.add(new Year(2000), 1.0);
        series.addOrUpdate(new Day(1, 1, 2000), 2.0);
    }

    @Test
    public void testAddOrUpdateDoubleWrapperNewItem() {
        TimeSeriesDataItem old = series.addOrUpdate(new Year(2000), 5.0);
        assertNull(old);
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateNewItemExceedsMaximumCount() {
        series.setMaximumItemCount(2);
        series.addOrUpdate(new Year(2000), 1.0);
        series.addOrUpdate(new Year(2001), 2.0);
        series.addOrUpdate(new Year(2002), 3.0); // exceeds max -> oldest removed
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(0));
    }

    @Test
    public void testAddOrUpdateOverwriteExisting_detectsMaxYBug() {
        series.add(new Year(2000), 1.0);  // min
        series.add(new Year(2001), 5.0);
        series.add(new Year(2002), 3.0);  // minY=1, maxY=5
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Year(2002), 4.0);
        assertNotNull(overwritten);
        assertEquals(3.0, overwritten.getValue().doubleValue(), 0.0001);
        assertEquals(4.0, series.getValue(new Year(2002)).doubleValue(), 0.0001);
        // NOTE: known Chart-3b defect - addOrUpdate() uses minIgnoreNaN instead of
        // maxIgnoreNaN when updating maxY for the "no-iterate" branch. According to
        // the intended contract maxY should remain 5.0. This assertion is expected
        // to FAIL against the buggy implementation, exposing the fault.
        assertEquals(5.0, series.getMaxY(), 0.0001);
    }

    @Test
    public void testAddOrUpdateOverwriteIterateTrue() {
        series.add(new Year(2000), 1.0);  // min
        series.add(new Year(2001), 5.0);
        series.add(new Year(2002), 10.0); // max
        series.addOrUpdate(new Year(2000), 20.0); // old value == min -> iterate = true
        assertEquals(5.0, series.getMinY(), 0.0001);
        assertEquals(20.0, series.getMaxY(), 0.0001);
    }

    // ===================== removeAgedItems(boolean) =====================

    @Test
    public void testRemoveAgedItemsNoOpWhenSingleItem() {
        series.add(new Year(2000), 1.0);
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
    }

    // ===================== removeAgedItems(long, boolean) =====================

    @Test
    public void testRemoveAgedItemsLongOnEmptySeries() {
        series.removeAgedItems(System.currentTimeMillis(), true); // data.isEmpty() -> early return
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsLongRemovesOldItems() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.setMaximumItemAge(0);
        assertEquals(1, series.getItemCount()); // only most recent item remains

        GregorianCalendar cal = new GregorianCalendar(2025, 0, 1);
        long future = cal.getTimeInMillis();
        series.removeAgedItems(future, true);
        assertEquals(0, series.getItemCount());
    }

    // ===================== clear =====================

    @Test
    public void testClearNonEmptySeries() {
        series.add(new Year(2000), 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));
    }

    @Test
    public void testClearEmptySeriesNoException() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    // ===================== delete(RegularTimePeriod) =====================

    @Test
    public void testDeleteByPeriodFound() {
        series.add(new Year(2000), 1.0);
        series.delete(new Year(2000));
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testDeleteByPeriodNotFound() {
        series.add(new Year(2000), 1.0);
        series.delete(new Year(1999)); // no-op
        assertEquals(1, series.getItemCount());
    }

    // ===================== delete(int,int[,boolean]) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteRangeEndLessThanStartThrows() {
        series.add(new Year(2000), 1.0);
        series.delete(1, 0);
    }

    @Test
    public void testDeleteRangeValid() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Year(2002), series.getTimePeriod(0));
    }

    @Test
    public void testDeleteRangeAllItemsResetsTimePeriodClass() {
        series.add(new Year(2000), 1.0);
        series.delete(0, 0, false);
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
    }

    // ===================== clone =====================

    @Test
    public void testCloneIsIndependent() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        TimeSeries clone = (TimeSeries) series.clone();
        series.add(new Year(2001), 2.0);
        assertEquals(2, series.getItemCount());
        assertEquals(1, clone.getItemCount());
    }

    // ===================== createCopy(int,int) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntIntStartNegativeThrows() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntIntEndLessThanStartThrows() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopyIntIntOnEmptySeries() throws CloneNotSupportedException {
        TimeSeries copy = series.createCopy(0, 0); // data.size()==0 -> loop skipped
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyIntIntValid() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(new Year(2000), copy.getTimePeriod(0));
        assertEquals(new Year(2001), copy.getTimePeriod(1));
    }

    // ===================== createCopy(RegularTimePeriod,RegularTimePeriod) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodNullStartThrows() throws CloneNotSupportedException {
        series.createCopy(null, new Year(2000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodNullEndThrows() throws CloneNotSupportedException {
        series.createCopy(new Year(2000), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodStartAfterEndThrows() throws CloneNotSupportedException {
        series.createCopy(new Year(2001), new Year(2000));
    }

    @Test
    public void testCreateCopyPeriodNormalRange() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2003), 4.0);
        TimeSeries copy = series.createCopy(new Year(2001), new Year(2002));
        assertEquals(2, copy.getItemCount());
        assertEquals(new Year(2001), copy.getTimePeriod(0));
        assertEquals(new Year(2002), copy.getTimePeriod(1));
    }

    @Test
    public void testCreateCopyPeriodStartIndexAdjustedNotEmpty() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.add(new Year(2003), 4.0);
        TimeSeries copy = series.createCopy(new Year(1999), new Year(2001));
        assertEquals(2, copy.getItemCount());
        assertEquals(new Year(2000), copy.getTimePeriod(0));
        assertEquals(new Year(2001), copy.getTimePeriod(1));
    }

    @Test
    public void testCreateCopyPeriodStartAfterLastIsEmpty() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        TimeSeries copy = series.createCopy(new Year(2010), new Year(2011));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyPeriodEndBeforeFirstIsEmpty() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        TimeSeries copy = series.createCopy(new Year(1997), new Year(1998));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyPeriodGapBetweenItemsIsEmpty() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2010), 2.0);
        TimeSeries copy = series.createCopy(new Year(2003), new Year(2005));
        assertEquals(0, copy.getItemCount());
    }

    // ===================== equals =====================

    @Test
    public void testEqualsSameInstance() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsNotATimeSeries() {
        assertFalse(series.equals("not a time series"));
    }

    @Test
    public void testEqualsDifferentDomainDescription() {
        TimeSeries a = new TimeSeries("n", "domA", "range");
        TimeSeries b = new TimeSeries("n", "domB", "range");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentRangeDescription() {
        TimeSeries a = new TimeSeries("n", "dom", "rangeA");
        TimeSeries b = new TimeSeries("n", "dom", "rangeB");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentTimePeriodClass() {
        TimeSeries a = new TimeSeries("n");
        TimeSeries b = new TimeSeries("n");
        a.add(new Year(2000), 1.0);
        b.add(new Day(1, 1, 2000), 1.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentMaximumItemAge() {
        TimeSeries a = new TimeSeries("n");
        TimeSeries b = new TimeSeries("n");
        a.setMaximumItemAge(5);
        b.setMaximumItemAge(10);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentMaximumItemCount() {
        TimeSeries a = new TimeSeries("n");
        TimeSeries b = new TimeSeries("n");
        a.setMaximumItemCount(5);
        b.setMaximumItemCount(10);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentItemCount() {
        TimeSeries a = new TimeSeries("n");
        TimeSeries b = new TimeSeries("n");
        a.add(new Year(2000), 1.0);
        a.add(new Year(2001), 2.0);
        b.add(new Year(2000), 1.0); // same timePeriodClass, different itemCount
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentData() {
        TimeSeries a = new TimeSeries("n");
        TimeSeries b = new TimeSeries("n");
        a.add(new Year(2000), 1.0);
        b.add(new Year(2000), 2.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsTrueForEquivalentSeries() {
        // สมมติฐาน: super.equals() (Series) เทียบผ่าน key ของซีรีส์เป็นหลัก
        TimeSeries a = new TimeSeries("n", "d", "r");
        TimeSeries b = new TimeSeries("n", "d", "r");
        a.add(new Year(2000), 1.0);
        b.add(new Year(2000), 1.0);
        assertTrue(a.equals(b));
    }

    // ===================== hashCode =====================

    @Test
    public void testHashCodeEmptySeries() {
        int h = series.hashCode();
        assertEquals(h, series.hashCode());
    }

    @Test
    public void testHashCodeOneItem() {
        series.add(new Year(2000), 1.0);
        int h = series.hashCode();
        assertEquals(h, series.hashCode());
    }

    @Test
    public void testHashCodeTwoItems() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        int h = series.hashCode();
        assertEquals(h, series.hashCode());
    }

    @Test
    public void testHashCodeThreeItems() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        int h = series.hashCode();
        assertEquals(h, series.hashCode());
    }
}
