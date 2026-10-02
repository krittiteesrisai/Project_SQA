# TimeSeriesTest.java (JUnit 4)

```java
package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import org.jfree.data.general.SeriesException;

/**
 * JUnit 4 test suite สำหรับคลาส org.jfree.data.time.TimeSeries (Defects4J: Chart-9b)
 *
 * หมายเหตุ:
 * - บางเมธอด/behavior ของคลาสแม่ (Series) ไม่ได้แสดงในซอร์สที่ให้มา
 *   จึงไม่ทดสอบ behavior ที่ต้อง "เดา" เช่น การส่ง null เป็นชื่อ series
 * - RegularTimePeriod / Day / TimeSeriesDataItem ถือว่ามี public API ตามที่ใช้งานในซอร์สต้นฉบับ
 */
public class TimeSeriesTest {

    // ---------- Helper ----------
    private TimeSeries newDaySeries(String name) {
        return new TimeSeries(name, Day.class);
    }

    private Day day(int d, int m, int y) {
        return new Day(d, m, y);
    }

    // =========================================================
    // Constructors
    // =========================================================

    @Test
    public void testConstructor_NameOnly_DefaultsToDay() {
        TimeSeries s = new TimeSeries("S1");
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, s.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testConstructor_NameAndClass() {
        TimeSeries s = new TimeSeries("S2", Month.class);
        assertEquals(Month.class, s.getTimePeriodClass());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, s.getDomainDescription());
    }

    @Test
    public void testConstructor_Full() {
        TimeSeries s = new TimeSeries("S3", "D", "R", Year.class);
        assertEquals("D", s.getDomainDescription());
        assertEquals("R", s.getRangeDescription());
        assertEquals(Year.class, s.getTimePeriodClass());
    }

    // =========================================================
    // Domain / Range description getters-setters
    // =========================================================

    @Test
    public void testSetDomainDescription() {
        TimeSeries s = newDaySeries("S");
        s.setDomainDescription("NewDomain");
        assertEquals("NewDomain", s.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription_Null() {
        TimeSeries s = newDaySeries("S");
        s.setDomainDescription(null);
        assertNull(s.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() {
        TimeSeries s = newDaySeries("S");
        s.setRangeDescription("NewRange");
        assertEquals("NewRange", s.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription_Null() {
        TimeSeries s = newDaySeries("S");
        s.setRangeDescription(null);
        assertNull(s.getRangeDescription());
    }

    // =========================================================
    // getItemCount / getItems
    // =========================================================

    @Test
    public void testGetItemCount_Empty() {
        TimeSeries s = newDaySeries("S");
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testGetItems_UnmodifiableList() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        List items = s.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new TimeSeriesDataItem(day(2, 1, 2020), 2.0));
            fail("List should be unmodifiable");
        }
        catch (UnsupportedOperationException expected) {
            // OK - list returned via Collections.unmodifiableList
        }
    }

    // =========================================================
    // setMaximumItemCount
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_Negative() {
        TimeSeries s = newDaySeries("S");
        s.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCount_NoTruncationNeeded() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.setMaximumItemCount(5); // count(1) > maximum(5) == false -> no delete
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testSetMaximumItemCount_TruncatesData() {
        TimeSeries s = newDaySeries("S");
        for (int i = 1; i <= 5; i++) {
            s.add(day(i, 1, 2020), i);
        }
        s.setMaximumItemCount(2); // count(5) > max(2) -> delete(0, 5-2-1=2)
        assertEquals(2, s.getItemCount());
        // remaining should be the last two days (4th, 5th)
        assertEquals(day(4, 1, 2020), s.getTimePeriod(0));
        assertEquals(day(5, 1, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testSetMaximumItemCount_ZeroOnEmptySeries() {
        TimeSeries s = newDaySeries("S");
        s.setMaximumItemCount(0); // count(0) > max(0) == false
        assertEquals(0, s.getMaximumItemCount());
    }

    // =========================================================
    // setMaximumItemAge / removeAgedItems(boolean)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_Negative() {
        TimeSeries s = newDaySeries("S");
        s.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAge_SingleRemoval() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.add(day(3, 1, 2020), 3.0);
        s.setMaximumItemAge(1); // diff(day3-day1)=2>1 -> remove day1 once; then diff=1 stop
        assertEquals(2, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(0));
    }

    @Test
    public void testSetMaximumItemAge_MultipleRemovalsStopAtOneItem() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.add(day(3, 1, 2020), 3.0);
        s.setMaximumItemAge(0); // loop removes while itemCount>1, stops at 1 item left
        assertEquals(1, s.getItemCount());
        assertEquals(day(3, 1, 2020), s.getTimePeriod(0));
    }

    @Test
    public void testRemoveAgedItems_NoRemovalWhenSingleItem() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        // itemCount == 1 -> outer if(getItemCount() > 1) is false, no-op
        s.removeAgedItems(true);
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testRemoveAgedItems_NoRemovalWhenEmpty() {
        TimeSeries s = newDaySeries("S");
        s.removeAgedItems(true); // itemCount == 0
        assertEquals(0, s.getItemCount());
    }

    // =========================================================
    // removeAgedItems(long, boolean) - reflective path
    // =========================================================

    @Test
    public void testRemoveAgedItemsLong_NoRemoval_WhenAgeNotExceeded() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        // maximumItemAge still Long.MAX_VALUE by default -> condition never true
        s.removeAgedItems(System.currentTimeMillis(), true);
        assertEquals(2, s.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsLong_RemovesAllWhenFarFuture() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.setMaximumItemAge(1); // small age threshold (this itself may trigger removeAgedItems(boolean) too)
        long farFuture = System.currentTimeMillis() + 1000L * 24L * 60L * 60L * 1000L; // ~1000 days ahead
        s.removeAgedItems(farFuture, true);
        // With such a large index-serial gap, all remaining items should be removed (loop allows itemCount==0 exit)
        assertEquals(0, s.getItemCount());
    }

    // =========================================================
    // getTimePeriodClass
    // =========================================================

    @Test
    public void testGetTimePeriodClass() {
        TimeSeries s = newDaySeries("S");
        assertEquals(Day.class, s.getTimePeriodClass());
    }

    // =========================================================
    // getDataItem(int) / getDataItem(RegularTimePeriod)
    // =========================================================

    @Test
    public void testGetDataItem_ByIndex() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 10.0);
        TimeSeriesDataItem item = s.getDataItem(0);
        assertEquals(day(1, 1, 2020), item.getPeriod());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItem_ByIndex_OutOfBounds() {
        TimeSeries s = newDaySeries("S");
        s.getDataItem(0); // empty series
    }

    @Test
    public void testGetDataItem_ByPeriod_Found() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 10.0);
        TimeSeriesDataItem item = s.getDataItem(day(1, 1, 2020));
        assertNotNull(item);
    }

    @Test
    public void testGetDataItem_ByPeriod_NotFound() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 10.0);
        TimeSeriesDataItem item = s.getDataItem(day(2, 1, 2020));
        assertNull(item);
    }

    // =========================================================
    // getTimePeriod / getNextTimePeriod
    // =========================================================

    @Test
    public void testGetTimePeriod() {
        TimeSeries s = newDaySeries("S");
        s.add(day(5, 5, 2020), 1.0);
        assertEquals(day(5, 5, 2020), s.getTimePeriod(0));
    }

    @Test
    public void testGetNextTimePeriod() {
        TimeSeries s = newDaySeries("S");
        s.add(day(5, 5, 2020), 1.0);
        RegularTimePeriod next = s.getNextTimePeriod();
        assertEquals(day(6, 5, 2020), next);
    }

    // สังเกต: ถ้า series ว่าง getNextTimePeriod() จะเรียก getDataItem(-1) -> IndexOutOfBoundsException
    // (พฤติกรรมนี้อนุมานจากโค้ด ไม่ได้ระบุไว้ตรง ๆ แต่เป็นผลจาก logic ตรง ๆ ของ getItemCount()-1)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextTimePeriod_EmptySeries() {
        TimeSeries s = newDaySeries("S");
        s.getNextTimePeriod();
    }

    // =========================================================
    // getTimePeriods / getTimePeriodsUniqueToOtherSeries
    // =========================================================

    @Test
    public void testGetTimePeriods_Empty() {
        TimeSeries s = newDaySeries("S");
        Collection periods = s.getTimePeriods();
        assertEquals(0, periods.size());
    }

    @Test
    public void testGetTimePeriods_NonEmpty() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        Collection periods = s.getTimePeriods();
        assertEquals(2, periods.size());
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries a = newDaySeries("A");
        a.add(day(1, 1, 2020), 1.0);
        a.add(day(2, 1, 2020), 2.0);

        TimeSeries b = newDaySeries("B");
        b.add(day(2, 1, 2020), 20.0);
        b.add(day(3, 1, 2020), 30.0);

        Collection unique = a.getTimePeriodsUniqueToOtherSeries(b);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(day(3, 1, 2020)));
    }

    // =========================================================
    // getIndex
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_NullPeriod() {
        TimeSeries s = newDaySeries("S");
        s.getIndex(null);
    }

    @Test
    public void testGetIndex_Found() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        assertEquals(0, s.getIndex(day(1, 1, 2020)));
    }

    @Test
    public void testGetIndex_NotFound() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        assertTrue(s.getIndex(day(5, 1, 2020)) < 0);
    }

    // =========================================================
    // getValue(int) / getValue(RegularTimePeriod)
    // =========================================================

    @Test
    public void testGetValue_ByIndex() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 42.0);
        assertEquals(42.0, s.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_ByPeriod_Found() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 42.0);
        assertEquals(42.0, s.getValue(day(1, 1, 2020)).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_ByPeriod_NotFound() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 42.0);
        assertNull(s.getValue(day(2, 1, 2020)));
    }

    // =========================================================
    // add(TimeSeriesDataItem, boolean) - core branch coverage
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullItem() {
        TimeSeries s = newDaySeries("S");
        s.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_WrongPeriodClass() {
        TimeSeries s = newDaySeries("S"); // expects Day
        s.add(new TimeSeriesDataItem(new Month(1, 2020), 1.0));
    }

    @Test
    public void testAdd_FirstItem_CountZeroBranch() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAdd_AppendAtEnd_CompareGreaterThanZero() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0); // period > last -> append branch
        assertEquals(2, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(1));
    }

    @Test
    public void testAdd_InsertInMiddle_BinarySearchNegative() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(3, 1, 2020), 3.0);
        s.add(day(2, 1, 2020), 2.0); // not > last, binarySearch < 0 -> insert
        assertEquals(3, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(1));
    }

    @Test(expected = SeriesException.class)
    public void testAdd_DuplicatePeriod_BinarySearchNonNegative() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.add(day(1, 1, 2020), 99.0); // duplicate -> binarySearch >= 0 -> throw
    }

    @Test
    public void testAdd_ExceedsMaximumItemCount_RemovesFirst() {
        TimeSeries s = newDaySeries("S");
        s.setMaximumItemCount(2);
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.add(day(3, 1, 2020), 3.0); // exceeds max -> remove index 0
        assertEquals(2, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(0));
    }

    @Test
    public void testAdd_NotifyFalse_NoException() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0, false); // notify=false branch
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAdd_NotifyTrue_NoException() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0, true); // notify=true branch
        assertEquals(1, s.getItemCount());
    }

    // =========================================================
    // add(RegularTimePeriod, double[, boolean]) / add(RegularTimePeriod, Number[, boolean])
    // =========================================================

    @Test
    public void testAdd_PeriodDouble() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 5.0);
        assertEquals(5.0, s.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_PeriodNumber_NullValueAllowed() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), (Number) null);
        assertNull(s.getValue(0));
    }

    @Test
    public void testAdd_PeriodNumber_NotifyFalse() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), new Double(3.3), false);
        assertEquals(3.3, s.getValue(0).doubleValue(), 0.0001);
    }

    // =========================================================
    // update(RegularTimePeriod, Number)
    // =========================================================

    @Test
    public void testUpdate_ByPeriod_Found() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.update(day(1, 1, 2020), new Double(99.0));
        assertEquals(99.0, s.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_ByPeriod_NotFound() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.update(day(9, 9, 2020), new Double(99.0));
    }

    @Test
    public void testUpdate_ByIndex() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.update(0, new Double(55.0));
        assertEquals(55.0, s.getValue(0).doubleValue(), 0.0001);
    }

    // =========================================================
    // addOrUpdate
    // =========================================================

    @Test
    public void testAddOrUpdate_NewPeriod_ReturnsNull() {
        TimeSeries s = newDaySeries("S");
        TimeSeriesDataItem overwritten = s.addOrUpdate(day(1, 1, 2020), 1.0);
        assertNull(overwritten);
        assertEquals(1, s.getItemCount());
    }

    @Test
    public void testAddOrUpdate_ExistingPeriod_ReturnsOldItem() {
        TimeSeries s = newDaySeries("S");
        s.addOrUpdate(day(1, 1, 2020), 1.0);
        TimeSeriesDataItem overwritten = s.addOrUpdate(day(1, 1, 2020), 2.0);
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getValue().doubleValue(), 0.0001);
        assertEquals(2.0, s.getValue(0).doubleValue(), 0.0001);
        assertEquals(1, s.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_NullPeriod() {
        TimeSeries s = newDaySeries("S");
        s.addOrUpdate(null, new Double(1.0));
    }

    @Test
    public void testAddOrUpdate_ExceedsMaximumItemCount() {
        TimeSeries s = newDaySeries("S");
        s.setMaximumItemCount(2);
        s.addOrUpdate(day(1, 1, 2020), 1.0);
        s.addOrUpdate(day(2, 1, 2020), 2.0);
        s.addOrUpdate(day(3, 1, 2020), 3.0); // new period exceeds max -> remove index 0
        assertEquals(2, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(0));
    }

    // =========================================================
    // addAndOrUpdate(TimeSeries)
    // =========================================================

    @Test
    public void testAddAndOrUpdate_MergesAndReturnsOverwritten() {
        TimeSeries a = newDaySeries("A");
        a.add(day(1, 1, 2020), 1.0);

        TimeSeries b = newDaySeries("B");
        b.add(day(1, 1, 2020), 100.0); // overwrites a's value
        b.add(day(2, 1, 2020), 200.0); // new

        TimeSeries overwritten = a.addAndOrUpdate(b);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(0).doubleValue(), 0.0001);
        assertEquals(2, a.getItemCount());
        assertEquals(100.0, a.getValue(day(1, 1, 2020)).doubleValue(), 0.0001);
    }

    // =========================================================
    // clear()
    // =========================================================

    @Test
    public void testClear_NonEmpty() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.clear();
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testClear_EmptyNoOp() {
        TimeSeries s = newDaySeries("S");
        s.clear(); // size == 0 branch -> no-op
        assertEquals(0, s.getItemCount());
    }

    // =========================================================
    // delete(RegularTimePeriod)
    // =========================================================

    @Test
    public void testDelete_ByPeriod_Found() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.delete(day(1, 1, 2020));
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testDelete_ByPeriod_NotFound_NoOp() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.delete(day(9, 9, 2020));
        assertEquals(1, s.getItemCount());
    }

    // =========================================================
    // delete(int start, int end)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testDelete_StartGreaterThanEnd() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.delete(1, 0);
    }

    @Test
    public void testDelete_SingleItem() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.delete(0, 0);
        assertEquals(1, s.getItemCount());
        assertEquals(day(2, 1, 2020), s.getTimePeriod(0));
    }

    @Test
    public void testDelete_Range() {
        TimeSeries s = newDaySeries("S");
        for (int i = 1; i <= 5; i++) {
            s.add(day(i, 1, 2020), i);
        }
        s.delete(1, 3); // removes indices 1..3 inclusive (3 items)
        assertEquals(2, s.getItemCount());
        assertEquals(day(1, 1, 2020), s.getTimePeriod(0));
        assertEquals(day(5, 1, 2020), s.getTimePeriod(1));
    }

    // =========================================================
    // clone()
    // =========================================================

    @Test
    public void testClone_DeepCopyIndependence() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        TimeSeries clone = (TimeSeries) s.clone();
        clone.update(0, new Double(999.0));
        assertEquals(1.0, s.getValue(0).doubleValue(), 0.0001);
        assertEquals(999.0, clone.getValue(0).doubleValue(), 0.0001);
    }

    // =========================================================
    // createCopy(int start, int end)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntInt_StartNegative() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntInt_EndLessThanStart() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.createCopy(1, 0);
    }

    @Test
    public void testCreateCopyIntInt_EmptyData_NoLoop() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        TimeSeries copy = s.createCopy(0, 0); // this.data.size() == 0 -> skip for-loop
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyIntInt_Normal() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        for (int i = 1; i <= 3; i++) {
            s.add(day(i, 1, 2020), i);
        }
        TimeSeries copy = s.createCopy(0, 2);
        assertEquals(3, copy.getItemCount());
        assertEquals(1.0, copy.getValue(0).doubleValue(), 0.0001);
    }

    // =========================================================
    // createCopy(RegularTimePeriod, RegularTimePeriod)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriod_NullStart() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.createCopy(null, day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriod_NullEnd() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.createCopy(day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriod_StartAfterEnd() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.createCopy(day(2, 1, 2020), day(1, 1, 2020));
    }

    @Test
    public void testCreateCopyPeriod_Normal() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        for (int i = 1; i <= 5; i++) {
            s.add(day(i, 1, 2020), i);
        }
        TimeSeries copy = s.createCopy(day(2, 1, 2020), day(4, 1, 2020));
        assertEquals(3, copy.getItemCount());
    }

    @Test
    public void testCreateCopyPeriod_EmptyRange_StartAfterLastItem() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        // start index not found, startIndex becomes == data.size() -> emptyRange
        TimeSeries copy = s.createCopy(day(5, 1, 2020), day(10, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyPeriod_EmptyRange_EndBeforeFirstItem() throws CloneNotSupportedException {
        TimeSeries s = newDaySeries("S");
        s.add(day(5, 1, 2020), 1.0);
        // end period before first data item -> endIndex becomes negative -> emptyRange
        TimeSeries copy = s.createCopy(day(1, 1, 2020), day(2, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }

    // =========================================================
    // equals()
    // =========================================================

    @Test
    public void testEquals_SameInstance() {
        TimeSeries s = newDaySeries("S");
        assertTrue(s.equals(s));
    }

    @Test
    public void testEquals_NotATimeSeries() {
        TimeSeries s = newDaySeries("S");
        assertFalse(s.equals("not a series"));
    }

    @Test
    public void testEquals_DifferentKey_SuperNotEqual() {
        TimeSeries a = newDaySeries("A");
        TimeSeries b = newDaySeries("B");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentDomainDescription() {
        TimeSeries a = new TimeSeries("S", "D1", "R", Day.class);
        TimeSeries b = new TimeSeries("S", "D2", "R", Day.class);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentRangeDescription() {
        TimeSeries a = new TimeSeries("S", "D", "R1", Day.class);
        TimeSeries b = new TimeSeries("S", "D", "R2", Day.class);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentClass() {
        TimeSeries a = newDaySeries("S");
        TimeSeries b = new TimeSeries("S", TimeSeries.DEFAULT_DOMAIN_DESCRIPTION,
                TimeSeries.DEFAULT_RANGE_DESCRIPTION, Day.class) { };
        // Anonymous subclass -> getClass() differs
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentMaximumItemAge() {
        TimeSeries a = newDaySeries("S");
        TimeSeries b = newDaySeries("S");
        b.setMaximumItemAge(5);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentMaximumItemCount() {
        TimeSeries a = newDaySeries("S");
        TimeSeries b = newDaySeries("S");
        b.setMaximumItemCount(5);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentItemCount() {
        TimeSeries a = newDaySeries("S");
        TimeSeries b = newDaySeries("S");
        b.add(day(1, 1, 2020), 1.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentDataItem() {
        TimeSeries a = newDaySeries("S");
        a.add(day(1, 1, 2020), 1.0);
        TimeSeries b = newDaySeries("S");
        b.add(day(1, 1, 2020), 2.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_FullyEqual() {
        TimeSeries a = newDaySeries("S");
        a.add(day(1, 1, 2020), 1.0);
        TimeSeries b = newDaySeries("S");
        b.add(day(1, 1, 2020), 1.0);
        assertTrue(a.equals(b));
    }

    // =========================================================
    // hashCode()
    // =========================================================

    @Test
    public void testHashCode_ZeroItems() {
        TimeSeries s = newDaySeries("S");
        // count == 0 -> all three item-based branches skipped, should not throw
        int hc = s.hashCode();
        assertEquals(hc, s.hashCode()); // consistency
    }

    @Test
    public void testHashCode_OneItem() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        // count == 1 -> only count>0 branch true, count>1 false
        int hc = s.hashCode();
        assertEquals(hc, s.hashCode());
    }

    @Test
    public void testHashCode_TwoItems() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        // count == 2 -> count>0 and count>1 true, count>2 false
        int hc = s.hashCode();
        assertEquals(hc, s.hashCode());
    }

    @Test
    public void testHashCode_ThreeOrMoreItems() {
        TimeSeries s = newDaySeries("S");
        s.add(day(1, 1, 2020), 1.0);
        s.add(day(2, 1, 2020), 2.0);
        s.add(day(3, 1, 2020), 3.0);
        // count == 3 -> all three branches (count>0, count>1, count>2) true
        int hc = s.hashCode();
        assertEquals(hc, s.hashCode());
    }

    @Test
    public void testHashCode_ConsistentWithEquals() {
        TimeSeries a = newDaySeries("S");
        a.add(day(1, 1, 2020), 1.0);
        TimeSeries b = newDaySeries("S");
        b.add(day(1, 1, 2020), 1.0);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }
}
```

## สรุปการครอบคลุม Branch/Condition (ตาม Test Method)

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_* | 3 constructor overloads, ค่า default domain/range/timePeriodClass/maximumItemCount/Age |
| testSetDomainDescription*, testSetRangeDescription* | setter + null value |
| testGetItems_UnmodifiableList | UnsupportedOperationException จาก unmodifiableList |
| testSetMaximumItemCount_Negative | `maximum < 0` → throw |
| testSetMaximumItemCount_NoTruncationNeeded / _TruncatesData / _ZeroOnEmptySeries | `count > maximum` true/false branches |
| testSetMaximumItemAge_Negative | `periods < 0` → throw |
| testSetMaximumItemAge_SingleRemoval / _MultipleRemovalsStopAtOneItem | while-loop 1 ครั้ง / หลายครั้งจนหยุดที่ itemCount=1 |
| testRemoveAgedItems_NoRemovalWhenSingleItem / _NoRemovalWhenEmpty | `getItemCount() > 1` false (2 กรณี) |
| testRemoveAgedItemsLong_NoRemoval.. / _RemovesAllWhenFarFuture | while-loop ของ removeAgedItems(long,boolean) ทั้ง false/true, ลบจนเหลือ 0 |
| testGetDataItem_ByIndex* | ปกติ / IndexOutOfBoundsException |
| testGetDataItem_ByPeriod_Found/_NotFound | `index >= 0` true/false |
| testGetTimePeriod, testGetNextTimePeriod*, testGetNextTimePeriod_EmptySeries | ปกติ + edge case ว่าง |
| testGetTimePeriods_Empty/_NonEmpty | for-loop 0/หลายรอบ |
| testGetTimePeriodsUniqueToOtherSeries | `index < 0` true/false ภายใน loop |
| testGetIndex_NullPeriod/_Found/_NotFound | null check, binarySearch >=0 / <0 |
| testGetValue_* | index/period ทั้ง found/not found |
| testAdd_NullItem | null item → throw |
| testAdd_WrongPeriodClass | ผิด class → SeriesException |
| testAdd_FirstItem_CountZeroBranch | `count == 0` true |
| testAdd_AppendAtEnd_CompareGreaterThanZero | `compareTo(last) > 0` true |
| testAdd_InsertInMiddle_BinarySearchNegative | binarySearch < 0 → insert |
| testAdd_DuplicatePeriod_BinarySearchNonNegative | binarySearch >= 0 → throw |
| testAdd_ExceedsMaximumItemCount_RemovesFirst | `getItemCount() > maximumItemCount` true |
| testAdd_NotifyFalse/_NotifyTrue | notify flag ทั้ง 2 branch |
| testAdd_PeriodDouble/_PeriodNumber_Null/_NotifyFalse | overload ต่าง ๆ ของ add() |
| testUpdate_ByPeriod_Found/_NotFound, testUpdate_ByIndex | `index >= 0` true/false |
| testAddOrUpdate_NewPeriod/_Existing/_NullPeriod/_ExceedsMax | branch existing vs new, null check, max item count |
| testAddAndOrUpdate_MergesAndReturnsOverwritten | loop + `oldItem != null` true |
| testClear_NonEmpty/_EmptyNoOp | `size() > 0` true/false |
| testDelete_ByPeriod_Found/_NotFound | `index >= 0` true/false |
| testDelete_StartGreaterThanEnd, _SingleItem, _Range | `end < start` throw, loop 1/หลายรอบ |
| testClone_DeepCopyIndependence | deep clone ของ data list |
| testCreateCopyIntInt_* | start<0, end<start, data.size()==0 (skip loop), ปกติ |
| testCreateCopyPeriod_* | null start/end, start>end, emptyRange (2 กรณี), normal |
| testEquals_* | ทุก if-branch ใน equals() รวม getClass() ต่างกัน |
| testHashCode_* | count>0, count>1, count>2 ทุก combination + consistency กับ equals() |

**หมายเหตุสำคัญ:** ไม่ได้ทดสอบกรณี `NoSuchMethodException`/reflection error path ใน `removeAgedItems(long, boolean)` เนื่องจากไม่สามารถ trigger ได้โดยไม่แก้ไข reflection ภายใน และไม่ได้ทดสอบ behavior ของ `Series` constructor เมื่อชื่อเป็น null เนื่องจากไม่มีซอร์สของคลาสแม่ให้ตรวจสอบ