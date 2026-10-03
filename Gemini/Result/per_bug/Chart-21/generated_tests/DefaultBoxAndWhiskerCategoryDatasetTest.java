package org.jfree.data.statistics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.jfree.data.Range;

/**
 * Comprehensive JUnit 4 Test Suite for DefaultBoxAndWhiskerCategoryDataset (Chart-21b).
 * Focused on Branch/Condition Coverage and Edge Cases (NaN, Bounds updating, Null items).
 */
public class DefaultBoxAndWhiskerCategoryDatasetTest {

    private DefaultBoxAndWhiskerCategoryDataset dataset;

    @Before
    public void setUp() {
        dataset = new DefaultBoxAndWhiskerCategoryDataset();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, dataset.getRowCount());
        assertEquals(0, dataset.getColumnCount());
        assertTrue(Double.isNaN(dataset.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
        assertNotNull(dataset.getRangeBounds(false));
    }

    @Test
    public void testAddBoxAndWhiskerItemWithList() {
        List<Double> values = Arrays.AsList(1.0, 2.0, 3.0, 4.0, 5.0);
        dataset.add(values, "Row1", "Col1");

        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());
        assertNotNull(dataset.getItem(0, 0));
        assertEquals(3.0, dataset.getValue("Row1", "Col1").doubleValue(), 0.001);
    }

    @Test
    public void testAddMultipleItemsAndBoundsUpdate() {
        // Item 1: Min = 2.0, Max = 10.0
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(
                5.0, 5.0, 2.0, 8.0, 2.0, 10.0, 1.0, 12.0, new ArrayList()
        );
        dataset.add(item1, "R1", "C1");

        assertEquals(2.0, dataset.getRangeLowerBound(false), 0.001);
        assertEquals(10.0, dataset.getRangeUpperBound(false), 0.001);

        // Item 2: Min = 0.5, Max = 15.0 (New Min and New Max)
        BoxAndWhiskerItem item2 = new BoxAndWhiskerItem(
                5.0, 5.0, 0.5, 9.0, 0.5, 15.0, 0.0, 20.0, new ArrayList()
        );
        dataset.add(item2, "R1", "C2");

        assertEquals(0.5, dataset.getRangeLowerBound(false), 0.001);
        assertEquals(15.0, dataset.getRangeUpperBound(false), 0.001);

        // Item 3: Min = 5.0, Max = 7.0 (Should not alter global min/max)
        BoxAndWhiskerItem item3 = new BoxAndWhiskerItem(
                6.0, 6.0, 5.0, 7.0, 5.0, 7.0, 4.0, 8.0, new ArrayList()
        );
        dataset.add(item3, "R2", "C1");

        assertEquals(0.5, dataset.getRangeLowerBound(false), 0.001);
        assertEquals(15.0, dataset.getRangeUpperBound(false), 0.001);
    }

    @Test
    public void testUpdateBoundsTriggerOnCellOverwrite() {
        // Add initial item which becomes both min and max
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(
                5.0, 5.0, 2.0, 8.0, 2.0, 8.0, 1.0, 9.0, new ArrayList()
        );
        dataset.add(item1, "R1", "C1");
        assertEquals(2.0, dataset.getRangeLowerBound(false), 0.001);
        assertEquals(8.0, dataset.getRangeUpperBound(false), 0.001);

        // Overwrite "R1", "C1" with values that are narrower (triggers updateBounds branch)
        BoxAndWhiskerItem item2 = new BoxAndWhiskerItem(
                5.0, 5.0, 4.0, 6.0, 4.0, 6.0, 3.0, 7.0, new ArrayList()
        );
        dataset.add(item2, "R1", "C1");

        // Since R1C1 was max/min, updating it resets bounds and recalculates from remaining (none here) or new item
        assertEquals(4.0, dataset.getRangeLowerBound(false), 0.001);
        assertEquals(6.0, dataset.getRangeUpperBound(false), 0.001);
    }

    @Test
    public void testItemWithNullOutliers() {
        // Item where min/max outliers are null to test branch conditions `item.getMinOutlier() != null`
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                5.0, 5.0, 2.0, 8.0, 2.0, 8.0, null, null, new ArrayList()
        );
        dataset.add(item, "R1", "C1");
        assertTrue(Double.isNaN(dataset.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(dataset.getRangeUpperBound(false)));
    }

    @Test
    public void testAllGettersWithValidAndInvalidIndicesAndKeys() {
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                5.0, 5.0, 2.0, 8.0, 3.0, 7.0, 1.0, 9.0, Arrays.AsList(0.0, 10.0)
        );
        dataset.add(item, "Row", "Col");

        // Test Int-based getters (Valid)
        assertNotNull(dataset.getItem(0, 0));
        assertNotNull(dataset.getValue(0, 0));
        assertNotNull(dataset.getMeanValue(0, 0));
        assertNotNull(dataset.getMedianValue(0, 0));
        assertNotNull(dataset.getQ1Value(0, 0));
        assertNotNull(dataset.getQ3Value(0, 0));
        assertNotNull(dataset.getMinRegularValue(0, 0));
        assertNotNull(dataset.getMaxRegularValue(0, 0));
        assertNotNull(dataset.getMinOutlier(0, 0));
        assertNotNull(dataset.getMaxOutlier(0, 0));
        assertNotNull(dataset.getOutliers(0, 0));

        // Test Key-based getters (Valid)
        assertNotNull(dataset.getValue("Row", "Col"));
        assertNotNull(dataset.getMeanValue("Row", "Col"));
        assertNotNull(dataset.getMedianValue("Row", "Col"));
        assertNotNull(dataset.getQ1Value("Row", "Col"));
        assertNotNull(dataset.getQ3Value("Row", "Col"));
        assertNotNull(dataset.getMinRegularValue("Row", "Col"));
        assertNotNull(dataset.getMaxRegularValue("Row", "Col"));
        assertNotNull(dataset.getMinOutlier("Row", "Col"));
        assertNotNull(dataset.getMaxOutlier("Row", "Col"));
        assertNotNull(dataset.getOutliers("Row", "Col"));

        assertEquals(0, dataset.getRowIndex("Row"));
        assertEquals(0, dataset.getColumnIndex("Col"));
        assertEquals("Row", dataset.getRowKey(0));
        assertEquals("Col", dataset.getColumnKey(0));
        assertEquals(1, dataset.getRowKeys().size());
        assertEquals(1, dataset.getColumnKeys().size());

        // Test Invalid / Non-existent Getters (Should return null or handle gracefully)
        assertNull(dataset.getItem(99, 99));
        assertNull(dataset.getMeanValue(99, 99));
        assertNull(dataset.getMeanValue("InvalidKey", "InvalidKey"));
        assertNull(dataset.getMedianValue(99, 99));
        assertNull(dataset.getMedianValue("InvalidKey", "InvalidKey"));
        assertNull(dataset.getQ1Value(99, 99));
        assertNull(dataset.getQ1Value("InvalidKey", "InvalidKey"));
        assertNull(dataset.getQ3Value(99, 99));
        assertNull(dataset.getQ3Value("InvalidKey", "InvalidKey"));
        assertNull(dataset.getMinRegularValue(99, 99));
        assertNull(dataset.getMinRegularValue("InvalidKey", "InvalidKey"));
        assertNull(dataset.getMaxRegularValue(99, 99));
        assertNull(dataset.getMaxRegularValue("InvalidKey", "InvalidKey"));
        assertNull(dataset.getMinOutlier(99, 99));
        assertNull(dataset.getMinOutlier("InvalidKey", "InvalidKey"));
        assertNull(dataset.getMaxOutlier(99, 99));
        assertNull(dataset.getMaxOutlier("InvalidKey", "InvalidKey"));
        assertNull(dataset.getOutliers(99, 99));
        assertNull(dataset.getOutliers("InvalidKey", "InvalidKey"));
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                5.0, 5.0, 2.0, 8.0, 3.0, 7.0, 1.0, 9.0, new ArrayList()
        );
        dataset.add(item, "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset dataset2 = (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();

        assertTrue(dataset.equals(dataset));
        assertTrue(dataset.equals(dataset2));
        assertFalse(dataset.equals(null));
        assertFalse(dataset.equals("NotADataset"));

        // Modify clone and check inequality
        dataset2.add(item, "R2", "C2");
        assertFalse(dataset.equals(dataset2));
    }
}