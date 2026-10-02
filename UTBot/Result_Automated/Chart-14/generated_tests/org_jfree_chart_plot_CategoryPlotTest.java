package org.jfree.chart.plot;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ObjectOutputStream;
import java.io.NotActiveException;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.Layer;
import java.util.LinkedHashMap;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import java.util.ArrayList;
import java.util.Collection;
import org.jfree.chart.axis.AxisSpace;
import java.awt.geom.Point2D;
import java.util.List;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Year;
import org.jfree.chart.axis.LogAxis;
import org.jfree.data.Range;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.SortOrder;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAnchor;
import java.awt.Paint;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetGroup;
import java.util.Map;
import java.awt.Font;
import java.awt.color.ColorSpace;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.BasicStroke;
import java.util.HashMap;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;
import java.awt.image.BufferedImage;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.chart.event.RendererChangeEvent;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static java.util.Collections.emptyMap;

public final class org_jfree_chart_plot_CategoryPlotTest {
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.readObject(CategoryPlot.java:4077) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = categoryPlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(categoryPlot, readObjectMethodArguments);
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
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.writeObject(CategoryPlot.java:4057) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = categoryPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(categoryPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = categoryPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(categoryPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    @Test(expected = NotActiveException.class)
    public void testWriteObject1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = categoryPlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(categoryPlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.render
    
    ///region OTHER: ERROR SUITE for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testRender1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.render] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRenderer(CategoryPlot.java:1320)
            org.jfree.chart.plot.CategoryPlot.render(CategoryPlot.java:3129) */
        categoryPlot.render(null, null, Integer.MIN_VALUE, null);
    }
    
    @Test
    public void testRender2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.render] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRenderer(CategoryPlot.java:1320)
            org.jfree.chart.plot.CategoryPlot.render(CategoryPlot.java:3129) */
        categoryPlot.render(null, null, 0, plotRenderingInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return removeRangeMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.removeRangeMarker(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: marker == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.removeRangeMarker(-255, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testRemoveRangeMarker1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2445) */
        categoryPlot.removeRangeMarker(0, intervalMarker, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return removeRangeMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.removeRangeMarker(-255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveRangeMarker2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2445)
            org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2415) */
        categoryPlot.removeRangeMarker(0, categoryMarker, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeRangeMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRangeMarker(org.jfree.chart.plot.Marker)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(org.jfree.chart.plot.Marker)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#removeRangeMarker(org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return removeRangeMarker(marker, Layer.FOREGROUND);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarker_ThrowIllegalArgumentException3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            categoryPlot.removeRangeMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRangeMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testRemoveRangeMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2448)
                org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2415)
                org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2396)
                org.jfree.chart.plot.CategoryPlot.removeRangeMarker(CategoryPlot.java:2378) */
            categoryPlot.removeRangeMarker(intervalMarker);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearDomainMarkers
    
    ///region OTHER: ERROR SUITE for method clearDomainMarkers(int)
    
    @Test
    public void testClearDomainMarkers1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(CategoryPlot.java:2091) */
        categoryPlot.clearDomainMarkers(0);
    }
    
    @Test
    public void testClearDomainMarkers2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(CategoryPlot.java:2091) */
        categoryPlot.clearDomainMarkers(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearDomainMarkers
    
    ///region OTHER: ERROR SUITE for method clearDomainMarkers()
    
    @Test
    public void testClearDomainMarkers3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(CategoryPlot.java:2020) */
        categoryPlot.clearDomainMarkers();
    }
    
    @Test
    public void testClearDomainMarkers4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(CategoryPlot.java:2020) */
        categoryPlot.clearDomainMarkers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addAnnotation(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.annotations.add(annotation);
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.addAnnotation(CategoryPlot.java:2645) */
        categoryPlot.addAnnotation(categoryTextAnnotation, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)
    
    @Test
    public void testAddAnnotation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        categoryPlot.addAnnotation(categoryTextAnnotation, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addAnnotation
    
    ///region OTHER: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    @Test
    public void testAddAnnotation2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.addAnnotation(CategoryPlot.java:2647)
            org.jfree.chart.plot.CategoryPlot.addAnnotation(CategoryPlot.java:2629) */
        categoryPlot.addAnnotation(categoryTextAnnotation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeAnnotation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    @Test
    public void testRemoveAnnotation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        boolean actual = categoryPlot.removeAnnotation(categoryTextAnnotation);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.removeAnnotation(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation,boolean)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean removed = this.annotations.remove(annotation);
 *  */
    @Test
    public void testRemoveAnnotation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.removeAnnotation(CategoryPlot.java:2681) */
        categoryPlot.removeAnnotation(categoryTextAnnotation, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2166)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2139)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2122) */
            categoryPlot.removeDomainMarker(valueMarker, layer);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveDomainMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2159)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2139)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2122) */
            categoryPlot.removeDomainMarker(null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testRemoveDomainMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap backgroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "backgroundDomainMarkers", backgroundDomainMarkers);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2166)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2139) */
            categoryPlot.removeDomainMarker(0, valueMarker, null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveDomainMarker4() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2159)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2139) */
            categoryPlot.removeDomainMarker(0, null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeDomainMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeDomainMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: markers = (ArrayList) this.foregroundDomainMarkers.get(new Integer(index));
 *  */
    @Test
    public void testRemoveDomainMarker_ThrowNullPointerException() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2159) */
            categoryPlot.removeDomainMarker(-255, null, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testRemoveDomainMarker5() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2166) */
            categoryPlot.removeDomainMarker(0, valueMarker, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testRemoveDomainMarker6() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2163) */
            categoryPlot.removeDomainMarker(0, null, null, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeDomainMarker
    
    ///region OTHER: ERROR SUITE for method removeDomainMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testRemoveDomainMarker7() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2166)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2139)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2122)
                org.jfree.chart.plot.CategoryPlot.removeDomainMarker(CategoryPlot.java:2106) */
            categoryPlot.removeDomainMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            Collection actual = categoryPlot.getDomainMarkers(foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testGetDomainMarkers2() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.BACKGROUND";
            setField(background, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name1);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            Collection actual = categoryPlot.getDomainMarkers(null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): False}
 * @utbot.executesCondition {@code (layer == Layer.BACKGROUND): False}
 * @utbot.executesCondition {@code (result != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainMarkers_ResultEqualsNull() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.BACKGROUND";
            setField(background, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name1);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            Collection actual = categoryPlot.getDomainMarkers(-255, null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (Collection) this.foregroundDomainMarkers.get(key);
 *  */
    @Test
    public void testGetDomainMarkers_ThrowNullPointerException() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.getDomainMarkers(CategoryPlot.java:2047) */
            categoryPlot.getDomainMarkers(-255, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            
            Collection actual = categoryPlot.getDomainMarkers(0, foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetDomainMarkers4() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.getDomainMarkers(CategoryPlot.java:2050) */
            categoryPlot.getDomainMarkers(0, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearRangeMarkers
    
    ///region OTHER: ERROR SUITE for method clearRangeMarkers(int)
    
    @Test
    public void testClearRangeMarkers1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap backgroundRangeMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "backgroundRangeMarkers", backgroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2361) */
        categoryPlot.clearRangeMarkers(0);
    }
    
    @Test
    public void testClearRangeMarkers2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2361) */
        categoryPlot.clearRangeMarkers(0);
    }
    
    @Test
    public void testClearRangeMarkers3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2361) */
        categoryPlot.clearRangeMarkers(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearRangeMarkers
    
    ///region OTHER: ERROR SUITE for method clearRangeMarkers()
    
    @Test
    public void testClearRangeMarkers4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap backgroundRangeMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "backgroundRangeMarkers", backgroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2288) */
        categoryPlot.clearRangeMarkers();
    }
    
    @Test
    public void testClearRangeMarkers5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2288) */
        categoryPlot.clearRangeMarkers();
    }
    
    @Test
    public void testClearRangeMarkers6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeMarkers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(CategoryPlot.java:2288) */
        categoryPlot.clearRangeMarkers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddRangeMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2240)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2217) */
            categoryPlot.addRangeMarker(0, null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addRangeMarker
    
    public void testAddRangeMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addRangeMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): False}
 * @utbot.executesCondition {@code (layer == Layer.BACKGROUND): False}
 * @utbot.invokes {@link org.jfree.chart.plot.Marker#addChangeListener(org.jfree.chart.event.MarkerChangeListener)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: marker.addChangeListener(this);
 *  */
    @Test
    public void testAddRangeMarker_ThrowNullPointerException() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.BACKGROUND";
            setField(background, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name1);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2257) */
            categoryPlot.addRangeMarker(-255, null, null, false);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testAddRangeMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2240) */
            categoryPlot.addRangeMarker(0, null, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addRangeMarker
    
    public void testAddRangeMarker_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddRangeMarker3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2240)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2217)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2200) */
            categoryPlot.addRangeMarker(null, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddRangeMarker4() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2249)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2217)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2200) */
            categoryPlot.addRangeMarker(null, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addRangeMarker
    
    public void testAddRangeMarker_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addRangeMarker
    
    ///region OTHER: ERROR SUITE for method addRangeMarker(org.jfree.chart.plot.Marker)
    
    @Test
    public void testAddRangeMarker5() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2257)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2217)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2200)
                org.jfree.chart.plot.CategoryPlot.addRangeMarker(CategoryPlot.java:2184) */
            categoryPlot.addRangeMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearAnnotations()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearAnnotations()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.annotations.clear();
 *  */
    @Test
    public void testClearAnnotations_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.clearAnnotations(CategoryPlot.java:2693) */
        categoryPlot.clearAnnotations();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearAnnotations()
    
    @Test
    public void testClearAnnotations1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearAnnotations(CategoryPlot.java:2694) */
        categoryPlot.clearAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateAxisSpace
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test
    public void testCalculateAxisSpace1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        fixedDomainAxisSpace.setTop(0.0);
        fixedDomainAxisSpace.setBottom(0.0);
        fixedDomainAxisSpace.setLeft(0.0);
        fixedDomainAxisSpace.setRight(0.0);
        categoryPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        
        AxisSpace actual = categoryPlot.calculateAxisSpace(null, null);
        
        AxisSpace expected = new AxisSpace();
        expected.setTop(0.0);
        expected.setBottom(0.0);
        expected.setLeft(0.0);
        expected.setRight(0.0);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for calculateAxisSpace
    
    public void testCalculateAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeMarkers
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeMarkers(org.jfree.chart.util.Layer)
    
    @Test
    public void testGetRangeMarkers1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            Collection actual = categoryPlot.getRangeMarkers(foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testGetRangeMarkers2() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.BACKGROUND";
            setField(background, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name1);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            Collection actual = categoryPlot.getRangeMarkers(null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): False}
 * @utbot.executesCondition {@code (layer == Layer.BACKGROUND): False}
 * @utbot.executesCondition {@code (result != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeMarkers_ResultEqualsNull() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.BACKGROUND";
            setField(background, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name1);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            Collection actual = categoryPlot.getRangeMarkers(-255, null);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (Collection) this.foregroundRangeMarkers.get(key);
 *  */
    @Test
    public void testGetRangeMarkers_ThrowNullPointerException() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.getRangeMarkers(CategoryPlot.java:2317) */
            categoryPlot.getRangeMarkers(-255, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): False}
 * @utbot.executesCondition {@code (layer == Layer.BACKGROUND): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (Collection) this.backgroundRangeMarkers.get(key);
 *  */
    @Test
    public void testGetRangeMarkers_ThrowNullPointerException_1() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeMarkers] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.getRangeMarkers(CategoryPlot.java:2320) */
            categoryPlot.getRangeMarkers(-255, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeMarkers(int, org.jfree.chart.util.Layer)
    
    @Test
    public void testGetRangeMarkers3() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundRangeMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundRangeMarkers", foregroundRangeMarkers);
            
            Collection actual = categoryPlot.getRangeMarkers(0, foreground);
            
            assertNull(actual);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawBackground
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#fillBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#drawBackgroundImage(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 *  */
    @Test
    public void testDrawBackground_CategoryPlotDrawBackgroundImage() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        categoryPlot.setOrientation(orientation);
        
        categoryPlot.drawBackground(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#fillBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: fillBackground(g2, area, this.orientation);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawBackground_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.drawBackground(null, null);
    }
    ///endregion
    
    ///region Errors report for drawBackground
    
    public void testDrawBackground_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeGridlines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (isRangeGridlinesVisible()): False}
 *  */
    @Test
    public void testDrawRangeGridlines_NotIsRangeGridlinesVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (isRangeGridlinesVisible()): True}
 * @utbot.executesCondition {@code (gridStroke != null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeGridlineStroke()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeGridlinePaint()}
 *  */
    @Test
    public void testDrawRangeGridlines_GridStrokeEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeGridlinesVisible(true);
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeGridlines
    
    public void testDrawRangeGridlines_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.draw
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#draw(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean b1 = (area.getWidth() <= MINIMUM_WIDTH_TO_DRAW);
 *  */
    @Test
    public void testDraw_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.draw] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.draw(CategoryPlot.java:2836) */
        categoryPlot.draw(null, null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for draw
    
    public void testDraw_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawAxes
    
    ///region OTHER: ERROR SUITE for method drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testDrawAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.drawAxes(CategoryPlot.java:3036) */
        categoryPlot.drawAxes(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isRangeZoomable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeZoomable()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isRangeZoomable()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsRangeZoomable_ReturnTrue() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isRangeZoomable();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 *  */
    @Test
    public void testZoomDomainAxes() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.zoomDomainAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = getAnnotations().iterator();
 *  */
    @Test
    public void testDrawAnnotations_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.drawAnnotations(CategoryPlot.java:3265) */
        categoryPlot.drawAnnotations(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomRangeAxes_IterateForLoop() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(CategoryPlot.java:3810) */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomRangeAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomRangeAxes
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    @Test
    public void testZoomRangeAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testZoomRangeAxes_IterateForLoop1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(CategoryPlot.java:3779) */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isDomainZoomable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainZoomable()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isDomainZoomable()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDomainZoomable_ReturnFalse() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isDomainZoomable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeLine
    
    ///region OTHER: ERROR SUITE for method drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)
    
    @Test
    public void testDrawRangeLine1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeLine] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:902)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883)
            org.jfree.chart.plot.CategoryPlot.drawRangeLine(CategoryPlot.java:3350) */
        categoryPlot.drawRangeLine(null, null, java.lang.Double.NaN, null, null);
    }
    
    @Test
    public void testDrawRangeLine2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeLine] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(CategoryPlot.java:1018)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(CategoryPlot.java:1108)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(CategoryPlot.java:1097)
            org.jfree.chart.plot.CategoryPlot.drawRangeLine(CategoryPlot.java:3351) */
        categoryPlot.drawRangeLine(null, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeLine
    
    public void testDrawRangeLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setWeight
    
    ///region Errors report for setWeight
    
    public void testSetWeight_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawDomainMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawDomainMarkers_Return() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawDomainMarkers(null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawDomainMarkers_Return_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawDomainMarkers(null, null, -1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    @Test
    public void testDrawDomainMarkers1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawDomainMarkers(null, null, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getCategories
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCategories()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategories()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategories_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        List actual = categoryPlot.getCategories();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategories()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategories_ReturnResult_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        List actual = categoryPlot.getCategories();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCategories()
    
    @Test
    public void testGetCategories1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategories] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.category.CategoryDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.category.CategoryDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1176)
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1161)
            org.jfree.chart.plot.CategoryPlot.getCategories(CategoryPlot.java:3622) */
        categoryPlot.getCategories();
    }
    
    @Test
    public void testGetCategories2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategories] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1176)
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1161)
            org.jfree.chart.plot.CategoryPlot.getCategories(CategoryPlot.java:3622) */
        categoryPlot.getCategories();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeMarkers_CategoryPlotGetRenderer() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawRangeMarkers(null, null, -255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    @Test
    public void testDrawRangeMarkers1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawRangeMarkers(null, null, Integer.MIN_VALUE, null);
    }
    
    @Test
    public void testDrawRangeMarkers2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawRangeMarkers(null, null, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeCrosshair(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotOrientation,double,org.jfree.chart.axis.ValueAxis,java.awt.Stroke,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.axis.ValueAxis#getRange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !axis.getRange().contains(value)
 *  */
    @Test
    public void testDrawRangeCrosshair_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(CategoryPlot.java:3384) */
        categoryPlot.drawRangeCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)
    
    @Test
    public void testDrawRangeCrosshair1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        Year first = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(first, "org.jfree.data.time.Year", "year", (short) 0);
        periodAxis.setFirst(first);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(periodAxis, "org.jfree.chart.axis.PeriodAxis", "calendar", calendar);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/java.util.Calendar.set(Calendar.java:1982)
            org.jfree.data.time.Year.getFirstMillisecond(Year.java:233)
            org.jfree.chart.axis.PeriodAxis.getRange(PeriodAxis.java:503)
            org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(CategoryPlot.java:3384) */
        categoryPlot.drawRangeCrosshair(null, null, null, java.lang.Double.NaN, periodAxis, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDataRange
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataRange(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rangeIndex = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDataRange_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3420) */
        categoryPlot.getDataRange(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDataRange1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        Range actual = categoryPlot.getDataRange(logAxis);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDataRange2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) rangeAxes);
        objects[2] = ((Object) rangeAxes);
        objects[3] = ((Object) rangeAxes);
        objects[4] = ((Object) rangeAxes);
        objects[5] = ((Object) rangeAxes);
        objects[6] = ((Object) rangeAxes);
        objects[7] = ((Object) rangeAxes);
        objects[8] = ((Object) rangeAxes);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        Range actual = categoryPlot.getDataRange(periodAxis);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetDataRange3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) rangeAxes);
        objects[2] = ((Object) rangeAxes);
        objects[3] = ((Object) rangeAxes);
        objects[4] = ((Object) rangeAxes);
        objects[5] = ((Object) rangeAxes);
        objects[6] = ((Object) rangeAxes);
        objects[7] = ((Object) rangeAxes);
        objects[8] = ((Object) rangeAxes);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataRange] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(CategoryPlot.java:3486)
            org.jfree.chart.plot.CategoryPlot.getDataRange(CategoryPlot.java:3422) */
        categoryPlot.getDataRange(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getWeight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeight()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getWeight()}
 * @utbot.returnsFrom {@code return this.weight;}
 *  */
    @Test
    public void testGetWeight_ReturnThisWeight() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setWeight(-255);
        
        int actual = categoryPlot.getWeight();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getAnchorValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnchorValue()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getAnchorValue()}
 * @utbot.returnsFrom {@code return this.anchorValue;}
 *  */
    @Test
    public void testGetAnchorValue_ReturnThisAnchorValue() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setAnchorValue(0.0);
        
        double actual = categoryPlot.getAnchorValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setAnchorValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAnchorValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetAnchorValue_NotNotify() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setAnchorValue(java.lang.Double.NaN);
        
        categoryPlot.setAnchorValue(java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setAnchorValue(double, boolean)
    
    @Test
    public void testSetAnchorValue1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setAnchorValue(0.0);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setAnchorValue] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setAnchorValue(CategoryPlot.java:3853) */
        categoryPlot.setAnchorValue(java.lang.Double.NaN, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisLocation()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.returnsFrom {@code return getRangeAxisLocation(0);}
 *  */
    @Test
    public void testGetRangeAxisLocation_CategoryPlotGetRangeAxisLocation() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = categoryPlot.getRangeAxisLocation();
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisLocation()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRangeAxisLocation(0);
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(CategoryPlot.java:1019)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(CategoryPlot.java:1004) */
        categoryPlot.getRangeAxisLocation();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisLocation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisLocation();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisLocation2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxisLocations.size()
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(CategoryPlot.java:1018) */
        categoryPlot.getRangeAxisLocation(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisLocation(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisLocation3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisLocation(0);
    }
    
    @Test
    public void testGetRangeAxisLocation4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisLocation(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#mapDatasetToDomainAxis(int,int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.datasetToDomainAxisMap.set(index, new Integer(axisIndex));
 *  */
    @Test
    public void testMapDatasetToDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(CategoryPlot.java:1241) */
        categoryPlot.mapDatasetToDomainAxis(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    @Test(expected = OutOfMemoryError.class)
    public void testMapDatasetToDomainAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        categoryPlot.mapDatasetToDomainAxis(1073741824, 0);
    }
    
    @Test
    public void testMapDatasetToDomainAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1175)
            org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(CategoryPlot.java:1243) */
        categoryPlot.mapDatasetToDomainAxis(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRendererForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRendererForDataset(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRendererForDataset_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryItemRenderer actual = categoryPlot.getRendererForDataset(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRendererForDataset(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRendererForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRendererForDataset(CategoryPlot.java:1432) */
        categoryPlot.getRendererForDataset(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRendererForDataset(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testGetRendererForDataset1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
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
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRendererForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRendererForDataset(CategoryPlot.java:1434) */
        categoryPlot.getRendererForDataset(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDatasetRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetRenderingOrder()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDatasetRenderingOrder()}
 * @utbot.returnsFrom {@code return this.renderingOrder;}
 *  */
    @Test
    public void testGetDatasetRenderingOrder_ReturnThisRenderingOrder() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        DatasetRenderingOrder actual = categoryPlot.getDatasetRenderingOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRowRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRowRenderingOrder(org.jfree.chart.util.SortOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrder_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRowRenderingOrder(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRowRenderingOrder(org.jfree.chart.util.SortOrder)
    
    @Test
    public void testSetRowRenderingOrder1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder(CategoryPlot.java:1541) */
        categoryPlot.setRowRenderingOrder(sortOrder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToDomainAxisMap.get(index);
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(CategoryPlot.java:1258) */
        categoryPlot.getDomainAxisForDataset(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisForDataset(int)
    
    @Test
    public void testGetDomainAxisForDataset1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxisForDataset(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisForDataset(int)
    
    @Test
    public void testGetDomainAxisForDataset2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:614)
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:621)
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:600)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(CategoryPlot.java:1257) */
        categoryPlot.getDomainAxisForDataset(0);
    }
    
    @Test
    public void testGetDomainAxisForDataset3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(CategoryPlot.java:1258) */
        categoryPlot.getDomainAxisForDataset(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetRangeAxisLocation_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1085) */
        categoryPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1085) */
        categoryPlot.setRangeAxisLocation(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index == 0 && location == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeAxisLocation(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1085) */
        categoryPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetRangeAxisLocation2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1087)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1051)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1038) */
        categoryPlot.setRangeAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetRangeAxisLocation3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1087)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1051)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1038) */
        categoryPlot.setRangeAxisLocation(axisLocation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetRangeAxisLocation4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList categoryPlotRangeAxisLocations = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations"));
        java.lang.Object[] categoryPlotRangeAxisLocationsRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotRangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialCategoryPlotRangeAxisLocationsObjects0 = get(categoryPlotRangeAxisLocationsRangeAxisLocationsObjects, 0);
        
        categoryPlot.setRangeAxisLocation(axisLocation, false);
        
        ObjectList categoryPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations"));
        java.lang.Object[] categoryPlotRangeAxisLocations1RangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalCategoryPlotRangeAxisLocationsObjects0 = get(categoryPlotRangeAxisLocations1RangeAxisLocationsObjects, 0);
        ObjectList categoryPlotRangeAxisLocations2 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations"));
        int finalCategoryPlotRangeAxisLocationsSize = ((Integer) getFieldValue(categoryPlotRangeAxisLocations2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialCategoryPlotRangeAxisLocationsObjects0 == finalCategoryPlotRangeAxisLocationsObjects0);
        
        assertEquals(1, finalCategoryPlotRangeAxisLocationsSize);
    }
    
    @Test
    public void testSetRangeAxisLocation5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList categoryPlotRangeAxisLocations = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations"));
        java.lang.Object[] initialCategoryPlotRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotRangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        categoryPlot.setRangeAxisLocation(axisLocation, false);
        
        ObjectList categoryPlotRangeAxisLocations1 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations"));
        java.lang.Object[] finalCategoryPlotRangeAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotRangeAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        assertFalse(initialCategoryPlotRangeAxisLocationsObjects == finalCategoryPlotRangeAxisLocationsObjects);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation
    
    ///region OTHER: ERROR SUITE for method setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetRangeAxisLocation6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1085)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1065) */
        categoryPlot.setRangeAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetRangeAxisLocation7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1087)
            org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(CategoryPlot.java:1065) */
        categoryPlot.setRangeAxisLocation(0, axisLocation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDatasetToRangeAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#mapDatasetToRangeAxis(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.datasetToRangeAxisMap.set(index, new Integer(axisIndex));
 *  */
    @Test
    public void testMapDatasetToRangeAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(CategoryPlot.java:1274) */
        categoryPlot.mapDatasetToRangeAxis(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapDatasetToRangeAxis(int, int)
    
    @Test
    public void testMapDatasetToRangeAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1175)
            org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(CategoryPlot.java:1276) */
        categoryPlot.mapDatasetToRangeAxis(32, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToRangeAxisMap.get(index);
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(CategoryPlot.java:1291) */
        categoryPlot.getRangeAxisForDataset(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisForDataset(int)
    
    @Test
    public void testGetRangeAxisForDataset1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:902)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(CategoryPlot.java:1290) */
        categoryPlot.getRangeAxisForDataset(0);
    }
    
    @Test
    public void testGetRangeAxisForDataset2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(CategoryPlot.java:1291) */
        categoryPlot.getRangeAxisForDataset(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetDomainGridlinesVisible_ThisDomainGridlinesVisibleEqualsVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDomainGridlinesVisible(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getColumnRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnRenderingOrder()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getColumnRenderingOrder()}
 * @utbot.returnsFrom {@code return this.columnRenderingOrder;}
 *  */
    @Test
    public void testGetColumnRenderingOrder_ReturnThisColumnRenderingOrder() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        SortOrder actual = categoryPlot.getColumnRenderingOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainGridlinePosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainGridlinePosition()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainGridlinePosition()}
 * @utbot.returnsFrom {@code return this.domainGridlinePosition;}
 *  */
    @Test
    public void testGetDomainGridlinePosition_ReturnThisDomainGridlinePosition() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        CategoryAnchor actual = categoryPlot.getDomainGridlinePosition();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRowRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowRenderingOrder()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRowRenderingOrder()}
 * @utbot.returnsFrom {@code return this.rowRenderingOrder;}
 *  */
    @Test
    public void testGetRowRenderingOrder_ReturnThisRowRenderingOrder() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        SortOrder actual = categoryPlot.getRowRenderingOrder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainGridlinePaint()}
 * @utbot.returnsFrom {@code return this.domainGridlinePaint;}
 *  */
    @Test
    public void testGetDomainGridlinePaint_ReturnThisDomainGridlinePaint() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        Paint actual = categoryPlot.getDomainGridlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.configureDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureDomainAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 *  */
    @Test
    public void testConfigureDomainAxes_IterateForLoop() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        categoryPlot.configureDomainAxes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method configureDomainAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureDomainAxes(CategoryPlot.java:867) */
        categoryPlot.configureDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke
    
    ///region Errors report for getDomainGridlineStroke
    
    public void testGetDomainGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): False}
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThisRangeGridlinesVisibleEqualsVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeGridlinesVisible(false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeGridlinesVisible(boolean)
    
    @Test
    public void testSetRangeGridlinesVisible1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeGridlinesVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible(CategoryPlot.java:1677) */
        categoryPlot.setRangeGridlinesVisible(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)}
 * @utbot.executesCondition {@code (position == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: position == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePosition_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDomainGridlinePosition(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)
    
    @Test
    public void testSetDomainGridlinePosition1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryAnchor categoryAnchor = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition(CategoryPlot.java:1597) */
        categoryPlot.setDomainGridlinePosition(categoryAnchor);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isRangeGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isRangeGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.rangeGridlinesVisible;}
 *  */
    @Test
    public void testIsRangeGridlinesVisible_ReturnThisRangeGridlinesVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isRangeGridlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke
    
    ///region Errors report for getRangeGridlineStroke
    
    public void testGetRangeGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDatasetRenderingOrder(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    @Test
    public void testSetDatasetRenderingOrder1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            DatasetRenderingOrder datasetRenderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
                org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
                org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder(CategoryPlot.java:1479) */
            categoryPlot.setDatasetRenderingOrder(datasetRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isDomainGridlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDomainGridlinesVisible()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isDomainGridlinesVisible()}
 * @utbot.returnsFrom {@code return this.domainGridlinesVisible;}
 *  */
    @Test
    public void testIsDomainGridlinesVisible_ReturnThisDomainGridlinesVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isDomainGridlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeGridlinePaint()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeGridlinePaint()}
 * @utbot.returnsFrom {@code return this.rangeGridlinePaint;}
 *  */
    @Test
    public void testGetRangeGridlinePaint_ReturnThisRangeGridlinePaint() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        Paint actual = categoryPlot.getRangeGridlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeGridlinePaint(null);
    }
    ///endregion
    
    ///region Errors report for setRangeGridlinePaint
    
    public void testSetRangeGridlinePaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation()
    
    @Test
    public void testGetDomainAxisLocation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = categoryPlot.getDomainAxisLocation();
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisLocation2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisLocation();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisLocation3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxisLocations.size()
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:735) */
        categoryPlot.getDomainAxisLocation(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisLocation(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisLocation4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisLocation(0);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisLocation5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisLocation(0);
    }
    
    @Test
    public void testGetDomainAxisLocation6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisLocation(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setColumnRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setColumnRenderingOrder(org.jfree.chart.util.SortOrder)}
 * @utbot.executesCondition {@code (order == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: order == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrder_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setColumnRenderingOrder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDomainGridlineStroke(null);
    }
    ///endregion
    
    ///region Errors report for setDomainGridlineStroke
    
    public void testSetDomainGridlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDomainGridlinePaint(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeGridlineStroke(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetDomainAxisLocation1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", Integer.MIN_VALUE);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:804)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:755) */
        categoryPlot.setDomainAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:806)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:755) */
        categoryPlot.setDomainAxisLocation(axisLocation);
    }
    
    @Test
    public void testSetDomainAxisLocation3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:806)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:755) */
        categoryPlot.setDomainAxisLocation(axisLocation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)
    
    @Test
    public void testSetDomainAxisLocation4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:804)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:782) */
        categoryPlot.setDomainAxisLocation(9, ((AxisLocation) null));
    }
    
    @Test
    public void testSetDomainAxisLocation5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:806)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:782) */
        categoryPlot.setDomainAxisLocation(8, ((AxisLocation) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList categoryPlotDomainAxisLocations = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations"));
        java.lang.Object[] initialCategoryPlotDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        categoryPlot.setDomainAxisLocation(axisLocation, false);
        
        ObjectList categoryPlotDomainAxisLocations1 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations"));
        java.lang.Object[] finalCategoryPlotDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotDomainAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        assertFalse(initialCategoryPlotDomainAxisLocationsObjects == finalCategoryPlotDomainAxisLocationsObjects);
    }
    
    @Test
    public void testSetDomainAxisLocation7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        ObjectList categoryPlotDomainAxisLocations = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations"));
        java.lang.Object[] categoryPlotDomainAxisLocationsDomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotDomainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object initialCategoryPlotDomainAxisLocationsObjects0 = get(categoryPlotDomainAxisLocationsDomainAxisLocationsObjects, 0);
        
        categoryPlot.setDomainAxisLocation(axisLocation, false);
        
        ObjectList categoryPlotDomainAxisLocations1 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations"));
        java.lang.Object[] categoryPlotDomainAxisLocations1DomainAxisLocationsObjects = ((java.lang.Object[]) getFieldValue(categoryPlotDomainAxisLocations1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        Object finalCategoryPlotDomainAxisLocationsObjects0 = get(categoryPlotDomainAxisLocations1DomainAxisLocationsObjects, 0);
        ObjectList categoryPlotDomainAxisLocations2 = ((ObjectList) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations"));
        int finalCategoryPlotDomainAxisLocationsSize = ((Integer) getFieldValue(categoryPlotDomainAxisLocations2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialCategoryPlotDomainAxisLocationsObjects0 == finalCategoryPlotDomainAxisLocationsObjects0);
        
        assertEquals(1, finalCategoryPlotDomainAxisLocationsSize);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetDomainAxisLocation_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:804) */
        categoryPlot.setDomainAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:804) */
        categoryPlot.setDomainAxisLocation(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (location == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index == 0 && location == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setDomainAxisLocation(0, null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.setDomainAxisLocation(32, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)
    
    @Test
    public void testSetDomainAxisLocation9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(CategoryPlot.java:804) */
        categoryPlot.setDomainAxisLocation(9, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateDomainAxisSpace1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        categoryPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        
        AxisSpace actual = categoryPlot.calculateDomainAxisSpace(null, null, null);
        
        AxisSpace expected = new AxisSpace();
        expected.setTop(0.0);
        expected.setBottom(0.0);
        expected.setLeft(0.0);
        expected.setRight(0.0);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCalculateDomainAxisSpace2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisSpace fixedDomainAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        categoryPlot.setFixedDomainAxisSpace(fixedDomainAxisSpace);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = categoryPlot.calculateDomainAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test(expected = StackOverflowError.class)
    public void testCalculateDomainAxisSpace3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisSpace axisSpace = new AxisSpace();
        
        categoryPlot.calculateDomainAxisSpace(null, null, axisSpace);
    }
    
    @Test
    public void testCalculateDomainAxisSpace4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace] produces [java.lang.NullPointerException] */
        categoryPlot.calculateDomainAxisSpace(null, null, null);
    }
    ///endregion
    
    ///region Errors report for calculateDomainAxisSpace
    
    public void testCalculateDomainAxisSpace_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isRangeCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeCrosshairLockedOnData()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isRangeCrosshairLockedOnData()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairLockedOnData;}
 *  */
    @Test
    public void testIsRangeCrosshairLockedOnData_ReturnThisRangeCrosshairLockedOnData() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isRangeCrosshairLockedOnData();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairVisible != flag): False}
 *  */
    @Test
    public void testSetRangeCrosshairVisible_ThisRangeCrosshairVisibleEqualsFlag() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeCrosshairVisible(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method datasetsMappedToRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class intType = int.class;
        Method datasetsMappedToRangeAxisMethod = categoryPlotClazz.getDeclaredMethod("datasetsMappedToRangeAxis", intType);
        datasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] datasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        datasetsMappedToRangeAxisMethodArguments[0] = -255;
        ArrayList actual = ((ArrayList) datasetsMappedToRangeAxisMethod.invoke(categoryPlot, datasetsMappedToRangeAxisMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method datasetsMappedToRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(CategoryPlot.java:3486) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class intType = int.class;
        Method datasetsMappedToRangeAxisMethod = categoryPlotClazz.getDeclaredMethod("datasetsMappedToRangeAxis", intType);
        datasetsMappedToRangeAxisMethod.setAccessible(true);
        java.lang.Object[] datasetsMappedToRangeAxisMethodArguments = new java.lang.Object[1];
        datasetsMappedToRangeAxisMethodArguments[0] = -255;
        try {
            datasetsMappedToRangeAxisMethod.invoke(categoryPlot, datasetsMappedToRangeAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeCrosshairPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeCrosshairPaint(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawDomainGridlines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#isDomainGridlinesVisible()}
 *  */
    @Test
    public void testDrawDomainGridlines_CategoryPlotIsDomainGridlinesVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.drawDomainGridlines(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    @Test(expected = StackOverflowError.class)
    public void testDrawDomainGridlines1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        
        categoryPlot.drawDomainGridlines(null, null);
    }
    
    @Test
    public void testDrawDomainGridlines2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawDomainGridlines] produces [java.lang.ClassCastException] */
        categoryPlot.drawDomainGridlines(null, null);
    }
    
    @Test
    public void testDrawDomainGridlines3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawDomainGridlines] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.drawDomainGridlines(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getFixedRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedRangeAxisSpace()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getFixedRangeAxisSpace()}
 * @utbot.returnsFrom {@code return this.fixedRangeAxisSpace;}
 *  */
    @Test
    public void testGetFixedRangeAxisSpace_ReturnThisFixedRangeAxisSpace() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        AxisSpace actual = categoryPlot.getFixedRangeAxisSpace();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getFixedLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedLegendItems()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getFixedLegendItems()}
 * @utbot.returnsFrom {@code return this.fixedLegendItems;}
 *  */
    @Test
    public void testGetFixedLegendItems_ReturnThisFixedLegendItems() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        LegendItemCollection actual = categoryPlot.getFixedLegendItems();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeCrosshairValue()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeCrosshairValue()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairValue;}
 *  */
    @Test
    public void testGetRangeCrosshairValue_ReturnThisRangeCrosshairValue() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeCrosshairValue(0.0);
        
        double actual = categoryPlot.getRangeCrosshairValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeCrosshairPaint()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeCrosshairPaint()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairPaint;}
 *  */
    @Test
    public void testGetRangeCrosshairPaint_ReturnThisRangeCrosshairPaint() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        Paint actual = categoryPlot.getRangeCrosshairPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetFixedDomainAxisSpace_NotNotify() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setFixedDomainAxisSpace(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetFixedRangeAxisSpace_NotNotify() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setFixedRangeAxisSpace(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int axisIndex = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetCategoriesForAxis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(CategoryPlot.java:3640) */
        categoryPlot.getCategoriesForAxis(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int axisIndex = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetCategoriesForAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(CategoryPlot.java:3640) */
        categoryPlot.getCategoriesForAxis(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)
    
    @Test
    public void testGetCategoriesForAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(CategoryPlot.java:3454)
            org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(CategoryPlot.java:3641) */
        categoryPlot.getCategoriesForAxis(subCategoryAxis);
    }
    
    @Test
    public void testGetCategoriesForAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) domainAxes);
        objects[2] = ((Object) domainAxes);
        objects[3] = ((Object) domainAxes);
        objects[4] = ((Object) domainAxes);
        objects[5] = ((Object) domainAxes);
        objects[6] = ((Object) domainAxes);
        objects[7] = ((Object) domainAxes);
        objects[8] = ((Object) domainAxes);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(CategoryPlot.java:3454)
            org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(CategoryPlot.java:3641) */
        categoryPlot.getCategoriesForAxis(categoryAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getFixedDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFixedDomainAxisSpace()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getFixedDomainAxisSpace()}
 * @utbot.returnsFrom {@code return this.fixedDomainAxisSpace;}
 *  */
    @Test
    public void testGetFixedDomainAxisSpace_ReturnThisFixedDomainAxisSpace() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        AxisSpace actual = categoryPlot.getFixedDomainAxisSpace();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): False}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isRangeCrosshairVisible() && notify) {
 *     fireChangeEvent();
 * }): False}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeCrosshairVisible(true);
        categoryPlot.setRangeCrosshairValue(0.0);
        
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN, false);
        
        double finalCategoryPlotRangeCrosshairValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotRangeCrosshairValue, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 *  */
    @Test
    public void testSetRangeCrosshairValue_CategoryPlotSetRangeCrosshairValue() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method datasetsMappedToDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class intType = int.class;
        Method datasetsMappedToDomainAxisMethod = categoryPlotClazz.getDeclaredMethod("datasetsMappedToDomainAxis", intType);
        datasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] datasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        datasetsMappedToDomainAxisMethodArguments[0] = -255;
        ArrayList actual = ((ArrayList) datasetsMappedToDomainAxisMethod.invoke(categoryPlot, datasetsMappedToDomainAxisMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method datasetsMappedToDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(CategoryPlot.java:3454) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class intType = int.class;
        Method datasetsMappedToDomainAxisMethod = categoryPlotClazz.getDeclaredMethod("datasetsMappedToDomainAxis", intType);
        datasetsMappedToDomainAxisMethod.setAccessible(true);
        java.lang.Object[] datasetsMappedToDomainAxisMethodArguments = new java.lang.Object[1];
        datasetsMappedToDomainAxisMethodArguments[0] = -255;
        try {
            datasetsMappedToDomainAxisMethod.invoke(categoryPlot, datasetsMappedToDomainAxisMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDrawSharedDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDrawSharedDomainAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDrawSharedDomainAxis()}
 * @utbot.returnsFrom {@code return this.drawSharedDomainAxis;}
 *  */
    @Test
    public void testGetDrawSharedDomainAxis_ReturnThisDrawSharedDomainAxis() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.getDrawSharedDomainAxis();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeCrosshairStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeCrosshairStroke(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedRangeAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.returnsFrom {@code return space;}
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThisFixedRangeAxisSpaceEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedRangeAxisSpace != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(CategoryPlot.java:2786) */
        categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateRangeAxisSpace1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisSpace fixedRangeAxisSpace = ((AxisSpace) createInstance("org.jfree.chart.axis.AxisSpace"));
        categoryPlot.setFixedRangeAxisSpace(fixedRangeAxisSpace);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    @Test
    public void testCalculateRangeAxisSpace2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(CategoryPlot.java:2786) */
        categoryPlot.calculateRangeAxisSpace(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.isRangeCrosshairVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRangeCrosshairVisible()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#isRangeCrosshairVisible()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairVisible;}
 *  */
    @Test
    public void testIsRangeCrosshairVisible_ReturnThisRangeCrosshairVisible() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.isRangeCrosshairVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke
    
    ///region Errors report for getRangeCrosshairStroke
    
    public void testGetRangeCrosshairStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairLockedOnData(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairLockedOnData != flag): False}
 *  */
    @Test
    public void testSetRangeCrosshairLockedOnData_ThisRangeCrosshairLockedOnDataEqualsFlag() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setRangeCrosshairLockedOnData(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.CategoryMarker)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(org.jfree.chart.plot.CategoryMarker)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(marker, Layer.FOREGROUND);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            
            categoryPlot.addDomainMarker(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(org.jfree.chart.plot.CategoryMarker)
    
    @Test
    public void testAddDomainMarker1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LinkedHashMap foregroundDomainMarkers = new LinkedHashMap();
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "foregroundDomainMarkers", foregroundDomainMarkers);
            CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.Marker.addChangeListener(Marker.java:534)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1989)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1943)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1926)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1910) */
            categoryPlot.addDomainMarker(categoryMarker);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        categoryPlot.addDomainMarker(-255, categoryMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(index, marker, layer, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addDomainMarker(-255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddDomainMarker2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1972)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1943) */
            categoryPlot.addDomainMarker(0, categoryMarker, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddDomainMarker3() throws Exception  {
        Layer prevBACKGROUND = Layer.BACKGROUND;
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer background = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "BACKGROUND", background);
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1981)
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1943) */
            categoryPlot.addDomainMarker(0, categoryMarker, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addDomainMarker
    
    public void testAddDomainMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        categoryPlot.addDomainMarker(categoryMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_11() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addDomainMarker(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): False}
 * @utbot.executesCondition {@code (layer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: layer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_12() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        categoryPlot.addDomainMarker(-255, categoryMarker, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer,boolean)}
 * @utbot.executesCondition {@code (marker == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: marker == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addDomainMarker(-255, null, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer, boolean)
    
    @Test
    public void testAddDomainMarker4() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addDomainMarker] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.CategoryPlot.addDomainMarker(CategoryPlot.java:1972) */
            categoryPlot.addDomainMarker(0, categoryMarker, foreground, false);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for addDomainMarker
    
    public void testAddDomainMarker_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge
    
    ///region OTHER: ERROR SUITE for method getDomainAxisEdge()
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisEdge1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge();
    }
    
    @Test
    public void testGetDomainAxisEdge2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ClassCastException] */
        categoryPlot.getDomainAxisEdge();
    }
    
    @Test
    public void testGetDomainAxisEdge3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.getDomainAxisEdge();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisEdge4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AxisLocation location = getDomainAxisLocation(index);
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:736)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:829) */
        categoryPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxisEdge(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetDomainAxisEdge6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge(0);
    }
    
    @Test
    public void testGetDomainAxisEdge7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.getDomainAxisEdge(1073741824);
    }
    
    @Test
    public void testGetDomainAxisEdge8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisEdge(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.returnsFrom {@code return getRangeAxis(0);}
 *  */
    @Test
    public void testGetRangeAxis_CategoryPlotGetRangeAxis() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    @Test
    public void testGetRangeAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis()
    
    @Test
    public void testGetRangeAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:896)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883) */
        categoryPlot.getRangeAxis();
    }
    
    @Test
    public void testGetRangeAxis3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:902)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:883) */
        categoryPlot.getRangeAxis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_IndexGreaterOrEqualThisRangeAxesSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_IndexLessThanThisRangeAxesSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxes.size()
 *  */
    @Test
    public void testGetRangeAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895) */
        categoryPlot.getRangeAxis(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis(int)
    
    @Test
    public void testGetRangeAxis4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis(int)
    
    @Test
    public void testGetRangeAxis5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:902) */
        categoryPlot.getRangeAxis(Integer.MIN_VALUE);
    }
    
    @Test
    public void testGetRangeAxis6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CombinedRangeCategoryPlot parent = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:895)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:902) */
        categoryPlot.getRangeAxis(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getOrientation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOrientation()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getOrientation()}
 * @utbot.returnsFrom {@code return this.orientation;}
 *  */
    @Test
    public void testGetOrientation_ReturnThisOrientation() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        PlotOrientation actual = categoryPlot.getOrientation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.CategoryAxis;)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxes(org.jfree.chart.axis.CategoryAxis[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < axes.length; i++)
 *  */
    @Test
    public void testSetDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:687) */
        categoryPlot.setDomainAxes(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.CategoryAxis;)
    
    @Test
    public void testSetDomainAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = {null, null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:668)
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:688) */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    
    @Test
    public void testSetDomainAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = {};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:690) */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    
    @Test
    public void testSetDomainAxes3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:668)
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:688) */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    
    @Test
    public void testSetDomainAxes4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CategoryAxis3D categoryAxis3D = ((CategoryAxis3D) createInstance("org.jfree.chart.axis.CategoryAxis3D"));
        objects[0] = ((Object) categoryAxis3D);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = {null, null, null, null, null, null, null, null, null};
        objects[1] = ((Object) categoryAxisArray);
        objects[2] = ((Object) categoryAxisArray);
        objects[3] = ((Object) categoryAxisArray);
        objects[4] = ((Object) categoryAxisArray);
        objects[5] = ((Object) categoryAxisArray);
        objects[6] = ((Object) categoryAxisArray);
        objects[7] = ((Object) categoryAxisArray);
        objects[8] = ((Object) categoryAxisArray);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.removeChangeListener(Axis.java:1010)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:663)
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:688) */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    
    @Test
    public void testSetDomainAxes5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = new org.jfree.chart.axis.CategoryAxis[10];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        categoryAxisArray[0] = ((CategoryAxis) subCategoryAxis);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:671)
            org.jfree.chart.plot.CategoryPlot.setDomainAxes(CategoryPlot.java:688) */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getPlotType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPlotType()
    
    @Test
    public void testGetPlotType1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        String actual = categoryPlot.getPlotType();
        
        String expected = "Category Plot";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setOrientation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: orientation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setOrientation(null);
    }
    ///endregion
    
    ///region Errors report for setOrientation
    
    public void testSetOrientation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxis
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxis()
    
    @Test
    public void testGetDomainAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDomainAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDomainAxis()
    
    @Test
    public void testGetDomainAxis3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.CategoryAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.CategoryAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:615)
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:600) */
        categoryPlot.getDomainAxis();
    }
    
    @Test
    public void testGetDomainAxis4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:614)
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:621)
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:600) */
        categoryPlot.getDomainAxis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxes.size()
 *  */
    @Test
    public void testGetDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxis(CategoryPlot.java:614) */
        categoryPlot.getDomainAxis(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxis(int)
    
    @Test
    public void testGetDomainAxis5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis(0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDomainAxis6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis(0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDomainAxis7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxis
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(org.jfree.chart.axis.CategoryAxis)
    
    @Test
    public void testSetDomainAxis1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:668)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:649)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:636) */
        categoryPlot.setDomainAxis(categoryAxis);
    }
    
    @Test
    public void testSetDomainAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
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
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:674)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:649)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:636) */
        categoryPlot.setDomainAxis(null);
    }
    
    @Test
    public void testSetDomainAxis3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:674)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:649)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:636) */
        categoryPlot.setDomainAxis(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxis
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        categoryPlot.setDomainAxis(Integer.MIN_VALUE, categoryAxis);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)
    
    @Test
    public void testSetDomainAxis5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:668)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:649) */
        categoryPlot.setDomainAxis(0, categoryAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxis(int,org.jfree.chart.axis.CategoryAxis,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryAxis existing = (CategoryAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testSetDomainAxis_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.CategoryAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.CategoryAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:661) */
        categoryPlot.setDomainAxis(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxis(int,org.jfree.chart.axis.CategoryAxis,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CategoryAxis existing = (CategoryAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testSetDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:661) */
        categoryPlot.setDomainAxis(-255, null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)
    
    @Test
    public void testSetDomainAxis6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
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
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        categoryPlot.setDomainAxis(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)
    
    @Test
    public void testSetDomainAxis7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:668) */
        categoryPlot.setDomainAxis(0, null, false);
    }
    
    @Test
    public void testSetDomainAxis8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.CategoryPlot.setDomainAxis(CategoryPlot.java:671) */
        categoryPlot.setDomainAxis(0, subCategoryAxis, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxis9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        categoryPlot.setDomainAxis(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.domainAxes.size();}
 *  */
    @Test
    public void testGetDomainAxisCount_ObjectListSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        int actual = categoryPlot.getDomainAxisCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.domainAxes.size();
 *  */
    @Test
    public void testGetDomainAxisCount_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisCount(CategoryPlot.java:845) */
        categoryPlot.getDomainAxisCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setAxisOffset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAxisOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (offset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: offset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setAxisOffset(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.returnsFrom {@code return this.domainAxes.indexOf(axis);}
 *  */
    @Test
    public void testGetDomainAxisIndex_ReturnThisDomainAxesIndexOf_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        int actual = categoryPlot.getDomainAxisIndex(subCategoryAxis);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.returnsFrom {@code return this.domainAxes.indexOf(axis);}
 *  */
    @Test
    public void testGetDomainAxisIndex_ReturnThisDomainAxesIndexOf() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        objects[0] = ((Object) subCategoryAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        int actual = categoryPlot.getDomainAxisIndex(subCategoryAxis);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.executesCondition {@code (axis == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: axis == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisIndex_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.getDomainAxisIndex(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDomainAxisIndex_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(CategoryPlot.java:710) */
        categoryPlot.getDomainAxisIndex(subCategoryAxis);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDomainAxisIndex_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(CategoryPlot.java:710) */
        categoryPlot.getDomainAxisIndex(subCategoryAxis);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)
    
    @Test
    public void testGetDomainAxisIndex1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        CategoryAxis categoryAxis = ((CategoryAxis) createInstance("org.jfree.chart.axis.CategoryAxis"));
        
        int actual = categoryPlot.getDomainAxisIndex(categoryAxis);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getAxisOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAxisOffset()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getAxisOffset()}
 * @utbot.returnsFrom {@code return this.axisOffset;}
 *  */
    @Test
    public void testGetAxisOffset_ReturnThisAxisOffset() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        RectangleInsets actual = categoryPlot.getAxisOffset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearDomainAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testClearDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.clearDomainAxes(CategoryPlot.java:853) */
        categoryPlot.clearDomainAxes();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearDomainAxes()
    
    @Test
    public void testClearDomainAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null, null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearDomainAxes(CategoryPlot.java:860) */
        categoryPlot.clearDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxis(int,org.jfree.chart.axis.ValueAxis,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis existing = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testSetRangeAxis_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:938) */
        categoryPlot.setRangeAxis(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxis(int,org.jfree.chart.axis.ValueAxis,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ValueAxis existing = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testSetRangeAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:938) */
        categoryPlot.setRangeAxis(-255, null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetRangeAxis1() throws Exception  {
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
        
        categoryPlot.setRangeAxis(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test
    public void testSetRangeAxis2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945) */
        categoryPlot.setRangeAxis(0, null, false);
    }
    
    @Test
    public void testSetRangeAxis3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[17];
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        SpiderWebPlot plot = ((SpiderWebPlot) createInstance("org.jfree.chart.plot.SpiderWebPlot"));
        numberAxis.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:948) */
        categoryPlot.setRangeAxis(0, numberAxis, false);
    }
    
    @Test
    public void testSetRangeAxis4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) rangeAxes);
        objects[2] = ((Object) rangeAxes);
        objects[3] = ((Object) rangeAxes);
        objects[4] = ((Object) rangeAxes);
        objects[5] = ((Object) rangeAxes);
        objects[6] = ((Object) rangeAxes);
        objects[7] = ((Object) rangeAxes);
        objects[8] = ((Object) rangeAxes);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.removeChangeListener(Axis.java:1010)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:940) */
        categoryPlot.setRangeAxis(0, null, false);
    }
    
    @Test
    public void testSetRangeAxis5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.Axis.addChangeListener(Axis.java:999)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:948) */
        categoryPlot.setRangeAxis(0, logAxis, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.setRangeAxis(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:951)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926) */
        categoryPlot.setRangeAxis(0, null);
    }
    
    @Test
    public void testSetRangeAxis8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926) */
        categoryPlot.setRangeAxis(0, cyclicNumberAxis);
    }
    
    @Test
    public void testSetRangeAxis9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926) */
        categoryPlot.setRangeAxis(0, periodAxis);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRangeAxis(int, org.jfree.chart.axis.ValueAxis)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis10() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.setRangeAxis(Integer.MIN_VALUE, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis11() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        categoryPlot.setRangeAxis(Integer.MIN_VALUE, cyclicNumberAxis);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxis12() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        categoryPlot.setRangeAxis(Integer.MIN_VALUE, periodAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxis
    
    ///region OTHER: ERROR SUITE for method setRangeAxis(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testSetRangeAxis13() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:951)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:915) */
        categoryPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis14() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:915) */
        categoryPlot.setRangeAxis(cyclicNumberAxis);
    }
    
    @Test
    public void testSetRangeAxis15() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        NumberAxis numberAxis = ((NumberAxis) createInstance("org.jfree.chart.axis.NumberAxis"));
        numberAxis.setAutoRange(true);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.axis.NumberAxis.autoAdjustRange(NumberAxis.java:434)
            org.jfree.chart.axis.NumberAxis.configure(NumberAxis.java:412)
            org.jfree.chart.axis.Axis.setPlot(Axis.java:899)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:943)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:915) */
        categoryPlot.setRangeAxis(numberAxis);
    }
    
    @Test
    public void testSetRangeAxis16() throws Exception  {
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:951)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:915) */
        categoryPlot.setRangeAxis(null);
    }
    
    @Test
    public void testSetRangeAxis17() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:926)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:915) */
        categoryPlot.setRangeAxis(periodAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxes(org.jfree.chart.axis.ValueAxis[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < axes.length; i++)
 *  */
    @Test
    public void testSetRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRangeAxes(CategoryPlot.java:964) */
        categoryPlot.setRangeAxes(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRangeAxes([Lorg.jfree.chart.axis.ValueAxis;)
    
    @Test
    public void testSetRangeAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxes(CategoryPlot.java:967) */
        categoryPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxes(CategoryPlot.java:965) */
        categoryPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = new org.jfree.chart.axis.ValueAxis[16];
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        valueAxisArray[0] = ((ValueAxis) numberAxis3D);
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        valueAxisArray[1] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[2] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[3] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[4] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[5] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[6] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[7] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[8] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[9] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[10] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[11] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[12] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[13] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[14] = ((ValueAxis) cyclicNumberAxis);
        valueAxisArray[15] = ((ValueAxis) cyclicNumberAxis);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRangeAxis(CategoryPlot.java:945)
            org.jfree.chart.plot.CategoryPlot.setRangeAxes(CategoryPlot.java:965) */
        categoryPlot.setRangeAxes(valueAxisArray);
    }
    
    @Test
    public void testSetRangeAxes4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRangeAxes(CategoryPlot.java:967) */
        categoryPlot.setRangeAxes(valueAxisArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    @Test
    public void testSetRenderer1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.category.CategoryItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.category.CategoryItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1389)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1336) */
        categoryPlot.setRenderer(null);
    }
    
    @Test
    public void testSetRenderer2() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.addChangeListener(AbstractRenderer.java:2387)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1398)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1336) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class minMaxCategoryRendererType = Class.forName("org.jfree.chart.renderer.category.CategoryItemRenderer");
        Method setRendererMethod = categoryPlotClazz.getDeclaredMethod("setRenderer", minMaxCategoryRendererType);
        setRendererMethod.setAccessible(true);
        java.lang.Object[] setRendererMethodArguments = new java.lang.Object[1];
        setRendererMethodArguments[0] = minMaxCategoryRenderer;
        try {
            setRendererMethod.invoke(categoryPlot, setRendererMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetRenderer3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1395)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1336) */
        categoryPlot.setRenderer(null);
    }
    ///endregion
    
    ///region Errors report for setRenderer
    
    public void testSetRenderer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderer(int,org.jfree.chart.renderer.category.CategoryItemRenderer,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (CategoryItemRenderer) this.renderers.get(index)
 *  */
    @Test
    public void testSetRenderer_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.category.CategoryItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.category.CategoryItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1389) */
        categoryPlot.setRenderer(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderer(int,org.jfree.chart.renderer.category.CategoryItemRenderer,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (CategoryItemRenderer) this.renderers.get(index)
 *  */
    @Test
    public void testSetRenderer_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1389) */
        categoryPlot.setRenderer(-255, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)
    
    @Test
    public void testSetRenderer4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1395) */
        categoryPlot.setRenderer(0, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRenderer5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.setRenderer(Integer.MIN_VALUE, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderer
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetRenderer6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.setRenderer(Integer.MIN_VALUE, ((CategoryItemRenderer) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    @Test
    public void testSetRenderer7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureDomainAxes(CategoryPlot.java:867)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1401)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1371) */
        categoryPlot.setRenderer(0, ((CategoryItemRenderer) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderer
    
    ///region OTHER: ERROR SUITE for method setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)
    
    @Test
    public void testSetRenderer8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "increment", 9);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureDomainAxes(CategoryPlot.java:867)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1401)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1357) */
        categoryPlot.setRenderer(((CategoryItemRenderer) null), false);
    }
    
    @Test
    public void testSetRenderer9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureDomainAxes(CategoryPlot.java:867)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1401)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1357) */
        categoryPlot.setRenderer(((CategoryItemRenderer) null), false);
    }
    
    @Test
    public void testSetRenderer10() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureDomainAxes(CategoryPlot.java:867)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1401)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1357) */
        categoryPlot.setRenderer(((CategoryItemRenderer) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.rangeAxes.size();}
 *  */
    @Test
    public void testGetRangeAxisCount_ObjectListSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        int actual = categoryPlot.getRangeAxisCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rangeAxes.size();
 *  */
    @Test
    public void testGetRangeAxisCount_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisCount(CategoryPlot.java:1123) */
        categoryPlot.getRangeAxisCount();
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getRangeAxisCount()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.CategoryPlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisCount()}
     */
    @Test(timeout = 1000L)
    public void testGetRangeAxisCount() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("#$\\\"'");
        defaultCategoryDataset.setGroup(datasetGroup);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabelToolTip("");
        categoryAxis.setMaximumCategoryLabelWidthRatio(java.lang.Float.NEGATIVE_INFINITY);
        Map map = emptyMap();
        Font font = new Font(map);
        categoryAxis.setTickLabelFont(font);
        Map map1 = emptyMap();
        Font font1 = new Font(map1);
        categoryAxis.setLabelFont(font1);
        RectangleInsets rectangleInsets = new RectangleInsets(java.lang.Double.NEGATIVE_INFINITY, -1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY);
        categoryAxis.setTickLabelInsets(rectangleInsets);
        categoryAxis.setLabelAngle(java.lang.Double.NaN);
        float[] floatArray = {};
        Color color = new Color(((ColorSpace) null), floatArray, -1.0f);
        categoryAxis.setLabelPaint(color);
        GradientPaint gradientPaint = new GradientPaint(0.0f, -1.0f, null, -1.0f, java.lang.Float.POSITIVE_INFINITY, null, false);
        categoryAxis.setAxisLinePaint(gradientPaint);
        TexturePaint texturePaint = new TexturePaint(null, null);
        categoryAxis.setTickMarkPaint(texturePaint);
        float[] floatArray1 = {};
        BasicStroke basicStroke = new BasicStroke(-1.0f, 1, 0, java.lang.Float.POSITIVE_INFINITY, floatArray1, java.lang.Float.NaN);
        categoryAxis.setTickMarkStroke(basicStroke);
        PeriodAxis periodAxis = new PeriodAxis("10");
        periodAxis.setFixedAutoRange(-1.0);
        HashMap hashMap = new HashMap();
        Font font2 = new Font(hashMap);
        periodAxis.setTickLabelFont(font2);
        periodAxis.setUpperMargin(0.0);
        Range range = new Range(0.0, -1.0);
        periodAxis.setDefaultAutoRange(range);
        periodAxis.setMinorTickMarkStroke(null);
        Range range1 = new Range(java.lang.Double.NEGATIVE_INFINITY, -1.0);
        periodAxis.setRange(range1);
        HashMap hashMap1 = new HashMap();
        Font font3 = new Font(hashMap1);
        periodAxis.setLabelFont(font3);
        periodAxis.setTickLabelPaint(null);
        periodAxis.setFixedDimension(java.lang.Double.POSITIVE_INFINITY);
        periodAxis.setMinorTickMarkOutsideLength(1.0f);
        StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
        statisticalBarRenderer.setBaseItemLabelPaint(null);
        statisticalBarRenderer.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer.setAutoPopulateSeriesShape(true);
        statisticalBarRenderer.setBaseShape(null);
        statisticalBarRenderer.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer.setBase(-1.0);
        statisticalBarRenderer.setBaseFillPaint(null);
        statisticalBarRenderer.setItemLabelAnchorOffset(-1.0);
        ItemLabelPosition itemLabelPosition = new ItemLabelPosition();
        statisticalBarRenderer.setBaseNegativeItemLabelPosition(itemLabelPosition);
        statisticalBarRenderer.setBasePaint(null);
        CategoryPlot categoryPlot = new CategoryPlot(defaultCategoryDataset, categoryAxis, periodAxis, statisticalBarRenderer);
        BasicStroke basicStroke1 = new BasicStroke(java.lang.Float.NaN, 1, Integer.MAX_VALUE);
        categoryPlot.setOutlineStroke(basicStroke1);
        categoryPlot.setAxisOffset(null);
        categoryPlot.setBackgroundImageAlignment(Integer.MIN_VALUE);
        categoryPlot.setBackgroundImage(null);
        categoryPlot.setParent(null);
        DefaultDrawingSupplier defaultDrawingSupplier = new DefaultDrawingSupplier();
        categoryPlot.setDrawingSupplier(defaultDrawingSupplier);
        BasicStroke basicStroke2 = new BasicStroke(java.lang.Float.NaN);
        categoryPlot.setDomainGridlineStroke(basicStroke2);
        float[] floatArray2 = {};
        Color color1 = new Color(((ColorSpace) null), floatArray2, 0.0f);
        Color color2 = new Color(-1.0f, java.lang.Float.NEGATIVE_INFINITY, 1.0f);
        GradientPaint gradientPaint1 = new GradientPaint(null, color1, null, color2);
        categoryPlot.setRangeCrosshairPaint(gradientPaint1);
        LegendItemCollection legendItemCollection = new LegendItemCollection();
        categoryPlot.setFixedLegendItems(legendItemCollection);
        BasicStroke basicStroke3 = new BasicStroke(0.0f, Integer.MIN_VALUE, 1);
        categoryPlot.setRangeCrosshairStroke(basicStroke3);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        categoryPlot.getRangeAxisCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRenderer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenderer()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer()}
 * @utbot.returnsFrom {@code return getRenderer(0);}
 *  */
    @Test
    public void testGetRenderer_ReturnGetRenderer() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        CategoryItemRenderer actual = categoryPlot.getRenderer();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer()}
 * @utbot.returnsFrom {@code return getRenderer(0);}
 *  */
    @Test
    public void testGetRenderer_ReturnGetRenderer_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        CategoryItemRenderer actual = categoryPlot.getRenderer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenderer()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRenderer(0);
 *  */
    @Test
    public void testGetRenderer_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.category.CategoryItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.category.CategoryItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getRenderer(CategoryPlot.java:1321)
            org.jfree.chart.plot.CategoryPlot.getRenderer(CategoryPlot.java:1306) */
        categoryPlot.getRenderer();
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getRenderer()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.CategoryPlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer()}
     */
    @Test(timeout = 1000L)
    public void testGetRenderer() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("#$\\\"'");
        defaultCategoryDataset.setGroup(datasetGroup);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabelToolTip("");
        categoryAxis.setMaximumCategoryLabelWidthRatio(java.lang.Float.NEGATIVE_INFINITY);
        Map map = emptyMap();
        Font font = new Font(map);
        categoryAxis.setTickLabelFont(font);
        Map map1 = emptyMap();
        Font font1 = new Font(map1);
        categoryAxis.setLabelFont(font1);
        RectangleInsets rectangleInsets = new RectangleInsets(java.lang.Double.NEGATIVE_INFINITY, -1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY);
        categoryAxis.setTickLabelInsets(rectangleInsets);
        categoryAxis.setLabelAngle(java.lang.Double.NaN);
        float[] floatArray = {};
        Color color = new Color(((ColorSpace) null), floatArray, -1.0f);
        categoryAxis.setLabelPaint(color);
        GradientPaint gradientPaint = new GradientPaint(0.0f, -1.0f, null, -1.0f, java.lang.Float.POSITIVE_INFINITY, null, false);
        categoryAxis.setAxisLinePaint(gradientPaint);
        TexturePaint texturePaint = new TexturePaint(null, null);
        categoryAxis.setTickMarkPaint(texturePaint);
        float[] floatArray1 = {};
        BasicStroke basicStroke = new BasicStroke(-1.0f, Integer.MIN_VALUE, 0, java.lang.Float.POSITIVE_INFINITY, floatArray1, java.lang.Float.NaN);
        categoryAxis.setTickMarkStroke(basicStroke);
        PeriodAxis periodAxis = new PeriodAxis("10");
        periodAxis.setFixedAutoRange(-1.0);
        HashMap hashMap = new HashMap();
        Font font2 = new Font(hashMap);
        periodAxis.setTickLabelFont(font2);
        periodAxis.setUpperMargin(0.0);
        Range range = new Range(0.0, -1.0);
        periodAxis.setDefaultAutoRange(range);
        periodAxis.setMinorTickMarkStroke(null);
        Range range1 = new Range(java.lang.Double.NEGATIVE_INFINITY, -1.0);
        periodAxis.setRange(range1);
        HashMap hashMap1 = new HashMap();
        Font font3 = new Font(hashMap1);
        periodAxis.setLabelFont(font3);
        periodAxis.setTickLabelPaint(null);
        periodAxis.setFixedDimension(java.lang.Double.POSITIVE_INFINITY);
        periodAxis.setMinorTickMarkOutsideLength(1.0f);
        StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
        statisticalBarRenderer.setBaseItemLabelPaint(null);
        statisticalBarRenderer.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer.setAutoPopulateSeriesShape(true);
        statisticalBarRenderer.setBaseShape(null);
        statisticalBarRenderer.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer.setBase(-1.0);
        statisticalBarRenderer.setBaseFillPaint(null);
        statisticalBarRenderer.setItemLabelAnchorOffset(-1.0);
        ItemLabelPosition itemLabelPosition = new ItemLabelPosition();
        statisticalBarRenderer.setBaseNegativeItemLabelPosition(itemLabelPosition);
        statisticalBarRenderer.setBasePaint(null);
        CategoryPlot categoryPlot = new CategoryPlot(defaultCategoryDataset, categoryAxis, periodAxis, statisticalBarRenderer);
        BasicStroke basicStroke1 = new BasicStroke(java.lang.Float.NaN, 0, Integer.MAX_VALUE);
        categoryPlot.setOutlineStroke(basicStroke1);
        categoryPlot.setAxisOffset(null);
        categoryPlot.setBackgroundImageAlignment(0);
        categoryPlot.setBackgroundImage(null);
        categoryPlot.setParent(null);
        DefaultDrawingSupplier defaultDrawingSupplier = new DefaultDrawingSupplier();
        categoryPlot.setDrawingSupplier(defaultDrawingSupplier);
        BasicStroke basicStroke2 = new BasicStroke(java.lang.Float.NaN);
        categoryPlot.setDomainGridlineStroke(basicStroke2);
        float[] floatArray2 = {};
        Color color1 = new Color(((ColorSpace) null), floatArray2, 0.0f);
        Color color2 = new Color(-1.0f, java.lang.Float.NEGATIVE_INFINITY, 1.0f);
        GradientPaint gradientPaint1 = new GradientPaint(null, color1, null, color2);
        categoryPlot.setRangeCrosshairPaint(gradientPaint1);
        LegendItemCollection legendItemCollection = new LegendItemCollection();
        categoryPlot.setFixedLegendItems(legendItemCollection);
        BasicStroke basicStroke3 = new BasicStroke(0.0f, 0, Integer.MIN_VALUE);
        categoryPlot.setRangeCrosshairStroke(basicStroke3);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        categoryPlot.getRenderer();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRenderer()
    
    @Test
    public void testGetRenderer1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.getRenderer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRenderer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenderer(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeLessOrEqualIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        CategoryItemRenderer actual = categoryPlot.getRenderer(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeGreaterThanIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        CategoryItemRenderer actual = categoryPlot.getRenderer(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRenderer(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.renderers.size() > index
 *  */
    @Test
    public void testGetRenderer_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRenderer(CategoryPlot.java:1320) */
        categoryPlot.getRenderer(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRenderer(int)
    
    @Test
    public void testGetRenderer2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        CategoryItemRenderer actual = categoryPlot.getRenderer(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AxisLocation location = getRangeAxisLocation(index);
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(CategoryPlot.java:1019)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(CategoryPlot.java:1108) */
        categoryPlot.getRangeAxisEdge(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisEdge(int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisEdge1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge(0);
    }
    
    @Test
    public void testGetRangeAxisEdge2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.getRangeAxisEdge(1073741824);
    }
    
    @Test
    public void testGetRangeAxisEdge3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisEdge(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge
    
    ///region FUZZER: TIMEOUTS for method getRangeAxisEdge()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.CategoryPlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge()}
     */
    @Test(timeout = 1000L)
    public void testGetRangeAxisEdge() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("#$\\\"'");
        defaultCategoryDataset.setGroup(datasetGroup);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabelToolTip("");
        categoryAxis.setMaximumCategoryLabelWidthRatio(java.lang.Float.NEGATIVE_INFINITY);
        Map map = emptyMap();
        Font font = new Font(map);
        categoryAxis.setTickLabelFont(font);
        Map map1 = emptyMap();
        Font font1 = new Font(map1);
        categoryAxis.setLabelFont(font1);
        RectangleInsets rectangleInsets = new RectangleInsets(java.lang.Double.NEGATIVE_INFINITY, -1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY);
        categoryAxis.setTickLabelInsets(rectangleInsets);
        categoryAxis.setLabelAngle(java.lang.Double.NaN);
        float[] floatArray = {};
        Color color = new Color(((ColorSpace) null), floatArray, -1.0f);
        categoryAxis.setLabelPaint(color);
        GradientPaint gradientPaint = new GradientPaint(0.0f, -1.0f, null, -1.0f, java.lang.Float.POSITIVE_INFINITY, null, false);
        categoryAxis.setAxisLinePaint(gradientPaint);
        TexturePaint texturePaint = new TexturePaint(null, null);
        categoryAxis.setTickMarkPaint(texturePaint);
        float[] floatArray1 = {};
        BasicStroke basicStroke = new BasicStroke(-1.0f, Integer.MIN_VALUE, 0, java.lang.Float.POSITIVE_INFINITY, floatArray1, java.lang.Float.NaN);
        categoryAxis.setTickMarkStroke(basicStroke);
        PeriodAxis periodAxis = new PeriodAxis("10");
        periodAxis.setFixedAutoRange(-1.0);
        HashMap hashMap = new HashMap();
        Font font2 = new Font(hashMap);
        periodAxis.setTickLabelFont(font2);
        periodAxis.setUpperMargin(0.0);
        Range range = new Range(0.0, -1.0);
        periodAxis.setDefaultAutoRange(range);
        periodAxis.setMinorTickMarkStroke(null);
        Range range1 = new Range(java.lang.Double.NEGATIVE_INFINITY, -1.0);
        periodAxis.setRange(range1);
        HashMap hashMap1 = new HashMap();
        Font font3 = new Font(hashMap1);
        periodAxis.setLabelFont(font3);
        periodAxis.setTickLabelPaint(null);
        periodAxis.setFixedDimension(java.lang.Double.POSITIVE_INFINITY);
        periodAxis.setMinorTickMarkOutsideLength(1.0f);
        StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
        statisticalBarRenderer.setBaseItemLabelPaint(null);
        statisticalBarRenderer.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer.setAutoPopulateSeriesShape(true);
        statisticalBarRenderer.setBaseShape(null);
        statisticalBarRenderer.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer.setBase(-1.0);
        statisticalBarRenderer.setBaseFillPaint(null);
        statisticalBarRenderer.setItemLabelAnchorOffset(-1.0);
        ItemLabelPosition itemLabelPosition = new ItemLabelPosition();
        statisticalBarRenderer.setBaseNegativeItemLabelPosition(itemLabelPosition);
        statisticalBarRenderer.setBasePaint(null);
        CategoryPlot categoryPlot = new CategoryPlot(defaultCategoryDataset, categoryAxis, periodAxis, statisticalBarRenderer);
        BasicStroke basicStroke1 = new BasicStroke(java.lang.Float.NaN, 0, Integer.MAX_VALUE);
        categoryPlot.setOutlineStroke(basicStroke1);
        categoryPlot.setAxisOffset(null);
        categoryPlot.setBackgroundImageAlignment(0);
        categoryPlot.setBackgroundImage(null);
        categoryPlot.setParent(null);
        DefaultDrawingSupplier defaultDrawingSupplier = new DefaultDrawingSupplier();
        categoryPlot.setDrawingSupplier(defaultDrawingSupplier);
        BasicStroke basicStroke2 = new BasicStroke(java.lang.Float.NaN);
        categoryPlot.setDomainGridlineStroke(basicStroke2);
        float[] floatArray2 = {};
        Color color1 = new Color(((ColorSpace) null), floatArray2, 0.0f);
        Color color2 = new Color(-1.0f, java.lang.Float.NEGATIVE_INFINITY, 1.0f);
        GradientPaint gradientPaint1 = new GradientPaint(null, color1, null, color2);
        categoryPlot.setRangeCrosshairPaint(gradientPaint1);
        LegendItemCollection legendItemCollection = new LegendItemCollection();
        categoryPlot.setFixedLegendItems(legendItemCollection);
        BasicStroke basicStroke3 = new BasicStroke(0.0f, 0, Integer.MIN_VALUE);
        categoryPlot.setRangeCrosshairStroke(basicStroke3);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        categoryPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        Object object = createInstance("java.lang.Object");
        objects[1] = object;
        objects[2] = object;
        objects[3] = object;
        objects[4] = object;
        objects[5] = object;
        objects[6] = object;
        objects[7] = object;
        objects[8] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisEdge()
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisEdge6() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxisEdge7() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge();
    }
    
    @Test
    public void testGetRangeAxisEdge8() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ClassCastException] */
        categoryPlot.getRangeAxisEdge();
    }
    
    @Test
    public void testGetRangeAxisEdge9() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.configureRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureRangeAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 *  */
    @Test
    public void testConfigureRangeAxes_IterateForLoop() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.configureRangeAxes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method configureRangeAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis axis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureRangeAxes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.configureRangeAxes(CategoryPlot.java:1146) */
        categoryPlot.configureRangeAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.configureRangeAxes(CategoryPlot.java:1145) */
        categoryPlot.configureRangeAxes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method configureRangeAxes()
    
    @Test
    public void testConfigureRangeAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        CyclicNumberAxis cyclicNumberAxis = ((CyclicNumberAxis) createInstance("org.jfree.chart.axis.CyclicNumberAxis"));
        objects[0] = ((Object) cyclicNumberAxis);
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.configureRangeAxes();
    }
    
    @Test
    public void testConfigureRangeAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.configureRangeAxes();
    }
    ///endregion
    
    ///region Errors report for configureRangeAxes
    
    public void testConfigureRangeAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.category.CategoryItemRenderer;)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < renderers.length; i++)
 *  */
    @Test
    public void testSetRenderers_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setRenderers(CategoryPlot.java:1416) */
        categoryPlot.setRenderers(null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method setRenderers([Lorg.jfree.chart.renderer.category.CategoryItemRenderer;)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.CategoryPlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])}
     */
    @Test(timeout = 1000L)
    public void testSetRenderersWithEmptyObjectArray() {
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        RectangleInsets rectangleInsets = new RectangleInsets();
        categoryPlot.setAxisOffset(rectangleInsets);
        categoryPlot.setNoDataMessage("10");
        BufferedImage bufferedImage = new BufferedImage(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        bufferedImage.setAccelerationPriority(1.0f);
        categoryPlot.setBackgroundImage(bufferedImage);
        categoryPlot.setBackgroundImageAlpha(1.0f);
        AxisSpace axisSpace = new AxisSpace();
        axisSpace.setRight(0.0);
        axisSpace.setBottom(0.0);
        axisSpace.setTop(-1.0);
        axisSpace.setLeft(java.lang.Double.NEGATIVE_INFINITY);
        categoryPlot.setFixedDomainAxisSpace(axisSpace);
        Color color = new Color(java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.NaN);
        categoryPlot.setOutlinePaint(color);
        categoryPlot.setBackgroundImageAlignment(Integer.MIN_VALUE);
        Color color1 = new Color(-1, false);
        float[] floatArray = {};
        Color color2 = new Color(((ColorSpace) null), floatArray, java.lang.Float.NaN);
        GradientPaint gradientPaint = new GradientPaint(java.lang.Float.POSITIVE_INFINITY, 1.0f, color1, -1.0f, java.lang.Float.NEGATIVE_INFINITY, color2);
        categoryPlot.setBackgroundPaint(gradientPaint);
        BufferedImage bufferedImage1 = new BufferedImage(0, 1, 1);
        bufferedImage1.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage1, null);
        categoryPlot.setDomainGridlinePaint(texturePaint);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = {};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.category.CategoryItemRenderer;)
    
    @Test
    public void testSetRenderers1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.renderer.category.CategoryItemRenderer (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.renderer.category.CategoryItemRenderer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1389)
            org.jfree.chart.plot.CategoryPlot.setRenderers(CategoryPlot.java:1417) */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    
    @Test
    public void testSetRenderers2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = {};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.setRenderers(CategoryPlot.java:1419) */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    
    @Test
    public void testSetRenderers3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1395)
            org.jfree.chart.plot.CategoryPlot.setRenderers(CategoryPlot.java:1417) */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    
    @Test
    public void testSetRenderers4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = new org.jfree.chart.renderer.category.CategoryItemRenderer[9];
        StackedBarRenderer stackedBarRenderer = ((StackedBarRenderer) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer"));
        categoryItemRendererArray[0] = ((CategoryItemRenderer) stackedBarRenderer);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.addChangeListener(AbstractRenderer.java:2387)
            org.jfree.chart.plot.CategoryPlot.setRenderer(CategoryPlot.java:1398)
            org.jfree.chart.plot.CategoryPlot.setRenderers(CategoryPlot.java:1417) */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisIndex_ResultGreaterOrEqualZero() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        objects[0] = ((Object) moduloAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        int actual = categoryPlot.getRangeAxisIndex(moduloAxis);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getParent()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisIndex_NotParentNotInstanceOfCategoryPlot() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        int actual = categoryPlot.getRangeAxisIndex(moduloAxis);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (axis == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: axis == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisIndex_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.getRangeAxisIndex(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int result = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetRangeAxisIndex_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(CategoryPlot.java:987) */
        categoryPlot.getRangeAxisIndex(moduloAxis);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetRangeAxisIndex_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ModuloAxis moduloAxis = ((ModuloAxis) createInstance("org.jfree.chart.axis.ModuloAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(CategoryPlot.java:987) */
        categoryPlot.getRangeAxisIndex(moduloAxis);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetRangeAxisIndex1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        int actual = categoryPlot.getRangeAxisIndex(periodAxis);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    @Test
    public void testGetRangeAxisIndex2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setParent(parent);
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(CategoryPlot.java:987)
            org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(CategoryPlot.java:992) */
        categoryPlot.getRangeAxisIndex(periodAxis);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        int actual = categoryPlot.getIndexOf(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf_2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class waterfallBarRendererType = Class.forName("org.jfree.chart.renderer.category.CategoryItemRenderer");
        Method getIndexOfMethod = categoryPlotClazz.getDeclaredMethod("getIndexOf", waterfallBarRendererType);
        getIndexOfMethod.setAccessible(true);
        java.lang.Object[] getIndexOfMethodArguments = new java.lang.Object[1];
        getIndexOfMethodArguments[0] = waterfallBarRenderer;
        int actual = ((Integer) getIndexOfMethod.invoke(categoryPlot, getIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.returnsFrom {@code return this.renderers.indexOf(renderer);}
 *  */
    @Test
    public void testGetIndexOf_ReturnThisRenderersIndexOf() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        int actual = categoryPlot.getIndexOf(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getIndexOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getIndexOf(CategoryPlot.java:1450) */
        categoryPlot.getIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getIndexOf] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getIndexOf(CategoryPlot.java:1450) */
        categoryPlot.getIndexOf(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    @Test
    public void testGetIndexOf1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 3);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        ScatterRenderer scatterRenderer = ((ScatterRenderer) createInstance("org.jfree.chart.renderer.category.ScatterRenderer"));
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class scatterRendererType = Class.forName("org.jfree.chart.renderer.category.CategoryItemRenderer");
        Method getIndexOfMethod = categoryPlotClazz.getDeclaredMethod("getIndexOf", scatterRendererType);
        getIndexOfMethod.setAccessible(true);
        java.lang.Object[] getIndexOfMethodArguments = new java.lang.Object[1];
        getIndexOfMethodArguments[0] = scatterRenderer;
        int actual = ((Integer) getIndexOfMethod.invoke(categoryPlot, getIndexOfMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset()}
 * @utbot.returnsFrom {@code return getDataset(0);}
 *  */
    @Test
    public void testGetDataset_ReturnGetDataset() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryDataset actual = categoryPlot.getDataset();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset()}
 * @utbot.returnsFrom {@code return getDataset(0);}
 *  */
    @Test
    public void testGetDataset_ReturnGetDataset_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryDataset actual = categoryPlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDataset()
    
    @Test
    public void testGetDataset1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.category.CategoryDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.category.CategoryDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1176)
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1161) */
        categoryPlot.getDataset();
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeLessOrEqualIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryDataset actual = categoryPlot.getDataset(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeGreaterThanIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryDataset actual = categoryPlot.getDataset(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.datasets.size() > index
 *  */
    @Test
    public void testGetDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1175) */
        categoryPlot.getDataset(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataset(int)
    
    @Test
    public void testGetDataset2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryDataset actual = categoryPlot.getDataset(Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDatasetCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDatasetCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDatasetCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return this.datasets.size();}
 *  */
    @Test
    public void testGetDatasetCount_ObjectListSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        int actual = categoryPlot.getDatasetCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDatasetCount()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDatasetCount()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.datasets.size();
 *  */
    @Test
    public void testGetDatasetCount_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDatasetCount] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDatasetCount(CategoryPlot.java:1229) */
        categoryPlot.getDatasetCount();
    }
    ///endregion
    
    ///region Errors report for getDatasetCount
    
    public void testGetDatasetCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearRangeAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testClearRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.clearRangeAxes(CategoryPlot.java:1131) */
        categoryPlot.clearRangeAxes();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearRangeAxes()
    
    @Test
    public void testClearRangeAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeAxes(CategoryPlot.java:1138) */
        categoryPlot.clearRangeAxes();
    }
    
    @Test
    public void testClearRangeAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) categoryPlot);
        objects[2] = ((Object) categoryPlot);
        objects[3] = ((Object) categoryPlot);
        objects[4] = ((Object) categoryPlot);
        objects[5] = ((Object) categoryPlot);
        objects[6] = ((Object) categoryPlot);
        objects[7] = ((Object) categoryPlot);
        objects[8] = ((Object) categoryPlot);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeAxes] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.CategoryPlot.clearRangeAxes(CategoryPlot.java:1138) */
        categoryPlot.clearRangeAxes();
    }
    ///endregion
    
    ///region Errors report for clearRangeAxes
    
    public void testClearRangeAxes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testSetDataset1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.category.CategoryDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.category.CategoryDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1206)
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1193) */
        categoryPlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset2() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        JDBCCategoryDataset jDBCCategoryDataset = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.data.general.AbstractDataset.addChangeListener(AbstractDataset.java:132)
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1212)
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1193) */
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class jDBCCategoryDatasetType = Class.forName("org.jfree.data.category.CategoryDataset");
        Method setDatasetMethod = categoryPlotClazz.getDeclaredMethod("setDataset", jDBCCategoryDatasetType);
        setDatasetMethod.setAccessible(true);
        java.lang.Object[] setDatasetMethodArguments = new java.lang.Object[1];
        setDatasetMethodArguments[0] = jDBCCategoryDataset;
        try {
            setDatasetMethod.invoke(categoryPlot, setDatasetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetDataset3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:126)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1210)
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1193) */
        categoryPlot.setDataset(null);
    }
    ///endregion
    
    ///region Errors report for setDataset
    
    public void testSetDataset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDataset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDataset(int, org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDataset(int,org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CategoryDataset existing = (CategoryDataset) this.datasets.get(index);
 *  */
    @Test
    public void testSetDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.setDataset(CategoryPlot.java:1206) */
        categoryPlot.setDataset(-255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setDataset(int, org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testSetDataset4() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.ArrayIndexOutOfBoundsException] */
        categoryPlot.setDataset(1073741824, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDataset(int, org.jfree.data.category.CategoryDataset)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataset5() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        categoryPlot.setDataset(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.rendererChanged
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method rendererChanged(org.jfree.chart.event.RendererChangeEvent)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent instanceof RendererChangeListener): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getParent()}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: parent instanceof RendererChangeListener
 *  */
    @Test(expected = RuntimeException.class)
    public void testRendererChanged_ThrowRuntimeException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        RingPlot parent = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
        categoryPlot.setParent(parent);
        
        categoryPlot.rendererChanged(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rendererChanged(org.jfree.chart.event.RendererChangeEvent)
    
    @Test
    public void testRendererChanged1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        categoryPlot.setParent(parent);
        RendererChangeEvent rendererChangeEvent = ((RendererChangeEvent) createInstance("org.jfree.chart.event.RendererChangeEvent"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.rendererChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.fireChangeEvent(Plot.java:902)
            org.jfree.chart.plot.XYPlot.rendererChanged(XYPlot.java:4051)
            org.jfree.chart.plot.CategoryPlot.rendererChanged(CategoryPlot.java:1883) */
        categoryPlot.rendererChanged(rendererChangeEvent);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.datasetChanged
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method datasetChanged(org.jfree.data.general.DatasetChangeEvent)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetChanged(org.jfree.data.general.DatasetChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.rangeAxes.size();
 *  */
    @Test
    public void testDatasetChanged_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.datasetChanged(CategoryPlot.java:1855) */
        categoryPlot.datasetChanged(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method datasetChanged(org.jfree.data.general.DatasetChangeEvent)
    
    @Test
    public void testDatasetChanged1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetChanged] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:896)
            org.jfree.chart.plot.CategoryPlot.datasetChanged(CategoryPlot.java:1857) */
        categoryPlot.datasetChanged(null);
    }
    
    @Test
    public void testDatasetChanged2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        SpiderWebPlot parent = ((SpiderWebPlot) createInstance("org.jfree.chart.plot.SpiderWebPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.Plot.datasetChanged(Plot.java:1114)
            org.jfree.chart.plot.CategoryPlot.datasetChanged(CategoryPlot.java:1863) */
        categoryPlot.datasetChanged(null);
    }
    
    @Test
    public void testDatasetChanged3() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetChanged] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:888)
            org.jfree.chart.plot.CategoryPlot.datasetChanged(CategoryPlot.java:1868) */
        categoryPlot.datasetChanged(null);
    }
    ///endregion
    
    ///region Errors report for datasetChanged
    
    public void testDatasetChanged_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getLegendItems()}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLegendItems_ResultNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        LegendItemCollection fixedLegendItems = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        categoryPlot.setFixedLegendItems(fixedLegendItems);
        
        LegendItemCollection actual = categoryPlot.getLegendItems();
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(fixedLegendItems, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getLegendItems()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetLegendItems_ResultEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        LegendItemCollection actual = categoryPlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getLegendItems()}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = this.datasets.size();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getLegendItems(CategoryPlot.java:1772) */
        categoryPlot.getLegendItems();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    @Test
    public void testGetLegendItems1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        LegendItemCollection actual = categoryPlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.handleClick
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Rectangle2D dataArea = info.getDataArea();
 *  */
    @Test
    public void testHandleClick_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.handleClick] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.handleClick(CategoryPlot.java:1803) */
        categoryPlot.handleClick(-255, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#contains(double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dataArea.contains(x, y)
 *  */
    @Test
    public void testHandleClick_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        plotRenderingInfo.setDataArea(null);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.handleClick] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.handleClick(CategoryPlot.java:1804) */
        categoryPlot.handleClick(-255, -255, plotRenderingInfo);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testHandleClick1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        plotRenderingInfo.setDataArea(double1);
        
        categoryPlot.handleClick(0, 0, plotRenderingInfo);
    }
    ///endregion
    
    ///region Errors report for handleClick
    
    public void testHandleClick_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoom
    
    ///region Errors report for zoom
    
    public void testZoom_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
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
        
                java.lang.reflect.Method methodForGetDeclaredFields798068462159000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798068462159000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798068462169000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798068462159000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798068462169000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798068462943300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798068462943300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798068462946200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798068462943300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798068462946200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798068464374200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798068464374200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798068464376800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798068464374200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798068464376800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

