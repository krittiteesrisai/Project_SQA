package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.jfree.data.general.SeriesException;

public class TimeSeriesTest {

    @Test
    public void testConstructorAndBasicGetters() {
        TimeSeries series = new TimeSeries("Test Series", "DomainDesc", "RangeDesc");
        assertEquals("Test Series", series.getKey());
        assertEquals("DomainDesc", series.getDomainDescription());
        assertEquals("RangeDesc", series.getRangeDescription());
        assertNull(series.getTimePeriodClass());
        assertEquals(0, series.getItemCount());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));

        // Default constructor
        TimeSeries defaultSeries = new TimeSeries("Default");
        assertEquals("Time", defaultSeries.getDomainDescription());
        assertEquals("Value", defaultSeries.getRangeDescription());
    }

    @Test
    public void testSetDescriptions() {
        TimeSeries series = new TimeSeries("Test");
        series.setDomainDescription("NewDomain");
        series.setRangeDescription("NewRange");
        assertEquals("NewDomain", series.getDomainDescription());
        assertEquals("NewRange", series.getRangeDescription());

        series.setDomainDescription(null);
        series.setRangeDescription(null);
        assertNull(series.getDomainDescription());
        assertNull(series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountEnforcement() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemCount(2);
        series.add(new Year(2000), 10.0);
        series.add(new Year(2001), 20.0);
        assertEquals(2, series.getItemCount());

        // Adding a 3rd item should evict the first item (Year 2000)
        series.add(new Year(2002), 30.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(0));
        assertEquals(20.0, series.getValue(0).doubleValue(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testAddAndGetItems() {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d0 = new Day(31, 12, 2019);

        series.add(d1, 100.0);
        series.add(d2, 200.0);
        // Insert in middle (binary search branch < 0)
        series.add(d0, 50.0);

        assertEquals(3, series.getItemCount());
        assertEquals(d0, series.getTimePeriod(0));
        assertEquals(d1, series.getTimePeriod(1));
        assertEquals(d2, series.getTimePeriod(2));

        assertEquals(50.0, series.getValue(0).doubleValue(), 0.001);
        assertEquals(100.0, series.getValue(d1).doubleValue(), 0.001);
        assertNull(series.getValue(new Day(3, 1, 2020)));

        assertNotNull(series.getDataItem(0));
        assertNotNull(series.getDataItem(d1));
        assertNull(series.getDataItem(new Day(3, 1, 2020)));

        List items = series.getItems();
        assertEquals(3, items.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        TimeSeries series = new TimeSeries("Test");
        series.add(null);
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicatePeriod() {
        TimeSeries series = new TimeSeries("Test");
        Day d = new Day(1, 1, 2020);
        series.add(d, 10.0);
        series.add(d, 20.0); // Should throw SeriesException
    }

    @Test(expected = SeriesException.class)
    public void testAddMismatchedPeriodClass() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Month(1, 2020), 20.0); // Should throw SeriesException
    }

    @Test
    public void testUpdateByIndexAndPeriod() {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 10.0);
        series.add(d2, 20.0);

        series.update(0, 15.0);
        assertEquals(15.0, series.getValue(0).doubleValue(), 0.001);

        series.update(d2, 25.0);
        assertEquals(25.0, series.getValue(1).doubleValue(), 0.001);

        // Test bounds iteration branch on update
        series.update(0, 100.0); // changes max Y
        assertEquals(100.0, series.getMaxY(), 0.001);
        
        series.update(0, 5.0); // forces iteration if min/max impacted
        assertEquals(5.0, series.getMinY(), 0.001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentPeriod() {
        TimeSeries series = new TimeSeries("Test");
        series.update(new Day(1, 1, 2020), 10.0);
    }

    @Test
    public void testAddOrUpdate() {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        
        // Add new via addOrUpdate
        TimeSeriesDataItem overwritten1 = series.addOrUpdate(d1, 10.0);
        assertNull(overwritten1);
        assertEquals(1, series.getItemCount());

        // Update existing via addOrUpdate
        TimeSeriesDataItem overwritten2 = series.addOrUpdate(d1, 20.0);
        assertNotNull(overwritten2);
        assertEquals(10.0, overwritten2.getValue().doubleValue(), 0.001);
        assertEquals(20.0, series.getValue(0).doubleValue(), 0.001);

        // AddOrUpdate with null item exception
        try {
            series.addOrUpdate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRemoveAgedItems() {
        TimeSeries series = new TimeSeries("Test");
        series.setMaximumItemAge(2); // e.g., 2 periods
        series.add(new Year(2018), 10.0);
        series.add(new Year(2019), 20.0);
        series.add(new Year(2020), 30.0); // Latest is 2020, span: 2020 - 2018 = 2 <= 2 (Wait, span logic: latest - oldest > maxAge)
        // 2020 - 2018 = 2. If maxAge = 1, 2 > 1 so 2018 is removed.
        
        series.setMaximumItemAge(1);
        assertEquals(2, series.getItemCount()); // 2019, 2020 should remain (2020 - 2019 = 1, which is not > 1)

        // Test removeAgedItems with long timestamp
        series.removeAgedItems(new Year(2020).getStart().getTime(), true);
    }

    @Test
    public void testClear() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 10.0);
        assertEquals(1, series.getItemCount());
        
        series.clear();
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));

        // Clear empty series branch
        series.clear();
    }

    @Test
    public void testDeletePeriodAndRange() {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        series.add(d1, 10.0);
        series.add(d2, 20.0);
        series.add(d3, 30.0);

        series.delete(d2);
        assertEquals(2, series.getItemCount());
        assertNull(series.getValue(d2));

        // Delete non-existent period (should do nothing)
        series.delete(new Day(10, 1, 2020));

        // Delete by index range
        series.delete(0, 0, true);
        assertEquals(1, series.getItemCount());
        
        // Delete remaining to test empty series timePeriodClass reset
        series.delete(0, 0, false);
        assertNull(series.getTimePeriodClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidIndexRange() {
        TimeSeries series = new TimeSeries("Test");
        series.delete(1, 0);
    }

    @Test
    public void testCreateCopyIntRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(2, 1, 2020), 20.0);

        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(series.getKey(), copy.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidStart() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopyPeriodRange() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        series.add(d1, 10.0);
        series.add(d2, 20.0);
        series.add(d3, 30.0);

        // Normal range
        TimeSeries copy = series.createCopy(d1, d2);
        assertEquals(2, copy.getItemCount());

        // Empty range (start after end or periods not found)
        TimeSeries emptyCopy = series.createCopy(new Day(1, 2, 2020), new Day(2, 2, 2020));
        assertEquals(0, emptyCopy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullStartPeriod() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy((RegularTimePeriod) null, new Day());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullEndPeriod() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.createCopy(new Day(), (RegularTimePeriod) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyStartAfterEndPeriod() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.createCopy(d2, d1);
    }

    @Test
    public void testTimePeriodsAndUnique() {
        TimeSeries series1 = new TimeSeries("Series1");
        TimeSeries series2 = new TimeSeries("Series2");
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);

        series1.add(d1, 10.0);
        series2.add(d1, 15.0);
        series2.add(d2, 20.0);

        Collection periods = series1.getTimePeriods();
        assertEquals(1, periods.size());

        Collection unique = series1.getTimePeriodsUniqueToOtherSeries(series2);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(d2));

        assertNotNull(series1.getNextTimePeriod());
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Test", "Domain", "Range");
        TimeSeries s2 = new TimeSeries("Test", "Domain", "Range");
        Day d = new Day(1, 1, 2020);
        s1.add(d, 10.0);
        s2.add(d, 10.0);

        assertTrue(s1.equals(s1));
        assertTrue(s1.equals(s2));
        assertFalse(s1.equals(null));
        assertFalse(s1.equals("NotATimeSeries"));

        // Different domain
        TimeSeries s3 = new TimeSeries("Test", "DiffDomain", "Range");
        assertFalse(s1.equals(s3));

        // Different range
        TimeSeries s4 = new TimeSeries("Test", "Domain", "DiffRange");
        assertFalse(s1.equals(s4));

        // Different timePeriodClass
        TimeSeries s5 = new TimeSeries("Test");
        s5.add(new Month(1, 2020), 10.0);
        assertFalse(s1.equals(s5));

        // Different max item age
        TimeSeries s6 = new TimeSeries("Test", "Domain", "Range");
        s6.setMaximumItemAge(5);
        assertFalse(s1.equals(s6));

        // Different max item count
        TimeSeries s7 = new TimeSeries("Test", "Domain", "Range");
        s7.setMaximumItemCount(5);
        assertFalse(s1.equals(s7));

        // Different count
        TimeSeries s8 = new TimeSeries("Test", "Domain", "Range");
        assertFalse(s1.equals(s8));

        // Different data
        TimeSeries s9 = new TimeSeries("Test", "Domain", "Range");
        s9.add(d, 99.0);
        assertFalse(s1.equals(s9));

        assertEquals(s1.hashCode(), s2.hashCode());
        
        // Test hashCode with multiple items (>0, >1, >2 branches)
        TimeSeries s10 = new TimeSeries("Test");
        s10.add(new Day(1, 1, 2020), 1.0);
        s10.add(new Day(2, 1, 2020), 2.0);
        s10.add(new Day(3, 1, 2020), 3.0);
        assertTrue(s10.hashCode() != 0);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 10.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series, clone);
        assertNotSame(series, clone);
    }

    @Test
    public void testAddAndOrUpdateSeries() {
        TimeSeries s1 = new TimeSeries("S1");
        TimeSeries s2 = new TimeSeries("S2");
        Day d = new Day(1, 1, 2020);
        s1.add(d, 10.0);
        s2.add(d, 20.0);

        TimeSeries overwritten = s1.addAndOrUpdate(s2);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(20.0, s1.getValue(d).doubleValue(), 0.001);
    }
}