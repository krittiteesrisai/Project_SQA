package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        // สร้าง TimeSeries เริ่มต้นประเภท Day
        series = new TimeSeries("TestSeries", Day.class);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("TestSeries", series.getKey());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, series.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, series.getRangeDescription());
        assertEquals(Day.class, series.getTimePeriodClass());
        assertEquals(0, series.getItemCount());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testSetDescriptions() {
        series.setDomainDescription("Custom Domain");
        series.setRangeDescription("Custom Range");
        assertEquals("Custom Domain", series.getDomainDescription());
        assertEquals("Custom Range", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItemThrowsException() {
        series.add(null);
    }

    @Test(expected = SeriesException.class)
    public void testAddMismatchedPeriodClassThrowsException() {
        // series คาดหวัง Day แต่ส่ง Year เข้าไป
        series.add(new Year(2023), 100.0);
    }

    @Test
    public void testAddItemsSuccessfully() {
        Day day1 = new Day(1, 1, 2023);
        Day day2 = new Day(2, 1, 2023);
        Day day0 = new Day(31, 12, 2022);

        // เพิ่มตัวแรก (count == 0)
        series.add(day1, 10.0);
        assertEquals(1, series.getItemCount());

        // เพิ่มต่อท้าย (> last)
        series.add(day2, 20.0);
        assertEquals(2, series.getItemCount());

        // เพิ่มแทรกตรงกลาง (binarySearch < 0)
        series.add(day0, 5.0);
        assertEquals(3, series.getItemCount());
        assertEquals(day0, series.getTimePeriod(0));
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriodThrowsException() {
        Day day = new Day(1, 1, 2023);
        series.add(day, 10.0);
        // ซ้ำ Period เดิมต้องโยน SeriesException
        series.add(day, 20.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountRemovesOldest() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2023), 10.0);
        series.add(new Day(2, 1, 2023), 20.0);
        // การเพิ่มตัวที่ 3 จะเกิน MaximumItemCount (2) และลบตัวแรกสุดออก
        series.add(new Day(3, 1, 2023), 30.0);

        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2023), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testMaximumItemAgeAging() {
        series.setMaximumItemAge(2); // ยอมให้ห่างกันไม่เกิน 2 วัน
        series.add(new Day(1, 1, 2023), 10.0);
        series.add(new Day(2, 1, 2023), 20.0);
        // เพิ่ม Day(5, 1, 2023) ซึ่งห่างจาก Day(1) เกิน 2 วัน (5 - 1 = 4 > 2)
        series.add(new Day(5, 1, 2023), 50.0);

        // Day(1) และ Day(2) ควรถูกลบออกเพราะเก่าเกินไป
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(5, 1, 2023), series.getTimePeriod(0));
    }

    @Test
    public void testGetDataItemAndValues() {
        Day day = new Day(1, 1, 2023);
        series.add(day, 15.5);

        assertNotNull(series.getDataItem(0));
        assertNotNull(series.getDataItem(day));
        assertEquals(15.5, series.getValue(0).doubleValue(), 0.001);
        assertEquals(15.5, series.getValue(day).doubleValue(), 0.001);

        // ทดสอบกรณี Period ไม่มีอยู่ในระบบ
        Day missingDay = new Day(2, 1, 2023);
        assertNull(series.getDataItem(missingDay));
        assertNull(series.getValue(missingDay));
    }

    @Test
    public void testGetNextTimePeriodAndCollections() {
        series.add(new Day(1, 1, 2023), 10.0);
        series.add(new Day(2, 1, 2023), 20.0);

        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Day(3, 1, 2023), next);

        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());

        TimeSeries otherSeries = new TimeSeries("Other", Day.class);
        otherSeries.add(new Day(2, 1, 2023), 20.0);
        otherSeries.add(new Day(3, 1, 2023), 30.0);

        Collection unique = series.getTimePeriodsUniqueToOtherSeries(otherSeries);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Day(3, 1, 2023)));
    }

    @Test
    public void testUpdateMethods() {
        Day day = new Day(1, 1, 2023);
        series.add(day, 10.0);

        // Update ด้วย Index
        series.update(0, 99.0);
        assertEquals(99.0, series.getValue(0).doubleValue(), 0.001);

        // Update ด้วย Period
        series.update(day, 50.0);
        assertEquals(50.0, series.getValue(day).doubleValue(), 0.001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentPeriodThrowsException() {
        series.update(new Day(1, 1, 2023), 10.0);
    }

    @Test
    public void testAddOrUpdate() {
        Day day = new Day(1, 1, 2023);
        // เพิ่มใหม่ (ยังไม่มี) ควรรีเทิร์น null
        TimeSeriesDataItem old1 = series.addOrUpdate(day, 10.0);
        assertNull(old1);

        // อัปเดตตัวเดิม ควรรีเทิร์นตัวเก่าที่ถูกทับ
        TimeSeriesDataItem old2 = series.addOrUpdate(day, 20.0);
        assertNotNull(old2);
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.001);
    }

    @Test
    public void testClearSeries() {
        series.add(new Day(1, 1, 2023), 10.0);
        assertEquals(1, series.getItemCount());
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeletePeriodAndRange() {
        series.add(new Day(1, 1, 2023), 10.0);
        series.add(new Day(2, 1, 2023), 20.0);
        series.add(new Day(3, 1, 2023), 30.0);

        // ลบด้วย Period
        series.delete(new Day(1, 1, 2023));
        assertEquals(2, series.getItemCount());

        // ลบด้วย Range Index (start, end)
        series.delete(0, 1);
        assertEquals(0, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidRangeThrowsException() {
        series.add(new Day(1, 1, 2023), 10.0);
        series.delete(1, 0); // end < start
    }

    @Test
    public void testCloneAndCreateCopy() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2023), 10.0);
        series.add(new Day(2, 1, 2023), 20.0);

        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series, clone);

        TimeSeries copyIndex = series.createCopy(0, 1);
        assertEquals(2, copyIndex.getItemCount());

        TimeSeries copyPeriod = series.createCopy(new Day(1, 1, 2023), new Day(2, 1, 2023));
        assertEquals(2, copyPeriod.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidIndexThrowsException() throws CloneNotSupportedException {
        series.createCopy(-1, 0);
    }

    @Test
    public void testCreateCopyEmptyRangeByPeriod() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2023), 10.0);
        // ค้นหาช่วงเวลาที่ไม่อยู่ในซีรีส์และอยู่หลังสุด (emptyRange = true)
        TimeSeries emptyCopy = series.createCopy(new Day(10, 1, 2023), new Day(15, 1, 2023));
        assertNotNull(emptyCopy);
        assertEquals(0, emptyCopy.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() {
        series.add(new Day(1, 1, 2023), 10.0);

        TimeSeries sameSeries = new TimeSeries("TestSeries", Day.class);
        sameSeries.add(new Day(1, 1, 2023), 10.0);

        TimeSeries diffSeries = new TimeSeries("DiffSeries", Day.class);

        assertEquals(series, series); // self
        assertEquals(series, sameSeries);
        assertEquals(series.hashCode(), sameSeries.hashCode());
        assertNotEquals(series, null);
        assertNotEquals(series, "NotATimeSeries");
        assertNotEquals(series, diffSeries);
    }
}