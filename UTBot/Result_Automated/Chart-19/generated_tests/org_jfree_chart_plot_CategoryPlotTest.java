package org.jfree.chart.plot;

import org.junit.Test;
import org.jfree.chart.util.ObjectList;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.general.DatasetGroup;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.util.RectangleInsets;
import java.awt.GradientPaint;
import java.awt.Color;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.axis.AxisSpace;
import java.awt.BasicStroke;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.event.ChartChangeEventType;
import javax.swing.event.EventListenerList;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAnchor;
import sun.swing.PrintColorUIResource;
import java.awt.SystemColor;
import java.awt.Paint;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.util.SortOrder;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import java.awt.Stroke;
import org.jfree.chart.JFreeChart;
import javax.swing.plaf.ColorUIResource;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer3D;
import javax.swing.text.DefaultCaret;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.util.Layer;
import java.util.Collection;
import java.awt.geom.Point2D;
import org.jfree.chart.axis.PeriodAxis;
import java.util.List;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class org_jfree_chart_plot_CategoryPlotTest {
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.render
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#render(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRender_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.render] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.render(null, null, 0, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#render(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryDataset currentDataset = getDataset(index);
 *  */
    @Test
    public void testRender_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.render] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.category.CategoryDataset] */
        categoryPlot.render(null, null, 0, null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test(timeout = 1000L)
    public void testRenderByFuzzer() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setTickMarkOutsideLength(java.lang.Float.NaN);
        CategoryLabelPositions categoryLabelPositions = new CategoryLabelPositions();
        categoryAxis.setCategoryLabelPositions(categoryLabelPositions);
        categoryAxis.setLabel("-3");
        RectangleInsets rectangleInsets = new RectangleInsets();
        categoryAxis.setTickLabelInsets(rectangleInsets);
        categoryAxis.setUpperMargin(java.lang.Double.NEGATIVE_INFINITY);
        categoryAxis.setLabelURL("#$\\\"'");
        GradientPaint gradientPaint = new GradientPaint(-1.0f, java.lang.Float.NEGATIVE_INFINITY, null, 1.0f, java.lang.Float.NaN, null);
        categoryAxis.setTickLabelPaint(gradientPaint);
        Color color = new Color(-1.0f, java.lang.Float.NaN, 1.0f);
        categoryAxis.setAxisLinePaint(color);
        categoryAxis.setLabelAngle(java.lang.Double.NEGATIVE_INFINITY);
        categoryAxis.setCategoryMargin(java.lang.Double.NaN);
        StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
        statisticalBarRenderer.setIncludeBaseInRange(true);
        statisticalBarRenderer.setLegendItemLabelGenerator(null);
        statisticalBarRenderer.setMinimumBarLength(java.lang.Double.POSITIVE_INFINITY);
        statisticalBarRenderer.setBaseToolTipGenerator(null);
        statisticalBarRenderer.setMaximumBarWidth(java.lang.Double.NaN);
        statisticalBarRenderer.setBaseCreateEntities(true);
        statisticalBarRenderer.setBaseItemLabelPaint(null);
        ItemLabelPosition itemLabelPosition = new ItemLabelPosition();
        statisticalBarRenderer.setBaseNegativeItemLabelPosition(itemLabelPosition);
        statisticalBarRenderer.setBase(1.0);
        statisticalBarRenderer.setGradientPaintTransformer(null);
        CategoryPlot categoryPlot = new CategoryPlot(defaultBoxAndWhiskerCategoryDataset, categoryAxis, null, statisticalBarRenderer);
        categoryPlot.setDrawSharedDomainAxis(true);
        categoryPlot.setAxisOffset(null);
        Color color1 = new Color(0, 1, -1, Integer.MAX_VALUE);
        categoryPlot.setRangeCrosshairPaint(color1);
        Color color2 = new Color(-1, true);
        categoryPlot.setNoDataMessagePaint(color2);
        AxisSpace axisSpace = new AxisSpace();
        axisSpace.setBottom(1.0);
        axisSpace.setRight(java.lang.Double.NEGATIVE_INFINITY);
        axisSpace.setTop(java.lang.Double.NaN);
        axisSpace.setLeft(1.0);
        categoryPlot.setFixedRangeAxisSpace(axisSpace);
        BasicStroke basicStroke = new BasicStroke(0.0f, -1, -1, java.lang.Float.NEGATIVE_INFINITY);
        categoryPlot.setDomainGridlineStroke(basicStroke);
        Color color3 = new Color(1);
        Color color4 = new Color(0, Integer.MIN_VALUE, 0);
        GradientPaint gradientPaint1 = new GradientPaint(-1.0f, java.lang.Float.NaN, color3, java.lang.Float.NEGATIVE_INFINITY, -1.0f, color4, true);
        categoryPlot.setDomainGridlinePaint(gradientPaint1);
        categoryPlot.setForegroundAlpha(java.lang.Float.NaN);
        TexturePaint texturePaint = new TexturePaint(null, null);
        categoryPlot.setRangeGridlinePaint(texturePaint);
        categoryPlot.setBackgroundImageAlpha(1.0f);
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        double1.x = 1.0;
        double1.y = java.lang.Double.NaN;
        double1.width = java.lang.Double.NaN;
        double1.height = -1.0;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        categoryPlot.render(null, double1, Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.equals(categoryPlot);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof CategoryPlot)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfCategoryPlot() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        boolean actual = categoryPlot.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof CategoryPlot)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): True}
 *  */
    @Test
    public void testEquals_NotSuperEquals() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        String noDataMessage = "";
        combinedDomainCategoryPlot.setNoDataMessage(noDataMessage);
        
        boolean actual = categoryPlot.equals(combinedDomainCategoryPlot);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof CategoryPlot)): False}
 * @utbot.executesCondition {@code (!super.equals(obj)): True}
 *  */
    @Test
    public void testEquals_NotSuperEquals_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        String noDataMessage = " ";
        categoryPlot.setNoDataMessage(noDataMessage);
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        
        boolean actual = categoryPlot.equals(combinedRangeCategoryPlot);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clone()}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#clone()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryPlot clone = (CategoryPlot) super.clone();
 *  */
    @Test
    public void testClone_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clone] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.plot.Plot] */
        categoryPlot.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotations()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getAnnotations()}
 * @utbot.returnsFrom {@code return this.annotations;}
 *  */
    @Test
    public void testGetAnnotations_ReturnThisAnnotations() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        
        ArrayList actual = ((ArrayList) categoryPlot.getAnnotations());
        
        assertTrue(deepEquals(annotations, actual));
    }
    ///endregion
    
    ///endregion
    
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.readObject] produces [java.lang.NullPointerException] */
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
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = categoryPlotClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(categoryPlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = categoryPlotClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(categoryPlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: stream.defaultReadObject();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReadObject_ThrowIllegalStateException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 256);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = categoryPlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(categoryPlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.writeObject] produces [java.lang.NullPointerException] */
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)}
 *  */
    @Test
    public void testSetFixedDomainAxisSpace() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setFixedDomainAxisSpace(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)}
 *  */
    @Test
    public void testSetFixedRangeAxisSpace() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.setFixedRangeAxisSpace(null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDrawSharedDomainAxis(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDrawSharedDomainAxis(boolean)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetDrawSharedDomainAxis_CategoryPlotNotifyListeners() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setDrawSharedDomainAxis(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDrawSharedDomainAxis(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDrawSharedDomainAxis(boolean)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDrawSharedDomainAxis_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setDrawSharedDomainAxis(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int axisIndex = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetCategoriesForAxis_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getCategoriesForAxis(subCategoryAxis);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int axisIndex = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetCategoriesForAxis_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getCategoriesForAxis(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int axisIndex = this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetCategoriesForAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis] produces [java.lang.NullPointerException] */
        categoryPlot.getCategoriesForAxis(null);
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
    public void testSetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.setDomainAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetDomainAxisLocation_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation] produces [java.lang.NullPointerException] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.domainAxisLocations.set(index, location);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_ThrowIllegalArgumentException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.setDomainAxisLocation(-1, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDatasetToDomainAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#mapDatasetToDomainAxis(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.datasetToDomainAxisMap.set(index, new Integer(axisIndex));
 *  */
    @Test
    public void testMapDatasetToDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis] produces [java.lang.NullPointerException] */
        categoryPlot.mapDatasetToDomainAxis(-255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToDomainAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#mapDatasetToDomainAxis(int,int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.datasetToDomainAxisMap.set(index, new Integer(axisIndex));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxis_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        categoryPlot.mapDatasetToDomainAxis(-1, -255);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis] produces [java.lang.NullPointerException] */
        categoryPlot.mapDatasetToRangeAxis(-255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mapDatasetToRangeAxis(int, int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#mapDatasetToRangeAxis(int,int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.datasetToRangeAxisMap.set(index, new Integer(axisIndex));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToRangeAxis_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        categoryPlot.mapDatasetToRangeAxis(-1, -255);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetDomainGridlinePaint_PaintNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PrintColorUIResource domainGridlinePaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
            Class domainGridlinePaintType = Class.forName("java.awt.Paint");
            Method setDomainGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setDomainGridlinePaint", domainGridlinePaintType);
            setDomainGridlinePaintMethod.setAccessible(true);
            java.lang.Object[] setDomainGridlinePaintMethodArguments = new java.lang.Object[1];
            setDomainGridlinePaintMethodArguments[0] = domainGridlinePaint;
            setDomainGridlinePaintMethod.invoke(categoryPlot, setDomainGridlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialCategoryPlotDomainGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePaint"));
            
            java.lang.Object[] setDomainGridlinePaintMethodArguments1 = new java.lang.Object[1];
            setDomainGridlinePaintMethodArguments1[0] = systemColor;
            setDomainGridlinePaintMethod.invoke(categoryPlot, setDomainGridlinePaintMethodArguments1);
            
            Paint finalCategoryPlotDomainGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePaint"));
            
            assertFalse(initialCategoryPlotDomainGridlinePaint == finalCategoryPlotDomainGridlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDomainGridlinePaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PrintColorUIResource domainGridlinePaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
            Class domainGridlinePaintType = Class.forName("java.awt.Paint");
            Method setDomainGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setDomainGridlinePaint", domainGridlinePaintType);
            setDomainGridlinePaintMethod.setAccessible(true);
            java.lang.Object[] setDomainGridlinePaintMethodArguments = new java.lang.Object[1];
            setDomainGridlinePaintMethodArguments[0] = domainGridlinePaint;
            setDomainGridlinePaintMethod.invoke(categoryPlot, setDomainGridlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            java.lang.Object[] setDomainGridlinePaintMethodArguments1 = new java.lang.Object[1];
            setDomainGridlinePaintMethodArguments1[0] = systemColor;
            try {
                setDomainGridlinePaintMethod.invoke(categoryPlot, setDomainGridlinePaintMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeGridlineStroke()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeGridlineStroke()}
 * @utbot.returnsFrom {@code return this.rangeGridlineStroke;}
 *  */
    @Test
    public void testGetRangeGridlineStroke_ReturnThisRangeGridlineStroke() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        
        BasicStroke actual = ((BasicStroke) categoryPlot.getRangeGridlineStroke());
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(rangeGridlineStroke, actual);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setFixedLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFixedLegendItems(org.jfree.chart.LegendItemCollection)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedLegendItems(org.jfree.chart.LegendItemCollection)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetFixedLegendItems_CategoryPlotNotifyListeners() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LegendItemCollection fixedLegendItems = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
            categoryPlot.setFixedLegendItems(fixedLegendItems);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setFixedLegendItems(null);
            
            LegendItemCollection finalCategoryPlotFixedLegendItems = ((LegendItemCollection) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "fixedLegendItems"));
            
            assertNull(finalCategoryPlotFixedLegendItems);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFixedLegendItems(org.jfree.chart.LegendItemCollection)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setFixedLegendItems(org.jfree.chart.LegendItemCollection)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetFixedLegendItems_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            LegendItemCollection fixedLegendItems = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
            categoryPlot.setFixedLegendItems(fixedLegendItems);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setFixedLegendItems] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setFixedLegendItems(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    public void testSetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.setRangeAxisLocation(0, axisLocation, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test
    public void testSetRangeAxisLocation_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation] produces [java.lang.NullPointerException] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxisLocation(int,org.jfree.chart.axis.AxisLocation,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.rangeAxisLocations.set(index, location);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_ThrowIllegalArgumentException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.setRangeAxisLocation(-1, null, false);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getRangeAxisLocation();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxisLocations.size()): True}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisLocation_ResultNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        AxisLocation actual = categoryPlot.getRangeAxisLocation(0);
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxisLocations.size()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (AxisLocation) this.rangeAxisLocations.get(index);
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getRangeAxisLocation(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxisLocations.size()): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (AxisLocation) this.rangeAxisLocations.get(index);
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisLocation(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxisLocations.size()): False}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.triggersRecursion getRangeAxisLocation, where the test execute conditions:
 *     {@code (index < this.rangeAxisLocations.size()): True}
 * invoke:
 *     {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = AxisLocation.getOpposite(getRangeAxisLocation(0));
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisLocation(1);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxisLocations.size()
 *  */
    @Test
    public void testGetRangeAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisLocation(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisForDataset_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxisForDataset(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisForDataset_ReturnResult_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxisForDataset(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryAxis result = getDomainAxis();
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.getDomainAxisForDataset(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Integer axisIndex = (Integer) this.datasetToDomainAxisMap.get(index);
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowClassCastException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        CombinedDomainXYPlot parent = ((CombinedDomainXYPlot) createInstance("org.jfree.chart.plot.CombinedDomainXYPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        categoryPlot.getDomainAxisForDataset(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToDomainAxisMap.get(index);
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        objects[0] = ((Object) subCategoryAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisForDataset(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToDomainAxisMap.get(index);
 *  */
    @Test
    public void testGetDomainAxisForDataset_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisForDataset(-255);
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} twice
 *  */
    @Test
    public void testConfigureDomainAxes_AxisEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        categoryPlot.configureDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} twice
 *  */
    @Test
    public void testConfigureDomainAxes_AxisNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        objects[0] = ((Object) subCategoryAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        categoryPlot.configureDomainAxes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method configureDomainAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryAxis axis = (CategoryAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureDomainAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.configureDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: CategoryAxis axis = (CategoryAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureDomainAxes] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.configureDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testConfigureDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureDomainAxes] produces [java.lang.NullPointerException] */
        categoryPlot.configureDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisForDataset_ReturnResult() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxisForDataset(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisForDataset_ReturnResult_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxisForDataset(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisForDataset(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis result = getRangeAxis();
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.getRangeAxisForDataset(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Integer axisIndex = (Integer) this.datasetToRangeAxisMap.get(index);
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowClassCastException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        categoryPlot.getRangeAxisForDataset(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToRangeAxisMap.get(index);
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SymbolAxis symbolAxis = ((SymbolAxis) createInstance("org.jfree.chart.axis.SymbolAxis"));
        objects[0] = ((Object) symbolAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisForDataset(-255);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer axisIndex = (Integer) this.datasetToRangeAxisMap.get(index);
 *  */
    @Test
    public void testGetRangeAxisForDataset_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisForDataset(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setColumnRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setColumnRenderingOrder(org.jfree.chart.util.SortOrder)}
 *  */
    @Test
    public void testSetColumnRenderingOrder() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder columnRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setColumnRenderingOrder(columnRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            SortOrder initialCategoryPlotColumnRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "columnRenderingOrder"));
            
            categoryPlot.setColumnRenderingOrder(sortOrder);
            
            SortOrder finalCategoryPlotColumnRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "columnRenderingOrder"));
            
            assertFalse(initialCategoryPlotColumnRenderingOrder == finalCategoryPlotColumnRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setColumnRenderingOrder(org.jfree.chart.util.SortOrder)}
 *  */
    @Test
    public void testSetColumnRenderingOrder_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder columnRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setColumnRenderingOrder(columnRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            SortOrder initialCategoryPlotColumnRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "columnRenderingOrder"));
            
            categoryPlot.setColumnRenderingOrder(sortOrder);
            
            SortOrder finalCategoryPlotColumnRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "columnRenderingOrder"));
            
            assertFalse(initialCategoryPlotColumnRenderingOrder == finalCategoryPlotColumnRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setColumnRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setColumnRenderingOrder(org.jfree.chart.util.SortOrder)}
 * @utbot.executesCondition {@code (order == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetColumnRenderingOrder_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder columnRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setColumnRenderingOrder(columnRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setColumnRenderingOrder(sortOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)}
 * @utbot.executesCondition {@code (order == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetDatasetRenderingOrder_OrderNotEqualsNull() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            DatasetRenderingOrder renderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderingOrder", renderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            DatasetRenderingOrder datasetRenderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
            
            DatasetRenderingOrder initialCategoryPlotRenderingOrder = ((DatasetRenderingOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderingOrder"));
            
            categoryPlot.setDatasetRenderingOrder(datasetRenderingOrder);
            
            DatasetRenderingOrder finalCategoryPlotRenderingOrder = ((DatasetRenderingOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderingOrder"));
            
            assertFalse(initialCategoryPlotRenderingOrder == finalCategoryPlotRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)}
 * @utbot.executesCondition {@code (order == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDatasetRenderingOrder_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            DatasetRenderingOrder renderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderingOrder", renderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            DatasetRenderingOrder datasetRenderingOrder = ((DatasetRenderingOrder) createInstance("org.jfree.chart.plot.DatasetRenderingOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setDatasetRenderingOrder(datasetRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.domainAxisLocations.size()): True}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxisLocation_ResultNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = categoryPlot.getDomainAxisLocation(0);
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.domainAxisLocations.size()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (AxisLocation) this.domainAxisLocations.get(index);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getDomainAxisLocation(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.domainAxisLocations.size()): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (AxisLocation) this.domainAxisLocations.get(index);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisLocation(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.executesCondition {@code (index < this.domainAxisLocations.size()): False}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.triggersRecursion getDomainAxisLocation, where the test execute conditions:
 *     {@code (index < this.domainAxisLocations.size()): True}
 * invoke:
 *     {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = AxisLocation.getOpposite(getDomainAxisLocation(0));
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisLocation(1);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxisLocations.size()
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisLocation(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxisLocation()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.returnsFrom {@code return getDomainAxisLocation(0);}
 *  */
    @Test
    public void testGetDomainAxisLocation_CategoryPlotGetDomainAxisLocation() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        AxisLocation actual = categoryPlot.getDomainAxisLocation();
        
        // org.jfree.chart.axis.AxisLocation has overridden equals method
        assertEquals(axisLocation, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisLocation()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDomainAxisLocation(0);
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getDomainAxisLocation();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDomainAxisLocation_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisLocation();
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRendererForDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRendererForDataset(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRendererForDataset_IterateForLoop() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        CategoryItemRenderer actual = categoryPlot.getRendererForDataset(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRendererForDataset_ThisDatasetsGetNotEqualsDataset() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        
        CategoryItemRenderer actual = categoryPlot.getRendererForDataset(defaultBoxAndWhiskerCategoryDataset);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRendererForDataset_ThisDatasetsGetEqualsDataset() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        Object actual = categoryPlot.getRendererForDataset(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRendererForDataset(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: this.datasets.get(i) == dataset
 *  */
    @Test
    public void testGetRendererForDataset_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRendererForDataset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRendererForDataset(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRendererForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getRendererForDataset(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRendererForDataset(org.jfree.data.category.CategoryDataset)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (CategoryItemRenderer) this.renderers.get(i);
 *  */
    @Test
    public void testGetRendererForDataset_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRendererForDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getRendererForDataset(null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRowRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRowRenderingOrder(org.jfree.chart.util.SortOrder)}
 *  */
    @Test
    public void testSetRowRenderingOrder() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder rowRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setRowRenderingOrder(rowRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            SortOrder initialCategoryPlotRowRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rowRenderingOrder"));
            
            categoryPlot.setRowRenderingOrder(sortOrder);
            
            SortOrder finalCategoryPlotRowRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rowRenderingOrder"));
            
            assertFalse(initialCategoryPlotRowRenderingOrder == finalCategoryPlotRowRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRowRenderingOrder(org.jfree.chart.util.SortOrder)}
 *  */
    @Test
    public void testSetRowRenderingOrder_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder rowRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setRowRenderingOrder(rowRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            SortOrder initialCategoryPlotRowRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rowRenderingOrder"));
            
            categoryPlot.setRowRenderingOrder(sortOrder);
            
            SortOrder finalCategoryPlotRowRenderingOrder = ((SortOrder) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rowRenderingOrder"));
            
            assertFalse(initialCategoryPlotRowRenderingOrder == finalCategoryPlotRowRenderingOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRowRenderingOrder(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRowRenderingOrder(org.jfree.chart.util.SortOrder)}
 * @utbot.executesCondition {@code (order == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRowRenderingOrder_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            SortOrder rowRenderingOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            categoryPlot.setRowRenderingOrder(rowRenderingOrder);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRowRenderingOrder(sortOrder);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)}
 *  */
    @Test
    public void testSetDomainGridlinePosition() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
            categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            CategoryAnchor categoryAnchor = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
            
            CategoryAnchor initialCategoryPlotDomainGridlinePosition = ((CategoryAnchor) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePosition"));
            
            categoryPlot.setDomainGridlinePosition(categoryAnchor);
            
            CategoryAnchor finalCategoryPlotDomainGridlinePosition = ((CategoryAnchor) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePosition"));
            
            assertFalse(initialCategoryPlotDomainGridlinePosition == finalCategoryPlotDomainGridlinePosition);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)}
 *  */
    @Test
    public void testSetDomainGridlinePosition_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
            categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            CategoryAnchor categoryAnchor = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
            
            CategoryAnchor initialCategoryPlotDomainGridlinePosition = ((CategoryAnchor) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePosition"));
            
            categoryPlot.setDomainGridlinePosition(categoryAnchor);
            
            CategoryAnchor finalCategoryPlotDomainGridlinePosition = ((CategoryAnchor) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinePosition"));
            
            assertFalse(initialCategoryPlotDomainGridlinePosition == finalCategoryPlotDomainGridlinePosition);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)}
 * @utbot.executesCondition {@code (position == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDomainGridlinePosition_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
            categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDomainGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetDomainGridlineStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke domainGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setDomainGridlineStroke(domainGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotDomainGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlineStroke"));
            
            categoryPlot.setDomainGridlineStroke(basicStroke);
            
            Stroke finalCategoryPlotDomainGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlineStroke"));
            
            assertFalse(initialCategoryPlotDomainGridlineStroke == finalCategoryPlotDomainGridlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetDomainGridlineStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke domainGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setDomainGridlineStroke(domainGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotDomainGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlineStroke"));
            
            categoryPlot.setDomainGridlineStroke(basicStroke);
            
            Stroke finalCategoryPlotDomainGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlineStroke"));
            
            assertFalse(initialCategoryPlotDomainGridlineStroke == finalCategoryPlotDomainGridlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDomainGridlineStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke domainGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setDomainGridlineStroke(domainGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setDomainGridlineStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainGridlinesVisible != visible): True}
 *  */
    @Test
    public void testSetDomainGridlinesVisible_ThisDomainGridlinesVisibleNotEqualsVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setDomainGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setDomainGridlinesVisible(false);
            
            boolean finalCategoryPlotDomainGridlinesVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinesVisible"));
            
            assertFalse(finalCategoryPlotDomainGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainGridlinesVisible != visible): True}
 *  */
    @Test
    public void testSetDomainGridlinesVisible_ThisDomainGridlinesVisibleNotEqualsVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setDomainGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setDomainGridlinesVisible(false);
            
            boolean finalCategoryPlotDomainGridlinesVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainGridlinesVisible"));
            
            assertFalse(finalCategoryPlotDomainGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.domainGridlinesVisible != visible): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDomainGridlinesVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setDomainGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setDomainGridlinesVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThisRangeGridlinesVisibleNotEqualsVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeGridlinesVisible(false);
            
            boolean finalCategoryPlotRangeGridlinesVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinesVisible"));
            
            assertFalse(finalCategoryPlotRangeGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThisRangeGridlinesVisibleNotEqualsVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeGridlinesVisible(false);
            
            boolean finalCategoryPlotRangeGridlinesVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinesVisible"));
            
            assertFalse(finalCategoryPlotRangeGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThisRangeGridlinesVisibleNotEqualsVisible_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList categoryPlotListenerList = ((EventListenerList) getFieldValue(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] categoryPlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(categoryPlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCategoryPlotListenerListListenerList0 = get(categoryPlotListenerListListenerListListenerList, 0);
            
            categoryPlot.setRangeGridlinesVisible(false);
            
            boolean finalCategoryPlotRangeGridlinesVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinesVisible"));
            EventListenerList categoryPlotListenerList1 = ((EventListenerList) getFieldValue(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] categoryPlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(categoryPlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCategoryPlotListenerListListenerList0 = get(categoryPlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCategoryPlotListenerListListenerList0 == finalCategoryPlotListenerListListenerList0);
            
            assertFalse(finalCategoryPlotRangeGridlinesVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeGridlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinesVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeGridlinesVisible != visible): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeGridlinesVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeGridlinesVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeGridlinesVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetRangeGridlineStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotRangeGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlineStroke"));
            
            categoryPlot.setRangeGridlineStroke(basicStroke);
            
            Stroke finalCategoryPlotRangeGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlineStroke"));
            
            assertFalse(initialCategoryPlotRangeGridlineStroke == finalCategoryPlotRangeGridlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetRangeGridlineStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotRangeGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlineStroke"));
            
            categoryPlot.setRangeGridlineStroke(basicStroke);
            
            Stroke finalCategoryPlotRangeGridlineStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlineStroke"));
            
            assertFalse(initialCategoryPlotRangeGridlineStroke == finalCategoryPlotRangeGridlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeGridlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeGridlineStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeGridlineStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainGridlineStroke()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainGridlineStroke()}
 * @utbot.returnsFrom {@code return this.domainGridlineStroke;}
 *  */
    @Test
    public void testGetDomainGridlineStroke_ReturnThisDomainGridlineStroke() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        BasicStroke domainGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setDomainGridlineStroke(domainGridlineStroke);
        
        BasicStroke actual = ((BasicStroke) categoryPlot.getDomainGridlineStroke());
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(domainGridlineStroke, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinePaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetRangeGridlinePaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            Color rangeGridlinePaint = ((Color) createInstance("java.awt.Color"));
            categoryPlot.setRangeGridlinePaint(rangeGridlinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCategoryPlotRangeGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinePaint"));
            
            categoryPlot.setRangeGridlinePaint(color);
            
            Paint finalCategoryPlotRangeGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinePaint"));
            
            assertFalse(initialCategoryPlotRangeGridlinePaint == finalCategoryPlotRangeGridlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinePaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetRangeGridlinePaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            Color rangeGridlinePaint = ((Color) createInstance("java.awt.Color"));
            categoryPlot.setRangeGridlinePaint(rangeGridlinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCategoryPlotRangeGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinePaint"));
            
            categoryPlot.setRangeGridlinePaint(color);
            
            Paint finalCategoryPlotRangeGridlinePaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeGridlinePaint"));
            
            assertFalse(initialCategoryPlotRangeGridlinePaint == finalCategoryPlotRangeGridlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeGridlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeGridlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeGridlinePaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ColorUIResource rangeGridlinePaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
            Class rangeGridlinePaintType = Class.forName("java.awt.Paint");
            Method setRangeGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeGridlinePaint", rangeGridlinePaintType);
            setRangeGridlinePaintMethod.setAccessible(true);
            java.lang.Object[] setRangeGridlinePaintMethodArguments = new java.lang.Object[1];
            setRangeGridlinePaintMethodArguments[0] = rangeGridlinePaint;
            setRangeGridlinePaintMethod.invoke(categoryPlot, setRangeGridlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeGridlinePaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    public void testDatasetsMappedToDomainAxis_IterateForLoop() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_DatasetEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_AxisIndexNotEqualsZero() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object dataset = this.datasets.get(datasetIndex);
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ThrowIndexOutOfBoundsException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Integer m = (Integer) this.datasetToDomainAxisMap.get(datasetIndex);
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList datasetToDomainAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {};
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(datasetToDomainAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxisMap", datasetToDomainAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis] produces [java.lang.NullPointerException] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToDomainAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int datasetIndex = 0; datasetIndex < this.datasets.size(); datasetIndex++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer m = (Integer) this.datasetToDomainAxisMap.get(datasetIndex);
 *  */
    @Test
    public void testDatasetsMappedToDomainAxis_ThrowNullPointerException_1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis] produces [java.lang.NullPointerException] */
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeCrosshairStroke()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeCrosshairStroke()}
 * @utbot.returnsFrom {@code return this.rangeCrosshairStroke;}
 *  */
    @Test
    public void testGetRangeCrosshairStroke_ReturnThisRangeCrosshairStroke() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        BasicStroke rangeCrosshairStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeCrosshairStroke(rangeCrosshairStroke);
        
        BasicStroke actual = ((BasicStroke) categoryPlot.getRangeCrosshairStroke());
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(rangeCrosshairStroke, actual);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDrawDomainGridlines_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
        categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawDomainGridlines] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.drawDomainGridlines(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDrawDomainGridlines_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
        categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawDomainGridlines] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.drawDomainGridlines(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#isDomainGridlinesVisible()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainGridlinePosition()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: RectangleEdge domainAxisEdge = getDomainAxisEdge();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainGridlines_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        categoryPlot.setDomainGridlinesVisible(true);
        CategoryAnchor domainGridlinePosition = ((CategoryAnchor) createInstance("org.jfree.chart.axis.CategoryAnchor"));
        categoryPlot.setDomainGridlinePosition(domainGridlinePosition);
        
        categoryPlot.drawDomainGridlines(null, null);
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
    public void testDatasetsMappedToRangeAxis_IterateForLoop() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_DatasetEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_IndexNotEqualsZero() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object dataset = this.datasets.get(i);
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowIndexOutOfBoundsException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Integer m = (Integer) this.datasetToRangeAxisMap.get(i);
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {};
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Integer m = (Integer) this.datasetToRangeAxisMap.get(i);
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowClassCastException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList datasetToRangeAxisMap = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        objects1[0] = object;
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(datasetToRangeAxisMap, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToRangeAxisMap", datasetToRangeAxisMap);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.datasets.size(); i++)
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowNullPointerException() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.NullPointerException] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#datasetsMappedToRangeAxis(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.datasets.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer m = (Integer) this.datasetToRangeAxisMap.get(i);
 *  */
    @Test
    public void testDatasetsMappedToRangeAxis_ThrowNullPointerException_1() throws Throwable  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis] produces [java.lang.NullPointerException] */
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairLockedOnData != flag): True}
 *  */
    @Test
    public void testSetRangeCrosshairLockedOnData_ThisRangeCrosshairLockedOnDataNotEqualsFlag() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairLockedOnData(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairLockedOnData(false);
            
            boolean finalCategoryPlotRangeCrosshairLockedOnData = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairLockedOnData"));
            
            assertFalse(finalCategoryPlotRangeCrosshairLockedOnData);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairLockedOnData != flag): True}
 *  */
    @Test
    public void testSetRangeCrosshairLockedOnData_ThisRangeCrosshairLockedOnDataNotEqualsFlag_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairLockedOnData(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairLockedOnData(false);
            
            boolean finalCategoryPlotRangeCrosshairLockedOnData = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairLockedOnData"));
            
            assertFalse(finalCategoryPlotRangeCrosshairLockedOnData);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairLockedOnData(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairLockedOnData(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairLockedOnData != flag): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeCrosshairLockedOnData_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairLockedOnData(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairLockedOnData(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
 *     notifyListeners(new PlotChangeEvent(this));
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isRangeCrosshairVisible() && notify) {
 *     notifyListeners(new PlotChangeEvent(this));
 * }): True}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN, true);
            
            double finalCategoryPlotRangeCrosshairValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotRangeCrosshairValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isRangeCrosshairVisible() && notify) {
 *     notifyListeners(new PlotChangeEvent(this));
 * }): True}
 *  */
    @Test
    public void testSetRangeCrosshairValue_IsRangeCrosshairVisibleAndNotify_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN, true);
            
            double finalCategoryPlotRangeCrosshairValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotRangeCrosshairValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.executesCondition {@code (isRangeCrosshairVisible() && notify): True}
 * @utbot.executesCondition {@code (if (isRangeCrosshairVisible() && notify) {
 *     notifyListeners(new PlotChangeEvent(this));
 * }): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#isRangeCrosshairVisible()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeCrosshairValue_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairValue(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double)}
 *  */
    @Test
    public void testSetRangeCrosshairValue() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        
        categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double)}
 *  */
    @Test
    public void testSetRangeCrosshairValue_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
            
            double finalCategoryPlotRangeCrosshairValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotRangeCrosshairValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double)}
 *  */
    @Test
    public void testSetRangeCrosshairValue_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
            
            double finalCategoryPlotRangeCrosshairValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotRangeCrosshairValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairValue(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairValue(double,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setRangeCrosshairValue(value, true);
 *  */
    @Test
    public void testSetRangeCrosshairValue_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            categoryPlot.setRangeCrosshairValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairValue(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairVisible != flag): True}
 *  */
    @Test
    public void testSetRangeCrosshairVisible_ThisRangeCrosshairVisibleNotEqualsFlag() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairVisible(false);
            
            boolean finalCategoryPlotRangeCrosshairVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairVisible"));
            
            assertFalse(finalCategoryPlotRangeCrosshairVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairVisible != flag): True}
 *  */
    @Test
    public void testSetRangeCrosshairVisible_ThisRangeCrosshairVisibleNotEqualsFlag_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setRangeCrosshairVisible(false);
            
            boolean finalCategoryPlotRangeCrosshairVisible = ((Boolean) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairVisible"));
            
            assertFalse(finalCategoryPlotRangeCrosshairVisible);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairVisible(boolean)}
 * @utbot.executesCondition {@code (this.rangeCrosshairVisible != flag): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeCrosshairVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setRangeCrosshairVisible(true);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetRangeCrosshairStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeCrosshairStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeCrosshairStroke(rangeCrosshairStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotRangeCrosshairStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairStroke"));
            
            categoryPlot.setRangeCrosshairStroke(basicStroke);
            
            Stroke finalCategoryPlotRangeCrosshairStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairStroke"));
            
            assertFalse(initialCategoryPlotRangeCrosshairStroke == finalCategoryPlotRangeCrosshairStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetRangeCrosshairStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeCrosshairStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeCrosshairStroke(rangeCrosshairStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialCategoryPlotRangeCrosshairStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairStroke"));
            
            categoryPlot.setRangeCrosshairStroke(basicStroke);
            
            Stroke finalCategoryPlotRangeCrosshairStroke = ((Stroke) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairStroke"));
            
            assertFalse(initialCategoryPlotRangeCrosshairStroke == finalCategoryPlotRangeCrosshairStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeCrosshairStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            BasicStroke rangeCrosshairStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            categoryPlot.setRangeCrosshairStroke(rangeCrosshairStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateDomainAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.executesCondition {@code (this.fixedDomainAxisSpace != null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getDomainAxisLocation()
 *  */
    @Test
    public void testCalculateDomainAxisSpace_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.calculateDomainAxisSpace(null, null, axisSpace);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRangeCrosshairPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetRangeCrosshairPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            Color rangeCrosshairPaint = ((Color) createInstance("java.awt.Color"));
            categoryPlot.setRangeCrosshairPaint(rangeCrosshairPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCategoryPlotRangeCrosshairPaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairPaint"));
            
            categoryPlot.setRangeCrosshairPaint(color);
            
            Paint finalCategoryPlotRangeCrosshairPaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairPaint"));
            
            assertFalse(initialCategoryPlotRangeCrosshairPaint == finalCategoryPlotRangeCrosshairPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetRangeCrosshairPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            Color rangeCrosshairPaint = ((Color) createInstance("java.awt.Color"));
            categoryPlot.setRangeCrosshairPaint(rangeCrosshairPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialCategoryPlotRangeCrosshairPaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairPaint"));
            
            categoryPlot.setRangeCrosshairPaint(color);
            
            Paint finalCategoryPlotRangeCrosshairPaint = ((Paint) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeCrosshairPaint"));
            
            assertFalse(initialCategoryPlotRangeCrosshairPaint == finalCategoryPlotRangeCrosshairPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRangeCrosshairPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeCrosshairPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetRangeCrosshairPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ColorUIResource rangeCrosshairPaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
            Class rangeCrosshairPaintType = Class.forName("java.awt.Paint");
            Method setRangeCrosshairPaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeCrosshairPaint", rangeCrosshairPaintType);
            setRangeCrosshairPaintMethod.setAccessible(true);
            java.lang.Object[] setRangeCrosshairPaintMethodArguments = new java.lang.Object[1];
            setRangeCrosshairPaintMethodArguments[0] = rangeCrosshairPaint;
            setRangeCrosshairPaintMethod.invoke(categoryPlot, setRangeCrosshairPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setRangeCrosshairPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.returnsFrom {@code return space;}
 *  */
    @Test
    public void testCalculateRangeAxisSpace_IterateForLoop() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        AxisSpace actual = categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
        
        // org.jfree.chart.axis.AxisSpace has overridden equals method
        assertEquals(axisSpace, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} twice
 * @utbot.returnsFrom {@code return space;}
 *  */
    @Test
    public void testCalculateRangeAxisSpace_YAxisEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
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
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Axis yAxis = (Axis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.Axis] */
        categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Axis yAxis = (Axis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        AxisSpace axisSpace = new AxisSpace();
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException] */
        categoryPlot.calculateRangeAxisSpace(null, null, axisSpace);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.executesCondition {@code (space == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testCalculateRangeAxisSpace_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace] produces [java.lang.NullPointerException] */
        categoryPlot.calculateRangeAxisSpace(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxis(int,org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setDomainAxis(int,org.jfree.chart.axis.CategoryAxis,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: setDomainAxis(index, axis, true);
 *  */
    @Test
    public void testSetDomainAxis_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.setDomainAxis(0, null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.setDomainAxis(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxis(int,org.jfree.chart.axis.CategoryAxis,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CategoryAxis existing = (CategoryAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testSetDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxis] produces [java.lang.NullPointerException] */
        categoryPlot.setDomainAxis(-255, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDomainAxes([Lorg.jfree.chart.axis.CategoryAxis;)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxes(org.jfree.chart.axis.CategoryAxis[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < axes.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setDomainAxis(i, axes[i], false);
 *  */
    @Test
    public void testSetDomainAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray = {null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.setDomainAxes(categoryAxisArray);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDomainAxes(org.jfree.chart.axis.CategoryAxis[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < axes.length; i++)
 *  */
    @Test
    public void testSetDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDomainAxes] produces [java.lang.NullPointerException] */
        categoryPlot.setDomainAxes(null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisCount] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearDomainAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearDomainAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryAxis axis = (CategoryAxis) this.domainAxes.get(i);
 *  */
    @Test
    public void testClearDomainAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.clearDomainAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearDomainAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.domainAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.domainAxes.size(); i++)
 *  */
    @Test
    public void testClearDomainAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearDomainAxes] produces [java.lang.NullPointerException] */
        categoryPlot.clearDomainAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setOrientation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 *  */
    @Test
    public void testSetOrientation() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            categoryPlot.setOrientation(orientation);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            
            PlotOrientation initialCategoryPlotOrientation = ((PlotOrientation) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "orientation"));
            
            categoryPlot.setOrientation(plotOrientation);
            
            PlotOrientation finalCategoryPlotOrientation = ((PlotOrientation) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "orientation"));
            
            assertFalse(initialCategoryPlotOrientation == finalCategoryPlotOrientation);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 *  */
    @Test
    public void testSetOrientation_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            categoryPlot.setOrientation(orientation);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            
            PlotOrientation initialCategoryPlotOrientation = ((PlotOrientation) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "orientation"));
            
            categoryPlot.setOrientation(plotOrientation);
            
            PlotOrientation finalCategoryPlotOrientation = ((PlotOrientation) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "orientation"));
            
            assertFalse(initialCategoryPlotOrientation == finalCategoryPlotOrientation);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setOrientation(org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setOrientation(org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetOrientation_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            categoryPlot.setOrientation(orientation);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setOrientation] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setOrientation(plotOrientation);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.returnsFrom {@code return getRangeAxis(0);}
 *  */
    @Test
    public void testGetRangeAxis_ReturnGetRangeAxis_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        objects[0] = ((Object) numberAxis3D);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        NumberAxis3D actual = ((NumberAxis3D) categoryPlot.getRangeAxis());
        
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.returnsFrom {@code return getRangeAxis(0);}
 *  */
    @Test
    public void testGetRangeAxis_ReturnGetRangeAxis() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = categoryPlot.getRangeAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxis_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxis();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRangeAxis(0);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.getRangeAxis();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRangeAxis(0);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CombinedDomainCategoryPlot parent = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.getRangeAxis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_ResultNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        SymbolAxis symbolAxis = ((SymbolAxis) createInstance("org.jfree.chart.axis.SymbolAxis"));
        objects[0] = ((Object) symbolAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        SymbolAxis actual = ((SymbolAxis) categoryPlot.getRangeAxis(0));
        
        // org.jfree.chart.axis.SymbolAxis has overridden equals method
        assertEquals(symbolAxis, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): False}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
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
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_NotParentNotInstanceOfCategoryPlot() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        Object actual = categoryPlot.getRangeAxis(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.getRangeAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.executesCondition {@code (index < this.rangeAxes.size()): False}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getParent()}
 * @utbot.triggersRecursion getRangeAxis, where the test execute conditions:
 *     {@code (index < this.rangeAxes.size()): True}
 * invoke:
 *     {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = cp.getRangeAxis(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowIndexOutOfBoundsException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.rangeAxes.size()
 *  */
    @Test
    public void testGetRangeAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxis] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxis(-255);
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
    public void testGetDomainAxisIndex_ReturnThisDomainAxesIndexOf() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        int actual = categoryPlot.getDomainAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.returnsFrom {@code return this.domainAxes.indexOf(axis);}
 *  */
    @Test
    public void testGetDomainAxisIndex_ReturnThisDomainAxesIndexOf_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        ExtendedCategoryAxis extendedCategoryAxis = ((ExtendedCategoryAxis) createInstance("org.jfree.chart.axis.ExtendedCategoryAxis"));
        
        int actual = categoryPlot.getDomainAxisIndex(extendedCategoryAxis);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.returnsFrom {@code return this.domainAxes.indexOf(axis);}
 *  */
    @Test
    public void testGetDomainAxisIndex_ReturnThisDomainAxesIndexOf_2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        int actual = categoryPlot.getDomainAxisIndex(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDomainAxisIndex_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisIndex(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.domainAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDomainAxisIndex_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxisIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getDomainAxisEdge(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AxisLocation location = getDomainAxisLocation(index);
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowClassCastException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getDomainAxisEdge(1);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = Plot.resolveDomainAxisLocation(location, this.orientation);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxisEdge()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDomainAxisEdge(0);
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getDomainAxisEdge();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDomainAxisEdge_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxisEdge()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getDomainAxisEdge(0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisEdge_ThrowIllegalArgumentException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        categoryPlot.getDomainAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setAxisOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAxisOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetAxisOffset() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            RectangleInsets axisOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            categoryPlot.setAxisOffset(axisOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            
            categoryPlot.setAxisOffset(rectangleInsets);
            
            RectangleInsets finalCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            
            assertFalse(initialCategoryPlotAxisOffset == finalCategoryPlotAxisOffset);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetAxisOffset_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            RectangleInsets axisOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            categoryPlot.setAxisOffset(axisOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            
            categoryPlot.setAxisOffset(rectangleInsets);
            
            RectangleInsets finalCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            
            assertFalse(initialCategoryPlotAxisOffset == finalCategoryPlotAxisOffset);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetAxisOffset_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            RectangleInsets axisOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            categoryPlot.setAxisOffset(axisOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            EventListenerList categoryPlotListenerList = ((EventListenerList) getFieldValue(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] categoryPlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(categoryPlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialCategoryPlotListenerListListenerList0 = get(categoryPlotListenerListListenerListListenerList, 0);
            
            categoryPlot.setAxisOffset(rectangleInsets);
            
            RectangleInsets finalCategoryPlotAxisOffset = ((RectangleInsets) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "axisOffset"));
            EventListenerList categoryPlotListenerList1 = ((EventListenerList) getFieldValue(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] categoryPlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(categoryPlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalCategoryPlotListenerListListenerList0 = get(categoryPlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialCategoryPlotAxisOffset == finalCategoryPlotAxisOffset);
            
            assertFalse(initialCategoryPlotListenerListListenerList0 == finalCategoryPlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAxisOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAxisOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (offset == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetAxisOffset_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            RectangleInsets axisOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            categoryPlot.setAxisOffset(axisOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setAxisOffset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setAxisOffset(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.setRangeAxis(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRangeAxis(int,org.jfree.chart.axis.ValueAxis,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ValueAxis existing = (ValueAxis) this.rangeAxes.get(index);
 *  */
    @Test
    public void testSetRangeAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxis] produces [java.lang.NullPointerException] */
        categoryPlot.setRangeAxis(-255, null, false);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxis_ResultNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        objects[0] = ((Object) subCategoryAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        SubCategoryAxis actual = ((SubCategoryAxis) categoryPlot.getDomainAxis(0));
        
        // org.jfree.chart.axis.SubCategoryAxis has overridden equals method
        assertEquals(subCategoryAxis, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): False}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxis_IndexGreaterOrEqualThisDomainAxesSize() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDomainAxis_NotParentNotInstanceOfCategoryPlot() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        Object actual = categoryPlot.getDomainAxis(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (CategoryAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testGetDomainAxis_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.getDomainAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.executesCondition {@code (index < this.domainAxes.size()): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (CategoryAxis) this.domainAxes.get(index);
 *  */
    @Test
    public void testGetDomainAxis_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxis(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < this.domainAxes.size()
 *  */
    @Test
    public void testGetDomainAxis_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.NullPointerException] */
        categoryPlot.getDomainAxis(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis()}
 * @utbot.returnsFrom {@code return getDomainAxis(0);}
 *  */
    @Test
    public void testGetDomainAxis_ReturnGetDomainAxis_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
        objects[0] = ((Object) subCategoryAxis);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        SubCategoryAxis actual = ((SubCategoryAxis) categoryPlot.getDomainAxis());
        
        // org.jfree.chart.axis.SubCategoryAxis has overridden equals method
        assertEquals(subCategoryAxis, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis()}
 * @utbot.returnsFrom {@code return getDomainAxis(0);}
 *  */
    @Test
    public void testGetDomainAxis_ReturnGetDomainAxis() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        CategoryAxis actual = categoryPlot.getDomainAxis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDomainAxis_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDomainAxis();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainAxis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDomainAxis(0);
 *  */
    @Test
    public void testGetDomainAxis_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainAxis] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.CategoryAxis] */
        categoryPlot.getDomainAxis();
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
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        int actual = categoryPlot.getRangeAxisIndex(null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisIndex_NotParentNotInstanceOfCategoryPlot() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        categoryPlot.setParent(parent);
        LogarithmicAxis logarithmicAxis = ((LogarithmicAxis) createInstance("org.jfree.chart.axis.LogarithmicAxis"));
        
        int actual = categoryPlot.getRangeAxisIndex(logarithmicAxis);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.executesCondition {@code (result < 0): True}
 * @utbot.executesCondition {@code (parent instanceof CategoryPlot): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxisIndex_NotParentNotInstanceOfCategoryPlot_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        int actual = categoryPlot.getRangeAxisIndex(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int result = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetRangeAxisIndex_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisIndex(null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisIndex(null);
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
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeGreaterThanIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        Object actual = categoryPlot.getDataset(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDataset_ThisDatasetsSizeGreaterThanIndex_1() throws Exception  {
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
 * @utbot.executesCondition {@code (this.datasets.size() > index): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (CategoryDataset) this.datasets.get(index);
 *  */
    @Test
    public void testGetDataset_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.category.CategoryDataset] */
        categoryPlot.getDataset(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.executesCondition {@code (this.datasets.size() > index): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (CategoryDataset) this.datasets.get(index);
 *  */
    @Test
    public void testGetDataset_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDataset(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.datasets.size() > index
 *  */
    @Test
    public void testGetDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.NullPointerException] */
        categoryPlot.getDataset(-255);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataset()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getDataset(0);
 *  */
    @Test
    public void testGetDataset_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.category.CategoryDataset] */
        categoryPlot.getDataset();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataset()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDataset_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDataset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisEdge()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRangeAxisEdge(0);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getRangeAxisEdge();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getRangeAxisEdge(0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: AxisLocation location = getRangeAxisLocation(index);
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.AxisLocation] */
        categoryPlot.getRangeAxisEdge(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxisEdge_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRangeAxisEdge(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRangeAxisEdge(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisEdge(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxisLocation(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: RectangleEdge result = Plot.resolveRangeAxisLocation(location, this.orientation);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisEdge_ThrowIllegalArgumentException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxisLocations", rangeAxisLocations);
        
        categoryPlot.getRangeAxisEdge(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.clearRangeAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearRangeAxes()
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis axis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testClearRangeAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.clearRangeAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#clearRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testClearRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.clearRangeAxes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setDataset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDataset(int, org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDataset(int,org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryDataset existing = (CategoryDataset) this.datasets.get(index);
 *  */
    @Test
    public void testSetDataset_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.category.CategoryDataset] */
        categoryPlot.setDataset(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setDataset(int,org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CategoryDataset existing = (CategoryDataset) this.datasets.get(index);
 *  */
    @Test
    public void testSetDataset_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setDataset] produces [java.lang.NullPointerException] */
        categoryPlot.setDataset(-255, null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeAxisCount] produces [java.lang.NullPointerException] */
        categoryPlot.getRangeAxisCount();
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureRangeAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.configureRangeAxes();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#configureRangeAxes()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ValueAxis axis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testConfigureRangeAxes_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureRangeAxes] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.configureRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.configureRangeAxes();
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDatasetCount] produces [java.lang.NullPointerException] */
        categoryPlot.getDatasetCount();
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
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeGreaterThanIndex() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        Object actual = categoryPlot.getRenderer(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRenderer_ThisRenderersSizeGreaterThanIndex_1() throws Exception  {
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
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = (CategoryItemRenderer) this.renderers.get(index);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
        categoryPlot.getRenderer(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.executesCondition {@code (this.renderers.size() > index): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: result = (CategoryItemRenderer) this.renderers.get(index);
 *  */
    @Test
    public void testGetRenderer_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRenderer(0);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.renderers.size() > index
 *  */
    @Test
    public void testGetRenderer_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.NullPointerException] */
        categoryPlot.getRenderer(-255);
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getRenderer(0);
 *  */
    @Test
    public void testGetRenderer_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
        categoryPlot.getRenderer();
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getRenderer()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRenderer_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRenderer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getRenderer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setRenderers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRenderers([Lorg.jfree.chart.renderer.category.CategoryItemRenderer;)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < renderers.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setRenderer(i, renderers[i], false);
 *  */
    @Test
    public void testSetRenderers_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray = {null};
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
        categoryPlot.setRenderers(categoryItemRendererArray);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < renderers.length; i++)
 *  */
    @Test
    public void testSetRenderers_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderers] produces [java.lang.NullPointerException] */
        categoryPlot.setRenderers(null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRenderer] produces [java.lang.NullPointerException] */
        categoryPlot.setRenderer(-255, null, false);
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
    public void testGetIndexOf_ReturnThisRenderersIndexOf() throws Exception  {
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
    public void testGetIndexOf_ReturnThisRenderersIndexOf_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class barRenderer3DType = Class.forName("org.jfree.chart.renderer.category.CategoryItemRenderer");
        Method getIndexOfMethod = categoryPlotClazz.getDeclaredMethod("getIndexOf", barRenderer3DType);
        getIndexOfMethod.setAccessible(true);
        java.lang.Object[] getIndexOfMethodArguments = new java.lang.Object[1];
        getIndexOfMethodArguments[0] = barRenderer3D;
        int actual = ((Integer) getIndexOfMethod.invoke(categoryPlot, getIndexOfMethodArguments));
        
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
        
        int actual = categoryPlot.getIndexOf(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getIndexOf] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getIndexOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.renderers.indexOf(renderer);
 *  */
    @Test
    public void testGetIndexOf_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getIndexOf] produces [java.lang.NullPointerException] */
        categoryPlot.getIndexOf(null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.setRangeAxes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.handleClick
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#handleClick(int,int,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (dataArea.contains(x, y)): False}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getDataArea()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#contains(double,double)}
 *  */
    @Test
    public void testHandleClick_NotDataAreaContains() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        DefaultCaret defaultCaret = new DefaultCaret();
        plotRenderingInfo.setDataArea(defaultCaret);
        
        categoryPlot.handleClick(128, -255, plotRenderingInfo);
    }
    ///endregion
    
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.handleClick] produces [java.lang.NullPointerException] */
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.handleClick] produces [java.lang.NullPointerException] */
        categoryPlot.handleClick(-255, -255, plotRenderingInfo);
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
        
        LegendItemCollection expected = new LegendItemCollection();
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getLegendItems] produces [java.lang.NullPointerException] */
        categoryPlot.getLegendItems();
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.datasetChanged] produces [java.lang.NullPointerException] */
        categoryPlot.datasetChanged(null);
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
        PiePlot parent = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        categoryPlot.setParent(parent);
        
        categoryPlot.rendererChanged(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoom
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoom(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoom(double)}
 * @utbot.executesCondition {@code (percent > 0.0): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getRangeAxis().setAutoRange(true);
 *  */
    @Test
    public void testZoom_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoom] produces [java.lang.NullPointerException] */
        categoryPlot.zoom(0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.removeAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.removeAnnotation(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean removed = this.annotations.remove(annotation);
 *  */
    @Test
    public void testRemoveAnnotation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.removeAnnotation] produces [java.lang.NullPointerException] */
        categoryPlot.removeAnnotation(categoryLineAnnotation);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addDomainMarker(0, marker, layer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException1() throws Exception  {
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
    public void testAddDomainMarker_ThrowIllegalArgumentException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addDomainMarker(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addDomainMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (marker == null): False}
 * @utbot.executesCondition {@code (layer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: layer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        categoryPlot.addDomainMarker(-255, categoryMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addDomainMarker(int,org.jfree.chart.plot.CategoryMarker,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (marker == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: marker == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_ThrowIllegalArgumentException_11() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addDomainMarker(-255, null, null);
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
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeMarkers] produces [java.lang.NullPointerException] */
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
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getRangeMarkers] produces [java.lang.NullPointerException] */
            categoryPlot.getRangeMarkers(-255, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.calculateAxisSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#calculateAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#calculateRangeAxisSpace(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.AxisSpace)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: space = calculateRangeAxisSpace(g2, plotArea, space);
 *  */
    @Test
    public void testCalculateAxisSpace_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.calculateAxisSpace] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.Axis] */
        categoryPlot.calculateAxisSpace(null, null);
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
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainMarkers] produces [java.lang.NullPointerException] */
            categoryPlot.getDomainMarkers(-255, foreground);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDomainMarkers(int,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (layer == Layer.FOREGROUND): False}
 * @utbot.executesCondition {@code (layer == Layer.BACKGROUND): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = (Collection) this.backgroundDomainMarkers.get(key);
 *  */
    @Test
    public void testGetDomainMarkers_ThrowNullPointerException_1() throws Exception  {
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
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDomainMarkers] produces [java.lang.NullPointerException] */
            categoryPlot.getDomainMarkers(-255, background);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.draw] produces [java.lang.NullPointerException] */
        categoryPlot.draw(null, null, null, null, null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.clearAnnotations] produces [java.lang.NullPointerException] */
        categoryPlot.clearAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_ThrowIllegalArgumentException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.addAnnotation(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.executesCondition {@code (annotation == null): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.annotations.add(annotation);
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addAnnotation] produces [java.lang.NullPointerException] */
        categoryPlot.addAnnotation(categoryLineAnnotation);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.addRangeMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#addRangeMarker(int,org.jfree.chart.plot.Marker,org.jfree.chart.util.Layer)}
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
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.addRangeMarker] produces [java.lang.NullPointerException] */
            categoryPlot.addRangeMarker(-255, null, null);
        } finally {
            setStaticField(Layer.class, "BACKGROUND", prevBACKGROUND);
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawAxes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawAxes(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.iterates iterate the loop {@code for(int index = 0; index < this.domainAxes.size(); index++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int index = 0; index < this.domainAxes.size(); index++)
 *  */
    @Test
    public void testDrawAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawAxes] produces [java.lang.NullPointerException] */
        categoryPlot.drawAxes(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawAxes(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.iterates iterate the loop {@code for(int index = 0; index < this.domainAxes.size(); index++)} once
 * @utbot.iterates iterate the loop {@code for(int index = 0; index < this.rangeAxes.size(); index++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int index = 0; index < this.rangeAxes.size(); index++)
 *  */
    @Test
    public void testDrawAxes_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList domainAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxes", domainAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawAxes] produces [java.lang.NullPointerException] */
        categoryPlot.drawAxes(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeGridlines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 *  */
    @Test
    public void testDrawRangeGridlines() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (gridPaint != null): False}
 *  */
    @Test
    public void testDrawRangeGridlines_GridPaintEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeGridlinesVisible(true);
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 *  */
    @Test
    public void testDrawRangeGridlines_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setRangeGridlinesVisible(true);
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (gridPaint != null): True}
 *  */
    @Test
    public void testDrawRangeGridlines_GridPaintNotEqualsNull() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        categoryPlot.setRangeGridlinesVisible(true);
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        SystemColor rangeGridlinePaint = ((SystemColor) createInstance("java.awt.SystemColor"));
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class rangeGridlinePaintType = Class.forName("java.awt.Paint");
        Method setRangeGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeGridlinePaint", rangeGridlinePaintType);
        setRangeGridlinePaintMethod.setAccessible(true);
        java.lang.Object[] setRangeGridlinePaintMethodArguments = new java.lang.Object[1];
        setRangeGridlinePaintMethodArguments[0] = rangeGridlinePaint;
        setRangeGridlinePaintMethod.invoke(categoryPlot, setRangeGridlinePaintMethodArguments);
        CombinedRangeXYPlot parent = ((CombinedRangeXYPlot) createInstance("org.jfree.chart.plot.CombinedRangeXYPlot"));
        categoryPlot.setParent(parent);
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.executesCondition {@code (gridPaint != null): True}
 *  */
    @Test
    public void testDrawRangeGridlines_GridPaintNotEqualsNull_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        categoryPlot.setRangeGridlinesVisible(true);
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        SystemColor rangeGridlinePaint = ((SystemColor) createInstance("java.awt.SystemColor"));
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class rangeGridlinePaintType = Class.forName("java.awt.Paint");
        Method setRangeGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeGridlinePaint", rangeGridlinePaintType);
        setRangeGridlinePaintMethod.setAccessible(true);
        java.lang.Object[] setRangeGridlinePaintMethodArguments = new java.lang.Object[1];
        setRangeGridlinePaintMethodArguments[0] = rangeGridlinePaint;
        setRangeGridlinePaintMethod.invoke(categoryPlot, setRangeGridlinePaintMethodArguments);
        XYPlot parent = ((XYPlot) createInstance("org.jfree.chart.plot.XYPlot"));
        categoryPlot.setParent(parent);
        
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis axis = getRangeAxis();
 *  */
    @Test
    public void testDrawRangeGridlines_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        categoryPlot.setRangeGridlinesVisible(true);
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        SystemColor rangeGridlinePaint = ((SystemColor) createInstance("java.awt.SystemColor"));
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class rangeGridlinePaintType = Class.forName("java.awt.Paint");
        Method setRangeGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeGridlinePaint", rangeGridlinePaintType);
        setRangeGridlinePaintMethod.setAccessible(true);
        java.lang.Object[] setRangeGridlinePaintMethodArguments = new java.lang.Object[1];
        setRangeGridlinePaintMethodArguments[0] = rangeGridlinePaint;
        setRangeGridlinePaintMethod.invoke(categoryPlot, setRangeGridlinePaintMethodArguments);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeGridlines] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeGridlines(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.util.List)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDrawRangeGridlines_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        categoryPlot.setRangeGridlinesVisible(true);
        BasicStroke rangeGridlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        categoryPlot.setRangeGridlineStroke(rangeGridlineStroke);
        SystemColor rangeGridlinePaint = ((SystemColor) createInstance("java.awt.SystemColor"));
        Class categoryPlotClazz = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class rangeGridlinePaintType = Class.forName("java.awt.Paint");
        Method setRangeGridlinePaintMethod = categoryPlotClazz.getDeclaredMethod("setRangeGridlinePaint", rangeGridlinePaintType);
        setRangeGridlinePaintMethod.setAccessible(true);
        java.lang.Object[] setRangeGridlinePaintMethodArguments = new java.lang.Object[1];
        setRangeGridlinePaintMethodArguments[0] = rangeGridlinePaint;
        setRangeGridlinePaintMethod.invoke(categoryPlot, setRangeGridlinePaintMethodArguments);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeGridlines] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.drawRangeGridlines(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getAnnotations()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testDrawAnnotations_IteratorHasNext() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ArrayList annotations = new ArrayList();
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "annotations", annotations);
        
        categoryPlot.drawAnnotations(null, null, null);
    }
    ///endregion
    
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawAnnotations] produces [java.lang.NullPointerException] */
        categoryPlot.drawAnnotations(null, null, null);
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
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair] produces [java.lang.NullPointerException] */
        categoryPlot.drawRangeCrosshair(null, null, null, java.lang.Double.NaN, null, null, null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomDomainAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 *  */
    @Test
    public void testZoomDomainAxes1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.zoomDomainAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomDomainAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomDomainAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 *  */
    @Test
    public void testZoomDomainAxes2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        categoryPlot.zoomDomainAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis rangeAxis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testZoomRangeAxes_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ValueAxis rangeAxis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testZoomRangeAxes_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null));
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis rangeAxis = (ValueAxis) this.rangeAxes.get(i);
 *  */
    @Test
    public void testZoomRangeAxes_ThrowClassCastException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.rangeAxes.size(); i++)
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.rangeAxes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double sourceY = source.getY();
 *  */
    @Test
    public void testZoomRangeAxes_ThrowNullPointerException_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        objects[0] = ((Object) periodAxis);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.NullPointerException] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, ((PlotRenderingInfo) null), ((Point2D) null), true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.zoomRangeAxes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D,boolean)}
 *  */
    @Test
    public void testZoomRangeAxes_CategoryPlotZoomRangeAxes() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: zoomRangeAxes(factor, state, source, false);
 *  */
    @Test
    public void testZoomRangeAxes_ThrowClassCastException2() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#zoomRangeAxes(double,org.jfree.chart.plot.PlotRenderingInfo,java.awt.geom.Point2D)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testZoomRangeAxes_ThrowIndexOutOfBoundsException1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.zoomRangeAxes] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.zoomRangeAxes(java.lang.Double.NaN, null, null);
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
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setWeight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setWeight(int)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setWeight(int)}
 *  */
    @Test
    public void testSetWeight() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setWeight(-255);
        
        categoryPlot.setWeight(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeMarkers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeMarkers_Return() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", -255);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawRangeMarkers(null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDrawRangeMarkers_Return_1() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        categoryPlot.drawRangeMarkers(null, null, -1, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryItemRenderer r = getRenderer(index);
 *  */
    @Test
    public void testDrawRangeMarkers_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeMarkers] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
        categoryPlot.drawRangeMarkers(null, null, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.getDataRange
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataRange(org.jfree.chart.axis.ValueAxis)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataRange(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int rangeIndex = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDataRange_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataRange] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.getDataRange(null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#getDataRange(org.jfree.chart.axis.ValueAxis)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rangeIndex = this.rangeAxes.indexOf(axis);
 *  */
    @Test
    public void testGetDataRange_ThrowNullPointerException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.getDataRange] produces [java.lang.NullPointerException] */
        categoryPlot.getDataRange(null);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawDomainMarkers(java.awt.Graphics2D,java.awt.geom.Rectangle2D,int,org.jfree.chart.util.Layer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRenderer(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryItemRenderer r = getRenderer(index);
 *  */
    @Test
    public void testDrawDomainMarkers_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawDomainMarkers] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.renderer.category.CategoryItemRenderer] */
        categoryPlot.drawDomainMarkers(null, null, 0, null);
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
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.drawRangeLine
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeLine(java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDrawRangeLine_ThrowIndexOutOfBoundsException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeLine] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        categoryPlot.drawRangeLine(null, null, java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#drawRangeLine(java.awt.Graphics2D,java.awt.geom.Rectangle2D,double,java.awt.Stroke,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: double java2D = getRangeAxis().valueToJava2D(value, dataArea, getRangeAxisEdge());
 *  */
    @Test
    public void testDrawRangeLine_ThrowClassCastException() throws Exception  {
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.plot.CategoryPlot.drawRangeLine] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
        categoryPlot.drawRangeLine(null, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.CategoryPlot.setAnchorValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAnchorValue(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double,boolean)}
 *  */
    @Test
    public void testSetAnchorValue_CategoryPlotSetAnchorValue() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setAnchorValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setAnchorValue(java.lang.Double.NaN);
            
            double finalCategoryPlotAnchorValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "anchorValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotAnchorValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAnchorValue(double)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setAnchorValue(value, true);
 *  */
    @Test
    public void testSetAnchorValue_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setAnchorValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setAnchorValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setAnchorValue(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
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
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetAnchorValue_Notify() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setAnchorValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            categoryPlot.setAnchorValue(java.lang.Double.NaN, true);
            
            double finalCategoryPlotAnchorValue = ((Double) getFieldValue(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "anchorValue"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCategoryPlotAnchorValue, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAnchorValue(double, boolean)
    
    /**
    @utbot.classUnderTest {@link CategoryPlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.CategoryPlot#setAnchorValue(double,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetAnchorValue_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setAnchorValue(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(categoryPlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.CategoryPlot.setAnchorValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            categoryPlot.setAnchorValue(java.lang.Double.NaN, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields799274511660700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields799274511660700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass799274511665900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799274511660700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799274511665900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields799274514426200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields799274514426200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass799274514428000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799274514426200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799274514428000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields799274514742500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields799274514742500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass799274514744000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799274514742500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799274514744000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

