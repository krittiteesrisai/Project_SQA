package org.jfree.chart.axis;

import org.junit.Test;
import org.jfree.chart.event.ChartChangeEventType;
import javax.swing.event.EventListenerList;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.JFreeChart;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.SystemColor;
import java.awt.Paint;
import java.lang.reflect.Method;
import java.awt.TexturePaint;
import java.awt.Color;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.UnitType;
import sun.font.AttributeValues;
import javax.swing.plaf.FontUIResource;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.RadialGradientPaint;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import java.awt.event.AWTEventListenerProxy;
import org.jfree.experimental.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.util.ObjectList;
import org.jfree.data.Range;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import java.util.List;
import org.jfree.chart.plot.SpiderWebPlot;
import java.util.ArrayList;
import org.jfree.chart.plot.MultiplePiePlot;
import java.awt.geom.Rectangle2D;
import javax.swing.plaf.ColorUIResource;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.util.RectangleEdge;
import sun.java2d.SunGraphics2D;
import sun.print.ProxyGraphics2D;
import org.jfree.experimental.chart.axis.LogAxis;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;

public final class org_jfree_chart_axis_AxisTest {
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabel()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabel()}
 * @utbot.returnsFrom {@code return this.label;}
 *  */
    @Test
    public void testGetLabel_ReturnThisLabel() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        String actual = cyclicNumberAxis.getLabel();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.isVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVisible()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#isVisible()}
 * @utbot.returnsFrom {@code return this.visible;}
 *  */
    @Test
    public void testIsVisible_ReturnThisVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        boolean actual = cyclicNumberAxis.isVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): False}
 *  */
    @Test
    public void testSetVisible_FlagEqualsThisVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setVisible(false);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetVisible_FlagNotEqualsThisVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setVisible(true);
            
            boolean finalModuloAxisVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "visible"));
            
            assertTrue(finalModuloAxisVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetVisible_FlagNotEqualsThisVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setVisible(true);
            
            boolean finalModuloAxisVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "visible"));
            
            assertTrue(finalModuloAxisVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetVisible_FlagNotEqualsThisVisible_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setVisible(true);
            
            boolean finalCyclicNumberAxisVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "visible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetVisible_FlagNotEqualsThisVisible_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setVisible(true);
            
            boolean finalCyclicNumberAxisVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "visible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetVisible_FlagNotEqualsThisVisible_4() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setVisible(true);
            
            boolean finalCyclicNumberAxisVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "visible"));
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setVisible(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetVisible_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            cyclicNumberAxis.setVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setVisible
    
    public void testSetVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelFont()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelFont()}
 * @utbot.returnsFrom {@code return this.labelFont;}
 *  */
    @Test
    public void testGetLabelFont_ReturnThisLabelFont() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Font actual = cyclicNumberAxis.getLabelFont();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLabelFont
    
    public void testGetLabelFont_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabel(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): False}
 * @utbot.executesCondition {@code (label != null): False}
 *  */
    @Test
    public void testSetLabel_LabelEqualsNull() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        moduloAxis.setLabel(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): True}
 *  */
    @Test
    public void testSetLabel_ExistingNotEqualsNull() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        String label = " ";
        cyclicNumberAxis.setLabel(label);
        
        cyclicNumberAxis.setLabel(label);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabel_ExistingNotEqualsNull_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String label = " ";
            moduloAxis.setLabel(label);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabel(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabel_ExistingNotEqualsNull_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String label = " ";
            moduloAxis.setLabel(label);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabel(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): False}
 * @utbot.executesCondition {@code (label != null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 *  */
    @Test
    public void testSetLabel_LabelNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            String string = "";
            
            moduloAxis.setLabel(string);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.executesCondition {@code (existing != null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 *  */
    @Test
    public void testSetLabel_ExistingNotEqualsNull_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String label = " ";
            moduloAxis.setLabel(label);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
            
            moduloAxis.setLabel(null);
            
            EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabel(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabel_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String label = " ";
            cyclicNumberAxis.setLabel(label);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabel] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setLabel(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabel(java.lang.String)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabel_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String label = " ";
            cyclicNumberAxis.setLabel(label);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList3[0] = object;
            listenerList3[3] = object;
            listenerList3[4] = ((Object) class1);
            listenerList3[5] = object;
            listenerList3[6] = object;
            listenerList3[7] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabel] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            cyclicNumberAxis.setLabel(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabel
    
    public void testSetLabel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelAngle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelAngle(double)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelAngle(double)}
 *  */
    @Test
    public void testSetLabelAngle() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setLabelAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabelAngle(java.lang.Double.NaN);
            
            double finalModuloAxisLabelAngle = ((Double) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelAngle"));
            
            assertEquals(java.lang.Double.NaN, finalModuloAxisLabelAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelAngle(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelAngle_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setLabelAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabelAngle(java.lang.Double.NaN);
            
            double finalModuloAxisLabelAngle = ((Double) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelAngle"));
            
            assertEquals(java.lang.Double.NaN, finalModuloAxisLabelAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelAngle(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 *  */
    @Test
    public void testSetLabelAngle_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setLabelAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            
            logarithmicAxis.setLabelAngle(java.lang.Double.NaN);
            
            double finalLogarithmicAxisLabelAngle = ((Double) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "labelAngle"));
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalLogarithmicAxisLabelAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelAngle(double)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelAngle(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelAngle_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            cyclicNumberAxis.setLabelAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelAngle] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setLabelAngle(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelAngle(double)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelAngle_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setLabelAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            listenerList3[2] = object;
            listenerList3[4] = ((Object) class1);
            listenerList3[5] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelAngle] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            logarithmicAxis.setLabelAngle(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelAngle
    
    public void testSetLabelAngle_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getAxisLineStroke
    
    ///region Errors report for getAxisLineStroke
    
    public void testGetAxisLineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelToolTip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelToolTip()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelToolTip()}
 * @utbot.returnsFrom {@code return this.labelToolTip;}
 *  */
    @Test
    public void testGetLabelToolTip_ReturnThisLabelToolTip() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        String actual = cyclicNumberAxis.getLabelToolTip();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLabelToolTip
    
    public void testGetLabelToolTip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickLabelPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            GradientPaint tickLabelPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            logarithmicAxis.setTickLabelPaint(tickLabelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialLogarithmicAxisTickLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setTickLabelPaintMethod = axisClazz.getDeclaredMethod("setTickLabelPaint", systemColorType);
            setTickLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setTickLabelPaintMethodArguments = new java.lang.Object[1];
            setTickLabelPaintMethodArguments[0] = systemColor;
            setTickLabelPaintMethod.invoke(logarithmicAxis, setTickLabelPaintMethodArguments);
            
            Paint finalLogarithmicAxisTickLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisTickLabelPaint == finalLogarithmicAxisTickLabelPaint);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickLabelPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            GradientPaint tickLabelPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            logarithmicAxis.setTickLabelPaint(tickLabelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialLogarithmicAxisTickLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList1ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setTickLabelPaintMethod = axisClazz.getDeclaredMethod("setTickLabelPaint", systemColorType);
            setTickLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setTickLabelPaintMethodArguments = new java.lang.Object[1];
            setTickLabelPaintMethodArguments[0] = systemColor;
            setTickLabelPaintMethod.invoke(logarithmicAxis, setTickLabelPaintMethodArguments);
            
            Paint finalLogarithmicAxisTickLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            EventListenerList logarithmicAxisListenerList2 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList2ListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList3 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList3ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisTickLabelPaint == finalLogarithmicAxisTickLabelPaint);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetTickLabelPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint tickLabelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setTickLabelPaint(tickLabelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialModuloAxisTickLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            
            moduloAxis.setTickLabelPaint(color);
            
            Paint finalModuloAxisTickLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            
            assertFalse(initialModuloAxisTickLabelPaint == finalModuloAxisTickLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelPaint_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            TexturePaint tickLabelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            cyclicNumberAxis.setTickLabelPaint(tickLabelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCyclicNumberAxisTickLabelPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            
            cyclicNumberAxis.setTickLabelPaint(color);
            
            Paint finalCyclicNumberAxisTickLabelPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelPaint"));
            
            assertFalse(initialCyclicNumberAxisTickLabelPaint == finalCyclicNumberAxisTickLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setTickLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelPaint_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickLabelPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelPaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint tickLabelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setTickLabelPaint(tickLabelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setTickLabelPaintMethod = axisClazz.getDeclaredMethod("setTickLabelPaint", systemColorType);
            setTickLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setTickLabelPaintMethodArguments = new java.lang.Object[1];
            setTickLabelPaintMethodArguments[0] = systemColor;
            try {
                setTickLabelPaintMethod.invoke(moduloAxis, setTickLabelPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelPaint_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setTickLabelPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickLabelPaint
    
    public void testSetTickLabelPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickLabelInsets
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetTickLabelInsets() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
        
        cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetTickLabelInsets_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        UnitType unitType = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
        setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
        setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "top", 1.6578092E-316);
        setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "left", 4.7783097267364807E-299);
        setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "bottom", 4.9E-324);
        setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "right", 1.2882297554192242E-231);
        moduloAxis.setTickLabelInsets(tickLabelInsets);
        RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", 1.6578092E-316);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 4.7783097267364807E-299);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "bottom", 4.9E-324);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 1.2882297554192242E-231);
        
        moduloAxis.setTickLabelInsets(rectangleInsets);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelInsets_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "top", 0.0);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "left", 5.495375488867176E-308);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "right", 5.739277503173974E-309);
            cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", java.lang.Double.NaN);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 5.495375488867176E-308);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 5.739277503173974E-309);
            
            RectangleInsets initialCyclicNumberAxisTickLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelInsets"));
            
            cyclicNumberAxis.setTickLabelInsets(rectangleInsets);
            
            RectangleInsets finalCyclicNumberAxisTickLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelInsets"));
            
            assertFalse(initialCyclicNumberAxisTickLabelInsets == finalCyclicNumberAxisTickLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelInsets_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "top", 3.43307249385241E157);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "left", 1.3320425034299044E-228);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "right", 3.76633032938426E-310);
            cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", -2.916467720950357E-302);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 1.3320425034299044E-228);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 3.76633032938426E-310);
            
            RectangleInsets initialCyclicNumberAxisTickLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelInsets"));
            
            cyclicNumberAxis.setTickLabelInsets(rectangleInsets);
            
            RectangleInsets finalCyclicNumberAxisTickLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelInsets"));
            
            assertFalse(initialCyclicNumberAxisTickLabelInsets == finalCyclicNumberAxisTickLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setTickLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (insets == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: insets == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelInsets_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickLabelInsets(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelInsets_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "top", java.lang.Double.NaN);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "left", -1.216879714068044E-309);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "right", 2.3484248887219877E-301);
            cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", -1.382246103270285E303);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", -1.216879714068044E-309);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 2.3484248887219877E-301);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelInsets] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setTickLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelInsets_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets tickLabelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "left", 3.6936334712324336E-306);
            setField(tickLabelInsets, "org.jfree.chart.util.RectangleInsets", "right", 32.000244140625);
            cyclicNumberAxis.setTickLabelInsets(tickLabelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[6];
            Class class1 = Object.class;
            listenerList1[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList1[4] = object1;
            listenerList1[5] = object1;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 3.6936334712324336E-306);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", -9.55669236469316E-299);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelInsets] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setTickLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.tickLabelInsets.equals(insets)
 *  */
    @Test
    public void testSetTickLabelInsets_ThrowNullPointerException() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelInsets] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.setTickLabelInsets(Axis.java:736) */
        moduloAxis.setTickLabelInsets(rectangleInsets);
    }
    ///endregion
    
    ///region Errors report for setTickLabelInsets
    
    public void testSetTickLabelInsets_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelFont(java.awt.Font)}
 *  */
    @Test
    public void testSetLabelFont() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        Font labelFont = ((Font) createInstance("java.awt.Font"));
        String name = " ";
        setField(labelFont, "java.awt.Font", "name", name);
        setField(labelFont, "java.awt.Font", "style", -255);
        setField(labelFont, "java.awt.Font", "size", -255);
        setField(labelFont, "java.awt.Font", "pointSize", 1.4E-45f);
        AttributeValues values = ((AttributeValues) createInstance("sun.font.AttributeValues"));
        setField(labelFont, "java.awt.Font", "values", values);
        moduloAxis.setLabelFont(labelFont);
        Font font = ((Font) createInstance("java.awt.Font"));
        setField(font, "java.awt.Font", "name", name);
        setField(font, "java.awt.Font", "style", -255);
        setField(font, "java.awt.Font", "size", -255);
        setField(font, "java.awt.Font", "pointSize", 1.4E-45f);
        setField(font, "java.awt.Font", "values", values);
        
        moduloAxis.setLabelFont(font);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelFont(java.awt.Font)}
 *  */
    @Test
    public void testSetLabelFont_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        Font labelFont = ((Font) createInstance("java.awt.Font"));
        String name = " ";
        setField(labelFont, "java.awt.Font", "name", name);
        setField(labelFont, "java.awt.Font", "style", -255);
        setField(labelFont, "java.awt.Font", "size", -255);
        setField(labelFont, "java.awt.Font", "pointSize", 1.4E-45f);
        moduloAxis.setLabelFont(labelFont);
        FontUIResource fontUIResource = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        setField(fontUIResource, "java.awt.Font", "name", name);
        setField(fontUIResource, "java.awt.Font", "style", -255);
        setField(fontUIResource, "java.awt.Font", "size", -255);
        setField(fontUIResource, "java.awt.Font", "pointSize", 1.4E-45f);
        
        moduloAxis.setLabelFont(fontUIResource);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (font == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: font == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setLabelFont(null);
    }
    ///endregion
    
    ///region Errors report for setLabelFont
    
    public void testSetLabelFont_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.isAxisLineVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAxisLineVisible()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#isAxisLineVisible()}
 * @utbot.returnsFrom {@code return this.axisLineVisible;}
 *  */
    @Test
    public void testIsAxisLineVisible_ReturnThisAxisLineVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        boolean actual = cyclicNumberAxis.isAxisLineVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isAxisLineVisible
    
    public void testIsAxisLineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelFont(java.awt.Font)}
 *  */
    @Test
    public void testSetTickLabelFont() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        Font tickLabelFont = ((Font) createInstance("java.awt.Font"));
        String name = " ";
        setField(tickLabelFont, "java.awt.Font", "name", name);
        setField(tickLabelFont, "java.awt.Font", "style", -255);
        setField(tickLabelFont, "java.awt.Font", "size", -255);
        setField(tickLabelFont, "java.awt.Font", "pointSize", 1.4E-45f);
        AttributeValues values = ((AttributeValues) createInstance("sun.font.AttributeValues"));
        setField(tickLabelFont, "java.awt.Font", "values", values);
        moduloAxis.setTickLabelFont(tickLabelFont);
        Font font = ((Font) createInstance("java.awt.Font"));
        setField(font, "java.awt.Font", "name", name);
        setField(font, "java.awt.Font", "style", -255);
        setField(font, "java.awt.Font", "size", -255);
        setField(font, "java.awt.Font", "pointSize", 1.4E-45f);
        setField(font, "java.awt.Font", "values", values);
        
        moduloAxis.setTickLabelFont(font);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelFont(java.awt.Font)}
 *  */
    @Test
    public void testSetTickLabelFont_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        Font tickLabelFont = ((Font) createInstance("java.awt.Font"));
        String name = " ";
        setField(tickLabelFont, "java.awt.Font", "name", name);
        setField(tickLabelFont, "java.awt.Font", "style", -255);
        setField(tickLabelFont, "java.awt.Font", "size", -255);
        setField(tickLabelFont, "java.awt.Font", "pointSize", 1.4E-45f);
        moduloAxis.setTickLabelFont(tickLabelFont);
        FontUIResource fontUIResource = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        setField(fontUIResource, "java.awt.Font", "name", name);
        setField(fontUIResource, "java.awt.Font", "style", -255);
        setField(fontUIResource, "java.awt.Font", "size", -255);
        setField(fontUIResource, "java.awt.Font", "pointSize", 1.4E-45f);
        
        moduloAxis.setTickLabelFont(fontUIResource);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setTickLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (font == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: font == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelFont_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickLabelFont(null);
    }
    ///endregion
    
    ///region Errors report for setTickLabelFont
    
    public void testSetTickLabelFont_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickLabelPaint()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickLabelPaint()}
 * @utbot.returnsFrom {@code return this.tickLabelPaint;}
 *  */
    @Test
    public void testGetTickLabelPaint_ReturnThisTickLabelPaint() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Paint actual = cyclicNumberAxis.getTickLabelPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getTickLabelPaint
    
    public void testGetTickLabelPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelPaint()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelPaint()}
 * @utbot.returnsFrom {@code return this.labelPaint;}
 *  */
    @Test
    public void testGetLabelPaint_ReturnThisLabelPaint() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Paint actual = cyclicNumberAxis.getLabelPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLabelPaint
    
    public void testGetLabelPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelInsets
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelInsets()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelInsets()}
 * @utbot.returnsFrom {@code return this.labelInsets;}
 *  */
    @Test
    public void testGetLabelInsets_ReturnThisLabelInsets() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        RectangleInsets actual = cyclicNumberAxis.getLabelInsets();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLabelInsets
    
    public void testGetLabelInsets_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setAxisLineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAxisLineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetAxisLineStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            moduloAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialModuloAxisAxisLineStroke = ((Stroke) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            
            moduloAxis.setAxisLineStroke(basicStroke);
            
            Stroke finalModuloAxisAxisLineStroke = ((Stroke) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            
            assertFalse(initialModuloAxisAxisLineStroke == finalModuloAxisAxisLineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetAxisLineStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            cyclicNumberAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            
            cyclicNumberAxis.setAxisLineStroke(basicStroke);
            
            Stroke finalCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            
            assertFalse(initialCyclicNumberAxisAxisLineStroke == finalCyclicNumberAxisAxisLineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLineStroke_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            cyclicNumberAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setAxisLineStroke(basicStroke);
            
            Stroke finalCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisAxisLineStroke == finalCyclicNumberAxisAxisLineStroke);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLineStroke_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            cyclicNumberAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setAxisLineStroke(basicStroke);
            
            Stroke finalCyclicNumberAxisAxisLineStroke = ((Stroke) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLineStroke"));
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisAxisLineStroke == finalCyclicNumberAxisAxisLineStroke);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAxisLineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLineStroke_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setAxisLineStroke(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAxisLineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLineStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            cyclicNumberAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setAxisLineStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineStroke(java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLineStroke_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            BasicStroke axisLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            cyclicNumberAxis.setAxisLineStroke(axisLineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            cyclicNumberAxis.setAxisLineStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setAxisLineStroke
    
    public void testSetAxisLineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            GradientPaint labelPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            logarithmicAxis.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialLogarithmicAxisLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = axisClazz.getDeclaredMethod("setLabelPaint", systemColorType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = systemColor;
            setLabelPaintMethod.invoke(logarithmicAxis, setLabelPaintMethodArguments);
            
            Paint finalLogarithmicAxisLabelPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisLabelPaint == finalLogarithmicAxisLabelPaint);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            RadialGradientPaint labelPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class labelPaintType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = axisClazz.getDeclaredMethod("setLabelPaint", labelPaintType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = labelPaint;
            setLabelPaintMethod.invoke(moduloAxis, setLabelPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialModuloAxisLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
            EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object moduloAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(moduloAxisListenerList1ListenerListListenerList, 1);
            EventListenerList moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList1ListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            java.lang.Object[] setLabelPaintMethodArguments1 = new java.lang.Object[1];
            setLabelPaintMethodArguments1[0] = systemColor;
            setLabelPaintMethod.invoke(moduloAxis, setLabelPaintMethodArguments1);
            
            Paint finalModuloAxisLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            EventListenerList moduloAxisListenerList2 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList2ListenerListListenerList, 0);
            EventListenerList moduloAxisListenerList3 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object moduloAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(moduloAxisListenerList3ListenerListListenerList, 1);
            EventListenerList moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList1ListenerListListenerList0 = get(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialModuloAxisLabelPaint == finalModuloAxisLabelPaint);
            
            assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
            
            assertFalse(initialModuloAxisListenerListListenerList1ListenerListListenerList0 == finalModuloAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint labelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialModuloAxisLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            
            moduloAxis.setLabelPaint(color);
            
            Paint finalModuloAxisLabelPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            
            assertFalse(initialModuloAxisLabelPaint == finalModuloAxisLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelPaint_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            TexturePaint labelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            cyclicNumberAxis.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCyclicNumberAxisLabelPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            
            cyclicNumberAxis.setLabelPaint(color);
            
            Paint finalCyclicNumberAxisLabelPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "labelPaint"));
            
            assertFalse(initialCyclicNumberAxisLabelPaint == finalCyclicNumberAxisLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setLabelPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint labelPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = axisClazz.getDeclaredMethod("setLabelPaint", systemColorType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = systemColor;
            try {
                setLabelPaintMethod.invoke(moduloAxis, setLabelPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPaint_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setLabelPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelPaint
    
    public void testSetLabelPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelToolTip
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelToolTip(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 *  */
    @Test
    public void testSetLabelToolTip() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String labelToolTip = "";
            moduloAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabelToolTip(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelToolTip_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelToolTip = "";
            cyclicNumberAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            cyclicNumberAxis.setLabelToolTip(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelToolTip_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelToolTip = "";
            cyclicNumberAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setLabelToolTip(null);
            
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelToolTip_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelToolTip = "";
            cyclicNumberAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            listenerList3[2] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setLabelToolTip(null);
            
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelToolTip(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelToolTip_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String labelToolTip = "";
            moduloAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelToolTip] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setLabelToolTip(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelToolTip(java.lang.String)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelToolTip_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String labelToolTip = "";
            moduloAxis.setLabelToolTip(labelToolTip);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[6];
            listenerList3[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList3[4] = object1;
            listenerList3[5] = object1;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelToolTip] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setLabelToolTip(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelToolTip
    
    public void testSetLabelToolTip_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setAxisLineVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAxisLineVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 *  */
    @Test
    public void testSetAxisLineVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setAxisLineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetAxisLineVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setAxisLineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLineVisible_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setAxisLineVisible(false);
            
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLineVisible_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setAxisLineVisible(false);
            
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAxisLineVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLineVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLineVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setAxisLineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLineVisible(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLineVisible_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[6];
            listenerList3[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList3[4] = object1;
            listenerList3[5] = object1;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLineVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setAxisLineVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setAxisLineVisible
    
    public void testSetAxisLineVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickLabelFont()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickLabelFont()}
 * @utbot.returnsFrom {@code return this.tickLabelFont;}
 *  */
    @Test
    public void testGetTickLabelFont_ReturnThisTickLabelFont() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Font actual = cyclicNumberAxis.getTickLabelFont();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getTickLabelFont
    
    public void testGetTickLabelFont_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelURL
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelURL()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelURL()}
 * @utbot.returnsFrom {@code return this.labelURL;}
 *  */
    @Test
    public void testGetLabelURL_ReturnThisLabelURL() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        String actual = cyclicNumberAxis.getLabelURL();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLabelURL
    
    public void testGetLabelURL_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelURL
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelURL(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 *  */
    @Test
    public void testSetLabelURL() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String labelURL = "";
            moduloAxis.setLabelURL(labelURL);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setLabelURL(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelURL_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelURL = "";
            cyclicNumberAxis.setLabelURL(labelURL);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            cyclicNumberAxis.setLabelURL(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelURL_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelURL = "";
            cyclicNumberAxis.setLabelURL(labelURL);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setLabelURL(null);
            
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelURL_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            String labelURL = "";
            cyclicNumberAxis.setLabelURL(labelURL);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setLabelURL(null);
            
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelURL(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelURL_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            String labelURL = "";
            moduloAxis.setLabelURL(labelURL);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelURL] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setLabelURL(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelURL(java.lang.String)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelURL_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList3[0] = object;
            listenerList3[4] = ((Object) class1);
            listenerList3[5] = object;
            listenerList3[6] = object;
            listenerList3[7] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelURL] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setLabelURL(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelURL
    
    public void testSetLabelURL_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickLabelInsets
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickLabelInsets()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickLabelInsets()}
 * @utbot.returnsFrom {@code return this.tickLabelInsets;}
 *  */
    @Test
    public void testGetTickLabelInsets_ReturnThisTickLabelInsets() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        RectangleInsets actual = cyclicNumberAxis.getTickLabelInsets();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getTickLabelInsets
    
    public void testGetTickLabelInsets_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setAxisLinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAxisLinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLinePaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            GradientPaint axisLinePaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            logarithmicAxis.setAxisLinePaint(axisLinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialLogarithmicAxisAxisLinePaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setAxisLinePaintMethod = axisClazz.getDeclaredMethod("setAxisLinePaint", systemColorType);
            setAxisLinePaintMethod.setAccessible(true);
            java.lang.Object[] setAxisLinePaintMethodArguments = new java.lang.Object[1];
            setAxisLinePaintMethodArguments[0] = systemColor;
            setAxisLinePaintMethod.invoke(logarithmicAxis, setAxisLinePaintMethodArguments);
            
            Paint finalLogarithmicAxisAxisLinePaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisAxisLinePaint == finalLogarithmicAxisAxisLinePaint);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetAxisLinePaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            RadialGradientPaint axisLinePaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class axisLinePaintType = Class.forName("java.awt.Paint");
            Method setAxisLinePaintMethod = axisClazz.getDeclaredMethod("setAxisLinePaint", axisLinePaintType);
            setAxisLinePaintMethod.setAccessible(true);
            java.lang.Object[] setAxisLinePaintMethodArguments = new java.lang.Object[1];
            setAxisLinePaintMethodArguments[0] = axisLinePaint;
            setAxisLinePaintMethod.invoke(moduloAxis, setAxisLinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialModuloAxisAxisLinePaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
            EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object moduloAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(moduloAxisListenerList1ListenerListListenerList, 1);
            EventListenerList moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList1ListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            java.lang.Object[] setAxisLinePaintMethodArguments1 = new java.lang.Object[1];
            setAxisLinePaintMethodArguments1[0] = systemColor;
            setAxisLinePaintMethod.invoke(moduloAxis, setAxisLinePaintMethodArguments1);
            
            Paint finalModuloAxisAxisLinePaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            EventListenerList moduloAxisListenerList2 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList2ListenerListListenerList, 0);
            EventListenerList moduloAxisListenerList3 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object moduloAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(moduloAxisListenerList3ListenerListListenerList, 1);
            EventListenerList moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList1ListenerListListenerList0 = get(moduloAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialModuloAxisAxisLinePaint == finalModuloAxisAxisLinePaint);
            
            assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
            
            assertFalse(initialModuloAxisListenerListListenerList1ListenerListListenerList0 == finalModuloAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetAxisLinePaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint axisLinePaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setAxisLinePaint(axisLinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialModuloAxisAxisLinePaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            
            moduloAxis.setAxisLinePaint(color);
            
            Paint finalModuloAxisAxisLinePaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            
            assertFalse(initialModuloAxisAxisLinePaint == finalModuloAxisAxisLinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetAxisLinePaint_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            TexturePaint axisLinePaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            cyclicNumberAxis.setAxisLinePaint(axisLinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCyclicNumberAxisAxisLinePaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            
            cyclicNumberAxis.setAxisLinePaint(color);
            
            Paint finalCyclicNumberAxisAxisLinePaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "axisLinePaint"));
            
            assertFalse(initialCyclicNumberAxisAxisLinePaint == finalCyclicNumberAxisAxisLinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAxisLinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLinePaint_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setAxisLinePaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAxisLinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLinePaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            TexturePaint axisLinePaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            moduloAxis.setAxisLinePaint(axisLinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setAxisLinePaintMethod = axisClazz.getDeclaredMethod("setAxisLinePaint", systemColorType);
            setAxisLinePaintMethod.setAccessible(true);
            java.lang.Object[] setAxisLinePaintMethodArguments = new java.lang.Object[1];
            setAxisLinePaintMethodArguments[0] = systemColor;
            try {
                setAxisLinePaintMethod.invoke(moduloAxis, setAxisLinePaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setAxisLinePaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetAxisLinePaint_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setAxisLinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.setAxisLinePaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setAxisLinePaint
    
    public void testSetAxisLinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelAngle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelAngle()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelAngle()}
 * @utbot.returnsFrom {@code return this.labelAngle;}
 *  */
    @Test
    public void testGetLabelAngle_ReturnThisLabelAngle() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setLabelAngle(0.0);
        
        double actual = cyclicNumberAxis.getLabelAngle();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getLabelAngle
    
    public void testGetLabelAngle_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getAxisLinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAxisLinePaint()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getAxisLinePaint()}
 * @utbot.returnsFrom {@code return this.axisLinePaint;}
 *  */
    @Test
    public void testGetAxisLinePaint_ReturnThisAxisLinePaint() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Paint actual = cyclicNumberAxis.getAxisLinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getAxisLinePaint
    
    public void testGetAxisLinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setLabelInsets
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetLabelInsets() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        cyclicNumberAxis.setLabelInsets(labelInsets);
        
        cyclicNumberAxis.setLabelInsets(labelInsets);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetLabelInsets_1() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "top", 6.953355807835E-310);
        setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", 3.785766996615122E-270);
        setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "bottom", 4.9E-324);
        setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "right", 4.198672575118904E-140);
        logarithmicAxis.setLabelInsets(labelInsets);
        RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", 6.953355807835E-310);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 3.785766996615122E-270);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "bottom", 4.9E-324);
        setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 4.198672575118904E-140);
        
        logarithmicAxis.setLabelInsets(rectangleInsets);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelInsets_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialCyclicNumberAxisLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            cyclicNumberAxis.setLabelInsets(rectangleInsets);
            
            RectangleInsets finalCyclicNumberAxisLabelInsets = ((RectangleInsets) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            assertFalse(initialCyclicNumberAxisLabelInsets == finalCyclicNumberAxisLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelInsets_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            UnitType unitType = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", -2.2343087841894827E-308);
            logarithmicAxis.setLabelInsets(labelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 8.033203125);
            
            RectangleInsets initialLogarithmicAxisLabelInsets = ((RectangleInsets) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            logarithmicAxis.setLabelInsets(rectangleInsets);
            
            RectangleInsets finalLogarithmicAxisLabelInsets = ((RectangleInsets) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            assertFalse(initialLogarithmicAxisLabelInsets == finalLogarithmicAxisLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelInsets_4() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            UnitType unitType = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
            moduloAxis.setLabelInsets(labelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            UnitType unitType1 = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType1);
            
            RectangleInsets initialModuloAxisLabelInsets = ((RectangleInsets) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            moduloAxis.setLabelInsets(rectangleInsets);
            
            RectangleInsets finalModuloAxisLabelInsets = ((RectangleInsets) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            assertFalse(initialModuloAxisLabelInsets == finalModuloAxisLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelInsets_5() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", java.lang.Double.NaN);
            moduloAxis.setLabelInsets(labelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 6.7903865311E-313);
            
            RectangleInsets initialModuloAxisLabelInsets = ((RectangleInsets) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            moduloAxis.setLabelInsets(rectangleInsets);
            
            RectangleInsets finalModuloAxisLabelInsets = ((RectangleInsets) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "labelInsets"));
            
            assertFalse(initialModuloAxisLabelInsets == finalModuloAxisLabelInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (insets == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: insets == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelInsets_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setLabelInsets(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setLabelInsets(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (insets == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetLabelInsets_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            UnitType unitType = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", -1.3614630756112768E39);
            cyclicNumberAxis.setLabelInsets(labelInsets);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 4.460221359061014E43);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelInsets] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            cyclicNumberAxis.setLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setLabelInsets(org.jfree.chart.util.RectangleInsets)
    
    @Test
    public void testSetLabelInsets1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "top", 8.7393506505899E-227);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", 0.0);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "bottom", -2.0625000000000004);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "right", 7.828782948846446E-295);
            cyclicNumberAxis.setLabelInsets(labelInsets);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", 8.7393506505899E-227);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", -0.0);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "bottom", 2.4488837349524463E-298);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 7.828782948846446E-295);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelInsets] produces [java.lang.NullPointerException]
                org.jfree.chart.axis.Axis.notifyListeners(Axis.java:1036)
                org.jfree.chart.axis.Axis.setLabelInsets(Axis.java:455) */
            cyclicNumberAxis.setLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    @Test
    public void testSetLabelInsets2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "top", 7.571533991467358E-270);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", 2.012758352810622);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "right", -8.664886328202056E-304);
            logarithmicAxis.setLabelInsets(labelInsets);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "top", -2.762390655431587E-135);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", 2.012758352810622);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", -8.664886328202056E-304);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelInsets] produces [java.lang.NullPointerException]
                org.jfree.chart.axis.Axis.notifyListeners(Axis.java:1036)
                org.jfree.chart.axis.Axis.setLabelInsets(Axis.java:455) */
            logarithmicAxis.setLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    @Test
    public void testSetLabelInsets3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
            RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "left", -1.4916685020835856E-154);
            setField(labelInsets, "org.jfree.chart.util.RectangleInsets", "right", -5.30498948E-315);
            numberAxis3D.setLabelInsets(labelInsets);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", -1.4916685020835856E-154);
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "right", 0.0);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setLabelInsets] produces [java.lang.NullPointerException]
                org.jfree.chart.axis.Axis.notifyListeners(Axis.java:1036)
                org.jfree.chart.axis.Axis.setLabelInsets(Axis.java:455) */
            numberAxis3D.setLabelInsets(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelInsets
    
    public void testSetLabelInsets_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getFixedDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedDimension()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getFixedDimension()}
 * @utbot.returnsFrom {@code return this.fixedDimension;}
 *  */
    @Test
    public void testGetFixedDimension_ReturnThisFixedDimension() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setFixedDimension(0.0);
        
        double actual = cyclicNumberAxis.getFixedDimension();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getFixedDimension
    
    public void testGetFixedDimension_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.addChangeListener
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addChangeListener(org.jfree.chart.event.AxisChangeListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#addChangeListener(org.jfree.chart.event.AxisChangeListener)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#add(java.lang.Class,java.util.EventListener)}
 *  */
    @Test
    public void testAddChangeListener_EventListenerListAdd() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] initialModuloAxisListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class combinedDomainXYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method addChangeListenerMethod = axisClazz.getDeclaredMethod("addChangeListener", combinedDomainXYPlotType);
        addChangeListenerMethod.setAccessible(true);
        java.lang.Object[] addChangeListenerMethodArguments = new java.lang.Object[1];
        addChangeListenerMethodArguments[0] = combinedDomainXYPlot;
        addChangeListenerMethod.invoke(moduloAxis, addChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] finalModuloAxisListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        
        assertFalse(initialModuloAxisListenerListListenerList == finalModuloAxisListenerListListenerList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChangeListener(org.jfree.chart.event.AxisChangeListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#addChangeListener(org.jfree.chart.event.AxisChangeListener)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#add(java.lang.Class,java.util.EventListener)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.listenerList.add(AxisChangeListener.class, listener);
 *  */
    @Test
    public void testAddChangeListener_ThrowNullPointerException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.addChangeListener] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:1000) */
        cyclicNumberAxis.addChangeListener(null);
    }
    ///endregion
    
    ///region Errors report for addChangeListener
    
    public void testAddChangeListener_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.hasListener
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasListener(java.util.EventListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#hasListener(java.util.EventListener)}
 * @utbot.returnsFrom {@code return list.contains(listener);}
 *  */
    @Test
    public void testHasListener_ReturnListContains() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[1];
        Object focusPropertyChangeListener = createInstance("javax.swing.JInternalFrame$FocusPropertyChangeListener");
        listenerList1[0] = focusPropertyChangeListener;
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class focusPropertyChangeListenerType = Class.forName("java.util.EventListener");
        Method hasListenerMethod = axisClazz.getDeclaredMethod("hasListener", focusPropertyChangeListenerType);
        hasListenerMethod.setAccessible(true);
        java.lang.Object[] hasListenerMethodArguments = new java.lang.Object[1];
        hasListenerMethodArguments[0] = focusPropertyChangeListener;
        boolean actual = ((Boolean) hasListenerMethod.invoke(moduloAxis, hasListenerMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#hasListener(java.util.EventListener)}
 * @utbot.returnsFrom {@code return list.contains(listener);}
 *  */
    @Test
    public void testHasListener_ReturnListContains_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[1];
        Object smartHashtable = createInstance("javax.swing.JSlider$1SmartHashtable");
        listenerList1[0] = smartHashtable;
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class smartHashtableType = Class.forName("java.util.EventListener");
        Method hasListenerMethod = axisClazz.getDeclaredMethod("hasListener", smartHashtableType);
        hasListenerMethod.setAccessible(true);
        java.lang.Object[] hasListenerMethodArguments = new java.lang.Object[1];
        hasListenerMethodArguments[0] = smartHashtable;
        boolean actual = ((Boolean) hasListenerMethod.invoke(moduloAxis, hasListenerMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#hasListener(java.util.EventListener)}
 * @utbot.returnsFrom {@code return list.contains(listener);}
 *  */
    @Test
    public void testHasListener_ReturnListContains_2() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        AWTEventListenerProxy aWTEventListenerProxy = new AWTEventListenerProxy(0L, null);
        
        boolean actual = moduloAxis.hasListener(aWTEventListenerProxy);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasListener(java.util.EventListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#hasListener(java.util.EventListener)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List list = Arrays.asList(this.listenerList.getListenerList());
 *  */
    @Test
    public void testHasListener_ThrowNullPointerException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.hasListener] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.hasListener(Axis.java:1024) */
        cyclicNumberAxis.hasListener(null);
    }
    ///endregion
    
    ///region Errors report for hasListener
    
    public void testHasListener_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.isTickMarksVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTickMarksVisible()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#isTickMarksVisible()}
 * @utbot.returnsFrom {@code return this.tickMarksVisible;}
 *  */
    @Test
    public void testIsTickMarksVisible_ReturnThisTickMarksVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        boolean actual = cyclicNumberAxis.isTickMarksVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isTickMarksVisible
    
    public void testIsTickMarksVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setPlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPlot(org.jfree.chart.plot.Plot)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot_3() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        DialPlot dialPlot = ((DialPlot) createInstance("org.jfree.experimental.chart.plot.dial.DialPlot"));
        
        Plot initialCyclicNumberAxisPlot = ((Plot) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        cyclicNumberAxis.setPlot(dialPlot);
        
        Plot finalCyclicNumberAxisPlot = ((Plot) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        assertFalse(initialCyclicNumberAxisPlot == finalCyclicNumberAxisPlot);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot_5() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        DialPlot dialPlot = ((DialPlot) createInstance("org.jfree.experimental.chart.plot.dial.DialPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(dialPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot() throws Exception  {
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        categoryAxis.setPlot(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        moduloAxis.setPlot(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot_2() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        
        cyclicNumberAxis.setPlot(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 *  */
    @Test
    public void testSetPlot_4() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        
        logarithmicAxis.setPlot(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPlot(org.jfree.chart.plot.Plot)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setPlot(org.jfree.chart.plot.Plot)}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#configure()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetPlot_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        MeterPlot plot = ((MeterPlot) createInstance("org.jfree.chart.plot.MeterPlot"));
        cyclicNumberAxis.setPlot(plot);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:109)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3071)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:430)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        cyclicNumberAxis.setPlot(categoryPlot);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPlot(org.jfree.chart.plot.Plot)
    
    @Test
    public void testSetPlot1() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.allowNegativesFlag = true;
        logarithmicAxis.autoRangeNextLogFlag = true;
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", -10.0);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        CombinedRangeXYPlot plot = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        logarithmicAxis.setPlot(plot);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    
    @Test
    public void testSetPlot2() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", 1.0E-100);
        setField(defaultAutoRange, "org.jfree.data.Range", "upper", 3.337610787760802E-308);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        logarithmicAxis.setUpperMargin(java.lang.Double.NaN);
        logarithmicAxis.setLowerMargin(java.lang.Double.NaN);
        CombinedDomainXYPlot plot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        logarithmicAxis.setPlot(plot);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    
    @Test
    public void testSetPlot3() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", 3.337610787760802E-308);
        setField(defaultAutoRange, "org.jfree.data.Range", "upper", java.lang.Double.NaN);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        logarithmicAxis.setLowerMargin(java.lang.Double.NaN);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    
    @Test
    public void testSetPlot4() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.allowNegativesFlag = true;
        logarithmicAxis.autoRangeNextLogFlag = true;
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", -28.000000000000004);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    
    @Test
    public void testSetPlot5() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.autoRangeNextLogFlag = true;
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", 3.337610787760802E-308);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        logarithmicAxis.setLowerMargin(java.lang.Double.NaN);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    
    @Test
    public void testSetPlot6() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.autoRangeNextLogFlag = true;
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", java.lang.Double.NaN);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        Plot initialLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
        
        Plot finalLogarithmicAxisPlot = ((Plot) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "plot"));
        
        List finalCombinedDomainXYPlotSubplots = ((List) getFieldValue(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots"));
        
        assertFalse(initialLogarithmicAxisPlot == finalLogarithmicAxisPlot);
        
        assertNull(finalCombinedDomainXYPlotSubplots);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPlot(org.jfree.chart.plot.Plot)
    
    @Test
    public void testSetPlot7() throws Exception  {
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        Object object1 = createInstance("java.lang.Object");
        objects[1] = object1;
        objects[2] = object1;
        objects[3] = object1;
        objects[4] = object1;
        objects[5] = object1;
        objects[6] = object1;
        objects[7] = object1;
        objects[8] = object1;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:870)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3075)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:430)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        numberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot8() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:109)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3071)
            org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange(LogarithmicAxis.java:519)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        logarithmicAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot9() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:889)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:870)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3075)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:430)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        cyclicNumberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot10() throws Exception  {
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:435)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        numberAxis.setPlot(combinedDomainXYPlot);
    }
    
    @Test
    public void testSetPlot11() throws Exception  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        numberAxis3D.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:435)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        numberAxis3D.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot12() throws Exception  {
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[0] = ((Object) numberAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(CategoryPlot.java:3137)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3073)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:430)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        numberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot13() throws Exception  {
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) numberAxis);
        objects[2] = ((Object) numberAxis);
        objects[3] = ((Object) numberAxis);
        objects[4] = ((Object) numberAxis);
        objects[5] = ((Object) numberAxis);
        objects[6] = ((Object) numberAxis);
        objects[7] = ((Object) numberAxis);
        objects[8] = ((Object) numberAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:435)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        numberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot14() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[0] = ((Object) logarithmicAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(CategoryPlot.java:3137)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3073)
            org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange(LogarithmicAxis.java:519)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        logarithmicAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot15() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange(LogarithmicAxis.java:523)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        logarithmicAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot16() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:435)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        cyclicNumberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot17() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange(LogarithmicAxis.java:523)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        logarithmicAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot18() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setAutoRange(true);
        SpiderWebPlot plot = ((SpiderWebPlot) createInstance("org.jfree.chart.plot.SpiderWebPlot"));
        cyclicNumberAxis.setPlot(plot);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[1] = object;
        objects[2] = object;
        objects[3] = object;
        objects[4] = object;
        objects[5] = object;
        objects[6] = object;
        objects[7] = object;
        objects[8] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:882)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:889)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:870)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3075)
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:430)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        cyclicNumberAxis.setPlot(categoryPlot);
    }
    
    @Test
    public void testSetPlot19() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setAutoRange(true);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        ArrayList subplots = new ArrayList();
        subplots.add(null);
        subplots.add(null);
        subplots.add(null);
        setField(combinedDomainXYPlot, "org.jfree.chart.plot.CombinedDomainXYPlot", "subplots", subplots);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.setPlot] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CombinedDomainXYPlot.getDataRange(CombinedDomainXYPlot.java:207)
            org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange(LogarithmicAxis.java:519)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:413)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:900) */
        logarithmicAxis.setPlot(combinedDomainXYPlot);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPlot(org.jfree.chart.plot.Plot)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPlot20() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.allowNegativesFlag = true;
        logarithmicAxis.autoRangeNextLogFlag = true;
        logarithmicAxis.setAutoRange(true);
        Range defaultAutoRange = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultAutoRange, "org.jfree.data.Range", "lower", 2.68156158598852E154);
        logarithmicAxis.setDefaultAutoRange(defaultAutoRange);
        logarithmicAxis.setLowerMargin(0.0);
        MultiplePiePlot plot = ((MultiplePiePlot) createInstance("org.jfree.chart.plot.MultiplePiePlot"));
        logarithmicAxis.setPlot(plot);
        CombinedDomainXYPlot combinedDomainXYPlot = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        
        logarithmicAxis.setPlot(combinedDomainXYPlot);
    }
    ///endregion
    
    ///region Errors report for setPlot
    
    public void testSetPlot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickMarkStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickMarkStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetTickMarkStroke() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        BasicStroke tickMarkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(tickMarkStroke, "java.awt.BasicStroke", "width", 2.3996981E-18f);
        setField(tickMarkStroke, "java.awt.BasicStroke", "miterlimit", -1.1777902E-38f);
        float[] dash = {0.0f};
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash", dash);
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash_phase", 9.0E-44f);
        cyclicNumberAxis.setTickMarkStroke(tickMarkStroke);
        BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(basicStroke, "java.awt.BasicStroke", "width", 2.3996981E-18f);
        setField(basicStroke, "java.awt.BasicStroke", "miterlimit", -1.1777902E-38f);
        setField(basicStroke, "java.awt.BasicStroke", "dash", dash);
        setField(basicStroke, "java.awt.BasicStroke", "dash_phase", 9.0E-44f);
        
        cyclicNumberAxis.setTickMarkStroke(basicStroke);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetTickMarkStroke_1() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        BasicStroke tickMarkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(tickMarkStroke, "java.awt.BasicStroke", "width", 2.0016212f);
        setField(tickMarkStroke, "java.awt.BasicStroke", "miterlimit", 0.0f);
        float[] dash = {};
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash", dash);
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash_phase", 9.1841E-41f);
        logarithmicAxis.setTickMarkStroke(tickMarkStroke);
        BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(basicStroke, "java.awt.BasicStroke", "width", 2.0016212f);
        setField(basicStroke, "java.awt.BasicStroke", "miterlimit", 0.0f);
        float[] dash1 = {};
        setField(basicStroke, "java.awt.BasicStroke", "dash", dash1);
        setField(basicStroke, "java.awt.BasicStroke", "dash_phase", 9.1841E-41f);
        
        logarithmicAxis.setTickMarkStroke(basicStroke);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetTickMarkStroke_2() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        BasicStroke tickMarkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(tickMarkStroke, "java.awt.BasicStroke", "width", 3.851861E-34f);
        setField(tickMarkStroke, "java.awt.BasicStroke", "miterlimit", 2.3509887E-38f);
        float[] dash = {-2.0000002f};
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash", dash);
        setField(tickMarkStroke, "java.awt.BasicStroke", "dash_phase", 4.5E-44f);
        moduloAxis.setTickMarkStroke(tickMarkStroke);
        BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(basicStroke, "java.awt.BasicStroke", "width", 3.851861E-34f);
        setField(basicStroke, "java.awt.BasicStroke", "miterlimit", 2.3509887E-38f);
        float[] dash1 = {-2.0000002f};
        setField(basicStroke, "java.awt.BasicStroke", "dash", dash1);
        setField(basicStroke, "java.awt.BasicStroke", "dash_phase", 4.5E-44f);
        
        moduloAxis.setTickMarkStroke(basicStroke);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetTickMarkStroke_3() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        BasicStroke tickMarkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(tickMarkStroke, "java.awt.BasicStroke", "width", -9.18355E-41f);
        setField(tickMarkStroke, "java.awt.BasicStroke", "miterlimit", 1.4E-45f);
        logarithmicAxis.setTickMarkStroke(tickMarkStroke);
        BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(basicStroke, "java.awt.BasicStroke", "width", -9.18355E-41f);
        setField(basicStroke, "java.awt.BasicStroke", "miterlimit", 1.4E-45f);
        
        logarithmicAxis.setTickMarkStroke(basicStroke);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setTickMarkStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkStroke_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickMarkStroke(null);
    }
    ///endregion
    
    ///region Errors report for setTickMarkStroke
    
    public void testSetTickMarkStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getPlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPlot()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getPlot()}
 * @utbot.returnsFrom {@code return this.plot;}
 *  */
    @Test
    public void testGetPlot_ReturnThisPlot() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Plot actual = cyclicNumberAxis.getPlot();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getPlot
    
    public void testGetPlot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getLabelEnclosure
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelEnclosure(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelEnclosure(java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (axisLabel != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLabelEnclosure_AxisLabelEqualsNull() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        java.awt.geom.Rectangle2D.Double actual = ((java.awt.geom.Rectangle2D.Double) moduloAxis.getLabelEnclosure(null, null));
        
        java.awt.geom.Rectangle2D.Double expected = new java.awt.geom.Rectangle2D.Double();
        
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelEnclosure(java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (axisLabel != null): True}
 * @utbot.executesCondition {@code (!axisLabel.equals("")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLabelEnclosure_AxisLabelEquals() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        String label = "";
        moduloAxis.setLabel(label);
        
        java.awt.geom.Rectangle2D.Double actual = ((java.awt.geom.Rectangle2D.Double) moduloAxis.getLabelEnclosure(null, null));
        
        java.awt.geom.Rectangle2D.Double expected = new java.awt.geom.Rectangle2D.Double();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLabelEnclosure(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getLabelEnclosure(java.awt.Graphics2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (axisLabel != null): True}
 * @utbot.executesCondition {@code (!axisLabel.equals("")): True}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#getLabel()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#getLabelFont()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FontMetrics fm = g2.getFontMetrics(getLabelFont());
 *  */
    @Test
    public void testGetLabelEnclosure_ThrowNullPointerException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        String label = " ";
        cyclicNumberAxis.setLabel(label);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.getLabelEnclosure] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.getLabelEnclosure(Axis.java:1059) */
        cyclicNumberAxis.getLabelEnclosure(null, null);
    }
    ///endregion
    
    ///region Errors report for getLabelEnclosure
    
    public void testGetLabelEnclosure_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        /* Unable to make field private static sun.awt.SunHints$Value[][] sun.awt.SunHints$Value.ValueObjects accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field private static sun.font.FontManager sun.font.FontManagerFactory.instance accessible: module
        java.desktop does not "opens sun.font" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickMarkPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickMarkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetTickMarkPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            GradientPaint tickMarkPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            logarithmicAxis.setTickMarkPaint(tickMarkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialLogarithmicAxisTickMarkPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            
            logarithmicAxis.setTickMarkPaint(color);
            
            Paint finalLogarithmicAxisTickMarkPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            
            assertFalse(initialLogarithmicAxisTickMarkPaint == finalLogarithmicAxisTickMarkPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarkPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            GradientPaint tickMarkPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            cyclicNumberAxis.setTickMarkPaint(tickMarkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCyclicNumberAxisTickMarkPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            
            cyclicNumberAxis.setTickMarkPaint(color);
            
            Paint finalCyclicNumberAxisTickMarkPaint = ((Paint) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            
            assertFalse(initialCyclicNumberAxisTickMarkPaint == finalCyclicNumberAxisTickMarkPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickMarkPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            Color tickMarkPaint = ((Color) createInstance("java.awt.Color"));
            moduloAxis.setTickMarkPaint(tickMarkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialModuloAxisTickMarkPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
            
            moduloAxis.setTickMarkPaint(color);
            
            Paint finalModuloAxisTickMarkPaint = ((Paint) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialModuloAxisTickMarkPaint == finalModuloAxisTickMarkPaint);
            
            assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickMarkPaint_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialLogarithmicAxisTickMarkPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList1ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            logarithmicAxis.setTickMarkPaint(color);
            
            Paint finalLogarithmicAxisTickMarkPaint = ((Paint) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "tickMarkPaint"));
            EventListenerList logarithmicAxisListenerList2 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList2ListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList3 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList3ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisTickMarkPaint == finalLogarithmicAxisTickMarkPaint);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setTickMarkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkPaint_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickMarkPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickMarkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkPaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            GradientPaint tickMarkPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
            moduloAxis.setTickMarkPaint(tickMarkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setTickMarkPaintMethod = axisClazz.getDeclaredMethod("setTickMarkPaint", systemColorType);
            setTickMarkPaintMethod.setAccessible(true);
            java.lang.Object[] setTickMarkPaintMethodArguments = new java.lang.Object[1];
            setTickMarkPaintMethodArguments[0] = systemColor;
            try {
                setTickMarkPaintMethod.invoke(moduloAxis, setTickMarkPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkPaint_ThrowClassCastException_1() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class colorUIResourceType = Class.forName("java.awt.Paint");
            Method setTickMarkPaintMethod = axisClazz.getDeclaredMethod("setTickMarkPaint", colorUIResourceType);
            setTickMarkPaintMethod.setAccessible(true);
            java.lang.Object[] setTickMarkPaintMethodArguments = new java.lang.Object[1];
            setTickMarkPaintMethodArguments[0] = colorUIResource;
            try {
                setTickMarkPaintMethod.invoke(logarithmicAxis, setTickMarkPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickMarkPaint
    
    public void testSetTickMarkPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.notifyListeners
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method notifyListeners(org.jfree.chart.event.AxisChangeEvent)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 *  */
    @Test
    public void testNotifyListeners() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        cyclicNumberAxis.notifyListeners(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} once
 *  */
    @Test
    public void testNotifyListeners_NotIOfListeners() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null, null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        moduloAxis.notifyListeners(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} twice
 *  */
    @Test
    public void testNotifyListeners_IOfListeners() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[4];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            WaferMapPlot waferMapPlot = ((WaferMapPlot) createInstance("org.jfree.chart.plot.WaferMapPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(waferMapPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) waferMapPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.notifyListeners(null);
            
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} twice
 *  */
    @Test
    public void testNotifyListeners_IOfListeners_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[4];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            WaferMapPlot waferMapPlot = ((WaferMapPlot) createInstance("org.jfree.chart.plot.WaferMapPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(waferMapPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) waferMapPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList logarithmicAxisListenerList = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerListListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList1 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList1ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            logarithmicAxis.notifyListeners(null);
            
            EventListenerList logarithmicAxisListenerList2 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList0 = get(logarithmicAxisListenerList2ListenerListListenerList, 0);
            EventListenerList logarithmicAxisListenerList3 = ((EventListenerList) getFieldValue(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(logarithmicAxisListenerList3ListenerListListenerList, 1);
            EventListenerList logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0 = get(logarithmicAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList0);
            
            assertFalse(initialLogarithmicAxisListenerListListenerList1ListenerListListenerList0 == finalLogarithmicAxisListenerListListenerList1ListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method notifyListeners(org.jfree.chart.event.AxisChangeEvent)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ((AxisChangeListener) listeners[i + 1]).axisChanged(event);
 *  */
    @Test
    public void testNotifyListeners_ThrowClassCastException() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList1[1] = object;
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.notifyListeners] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
        moduloAxis.notifyListeners(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} twice
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ((AxisChangeListener) listeners[i + 1]).axisChanged(event);
 *  */
    @Test
    public void testNotifyListeners_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[5] = ((Object) xYPlot);
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.notifyListeners] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            moduloAxis.notifyListeners(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object[] listeners = this.listenerList.getListenerList();
 *  */
    @Test
    public void testNotifyListeners_ThrowNullPointerException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.notifyListeners] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.notifyListeners(Axis.java:1036) */
        cyclicNumberAxis.notifyListeners(null);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#notifyListeners(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.iterates iterate the loop {@code for(int i = listeners.length - 2; i >= 0; i -= 2)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((AxisChangeListener) listeners[i + 1]).axisChanged(event);
 *  */
    @Test
    public void testNotifyListeners_ThrowNullPointerException_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.notifyListeners] produces [java.lang.NullPointerException] */
        moduloAxis.notifyListeners(null);
    }
    ///endregion
    
    ///region Errors report for notifyListeners
    
    public void testNotifyListeners_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickMarkStroke
    
    ///region Errors report for getTickMarkStroke
    
    public void testGetTickMarkStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickMarkPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickMarkPaint()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickMarkPaint()}
 * @utbot.returnsFrom {@code return this.tickMarkPaint;}
 *  */
    @Test
    public void testGetTickMarkPaint_ReturnThisTickMarkPaint() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        Paint actual = cyclicNumberAxis.getTickMarkPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getTickMarkPaint
    
    public void testGetTickMarkPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setFixedDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedDimension(double)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setFixedDimension(double)}
 *  */
    @Test
    public void testSetFixedDimension() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setFixedDimension(0.0);
        
        cyclicNumberAxis.setFixedDimension(java.lang.Double.NaN);
        
        double finalCyclicNumberAxisFixedDimension = ((Double) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "fixedDimension"));
        
        assertEquals(java.lang.Double.NaN, finalCyclicNumberAxisFixedDimension, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for setFixedDimension
    
    public void testSetFixedDimension_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.drawLabel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawLabel(java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (label == null): True}
 *  */
    @Test
    public void testDrawLabel_LabelEqualsNull() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        AxisState axisState = new AxisState();
        
        AxisState actual = moduloAxis.drawLabel(null, null, null, null, null, axisState, null);
        
        double axisStateCursor = axisState.getCursor();
        double actualCursor = actual.getCursor();
        assertEquals(axisStateCursor, actualCursor, 1.0E-6);
        
        List axisStateTicks = axisState.getTicks();
        List actualTicks = actual.getTicks();
        assertTrue(deepEquals(axisStateTicks, actualTicks));
        
        double axisStateMax = axisState.getMax();
        double actualMax = actual.getMax();
        assertEquals(axisStateMax, actualMax, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawLabel(java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (label == null): False}
 * @utbot.executesCondition {@code (label.equals("")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testDrawLabel_LabelEquals() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        String string = "";
        AxisState axisState = new AxisState();
        
        AxisState actual = moduloAxis.drawLabel(string, null, null, null, null, axisState, null);
        
        double axisStateCursor = axisState.getCursor();
        double actualCursor = actual.getCursor();
        assertEquals(axisStateCursor, actualCursor, 1.0E-6);
        
        List axisStateTicks = axisState.getTicks();
        List actualTicks = actual.getTicks();
        assertTrue(deepEquals(axisStateTicks, actualTicks));
        
        double axisStateMax = axisState.getMax();
        double actualMax = actual.getMax();
        assertEquals(axisStateMax, actualMax, 1.0E-6);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawLabel(java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (state == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: state == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawLabel_ThrowIllegalArgumentException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.drawLabel(null, null, null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawLabel(java.lang.String,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge,org.jfree.chart.axis.AxisState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (state == null): False}
 * @utbot.executesCondition {@code (label == null): False}
 * @utbot.executesCondition {@code (label.equals("")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#getLabelFont()}
 * @utbot.invokes {@link org.jfree.chart.axis.Axis#getLabelInsets()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g2.setFont(font);
 *  */
    @Test
    public void testDrawLabel_ThrowNullPointerException() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        String string = " ";
        AxisState axisState = new AxisState();
        
        /* This test fails because method [org.jfree.chart.axis.Axis.drawLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.drawLabel(Axis.java:1107) */
        moduloAxis.drawLabel(string, null, null, null, null, axisState, null);
    }
    ///endregion
    
    ///region Errors report for drawLabel
    
    public void testDrawLabel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field private static sun.awt.SunHints$Value[][] sun.awt.SunHints$Value.ValueObjects accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field protected static sun.java2d.pipe.ValidatePipe sun.java2d.SunGraphics2D.invalidpipe accessible: module
        java.desktop does not "opens sun.java2d" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.awt.Font sun.java2d.SunGraphics2D.defaultFont accessible:
        module java.desktop does not "opens sun.java2d" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static sun.font.FontManager sun.font.FontManagerFactory.instance accessible: module
        java.desktop does not "opens sun.font" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.drawAxisLine
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): True}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: axisLine = new Line2D.Double(dataArea.getX(), cursor, dataArea.getMaxX(), cursor);
 *  */
    @Test
    public void testDrawAxisLine_ThrowNullPointerException() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.drawAxisLine] produces [java.lang.NullPointerException] */
            cyclicNumberAxis.drawAxisLine(null, java.lang.Double.NaN, null, top);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): True}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: axisLine = new Line2D.Double(dataArea.getX(), cursor, dataArea.getMaxX(), cursor);
 *  */
    @Test
    public void testDrawAxisLine_ThrowNullPointerException_1() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.drawAxisLine] produces [java.lang.NullPointerException] */
            cyclicNumberAxis.drawAxisLine(null, java.lang.Double.NaN, null, bottom);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): True}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: axisLine = new Line2D.Double(cursor, dataArea.getY(), cursor, dataArea.getMaxY());
 *  */
    @Test
    public void testDrawAxisLine_ThrowNullPointerException_2() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.drawAxisLine] produces [java.lang.NullPointerException] */
            cyclicNumberAxis.drawAxisLine(null, java.lang.Double.NaN, null, left);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.RIGHT): True}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: axisLine = new Line2D.Double(cursor, dataArea.getY(), cursor, dataArea.getMaxY());
 *  */
    @Test
    public void testDrawAxisLine_ThrowNullPointerException_4() throws Exception  {
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name2);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.drawAxisLine] produces [java.lang.NullPointerException] */
            cyclicNumberAxis.drawAxisLine(null, java.lang.Double.NaN, null, right);
        } finally {
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.RIGHT): False}
 * @utbot.invokes {@link java.awt.Graphics2D#setPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g2.setPaint(this.axisLinePaint);
 *  */
    @Test
    public void testDrawAxisLine_ThrowNullPointerException_3() throws Exception  {
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name2);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            
            /* This test fails because method [org.jfree.chart.axis.Axis.drawAxisLine] produces [java.lang.NullPointerException] */
            moduloAxis.drawAxisLine(null, java.lang.Double.NaN, null, null);
        } finally {
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#drawAxisLine(java.awt.Graphics2D,double,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.RIGHT): False}
 * @utbot.invokes {@link java.awt.Graphics2D#setPaint(java.awt.Paint)}
 * @utbot.invokes {@link java.awt.Graphics2D#setStroke(java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: g2.setStroke(this.axisLineStroke);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawAxisLine_ThrowIllegalArgumentException() throws Exception  {
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name2);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            RadialGradientPaint axisLinePaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
            Class axisLinePaintType = Class.forName("java.awt.Paint");
            Method setAxisLinePaintMethod = axisClazz.getDeclaredMethod("setAxisLinePaint", axisLinePaintType);
            setAxisLinePaintMethod.setAccessible(true);
            java.lang.Object[] setAxisLinePaintMethodArguments = new java.lang.Object[1];
            setAxisLinePaintMethodArguments[0] = axisLinePaint;
            setAxisLinePaintMethod.invoke(cyclicNumberAxis, setAxisLinePaintMethodArguments);
            SunGraphics2D sunGraphics2D = ((SunGraphics2D) createInstance("sun.java2d.SunGraphics2D"));
            Class sunGraphics2DClazz = Class.forName("sun.java2d.SunGraphics2D");
            Method setPaintMethod = sunGraphics2DClazz.getDeclaredMethod("setPaint", axisLinePaintType);
            setPaintMethod.setAccessible(true);
            java.lang.Object[] setPaintMethodArguments = new java.lang.Object[1];
            setPaintMethodArguments[0] = axisLinePaint;
            setPaintMethod.invoke(sunGraphics2D, setPaintMethodArguments);
            ProxyGraphics2D proxyGraphics2D = new ProxyGraphics2D(sunGraphics2D, null);
            
            cyclicNumberAxis.drawAxisLine(proxyGraphics2D, java.lang.Double.NaN, null, null);
        } finally {
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    ///endregion
    
    ///region Errors report for drawAxisLine
    
    public void testDrawAxisLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 3 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field protected static final java.awt.Stroke sun.java2d.SunGraphics2D.defaultStroke accessible:
        module java.desktop does not "opens sun.java2d" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final double sun.java2d.SunGraphics2D.MinPenSizeAA accessible:
        module java.desktop does not "exports sun.java2d" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.isTickLabelsVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTickLabelsVisible()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#isTickLabelsVisible()}
 * @utbot.returnsFrom {@code return this.tickLabelsVisible;}
 *  */
    @Test
    public void testIsTickLabelsVisible_ReturnThisTickLabelsVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        boolean actual = cyclicNumberAxis.isTickLabelsVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isTickLabelsVisible
    
    public void testIsTickLabelsVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickLabelsVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickLabelsVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickLabelsVisible): False}
 *  */
    @Test
    public void testSetTickLabelsVisible_FlagEqualsThisTickLabelsVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickLabelsVisible(false);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickLabelsVisible): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelsVisible_FlagNotEqualsThisTickLabelsVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickLabelsVisible(true);
            
            boolean finalModuloAxisTickLabelsVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
            
            assertTrue(finalModuloAxisTickLabelsVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickLabelsVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelsVisible_FlagNotEqualsThisTickLabelsVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickLabelsVisible(true);
            
            boolean finalModuloAxisTickLabelsVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
            
            assertTrue(finalModuloAxisTickLabelsVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickLabelsVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelsVisible_FlagNotEqualsThisTickLabelsVisible_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickLabelsVisible(true);
            
            boolean finalCyclicNumberAxisTickLabelsVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisTickLabelsVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickLabelsVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickLabelsVisible_FlagNotEqualsThisTickLabelsVisible_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickLabelsVisible(true);
            
            boolean finalCyclicNumberAxisTickLabelsVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisTickLabelsVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickLabelsVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelsVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelsVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setTickLabelsVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickLabelsVisible(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickLabelsVisible_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickLabelsVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            cyclicNumberAxis.setTickLabelsVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickLabelsVisible
    
    public void testSetTickLabelsVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickMarksVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickMarksVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagEqualsThisTickMarksVisible() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        cyclicNumberAxis.setTickMarksVisible(false);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagNotEqualsThisTickMarksVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarksVisible(true);
            
            boolean finalModuloAxisTickMarksVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
            
            assertTrue(finalModuloAxisTickMarksVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagNotEqualsThisTickMarksVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarksVisible(true);
            
            boolean finalModuloAxisTickMarksVisible = ((Boolean) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
            
            assertTrue(finalModuloAxisTickMarksVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagNotEqualsThisTickMarksVisible_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarksVisible(true);
            
            boolean finalCyclicNumberAxisTickMarksVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisTickMarksVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagNotEqualsThisTickMarksVisible_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null, null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarksVisible(true);
            
            boolean finalCyclicNumberAxisTickMarksVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisTickMarksVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.executesCondition {@code (flag != this.tickMarksVisible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarksVisible_FlagNotEqualsThisTickMarksVisible_4() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarksVisible(true);
            
            boolean finalCyclicNumberAxisTickMarksVisible = ((Boolean) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
            
            assertTrue(finalCyclicNumberAxisTickMarksVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickMarksVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarksVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarksVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            moduloAxis.setTickMarksVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarksVisible(boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarksVisible_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarksVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            cyclicNumberAxis.setTickMarksVisible(true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickMarksVisible
    
    public void testSetTickMarksVisible_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickMarkOutsideLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickMarkOutsideLength()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickMarkOutsideLength()}
 * @utbot.returnsFrom {@code return this.tickMarkOutsideLength;}
 *  */
    @Test
    public void testGetTickMarkOutsideLength_ReturnThisTickMarkOutsideLength() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setTickMarkOutsideLength(0.0f);
        
        float actual = cyclicNumberAxis.getTickMarkOutsideLength();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region Errors report for getTickMarkOutsideLength
    
    public void testGetTickMarkOutsideLength_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickMarkInsideLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickMarkInsideLength(float)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 *  */
    @Test
    public void testSetTickMarkInsideLength() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarkInsideLength(java.lang.Float.NaN);
            
            float finalModuloAxisTickMarkInsideLength = ((Float) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkInsideLength"));
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalModuloAxisTickMarkInsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarkInsideLength_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarkInsideLength(java.lang.Float.NaN);
            
            float finalModuloAxisTickMarkInsideLength = ((Float) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkInsideLength"));
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalModuloAxisTickMarkInsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickMarkInsideLength_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            cyclicNumberAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarkInsideLength(java.lang.Float.NaN);
            
            float finalCyclicNumberAxisTickMarkInsideLength = ((Float) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarkInsideLength"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalCyclicNumberAxisTickMarkInsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetTickMarkInsideLength_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            cyclicNumberAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarkInsideLength(java.lang.Float.NaN);
            
            float finalCyclicNumberAxisTickMarkInsideLength = ((Float) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarkInsideLength"));
            EventListenerList cyclicNumberAxisListenerList2 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList2ListenerListListenerList, 0);
            EventListenerList cyclicNumberAxisListenerList3 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1 = get(cyclicNumberAxisListenerList3ListenerListListenerList, 1);
            EventListenerList cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 = get(cyclicNumberAxisListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList1ListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList1ListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalCyclicNumberAxisTickMarkInsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickMarkInsideLength(float)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkInsideLength_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkInsideLength] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            logarithmicAxis.setTickMarkInsideLength(java.lang.Float.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkInsideLength(float)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkInsideLength_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setTickMarkInsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[6];
            listenerList3[2] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList3[3] = object;
            Object object1 = createInstance("java.lang.Object");
            listenerList3[4] = object1;
            listenerList3[5] = object1;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkInsideLength] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            logarithmicAxis.setTickMarkInsideLength(java.lang.Float.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickMarkInsideLength
    
    public void testSetTickMarkInsideLength_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.getTickMarkInsideLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTickMarkInsideLength()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#getTickMarkInsideLength()}
 * @utbot.returnsFrom {@code return this.tickMarkInsideLength;}
 *  */
    @Test
    public void testGetTickMarkInsideLength_ReturnThisTickMarkInsideLength() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        cyclicNumberAxis.setTickMarkInsideLength(0.0f);
        
        float actual = cyclicNumberAxis.getTickMarkInsideLength();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region Errors report for getTickMarkInsideLength
    
    public void testGetTickMarkInsideLength_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.removeChangeListener
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeChangeListener(org.jfree.chart.event.AxisChangeListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 *  */
    @Test
    public void testRemoveChangeListener() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Integer integer = 0;
        listenerList1[1] = ((Object) integer);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class xYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method removeChangeListenerMethod = axisClazz.getDeclaredMethod("removeChangeListener", xYPlotType);
        removeChangeListenerMethod.setAccessible(true);
        java.lang.Object[] removeChangeListenerMethodArguments = new java.lang.Object[1];
        removeChangeListenerMethodArguments[0] = xYPlot;
        removeChangeListenerMethod.invoke(moduloAxis, removeChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
        
        assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 *  */
    @Test
    public void testRemoveChangeListener_1() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Character character = '\u0000';
        listenerList1[1] = ((Object) character);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class xYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method removeChangeListenerMethod = axisClazz.getDeclaredMethod("removeChangeListener", xYPlotType);
        removeChangeListenerMethod.setAccessible(true);
        java.lang.Object[] removeChangeListenerMethodArguments = new java.lang.Object[1];
        removeChangeListenerMethodArguments[0] = xYPlot;
        removeChangeListenerMethod.invoke(moduloAxis, removeChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
        
        assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 *  */
    @Test
    public void testRemoveChangeListener_2() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Long long1 = 0L;
        listenerList1[1] = ((Object) long1);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class xYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method removeChangeListenerMethod = axisClazz.getDeclaredMethod("removeChangeListener", xYPlotType);
        removeChangeListenerMethod.setAccessible(true);
        java.lang.Object[] removeChangeListenerMethodArguments = new java.lang.Object[1];
        removeChangeListenerMethodArguments[0] = xYPlot;
        removeChangeListenerMethod.invoke(moduloAxis, removeChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
        
        assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 *  */
    @Test
    public void testRemoveChangeListener_3() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Double double1 = 0.0;
        listenerList1[1] = ((Object) double1);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class xYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method removeChangeListenerMethod = axisClazz.getDeclaredMethod("removeChangeListener", xYPlotType);
        removeChangeListenerMethod.setAccessible(true);
        java.lang.Object[] removeChangeListenerMethodArguments = new java.lang.Object[1];
        removeChangeListenerMethodArguments[0] = xYPlot;
        removeChangeListenerMethod.invoke(moduloAxis, removeChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
        
        assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 *  */
    @Test
    public void testRemoveChangeListener_4() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        ArrayList arrayList = new ArrayList();
        listenerList1[1] = ((Object) arrayList);
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        
        EventListenerList moduloAxisListenerList = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
        Object initialModuloAxisListenerListListenerList0 = get(moduloAxisListenerListListenerListListenerList, 0);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class xYPlotType = Class.forName("org.jfree.chart.event.AxisChangeListener");
        Method removeChangeListenerMethod = axisClazz.getDeclaredMethod("removeChangeListener", xYPlotType);
        removeChangeListenerMethod.setAccessible(true);
        java.lang.Object[] removeChangeListenerMethodArguments = new java.lang.Object[1];
        removeChangeListenerMethodArguments[0] = xYPlot;
        removeChangeListenerMethod.invoke(moduloAxis, removeChangeListenerMethodArguments);
        
        EventListenerList moduloAxisListenerList1 = ((EventListenerList) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList"));
        java.lang.Object[] moduloAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(moduloAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
        Object finalModuloAxisListenerListListenerList0 = get(moduloAxisListenerList1ListenerListListenerList, 0);
        
        assertFalse(initialModuloAxisListenerListListenerList0 == finalModuloAxisListenerListListenerList0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeChangeListener(org.jfree.chart.event.AxisChangeListener)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#removeChangeListener(org.jfree.chart.event.AxisChangeListener)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#remove(java.lang.Class,java.util.EventListener)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.listenerList.remove(AxisChangeListener.class, listener);
 *  */
    @Test
    public void testRemoveChangeListener_ThrowNullPointerException() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.removeChangeListener] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.removeChangeListener(Axis.java:1011) */
        cyclicNumberAxis.removeChangeListener(null);
    }
    ///endregion
    
    ///region Errors report for removeChangeListener
    
    public void testRemoveChangeListener_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.setTickMarkOutsideLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTickMarkOutsideLength(float)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkOutsideLength(float)}
 *  */
    @Test
    public void testSetTickMarkOutsideLength() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setTickMarkOutsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
            
            float finalModuloAxisTickMarkOutsideLength = ((Float) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkOutsideLength"));
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalModuloAxisTickMarkOutsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkOutsideLength(float)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetTickMarkOutsideLength_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
            moduloAxis.setTickMarkOutsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(moduloAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            moduloAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
            
            float finalModuloAxisTickMarkOutsideLength = ((Float) getFieldValue(moduloAxis, "org.jfree.chart.axis.Axis", "tickMarkOutsideLength"));
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalModuloAxisTickMarkOutsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkOutsideLength(float)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 *  */
    @Test
    public void testSetTickMarkOutsideLength_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
            cyclicNumberAxis.setTickMarkOutsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = {null};
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            EventListenerList cyclicNumberAxisListenerList = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerListListenerListListenerList, 0);
            
            cyclicNumberAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
            
            float finalCyclicNumberAxisTickMarkOutsideLength = ((Float) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "tickMarkOutsideLength"));
            EventListenerList cyclicNumberAxisListenerList1 = ((EventListenerList) getFieldValue(cyclicNumberAxis, "org.jfree.chart.axis.Axis", "listenerList"));
            java.lang.Object[] cyclicNumberAxisListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(cyclicNumberAxisListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCyclicNumberAxisListenerListListenerList0 = get(cyclicNumberAxisListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCyclicNumberAxisListenerListListenerList0 == finalCyclicNumberAxisListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Float.NaN, finalCyclicNumberAxisTickMarkOutsideLength, 1.0E-6f);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setTickMarkOutsideLength(float)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkOutsideLength(float)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkOutsideLength_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setTickMarkOutsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkOutsideLength] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.AxisChangeListener] */
            logarithmicAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#setTickMarkOutsideLength(float)}
 * @utbot.invokes {@link org.jfree.chart.event.AxisChangeListener#axisChanged(org.jfree.chart.event.AxisChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new AxisChangeEvent(this));
 *  */
    @Test
    public void testSetTickMarkOutsideLength_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
            logarithmicAxis.setTickMarkOutsideLength(0.0f);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList3[1] = object;
            listenerList3[2] = object;
            listenerList3[4] = ((Object) class1);
            listenerList3[5] = object;
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(logarithmicAxis, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.axis.Axis.setTickMarkOutsideLength] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            logarithmicAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setTickMarkOutsideLength
    
    public void testSetTickMarkOutsideLength_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.experimental.chart.axis.LogAxis"));
        
        boolean actual = logAxis.equals(logAxis);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): True}
 *  */
    @Test
    public void testEquals_ThisVisibleNotEqualsThatVisible() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        logarithmicAxis.setVisible(true);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        boolean actual = logarithmicAxis.equals(categoryAxis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 *  */
    @Test
    public void testEquals_ThisVisibleEqualsThatVisible() throws Exception  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        Font labelFont = ((Font) createInstance("java.awt.Font"));
        setField(labelFont, "java.awt.Font", "size", -1);
        numberAxis3D.setLabelFont(labelFont);
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        FontUIResource labelFont1 = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        moduloAxis.setLabelFont(labelFont1);
        
        boolean actual = numberAxis3D.equals(moduloAxis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 *  */
    @Test
    public void testEquals_ThisVisibleEqualsThatVisible_1() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        String label = "";
        logarithmicAxis.setLabel(label);
        Font labelFont = ((Font) createInstance("java.awt.Font"));
        String name = " ";
        setField(labelFont, "java.awt.Font", "name", name);
        setField(labelFont, "java.awt.Font", "style", -255);
        setField(labelFont, "java.awt.Font", "size", -255);
        setField(labelFont, "java.awt.Font", "pointSize", 2.5251734E-29f);
        logarithmicAxis.setLabelFont(labelFont);
        DateAxis dateAxis = ((DateAxis) createInstance("org.jfree.chart.axis.DateAxis"));
        dateAxis.setLabel(label);
        Font labelFont1 = ((Font) createInstance("java.awt.Font"));
        setField(labelFont1, "java.awt.Font", "style", -255);
        setField(labelFont1, "java.awt.Font", "size", -255);
        setField(labelFont1, "java.awt.Font", "pointSize", 2.5251734E-29f);
        dateAxis.setLabelFont(labelFont1);
        
        boolean actual = logarithmicAxis.equals(dateAxis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 *  */
    @Test
    public void testEquals_ThisVisibleEqualsThatVisible_2() throws Exception  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        Color labelPaint = ((Color) createInstance("java.awt.Color"));
        logarithmicAxis.setLabelPaint(labelPaint);
        ExtendedCategoryAxis extendedCategoryAxis = ((ExtendedCategoryAxis) createInstance("org.jfree.chart.axis.ExtendedCategoryAxis"));
        SystemColor labelPaint1 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(labelPaint1, "java.awt.Color", "value", -1);
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class labelPaint1Type = Class.forName("java.awt.Paint");
        Method setLabelPaintMethod = axisClazz.getDeclaredMethod("setLabelPaint", labelPaint1Type);
        setLabelPaintMethod.setAccessible(true);
        java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
        setLabelPaintMethodArguments[0] = labelPaint1;
        setLabelPaintMethod.invoke(extendedCategoryAxis, setLabelPaintMethodArguments);
        
        boolean actual = logarithmicAxis.equals(extendedCategoryAxis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 *  */
    @Test
    public void testEquals_ThisVisibleEqualsThatVisible_3() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        FontUIResource labelFont = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        String name = "@";
        setField(labelFont, "java.awt.Font", "name", name);
        setField(labelFont, "java.awt.Font", "style", -255);
        setField(labelFont, "java.awt.Font", "size", -255);
        setField(labelFont, "java.awt.Font", "pointSize", -5.240589E-34f);
        AttributeValues values = ((AttributeValues) createInstance("sun.font.AttributeValues"));
        setField(values, "sun.font.AttributeValues", "defined", -1);
        setField(labelFont, "java.awt.Font", "values", values);
        moduloAxis.setLabelFont(labelFont);
        ModuloAxis moduloAxis1 = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        FontUIResource labelFont1 = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        setField(labelFont1, "java.awt.Font", "name", name);
        setField(labelFont1, "java.awt.Font", "style", -255);
        setField(labelFont1, "java.awt.Font", "size", -255);
        setField(labelFont1, "java.awt.Font", "pointSize", -5.240589E-34f);
        AttributeValues values1 = ((AttributeValues) createInstance("sun.font.AttributeValues"));
        setField(labelFont1, "java.awt.Font", "values", values1);
        moduloAxis1.setLabelFont(labelFont1);
        
        boolean actual = moduloAxis.equals(moduloAxis1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 *  */
    @Test
    public void testEquals_ThisVisibleEqualsThatVisible_4() throws Exception  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        GradientPaint labelPaint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        Color color1 = ((Color) createInstance("java.awt.Color"));
        setField(labelPaint, "java.awt.GradientPaint", "color1", color1);
        numberAxis3D.setLabelPaint(labelPaint);
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        GradientPaint labelPaint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        logarithmicAxis.setLabelPaint(labelPaint1);
        
        boolean actual = numberAxis3D.equals(logarithmicAxis);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof Axis)): False}
 * @utbot.executesCondition {@code (this.visible != that.visible): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        String label = "";
        logarithmicAxis.setLabel(label);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.equals] produces [java.lang.NullPointerException] */
        moduloAxis.equals(logarithmicAxis);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        CategoryAxis3D categoryAxis3D = ((CategoryAxis3D) createInstance("org.jfree.chart.axis.CategoryAxis3D"));
        RectangleInsets labelInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        categoryAxis3D.setLabelInsets(labelInsets);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        boolean actual = categoryAxis3D.equals(categoryAxis);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        CategoryAxis3D categoryAxis3D = ((CategoryAxis3D) createInstance("org.jfree.chart.axis.CategoryAxis3D"));
        categoryAxis3D.setLabelAngle(9.391334259752742E-251);
        String labelToolTip = "";
        categoryAxis3D.setLabelToolTip(labelToolTip);
        ExtendedCategoryAxis extendedCategoryAxis = ((ExtendedCategoryAxis) createInstance("org.jfree.chart.axis.ExtendedCategoryAxis"));
        extendedCategoryAxis.setLabelAngle(9.391334259752742E-251);
        
        boolean actual = categoryAxis3D.equals(extendedCategoryAxis);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.experimental.chart.axis.LogAxis"));
        logAxis.setLabelAngle(1.3939048509212154E-231);
        String labelURL = "";
        logAxis.setLabelURL(labelURL);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        categoryAxis.setLabelAngle(1.3939048509212154E-231);
        
        boolean actual = logAxis.equals(categoryAxis);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals4() throws Exception  {
        CategoryAxis3D categoryAxis3D = ((CategoryAxis3D) createInstance("org.jfree.chart.axis.CategoryAxis3D"));
        String label = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        categoryAxis3D.setLabel(label);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        String label1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        categoryAxis.setLabel(label1);
        
        /* This test fails because method [org.jfree.chart.axis.Axis.equals] produces [java.lang.NullPointerException] */
        categoryAxis3D.equals(categoryAxis);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        CyclicNumberAxis actual = ((CyclicNumberAxis) cyclicNumberAxis.clone());
        
        CyclicNumberAxis expected = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        BasicStroke defaultAdvanceLineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(expected, "org.jfree.chart.axis.CyclicNumberAxis", "DEFAULT_ADVANCE_LINE_STROKE", defaultAdvanceLineStroke);
        expected.offset = 0.0;
        expected.period = 0.0;
        expected.setAutoRangeMinimumSize(0.0);
        expected.setUpperMargin(0.0);
        expected.setLowerMargin(0.0);
        expected.setFixedAutoRange(0.0);
        expected.setLabelAngle(0.0);
        expected.setTickMarkInsideLength(0.0f);
        expected.setTickMarkOutsideLength(0.0f);
        expected.setFixedDimension(0.0);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.chart.axis.Axis", "listenerList", listenerList);
        
        // org.jfree.chart.axis.CyclicNumberAxis has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for clone
    
    public void testClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.readObject(Axis.java:1362) */
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = axisClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(logarithmicAxis, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = axisClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(numberAxis3D, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = axisClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(numberAxis3D, readObjectMethodArguments);
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
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.axis.Axis.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        
        /* This test fails because method [org.jfree.chart.axis.Axis.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.writeObject(Axis.java:1343) */
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = axisClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(logarithmicAxis, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = axisClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(numberAxis3D, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Axis}
 * @utbot.methodUnderTest {@link org.jfree.chart.axis.Axis#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class axisClazz = Class.forName("org.jfree.chart.axis.Axis");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = axisClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(numberAxis3D, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields800559837769100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields800559837769100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass800559837773900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800559837769100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800559837773900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800559838149600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800559838149600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800559838151200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800559838149600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800559838151200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800559839176300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800559839176300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800559839178000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800559839176300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800559839178000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

