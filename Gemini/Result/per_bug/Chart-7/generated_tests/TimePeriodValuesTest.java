package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for TimePeriodValues (Chart-7b).
 */
public class TimePeriodValuesTest {

    @Test
    public void testConstructorAndGetters() {
        TimePeriodValues series = new TimePeriodValues("Series1", "Domain1", "Range1");
        assertEquals("Series1", series.getKey());
        assertEquals("Domain1", series.getDomainDescription());
        assertEquals("Range1", series.getRangeDescription());
        assertEquals(0, series.getItemCount());

        // Test single-arg constructor defaults
        TimePeriodValues series2 = new TimePeriodValues("Series2");
        assertEquals("Series2", series2.getKey());
        assertEquals(TimePeriodValues.DEFAULT_DOMAIN_DESCRIPTION, series2.getDomainDescription());
        assertEquals(TimePeriodValues.DEFAULT_RANGE_DESCRIPTION, series2.getRangeDescription());
    }

    @Test
    public void testSetDescriptions() {
        TimePeriodValues series = new TimePeriodValues("Series1");
        series.setDomainDescription("NewDomain");
        assertEquals("NewDomain", series.getDomainDescription());

        series.setRangeDescription("NewRange");
        assertEquals("NewRange", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        TimePeriodValues series = new TimePeriodValues("Series1");
        series.add(null);
    }

    @Test
    public void testAddAndBoundsCalculation() {
        TimePeriodValues series = new TimePeriodValues("Series1");

        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(1000L), new Date(3000L)); // middle = 2000
        SimpleTimePeriod p2 = new SimpleTimePeriod(new Date(500L), new Date(4000L));  // middle = 2250 (max middle)
        SimpleTimePeriod p3 = new SimpleTimePeriod(new Date(2000L), new Date(2500L)); // middle = 2250, min start = 2000
        SimpleTimePeriod p4 = new SimpleTimePeriod(new Date(0L), new Date(5000L));    // min start=0, max start=2000, min end=3000(wait), max end=5000

        series.add(p1, 10.0);
        assertEquals(0, series.getMinStartIndex());
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex());
        assertEquals(0, series.getMaxMiddleIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(0, series.getMaxEndIndex());

        series.add(p2, 20.0); // p2 start 500 < 1000 (minStart -> 1), p2 end 4000 > 3000 (maxEnd -> 1), middle 2250 > 2000 (maxMiddle -> 1)
        assertEquals(1, series.getMinStartIndex());
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex());
        assertEquals(1, series.getMaxMiddleIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(1, series.getMaxEndIndex());

        // Add p3
        series.add(p3, 30.0);
        // Add p4 to test various branches
        series.add(p4, 40.0);

        assertEquals(3, series.getMinStartIndex()); // p4 start = 0
        assertEquals(2, series.getMaxStartIndex()); // p3 start = 2000
    }

    @Test
    public void testUpdate() {
        TimePeriodValues series = new TimePeriodValues("Series1");
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(1000L), new Date(2000L));
        series.add(p1, 10.0);
        
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.001);
        series.update(0, 99.0);
        assertEquals(99.0, series.getValue(0).doubleValue(), 0.001);
        assertEquals(p1, series.getTimePeriod(0));
        assertNotNull(series.getDataItem(0));
    }

    @Test
    public void testDeleteAndRecalculateBounds() {
        TimePeriodValues series = new TimePeriodValues("Series1");
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(1000L), new Date(2000L));
        SimpleTimePeriod p2 = new SimpleTimePeriod(new Date(3000L), new Date(4000L));
        SimpleTimePeriod p3 = new SimpleTimePeriod(new Date(5000L), new Date(6000L));

        series.add(p1, 1.0);
        series.add(p2, 2.0);
        series.add(p3, 3.0);

        assertEquals(3, series.getItemCount());

        // Delete middle element or range
        series.delete(1, 1);
        assertEquals(2, series.getItemCount());
        assertEquals(0, series.getMinStartIndex());
        assertEquals(1, series.getMaxStartIndex());
    }

    @Test
    public void testAddPrimitiveDoubleAndNumber() {
        TimePeriodValues series = new TimePeriodValues("Series1");
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(100L), new Date(200L));
        SimpleTimePeriod p2 = new SimpleTimePeriod(new Date(300L), new Date(400L));

        series.add(p1, 123.45);
        series.add(p2, (Number) null);

        assertEquals(2, series.getItemCount());
        assertEquals(123.45, series.getValue(0).doubleValue(), 0.001);
        assertNull(series.getValue(1));
    }

    @Test
    public void testEqualsAndHashCode() {
        TimePeriodValues s1 = new TimePeriodValues("Series", "Domain", "Range");
        TimePeriodValues s2 = new TimePeriodValues("Series", "Domain", "Range");

        assertTrue(s1.equals(s1)); // self
        assertTrue(s1.equals(s2)); // equivalent
        assertEquals(s1.hashCode(), s2.hashCode());

        // Not an instance of TimePeriodValues
        assertFalse(s1.equals("NotACollection"));

        // Super equals mismatch (different key)
        TimePeriodValues s3 = new TimePeriodValues("DifferentKey", "Domain", "Range");
        assertFalse(s1.equals(s3));

        // Domain mismatch
        TimePeriodValues s4 = new TimePeriodValues("Series", "DiffDomain", "Range");
        assertFalse(s1.equals(s4));

        // Range mismatch
        TimePeriodValues s5 = new TimePeriodValues("Series", "Domain", "DiffRange");
        assertFalse(s1.equals(s5));

        // Item count mismatch
        SimpleTimePeriod p = new SimpleTimePeriod(new Date(0L), new Date(100L));
        s1.add(p, 1.0);
        assertFalse(s1.equals(s2));

        // Item content mismatch
        s2.add(p, 2.0);
        assertFalse(s1.equals(s2));
        
        // Null descriptions check in equals and hashCode
        TimePeriodValues sNull1 = new TimePeriodValues("Series", null, null);
        TimePeriodValues sNull2 = new TimePeriodValues("Series", null, null);
        assertTrue(sNull1.equals(sNull2));
        assertNotNull(sNull1.hashCode());
    }

    @Test
    public void testCloneAndCreateCopy() throws CloneNotSupportedException {
        TimePeriodValues series = new TimePeriodValues("Series1", "Domain", "Range");
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(100L), new Date(200L));
        series.add(p1, 5.0);

        TimePeriodValues cloned = (TimePeriodValues) series.clone();
        assertEquals(series, cloned);
        assertNotSame(series, cloned);

        TimePeriodValues copy = series.createCopy(0, 0);
        assertEquals(1, copy.getItemCount());
        assertEquals(series, copy);

        // Empty copy check
        TimePeriodValues emptySeries = new TimePeriodValues("Empty");
        TimePeriodValues emptyCopy = emptySeries.createCopy(0, 0);
        assertEquals(0, emptyCopy.getItemCount());
    }
}