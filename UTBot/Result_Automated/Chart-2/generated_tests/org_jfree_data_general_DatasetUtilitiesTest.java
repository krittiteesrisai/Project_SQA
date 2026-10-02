package org.jfree.data.general;

import org.junit.Test;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.KeyedObjects;
import java.util.ArrayList;
import java.lang.reflect.Method;
import org.jfree.data.function.PolynomialFunction2D;
import org.jfree.data.function.LineFunction2D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYCoordinate;
import org.jfree.data.pie.DefaultPieDataset;
import javax.swing.event.EventListenerList;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.KeyedObject;
import org.jfree.data.SelectableValue;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.Range;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import java.util.Date;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import java.sql.SQLException;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.chart.util.TableOrder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jfree_data_general_DatasetUtilitiesTest {
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotal_ThrowIllegalArgumentException() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)
    
    @Test
    public void testCalculatePieDatasetTotal1() throws Exception  {
        CategoryToPieDataset categoryToPieDataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        
        double actual = DatasetUtilities.calculatePieDatasetTotal(categoryToPieDataset);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testCalculatePieDatasetTotal2() throws Exception  {
        CategoryToPieDataset categoryToPieDataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        SlidingGanttCategoryDataset source = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(categoryToPieDataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
        
        double actual = DatasetUtilities.calculatePieDatasetTotal(categoryToPieDataset);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testCalculatePieDatasetTotal3() throws Exception  {
        JDBCPieDataset jDBCPieDataset = ((JDBCPieDataset) createInstance("org.jfree.data.jdbc.JDBCPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(jDBCPieDataset, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        
        Class datasetUtilitiesClazz = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class jDBCPieDatasetType = Class.forName("org.jfree.data.pie.PieDataset");
        Method calculatePieDatasetTotalMethod = datasetUtilitiesClazz.getDeclaredMethod("calculatePieDatasetTotal", jDBCPieDatasetType);
        calculatePieDatasetTotalMethod.setAccessible(true);
        java.lang.Object[] calculatePieDatasetTotalMethodArguments = new java.lang.Object[1];
        calculatePieDatasetTotalMethodArguments[0] = jDBCPieDataset;
        double actual = ((Double) calculatePieDatasetTotalMethod.invoke(null, calculatePieDatasetTotalMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)
    
    @Test
    public void testCalculatePieDatasetTotal4() throws Throwable  {
        JDBCPieDataset jDBCPieDataset = ((JDBCPieDataset) createInstance("org.jfree.data.jdbc.JDBCPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        data1.add(null);
        data1.add(null);
        data1.add(null);
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(jDBCPieDataset, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects.getKeys(KeyedObjects.java:158)
            org.jfree.data.pie.DefaultPieDataset.getKeys(DefaultPieDataset.java:129)
            org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(DatasetUtilities.java:184) */
        Class datasetUtilitiesClazz = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class jDBCPieDatasetType = Class.forName("org.jfree.data.pie.PieDataset");
        Method calculatePieDatasetTotalMethod = datasetUtilitiesClazz.getDeclaredMethod("calculatePieDatasetTotal", jDBCPieDatasetType);
        calculatePieDatasetTotalMethod.setAccessible(true);
        java.lang.Object[] calculatePieDatasetTotalMethodArguments = new java.lang.Object[1];
        calculatePieDatasetTotalMethodArguments[0] = jDBCPieDataset;
        try {
            calculatePieDatasetTotalMethod.invoke(null, calculatePieDatasetTotalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sampleFunction2DToSeries(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2DToSeries(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.executesCondition {@code (seriesKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: seriesKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_ThrowIllegalArgumentException() throws Exception  {
        PolynomialFunction2D polynomialFunction2D = ((PolynomialFunction2D) createInstance("org.jfree.data.function.PolynomialFunction2D"));
        
        DatasetUtilities.sampleFunction2DToSeries(polynomialFunction2D, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2DToSeries(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.executesCondition {@code (seriesKey == null): False}
 * @utbot.executesCondition {@code (start >= end): False}
 * @utbot.executesCondition {@code (samples < 2): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: samples < 2
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_ThrowIllegalArgumentException_3() throws Exception  {
        PolynomialFunction2D polynomialFunction2D = ((PolynomialFunction2D) createInstance("org.jfree.data.function.PolynomialFunction2D"));
        Integer integer = 0;
        
        DatasetUtilities.sampleFunction2DToSeries(polynomialFunction2D, -3.9281211088487653E27, 5.566145938093524E-283, 1, integer);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2DToSeries(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: f == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_ThrowIllegalArgumentException_1() {
        DatasetUtilities.sampleFunction2DToSeries(null, java.lang.Double.NaN, java.lang.Double.NaN, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2DToSeries(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.executesCondition {@code (seriesKey == null): False}
 * @utbot.executesCondition {@code (start >= end): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start >= end
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DToSeries_ThrowIllegalArgumentException_2() {
        LineFunction2D lineFunction2D = new LineFunction2D(0.0, 0.0);
        Character character = '\u0000';
        
        DatasetUtilities.sampleFunction2DToSeries(lineFunction2D, 32.00197219848633, 32.00197219848633, 2, character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createPieDatasetForRow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createPieDatasetForRow(org.jfree.data.category.CategoryDataset,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int row = dataset.getRowIndex(rowKey);
 *  */
    @Test
    public void testCreatePieDatasetForRow_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.createPieDatasetForRow] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(DatasetUtilities.java:214) */
        DatasetUtilities.createPieDatasetForRow(((CategoryDataset) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createPieDatasetForRow(org.jfree.data.category.CategoryDataset,java.lang.Comparable)}
     */
    @Test
    public void testCreatePieDatasetForRow() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        XYCoordinate xYCoordinate = new XYCoordinate();
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForRow(((CategoryDataset) defaultCategoryDataset), xYCoordinate));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createPieDatasetForRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createPieDatasetForRow(org.jfree.data.category.CategoryDataset,int)}
 * @utbot.invokes {@link org.jfree.data.pie.DefaultPieDataset#setSelectionState(org.jfree.data.pie.PieDatasetSelectionState)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnCount()}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCreatePieDatasetForRow_CategoryDatasetGetColumnCount() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForRow(((CategoryDataset) defaultCategoryDataset), -255));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data1 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data2 = new ArrayList();
        setField(data1, "org.jfree.data.KeyedObjects", "data", data2);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data1);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)
    
    @Test
    public void testCreatePieDatasetForRow1() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForRow(((CategoryDataset) slidingGanttCategoryDataset), 0));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testCreatePieDatasetForRow2() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForRow(((CategoryDataset) slidingGanttCategoryDataset1), 0));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)
    
    @Test
    public void testCreatePieDatasetForRow3() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.createPieDatasetForRow] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(DatasetUtilities.java:233) */
        DatasetUtilities.createPieDatasetForRow(((CategoryDataset) defaultCategoryDataset), 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createPieDatasetForColumn(org.jfree.data.category.CategoryDataset,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int column = dataset.getColumnIndex(columnKey);
 *  */
    @Test
    public void testCreatePieDatasetForColumn_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(DatasetUtilities.java:249) */
        DatasetUtilities.createPieDatasetForColumn(((CategoryDataset) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createPieDatasetForColumn(org.jfree.data.category.CategoryDataset,java.lang.Comparable)}
     */
    @Test
    public void testCreatePieDatasetForColumn() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        XYCoordinate xYCoordinate = new XYCoordinate();
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForColumn(((CategoryDataset) defaultCategoryDataset), xYCoordinate));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)
    
    @Test
    public void testCreatePieDatasetForColumn1() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        DefaultPieDataset actual = ((DefaultPieDataset) DatasetUtilities.createPieDatasetForColumn(((CategoryDataset) defaultCategoryDataset), 0));
        
        DefaultPieDataset expected = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data1 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data2 = new ArrayList();
        setField(data1, "org.jfree.data.KeyedObjects", "data", data2);
        setField(expected, "org.jfree.data.pie.DefaultPieDataset", "data", data1);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.pie.DefaultPieDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)
    
    @Test
    public void testCreatePieDatasetForColumn2() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(DatasetUtilities.java:268) */
        DatasetUtilities.createPieDatasetForColumn(((CategoryDataset) defaultCategoryDataset), 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createCategoryDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCategoryDataset(java.lang.String, java.lang.String, [[Ljava.lang.Number;)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.String,java.lang.String,java.lang.Number[][])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCreateCategoryDataset_ReturnResult() throws Exception  {
        java.lang.Number[][] numberArray = {};
        
        DefaultCategoryDataset actual = ((DefaultCategoryDataset) DatasetUtilities.createCategoryDataset(((String) null), ((String) null), numberArray));
        
        DefaultCategoryDataset expected = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        setField(expected, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.category.DefaultCategoryDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createCategoryDataset(java.lang.String, java.lang.String, [[Ljava.lang.Number;)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.String,java.lang.String,java.lang.Number[][])}
     */
    @Test
    public void testCreateCategoryDatasetWithBlankStringAndNonEmptyStringAndNonEmptyObjectArray() throws Exception  {
        java.lang.Number[][] numberArray = new java.lang.Number[3][];
        java.lang.Number[] numberArray1 = {(short) 1, Integer.MAX_VALUE};
        numberArray[0] = numberArray1;
        java.lang.Number[] numberArray2 = {java.lang.Long.MIN_VALUE, 0, Integer.MAX_VALUE};
        numberArray[1] = numberArray2;
        java.lang.Number[] numberArray3 = {1, java.lang.Float.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        numberArray[2] = numberArray3;
        
        DefaultCategoryDataset actual = ((DefaultCategoryDataset) DatasetUtilities.createCategoryDataset("\n\t\r", "-3", numberArray));
        
        DefaultCategoryDataset expected = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        String string = "\n\t\r1";
        rowKeys.add(string);
        String string1 = "\n\t\r2";
        rowKeys.add(string1);
        String string2 = "\n\t\r3";
        rowKeys.add(string2);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        String string3 = "-31";
        columnKeys.add(string3);
        String string4 = "-32";
        columnKeys.add(string4);
        String string5 = "-33";
        columnKeys.add(string5);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", string3);
        SelectableValue object = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Short value = (short) 1;
        setField(object, "org.jfree.data.SelectableValue", "value", value);
        keyedObject.setObject(object);
        data1.add(keyedObject);
        KeyedObject keyedObject1 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject1, "org.jfree.data.KeyedObject", "key", string4);
        SelectableValue object1 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Integer value1 = Integer.MAX_VALUE;
        setField(object1, "org.jfree.data.SelectableValue", "value", value1);
        keyedObject1.setObject(object1);
        data1.add(keyedObject1);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        rows.add(keyedObjects);
        KeyedObjects keyedObjects1 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data2 = new ArrayList();
        KeyedObject keyedObject2 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key = "-31";
        setField(keyedObject2, "org.jfree.data.KeyedObject", "key", key);
        SelectableValue object2 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Long value2 = java.lang.Long.MIN_VALUE;
        setField(object2, "org.jfree.data.SelectableValue", "value", value2);
        keyedObject2.setObject(object2);
        data2.add(keyedObject2);
        KeyedObject keyedObject3 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key1 = "-32";
        setField(keyedObject3, "org.jfree.data.KeyedObject", "key", key1);
        SelectableValue object3 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Integer value3 = 0;
        setField(object3, "org.jfree.data.SelectableValue", "value", value3);
        keyedObject3.setObject(object3);
        data2.add(keyedObject3);
        KeyedObject keyedObject4 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject4, "org.jfree.data.KeyedObject", "key", string5);
        SelectableValue object4 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Integer value4 = Integer.MAX_VALUE;
        setField(object4, "org.jfree.data.SelectableValue", "value", value4);
        keyedObject4.setObject(object4);
        data2.add(keyedObject4);
        setField(keyedObjects1, "org.jfree.data.KeyedObjects", "data", data2);
        rows.add(keyedObjects1);
        KeyedObjects keyedObjects2 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data3 = new ArrayList();
        KeyedObject keyedObject5 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key2 = "-31";
        setField(keyedObject5, "org.jfree.data.KeyedObject", "key", key2);
        SelectableValue object5 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Integer value5 = 1;
        setField(object5, "org.jfree.data.SelectableValue", "value", value5);
        keyedObject5.setObject(object5);
        data3.add(keyedObject5);
        KeyedObject keyedObject6 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key3 = "-32";
        setField(keyedObject6, "org.jfree.data.KeyedObject", "key", key3);
        SelectableValue object6 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Float value6 = java.lang.Float.POSITIVE_INFINITY;
        setField(object6, "org.jfree.data.SelectableValue", "value", value6);
        keyedObject6.setObject(object6);
        data3.add(keyedObject6);
        KeyedObject keyedObject7 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key4 = "-33";
        setField(keyedObject7, "org.jfree.data.KeyedObject", "key", key4);
        SelectableValue object7 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value7 = java.lang.Double.POSITIVE_INFINITY;
        setField(object7, "org.jfree.data.SelectableValue", "value", value7);
        keyedObject7.setObject(object7);
        data3.add(keyedObject7);
        setField(keyedObjects2, "org.jfree.data.KeyedObjects", "data", data3);
        rows.add(keyedObjects2);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        setField(expected, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.category.DefaultCategoryDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createCategoryDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCategoryDataset([Ljava.lang.Comparable;, [Ljava.lang.Comparable;, [[D)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.Comparable[],java.lang.Comparable[],double[][])}
 * @utbot.executesCondition {@code (rowKeys == null): False}
 * @utbot.executesCondition {@code (columnKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ThrowIllegalArgumentException_1() {
        java.lang.Comparable[] comparableArray = {null};
        
        DatasetUtilities.createCategoryDataset(comparableArray, ((java.lang.Comparable[]) null), ((double[][]) null));
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.Comparable[],java.lang.Comparable[],double[][])}
 * @utbot.executesCondition {@code (rowKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ThrowIllegalArgumentException() {
        DatasetUtilities.createCategoryDataset(((java.lang.Comparable[]) null), ((java.lang.Comparable[]) null), ((double[][]) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCategoryDataset([Ljava.lang.Comparable;, [Ljava.lang.Comparable;, [[D)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.Comparable[],java.lang.Comparable[],double[][])}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDatasetThrowsIAEWithEmptyObjectArraysAndNonEmptyObjectArray() {
        java.lang.Comparable[] comparableArray = {};
        java.lang.Comparable[] comparableArray1 = {};
        double[][] doubleArray = new double[5][];
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[1] = doubleArray2;
        double[] doubleArray3 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[2] = doubleArray3;
        double[] doubleArray4 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[3] = doubleArray4;
        double[] doubleArray5 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[4] = doubleArray5;
        
        DatasetUtilities.createCategoryDataset(comparableArray, comparableArray1, doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createCategoryDataset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.Comparable,org.jfree.data.KeyedValues)}
 * @utbot.executesCondition {@code (rowKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ThrowIllegalArgumentException1() {
        DatasetUtilities.createCategoryDataset(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.Comparable,org.jfree.data.KeyedValues)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (rowData == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowData == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDataset_ThrowIllegalArgumentException_11() {
        Integer integer = 0;
        
        DatasetUtilities.createCategoryDataset(integer, null);
    }
    ///endregion
    
    ///region Errors report for createCategoryDataset
    
    public void testCreateCategoryDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createCategoryDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCategoryDataset(java.lang.String, java.lang.String, [[D)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.String,java.lang.String,double[][])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCreateCategoryDataset_ReturnResult1() throws Exception  {
        double[][] doubleArray = {};
        
        DefaultCategoryDataset actual = ((DefaultCategoryDataset) DatasetUtilities.createCategoryDataset(((String) null), ((String) null), doubleArray));
        
        DefaultCategoryDataset expected = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        setField(expected, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.category.DefaultCategoryDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createCategoryDataset(java.lang.String, java.lang.String, [[D)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#createCategoryDataset(java.lang.String,java.lang.String,double[][])}
     */
    @Test
    public void testCreateCategoryDatasetWithNonEmptyStringsAndNonEmptyObjectArray() throws Exception  {
        double[][] doubleArray = new double[3][];
        double[] doubleArray1 = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN};
        doubleArray[1] = doubleArray2;
        double[] doubleArray3 = {1.0, 1.0, 1.0};
        doubleArray[2] = doubleArray3;
        
        DefaultCategoryDataset actual = ((DefaultCategoryDataset) DatasetUtilities.createCategoryDataset("\n%\t\r", "-3", doubleArray));
        
        DefaultCategoryDataset expected = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        String string = "\n%\t\r1";
        rowKeys.add(string);
        String string1 = "\n%\t\r2";
        rowKeys.add(string1);
        String string2 = "\n%\t\r3";
        rowKeys.add(string2);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        String string3 = "-31";
        columnKeys.add(string3);
        String string4 = "-32";
        columnKeys.add(string4);
        String string5 = "-33";
        columnKeys.add(string5);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", string3);
        SelectableValue object = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value = 1.0;
        setField(object, "org.jfree.data.SelectableValue", "value", value);
        keyedObject.setObject(object);
        data1.add(keyedObject);
        KeyedObject keyedObject1 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject1, "org.jfree.data.KeyedObject", "key", string4);
        SelectableValue object1 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value1 = 1.0;
        setField(object1, "org.jfree.data.SelectableValue", "value", value1);
        keyedObject1.setObject(object1);
        data1.add(keyedObject1);
        KeyedObject keyedObject2 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        setField(keyedObject2, "org.jfree.data.KeyedObject", "key", string5);
        SelectableValue object2 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value2 = java.lang.Double.POSITIVE_INFINITY;
        setField(object2, "org.jfree.data.SelectableValue", "value", value2);
        keyedObject2.setObject(object2);
        data1.add(keyedObject2);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        rows.add(keyedObjects);
        KeyedObjects keyedObjects1 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data2 = new ArrayList();
        KeyedObject keyedObject3 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key = "-31";
        setField(keyedObject3, "org.jfree.data.KeyedObject", "key", key);
        SelectableValue object3 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value3 = java.lang.Double.POSITIVE_INFINITY;
        setField(object3, "org.jfree.data.SelectableValue", "value", value3);
        keyedObject3.setObject(object3);
        data2.add(keyedObject3);
        KeyedObject keyedObject4 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key1 = "-32";
        setField(keyedObject4, "org.jfree.data.KeyedObject", "key", key1);
        SelectableValue object4 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value4 = java.lang.Double.NEGATIVE_INFINITY;
        setField(object4, "org.jfree.data.SelectableValue", "value", value4);
        keyedObject4.setObject(object4);
        data2.add(keyedObject4);
        KeyedObject keyedObject5 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key2 = "-33";
        setField(keyedObject5, "org.jfree.data.KeyedObject", "key", key2);
        SelectableValue object5 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value5 = java.lang.Double.NaN;
        setField(object5, "org.jfree.data.SelectableValue", "value", value5);
        keyedObject5.setObject(object5);
        data2.add(keyedObject5);
        setField(keyedObjects1, "org.jfree.data.KeyedObjects", "data", data2);
        rows.add(keyedObjects1);
        KeyedObjects keyedObjects2 = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data3 = new ArrayList();
        KeyedObject keyedObject6 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key3 = "-31";
        setField(keyedObject6, "org.jfree.data.KeyedObject", "key", key3);
        SelectableValue object6 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value6 = 1.0;
        setField(object6, "org.jfree.data.SelectableValue", "value", value6);
        keyedObject6.setObject(object6);
        data3.add(keyedObject6);
        KeyedObject keyedObject7 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key4 = "-32";
        setField(keyedObject7, "org.jfree.data.KeyedObject", "key", key4);
        SelectableValue object7 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value7 = 1.0;
        setField(object7, "org.jfree.data.SelectableValue", "value", value7);
        keyedObject7.setObject(object7);
        data3.add(keyedObject7);
        KeyedObject keyedObject8 = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        String key5 = "-33";
        setField(keyedObject8, "org.jfree.data.KeyedObject", "key", key5);
        SelectableValue object8 = ((SelectableValue) createInstance("org.jfree.data.SelectableValue"));
        Double value8 = 1.0;
        setField(object8, "org.jfree.data.SelectableValue", "value", value8);
        keyedObject8.setObject(object8);
        data3.add(keyedObject8);
        setField(keyedObjects2, "org.jfree.data.KeyedObjects", "data", data3);
        rows.add(keyedObjects2);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        setField(expected, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        expected.setSelectionState(expected);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.category.DefaultCategoryDataset has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createCategoryDataset(java.lang.String, java.lang.String, [[D)
    
    @Test
    public void testCreateCategoryDataset1() {
        String string = "";
        double[][] doubleArray = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.createCategoryDataset] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.createCategoryDataset(DatasetUtilities.java:373) */
        DatasetUtilities.createCategoryDataset(string, ((String) null), doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateDomainBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateDomainBounds_ReturnNull() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (if (includeInterval && dataset instanceof IntervalXYDataset) {
 *     IntervalXYDataset intervalXYData = (IntervalXYDataset) dataset;
 *     for (int series = 0; series < seriesCount; series++) {
 *         int itemCount = dataset.getItemCount(series);
 *         for (int item = 0; item < itemCount; item++) {
 *             lvalue = intervalXYData.getStartXValue(series, item);
 *             uvalue = intervalXYData.getEndXValue(series, item);
 *             if (!Double.isNaN(lvalue)) {
 *                 minimum = Math.min(minimum, lvalue);
 *             }
 *             if (!Double.isNaN(uvalue)) {
 *                 maximum = Math.max(maximum, uvalue);
 *             }
 *         }
 *     }
 * } else {
 *     for (int series = 0; series < seriesCount; series++) {
 *         int itemCount = dataset.getItemCount(series);
 *         for (int item = 0; item < itemCount; item++) {
 *             lvalue = dataset.getXValue(series, item);
 *             uvalue = lvalue;
 *             if (!Double.isNaN(lvalue)) {
 *                 minimum = Math.min(minimum, lvalue);
 *                 maximum = Math.max(maximum, uvalue);
 *             }
 *         }
 *     }
 * }): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateDomainBounds_IncludeIntervalAndDatasetNotInstanceOfIntervalXYDataset() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateDomainBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.iterateDomainBounds(null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
     */
    @Test
    public void testIterateDomainBounds() {
        SimpleHistogramBin simpleHistogramBin = new SimpleHistogramBin(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        simpleHistogramBin.setItemCount(0);
        DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset = new DefaultBoxAndWhiskerXYDataset(simpleHistogramBin);
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerXYDataset.setGroup(datasetGroup);
        defaultBoxAndWhiskerXYDataset.setFaroutCoefficient(java.lang.Double.POSITIVE_INFINITY);
        java.util.Date[] dateArray = {};
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        double[] doubleArray4 = {};
        DefaultHighLowDataset defaultHighLowDataset = new DefaultHighLowDataset(null, dateArray, doubleArray, doubleArray1, doubleArray2, doubleArray3, doubleArray4);
        defaultHighLowDataset.setSelectionState(null);
        defaultHighLowDataset.setGroup(null);
        defaultBoxAndWhiskerXYDataset.setSelectionState(defaultHighLowDataset);
        defaultBoxAndWhiskerXYDataset.setOutlierCoefficient(java.lang.Double.NEGATIVE_INFINITY);
        
        Range actual = DatasetUtilities.iterateDomainBounds(defaultBoxAndWhiskerXYDataset, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    @Test
    public void testIterateDomainBounds1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.iterateDomainBounds(timeTableXYDataset, false);
        
        assertNull(actual);
    }
    
    @Test
    public void testIterateDomainBounds2() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset, true);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        java.lang.String[] jDBCXYDatasetColumnNames1 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames1 = ((String) get(jDBCXYDatasetColumnNames1, 1));
        java.lang.String[] jDBCXYDatasetColumnNames2 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames2 = ((String) get(jDBCXYDatasetColumnNames2, 2));
        java.lang.String[] jDBCXYDatasetColumnNames3 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames3 = ((String) get(jDBCXYDatasetColumnNames3, 3));
        java.lang.String[] jDBCXYDatasetColumnNames4 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames4 = ((String) get(jDBCXYDatasetColumnNames4, 4));
        java.lang.String[] jDBCXYDatasetColumnNames5 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames5 = ((String) get(jDBCXYDatasetColumnNames5, 5));
        java.lang.String[] jDBCXYDatasetColumnNames6 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames6 = ((String) get(jDBCXYDatasetColumnNames6, 6));
        java.lang.String[] jDBCXYDatasetColumnNames7 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames7 = ((String) get(jDBCXYDatasetColumnNames7, 7));
        java.lang.String[] jDBCXYDatasetColumnNames8 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames8 = ((String) get(jDBCXYDatasetColumnNames8, 8));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
        
        assertNull(finalJDBCXYDatasetColumnNames1);
        
        assertNull(finalJDBCXYDatasetColumnNames2);
        
        assertNull(finalJDBCXYDatasetColumnNames3);
        
        assertNull(finalJDBCXYDatasetColumnNames4);
        
        assertNull(finalJDBCXYDatasetColumnNames5);
        
        assertNull(finalJDBCXYDatasetColumnNames6);
        
        assertNull(finalJDBCXYDatasetColumnNames7);
        
        assertNull(finalJDBCXYDatasetColumnNames8);
    }
    
    @Test
    public void testIterateDomainBounds3() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset, false);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        java.lang.String[] jDBCXYDatasetColumnNames1 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames1 = ((String) get(jDBCXYDatasetColumnNames1, 1));
        java.lang.String[] jDBCXYDatasetColumnNames2 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames2 = ((String) get(jDBCXYDatasetColumnNames2, 2));
        java.lang.String[] jDBCXYDatasetColumnNames3 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames3 = ((String) get(jDBCXYDatasetColumnNames3, 3));
        java.lang.String[] jDBCXYDatasetColumnNames4 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames4 = ((String) get(jDBCXYDatasetColumnNames4, 4));
        java.lang.String[] jDBCXYDatasetColumnNames5 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames5 = ((String) get(jDBCXYDatasetColumnNames5, 5));
        java.lang.String[] jDBCXYDatasetColumnNames6 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames6 = ((String) get(jDBCXYDatasetColumnNames6, 6));
        java.lang.String[] jDBCXYDatasetColumnNames7 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames7 = ((String) get(jDBCXYDatasetColumnNames7, 7));
        java.lang.String[] jDBCXYDatasetColumnNames8 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames8 = ((String) get(jDBCXYDatasetColumnNames8, 8));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
        
        assertNull(finalJDBCXYDatasetColumnNames1);
        
        assertNull(finalJDBCXYDatasetColumnNames2);
        
        assertNull(finalJDBCXYDatasetColumnNames3);
        
        assertNull(finalJDBCXYDatasetColumnNames4);
        
        assertNull(finalJDBCXYDatasetColumnNames5);
        
        assertNull(finalJDBCXYDatasetColumnNames6);
        
        assertNull(finalJDBCXYDatasetColumnNames7);
        
        assertNull(finalJDBCXYDatasetColumnNames8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    @Test
    public void testIterateDomainBounds4() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateDomainBounds] produces [java.lang.NullPointerException]
            org.jfree.data.jdbc.JDBCXYDataset.getX(JDBCXYDataset.java:429)
            org.jfree.data.xy.AbstractXYDataset.getXValue(AbstractXYDataset.java:77)
            org.jfree.data.general.DatasetUtilities.iterateDomainBounds(DatasetUtilities.java:770) */
        DatasetUtilities.iterateDomainBounds(jDBCXYDataset, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateDomainBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateDomainBounds(dataset, true);}
 *  */
    @Test
    public void testIterateDomainBounds_ReturnIterateDomainBounds() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateDomainBounds(dataset, true);}
 *  */
    @Test
    public void testIterateDomainBounds_ReturnIterateDomainBounds_1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#iterateDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return iterateDomainBounds(dataset, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateDomainBounds_ThrowIllegalArgumentException1() {
        DatasetUtilities.iterateDomainBounds(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateDomainBounds(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testIterateDomainBounds5() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.iterateDomainBounds(timeTableXYDataset);
        
        assertNull(actual);
    }
    
    @Test
    public void testIterateDomainBounds6() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateDomainBounds(jDBCXYDataset);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        java.lang.String[] jDBCXYDatasetColumnNames1 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames1 = ((String) get(jDBCXYDatasetColumnNames1, 1));
        java.lang.String[] jDBCXYDatasetColumnNames2 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames2 = ((String) get(jDBCXYDatasetColumnNames2, 2));
        java.lang.String[] jDBCXYDatasetColumnNames3 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames3 = ((String) get(jDBCXYDatasetColumnNames3, 3));
        java.lang.String[] jDBCXYDatasetColumnNames4 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames4 = ((String) get(jDBCXYDatasetColumnNames4, 4));
        java.lang.String[] jDBCXYDatasetColumnNames5 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames5 = ((String) get(jDBCXYDatasetColumnNames5, 5));
        java.lang.String[] jDBCXYDatasetColumnNames6 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames6 = ((String) get(jDBCXYDatasetColumnNames6, 6));
        java.lang.String[] jDBCXYDatasetColumnNames7 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames7 = ((String) get(jDBCXYDatasetColumnNames7, 7));
        java.lang.String[] jDBCXYDatasetColumnNames8 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames8 = ((String) get(jDBCXYDatasetColumnNames8, 8));
        java.lang.String[] jDBCXYDatasetColumnNames9 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames9 = ((String) get(jDBCXYDatasetColumnNames9, 9));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
        
        assertNull(finalJDBCXYDatasetColumnNames1);
        
        assertNull(finalJDBCXYDatasetColumnNames2);
        
        assertNull(finalJDBCXYDatasetColumnNames3);
        
        assertNull(finalJDBCXYDatasetColumnNames4);
        
        assertNull(finalJDBCXYDatasetColumnNames5);
        
        assertNull(finalJDBCXYDatasetColumnNames6);
        
        assertNull(finalJDBCXYDatasetColumnNames7);
        
        assertNull(finalJDBCXYDatasetColumnNames8);
        
        assertNull(finalJDBCXYDatasetColumnNames9);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateConsolidatedPieDataset1() {
        DatasetUtilities.createConsolidatedPieDataset(null, null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateConsolidatedPieDataset2() {
        DatasetUtilities.createConsolidatedPieDataset(null, null, java.lang.Double.NaN, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateToFindRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.xy.XYDataset,java.util.List,org.jfree.data.Range,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (visibleSeriesKeys == null): False}
 * @utbot.executesCondition {@code (xRange == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: xRange == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds_ThrowIllegalArgumentException() throws Exception  {
        CategoryTableXYDataset categoryTableXYDataset = ((CategoryTableXYDataset) createInstance("org.jfree.data.xy.CategoryTableXYDataset"));
        ArrayList arrayList = new ArrayList();
        
        DatasetUtilities.iterateToFindRangeBounds(categoryTableXYDataset, arrayList, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.xy.XYDataset,java.util.List,org.jfree.data.Range,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (visibleSeriesKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: visibleSeriesKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds_ThrowIllegalArgumentException_2() throws Exception  {
        CategoryTableXYDataset categoryTableXYDataset = ((CategoryTableXYDataset) createInstance("org.jfree.data.xy.CategoryTableXYDataset"));
        
        DatasetUtilities.iterateToFindRangeBounds(categoryTableXYDataset, null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.xy.XYDataset,java.util.List,org.jfree.data.Range,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds_ThrowIllegalArgumentException_1() {
        DatasetUtilities.iterateToFindRangeBounds(null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds_ThrowIllegalArgumentException1() {
        DatasetUtilities.iterateToFindRangeBounds(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (visibleSeriesKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: visibleSeriesKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds_ThrowIllegalArgumentException_11() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        DatasetUtilities.iterateToFindRangeBounds(slidingGanttCategoryDataset, null, false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
     */
    @Test
    public void testIterateToFindRangeBoundsThrowsCCE() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(DatasetUtilities.java:1166) */
        DatasetUtilities.iterateToFindRangeBounds(defaultCategoryDataset, arrayList, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds1() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        DatasetUtilities.iterateToFindRangeBounds(defaultKeyedValues2DDataset, columnKeys, true);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBounds2() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        DatasetUtilities.iterateToFindRangeBounds(defaultCategoryDataset, columnKeys, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset, includeInterval);}
 *  */
    @Test
    public void testIterateCategoryRangeBounds_ReturnIterateRangeBounds() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.iterateCategoryRangeBounds(defaultKeyedValues2DDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset, includeInterval);}
 *  */
    @Test
    public void testIterateCategoryRangeBounds_ReturnIterateRangeBounds_1() throws Exception  {
        JDBCCategoryDataset jDBCCategoryDataset = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(jDBCCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Class datasetUtilitiesClazz = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class jDBCCategoryDatasetType = Class.forName("org.jfree.data.category.CategoryDataset");
        Class booleanType = boolean.class;
        Method iterateCategoryRangeBoundsMethod = datasetUtilitiesClazz.getDeclaredMethod("iterateCategoryRangeBounds", jDBCCategoryDatasetType, booleanType);
        iterateCategoryRangeBoundsMethod.setAccessible(true);
        java.lang.Object[] iterateCategoryRangeBoundsMethodArguments = new java.lang.Object[2];
        iterateCategoryRangeBoundsMethodArguments[0] = jDBCCategoryDataset;
        iterateCategoryRangeBoundsMethodArguments[1] = true;
        Range actual = ((Range) iterateCategoryRangeBoundsMethod.invoke(null, iterateCategoryRangeBoundsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    @Test
    public void testIterateCategoryRangeBounds1() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        
        Range actual = DatasetUtilities.iterateCategoryRangeBounds(slidingGanttCategoryDataset1, false);
        
        assertNull(actual);
    }
    
    @Test
    public void testIterateCategoryRangeBounds2() throws Exception  {
        JDBCCategoryDataset jDBCCategoryDataset = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        setField(jDBCCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Class datasetUtilitiesClazz = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class jDBCCategoryDatasetType = Class.forName("org.jfree.data.category.CategoryDataset");
        Class booleanType = boolean.class;
        Method iterateCategoryRangeBoundsMethod = datasetUtilitiesClazz.getDeclaredMethod("iterateCategoryRangeBounds", jDBCCategoryDatasetType, booleanType);
        iterateCategoryRangeBoundsMethod.setAccessible(true);
        java.lang.Object[] iterateCategoryRangeBoundsMethodArguments = new java.lang.Object[2];
        iterateCategoryRangeBoundsMethodArguments[0] = jDBCCategoryDataset;
        iterateCategoryRangeBoundsMethodArguments[1] = false;
        Range actual = ((Range) iterateCategoryRangeBoundsMethod.invoke(null, iterateCategoryRangeBoundsMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testIterateCategoryRangeBounds3() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 0);
        
        Range actual = DatasetUtilities.iterateCategoryRangeBounds(slidingGanttCategoryDataset, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testIterateCategoryRangeBounds4() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 0);
        
        DatasetUtilities.iterateCategoryRangeBounds(slidingGanttCategoryDataset2, false);
    }
    
    @Test
    public void testIterateCategoryRangeBounds5() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        ArrayList rows = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:1010)
            org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(DatasetUtilities.java:942) */
        DatasetUtilities.iterateCategoryRangeBounds(defaultKeyedValues2DDataset, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMaximumStackedRangeValue_ReturnResult() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMaximumStackedRangeValue_ReturnResult_1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMaximumStackedRangeValue_ReturnResult_2() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 2, -2);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMaximumStackedRangeValue_ReturnResult_3() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, -4, -1);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumStackedRangeValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMaximumStackedRangeValue(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int categoryCount = dataset.getColumnCount();
 *  */
    @Test
    public void testFindMaximumStackedRangeValue_ThrowNullPointerException() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(DatasetUtilities.java:2021) */
        DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindMaximumStackedRangeValue1() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindMaximumStackedRangeValue2() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMaximumStackedRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindMaximumStackedRangeValue3() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        slidingGanttCategoryDataset.setMaximumCategoryCount(1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 1);
        
        DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset2);
    }
    
    @Test
    public void testFindMaximumStackedRangeValue4() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, Integer.MIN_VALUE, 2147483645);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(DatasetUtilities.java:2024) */
        DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset1);
    }
    
    @Test
    public void testFindMaximumStackedRangeValue5() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(DatasetUtilities.java:2021) */
        DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset1);
    }
    
    @Test
    public void testFindMaximumStackedRangeValue6() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(DatasetUtilities.java:2026) */
        DatasetUtilities.findMaximumStackedRangeValue(defaultKeyedValues2DDataset);
    }
    
    @Test
    public void testFindMaximumStackedRangeValue7() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 4);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.TaskSeriesCollection.getRowCount(TaskSeriesCollection.java:157)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(DatasetUtilities.java:2024) */
        DatasetUtilities.findMaximumStackedRangeValue(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.iterateToFindDomainBounds(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (visibleSeriesKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: visibleSeriesKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBounds_ThrowIllegalArgumentException_1() throws SQLException  {
        JDBCXYDataset jDBCXYDataset = new JDBCXYDataset(null);
        
        DatasetUtilities.iterateToFindDomainBounds(jDBCXYDataset, null, false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateToFindDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
     */
    @Test
    public void testIterateToFindDomainBoundsThrowsCCE() {
        SimpleHistogramBin simpleHistogramBin = new SimpleHistogramBin(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        simpleHistogramBin.setItemCount(0);
        DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset = new DefaultBoxAndWhiskerXYDataset(simpleHistogramBin);
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerXYDataset.setGroup(datasetGroup);
        defaultBoxAndWhiskerXYDataset.setFaroutCoefficient(java.lang.Double.POSITIVE_INFINITY);
        java.util.Date[] dateArray = {};
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        double[] doubleArray4 = {};
        DefaultHighLowDataset defaultHighLowDataset = new DefaultHighLowDataset(null, dateArray, doubleArray, doubleArray1, doubleArray2, doubleArray3, doubleArray4);
        defaultHighLowDataset.setSelectionState(null);
        defaultHighLowDataset.setGroup(null);
        defaultBoxAndWhiskerXYDataset.setSelectionState(defaultHighLowDataset);
        defaultBoxAndWhiskerXYDataset.setOutlierCoefficient(java.lang.Double.NEGATIVE_INFINITY);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        Object object2 = new Object();
        arrayList.add(object2);
        Object object3 = new Object();
        arrayList.add(object3);
        Object object4 = new Object();
        arrayList.add(object4);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(DatasetUtilities.java:1344) */
        DatasetUtilities.iterateToFindDomainBounds(defaultBoxAndWhiskerXYDataset, arrayList, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    @Test
    public void testIterateToFindDomainBounds1() throws Exception  {
        DynamicTimeSeriesCollection dynamicTimeSeriesCollection = ((DynamicTimeSeriesCollection) createInstance("org.jfree.data.time.DynamicTimeSeriesCollection"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        Range actual = DatasetUtilities.iterateToFindDomainBounds(dynamicTimeSeriesCollection, arrayList, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    @Test
    public void testIterateToFindDomainBounds2() throws Exception  {
        DefaultHighLowDataset defaultHighLowDataset = ((DefaultHighLowDataset) createInstance("org.jfree.data.xy.DefaultHighLowDataset"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds] produces [java.lang.NullPointerException]
            org.jfree.data.general.AbstractSeriesDataset.indexOf(AbstractSeriesDataset.java:100)
            org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(DatasetUtilities.java:1345) */
        DatasetUtilities.iterateToFindDomainBounds(defaultHighLowDataset, arrayList, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBounds3() {
        DefaultXYDataset defaultXYDataset = new DefaultXYDataset();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        DatasetUtilities.iterateToFindDomainBounds(defaultXYDataset, arrayList, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMaximumRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMaximumRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return new Double(info.getRangeUpperBound(true));}
 *  */
    @Test
    public void testFindMaximumRangeValue_Return() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Double actual = ((Double) DatasetUtilities.findMaximumRangeValue(defaultMultiValueCategoryDataset));
        
        Double expected = java.lang.Double.NaN;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return new Double(info.getRangeUpperBound(true));}
 *  */
    @Test
    public void testFindMaximumRangeValue_Return_1() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        Integer maximumRangeValue = 2089222920;
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "maximumRangeValue", maximumRangeValue);
        
        Double actual = ((Double) DatasetUtilities.findMaximumRangeValue(defaultMultiValueCategoryDataset));
        
        Double expected = 2.08922292E9;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMaximumRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMaximumRangeValue(((CategoryDataset) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMaximumRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindMaximumRangeValue1() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMaximumRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindMaximumRangeValue2() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMaximumRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMaximumRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindMaximumRangeValue3() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 0);
        
        DatasetUtilities.findMaximumRangeValue(slidingGanttCategoryDataset2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMaximumRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMaximumRangeValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeUpperBound(true));}
 *  */
    @Test
    public void testFindMaximumRangeValue_DatasetInstanceOfRangeInfo() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "maxValue", 4.9E-324);
        
        Double actual = ((Double) DatasetUtilities.findMaximumRangeValue(jDBCXYDataset));
        
        Double expected = 4.9E-324;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeUpperBound(true));}
 *  */
    @Test
    public void testFindMaximumRangeValue_DatasetInstanceOfRangeInfo_1() throws Exception  {
        XYSeriesCollection xYSeriesCollection = ((XYSeriesCollection) createInstance("org.jfree.data.xy.XYSeriesCollection"));
        ArrayList data = new ArrayList();
        setField(xYSeriesCollection, "org.jfree.data.xy.XYSeriesCollection", "data", data);
        
        Double actual = ((Double) DatasetUtilities.findMaximumRangeValue(xYSeriesCollection));
        
        Double expected = java.lang.Double.NaN;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): False}
 * @utbot.executesCondition {@code (maximum == Double.NEGATIVE_INFINITY): True}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataset#getSeriesCount()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindMaximumRangeValue_MaximumEqualsDoubleNEGATIVE_INFINITY() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Number actual = DatasetUtilities.findMaximumRangeValue(timeTableXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMaximumRangeValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValue_ThrowIllegalArgumentException1() {
        DatasetUtilities.findMaximumRangeValue(((XYDataset) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findMaximumRangeValue(org.jfree.data.xy.XYDataset)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumRangeValue(org.jfree.data.xy.XYDataset)}
     */
    @Test
    public void testFindMaximumRangeValue() {
        SimpleHistogramBin simpleHistogramBin = new SimpleHistogramBin(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
        simpleHistogramBin.setItemCount(0);
        DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset = new DefaultBoxAndWhiskerXYDataset(simpleHistogramBin);
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerXYDataset.setGroup(datasetGroup);
        defaultBoxAndWhiskerXYDataset.setFaroutCoefficient(java.lang.Double.POSITIVE_INFINITY);
        java.util.Date[] dateArray = {};
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        double[] doubleArray4 = {};
        DefaultHighLowDataset defaultHighLowDataset = new DefaultHighLowDataset(null, dateArray, doubleArray, doubleArray1, doubleArray2, doubleArray3, doubleArray4);
        defaultHighLowDataset.setSelectionState(null);
        defaultHighLowDataset.setGroup(null);
        defaultBoxAndWhiskerXYDataset.setSelectionState(defaultHighLowDataset);
        defaultBoxAndWhiskerXYDataset.setOutlierCoefficient(-1.552518092300709E231);
        
        Double actual = ((Double) DatasetUtilities.findMaximumRangeValue(defaultBoxAndWhiskerXYDataset));
        
        Double expected = java.lang.Double.NaN;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMaximumRangeValue(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testFindMaximumRangeValue4() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Number actual = DatasetUtilities.findMaximumRangeValue(timeTableXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMaximumRangeValue(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testFindMaximumRangeValue5() throws Exception  {
        XYSeriesCollection xYSeriesCollection = ((XYSeriesCollection) createInstance("org.jfree.data.xy.XYSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeriesCollection, "org.jfree.data.xy.XYSeriesCollection", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeriesCollection.getRangeUpperBound(XYSeriesCollection.java:758)
            org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(DatasetUtilities.java:1802) */
        DatasetUtilities.findMaximumRangeValue(xYSeriesCollection);
    }
    
    @Test
    public void testFindMaximumRangeValue6() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMaximumRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:145)
            org.jfree.data.time.TimeTableXYDataset.getY(TimeTableXYDataset.java:448)
            org.jfree.data.time.TimeTableXYDataset.getEndY(TimeTableXYDataset.java:472)
            org.jfree.data.xy.AbstractIntervalXYDataset.getEndYValue(AbstractIntervalXYDataset.java:119)
            org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(DatasetUtilities.java:1817) */
        DatasetUtilities.findMaximumRangeValue(timeTableXYDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMinimumDomainValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMinimumDomainValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumDomainValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (dataset instanceof DomainInfo): False}
 * @utbot.executesCondition {@code (minimum == Double.POSITIVE_INFINITY): True}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataset#getSeriesCount()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMinimumDomainValue_MinimumEqualsDoublePOSITIVE_INFINITY() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Number actual = DatasetUtilities.findMinimumDomainValue(jDBCXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMinimumDomainValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumDomainValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumDomainValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMinimumDomainValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMaximumDomainValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMaximumDomainValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumDomainValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (dataset instanceof DomainInfo): False}
 * @utbot.executesCondition {@code (maximum == Double.NEGATIVE_INFINITY): True}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataset#getSeriesCount()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMaximumDomainValue_MaximumEqualsDoubleNEGATIVE_INFINITY() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Number actual = DatasetUtilities.findMaximumDomainValue(jDBCXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMaximumDomainValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumDomainValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumDomainValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMaximumDomainValue(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findMaximumDomainValue(org.jfree.data.xy.XYDataset)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMaximumDomainValue(org.jfree.data.xy.XYDataset)}
     */
    @Test
    public void testFindMaximumDomainValue() {
        SimpleHistogramBin simpleHistogramBin = new SimpleHistogramBin(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
        simpleHistogramBin.setItemCount(0);
        DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset = new DefaultBoxAndWhiskerXYDataset(simpleHistogramBin);
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerXYDataset.setGroup(datasetGroup);
        defaultBoxAndWhiskerXYDataset.setFaroutCoefficient(java.lang.Double.POSITIVE_INFINITY);
        java.util.Date[] dateArray = {};
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        double[] doubleArray4 = {};
        DefaultHighLowDataset defaultHighLowDataset = new DefaultHighLowDataset(null, dateArray, doubleArray, doubleArray1, doubleArray2, doubleArray3, doubleArray4);
        defaultHighLowDataset.setSelectionState(null);
        defaultHighLowDataset.setGroup(null);
        defaultBoxAndWhiskerXYDataset.setSelectionState(defaultHighLowDataset);
        defaultBoxAndWhiskerXYDataset.setOutlierCoefficient(-1.552518092300709E231);
        
        Number actual = DatasetUtilities.findMaximumDomainValue(defaultBoxAndWhiskerXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMinimumStackedRangeValue_ReturnResult() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindMinimumStackedRangeValue_ReturnResult_1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumStackedRangeValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMinimumStackedRangeValue(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int categoryCount = dataset.getColumnCount();
 *  */
    @Test
    public void testFindMinimumStackedRangeValue_ThrowNullPointerException() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(DatasetUtilities.java:1981) */
        DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindMinimumStackedRangeValue1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 2, -2);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue2() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, -3);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue3() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue4() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMinimumStackedRangeValue(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindMinimumStackedRangeValue5() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        slidingGanttCategoryDataset.setMaximumCategoryCount(1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 1);
        
        DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset2);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue6() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, Integer.MIN_VALUE, 2147483645);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(DatasetUtilities.java:1984) */
        DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset1);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue7() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(DatasetUtilities.java:1981) */
        DatasetUtilities.findMinimumStackedRangeValue(slidingGanttCategoryDataset1);
    }
    
    @Test
    public void testFindMinimumStackedRangeValue8() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(DatasetUtilities.java:1986) */
        DatasetUtilities.findMinimumStackedRangeValue(defaultKeyedValues2DDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < dataset.getRowCount(); row++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindCumulativeRangeBounds_IterateForLoop() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findCumulativeRangeBounds(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < dataset.getRowCount(); row++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindCumulativeRangeBounds_IterateForLoop_1() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 0);
        
        Range actual = DatasetUtilities.findCumulativeRangeBounds(slidingGanttCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindCumulativeRangeBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.findCumulativeRangeBounds(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindCumulativeRangeBounds1() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 0);
        
        Range actual = DatasetUtilities.findCumulativeRangeBounds(slidingGanttCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindCumulativeRangeBounds2() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 0);
        
        DatasetUtilities.findCumulativeRangeBounds(slidingGanttCategoryDataset2);
    }
    
    @Test
    public void testFindCumulativeRangeBounds3() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(DatasetUtilities.java:2146) */
        DatasetUtilities.findCumulativeRangeBounds(defaultCategoryDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateXYRangeBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateXYRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset);}
 *  */
    @Test
    public void testIterateXYRangeBounds_ReturnIterateRangeBounds() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateXYRangeBounds(jDBCXYDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateXYRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset);}
 *  */
    @Test
    public void testIterateXYRangeBounds_ReturnIterateRangeBounds_1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateXYRangeBounds(jDBCXYDataset);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateXYRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset);}
 *  */
    @Test
    public void testIterateXYRangeBounds_ReturnIterateRangeBounds_2() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.iterateXYRangeBounds(timeTableXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateXYRangeBounds(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testIterateXYRangeBounds1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateXYRangeBounds(jDBCXYDataset);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        java.lang.String[] jDBCXYDatasetColumnNames1 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames1 = ((String) get(jDBCXYDatasetColumnNames1, 1));
        java.lang.String[] jDBCXYDatasetColumnNames2 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames2 = ((String) get(jDBCXYDatasetColumnNames2, 2));
        java.lang.String[] jDBCXYDatasetColumnNames3 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames3 = ((String) get(jDBCXYDatasetColumnNames3, 3));
        java.lang.String[] jDBCXYDatasetColumnNames4 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames4 = ((String) get(jDBCXYDatasetColumnNames4, 4));
        java.lang.String[] jDBCXYDatasetColumnNames5 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames5 = ((String) get(jDBCXYDatasetColumnNames5, 5));
        java.lang.String[] jDBCXYDatasetColumnNames6 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames6 = ((String) get(jDBCXYDatasetColumnNames6, 6));
        java.lang.String[] jDBCXYDatasetColumnNames7 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames7 = ((String) get(jDBCXYDatasetColumnNames7, 7));
        java.lang.String[] jDBCXYDatasetColumnNames8 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames8 = ((String) get(jDBCXYDatasetColumnNames8, 8));
        java.lang.String[] jDBCXYDatasetColumnNames9 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames9 = ((String) get(jDBCXYDatasetColumnNames9, 9));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
        
        assertNull(finalJDBCXYDatasetColumnNames1);
        
        assertNull(finalJDBCXYDatasetColumnNames2);
        
        assertNull(finalJDBCXYDatasetColumnNames3);
        
        assertNull(finalJDBCXYDatasetColumnNames4);
        
        assertNull(finalJDBCXYDatasetColumnNames5);
        
        assertNull(finalJDBCXYDatasetColumnNames6);
        
        assertNull(finalJDBCXYDatasetColumnNames7);
        
        assertNull(finalJDBCXYDatasetColumnNames8);
        
        assertNull(finalJDBCXYDatasetColumnNames9);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.calculateStackTotal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculateStackTotal(org.jfree.data.xy.TableXYDataset,int)}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testCalculateStackTotal_ReturnTotal() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        double actual = DatasetUtilities.calculateStackTotal(jDBCXYDataset, -255);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculateStackTotal(org.jfree.data.xy.TableXYDataset,int)}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testCalculateStackTotal_ReturnTotal_1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        double actual = DatasetUtilities.calculateStackTotal(timeTableXYDataset, -255);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculateStackTotal(org.jfree.data.xy.TableXYDataset,int)}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < seriesCount; s++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: double value = dataset.getYValue(s, item);
 *  */
    @Test
    public void testCalculateStackTotal_ThrowClassCastException() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculateStackTotal] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.ArrayList (java.lang.Object and java.util.ArrayList are in module java.base of loader 'bootstrap')]
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:443)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.calculateStackTotal(DatasetUtilities.java:2116) */
        DatasetUtilities.calculateStackTotal(jDBCXYDataset, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculateStackTotal(org.jfree.data.xy.TableXYDataset,int)}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < seriesCount; s++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCalculateStackTotal_ThrowIndexOutOfBoundsException() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculateStackTotal] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:443)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.calculateStackTotal(DatasetUtilities.java:2116) */
        DatasetUtilities.calculateStackTotal(jDBCXYDataset, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#calculateStackTotal(org.jfree.data.xy.TableXYDataset,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int seriesCount = dataset.getSeriesCount();
 *  */
    @Test
    public void testCalculateStackTotal_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculateStackTotal] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.calculateStackTotal(DatasetUtilities.java:2114) */
        DatasetUtilities.calculateStackTotal(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)
    
    @Test
    public void testCalculateStackTotal1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        double actual = DatasetUtilities.calculateStackTotal(timeTableXYDataset, 0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)
    
    @Test
    public void testCalculateStackTotal2() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(rows);
        rows.add(jDBCXYDataset);
        rows.add(jDBCXYDataset);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculateStackTotal] produces [java.lang.ClassCastException: class org.jfree.data.jdbc.JDBCXYDataset cannot be cast to class java.lang.Number (org.jfree.data.jdbc.JDBCXYDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.Number is in module java.base of loader 'bootstrap')]
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.calculateStackTotal(DatasetUtilities.java:2116) */
        DatasetUtilities.calculateStackTotal(jDBCXYDataset, 0);
    }
    
    @Test
    public void testCalculateStackTotal3() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        ArrayList arrayList = new ArrayList();
        rows.add(arrayList);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.calculateStackTotal] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.calculateStackTotal(DatasetUtilities.java:2116) */
        DatasetUtilities.calculateStackTotal(jDBCXYDataset, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMinimumRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMinimumRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeLowerBound(true));}
 *  */
    @Test
    public void testFindMinimumRangeValue_DatasetInstanceOfRangeInfo_2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", 3.337610787760802E-308);
        
        Double actual = ((Double) DatasetUtilities.findMinimumRangeValue(defaultBoxAndWhiskerCategoryDataset));
        
        Double expected = 3.337610787760802E-308;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeLowerBound(true));}
 *  */
    @Test
    public void testFindMinimumRangeValue_DatasetInstanceOfRangeInfo() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Double actual = ((Double) DatasetUtilities.findMinimumRangeValue(defaultMultiValueCategoryDataset));
        
        Double expected = java.lang.Double.NaN;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeLowerBound(true));}
 *  */
    @Test
    public void testFindMinimumRangeValue_DatasetInstanceOfRangeInfo_1() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        Integer minimumRangeValue = Integer.MIN_VALUE;
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "minimumRangeValue", minimumRangeValue);
        
        Double actual = ((Double) DatasetUtilities.findMinimumRangeValue(defaultMultiValueCategoryDataset));
        
        Double expected = -2.147483648E9;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): False}
 * @utbot.executesCondition {@code (minimum == Double.POSITIVE_INFINITY): True}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getRowCount()}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindMinimumRangeValue_MinimumEqualsDoublePOSITIVE_INFINITY() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMinimumRangeValue(defaultCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMinimumRangeValue(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValue_ThrowIllegalArgumentException() {
        DatasetUtilities.findMinimumRangeValue(((CategoryDataset) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMinimumRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindMinimumRangeValue1() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Number actual = DatasetUtilities.findMinimumRangeValue(defaultCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMinimumRangeValue(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindMinimumRangeValue2() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 0);
        
        DatasetUtilities.findMinimumRangeValue(slidingGanttCategoryDataset2);
    }
    
    @Test
    public void testFindMinimumRangeValue3() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(DatasetUtilities.java:1646) */
        DatasetUtilities.findMinimumRangeValue(defaultCategoryDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findMinimumRangeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMinimumRangeValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeLowerBound(true));}
 *  */
    @Test
    public void testFindMinimumRangeValue_DatasetInstanceOfRangeInfo1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "minValue", 4.9E-324);
        
        Double actual = ((Double) DatasetUtilities.findMinimumRangeValue(jDBCXYDataset));
        
        Double expected = 4.9E-324;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return new Double(info.getRangeLowerBound(true));}
 *  */
    @Test
    public void testFindMinimumRangeValue_DatasetInstanceOfRangeInfo_11() throws Exception  {
        XYSeriesCollection xYSeriesCollection = ((XYSeriesCollection) createInstance("org.jfree.data.xy.XYSeriesCollection"));
        ArrayList data = new ArrayList();
        setField(xYSeriesCollection, "org.jfree.data.xy.XYSeriesCollection", "data", data);
        
        Double actual = ((Double) DatasetUtilities.findMinimumRangeValue(xYSeriesCollection));
        
        Double expected = java.lang.Double.NaN;
        
        assertEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): False}
 * @utbot.executesCondition {@code (minimum == Double.POSITIVE_INFINITY): True}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataset#getSeriesCount()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindMinimumRangeValue_MinimumEqualsDoublePOSITIVE_INFINITY1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Number actual = DatasetUtilities.findMinimumRangeValue(timeTableXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findMinimumRangeValue(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findMinimumRangeValue(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValue_ThrowIllegalArgumentException1() {
        DatasetUtilities.findMinimumRangeValue(((XYDataset) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMinimumRangeValue(org.jfree.data.xy.XYDataset)
    
    @Test
    public void testFindMinimumRangeValue4() throws Exception  {
        XYSeriesCollection xYSeriesCollection = ((XYSeriesCollection) createInstance("org.jfree.data.xy.XYSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(xYSeriesCollection, "org.jfree.data.xy.XYSeriesCollection", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.xy.XYSeriesCollection.getRangeLowerBound(XYSeriesCollection.java:732)
            org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(DatasetUtilities.java:1685) */
        DatasetUtilities.findMinimumRangeValue(xYSeriesCollection);
    }
    
    @Test
    public void testFindMinimumRangeValue5() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findMinimumRangeValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:145)
            org.jfree.data.time.TimeTableXYDataset.getY(TimeTableXYDataset.java:448)
            org.jfree.data.time.TimeTableXYDataset.getStartY(TimeTableXYDataset.java:460)
            org.jfree.data.xy.AbstractIntervalXYDataset.getStartYValue(AbstractIntervalXYDataset.java:101)
            org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(DatasetUtilities.java:1700) */
        DatasetUtilities.findMinimumRangeValue(timeTableXYDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findStackedRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findStackedRangeBounds(dataset, 0.0);}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnFindStackedRangeBounds() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(defaultKeyedValues2DDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findStackedRangeBounds(dataset, 0.0);}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnFindStackedRangeBounds_1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findStackedRangeBounds(dataset, 0.0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return findStackedRangeBounds(dataset, 0.0);
 *  */
    @Test
    public void testFindStackedRangeBounds_ThrowNullPointerException() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1871)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1851) */
        DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindStackedRangeBounds1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, -2147483647);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindStackedRangeBounds2() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset1);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindStackedRangeBounds3() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(defaultKeyedValues2DDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 0.0);
        setField(expected, "org.jfree.data.Range", "upper", 0.0);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = StackOverflowError.class)
    public void testFindStackedRangeBounds4() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        slidingGanttCategoryDataset.setMaximumCategoryCount(1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 1);
        
        DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset2);
    }
    
    @Test
    public void testFindStackedRangeBounds5() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1877)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1851) */
        DatasetUtilities.findStackedRangeBounds(defaultCategoryDataset);
    }
    
    @Test
    public void testFindStackedRangeBounds6() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 67108864);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.TaskSeriesCollection.getRowCount(TaskSeriesCollection.java:157)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1875)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1851) */
        DatasetUtilities.findStackedRangeBounds(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findStackedRangeBounds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,org.jfree.data.KeyToGroupMap)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getRowCount()}
 * @utbot.invokes {@link org.jfree.data.KeyToGroupMap#getGroupCount()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dataset.getRowCount(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int groupCount = map.getGroupCount();
 *  */
    @Test
    public void testFindStackedRangeBounds_ThrowNullPointerException1() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1925) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) defaultCategoryDataset), ((KeyToGroupMap) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,org.jfree.data.KeyToGroupMap)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_ThrowIllegalArgumentException1() {
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) null), ((KeyToGroupMap) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)
    
    @Test(expected = StackOverflowError.class)
    public void testFindStackedRangeBounds7() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 0);
        
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset2), ((KeyToGroupMap) null));
    }
    
    @Test
    public void testFindStackedRangeBounds8() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        KeyToGroupMap keyToGroupMap = ((KeyToGroupMap) createInstance("org.jfree.data.KeyToGroupMap"));
        ArrayList groups = new ArrayList();
        setField(keyToGroupMap, "org.jfree.data.KeyToGroupMap", "groups", groups);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnCount(KeyedObjects2D.java:98)
            org.jfree.data.category.DefaultCategoryDataset.getColumnCount(DefaultCategoryDataset.java:105)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1929) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) defaultCategoryDataset), keyToGroupMap);
    }
    
    @Test
    public void testFindStackedRangeBounds9() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 0);
        KeyToGroupMap keyToGroupMap = ((KeyToGroupMap) createInstance("org.jfree.data.KeyToGroupMap"));
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.TaskSeriesCollection.getRowKey(TaskSeriesCollection.java:241)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowKey(SlidingGanttCategoryDataset.java:232)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1921) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), keyToGroupMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findStackedRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnResult() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) defaultCategoryDataset), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnResult_1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnResult_3() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, -3, 3);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset1), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnResult_2() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, -3, 3);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnResult_4() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 4, -1);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_ThrowIllegalArgumentException2() {
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.category.CategoryDataset,double)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int categoryCount = dataset.getColumnCount();
 *  */
    @Test
    public void testFindStackedRangeBounds_ThrowNullPointerException2() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex(SlidingGanttCategoryDataset.java:164)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount(SlidingGanttCategoryDataset.java:271)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1871) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)
    
    @Test
    public void testFindStackedRangeBounds10() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(((CategoryDataset) defaultKeyedValues2DDataset), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)
    
    @Test(expected = StackOverflowError.class)
    public void testFindStackedRangeBounds11() throws Exception  {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        setField(slidingGanttCategoryDataset, "org.jfree.data.gantt.SlidingGanttCategoryDataset", "underlying", slidingGanttCategoryDataset);
        slidingGanttCategoryDataset.setMaximumCategoryCount(1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, 0, 1);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset2 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset1, 0, 1);
        
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset2), java.lang.Double.NaN);
    }
    
    @Test
    public void testFindStackedRangeBounds12() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset1 = new SlidingGanttCategoryDataset(slidingGanttCategoryDataset, -3, 2);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException] */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset1), java.lang.Double.NaN);
    }
    
    @Test
    public void testFindStackedRangeBounds13() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:113)
            org.jfree.data.category.DefaultCategoryDataset.getValue(DefaultCategoryDataset.java:120)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1877) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) defaultKeyedValues2DDataset), java.lang.Double.NaN);
    }
    
    @Test
    public void testFindStackedRangeBounds14() throws Exception  {
        TaskSeriesCollection taskSeriesCollection = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(taskSeriesCollection, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(taskSeriesCollection, 0, 7);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.TaskSeriesCollection.getRowCount(TaskSeriesCollection.java:157)
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:1875) */
        DatasetUtilities.findStackedRangeBounds(((CategoryDataset) slidingGanttCategoryDataset), java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findStackedRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (minimum <= maximum): True}
 * @utbot.iterates iterate the loop {@code for(int itemNo = 0; itemNo < dataset.getItemCount(); itemNo++)} once
 * @utbot.returnsFrom {@code return new Range(minimum, maximum);}
 *  */
    @Test
    public void testFindStackedRangeBounds_MinimumLessOrEqualMaximum() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, -2.0000000000000004);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", -2.0000000000000004);
        setField(expected, "org.jfree.data.Range", "upper", -2.0000000000000004);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (minimum <= maximum): False}
 * @utbot.iterates iterate the loop {@code for(int itemNo = 0; itemNo < dataset.getItemCount(); itemNo++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindStackedRangeBounds_MinimumGreaterThanMaximum() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (minimum <= maximum): False}
 * @utbot.iterates iterate the loop {@code for(int itemNo = 0; itemNo < dataset.getItemCount(); itemNo++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindStackedRangeBounds_MinimumGreaterThanMaximum_1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(timeTableXYDataset, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (minimum <= maximum): False}
 * @utbot.iterates iterate the loop {@code for(int itemNo = 0; itemNo < dataset.getItemCount(); itemNo++)} twice
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindStackedRangeBounds_NegativeGreaterOrEqualMinimum() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_ThrowIllegalArgumentException3() {
        DatasetUtilities.findStackedRangeBounds(((TableXYDataset) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.iterates iterate the loop {@code for(int itemNo = 0; itemNo < dataset.getItemCount(); itemNo++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: double y = dataset.getYValue(seriesNo, itemNo);
 *  */
    @Test
    public void testFindStackedRangeBounds_ThrowClassCastException() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.ArrayList (java.lang.Object and java.util.ArrayList are in module java.base of loader 'bootstrap')]
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:443)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076) */
        DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)
    
    @Test
    public void testFindStackedRangeBounds15() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, -2.0000000000000004);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", -2.0000000000000004);
        setField(expected, "org.jfree.data.Range", "upper", -2.0000000000000004);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testFindStackedRangeBounds16() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)
    
    @Test
    public void testFindStackedRangeBounds17() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(rows);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076) */
        DatasetUtilities.findStackedRangeBounds(jDBCXYDataset, java.lang.Double.NaN);
    }
    
    @Test
    public void testFindStackedRangeBounds18() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:145)
            org.jfree.data.time.TimeTableXYDataset.getY(TimeTableXYDataset.java:448)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076) */
        DatasetUtilities.findStackedRangeBounds(timeTableXYDataset, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findStackedRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)}
 * @utbot.returnsFrom {@code return findStackedRangeBounds(dataset, 0.0);}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnFindStackedRangeBounds1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 0.0);
        setField(expected, "org.jfree.data.Range", "upper", 0.0);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)}
 * @utbot.returnsFrom {@code return findStackedRangeBounds(dataset, 0.0);}
 *  */
    @Test
    public void testFindStackedRangeBounds_ReturnFindStackedRangeBounds_11() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(timeTableXYDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 0.0);
        setField(expected, "org.jfree.data.Range", "upper", 0.0);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findStackedRangeBounds(dataset, 0.0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBounds_ThrowIllegalArgumentException4() {
        DatasetUtilities.findStackedRangeBounds(((TableXYDataset) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findStackedRangeBounds(org.jfree.data.xy.TableXYDataset,double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return findStackedRangeBounds(dataset, 0.0);
 *  */
    @Test
    public void testFindStackedRangeBounds_ThrowClassCastException1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.ArrayList (java.lang.Object and java.util.ArrayList are in module java.base of loader 'bootstrap')]
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:443)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2052) */
        DatasetUtilities.findStackedRangeBounds(jDBCXYDataset);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)
    
    @Test
    public void testFindStackedRangeBounds19() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(jDBCXYDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 0.0);
        setField(expected, "org.jfree.data.Range", "upper", 0.0);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testFindStackedRangeBounds20() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.findStackedRangeBounds(timeTableXYDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 0.0);
        setField(expected, "org.jfree.data.Range", "upper", 0.0);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)
    
    @Test
    public void testFindStackedRangeBounds21() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        ArrayList arrayList = new ArrayList();
        rows.add(arrayList);
        rows.add(rows);
        rows.add(rows);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2052) */
        DatasetUtilities.findStackedRangeBounds(jDBCXYDataset);
    }
    
    @Test
    public void testFindStackedRangeBounds22() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(rows);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findStackedRangeBounds] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2076)
            org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(DatasetUtilities.java:2052) */
        DatasetUtilities.findStackedRangeBounds(jDBCXYDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.sampleFunction2D
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2D(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYSeries series = sampleFunction2DToSeries(f, start, end, samples, seriesKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_ThrowIllegalArgumentException() throws Exception  {
        PolynomialFunction2D polynomialFunction2D = ((PolynomialFunction2D) createInstance("org.jfree.data.function.PolynomialFunction2D"));
        
        DatasetUtilities.sampleFunction2D(polynomialFunction2D, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2D(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYSeries series = sampleFunction2DToSeries(f, start, end, samples, seriesKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_ThrowIllegalArgumentException_2() throws Exception  {
        PolynomialFunction2D polynomialFunction2D = ((PolynomialFunction2D) createInstance("org.jfree.data.function.PolynomialFunction2D"));
        Long long1 = 0L;
        
        DatasetUtilities.sampleFunction2D(polynomialFunction2D, 0.0, -0.0, -255, long1);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2D(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYSeries series = sampleFunction2DToSeries(f, start, end, samples, seriesKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_ThrowIllegalArgumentException_3() throws Exception  {
        PolynomialFunction2D polynomialFunction2D = ((PolynomialFunction2D) createInstance("org.jfree.data.function.PolynomialFunction2D"));
        Integer integer = 0;
        
        DatasetUtilities.sampleFunction2D(polynomialFunction2D, -1.4758605601367497E20, 3.5637442400191245E-307, 1, integer);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#sampleFunction2D(org.jfree.data.function.Function2D,double,double,int,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: XYSeries series = sampleFunction2DToSeries(f, start, end, samples, seriesKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2D_ThrowIllegalArgumentException_1() {
        DatasetUtilities.sampleFunction2D(null, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.isEmptyOrNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmptyOrNull(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetEqualsNull() {
        boolean actual = DatasetUtilities.isEmptyOrNull(((CategoryDataset) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.category.CategoryDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (rowCount == 0): True}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getRowCount()}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnCount()}
 *  */
    @Test
    public void testIsEmptyOrNull_RowCountEqualsZero() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(defaultCategoryDataset);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.isEmptyOrNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmptyOrNull(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetEqualsNull1() {
        boolean actual = DatasetUtilities.isEmptyOrNull(((XYDataset) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): True}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < dataset.getSeriesCount(); s++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(jDBCXYDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): True}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < dataset.getSeriesCount(); s++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_1() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(timeTableXYDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): True}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < dataset.getSeriesCount(); s++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_3() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(jDBCXYDataset);
        
        assertTrue(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): True}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < dataset.getSeriesCount(); s++)} once
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_4() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(timeTableXYDataset);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.xy.XYDataset)}
 * @utbot.executesCondition {@code (dataset != null): True}
 * @utbot.iterates iterate the loop {@code for(int s = 0; s < dataset.getSeriesCount(); s++)} once
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_2() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(jDBCXYDataset);
        
        assertFalse(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.isEmptyOrNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmptyOrNull(org.jfree.data.pie.PieDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.pie.PieDataset)}
 * @utbot.executesCondition {@code (dataset == null): True}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetEqualsNull2() {
        boolean actual = DatasetUtilities.isEmptyOrNull(((PieDataset) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.pie.PieDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_11() throws Exception  {
        CategoryToPieDataset categoryToPieDataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        
        boolean actual = DatasetUtilities.isEmptyOrNull(categoryToPieDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.pie.PieDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull1() throws Exception  {
        DefaultPieDataset defaultPieDataset = ((DefaultPieDataset) createInstance("org.jfree.data.pie.DefaultPieDataset"));
        KeyedObjects data = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects", "data", data1);
        setField(defaultPieDataset, "org.jfree.data.pie.DefaultPieDataset", "data", data);
        
        boolean actual = DatasetUtilities.isEmptyOrNull(defaultPieDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#isEmptyOrNull(org.jfree.data.pie.PieDataset)}
 * @utbot.executesCondition {@code (dataset == null): False}
 *  */
    @Test
    public void testIsEmptyOrNull_DatasetNotEqualsNull_21() throws Exception  {
        TableOrder prevBY_COLUMN = TableOrder.BY_COLUMN;
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byColumn = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_COLUMN";
            setField(byColumn, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_COLUMN", byColumn);
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name1 = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name1);
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            CategoryToPieDataset categoryToPieDataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultBoxAndWhiskerCategoryDataset source = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
            setField(categoryToPieDataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            
            boolean actual = DatasetUtilities.isEmptyOrNull(categoryToPieDataset);
            
            assertTrue(actual);
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findDomainBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findDomainBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findDomainBounds(dataset, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.findDomainBounds(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findDomainBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_ThrowIllegalArgumentException1() {
        DatasetUtilities.findDomainBounds(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (dataset instanceof XYDomainInfo): False}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#iterateToFindDomainBounds(org.jfree.data.xy.XYDataset,java.util.List,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = iterateToFindDomainBounds(dataset, visibleSeriesKeys, includeInterval);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_ThrowIllegalArgumentException_1() throws SQLException  {
        JDBCXYDataset jDBCXYDataset = new JDBCXYDataset(null);
        
        DatasetUtilities.findDomainBounds(jDBCXYDataset, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findDomainBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindDomainBounds_ReturnResult() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.findDomainBounds(jDBCXYDataset, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindDomainBounds_ReturnResult_1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.findDomainBounds(jDBCXYDataset, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findDomainBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBounds_ThrowIllegalArgumentException2() {
        DatasetUtilities.findDomainBounds(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_ReturnResult() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "maxValue", 4.9E-324);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "minValue", 4.9E-324);
        
        Range actual = DatasetUtilities.findRangeBounds(jDBCXYDataset, false);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 4.9E-324);
        setField(expected, "org.jfree.data.Range", "upper", 4.9E-324);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_ReturnResult_1() throws Exception  {
        XYSeriesCollection xYSeriesCollection = ((XYSeriesCollection) createInstance("org.jfree.data.xy.XYSeriesCollection"));
        ArrayList data = new ArrayList();
        setField(xYSeriesCollection, "org.jfree.data.xy.XYSeriesCollection", "data", data);
        
        Range actual = DatasetUtilities.findRangeBounds(xYSeriesCollection, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException() {
        DatasetUtilities.findRangeBounds(((XYDataset) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,java.util.List,org.jfree.data.Range,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException1() {
        DatasetUtilities.findRangeBounds(null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException2() {
        DatasetUtilities.findRangeBounds(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.executesCondition {@code (dataset instanceof CategoryRangeInfo): False}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = iterateToFindRangeBounds(dataset, visibleSeriesKeys, includeInterval);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException_1() {
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        DatasetUtilities.findRangeBounds(slidingGanttCategoryDataset, null, false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,java.util.List,boolean)}
     */
    @Test
    public void testFindRangeBoundsThrowsCCE() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.findRangeBounds] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(DatasetUtilities.java:1166)
            org.jfree.data.general.DatasetUtilities.findRangeBounds(DatasetUtilities.java:848) */
        DatasetUtilities.findRangeBounds(defaultCategoryDataset, arrayList, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_DatasetInstanceOfRangeInfo_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", 4.9E-324);
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue", 4.9E-324);
        
        Range actual = DatasetUtilities.findRangeBounds(defaultBoxAndWhiskerCategoryDataset, false);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 4.9E-324);
        setField(expected, "org.jfree.data.Range", "upper", 4.9E-324);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_DatasetInstanceOfRangeInfo() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Range actual = DatasetUtilities.findRangeBounds(defaultMultiValueCategoryDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_NotDatasetNotInstanceOfRangeInfo() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findRangeBounds(defaultCategoryDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset instanceof RangeInfo): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindRangeBounds_NotDatasetNotInstanceOfRangeInfo_1() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.findRangeBounds(defaultCategoryDataset, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: dataset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException3() {
        DatasetUtilities.findRangeBounds(((CategoryDataset) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, true);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", 4.9E-324);
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue", 4.9E-324);
        
        Range actual = DatasetUtilities.findRangeBounds(defaultBoxAndWhiskerCategoryDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 4.9E-324);
        setField(expected, "org.jfree.data.Range", "upper", 4.9E-324);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, true);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds() throws Exception  {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Range actual = DatasetUtilities.findRangeBounds(defaultMultiValueCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findRangeBounds(dataset, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException4() {
        DatasetUtilities.findRangeBounds(((CategoryDataset) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset)}
     */
    @Test
    public void testFindRangeBounds() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        
        Range actual = DatasetUtilities.findRangeBounds(defaultCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, true);}
 *  */
    @Test
    public void testFindRangeBounds_DatasetUtilitiesFindRangeBounds() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "maxValue", 4.9E-324);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "minValue", 4.9E-324);
        
        Range actual = DatasetUtilities.findRangeBounds(jDBCXYDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 4.9E-324);
        setField(expected, "org.jfree.data.Range", "upper", 4.9E-324);
        
        // org.jfree.data.Range has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return findRangeBounds(dataset, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds_ThrowIllegalArgumentException5() {
        DatasetUtilities.findRangeBounds(((XYDataset) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.xy.XYDataset)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset, true);}
 *  */
    @Test
    public void testIterateRangeBounds_ReturnIterateRangeBounds() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateRangeBounds(jDBCXYDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset, true);}
 *  */
    @Test
    public void testIterateRangeBounds_ReturnIterateRangeBounds_1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateRangeBounds(jDBCXYDataset);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset)}
 * @utbot.returnsFrom {@code return iterateRangeBounds(dataset, true);}
 *  */
    @Test
    public void testIterateRangeBounds_ReturnIterateRangeBounds_2() throws Exception  {
        TimeTableXYDataset timeTableXYDataset = ((TimeTableXYDataset) createInstance("org.jfree.data.time.TimeTableXYDataset"));
        DefaultKeyedValues2D values = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(values, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(timeTableXYDataset, "org.jfree.data.time.TimeTableXYDataset", "values", values);
        
        Range actual = DatasetUtilities.iterateRangeBounds(timeTableXYDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateRangeBounds
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.category.CategoryDataset)}
     */
    @Test
    public void testIterateRangeBounds() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultCategoryDataset.setGroup(datasetGroup);
        DefaultCategoryDataset defaultCategoryDataset1 = new DefaultCategoryDataset();
        defaultCategoryDataset1.setSelectionState(null);
        defaultCategoryDataset1.setGroup(null);
        defaultCategoryDataset.setSelectionState(defaultCategoryDataset1);
        
        Range actual = DatasetUtilities.iterateRangeBounds(defaultCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof IntervalCategoryDataset): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateRangeBounds_IncludeIntervalAndDatasetNotInstanceOfIntervalCategoryDataset() throws Exception  {
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.iterateRangeBounds(defaultCategoryDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof IntervalCategoryDataset): True}
 * @utbot.executesCondition {@code (if (includeInterval && dataset instanceof IntervalCategoryDataset) {
 *     IntervalCategoryDataset icd = (IntervalCategoryDataset) dataset;
 *     Number value, lvalue, uvalue;
 *     for (int row = 0; row < rowCount; row++) {
 *         for (int column = 0; column < columnCount; column++) {
 *             value = icd.getValue(row, column);
 *             double v;
 *             if ((value != null) && !Double.isNaN(v = value.doubleValue())) {
 *                 minimum = Math.min(v, minimum);
 *                 maximum = Math.max(v, maximum);
 *             }
 *             lvalue = icd.getStartValue(row, column);
 *             if (lvalue != null && !Double.isNaN(v = lvalue.doubleValue())) {
 *                 minimum = Math.min(v, minimum);
 *                 maximum = Math.max(v, maximum);
 *             }
 *             uvalue = icd.getEndValue(row, column);
 *             if (uvalue != null && !Double.isNaN(v = uvalue.doubleValue())) {
 *                 minimum = Math.min(v, minimum);
 *                 maximum = Math.max(v, maximum);
 *             }
 *         }
 *     }
 * } else {
 *     for (int row = 0; row < rowCount; row++) {
 *         for (int column = 0; column < columnCount; column++) {
 *             Number value = dataset.getValue(row, column);
 *             if (value != null) {
 *                 double v = value.doubleValue();
 *                 if (!Double.isNaN(v)) {
 *                     minimum = Math.min(minimum, v);
 *                     maximum = Math.max(maximum, v);
 *                 }
 *             }
 *         }
 *     }
 * }): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateRangeBounds_IncludeIntervalAndDatasetNotInstanceOfIntervalCategoryDataset_1() throws Exception  {
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        Range actual = DatasetUtilities.iterateRangeBounds(defaultKeyedValues2DDataset, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getRowCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rowCount = dataset.getRowCount();
 *  */
    @Test
    public void testIterateRangeBounds_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:975) */
        DatasetUtilities.iterateRangeBounds(((CategoryDataset) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.general.DatasetUtilities.iterateRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof IntervalXYDataset): False}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof OHLCDataset): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateRangeBounds_IncludeIntervalAndDatasetNotInstanceOfOHLCDataset() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateRangeBounds(jDBCXYDataset, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof IntervalXYDataset): True}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof OHLCDataset): False}
 * @utbot.executesCondition {@code (includeInterval && dataset instanceof OHLCDataset): True}
 * @utbot.executesCondition {@code (if (includeInterval && dataset instanceof OHLCDataset) {
 *     OHLCDataset ohlc = (OHLCDataset) dataset;
 *     for (int series = 0; series < seriesCount; series++) {
 *         int itemCount = dataset.getItemCount(series);
 *         for (int item = 0; item < itemCount; item++) {
 *             double lvalue = ohlc.getLowValue(series, item);
 *             double uvalue = ohlc.getHighValue(series, item);
 *             if (!Double.isNaN(lvalue)) {
 *                 minimum = Math.min(minimum, lvalue);
 *             }
 *             if (!Double.isNaN(uvalue)) {
 *                 maximum = Math.max(maximum, uvalue);
 *             }
 *         }
 *     }
 * } else {
 *     for (int series = 0; series < seriesCount; series++) {
 *         int itemCount = dataset.getItemCount(series);
 *         for (int item = 0; item < itemCount; item++) {
 *             double value = dataset.getYValue(series, item);
 *             if (!Double.isNaN(value)) {
 *                 minimum = Math.min(minimum, value);
 *                 maximum = Math.max(maximum, value);
 *             }
 *         }
 *     }
 * }): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIterateRangeBounds_IncludeIntervalAndDatasetNotInstanceOfOHLCDataset_1() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        
        Range actual = DatasetUtilities.iterateRangeBounds(jDBCXYDataset, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link DatasetUtilities}
 * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
 * @utbot.invokes {@link org.jfree.data.xy.XYDataset#getSeriesCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int seriesCount = dataset.getSeriesCount();
 *  */
    @Test
    public void testIterateRangeBounds_ThrowNullPointerException1() {
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:1233) */
        DatasetUtilities.iterateRangeBounds(((XYDataset) null), false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.general.DatasetUtilities}
     * @utbot.methodUnderTest {@link org.jfree.data.general.DatasetUtilities#iterateRangeBounds(org.jfree.data.xy.XYDataset,boolean)}
     */
    @Test
    public void testIterateRangeBounds1() {
        SimpleHistogramBin simpleHistogramBin = new SimpleHistogramBin(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        simpleHistogramBin.setItemCount(0);
        DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset = new DefaultBoxAndWhiskerXYDataset(simpleHistogramBin);
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerXYDataset.setGroup(datasetGroup);
        defaultBoxAndWhiskerXYDataset.setFaroutCoefficient(java.lang.Double.POSITIVE_INFINITY);
        java.util.Date[] dateArray = {};
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        double[] doubleArray4 = {};
        DefaultHighLowDataset defaultHighLowDataset = new DefaultHighLowDataset(null, dateArray, doubleArray, doubleArray1, doubleArray2, doubleArray3, doubleArray4);
        defaultHighLowDataset.setSelectionState(null);
        defaultHighLowDataset.setGroup(null);
        defaultBoxAndWhiskerXYDataset.setSelectionState(defaultHighLowDataset);
        defaultBoxAndWhiskerXYDataset.setOutlierCoefficient(java.lang.Double.NEGATIVE_INFINITY);
        
        Range actual = DatasetUtilities.iterateRangeBounds(defaultBoxAndWhiskerXYDataset, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    @Test
    public void testIterateRangeBounds2() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        Range actual = DatasetUtilities.iterateRangeBounds(jDBCXYDataset, false);
        
        assertNull(actual);
        
        java.lang.String[] jDBCXYDatasetColumnNames = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames0 = ((String) get(jDBCXYDatasetColumnNames, 0));
        java.lang.String[] jDBCXYDatasetColumnNames1 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames1 = ((String) get(jDBCXYDatasetColumnNames1, 1));
        java.lang.String[] jDBCXYDatasetColumnNames2 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames2 = ((String) get(jDBCXYDatasetColumnNames2, 2));
        java.lang.String[] jDBCXYDatasetColumnNames3 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames3 = ((String) get(jDBCXYDatasetColumnNames3, 3));
        java.lang.String[] jDBCXYDatasetColumnNames4 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames4 = ((String) get(jDBCXYDatasetColumnNames4, 4));
        java.lang.String[] jDBCXYDatasetColumnNames5 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames5 = ((String) get(jDBCXYDatasetColumnNames5, 5));
        java.lang.String[] jDBCXYDatasetColumnNames6 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames6 = ((String) get(jDBCXYDatasetColumnNames6, 6));
        java.lang.String[] jDBCXYDatasetColumnNames7 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames7 = ((String) get(jDBCXYDatasetColumnNames7, 7));
        java.lang.String[] jDBCXYDatasetColumnNames8 = ((java.lang.String[]) getFieldValue(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames"));
        String finalJDBCXYDatasetColumnNames8 = ((String) get(jDBCXYDatasetColumnNames8, 8));
        
        assertNull(finalJDBCXYDatasetColumnNames0);
        
        assertNull(finalJDBCXYDatasetColumnNames1);
        
        assertNull(finalJDBCXYDatasetColumnNames2);
        
        assertNull(finalJDBCXYDatasetColumnNames3);
        
        assertNull(finalJDBCXYDatasetColumnNames4);
        
        assertNull(finalJDBCXYDatasetColumnNames5);
        
        assertNull(finalJDBCXYDatasetColumnNames6);
        
        assertNull(finalJDBCXYDatasetColumnNames7);
        
        assertNull(finalJDBCXYDatasetColumnNames8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)
    
    @Test
    public void testIterateRangeBounds3() throws Exception  {
        JDBCXYDataset jDBCXYDataset = ((JDBCXYDataset) createInstance("org.jfree.data.jdbc.JDBCXYDataset"));
        java.lang.String[] columnNames = {null, null, null, null, null, null, null, null, null};
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "columnNames", columnNames);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(jDBCXYDataset, "org.jfree.data.jdbc.JDBCXYDataset", "rows", rows);
        
        /* This test fails because method [org.jfree.data.general.DatasetUtilities.iterateRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.jdbc.JDBCXYDataset.getY(JDBCXYDataset.java:444)
            org.jfree.data.xy.AbstractXYDataset.getYValue(AbstractXYDataset.java:94)
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:1275) */
        DatasetUtilities.iterateRangeBounds(jDBCXYDataset, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields794916756463100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields794916756463100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass794916756479400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794916756463100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794916756479400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields794916757113700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields794916757113700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass794916757117800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794916757113700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794916757117800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields794916757955800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields794916757955800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass794916757961800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794916757955800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794916757961800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

