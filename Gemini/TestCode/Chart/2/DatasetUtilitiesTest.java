package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.pie.DefaultPieDataset;

/**
 * High-coverage JUnit 4 Test Suite for DatasetUtilities (Chart-2b).
 */
public class DatasetUtilitiesTest {

    // --- calculatePieDatasetTotal Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotal_NullDataset() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }

    @Test
    public void testCalculatePieDatasetTotal_ValidAndEdgeValues() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", -5.0); // Should be ignored
        dataset.setValue("C", 0.0);  // Should be ignored
        dataset.setValue((Comparable) null, 15.0); // Null key should be ignored
        dataset.setValue("D", null); // Null value should be treated as 0

        double total = DatasetUtilities.calculatePieDatasetTotal(dataset);
        assertEquals(10.0, total, 0.0001);
    }

    // --- createCategoryDataset Validation Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_NullRowKeys() {
        DatasetUtilities.createCategoryDataset(null, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_NullColumnKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, null, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_DuplicateRowKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1", "R1"}, new Comparable[]{"C1"}, new double[][]{{1.0}, {2.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_DuplicateColumnKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, new Comparable[]{"C1", "C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_RowLengthMismatch() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1", "R2"}, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ColumnLengthMismatch() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, new Comparable[]{"C1", "C2"}, new double[][]{{1.0}});
    }

    @Test
    public void testCreateCategoryDataset_ValidArrayPrimitive() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertNotNull(dataset);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
    }

    @Test
    public void testCreateCategoryDataset_ValidArrayNumber() {
        Number[][] data = {{1.0, 2.0}, {3.0, null}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertNotNull(dataset);
        assertEquals(2, dataset.getRowCount());
    }

    // --- sampleFunction2D / sampleFunction2DToSeries Tests ---

    @Function2D
    private static class DummyFunction implements Function2D {
        public double getValue(double x) {
            return x * x;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_NullFunction() {
        DatasetUtilities.sampleFunction2D(null, 0.0, 1.0, 10, "Series");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_NullKey() {
        DatasetUtilities.sampleFunction2DToSeries(new DummyFunction(), 0.0, 1.0, 10, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_InvalidRange() {
        DatasetUtilities.sampleFunction2DToSeries(new DummyFunction(), 5.0, 1.0, 10, "Series");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_InvalidSamples() {
        DatasetUtilities.sampleFunction2DToSeries(new DummyFunction(), 1.0, 5.0, 1, "Series");
    }

    @Test
    public void testSampleFunction2D_Valid() {
        XYDataset dataset = DatasetUtilities.sampleFunction2D(new DummyFunction(), 0.0, 2.0, 3, "Series");
        assertNotNull(dataset);
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(3, dataset.getItemCount(0));
    }

    // --- isEmptyOrNull Tests ---

    @Test
    public void testIsEmptyOrNull_PieDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
        
        DefaultPieDataset emptyPie = new DefaultPieDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(emptyPie));

        emptyPie.setValue("A", 0.0);
        assertTrue(DatasetUtilities.isEmptyOrNull(emptyPie));

        emptyPie.setValue("B", 10.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(emptyPie));
    }

    @Test
    public void testIsEmptyOrNull_CategoryDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));

        DefaultCategoryDataset emptyCat = new DefaultCategoryDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(emptyCat));

        emptyCat.addValue(null, "R1", "C1");
        assertTrue(DatasetUtilities.isEmptyOrNull(emptyCat));

        emptyCat.addValue(5.0, "R1", "C1");
        assertFalse(DatasetUtilities.isEmptyOrNull(emptyCat));
    }

    @Test
    public void testIsEmptyOrNull_XYDataset() {
        assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));

        XYSeries series = new XYSeries("S1");
        XYSeriesCollection collection = new XYSeriesCollection(series);
        assertTrue(DatasetUtilities.isEmptyOrNull(collection));

        series.add(1.0, 2.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(collection));
    }

    // --- findDomainBounds & iterateDomainBounds Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_NullDataset() {
        DatasetUtilities.findDomainBounds(null);
    }

    @Test
    public void testFindDomainBounds_XYDatasetWithNaN() {
        XYSeries series = new XYSeries("S1");
        series.add(Double.NaN, 5.0);
        series.add(2.0, 10.0);
        series.add(4.0, Double.NaN);
        XYSeriesCollection collection = new XYSeriesCollection(series);

        Range range = DatasetUtilities.findDomainBounds(collection, false);
        assertNotNull(range);
        assertEquals(2.0, range.getLowerBound(), 0.0001);
        assertEquals(4.0, range.getUpperBound(), 0.0001);
    }

    // --- findRangeBounds & iterateRangeBounds Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_NullCategoryDataset() {
        DatasetUtilities.findRangeBounds((CategoryDataset) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_NullXYDataset() {
        DatasetUtilities.findRangeBounds((XYDataset) null);
    }

    @Test
    public void testFindRangeBounds_CategoryDatasetValid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(Double.NaN, "R1", "C2");
        dataset.addValue(-5.0, "R2", "C1");

        Range range = DatasetUtilities.findRangeBounds(dataset, false);
        assertNotNull(range);
        assertEquals(-5.0, range.getLowerBound(), 0.0001);
        assertEquals(10.0, range.getUpperBound(), 0.0001);
    }

    // --- Stacked Range Bounds & Min/Max Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_NullCategory() {
        DatasetUtilities.findStackedRangeBounds((CategoryDataset) null);
    }

    @Test
    public void testFindStackedRangeBounds_CategoryValid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(5.0, "R2", "C1");
        dataset.addValue(-2.0, "R1", "C2");

        Range range = DatasetUtilities.findStackedRangeBounds(dataset, 0.0);
        assertNotNull(range);
        assertEquals(-2.0, range.getLowerBound(), 0.0001);
        assertEquals(15.0, range.getUpperBound(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumDomainValue_Null() {
        DatasetUtilities.findMinimumDomainValue(null);
    }

    @Test
    public void testFindMinimumDomainValue_Valid() {
        XYSeries series = new XYSeries("S1");
        series.add(5.0, 1.0);
        series.add(2.0, 2.0);
        XYSeriesCollection collection = new XYSeriesCollection(series);

        Number min = DatasetUtilities.findMinimumDomainValue(collection);
        assertEquals(2.0, min.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumDomainValue_Null() {
        DatasetUtilities.findMaximumDomainValue(null);
    }

    @Test
    public void testFindMaximumDomainValue_Valid() {
        XYSeries series = new XYSeries("S1");
        series.add(5.0, 1.0);
        series.add(12.0, 2.0);
        XYSeriesCollection collection = new XYSeriesCollection(series);

        Number max = DatasetUtilities.findMaximumDomainValue(collection);
        assertEquals(12.0, max.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValue_CategoryNull() {
        DatasetUtilities.findMinimumRangeValue((CategoryDataset) null);
    }

    @Test
    public void testFindMinimumRangeValue_CategoryValid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(3.0, "R1", "C2");
        Number min = DatasetUtilities.findMinimumRangeValue(dataset);
        assertEquals(3.0, min.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_CategoryNull() {
        DatasetUtilities.findMaximumRangeValue((CategoryDataset) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_CategoryValid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(25.0, "R1", "C2");
        Number max = DatasetUtilities.findMaximumRangeValue(dataset);
        assertEquals(25.0, max.doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCumulativeRangeBounds_Null() {
        DatasetUtilities.findCumulativeRangeBounds(null);
    }

    @Test
    public void testFindCumulativeRangeBounds_Valid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        dataset.addValue(10.0, "R1", "C2");
        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        assertNotNull(range);
        assertEquals(0.0, range.getLowerBound(), 0.0001);
        assertEquals(15.0, range.getUpperBound(), 0.0001);
    }
}