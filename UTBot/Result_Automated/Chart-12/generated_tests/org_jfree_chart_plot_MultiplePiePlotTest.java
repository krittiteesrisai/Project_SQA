package org.jfree.chart.plot;

import org.junit.Test;
import org.jfree.chart.event.ChartChangeEventType;
import javax.swing.event.EventListenerList;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.general.DatasetGroup;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.chart.LegendItemCollection;
import java.util.ArrayList;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.PaintMap;
import java.awt.Paint;
import sun.swing.PrintColorUIResource;
import java.awt.SystemColor;
import javax.swing.plaf.ColorUIResource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_jfree_chart_plot_MultiplePiePlotTest {
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setLimit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLimit(double)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 *  */
    @Test
    public void testSetLimit() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            multiplePiePlot.setLimit(java.lang.Double.NaN);
            
            double finalMultiplePiePlotLimit = ((Double) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "limit"));
            
            assertEquals(java.lang.Double.NaN, finalMultiplePiePlotLimit, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 *  */
    @Test
    public void testSetLimit_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            multiplePiePlot.setLimit(java.lang.Double.NaN);
            
            double finalMultiplePiePlotLimit = ((Double) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "limit"));
            
            assertEquals(java.lang.Double.NaN, finalMultiplePiePlotLimit, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 *  */
    @Test
    public void testSetLimit_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setLimit(java.lang.Double.NaN);
            
            double finalMultiplePiePlotLimit = ((Double) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "limit"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalMultiplePiePlotLimit, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 *  */
    @Test
    public void testSetLimit_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setLimit(java.lang.Double.NaN);
            
            double finalMultiplePiePlotLimit = ((Double) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "limit"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalMultiplePiePlotLimit, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 *  */
    @Test
    public void testSetLimit_4() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null, null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setLimit(java.lang.Double.NaN);
            
            double finalMultiplePiePlotLimit = ((Double) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "limit"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalMultiplePiePlotLimit, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLimit(double)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetLimit_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setLimit] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            multiplePiePlot.setLimit(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setLimit(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetLimit_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            multiplePiePlot.setLimit(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setLimit] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            multiplePiePlot.setLimit(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLimit
    
    public void testSetLimit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getLimit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLimit()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLimit()}
 * @utbot.returnsFrom {@code return this.limit;}
 *  */
    @Test
    public void testGetLimit_ReturnThisLimit() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot.setLimit(0.0);
        
        double actual = multiplePiePlot.getLimit();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getLimit
    
    public void testGetLimit_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfMultiplePiePlot() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        boolean actual = multiplePiePlot.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder != that.dataExtractOrder): False}
 * @utbot.executesCondition {@code (this.limit != that.limit): True}
 *  */
    @Test
    public void testEquals_ThisLimitNotEqualsThatLimit() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot.setLimit(2.140625);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot1.setLimit(-2.294607416585552E-308);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder != that.dataExtractOrder): True}
 *  */
    @Test
    public void testEquals_ThisDataExtractOrderNotEqualsThatDataExtractOrder() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder != that.dataExtractOrder): False}
 * @utbot.executesCondition {@code (this.limit != that.limit): False}
 * @utbot.executesCondition {@code (!this.aggregatedItemsKey.equals(that.aggregatedItemsKey)): True}
 *  */
    @Test
    public void testEquals_NotThisAggregatedItemsKeyEquals() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot.setLimit(1.7872468705761186E-307);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setLimit(1.7872468705761186E-307);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder != that.dataExtractOrder): False}
 * @utbot.executesCondition {@code (this.limit != that.limit): False}
 * @utbot.executesCondition {@code (!this.aggregatedItemsKey.equals(that.aggregatedItemsKey)): False}
 * @utbot.executesCondition {@code (!PaintUtilities.equal(this.aggregatedItemsPaint, that.aggregatedItemsPaint)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.pieChart, that.pieChart)): True}
 * @utbot.invokes {@link org.jfree.chart.util.PaintUtilities#equal(java.awt.Paint,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testEquals_NotObjectUtilitiesEqual() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
        multiplePiePlot.setPieChart(pieChart);
        multiplePiePlot.setLimit(6.79038653113E-312);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setLimit(6.79038653113E-312);
        multiplePiePlot1.setAggregatedItemsKey(aggregatedItemsKey);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof MultiplePiePlot)): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder != that.dataExtractOrder): False}
 * @utbot.executesCondition {@code (this.limit != that.limit): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.aggregatedItemsKey.equals(that.aggregatedItemsKey)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot.setLimit(6.47582E-319);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot1.setLimit(6.47582E-319);
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.equals(MultiplePiePlot.java:575) */
        multiplePiePlot.equals(multiplePiePlot1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot.setLimit(3.818670454374506E-152);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
        multiplePiePlot1.setPieChart(pieChart);
        multiplePiePlot1.setLimit(3.818670454374506E-152);
        multiplePiePlot1.setAggregatedItemsKey(aggregatedItemsKey);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot.setLimit(2.315841784746324E77);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot1.setLimit(2.315841784746324E77);
        multiplePiePlot1.setAggregatedItemsKey(aggregatedItemsKey);
        String noDataMessage = "";
        multiplePiePlot1.setNoDataMessage(noDataMessage);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot.setLimit(2.315841784746324E77);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        String noDataMessage = "";
        multiplePiePlot.setNoDataMessage(noDataMessage);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot1.setLimit(2.315841784746324E77);
        multiplePiePlot1.setAggregatedItemsKey(aggregatedItemsKey);
        
        boolean actual = multiplePiePlot.equals(multiplePiePlot1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals4() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
        multiplePiePlot.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot.setLimit(2.315841784746324E77);
        Integer aggregatedItemsKey = 0;
        multiplePiePlot.setAggregatedItemsKey(aggregatedItemsKey);
        MultiplePiePlot multiplePiePlot1 = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        multiplePiePlot1.setDataExtractOrder(dataExtractOrder);
        multiplePiePlot1.setLimit(2.315841784746324E77);
        multiplePiePlot1.setAggregatedItemsKey(aggregatedItemsKey);
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.equals(Plot.java:1235)
            org.jfree.chart.plot.MultiplePiePlot.equals(MultiplePiePlot.java:585) */
        multiplePiePlot.equals(multiplePiePlot1);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.readObject(MultiplePiePlot.java:613) */
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiplePiePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(multiplePiePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiplePiePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(multiplePiePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiplePiePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(multiplePiePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiplePiePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(multiplePiePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.writeObject(MultiplePiePlot.java:599) */
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiplePiePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(multiplePiePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiplePiePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(multiplePiePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiplePiePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(multiplePiePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getPieChart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPieChart()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getPieChart()}
 * @utbot.returnsFrom {@code return this.pieChart;}
 *  */
    @Test
    public void testGetPieChart_ReturnThisPieChart() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        JFreeChart actual = multiplePiePlot.getPieChart();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getPieChart
    
    public void testGetPieChart_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setPieChart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPieChart(org.jfree.chart.JFreeChart)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 *  */
    @Test
    public void testSetPieChart() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            PiePlot plot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "plot", plot);
            
            JFreeChart initialMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            
            multiplePiePlot.setPieChart(jFreeChart);
            
            JFreeChart finalMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            
            assertFalse(initialMultiplePiePlotPieChart == finalMultiplePiePlotPieChart);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 *  */
    @Test
    public void testSetPieChart_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            PiePlot plot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "plot", plot);
            
            JFreeChart initialMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            
            multiplePiePlot.setPieChart(jFreeChart);
            
            JFreeChart finalMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            
            assertFalse(initialMultiplePiePlotPieChart == finalMultiplePiePlotPieChart);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 *  */
    @Test
    public void testSetPieChart_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            listenerList1[1] = ((Object) pieChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            PiePlot3D plot = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "plot", plot);
            
            JFreeChart initialMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setPieChart(jFreeChart);
            
            JFreeChart finalMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotPieChart == finalMultiplePiePlotPieChart);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 *  */
    @Test
    public void testSetPieChart_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null, null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart1 = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            PiePlot3D plot = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            setField(jFreeChart1, "org.jfree.chart.JFreeChart", "plot", plot);
            
            JFreeChart initialMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setPieChart(jFreeChart1);
            
            JFreeChart finalMultiplePiePlotPieChart = ((JFreeChart) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "pieChart"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotPieChart == finalMultiplePiePlotPieChart);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPieChart(org.jfree.chart.JFreeChart)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 * @utbot.executesCondition {@code (pieChart == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: pieChart == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_ThrowIllegalArgumentException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        multiplePiePlot.setPieChart(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 * @utbot.executesCondition {@code (pieChart == null): False}
 * @utbot.executesCondition {@code (!(pieChart.getPlot() instanceof PiePlot)): True}
 * @utbot.invokes {@link org.jfree.chart.JFreeChart#getPlot()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !(pieChart.getPlot() instanceof PiePlot)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChart_ThrowIllegalArgumentException_1() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
        
        multiplePiePlot.setPieChart(jFreeChart);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPieChart(org.jfree.chart.JFreeChart)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetPieChart_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            RingPlot plot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "plot", plot);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setPieChart] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            multiplePiePlot.setPieChart(jFreeChart);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setPieChart(org.jfree.chart.JFreeChart)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetPieChart_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList2[0] = object;
            listenerList2[4] = ((Object) class1);
            listenerList2[5] = object;
            listenerList2[6] = object;
            listenerList2[7] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            JFreeChart jFreeChart1 = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            RingPlot plot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
            setField(jFreeChart1, "org.jfree.chart.JFreeChart", "plot", plot);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setPieChart] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            multiplePiePlot.setPieChart(jFreeChart1);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setPieChart
    
    public void testSetPieChart_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getDataset()}
 * @utbot.returnsFrom {@code return this.dataset;}
 *  */
    @Test
    public void testGetDataset_ReturnThisDataset() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        CategoryDataset actual = multiplePiePlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDataset
    
    public void testGetDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setDataset
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setDataset(org.jfree.data.category.CategoryDataset)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.MultiplePiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataset(org.jfree.data.category.CategoryDataset)}
     */
    @Test
    public void testSetDataset() {
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = new DefaultMultiValueCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultMultiValueCategoryDataset.setGroup(datasetGroup);
        MultiplePiePlot multiplePiePlot = new MultiplePiePlot(defaultMultiValueCategoryDataset);
        BasicStroke basicStroke = new BasicStroke(0.0f, Integer.MAX_VALUE, 0);
        multiplePiePlot.setOutlineStroke(basicStroke);
        ThermometerPlot thermometerPlot = new ThermometerPlot(null);
        thermometerPlot.setGap(1);
        thermometerPlot.setBackgroundPaint(null);
        thermometerPlot.setRangeAxis(null);
        thermometerPlot.setUpperBound(0.0);
        thermometerPlot.setValuePaint(null);
        thermometerPlot.setMercuryPaint(null);
        thermometerPlot.setDrawingSupplier(null);
        thermometerPlot.setFollowDataInSubranges(true);
        thermometerPlot.setParent(null);
        thermometerPlot.setLowerBound(1.0);
        multiplePiePlot.setParent(thermometerPlot);
        multiplePiePlot.setLimit(1.0);
        Color color = new Color(-1, 0, 1);
        Color color1 = new Color(0, Integer.MIN_VALUE, 0);
        GradientPaint gradientPaint = new GradientPaint(-1.0f, java.lang.Float.POSITIVE_INFINITY, color, -1.0f, java.lang.Float.NaN, color1, true);
        multiplePiePlot.setOutlinePaint(gradientPaint);
        multiplePiePlot.setPieChart(null);
        multiplePiePlot.setBackgroundImage(null);
        RectangleInsets rectangleInsets = new RectangleInsets();
        multiplePiePlot.setInsets(rectangleInsets);
        multiplePiePlot.setNoDataMessage("XZ");
        multiplePiePlot.setForegroundAlpha(-1.0f);
        multiplePiePlot.setBackgroundImageAlignment(Integer.MIN_VALUE);
        DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup();
        defaultStatisticalCategoryDataset.setGroup(datasetGroup1);
        
        multiplePiePlot.setDataset(defaultStatisticalCategoryDataset);
    }
    ///endregion
    
    ///region Errors report for setDataset
    
    public void testSetDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.draw
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#draw(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.MultiplePiePlot#getInsets()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insets.trim(area);
 *  */
    @Test
    public void testDraw_ThrowNullPointerException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.draw] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.draw(MultiplePiePlot.java:353) */
        multiplePiePlot.draw(null, null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for draw
    
    public void testDraw_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getPlotType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPlotType()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getPlotType()}
 * @utbot.returnsFrom {@code return "Multiple Pie Plot";}
 *  */
    @Test
    public void testGetPlotType_ReturnMultiplePiePlot() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        String actual = multiplePiePlot.getPlotType();
        
        String expected = "Multiple Pie Plot";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getPlotType
    
    public void testGetPlotType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.dataset != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLegendItems_ThisDatasetEqualsNull() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        LegendItemCollection actual = multiplePiePlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.dataset != null): True}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_COLUMN): False}
 * @utbot.executesCondition {@code (keys != null): False}
 * @utbot.executesCondition {@code (this.limit > 0.0): False}
 * @utbot.invokes org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLegendItems_ThisDatasetNotEqualsNull() throws Exception  {
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
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultKeyedValues2DDataset dataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            multiplePiePlot.setLimit(-0.0);
            
            LegendItemCollection actual = multiplePiePlot.getLegendItems();
            
            LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
            ArrayList items = new ArrayList();
            setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
            
            // org.jfree.chart.LegendItemCollection has overridden equals method
            org.junit.Assert.assertEquals(expected, actual);
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLegendItems()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prefetchSectionPaints();
 *  */
    @Test
    public void testGetLegendItems_ThrowClassCastException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
        XYPlot plot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        setField(pieChart, "org.jfree.chart.JFreeChart", "plot", plot);
        multiplePiePlot.setPieChart(pieChart);
        DefaultKeyedValues2DDataset dataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        multiplePiePlot.setDataset(dataset);
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.getLegendItems] produces [java.lang.ClassCastException: class org.jfree.chart.plot.XYPlot cannot be cast to class org.jfree.chart.plot.PiePlot (org.jfree.chart.plot.XYPlot and org.jfree.chart.plot.PiePlot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:471)
            org.jfree.chart.plot.MultiplePiePlot.getLegendItems(MultiplePiePlot.java:516) */
        multiplePiePlot.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLegendItems()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prefetchSectionPaints();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        DefaultKeyedValues2DDataset dataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        multiplePiePlot.setDataset(dataset);
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:471)
            org.jfree.chart.plot.MultiplePiePlot.getLegendItems(MultiplePiePlot.java:516) */
        multiplePiePlot.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_COLUMN): False}
 * @utbot.executesCondition {@code (keys != null): False}
 * @utbot.executesCondition {@code (this.limit > 0.0): True}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.add(new LegendItem(this.aggregatedItemsKey.toString(), this.aggregatedItemsKey.toString(), null, null, Plot.DEFAULT_LEGEND_ITEM_CIRCLE, this.aggregatedItemsPaint, Plot.DEFAULT_OUTLINE_STROKE, this.aggregatedItemsPaint));
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException_1() throws Exception  {
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
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultKeyedValues2DDataset dataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            multiplePiePlot.setLimit(2.225073858507202E-308);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.getLegendItems] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.MultiplePiePlot.getLegendItems(MultiplePiePlot.java:541) */
            multiplePiePlot.getLegendItems();
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region Errors report for getLegendItems
    
    public void testGetLegendItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prefetchSectionPaints()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 *  */
    @Test
    public void testPrefetchSectionPaints_ThisDataExtractOrderNotEqualsTableOrderBY_ROW_1() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            TaskSeriesCollection dataset = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
            ArrayList data = new ArrayList();
            setField(dataset, "org.jfree.data.gantt.TaskSeriesCollection", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 *  */
    @Test
    public void testPrefetchSectionPaints_ThisDataExtractOrderNotEqualsTableOrderBY_ROW() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): True}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < this.dataset.getColumnCount(); c++)} once
 *  */
    @Test
    public void testPrefetchSectionPaints_ThisDataExtractOrderEqualsTableOrderBY_ROW_1() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            TaskSeriesCollection dataset = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
            ArrayList keys = new ArrayList();
            setField(dataset, "org.jfree.data.gantt.TaskSeriesCollection", "keys", keys);
            multiplePiePlot.setDataset(dataset);
            multiplePiePlot.setDataExtractOrder(byRow);
            
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): True}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < this.dataset.getColumnCount(); c++)} once
 *  */
    @Test
    public void testPrefetchSectionPaints_ThisDataExtractOrderEqualsTableOrderBY_ROW() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList columnKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            multiplePiePlot.setDataExtractOrder(byRow);
            
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prefetchSectionPaints()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: PiePlot piePlot = (PiePlot) getPieChart().getPlot();
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowClassCastException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
        CombinedDomainXYPlot plot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        setField(pieChart, "org.jfree.chart.JFreeChart", "plot", plot);
        multiplePiePlot.setPieChart(pieChart);
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.ClassCastException: class org.jfree.chart.plot.CombinedDomainXYPlot cannot be cast to class org.jfree.chart.plot.PiePlot (org.jfree.chart.plot.CombinedDomainXYPlot and org.jfree.chart.plot.PiePlot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:471) */
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
        prefetchSectionPaintsMethod.setAccessible(true);
        java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
        try {
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable key = this.dataset.getRowKey(r);
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowClassCastException_1() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            Object object = createInstance("java.lang.Object");
            rowKeys.add(object);
            rowKeys.add(null);
            rowKeys.add(null);
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
                org.jfree.data.DefaultKeyedValues2D.getRowKey(DefaultKeyedValues2D.java:168)
                org.jfree.data.category.DefaultCategoryDataset.getRowKey(DefaultCategoryDataset.java:126)
                org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:490) */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PiePlot piePlot = (PiePlot) getPieChart().getPlot();
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowNullPointerException() throws Throwable  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:471) */
        Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
        prefetchSectionPaintsMethod.setAccessible(true);
        java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
        try {
            prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < this.dataset.getRowCount(); r++)
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowNullPointerException_1() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:489) */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): True}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < this.dataset.getColumnCount(); c++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int c = 0; c < this.dataset.getColumnCount(); c++)
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowNullPointerException_2() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            multiplePiePlot.setDataExtractOrder(byRow);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:475) */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Paint p = piePlot.getSectionPaint(key);
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowNullPointerException_3() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            rowKeys.add(null);
            rowKeys.add(null);
            rowKeys.add(null);
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:491) */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): True}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < this.dataset.getColumnCount(); c++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Paint p = piePlot.getSectionPaint(key);
 *  */
    @Test
    public void testPrefetchSectionPaints_ThrowNullPointerException_4() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList columnKeys = new ArrayList();
            columnKeys.add(null);
            columnKeys.add(null);
            columnKeys.add(null);
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            multiplePiePlot.setDataExtractOrder(byRow);
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints(MultiplePiePlot.java:477) */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prefetchSectionPaints()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#prefetchSectionPaints()}
 * @utbot.executesCondition {@code (this.dataExtractOrder == TableOrder.BY_ROW): False}
 * @utbot.invokes {@link org.jfree.chart.plot.MultiplePiePlot#getPieChart()}
 * @utbot.invokes {@link org.jfree.chart.JFreeChart#getPlot()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < this.dataset.getRowCount(); r++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Paint p = piePlot.getSectionPaint(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrefetchSectionPaints_ThrowIllegalArgumentException() throws Throwable  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            JFreeChart pieChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            PiePlot plot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
            setField(plot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
            setField(pieChart, "org.jfree.chart.JFreeChart", "plot", plot);
            multiplePiePlot.setPieChart(pieChart);
            DefaultCategoryDataset dataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            rowKeys.add(null);
            rowKeys.add(null);
            rowKeys.add(null);
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(dataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            multiplePiePlot.setDataset(dataset);
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Method prefetchSectionPaintsMethod = multiplePiePlotClazz.getDeclaredMethod("prefetchSectionPaints");
            prefetchSectionPaintsMethod.setAccessible(true);
            java.lang.Object[] prefetchSectionPaintsMethodArguments = new java.lang.Object[0];
            try {
                prefetchSectionPaintsMethod.invoke(multiplePiePlot, prefetchSectionPaintsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region Errors report for prefetchSectionPaints
    
    public void testPrefetchSectionPaints_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAggregatedItemsKey()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getAggregatedItemsKey()}
 * @utbot.returnsFrom {@code return this.aggregatedItemsKey;}
 *  */
    @Test
    public void testGetAggregatedItemsKey_ReturnThisAggregatedItemsKey() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        Comparable actual = multiplePiePlot.getAggregatedItemsKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getAggregatedItemsKey
    
    public void testGetAggregatedItemsKey_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDataExtractOrder(org.jfree.chart.util.TableOrder)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 *  */
    @Test
    public void testSetDataExtractOrder() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            TableOrder initialMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            
            multiplePiePlot.setDataExtractOrder(tableOrder);
            
            TableOrder finalMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            
            assertFalse(initialMultiplePiePlotDataExtractOrder == finalMultiplePiePlotDataExtractOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 *  */
    @Test
    public void testSetDataExtractOrder_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            TableOrder initialMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setDataExtractOrder(tableOrder);
            
            TableOrder finalMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotDataExtractOrder == finalMultiplePiePlotDataExtractOrder);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 *  */
    @Test
    public void testSetDataExtractOrder_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            TableOrder initialMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setDataExtractOrder(tableOrder);
            
            TableOrder finalMultiplePiePlotDataExtractOrder = ((TableOrder) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "dataExtractOrder"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotDataExtractOrder == finalMultiplePiePlotDataExtractOrder);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDataExtractOrder(org.jfree.chart.util.TableOrder)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrder_ThrowIllegalArgumentException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        multiplePiePlot.setDataExtractOrder(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDataExtractOrder(org.jfree.chart.util.TableOrder)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetDataExtractOrder_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            multiplePiePlot.setDataExtractOrder(tableOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetDataExtractOrder_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            TableOrder dataExtractOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            multiplePiePlot.setDataExtractOrder(dataExtractOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            multiplePiePlot.setDataExtractOrder(tableOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setDataExtractOrder(org.jfree.chart.util.TableOrder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetDataExtractOrder_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[6];
            listenerList2[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList2[4] = object1;
            listenerList2[5] = object1;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            TableOrder tableOrder = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            multiplePiePlot.setDataExtractOrder(tableOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setDataExtractOrder
    
    public void testSetDataExtractOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getDataExtractOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataExtractOrder()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getDataExtractOrder()}
 * @utbot.returnsFrom {@code return this.dataExtractOrder;}
 *  */
    @Test
    public void testGetDataExtractOrder_ReturnThisDataExtractOrder() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        TableOrder actual = multiplePiePlot.getDataExtractOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDataExtractOrder
    
    public void testGetDataExtractOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAggregatedItemsPaint()
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#getAggregatedItemsPaint()}
 * @utbot.returnsFrom {@code return this.aggregatedItemsPaint;}
 *  */
    @Test
    public void testGetAggregatedItemsPaint_ReturnThisAggregatedItemsPaint() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        Paint actual = multiplePiePlot.getAggregatedItemsPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getAggregatedItemsPaint
    
    public void testGetAggregatedItemsPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAggregatedItemsKey(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsKey(java.lang.Comparable)}
 *  */
    @Test
    public void testSetAggregatedItemsKey() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            Object aggregatedItemsKey = createInstance("java.nio.DirectDoubleBufferU");
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsKeyType = Class.forName("java.lang.Comparable");
            Method setAggregatedItemsKeyMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsKey", aggregatedItemsKeyType);
            setAggregatedItemsKeyMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsKeyMethodArguments = new java.lang.Object[1];
            setAggregatedItemsKeyMethodArguments[0] = aggregatedItemsKey;
            setAggregatedItemsKeyMethod.invoke(multiplePiePlot, setAggregatedItemsKeyMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Integer integer = 0;
            
            multiplePiePlot.setAggregatedItemsKey(integer);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsKey(java.lang.Comparable)}
 *  */
    @Test
    public void testSetAggregatedItemsKey_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            Object aggregatedItemsKey = createInstance("java.nio.DirectDoubleBufferU");
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsKeyType = Class.forName("java.lang.Comparable");
            Method setAggregatedItemsKeyMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsKey", aggregatedItemsKeyType);
            setAggregatedItemsKeyMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsKeyMethodArguments = new java.lang.Object[1];
            setAggregatedItemsKeyMethodArguments[0] = aggregatedItemsKey;
            setAggregatedItemsKeyMethod.invoke(multiplePiePlot, setAggregatedItemsKeyMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Long long1 = 0L;
            
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            multiplePiePlot.setAggregatedItemsKey(long1);
            
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAggregatedItemsKey(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsKey(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKey_ThrowIllegalArgumentException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        multiplePiePlot.setAggregatedItemsKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAggregatedItemsKey(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsKey(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.MultiplePiePlot#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetAggregatedItemsKey_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Character character = '\u0000';
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            multiplePiePlot.setAggregatedItemsKey(character);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setAggregatedItemsKey
    
    public void testSetAggregatedItemsKey_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAggregatedItemsPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetAggregatedItemsPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            PrintColorUIResource aggregatedItemsPaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsPaintType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", aggregatedItemsPaintType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = aggregatedItemsPaint;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            
            java.lang.Object[] setAggregatedItemsPaintMethodArguments1 = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments1[0] = systemColor;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments1);
            
            Paint finalMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            
            assertFalse(initialMultiplePiePlotAggregatedItemsPaint == finalMultiplePiePlotAggregatedItemsPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetAggregatedItemsPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            PrintColorUIResource aggregatedItemsPaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsPaintType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", aggregatedItemsPaintType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = aggregatedItemsPaint;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            java.lang.Object[] setAggregatedItemsPaintMethodArguments1 = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments1[0] = systemColor;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments1);
            
            Paint finalMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotAggregatedItemsPaint == finalMultiplePiePlotAggregatedItemsPaint);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetAggregatedItemsPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            PrintColorUIResource aggregatedItemsPaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsPaintType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", aggregatedItemsPaintType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = aggregatedItemsPaint;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            Paint initialMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            EventListenerList multiplePiePlotListenerList = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerListListenerListListenerList, 0);
            
            java.lang.Object[] setAggregatedItemsPaintMethodArguments1 = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments1[0] = colorUIResource;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments1);
            
            Paint finalMultiplePiePlotAggregatedItemsPaint = ((Paint) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.MultiplePiePlot", "aggregatedItemsPaint"));
            EventListenerList multiplePiePlotListenerList1 = ((EventListenerList) getFieldValue(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] multiplePiePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(multiplePiePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalMultiplePiePlotListenerListListenerList0 = get(multiplePiePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialMultiplePiePlotAggregatedItemsPaint == finalMultiplePiePlotAggregatedItemsPaint);
            
            assertFalse(initialMultiplePiePlotListenerListListenerList0 == finalMultiplePiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAggregatedItemsPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaint_ThrowIllegalArgumentException() throws Exception  {
        MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        
        multiplePiePlot.setAggregatedItemsPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAggregatedItemsPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetAggregatedItemsPaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            PrintColorUIResource aggregatedItemsPaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class aggregatedItemsPaintType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", aggregatedItemsPaintType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = aggregatedItemsPaint;
            setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            java.lang.Object[] setAggregatedItemsPaintMethodArguments1 = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments1[0] = systemColor;
            try {
                setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetAggregatedItemsPaint_ThrowClassCastException_1() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            GradientPaint aggregatedItemsPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            multiplePiePlot.setAggregatedItemsPaint(aggregatedItemsPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", systemColorType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = systemColor;
            try {
                setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiplePiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.MultiplePiePlot#setAggregatedItemsPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetAggregatedItemsPaint_ThrowClassCastException_2() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            MultiplePiePlot multiplePiePlot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[6];
            listenerList2[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList2[4] = object1;
            listenerList2[5] = object1;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(multiplePiePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            Class multiplePiePlotClazz = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setAggregatedItemsPaintMethod = multiplePiePlotClazz.getDeclaredMethod("setAggregatedItemsPaint", systemColorType);
            setAggregatedItemsPaintMethod.setAccessible(true);
            java.lang.Object[] setAggregatedItemsPaintMethodArguments = new java.lang.Object[1];
            setAggregatedItemsPaintMethodArguments[0] = systemColor;
            try {
                setAggregatedItemsPaintMethod.invoke(multiplePiePlot, setAggregatedItemsPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setAggregatedItemsPaint
    
    public void testSetAggregatedItemsPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields797616661137300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields797616661137300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass797616661149500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797616661137300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797616661149500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields797616661455600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797616661455600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797616661458400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797616661455600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797616661458400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields797616661847600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797616661847600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797616661849800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797616661847600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797616661849800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

