package org.jfree.data.xy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.jfree.data.general.SeriesException;

public class XYSeriesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        XYSeries series = new XYSeries("Test");
        series.add((XYDataItem) null);
    }

    @Test
    public void testAutoSortAndDuplicateXValuesAllowed() {
        XYSeries series = new XYSeries("Test", true, true);
        series.add(2.0, 1.0);
        series.add(1.0, 2.0);
        series.add(2.0, 3.0); // Duplicate x, allowed

        assertEquals(3, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0001);
        assertEquals(2.0, series.getX(2).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testAutoSortAndDuplicateXValuesNotAllowed() {
        XYSeries series = new XYSeries("Test", true, false);
        series.add(1.0, 2.0);
        series.add(1.0, 3.0); // Should throw SeriesException
    }

    @Test
    public void testUnsortedAndDuplicateXValuesAllowed() {
        XYSeries series = new XYSeries("Test", false, true);
        series.add(2.0, 1.0);
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);

        assertEquals(3, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(1.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUnsortedAndDuplicateXValuesNotAllowed() {
        XYSeries series = new XYSeries("Test", false, false);
        series.add(1.0, 2.0);
        series.add(1.0, 3.0); // Should throw SeriesException
    }

    @Test
    public void testMaximumItemCountEnforcement() {
        XYSeries series = new XYSeries("Test");
        series.setMaximumItemCount(2);
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0); // Should remove item with x = 1.0

        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0001);
    }

    @Test
    public void testSetMaximumItemCountRemovesExistingItems() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        
        series.setMaximumItemCount(1);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getX(0).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNullX() {
        XYSeries series = new XYSeries("Test");
        series.addOrUpdate(null, 1.0);
    }

    @Test
    public void testAddOrUpdateExistingValueWithoutDuplicatesAllowed() {
        XYSeries series = new XYSeries("Test", true, false);
        series.add(1.0, 5.0);
        XYDataItem overwritten = series.addOrUpdate(1.0, 10.0);

        assertNotNull(overwritten);
        assertEquals(5.0, overwritten.getY().doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
        assertEquals(10.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddOrUpdateNewValue() {
        XYSeries series = new XYSeries("Test", true, false);
        series.add(1.0, 5.0);
        XYDataItem overwritten = series.addOrUpdate(2.0, 10.0);

        assertNull(overwritten);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testRemoveByIndex() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);

        XYDataItem removed = series.remove(0);
        assertEquals(1.0, removed.getX().doubleValue(), 0.0001);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveByNumber() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);

        XYDataItem removed = series.remove(new Double(1.0));
        assertNotNull(removed);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testClearSeries() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());

        // Clear empty series branch
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testUpdateByIndex() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.updateByIndex(0, 99.0);
        assertEquals(99.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateByNumber() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 1.0);
        series.update(new Double(1.0), new Double(50.0));
        assertEquals(50.0, series.getY(0).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentNumber() {
        XYSeries series = new XYSeries("Test");
        series.update(new Double(99.0), new Double(50.0));
    }

    @Test
    public void testToArray() {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 2.0);
        series.add(2.0, null);

        double[][] array = series.toArray();
        assertEquals(2, array.length);
        assertEquals(1.0, array[0][0], 0.0001);
        assertEquals(2.0, array[1][0], 0.0001);
        assertEquals(2.0, array[0][1], 0.0001);
        assertTrue(Double.isNaN(array[1][1]));
    }

    @Test
    public void testCloneAndCreateCopy() throws CloneNotSupportedException {
        XYSeries series = new XYSeries("Test");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);

        XYSeries clone = (XYSeries) series.clone();
        assertEquals(series, clone);

        XYSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() {
        XYSeries s1 = new XYSeries("Test", true, true);
        XYSeries s2 = new XYSeries("Test", true, true);
        XYSeries s3 = new XYSeries("Different", true, true);
        XYSeries s4 = new XYSeries("Test", false, true);

        assertEquals(s1, s1);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        assertNotEquals(s1, null);
        assertNotEquals(s1, "NotAXYSeries");
        assertNotEquals(s1, s3);
        assertNotEquals(s1, s4);

        s1.add(1.0, 1.0);
        s1.add(2.0, 2.0);
        s1.add(3.0, 3.0);
        
        // Test hashCode with count > 2 (triggers first, middle, last item hash branches)
        assertNotNull(s1.hashCode());
        
        // Test equals with data difference
        assertNotEquals(s1, s2);
    }
}