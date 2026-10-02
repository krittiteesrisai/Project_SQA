package org.jfree.data.general;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * JUnit4 tests for {@link DatasetUtilities} (Defects4J Chart-2b).
 *
 * หมายเหตุ: บาง overload ของ DatasetUtilities อ้างอิง interface พิเศษ
 * (IntervalXYDataset, OHLCDataset, StatisticalCategoryDataset,
 * MultiValueCategoryDataset, BoxAndWhiskerCategoryDataset/XYDataset,
 * TableXYDataset, KeyToGroupMap) ซึ่งไม่มี concrete class ที่ทราบ API
 * แน่นอนจากซอร์สที่ให้มา จึง "ข้าม" การทดสอบ branch เฉพาะของ instanceof
 * เหล่านั้นตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส)
 */
public class DatasetUtilitiesTest {

    private static final double DELTA = 0.0001;

    // ===================================================================
    // calculatePieDatasetTotal(PieDataset)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotal_NullDataset_Throws() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }

    @Test
    public void testCalculatePieDatasetTotal_EmptyDataset_ReturnsZero() {
        PieDataset dataset = new DefaultPieDataset();
        assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(dataset), DELTA);
    }

    @Test
    public void testCalculatePieDatasetTotal_MixedValues_OnlyPositiveSummed() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", -5.0);
        dataset.setValue("C", (Number) null);
        dataset.setValue("D", 0.0);
        dataset.setValue("E", 20.0);
        // ผลรวมนับเฉพาะค่าที่ v > 0 -> 10 + 20 = 30
        assertEquals(30.0, DatasetUtilities.calculatePieDatasetTotal(dataset), DELTA);
    }

    // ===================================================================
    // createPieDatasetForRow / createPieDatasetForColumn
    // ===================================================================

    private CategoryDataset buildCategoryDataset2x2() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(1.0, "R1", "C1");
        cat.addValue(2.0, "R1", "C2");
        cat.addValue(3.0, "R2", "C1");
        cat.addValue(4.0, "R2", "C2");
        return cat;
    }

    @Test
    public void testCreatePieDatasetForRow_ByKey() {
        CategoryDataset cat = buildCategoryDataset2x2();
        PieDataset pie = DatasetUtilities.createPieDatasetForRow(cat, "R1");
        assertEquals(1.0, pie.getValue("C1").doubleValue(), DELTA);
        assertEquals(2.0, pie.getValue("C2").doubleValue(), DELTA);
    }

    @Test
    public void testCreatePieDatasetForRow_ByIndex() {
        CategoryDataset cat = buildCategoryDataset2x2();
        PieDataset pie = DatasetUtilities.createPieDatasetForRow(cat, 1);
        assertEquals(3.0, pie.getValue("C1").doubleValue(), DELTA);
        assertEquals(4.0, pie.getValue("C2").doubleValue(), DELTA);
    }

    @Test
    public void testCreatePieDatasetForColumn_ByKey() {
        CategoryDataset cat = buildCategoryDataset2x2();
        PieDataset pie = DatasetUtilities.createPieDatasetForColumn(cat, "C1");
        assertEquals(1.0, pie.getValue("R1").doubleValue(), DELTA);
        assertEquals(3.0, pie.getValue("R2").doubleValue(), DELTA);
    }

    @Test
    public void testCreatePieDatasetForColumn_ByIndex() {
        CategoryDataset cat = buildCategoryDataset2x2();
        PieDataset pie = DatasetUtilities.createPieDatasetForColumn(cat, 0);
        assertEquals(1.0, pie.getValue("R1").doubleValue(), DELTA);
        assertEquals(3.0, pie.getValue("R2").doubleValue(), DELTA);
    }

    // ===================================================================
    // createConsolidatedPieDataset
    // ===================================================================

    private DefaultPieDataset buildConsolidationSource() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 10.0);
        source.setValue("B", 5.0);
        source.setValue("C", 2.0);
        source.setValue("D", 1.0);
        return source; // total = 18
    }

    @Test
    public void testCreateConsolidatedPieDataset_DefaultMinItemsOverload() {
        DefaultPieDataset source = buildConsolidationSource();
        PieDataset result =
                DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15);
        // minItems default = 2; otherKeys = {C,D} (size 2 >= 2) -> aggregated
        assertEquals(10.0, result.getValue("A").doubleValue(), DELTA);
        assertEquals(5.0, result.getValue("B").doubleValue(), DELTA);
        assertEquals(3.0, result.getValue("Other").doubleValue(), DELTA);
        assertEquals(3, result.getItemCount());
    }

    @Test
    public void testCreateConsolidatedPieDataset_AggregationHappens_MinItemsSatisfied() {
        DefaultPieDataset source = buildConsolidationSource();
        PieDataset result =
                DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15, 2);
        assertEquals(3, result.getItemCount());
        assertEquals(3.0, result.getValue("Other").doubleValue(), DELTA);
    }

    @Test
    public void testCreateConsolidatedPieDataset_NoAggregation_WhenMinItemsTooHigh() {
        DefaultPieDataset source = buildConsolidationSource();
        // otherKeys.size() = 2 < minItems(5) -> ไม่มีการรวม, ไม่มี "Other"
        PieDataset result =
                DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15, 5);
        assertEquals(4, result.getItemCount());
        assertEquals(10.0, result.getValue("A").doubleValue(), DELTA);
        assertEquals(1.0, result.getValue("D").doubleValue(), DELTA);
        assertNull(result.getValue("Other"));
    }

    @Test
    public void testCreateConsolidatedPieDataset_NullValueSkipped() {
        DefaultPieDataset source = buildConsolidationSource();
        source.setValue("E", (Number) null);
        PieDataset result =
                DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15, 2);
        assertNull(result.getValue("E"));
    }

    // ===================================================================
    // createCategoryDataset(String,String,double[][]/Number[][])
    // ===================================================================

    @Test
    public void testCreateCategoryDataset_StringPrefix_DoubleArray() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset ds = DatasetUtilities.createCategoryDataset("Row", "Col", data);
        assertEquals("Row1", ds.getRowKey(0));
        assertEquals("Col2", ds.getColumnKey(1));
        assertEquals(1.0, ds.getValue(0, 0).doubleValue(), DELTA);
        assertEquals(4.0, ds.getValue(1, 1).doubleValue(), DELTA);
    }

    @Test
    public void testCreateCategoryDataset_StringPrefix_NumberArray() {
        Number[][] data = {{new Integer(1), new Integer(2)}, {new Integer(3), new Integer(4)}};
        CategoryDataset ds = DatasetUtilities.createCategoryDataset("Row", "Col", data);
        assertEquals("Row2", ds.getRowKey(1));
        assertEquals(3.0, ds.getValue(1, 0).doubleValue(), DELTA);
    }

    // ===================================================================
    // createCategoryDataset(Comparable[], Comparable[], double[][])
    // ===================================================================

    @Test
    public void testCreateCategoryDataset_ComparableKeys_Valid() {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] columnKeys = {"C1", "C2"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset ds = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
        assertEquals(2.0, ds.getValue("R1", "C2").doubleValue(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_NullRowKeys_Throws() {
        DatasetUtilities.createCategoryDataset(null, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_NullColumnKeys_Throws() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, null, new double[][]{{1.0}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_DuplicateRowKeys_Throws() {
        Comparable[] rowKeys = {"R1", "R1"};
        Comparable[] columnKeys = {"C1", "C2"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_DuplicateColumnKeys_Throws() {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] columnKeys = {"C1", "C1"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_RowCountMismatch_Throws() {
        Comparable[] rowKeys = {"R1"};
        Comparable[] columnKeys = {"C1", "C2"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ComparableKeys_ColumnCountMismatch_Throws() {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] columnKeys = {"C1"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
    }

    // ===================================================================
    // createCategoryDataset(Comparable rowKey, KeyedValues rowData)
    // ===================================================================

    @Test
    public void testCreateCategoryDataset_KeyedValues_Valid() {
        DefaultKeyedValues rowData = new DefaultKeyedValues();
        rowData.addValue("C1", 1.0);
        rowData.addValue("C2", 2.0);
        CategoryDataset ds = DatasetUtilities.createCategoryDataset("R1", (KeyedValues) rowData);
        assertEquals(1.0, ds.getValue("R1", "C1").doubleValue(), DELTA);
        assertEquals(2.0, ds.getValue("R1", "C2").doubleValue(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_KeyedValues_NullRowKey_Throws() {
        DefaultKeyedValues rowData = new DefaultKeyedValues();
        DatasetUtilities.createCategoryDataset(null, (KeyedValues) rowData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_KeyedValues_NullRowData_Throws() {
        DatasetUtilities.createCategoryDataset("R1", null);
    }

    // ===================================================================
    // sampleFunction2DToSeries / sampleFunction2D
    // ===================================================================

    private Function2D squareFunction() {
        return new Function2D() {
            public double getValue(double x) {
                return x * x;
            }
        };
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_NullFunction_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(null, 0, 4, 5, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_NullSeriesKey_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(squareFunction(), 0, 4, 5, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_StartEqualsEnd_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(squareFunction(), 2, 2, 5, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_StartGreaterThanEnd_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(squareFunction(), 5, 2, 5, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_SamplesZero_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(squareFunction(), 0, 4, 0, "S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_SamplesOne_Throws() {
        DatasetUtilities.sampleFunction2DToSeries(squareFunction(), 0, 4, 1, "S");
    }

    @Test
    public void testSampleFunction2DToSeries_Valid_ComputesPoints() {
        XYSeries series = DatasetUtilities.sampleFunction2DToSeries(
                squareFunction(), 0, 4, 5, "S");
        assertEquals(5, series.getItemCount());
        assertEquals(0.0, series.getX(0).doubleValue(), DELTA);
        assertEquals(0.0, series.getY(0).doubleValue(), DELTA);
        assertEquals(4.0, series.getX(4).doubleValue(), DELTA);
        assertEquals(16.0, series.getY(4).doubleValue(), DELTA);
    }

    @Test
    public void testSampleFunction2D_WrapsSeriesInXYDataset() {
        XYDataset ds = DatasetUtilities.sampleFunction2D(squareFunction(), 0, 4, 5, "S");
        assertEquals(1, ds.getSeriesCount());
        assertEquals(5, ds.getItemCount(0));
        assertEquals(16.0, ds.getYValue(0, 4), DELTA);
    }

    // ===================================================================
    // isEmptyOrNull(PieDataset)
    // ===================================================================

    @Test
    public void testIsEmptyOrNull_Pie_Null_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_Pie_ZeroItemCount_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull(new DefaultPieDataset()));
    }

    @Test
    public void testIsEmptyOrNull_Pie_AllNullOrNonPositive_True() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", (Number) null);
        dataset.setValue("B", 0.0);
        dataset.setValue("C", -5.0);
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_Pie_HasPositiveValue_False() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", -5.0);
        dataset.setValue("B", 3.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    // ===================================================================
    // isEmptyOrNull(CategoryDataset)
    // ===================================================================

    @Test
    public void testIsEmptyOrNull_Category_Null_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_Category_ZeroRowOrColumn_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull(new DefaultCategoryDataset()));
    }

    @Test
    public void testIsEmptyOrNull_Category_AllValuesNull_True() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue((Number) null, "R1", "C1");
        assertTrue(DatasetUtilities.isEmptyOrNull(ds));
    }

    @Test
    public void testIsEmptyOrNull_Category_HasNonNullValue_False() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue((Number) null, "R1", "C1");
        ds.addValue(1.0, "R1", "C2");
        assertFalse(DatasetUtilities.isEmptyOrNull(ds));
    }

    // ===================================================================
    // isEmptyOrNull(XYDataset)
    // ===================================================================

    @Test
    public void testIsEmptyOrNull_XY_Null_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_XY_NoSeries_True() {
        assertTrue(DatasetUtilities.isEmptyOrNull(new XYSeriesCollection()));
    }

    @Test
    public void testIsEmptyOrNull_XY_SeriesWithNoItems_True() {
        XYSeriesCollection coll = new XYSeriesCollection();
        coll.addSeries(new XYSeries("Empty"));
        assertTrue(DatasetUtilities.isEmptyOrNull(coll));
    }

    @Test
    public void testIsEmptyOrNull_XY_HasItems_False() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 1.0);
        XYSeriesCollection coll = new XYSeriesCollection();
        coll.addSeries(series);
        assertFalse(DatasetUtilities.isEmptyOrNull(coll));
    }

    // ===================================================================
    // findDomainBounds / iterateDomainBounds (XYDataset)
    // ===================================================================

    private XYSeriesCollection buildXYDatasetBasic() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 10.0);
        series.add(3.0, 30.0);
        series.add(2.0, 20.0);
        XYSeriesCollection coll = new XYSeriesCollection();
        coll.addSeries(series);
        return coll;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_XY_NullDataset_Throws() {
        DatasetUtilities.findDomainBounds((XYDataset) null);
    }

    @Test
    public void testFindDomainBounds_XY_Valid() {
        Range r = DatasetUtilities.findDomainBounds(buildXYDatasetBasic());
        assertEquals(1.0, r.getLowerBound(), DELTA);
        assertEquals(3.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testFindDomainBounds_XY_IncludeIntervalFalse() {
        Range r = DatasetUtilities.findDomainBounds(buildXYDatasetBasic(), false);
        assertEquals(1.0, r.getLowerBound(), DELTA);
        assertEquals(3.0, r.getUpperBound(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterateDomainBounds_NullDataset_Throws() {
        DatasetUtilities.iterateDomainBounds((XYDataset) null, true);
    }

    @Test
    public void testIterateDomainBounds_EmptyDataset_ReturnsNull() {
        Range r = DatasetUtilities.iterateDomainBounds(new XYSeriesCollection(), true);
        assertNull(r);
    }

    @Test
    public void testIterateDomainBounds_StandardCase() {
        Range r = DatasetUtilities.iterateDomainBounds(buildXYDatasetBasic(), true);
        assertEquals(1.0, r.getLowerBound(), DELTA);
        assertEquals(3.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // findRangeBounds / iterateRangeBounds (XYDataset)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_XY_NullDataset_Throws() {
        DatasetUtilities.findRangeBounds((XYDataset) null);
    }

    @Test
    public void testFindRangeBounds_XY_Valid() {
        Range r = DatasetUtilities.findRangeBounds(buildXYDatasetBasic());
        assertEquals(10.0, r.getLowerBound(), DELTA);
        assertEquals(30.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testIterateRangeBounds_XY_EmptyDataset_ReturnsNull() {
        assertNull(DatasetUtilities.iterateRangeBounds(new XYSeriesCollection(), true));
    }

    @Test
    public void testIterateRangeBounds_XY_StandardCase() {
        Range r = DatasetUtilities.iterateRangeBounds(buildXYDatasetBasic(), true);
        assertEquals(10.0, r.getLowerBound(), DELTA);
        assertEquals(30.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // findRangeBounds / iterateRangeBounds (CategoryDataset)
    // ===================================================================

    private DefaultCategoryDataset buildCategoryDatasetWithNullAndNaN() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(5.0, "R1", "C1");
        ds.addValue(-3.0, "R1", "C2");
        ds.addValue((Number) null, "R2", "C1");
        ds.addValue(Double.NaN, "R2", "C2");
        return ds;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_Category_NullDataset_Throws() {
        DatasetUtilities.findRangeBounds((CategoryDataset) null);
    }

    @Test
    public void testFindRangeBounds_Category_Valid() {
        Range r = DatasetUtilities.findRangeBounds(buildCategoryDatasetWithNullAndNaN());
        assertEquals(-3.0, r.getLowerBound(), DELTA);
        assertEquals(5.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testIterateRangeBounds_Category_EmptyDataset_ReturnsNull() {
        assertNull(DatasetUtilities.iterateRangeBounds(new DefaultCategoryDataset(), true));
    }

    @Test
    public void testIterateRangeBounds_Category_NullAndNaNSkipped() {
        Range r = DatasetUtilities.iterateRangeBounds(buildCategoryDatasetWithNullAndNaN(), true);
        assertEquals(-3.0, r.getLowerBound(), DELTA);
        assertEquals(5.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // findMinimumRangeValue / findMaximumRangeValue (CategoryDataset)
    // ===================================================================

    private DefaultCategoryDataset buildCategoryDatasetForMinMax() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(5.0, "R1", "C1");
        ds.addValue(-3.0, "R1", "C2");
        ds.addValue((Number) null, "R2", "C1");
        ds.addValue(8.0, "R2", "C2");
        return ds;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValue_Category_NullDataset_Throws() {
        DatasetUtilities.findMinimumRangeValue((CategoryDataset) null);
    }

    @Test
    public void testFindMinimumRangeValue_Category_Valid() {
        Number result = DatasetUtilities.findMinimumRangeValue(buildCategoryDatasetForMinMax());
        assertEquals(-3.0, result.doubleValue(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_Category_NullDataset_Throws() {
        DatasetUtilities.findMaximumRangeValue((CategoryDataset) null);
    }

    @Test
    public void testFindMaximumRangeValue_Category_Valid() {
        Number result = DatasetUtilities.findMaximumRangeValue(buildCategoryDatasetForMinMax());
        assertEquals(8.0, result.doubleValue(), DELTA);
    }

    @Test
    public void testFindMinimumRangeValue_Category_NaNPropagation() {
        // หมายเหตุ: findMinimumRangeValue (ต่างจาก iterateRangeBounds) ไม่มีการ
        // ตรวจสอบ Double.isNaN ก่อน Math.min ทำให้ NaN "แพร่" เข้าไปในผลลัพธ์
        // ระบุพฤติกรรมนี้ไว้อย่างชัดเจนตามที่ปรากฏในซอร์ส (อาจเป็นจุดบกพร่อง)
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(5.0, "R1", "C1");
        ds.addValue(Double.NaN, "R1", "C2");
        Number result = DatasetUtilities.findMinimumRangeValue(ds);
        assertTrue(Double.isNaN(result.doubleValue()));
    }

    // ===================================================================
    // findMinimumDomainValue / findMaximumDomainValue (XYDataset)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumDomainValue_NullDataset_Throws() {
        DatasetUtilities.findMinimumDomainValue(null);
    }

    @Test
    public void testFindMinimumDomainValue_Valid() {
        Number result = DatasetUtilities.findMinimumDomainValue(buildXYDatasetBasic());
        assertEquals(1.0, result.doubleValue(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumDomainValue_NullDataset_Throws() {
        DatasetUtilities.findMaximumDomainValue(null);
    }

    @Test
    public void testFindMaximumDomainValue_Valid() {
        Number result = DatasetUtilities.findMaximumDomainValue(buildXYDatasetBasic());
        assertEquals(3.0, result.doubleValue(), DELTA);
    }

    // ===================================================================
    // findMinimumRangeValue / findMaximumRangeValue (XYDataset)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValue_XY_NullDataset_Throws() {
        DatasetUtilities.findMinimumRangeValue((XYDataset) null);
    }

    @Test
    public void testFindMinimumRangeValue_XY_Valid() {
        Number result = DatasetUtilities.findMinimumRangeValue(buildXYDatasetBasic());
        assertEquals(10.0, result.doubleValue(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_XY_NullDataset_Throws() {
        DatasetUtilities.findMaximumRangeValue((XYDataset) null);
    }

    @Test
    public void testFindMaximumRangeValue_XY_Valid() {
        Number result = DatasetUtilities.findMaximumRangeValue(buildXYDatasetBasic());
        assertEquals(30.0, result.doubleValue(), DELTA);
    }

    // ===================================================================
    // findStackedRangeBounds(CategoryDataset[, base])
    // ===================================================================

    private DefaultCategoryDataset buildStackedDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(5.0, "R1", "C1");
        ds.addValue(-3.0, "R2", "C1");
        ds.addValue(2.0, "R1", "C2");
        ds.addValue(4.0, "R2", "C2");
        return ds;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_Category_NullDataset_Throws() {
        DatasetUtilities.findStackedRangeBounds((CategoryDataset) null);
    }

    @Test
    public void testFindStackedRangeBounds_Category_DefaultBase() {
        Range r = DatasetUtilities.findStackedRangeBounds(buildStackedDataset());
        assertEquals(-3.0, r.getLowerBound(), DELTA);
        assertEquals(6.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testFindStackedRangeBounds_Category_WithBase() {
        Range r = DatasetUtilities.findStackedRangeBounds(buildStackedDataset(), 10.0);
        assertEquals(7.0, r.getLowerBound(), DELTA);
        assertEquals(16.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testFindStackedRangeBounds_Category_EmptyDataset_ReturnsNull() {
        Range r = DatasetUtilities.findStackedRangeBounds(new DefaultCategoryDataset());
        assertNull(r);
    }

    // ===================================================================
    // findMinimumStackedRangeValue / findMaximumStackedRangeValue
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumStackedRangeValue_NullDataset_Throws() {
        DatasetUtilities.findMinimumStackedRangeValue(null);
    }

    @Test
    public void testFindMinimumStackedRangeValue_Valid() {
        Number result = DatasetUtilities.findMinimumStackedRangeValue(buildStackedDataset());
        assertEquals(-3.0, result.doubleValue(), DELTA);
    }

    @Test
    public void testFindMinimumStackedRangeValue_NoValidData_ReturnsNull() {
        Number result = DatasetUtilities.findMinimumStackedRangeValue(new DefaultCategoryDataset());
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumStackedRangeValue_NullDataset_Throws() {
        DatasetUtilities.findMaximumStackedRangeValue(null);
    }

    @Test
    public void testFindMaximumStackedRangeValue_Valid() {
        Number result = DatasetUtilities.findMaximumStackedRangeValue(buildStackedDataset());
        assertEquals(6.0, result.doubleValue(), DELTA);
    }

    @Test
    public void testFindMaximumStackedRangeValue_NoValidData_ReturnsNull() {
        Number result = DatasetUtilities.findMaximumStackedRangeValue(new DefaultCategoryDataset());
        assertNull(result);
    }

    // ===================================================================
    // findCumulativeRangeBounds(CategoryDataset)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindCumulativeRangeBounds_NullDataset_Throws() {
        DatasetUtilities.findCumulativeRangeBounds(null);
    }

    @Test
    public void testFindCumulativeRangeBounds_AllItemsNull_ReturnsNull() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue((Number) null, "R1", "C1");
        assertNull(DatasetUtilities.findCumulativeRangeBounds(ds));
    }

    @Test
    public void testFindCumulativeRangeBounds_Valid_WithNaNAndMissingSkipped() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(5.0, "R1", "C1");
        ds.addValue(-3.0, "R1", "C2");
        ds.addValue(Double.NaN, "R1", "C3");
        ds.addValue(2.0, "R2", "C1");
        ds.addValue(4.0, "R2", "C2");
        // R2,C3 ไม่ถูกเพิ่ม -> getValue คืน null
        Range r = DatasetUtilities.findCumulativeRangeBounds(ds);
        assertEquals(0.0, r.getLowerBound(), DELTA);
        assertEquals(6.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // iterateToFindDomainBounds(XYDataset, List, boolean)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBounds_NullDataset_Throws() {
        DatasetUtilities.iterateToFindDomainBounds(null, new ArrayList(), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBounds_NullVisibleSeriesKeys_Throws() {
        DatasetUtilities.iterateToFindDomainBounds(buildXYDatasetBasic(), null, true);
    }

    @Test
    public void testIterateToFindDomainBounds_StandardCase() {
        List keys = Arrays.asList((Comparable) "S1");
        Range r = DatasetUtilities.iterateToFindDomainBounds(buildXYDatasetBasic(), keys, true);
        assertEquals(1.0, r.getLowerBound(), DELTA);
        assertEquals(3.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testIterateToFindDomainBounds_EmptyVisibleKeys_ReturnsNull() {
        Range r = DatasetUtilities.iterateToFindDomainBounds(
                buildXYDatasetBasic(), new ArrayList(), true);
        assertNull(r);
    }

    // ===================================================================
    // iterateToFindRangeBounds(XYDataset, List, Range, boolean)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXY_NullDataset_Throws() {
        DatasetUtilities.iterateToFindRangeBounds(null, new ArrayList(), new Range(0, 1), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXY_NullVisibleSeriesKeys_Throws() {
        DatasetUtilities.iterateToFindRangeBounds(buildXYDatasetBasic(), null, new Range(0, 1), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXY_NullXRange_Throws() {
        DatasetUtilities.iterateToFindRangeBounds(buildXYDatasetBasic(), new ArrayList(), null, true);
    }

    @Test
    public void testIterateToFindRangeBoundsXY_StandardCase_FiltersByXRange() {
        List keys = Arrays.asList((Comparable) "S1");
        Range xRange = new Range(1.5, 3.5); // ตัดจุด x=1 ออก เหลือ x=2,3 (y=20,30)
        Range r = DatasetUtilities.iterateToFindRangeBounds(
                buildXYDatasetBasic(), keys, xRange, true);
        assertEquals(20.0, r.getLowerBound(), DELTA);
        assertEquals(30.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // iterateToFindRangeBounds(CategoryDataset, List, boolean)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsCategory_NullDataset_Throws() {
        DatasetUtilities.iterateToFindRangeBounds((CategoryDataset) null, new ArrayList(), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsCategory_NullVisibleSeriesKeys_Throws() {
        DatasetUtilities.iterateToFindRangeBounds(buildCategoryDatasetWithNullAndNaN(), null, true);
    }

    @Test
    public void testIterateToFindRangeBoundsCategory_StandardCase() {
        List keys = Arrays.asList((Comparable) "R1", (Comparable) "R2");
        Range r = DatasetUtilities.iterateToFindRangeBounds(
                buildCategoryDatasetWithNullAndNaN(), keys, true);
        assertEquals(-3.0, r.getLowerBound(), DELTA);
        assertEquals(5.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // Wrapper methods with visibleSeriesKeys (black-box, ไม่ยืนยัน branch instanceof)
    // ===================================================================

    @Test
    public void testFindDomainBounds_XY_WithVisibleSeriesKeys() {
        List keys = Arrays.asList((Comparable) "S1");
        Range r = DatasetUtilities.findDomainBounds(buildXYDatasetBasic(), keys, true);
        assertEquals(1.0, r.getLowerBound(), DELTA);
        assertEquals(3.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testFindRangeBounds_Category_WithVisibleSeriesKeys() {
        List keys = Arrays.asList((Comparable) "R1", (Comparable) "R2");
        Range r = DatasetUtilities.findRangeBounds(
                buildCategoryDatasetWithNullAndNaN(), keys, true);
        assertEquals(-3.0, r.getLowerBound(), DELTA);
        assertEquals(5.0, r.getUpperBound(), DELTA);
    }

    @Test
    public void testFindRangeBounds_XY_WithVisibleSeriesKeysAndXRange() {
        List keys = Arrays.asList((Comparable) "S1");
        Range xRange = new Range(1.5, 3.5);
        Range r = DatasetUtilities.findRangeBounds(buildXYDatasetBasic(), keys, xRange, true);
        assertEquals(20.0, r.getLowerBound(), DELTA);
        assertEquals(30.0, r.getUpperBound(), DELTA);
    }

    // ===================================================================
    // Deprecated delegation methods
    // ===================================================================

    @Test
    public void testIterateCategoryRangeBounds_DelegatesToIterateRangeBounds() {
        CategoryDataset ds = buildCategoryDatasetWithNullAndNaN();
        Range expected = DatasetUtilities.iterateRangeBounds(ds, true);
        Range actual = DatasetUtilities.iterateCategoryRangeBounds(ds, true);
        assertEquals(expected.getLowerBound(), actual.getLowerBound(), DELTA);
        assertEquals(expected.getUpperBound(), actual.getUpperBound(), DELTA);
    }

    @Test
    public void testIterateXYRangeBounds_DelegatesToIterateRangeBounds() {
        XYDataset ds = buildXYDatasetBasic();
        Range expected = DatasetUtilities.iterateRangeBounds(ds);
        Range actual = DatasetUtilities.iterateXYRangeBounds(ds);
        assertEquals(expected.getLowerBound(), actual.getLowerBound(), DELTA);
        assertEquals(expected.getUpperBound(), actual.getUpperBound(), DELTA);
    }
}
