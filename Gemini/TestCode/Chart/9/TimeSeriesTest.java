package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesException;
import org.junit.Test;

public class TimeSeriesTest {

    @Test
    public void testConstructorAndGetters() {
        TimeSeries series = new TimeSeries("TestSeries", Year.class);
        assertEquals("TestSeries", series.getKey());
        assertEquals(TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, series.getDomainDescription());
        assertEquals(TimeSeries.DEFAULT_RANGE_DESCRIPTION, series.getRangeDescription());
        assertEquals(Year.class, series.getTimePeriodClass());
        assertEquals(0, series.getItemCount());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testDomainAndRangeDescriptions() {
        TimeSeries series = new TimeSeries("Test");
        series.setDomainDescription("Custom Domain");
        assertEquals("Custom Domain", series.getDomainDescription());

        series.setRangeDescription("Custom Range");
        assertEquals("Custom Range", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountPruning() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(1, 1, 2020), 100.0);
        series.add(new Day(2, 1, 2020), 200.0);
        series.add(new Day(3, 1, 2020), 300.0);

        assertEquals(3, series.getItemCount());
        series.setMaximumItemCount(1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemAge(-5L);
    }

    @Test
    public void testSetMaximumItemAge() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(10, 1, 2020), 20.0);
        
        series.setMaximumItemAge(5L); // Latest is Jan 10, age > 5 removes Jan 1
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(10, 1, 2020), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        TimeSeries series = new TimeSeries("Test");
        series.add(null);
    }

    @Test(expected = SeriesException.class)
    public void testAddInvalidPeriodClass() {
        TimeSeries series = new TimeSeries("Test", Year.class);
        series.add(new Day(1, 1, 2020), 100.0);
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriod() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        Day day = new Day(1, 1, 2020);
        series.add(day, 100.0);
        series.add(day, 200.0);
    }

    @Test
    public void testAddChronologicalAndMiddleInsertion() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(2, 1, 2020), 200.0); // count == 0
        series.add(new Day(3, 1, 2020), 300.0); // compareTo > last
        series.add(new Day(1, 1, 2020), 100.0); // binary search middle insertion (< 0)

        assertEquals(3, series.getItemCount());
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(1));
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(2));
    }

    @Test
    public void testGetDataItemAndValues() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        Day day = new Day(1, 1, 2020);
        series.add(day, 50.0);

        assertNotNull(series.getDataItem(0));
        assertNotNull(series.getDataItem(day));
        assertNull(series.getDataItem(new Day(2, 1, 2020)));

        assertEquals(50.0, series.getValue(0).doubleValue(), 0.001);
        assertEquals(50.0, series.getValue(day).doubleValue(), 0.001);
        assertNull(series.getValue(new Day(2, 1, 2020)));
    }

    @Test
    public void testGetNextTimePeriodAndCollections() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);

        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Day(3, 1, 2020), next);

        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());

        TimeSeries series2 = new TimeSeries("Test2", Day.class);
        series2.add(new Day(2, 1, 2020), 20.0);
        series2.add(new Day(3, 1, 2020), 30.0);

        Collection unique = series2.getTimePeriodsUniqueToOtherSeries(series);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Day(3, 1, 2020)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullPeriod() {
        TimeSeries series = new TimeSeries("Test");
        series.getIndex(null);
    }

    @Test
    public void testUpdateMethods() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        Day day = new Day(1, 1, 2020);
        series.add(day, 10.0);

        series.update(0, 15.0);
        assertEquals(15.0, series.getValue(0).doubleValue(), 0.001);

        series.update(day, 20.0);
        assertEquals(20.0, series.getValue(0).doubleValue(), 0.001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentPeriod() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.update(new Day(1, 1, 2020), 10.0);
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries series1 = new TimeSeries("Test1", Day.class);
        series1.add(new Day(1, 1, 2020), 10.0);
        series1.add(new Day(2, 1, 2020), 20.0);

        TimeSeries series2 = new TimeSeries("Test2", Day.class);
        series2.add(new Day(2, 1, 2020), 25.0);
        series2.add(new Day(3, 1, 2020), 30.0);

        TimeSeries overwritten = series1.addAndOrUpdate(series2);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(25.0, series1.getValue(new Day(2, 1, 2020)).doubleValue(), 0.001);
        assertEquals(3, series1.getItemCount());
    }

    @Test
    public void testAddOrUpdateNewAndExisting() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        Day day1 = new Day(1, 1, 2020);
        
        // Add new via addOrUpdate
        TimeSeriesDataItem overwritten = series.addOrUpdate(day1, 100.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());

        // Update existing via addOrUpdate
        overwritten = series.addOrUpdate(day1, 150.0);
        assertNotNull(overwritten);
        assertEquals(100.0, overwritten.getValue().doubleValue(), 0.001);
        assertEquals(150.0, series.getValue(day1).doubleValue(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullPeriod() {
        TimeSeries series = new TimeSeries("Test");
        series.addOrUpdate(null, 10.0);
    }

    @Test
    public void testClearAndDelete() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        Day day1 = new Day(1, 1, 2020);
        Day day2 = new Day(2, 1, 2020);
        series.add(day1, 10.0);
        series.add(day2, 20.0);

        series.delete(day1);
        assertEquals(1, series.getItemCount());

        series.add(day1, 10.0); // Re-add
        series.delete(0, 1);
        assertEquals(0, series.getItemCount());

        series.add(day1, 10.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidRange() {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.delete(1, 0);
    }

    @Test
    public void testCloneAndCreateCopy() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test", Day.class);
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);

        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series, clone);

        TimeSeries copyIndex = series.createCopy(0, 1);
        assertEquals(2, copyIndex.getItemCount());

        TimeSeries copyPeriod = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(2, copyPeriod.getItemCount());
        
        // Edge case: empty range in createCopy by period
        TimeSeries emptyCopy = series.createCopy(new Day(5, 1, 2020), new Day(6, 1, 2020));
        assertEquals(0, emptyCopy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidIndexStart() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidIndexRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullPeriodStart() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy((RegularTimePeriod) null, new Day());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullPeriodEnd() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(new Day(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodStartAfterEnd() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(2, 1, 2020);
        Day d2 = new Day(1, 1, 2020);
        series.createCopy(d1, d2);
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Test", Day.class);
        TimeSeries s2 = new TimeSeries("Test", Day.class);

        assertEquals(s1, s1);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        assertFalse(s1.equals(null));
        assertFalse(s1.equals("NotATimeSeries"));

        s2.setDomainDescription("Different");
        assertFalse(s1.equals(s2));

        s2 = new TimeSeries("Test", Day.class);
        s2.setRangeDescription("Different");
        assertFalse(s1.equals(s2));

        s2 = new TimeSeries("Test", Day.class);
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));

        s2 = new TimeSeries("Test", Day.class);
        s2.setMaximumItemAge(10L);
        assertFalse(s1.equals(s2));

        s1.add(new Day(1, 1, 2020), 10.0);
        s2.add(new Day(1, 1, 2020), 20.0);
        assertFalse(s1.equals(s2));
    }
}