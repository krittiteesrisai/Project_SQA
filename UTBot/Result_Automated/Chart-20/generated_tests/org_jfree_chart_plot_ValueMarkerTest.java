package org.jfree.chart.plot;

import org.junit.Test;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.BasicStroke;
import java.awt.geom.Point2D;
import javax.swing.plaf.ColorUIResource;
import org.jfree.chart.event.ChartChangeEventType;
import javax.swing.event.EventListenerList;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.event.MarkerChangeEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class org_jfree_chart_plot_ValueMarkerTest {
    ///region Test suites for executable org.jfree.chart.plot.ValueMarker.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        
        boolean actual = valueMarker.equals(valueMarker);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        
        boolean actual = valueMarker.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_1() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        GradientPaint paint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        Color color1 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color1", color1);
        valueMarker.setPaint(paint);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        GradientPaint paint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        SystemColor color11 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(color11, "java.awt.Color", "value", -1);
        setField(paint1, "java.awt.GradientPaint", "color1", color11);
        categoryMarker.setPaint(paint1);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_2() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        GradientPaint paint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        Color color1 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color1", color1);
        valueMarker.setPaint(paint);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        GradientPaint paint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        categoryMarker.setPaint(paint1);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_3() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        BasicStroke stroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke, "java.awt.BasicStroke", "width", 0.0f);
        setField(stroke, "java.awt.BasicStroke", "cap", -1);
        valueMarker.setStroke(stroke);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        BasicStroke stroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke1, "java.awt.BasicStroke", "width", 0.0f);
        categoryMarker.setStroke(stroke1);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_4() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        GradientPaint paint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        Color color1 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color1", color1);
        Color color2 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color2", color2);
        valueMarker.setPaint(paint);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        GradientPaint paint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        SystemColor color11 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(paint1, "java.awt.GradientPaint", "color1", color11);
        categoryMarker.setPaint(paint1);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_5() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        BasicStroke stroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke, "java.awt.BasicStroke", "width", 7.34695E-40f);
        setField(stroke, "java.awt.BasicStroke", "miterlimit", -1.17549435E-38f);
        float[] dash = {-2.0000002f, 0.0f};
        setField(stroke, "java.awt.BasicStroke", "dash", dash);
        setField(stroke, "java.awt.BasicStroke", "dash_phase", 0.0f);
        valueMarker.setStroke(stroke);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        BasicStroke stroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke1, "java.awt.BasicStroke", "width", 7.34695E-40f);
        setField(stroke1, "java.awt.BasicStroke", "miterlimit", -1.17549435E-38f);
        float[] dash1 = {0.0f, 0.0f};
        setField(stroke1, "java.awt.BasicStroke", "dash", dash1);
        setField(stroke1, "java.awt.BasicStroke", "dash_phase", 0.0f);
        intervalMarker.setStroke(stroke1);
        
        boolean actual = valueMarker.equals(intervalMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_6() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        BasicStroke stroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke, "java.awt.BasicStroke", "width", -9.403964E-38f);
        setField(stroke, "java.awt.BasicStroke", "miterlimit", 2.000122f);
        float[] dash = {-2.0000002f};
        setField(stroke, "java.awt.BasicStroke", "dash", dash);
        setField(stroke, "java.awt.BasicStroke", "dash_phase", 0.0f);
        valueMarker.setStroke(stroke);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        BasicStroke stroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke1, "java.awt.BasicStroke", "width", -9.403964E-38f);
        setField(stroke1, "java.awt.BasicStroke", "miterlimit", 2.000122f);
        float[] dash1 = {java.lang.Float.NaN};
        setField(stroke1, "java.awt.BasicStroke", "dash", dash1);
        setField(stroke1, "java.awt.BasicStroke", "dash_phase", 0.0f);
        intervalMarker.setStroke(stroke1);
        
        boolean actual = valueMarker.equals(intervalMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_7() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        BasicStroke stroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke, "java.awt.BasicStroke", "width", -2.1503916f);
        setField(stroke, "java.awt.BasicStroke", "miterlimit", 1.182382E-38f);
        float[] dash = {java.lang.Float.NaN, 0.0f};
        setField(stroke, "java.awt.BasicStroke", "dash", dash);
        setField(stroke, "java.awt.BasicStroke", "dash_phase", -2.396153E-39f);
        valueMarker.setStroke(stroke);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        BasicStroke stroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke1, "java.awt.BasicStroke", "width", -2.1503916f);
        setField(stroke1, "java.awt.BasicStroke", "miterlimit", 1.182382E-38f);
        float[] dash1 = {-2.0000002f, 0.0f};
        setField(stroke1, "java.awt.BasicStroke", "dash", dash1);
        setField(stroke1, "java.awt.BasicStroke", "dash_phase", -2.396153E-39f);
        intervalMarker.setStroke(stroke1);
        
        boolean actual = valueMarker.equals(intervalMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_8() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        GradientPaint paint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        java.awt.geom.Point2D.Float p1 = ((java.awt.geom.Point2D.Float) createInstance("java.awt.geom.Point2D$Float"));
        p1.x = 1.250001f;
        p1.y = 0.0f;
        setField(paint, "java.awt.GradientPaint", "p1", p1);
        ColorUIResource color1 = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
        setField(paint, "java.awt.GradientPaint", "color1", color1);
        SystemColor color2 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(paint, "java.awt.GradientPaint", "color2", color2);
        valueMarker.setPaint(paint);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        GradientPaint paint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        java.awt.geom.Point2D.Float p11 = ((java.awt.geom.Point2D.Float) createInstance("java.awt.geom.Point2D$Float"));
        p11.x = 2.0007496f;
        p11.y = 0.0f;
        setField(paint1, "java.awt.GradientPaint", "p1", p11);
        SystemColor color11 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(paint1, "java.awt.GradientPaint", "color1", color11);
        SystemColor color21 = ((SystemColor) createInstance("java.awt.SystemColor"));
        setField(paint1, "java.awt.GradientPaint", "color2", color21);
        categoryMarker.setPaint(paint1);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_9() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        GradientPaint paint = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        java.awt.geom.Point2D.Float p1 = ((java.awt.geom.Point2D.Float) createInstance("java.awt.geom.Point2D$Float"));
        p1.x = -2.000002f;
        p1.y = 1.0039062f;
        setField(paint, "java.awt.GradientPaint", "p1", p1);
        Color color1 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color1", color1);
        Color color2 = ((Color) createInstance("java.awt.Color"));
        setField(paint, "java.awt.GradientPaint", "color2", color2);
        valueMarker.setPaint(paint);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        GradientPaint paint1 = ((GradientPaint) createInstance("java.awt.GradientPaint"));
        java.awt.geom.Point2D.Float p11 = ((java.awt.geom.Point2D.Float) createInstance("java.awt.geom.Point2D$Float"));
        p11.x = -2.000002f;
        p11.y = 5.421383E-20f;
        setField(paint1, "java.awt.GradientPaint", "p1", p11);
        ColorUIResource color11 = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
        setField(paint1, "java.awt.GradientPaint", "color1", color11);
        Color color21 = ((Color) createInstance("java.awt.Color"));
        setField(paint1, "java.awt.GradientPaint", "color2", color21);
        intervalMarker.setPaint(paint1);
        
        boolean actual = valueMarker.equals(intervalMarker);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 *  */
    @Test
    public void testEquals_NotObj_10() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        BasicStroke stroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke, "java.awt.BasicStroke", "width", 1.5046328E-36f);
        setField(stroke, "java.awt.BasicStroke", "miterlimit", -1.17549435E-38f);
        float[] dash = {0.0f};
        setField(stroke, "java.awt.BasicStroke", "dash", dash);
        setField(stroke, "java.awt.BasicStroke", "dash_phase", 0.0f);
        valueMarker.setStroke(stroke);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        BasicStroke stroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        setField(stroke1, "java.awt.BasicStroke", "width", 1.5046328E-36f);
        setField(stroke1, "java.awt.BasicStroke", "miterlimit", -1.17549435E-38f);
        setField(stroke1, "java.awt.BasicStroke", "dash_phase", 0.0f);
        intervalMarker.setStroke(stroke1);
        
        boolean actual = valueMarker.equals(intervalMarker);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker.setAlpha(-1.1757813E-38f);
        String label = "";
        valueMarker.setLabel(label);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        categoryMarker.setAlpha(-1.1757813E-38f);
        
        boolean actual = valueMarker.equals(categoryMarker);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals2() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker.setAlpha(5.877472E-39f);
        ValueMarker valueMarker1 = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker1.setAlpha(5.877472E-39f);
        
        /* This test fails because method [org.jfree.chart.plot.ValueMarker.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Marker.equals(Marker.java:631)
            org.jfree.chart.plot.ValueMarker.equals(ValueMarker.java:144) */
        valueMarker.equals(valueMarker1);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.ValueMarker.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#getValue()}
 * @utbot.returnsFrom {@code return this.value;}
 *  */
    @Test
    public void testGetValue_ReturnThisValue() throws Exception  {
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker.setValue(0.0);
        
        double actual = valueMarker.getValue();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.ValueMarker.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(double)
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 *  */
    @Test
    public void testSetValue() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetValue_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetValue_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
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
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            EventListenerList valueMarkerListenerList = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList0 = get(valueMarkerListenerListListenerListListenerList, 0);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            EventListenerList valueMarkerListenerList1 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList0 = get(valueMarkerListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialValueMarkerListenerListListenerList0 == finalValueMarkerListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetValue_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
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
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            EventListenerList valueMarkerListenerList = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList0 = get(valueMarkerListenerListListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList1 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList1ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList1ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            EventListenerList valueMarkerListenerList2 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList0 = get(valueMarkerListenerList2ListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList3 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList3ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList3ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialValueMarkerListenerListListenerList0 == finalValueMarkerListenerListListenerList0);
            
            assertFalse(initialValueMarkerListenerListListenerList1ListenerListListenerList0 == finalValueMarkerListenerListListenerList1ListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetValue_4() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[4];
            listenerList3[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList4 = {null, null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList4);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList3[1] = ((Object) jFreeChart);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            EventListenerList valueMarkerListenerList = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList0 = get(valueMarkerListenerListListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList1 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList1ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList1ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            EventListenerList valueMarkerListenerList2 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList0 = get(valueMarkerListenerList2ListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList3 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList3ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList3ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialValueMarkerListenerListListenerList0 == finalValueMarkerListenerListListenerList0);
            
            assertFalse(initialValueMarkerListenerListListenerList1ListenerListListenerList0 == finalValueMarkerListenerListListenerList1ListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetValue_5() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[2];
            listenerList3[0] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            EventListenerList listenerList4 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList5 = {null};
            setField(listenerList4, "javax.swing.event.EventListenerList", "listenerList", listenerList5);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList4);
            listenerList3[1] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            EventListenerList valueMarkerListenerList = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList0 = get(valueMarkerListenerListListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList1 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList1ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList1ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList1ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            valueMarker.setValue(java.lang.Double.NaN);
            
            double finalValueMarkerValue = ((Double) getFieldValue(valueMarker, "org.jfree.chart.plot.ValueMarker", "value"));
            EventListenerList valueMarkerListenerList2 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList2ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList2, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList0 = get(valueMarkerListenerList2ListenerListListenerList, 0);
            EventListenerList valueMarkerListenerList3 = ((EventListenerList) getFieldValue(valueMarker, "org.jfree.chart.plot.Marker", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3, "javax.swing.event.EventListenerList", "listenerList"));
            Object valueMarkerListenerList3ListenerListListenerListListenerListListenerList1 = get(valueMarkerListenerList3ListenerListListenerList, 1);
            EventListenerList valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList = ((EventListenerList) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalValueMarkerListenerListListenerList1ListenerListListenerList0 = get(valueMarkerListenerList3ListenerListListenerListListenerListListenerList1ListenerListListenerList1ListenerListListenerListListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialValueMarkerListenerListListenerList0 == finalValueMarkerListenerListListenerList0);
            
            assertFalse(initialValueMarkerListenerListListenerList1ListenerListListenerList0 == finalValueMarkerListenerListListenerList1ListenerListListenerList0);
            
            assertEquals(java.lang.Double.NaN, finalValueMarkerValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(double)
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new MarkerChangeEvent(this));
 *  */
    @Test
    public void testSetValue_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.ValueMarker.setValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.MarkerChangeListener] */
            valueMarker.setValue(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new MarkerChangeEvent(this));
 *  */
    @Test
    public void testSetValue_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
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
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.ValueMarker.setValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            valueMarker.setValue(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ValueMarker}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.ValueMarker#setValue(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetValue_ThrowClassCastException_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            valueMarker.setValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            XYPlot xYPlot = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
            EventListenerList listenerList2 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList3 = new java.lang.Object[6];
            listenerList3[2] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList4 = new java.lang.Object[2];
            listenerList4[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList4[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList4);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList3[3] = ((Object) jFreeChart);
            MarkerChangeEvent markerChangeEvent = ((MarkerChangeEvent) createInstance("org.jfree.chart.event.MarkerChangeEvent"));
            listenerList3[4] = ((Object) markerChangeEvent);
            listenerList3[5] = ((Object) markerChangeEvent);
            setField(listenerList2, "javax.swing.event.EventListenerList", "listenerList", listenerList3);
            setField(xYPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList2);
            listenerList1[1] = ((Object) xYPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(valueMarker, "org.jfree.chart.plot.Marker", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.ValueMarker.setValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            valueMarker.setValue(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setValue
    
    public void testSetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 56 occurrences of:
        /* Unable to make field private static sun.awt.AWTAccessor$ComponentAccessor sun.awt.AWTAccessor.componentAccessor accessible: module
        java.desktop does not "opens sun.awt" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields799467519621000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields799467519621000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass799467519627500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799467519621000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799467519627500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields799467519986400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields799467519986400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass799467519990400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799467519986400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799467519990400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields799467520778300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields799467520778300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass799467520781000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799467520778300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799467520781000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

