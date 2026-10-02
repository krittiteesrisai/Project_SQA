# TimeSeriesTest.java

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับคลาส `TimeSeries` (Defects4J: Chart-17b) โดยพยายามครอบคลุม branch/condition ให้มากที่สุดตามที่วิเคราะห์ได้จากซอร์สที่ให้มา

```java
package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link TimeSeries} (Defects4J Chart-17b).
 *
 * หมายเหตุ (assumptions ที่ไม่มีใน source ที่ให้มาโดยตรง):
 *  - สมมติว่า Series (superclass) มี addChangeListener(SeriesChangeListener)
 *    และ equals()/hashCode() ที่อ้างอิงจาก key (name) ของ series เนื่องจากไม่มี
 *    source ของ Series ให้ตรวจสอบตรง ๆ
 *  - Day, Year เป็นคลาสจริงใน org.jfree.data.time ที่มี equals/compareTo ตาม
 *    ค่าปฏิทิน และมี static method createInstance(...) ที่ถูกเรียกผ่าน reflection
 *    ใน removeAgedItems(long, boolean)
 *  - branch ของ catch(NoSuchMethodException/IllegalAccessException/
 *    InvocationTargetException) ใน removeAgedItems(long,boolean) ไม่สามารถ
 *    ทดสอบได้ผ่าน public API ตามปกติ จึงไม่ครอบคลุมใน suite นี้
 */
public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    // ---------- Listener helper ----------
    private static class TestListener implements SeriesChangeListener {
        boolean fired = false;
        public void seriesChanged(SeriesChangeEvent event) {
            fired = true;
        }
    }

    // ---------- Subclass เพื่อทดสอบ branch getClass() mismatch ใน equals ----------
    private static class TimeSeriesSubclass extends TimeSeries {
        public TimeSeriesSubclass(Comparable name) {
            super(name);
        }
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testDefaultConstructor() {
        TimeSeries s = new TimeSeries("S1");
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, s.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testConstructorWithTimePeriodClass() {
        TimeSeries s = new TimeSeries("S2", Year.class);
        assertEquals(Year.class, s.getTimePeriodClass());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, s.getDomainDescription());
    }

    @Test
    public void testFullConstructor() {
        TimeSeries s = new TimeSeries("S3", "D", "R", Year.class);
        assertEquals("D", s.getDomainDescription());
        assertEquals("R", s.getRangeDescription());
        assertEquals(Year.class, s.getTimePeriodClass());
    }

    // =====================================================================
    // Domain / Range description
    // =====================================================================

    @Test
    public void testSetDomainDescription() {
        series.setDomainDescription("MyDomain");
        assertEquals("MyDomain", series.getDomainDescription());
    }

    @Test
    public void testSetDomainDescriptionNull() {
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() {
        series.setRangeDescription("MyRange");
        assertEquals("MyRange", series.getRangeDescription());
    }

    // =====================================================================
    // getItemCount / getItems
    // =====================================================================

    @Test
    public void testGetItemCountEmpty() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemsUnmodifiable() {
        series.add(new Day(1, 1, 2020), 1.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new Object());
            fail("Should be unmodifiable");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // =====================================================================
    // maximumItemCount
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegativeThrows() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountZeroBoundary() {
        series.setMaximumItemCount(0);
        assertEquals(0, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCountTrimsExistingData() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testSetMaximumItemCountNoTrimNeeded() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.setMaximumItemCount(10);
        assertEquals(1, series.getItemCount());
    }

    // =====================================================================
    // maximumItemAge
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegativeThrows() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAgeBoundaryZero() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.setMaximumItemAge(0);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testGetMaximumItemAgeDefault() {
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    // =====================================================================
    // getTimePeriodClass
    // =====================================================================

    @Test
    public void testGetTimePeriodClass() {
        assertEquals(Day.class, series.getTimePeriodClass());
    }

    // =====================================================================
    // getDataItem
    // =====================================================================

    @Test
    public void testGetDataItemByIndex() {
        series.add(new Day(1, 1, 2020), 5.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(5.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItemByIndexOutOfBounds() {
        series.getDataItem(0);
    }

    @Test
    public void testGetDataItemByPeriodFound() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 5.0);
        TimeSeriesDataItem item = series.getDataItem(d);
        assertNotNull(item);
        assertEquals(5.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemByPeriodNotFound() {
        series.add(new Day(1, 1, 2020), 5.0);
        TimeSeriesDataItem item = series.getDataItem(new Day(2, 1, 2020));
        assertNull(item);
    }

    // =====================================================================
    // getTimePeriod / getNextTimePeriod
    // =====================================================================

    @Test
    public void testGetTimePeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertEquals(d, series.getTimePeriod(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetTimePeriodEmptySeriesThrows() {
        series.getTimePeriod(0);
    }

    @Test
    public void testGetNextTimePeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(d.next(), next);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextTimePeriodEmptySeriesThrows() {
        series.getNextTimePeriod();
    }

    // =====================================================================
    // getTimePeriods
    // =====================================================================

    @Test
    public void testGetTimePeriodsEmpty() {
        Collection c = series.getTimePeriods();
        assertEquals(0, c.size());
    }

    @Test
    public void testGetTimePeriodsNonEmpty() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        Collection c = series.getTimePeriods();
        assertEquals(2, c.size());
    }

    // =====================================================================
    // getTimePeriodsUniqueToOtherSeries
    // =====================================================================

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Day(1, 1, 2020), 10.0);
        other.add(new Day(2, 1, 2020), 20.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Day(2, 1, 2020)));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeriesNoUnique() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Day(1, 1, 2020), 10.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(0, unique.size());
    }

    // =====================================================================
    // getIndex
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullThrows() {
        series.getIndex(null);
    }

    @Test
    public void testGetIndexFound() {
        series.add(new Day(1, 1, 2020), 1.0);
        assertEquals(0, series.getIndex(new Day(1, 1, 2020)));
    }

    @Test
    public void testGetIndexNotFound() {
        series.add(new Day(1, 1, 2020), 1.0);
        int idx = series.getIndex(new Day(5, 1, 2020));
        assertTrue(idx < 0);
    }

    // =====================================================================
    // getValue
    // =====================================================================

    @Test
    public void testGetValueByIndex() {
        series.add(new Day(1, 1, 2020), 7.0);
        assertEquals(7.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriodFound() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 7.0);
        assertEquals(7.0, series.getValue(d).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriodNotFound() {
        series.add(new Day(1, 1, 2020), 7.0);
        assertNull(series.getValue(new Day(2, 1, 2020)));
    }

    // =====================================================================
    // add(TimeSeriesDataItem, boolean)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItemThrows() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongPeriodClassThrows() {
        series.add(new TimeSeriesDataItem(new Year(2020), 1.0));
    }

    @Test
    public void testAddFirstItem() {
        series.add(new Day(1, 1, 2020), 1.0);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddAppendItem() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(1));
    }

    @Test
    public void testAddInsertMiddleItem() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.add(new Day(2, 1, 2020), 2.0); // binary-search insert branch
        assertEquals(3, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(1));
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriodThrows() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(1, 1, 2020), 2.0);
    }

    @Test
    public void testAddExceedsMaximumItemCountRemovesFirst() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testAddNotifyTrueFiresListener() {
        TestListener l = new TestListener();
        series.addChangeListener(l);
        series.add(new Day(1, 1, 2020), 1.0, true);
        assertTrue(l.fired);
    }

    @Test
    public void testAddNotifyFalseDoesNotFireListener() {
        TestListener l = new TestListener();
        series.addChangeListener(l);
        series.add(new Day(1, 1, 2020), 1.0, false);
        assertFalse(l.fired);
    }

    @Test
    public void testAddDoubleValueDefaultNotify() {
        series.add(new Day(1, 1, 2020), 9.0);
        assertEquals(9.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddNumberValue() {
        series.add(new Day(1, 1, 2020), new Double(4.5));
        assertEquals(4.5, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddNumberValueNotifyFalse() {
        TestListener l = new TestListener();
        series.addChangeListener(l);
        series.add(new Day(1, 1, 2020), new Double(4.5), false);
        assertFalse(l.fired);
    }

    // =====================================================================
    // update
    // =====================================================================

    @Test
    public void testUpdateByPeriodFound() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.update(d, new Double(99.0));
        assertEquals(99.0, series.getValue(d).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriodNotFoundThrows() {
        series.update(new Day(1, 1, 2020), new Double(99.0));
    }

    @Test
    public void testUpdateByIndex() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.update(0, new Double(55.0));
        assertEquals(55.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // =====================================================================
    // addAndOrUpdate(TimeSeries)
    // =====================================================================

    @Test
    public void testAddAndOrUpdateSeries() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Day(1, 1, 2020), 100.0); // overwrite
        other.add(new Day(2, 1, 2020), 200.0); // new
        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(0).doubleValue(), 0.0001);
        assertEquals(2, series.getItemCount());
        assertEquals(100.0, series.getValue(new Day(1, 1, 2020)).doubleValue(), 0.0001);
    }

    // =====================================================================
    // addOrUpdate
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullPeriodThrows() {
        series.addOrUpdate(null, new Double(1.0));
    }

    @Test
    public void testAddOrUpdateNewItem() {
        TimeSeriesDataItem old = series.addOrUpdate(new Day(1, 1, 2020), 1.0);
        assertNull(old);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateExistingItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        TimeSeriesDataItem old = series.addOrUpdate(d, new Double(2.0));
        assertNotNull(old);
        assertEquals(1.0, old.getValue().doubleValue(), 0.0001);
        assertEquals(2.0, series.getValue(d).doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateExceedsMaximumItemCount() {
        series.setMaximumItemCount(1);
        series.addOrUpdate(new Day(1, 1, 2020), 1.0);
        series.addOrUpdate(new Day(2, 1, 2020), 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    // =====================================================================
    // removeAgedItems(boolean)
    // =====================================================================

    @Test
    public void testRemoveAgedItemsNoRemovalWhenSingleItem() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.setMaximumItemAge(0); // count > 1 false branch
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsRemovesOldWithNotify() {
        TestListener l = new TestListener();
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.addChangeListener(l);
        series.setMaximumItemAge(1);
        assertTrue(series.getItemCount() <= 2);
        assertTrue(l.fired);
    }

    // =====================================================================
    // removeAgedItems(long, boolean)
    // =====================================================================

    @Test
    public void testRemoveAgedItemsLongVariantEmptySeries() {
        series.removeAgedItems(System.currentTimeMillis(), true);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsLongVariantRemovesOld() {
        series.setMaximumItemAge(5);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        TestListener l = new TestListener();
        series.addChangeListener(l);
        long farFuture = new java.util.GregorianCalendar(2030, 0, 1).getTimeInMillis();
        series.removeAgedItems(farFuture, true);
        assertEquals(0, series.getItemCount());
        assertTrue(l.fired);
    }

    @Test
    public void testRemoveAgedItemsLongVariantNotifyFalse() {
        series.setMaximumItemAge(5);
        series.add(new Day(1, 1, 2020), 1.0);
        TestListener l = new TestListener();
        series.addChangeListener(l);
        long farFuture = new java.util.GregorianCalendar(2030, 0, 1).getTimeInMillis();
        series.removeAgedItems(farFuture, false);
        assertFalse(l.fired);
    }

    // =====================================================================
    // clear
    // =====================================================================

    @Test
    public void testClearWithData() {
        series.add(new Day(1, 1, 2020), 1.0);
        TestListener l = new TestListener();
        series.addChangeListener(l);
        series.clear();
        assertEquals(0, series.getItemCount());
        assertTrue(l.fired);
    }

    @Test
    public void testClearEmptyDoesNotFireListener() {
        TestListener l = new TestListener();
        series.addChangeListener(l);
        series.clear();
        assertFalse(l.fired);
    }

    // =====================================================================
    // delete(RegularTimePeriod)
    // =====================================================================

    @Test
    public void testDeletePeriodFound() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.delete(d);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeletePeriodNotFoundNoOp() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.delete(new Day(2, 1, 2020));
        assertEquals(1, series.getItemCount());
    }

    // =====================================================================
    // delete(int, int)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteRangeInvalidThrows() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.delete(2, 1);
    }

    @Test
    public void testDeleteRangeValid() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
    }

    // =====================================================================
    // clone / createCopy(int,int)
    // =====================================================================

    @Test
    public void testCloneIndependence() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries clone = (TimeSeries) series.clone();
        clone.add(new Day(2, 1, 2020), 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2, clone.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyStartNegativeThrows() throws Exception {
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyEndLessThanStartThrows() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopyEmptyData() throws Exception {
        // data.size()==0 -> for-loop skipped (start<=end ยังต้องผ่านการตรวจสอบ)
        TimeSeries copy = series.createCopy(0, 0);
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyValidRange() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
    }

    // =====================================================================
    // createCopy(RegularTimePeriod, RegularTimePeriod)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodNullStartThrows() throws Exception {
        series.createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodNullEndThrows() throws Exception {
        series.createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyByPeriodStartAfterEndThrows() throws Exception {
        series.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testCreateCopyByPeriodEmptyRangeStartAfterLastItem() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries copy = series.createCopy(new Day(5, 1, 2020), new Day(6, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyByPeriodValidRange() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(2, copy.getItemCount());
    }

    @Test
    public void testCreateCopyByPeriodEndNotInSeriesUsesPriorIndex() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(1, copy.getItemCount());
    }

    // =====================================================================
    // equals
    // =====================================================================

    @Test
    public void testEqualsSameInstance() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsNullOrDifferentType() {
        assertFalse(series.equals(null));
        assertFalse(series.equals("not a series"));
    }

    @Test
    public void testEqualsDifferentDomainDescription() {
        TimeSeries s1 = new TimeSeries("Name", "D1", "R", Day.class);
        TimeSeries s2 = new TimeSeries("Name", "D2", "R", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentRangeDescription() {
        TimeSeries s1 = new TimeSeries("Name", "D", "R1", Day.class);
        TimeSeries s2 = new TimeSeries("Name", "D", "R2", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentClass() {
        TimeSeries s1 = new TimeSeries("Name");
        TimeSeriesSubclass s2 = new TimeSeriesSubclass("Name");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentMaximumItemAge() {
        TimeSeries s1 = new TimeSeries("Name");
        TimeSeries s2 = new TimeSeries("Name");
        s2.setMaximumItemAge(5);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentMaximumItemCount() {
        TimeSeries s1 = new TimeSeries("Name");
        TimeSeries s2 = new TimeSeries("Name");
        s2.setMaximumItemCount(5);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentItemCount() {
        TimeSeries s1 = new TimeSeries("Name");
        TimeSeries s2 = new TimeSeries("Name");
        s2.add(new Day(1, 1, 2020), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentDataItem() {
        TimeSeries s1 = new TimeSeries("Name");
        TimeSeries s2 = new TimeSeries("Name");
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsTrueCase() {
        TimeSeries s1 = new TimeSeries("Name", "D", "R", Day.class);
        TimeSeries s2 = new TimeSeries("Name", "D", "R", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertTrue(s1.equals(s2));
    }

    // =====================================================================
    // hashCode
    // =====================================================================

    @Test
    public void testHashCodeEmptySeries() {
        // count == 0: ไม่เข้า if ใด ๆ เลย ตรวจสอบเพียงว่าไม่ throw
        series.hashCode();
    }

    @Test
    public void testHashCodeOneItem() {
        series.add(new Day(1, 1, 2020), 1.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCodeTwoItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCodeThreeOrMoreItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        TimeSeries s1 = new TimeSeries("Name", "D", "R", Day.class);
        TimeSeries s2 = new TimeSeries("Name", "D", "R", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor / testConstructorWithTimePeriodClass / testFullConstructor | 3 constructor overloads |
| testSetDomainDescription(Null) / testSetRangeDescription | setter + property change (ไม่ null/null) |
| testGetItemCountEmpty / testGetItemsUnmodifiable | getItemCount, unmodifiable list exception |
| testSetMaximumItemCountNegativeThrows | `maximum < 0` → throw |
| testSetMaximumItemCountZeroBoundary | boundary `maximum == 0` |
| testSetMaximumItemCountTrimsExistingData | `count > maximum` → delete branch |
| testSetMaximumItemCountNoTrimNeeded | `count > maximum` false |
| testSetMaximumItemAgeNegativeThrows | `periods < 0` → throw |
| testSetMaximumItemAgeBoundaryZero | removeAgedItems while-loop boundary |
| testGetDataItemByIndexOutOfBounds | index invalid → exception |
| testGetDataItemByPeriodFound/NotFound | `getDataItem(period)` if/else |
| testGetTimePeriod(EmptySeriesThrows) | getTimePeriod ปกติ/ผิดพลาด |
| testGetNextTimePeriod(EmptySeriesThrows) | getNextTimePeriod ปกติ/ผิดพลาด |
| testGetTimePeriodsEmpty/NonEmpty | for-loop 0 และ >0 รอบ |
| testGetTimePeriodsUniqueToOtherSeries(NoUnique) | `index < 0` if/else ใน loop |
| testGetIndexNullThrows/Found/NotFound | null check, found/not found |
| testGetValueByIndex/ByPeriodFound/NotFound | if/else ของ getValue(period) |
| testAddNullItemThrows | null item → throw |
| testAddWrongPeriodClassThrows | class mismatch → SeriesException |
| testAddFirstItem | `count == 0` branch |
| testAddAppendItem | `period.compareTo(last) > 0` true |
| testAddInsertMiddleItem | binarySearch insert (`index < 0`) |
| testAddDuplicatePeriodThrows | binarySearch found (`index >= 0`) → throw |
| testAddExceedsMaximumItemCountRemovesFirst | `getItemCount() > maximumItemCount` |
| testAddNotifyTrue/FalseFiresListener | `notify` flag true/false |
| testAddDoubleValue/NumberValue(NotifyFalse) | overload delegation |
| testUpdateByPeriodFound/NotFoundThrows | `index >= 0` if/else |
| testUpdateByIndex | update(int,Number) |
| testAddAndOrUpdateSeries | loop + oldItem != null branch |
| testAddOrUpdateNullPeriodThrows | null check |
| testAddOrUpdateNewItem/ExistingItem | `index >= 0` if/else |
| testAddOrUpdateExceedsMaximumItemCount | maximumItemCount branch ใน addOrUpdate |
| testRemoveAgedItemsNoRemovalWhenSingleItem | `getItemCount() > 1` false |
| testRemoveAgedItemsRemovesOldWithNotify | while-loop true, `removed && notify` |
| testRemoveAgedItemsLongVariantEmptySeries | while-loop `getItemCount()>0` false |
| testRemoveAgedItemsLongVariantRemovesOld/NotifyFalse | while-loop true, notify true/false |
| testClearWithData/EmptyDoesNotFireListener | `data.size() > 0` true/false |
| testDeletePeriodFound/NotFoundNoOp | `index >= 0` if/else |
| testDeleteRangeInvalidThrows/Valid | `end < start` throw / for-loop ปกติ |
| testCloneIndependence | clone() → createCopy(0,count-1) |
| testCreateCopyStartNegativeThrows/EndLessThanStartThrows | argument validation |
| testCreateCopyEmptyData/ValidRange | `data.size() > 0` false/true |
| testCreateCopyByPeriodNullStart/EndThrows/StartAfterEndThrows | null/compare check |
| testCreateCopyByPeriodEmptyRangeStartAfterLastItem | `startIndex == data.size()` → emptyRange |
| testCreateCopyByPeriodValidRange | ปกติ ไม่มี emptyRange |
| testCreateCopyByPeriodEndNotInSeriesUsesPriorIndex | `endIndex < 0` adjustment |
| testEqualsSameInstance/NullOrDifferentType | object==this, instanceof/super.equals false |
| testEqualsDifferentDomain/Range/Class/MaxAge/MaxCount/ItemCount/DataItem | ทุก early-return false branch |
| testEqualsTrueCase | ผ่านทุก condition → true |
| testHashCodeEmpty/One/Two/ThreeOrMoreItems | `count>0`, `count>1`, `count>2` |
| testHashCodeConsistentForEqualObjects | ความสอดคล้องของ hashCode |

**หมายเหตุสำคัญ:** branch ของ `catch(NoSuchMethodException/IllegalAccessException/InvocationTargetException)` ใน `removeAgedItems(long, boolean)` ไม่สามารถ trigger ได้ผ่าน public API ปกติ (เนื่องจากต้องพึ่ง reflection failure ภายใน) จึงไม่ได้ถูกทดสอบตรง ๆ ตามข้อกำหนดที่ห้ามเดา behavior